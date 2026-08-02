package com.facebook.react.uimanager;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.facebook.react.R;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.RetryableMountingLayerException;
import com.facebook.react.bridge.SoftAssertions;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.common.annotations.internal.LegacyArchitectureLogLevel;
import com.facebook.react.common.annotations.internal.LegacyArchitectureLogger;
import com.facebook.react.common.build.ReactBuildConfig;
import com.facebook.react.touch.JSResponderHandler;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

@Deprecated(since = "This class is part of Legacy Architecture and will be removed in a future release")
/* loaded from: classes2.dex */
public class NativeViewHierarchyManager {
    private static final String TAG;
    private final boolean DEBUG_MODE;
    private final RectF mBoundingBox;
    private final JSResponderHandler mJSResponderHandler;
    private volatile boolean mLayoutAnimationEnabled;
    private HashMap<Integer, Set<Integer>> mPendingDeletionsForTag;
    private final SparseBooleanArray mRootTags;
    private final RootViewManager mRootViewManager;
    private final SparseArray<ViewManager> mTagsToViewManagers;
    private final SparseArray<View> mTagsToViews;
    private final ViewManagerRegistry mViewManagers;

    static {
        LegacyArchitectureLogger.assertLegacyArchitecture("NativeViewHierarchyManager", LegacyArchitectureLogLevel.ERROR);
        TAG = NativeViewHierarchyManager.class.getSimpleName();
    }

    public NativeViewHierarchyManager(ViewManagerRegistry viewManagerRegistry) {
        this(viewManagerRegistry, new RootViewManager());
    }

    private boolean arrayContains(int[] iArr, int i10) {
        if (iArr == null) {
            return false;
        }
        for (int i11 : iArr) {
            if (i11 == i10) {
                return true;
            }
        }
        return false;
    }

    private void computeBoundingBox(View view, int[] iArr) {
        this.mBoundingBox.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        mapRectFromViewToWindowCoords(view, this.mBoundingBox);
        iArr[0] = Math.round(this.mBoundingBox.left);
        iArr[1] = Math.round(this.mBoundingBox.top);
        RectF rectF = this.mBoundingBox;
        iArr[2] = Math.round(rectF.right - rectF.left);
        RectF rectF2 = this.mBoundingBox;
        iArr[3] = Math.round(rectF2.bottom - rectF2.top);
    }

