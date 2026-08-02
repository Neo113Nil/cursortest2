package com.swmansion.worklets;

import com.facebook.jni.HybridData;
import com.facebook.react.bridge.JavaScriptContextHolder;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.queue.MessageQueueThread;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.turbomodule.core.CallInvokerHolderImpl;
import com.facebook.soloader.SoLoader;
import com.swmansion.worklets.runloop.AnimationFrameCallback;
import com.swmansion.worklets.runloop.AnimationFrameQueue;
import h8.InterfaceC4488a;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

@ReactModule(name = NativeWorkletsModuleSpec.NAME)
/* loaded from: classes4.dex */
public class WorkletsModule extends NativeWorkletsModuleSpec implements LifecycleEventListener {
    private final AndroidUIScheduler mAndroidUIScheduler;
    private final AnimationFrameQueue mAnimationFrameQueue;

    @InterfaceC4488a
    private HybridData mHybridData;
    private final AtomicBoolean mInvalidated;
    private final WorkletsMessageQueueThread mMessageQueueThread;
    private boolean mSlowAnimationsEnabled;

    static {
        SoLoader.t("worklets");
    }

    public WorkletsModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mMessageQueueThread = new WorkletsMessageQueueThread();
        this.mInvalidated = new AtomicBoolean(false);
        reactApplicationContext.assertOnJSQueueThread();
        this.mAndroidUIScheduler = new AndroidUIScheduler(reactApplicationContext);
        this.mAnimationFrameQueue = new AnimationFrameQueue(reactApplicationContext);
    }

    private native HybridData initHybrid(long j10, MessageQueueThread messageQueueThread, CallInvokerHolderImpl callInvokerHolderImpl, AndroidUIScheduler androidUIScheduler);

    private native void invalidateCpp();

    public HybridData getHybridData() {
        return this.mHybridData;
    }

    @Override // com.swmansion.worklets.NativeWorkletsModuleSpec
    @ReactMethod(isBlockingSynchronousMethod = true)
    public boolean installTurboModule() {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        reactApplicationContext.assertOnJSQueueThread();
        JavaScriptContextHolder javaScriptContextHolder = reactApplicationContext.getJavaScriptContextHolder();
        Objects.requireNonNull(javaScriptContextHolder);
        this.mHybridData = initHybrid(javaScriptContextHolder.getContext(), this.mMessageQueueThread, JSCallInvokerResolver.getJSCallInvokerHolder(reactApplicationContext), this.mAndroidUIScheduler);
        return true;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void invalidate() {
        if (this.mInvalidated.getAndSet(true)) {
            return;
        }
        HybridData hybridData = this.mHybridData;
        if (hybridData != null && hybridData.isValid()) {
            invalidateCpp();
        }
        this.mAndroidUIScheduler.deactivate();
    }

    @InterfaceC4488a
    public boolean isOnJSQueueThread() {
        return getReactApplicationContext().isOnJSQueueThread();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        this.mAnimationFrameQueue.pause();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        this.mAnimationFrameQueue.resume();
    }

    public void requestAnimationFrame(AnimationFrameCallback animationFrameCallback) {
        this.mAnimationFrameQueue.requestAnimationFrame(animationFrameCallback);
    }

    public void toggleSlowAnimations() {
        boolean z10 = !this.mSlowAnimationsEnabled;
        this.mSlowAnimationsEnabled = z10;
        this.mAnimationFrameQueue.enableSlowAnimations(z10, 10);
    }
}
