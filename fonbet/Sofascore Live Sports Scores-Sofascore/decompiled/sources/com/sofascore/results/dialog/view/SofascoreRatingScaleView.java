package com.sofascore.results.dialog.view;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import com.appsflyer.internal.AFa1zSDK;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import defpackage.ao2;
import defpackage.dvh;
import defpackage.fvh;
import defpackage.gvh;
import defpackage.hkg;
import defpackage.ht9;
import defpackage.jrg;
import defpackage.mz1;
import defpackage.p7g;
import defpackage.pic;
import defpackage.q0;
import defpackage.qn2;
import defpackage.ug5;
import defpackage.xah;
import defpackage.z1g;
import defpackage.z8e;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.collections.b;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/sofascore/results/dialog/view/SofascoreRatingScaleView;", "Landroid/view/View;", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SofascoreRatingScaleView extends View {
    public static final /* synthetic */ int A = 0;
    public final List a;
    public final List b;
    public final List c;
    public final Paint d;
    public final Paint e;
    public final Paint f;
    public final TextPaint g;
    public final TextPaint h;
    public final Paint i;
    public final ArgbEvaluator j;
    public float k;
    public final float l;
    public final float m;
    public final float n;
    public final float o;
    public final RectF p;
    public final Path q;
    public final Path r;
    public double s;
    public String t;
    public gvh u;
    public Bitmap v;
    public int w;
    public float x;
    public final ValueAnimator y;
    public final Rect z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SofascoreRatingScaleView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        context.getClass();
        this.a = b.j("3.0", "6.0", "6.5", AFa1zSDK.d, "8.0", "9.0");
        this.b = b.j(Double.valueOf(3.0d), Double.valueOf(6.0d), Double.valueOf(6.5d), Double.valueOf(7.0d), Double.valueOf(8.0d), Double.valueOf(9.0d), Double.valueOf(10.0d));
        this.c = b.j(Integer.valueOf(context.getColor(R.color.rating_10)), Integer.valueOf(context.getColor(R.color.rating_60)), Integer.valueOf(context.getColor(R.color.rating_65)), Integer.valueOf(context.getColor(R.color.rating_70)), Integer.valueOf(context.getColor(R.color.rating_80)), Integer.valueOf(context.getColor(R.color.rating_90)));
        this.d = new Paint();
        this.e = new Paint();
        Paint paint = new Paint();
        paint.setColor(context.getColor(R.color.n_lv_1));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(ao2.u(2, context));
        this.f = paint;
        this.g = new TextPaint();
        TextPaint textPaint = new TextPaint();
        textPaint.setTypeface(z1g.a(R.font.sofascore_sans_bold_condensed, context));
        textPaint.setTextSize(ao2.u(14, context));
        textPaint.setTextAlign(Paint.Align.CENTER);
        this.h = textPaint;
        Paint paint2 = new Paint();
        paint2.setColor(context.getColor(R.color.n_lv_1));
        paint2.setStrokeWidth(ao2.u(2, context));
        this.i = paint2;
        this.j = new ArgbEvaluator();
        this.l = ao2.u(4, context);
        this.m = ao2.u(8, context);
        this.n = ao2.u(16, context);
        float u = ao2.u(40, context);
        this.o = u;
        this.p = new RectF();
        this.q = new Path();
        Path path = new Path();
        float strokeWidth = paint.getStrokeWidth() / 2.0f;
        float f = hkg.c0(context) ? -u : u;
        if (hkg.c0(context)) {
            float f2 = f + strokeWidth;
            float f3 = u / 2.0f;
            path.moveTo(f2, f3);
            path.lineTo(f2, strokeWidth);
            float f4 = -strokeWidth;
            path.lineTo(f4, strokeWidth);
            path.moveTo(f2, u);
            path.lineTo(f4, u);
            path.lineTo(f4, f3);
        } else {
            float f5 = u / 2.0f;
            path.moveTo(strokeWidth, f5);
            path.lineTo(strokeWidth, strokeWidth);
            path.lineTo(u, strokeWidth);
            float f6 = u - strokeWidth;
            path.moveTo(f6, f5);
            path.lineTo(f6, u);
            path.lineTo(strokeWidth, u);
        }
        this.r = path;
        this.s = 3.0d;
        this.t = "3.00";
        ValueAnimator ofFloat = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        ofFloat.setDuration(1400L);
        ofFloat.addUpdateListener(new dvh(this, 1));
        this.y = ofFloat;
        this.z = new Rect();
    }

    public final ht9 a(String str, int i, Function1 function1) {
        Context context = getContext();
        context.getClass();
        ht9 ht9Var = new ht9(context);
        ht9Var.c = str;
        ht9Var.q = jrg.b;
        ht9Var.f = str;
        ht9Var.c(str);
        Context context2 = getContext();
        context2.getClass();
        z8e.Q(ht9Var, context2, R.drawable.team_logo_placeholder, null, Integer.valueOf(R.color.neutral_default));
        pic picVar = new pic();
        picVar.c = function1;
        picVar.a = i;
        picVar.d = this;
        picVar.e = function1;
        picVar.b = i;
        ht9Var.d = picVar;
        return ht9Var;
    }

    public final int b(float f, List list) {
        if (list.isEmpty()) {
            return 0;
        }
        int size = (int) ((list.size() - 1) * f);
        int i = size + 1;
        float size2 = (f - (size / (list.size() - 1))) * (list.size() - 1);
        Object obj = list.get(size);
        Integer num = (Integer) CollectionsKt.a0(i, list);
        Object evaluate = this.j.evaluate(size2, obj, Integer.valueOf(num != null ? num.intValue() : ((Number) mz1.g(1, list)).intValue()));
        evaluate.getClass();
        return ((Integer) evaluate).intValue();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f;
        int i;
        float f2;
        float f3;
        float measuredWidth;
        float width;
        canvas.getClass();
        super.onDraw(canvas);
        gvh gvhVar = this.u;
        int i2 = gvhVar == null ? -1 : fvh.a[gvhVar.ordinal()];
        TextPaint textPaint = this.g;
        float f4 = this.m;
        Rect rect = this.z;
        float f5 = this.n;
        Paint paint = this.d;
        List list = this.c;
        float f6 = this.o;
        if (i2 != 1) {
            i = 1;
            if (i2 == 2 || i2 == 3 || i2 == 4 || i2 == 5) {
                canvas.save();
                if (this.v != null) {
                    measuredWidth = getMeasuredWidth() / 2.0f;
                    f2 = 2.0f;
                    width = (2.0f * f6) + f4 + rect.width() + f5;
                } else {
                    f2 = 2.0f;
                    measuredWidth = getMeasuredWidth() / 2.0f;
                    width = f6 + f4 + rect.width();
                }
                float f7 = measuredWidth - (width / f2);
                Context context = getContext();
                context.getClass();
                if (hkg.c0(context)) {
                    f7 = getWidth() - f7;
                }
                canvas.translate(f7, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                paint.setColor(b(this.k, CollectionsKt.w0(list.subList(0, this.w + 1), a.c(0))));
                Context context2 = getContext();
                context2.getClass();
                boolean c0 = hkg.c0(context2);
                float f8 = this.o;
                f = f6;
                f3 = 0.0f;
                canvas.drawRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, c0 ? -f8 : f8, f8, paint);
                Context context3 = getContext();
                context3.getClass();
                float f9 = f + f4;
                if (hkg.c0(context3)) {
                    f9 = (f9 * (-1.0f)) - rect.width();
                }
                canvas.drawText(this.t, f9, f - ((f - rect.height()) / f2), textPaint);
                Context context4 = getContext();
                context4.getClass();
                float width2 = hkg.c0(context4) ? -((f2 * f) + f4 + f5 + rect.width()) : rect.width() + f + f4 + f5;
                Bitmap bitmap = this.v;
                if (bitmap != null) {
                    canvas.drawBitmap(bitmap, width2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (Paint) null);
                }
                canvas.drawPath(this.r, this.f);
                canvas.restore();
            } else {
                f = f6;
                f3 = 0.0f;
                f2 = 2.0f;
            }
        } else {
            f = f6;
            i = 1;
            f2 = 2.0f;
            f3 = 0.0f;
            paint.setColor(b(this.k, list.subList(0, this.w + 1)));
            canvas.save();
            canvas.translate((getMeasuredWidth() / 2.0f) - (f / 2.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            float f10 = this.o;
            canvas.drawRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f10, f10, paint);
            canvas.drawText(this.t, Math.abs((f - rect.width()) / 2.0f), f - ((f - rect.height()) / 2.0f), textPaint);
            canvas.restore();
        }
        RectF rectF = this.p;
        float width3 = rectF.width() / 6.0f;
        Context context5 = getContext();
        context5.getClass();
        float f11 = hkg.c0(context5) ? width3 * 5.0f : f3;
        canvas.translate(f4, f + f5 + f4);
        canvas.save();
        p7g p7gVar = new p7g();
        p7g p7gVar2 = new p7g();
        p7g p7gVar3 = new p7g();
        p7g p7gVar4 = new p7g();
        ug5 ug5Var = new ug5();
        ug5 ug5Var2 = new ug5();
        ug5 ug5Var3 = new ug5();
        ug5 ug5Var4 = new ug5();
        float f12 = f11;
        float f13 = this.l;
        q0 q0Var = new q0(f13);
        q0 q0Var2 = new q0(f13);
        q0 q0Var3 = new q0(f13);
        q0 q0Var4 = new q0(f13);
        xah xahVar = new xah();
        xahVar.a = p7gVar;
        xahVar.b = p7gVar2;
        xahVar.c = p7gVar3;
        xahVar.d = p7gVar4;
        xahVar.e = q0Var;
        xahVar.f = q0Var2;
        xahVar.g = q0Var3;
        xahVar.h = q0Var4;
        xahVar.i = ug5Var;
        xahVar.j = ug5Var2;
        xahVar.k = ug5Var3;
        xahVar.l = ug5Var4;
        rectF.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, getWidth() - (f4 * f2), f5);
        qn2 qn2Var = new qn2(3);
        Path path = this.q;
        qn2Var.c(xahVar, null, 1.0f, rectF, null, path);
        canvas.clipPath(path);
        Iterator it = list.iterator();
        float f14 = f12;
        while (it.hasNext()) {
            int intValue = ((Number) it.next()).intValue();
            Paint paint2 = this.e;
            paint2.setColor(intValue);
            canvas.drawRect(f14, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f14 + width3, this.n, paint2);
            Context context6 = getContext();
            context6.getClass();
            f14 += width3 * (hkg.c0(context6) ? -1 : i);
        }
        canvas.restore();
        Context context7 = getContext();
        context7.getClass();
        float f15 = hkg.c0(context7) ? width3 * 6.0f : 0.0f;
        Iterator it2 = list.iterator();
        int i3 = 0;
        while (true) {
            boolean hasNext = it2.hasNext();
            TextPaint textPaint2 = this.h;
            if (!hasNext) {
                canvas.drawText("10", f15, f5 * f2, textPaint2);
                double d = this.s;
                if (d < 10.0d || (this.k < 1.0f && d == 10.0d)) {
                    Context context8 = getContext();
                    context8.getClass();
                    float size = hkg.c0(context8) ? (width3 * list.size()) - (this.k * this.x) : this.k * this.x;
                    canvas.drawLine(size, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, size, this.n, this.i);
                    return;
                }
                return;
            }
            Object next = it2.next();
            int i4 = i3 + 1;
            if (i3 < 0) {
                b.q();
                throw null;
            }
            textPaint2.setColor(((Number) next).intValue());
            canvas.drawText((String) this.a.get(i3), f15, f5 * f2, textPaint2);
            Context context9 = getContext();
            context9.getClass();
            f15 += width3 * (hkg.c0(context9) ? -1 : i);
            i3 = i4;
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            float width = getWidth() - (this.m * 2.0f);
            float f = this.n;
            RectF rectF = this.p;
            rectF.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, width, f);
            this.x = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            int i5 = 0;
            this.w = 0;
            float width2 = rectF.width() / 6.0f;
            List list = this.b;
            int i6 = b.i(list);
            int i7 = 0;
            while (true) {
                if (i7 < i6) {
                    Double d = (Double) CollectionsKt.a0(i7, list);
                    double doubleValue = d != null ? d.doubleValue() : 3.0d;
                    i7++;
                    Double d2 = (Double) CollectionsKt.a0(i7, list);
                    double doubleValue2 = d2 != null ? d2.doubleValue() : doubleValue;
                    double d3 = this.s;
                    if (d3 >= doubleValue && d3 < doubleValue2) {
                        this.x = (width2 * ((float) ((d3 - doubleValue) / (doubleValue2 - doubleValue)))) + this.x;
                        break;
                    } else {
                        this.x += width2;
                        this.w = Math.min(i7, b.i(this.c));
                    }
                } else {
                    break;
                }
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(3.0f, (float) this.s);
            ofFloat.setInterpolator(new DecelerateInterpolator());
            ofFloat.setDuration(1400L);
            ofFloat.addUpdateListener(new dvh(this, i5));
            ofFloat.start();
            this.y.start();
        }
    }
}
