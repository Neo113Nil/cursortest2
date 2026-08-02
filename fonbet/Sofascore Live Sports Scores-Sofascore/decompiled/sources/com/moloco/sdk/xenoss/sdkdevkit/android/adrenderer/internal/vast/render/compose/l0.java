package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import defpackage.ad2;
import defpackage.bea;
import defpackage.hs4;
import defpackage.r69;
import defpackage.rob;
import defpackage.rq3;
import defpackage.s9a;
import defpackage.xw3;
import defpackage.z45;
import defpackage.z88;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class l0 extends FrameLayout {
    public static final r69 k;
    public final z88 a;
    public final z88 b;
    public Function1 c;
    public Function0 d;
    public final View e;
    public final View f;
    public final long g;
    public boolean h;
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.o i;
    public ad2 j;

    static {
        hs4 hs4Var = z45.a;
        k = rob.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(Context context, z88 z88Var, z88 z88Var2, String str, String str2) {
        super(context);
        Integer valueOf = Integer.valueOf(R.drawable.moloco_twotone_play_arrow_24);
        Integer valueOf2 = Integer.valueOf(R.drawable.moloco_twotone_pause_24);
        this.a = z88Var;
        this.b = z88Var2;
        this.g = getResources().getInteger(R.integer.moloco_playback_control_fade_duration_ms);
        this.i = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.l.a;
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2, 81));
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.moloco_playback_control_padding);
        getResources().getDimensionPixelSize(R.dimen.moloco_playback_control_horizontal_padding);
        this.e = b(valueOf.intValue(), str);
        this.f = b(valueOf2.intValue(), str);
        this.f.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        addView(this.e, a(true, this, dimensionPixelSize));
        addView(this.f, a(true, this, dimensionPixelSize));
        if (str2 != null) {
            setContentDescription(str2);
            setTag(str2);
        }
    }

    public static final FrameLayout.LayoutParams a(boolean z, l0 l0Var, int i) {
        if (!z) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 81);
            layoutParams.setMargins(i, i, i, i);
            return layoutParams;
        }
        int dimensionPixelSize = l0Var.getResources().getDimensionPixelSize(R.dimen.moloco_default_button_size);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize, 81);
        layoutParams2.setMargins(i, i, i, i);
        return layoutParams2;
    }

    public final ImageView b(int i, String str) {
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.moloco_default_button_size);
        Context context = getContext();
        context.getClass();
        return com.facebook.appevents.j.b(context, i, -1, dimensionPixelSize, dimensionPixelSize, str, null, new com.moloco.sdk.internal.publisher.nativead.b(0, this, l0.class, "handleTap", "handleTap()V", 0, 18));
    }

    @Nullable
    public final Function1<Boolean, Unit> getOnShouldPlay() {
        return this.c;
    }

    @Nullable
    public final Function0<Unit> getOnShouldReplay() {
        return this.d;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ad2 c = s9a.c(kotlin.coroutines.e.d(bea.a(), k));
        this.j = c;
        rq3 rq3Var = null;
        xw3.L(c, null, null, new k0(this, rq3Var, 0), 3);
        xw3.L(c, null, null, new k0(this, rq3Var, 1), 3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ad2 ad2Var = this.j;
        if (ad2Var != null) {
            s9a.o(ad2Var, null);
        }
        this.j = null;
    }

    public final void setOnShouldPlay(@Nullable Function1<? super Boolean, Unit> function1) {
        this.c = function1;
    }

    public final void setOnShouldReplay(@Nullable Function0<Unit> function0) {
        this.d = function0;
    }
}