    private static String constructManageChildrenErrorMessage(ViewGroup viewGroup, ViewGroupManager viewGroupManager, int[] iArr, ViewAtIndex[] viewAtIndexArr, int[] iArr2) {
        StringBuilder sb2 = new StringBuilder();
        if (viewGroup != null) {
            sb2.append("View tag:" + viewGroup.getId() + " View Type:" + viewGroup.getClass().toString() + ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
            StringBuilder sb3 = new StringBuilder();
            sb3.append("  children(");
            sb3.append(viewGroupManager.getChildCount((ViewGroupManager) viewGroup));
            sb3.append("): [\n");
            sb2.append(sb3.toString());
            for (int i10 = 0; viewGroupManager.getChildAt((ViewGroupManager) viewGroup, i10) != null; i10 += 16) {
                int i11 = 0;
                while (true) {
                    int i12 = i10 + i11;
                    if (viewGroupManager.getChildAt((ViewGroupManager) viewGroup, i12) != null && i11 < 16) {
                        sb2.append(viewGroupManager.getChildAt((ViewGroupManager) viewGroup, i12).getId() + ",");
                        i11++;
                    }
                }
                sb2.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
            }
            sb2.append(" ],\n");
        }
        if (iArr != null) {
            sb2.append("  indicesToRemove(" + iArr.length + "): [\n");
            for (int i13 = 0; i13 < iArr.length; i13 += 16) {
                int i14 = 0;
                while (true) {
                    int i15 = i13 + i14;
                    if (i15 < iArr.length && i14 < 16) {
                        sb2.append(iArr[i15] + ",");
                        i14++;
                    }
                }
                sb2.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
            }
            sb2.append(" ],\n");
        }
        if (viewAtIndexArr != null) {
            sb2.append("  viewsToAdd(" + viewAtIndexArr.length + "): [\n");
            for (int i16 = 0; i16 < viewAtIndexArr.length; i16 += 16) {
                int i17 = 0;
                while (true) {
                    int i18 = i16 + i17;
                    if (i18 < viewAtIndexArr.length && i17 < 16) {
                        sb2.append("[" + viewAtIndexArr[i18].mIndex + "," + viewAtIndexArr[i18].mTag + "],");
                        i17++;
                    }
                }
                sb2.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
            }
            sb2.append(" ],\n");
        }
        if (iArr2 != null) {
            sb2.append("  tagsToDelete(" + iArr2.length + "): [\n");
            for (int i19 = 0; i19 < iArr2.length; i19 += 16) {
                int i20 = 0;
                while (true) {
                    int i21 = i19 + i20;
                    if (i21 < iArr2.length && i20 < 16) {
                        sb2.append(iArr2[i21] + ",");
                        i20++;
                    }
                }
                sb2.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
            }
            sb2.append(" ]\n");
        }
        return sb2.toString();
    }

    private static String constructSetChildrenErrorMessage(ViewGroup viewGroup, ViewGroupManager viewGroupManager, ReadableArray readableArray) {
        ViewAtIndex[] viewAtIndexArr = new ViewAtIndex[readableArray.size()];
        for (int i10 = 0; i10 < readableArray.size(); i10++) {
            viewAtIndexArr[i10] = new ViewAtIndex(readableArray.getInt(i10), i10);
        }
        return constructManageChildrenErrorMessage(viewGroup, viewGroupManager, null, viewAtIndexArr, null);
    }

    private Set<Integer> getPendingDeletionsForTag(int i10) {
        if (this.mPendingDeletionsForTag == null) {
            this.mPendingDeletionsForTag = new HashMap<>();
        }
        if (!this.mPendingDeletionsForTag.containsKey(Integer.valueOf(i10))) {
            this.mPendingDeletionsForTag.put(Integer.valueOf(i10), new HashSet());
        }
        return this.mPendingDeletionsForTag.get(Integer.valueOf(i10));
    }

    private ThemedReactContext getReactContextForView(int i10) {
        View view = this.mTagsToViews.get(i10);
        if (view != null) {
            return (ThemedReactContext) view.getContext();
        }
        throw new JSApplicationIllegalArgumentException("Could not find view with tag " + i10);
    }

    private void mapRectFromViewToWindowCoords(View view, RectF rectF) {
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            matrix.mapRect(rectF);
        }
        rectF.offset(view.getLeft(), view.getTop());
        Object parent = view.getParent();
        while (parent instanceof View) {
            View view2 = (View) parent;
            rectF.offset(-view2.getScrollX(), -view2.getScrollY());
            Matrix matrix2 = view2.getMatrix();
            if (!matrix2.isIdentity()) {
                matrix2.mapRect(rectF);
            }
            rectF.offset(view2.getLeft(), view2.getTop());
            parent = view2.getParent();
        }
    }

    public synchronized void addRootView(int i10, View view) {
        addRootViewGroup(i10, view);
    }

