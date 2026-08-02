package com.unity3d.ads.adplayer;

import com.unity3d.ads.adplayer.model.LoadEvent;
import com.unity3d.ads.core.data.model.OfferwallShowEvent;
import com.unity3d.ads.core.data.model.ShowEvent;
import com.unity3d.services.ads.offerwall.OfferwallEvent;
import java.util.Map;
import kotlin.NotImplementedError;
import xsna.ksr;
import xsna.lyd;
import xsna.s3q0;
import xsna.sh50;
import xsna.spj;
import xsna.yvj;
import xsna.zvj;

/* compiled from: AdPlayer.kt */
/* loaded from: classes14.dex */
public interface AdPlayer {
    public static final String AD_REFRESH_EVENT = "AD_REFRESH";
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final int OFFERWALL_EVENT_QUEUE_SIZE = 5;

    /* compiled from: AdPlayer.kt */
    public static final class Companion {
        public static final String AD_REFRESH_EVENT = "AD_REFRESH";
        public static final int OFFERWALL_EVENT_QUEUE_SIZE = 5;
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final sh50<String> broadcastEventChannel = lyd.b(0, 0, null, 7);

        private Companion() {
        }

        public final sh50<String> getBroadcastEventChannel() {
            return broadcastEventChannel;
        }
    }

    /* compiled from: AdPlayer.kt */
    public static final class DefaultImpls {
        public static Object destroy(AdPlayer adPlayer, spj<? super s3q0> spjVar) {
            zvj.c(adPlayer.getScope(), null);
            return s3q0.a;
        }

        public static void show(AdPlayer adPlayer, ShowOptions showOptions) {
            throw new NotImplementedError();
        }
    }

    Object destroy(spj<? super s3q0> spjVar);

    void dispatchShowCompleted();

    ksr<LoadEvent> getOnLoadEvent();

    ksr<OfferwallShowEvent> getOnOfferwallEvent();

    ksr<ShowEvent> getOnShowEvent();

    yvj getScope();

    WebViewContainer getWebViewContainer();

    Object onAllowedPiiChange(byte[] bArr, spj<? super s3q0> spjVar);

    Object onBroadcastEvent(String str, spj<? super s3q0> spjVar);

    Object requestShow(Map<String, ? extends Object> map, spj<? super s3q0> spjVar);

    Object sendActivityDestroyed(spj<? super s3q0> spjVar);

    Object sendFocusChange(boolean z, spj<? super s3q0> spjVar);

    Object sendMuteChange(boolean z, spj<? super s3q0> spjVar);

    Object sendOfferwallEvent(OfferwallEvent offerwallEvent, spj<? super s3q0> spjVar);

    Object sendPrivacyFsmChange(byte[] bArr, spj<? super s3q0> spjVar);

    Object sendUserConsentChange(byte[] bArr, spj<? super s3q0> spjVar);

    Object sendVisibilityChange(boolean z, spj<? super s3q0> spjVar);

    Object sendVolumeChange(double d, spj<? super s3q0> spjVar);

    void show(ShowOptions showOptions);
}
