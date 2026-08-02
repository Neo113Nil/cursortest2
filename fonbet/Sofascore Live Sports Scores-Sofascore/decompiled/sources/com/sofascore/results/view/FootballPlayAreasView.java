package com.sofascore.results.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.a56;
import defpackage.ao2;
import defpackage.gc6;
import defpackage.hkg;
import defpackage.jk8;
import defpackage.kk8;
import defpackage.mz1;
import defpackage.qui;
import defpackage.td4;
import defpackage.wzb;
import defpackage.z1g;
import defpackage.z31;
import defpackage.zzl;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\u0006R\u001a\u0010\r\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0010\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\fR\u001a\u0010\u0013\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\n\u001a\u0004\b\u0012\u0010\f¨\u0006\u0014"}, d2 = {"Lcom/sofascore/results/view/FootballPlayAreasView;", "Lz31;", "Landroid/graphics/Canvas;", "canvas", "", "setTeamAreasAndPercentages", "(Landroid/graphics/Canvas;)V", "setAttackingAreas", "", "y", "F", "getPenaltyAreaHalfWidth", "()F", "penaltyAreaHalfWidth", "z", "getPenaltyAreaHeight", "penaltyAreaHeight", "A", "getGoalSpace", "goalSpace", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FootballPlayAreasView extends z31 {

    /* renamed from: A, reason: from kotlin metadata */
    public final float goalSpace;
    public gc6 i;
    public boolean j;
    public jk8 k;
    public boolean l;
    public final boolean m;
    public final Paint n;
    public final Paint o;
    public final Paint p;
    public final Paint q;
    public final int r;
    public final int s;
    public final int t;
    public final int u;
    public final int v;
    public float w;
    public float x;

    /* renamed from: y, reason: from kotlin metadata */
    public final float penaltyAreaHalfWidth;

    /* renamed from: z, reason: from kotlin metadata */
    public final float penaltyAreaHeight;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FootballPlayAreasView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Typeface typeface;
        context.getClass();
        this.j = true;
        this.m = hkg.c0(context);
        Paint paint = new Paint();
        try {
            typeface = z1g.a(R.font.sofascore_sans_bold, context);
        } catch (Exception unused) {
            typeface = Typeface.DEFAULT;
        }
        paint.setTypeface(typeface);
        paint.setColor(context.getColor(R.color.n_lv_1));
        paint.setTextSize(ao2.H(18, context));
        this.n = paint;
        Paint paint2 = new Paint();
        paint2.setStyle(Paint.Style.FILL);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setColor(context.getColor(R.color.surface_1));
        this.o = paint2;
        this.p = new Paint();
        this.q = new Paint();
        this.r = ao2.s(12, context);
        this.s = ao2.s(9, context);
        this.t = ao2.s(8, context);
        this.u = ao2.s(6, context);
        this.v = ao2.s(5, context);
        this.penaltyAreaHalfWidth = ao2.u(46, context);
        this.penaltyAreaHeight = ao2.u(36, context);
        this.goalSpace = ao2.u(22, context);
        setWillNotDraw(false);
    }

    public static int c(float f) {
        double d = f;
        if (d < 0.15d) {
            return 38;
        }
        if (d > 0.5d) {
            return 229;
        }
        return (int) (((((d - 0.15d) / 0.35d) * 0.75d) + 0.15000000596046448d) * 255.0d);
    }

    public static int d(Context context, float f) {
        double d = f;
        return ao2.s(d >= 0.1d ? d > 0.5d ? Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE : 24 + ((int) (((d - 0.1d) / 0.4d) * 100.0d)) : 24, context);
    }

    private final void setAttackingAreas(Canvas canvas) {
        gc6 gc6Var = this.i;
        if (gc6Var == null) {
            return;
        }
        qui quiVar = gc6Var.e;
        int i = quiVar.c;
        int i2 = quiVar.b;
        int i3 = quiVar.a;
        qui quiVar2 = gc6Var.d;
        int i4 = quiVar2.c;
        int i5 = quiVar2.b;
        int i6 = quiVar2.a;
        Integer valueOf = Integer.valueOf(i6 + i5 + i4);
        Drawable drawable = null;
        if (!this.j) {
            valueOf = null;
        }
        int intValue = valueOf != null ? valueOf.intValue() : i3 + i2 + i;
        Integer valueOf2 = Integer.valueOf(i6);
        if (!this.j) {
            valueOf2 = null;
        }
        if (valueOf2 != null) {
            i = valueOf2.intValue();
        }
        Integer valueOf3 = Integer.valueOf(i5);
        if (!this.j) {
            valueOf3 = null;
        }
        if (valueOf3 != null) {
            i2 = valueOf3.intValue();
        }
        Integer valueOf4 = Integer.valueOf(i4);
        if (!this.j) {
            valueOf4 = null;
        }
        if (valueOf4 != null) {
            i3 = valueOf4.intValue();
        }
        Context context = getContext();
        context.getClass();
        float f = intValue;
        int d = d(context, i / f);
        Context context2 = getContext();
        context2.getClass();
        int d2 = d(context2, i2 / f);
        Context context3 = getContext();
        context3.getClass();
        int d3 = d(context3, i3 / f);
        Drawable d0 = td4.d0(R.drawable.ic_chevron_new, getContext());
        if (d0 != null) {
            d0.setColorFilter(new PorterDuffColorFilter(getContext().getColor(R.color.surface_1), PorterDuff.Mode.SRC_IN));
            drawable = d0;
        }
        boolean z = this.m;
        boolean z2 = (z && this.j) || !(z || this.j);
        float f2 = this.w;
        int i7 = this.v;
        float f3 = f2 / 2.0f;
        float f4 = d;
        float f5 = z2 ? (f3 - f4) + i7 : (f3 + f4) - i7;
        float f6 = f2 / 2.0f;
        float f7 = d2;
        float f8 = z2 ? (f6 - f7) + i7 : (f6 + f7) - i7;
        float f9 = f2 / 2.0f;
        float f10 = d3;
        float f11 = z2 ? (f9 - f10) + i7 : (f9 + f10) - i7;
        float f12 = f2 / 2.0f;
        float f13 = this.x / 6.0f;
        canvas.drawLine(f12, f13, z ? f11 : f5, f13, getLinePaint());
        float f14 = this.w / 2.0f;
        float f15 = this.x / 2.0f;
        canvas.drawLine(f14, f15, f8, f15, getLinePaint());
        float f16 = this.w / 2.0f;
        float f17 = (this.x * 5.0f) / 6.0f;
        canvas.drawLine(f16, f17, z ? f5 : f11, f17, getLinePaint());
        if (drawable != null) {
            int save = canvas.save();
            if (z2) {
                try {
                    canvas.scale(-1.0f, 1.0f, this.w / 2.0f, this.x / 2.0f);
                } catch (Throwable th) {
                    canvas.restoreToCount(save);
                    throw th;
                }
            }
            f(canvas, drawable, (int) ((this.w / 2.0f) + (z ? d3 : d)), (int) (this.x / 6.0f));
            f(canvas, drawable, (int) ((this.w / 2.0f) + d2), (int) (this.x / 2.0f));
            float f18 = this.w / 2.0f;
            if (!z) {
                d = d3;
            }
            f(canvas, drawable, (int) (f18 + d), (int) ((5.0f * this.x) / 6.0f));
            canvas.restoreToCount(save);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x010e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void setTeamAreasAndPercentages(Canvas canvas) {
        int i;
        gc6 gc6Var = this.i;
        if (gc6Var != null) {
            Integer num = (Integer) CollectionsKt.k0(gc6Var.b.a);
            int intValue = num != null ? num.intValue() : 0;
            Integer num2 = (Integer) CollectionsKt.k0(gc6Var.c.a);
            i = Math.max(intValue, num2 != null ? num2.intValue() : 0);
        } else {
            i = 1;
        }
        for (int i2 = 0; i2 < 9; i2++) {
            gc6 gc6Var2 = this.i;
            List list = null;
            if (gc6Var2 != null) {
                List list2 = gc6Var2.b.a;
                if (!this.j) {
                    list2 = null;
                }
                if (list2 != null) {
                    list = list2;
                    int intValue2 = ((list == null ? ((Number) list.get(i2)).intValue() : 0) * 255) / i;
                    boolean z = this.m;
                    switch (i2) {
                        case 0:
                            if (z) {
                                e(canvas, (this.w * 2.0f) / 3.0f, (2.0f * this.x) / 3.0f, intValue2);
                                break;
                            } else {
                                e(canvas, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, intValue2);
                                break;
                            }
                        case 1:
                            if (z) {
                                e(canvas, (2.0f * this.w) / 3.0f, this.x / 3.0f, intValue2);
                                break;
                            } else {
                                e(canvas, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.x / 3.0f, intValue2);
                                break;
                            }
                        case 2:
                            if (z) {
                                e(canvas, (2.0f * this.w) / 3.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, intValue2);
                                break;
                            } else {
                                e(canvas, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (2.0f * this.x) / 3.0f, intValue2);
                                break;
                            }
                        case 3:
                            float f = this.w / 3.0f;
                            if (z) {
                                e(canvas, f, (2.0f * this.x) / 3.0f, intValue2);
                                break;
                            } else {
                                e(canvas, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, intValue2);
                                break;
                            }
                        case 4:
                            e(canvas, this.w / 3.0f, this.x / 3.0f, intValue2);
                            break;
                        case 5:
                            float f2 = this.w / 3.0f;
                            if (z) {
                                e(canvas, f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, intValue2);
                                break;
                            } else {
                                e(canvas, f2, (2.0f * this.x) / 3.0f, intValue2);
                                break;
                            }
                        case 6:
                            if (z) {
                                e(canvas, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (2.0f * this.x) / 3.0f, intValue2);
                                break;
                            } else {
                                e(canvas, (2.0f * this.w) / 3.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, intValue2);
                                break;
                            }
                        case 7:
                            if (z) {
                                e(canvas, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.x / 3.0f, intValue2);
                                break;
                            } else {
                                e(canvas, (2.0f * this.w) / 3.0f, (1.0f * this.x) / 3.0f, intValue2);
                                break;
                            }
                        case 8:
                            if (z) {
                                e(canvas, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, intValue2);
                                break;
                            } else {
                                e(canvas, (this.w * 2.0f) / 3.0f, (2.0f * this.x) / 3.0f, intValue2);
                                break;
                            }
                    }
                }
            }
            if (gc6Var2 != null) {
                list = gc6Var2.c.a;
            }
            int intValue22 = ((list == null ? ((Number) list.get(i2)).intValue() : 0) * 255) / i;
            boolean z2 = this.m;
            switch (i2) {
            }
        }
    }

    @Override // defpackage.z31
    public final void b(Canvas canvas) {
        canvas.drawRect(getGoalSpace() + (-getPenaltyAreaHalfWidth()), -this.t, getPenaltyAreaHalfWidth() - getGoalSpace(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, getLinePaint());
        Context context = getContext();
        context.getClass();
        canvas.drawCircle(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, ao2.u(-26, context), 3.0f, getLinePaint());
        canvas.clipOutRect(-getPenaltyAreaHalfWidth(), -getPenaltyAreaHeight(), getPenaltyAreaHalfWidth(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        Context context2 = getContext();
        context2.getClass();
        canvas.drawCircle(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, ao2.u(-26, context2), this.x / 9.0f, getLinePaint());
    }

    public final void e(Canvas canvas, float f, float f2, int i) {
        Paint paint = this.q;
        paint.setAlpha(i);
        canvas.drawRect(f, f2, (this.w / 3.0f) + f, (this.x / 3.0f) + f2, paint);
    }

    public final void f(Canvas canvas, Drawable drawable, int i, int i2) {
        int i3 = i - (this.v * 2);
        int i4 = this.s;
        drawable.setBounds(i3, i2 - i4, i, i2 + i4);
        drawable.draw(canvas);
    }

    public final void g(Canvas canvas, int i, float f) {
        String i2 = mz1.i(i, "%");
        Paint paint = this.n;
        float measureText = paint.measureText(i2);
        Context context = getContext();
        context.getClass();
        float u = ao2.u(48, context);
        if (measureText >= u) {
            u = measureText;
        }
        float f2 = u / 2.0f;
        Context context2 = getContext();
        context2.getClass();
        float u2 = ao2.u(32, context2) / 2.0f;
        float f3 = this.x / 2.0f;
        float f4 = this.t;
        canvas.drawRoundRect(f - f2, f3 - u2, f + f2, f3 + u2, f4, f4, this.o);
        canvas.drawText(i2, f - (measureText / 2.0f), (this.x / 2.0f) + this.u, paint);
    }

    @Override // defpackage.z31
    public float getGoalSpace() {
        return this.goalSpace;
    }

    @Override // defpackage.z31
    public float getPenaltyAreaHalfWidth() {
        return this.penaltyAreaHalfWidth;
    }

    @Override // defpackage.z31
    public float getPenaltyAreaHeight() {
        return this.penaltyAreaHeight;
    }

    public final void h(gc6 gc6Var, jk8 jk8Var, boolean z) {
        int i;
        gc6Var.getClass();
        this.i = gc6Var;
        this.j = jk8Var == jk8.a;
        this.k = jk8Var;
        this.l = z;
        int ordinal = jk8Var.ordinal();
        int i2 = R.color.home_primary;
        if (ordinal == 0) {
            i = R.color.home_primary;
        } else if (ordinal == 1) {
            i = R.color.away_primary;
        } else {
            if (ordinal != 2) {
                zzl.b();
                return;
            }
            i = R.color.terrain_football;
        }
        int i3 = jk8Var == jk8.c ? 255 : 76;
        Paint.Style style = Paint.Style.FILL;
        Paint paint = this.p;
        paint.setStyle(style);
        paint.setColor(getContext().getColor(i));
        paint.setAlpha(i3);
        int ordinal2 = jk8Var.ordinal();
        if (ordinal2 != 0) {
            if (ordinal2 == 1) {
                i2 = R.color.away_primary;
            } else {
                if (ordinal2 != 2) {
                    zzl.b();
                    return;
                }
                i2 = R.color.value;
            }
        }
        Paint paint2 = this.q;
        paint2.setStyle(style);
        paint2.setColor(getContext().getColor(i2));
        invalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0181  */
    @Override // defpackage.z31, android.widget.LinearLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        Drawable d0;
        int i;
        int i2;
        float f;
        int i3;
        int i4;
        Double valueOf;
        canvas.getClass();
        float width = getWidth();
        this.w = width;
        float f2 = (188.0f * width) / 278.0f;
        this.x = f2;
        canvas.drawRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, width, f2, this.p);
        jk8 jk8Var = this.k;
        int i5 = jk8Var == null ? -1 : kk8.a[jk8Var.ordinal()];
        if (i5 != -1) {
            if (i5 == 1 || i5 == 2) {
                canvas2 = canvas;
                setTeamAreasAndPercentages(canvas);
                setAttackingAreas(canvas);
                super.onDraw(canvas);
            } else {
                if (i5 != 3) {
                    zzl.b();
                    return;
                }
                gc6 gc6Var = this.i;
                if (gc6Var != null) {
                    a56 a56Var = gc6Var.a;
                    double d = a56Var.a;
                    double d2 = a56Var.b;
                    double d3 = a56Var.c;
                    float f3 = (float) (d / ((d + d2) + d3));
                    float f4 = (float) (d2 / ((d + d2) + d3));
                    float f5 = (float) (d3 / ((d + d2) + d3));
                    int c = c(f3);
                    int c2 = c(f4);
                    int c3 = c(f5);
                    boolean z = this.m;
                    int i6 = z ? c3 : c;
                    Paint paint = this.q;
                    paint.setAlpha(i6);
                    canvas.drawRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.w / 3.0f, this.x, paint);
                    paint.setAlpha(c2);
                    float f6 = this.w;
                    canvas.drawRect(f6 / 3.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (f6 * 2.0f) / 3.0f, this.x, paint);
                    if (!z) {
                        c = c3;
                    }
                    paint.setAlpha(c);
                    float f7 = this.w;
                    canvas2 = canvas;
                    canvas2.drawRect((2.0f * f7) / 3.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f7, this.x, paint);
                    super.onDraw(canvas);
                    Unit unit = Unit.a;
                    int b = wzb.b(f3 * 100.0f);
                    int b2 = wzb.b(f4 * 100.0f);
                    int b3 = wzb.b(f5 * 100.0f);
                    int i7 = b + b2 + b3;
                    if (i7 != 100) {
                        double d4 = b % 100.0d;
                        double d5 = b2 % 100.0d;
                        double d6 = b3 % 100.0d;
                        f = 2.0f;
                        List j = b.j(Double.valueOf(d4), Double.valueOf(d5), Double.valueOf(d6));
                        if (i7 == 99) {
                            i = b3;
                            i2 = b;
                            Double l0 = CollectionsKt.l0(j);
                            if (Intrinsics.a(l0, d4)) {
                                i3 = i2 + 1;
                                i4 = i;
                            } else if (Intrinsics.a(l0, d5)) {
                                b2++;
                            } else if (Intrinsics.a(l0, d6)) {
                                i4 = i + 1;
                                i3 = i2;
                            }
                        } else if (i7 != 101) {
                            i = b3;
                            i2 = b;
                        } else {
                            j.getClass();
                            Iterator it = j.iterator();
                            if (it.hasNext()) {
                                double doubleValue = ((Number) it.next()).doubleValue();
                                while (it.hasNext()) {
                                    doubleValue = Math.min(doubleValue, ((Number) it.next()).doubleValue());
                                    b = b;
                                    b3 = b3;
                                }
                                i = b3;
                                i2 = b;
                                valueOf = Double.valueOf(doubleValue);
                            } else {
                                valueOf = null;
                                i = b3;
                                i2 = b;
                            }
                            if (Intrinsics.a(valueOf, d4)) {
                                i3 = i2 - 1;
                                i4 = i;
                            } else if (Intrinsics.a(valueOf, d5)) {
                                b2--;
                            } else if (Intrinsics.a(valueOf, d6)) {
                                i4 = i - 1;
                                i3 = i2;
                            }
                        }
                        g(canvas2, !z ? i4 : i3, this.w / 6.0f);
                        g(canvas2, b2, this.w / f);
                        if (z) {
                            i4 = i3;
                        }
                        g(canvas2, i4, (5.0f * this.w) / 6.0f);
                    } else {
                        i = b3;
                        i2 = b;
                        f = 2.0f;
                    }
                    i3 = i2;
                    i4 = i;
                    g(canvas2, !z ? i4 : i3, this.w / 6.0f);
                    g(canvas2, b2, this.w / f);
                    if (z) {
                    }
                    g(canvas2, i4, (5.0f * this.w) / 6.0f);
                }
            }
            float f8 = this.u;
            canvas2.drawCircle(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f8, getLinePaint());
            canvas2.drawCircle(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.x, f8, getLinePaint());
            canvas2.drawCircle(this.w, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f8, getLinePaint());
            canvas2.drawCircle(this.w, this.x, f8, getLinePaint());
            if (this.l || (d0 = td4.d0(R.drawable.ic_watermark_sofascore, getContext())) == null) {
            }
            int i8 = (int) this.x;
            int i9 = this.r;
            Context context = getContext();
            context.getClass();
            d0.setBounds(i9, (i8 - i9) - i9, ao2.s(72, context) + i9, ((int) this.x) - i9);
            d0.setColorFilter(new PorterDuffColorFilter(getContext().getColor(R.color.n_lv_4), PorterDuff.Mode.SRC_IN));
            d0.draw(canvas2);
            return;
        }
        canvas2 = canvas;
        float f82 = this.u;
        canvas2.drawCircle(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f82, getLinePaint());
        canvas2.drawCircle(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.x, f82, getLinePaint());
        canvas2.drawCircle(this.w, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f82, getLinePaint());
        canvas2.drawCircle(this.w, this.x, f82, getLinePaint());
        if (this.l) {
        }
    }
}
