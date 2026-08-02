package com.swmansion.reanimated;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UiThreadUtil;

/* loaded from: classes4.dex */
class DrawPassDetector {
    private final ReactApplicationContext mContext;
    private final Handler mHandler = new Handler(Looper.getMainLooper());
    private final Runnable mClearRunnable = new Runnable() { // from class: com.swmansion.reanimated.a
        @Override // java.lang.Runnable
        public final void run() {
            DrawPassDetector.this.lambda$new$0();
        }
    };
    private boolean mIsInDrawPass = false;
    private View mDecorView = null;
    private final ViewTreeObserver.OnDrawListener mOnDrawListener = new ViewTreeObserver.OnDrawListener() { // from class: com.swmansion.reanimated.b
        @Override // android.view.ViewTreeObserver.OnDrawListener
        public final void onDraw() {
            DrawPassDetector.this.lambda$new$1();
        }
    };

    public DrawPassDetector(ReactApplicationContext reactApplicationContext) {
        this.mContext = reactApplicationContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void invalidateOnUiThread() {
        View view = this.mDecorView;
        if (view != null) {
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnDrawListener(this.mOnDrawListener);
            }
            this.mDecorView = null;
        }
        this.mHandler.removeCallbacks(this.mClearRunnable);
        this.mIsInDrawPass = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0() {
        this.mIsInDrawPass = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$1() {
        this.mIsInDrawPass = true;
        this.mHandler.postAtFrontOfQueue(this.mClearRunnable);
    }

    public void initialize() {
        View decorView;
        View view;
        Activity currentActivity = this.mContext.getCurrentActivity();
        if (currentActivity == null || (decorView = currentActivity.getWindow().getDecorView()) == (view = this.mDecorView)) {
            return;
        }
        if (view != null) {
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnDrawListener(this.mOnDrawListener);
            }
            this.mDecorView = null;
        }
        ViewTreeObserver viewTreeObserver2 = decorView.getViewTreeObserver();
        if (viewTreeObserver2.isAlive()) {
            this.mDecorView = decorView;
            viewTreeObserver2.addOnDrawListener(this.mOnDrawListener);
        }
    }

    public void invalidate() {
        if (UiThreadUtil.isOnUiThread()) {
            invalidateOnUiThread();
        } else {
            this.mHandler.post(new Runnable() { // from class: com.swmansion.reanimated.c
                @Override // java.lang.Runnable
                public final void run() {
                    DrawPassDetector.this.invalidateOnUiThread();
                }
            });
        }
    }

    public boolean isInDrawPass() {
        return this.mIsInDrawPass;
    }
}
