package com.inmobi.media;

import android.content.Context;
import com.inmobi.media.Ie;
import com.inmobi.media.ads.network.common.model.LandingPageParam;
import com.inmobi.media.ads.network.common.model.MetaInfo;
import com.inmobi.media.ads.network.inmobiJson.model.CTA;
import com.inmobi.media.ads.network.inmobiJson.model.Description;
import com.inmobi.media.ads.network.inmobiJson.model.Icon;
import com.inmobi.media.ads.network.inmobiJson.model.Image;
import com.inmobi.media.ads.network.inmobiJson.model.InMobiJsonResponse;
import com.inmobi.media.ads.network.inmobiJson.model.JsonAssetObject;
import com.inmobi.media.ads.network.inmobiJson.model.Link;
import com.inmobi.media.ads.network.inmobiJson.model.NativeImage;
import com.inmobi.media.ads.network.inmobiJson.model.NativeMedia;
import com.inmobi.media.ads.network.inmobiJson.model.NativeVideo;
import com.inmobi.media.ads.network.inmobiJson.model.Title;
import com.inmobi.media.core.config.models.AdConfig;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import defpackage.f1d;
import defpackage.joa;
import defpackage.km5;
import defpackage.ku3;
import defpackage.ypa;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Ie extends AbstractC3896y {
    public final Ni b;
    public final C3525jh c;
    public final L4 d;
    public final AbstractC3406f1 e;
    public final C3289ad f;
    public final Rc g;
    public final ku3 h;
    public final joa i;
    public final joa j;
    public final joa k;
    public final joa l;
    public final joa m;
    public final joa n;
    public final joa o;
    public final joa p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ie(Ni ni, C3525jh c3525jh, L4 l4, AbstractC3406f1 abstractC3406f1, C3289ad c3289ad, Rc rc) {
        super(rc.a);
        ni.getClass();
        c3525jh.getClass();
        l4.getClass();
        abstractC3406f1.getClass();
        c3289ad.getClass();
        rc.getClass();
        this.b = ni;
        this.c = c3525jh;
        this.d = l4;
        this.e = abstractC3406f1;
        this.f = c3289ad;
        this.g = rc;
        this.h = X4.a(k());
        final int i = 0;
        this.i = ypa.b(new Function0(this) { // from class: cr9
            public final /* synthetic */ Ie b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                Ie ie = this.b;
                switch (i2) {
                    case 0:
                        return Ie.g(ie);
                    case 1:
                        return Ie.c(ie);
                    case 2:
                        return Ie.e(ie);
                    case 3:
                        return Ie.h(ie);
                    case 4:
                        return Ie.b(ie);
                    case 5:
                        return Ie.a(ie);
                    case 6:
                        return Ie.f(ie);
                    default:
                        return Ie.d(ie);
                }
            }
        });
        final int i2 = 1;
        this.j = ypa.b(new Function0(this) { // from class: cr9
            public final /* synthetic */ Ie b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                Ie ie = this.b;
                switch (i22) {
                    case 0:
                        return Ie.g(ie);
                    case 1:
                        return Ie.c(ie);
                    case 2:
                        return Ie.e(ie);
                    case 3:
                        return Ie.h(ie);
                    case 4:
                        return Ie.b(ie);
                    case 5:
                        return Ie.a(ie);
                    case 6:
                        return Ie.f(ie);
                    default:
                        return Ie.d(ie);
                }
            }
        });
        final int i3 = 2;
        this.k = ypa.b(new Function0(this) { // from class: cr9
            public final /* synthetic */ Ie b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                Ie ie = this.b;
                switch (i22) {
                    case 0:
                        return Ie.g(ie);
                    case 1:
                        return Ie.c(ie);
                    case 2:
                        return Ie.e(ie);
                    case 3:
                        return Ie.h(ie);
                    case 4:
                        return Ie.b(ie);
                    case 5:
                        return Ie.a(ie);
                    case 6:
                        return Ie.f(ie);
                    default:
                        return Ie.d(ie);
                }
            }
        });
        final int i4 = 3;
        this.l = ypa.b(new Function0(this) { // from class: cr9
            public final /* synthetic */ Ie b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i4;
                Ie ie = this.b;
                switch (i22) {
                    case 0:
                        return Ie.g(ie);
                    case 1:
                        return Ie.c(ie);
                    case 2:
                        return Ie.e(ie);
                    case 3:
                        return Ie.h(ie);
                    case 4:
                        return Ie.b(ie);
                    case 5:
                        return Ie.a(ie);
                    case 6:
                        return Ie.f(ie);
                    default:
                        return Ie.d(ie);
                }
            }
        });
        final int i5 = 4;
        this.m = ypa.b(new Function0(this) { // from class: cr9
            public final /* synthetic */ Ie b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                Ie ie = this.b;
                switch (i22) {
                    case 0:
                        return Ie.g(ie);
                    case 1:
                        return Ie.c(ie);
                    case 2:
                        return Ie.e(ie);
                    case 3:
                        return Ie.h(ie);
                    case 4:
                        return Ie.b(ie);
                    case 5:
                        return Ie.a(ie);
                    case 6:
                        return Ie.f(ie);
                    default:
                        return Ie.d(ie);
                }
            }
        });
        final int i6 = 5;
        this.n = ypa.b(new Function0(this) { // from class: cr9
            public final /* synthetic */ Ie b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i6;
                Ie ie = this.b;
                switch (i22) {
                    case 0:
                        return Ie.g(ie);
                    case 1:
                        return Ie.c(ie);
                    case 2:
                        return Ie.e(ie);
                    case 3:
                        return Ie.h(ie);
                    case 4:
                        return Ie.b(ie);
                    case 5:
                        return Ie.a(ie);
                    case 6:
                        return Ie.f(ie);
                    default:
                        return Ie.d(ie);
                }
            }
        });
        final int i7 = 6;
        this.o = ypa.b(new Function0(this) { // from class: cr9
            public final /* synthetic */ Ie b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i7;
                Ie ie = this.b;
                switch (i22) {
                    case 0:
                        return Ie.g(ie);
                    case 1:
                        return Ie.c(ie);
                    case 2:
                        return Ie.e(ie);
                    case 3:
                        return Ie.h(ie);
                    case 4:
                        return Ie.b(ie);
                    case 5:
                        return Ie.a(ie);
                    case 6:
                        return Ie.f(ie);
                    default:
                        return Ie.d(ie);
                }
            }
        });
        final int i8 = 7;
        this.p = ypa.b(new Function0(this) { // from class: cr9
            public final /* synthetic */ Ie b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i8;
                Ie ie = this.b;
                switch (i22) {
                    case 0:
                        return Ie.g(ie);
                    case 1:
                        return Ie.c(ie);
                    case 2:
                        return Ie.e(ie);
                    case 3:
                        return Ie.h(ie);
                    case 4:
                        return Ie.b(ie);
                    case 5:
                        return Ie.a(ie);
                    case 6:
                        return Ie.f(ie);
                    default:
                        return Ie.d(ie);
                }
            }
        });
    }

    public static final Ii a(Ie ie) {
        return new Ii(ie.d, ie.e, ie.g);
    }

    public static final C3418fd b(Ie ie) {
        Rc rc = ie.g;
        AbstractC3406f1 abstractC3406f1 = ie.e;
        L4 l4 = ie.d;
        C3289ad c3289ad = ie.f;
        C3858wd c3858wd = (C3858wd) ie.p.getValue();
        InterfaceC3880x9 l = ie.l();
        rc.getClass();
        abstractC3406f1.getClass();
        l4.getClass();
        c3289ad.getClass();
        c3858wd.getClass();
        rc.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        JsonAssetObject assetsObject = rc.b.getAssetsObject();
        if (assetsObject != null) {
            Title title = assetsObject.getTitle();
            if (title != null) {
                Link link = title.getLink();
                linkedHashMap.put((short) 3, new Xc(link != null ? link.getUrl() : null, title.getTrackers()));
            }
            Description description = assetsObject.getDescription();
            if (description != null) {
                Link link2 = description.getLink();
                linkedHashMap.put((short) 4, new Xc(link2 != null ? link2.getUrl() : null, description.getTrackers()));
            }
            Icon icon = assetsObject.getIcon();
            if (icon != null) {
                Link link3 = icon.getLink();
                linkedHashMap.put((short) 5, new Xc(link3 != null ? link3.getUrl() : null, icon.getTrackers()));
            }
            CTA cta = assetsObject.getCta();
            if (cta != null) {
                Link link4 = cta.getLink();
                linkedHashMap.put((short) 6, new Xc(link4 != null ? link4.getUrl() : null, cta.getTrackers()));
            }
            Image adChoice = assetsObject.getAdChoice();
            if (adChoice != null) {
                Link link5 = adChoice.getLink();
                linkedHashMap.put((short) 7, new Xc(link5 != null ? link5.getUrl() : null, adChoice.getTrackers()));
            } else {
                linkedHashMap.put((short) 7, new Xc(rc.a.b.a.b.getNative().getAdChoiceConfig().getLink(), km5.a));
            }
        }
        return new C3418fd(c3858wd, abstractC3406f1, l4, c3289ad, new C3392ed(rc.e, new Si(linkedHashMap, rc.b.getMainLink(), rc.a.b.g)), l);
    }

    public static final C3754sd c(Ie ie) {
        ku3 ku3Var = ie.h;
        Tn tn = (Tn) ie.i.getValue();
        Rc rc = ie.g;
        rc.getClass();
        AdConfig.NativeViewabilityConfig viewabilityConfig = rc.a.b.a.b.getNative().getViewabilityConfig();
        F f = rc.a.b.m;
        Wn wn = new Wn(viewabilityConfig.getImpressionConfig().getPollInterval(), f.d, Gl.a(viewabilityConfig.getParentMinDimension().getDimensions()), f.c);
        f1d f1dVar = ((Xo) ie.l.getValue()).b;
        ie.l();
        return new C3754sd(ku3Var, tn, wn, f1dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
    
        if (r4.getSupportLockScreen() == true) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final C3858wd d(Ie ie) {
        boolean z;
        String str;
        String str2;
        List<LandingPageParam> landingPageParams;
        LandingPageParam landingPageParam;
        List<LandingPageParam> landingPageParams2;
        Context context = ie.g.a.a.b;
        G g = ie.a.b;
        MetaInfo metaInfo = g.d;
        if (metaInfo != null && (landingPageParams2 = metaInfo.getLandingPageParams()) != null && (r4 = (LandingPageParam) CollectionsKt.a0(0, landingPageParams2)) != null) {
            z = true;
        }
        z = false;
        G g2 = ie.a.b;
        C3293ah c3293ah = g2.a.a;
        long j = c3293ah.a;
        String str3 = g2.m.b;
        String str4 = c3293ah.h;
        String str5 = g2.c;
        MetaInfo metaInfo2 = g2.d;
        if (metaInfo2 == null || (str = metaInfo2.getCreativeType()) == null) {
            str = "unknown";
        }
        String str6 = str;
        String str7 = ie.g.a.b.i;
        if (str7 == null) {
            str7 = "";
        }
        String str8 = str7;
        G g3 = ie.a.b;
        boolean z2 = g3.b.a;
        MetaInfo metaInfo3 = g3.d;
        if (metaInfo3 == null || (landingPageParams = metaInfo3.getLandingPageParams()) == null || (landingPageParam = (LandingPageParam) CollectionsKt.a0(0, landingPageParams)) == null || (str2 = landingPageParam.getOpenMode()) == null) {
            str2 = "DEFAULT";
        }
        return new C3858wd(new C3884xd(context, g, z, new C3597mb(j, str3, str4, IronSourceConstants.EVENTS_NATIVE, str5, str6, str8, z2, str2), (Qc) ie.g.f.getValue(), ie.g.c, ie.l()));
    }

    public static final Sd e(Ie ie) {
        AbstractC3495ic s5;
        NativeMedia media;
        NativeVideo video;
        ku3 ku3Var = ie.h;
        Rc rc = ie.g;
        Tn tn = (Tn) ie.i.getValue();
        rc.getClass();
        tn.getClass();
        E e = rc.a.b.n;
        InMobiJsonResponse inMobiJsonResponse = rc.b;
        inMobiJsonResponse.getClass();
        JsonAssetObject assetsObject = inMobiJsonResponse.getAssetsObject();
        if ((assetsObject == null || (media = assetsObject.getMedia()) == null || (video = media.getVideo()) == null) ? false : video.getRequired()) {
            s5 = new C3609mn(((C3909yc) rc.g.getValue()).e, e.a);
        } else {
            AdConfig.NativeViewabilityConfig viewabilityConfig = rc.a.b.a.b.getNative().getViewabilityConfig();
            s5 = new S5(tn, new Wn(viewabilityConfig.getImpressionConfig().getPollInterval(), e.b, Gl.a(viewabilityConfig.getParentMinDimension().getDimensions()), e.a));
        }
        return new Sd(ku3Var, s5, ((Xo) ie.l.getValue()).b);
    }

    public static final C3577lh f(Ie ie) {
        ie.getClass();
        return new C3577lh();
    }

    public static final Tn g(Ie ie) {
        NativeMedia media;
        NativeImage image;
        Icon icon;
        NativeMedia media2;
        NativeVideo video;
        NativeMedia media3;
        NativeMedia media4;
        Rc rc = ie.g;
        C3525jh c3525jh = ie.c;
        rc.getClass();
        c3525jh.getClass();
        AdConfig.NativeConfig nativeConfig = rc.a.b.a.b.getNative();
        JsonAssetObject assetsObject = rc.b.getAssetsObject();
        Boolean bool = null;
        String type = (assetsObject == null || (media4 = assetsObject.getMedia()) == null) ? null : media4.getType();
        InMobiJsonResponse inMobiJsonResponse = rc.b;
        inMobiJsonResponse.getClass();
        JsonAssetObject assetsObject2 = inMobiJsonResponse.getAssetsObject();
        if (Intrinsics.c((assetsObject2 == null || (media3 = assetsObject2.getMedia()) == null) ? null : media3.getType(), "video")) {
            JsonAssetObject assetsObject3 = inMobiJsonResponse.getAssetsObject();
            if (assetsObject3 != null && (media2 = assetsObject3.getMedia()) != null && (video = media2.getVideo()) != null) {
                bool = Boolean.valueOf(video.getRequired());
            }
        } else {
            JsonAssetObject assetsObject4 = inMobiJsonResponse.getAssetsObject();
            if (assetsObject4 != null && (media = assetsObject4.getMedia()) != null && (image = media.getImage()) != null) {
                bool = Boolean.valueOf(image.getRequired());
            }
        }
        boolean z = false;
        boolean booleanValue = bool != null ? bool.booleanValue() : false;
        if (Intrinsics.c(type, "video")) {
            if (!booleanValue) {
                z = true;
            }
        } else if (assetsObject != null && (icon = assetsObject.getIcon()) != null) {
            z = icon.getRequired();
        }
        return new Tn(z, booleanValue, Gl.a(nativeConfig.getViewabilityConfig().getIconMinDimension().getDimensions()), Gl.a(nativeConfig.getViewabilityConfig().getMediaMinDimension().getDimensions()), c3525jh);
    }

    public static final Xo h(Ie ie) {
        return new Xo(ie.a.b.a.b.getViewability().getWindowPollingInterval(), ie.h, ie.c.a.getParentView(), ie.l());
    }
}
