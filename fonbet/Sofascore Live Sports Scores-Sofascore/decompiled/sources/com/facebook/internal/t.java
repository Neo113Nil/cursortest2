package com.facebook.internal;

import android.content.Context;
import android.webkit.ValueCallback;
import com.facebook.internal.t;
import com.ironsource.L6;
import com.ironsource.Ua;
import com.moloco.sdk.acm.d;
import com.moloco.sdk.acm.eventprocessing.DBRequestWorker;
import com.moloco.sdk.acm.recorder.c;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.publisher.a1;
import com.moloco.sdk.internal.publisher.x0;
import com.moloco.sdk.publisher.AdFormatType;
import com.moloco.sdk.publisher.AdShowListener;
import com.moloco.sdk.publisher.BannerAdShowListener;
import com.moloco.sdk.publisher.MolocoAd;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.f;
import defpackage.a70;
import defpackage.ad2;
import defpackage.b10;
import defpackage.bf3;
import defpackage.c40;
import defpackage.d11;
import defpackage.ddi;
import defpackage.dmi;
import defpackage.fdi;
import defpackage.fdl;
import defpackage.gdi;
import defpackage.hpo;
import defpackage.hq4;
import defpackage.hs4;
import defpackage.jbd;
import defpackage.jof;
import defpackage.ktd;
import defpackage.ltd;
import defpackage.lu3;
import defpackage.md4;
import defpackage.mz1;
import defpackage.nad;
import defpackage.rq3;
import defpackage.sq3;
import defpackage.tub;
import defpackage.un0;
import defpackage.v98;
import defpackage.weh;
import defpackage.xbl;
import defpackage.xw3;
import defpackage.y6a;
import defpackage.ypa;
import defpackage.z45;
import defpackage.zm3;
import defpackage.zy0;
import defpackage.zzl;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class t implements com.moloco.sdk.internal.publisher.a, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.g {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public t(BannerAdShowListener bannerAdShowListener, com.moloco.sdk.internal.services.r rVar, com.moloco.sdk.internal.services.events.c cVar, com.moloco.sdk.internal.publisher.j0 j0Var, com.moloco.sdk.internal.publisher.j0 j0Var2, AdFormatType adFormatType, com.moloco.sdk.acm.recorder.c cVar2, com.moloco.sdk.internal.publisher.j0 j0Var3) {
        this.a = 8;
        rVar.getClass();
        cVar.getClass();
        adFormatType.getClass();
        cVar2.getClass();
        this.b = com.facebook.appevents.j.d(bannerAdShowListener, rVar, cVar, j0Var, j0Var2, adFormatType, cVar2, j0Var3, 608);
        this.c = bannerAdShowListener;
    }

    @Override // com.moloco.sdk.internal.publisher.a, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g
    public void a() {
        switch (this.a) {
            case 2:
                jbd jbdVar = jbd.a;
                md4 md4Var = null;
                zm3 zm3Var = new zm3(new nad(null), jbd.b, false, false, false, false, -1L, -1L, CollectionsKt.W0(new LinkedHashSet()));
                com.moloco.sdk.acm.j jVar = (com.moloco.sdk.acm.j) this.b;
                Pair pair = new Pair("url", jVar.b);
                Map map = jVar.d;
                Map h = tub.h(pair, new Pair("AppKey", map.get("AppKey")), new Pair("AppBundle", map.get("AppBundle")), new Pair("AppVersion", map.get("AppVersion")), new Pair("OS", map.get("OS")), new Pair(L6.G, map.get(L6.G)), new Pair("SdkVersion", map.get("SdkVersion")), new Pair("Mediator", map.get("Mediator")));
                try {
                    ArrayList arrayList = new ArrayList(h.size());
                    for (Map.Entry entry : h.entrySet()) {
                        arrayList.add(new Pair(entry.getKey(), entry.getValue()));
                    }
                    Pair[] pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
                    Pair[] pairArr2 = (Pair[]) Arrays.copyOf(pairArr, pairArr.length);
                    hpo hpoVar = new hpo(18);
                    for (Pair pair2 : pairArr2) {
                        hpoVar.B(pair2.b, (String) pair2.a);
                    }
                    md4Var = hpoVar.l();
                } catch (Exception e) {
                    e.getMessage();
                    Objects.toString(h);
                }
                if (md4Var != null) {
                    ktd ktdVar = new ktd(DBRequestWorker.class);
                    ktdVar.c.j = zm3Var;
                    ltd ltdVar = (ltd) ((ktd) ((ktd) ktdVar.f(md4Var)).d(zy0.a, Ua.s, TimeUnit.MILLISECONDS)).a();
                    Context context = (Context) this.c;
                    context.getClass();
                    xbl d = xbl.d(context);
                    d.getClass();
                    d.a(ltdVar);
                    break;
                }
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            default:
                MolocoLogger.info$default(MolocoLogger.INSTANCE, "WebviewAd", "Ad load successful, start collecting playlist item displaying events", null, false, 12, null);
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.b bVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.b) this.b;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.f fVar = bVar.d;
                c40 c40Var = bVar.c;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.a aVar = bVar.a;
                fVar.getClass();
                c40Var.getClass();
                xw3.L(fVar.d, null, null, new fdl(fVar, c40Var, aVar, null, 13), 3);
                ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g) this.c).a();
                break;
            case 8:
                ((com.moloco.sdk.internal.publisher.b) this.b).a();
                break;
            case 9:
                ((com.moloco.sdk.internal.publisher.b) this.b).a();
                break;
            case 10:
                MolocoLogger.info$default(MolocoLogger.INSTANCE, "TemplateFullscreenAd", "Skip button shown, triggering listener callback", null, false, 12, null);
                a1 a1Var = (a1) this.b;
                MolocoLogger.info$default(MolocoLogger.INSTANCE, "FullscreenAdImpl", "Template ad skip button shown, triggering reward callback", null, false, 12, null);
                com.moloco.sdk.acm.services.d dVar = a1Var.a.t;
                if (dVar != null) {
                    dVar.invoke();
                }
                com.moloco.sdk.internal.publisher.a aVar2 = a1Var.b;
                if (aVar2 != null) {
                    aVar2.a();
                    break;
                }
                break;
            case 11:
                ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g) this.b).a();
                break;
            case 12:
                ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g) this.b).a();
                break;
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g
    public void b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a aVar) {
        switch (this.a) {
            case 11:
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g gVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g) this.b;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.b0 b0Var = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.b0) this.c;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m creativeType = b0Var.getCreativeType();
                switch (creativeType != null ? com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.x.a[creativeType.ordinal()] : -1) {
                    case -1:
                        MolocoLogger.error$default(MolocoLogger.INSTANCE, b0Var.p, "creativeType is null", new Throwable(), false, 8, null);
                        break;
                    case 0:
                    default:
                        zzl.b();
                        break;
                    case 1:
                        gVar.b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a.g);
                        break;
                    case 2:
                        gVar.b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a.h);
                        break;
                    case 3:
                        gVar.b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a.i);
                        break;
                    case 4:
                    case 5:
                    case 6:
                        MolocoLogger.error$default(MolocoLogger.INSTANCE, b0Var.p, "Template creative types should not be used with AggregatedBanner. Use TemplateBannerView instead.", null, false, 12, null);
                        break;
                    case 7:
                        MolocoLogger.error$default(MolocoLogger.INSTANCE, b0Var.p, "Unknown creative type for timeout error", null, false, 12, null);
                        break;
                }
            case 12:
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g gVar2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g) this.b;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m mVar = ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.g0) this.c).g;
                switch (mVar != null ? com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.d0.a[mVar.ordinal()] : -1) {
                    case -1:
                        MolocoLogger.error$default(MolocoLogger.INSTANCE, "AggregatedFullscreenAd", "creativeType is null", null, false, 12, null);
                        break;
                    case 0:
                    default:
                        zzl.b();
                        break;
                    case 1:
                        gVar2.b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a.d);
                        break;
                    case 2:
                        gVar2.b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a.e);
                        break;
                    case 3:
                        gVar2.b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a.f);
                        break;
                    case 4:
                    case 5:
                    case 6:
                        MolocoLogger.error$default(MolocoLogger.INSTANCE, "AggregatedFullscreenAd", "Template creative types should not be used with AggregatedFullscreenAd. Use TemplateFullscreenAd instead.", null, false, 12, null);
                        break;
                    case 7:
                        MolocoLogger.error$default(MolocoLogger.INSTANCE, "AggregatedFullscreenAd", "Failed to resolve creative type for the ad. Please check the ad markup and ensure it follows the expected format.", null, false, 12, null);
                        break;
                }
            default:
                ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g) this.c).b(aVar);
                break;
        }
    }

    @Override // com.moloco.sdk.internal.publisher.a
    public void c(MolocoAd molocoAd, String str) {
        switch (this.a) {
            case 8:
                molocoAd.getClass();
                ((com.moloco.sdk.internal.publisher.b) this.b).c(molocoAd, str);
                break;
            default:
                molocoAd.getClass();
                ((com.moloco.sdk.internal.publisher.b) this.b).c(molocoAd, str);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00df A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00e0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /* JADX WARN: Type inference failed for: r9v5, types: [com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.m0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object d(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.m0 m0Var, String str, sq3 sq3Var) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.q0 q0Var;
        int i;
        String str2;
        Object R;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.h hVar;
        t tVar = this;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.m0 m0Var2 = m0Var;
        String str3 = str;
        if (sq3Var instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.q0) {
            q0Var = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.q0) sq3Var;
            int i2 = q0Var.x;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                q0Var.x = i2 - Integer.MIN_VALUE;
                Object obj = q0Var.v;
                lu3 lu3Var = lu3.a;
                i = q0Var.x;
                rq3 rq3Var = null;
                if (i != 0) {
                    y6a.M(obj);
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.n0 n0Var = m0Var2.h;
                    if (n0Var == null || (str2 = n0Var.b) == null) {
                        ((com.moloco.sdk.internal.error.b) tVar.c).a("DEC_LOADED_WITH_NO_APP_ICON", str3 != null ? new com.moloco.sdk.internal.error.a(str3) : new com.moloco.sdk.internal.error.a("UNKNOWN_MTID"));
                        MolocoLogger.debug$default(MolocoLogger.INSTANCE, "DECLoaderImpl", "can't precache DEC: appIconUri is null", false, 4, null);
                        return m0Var2;
                    }
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.j jVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.j) tVar.b;
                    q0Var.r = tVar;
                    q0Var.s = m0Var2;
                    q0Var.t = str3;
                    q0Var.u = str2;
                    q0Var.x = 1;
                    hs4 hs4Var = z45.a;
                    R = xw3.R(hq4.c, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.i(str2, jVar, rq3Var, 0), q0Var);
                    if (R == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    String str4 = q0Var.u;
                    String str5 = q0Var.t;
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.m0 m0Var3 = q0Var.s;
                    t tVar2 = q0Var.r;
                    y6a.M(obj);
                    str2 = str4;
                    tVar = tVar2;
                    R = obj;
                    str3 = str5;
                    m0Var2 = m0Var3;
                }
                hVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.h) R;
                if (hVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.g) {
                    ((com.moloco.sdk.internal.error.b) tVar.c).a("DEC_FAILED_TO_LOAD", str3 != null ? new com.moloco.sdk.internal.error.a(str3) : new com.moloco.sdk.internal.error.a("UNKNOWN_MTID"));
                    StringBuilder sb = new StringBuilder("dec loading error: ");
                    sb.append(hVar);
                    MolocoLogger.debug$default(MolocoLogger.INSTANCE, "DECLoaderImpl", mz1.o(sb, ": `Not found` for ", str2), false, 4, null);
                } else {
                    rq3Var = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.m0(m0Var2.a, m0Var2.b, m0Var2.c, m0Var2.d, m0Var2.e, m0Var2.f, m0Var2.g, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.n0(m0Var2.h.a, ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.g) hVar).a.getAbsolutePath(), m0Var2.h.c), m0Var2.i);
                }
                return rq3Var != null ? m0Var2 : rq3Var;
            }
        }
        q0Var = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.q0(tVar, sq3Var);
        Object obj2 = q0Var.v;
        lu3 lu3Var2 = lu3.a;
        i = q0Var.x;
        rq3 rq3Var2 = null;
        if (i != 0) {
        }
        hVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.h) R;
        if (hVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.g) {
        }
        if (rq3Var2 != null) {
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.g
    public ddi l() {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.x xVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.x) ((fdi) this.b).getValue();
        if (xVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.t) {
            return (jof) ((b10) ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.t) xVar).a.i).d;
        }
        if (xVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.u) {
            return (jof) ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.u) xVar).a.d.d;
        }
        if (xVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.v) {
            return (fdi) ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.v) xVar).a.C.f;
        }
        if (xVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.w) {
            return (jof) ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.w) xVar).a.e.d;
        }
        if (xVar == null) {
            return (fdi) this.c;
        }
        zzl.b();
        return null;
    }

    @Override // com.moloco.sdk.internal.publisher.a
    public void onAdClicked(MolocoAd molocoAd) {
        switch (this.a) {
            case 8:
                molocoAd.getClass();
                ((com.moloco.sdk.internal.publisher.b) this.b).onAdClicked(molocoAd);
                break;
            default:
                molocoAd.getClass();
                ((com.moloco.sdk.internal.publisher.b) this.b).onAdClicked(molocoAd);
                break;
        }
    }

    @Override // com.moloco.sdk.internal.publisher.a
    public void onAdHidden(MolocoAd molocoAd) {
        switch (this.a) {
            case 8:
                molocoAd.getClass();
                ((com.moloco.sdk.internal.publisher.b) this.b).onAdHidden(molocoAd);
                break;
            default:
                molocoAd.getClass();
                ((com.moloco.sdk.internal.publisher.b) this.b).onAdHidden(molocoAd);
                break;
        }
    }

    public /* synthetic */ t(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public t(fdi fdiVar, ad2 ad2Var) {
        this.a = 16;
        this.b = fdiVar;
        un0.K(new v98(fdiVar, new d11(2, null, 28), 3), ad2Var, weh.a, null);
        this.c = gdi.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.e.a);
    }

    public t(Context context) {
        this.a = 4;
        context.getClass();
        this.b = context;
        this.c = ypa.b(new com.moloco.sdk.acm.services.d(this, 0));
    }

    public t(com.moloco.sdk.acm.j jVar, Context context) {
        this.a = 2;
        context.getClass();
        this.b = jVar;
        this.c = context;
    }

    public t(com.moloco.sdk.acm.recorder.b bVar) {
        this.a = 5;
        bVar.getClass();
        this.b = bVar;
        this.c = new AtomicBoolean(false);
    }

    public t(com.moloco.sdk.internal.services.i iVar, com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.c cVar) {
        this.a = 6;
        iVar.getClass();
        cVar.getClass();
        this.b = iVar;
        this.c = cVar;
    }

    public t(AdShowListener adShowListener, com.moloco.sdk.internal.services.r rVar, com.moloco.sdk.internal.services.events.c cVar, x0 x0Var, x0 x0Var2, AdFormatType adFormatType, com.moloco.sdk.acm.recorder.c cVar2, x0 x0Var3) {
        this.a = 9;
        adShowListener.getClass();
        adFormatType.getClass();
        this.b = com.facebook.appevents.j.d(adShowListener, rVar, cVar, x0Var, x0Var2, adFormatType, cVar2, x0Var3, 608);
        this.c = adShowListener;
    }

    public /* synthetic */ t() {
        this.a = 1;
    }

    public t(List list, t tVar, com.moloco.sdk.acm.recorder.c cVar) {
        this.a = 7;
        list.getClass();
        this.b = list;
        this.c = cVar;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i
    public void b() {
        ((a1) this.b).b();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g
    public void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c cVar) {
        int i = this.a;
        cVar.getClass();
        switch (i) {
            case 10:
                ((a1) this.b).a(cVar);
                ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.k) this.c).destroy();
                break;
            case 11:
                ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g) this.b).a(cVar);
                break;
            case 12:
                ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g) this.b).a(cVar);
                break;
            default:
                ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g) this.c).a(cVar);
                break;
        }
    }

    public void a(final boolean z) {
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "TemplateBridgeImpl", bf3.l("viewVisible: ", " called, invoking setIsViewable in WebView", z), null, false, 12, null);
        com.moloco.sdk.acm.recorder.c cVar = (com.moloco.sdk.acm.recorder.c) this.c;
        com.moloco.sdk.internal.client_metrics_data.a[] aVarArr = com.moloco.sdk.internal.client_metrics_data.a.b;
        com.moloco.sdk.acm.d dVar = new com.moloco.sdk.acm.d("template_bridge_view_visible_invoked");
        dVar.a("viewable", String.valueOf(z));
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.f fVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.f) this.b;
        dVar.a("attached", String.valueOf(fVar.isAttachedToWindow()));
        cVar.a(dVar);
        fVar.evaluateJavascript("setIsViewable(" + z + ')', new ValueCallback() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.bridge.a
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                t tVar = t.this;
                c cVar2 = (c) tVar.c;
                com.moloco.sdk.internal.client_metrics_data.a[] aVarArr2 = com.moloco.sdk.internal.client_metrics_data.a.b;
                d dVar2 = new d("template_bridge_view_visible_completed");
                dVar2.a("viewable", String.valueOf(z));
                dVar2.a("attached", String.valueOf(((f) tVar.b).isAttachedToWindow()));
                cVar2.a(dVar2);
                MolocoLogger.info$default(MolocoLogger.INSTANCE, "TemplateBridgeImpl", dmi.q("setIsViewable call completed, result: ", (String) obj), null, false, 12, null);
            }
        });
    }
}
