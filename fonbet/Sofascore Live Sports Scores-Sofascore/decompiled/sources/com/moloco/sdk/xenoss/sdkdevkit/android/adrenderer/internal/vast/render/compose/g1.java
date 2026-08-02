package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.sofascore.results.R;
import defpackage.ad2;
import defpackage.bea;
import defpackage.ct8;
import defpackage.ft8;
import defpackage.g6b;
import defpackage.hs4;
import defpackage.qha;
import defpackage.r69;
import defpackage.rob;
import defpackage.rq3;
import defpackage.s9a;
import defpackage.u6b;
import defpackage.xw3;
import defpackage.z45;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class g1 extends FrameLayout {
    public static final r69 q;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.s a;
    public final g6b b;
    public final ct8 c;
    public final ct8 d;
    public final ct8 e;
    public final Function2 f;
    public final ft8 g;
    public final f0 h;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.q i;
    public final Function0 j;
    public g6b k;
    public ad2 l;
    public View m;
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.r n;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.e o;
    public final View p;

    static {
        hs4 hs4Var = z45.a;
        q = rob.a.f;
    }

    public g1(Context context, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.s sVar, g6b g6bVar, ct8 ct8Var, ct8 ct8Var2, ct8 ct8Var3, Function2 function2, ft8 ft8Var, f0 f0Var, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.q qVar, boolean z, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.t0 t0Var, Function0 function0) {
        super(context);
        this.a = sVar;
        this.b = g6bVar;
        this.c = ct8Var;
        this.d = ct8Var2;
        this.e = ct8Var3;
        this.f = function2;
        this.g = ft8Var;
        this.h = f0Var;
        this.i = qVar;
        this.j = function0;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.e eVar = null;
        if (ft8Var != null) {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.m mVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.m) sVar;
        }
        if (z) {
            eVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.e(t0Var, context);
            int dimensionPixelSize = eVar.getResources().getDimensionPixelSize(R.dimen.moloco_ad_badge_padding);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 8388691);
            layoutParams.setMargins(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
            eVar.setLayoutParams(layoutParams);
            eVar.setVisibility(8);
            eVar.setOnButtonRenderedListener(new com.moloco.sdk.internal.publisher.l0(1, sVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.s.class, "onButtonRendered", "onButtonRendered(Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/CustomUserEventBuilderService$UserInteraction$Button;)V", 0, 12));
        }
        this.o = eVar;
        View view = new View(context);
        view.setClickable(false);
        view.setFocusable(false);
        view.setImportantForAccessibility(2);
        this.p = view;
        setBackgroundColor(-16777216);
        setId(R.id.moloco_fullscreen_ad_view_id);
        addView(view, new FrameLayout.LayoutParams(-1, -1));
        this.m = view;
        if (eVar != null) {
            addView(eVar);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        rq3 rq3Var = null;
        g6b g6bVar = this.b;
        if (g6bVar == null) {
            u6b w = qha.w(this);
            g6bVar = w != null ? w.getLifecycle() : null;
            if (g6bVar == null) {
                g6bVar = com.moloco.sdk.service_locator.i.c().a;
            }
        }
        this.k = g6bVar;
        ad2 c = s9a.c(kotlin.coroutines.e.d(bea.a(), q));
        this.l = c;
        xw3.L(c, null, null, new u(this, rq3Var, 2), 3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ad2 ad2Var = this.l;
        if (ad2Var != null) {
            s9a.o(ad2Var, null);
        }
        this.l = null;
        this.k = null;
    }
}
