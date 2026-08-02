package com.facebook.react.uimanager;

import android.os.SystemClock;
import android.view.View;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.common.annotations.internal.LegacyArchitectureLogLevel;
import com.facebook.react.common.annotations.internal.LegacyArchitectureLogger;
import com.facebook.react.common.build.ReactBuildConfig;
import com.facebook.react.modules.i18nmanager.I18nUtil;
import com.facebook.react.uimanager.events.EventDispatcher;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@Deprecated(since = "This class is part of Legacy Architecture and will be removed in a future release")
/* loaded from: classes2.dex */
public class UIImplementation {
    protected final EventDispatcher mEventDispatcher;
    private long mLastCalculateLayoutTime;
    protected LayoutUpdateListener mLayoutUpdateListener;
    private final int[] mMeasureBuffer;
    private final NativeViewHierarchyOptimizer mNativeViewHierarchyOptimizer;
    private final UIViewOperationQueue mOperationsQueue;
    protected final ReactApplicationContext mReactContext;
    protected final ShadowNodeRegistry mShadowNodeRegistry;
    private final ViewManagerRegistry mViewManagers;
    private volatile boolean mViewOperationsEnabled;
    protected Object uiImplementationThreadLock;

    public interface LayoutUpdateListener {
        void onLayoutUpdated(ReactShadowNode reactShadowNode);
    }

    static {
        LegacyArchitectureLogger.assertLegacyArchitecture("UIImplementation", LegacyArchitectureLogLevel.ERROR);
    }

    public UIImplementation(ReactApplicationContext reactApplicationContext, ViewManagerRegistry viewManagerRegistry, EventDispatcher eventDispatcher, int i10) {
        this(reactApplicationContext, viewManagerRegistry, new UIViewOperationQueue(reactApplicationContext, new NativeViewHierarchyManager(viewManagerRegistry), i10), eventDispatcher);
    }

    private void assertNodeDoesNotNeedCustomLayoutForChildren(ReactShadowNode reactShadowNode) {
        NativeModule nativeModule = (ViewManager) S7.a.c(this.mViewManagers.get(reactShadowNode.getViewClass()));
        if (!(nativeModule instanceof IViewManagerWithChildren)) {
            throw new IllegalViewOperationException("Trying to use view " + reactShadowNode.getViewClass() + " as a parent, but its Manager doesn't extends ViewGroupManager");
        }
        IViewManagerWithChildren iViewManagerWithChildren = (IViewManagerWithChildren) nativeModule;
        if (iViewManagerWithChildren == null || !iViewManagerWithChildren.needsCustomLayoutForChildren()) {
            return;
        }
        throw new IllegalViewOperationException("Trying to measure a view using measureLayout/measureLayoutRelativeToParent relative to an ancestor that requires custom layout for it's children (" + reactShadowNode.getViewClass() + "). Use measure instead.");
    }

    private boolean checkOrAssertViewExists(int i10, String str) {
        if (this.mShadowNodeRegistry.getNode(i10) != null) {
            return true;
        }
        String str2 = "Unable to execute operation " + str + " on view with tag: " + i10 + ", since the view does not exist";
        if (ReactBuildConfig.DEBUG) {
            throw new IllegalViewOperationException(str2);
        }
        E6.a.K(ReactConstants.TAG, str2);
        return false;
    }

    private void dispatchViewUpdatesIfNeeded() {
        if (this.mOperationsQueue.isEmpty()) {
            dispatchViewUpdates(-1);
        }
    }

