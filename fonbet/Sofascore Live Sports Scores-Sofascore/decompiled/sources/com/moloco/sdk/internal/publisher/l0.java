package com.moloco.sdk.internal.publisher;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.ortb.model.i1;
import com.moloco.sdk.internal.ortb.model.k1;
import com.moloco.sdk.publisher.AdFormatType;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticAdActivity;
import com.unity3d.services.UnityAdsConstants;
import defpackage.ad2;
import defpackage.aeh;
import defpackage.ar3;
import defpackage.beh;
import defpackage.ddi;
import defpackage.fcp;
import defpackage.fdl;
import defpackage.i3l;
import defpackage.ib;
import defpackage.jk0;
import defpackage.kuj;
import defpackage.ot8;
import defpackage.rq3;
import defpackage.ux4;
import defpackage.v98;
import defpackage.xw3;
import defpackage.yda;
import defpackage.yf4;
import defpackage.yso;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final /* synthetic */ class l0 extends ot8 implements Function1 {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l0(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.b = i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:140:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01d0  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        int i;
        int i2;
        Integer num;
        int b;
        ddi isLoaded;
        com.moloco.sdk.internal.ortb.model.w wVar;
        com.moloco.sdk.internal.ortb.model.w wVar2;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.a aVar;
        com.moloco.sdk.internal.ortb.model.l0 l0Var;
        String str;
        float f;
        Float f2;
        com.moloco.sdk.internal.ortb.model.b1 b1Var;
        Boolean bool;
        Object[] objArr = 0;
        boolean z = true;
        z = true;
        z = true;
        switch (this.b) {
            case 0:
                com.moloco.sdk.internal.ortb.model.y yVar = (com.moloco.sdk.internal.ortb.model.y) obj;
                yVar.getClass();
                final q0 q0Var = (q0) this.receiver;
                com.moloco.sdk.internal.x xVar = q0Var.k;
                Context context = q0Var.a;
                ad2 ad2Var = q0Var.s;
                Regex regex = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.l0.a;
                String str2 = yVar.a;
                str2.getClass();
                q0Var.p = StringsKt.J(str2, "<VAST", true);
                q0Var.b(null);
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e eVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e) q0Var.g.invoke(q0Var.a, q0Var.c, yVar, q0Var.f, q0Var.h, q0Var.j, q0Var.l, q0Var.u);
                ux4 ux4Var = q0Var.t;
                ux4Var.d = eVar;
                com.moloco.sdk.internal.ortb.model.a0 a0Var = yVar.d;
                ux4Var.e = a0Var.d;
                String str3 = yVar.c;
                ux4Var.f = str3 != null ? new d0(str3) : null;
                i1 i1Var = a0Var.e;
                ux4Var.h = (i1Var == null || (wVar2 = i1Var.a) == null) ? null : wVar2.b;
                ux4Var.i = (i1Var == null || (wVar = i1Var.a) == null) ? null : wVar.a;
                ux4Var.c = (i1Var != null ? i1Var.a : null) != null;
                eVar.setAdShowListener(q0Var.y);
                int i3 = 2;
                int i4 = 3;
                if (q0Var.o == AdFormatType.MREC && q0Var.p) {
                    MolocoLogger.debug$default(MolocoLogger.INSTANCE, "BannerViewImpl", "MREC: Using ViewVisibilityTracker(ImpressionViewVisibilityTracker) to track ad display state.", false, 4, null);
                    yda ydaVar = (yda) ux4Var.g;
                    if (ydaVar != null) {
                        ydaVar.e(null);
                    }
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e eVar2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e) ux4Var.d;
                    if (eVar2 != null && (isLoaded = eVar2.isLoaded()) != null) {
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.w0 w0Var = q0Var.n;
                        w0Var.getClass();
                        rq3 rq3Var = null;
                        ux4Var.g = fcp.m0(new v98(new v98(new yf4(isLoaded, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.i0.c(yso.r(new fdl(q0Var, w0Var, rq3Var, 10))), new ar3(i4, rq3Var, z ? 1 : 0), z ? 1 : 0), new jk0(i3, rq3Var, i3), z ? 1 : 0), new m0(q0Var, ux4Var, rq3Var, objArr == true ? 1 : 0), i4), ad2Var);
                    }
                } else {
                    MolocoLogger.debug$default(MolocoLogger.INSTANCE, "BannerViewImpl", "Banner: Using isAdShowing function to track ad display state.", false, 4, null);
                    yda ydaVar2 = (yda) ux4Var.g;
                    if (ydaVar2 != null) {
                        ydaVar2.e(null);
                    }
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e eVar3 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e) ux4Var.d;
                    rq3 rq3Var2 = null;
                    ux4Var.g = fcp.m0(new v98(new v98((q0Var.e || eVar3 == null) ? q0Var.getIsViewShown() : eVar3.l(), new jk0(i3, rq3Var2, i4), z ? 1 : 0), new m0(q0Var, ux4Var, rq3Var2, z ? 1 : 0), i4), ad2Var);
                }
                Integer num2 = yVar.g;
                Integer num3 = yVar.h;
                boolean z2 = q0Var.p;
                xVar.getClass();
                boolean z3 = xVar instanceof com.moloco.sdk.internal.v;
                Object[] objArr2 = z3 || (xVar instanceof com.moloco.sdk.internal.u);
                int b2 = objArr2 != false ? (z2 || num2 == null) ? -1 : com.facebook.appevents.n.b(num2.intValue()) : com.facebook.appevents.n.b(xVar.a);
                if (objArr2 != true) {
                    i = xVar.b;
                } else {
                    if (num3 == null) {
                        i2 = 0;
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(b2, i2);
                        layoutParams.gravity = 1;
                        q0Var.addView(eVar, layoutParams);
                        if (!z3 || (xVar instanceof com.moloco.sdk.internal.u)) {
                            if (z3) {
                                if ((xVar instanceof com.moloco.sdk.internal.u) && (num = ((com.moloco.sdk.internal.u) xVar).c) != null) {
                                    b = com.facebook.appevents.n.b(num.intValue());
                                    q0Var.setLayoutParams(new FrameLayout.LayoutParams(b, -2));
                                }
                                b = -1;
                                q0Var.setLayoutParams(new FrameLayout.LayoutParams(b, -2));
                            } else {
                                Integer num4 = ((com.moloco.sdk.internal.v) xVar).c;
                                if (num4 != null) {
                                    b = com.facebook.appevents.n.b(num4.intValue());
                                    q0Var.setLayoutParams(new FrameLayout.LayoutParams(b, -2));
                                }
                                b = -1;
                                q0Var.setLayoutParams(new FrameLayout.LayoutParams(b, -2));
                            }
                        }
                        if (ux4Var.c) {
                            context.getClass();
                            final ib ibVar = new ib(context, 1);
                            ibVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                            ibVar.setBackgroundColor(0);
                            final aeh b3 = beh.b(0, 0, null, 7);
                            xw3.L(ad2Var, null, null, new i3l(b3, q0Var, null, 21), 3);
                            ibVar.setOnTouchListener(new View.OnTouchListener() { // from class: com.moloco.sdk.internal.publisher.k0
                                @Override // android.view.View.OnTouchListener
                                public final boolean onTouch(View view, MotionEvent motionEvent) {
                                    q0 q0Var2 = q0.this;
                                    xw3.L(q0Var2.s, null, null, new kuj(motionEvent, ibVar, q0Var2, b3, (rq3) null, 18), 3);
                                    return false;
                                }
                            });
                            q0Var.addView(ibVar, new FrameLayout.LayoutParams(-1, i2));
                        }
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.e eVar4 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.e(q0Var.f, context);
                        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
                        layoutParams2.gravity = 8388691;
                        eVar4.setPadding(12, 0, 0, 12);
                        eVar4.setPrivacyUrl("https://cdn-f.adsmoloco.com/moloco-cdn/privacy.html");
                        eVar4.setOnButtonRenderedListener(new i0(q0Var, z ? 1 : 0));
                        eVar4.setLayoutParams(layoutParams2);
                        q0Var.addView(eVar4);
                        return eVar;
                    }
                    i = num3.intValue();
                }
                i2 = com.facebook.appevents.n.b(i);
                FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(b2, i2);
                layoutParams3.gravity = 1;
                q0Var.addView(eVar, layoutParams3);
                if (!z3) {
                }
                if (z3) {
                }
                if (ux4Var.c) {
                }
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.e eVar42 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.e(q0Var.f, context);
                FrameLayout.LayoutParams layoutParams22 = new FrameLayout.LayoutParams(-2, -2);
                layoutParams22.gravity = 8388691;
                eVar42.setPadding(12, 0, 0, 12);
                eVar42.setPrivacyUrl("https://cdn-f.adsmoloco.com/moloco-cdn/privacy.html");
                eVar42.setOnButtonRenderedListener(new i0(q0Var, z ? 1 : 0));
                eVar42.setLayoutParams(layoutParams22);
                q0Var.addView(eVar42);
                return eVar;
            case 1:
                com.moloco.sdk.internal.ortb.model.y yVar2 = (com.moloco.sdk.internal.ortb.model.y) obj;
                yVar2.getClass();
                c1 c1Var = (c1) this.receiver;
                com.moloco.sdk.internal.ilrd.n nVar = c1Var.h;
                com.moloco.sdk.acm.recorder.c cVar = c1Var.l;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.b bVar = c1Var.j;
                com.moloco.sdk.internal.services.events.c cVar2 = c1Var.c;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.t0 t0Var = c1Var.f;
                Context context2 = c1Var.a;
                c1Var.b(null);
                com.moloco.sdk.internal.ortb.model.a0 a0Var2 = yVar2.d;
                String str4 = yVar2.c;
                String str5 = yVar2.a;
                k1 k1Var = a0Var2.c;
                com.moloco.sdk.internal.ortb.model.d dVar = a0Var2.a;
                com.moloco.sdk.internal.ortb.model.h hVar = a0Var2.d;
                if (!(k1Var != null ? Intrinsics.c(k1Var.a, Boolean.TRUE) : false)) {
                    c1Var.q = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l) c1Var.g.invoke(dVar);
                    c1Var.r = dVar != null ? dVar.g : null;
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.g0 g0Var = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.g0(context2, cVar2, yVar2, t0Var, bVar, cVar);
                    nVar.a = g0Var;
                    nVar.c = hVar;
                    nVar.d = str4 != null ? new d0(str4) : null;
                    return g0Var;
                }
                k1 k1Var2 = a0Var2.c;
                if (k1Var2 != null && (b1Var = k1Var2.b) != null && (bool = b1Var.a) != null) {
                    z = bool.booleanValue();
                }
                boolean z4 = z;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m a = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.l0.a(str5);
                com.moloco.sdk.internal.services.z zVar = new com.moloco.sdk.internal.services.z(t0Var, cVar2);
                if (hVar != null && (l0Var = hVar.k) != null && (str = l0Var.a) != null) {
                    if (StringsKt.R(str)) {
                        str = null;
                    }
                    if (str != null) {
                        String lowerCase = a.name().toLowerCase(Locale.ROOT);
                        lowerCase.getClass();
                        com.moloco.sdk.internal.ortb.model.j0 j0Var = l0Var.b;
                        if (j0Var != null && (f2 = j0Var.a) != null) {
                            if (f2.floatValue() <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                f2 = null;
                            }
                            if (f2 != null) {
                                f = f2.floatValue();
                                aVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.a(str, lowerCase, f);
                                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.k kVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.k(context2, str5, zVar, bVar, com.moloco.sdk.service_locator.i.a(), com.moloco.sdk.service_locator.j.b(), cVar, z4, aVar);
                                nVar.a = kVar;
                                nVar.c = hVar;
                                nVar.d = str4 != null ? new d0(str4) : null;
                                return kVar;
                            }
                        }
                        f = 0.9f;
                        aVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.a(str, lowerCase, f);
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.k kVar2 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.k(context2, str5, zVar, bVar, com.moloco.sdk.service_locator.i.a(), com.moloco.sdk.service_locator.j.b(), cVar, z4, aVar);
                        nVar.a = kVar2;
                        nVar.c = hVar;
                        nVar.d = str4 != null ? new d0(str4) : null;
                        return kVar2;
                    }
                }
                aVar = null;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.k kVar22 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.k(context2, str5, zVar, bVar, com.moloco.sdk.service_locator.i.a(), com.moloco.sdk.service_locator.j.b(), cVar, z4, aVar);
                nVar.a = kVar22;
                nVar.c = hVar;
                nVar.d = str4 != null ? new d0(str4) : null;
                return kVar22;
            case 2:
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d dVar2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d) obj;
                dVar2.getClass();
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.c cVar3 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.c) this.receiver;
                if (cVar3.k) {
                    z0 z0Var = cVar3.j;
                    if (z0Var != null) {
                        z0Var.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.f1.s(dVar2));
                    }
                } else {
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g gVar = cVar3.i;
                    if (gVar != null) {
                        gVar.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.f1.s(dVar2));
                    }
                }
                return Unit.a;
            case 3:
                com.moloco.sdk.xenoss.sdkdevkit.android.core.services.d dVar3 = (com.moloco.sdk.xenoss.sdkdevkit.android.core.services.d) obj;
                dVar3.getClass();
                ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.b) this.receiver).getClass();
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.c cVar4 = StaticAdActivity.d;
                if (cVar4 != null) {
                    cVar4.d.c.a(dVar3);
                }
                return Unit.a;
            case 4:
                com.moloco.sdk.xenoss.sdkdevkit.android.core.services.d dVar4 = (com.moloco.sdk.xenoss.sdkdevkit.android.core.services.d) obj;
                dVar4.getClass();
                ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.m) ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.s) this.receiver)).h(dVar4);
                return Unit.a;
            case 5:
                return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.u0) this.receiver).b((rq3) obj);
            case 6:
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.l lVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.l) obj;
                lVar.getClass();
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.e eVar5 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.e) this.receiver;
                eVar5.getClass();
                eVar5.d(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.c(lVar));
                return Unit.a;
            case 7:
                ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.e) this.receiver).h(((Boolean) obj).booleanValue());
                return Unit.a;
            case 8:
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.l lVar2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.l) obj;
                lVar2.getClass();
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.e eVar6 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.e) this.receiver;
                eVar6.getClass();
                eVar6.d(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.c(lVar2));
                return Unit.a;
            case 9:
                ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.e) this.receiver).h(((Boolean) obj).booleanValue());
                return Unit.a;
            case 10:
                com.moloco.sdk.xenoss.sdkdevkit.android.core.services.d dVar5 = (com.moloco.sdk.xenoss.sdkdevkit.android.core.services.d) obj;
                dVar5.getClass();
                ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.m) ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.s) this.receiver)).h(dVar5);
                return Unit.a;
            case 11:
                com.moloco.sdk.xenoss.sdkdevkit.android.core.services.d dVar6 = (com.moloco.sdk.xenoss.sdkdevkit.android.core.services.d) obj;
                dVar6.getClass();
                ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.m) ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.s) this.receiver)).h(dVar6);
                return Unit.a;
            case 12:
                com.moloco.sdk.xenoss.sdkdevkit.android.core.services.d dVar7 = (com.moloco.sdk.xenoss.sdkdevkit.android.core.services.d) obj;
                dVar7.getClass();
                ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.m) ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.s) this.receiver)).h(dVar7);
                return Unit.a;
            case 13:
                com.moloco.sdk.xenoss.sdkdevkit.android.core.services.d dVar8 = (com.moloco.sdk.xenoss.sdkdevkit.android.core.services.d) obj;
                dVar8.getClass();
                ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.m) ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.s) this.receiver)).h(dVar8);
                return Unit.a;
            default:
                return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.r) this.receiver).b((rq3) obj);
        }
    }
}
