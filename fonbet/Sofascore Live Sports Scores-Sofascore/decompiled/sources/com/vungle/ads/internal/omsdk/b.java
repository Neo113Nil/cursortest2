package com.vungle.ads.internal.omsdk;

import android.util.Base64;
import android.view.View;
import com.iab.omid.library.vungle.adsession.AdEvents;
import com.iab.omid.library.vungle.adsession.AdSession;
import com.iab.omid.library.vungle.adsession.AdSessionConfiguration;
import com.iab.omid.library.vungle.adsession.AdSessionContext;
import com.iab.omid.library.vungle.adsession.CreativeType;
import com.iab.omid.library.vungle.adsession.ImpressionType;
import com.iab.omid.library.vungle.adsession.Owner;
import com.iab.omid.library.vungle.adsession.Partner;
import com.iab.omid.library.vungle.adsession.VerificationScriptResource;
import com.iab.omid.library.vungle.adsession.media.InteractionType;
import com.iab.omid.library.vungle.adsession.media.MediaEvents;
import com.iab.omid.library.vungle.adsession.media.Position;
import com.iab.omid.library.vungle.adsession.media.VastProperties;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.BuildConfig;
import com.vungle.ads.internal.model.f3;
import com.vungle.ads.internal.util.t;
import com.vungle.ads.internal.util.u;
import defpackage.bga;
import defpackage.cga;
import defpackage.duf;
import defpackage.p2g;
import defpackage.sha;
import defpackage.u2g;
import defpackage.w2g;
import java.net.URL;
import kotlin.Unit;
import kotlin.text.Charsets;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class b {
    public final boolean a;
    public AdSession b;
    public AdEvents c;
    public MediaEvents d;

    public b(String str, String str2, boolean z) {
        Object u2gVar;
        str.getClass();
        str2.getClass();
        this.a = z;
        bga c = cga.c(a.a);
        try {
            p2g p2gVar = w2g.b;
            AdSessionConfiguration a = z ? a(CreativeType.VIDEO) : a(CreativeType.NATIVE_DISPLAY);
            Partner createPartner = Partner.createPartner(BuildConfig.OMSDK_PARTNER_NAME, BuildConfig.VERSION_NAME);
            byte[] decode = Base64.decode(str, 0);
            f3 f3Var = decode != null ? (f3) c.b(sha.Q(c.b, duf.b(f3.class)), new String(decode, Charsets.UTF_8)) : null;
            if ((f3Var != null ? f3Var.c() : null) == null) {
                boolean z2 = u.a;
                t.b("NativeAd-OMTracker", "Invalid OMSDK data: missing vendorURL");
            } else {
                VerificationScriptResource createVerificationScriptResourceWithParameters = VerificationScriptResource.createVerificationScriptResourceWithParameters(f3Var.b(), new URL(f3Var.c()), f3Var.a());
                createVerificationScriptResourceWithParameters.getClass();
                this.b = AdSession.createAdSession(a, AdSessionContext.createNativeAdSessionContext(createPartner, str2, kotlin.collections.a.c(createVerificationScriptResourceWithParameters), null, null));
            }
            u2gVar = Unit.a;
        } catch (Throwable th) {
            p2g p2gVar2 = w2g.b;
            u2gVar = new u2g(th);
        }
        Throwable a2 = w2g.a(u2gVar);
        if (a2 != null) {
            boolean z3 = u.a;
            t.a("NativeAd-OMTracker", "error occured when create omsdk adSession:", a2);
        }
    }

    public final void a(View view) {
        Object u2gVar;
        view.getClass();
        boolean z = u.a;
        t.a("NativeAd-OMTracker", "start OM tracker");
        try {
            p2g p2gVar = w2g.b;
            AdSession adSession = this.b;
            if (adSession != null) {
                this.c = AdEvents.createAdEvents(adSession);
                if (this.a) {
                    this.d = MediaEvents.createMediaEvents(adSession);
                }
                adSession.registerAdView(view);
                adSession.start();
                if (this.a) {
                    VastProperties createVastPropertiesForNonSkippableMedia = VastProperties.createVastPropertiesForNonSkippableMedia(false, Position.STANDALONE);
                    AdEvents adEvents = this.c;
                    if (adEvents != null) {
                        adEvents.loaded(createVastPropertiesForNonSkippableMedia);
                    }
                } else {
                    AdEvents adEvents2 = this.c;
                    if (adEvents2 != null) {
                        adEvents2.loaded();
                    }
                }
                u2gVar = Integer.valueOf(t.a("NativeAd-OMTracker", "track event: loaded"));
            } else {
                u2gVar = null;
            }
        } catch (Throwable th) {
            p2g p2gVar2 = w2g.b;
            u2gVar = new u2g(th);
        }
        Throwable a = w2g.a(u2gVar);
        if (a != null) {
            boolean z2 = u.a;
            t.a("NativeAd-OMTracker", "error occured when start omsdk adSession:", a);
        }
    }

    public final void b() {
        boolean z = u.a;
        t.a("NativeAd-OMTracker", "track event: onStateCompleted");
        try {
            p2g p2gVar = w2g.b;
            MediaEvents mediaEvents = this.d;
            if (mediaEvents != null) {
                mediaEvents.complete();
                Unit unit = Unit.a;
            }
        } catch (Throwable unused) {
            p2g p2gVar2 = w2g.b;
        }
    }

    public final void c() {
        boolean z = u.a;
        t.a("NativeAd-OMTracker", "track event: onStatePaused");
        try {
            p2g p2gVar = w2g.b;
            MediaEvents mediaEvents = this.d;
            if (mediaEvents != null) {
                mediaEvents.pause();
                Unit unit = Unit.a;
            }
        } catch (Throwable unused) {
            p2g p2gVar2 = w2g.b;
        }
    }

    public final void d() {
        boolean z = u.a;
        t.a("NativeAd-OMTracker", "track event: onStatePlay");
        try {
            p2g p2gVar = w2g.b;
            MediaEvents mediaEvents = this.d;
            if (mediaEvents != null) {
                mediaEvents.resume();
                Unit unit = Unit.a;
            }
        } catch (Throwable unused) {
            p2g p2gVar2 = w2g.b;
        }
    }

    public final void e() {
        boolean z = u.a;
        t.a("NativeAd-OMTracker", "track event: onUserInteraction");
        try {
            p2g p2gVar = w2g.b;
            MediaEvents mediaEvents = this.d;
            if (mediaEvents != null) {
                mediaEvents.adUserInteraction(InteractionType.CLICK);
                Unit unit = Unit.a;
            }
        } catch (Throwable unused) {
            p2g p2gVar2 = w2g.b;
        }
    }

    public final void a(float f, float f2) {
        boolean z = u.a;
        t.a("NativeAd-OMTracker", "track event: onQuartileStart duration=" + f + " volume=" + f2);
        try {
            p2g p2gVar = w2g.b;
            MediaEvents mediaEvents = this.d;
            if (mediaEvents != null) {
                mediaEvents.start(f, f2);
                Unit unit = Unit.a;
            }
        } catch (Throwable unused) {
            p2g p2gVar2 = w2g.b;
        }
    }

    public final void a(int i) {
        boolean z = u.a;
        t.a("NativeAd-OMTracker", "track event: onQuartileChanged quartile=" + i);
        if (i == 5) {
            try {
                p2g p2gVar = w2g.b;
                MediaEvents mediaEvents = this.d;
                if (mediaEvents != null) {
                    mediaEvents.firstQuartile();
                    Unit unit = Unit.a;
                    return;
                }
                return;
            } catch (Throwable unused) {
                p2g p2gVar2 = w2g.b;
                return;
            }
        }
        if (i == 6) {
            try {
                p2g p2gVar3 = w2g.b;
                MediaEvents mediaEvents2 = this.d;
                if (mediaEvents2 != null) {
                    mediaEvents2.midpoint();
                    Unit unit2 = Unit.a;
                    return;
                }
                return;
            } catch (Throwable unused2) {
                p2g p2gVar4 = w2g.b;
                return;
            }
        }
        if (i != 7) {
            return;
        }
        try {
            p2g p2gVar5 = w2g.b;
            MediaEvents mediaEvents3 = this.d;
            if (mediaEvents3 != null) {
                mediaEvents3.thirdQuartile();
                Unit unit3 = Unit.a;
            }
        } catch (Throwable unused3) {
            p2g p2gVar6 = w2g.b;
        }
    }

    public final void a(boolean z) {
        boolean z2 = u.a;
        t.a("NativeAd-OMTracker", "track event: onMuteChanged muted=" + z);
        if (z) {
            try {
                p2g p2gVar = w2g.b;
                MediaEvents mediaEvents = this.d;
                if (mediaEvents != null) {
                    mediaEvents.volumeChange(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    Unit unit = Unit.a;
                    return;
                }
                return;
            } catch (Throwable unused) {
                p2g p2gVar2 = w2g.b;
                return;
            }
        }
        try {
            p2g p2gVar3 = w2g.b;
            MediaEvents mediaEvents2 = this.d;
            if (mediaEvents2 != null) {
                mediaEvents2.volumeChange(1.0f);
                Unit unit2 = Unit.a;
            }
        } catch (Throwable unused2) {
            p2g p2gVar4 = w2g.b;
        }
    }

    public final void a() {
        boolean z = u.a;
        t.a("NativeAd-OMTracker", "track event: impressionOccurred");
        try {
            p2g p2gVar = w2g.b;
            AdEvents adEvents = this.c;
            if (adEvents != null) {
                adEvents.impressionOccurred();
                Unit unit = Unit.a;
            }
        } catch (Throwable unused) {
            p2g p2gVar2 = w2g.b;
        }
    }

    public static AdSessionConfiguration a(CreativeType creativeType) {
        ImpressionType impressionType = ImpressionType.BEGIN_TO_RENDER;
        Owner owner = Owner.NATIVE;
        AdSessionConfiguration createAdSessionConfiguration = AdSessionConfiguration.createAdSessionConfiguration(creativeType, impressionType, owner, creativeType == CreativeType.NATIVE_DISPLAY ? Owner.NONE : owner, false);
        createAdSessionConfiguration.getClass();
        return createAdSessionConfiguration;
    }
}
