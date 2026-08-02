package com.inmobi.media;

import com.iab.omid.library.inmobi.adsession.AdEvents;
import com.iab.omid.library.inmobi.adsession.AdSession;
import com.iab.omid.library.inmobi.adsession.ErrorType;
import com.iab.omid.library.inmobi.adsession.media.MediaEvents;
import com.iab.omid.library.inmobi.adsession.media.Position;
import com.iab.omid.library.inmobi.adsession.media.VastProperties;
import com.unity3d.services.UnityAdsConstants;
import defpackage.ku3;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public abstract class C2 extends AbstractC3406f1 {
    public static final /* synthetic */ int h = 0;
    public final String g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2(ku3 ku3Var, InterfaceC3880x9 interfaceC3880x9) {
        super(ku3Var, interfaceC3880x9);
        ku3Var.getClass();
        this.g = "C2";
    }

    public final void a(float f, boolean z) {
        AdEvents adEvents = this.e;
        InterfaceC3880x9 interfaceC3880x9 = this.b;
        if (adEvents == null) {
            if (interfaceC3880x9 != null) {
                String str = this.g;
                str.getClass();
                ((C3906y9) interfaceC3880x9).a(str, "Failed to register videoAdLoaded. adEvent is null");
                return;
            }
            return;
        }
        if (interfaceC3880x9 != null) {
            String str2 = this.g;
            str2.getClass();
            ((C3906y9) interfaceC3880x9).a(str2, "skippableVideoAdLoaded - skipOffset: " + f + ", isAutoPlay: " + z);
        }
        try {
            X4.a(this.a, new A2(this, VastProperties.createVastPropertiesForSkippableMedia(f, z, Position.STANDALONE), null));
        } catch (Exception e) {
            this.g.getClass();
            e.getStackTrace();
        }
    }

    public final void b(AbstractC3712qm abstractC3712qm) {
        MediaEvents mediaEvents;
        InterfaceC3880x9 interfaceC3880x9 = this.b;
        if (interfaceC3880x9 != null) {
            String str = this.g;
            str.getClass();
            ((C3906y9) interfaceC3880x9).a(str, "fireAdVideoEvent - received video event: " + abstractC3712qm);
        }
        if (abstractC3712qm instanceof C3686pm) {
            AdSession adSession = this.c;
            if (adSession != null) {
                adSession.error(ErrorType.VIDEO, "UnKnown Media Error");
                return;
            }
            return;
        }
        if (abstractC3712qm instanceof C3635nn) {
            MediaEvents mediaEvents2 = this.d;
            if (mediaEvents2 != null) {
                mediaEvents2.pause();
                return;
            }
            return;
        }
        if (abstractC3712qm instanceof Gn) {
            MediaEvents mediaEvents3 = this.d;
            if (mediaEvents3 != null) {
                mediaEvents3.resume();
                return;
            }
            return;
        }
        if (abstractC3712qm instanceof Wm) {
            MediaEvents mediaEvents4 = this.d;
            if (mediaEvents4 != null) {
                mediaEvents4.firstQuartile();
                return;
            }
            return;
        }
        if (abstractC3712qm instanceof Hn) {
            MediaEvents mediaEvents5 = this.d;
            if (mediaEvents5 != null) {
                mediaEvents5.midpoint();
                return;
            }
            return;
        }
        if (abstractC3712qm instanceof Qn) {
            MediaEvents mediaEvents6 = this.d;
            if (mediaEvents6 != null) {
                mediaEvents6.thirdQuartile();
                return;
            }
            return;
        }
        if (abstractC3712qm instanceof C3660om) {
            MediaEvents mediaEvents7 = this.d;
            if (mediaEvents7 != null) {
                mediaEvents7.complete();
                return;
            }
            return;
        }
        if (abstractC3712qm instanceof Jn) {
            MediaEvents mediaEvents8 = this.d;
            if (mediaEvents8 != null) {
                mediaEvents8.start(((Jn) abstractC3712qm).a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                return;
            }
            return;
        }
        if (abstractC3712qm instanceof W1) {
            MediaEvents mediaEvents9 = this.d;
            if (mediaEvents9 != null) {
                mediaEvents9.volumeChange(((W1) abstractC3712qm).b);
                return;
            }
            return;
        }
        if (!(abstractC3712qm instanceof In) || (mediaEvents = this.d) == null) {
            return;
        }
        mediaEvents.skipped();
    }

    @Override // com.inmobi.media.AbstractC3406f1
    public final void a(boolean z) {
        if (this.e == null) {
            this.g.getClass();
            return;
        }
        InterfaceC3880x9 interfaceC3880x9 = this.b;
        if (interfaceC3880x9 != null) {
            String str = this.g;
            str.getClass();
            ((C3906y9) interfaceC3880x9).a(str, "nonSkippableVideoAdLoaded - isAutoPlay: " + z);
        }
        try {
            X4.a(this.a, new C3925z2(this, VastProperties.createVastPropertiesForNonSkippableMedia(z, Position.STANDALONE), null));
        } catch (Exception e) {
            this.g.getClass();
            e.getStackTrace();
        }
    }

    @Override // com.inmobi.media.AbstractC3406f1, com.inmobi.media.InterfaceC3530jm
    public final void a(AbstractC3712qm abstractC3712qm) {
        abstractC3712qm.getClass();
        if (abstractC3712qm instanceof C3868wn) {
            return;
        }
        InterfaceC3880x9 interfaceC3880x9 = this.b;
        if (interfaceC3880x9 != null) {
            String str = this.g;
            str.getClass();
            ((C3906y9) interfaceC3880x9).a(str, "trackAdVideoEvent - videoEvent: " + abstractC3712qm);
        }
        if (this.d == null) {
            this.g.getClass();
        } else {
            X4.a(this.a, new B2(this, abstractC3712qm, null));
        }
    }
}
