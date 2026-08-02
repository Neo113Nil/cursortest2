package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

import android.content.Context;
import android.content.res.Resources;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import defpackage.ad2;
import defpackage.bea;
import defpackage.bsk;
import defpackage.hs4;
import defpackage.r69;
import defpackage.rob;
import defpackage.rq3;
import defpackage.s9a;
import defpackage.srk;
import defpackage.xw3;
import defpackage.z45;
import defpackage.z88;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class e0 extends FrameLayout {
    public static final r69 o;
    public final z88 a;
    public final z88 b;
    public final int c;
    public final int d;
    public final long e;
    public final DecelerateInterpolator f;
    public Function1 g;
    public Function0 h;
    public Function2 i;
    public boolean j;
    public com.moloco.sdk.xenoss.sdkdevkit.android.core.services.g k;
    public com.moloco.sdk.xenoss.sdkdevkit.android.core.services.h l;
    public ad2 m;
    public final ImageView n;

    static {
        hs4 hs4Var = z45.a;
        o = rob.a;
    }

    public e0(Context context, z88 z88Var, z88 z88Var2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        super(context);
        this.a = z88Var;
        this.b = z88Var2;
        this.c = i2;
        this.d = i3;
        this.e = getResources().getInteger(R.integer.moloco_animated_visibility_fade_duration_ms);
        this.f = new DecelerateInterpolator();
        this.k = new com.moloco.sdk.xenoss.sdkdevkit.android.core.services.g(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.l = new com.moloco.sdk.xenoss.sdkdevkit.android.core.services.h(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i4, i4, i6);
        layoutParams.setMargins(i7, i7, i7, i7);
        setLayoutParams(layoutParams);
        setVisibility(8);
        setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        CharSequence string = context.getString(R.string.moloco_mute_button_content_description);
        string.getClass();
        setContentDescription(string);
        setTag(string);
        ImageView b = com.facebook.appevents.j.b(context, i3, i, i4, i5, context.getString(R.string.moloco_mute_button_icon_content_description), Integer.valueOf(i8), new com.moloco.sdk.internal.publisher.nativead.b(0, this, e0.class, "onIconClick", "onIconClick()V", 0, 17));
        this.n = b;
        addView(b);
        com.facebook.t tVar = new com.facebook.t(26);
        WeakHashMap weakHashMap = bsk.a;
        srk.c(this, tVar);
    }

    @Nullable
    public final Function0<Unit> getExtraOnClick() {
        return this.h;
    }

    @Nullable
    public final Function2<com.moloco.sdk.xenoss.sdkdevkit.android.core.services.d, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.c, Unit> getOnButtonReplaced() {
        return this.i;
    }

    @Nullable
    public final Function1<Boolean, Unit> getOnMuteChange() {
        return this.g;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ad2 c = s9a.c(kotlin.coroutines.e.d(bea.a(), o));
        this.m = c;
        rq3 rq3Var = null;
        xw3.L(c, null, null, new d0(this, rq3Var, 0), 3);
        xw3.L(c, null, null, new d0(this, rq3Var, 1), 3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ad2 ad2Var = this.m;
        if (ad2Var != null) {
            s9a.o(ad2Var, null);
        }
        this.m = null;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            getLocationInWindow(new int[2]);
            this.k = new com.moloco.sdk.xenoss.sdkdevkit.android.core.services.g(r4[0] / Resources.getSystem().getDisplayMetrics().density, r4[1] / Resources.getSystem().getDisplayMetrics().density);
            com.moloco.sdk.xenoss.sdkdevkit.android.core.services.h hVar = new com.moloco.sdk.xenoss.sdkdevkit.android.core.services.h((i3 - i) / Resources.getSystem().getDisplayMetrics().density, (i4 - i2) / Resources.getSystem().getDisplayMetrics().density);
            this.l = hVar;
            com.moloco.sdk.xenoss.sdkdevkit.android.core.services.c cVar = this.j ? com.moloco.sdk.xenoss.sdkdevkit.android.core.services.c.e : com.moloco.sdk.xenoss.sdkdevkit.android.core.services.c.d;
            Function2 function2 = this.i;
            if (function2 != null) {
                function2.invoke(new com.moloco.sdk.xenoss.sdkdevkit.android.core.services.d(cVar, this.k, hVar), cVar);
            }
        }
    }

    public final void setExtraOnClick(@Nullable Function0<Unit> function0) {
        this.h = function0;
    }

    public final void setOnButtonReplaced(@Nullable Function2<? super com.moloco.sdk.xenoss.sdkdevkit.android.core.services.d, ? super com.moloco.sdk.xenoss.sdkdevkit.android.core.services.c, Unit> function2) {
        this.i = function2;
    }

    public final void setOnMuteChange(@Nullable Function1<? super Boolean, Unit> function1) {
        this.g = function1;
    }
}
