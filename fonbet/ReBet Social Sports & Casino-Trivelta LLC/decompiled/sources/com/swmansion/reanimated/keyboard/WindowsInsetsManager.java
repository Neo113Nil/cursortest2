package com.swmansion.reanimated.keyboard;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.view.AbstractC2082d0;
import androidx.core.view.AbstractC2109r0;
import androidx.core.view.F0;
import androidx.core.view.J;
import com.facebook.react.bridge.ReactApplicationContext;
import java.lang.ref.WeakReference;
import l.f;

/* loaded from: classes4.dex */
public class WindowsInsetsManager {
    private final Keyboard mKeyboard;
    private final NotifyAboutKeyboardChangeFunction mNotifyAboutKeyboardChange;
    private final WeakReference<ReactApplicationContext> mReactContext;
    private boolean mIsStatusBarTranslucent = false;
    private boolean mIsNavigationBarTranslucent = false;
    private final String MissingContextErrorMsg = "Unable to get reference to react activity";

    public WindowsInsetsManager(WeakReference<ReactApplicationContext> weakReference, Keyboard keyboard, NotifyAboutKeyboardChangeFunction notifyAboutKeyboardChangeFunction) {
        this.mReactContext = weakReference;
        this.mKeyboard = keyboard;
        this.mNotifyAboutKeyboardChange = notifyAboutKeyboardChangeFunction;
    }

    private Activity getCurrentActivity() {
        return this.mReactContext.get().getCurrentActivity();
    }

    private FrameLayout.LayoutParams getLayoutParams(int i10, int i11) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        if (this.mIsStatusBarTranslucent) {
            i10 = 0;
        }
        if (this.mIsNavigationBarTranslucent) {
            i11 = 0;
        }
        layoutParams.setMargins(0, i10, 0, i11);
        return layoutParams;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updateInsets$1(int i10, int i11) {
        FrameLayout.LayoutParams layoutParams = getLayoutParams(i10, i11);
        int i12 = f.f55099d;
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            Log.e("Reanimated", "Unable to get reference to react activity");
        } else {
            currentActivity.getWindow().getDecorView().findViewById(i12).setLayoutParams(layoutParams);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updateWindowDecor$0(boolean z10) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            Log.e("Reanimated", "Unable to get reference to react activity");
        } else {
            AbstractC2109r0.b(currentActivity.getWindow(), z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public F0 onApplyWindowInsetsListener(View view, F0 f02) {
        F0 X10 = AbstractC2082d0.X(view, f02);
        if (this.mKeyboard.getState() == KeyboardState.OPEN) {
            this.mKeyboard.updateHeight(f02, this.mIsNavigationBarTranslucent);
            this.mNotifyAboutKeyboardChange.call();
        }
        setWindowInsets(X10);
        return X10;
    }

    private void setWindowInsets(F0 f02) {
        int g10 = F0.p.g();
        updateInsets(f02.f(g10).f19099b, f02.f(g10).f19101d);
    }

    private void updateInsets(final int i10, final int i11) {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.swmansion.reanimated.keyboard.d
            @Override // java.lang.Runnable
            public final void run() {
                WindowsInsetsManager.this.lambda$updateInsets$1(i10, i11);
            }
        });
    }

    private void updateWindowDecor(final boolean z10) {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.swmansion.reanimated.keyboard.c
            @Override // java.lang.Runnable
            public final void run() {
                WindowsInsetsManager.this.lambda$updateWindowDecor$0(z10);
            }
        });
    }

    public void startObservingChanges(KeyboardAnimationCallback keyboardAnimationCallback, boolean z10, boolean z11) {
        this.mIsStatusBarTranslucent = z10;
        this.mIsNavigationBarTranslucent = z11;
        updateWindowDecor(false);
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            Log.e("Reanimated", "Unable to get reference to react activity");
            return;
        }
        View decorView = currentActivity.getWindow().getDecorView();
        AbstractC2082d0.x0(decorView, new J() { // from class: com.swmansion.reanimated.keyboard.b
            @Override // androidx.core.view.J
            public final F0 f(View view, F0 f02) {
                F0 onApplyWindowInsetsListener;
                onApplyWindowInsetsListener = WindowsInsetsManager.this.onApplyWindowInsetsListener(view, f02);
                return onApplyWindowInsetsListener;
            }
        });
        AbstractC2082d0.E0(decorView, keyboardAnimationCallback);
    }

    public void stopObservingChanges() {
        updateWindowDecor((this.mIsStatusBarTranslucent || this.mIsNavigationBarTranslucent) ? false : true);
        updateInsets(0, 0);
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            Log.e("Reanimated", "Unable to get reference to react activity");
            return;
        }
        View decorView = currentActivity.getWindow().getDecorView();
        AbstractC2082d0.E0(decorView, null);
        AbstractC2082d0.x0(decorView, null);
    }
}
