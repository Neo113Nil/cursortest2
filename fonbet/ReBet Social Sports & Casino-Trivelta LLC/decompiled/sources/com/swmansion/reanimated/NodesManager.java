package com.swmansion.reanimated;

import android.os.SystemClock;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.fabric.FabricUIManager;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.modules.core.ReactChoreographer;
import com.facebook.react.uimanager.GuardedFrameCallback;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.EventDispatcherListener;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.swmansion.reanimated.nativeProxy.NoopEventHandler;
import com.swmansion.worklets.WorkletsModule;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes4.dex */
public class NodesManager implements EventDispatcherListener {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private double lastFrameTimeMs;
    private int mAnimationsDragFactor;
    private final GuardedFrameCallback mChoreographerCallback;
    protected final UIManagerModule.CustomEventNamesResolver mCustomEventNamesResolver;
    private final DrawPassDetector mDrawPassDetector;
    private final DeviceEventManagerModule.RCTDeviceEventEmitter mEventEmitter;
    private FabricUIManager mFabricUIManager;
    private NativeProxy mNativeProxy;
    private final ReactChoreographer mReactChoreographer;
    private Long mFirstUptime = Long.valueOf(SystemClock.uptimeMillis());
    private boolean mSlowAnimationsEnabled = false;
    private final AtomicBoolean mCallbackPosted = new AtomicBoolean();
    private RCTEventEmitter mCustomEventHandler = new NoopEventHandler();
    private List<OnAnimationFrame> mFrameCallbacks = new ArrayList();
    private ConcurrentLinkedQueue<CopiedEvent> mEventQueue = new ConcurrentLinkedQueue<>();

    public interface OnAnimationFrame {
        void onAnimationFrame(double d10);
    }

