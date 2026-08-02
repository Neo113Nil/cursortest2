package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

import android.content.Context;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import defpackage.ad2;
import defpackage.bea;
import defpackage.hs4;
import defpackage.r69;
import defpackage.rob;
import defpackage.s9a;
import defpackage.xw3;
import defpackage.z45;
import defpackage.z88;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class v extends FrameLayout {
    public static final r69 h;
    public final z88 a;
    public Function0 b;
    public Function0 c;
    public ad2 d;
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.r e;
    public final long f;
    public final DecelerateInterpolator g;

    static {
        hs4 hs4Var = z45.a;
        h = rob.a.f;
    }

    public v(Context context, z88 z88Var, int i, int i2) {
        super(context);
        this.a = z88Var;
        this.f = getResources().getInteger(R.integer.moloco_animated_visibility_fade_duration_ms);
        this.g = new DecelerateInterpolator();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, i);
        layoutParams.setMargins(i2, i2, i2, i2);
        setLayoutParams(layoutParams);
        setVisibility(8);
        setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    @Nullable
    public final Function0<Unit> getOnClick() {
        return this.c;
    }

    @Nullable
    public final Function0<Unit> getOnDisplayed() {
        return this.b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ad2 c = s9a.c(kotlin.coroutines.e.d(bea.a(), h));
        this.d = c;
        xw3.L(c, null, null, new u(this, null, 0), 3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ad2 ad2Var = this.d;
        if (ad2Var != null) {
            s9a.o(ad2Var, null);
        }
        this.d = null;
    }

    public final void setOnClick(@Nullable Function0<Unit> function0) {
        this.c = function0;
    }

    public final void setOnDisplayed(@Nullable Function0<Unit> function0) {
        this.b = function0;
    }
}
