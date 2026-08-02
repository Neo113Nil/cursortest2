package com.unity3d.ads;

import android.app.Activity;
import android.content.Context;
import com.unity3d.ads.UnityAds;
import com.unity3d.services.ads.IUnityAds;
import com.unity3d.services.ads.UnityAdsImplementation;
import com.unity3d.services.core.di.ServiceKey;
import com.unity3d.services.core.di.ServiceProvider;
import com.unity3d.services.core.misc.Utilities;
import kotlin.Result;
import xsna.asp;
import xsna.cy3;
import xsna.fpf0;
import xsna.jk9;
import xsna.l0g;
import xsna.myc0;
import xsna.ne9;
import xsna.ozl;
import xsna.q44;
import xsna.s3q0;
import xsna.uhw;
import xsna.yvj;
import xsna.zrp;

/* compiled from: UnityAds.kt */
/* loaded from: classes14.dex */
public final class UnityAds {
    public static final UnityAds INSTANCE = new UnityAds();
    private static Boolean nonBehavioral;
    private static Boolean userConsent;
    private static String userIdentifier;
    private static Boolean userOptOut;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: UnityAds.kt */
    public static final class UnityAdsInitializationError {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ UnityAdsInitializationError[] $VALUES;
        public static final UnityAdsInitializationError INTERNAL_ERROR = new UnityAdsInitializationError("INTERNAL_ERROR", 0);
        public static final UnityAdsInitializationError INVALID_ARGUMENT = new UnityAdsInitializationError("INVALID_ARGUMENT", 1);
        public static final UnityAdsInitializationError AD_BLOCKER_DETECTED = new UnityAdsInitializationError("AD_BLOCKER_DETECTED", 2);

        private static final /* synthetic */ UnityAdsInitializationError[] $values() {
            return new UnityAdsInitializationError[]{INTERNAL_ERROR, INVALID_ARGUMENT, AD_BLOCKER_DETECTED};
        }

        static {
            UnityAdsInitializationError[] $values = $values();
            $VALUES = $values;
            $ENTRIES = new asp($values);
        }

        private UnityAdsInitializationError(String str, int i) {
        }

        public static zrp<UnityAdsInitializationError> getEntries() {
            return $ENTRIES;
        }

        public static UnityAdsInitializationError valueOf(String str) {
            return (UnityAdsInitializationError) Enum.valueOf(UnityAdsInitializationError.class, str);
        }

