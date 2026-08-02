package com.sofascore.results.view.graph;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.ironsource.U3;
import com.sofascore.model.mvvm.model.Point2D;
import com.sofascore.model.newNetwork.AttributeOverviewData;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import defpackage.ao2;
import defpackage.dti;
import defpackage.hkg;
import defpackage.k13;
import defpackage.km5;
import defpackage.lm5;
import defpackage.qm0;
import defpackage.s2;
import defpackage.sc5;
import defpackage.z1g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.collections.b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000bR@\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00022\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00028\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/sofascore/results/view/graph/AttributeOverviewGraph;", "Landroid/view/View;", "", "", "", U3.i.X, "B", "Ljava/util/Map;", "getAttributesMap", "()Ljava/util/Map;", "attributesMap", "qm0", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AttributeOverviewGraph extends View {
    public static final /* synthetic */ int G = 0;
    public final float A;

    /* renamed from: B, reason: from kotlin metadata */
    public Map attributesMap;
    public List C;
    public List D;
    public float E;
    public final ValueAnimator F;
    public final boolean a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public int g;
    public Integer h;
    public Integer i;
    public Integer j;
    public Integer k;
    public final Paint l;
    public final Paint m;
    public final Paint n;
    public final Paint o;
    public final TextPaint p;
    public final TextPaint q;
    public boolean r;
    public final Path s;
    public final RectF t;
    public List u;
    public Point2D v;
    public final RectF w;
    public final float x;
    public final float y;
    public final float z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AttributeOverviewGraph(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Typeface typeface;
        Typeface typeface2;
        context.getClass();
        this.a = hkg.c0(context);
        this.b = context.getColor(R.color.neutral_default);
        this.c = context.getColor(R.color.home_primary);
        this.d = context.getColor(R.color.away_primary);
        this.e = context.getColor(R.color.surface_1);
        this.f = context.getColor(R.color.surface_2);
        int i = 1;
        Paint paint = new Paint(1);
        paint.setColor(context.getColor(R.color.surface_2));
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.l = paint;
        Paint paint2 = new Paint(1);
        paint2.setStyle(style);
        this.m = paint2;
        Paint paint3 = new Paint(1);
        paint3.setStrokeWidth(ao2.u(2, context));
        paint3.setStyle(Paint.Style.STROKE);
        this.n = paint3;
        this.o = new Paint();
        TextPaint textPaint = new TextPaint();
        try {
            typeface = z1g.a(R.font.sofascore_sans_bold_condensed, context);
        } catch (Exception unused) {
            typeface = Typeface.DEFAULT;
        }
        textPaint.setTypeface(typeface);
        textPaint.setColor(context.getColor(R.color.surface_1));
        textPaint.setTextSize(ao2.u(12, context));
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setLetterSpacing(-0.04f);
        this.p = textPaint;
        TextPaint textPaint2 = new TextPaint();
        try {
            typeface2 = z1g.a(R.font.sofascore_sans_medium, context);
        } catch (Exception unused2) {
            typeface2 = Typeface.DEFAULT;
        }
        textPaint2.setTypeface(typeface2);
        textPaint2.setColor(context.getColor(R.color.n_lv_3));
        textPaint2.setTextSize(ao2.u(12, context));
        this.q = textPaint2;
        this.s = new Path();
        this.t = new RectF();
        km5 km5Var = km5.a;
        this.u = km5Var;
        this.v = new Point2D(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.w = new RectF(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, ao2.u(20, context), ao2.u(20, context));
        this.x = ao2.u(172, context);
        this.y = ao2.u(164, context);
        this.z = ao2.u(28, context);
        this.A = ao2.u(4, context);
        lm5 lm5Var = lm5.a;
        lm5Var.getClass();
        this.attributesMap = lm5Var;
        this.C = km5Var;
        this.D = km5Var;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        ofFloat.setDuration(300L);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new s2(this, i));
        this.F = ofFloat;
    }

    public static void d(AttributeOverviewGraph attributeOverviewGraph, AttributeOverviewData attributeOverviewData, int i, qm0 qm0Var, boolean z, int i2) {
        List list;
        int i3 = attributeOverviewGraph.d;
        if ((i2 & 2) != 0) {
            i = i3;
        }
        if ((i2 & 8) != 0) {
            z = true;
        }
        int i4 = attributeOverviewGraph.e;
        int i5 = attributeOverviewGraph.b;
        int i6 = attributeOverviewGraph.c;
        int i7 = attributeOverviewGraph.f;
        attributeOverviewGraph.E = z ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (attributeOverviewData == null) {
            attributeOverviewGraph.r = false;
            attributeOverviewGraph.D = km5.a;
            return;
        }
        attributeOverviewGraph.r = z;
        attributeOverviewGraph.g = i;
        if (attributeOverviewData == null || (list = CollectionsKt.S0(dti.q(attributeOverviewData).values())) == null) {
            list = km5.a;
        }
        attributeOverviewGraph.D = list;
        int ordinal = qm0Var.ordinal();
        if (ordinal == 1) {
            attributeOverviewGraph.h = Integer.valueOf(i6);
            attributeOverviewGraph.i = Integer.valueOf(i5);
            attributeOverviewGraph.j = Integer.valueOf(i4);
            attributeOverviewGraph.k = Integer.valueOf(i4);
        } else if (ordinal != 2) {
            attributeOverviewGraph.h = null;
            attributeOverviewGraph.i = null;
            attributeOverviewGraph.j = null;
            attributeOverviewGraph.k = null;
        } else {
            attributeOverviewGraph.h = Integer.valueOf(i7);
            attributeOverviewGraph.i = Integer.valueOf(i7);
            attributeOverviewGraph.j = Integer.valueOf(i6);
            attributeOverviewGraph.k = attributeOverviewData != null ? Integer.valueOf(i3) : Integer.valueOf(i5);
        }
        attributeOverviewGraph.invalidate();
    }

    public final void a(List list, Canvas canvas, int i, float f) {
        if (list.isEmpty()) {
            return;
        }
        Paint paint = this.m;
        paint.setColor(i);
        paint.setAlpha((int) (38.0f * f));
        b(list, canvas, paint);
        Paint paint2 = this.n;
        paint2.setColor(i);
        paint2.setAlpha((int) (255.0f * f));
        b(list, canvas, paint2);
    }

    public final void b(List list, Canvas canvas, Paint paint) {
        Path path = this.s;
        path.reset();
        List list2 = this.u;
        ArrayList arrayList = new ArrayList(k13.r(list2, 10));
        int i = 0;
        for (Object obj : list2) {
            int i2 = i + 1;
            Point2D point2D = null;
            if (i < 0) {
                b.q();
                throw null;
            }
            Point2D point2D2 = (Point2D) obj;
            Integer num = (Integer) CollectionsKt.a0(i, list);
            if (num != null) {
                float intValue = num.intValue() / 100.0f;
                point2D = new Point2D(((point2D2.getX() - this.v.getX()) * intValue) + this.v.getX(), ((point2D2.getY() - this.v.getY()) * intValue) + this.v.getY());
            }
            arrayList.add(point2D);
            i = i2;
        }
        ArrayList W = CollectionsKt.W(arrayList);
        if (!W.isEmpty()) {
            path.moveTo(((Point2D) W.get(0)).getX(), ((Point2D) W.get(0)).getY());
        }
        int size = this.u.size();
        for (int i3 = 1; i3 < size; i3++) {
            path.lineTo(((Point2D) W.get(i3)).getX(), ((Point2D) W.get(i3)).getY());
        }
        path.close();
        canvas.drawPath(path, paint);
    }

    public final void c(AttributeOverviewData attributeOverviewData) {
        setEnabled(true);
        if (attributeOverviewData != null) {
            LinkedHashMap q = dti.q(attributeOverviewData);
            this.attributesMap = q;
            this.C = CollectionsKt.S0(q.values());
            invalidate();
        }
    }

    @NotNull
    public final Map<String, Integer> getAttributesMap() {
        return this.attributesMap;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.F.cancel();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f;
        float f2;
        float f3;
        String valueOf;
        int color;
        float f4;
        float f5;
        float f6;
        String str;
        canvas.getClass();
        super.onDraw(canvas);
        float f7 = 2.0f;
        float width = (getWidth() / 2.0f) - this.v.getX();
        Path path = this.s;
        path.reset();
        Iterator it = CollectionsKt.X0(this.attributesMap.entrySet()).iterator();
        while (true) {
            sc5 sc5Var = (sc5) it;
            boolean hasNext = sc5Var.b.hasNext();
            f = this.z;
            if (!hasNext) {
                break;
            }
            IndexedValue indexedValue = (IndexedValue) sc5Var.next();
            int i = indexedValue.a;
            Map.Entry entry = (Map.Entry) indexedValue.b;
            Point2D point2D = (Point2D) this.u.get(i);
            float x = point2D.getX() + width;
            float y = point2D.getY() + f;
            float f8 = this.A;
            RectF rectF = this.w;
            Point2D point2D2 = i != 1 ? (i == 2 || i == 3) ? new Point2D(x - rectF.centerX(), y + f8) : i != 4 ? new Point2D(x - rectF.centerX(), (y - rectF.height()) - f8) : new Point2D((x - rectF.width()) - f8, y - rectF.centerY()) : new Point2D(x + f8, y - rectF.centerY());
            canvas.save();
            String str2 = (String) entry.getKey();
            Integer num = (Integer) entry.getValue();
            if (num == null || (valueOf = String.valueOf(num.intValue())) == null) {
                f2 = width;
                f3 = f7;
            } else {
                float width2 = rectF.width();
                f3 = f7;
                float f9 = width2 + f8;
                boolean z = this.r;
                boolean z2 = this.a;
                canvas.translate((z && z2 && i <= 2) ? point2D2.getX() + f9 : (!z || z2 || i < 3) ? point2D2.getX() : point2D2.getX() - f9, point2D2.getY());
                Integer num2 = this.h;
                if (num2 != null) {
                    color = num2.intValue();
                } else {
                    Context context = getContext();
                    context.getClass();
                    int intValue = num.intValue();
                    color = context.getColor(intValue >= 90 ? R.color.rating_90 : intValue >= 80 ? R.color.rating_80 : intValue >= 70 ? R.color.rating_70 : intValue >= 60 ? R.color.rating_65 : R.color.neutral_default);
                }
                Paint paint = this.o;
                paint.setColor(color);
                Integer num3 = this.j;
                int i2 = this.e;
                int intValue2 = num3 != null ? num3.intValue() : i2;
                TextPaint textPaint = this.p;
                textPaint.setColor(intValue2);
                canvas.drawRoundRect(rectF, f8, f8, paint);
                float f10 = width2 / f3;
                f2 = width;
                canvas.drawText(valueOf, f10, (rectF.height() / f3) - ((textPaint.ascent() + textPaint.descent()) / f3), textPaint);
                if (this.r) {
                    Integer num4 = (Integer) CollectionsKt.a0(i, this.D);
                    if (num4 == null || (str = String.valueOf(num4.intValue())) == null) {
                        str = "-";
                    }
                    f5 = z2 ? -f9 : f9;
                    canvas.save();
                    f4 = f9;
                    canvas.translate(f5, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    Integer num5 = this.i;
                    paint.setColor(num5 != null ? num5.intValue() : this.b);
                    canvas.drawRoundRect(rectF, f8, f8, paint);
                    Integer num6 = this.k;
                    if (num6 != null) {
                        i2 = num6.intValue();
                    }
                    textPaint.setColor(i2);
                    canvas.drawText(str, f10, (rectF.height() / f3) - ((textPaint.ascent() + textPaint.descent()) / f3), textPaint);
                    canvas.restore();
                } else {
                    f4 = f9;
                    f5 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                }
                TextPaint textPaint2 = this.q;
                if (1 > i || i >= 3) {
                    f6 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    float f11 = -f8;
                    if (!z2) {
                        f5 = 0.0f;
                    }
                    canvas.translate(f11 + f5, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    textPaint2.setTextAlign(Paint.Align.RIGHT);
                } else {
                    float f12 = z2 ? f4 : f5 + f4;
                    f6 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    canvas.translate(f12, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    textPaint2.setTextAlign(Paint.Align.LEFT);
                }
                canvas.drawText(str2, f6, (rectF.height() / f3) - ((textPaint.ascent() + textPaint.descent()) / f3), textPaint2);
            }
            canvas.restore();
            f7 = f3;
            width = f2;
        }
        float f13 = width;
        float f14 = f7;
        if (!this.u.isEmpty()) {
            path.moveTo(((Point2D) this.u.get(0)).getX() + f13, ((Point2D) this.u.get(0)).getY() + f);
        }
        int size = this.u.size();
        for (int i3 = 1; i3 < size; i3++) {
            path.lineTo(((Point2D) this.u.get(i3)).getX() + f13, ((Point2D) this.u.get(i3)).getY() + f);
        }
        path.close();
        path.computeBounds(this.t, true);
        canvas.drawPath(path, this.l);
        canvas.translate((getWidth() / f14) - this.v.getX(), f);
        a(this.C, canvas, this.c, 1.0f);
        a(this.D, canvas, this.g, this.E);
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            double tan = Math.tan(0.6283185307179586d);
            float f = this.x;
            double d = f;
            double d2 = (tan * d) / 2.0d;
            double sqrt = Math.sqrt(Math.pow(d2, 2.0d) + ((float) Math.pow(r4, 2.0d)));
            double d3 = (d - sqrt) / 2.0d;
            this.v = new Point2D(d / 2.0d, sqrt / (Math.sin(0.6283185307179586d) * 2.0d));
            Point2D point2D = new Point2D(f / 2.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            float f2 = (float) d2;
            Point2D point2D2 = new Point2D(f, f2);
            float f3 = (float) d3;
            float f4 = this.y;
            this.u = b.j(point2D, point2D2, new Point2D(f - f3, f4), new Point2D(f3, f4), new Point2D(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2));
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null && motionEvent.getActionMasked() == 1) {
            if (this.t.contains(motionEvent.getX(), motionEvent.getY())) {
                performClick();
            }
        }
        return true;
    }

    @Override // android.view.View
    public final boolean performClick() {
        super.performClick();
        if (!isEnabled()) {
            return false;
        }
        float f = this.E;
        ValueAnimator valueAnimator = this.F;
        if (f == 1.0f) {
            valueAnimator.reverse();
        } else {
            valueAnimator.start();
        }
        invalidate();
        return true;
    }
}
