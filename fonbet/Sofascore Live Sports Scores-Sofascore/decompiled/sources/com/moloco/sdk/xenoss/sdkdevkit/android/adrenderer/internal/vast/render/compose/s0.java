package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Parcelable;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.w;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import defpackage.ad2;
import defpackage.bea;
import defpackage.fn0;
import defpackage.hs4;
import defpackage.r69;
import defpackage.rob;
import defpackage.rq3;
import defpackage.s9a;
import defpackage.xw3;
import defpackage.z45;
import defpackage.z88;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class s0 extends View {
    public static final r69 n;
    public final z88 a;
    public final z88 b;
    public final Paint c;
    public final float d;
    public final long e;
    public final DecelerateInterpolator f;
    public float g;
    public float h;
    public ValueAnimator i;
    public ad2 j;
    public boolean k;
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.o l;
    public Boolean m;

    static {
        hs4 hs4Var = z45.a;
        n = rob.a;
    }

    public s0(Context context, z88 z88Var, z88 z88Var2, int i, int i2, int i3) {
        super(context);
        this.a = z88Var;
        this.b = z88Var2;
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(i);
        this.c = paint;
        this.d = getResources().getDimension(R.dimen.moloco_vast_progress_bar_corner_radius);
        this.e = getResources().getInteger(R.integer.moloco_animated_visibility_fade_duration_ms);
        this.f = new DecelerateInterpolator();
        setId(R.id.moloco_vast_progress_bar_id);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, getResources().getDimensionPixelSize(R.dimen.moloco_vast_progress_bar_height), i2);
        layoutParams.setMargins(i3, i3, i3, i3);
        setLayoutParams(layoutParams);
        setVisibility(8);
        setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.l = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.l.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        boolean z;
        final s0 s0Var;
        ValueAnimator valueAnimator;
        if (!this.k) {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.o oVar = this.l;
            if (!(oVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.m) || ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.m) oVar).a <= 0) {
                z = false;
                if (Boolean.valueOf(z).equals(this.m)) {
                    this.m = Boolean.valueOf(z);
                    s0Var = this;
                    f1.n(s0Var, z, this.e, this.f, null);
                } else {
                    s0Var = this;
                }
                float max = Math.max(com.moloco.sdk.internal.publisher.h0.s(s0Var.l), s0Var.h);
                valueAnimator = s0Var.i;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                s0Var.g = max;
                s0Var.h = max;
                s0Var.invalidate();
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.o oVar2 = s0Var.l;
                if (s0Var.k || !(oVar2 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.m)) {
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(max, 1.0f);
                ofFloat.setDuration(com.moloco.sdk.internal.publisher.h0.u(oVar2));
                ofFloat.setInterpolator(new LinearInterpolator());
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.o0
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        float floatValue = ((Float) fn0.i(valueAnimator2)).floatValue();
                        s0 s0Var2 = s0.this;
                        s0Var2.g = floatValue;
                        s0Var2.h = floatValue;
                        s0Var2.invalidate();
                    }
                });
                ofFloat.start();
                s0Var.i = ofFloat;
                return;
            }
        }
        z = true;
        if (Boolean.valueOf(z).equals(this.m)) {
        }
        float max2 = Math.max(com.moloco.sdk.internal.publisher.h0.s(s0Var.l), s0Var.h);
        valueAnimator = s0Var.i;
        if (valueAnimator != null) {
        }
        s0Var.g = max2;
        s0Var.h = max2;
        s0Var.invalidate();
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.o oVar22 = s0Var.l;
        if (s0Var.k) {
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ad2 c = s9a.c(kotlin.coroutines.e.d(bea.a(), n));
        this.j = c;
        rq3 rq3Var = null;
        xw3.L(c, null, null, new r0(this, rq3Var, 0), 3);
        xw3.L(c, null, null, new r0(this, rq3Var, 1), 3);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.i;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.i = null;
        ad2 ad2Var = this.j;
        if (ad2Var != null) {
            s9a.o(ad2Var, null);
        }
        this.j = null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.getClass();
        super.onDraw(canvas);
        float width = this.g * getWidth();
        float height = getHeight();
        float f = this.d;
        canvas.drawRoundRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, width, height, f, f, this.c);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof w.b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        w.b bVar = (w.b) parcelable;
        super.onRestoreInstanceState(bVar.getSuperState());
        float f = bVar.a;
        this.h = f;
        this.g = f;
        invalidate();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        w.b bVar = new w.b(super.onSaveInstanceState());
        bVar.a = this.h;
        return bVar;
    }

    public final void setBarColor(int i) {
        this.c.setColor(i);
        invalidate();
    }
}
