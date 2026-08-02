package com.moloco.sdk.internal.publisher;

import android.content.Context;
import android.transition.Fade;
import android.transition.TransitionManager;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.moloco.sdk.internal.MolocoLogger;
import com.sofascore.results.R;
import defpackage.b98;
import defpackage.ehg;
import defpackage.f1d;
import defpackage.fdi;
import defpackage.g6b;
import defpackage.j8f;
import defpackage.k8f;
import defpackage.lu3;
import defpackage.nl4;
import defpackage.r69;
import defpackage.rq3;
import defpackage.y7k;
import defpackage.zzl;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class o0 implements b98 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ o0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.b98
    public final Object emit(Object obj, rq3 rq3Var) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.l lVar;
        int i;
        int i2;
        View view;
        int i3 = this.a;
        Object obj2 = this.b;
        switch (i3) {
            case 0:
                ((q0) obj2).y.b();
                return Unit.a;
            case 1:
                y7k y7kVar = (y7k) obj;
                int i4 = y7kVar.a;
                Object q = ((j8f) ((k8f) obj2)).e.q(rq3Var, y7kVar);
                return q == lu3.a ? q : Unit.a;
            case 2:
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i adShowListener = ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.f) obj2).getAdShowListener();
                if (adShowListener != null) {
                    adShowListener.b();
                }
                return Unit.a;
            case 3:
                ((z0) obj2).b();
                return Unit.a;
            case 4:
                if (!((Boolean) obj).booleanValue() && (lVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.l) ((nl4) obj2).h) != null) {
                    lVar.a = true;
                }
                return Unit.a;
            case 5:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                ((fdi) obj2).m(null, bool);
                return Unit.a;
            case 6:
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.r rVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.r) obj;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.i iVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.i) obj2;
                iVar.d = rVar;
                iVar.removeAllViews();
                if (rVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.p) {
                    Context context = iVar.getContext();
                    context.getClass();
                    ehg e = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.s.e(context, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.p) rVar);
                    if (e != null) {
                        iVar.addView(e, new FrameLayout.LayoutParams(-1, -1));
                    }
                } else if (rVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.q) {
                    Context context2 = iVar.getContext();
                    context2.getClass();
                    ImageView c = com.facebook.appevents.j.c(context2, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.q) rVar);
                    c.setLayoutParams(new FrameLayout.LayoutParams(c.getLayoutParams().width, c.getLayoutParams().height, 17));
                    iVar.addView(c);
                } else if (rVar != null) {
                    zzl.b();
                    return null;
                }
                return Unit.a;
            case 7:
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.r rVar2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.r) obj;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.v vVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.v) obj2;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.r rVar3 = vVar.e;
                DecelerateInterpolator decelerateInterpolator = vVar.g;
                if (Intrinsics.c(rVar2, rVar3)) {
                    return Unit.a;
                }
                vVar.e = rVar2;
                if (rVar2 == null) {
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.f1.n(vVar, false, vVar.f, decelerateInterpolator, new com.moloco.sdk.internal.b(6, vVar.getChildCount() > 0 ? vVar.getChildAt(0) : null, vVar));
                } else {
                    vVar.removeAllViews();
                    Context context3 = vVar.getContext();
                    context3.getClass();
                    vVar.addView(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.m0(context3, rVar2, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.t(vVar, 0), new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.t(vVar, 1)));
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.f1.n(vVar, true, vVar.f, decelerateInterpolator, null);
                }
                return Unit.a;
            case 8:
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.r rVar4 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.r) obj;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.g1 g1Var = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.g1) obj2;
                r69 r69Var = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.g1.q;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.f0 f0Var = g1Var.h;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.e eVar = g1Var.o;
                if (!Intrinsics.c(g1Var.n, rVar4)) {
                    if (rVar4 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.n) {
                        Context context4 = g1Var.getContext();
                        context4.getClass();
                        view = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.i(context4, ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.n) rVar4).a, f0Var != null ? f0Var.b : null);
                        i2 = 0;
                    } else if (rVar4 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.p) {
                        g6b g6bVar = g1Var.k;
                        if (g6bVar == null) {
                            MolocoLogger.warn$default(MolocoLogger.INSTANCE, "VastRendererView", "Skipping Linear rebuild: lifecycle not resolved (view detached?)", null, false, 12, null);
                        } else {
                            Context context5 = g1Var.getContext();
                            context5.getClass();
                            i2 = 0;
                            view = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.b0(context5, ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.p) rVar4).a, f0Var != null ? f0Var.a : null, g1Var.i, g6bVar, g1Var.c, g1Var.d, g1Var.e, g1Var.f, g1Var.j);
                        }
                    } else {
                        i2 = 0;
                        if (!(rVar4 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.q) && !(rVar4 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.o) && rVar4 != null) {
                            zzl.b();
                            return null;
                        }
                        view = null;
                    }
                    g1Var.n = rVar4;
                    if (view == null) {
                        view = g1Var.p;
                    }
                    if (g1Var.m != view) {
                        long integer = g1Var.getResources().getInteger(R.integer.moloco_vast_renderer_crossfade_duration_ms);
                        Fade fade = new Fade();
                        fade.setDuration(integer);
                        TransitionManager.beginDelayedTransition(g1Var, fade);
                        View view2 = g1Var.m;
                        if (view2 != null) {
                            g1Var.removeView(view2);
                            g1Var.m = null;
                        }
                        int childCount = g1Var.getChildCount() - (i2 + (eVar != null ? 1 : i2));
                        if (childCount < 0) {
                            childCount = i2;
                        }
                        g1Var.addView(view, childCount, new FrameLayout.LayoutParams(-1, -1, 1));
                        g1Var.m = view;
                        if (g1Var.getMeasuredWidth() > 0 && g1Var.getMeasuredHeight() > 0) {
                            view.measure(View.MeasureSpec.makeMeasureSpec(g1Var.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(g1Var.getMeasuredHeight(), 1073741824));
                            int i5 = i2;
                            view.layout(i5, i5, g1Var.getMeasuredWidth(), g1Var.getMeasuredHeight());
                        }
                    }
                }
                if (eVar != null) {
                    if ((rVar4 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.p) || (rVar4 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.n)) {
                        i = 0;
                    } else {
                        if (!(rVar4 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.q) && !(rVar4 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.o) && rVar4 != null) {
                            zzl.b();
                            return null;
                        }
                        i = 8;
                    }
                    eVar.setVisibility(i);
                }
                return Unit.a;
            default:
                Boolean bool2 = (Boolean) obj;
                bool2.getClass();
                ((fdi) ((f1d) obj2)).m(null, bool2);
                return Unit.a;
        }
    }
}
