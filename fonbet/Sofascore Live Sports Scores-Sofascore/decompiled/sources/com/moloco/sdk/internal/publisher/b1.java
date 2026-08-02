package com.moloco.sdk.internal.publisher;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.publisher.AdShowListener;
import com.moloco.sdk.publisher.MolocoAdError;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.MraidActivity;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.fullscreen.FullscreenWebviewActivity;
import defpackage.ad2;
import defpackage.aeh;
import defpackage.fdl;
import defpackage.g9i;
import defpackage.hoi;
import defpackage.kn4;
import defpackage.ku3;
import defpackage.kuj;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.xw3;
import defpackage.y6a;
import defpackage.zzl;
import java.lang.ref.WeakReference;
import java.lang.reflect.UndeclaredThrowableException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class b1 extends hoi implements Function2 {
    public final /* synthetic */ AdShowListener r;
    public final /* synthetic */ c1 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(AdShowListener adShowListener, c1 c1Var, rq3 rq3Var) {
        super(2, rq3Var);
        this.r = adShowListener;
        this.s = c1Var;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new b1(this.r, this.s, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b1) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0289  */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.f fVar;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.f fVar2;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.b bVar;
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        c1 c1Var = this.s;
        String str = c1Var.d;
        com.moloco.sdk.internal.ilrd.n nVar = c1Var.h;
        Unit unit = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        AdShowListener adShowListener = this.r;
        if (adShowListener != null) {
            nVar.e = new com.facebook.internal.t(adShowListener, c1Var.b, c1Var.c, new x0(c1Var, 1), new x0(c1Var, 2), c1Var.i, c1Var.l, new x0(c1Var, 3));
        } else {
            nVar.e = null;
        }
        com.facebook.internal.t tVar = (com.facebook.internal.t) nVar.e;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.p pVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.p) nVar.a;
        if (pVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.k) {
            fVar2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.k) pVar;
        } else {
            if (!(pVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.g0)) {
                fVar = null;
                if (fVar != null || !c1Var.p.k) {
                    if (tVar != null) {
                        ((b) tVar.b).b(com.moloco.sdk.internal.e0.a(str, MolocoAdError.ErrorType.AD_SHOW_ERROR_NOT_LOADED, com.moloco.sdk.internal.z.e));
                    }
                    return Unit.a;
                }
                if (((Boolean) fVar.l().getValue()).booleanValue()) {
                    if (tVar != null) {
                        ((b) tVar.b).b(com.moloco.sdk.internal.e0.a(str, MolocoAdError.ErrorType.AD_SHOW_ERROR_ALREADY_DISPLAYING, com.moloco.sdk.internal.z.f));
                    }
                    return Unit.a;
                }
                g9i g9iVar = (g9i) nVar.b;
                if (g9iVar != null) {
                    g9iVar.e(null);
                }
                nVar.b = xw3.L(c1Var.m, null, null, new fdl(fVar, tVar, c1Var, objArr5 == true ? 1 : 0, 6), 3);
                int i = 0;
                if (fVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.k) {
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.k kVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.k) fVar;
                    a1 a1Var = new a1(c1Var, tVar);
                    MolocoLogger.info$default(MolocoLogger.INSTANCE, "TemplateFullscreenAd", "fullscreen ad show called", null, false, 12, null);
                    com.facebook.internal.t tVar2 = new com.facebook.internal.t(10, a1Var, kVar);
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.b bVar2 = kVar.b;
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.b bVar3 = kVar.i;
                    bVar2.b(bVar3.d);
                    xw3.L(bVar3.b, null, null, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.a(bVar3, tVar2, objArr4 == true ? 1 : 0, i), 3);
                    try {
                        WeakReference weakReference = FullscreenWebviewActivity.j;
                        com.facebook.appevents.j.i(kVar.a, kVar.k, bVar3, kVar.c, kVar.m);
                        xw3.L(kVar.d, null, null, new fdl((Object) kVar, (Object) tVar2, (rq3) (objArr3 == true ? 1 : 0), 7), 3);
                    } catch (Exception e) {
                        if (Build.VERSION.SDK_INT < 36 || !(e instanceof UndeclaredThrowableException)) {
                            MolocoLogger.error$default(MolocoLogger.INSTANCE, "TemplateFullscreenAd", "Failed to start fullscreen activity", e, false, 8, null);
                            throw e;
                        }
                        MolocoLogger.error$default(MolocoLogger.INSTANCE, "TemplateFullscreenAd", "Android16BetaFix - Prevented system-level NPE during startActivity", e, false, 8, null);
                        tVar2.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.f0.g);
                    }
                } else if (fVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.g0) {
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.g0 g0Var = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.g0) fVar;
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l lVar = c1Var.q;
                    z0 z0Var = new z0(c1Var, tVar);
                    lVar.getClass();
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.p pVar2 = g0Var.i;
                    if (pVar2 != null) {
                        xw3.L(pVar2.e, null, null, new fdl(pVar2, z0Var, lVar.a, objArr2 == true ? 1 : 0, 8), 3);
                        Unit unit2 = Unit.a;
                    } else {
                        z0 z0Var2 = z0Var;
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.c cVar = g0Var.j;
                        if (cVar != null) {
                            kn4 kn4Var = lVar.b;
                            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.u0 u0Var = cVar.d;
                            u0Var.c = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.a(z0Var2, 0);
                            u0Var.d = new com.moloco.sdk.acm.db.e(cVar, 5);
                            cVar.j = z0Var2;
                            cVar.k = true;
                            com.moloco.sdk.internal.l0 l0Var = cVar.c.g;
                            if (l0Var instanceof com.moloco.sdk.internal.j0) {
                                z0Var2.a((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d) ((com.moloco.sdk.internal.j0) l0Var).a);
                            } else {
                                if (!(l0Var instanceof com.moloco.sdk.internal.k0)) {
                                    zzl.b();
                                    return null;
                                }
                                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.g gVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.g) ((com.moloco.sdk.internal.k0) l0Var).a;
                                aeh aehVar = MraidActivity.h;
                                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.o oVar = cVar.e;
                                Context context = cVar.a;
                                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.b bVar4 = cVar.b;
                                int i2 = 0;
                                int i3 = 0;
                                Class<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.c> cls = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.c.class;
                                com.moloco.sdk.internal.publisher.nativead.b bVar5 = new com.moloco.sdk.internal.publisher.nativead.b(i3, cVar, cls, "destroy", "destroy()V", i2, 2);
                                com.moloco.sdk.internal.publisher.nativead.b bVar6 = new com.moloco.sdk.internal.publisher.nativead.b(i3, cVar, cls, "onForciblyClosed", "onForciblyClosed()V", i2, 3);
                                Function0 function0 = u0Var.c;
                                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.a aVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.a(z0Var2, 1);
                                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.b bVar7 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.b(z0Var2, 0);
                                String str2 = cVar.f;
                                com.moloco.sdk.acm.recorder.c cVar2 = cVar.g;
                                gVar.getClass();
                                function0.getClass();
                                if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.a.b(oVar)) {
                                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.f.f = gVar;
                                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.f.g = bVar4;
                                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.f.c = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.e) kn4Var.c;
                                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.f.d = (com.moloco.sdk.internal.n) kn4Var.d;
                                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.f.e = bVar5;
                                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.f.a = new WeakReference(oVar);
                                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.f.h = bVar6;
                                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.f.i = function0;
                                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.f.j = aVar;
                                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.f.k = bVar7;
                                    com.moloco.sdk.internal.ortb.model.q qVar = (com.moloco.sdk.internal.ortb.model.q) kn4Var.e;
                                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.f.l = qVar != null ? new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.c(qVar.a, qVar.b) : null;
                                    com.moloco.sdk.internal.ortb.model.s sVar = (com.moloco.sdk.internal.ortb.model.s) kn4Var.f;
                                    if (sVar != null) {
                                        boolean z = sVar.a;
                                        String str3 = sVar.b;
                                        String str4 = sVar.c;
                                        Boolean bool = sVar.d;
                                        bVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.b(true, z, str3, str4, bool != null ? bool.booleanValue() : true);
                                    } else {
                                        bVar = null;
                                    }
                                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.f.m = bVar;
                                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.f.n = cVar2;
                                    Intent intent = new Intent(context, (Class<?>) MraidActivity.class);
                                    intent.putExtra("CLOSE_DELAY_SECONDS", kn4Var.a);
                                    intent.putExtra("DEC_DELAY_SECONDS", kn4Var.b);
                                    if (str2 != null) {
                                        intent.putExtra("BUNDLE_ID", str2);
                                    }
                                    intent.setFlags(268435456);
                                    context.startActivity(intent);
                                    cVar.l.m(null, Boolean.TRUE);
                                } else {
                                    z0Var2.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d.j);
                                }
                            }
                            Unit unit3 = Unit.a;
                        } else {
                            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.h hVar = g0Var.k;
                            if (hVar != null) {
                                kn4 kn4Var2 = lVar.c;
                                ad2 ad2Var = hVar.e;
                                kuj kujVar = new kuj((Object) hVar, (Object) kn4Var2, (Object) z0Var2, (rq3) (objArr == true ? 1 : 0), 21);
                                z0Var2 = z0Var2;
                                xw3.L(ad2Var, null, null, kujVar, 3);
                                unit = Unit.a;
                            }
                            if (unit == null) {
                                z0Var2.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.b.a);
                                Unit unit4 = Unit.a;
                            }
                        }
                    }
                }
                return Unit.a;
            }
            fVar2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.g0) pVar;
        }
        fVar = fVar2;
        if (fVar != null) {
        }
        if (tVar != null) {
        }
        return Unit.a;
    }
}
