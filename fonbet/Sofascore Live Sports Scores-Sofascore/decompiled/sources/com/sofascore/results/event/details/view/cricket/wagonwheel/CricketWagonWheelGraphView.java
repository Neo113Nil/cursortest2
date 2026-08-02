package com.sofascore.results.event.details.view.cricket.wagonwheel;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.ironsource.U3;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import defpackage.ao2;
import defpackage.h14;
import defpackage.i14;
import defpackage.inb;
import defpackage.j14;
import defpackage.k13;
import defpackage.n14;
import defpackage.o13;
import defpackage.o14;
import defpackage.p14;
import defpackage.p6;
import defpackage.q14;
import defpackage.yhk;
import defpackage.z1g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0013R*\u0010\n\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR*\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/sofascore/results/event/details/view/cricket/wagonwheel/CricketWagonWheelGraphView;", "Landroid/view/View;", "Lo14;", U3.i.X, "z", "Lo14;", "getHitsFilterType", "()Lo14;", "setHitsFilterType", "(Lo14;)V", "hitsFilterType", "Lq14;", "A", "Lq14;", "getMode", "()Lq14;", "setMode", "(Lq14;)V", U3.a.t, "i14", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CricketWagonWheelGraphView extends View {
    public static final /* synthetic */ int B = 0;

    /* renamed from: A, reason: from kotlin metadata */
    public q14 mode;
    public final int a;
    public final int b;
    public final int c;
    public final float d;
    public final Paint e;
    public final Paint f;
    public final Paint g;
    public final Paint h;
    public final Paint i;
    public final Paint j;
    public final Paint k;
    public int l;
    public final int m;
    public final int n;
    public final float o;
    public final float p;
    public DashPathEffect q;
    public DashPathEffect r;
    public final ArrayList s;
    public final ArrayList t;
    public final ArrayList u;
    public final LinkedHashMap v;
    public final LinkedHashMap w;
    public boolean x;
    public boolean y;

    /* renamed from: z, reason: from kotlin metadata */
    public o14 hitsFilterType;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CricketWagonWheelGraphView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Typeface typeface;
        context.getClass();
        int color = context.getColor(R.color.surface_1);
        this.a = context.getColor(R.color.cricket_single_runs);
        this.b = context.getColor(R.color.cricket_4s);
        this.c = context.getColor(R.color.cricket_6s);
        float t = ao2.t(context, 1.5f);
        float t2 = ao2.t(context, 2.0f);
        float s = ao2.s(12, context);
        this.d = s;
        Paint paint = new Paint(1);
        paint.setColor(context.getColor(R.color.cricket_terrain));
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.e = paint;
        Paint paint2 = new Paint(1);
        paint2.setColor(context.getColor(R.color.cricket_terrain_secondary));
        paint2.setStyle(style);
        this.f = paint2;
        Paint paint3 = new Paint(1);
        paint3.setColor(color);
        paint3.setStrokeWidth(t);
        this.g = paint3;
        Paint paint4 = new Paint(1);
        paint4.setColor(color);
        paint4.setStrokeWidth(t2);
        this.h = paint4;
        Paint paint5 = new Paint(1);
        paint5.setColor(context.getColor(R.color.surface_1));
        paint5.setStrokeWidth(t);
        paint5.setStyle(Paint.Style.STROKE);
        this.i = paint5;
        Paint paint6 = new Paint(1);
        paint6.setColor(context.getColor(R.color.surface_P));
        paint6.setStyle(Paint.Style.FILL_AND_STROKE);
        this.j = paint6;
        Paint paint7 = new Paint(1);
        paint7.setTextSize(s);
        paint7.setColor(context.getColor(R.color.n_lv_1));
        paint7.setStyle(style);
        try {
            typeface = z1g.a(R.font.sofascore_sans_bold_condensed, context);
        } catch (Exception unused) {
            typeface = Typeface.DEFAULT;
        }
        paint7.setTypeface(typeface);
        paint7.setTextAlign(Paint.Align.CENTER);
        this.k = paint7;
        this.l = ao2.s(280, context);
        this.m = 27;
        this.n = 54;
        this.o = 0.43f;
        this.p = 0.89f;
        this.s = new ArrayList();
        this.t = new ArrayList();
        this.u = new ArrayList();
        this.v = new LinkedHashMap();
        this.w = new LinkedHashMap();
        this.x = true;
        this.y = true;
        this.hitsFilterType = o14.e;
        this.mode = q14.a;
        setWillNotDraw(false);
    }

    public final void a(int i, boolean z) {
        Integer valueOf = Integer.valueOf(i);
        float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        float floatValue = ((Number) this.w.getOrDefault(valueOf, Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT))).floatValue();
        if (this.mode == q14.b && !z) {
            f = 1.0f;
        }
        if (Math.abs(f - floatValue) <= 0.01d) {
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(floatValue, f);
        ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        ofFloat.setDuration(500L);
        ofFloat.addUpdateListener(new h14(this, i, 0));
        ofFloat.addListener(new j14(z, this, i));
        ofFloat.start();
        this.u.add(ofFloat);
    }

    public final void b(Canvas canvas, n14 n14Var) {
        double d;
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        Integer valueOf = Integer.valueOf(n14Var.a);
        float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        float floatValue = ((Number) this.w.getOrDefault(valueOf, Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT))).floatValue();
        String str = n14Var.b;
        int i = n14Var.d;
        float f2 = this.l / 2;
        float f3 = this.p * f2;
        inb inbVar = o14.d;
        if (str.equals("6")) {
            f = f2;
        } else if (str.equals("4")) {
            f = f3;
        } else if (str.equals("regular")) {
            f = (i / 5.0f) * f3;
        }
        float f4 = f * floatValue;
        int i2 = str.equals("6") ? this.c : str.equals("4") ? this.b : this.a;
        Paint paint = this.h;
        paint.setColor(i2);
        int i3 = n14Var.c;
        if (this.y) {
            d = i3;
        } else {
            d = 180.0d - i3;
            if (d < 0.0d) {
                d += 360.0d;
            }
        }
        canvas.drawLine(width, height, (((float) Math.cos(Math.toRadians(d))) * f4) + width, height - (((float) Math.sin(Math.toRadians(d))) * f4), paint);
    }

    public final void c() {
        this.v.clear();
        this.w.clear();
        Iterator it = this.u.iterator();
        while (it.hasNext()) {
            ValueAnimator valueAnimator = (ValueAnimator) it.next();
            valueAnimator.removeAllUpdateListeners();
            valueAnimator.removeAllListeners();
            valueAnimator.cancel();
        }
    }

    public final void d(List list, boolean z) {
        float f;
        Float valueOf = Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        list.getClass();
        if (this.y != z) {
            this.y = z;
            c();
        }
        ArrayList arrayList = this.u;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ValueAnimator valueAnimator = (ValueAnimator) it.next();
            valueAnimator.removeAllUpdateListeners();
            valueAnimator.removeAllListeners();
            valueAnimator.cancel();
        }
        ArrayList arrayList2 = this.t;
        arrayList2.clear();
        ArrayList<p14> arrayList3 = this.s;
        arrayList2.addAll(arrayList3);
        arrayList3.clear();
        arrayList3.addAll(list);
        for (p14 p14Var : arrayList3) {
            ArrayList arrayList4 = new ArrayList();
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                o13.v(((p14) it2.next()).c, arrayList4);
            }
            ArrayList arrayList5 = new ArrayList();
            Iterator it3 = arrayList4.iterator();
            while (it3.hasNext()) {
                Object next = it3.next();
                n14 n14Var = (n14) next;
                o14 o14Var = this.hitsFilterType;
                if (o14Var == o14.e || o14Var.a.equals(n14Var.b)) {
                    arrayList5.add(next);
                }
            }
            ArrayList arrayList6 = new ArrayList(k13.r(arrayList5, 10));
            Iterator it4 = arrayList5.iterator();
            while (it4.hasNext()) {
                arrayList6.add(Integer.valueOf(((n14) it4.next()).a));
            }
            LinkedHashMap linkedHashMap = this.w;
            Set keySet = linkedHashMap.keySet();
            ArrayList arrayList7 = new ArrayList();
            for (Object obj : keySet) {
                int intValue = ((Number) obj).intValue();
                if (!arrayList6.contains(Integer.valueOf(intValue)) && ((Number) linkedHashMap.getOrDefault(Integer.valueOf(intValue), valueOf)).floatValue() > 0.01f) {
                    arrayList7.add(obj);
                }
            }
            i14 i14Var = p14Var.b;
            int i = p14Var.a;
            float floatValue = ((Number) this.v.getOrDefault(i14Var, valueOf)).floatValue();
            if (this.mode != q14.a) {
                f = 0.0f;
            } else {
                float f2 = i;
                Iterator it5 = arrayList3.iterator();
                if (!it5.hasNext()) {
                    yhk.d();
                    return;
                }
                int i2 = ((p14) it5.next()).a;
                while (it5.hasNext()) {
                    int i3 = ((p14) it5.next()).a;
                    if (i2 < i3) {
                        i2 = i3;
                    }
                }
                if (i2 < 1) {
                    i2 = 1;
                }
                f = f2 / i2;
            }
            if (Math.abs(f - floatValue) > 0.01d) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(floatValue, f);
                ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
                ofFloat.setDuration(500L);
                ofFloat.addUpdateListener(new p6(3, this, i14Var));
                ofFloat.start();
                arrayList.add(ofFloat);
            }
            Iterator it6 = arrayList7.iterator();
            while (it6.hasNext()) {
                a(((Number) it6.next()).intValue(), true);
            }
            Iterator it7 = arrayList6.iterator();
            while (it7.hasNext()) {
                a(((Number) it7.next()).intValue(), false);
            }
        }
    }

    @NotNull
    public final o14 getHitsFilterType() {
        return this.hitsFilterType;
    }

    @NotNull
    public final q14 getMode() {
        return this.mode;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2 = canvas;
        canvas2.getClass();
        super.onDraw(canvas);
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        float f = this.l / 2;
        canvas2.drawCircle(width, height, f, this.e);
        ArrayList arrayList = this.s;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            p14 p14Var = (p14) it.next();
            i14 i14Var = p14Var.b;
            float cos = (((float) Math.cos(Math.toRadians(this.y ? i14Var.a : i14Var.b))) * f) + width;
            i14 i14Var2 = p14Var.b;
            float f2 = this.y ? i14Var2.a : i14Var2.b;
            float f3 = width;
            float f4 = height;
            canvas2.drawLine(f3, f4, cos, (((float) Math.sin(Math.toRadians(f2))) * f) + height, this.g);
            canvas2 = canvas;
            height = f4;
            width = f3;
        }
        float f5 = width;
        float f6 = height;
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            i14 i14Var3 = ((p14) it2.next()).b;
            float floatValue = ((Number) this.v.getOrDefault(i14Var3, Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT))).floatValue();
            float width2 = (getWidth() / 2) - ((this.l / 2) * floatValue);
            float width3 = (getWidth() / 2) - ((this.l / 2) * floatValue);
            float width4 = ((this.l / 2) * floatValue) + (getWidth() / 2);
            float width5 = (getWidth() / 2) + ((this.l / 2) * floatValue);
            Paint paint = this.f;
            paint.setAlpha((int) (floatValue * 255.0f));
            canvas.drawArc(width2, width3, width4, width5, this.y ? i14Var3.a : i14Var3.b, i14Var3.c, true, paint);
        }
        DashPathEffect dashPathEffect = this.r;
        if (dashPathEffect == null) {
            Intrinsics.i("dashEffectInner");
            throw null;
        }
        Paint paint2 = this.i;
        paint2.setPathEffect(dashPathEffect);
        canvas.drawCircle(f5, f6, this.o * f, paint2);
        DashPathEffect dashPathEffect2 = this.q;
        if (dashPathEffect2 == null) {
            Intrinsics.i("dashEffectOuter");
            throw null;
        }
        paint2.setPathEffect(dashPathEffect2);
        canvas.drawCircle(f5, f6, this.p * f, paint2);
        ArrayList arrayList2 = new ArrayList();
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            o13.v(((p14) it3.next()).c, arrayList2);
        }
        Iterator it4 = arrayList2.iterator();
        while (it4.hasNext()) {
            b(canvas, (n14) it4.next());
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it5 = this.t.iterator();
        while (it5.hasNext()) {
            o13.v(((p14) it5.next()).c, arrayList3);
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it6 = arrayList3.iterator();
        while (it6.hasNext()) {
            Object next = it6.next();
            n14 n14Var = (n14) next;
            ArrayList arrayList5 = new ArrayList(k13.r(arrayList2, 10));
            Iterator it7 = arrayList2.iterator();
            while (it7.hasNext()) {
                arrayList5.add(Integer.valueOf(((n14) it7.next()).a));
            }
            if (!arrayList5.contains(Integer.valueOf(n14Var.a))) {
                arrayList4.add(next);
            }
        }
        Iterator it8 = arrayList4.iterator();
        while (it8.hasNext()) {
            b(canvas, (n14) it8.next());
        }
        Iterator it9 = arrayList.iterator();
        while (it9.hasNext()) {
            p14 p14Var2 = (p14) it9.next();
            i14 i14Var4 = p14Var2.b;
            double d = this.y ? i14Var4.a : i14Var4.b;
            float cos2 = (((float) Math.cos(Math.toRadians((i14Var4.c / 2.0f) + d))) * f) + f5;
            float sin = (((float) Math.sin(Math.toRadians(d + (i14Var4.c / 2.0f)))) * f) + f6;
            canvas.drawCircle(cos2, sin, this.d, this.j);
            String valueOf = this.x ? String.valueOf(p14Var2.a) : i14Var4.d;
            Paint paint3 = this.k;
            canvas.drawText(valueOf, cos2, sin - ((paint3.ascent() + paint3.descent()) / 2.0f), paint3);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        int width = getWidth();
        Context context = getContext();
        context.getClass();
        int s = width - ao2.s(24, context);
        this.l = s;
        double d = r7 * this.p * 6.283185307179586d;
        float f = (float) (((this.o * (s / 2)) * 6.283185307179586d) / this.m);
        float f2 = (float) (d / this.n);
        this.r = new DashPathEffect(new float[]{(f * 1.0f) / 3.0f, (f * 2.0f) / 3.0f}, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.q = new DashPathEffect(new float[]{(1.0f * f2) / 3.0f, (f2 * 2.0f) / 3.0f}, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null && motionEvent.getActionMasked() == 1) {
            performClick();
        }
        return true;
    }

    @Override // android.view.View
    public final boolean performClick() {
        super.performClick();
        this.x = !this.x;
        invalidate();
        return true;
    }

    public final void setHitsFilterType(@NotNull o14 o14Var) {
        o14Var.getClass();
        this.hitsFilterType = o14Var;
        d(CollectionsKt.S0(this.s), this.y);
    }

    public final void setMode(@NotNull q14 q14Var) {
        q14Var.getClass();
        this.mode = q14Var;
        d(CollectionsKt.S0(this.s), this.y);
    }
}
