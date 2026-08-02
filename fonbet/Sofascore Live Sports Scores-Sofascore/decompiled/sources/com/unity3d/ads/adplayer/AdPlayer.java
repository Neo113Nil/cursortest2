package com.unity3d.ads.adplayer;

import com.ironsource.C4018c8;
import com.ironsource.U3;
import com.unity3d.services.ads.offerwall.OfferwallEvent;
import defpackage.b1d;
import defpackage.beh;
import defpackage.ku3;
import defpackage.ped;
import defpackage.rq3;
import defpackage.s9a;
import defpackage.z88;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 <2\u00020\u0001:\u0001<J(\u0010\u0006\u001a\u00020\u00052\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0002H¦@¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H&¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0005H\u0097@¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0010H¦@¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0010H¦@¢\u0006\u0004\b\u0015\u0010\u0013J\u0018\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0010H¦@¢\u0006\u0004\b\u0017\u0010\u0013J\u0010\u0010\u0018\u001a\u00020\u0005H¦@¢\u0006\u0004\b\u0018\u0010\u000fJ\u0018\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u0019H¦@¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u001f\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u001dH¦@¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010!\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u001dH¦@¢\u0006\u0004\b!\u0010 J\u0018\u0010\"\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u001dH¦@¢\u0006\u0004\b\"\u0010 J\u0018\u0010$\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\u0003H¦@¢\u0006\u0004\b$\u0010%J\u0018\u0010'\u001a\u00020\u00052\u0006\u0010#\u001a\u00020&H¦@¢\u0006\u0004\b'\u0010(R\u0014\u0010,\u001a\u00020)8&X¦\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0014\u00100\u001a\u00020-8&X¦\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/R\u001a\u00105\u001a\b\u0012\u0004\u0012\u000202018&X¦\u0004¢\u0006\u0006\u001a\u0004\b3\u00104R\u001a\u00108\u001a\b\u0012\u0004\u0012\u000206018&X¦\u0004¢\u0006\u0006\u001a\u0004\b7\u00104R\u001a\u0010;\u001a\b\u0012\u0004\u0012\u000209018&X¦\u0004¢\u0006\u0006\u001a\u0004\b:\u00104¨\u0006="}, d2 = {"Lcom/unity3d/ads/adplayer/AdPlayer;", "", "", "", "unityAdsShowOptions", "", "requestShow", "(Ljava/util/Map;Lrq3;)Ljava/lang/Object;", "dispatchShowCompleted", "()V", "Lcom/unity3d/ads/adplayer/ShowOptions;", "showOptions", "show", "(Lcom/unity3d/ads/adplayer/ShowOptions;)V", "destroy", "(Lrq3;)Ljava/lang/Object;", "", "isMuted", "sendMuteChange", "(ZLrq3;)Ljava/lang/Object;", C4018c8.k, "sendVisibilityChange", "isFocused", "sendFocusChange", "sendActivityDestroyed", "", "volume", "sendVolumeChange", "(DLrq3;)Ljava/lang/Object;", "", U3.i.X, "sendUserConsentChange", "([BLrq3;)Ljava/lang/Object;", "sendPrivacyFsmChange", "onAllowedPiiChange", "event", "onBroadcastEvent", "(Ljava/lang/String;Lrq3;)Ljava/lang/Object;", "Lcom/unity3d/services/ads/offerwall/OfferwallEvent;", "sendOfferwallEvent", "(Lcom/unity3d/services/ads/offerwall/OfferwallEvent;Lrq3;)Ljava/lang/Object;", "Lku3;", "getScope", "()Lku3;", "scope", "Lcom/unity3d/ads/adplayer/WebViewContainer;", "getWebViewContainer", "()Lcom/unity3d/ads/adplayer/WebViewContainer;", "webViewContainer", "Lz88;", "Lcom/unity3d/ads/core/data/model/ShowEvent;", "getOnShowEvent", "()Lz88;", "onShowEvent", "Lcom/unity3d/ads/core/data/model/OfferwallShowEvent;", "getOnOfferwallEvent", "onOfferwallEvent", "Lcom/unity3d/ads/adplayer/model/LoadEvent;", "getOnLoadEvent", "onLoadEvent", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface AdPlayer {

    @NotNull
    public static final String AD_REFRESH_EVENT = "AD_REFRESH";

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;
    public static final int OFFERWALL_EVENT_QUEUE_SIZE = 5;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/unity3d/ads/adplayer/AdPlayer$Companion;", "", "<init>", "()V", "Lb1d;", "", "broadcastEventChannel", "Lb1d;", "getBroadcastEventChannel", "()Lb1d;", "", "OFFERWALL_EVENT_QUEUE_SIZE", "I", "AD_REFRESH_EVENT", "Ljava/lang/String;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {

        @NotNull
        public static final String AD_REFRESH_EVENT = "AD_REFRESH";
        public static final int OFFERWALL_EVENT_QUEUE_SIZE = 5;
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        private static final b1d broadcastEventChannel = beh.b(0, 0, null, 7);

        private Companion() {
        }

        @NotNull
        public final b1d getBroadcastEventChannel() {
            return broadcastEventChannel;
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        @Nullable
        public static Object destroy(@NotNull AdPlayer adPlayer, @NotNull rq3<? super Unit> rq3Var) {
            s9a.o(adPlayer.getScope(), null);
            return Unit.a;
        }

        public static void show(@NotNull AdPlayer adPlayer, @NotNull ShowOptions showOptions) {
            showOptions.getClass();
            throw new ped(null, 1, null);
        }
    }

    @Nullable
    Object destroy(@NotNull rq3<? super Unit> rq3Var);

    void dispatchShowCompleted();

    @NotNull
    z88 getOnLoadEvent();

    @NotNull
    z88 getOnOfferwallEvent();

    @NotNull
    z88 getOnShowEvent();

    @NotNull
    ku3 getScope();

    @NotNull
    WebViewContainer getWebViewContainer();

    @Nullable
    Object onAllowedPiiChange(@NotNull byte[] bArr, @NotNull rq3<? super Unit> rq3Var);

    @Nullable
    Object onBroadcastEvent(@NotNull String str, @NotNull rq3<? super Unit> rq3Var);

    @Nullable
    Object requestShow(@Nullable Map<String, ? extends Object> map, @NotNull rq3<? super Unit> rq3Var);

    @Nullable
    Object sendActivityDestroyed(@NotNull rq3<? super Unit> rq3Var);

    @Nullable
    Object sendFocusChange(boolean z, @NotNull rq3<? super Unit> rq3Var);

    @Nullable
    Object sendMuteChange(boolean z, @NotNull rq3<? super Unit> rq3Var);

    @Nullable
    Object sendOfferwallEvent(@NotNull OfferwallEvent offerwallEvent, @NotNull rq3<? super Unit> rq3Var);

    @Nullable
    Object sendPrivacyFsmChange(@NotNull byte[] bArr, @NotNull rq3<? super Unit> rq3Var);

    @Nullable
    Object sendUserConsentChange(@NotNull byte[] bArr, @NotNull rq3<? super Unit> rq3Var);

    @Nullable
    Object sendVisibilityChange(boolean z, @NotNull rq3<? super Unit> rq3Var);

    @Nullable
    Object sendVolumeChange(double d, @NotNull rq3<? super Unit> rq3Var);

    void show(@NotNull ShowOptions showOptions);
}
