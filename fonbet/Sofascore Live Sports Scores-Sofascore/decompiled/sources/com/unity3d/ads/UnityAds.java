package com.unity3d.ads;

import android.app.Activity;
import android.content.Context;
import com.appsflyer.sdk_base.referrer.Payload;
import com.ironsource.C4259pg;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.core.domain.AndroidGetAdPlayerContext;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.services.ads.IUnityAds;
import com.unity3d.services.ads.UnityAdsImplementation;
import com.unity3d.services.core.di.ServiceKey;
import com.unity3d.services.core.di.ServiceProvider;
import com.unity3d.services.core.misc.Utilities;
import defpackage.bbk;
import defpackage.cbk;
import defpackage.duf;
import defpackage.gz8;
import defpackage.jp5;
import defpackage.kdc;
import defpackage.ku3;
import defpackage.p2g;
import defpackage.u2g;
import defpackage.w2g;
import defpackage.wx4;
import defpackage.xw3;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\bÆ\u0002\u0018\u00002\u00020\u0001:\u0004EFGHB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0007J&\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0007J$\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\rH\u0007J.\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\r2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0007J\u001c\u0010\u0017\u001a\u00020\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\tH\u0007J&\u0010\u0017\u001a\u00020\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0007J&\u0010\u0017\u001a\u00020\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\t2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0007J0\u0010\u0017\u001a\u00020\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\t2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0007J\u0012\u0010$\u001a\u00020\u00052\b\u0010\u001a\u001a\u0004\u0018\u00010\tH\u0007J\u001c\u0010$\u001a\u00020\u00052\b\u0010\u001a\u001a\u0004\u0018\u00010\t2\b\u0010%\u001a\u0004\u0018\u00010&H\u0007J&\u0010$\u001a\u00020\u00052\b\u0010\u001a\u001a\u0004\u0018\u00010\t2\b\u0010'\u001a\u0004\u0018\u00010(2\b\u0010%\u001a\u0004\u0018\u00010&H\u0007J\u0012\u0010+\u001a\u00020\u00052\b\u0010%\u001a\u0004\u0018\u00010,H\u0007J\u0018\u0010+\u001a\u00020\u00052\u0006\u0010-\u001a\u00020.2\u0006\u0010%\u001a\u00020,H\u0007J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010-\u001a\u00020/2\u0006\u0010%\u001a\u000200H\u0007R\u001a\u0010\u000e\u001a\u00020\r8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u000f\u0010\u0003\u001a\u0004\b\u000e\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\r8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0012\u0010\u0003\u001a\u0004\b\u0011\u0010\u0010R\u001a\u0010\u0013\u001a\u00020\t8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0014\u0010\u0003\u001a\u0004\b\u0015\u0010\u0016R*\u0010\u001f\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\r8F@FX\u0087\u000e¢\u0006\u0012\u0012\u0004\b \u0010\u0003\u001a\u0004\b!\u0010\u0010\"\u0004\b\"\u0010#R\u001c\u0010)\u001a\u0004\u0018\u00010\t8FX\u0087\u0004¢\u0006\f\u0012\u0004\b*\u0010\u0003\u001a\u0004\b+\u0010\u0016R&\u00101\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b2\u0010\u0003\u001a\u0004\b3\u0010\u0016\"\u0004\b4\u00105R(\u00106\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0016\n\u0002\u0010<\u0012\u0004\b7\u0010\u0003\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R(\u0010=\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0016\n\u0002\u0010<\u0012\u0004\b>\u0010\u0003\u001a\u0004\b?\u00109\"\u0004\b@\u0010;R(\u0010A\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0016\n\u0002\u0010<\u0012\u0004\bB\u0010\u0003\u001a\u0004\bC\u00109\"\u0004\bD\u0010;¨\u0006I"}, d2 = {"Lcom/unity3d/ads/UnityAds;", "", "<init>", "()V", "initialize", "", "context", "Landroid/content/Context;", AndroidGetAdPlayerContext.KEY_GAME_ID, "", "initializationListener", "Lcom/unity3d/ads/IUnityAdsInitializationListener;", "testMode", "", "isInitialized", "isInitialized$annotations", "()Z", "isSupported", "isSupported$annotations", "version", "getVersion$annotations", C4259pg.b, "()Ljava/lang/String;", "show", "activity", "Landroid/app/Activity;", "placementId", "showListener", "Lcom/unity3d/ads/IUnityAdsShowListener;", "options", "Lcom/unity3d/ads/UnityAdsShowOptions;", "debugMode", "getDebugMode$annotations", "getDebugMode", "setDebugMode", "(Z)V", "load", "listener", "Lcom/unity3d/ads/IUnityAdsLoadListener;", HandleInvocationsFromAdViewer.KEY_LOAD_OPTIONS, "Lcom/unity3d/ads/UnityAdsLoadOptions;", "token", "getToken$annotations", "getToken", "Lcom/unity3d/ads/IUnityAdsTokenListener;", "configuration", "Lcom/unity3d/ads/TokenConfiguration;", "Lcom/unity3d/ads/InitializationConfiguration;", "Lcom/unity3d/ads/InitializationListener;", "userIdentifier", "getUserIdentifier$annotations", "getUserIdentifier", "setUserIdentifier", "(Ljava/lang/String;)V", "userConsent", "getUserConsent$annotations", "getUserConsent", "()Ljava/lang/Boolean;", "setUserConsent", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "userOptOut", "getUserOptOut$annotations", "getUserOptOut", "setUserOptOut", "nonBehavioral", "getNonBehavioral$annotations", "getNonBehavioral", "setNonBehavioral", "UnityAdsShowCompletionState", "UnityAdsInitializationError", "UnityAdsLoadError", "UnityAdsShowError", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class UnityAds {

    @NotNull
    public static final UnityAds INSTANCE = new UnityAds();

    @Nullable
    private static Boolean nonBehavioral;

    @Nullable
    private static Boolean userConsent;

    @Nullable
    private static String userIdentifier;

    @Nullable
    private static Boolean userOptOut;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/unity3d/ads/UnityAds$UnityAdsInitializationError;", "", "<init>", "(Ljava/lang/String;I)V", "INTERNAL_ERROR", "INVALID_ARGUMENT", "AD_BLOCKER_DETECTED", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class UnityAdsInitializationError {
        private static final /* synthetic */ jp5 $ENTRIES;
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
            $ENTRIES = gz8.G($values);
        }

        private UnityAdsInitializationError(String str, int i) {
        }

        @NotNull
        public static jp5 getEntries() {
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
    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/unity3d/ads/UnityAds$UnityAdsLoadError;", "", "<init>", "(Ljava/lang/String;I)V", "INITIALIZE_FAILED", "INTERNAL_ERROR", "INVALID_ARGUMENT", "NO_FILL", Payload.RESPONSE_TIMEOUT, "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class UnityAdsLoadError {
        private static final /* synthetic */ jp5 $ENTRIES;
        private static final /* synthetic */ UnityAdsLoadError[] $VALUES;
        public static final UnityAdsLoadError INITIALIZE_FAILED = new UnityAdsLoadError("INITIALIZE_FAILED", 0);
        public static final UnityAdsLoadError INTERNAL_ERROR = new UnityAdsLoadError("INTERNAL_ERROR", 1);
        public static final UnityAdsLoadError INVALID_ARGUMENT = new UnityAdsLoadError("INVALID_ARGUMENT", 2);
        public static final UnityAdsLoadError NO_FILL = new UnityAdsLoadError("NO_FILL", 3);
        public static final UnityAdsLoadError TIMEOUT = new UnityAdsLoadError(Payload.RESPONSE_TIMEOUT, 4);

        private static final /* synthetic */ UnityAdsLoadError[] $values() {
            return new UnityAdsLoadError[]{INITIALIZE_FAILED, INTERNAL_ERROR, INVALID_ARGUMENT, NO_FILL, TIMEOUT};
        }

        static {
            UnityAdsLoadError[] $values = $values();
            $VALUES = $values;
            $ENTRIES = gz8.G($values);
        }

        private UnityAdsLoadError(String str, int i) {
        }

        @NotNull
        public static jp5 getEntries() {
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
    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/unity3d/ads/UnityAds$UnityAdsShowCompletionState;", "", "<init>", "(Ljava/lang/String;I)V", "SKIPPED", "COMPLETED", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class UnityAdsShowCompletionState {
        private static final /* synthetic */ jp5 $ENTRIES;
        private static final /* synthetic */ UnityAdsShowCompletionState[] $VALUES;
        public static final UnityAdsShowCompletionState SKIPPED = new UnityAdsShowCompletionState("SKIPPED", 0);
        public static final UnityAdsShowCompletionState COMPLETED = new UnityAdsShowCompletionState("COMPLETED", 1);

        private static final /* synthetic */ UnityAdsShowCompletionState[] $values() {
            return new UnityAdsShowCompletionState[]{SKIPPED, COMPLETED};
        }

        static {
            UnityAdsShowCompletionState[] $values = $values();
            $VALUES = $values;
            $ENTRIES = gz8.G($values);
        }

        private UnityAdsShowCompletionState(String str, int i) {
        }

        @NotNull
        public static jp5 getEntries() {
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
    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/unity3d/ads/UnityAds$UnityAdsShowError;", "", "<init>", "(Ljava/lang/String;I)V", "NOT_INITIALIZED", "NOT_READY", "VIDEO_PLAYER_ERROR", "INVALID_ARGUMENT", "NO_CONNECTION", "ALREADY_SHOWING", "INTERNAL_ERROR", Payload.RESPONSE_TIMEOUT, "EXPIRED", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class UnityAdsShowError {
        private static final /* synthetic */ jp5 $ENTRIES;
        private static final /* synthetic */ UnityAdsShowError[] $VALUES;
        public static final UnityAdsShowError NOT_INITIALIZED = new UnityAdsShowError("NOT_INITIALIZED", 0);
        public static final UnityAdsShowError NOT_READY = new UnityAdsShowError("NOT_READY", 1);
        public static final UnityAdsShowError VIDEO_PLAYER_ERROR = new UnityAdsShowError("VIDEO_PLAYER_ERROR", 2);
        public static final UnityAdsShowError INVALID_ARGUMENT = new UnityAdsShowError("INVALID_ARGUMENT", 3);
        public static final UnityAdsShowError NO_CONNECTION = new UnityAdsShowError("NO_CONNECTION", 4);
        public static final UnityAdsShowError ALREADY_SHOWING = new UnityAdsShowError("ALREADY_SHOWING", 5);
        public static final UnityAdsShowError INTERNAL_ERROR = new UnityAdsShowError("INTERNAL_ERROR", 6);
        public static final UnityAdsShowError TIMEOUT = new UnityAdsShowError(Payload.RESPONSE_TIMEOUT, 7);
        public static final UnityAdsShowError EXPIRED = new UnityAdsShowError("EXPIRED", 8);

        private static final /* synthetic */ UnityAdsShowError[] $values() {
            return new UnityAdsShowError[]{NOT_INITIALIZED, NOT_READY, VIDEO_PLAYER_ERROR, INVALID_ARGUMENT, NO_CONNECTION, ALREADY_SHOWING, INTERNAL_ERROR, TIMEOUT, EXPIRED};
        }

        static {
            UnityAdsShowError[] $values = $values();
            $VALUES = $values;
            $ENTRIES = gz8.G($values);
        }

        private UnityAdsShowError(String str, int i) {
        }

        @NotNull
        public static jp5 getEntries() {
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

    @Nullable
    public static final Boolean getNonBehavioral() {
        return nonBehavioral;
    }

    public static final void getToken(@NotNull TokenConfiguration configuration, @NotNull IUnityAdsTokenListener listener) {
        Object u2gVar;
        configuration.getClass();
        listener.getClass();
        try {
            p2g p2gVar = w2g.b;
            UnityAdsImplementation.getInstance().getToken(configuration, listener);
            u2gVar = Unit.a;
        } catch (Throwable th) {
            p2g p2gVar2 = w2g.b;
            u2gVar = new u2g(th);
        }
        if (w2g.a(u2gVar) != null) {
            Utilities.wrapCustomerListener(new bbk(listener, 1));
        }
    }

    @Nullable
    public static final Boolean getUserConsent() {
        return userConsent;
    }

    @Nullable
    public static final String getUserIdentifier() {
        return userIdentifier;
    }

    @Nullable
    public static final Boolean getUserOptOut() {
        return userOptOut;
    }

    @NotNull
    public static final String getVersion() {
        String version = UnityAdsImplementation.getInstance().getVersion();
        version.getClass();
        return version;
    }

    public static final void initialize(@NotNull InitializationConfiguration configuration, @NotNull InitializationListener listener) {
        configuration.getClass();
        listener.getClass();
        xw3.L((ku3) ServiceProvider.INSTANCE.getRegistry().resolveService(new ServiceKey(ServiceProvider.NAMED_INIT_SCOPE, duf.a.getOrCreateKotlinClass(ku3.class))), null, null, new UnityAds$initialize$7(configuration, listener, null), 3);
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

    @wx4
    public static final void load(@Nullable String placementId, @Nullable UnityAdsLoadOptions loadOptions, @Nullable IUnityAdsLoadListener listener) {
        Object u2gVar;
        try {
            p2g p2gVar = w2g.b;
            IUnityAds unityAdsImplementation = UnityAdsImplementation.getInstance();
            if (loadOptions == null) {
                loadOptions = new UnityAdsLoadOptions();
            }
            unityAdsImplementation.load(placementId, loadOptions, listener);
            u2gVar = Unit.a;
        } catch (Throwable th) {
            p2g p2gVar2 = w2g.b;
            u2gVar = new u2g(th);
        }
        Throwable a = w2g.a(u2gVar);
        if (a == null || listener == null) {
            return;
        }
        Utilities.wrapCustomerListener(new kdc(22, listener, placementId, a));
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
            p2g p2gVar = w2g.b;
            UnityAdsImplementation.getInstance().setDebugMode(z);
            Unit unit = Unit.a;
        } catch (Throwable unused) {
            p2g p2gVar2 = w2g.b;
        }
    }

    public static final void setNonBehavioral(@Nullable Boolean bool) {
        nonBehavioral = bool;
    }

    public static final void setUserConsent(@Nullable Boolean bool) {
        userConsent = bool;
    }

    public static final void setUserIdentifier(@Nullable String str) {
        userIdentifier = str;
    }

    public static final void setUserOptOut(@Nullable Boolean bool) {
        userOptOut = bool;
    }

    @wx4
    public static final void show(@Nullable Activity activity, @Nullable String placementId, @Nullable UnityAdsShowOptions options, @Nullable IUnityAdsShowListener showListener) {
        Object u2gVar;
        try {
            p2g p2gVar = w2g.b;
            UnityAdsImplementation.getInstance().show(activity, placementId, options, showListener);
            u2gVar = Unit.a;
        } catch (Throwable th) {
            p2g p2gVar2 = w2g.b;
            u2gVar = new u2g(th);
        }
        Throwable a = w2g.a(u2gVar);
        if (a == null || showListener == null) {
            return;
        }
        Utilities.wrapCustomerListener(new kdc(21, showListener, placementId, a));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void show$lambda$16$lambda$15$lambda$14(IUnityAdsShowListener iUnityAdsShowListener, String str, Throwable th) {
        if (str == null) {
            str = "unknown";
        }
        iUnityAdsShowListener.onUnityAdsShowFailure(str, UnityAdsShowError.INTERNAL_ERROR, "Unity Ads SDK show failed due to unexpected error: " + th.getMessage());
    }

    @wx4
    public static /* synthetic */ void getDebugMode$annotations() {
    }

    public static /* synthetic */ void getNonBehavioral$annotations() {
    }

    @wx4
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

    @wx4
    public static /* synthetic */ void isSupported$annotations() {
    }

    @wx4
    public static final void show(@Nullable Activity activity, @Nullable String placementId, @Nullable IUnityAdsShowListener showListener) {
        try {
            p2g p2gVar = w2g.b;
            UnityAdsImplementation.getInstance().show(activity, placementId, new UnityAdsShowOptions(), showListener);
            Unit unit = Unit.a;
        } catch (Throwable unused) {
            p2g p2gVar2 = w2g.b;
        }
    }

    @wx4
    public static final void getToken(@Nullable IUnityAdsTokenListener listener) {
        Object u2gVar;
        try {
            p2g p2gVar = w2g.b;
            UnityAdsImplementation.getInstance().getToken(listener);
            u2gVar = Unit.a;
        } catch (Throwable th) {
            p2g p2gVar2 = w2g.b;
            u2gVar = new u2g(th);
        }
        if (w2g.a(u2gVar) == null || listener == null) {
            return;
        }
        Utilities.wrapCustomerListener(new bbk(listener, 0));
    }

    @wx4
    public static final void initialize(@Nullable Context context, @Nullable String gameId, @Nullable IUnityAdsInitializationListener initializationListener) {
        Object u2gVar;
        try {
            p2g p2gVar = w2g.b;
            UnityAdsImplementation.getInstance().initialize(context, gameId, false, initializationListener);
            u2gVar = Unit.a;
        } catch (Throwable th) {
            p2g p2gVar2 = w2g.b;
            u2gVar = new u2g(th);
        }
        Throwable a = w2g.a(u2gVar);
        if (a == null || initializationListener == null) {
            return;
        }
        Utilities.wrapCustomerListener(new cbk(initializationListener, a, 1));
    }

    @wx4
    public static final void show(@Nullable Activity activity, @Nullable String placementId, @Nullable UnityAdsShowOptions options) {
        try {
            p2g p2gVar = w2g.b;
            UnityAdsImplementation.getInstance().show(activity, placementId, options, null);
            Unit unit = Unit.a;
        } catch (Throwable unused) {
            p2g p2gVar2 = w2g.b;
        }
    }

    @wx4
    public static final void show(@Nullable Activity activity, @Nullable String placementId) {
        try {
            p2g p2gVar = w2g.b;
            UnityAdsImplementation.getInstance().show(activity, placementId, new UnityAdsShowOptions(), null);
            Unit unit = Unit.a;
        } catch (Throwable unused) {
            p2g p2gVar2 = w2g.b;
        }
    }

    @wx4
    public static final void load(@Nullable String placementId, @Nullable IUnityAdsLoadListener listener) {
        load(placementId, new UnityAdsLoadOptions(), listener);
    }

    @Nullable
    public static final String getToken() {
        return UnityAdsImplementation.getInstance().getToken();
    }

    @wx4
    public static final void load(@Nullable String placementId) {
        try {
            p2g p2gVar = w2g.b;
            load(placementId, new IUnityAdsLoadListener() { // from class: com.unity3d.ads.UnityAds$load$1$1
                @Override // com.unity3d.ads.IUnityAdsLoadListener
                public void onUnityAdsAdLoaded(String placementId2) {
                    placementId2.getClass();
                }

                @Override // com.unity3d.ads.IUnityAdsLoadListener
                public void onUnityAdsFailedToLoad(String placementId2, UnityAds.UnityAdsLoadError error, String message) {
                    placementId2.getClass();
                    error.getClass();
                    message.getClass();
                }
            });
            Unit unit = Unit.a;
        } catch (Throwable unused) {
            p2g p2gVar2 = w2g.b;
        }
    }

    @wx4
    public static final void initialize(@Nullable Context context, @Nullable String gameId, boolean testMode) {
        try {
            p2g p2gVar = w2g.b;
            UnityAdsImplementation.getInstance().initialize(context, gameId, testMode, null);
            Unit unit = Unit.a;
        } catch (Throwable unused) {
            p2g p2gVar2 = w2g.b;
        }
    }

    @wx4
    public static final void initialize(@Nullable Context context, @Nullable String gameId, boolean testMode, @Nullable IUnityAdsInitializationListener initializationListener) {
        Object u2gVar;
        try {
            p2g p2gVar = w2g.b;
            UnityAdsImplementation.getInstance().initialize(context, gameId, testMode, initializationListener);
            u2gVar = Unit.a;
        } catch (Throwable th) {
            p2g p2gVar2 = w2g.b;
            u2gVar = new u2g(th);
        }
        Throwable a = w2g.a(u2gVar);
        if (a == null || initializationListener == null) {
            return;
        }
        Utilities.wrapCustomerListener(new cbk(initializationListener, a, 0));
    }

    @wx4
    public static final void initialize(@Nullable Context context, @Nullable String gameId) {
        try {
            p2g p2gVar = w2g.b;
            UnityAdsImplementation.getInstance().initialize(context, gameId, false, null);
            Unit unit = Unit.a;
        } catch (Throwable unused) {
            p2g p2gVar2 = w2g.b;
        }
    }
}