        public static UnityAdsInitializationError[] values() {
            return (UnityAdsInitializationError[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: UnityAds.kt */
    public static final class UnityAdsLoadError {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ UnityAdsLoadError[] $VALUES;
        public static final UnityAdsLoadError INITIALIZE_FAILED = new UnityAdsLoadError("INITIALIZE_FAILED", 0);
        public static final UnityAdsLoadError INTERNAL_ERROR = new UnityAdsLoadError("INTERNAL_ERROR", 1);
        public static final UnityAdsLoadError INVALID_ARGUMENT = new UnityAdsLoadError("INVALID_ARGUMENT", 2);
        public static final UnityAdsLoadError NO_FILL = new UnityAdsLoadError("NO_FILL", 3);
        public static final UnityAdsLoadError TIMEOUT = new UnityAdsLoadError("TIMEOUT", 4);

        private static final /* synthetic */ UnityAdsLoadError[] $values() {
            return new UnityAdsLoadError[]{INITIALIZE_FAILED, INTERNAL_ERROR, INVALID_ARGUMENT, NO_FILL, TIMEOUT};
        }

        static {
            UnityAdsLoadError[] $values = $values();
            $VALUES = $values;
            $ENTRIES = new asp($values);
        }

        private UnityAdsLoadError(String str, int i) {
        }

        public static zrp<UnityAdsLoadError> getEntries() {
            return $ENTRIES;
        }

        public static UnityAdsLoadError valueOf(String str) {
            return (UnityAdsLoadError) Enum.valueOf(UnityAdsLoadError.class, str);
        }

        public static UnityAdsLoadError[] values() {
            return (UnityAdsLoadError[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: UnityAds.kt */
    public static final class UnityAdsShowCompletionState {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ UnityAdsShowCompletionState[] $VALUES;
        public static final UnityAdsShowCompletionState SKIPPED = new UnityAdsShowCompletionState("SKIPPED", 0);
        public static final UnityAdsShowCompletionState COMPLETED = new UnityAdsShowCompletionState("COMPLETED", 1);

        private static final /* synthetic */ UnityAdsShowCompletionState[] $values() {
            return new UnityAdsShowCompletionState[]{SKIPPED, COMPLETED};
        }

        static {
            UnityAdsShowCompletionState[] $values = $values();
            $VALUES = $values;
            $ENTRIES = new asp($values);
        }

        private UnityAdsShowCompletionState(String str, int i) {
        }

        public static zrp<UnityAdsShowCompletionState> getEntries() {
            return $ENTRIES;
        }

        public static UnityAdsShowCompletionState valueOf(String str) {
            return (UnityAdsShowCompletionState) Enum.valueOf(UnityAdsShowCompletionState.class, str);
        }

        public static UnityAdsShowCompletionState[] values() {
            return (UnityAdsShowCompletionState[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: UnityAds.kt */
    public static final class UnityAdsShowError {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ UnityAdsShowError[] $VALUES;
        public static final UnityAdsShowError NOT_INITIALIZED = new UnityAdsShowError("NOT_INITIALIZED", 0);
        public static final UnityAdsShowError NOT_READY = new UnityAdsShowError("NOT_READY", 1);
        public static final UnityAdsShowError VIDEO_PLAYER_ERROR = new UnityAdsShowError("VIDEO_PLAYER_ERROR", 2);
        public static final UnityAdsShowError INVALID_ARGUMENT = new UnityAdsShowError("INVALID_ARGUMENT", 3);
        public static final UnityAdsShowError NO_CONNECTION = new UnityAdsShowError("NO_CONNECTION", 4);
        public static final UnityAdsShowError ALREADY_SHOWING = new UnityAdsShowError("ALREADY_SHOWING", 5);
        public static final UnityAdsShowError INTERNAL_ERROR = new UnityAdsShowError("INTERNAL_ERROR", 6);
        public static final UnityAdsShowError TIMEOUT = new UnityAdsShowError("TIMEOUT", 7);
        public static final UnityAdsShowError EXPIRED = new UnityAdsShowError("EXPIRED", 8);

        private static final /* synthetic */ UnityAdsShowError[] $values() {
            return new UnityAdsShowError[]{NOT_INITIALIZED, NOT_READY, VIDEO_PLAYER_ERROR, INVALID_ARGUMENT, NO_CONNECTION, ALREADY_SHOWING, INTERNAL_ERROR, TIMEOUT, EXPIRED};
        }

        static {
            UnityAdsShowError[] $values = $values();
            $VALUES = $values;
            $ENTRIES = new asp($values);
        }

        private UnityAdsShowError(String str, int i) {
        }

        public static zrp<UnityAdsShowError> getEntries() {
            return $ENTRIES;
        }

        public static UnityAdsShowError valueOf(String str) {
            return (UnityAdsShowError) Enum.valueOf(UnityAdsShowError.class, str);
        }

        public static UnityAdsShowError[] values() {
            return (UnityAdsShowError[]) $VALUES.clone();
        }
    }

    private UnityAds() {
    }

    public static final boolean getDebugMode() {
        return UnityAdsImplementation.getInstance().getDebugMode();
    }

    public static final Boolean getNonBehavioral() {
        return nonBehavioral;
    }

    public static final String getToken() {
        return UnityAdsImplementation.getInstance().getToken();
    }

    public static final Boolean getUserConsent() {
        return userConsent;
    }

    public static final String getUserIdentifier() {
        return userIdentifier;
    }

    public static final Boolean getUserOptOut() {
        return userOptOut;
    }

    public static final String getVersion() {
        return UnityAdsImplementation.getInstance().getVersion();
    }

    @ozl
    public static final void initialize(Context context, String str) {
        try {
            UnityAdsImplementation.getInstance().initialize(context, str, false, null);
            s3q0 s3q0Var = s3q0.a;
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initialize$lambda$4$lambda$3$lambda$2(IUnityAdsInitializationListener iUnityAdsInitializationListener, Throwable th) {
        iUnityAdsInitializationListener.onInitializationFailed(UnityAdsInitializationError.INTERNAL_ERROR, "Unity Ads SDK initialization failed due to unexpected error: " + th.getMessage());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initialize$lambda$9$lambda$8$lambda$7(IUnityAdsInitializationListener iUnityAdsInitializationListener, Throwable th) {
        iUnityAdsInitializationListener.onInitializationFailed(UnityAdsInitializationError.INTERNAL_ERROR, "Unity Ads SDK initialization failed due to unexpected error: " + th.getMessage());
    }

    public static final boolean isInitialized() {
        return UnityAdsImplementation.getInstance().isInitialized();
    }

    public static final boolean isSupported() {
        return UnityAdsImplementation.getInstance().isSupported();
    }

    @ozl
    public static final void load(String str) {
        try {
            load(str, new IUnityAdsLoadListener() { // from class: com.unity3d.ads.UnityAds$load$1$1
                @Override // com.unity3d.ads.IUnityAdsLoadListener
                public void onUnityAdsAdLoaded(String str2) {
                }

                @Override // com.unity3d.ads.IUnityAdsLoadListener
                public void onUnityAdsFailedToLoad(String str2, UnityAds.UnityAdsLoadError unityAdsLoadError, String str3) {
                }
            });
            s3q0 s3q0Var = s3q0.a;
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void load$lambda$22$lambda$21$lambda$20(IUnityAdsLoadListener iUnityAdsLoadListener, String str, Throwable th) {
        if (str == null) {
            str = "unknown";
        }
        iUnityAdsLoadListener.onUnityAdsFailedToLoad(str, UnityAdsLoadError.INTERNAL_ERROR, "Unity Ads SDK load failed due to unexpected error: " + th.getMessage());
    }

    public static final void setDebugMode(boolean z) {
        try {
            UnityAdsImplementation.getInstance().setDebugMode(z);
            s3q0 s3q0Var = s3q0.a;
        } catch (Throwable unused) {
        }
    }

    public static final void setNonBehavioral(Boolean bool) {
        nonBehavioral = bool;
    }

    public static final void setUserConsent(Boolean bool) {
        userConsent = bool;
    }

    public static final void setUserIdentifier(String str) {
        userIdentifier = str;
    }

    public static final void setUserOptOut(Boolean bool) {
        userOptOut = bool;
    }

    @ozl
    public static final void show(Activity activity, String str) {
        try {
            UnityAdsImplementation.getInstance().show(activity, str, new UnityAdsShowOptions(), null);
            s3q0 s3q0Var = s3q0.a;
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void show$lambda$16$lambda$15$lambda$14(IUnityAdsShowListener iUnityAdsShowListener, String str, Throwable th) {
        if (str == null) {
            str = "unknown";
        }
        iUnityAdsShowListener.onUnityAdsShowFailure(str, UnityAdsShowError.INTERNAL_ERROR, "Unity Ads SDK show failed due to unexpected error: " + th.getMessage());
    }

    @ozl
    public static final void getToken(IUnityAdsTokenListener iUnityAdsTokenListener) {
        Object failure;
        try {
            UnityAdsImplementation.getInstance().getToken(iUnityAdsTokenListener);
            failure = s3q0.a;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (Result.a(failure) == null || iUnityAdsTokenListener == null) {
            return;
        }
        Utilities.wrapCustomerListener(new jk9(iUnityAdsTokenListener, 13));
    }

    @ozl
    public static final void initialize(Context context, String str, IUnityAdsInitializationListener iUnityAdsInitializationListener) {
        Object failure;
        try {
            UnityAdsImplementation.getInstance().initialize(context, str, false, iUnityAdsInitializationListener);
            failure = s3q0.a;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a = Result.a(failure);
        if (a == null || iUnityAdsInitializationListener == null) {
            return;
        }
        Utilities.wrapCustomerListener(new cy3(10, iUnityAdsInitializationListener, a));
    }

    @ozl
    public static final void load(String str, IUnityAdsLoadListener iUnityAdsLoadListener) {
        load(str, new UnityAdsLoadOptions(), iUnityAdsLoadListener);
    }

    @ozl
    public static final void show(Activity activity, String str, IUnityAdsShowListener iUnityAdsShowListener) {
        try {
            UnityAdsImplementation.getInstance().show(activity, str, new UnityAdsShowOptions(), iUnityAdsShowListener);
            s3q0 s3q0Var = s3q0.a;
        } catch (Throwable unused) {
        }
    }

    @ozl
    public static final void load(String str, UnityAdsLoadOptions unityAdsLoadOptions, IUnityAdsLoadListener iUnityAdsLoadListener) {
        Object failure;
        try {
            IUnityAds unityAdsImplementation = UnityAdsImplementation.getInstance();
            if (unityAdsLoadOptions == null) {
                unityAdsLoadOptions = new UnityAdsLoadOptions();
            }
            unityAdsImplementation.load(str, unityAdsLoadOptions, iUnityAdsLoadListener);
            failure = s3q0.a;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a = Result.a(failure);
        if (a == null || iUnityAdsLoadListener == null) {
            return;
        }
        Utilities.wrapCustomerListener(new uhw(iUnityAdsLoadListener, str, a, 1));
    }

    @ozl
    public static final void show(Activity activity, String str, UnityAdsShowOptions unityAdsShowOptions) {
        try {
            UnityAdsImplementation.getInstance().show(activity, str, unityAdsShowOptions, null);
            s3q0 s3q0Var = s3q0.a;
        } catch (Throwable unused) {
        }
    }

    public static final void getToken(TokenConfiguration tokenConfiguration, IUnityAdsTokenListener iUnityAdsTokenListener) {
        Object failure;
        try {
            UnityAdsImplementation.getInstance().getToken(tokenConfiguration, iUnityAdsTokenListener);
            failure = s3q0.a;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (Result.a(failure) != null) {
            Utilities.wrapCustomerListener(new q44(iUnityAdsTokenListener, 11));
        }
    }

    @ozl
    public static final void show(Activity activity, String str, UnityAdsShowOptions unityAdsShowOptions, IUnityAdsShowListener iUnityAdsShowListener) {
        Object failure;
        try {
            UnityAdsImplementation.getInstance().show(activity, str, unityAdsShowOptions, iUnityAdsShowListener);
            failure = s3q0.a;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a = Result.a(failure);
        if (a == null || iUnityAdsShowListener == null) {
            return;
        }
        Utilities.wrapCustomerListener(new l0g(iUnityAdsShowListener, str, a, 4));
    }

    @ozl
    public static final void initialize(Context context, String str, boolean z) {
        try {
            UnityAdsImplementation.getInstance().initialize(context, str, z, null);
            s3q0 s3q0Var = s3q0.a;
        } catch (Throwable unused) {
        }
    }

    @ozl
    public static final void initialize(Context context, String str, boolean z, IUnityAdsInitializationListener iUnityAdsInitializationListener) {
        Object failure;
        try {
            UnityAdsImplementation.getInstance().initialize(context, str, z, iUnityAdsInitializationListener);
            failure = s3q0.a;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a = Result.a(failure);
        if (a == null || iUnityAdsInitializationListener == null) {
            return;
        }
        Utilities.wrapCustomerListener(new ne9(6, iUnityAdsInitializationListener, a));
    }

    public static final void initialize(InitializationConfiguration initializationConfiguration, InitializationListener initializationListener) {
        myc0.h((yvj) ServiceProvider.INSTANCE.getRegistry().resolveService(new ServiceKey(ServiceProvider.NAMED_INIT_SCOPE, fpf0.a(yvj.class))), null, null, new UnityAds$initialize$7(initializationConfiguration, initializationListener, null), 3);
    }

    @ozl
    public static /* synthetic */ void getDebugMode$annotations() {
    }

    public static /* synthetic */ void getNonBehavioral$annotations() {
    }

    @ozl
    public static /* synthetic */ void getToken$annotations() {
    }

    public static /* synthetic */ void getUserConsent$annotations() {
    }

    public static /* synthetic */ void getUserIdentifier$annotations() {
    }

    public static /* synthetic */ void getUserOptOut$annotations() {
    }

    public static /* synthetic */ void getVersion$annotations() {
    }

    public static /* synthetic */ void isInitialized$annotations() {
    }

    @ozl
    public static /* synthetic */ void isSupported$annotations() {
    }
}