    public NodesManager(ReactApplicationContext reactApplicationContext, WorkletsModule workletsModule) {
        reactApplicationContext.assertOnJSQueueThread();
        final UIManager uIManager = UIManagerHelper.getUIManager(reactApplicationContext, 2);
        Objects.requireNonNull(uIManager);
        this.mCustomEventNamesResolver = new UIManagerModule.CustomEventNamesResolver() { // from class: com.swmansion.reanimated.e
            @Override // com.facebook.react.uimanager.UIManagerModule.CustomEventNamesResolver
            public final String resolveCustomEventName(String str) {
                return UIManager.this.resolveCustomDirectEventName(str);
            }
        };
        this.mEventEmitter = (DeviceEventManagerModule.RCTDeviceEventEmitter) reactApplicationContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class);
        this.mDrawPassDetector = new DrawPassDetector(reactApplicationContext);
        this.mReactChoreographer = ReactChoreographer.getInstance();
        this.mChoreographerCallback = new GuardedFrameCallback(reactApplicationContext) { // from class: com.swmansion.reanimated.NodesManager.1
            @Override // com.facebook.react.uimanager.GuardedFrameCallback
            public void doFrameGuarded(long j10) {
                NodesManager.this.onAnimationFrame(j10);
            }
        };
        this.mNativeProxy = new NativeProxy(reactApplicationContext, workletsModule, this);
        FabricUIManager fabricUIManager = (FabricUIManager) uIManager;
        this.mFabricUIManager = fabricUIManager;
        fabricUIManager.getEventDispatcher().addListener(this);
    }

    private void handleEvent(Event event) {
        event.dispatch(this.mCustomEventHandler);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onAnimationFrame(long j10) {
        UiThreadUtil.assertOnUiThread();
        this.mDrawPassDetector.initialize();
        double d10 = j10 / 1000000.0d;
        if (this.mSlowAnimationsEnabled) {
            d10 = ((d10 - this.mFirstUptime.longValue()) / this.mAnimationsDragFactor) + this.mFirstUptime.longValue();
        }
        if (d10 > this.lastFrameTimeMs) {
            this.lastFrameTimeMs = d10;
            while (!this.mEventQueue.isEmpty()) {
                CopiedEvent poll = this.mEventQueue.poll();
                handleEvent(poll.getTargetTag(), poll.getEventName(), poll.getPayload());
            }
            if (!this.mFrameCallbacks.isEmpty()) {
                List<OnAnimationFrame> list = this.mFrameCallbacks;
                this.mFrameCallbacks = new ArrayList(list.size());
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    list.get(i10).onAnimationFrame(d10);
                }
            }
            performOperations();
        }
        this.mCallbackPosted.set(false);
        if (this.mFrameCallbacks.isEmpty() && this.mEventQueue.isEmpty()) {
            return;
        }
        startUpdatingOnAnimationFrame();
    }

    private void stopUpdatingOnAnimationFrame() {
        if (this.mCallbackPosted.getAndSet(false)) {
            this.mReactChoreographer.removeFrameCallback(ReactChoreographer.CallbackType.NATIVE_ANIMATED_MODULE, this.mChoreographerCallback);
        }
    }

    public void enableSlowAnimations(boolean z10, int i10) {
        this.mSlowAnimationsEnabled = z10;
        this.mAnimationsDragFactor = i10;
        if (z10) {
            this.mFirstUptime = Long.valueOf(SystemClock.uptimeMillis());
        }
    }

    public UIManagerModule.CustomEventNamesResolver getEventNameResolver() {
        return this.mCustomEventNamesResolver;
    }

    public NativeProxy getNativeProxy() {
        return this.mNativeProxy;
    }

    public void invalidate() {
        NativeProxy nativeProxy = this.mNativeProxy;
        if (nativeProxy != null) {
            nativeProxy.invalidate();
            this.mNativeProxy = null;
        }
        this.mDrawPassDetector.invalidate();
        FabricUIManager fabricUIManager = this.mFabricUIManager;
        if (fabricUIManager != null) {
            fabricUIManager.getEventDispatcher().removeListener(this);
        }
    }

    public boolean isAnimationRunning() {
        return this.mCallbackPosted.get();
    }

    public boolean isInDrawPass() {
        return this.mDrawPassDetector.isInDrawPass();
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcherListener
    public void onEventDispatch(Event event) {
        if (this.mNativeProxy == null) {
            return;
        }
        if (UiThreadUtil.isOnUiThread()) {
            handleEvent(event);
            performOperationsRespectingDrawPass();
            return;
        }
        if (this.mNativeProxy.isAnyHandlerWaitingForEvent(this.mCustomEventNamesResolver.resolveCustomEventName(event.getEventName()), event.getViewTag())) {
            this.mEventQueue.offer(new CopiedEvent(event));
        }
        startUpdatingOnAnimationFrame();
    }

    public void onHostPause() {
        if (this.mCallbackPosted.get()) {
            stopUpdatingOnAnimationFrame();
            this.mCallbackPosted.set(true);
        }
    }

    public void onHostResume() {
        if (this.mCallbackPosted.getAndSet(false)) {
            startUpdatingOnAnimationFrame();
        }
    }

    public void performNonLayoutOperations() {
        UiThreadUtil.assertOnUiThread();
        NativeProxy nativeProxy = this.mNativeProxy;
        if (nativeProxy != null) {
            nativeProxy.performNonLayoutOperations();
        }
    }

    public void performOperations() {
        UiThreadUtil.assertOnUiThread();
        NativeProxy nativeProxy = this.mNativeProxy;
        if (nativeProxy != null) {
            nativeProxy.performOperations();
        }
    }

    public void performOperationsRespectingDrawPass() {
        this.mDrawPassDetector.initialize();
        if (!isInDrawPass()) {
            performOperations();
        } else {
            performNonLayoutOperations();
            startUpdatingOnAnimationFrame();
        }
    }

    public void postOnAnimation(OnAnimationFrame onAnimationFrame) {
        this.mFrameCallbacks.add(onAnimationFrame);
        startUpdatingOnAnimationFrame();
    }

    public void registerEventHandler(RCTEventEmitter rCTEventEmitter) {
        this.mCustomEventHandler = rCTEventEmitter;
    }

    public void sendEvent(String str, WritableMap writableMap) {
        this.mEventEmitter.emit(str, writableMap);
    }

    public void startUpdatingOnAnimationFrame() {
        if (this.mCallbackPosted.getAndSet(true)) {
            return;
        }
        this.mReactChoreographer.postFrameCallback(ReactChoreographer.CallbackType.NATIVE_ANIMATED_MODULE, this.mChoreographerCallback);
    }

    private void handleEvent(int i10, String str, WritableMap writableMap) {
        this.mCustomEventHandler.receiveEvent(i10, str, writableMap);
    }
}