    private void measureLayoutRelativeToVerifiedAncestor(ReactShadowNode reactShadowNode, ReactShadowNode reactShadowNode2, int[] iArr) {
        int i10;
        int i11;
        if (reactShadowNode == reactShadowNode2 || reactShadowNode.isVirtual()) {
            i10 = 0;
            i11 = 0;
        } else {
            i10 = Math.round(reactShadowNode.getLayoutX());
            i11 = Math.round(reactShadowNode.getLayoutY());
            for (ReactShadowNode parent = reactShadowNode.getParent(); parent != reactShadowNode2; parent = parent.getParent()) {
                S7.a.c(parent);
                assertNodeDoesNotNeedCustomLayoutForChildren(parent);
                i10 += Math.round(parent.getLayoutX());
                i11 += Math.round(parent.getLayoutY());
            }
            assertNodeDoesNotNeedCustomLayoutForChildren(reactShadowNode2);
        }
        iArr[0] = i10;
        iArr[1] = i11;
        iArr[2] = reactShadowNode.getScreenWidth();
        iArr[3] = reactShadowNode.getScreenHeight();
    }

    private void notifyOnBeforeLayoutRecursive(ReactShadowNode reactShadowNode) {
        if (reactShadowNode.hasUpdates()) {
            for (int i10 = 0; i10 < reactShadowNode.getChildCount(); i10++) {
                notifyOnBeforeLayoutRecursive(reactShadowNode.getChildAt(i10));
            }
            reactShadowNode.onBeforeLayout(this.mNativeViewHierarchyOptimizer);
        }
    }

    private void removeShadowNodeRecursive(ReactShadowNode reactShadowNode) {
        NativeViewHierarchyOptimizer.handleRemoveNode(reactShadowNode);
        this.mShadowNodeRegistry.removeNode(reactShadowNode.getReactTag());
        for (int childCount = reactShadowNode.getChildCount() - 1; childCount >= 0; childCount--) {
            removeShadowNodeRecursive(reactShadowNode.getChildAt(childCount));
        }
        reactShadowNode.removeAndDisposeAllChildren();
    }

    public void addUIBlock(UIBlock uIBlock) {
        this.mOperationsQueue.enqueueUIBlock(uIBlock);
    }

    public void applyUpdatesRecursive(ReactShadowNode reactShadowNode, float f10, float f11, List<ReactShadowNode> list) {
        if (reactShadowNode.hasUpdates()) {
            if (reactShadowNode.dispatchUpdatesWillChangeLayout(f10, f11) && reactShadowNode.shouldNotifyOnLayout() && !this.mShadowNodeRegistry.isRootNode(reactShadowNode.getReactTag())) {
                list.add(reactShadowNode);
            }
            Iterable<? extends ReactShadowNode> calculateLayoutOnChildren = reactShadowNode.calculateLayoutOnChildren();
            if (calculateLayoutOnChildren != null) {
                Iterator<? extends ReactShadowNode> it = calculateLayoutOnChildren.iterator();
                while (it.hasNext()) {
                    applyUpdatesRecursive(it.next(), reactShadowNode.getLayoutX() + f10, reactShadowNode.getLayoutY() + f11, list);
                }
            }
            reactShadowNode.dispatchUpdates(f10, f11, this.mOperationsQueue, this.mNativeViewHierarchyOptimizer);
            reactShadowNode.markUpdateSeen();
            this.mNativeViewHierarchyOptimizer.onViewUpdatesCompleted(reactShadowNode);
        }
    }

    public void calculateRootLayout(ReactShadowNode reactShadowNode) {
        A8.b.a(0L, "cssRoot.calculateLayout").a("rootTag", reactShadowNode.getReactTag()).c();
        long uptimeMillis = SystemClock.uptimeMillis();
        try {
            reactShadowNode.calculateLayout(View.MeasureSpec.getMode(reactShadowNode.getWidthMeasureSpec().intValue()) == 0 ? com.facebook.yoga.g.f31669b : View.MeasureSpec.getSize(r0), View.MeasureSpec.getMode(reactShadowNode.getHeightMeasureSpec().intValue()) == 0 ? com.facebook.yoga.g.f31669b : View.MeasureSpec.getSize(r5));
            A8.a.i(0L);
            this.mLastCalculateLayoutTime = SystemClock.uptimeMillis() - uptimeMillis;
        } catch (Throwable th2) {
            A8.a.i(0L);
            this.mLastCalculateLayoutTime = SystemClock.uptimeMillis() - uptimeMillis;
            throw th2;
        }
    }

