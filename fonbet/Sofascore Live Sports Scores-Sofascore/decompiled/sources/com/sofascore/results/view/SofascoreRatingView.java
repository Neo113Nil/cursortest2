package com.sofascore.results.view;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.appcompat.widget.AppCompatTextView;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.ao2;
import defpackage.b2;
import defpackage.deh;
import defpackage.dti;
import defpackage.e6b;
import defpackage.g6b;
import defpackage.gse;
import defpackage.hkg;
import defpackage.hvh;
import defpackage.ivh;
import defpackage.jvh;
import defpackage.kpg;
import defpackage.kvh;
import defpackage.me4;
import defpackage.mqi;
import defpackage.qea;
import defpackage.qed;
import defpackage.s2;
import defpackage.t0d;
import defpackage.ujf;
import defpackage.ypa;
import defpackage.yv4;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012R+\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00028B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0006R\u001b\u0010\u001f\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\"\u0010'\u001a\u00020 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010+\u001a\u00020 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010\"\u001a\u0004\b)\u0010$\"\u0004\b*\u0010&¨\u0006,"}, d2 = {"Lcom/sofascore/results/view/SofascoreRatingView;", "Landroidx/appcompat/widget/AppCompatTextView;", "", "color", "", "setEdgeLineColor", "(I)V", "Lp75;", "size", "setRatingSize-0680j_4", "(F)V", "setRatingSize", "", CampaignEx.JSON_KEY_STAR, "setRating", "(Ljava/lang/String;)V", "", "setRatingWithoutAnimation", "(D)V", "<set-?>", "v", "Lznf;", "getLineColor", "()I", "setLineColor", "lineColor", "Landroid/graphics/Paint;", "w", "Ljoa;", "getLinePaint", "()Landroid/graphics/Paint;", "linePaint", "", "y", "Z", "getShouldAnimate", "()Z", "setShouldAnimate", "(Z)V", "shouldAnimate", "z", "getAllowZeroRating", "setAllowZeroRating", "allowZeroRating", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SofascoreRatingView extends AppCompatTextView {
    public static final /* synthetic */ KProperty[] A = {new t0d(SofascoreRatingView.class, "lineColor", "getLineColor()I", 0)};
    public AnimatorSet h;
    public double i;
    public long j;
    public long k;
    public float l;
    public float m;
    public float n;
    public float o;
    public final float p;
    public float q;
    public final int r;
    public int s;
    public final Paint t;
    public final Paint u;
    public final qed v;
    public final mqi w;
    public final Paint x;

    /* renamed from: y, reason: from kotlin metadata */
    public boolean shouldAnimate;

    /* renamed from: z, reason: from kotlin metadata */
    public boolean allowZeroRating;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SofascoreRatingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, R.attr.sofascoreRatingStyle);
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        this.j = 300L;
        this.o = 1.0f;
        float u = ao2.u(6, context);
        this.p = u;
        this.q = ao2.u(16, context);
        int s = ao2.s(4, context);
        this.r = s;
        this.t = new Paint();
        this.u = new Paint();
        yv4.a.getClass();
        this.v = new qed();
        this.w = ypa.b(new deh(8, this, context));
        Paint paint = new Paint();
        paint.setStrokeCap(Paint.Cap.SQUARE);
        paint.setStrokeWidth(u);
        paint.setColor(-1);
        this.x = paint;
        this.shouldAnimate = true;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ujf.q, R.attr.sofascoreRatingStyle, 0);
        this.shouldAnimate = obtainStyledAttributes.getBoolean(2, true);
        this.allowZeroRating = obtainStyledAttributes.getBoolean(1, false);
        setLineColor(obtainStyledAttributes.getColor(3, context.getColor(R.color.n_lv_1)));
        setTextColor(obtainStyledAttributes.getColor(0, context.getColor(R.color.n_lv_1)));
        obtainStyledAttributes.recycle();
        if (isInEditMode()) {
            this.l = 1.0f;
            this.m = 1.0f;
            this.n = 1.0f;
        }
        setText("-");
        setGravity(16);
        setPaddingRelative(((int) this.q) + s, getPaddingTop(), getPaddingEnd(), getPaddingBottom());
        if (!isLaidOut() || isLayoutRequested()) {
            addOnLayoutChangeListener(new b2(this, 13));
            return;
        }
        g6b t = qea.t(this);
        if (t != null) {
            if (t.b().compareTo(e6b.e) < 0) {
                t.a(new gse(t, this, this, 1));
                return;
            }
            if (getShouldAnimate()) {
                if (this.i != 0.0d || getAllowZeroRating()) {
                    g(this.i);
                    setShouldAnimate(false);
                }
            }
        }
    }

    private final int getLineColor() {
        return ((Number) this.v.getValue(this, A[0])).intValue();
    }

    private final Paint getLinePaint() {
        return (Paint) this.w.getValue();
    }

    public static ValueAnimator h(float f, float f2, long j, long j2, Function1 function1) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f, f2);
        ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        ofFloat.setStartDelay(j2);
        ofFloat.setDuration(j);
        ofFloat.addUpdateListener(new s2(function1, 18));
        return ofFloat;
    }

    public static final Paint l(SofascoreRatingView sofascoreRatingView, Context context) {
        Paint paint = new Paint();
        paint.setColor(sofascoreRatingView.getLineColor());
        paint.setStrokeWidth(ao2.u(1, context));
        return paint;
    }

    private final void setLineColor(int i) {
        this.v.setValue(this, A[0], Integer.valueOf(i));
    }

    public final void g(double d) {
        this.s = 0;
        ArrayList arrayList = new ArrayList();
        int i = 1;
        ValueAnimator k = k(d, this.t, true);
        if (k != null) {
            arrayList.add(k);
        }
        if (d > 9.99d) {
            arrayList.add(i(d));
        }
        long j = this.j;
        arrayList.add(h(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, j, j + this.k, new hvh(this, i)));
        arrayList.add(h(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, this.j, this.k, new hvh(this, 2)));
        arrayList.add(j(5.0d, d));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        animatorSet.start();
        this.h = animatorSet;
    }

    public final boolean getAllowZeroRating() {
        return this.allowZeroRating;
    }

    public final boolean getShouldAnimate() {
        return this.shouldAnimate;
    }

    public final ValueAnimator i(double d) {
        String n = dti.n(d, 0);
        float measureText = getPaint().measureText(dti.n(9.99d, 2)) + this.q;
        float f = this.r;
        float f2 = measureText + f;
        float measureText2 = getPaint().measureText(n) + this.q + f;
        long j = this.j;
        return h(f2, measureText2, j, j != 0 ? 600 + j : 0L, new hvh(this, 7));
    }

    public final ValueAnimator j(double d, double d2) {
        if (d2 == 10.0d) {
            h(1.0f, -1.0f, 800L, 200L, new hvh(this, 5));
        }
        long j = this.j * 2;
        long j2 = this.k;
        hvh hvhVar = new hvh(this, 6);
        ValueAnimator ofObject = ValueAnimator.ofObject(new ivh(), Double.valueOf(d), Double.valueOf(d2));
        ofObject.setInterpolator(new AccelerateDecelerateInterpolator());
        ofObject.setStartDelay(j2);
        ofObject.setDuration(j);
        ofObject.addUpdateListener(new s2(hvhVar, 19));
        return ofObject;
    }

    public final ValueAnimator k(double d, Paint paint, boolean z) {
        String n = d > 9.99d ? dti.n(d, 0) : dti.n(d, 2);
        float measureText = getPaint().measureText(n) + this.q;
        float f = this.r;
        float f2 = measureText + f;
        float measureText2 = getPaint().measureText(dti.n(9.99d, 2)) + this.q + f;
        TextPaint paint2 = getPaint();
        CharSequence text = getText();
        if (text.length() == 0) {
            text = "-";
        }
        float measureText3 = paint2.measureText(text.toString()) + this.q + f;
        setWidth((int) Math.max(measureText3, f2));
        this.k = 0L;
        Context context = getContext();
        context.getClass();
        int u = kpg.u(context, d, 2);
        if (d == 10.0d) {
            this.k = this.j != 0 ? 300L : 0L;
            if (z) {
                if (!Intrinsics.c(getText(), n)) {
                    setText("");
                }
                this.l = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                this.m = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                this.n = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                this.o = 1.0f;
            }
            paint.setColor(u);
            return h(measureText3, measureText2, this.j, 0L, new hvh(this, 3));
        }
        if (getWidth() > 0 && getWidth() != f2) {
            this.k = this.j != 0 ? 300L : 0L;
            if (z && !Intrinsics.c(getText(), n)) {
                setText("");
            }
            ValueAnimator h = h(getWidth(), f2, this.j, 0L, new hvh(this, 4));
            h.addListener(new jvh(paint, u, z, this));
            return h;
        }
        paint.setColor(u);
        if (!z) {
            return null;
        }
        this.l = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.m = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.n = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.o = 1.0f;
        return null;
    }

    public final void m(double d, boolean z) {
        AnimatorSet animatorSet;
        AnimatorSet animatorSet2 = this.h;
        if (Intrinsics.c(animatorSet2 != null ? Boolean.valueOf(animatorSet2.isRunning()) : null, Boolean.TRUE) && (animatorSet = this.h) != null) {
            animatorSet.cancel();
        }
        setVisibility((d > 0.0d ? 1 : (d == 0.0d ? 0 : -1)) > 0 || this.allowZeroRating ? 0 : 8);
        this.i = d;
        if (this.shouldAnimate) {
            return;
        }
        this.j = z ? 300L : 0L;
        g(d);
    }

    public final void n(double d) {
        if (this.i == d || this.shouldAnimate) {
            return;
        }
        int i = 0;
        setVisibility((d > 0.0d || this.allowZeroRating) ? 0 : 8);
        this.j = 300L;
        this.l = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.s = d > this.i ? 1 : 2;
        ArrayList arrayList = new ArrayList();
        ValueAnimator k = k(d, this.u, false);
        if (k != null) {
            arrayList.add(k);
        }
        if (d > 9.99d) {
            arrayList.add(i(d));
        }
        ValueAnimator h = h(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, this.j, this.k, new hvh(this, i));
        h.addListener(new kvh(this, d));
        arrayList.add(h);
        arrayList.add(j(this.i, d));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        animatorSet.start();
        this.h = animatorSet;
        this.i = d;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        float f = this.p;
        Paint paint = this.x;
        canvas.getClass();
        super.onDraw(canvas);
        Context context = getContext();
        context.getClass();
        float width = hkg.c0(context) ? getWidth() - this.q : 0.0f;
        float f2 = this.q;
        float f3 = f2 / 2.0f;
        canvas.translate(width, (getHeight() / 2.0f) - (f2 / 2.0f));
        float f4 = this.q;
        canvas.clipRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f4, f4);
        int i = this.s;
        Paint paint2 = this.t;
        if (i == 0) {
            float f5 = this.l;
            canvas.drawRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (1.0f - f5) * f3, this.q, (f5 * f3) + f3, paint2);
        } else {
            float f6 = this.q;
            canvas.drawRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f6, f6, paint2);
            int i2 = this.s;
            Paint paint3 = this.u;
            if (i2 == 1) {
                float f7 = this.q;
                canvas.drawRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (1.0f - this.l) * f7, f7, f7, paint3);
            } else if (i2 == 2) {
                float f8 = this.q;
                canvas.drawRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f8, f8 * this.l, paint3);
            }
        }
        if (this.o > -1.0f) {
            int save = canvas.save();
            canvas.rotate(45.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            try {
                paint.setStrokeWidth(f);
                paint.setAlpha(Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE);
                float f9 = this.q;
                float f10 = this.o;
                canvas.drawLine(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (f9 + f) * f10, f9 + f, f10 * (f9 + f), paint);
                paint.setStrokeWidth((1.0f - this.o) * (f / 2.0f));
                paint.setAlpha(255);
                float f11 = this.q;
                float f12 = this.o;
                canvas.drawLine(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (f12 + 0.38f) * (f11 + f3), f + f11, (f12 + 0.38f) * (f11 + f3), paint);
            } finally {
                canvas.restoreToCount(save);
            }
        }
        float strokeWidth = getLinePaint().getStrokeWidth() / 2.0f;
        float f13 = this.m;
        canvas.drawLine(strokeWidth, me4.b(1.0f, f13, f3, f3), strokeWidth, this.q * (1.0f - f13), getLinePaint());
        canvas.drawLine(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, strokeWidth, this.q * this.n, strokeWidth, getLinePaint());
        float f14 = this.q;
        float f15 = f14 - strokeWidth;
        canvas.drawLine(f14, f14 - strokeWidth, (1.0f - this.n) * f14, f14 - strokeWidth, getLinePaint());
        float f16 = this.m;
        canvas.drawLine(f15, f3 * f16, f15, this.q * f16, getLinePaint());
    }

    public final void setAllowZeroRating(boolean z) {
        this.allowZeroRating = z;
    }

    public final void setEdgeLineColor(int color) {
        setLineColor(color);
        getLinePaint().setColor(color);
        invalidate();
    }

    public final void setRating(@NotNull String rating) {
        rating.getClass();
        m(Double.parseDouble(rating), false);
    }

    /* renamed from: setRatingSize-0680j_4, reason: not valid java name */
    public final void m713setRatingSize0680j_4(float size) {
        Context context = getContext();
        context.getClass();
        float u = ao2.u((int) size, context);
        this.q = u;
        setPaddingRelative(((int) u) + this.r, getPaddingTop(), getPaddingEnd(), getPaddingBottom());
    }

    public final void setRatingWithoutAnimation(double rating) {
        setVisibility((rating > 0.0d || this.allowZeroRating) ? 0 : 8);
        this.l = 1.0f;
        this.m = 1.0f;
        this.n = 1.0f;
        Context context = getContext();
        context.getClass();
        this.t.setColor(kpg.u(context, rating, null));
        if (rating > 9.989999771118164d) {
            rating = 10.0d;
        }
        setText(dti.n(rating, 2));
        invalidate();
    }

    public final void setShouldAnimate(boolean z) {
        this.shouldAnimate = z;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SofascoreRatingView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }
}