    public final synchronized void addRootViewGroup(int i10, View view) {
        try {
            if (this.DEBUG_MODE) {
                E6.a.d(TAG, "addRootViewGroup[%d]: %s", Integer.valueOf(i10), view != null ? view.toString() : "<null>");
            }
            if (view.getId() != -1) {
                E6.a.m(TAG, "Trying to add a root view with an explicit id (" + view.getId() + ") already set. React Native uses the id field to track react tags and will overwrite this field. If that is fine, explicitly overwrite the id field to View.NO_ID before calling addRootView.");
            }
            this.mTagsToViews.put(i10, view);
            this.mTagsToViewManagers.put(i10, this.mRootViewManager);
            this.mRootTags.put(i10, true);
            view.setId(i10);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void clearJSResponder() {
        this.mJSResponderHandler.clearJSResponder();
    }

    public synchronized void clearLayoutAnimation() {
    }

    public synchronized void configureLayoutAnimation(ReadableMap readableMap, Callback callback) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public synchronized void createView(ThemedReactContext themedReactContext, int i10, String str, ReactStylesDiffMap reactStylesDiffMap) {
        try {
            if (this.DEBUG_MODE) {
                E6.a.e(TAG, "createView[%d]: %s %s", Integer.valueOf(i10), str, reactStylesDiffMap != null ? reactStylesDiffMap.toString() : "<null>");
            }
            UiThreadUtil.assertOnUiThread();
            A8.b.a(0L, "NativeViewHierarchyManager_createView").a("tag", i10).b("className", str).c();
            try {
                ViewManager<?, ?> viewManager = this.mViewManagers.get(str);
                this.mTagsToViews.put(i10, viewManager.createView(i10, themedReactContext, reactStylesDiffMap, null, this.mJSResponderHandler));
                this.mTagsToViewManagers.put(i10, viewManager);
                A8.a.i(0L);
            } catch (Throwable th2) {
                A8.a.i(0L);
                throw th2;
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    @Deprecated
    public synchronized void dispatchCommand(int i10, int i11, ReadableArray readableArray) {
        try {
            if (this.DEBUG_MODE) {
                E6.a.e(TAG, "dispatchCommand[%d]: %d %s", Integer.valueOf(i10), Integer.valueOf(i11), readableArray != null ? readableArray.toString() : "<null>");
            }
            UiThreadUtil.assertOnUiThread();
            View view = this.mTagsToViews.get(i10);
            if (view == null) {
                throw new RetryableMountingLayerException("Trying to send command to a non-existing view with tag [" + i10 + "] and command " + i11);
            }
            resolveViewManager(i10).receiveCommand((ViewManager) view, i11, readableArray);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void dropView(View view) {
        try {
            if (this.DEBUG_MODE) {
                E6.a.c(TAG, "dropView[%d]", Integer.valueOf(view != null ? view.getId() : -1));
            }
            UiThreadUtil.assertOnUiThread();
            if (view == null) {
                return;
            }
            if (this.mTagsToViewManagers.get(view.getId()) == null) {
                return;
            }
            if (!this.mRootTags.get(view.getId())) {
                resolveViewManager(view.getId()).onDropViewInstance(view);
            }
            ViewManager viewManager = this.mTagsToViewManagers.get(view.getId());
            if ((view instanceof ViewGroup) && (viewManager instanceof ViewGroupManager)) {
                ViewGroup viewGroup = (ViewGroup) view;
                ViewGroupManager viewGroupManager = (ViewGroupManager) viewManager;
                for (int childCount = viewGroupManager.getChildCount((ViewGroupManager) viewGroup) - 1; childCount >= 0; childCount--) {
                    View childAt = viewGroupManager.getChildAt((ViewGroupManager) viewGroup, childCount);
                    if (childAt == null) {
                        E6.a.m(TAG, "Unable to drop null child view");
                    } else if (this.mTagsToViews.get(childAt.getId()) != null) {
                        dropView(childAt);
                    }
                }
                viewGroupManager.removeAllViews(viewGroup);
            }
            this.mTagsToViews.remove(view.getId());
            this.mTagsToViewManagers.remove(view.getId());
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized int findTargetTagForTouch(int i10, float f10, float f11) {
        View view;
        try {
            if (this.DEBUG_MODE) {
                E6.a.e(TAG, "findTargetTagForTouch[%d]: %f %f", Integer.valueOf(i10), Float.valueOf(f10), Float.valueOf(f11));
            }
            UiThreadUtil.assertOnUiThread();
            view = this.mTagsToViews.get(i10);
            if (view == null) {
                throw new JSApplicationIllegalArgumentException("Could not find view with tag " + i10);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return TouchTargetHelper.findTargetTagForTouch(f10, f11, (ViewGroup) view);
    }

    public synchronized long getInstanceHandle(int i10) {
        Long l10;
        View view = this.mTagsToViews.get(i10);
        if (view == null) {
            throw new IllegalViewOperationException("Unable to find view for tag: " + i10);
        }
        l10 = (Long) view.getTag(R.id.view_tag_instance_handle);
        if (l10 == null) {
            throw new IllegalViewOperationException("Unable to find instanceHandle for tag: " + i10);
        }
        return l10.longValue();
    }

    public synchronized int getRootViewNum() {
        return this.mRootTags.size();
    }

    public synchronized void manageChildren(int i10, int[] iArr, ViewAtIndex[] viewAtIndexArr, int[] iArr2) {
        try {
            if (this.DEBUG_MODE) {
                E6.a.f(TAG, "createView[%d]: %s %s %s", Integer.valueOf(i10), iArr != null ? iArr.toString() : "<null>", viewAtIndexArr != null ? viewAtIndexArr.toString() : "<null>", iArr2 != null ? iArr2.toString() : "<null>");
            }
            UiThreadUtil.assertOnUiThread();
            Set<Integer> pendingDeletionsForTag = getPendingDeletionsForTag(i10);
            ViewGroup viewGroup = (ViewGroup) this.mTagsToViews.get(i10);
            ViewGroupManager viewGroupManager = (ViewGroupManager) resolveViewManager(i10);
            if (viewGroup == null) {
                throw new IllegalViewOperationException("Trying to manageChildren view with tag " + i10 + " which doesn't exist\n detail: " + constructManageChildrenErrorMessage(viewGroup, viewGroupManager, iArr, viewAtIndexArr, iArr2));
            }
            int childCount = viewGroupManager.getChildCount((ViewGroupManager) viewGroup);
            if (iArr != null) {
                int length = iArr.length - 1;
                while (length >= 0) {
                    int i11 = iArr[length];
                    if (i11 < 0) {
                        throw new IllegalViewOperationException("Trying to remove a negative view index:" + i11 + " view tag: " + i10 + "\n detail: " + constructManageChildrenErrorMessage(viewGroup, viewGroupManager, iArr, viewAtIndexArr, iArr2));
                    }
                    if (viewGroupManager.getChildAt((ViewGroupManager) viewGroup, i11) == null) {
                        if (this.mRootTags.get(i10) && viewGroupManager.getChildCount((ViewGroupManager) viewGroup) == 0) {
                            return;
                        }
                        throw new IllegalViewOperationException("Trying to remove a view index above child count " + i11 + " view tag: " + i10 + "\n detail: " + constructManageChildrenErrorMessage(viewGroup, viewGroupManager, iArr, viewAtIndexArr, iArr2));
                    }
                    if (i11 >= childCount) {
                        throw new IllegalViewOperationException("Trying to remove an out of order view index:" + i11 + " view tag: " + i10 + "\n detail: " + constructManageChildrenErrorMessage(viewGroup, viewGroupManager, iArr, viewAtIndexArr, iArr2));
                    }
                    if (!this.mLayoutAnimationEnabled) {
                        viewGroupManager.removeViewAt((ViewGroupManager) viewGroup, i11);
                    }
                    length--;
                    childCount = i11;
                }
            }
            if (iArr2 != null) {
                for (int i12 : iArr2) {
                    View view = this.mTagsToViews.get(i12);
                    if (view == null) {
                        throw new IllegalViewOperationException("Trying to destroy unknown view tag: " + i12 + "\n detail: " + constructManageChildrenErrorMessage(viewGroup, viewGroupManager, iArr, viewAtIndexArr, iArr2));
                    }
                    if (!this.mLayoutAnimationEnabled) {
                        dropView(view);
                    }
                }
            }
            if (viewAtIndexArr != null) {
                for (ViewAtIndex viewAtIndex : viewAtIndexArr) {
                    View view2 = this.mTagsToViews.get(viewAtIndex.mTag);
                    if (view2 == null) {
                        throw new IllegalViewOperationException("Trying to add unknown view tag: " + viewAtIndex.mTag + "\n detail: " + constructManageChildrenErrorMessage(viewGroup, viewGroupManager, iArr, viewAtIndexArr, iArr2));
                    }
                    int i13 = viewAtIndex.mIndex;
                    if (!pendingDeletionsForTag.isEmpty()) {
                        i13 = 0;
                        int i14 = 0;
                        while (i13 < viewGroup.getChildCount() && i14 != viewAtIndex.mIndex) {
                            if (!pendingDeletionsForTag.contains(Integer.valueOf(viewGroup.getChildAt(i13).getId()))) {
                                i14++;
                            }
                            i13++;
                        }
                    }
                    viewGroupManager.addView((ViewGroupManager) viewGroup, view2, i13);
                }
            }
            if (pendingDeletionsForTag.isEmpty()) {
                this.mPendingDeletionsForTag.remove(Integer.valueOf(i10));
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void measure(int i10, int[] iArr) {
        try {
            if (this.DEBUG_MODE) {
                E6.a.c(TAG, "measure[%d]", Integer.valueOf(i10));
            }
            UiThreadUtil.assertOnUiThread();
            View view = this.mTagsToViews.get(i10);
            if (view == null) {
                throw new IllegalViewOperationException("No native view for " + i10 + " currently exists");
            }
            View view2 = (View) RootViewUtil.getRootView(view);
            if (view2 == null) {
                throw new IllegalViewOperationException("Native view " + i10 + " is no longer on screen");
            }
            computeBoundingBox(view2, iArr);
            int i11 = iArr[0];
            int i12 = iArr[1];
            computeBoundingBox(view, iArr);
            iArr[0] = iArr[0] - i11;
            iArr[1] = iArr[1] - i12;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void measureInWindow(int i10, int[] iArr) {
        try {
            if (this.DEBUG_MODE) {
                E6.a.c(TAG, "measureInWindow[%d]", Integer.valueOf(i10));
            }
            UiThreadUtil.assertOnUiThread();
            View view = this.mTagsToViews.get(i10);
            if (view == null) {
                throw new IllegalViewOperationException("No native view for " + i10 + " currently exists");
            }
            view.getLocationOnScreen(iArr);
            Rect rect = new Rect();
            view.getWindowVisibleDisplayFrame(rect);
            iArr[0] = iArr[0] - rect.left;
            iArr[1] = iArr[1] - rect.top;
            iArr[2] = view.getWidth();
            iArr[3] = view.getHeight();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void removeRootView(int i10) {
        try {
            if (this.DEBUG_MODE) {
                E6.a.c(TAG, "removeRootView[%d]", Integer.valueOf(i10));
            }
            UiThreadUtil.assertOnUiThread();
            if (!this.mRootTags.get(i10)) {
                SoftAssertions.assertUnreachable("View with tag " + i10 + " is not registered as a root view");
            }
            View view = this.mTagsToViews.get(i10);
            dropView(view);
            this.mRootTags.delete(i10);
            if (view != null) {
                view.setId(-1);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized View resolveView(int i10) {
        View view;
        view = this.mTagsToViews.get(i10);
        if (view == null) {
            throw new IllegalViewOperationException("Trying to resolve view with tag " + i10 + " which doesn't exist");
        }
        return view;
    }

    public final synchronized ViewManager resolveViewManager(int i10) {
        ViewManager viewManager;
        viewManager = this.mTagsToViewManagers.get(i10);
        if (viewManager == null) {
            throw new IllegalViewOperationException("ViewManager for tag " + i10 + " could not be found.\n");
        }
        return viewManager;
    }

    public synchronized void sendAccessibilityEvent(int i10, int i11) {
        View view = this.mTagsToViews.get(i10);
        if (view == null) {
            throw new RetryableMountingLayerException("Could not find view with tag " + i10);
        }
        view.sendAccessibilityEvent(i11);
    }

    public synchronized void setChildren(int i10, ReadableArray readableArray) {
        try {
            if (this.DEBUG_MODE) {
                E6.a.d(TAG, "setChildren[%d]: %s", Integer.valueOf(i10), readableArray != null ? readableArray.toString() : "<null>");
            }
            UiThreadUtil.assertOnUiThread();
            ViewGroup viewGroup = (ViewGroup) this.mTagsToViews.get(i10);
            ViewGroupManager viewGroupManager = (ViewGroupManager) resolveViewManager(i10);
            for (int i11 = 0; i11 < readableArray.size(); i11++) {
                View view = this.mTagsToViews.get(readableArray.getInt(i11));
                if (view == null) {
                    throw new IllegalViewOperationException("Trying to add unknown view tag: " + readableArray.getInt(i11) + "\n detail: " + constructSetChildrenErrorMessage(viewGroup, viewGroupManager, readableArray));
                }
                viewGroupManager.addView((ViewGroupManager) viewGroup, view, i11);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public synchronized void setJSResponder(int i10, int i11, boolean z10) {
        if (!z10) {
            this.mJSResponderHandler.setJSResponder(i11, null);
            return;
        }
        View view = this.mTagsToViews.get(i10);
        if (i11 != i10 && (view instanceof ViewParent)) {
            this.mJSResponderHandler.setJSResponder(i11, (ViewParent) view);
            return;
        }
        if (this.mRootTags.get(i10)) {
            SoftAssertions.assertUnreachable("Cannot block native responder on " + i10 + " that is a root view");
        }
        this.mJSResponderHandler.setJSResponder(i11, view.getParent());
    }

    public void setLayoutAnimationEnabled(boolean z10) {
        this.mLayoutAnimationEnabled = z10;
    }

    public synchronized void updateInstanceHandle(int i10, long j10) {
        UiThreadUtil.assertOnUiThread();
        try {
            updateInstanceHandle(resolveView(i10), j10);
        } catch (IllegalViewOperationException e10) {
            E6.a.n(TAG, "Unable to update properties for view tag " + i10, e10);
        }
    }

    @Deprecated
    public void updateLayout(int i10, int i11, int i12, int i13, int i14) {
        updateLayout(i10, i10, i11, i12, i13, i14, com.facebook.yoga.h.INHERIT);
    }

    public synchronized void updateProperties(int i10, ReactStylesDiffMap reactStylesDiffMap) {
        try {
            if (this.DEBUG_MODE) {
                E6.a.d(TAG, "updateProperties[%d]: %s", Integer.valueOf(i10), reactStylesDiffMap.toString());
            }
            UiThreadUtil.assertOnUiThread();
            try {
                ViewManager resolveViewManager = resolveViewManager(i10);
                View resolveView = resolveView(i10);
                if (reactStylesDiffMap != null) {
                    resolveViewManager.updateProperties(resolveView, reactStylesDiffMap);
                }
            } catch (IllegalViewOperationException e10) {
                E6.a.n(TAG, "Unable to update properties for view tag " + i10, e10);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void updateViewExtraData(int i10, Object obj) {
        try {
            if (this.DEBUG_MODE) {
                E6.a.d(TAG, "updateViewExtraData[%d]: %s", Integer.valueOf(i10), obj.toString());
            }
            UiThreadUtil.assertOnUiThread();
            resolveViewManager(i10).updateExtraData(resolveView(i10), obj);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public NativeViewHierarchyManager(ViewManagerRegistry viewManagerRegistry, RootViewManager rootViewManager) {
        ReactBuildConfig reactBuildConfig = ReactBuildConfig.INSTANCE;
        this.DEBUG_MODE = false;
        this.mJSResponderHandler = new JSResponderHandler();
        this.mBoundingBox = new RectF();
        this.mViewManagers = viewManagerRegistry;
        this.mTagsToViews = new SparseArray<>();
        this.mTagsToViewManagers = new SparseArray<>();
        this.mRootTags = new SparseBooleanArray();
        this.mRootViewManager = rootViewManager;
    }

    public synchronized void updateLayout(int i10, int i11, int i12, int i13, int i14, int i15, com.facebook.yoga.h hVar) {
        Throwable th2;
        Throwable th3;
        try {
            try {
                if (this.DEBUG_MODE) {
                    try {
                        E6.a.h(TAG, "updateLayout[%d]->[%d]: %d %d %d %d", Integer.valueOf(i11), Integer.valueOf(i10), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14), Integer.valueOf(i15));
                    } catch (Throwable th4) {
                        th2 = th4;
                        throw th2;
                    }
                }
                UiThreadUtil.assertOnUiThread();
                A8.b.a(0L, "NativeViewHierarchyManager_updateLayout").a("parentTag", i10).a("tag", i11).c();
                try {
                    View resolveView = resolveView(i11);
                    resolveView.measure(View.MeasureSpec.makeMeasureSpec(i14, 1073741824), View.MeasureSpec.makeMeasureSpec(i15, 1073741824));
                    ViewParent parent = resolveView.getParent();
                    if (parent instanceof RootView) {
                        try {
                            parent.requestLayout();
                        } catch (Throwable th5) {
                            th3 = th5;
                            A8.a.i(0L);
                            throw th3;
                        }
                    }
                    if (this.mRootTags.get(i10)) {
                        try {
                            updateLayout(resolveView, i12, i13, i14, i15);
                        } catch (Throwable th6) {
                            th = th6;
                            th3 = th;
                            A8.a.i(0L);
                            throw th3;
                        }
                    } else {
                        NativeModule nativeModule = (ViewManager) this.mTagsToViewManagers.get(i10);
                        if (!(nativeModule instanceof IViewManagerWithChildren)) {
                            throw new IllegalViewOperationException("Trying to use view with tag " + i10 + " as a parent, but its Manager doesn't implement IViewManagerWithChildren");
                        }
                        IViewManagerWithChildren iViewManagerWithChildren = (IViewManagerWithChildren) nativeModule;
                        if (iViewManagerWithChildren != null && !iViewManagerWithChildren.needsCustomLayoutForChildren()) {
                            updateLayout(resolveView, i12, i13, i14, i15);
                        }
                    }
                    A8.a.i(0L);
                } catch (Throwable th7) {
                    th = th7;
                }
            } catch (Throwable th8) {
                th = th8;
                th2 = th;
                throw th2;
            }
        } catch (Throwable th9) {
            th = th9;
        }
    }

    private void updateInstanceHandle(View view, long j10) {
        UiThreadUtil.assertOnUiThread();
        view.setTag(R.id.view_tag_instance_handle, Long.valueOf(j10));
    }

    public synchronized void dispatchCommand(int i10, String str, ReadableArray readableArray) {
        try {
            if (this.DEBUG_MODE) {
                E6.a.e(TAG, "dispatchCommand[%d]: %s %s", Integer.valueOf(i10), str, readableArray != null ? readableArray.toString() : "<null>");
            }
            UiThreadUtil.assertOnUiThread();
            View view = this.mTagsToViews.get(i10);
            if (view != null) {
                resolveViewManager(i10).receiveCommand((ViewManager) view, str, readableArray);
            } else {
                throw new RetryableMountingLayerException("Trying to send command to a non-existing view with tag [" + i10 + "] and command " + str);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private void updateLayout(View view, int i10, int i11, int i12, int i13) {
        if (this.mLayoutAnimationEnabled) {
            return;
        }
        view.layout(i10, i11, i12 + i10, i13 + i11);
    }
}