    public void clearJSResponder() {
        this.mOperationsQueue.enqueueClearJSResponder();
    }

    public void configureNextLayoutAnimation(ReadableMap readableMap, Callback callback) {
        this.mOperationsQueue.enqueueConfigureLayoutAnimation(readableMap, callback);
    }

    public ReactShadowNode createRootShadowNode() {
        ReactShadowNodeImpl reactShadowNodeImpl = new ReactShadowNodeImpl();
        if (I18nUtil.getInstance().isRTL(this.mReactContext)) {
            reactShadowNodeImpl.setLayoutDirection(com.facebook.yoga.h.RTL);
        }
        reactShadowNodeImpl.setViewClassName("Root");
        return reactShadowNodeImpl;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [com.facebook.react.uimanager.ReactShadowNode] */
    public ReactShadowNode createShadowNode(String str) {
        return this.mViewManagers.get(str).createShadowNodeInstance(this.mReactContext);
    }

    public void createView(int i10, String str, int i11, ReadableMap readableMap) {
        ReactStylesDiffMap reactStylesDiffMap;
        if (this.mViewOperationsEnabled) {
            synchronized (this.uiImplementationThreadLock) {
                try {
                    ReactShadowNode<?> createShadowNode = createShadowNode(str);
                    ReactShadowNode<?> node = this.mShadowNodeRegistry.getNode(i11);
                    S7.a.d(node, "Root node with tag " + i11 + " doesn't exist");
                    createShadowNode.setReactTag(i10);
                    createShadowNode.setViewClassName(str);
                    createShadowNode.setRootTag(node.getReactTag());
                    createShadowNode.setThemedContext(node.getThemedContext());
                    this.mShadowNodeRegistry.addNode(createShadowNode);
                    if (readableMap != null) {
                        reactStylesDiffMap = new ReactStylesDiffMap(readableMap);
                        createShadowNode.updateProperties(reactStylesDiffMap);
                    } else {
                        reactStylesDiffMap = null;
                    }
                    handleCreateView(createShadowNode, i11, reactStylesDiffMap);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Deprecated
    public void dispatchViewManagerCommand(int i10, int i11, ReadableArray readableArray) {
        if (checkOrAssertViewExists(i10, "dispatchViewManagerCommand: " + i11)) {
            this.mOperationsQueue.enqueueDispatchCommand(i10, i11, readableArray);
        }
    }

    public void dispatchViewUpdates(int i10) {
        A8.b.a(0L, "UIImplementation.dispatchViewUpdates").a("batchId", i10).c();
        long uptimeMillis = SystemClock.uptimeMillis();
        try {
            updateViewHierarchy();
            this.mNativeViewHierarchyOptimizer.onBatchComplete();
            this.mOperationsQueue.dispatchViewUpdates(i10, uptimeMillis, this.mLastCalculateLayoutTime);
        } finally {
            A8.a.i(0L);
        }
    }

    public void findSubviewIn(int i10, float f10, float f11, Callback callback) {
        this.mOperationsQueue.enqueueFindTargetForTouch(i10, f10, f11, callback);
    }

    public Map<String, Long> getProfiledBatchPerfCounters() {
        return this.mOperationsQueue.getProfiledBatchPerfCounters();
    }

    public int getRootViewNum() {
        return this.mOperationsQueue.getNativeViewHierarchyManager().getRootViewNum();
    }

    public UIViewOperationQueue getUIViewOperationQueue() {
        return this.mOperationsQueue;
    }

    public void handleCreateView(ReactShadowNode reactShadowNode, int i10, ReactStylesDiffMap reactStylesDiffMap) {
        if (reactShadowNode.isVirtual()) {
            return;
        }
        this.mNativeViewHierarchyOptimizer.handleCreateView(reactShadowNode, reactShadowNode.getThemedContext(), reactStylesDiffMap);
    }

    public void handleUpdateView(ReactShadowNode reactShadowNode, String str, ReactStylesDiffMap reactStylesDiffMap) {
        if (reactShadowNode.isVirtual()) {
            return;
        }
        this.mNativeViewHierarchyOptimizer.handleUpdateView(reactShadowNode, str, reactStylesDiffMap);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x004c, code lost:
    
        if (r27 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0052, code lost:
    
        if (r11 != r27.size()) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005c, code lost:
    
        throw new com.facebook.react.uimanager.IllegalViewOperationException("Size of addChildTags != size of addAtIndices!");
     */
    /* JADX WARN: Type inference failed for: r20v0, types: [com.facebook.react.uimanager.ReactShadowNode] */
    /* JADX WARN: Type inference failed for: r4v4, types: [com.facebook.react.uimanager.ReactShadowNode] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void manageChildren(int i10, ReadableArray readableArray, ReadableArray readableArray2, ReadableArray readableArray3, ReadableArray readableArray4, ReadableArray readableArray5) {
        int[] iArr;
        ReadableArray readableArray6 = readableArray;
        if (this.mViewOperationsEnabled) {
            synchronized (this.uiImplementationThreadLock) {
                try {
                    ReactShadowNode<?> node = this.mShadowNodeRegistry.getNode(i10);
                    int size = readableArray6 == null ? 0 : readableArray6.size();
                    int size2 = readableArray3 == null ? 0 : readableArray3.size();
                    int size3 = readableArray5 == null ? 0 : readableArray5.size();
                    if (size != 0 && (readableArray2 == null || size != readableArray2.size())) {
                        throw new IllegalViewOperationException("Size of moveFrom != size of moveTo!");
                    }
                    int i11 = size + size2;
                    ViewAtIndex[] viewAtIndexArr = new ViewAtIndex[i11];
                    int i12 = size + size3;
                    int[] iArr2 = new int[i12];
                    int[] iArr3 = new int[i12];
                    int[] iArr4 = new int[size3];
                    if (size > 0) {
                        S7.a.c(readableArray6);
                        S7.a.c(readableArray2);
                        iArr = iArr4;
                        int i13 = 0;
                        while (i13 < size) {
                            int i14 = size;
                            int i15 = readableArray6.getInt(i13);
                            int reactTag = node.getChildAt(i15).getReactTag();
                            viewAtIndexArr[i13] = new ViewAtIndex(reactTag, readableArray2.getInt(i13));
                            iArr2[i13] = i15;
                            iArr3[i13] = reactTag;
                            i13++;
                            readableArray6 = readableArray;
                            size = i14;
                            i12 = i12;
                        }
                    } else {
                        iArr = iArr4;
                    }
                    int i16 = size;
                    int i17 = i12;
                    if (size2 > 0) {
                        S7.a.c(readableArray3);
                        S7.a.c(readableArray4);
                        for (int i18 = 0; i18 < size2; i18++) {
                            viewAtIndexArr[i16 + i18] = new ViewAtIndex(readableArray3.getInt(i18), readableArray4.getInt(i18));
                        }
                    }
                    if (size3 > 0) {
                        S7.a.c(readableArray5);
                        for (int i19 = 0; i19 < size3; i19++) {
                            int i20 = readableArray5.getInt(i19);
                            int reactTag2 = node.getChildAt(i20).getReactTag();
                            int i21 = i16 + i19;
                            iArr2[i21] = i20;
                            iArr3[i21] = reactTag2;
                            iArr[i19] = reactTag2;
                        }
                    }
                    Arrays.sort(viewAtIndexArr, ViewAtIndex.COMPARATOR);
                    Arrays.sort(iArr2);
                    int i22 = -1;
                    for (int i23 = i17 - 1; i23 >= 0; i23--) {
                        int i24 = iArr2[i23];
                        if (i24 == i22) {
                            throw new IllegalViewOperationException("Repeated indices in Removal list for view tag: " + i10);
                        }
                        node.removeChildAt(i24);
                        i22 = iArr2[i23];
                    }
                    for (int i25 = 0; i25 < i11; i25++) {
                        ViewAtIndex viewAtIndex = viewAtIndexArr[i25];
                        ReactShadowNode<?> node2 = this.mShadowNodeRegistry.getNode(viewAtIndex.mTag);
                        if (node2 == null) {
                            throw new IllegalViewOperationException("Trying to add unknown view tag: " + viewAtIndex.mTag);
                        }
                        node.addChildAt(node2, viewAtIndex.mIndex);
                    }
                    int[] iArr5 = iArr;
                    this.mNativeViewHierarchyOptimizer.handleManageChildren(node, iArr2, iArr3, viewAtIndexArr, iArr5);
                    for (int i26 = 0; i26 < size3; i26++) {
                        removeShadowNode(this.mShadowNodeRegistry.getNode(iArr5[i26]));
                    }
                } finally {
                }
            }
        }
    }

    public void measure(int i10, Callback callback) {
        if (this.mViewOperationsEnabled) {
            this.mOperationsQueue.enqueueMeasure(i10, callback);
        }
    }

    public void measureInWindow(int i10, Callback callback) {
        if (this.mViewOperationsEnabled) {
            this.mOperationsQueue.enqueueMeasureInWindow(i10, callback);
        }
    }

    public void measureLayout(int i10, int i11, Callback callback, Callback callback2) {
        if (this.mViewOperationsEnabled) {
            try {
                measureLayout(i10, i11, this.mMeasureBuffer);
                callback2.invoke(Float.valueOf(PixelUtil.toDIPFromPixel(this.mMeasureBuffer[0])), Float.valueOf(PixelUtil.toDIPFromPixel(this.mMeasureBuffer[1])), Float.valueOf(PixelUtil.toDIPFromPixel(this.mMeasureBuffer[2])), Float.valueOf(PixelUtil.toDIPFromPixel(this.mMeasureBuffer[3])));
            } catch (IllegalViewOperationException e10) {
                callback.invoke(e10.getMessage());
            }
        }
    }

    public void measureLayoutRelativeToParent(int i10, Callback callback, Callback callback2) {
        if (this.mViewOperationsEnabled) {
            try {
                measureLayoutRelativeToParent(i10, this.mMeasureBuffer);
                callback2.invoke(Float.valueOf(PixelUtil.toDIPFromPixel(this.mMeasureBuffer[0])), Float.valueOf(PixelUtil.toDIPFromPixel(this.mMeasureBuffer[1])), Float.valueOf(PixelUtil.toDIPFromPixel(this.mMeasureBuffer[2])), Float.valueOf(PixelUtil.toDIPFromPixel(this.mMeasureBuffer[3])));
            } catch (IllegalViewOperationException e10) {
                callback.invoke(e10.getMessage());
            }
        }
    }

    public void onCatalystInstanceDestroyed() {
        this.mViewOperationsEnabled = false;
        this.mViewManagers.invalidate();
    }

    public void onHostDestroy() {
    }

    public void onHostPause() {
        this.mOperationsQueue.pauseFrameCallback();
    }

    public void onHostResume() {
        this.mOperationsQueue.resumeFrameCallback();
    }

    public void prependUIBlock(UIBlock uIBlock) {
        this.mOperationsQueue.prependUIBlock(uIBlock);
    }

    public void profileNextBatch() {
        this.mOperationsQueue.profileNextBatch();
    }

    public <T extends View> void registerRootView(T t10, int i10, ThemedReactContext themedReactContext) {
        synchronized (this.uiImplementationThreadLock) {
            final ReactShadowNode createRootShadowNode = createRootShadowNode();
            createRootShadowNode.setReactTag(i10);
            createRootShadowNode.setThemedContext(themedReactContext);
            themedReactContext.runOnNativeModulesQueueThread(new Runnable() { // from class: com.facebook.react.uimanager.UIImplementation.1
                @Override // java.lang.Runnable
                public void run() {
                    UIImplementation.this.mShadowNodeRegistry.addRootNode(createRootShadowNode);
                }
            });
            this.mOperationsQueue.addRootView(i10, t10);
        }
    }

    public void removeLayoutUpdateListener() {
        this.mLayoutUpdateListener = null;
    }

    public void removeRootShadowNode(int i10) {
        synchronized (this.uiImplementationThreadLock) {
            this.mShadowNodeRegistry.removeRootNode(i10);
        }
    }

    public void removeRootView(int i10) {
        removeRootShadowNode(i10);
        this.mOperationsQueue.enqueueRemoveRootView(i10);
    }

    public final void removeShadowNode(ReactShadowNode reactShadowNode) {
        removeShadowNodeRecursive(reactShadowNode);
        reactShadowNode.dispose();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.facebook.react.uimanager.ReactShadowNode] */
    public void replaceExistingNonRootView(int i10, int i11) {
        if (this.mShadowNodeRegistry.isRootNode(i10) || this.mShadowNodeRegistry.isRootNode(i11)) {
            throw new IllegalViewOperationException("Trying to add or replace a root tag!");
        }
        ReactShadowNode<?> node = this.mShadowNodeRegistry.getNode(i10);
        if (node == null) {
            throw new IllegalViewOperationException("Trying to replace unknown view tag: " + i10);
        }
        ?? parent = node.getParent();
        if (parent == 0) {
            throw new IllegalViewOperationException("Node is not attached to a parent: " + i10);
        }
        int indexOf = parent.indexOf(node);
        if (indexOf < 0) {
            throw new IllegalStateException("Didn't find child tag in parent");
        }
        WritableArray createArray = Arguments.createArray();
        createArray.pushInt(i11);
        WritableArray createArray2 = Arguments.createArray();
        createArray2.pushInt(indexOf);
        WritableArray createArray3 = Arguments.createArray();
        createArray3.pushInt(indexOf);
        manageChildren(parent.getReactTag(), null, null, createArray, createArray2, createArray3);
    }

    public int resolveRootTagFromReactTag(int i10) {
        if (this.mShadowNodeRegistry.isRootNode(i10)) {
            return i10;
        }
        ReactShadowNode resolveShadowNode = resolveShadowNode(i10);
        if (resolveShadowNode != null) {
            return resolveShadowNode.getRootTag();
        }
        E6.a.K(ReactConstants.TAG, "Warning : attempted to resolve a non-existent react shadow node. reactTag=" + i10);
        return 0;
    }

    public final ReactShadowNode resolveShadowNode(int i10) {
        return this.mShadowNodeRegistry.getNode(i10);
    }

    public final ViewManager resolveViewManager(String str) {
        return this.mViewManagers.getViewManagerIfExists(str);
    }

    public void sendAccessibilityEvent(int i10, int i11) {
        this.mOperationsQueue.enqueueSendAccessibilityEvent(i10, i11);
    }

    public void setChildren(int i10, ReadableArray readableArray) {
        if (this.mViewOperationsEnabled) {
            synchronized (this.uiImplementationThreadLock) {
                try {
                    ReactShadowNode<?> node = this.mShadowNodeRegistry.getNode(i10);
                    for (int i11 = 0; i11 < readableArray.size(); i11++) {
                        ReactShadowNode<?> node2 = this.mShadowNodeRegistry.getNode(readableArray.getInt(i11));
                        if (node2 == null) {
                            throw new IllegalViewOperationException("Trying to add unknown view tag: " + readableArray.getInt(i11));
                        }
                        node.addChildAt(node2, i11);
                    }
                    this.mNativeViewHierarchyOptimizer.handleSetChildren(node, readableArray);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public void setJSResponder(int i10, boolean z10) {
        ReactShadowNode<?> node = this.mShadowNodeRegistry.getNode(i10);
        if (node == null) {
            return;
        }
        this.mOperationsQueue.enqueueSetJSResponder(node.getReactTag(), i10, z10);
    }

    public void setLayoutAnimationEnabledExperimental(boolean z10) {
        this.mOperationsQueue.enqueueSetLayoutAnimationEnabled(z10);
    }

    public void setLayoutUpdateListener(LayoutUpdateListener layoutUpdateListener) {
        this.mLayoutUpdateListener = layoutUpdateListener;
    }

    public void setViewLocalData(int i10, Object obj) {
        ReactShadowNode<?> node = this.mShadowNodeRegistry.getNode(i10);
        if (node != null) {
            node.setLocalData(obj);
            dispatchViewUpdatesIfNeeded();
        } else {
            E6.a.K(ReactConstants.TAG, "Attempt to set local data for view with unknown tag: " + i10);
        }
    }

    public void synchronouslyUpdateViewOnUIThread(int i10, ReactStylesDiffMap reactStylesDiffMap) {
        UiThreadUtil.assertOnUiThread();
        this.mOperationsQueue.getNativeViewHierarchyManager().updateProperties(i10, reactStylesDiffMap);
    }

    public void updateInsetsPadding(int i10, int i11, int i12, int i13, int i14) {
        ReactShadowNode<?> node = this.mShadowNodeRegistry.getNode(i10);
        if (node == null) {
            E6.a.K(ReactConstants.TAG, "Tried to update size of non-existent tag: " + i10);
            return;
        }
        node.setPadding(4, i12);
        node.setPadding(1, i11);
        node.setPadding(5, i14);
        node.setPadding(3, i13);
        dispatchViewUpdatesIfNeeded();
    }

    public void updateNodeSize(int i10, int i11, int i12) {
        ReactShadowNode<?> node = this.mShadowNodeRegistry.getNode(i10);
        if (node != null) {
            node.setStyleWidth(i11);
            node.setStyleHeight(i12);
            dispatchViewUpdatesIfNeeded();
        } else {
            E6.a.K(ReactConstants.TAG, "Tried to update size of non-existent tag: " + i10);
        }
    }

    public void updateRootView(int i10, int i11, int i12) {
        ReactShadowNode<?> node = this.mShadowNodeRegistry.getNode(i10);
        if (node != null) {
            updateRootView(node, i11, i12);
            return;
        }
        E6.a.K(ReactConstants.TAG, "Tried to update non-existent root tag: " + i10);
    }

    public void updateView(int i10, String str, ReadableMap readableMap) {
        if (this.mViewOperationsEnabled) {
            if (this.mViewManagers.get(str) == null) {
                throw new IllegalViewOperationException("Got unknown view type: " + str);
            }
            ReactShadowNode<?> node = this.mShadowNodeRegistry.getNode(i10);
            if (node == null) {
                throw new IllegalViewOperationException("Trying to update non-existent view with tag " + i10);
            }
            if (readableMap != null) {
                ReactStylesDiffMap reactStylesDiffMap = new ReactStylesDiffMap(readableMap);
                node.updateProperties(reactStylesDiffMap);
                handleUpdateView(node, str, reactStylesDiffMap);
            }
        }
    }

    public void updateViewHierarchy() {
        A8.a.c(0L, "UIImplementation.updateViewHierarchy");
        for (int i10 = 0; i10 < this.mShadowNodeRegistry.getRootNodeCount(); i10++) {
            try {
                ReactShadowNode<?> node = this.mShadowNodeRegistry.getNode(this.mShadowNodeRegistry.getRootTag(i10));
                if (node.getWidthMeasureSpec() != null && node.getHeightMeasureSpec() != null) {
                    A8.b.a(0L, "UIImplementation.notifyOnBeforeLayoutRecursive").a("rootTag", node.getReactTag()).c();
                    try {
                        notifyOnBeforeLayoutRecursive(node);
                        A8.a.i(0L);
                        calculateRootLayout(node);
                        A8.b.a(0L, "UIImplementation.applyUpdatesRecursive").a("rootTag", node.getReactTag()).c();
                        try {
                            ArrayList arrayList = new ArrayList();
                            applyUpdatesRecursive(node, 0.0f, 0.0f, arrayList);
                            for (ReactShadowNode reactShadowNode : arrayList) {
                                this.mEventDispatcher.dispatchEvent(OnLayoutEvent.obtain(-1, reactShadowNode.getReactTag(), reactShadowNode.getScreenX(), reactShadowNode.getScreenY(), reactShadowNode.getScreenWidth(), reactShadowNode.getScreenHeight()));
                            }
                            A8.a.i(0L);
                            LayoutUpdateListener layoutUpdateListener = this.mLayoutUpdateListener;
                            if (layoutUpdateListener != null) {
                                this.mOperationsQueue.enqueueLayoutUpdateFinished(node, layoutUpdateListener);
                            }
                        } finally {
                        }
                    } finally {
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Deprecated
    public void viewIsDescendantOf(int i10, int i11, Callback callback) {
        ReactShadowNode<?> node = this.mShadowNodeRegistry.getNode(i10);
        ReactShadowNode<?> node2 = this.mShadowNodeRegistry.getNode(i11);
        if (node == null || node2 == null) {
            callback.invoke(Boolean.FALSE);
        } else {
            callback.invoke(Boolean.valueOf(node.isDescendantOf(node2)));
        }
    }

    public UIImplementation(ReactApplicationContext reactApplicationContext, ViewManagerRegistry viewManagerRegistry, UIViewOperationQueue uIViewOperationQueue, EventDispatcher eventDispatcher) {
        this.uiImplementationThreadLock = new Object();
        ShadowNodeRegistry shadowNodeRegistry = new ShadowNodeRegistry();
        this.mShadowNodeRegistry = shadowNodeRegistry;
        this.mMeasureBuffer = new int[4];
        this.mLastCalculateLayoutTime = 0L;
        this.mViewOperationsEnabled = true;
        this.mReactContext = reactApplicationContext;
        this.mViewManagers = viewManagerRegistry;
        this.mOperationsQueue = uIViewOperationQueue;
        this.mNativeViewHierarchyOptimizer = new NativeViewHierarchyOptimizer(uIViewOperationQueue, shadowNodeRegistry);
        this.mEventDispatcher = eventDispatcher;
    }

    public void dispatchViewManagerCommand(int i10, String str, ReadableArray readableArray) {
        if (checkOrAssertViewExists(i10, "dispatchViewManagerCommand: " + str)) {
            this.mOperationsQueue.enqueueDispatchCommand(i10, str, readableArray);
        }
    }

    public void updateRootView(ReactShadowNode reactShadowNode, int i10, int i11) {
        reactShadowNode.setMeasureSpecs(i10, i11);
    }

    private void measureLayout(int i10, int i11, int[] iArr) {
        ReactShadowNode<?> node = this.mShadowNodeRegistry.getNode(i10);
        ReactShadowNode<?> node2 = this.mShadowNodeRegistry.getNode(i11);
        if (node == null || node2 == null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Tag ");
            if (node != null) {
                i10 = i11;
            }
            sb2.append(i10);
            sb2.append(" does not exist");
            throw new IllegalViewOperationException(sb2.toString());
        }
        if (node != node2) {
            for (ReactShadowNode<?> parent = node.getParent(); parent != node2; parent = parent.getParent()) {
                if (parent == null) {
                    throw new IllegalViewOperationException("Tag " + i11 + " is not an ancestor of tag " + i10);
                }
            }
        }
        measureLayoutRelativeToVerifiedAncestor(node, node2, iArr);
    }

    private void measureLayoutRelativeToParent(int i10, int[] iArr) {
        ReactShadowNode<?> node = this.mShadowNodeRegistry.getNode(i10);
        if (node != null) {
            ReactShadowNode parent = node.getParent();
            if (parent != null) {
                measureLayoutRelativeToVerifiedAncestor(node, parent, iArr);
                return;
            }
            throw new IllegalViewOperationException("View with tag " + i10 + " doesn't have a parent!");
        }
        throw new IllegalViewOperationException("No native view for tag " + i10 + " exists!");
    }
}
