package com.moloco.sdk.internal.publisher.nativead;

import android.opengl.GLSurfaceView;
import android.os.Looper;
import android.view.View;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.o;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.p;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.t0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.u0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.s;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.e0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.l0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.y0;
import com.unity3d.services.UnityAdsConstants;
import defpackage.fdi;
import defpackage.i3l;
import defpackage.lji;
import defpackage.ng2;
import defpackage.ot8;
import defpackage.qx9;
import defpackage.rq3;
import defpackage.ug6;
import defpackage.vf6;
import defpackage.xw3;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final /* synthetic */ class b extends ot8 implements Function0 {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.b = i3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        rq3 rq3Var = null;
        switch (this.b) {
            case 0:
                ((d) this.receiver).handleGeneralAdClick();
                break;
            case 1:
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.m mVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.m) this.receiver;
                mVar.d();
                mVar.f(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b.f);
                break;
            case 2:
                ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.c) this.receiver).destroy();
                break;
            case 3:
                ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.c) this.receiver).n.m(null, Boolean.TRUE);
                break;
            case 4:
                fdi fdiVar = ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.h) this.receiver).h;
                Boolean bool = Boolean.FALSE;
                fdiVar.getClass();
                fdiVar.m(null, bool);
                break;
            case 5:
                p pVar = (p) this.receiver;
                pVar.i.m(null, Boolean.TRUE);
                pVar.g.m(null, Boolean.FALSE);
                break;
            case 6:
                o oVar = (o) this.receiver;
                oVar.getClass();
                xw3.L(oVar.b, null, null, new i3l(oVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.p.a, rq3Var, 29), 3);
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.k kVar = oVar.d;
                if (kVar != null) {
                    kVar.c("");
                }
                break;
            case 7:
                ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.b) this.receiver).getClass();
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.b.b();
                break;
            case 8:
                ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.m) ((s) this.receiver)).a();
                break;
            case 9:
                ((u0) this.receiver).e();
                break;
            case 10:
                ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.m) this.receiver).a();
                break;
            case 11:
                Function0 function0 = (Function0) ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.b) this.receiver).j.f;
                if (function0 != null) {
                    function0.invoke();
                }
                break;
            case 12:
                ng2 ng2Var = ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.b) this.receiver).j;
                String str = (String) ng2Var.b;
                if (str != null) {
                    Function0 function02 = (Function0) ng2Var.e;
                    if (function02 != null) {
                        function02.invoke();
                    }
                    ((t0) ng2Var.d).a(str);
                }
                break;
            case 13:
                Function0 function03 = (Function0) ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.e) this.receiver).w.f;
                if (function03 != null) {
                    function03.invoke();
                }
                break;
            case 14:
                ng2 ng2Var2 = ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.e) this.receiver).w;
                String str2 = (String) ng2Var2.b;
                if (str2 != null) {
                    Function0 function04 = (Function0) ng2Var2.e;
                    if (function04 != null) {
                        function04.invoke();
                    }
                    ((t0) ng2Var2.d).a(str2);
                }
                break;
            case 15:
                Function0 function05 = (Function0) ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.e) this.receiver).w.f;
                if (function05 != null) {
                    function05.invoke();
                }
                break;
            case 16:
                ng2 ng2Var3 = ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.e) this.receiver).w;
                String str3 = (String) ng2Var3.b;
                if (str3 != null) {
                    Function0 function06 = (Function0) ng2Var3.e;
                    if (function06 != null) {
                        function06.invoke();
                    }
                    ((t0) ng2Var3.d).a(str3);
                }
                break;
            case 17:
                e0 e0Var = (e0) this.receiver;
                boolean z = e0Var.j;
                boolean z2 = !z;
                Function1 function1 = e0Var.g;
                if (function1 != null) {
                    function1.invoke(Boolean.valueOf(z2));
                }
                com.moloco.sdk.xenoss.sdkdevkit.android.core.services.c cVar = !z ? com.moloco.sdk.xenoss.sdkdevkit.android.core.services.c.e : com.moloco.sdk.xenoss.sdkdevkit.android.core.services.c.d;
                com.moloco.sdk.xenoss.sdkdevkit.android.core.services.c cVar2 = e0Var.j ? com.moloco.sdk.xenoss.sdkdevkit.android.core.services.c.e : com.moloco.sdk.xenoss.sdkdevkit.android.core.services.c.d;
                Function2 function2 = e0Var.i;
                if (function2 != null) {
                    function2.invoke(new com.moloco.sdk.xenoss.sdkdevkit.android.core.services.d(cVar, e0Var.k, e0Var.l), cVar2);
                }
                Function0 function07 = e0Var.h;
                if (function07 != null) {
                    function07.invoke();
                }
                break;
            case 18:
                l0 l0Var = (l0) this.receiver;
                if (l0Var.i instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.k) {
                    Function0 function08 = l0Var.d;
                    if (function08 != null) {
                        function08.invoke();
                    }
                } else {
                    Function1 function12 = l0Var.c;
                    if (function12 != null) {
                        function12.invoke(Boolean.valueOf(!l0Var.h));
                    }
                }
                break;
            case 19:
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.m mVar2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.m) ((s) this.receiver);
                mVar2.d();
                mVar2.f(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b.f);
                break;
            case 20:
                ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.m) ((s) this.receiver)).b();
                break;
            case 21:
                ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.m) ((s) this.receiver)).b();
                break;
            case 22:
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.h hVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.h) this.receiver;
                hVar.getClass();
                MolocoLogger.info$default(MolocoLogger.INSTANCE, "SimplifiedExoPlayer", "Init exo player", null, false, 12, null);
                lji ljiVar = hVar.l;
                if (ljiVar != null) {
                    if (hVar.p == null) {
                        vf6 vf6Var = new vf6(hVar.a);
                        Looper looper = hVar.o;
                        qx9.t(!vf6Var.j);
                        looper.getClass();
                        vf6Var.f = looper;
                        qx9.t(!vf6Var.j);
                        vf6Var.i = true;
                        qx9.t(!vf6Var.j);
                        vf6Var.j = true;
                        ug6 ug6Var = new ug6(vf6Var);
                        ljiVar.setPlayer(ug6Var);
                        hVar.p = ug6Var;
                        ug6Var.J(false);
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.g gVar = hVar.s;
                        gVar.getClass();
                        ug6Var.l.e(gVar);
                        ug6Var.O(hVar.n ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : 1.0f);
                        hVar.b(ug6Var, hVar.m);
                        long j = hVar.u;
                        int g = ug6Var.g();
                        ug6Var.T();
                        ug6Var.C(j, g, false);
                        if (hVar.r) {
                            ug6Var.J(true);
                        } else {
                            ug6Var.J(false);
                        }
                        if (Intrinsics.c(hVar.g.getValue(), com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.l.a)) {
                            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.n nVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.n(ug6Var.m());
                            fdi fdiVar2 = hVar.f;
                            fdiVar2.getClass();
                            fdiVar2.m(null, nVar);
                        }
                    }
                    View view = ljiVar.d;
                    if (view instanceof GLSurfaceView) {
                        ((GLSurfaceView) view).onResume();
                    }
                }
                break;
            case 23:
                ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.h) this.receiver).d();
                break;
            case 24:
                ((y0) this.receiver).setAdView(null);
                break;
            default:
                ((y0) this.receiver).b();
                break;
        }
        return Unit.a;
    }
}
