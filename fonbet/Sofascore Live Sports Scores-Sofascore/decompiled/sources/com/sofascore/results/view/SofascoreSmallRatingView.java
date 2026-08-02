package com.sofascore.results.view;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.appcompat.widget.AppCompatTextView;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.ao2;
import defpackage.b2;
import defpackage.e6b;
import defpackage.g6b;
import defpackage.gse;
import defpackage.haa;
import defpackage.km5;
import defpackage.kpg;
import defpackage.lnb;
import defpackage.lvh;
import defpackage.me4;
import defpackage.p6;
import defpackage.qea;
import defpackage.tj;
import defpackage.ujf;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.text.b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\"\u0010\u000e\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\u0010\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\t\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\r¨\u0006\u0012"}, d2 = {"Lcom/sofascore/results/view/SofascoreSmallRatingView;", "Landroidx/appcompat/widget/AppCompatTextView;", "", CampaignEx.JSON_KEY_STAR, "", "setRatingWithoutAnimation", "(Ljava/lang/Double;)V", "", "t", "Z", "getShouldAnimate", "()Z", "setShouldAnimate", "(Z)V", "shouldAnimate", "u", "isAvgRating", "setAvgRating", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SofascoreSmallRatingView extends AppCompatTextView {
    public static final /* synthetic */ int w = 0;
    public double h;
    public long i;
    public float j;
    public float k;
    public float l;
    public float m;
    public final float n;
    public int o;
    public final Paint p;
    public final Paint q;
    public final Paint r;
    public final Paint s;

    /* renamed from: t, reason: from kotlin metadata */
    public boolean shouldAnimate;

    /* renamed from: u, reason: from kotlin metadata */
    public boolean isAvgRating;
    public AnimatorSet v;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SofascoreSmallRatingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, R.attr.sofascoreSmallRatingStyle);
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        this.i = 300L;
        this.j = 1.0f;
        this.m = -1.0f;
        float u = ao2.u(6, context);
        this.n = u;
        Paint paint = new Paint();
        paint.setColor(0);
        this.p = paint;
        this.q = new Paint();
        Paint paint2 = new Paint();
        paint2.setColor(context.getColor(R.color.n_lv_1));
        paint2.setStrokeWidth(ao2.u(1, context));
        this.r = paint2;
        Paint paint3 = new Paint();
        paint3.setStrokeCap(Paint.Cap.SQUARE);
        paint3.setStrokeWidth(u);
        paint3.setColor(-1);
        this.s = paint3;
        this.shouldAnimate = true;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ujf.r, R.attr.sofascoreSmallRatingStyle, 0);
        this.shouldAnimate = obtainStyledAttributes.getBoolean(0, true);
        this.isAvgRating = obtainStyledAttributes.getBoolean(1, false);
        obtainStyledAttributes.recycle();
        if (isInEditMode()) {
            this.j = 1.0f;
        }
        setGravity(17);
    }

    public static void k(SofascoreSmallRatingView sofascoreSmallRatingView, Double d, int i) {
        boolean z = (i & 2) != 0;
        boolean z2 = (i & 4) == 0;
        if (d == null) {
            sofascoreSmallRatingView.j();
            sofascoreSmallRatingView.shouldAnimate = false;
            return;
        }
        sofascoreSmallRatingView.h = d.doubleValue();
        if (sofascoreSmallRatingView.shouldAnimate) {
            if (!sofascoreSmallRatingView.isLaidOut() || sofascoreSmallRatingView.isLayoutRequested()) {
                sofascoreSmallRatingView.addOnLayoutChangeListener(new b2(sofascoreSmallRatingView, 14));
            } else {
                g6b t = qea.t(sofascoreSmallRatingView);
                if (t != null) {
                    if (t.b().compareTo(e6b.e) >= 0) {
                        Double valueOf = Double.valueOf(sofascoreSmallRatingView.h);
                        AnimatorSet animatorSet = sofascoreSmallRatingView.v;
                        if (animatorSet != null) {
                            animatorSet.cancel();
                        }
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        animatorSet2.playTogether(sofascoreSmallRatingView.i(valueOf, true));
                        animatorSet2.start();
                        AnimatorSet animatorSet3 = sofascoreSmallRatingView.v;
                        if (animatorSet3 != null) {
                            animatorSet3.cancel();
                        }
                        sofascoreSmallRatingView.v = animatorSet2;
                        sofascoreSmallRatingView.setShouldAnimate(false);
                    } else {
                        t.a(new gse(t, sofascoreSmallRatingView, sofascoreSmallRatingView, 2));
                    }
                }
            }
        }
        if (sofascoreSmallRatingView.shouldAnimate) {
            return;
        }
        sofascoreSmallRatingView.i = z2 ? 300L : 0L;
        AnimatorSet animatorSet4 = sofascoreSmallRatingView.v;
        if (animatorSet4 != null) {
            animatorSet4.cancel();
        }
        AnimatorSet animatorSet5 = new AnimatorSet();
        animatorSet5.playTogether(sofascoreSmallRatingView.i(d, z));
        animatorSet5.start();
        AnimatorSet animatorSet6 = sofascoreSmallRatingView.v;
        if (animatorSet6 != null) {
            animatorSet6.cancel();
        }
        sofascoreSmallRatingView.v = animatorSet5;
    }

    public static void l(SofascoreSmallRatingView sofascoreSmallRatingView, String str) {
        str.getClass();
        k(sofascoreSmallRatingView, b.f(str), 4);
    }

    public final ArrayList g(double d, double d2) {
        haa.E(this);
        ArrayList arrayList = new ArrayList();
        if (d2 == 10.0d) {
            arrayList.add(h(1.0f, -1.0f, 3 * this.i, new lvh(this, 2)));
        } else {
            this.m = -1.0f;
        }
        arrayList.add(h((float) d, (float) d2, this.i, new tj(this, this.isAvgRating ? 2 : 1, 11)));
        return arrayList;
    }

    public final boolean getShouldAnimate() {
        return this.shouldAnimate;
    }

    public final ValueAnimator h(float f, float f2, long j, Function1 function1) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f, f2);
        ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        ofFloat.setDuration(j);
        ofFloat.addUpdateListener(new p6(function1, this));
        return ofFloat;
    }

    public final List i(Double d, boolean z) {
        if (d == null) {
            if (z) {
                j();
            } else {
                setVisibility(8);
            }
            return km5.a;
        }
        this.h = d.doubleValue();
        ArrayList arrayList = new ArrayList();
        this.o = 0;
        Context context = getContext();
        context.getClass();
        this.p.setColor(kpg.u(context, d.doubleValue(), Integer.valueOf(this.isAvgRating ? 2 : 1)));
        arrayList.add(h(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, this.i, new lvh(this, 0)));
        if (d.doubleValue() > 0.0d) {
            arrayList.addAll(g(5.0d, d.doubleValue()));
            return arrayList;
        }
        haa.E(this);
        this.j = 1.0f;
        setText("—");
        return arrayList;
    }

    public final void j() {
        this.o = 0;
        Context context = getContext();
        context.getClass();
        this.p.setColor(kpg.u(context, 0.0d, null));
        this.j = 1.0f;
        this.k = 1.0f;
        this.l = 1.0f;
        setText("—");
        haa.E(this);
        invalidate();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        float f = this.n;
        Paint paint = this.s;
        canvas.getClass();
        float height = getHeight() / 2.0f;
        float width = getWidth() / 2.0f;
        int i = this.o;
        Paint paint2 = this.p;
        if (i == 0) {
            canvas.drawRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (1.0f - this.j) * getHeight(), getWidth(), getHeight(), paint2);
        } else {
            canvas.drawRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, getWidth(), getHeight(), paint2);
            int i2 = this.o;
            Paint paint3 = this.q;
            if (i2 == 1) {
                canvas.drawRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (1.0f - this.j) * getHeight(), getWidth(), getHeight(), paint3);
            } else if (i2 == 2) {
                canvas.drawRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, getWidth(), getHeight() * this.j, paint3);
            }
        }
        if (this.m > -1.0f) {
            int save = canvas.save();
            canvas.rotate(45.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            try {
                paint.setStrokeWidth(f);
                paint.setAlpha(Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE);
                canvas.drawLine(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.m * (canvas.getWidth() + f), canvas.getWidth() + f, this.m * (canvas.getHeight() + f), paint);
                paint.setStrokeWidth((1.0f - this.m) * (f / 2.0f));
                paint.setAlpha(255);
                canvas.drawLine(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (this.m + 0.38f) * (canvas.getHeight() + height), canvas.getWidth() + f, (this.m + 0.38f) * (canvas.getHeight() + height), paint);
            } finally {
                canvas.restoreToCount(save);
            }
        }
        if (this.isAvgRating) {
            Paint paint4 = this.r;
            float strokeWidth = paint4.getStrokeWidth() / 2.0f;
            float f2 = this.l;
            canvas.drawLine(strokeWidth, me4.b(1.0f, f2, height, height), strokeWidth, (1.0f - f2) * width, paint4);
            canvas.drawLine(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, strokeWidth, width * this.k, strokeWidth, paint4);
            float width2 = getWidth() - strokeWidth;
            canvas.drawLine(width2, height * this.l, width2, getHeight() * this.l, paint4);
            canvas.drawLine(getWidth(), getHeight() - strokeWidth, getWidth() - (width * this.k), getHeight() - strokeWidth, paint4);
        }
        super.onDraw(canvas);
    }

    public final void setAvgRating(boolean z) {
        this.isAvgRating = z;
    }

    public final void setRatingWithoutAnimation(@Nullable Double rating) {
        int i = this.isAvgRating ? 2 : 1;
        if (rating == null) {
            j();
            return;
        }
        this.j = 1.0f;
        this.k = 1.0f;
        this.l = 1.0f;
        Context context = getContext();
        context.getClass();
        this.p.setColor(kpg.u(context, rating.doubleValue(), null));
        setText(String.format(Locale.US, rating.doubleValue() > 9.899999618530273d ? "%.0f" : lnb.k(i, "%.", InneractiveMediationDefs.GENDER_FEMALE), Arrays.copyOf(new Object[]{rating}, 1)));
        haa.E(this);
        invalidate();
    }

    public final void setShouldAnimate(boolean z) {
        this.shouldAnimate = z;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SofascoreSmallRatingView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }
}
