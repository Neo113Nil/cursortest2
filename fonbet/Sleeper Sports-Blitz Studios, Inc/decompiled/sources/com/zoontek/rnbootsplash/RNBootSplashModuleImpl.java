package com.zoontek.rnbootsplash;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewTreeObserver;
import android.window.SplashScreen;
import android.window.SplashScreenView;
import com.facebook.common.logging.FLog;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.uimanager.PixelUtil;
import com.zoontek.rnbootsplash.RNBootSplashModuleImpl;
import io.intercom.android.sdk.annotations.SeenState;
import io.radar.sdk.RadarTrackingOptions;
import io.sentry.Session;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RNBootSplashModuleImpl.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001&B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\b\u0001\u0010\u0014\u001a\u00020\fH\u0000¢\u0006\u0002\b\u0015J\b\u0010\u0016\u001a\u00020\u0011H\u0002J \u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002J\u0006\u0010\u001d\u001a\u00020\u001bJ\r\u0010\u001e\u001a\u00020\u0011H\u0000¢\u0006\u0002\b\u001fJ\u001a\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010!2\u0006\u0010\u0018\u001a\u00020\u0019J&\u0010\"\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010#\u001a\u00020\bJ\u001e\u0010$\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010#\u001a\u00020\bJ\u000e\u0010%\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u00020\f8\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/zoontek/rnbootsplash/RNBootSplashModuleImpl;", "", "<init>", "()V", "NAME", "", "mPromiseQueue", "Lcom/zoontek/rnbootsplash/RNBootSplashQueue;", "Lcom/facebook/react/bridge/Promise;", "mStatus", "Lcom/zoontek/rnbootsplash/RNBootSplashModuleImpl$Status;", "mThemeResId", "", "mInitialDialog", "Lcom/zoontek/rnbootsplash/RNBootSplashDialog;", "mFadeOutDialog", Session.JsonKeys.INIT, "", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ACTIVITY, "Landroid/app/Activity;", "themeResId", "init$react_native_bootsplash_release", "clearPromiseQueue", "hideAndClearPromiseQueue", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "fade", "", "forced", "isSamsungOneUI4", "onHostDestroy", "onHostDestroy$react_native_bootsplash_release", "getConstants", "", SeenState.HIDE, BaseJavaModule.METHOD_TYPE_PROMISE, "show", "isVisible", "Status", "react-native-bootsplash_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class RNBootSplashModuleImpl {
    public static final String NAME = "RNBootSplash";
    private static RNBootSplashDialog mFadeOutDialog;
    private static RNBootSplashDialog mInitialDialog;
    public static final RNBootSplashModuleImpl INSTANCE = new RNBootSplashModuleImpl();
    private static final RNBootSplashQueue<Promise> mPromiseQueue = new RNBootSplashQueue<>();
    private static Status mStatus = Status.HIDDEN;
    private static int mThemeResId = -1;

    private RNBootSplashModuleImpl() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: RNBootSplashModuleImpl.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/zoontek/rnbootsplash/RNBootSplashModuleImpl$Status;", "", "<init>", "(Ljava/lang/String;I)V", "HIDDEN", "HIDING", "INITIALIZING", "VISIBLE", "react-native-bootsplash_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final class Status {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Status[] $VALUES;
        public static final Status HIDDEN = new Status("HIDDEN", 0);
        public static final Status HIDING = new Status("HIDING", 1);
        public static final Status INITIALIZING = new Status("INITIALIZING", 2);
        public static final Status VISIBLE = new Status("VISIBLE", 3);

        private static final /* synthetic */ Status[] $values() {
            return new Status[]{HIDDEN, HIDING, INITIALIZING, VISIBLE};
        }

        public static EnumEntries<Status> getEntries() {
            return $ENTRIES;
        }

        private Status(String str, int i) {
        }

        static {
            Status[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) $VALUES.clone();
        }
    }

    public final void init$react_native_bootsplash_release(final Activity activity, int themeResId) {
        SplashScreen splashScreen;
        int i;
        if (mThemeResId != -1) {
            FLog.w("ReactNative", "RNBootSplash: Ignored initialization, module is already initialized.");
            return;
        }
        mThemeResId = themeResId;
        if (activity == null) {
            FLog.w("ReactNative", "RNBootSplash: Ignored initialization, current activity is null.");
            return;
        }
        TypedValue typedValue = new TypedValue();
        if (activity.getTheme().resolveAttribute(R.attr.postBootSplashTheme, typedValue, true) && (i = typedValue.resourceId) != 0) {
            activity.setTheme(i);
        }
        final View findViewById = activity.findViewById(android.R.id.content);
        mStatus = Status.INITIALIZING;
        findViewById.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: com.zoontek.rnbootsplash.RNBootSplashModuleImpl$init$1
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                RNBootSplashModuleImpl.Status status;
                status = RNBootSplashModuleImpl.mStatus;
                if (status == RNBootSplashModuleImpl.Status.INITIALIZING) {
                    return false;
                }
                findViewById.getViewTreeObserver().removeOnPreDrawListener(this);
                return true;
            }
        });
        if (Build.VERSION.SDK_INT >= 31) {
            splashScreen = activity.getSplashScreen();
            splashScreen.setOnExitAnimationListener(new SplashScreen.OnExitAnimationListener() { // from class: com.zoontek.rnbootsplash.RNBootSplashModuleImpl$$ExternalSyntheticLambda9
                @Override // android.window.SplashScreen.OnExitAnimationListener
                public final void onSplashScreenExit(SplashScreenView splashScreenView) {
                    RNBootSplashModuleImpl.init$lambda$0(activity, splashScreenView);
                }
            });
        }
        mInitialDialog = new RNBootSplashDialog(activity, mThemeResId, false, null, 8, null);
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.zoontek.rnbootsplash.RNBootSplashModuleImpl$$ExternalSyntheticLambda10
            @Override // java.lang.Runnable
            public final void run() {
                RNBootSplashModuleImpl.init$lambda$2();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void init$lambda$0(Activity activity, SplashScreenView view) {
        SplashScreen splashScreen;
        Intrinsics.checkNotNullParameter(view, "view");
        view.remove();
        splashScreen = activity.getSplashScreen();
        splashScreen.clearOnExitAnimationListener();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void init$lambda$2() {
        RNBootSplashDialog rNBootSplashDialog = mInitialDialog;
        if (rNBootSplashDialog != null) {
            rNBootSplashDialog.show(new Function0() { // from class: com.zoontek.rnbootsplash.RNBootSplashModuleImpl$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit init$lambda$2$lambda$1;
                    init$lambda$2$lambda$1 = RNBootSplashModuleImpl.init$lambda$2$lambda$1();
                    return init$lambda$2$lambda$1;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit init$lambda$2$lambda$1() {
        mStatus = Status.VISIBLE;
        return Unit.INSTANCE;
    }

    private final void clearPromiseQueue() {
        while (true) {
            RNBootSplashQueue<Promise> rNBootSplashQueue = mPromiseQueue;
            if (rNBootSplashQueue.isEmpty()) {
                return;
            }
            Promise shift = rNBootSplashQueue.shift();
            if (shift != null) {
                shift.resolve(true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void hideAndClearPromiseQueue(final ReactApplicationContext reactContext, final boolean fade, final boolean forced) {
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.zoontek.rnbootsplash.RNBootSplashModuleImpl$$ExternalSyntheticLambda12
            @Override // java.lang.Runnable
            public final void run() {
                RNBootSplashModuleImpl.hideAndClearPromiseQueue$lambda$6(ReactApplicationContext.this, forced, fade);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void hideAndClearPromiseQueue$lambda$6(final ReactApplicationContext reactApplicationContext, final boolean z, final boolean z2) {
        Activity currentActivity = reactApplicationContext.getCurrentActivity();
        if (mStatus == Status.INITIALIZING || currentActivity == null || currentActivity.isFinishing() || currentActivity.isDestroyed()) {
            final Timer timer = new Timer();
            timer.schedule(new TimerTask() { // from class: com.zoontek.rnbootsplash.RNBootSplashModuleImpl$hideAndClearPromiseQueue$1$1
                @Override // java.util.TimerTask, java.lang.Runnable
                public void run() {
                    timer.cancel();
                    RNBootSplashModuleImpl.INSTANCE.hideAndClearPromiseQueue(reactApplicationContext, z2, z);
                }
            }, 100L);
            return;
        }
        if (mStatus == Status.HIDING) {
            return;
        }
        if (mStatus == Status.HIDDEN) {
            INSTANCE.clearPromiseQueue();
            return;
        }
        if (!z) {
            RNBootSplashDialog rNBootSplashDialog = mInitialDialog;
            long remainingAnimationTimeMs = rNBootSplashDialog != null ? rNBootSplashDialog.remainingAnimationTimeMs() : 0L;
            if (remainingAnimationTimeMs > 0) {
                final Timer timer2 = new Timer();
                timer2.schedule(new TimerTask() { // from class: com.zoontek.rnbootsplash.RNBootSplashModuleImpl$hideAndClearPromiseQueue$1$2
                    @Override // java.util.TimerTask, java.lang.Runnable
                    public void run() {
                        timer2.cancel();
                        RNBootSplashModuleImpl.INSTANCE.hideAndClearPromiseQueue(reactApplicationContext, z2, z);
                    }
                }, remainingAnimationTimeMs);
                return;
            }
        }
        mStatus = Status.HIDING;
        Function0<Unit> function0 = new Function0() { // from class: com.zoontek.rnbootsplash.RNBootSplashModuleImpl$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit hideAndClearPromiseQueue$lambda$6$lambda$5;
                hideAndClearPromiseQueue$lambda$6$lambda$5 = RNBootSplashModuleImpl.hideAndClearPromiseQueue$lambda$6$lambda$5();
                return hideAndClearPromiseQueue$lambda$6$lambda$5;
            }
        };
        if (z2) {
            RNBootSplashDialog rNBootSplashDialog2 = mInitialDialog;
            RNBootSplashDialog rNBootSplashDialog3 = new RNBootSplashDialog(currentActivity, mThemeResId, true, rNBootSplashDialog2 != null ? rNBootSplashDialog2.captureCurrentFrame() : null);
            mFadeOutDialog = rNBootSplashDialog3;
            rNBootSplashDialog3.show(function0);
            return;
        }
        RNBootSplashDialog rNBootSplashDialog4 = mInitialDialog;
        if (rNBootSplashDialog4 != null) {
            rNBootSplashDialog4.dismiss(function0);
        } else {
            function0.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit hideAndClearPromiseQueue$lambda$6$lambda$5$lambda$3() {
        RNBootSplashModuleImpl rNBootSplashModuleImpl = INSTANCE;
        mFadeOutDialog = null;
        mStatus = Status.HIDDEN;
        rNBootSplashModuleImpl.clearPromiseQueue();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit hideAndClearPromiseQueue$lambda$6$lambda$5() {
        final Function0 function0 = new Function0() { // from class: com.zoontek.rnbootsplash.RNBootSplashModuleImpl$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit hideAndClearPromiseQueue$lambda$6$lambda$5$lambda$3;
                hideAndClearPromiseQueue$lambda$6$lambda$5$lambda$3 = RNBootSplashModuleImpl.hideAndClearPromiseQueue$lambda$6$lambda$5$lambda$3();
                return hideAndClearPromiseQueue$lambda$6$lambda$5$lambda$3;
            }
        };
        Function0<Unit> function02 = new Function0() { // from class: com.zoontek.rnbootsplash.RNBootSplashModuleImpl$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit hideAndClearPromiseQueue$lambda$6$lambda$5$lambda$4;
                hideAndClearPromiseQueue$lambda$6$lambda$5$lambda$4 = RNBootSplashModuleImpl.hideAndClearPromiseQueue$lambda$6$lambda$5$lambda$4(Function0.this);
                return hideAndClearPromiseQueue$lambda$6$lambda$5$lambda$4;
            }
        };
        RNBootSplashDialog rNBootSplashDialog = mInitialDialog;
        if (rNBootSplashDialog != null) {
            rNBootSplashDialog.dismiss(function02);
        } else {
            function02.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit hideAndClearPromiseQueue$lambda$6$lambda$5$lambda$4(Function0 function0) {
        mInitialDialog = null;
        RNBootSplashDialog rNBootSplashDialog = mFadeOutDialog;
        if (rNBootSplashDialog != null) {
            rNBootSplashDialog.dismiss(function0);
        } else {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    public final boolean isSamsungOneUI4() {
        Object m13470constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            RNBootSplashModuleImpl rNBootSplashModuleImpl = this;
            m13470constructorimpl = Result.m13470constructorimpl(Boolean.valueOf((Build.VERSION.class.getDeclaredField("SEM_PLATFORM_INT").getInt(null) - 90000) / 10000 == 4));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m13470constructorimpl = Result.m13470constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m13476isFailureimpl(m13470constructorimpl)) {
            m13470constructorimpl = false;
        }
        return ((Boolean) m13470constructorimpl).booleanValue();
    }

    public final void onHostDestroy$react_native_bootsplash_release() {
        mStatus = Status.HIDDEN;
        mThemeResId = -1;
        clearPromiseQueue();
        RNBootSplashDialog rNBootSplashDialog = mInitialDialog;
        if (rNBootSplashDialog != null) {
            rNBootSplashDialog.dismiss();
            mInitialDialog = null;
        }
        RNBootSplashDialog rNBootSplashDialog2 = mFadeOutDialog;
        if (rNBootSplashDialog2 != null) {
            rNBootSplashDialog2.dismiss();
            mFadeOutDialog = null;
        }
    }

    public final Map<String, Object> getConstants(ReactApplicationContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        Resources resources = reactContext.getResources();
        HashMap hashMap = new HashMap();
        int i = reactContext.getResources().getConfiguration().uiMode & 48;
        int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
        int identifier2 = resources.getIdentifier("navigation_bar_height", "dimen", "android");
        float f = 0.0f;
        float dIPFromPixel = identifier > 0 ? PixelUtil.toDIPFromPixel(resources.getDimensionPixelSize(identifier)) : 0.0f;
        if (identifier2 > 0 && !ViewConfiguration.get(reactContext).hasPermanentMenuKey()) {
            f = PixelUtil.toDIPFromPixel(resources.getDimensionPixelSize(identifier2));
        }
        HashMap hashMap2 = hashMap;
        hashMap2.put("darkModeEnabled", Boolean.valueOf(i == 32));
        hashMap2.put("logoSizeRatio", Double.valueOf(isSamsungOneUI4() ? 0.5d : 1.0d));
        hashMap2.put("navigationBarHeight", Float.valueOf(f));
        hashMap2.put("statusBarHeight", Float.valueOf(dIPFromPixel));
        return hashMap2;
    }

    public final void hide(ReactApplicationContext reactContext, boolean fade, boolean forced, Promise promise) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        Intrinsics.checkNotNullParameter(promise, "promise");
        mPromiseQueue.push(promise);
        hideAndClearPromiseQueue(reactContext, fade, forced);
    }

    public final void show(final ReactApplicationContext reactContext, boolean fade, final Promise promise) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        Intrinsics.checkNotNullParameter(promise, "promise");
        if (mThemeResId == -1) {
            promise.resolve(false);
        } else {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.zoontek.rnbootsplash.RNBootSplashModuleImpl$$ExternalSyntheticLambda6
                @Override // java.lang.Runnable
                public final void run() {
                    RNBootSplashModuleImpl.show$lambda$11(ReactApplicationContext.this, promise);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void show$lambda$11(ReactApplicationContext reactApplicationContext, final Promise promise) {
        Activity currentActivity = reactApplicationContext.getCurrentActivity();
        if (currentActivity == null || currentActivity.isFinishing() || currentActivity.isDestroyed()) {
            promise.resolve(false);
            return;
        }
        if (mStatus == Status.VISIBLE || mStatus == Status.INITIALIZING) {
            promise.resolve(true);
            return;
        }
        RNBootSplashDialog rNBootSplashDialog = new RNBootSplashDialog(currentActivity, mThemeResId, false, null, 8, null);
        mInitialDialog = rNBootSplashDialog;
        rNBootSplashDialog.show(new Function0() { // from class: com.zoontek.rnbootsplash.RNBootSplashModuleImpl$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit show$lambda$11$lambda$10;
                show$lambda$11$lambda$10 = RNBootSplashModuleImpl.show$lambda$11$lambda$10(Promise.this);
                return show$lambda$11$lambda$10;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit show$lambda$11$lambda$10(Promise promise) {
        mStatus = Status.VISIBLE;
        promise.resolve(true);
        return Unit.INSTANCE;
    }

    public final void isVisible(Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        promise.resolve(Boolean.valueOf(mStatus != Status.HIDDEN));
    }
}
