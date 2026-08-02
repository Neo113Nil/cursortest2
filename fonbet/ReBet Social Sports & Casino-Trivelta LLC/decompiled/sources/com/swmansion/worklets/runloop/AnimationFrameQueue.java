package com.swmansion.worklets.runloop;

import android.os.SystemClock;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.modules.core.ReactChoreographer;
import com.facebook.react.uimanager.GuardedFrameCallback;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes4.dex */
public class AnimationFrameQueue {
    private double lastFrameTimeMs;
    private final GuardedFrameCallback mChoreographerCallback;
    private Long mFirstUptime = Long.valueOf(SystemClock.uptimeMillis());
    private boolean mSlowAnimationsEnabled = false;
    private int mAnimationsDragFactor = 1;
    private final ReactChoreographer mReactChoreographer = ReactChoreographer.getInstance();
    private final AtomicBoolean mCallbackPosted = new AtomicBoolean();
    private final AtomicBoolean mPaused = new AtomicBoolean();
    private final List<AnimationFrameCallback> mFrameCallbacks = new ArrayList();

    public AnimationFrameQueue(ReactApplicationContext reactApplicationContext) {
        this.mChoreographerCallback = new GuardedFrameCallback(reactApplicationContext) { // from class: com.swmansion.worklets.runloop.AnimationFrameQueue.1
            @Override // com.facebook.react.uimanager.GuardedFrameCallback
            public void doFrameGuarded(long j10) {
                AnimationFrameQueue.this.executeQueue(j10);
            }
        };
    }

    private double calculateTimestamp(long j10) {
        double d10 = j10 / 1000000.0d;
        return this.mSlowAnimationsEnabled ? this.mFirstUptime.longValue() + ((d10 - this.mFirstUptime.longValue()) / this.mAnimationsDragFactor) : d10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void executeQueue(long j10) {
        double calculateTimestamp = calculateTimestamp(j10);
        if (calculateTimestamp <= this.lastFrameTimeMs) {
            this.mCallbackPosted.set(false);
            scheduleQueueExecution();
            return;
        }
        List<AnimationFrameCallback> pullCallbacks = pullCallbacks();
        this.mCallbackPosted.set(false);
        this.lastFrameTimeMs = calculateTimestamp;
        Iterator<AnimationFrameCallback> it = pullCallbacks.iterator();
        while (it.hasNext()) {
            it.next().onAnimationFrame(calculateTimestamp);
        }
    }

    private List<AnimationFrameCallback> pullCallbacks() {
        ArrayList arrayList;
        synchronized (this.mFrameCallbacks) {
            arrayList = new ArrayList(this.mFrameCallbacks);
            this.mFrameCallbacks.clear();
        }
        return arrayList;
    }

    private void scheduleQueueExecution() {
        synchronized (this.mPaused) {
            try {
                if (!this.mPaused.get() && !this.mCallbackPosted.getAndSet(true)) {
                    this.mReactChoreographer.postFrameCallback(ReactChoreographer.CallbackType.NATIVE_ANIMATED_MODULE, this.mChoreographerCallback);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void enableSlowAnimations(boolean z10, int i10) {
        this.mSlowAnimationsEnabled = z10;
        this.mAnimationsDragFactor = i10;
        if (z10) {
            this.mFirstUptime = Long.valueOf(SystemClock.uptimeMillis());
        }
    }

    public void pause() {
        synchronized (this.mPaused) {
            try {
                if (!this.mPaused.getAndSet(true) && this.mCallbackPosted.getAndSet(false)) {
                    this.mReactChoreographer.removeFrameCallback(ReactChoreographer.CallbackType.NATIVE_ANIMATED_MODULE, this.mChoreographerCallback);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void requestAnimationFrame(AnimationFrameCallback animationFrameCallback) {
        synchronized (this.mFrameCallbacks) {
            this.mFrameCallbacks.add(animationFrameCallback);
        }
        scheduleQueueExecution();
    }

    public void resume() {
        if (this.mPaused.getAndSet(false)) {
            scheduleQueueExecution();
        }
    }
}
