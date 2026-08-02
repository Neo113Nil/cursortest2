package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.Guideline;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class htg extends View {
    public float a;
    public float b;
    public float c;
    public float d;
    public final float e;
    public final float f;
    public final float g;
    public Guideline h;
    public int i;
    public etg j;
    public etg k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public final Paint p;
    public final Paint q;
    public final Paint r;
    public final Paint s;
    public final Paint t;
    public final Paint u;
    public final Paint v;
    public final Paint w;
    public final Paint x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public htg(Context context) {
        super(context, null, 0);
        context.getClass();
        this.e = ao2.s(1, context);
        this.f = ao2.s(40, context);
        this.g = ao2.s(80, context);
        this.i = -1;
        Paint paint = new Paint(1);
        paint.setColor(context.getColor(R.color.surface_1));
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.p = paint;
        Paint paint2 = new Paint(1);
        paint2.setColor(context.getColor(R.color.n_lv_5));
        Paint.Style style2 = Paint.Style.STROKE;
        paint2.setStyle(style2);
        this.q = paint2;
        Paint paint3 = new Paint(1);
        paint3.setColor(context.getColor(R.color.live));
        paint3.setStrokeWidth(ao2.s(2, context));
        paint3.setStyle(style2);
        this.r = paint3;
        Paint paint4 = new Paint(1);
        paint4.setColor(context.getColor(R.color.home_primary_highlight));
        paint4.setStyle(style);
        this.s = paint4;
        Paint paint5 = new Paint(1);
        paint5.setColor(context.getColor(R.color.away_primary_highlight));
        paint5.setStyle(style);
        this.t = paint5;
        Paint paint6 = new Paint(1);
        paint6.setColor(context.getColor(R.color.home_primary));
        paint6.setStrokeWidth(ao2.s(2, context));
        paint6.setStyle(style2);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint6.setStrokeCap(cap);
        this.u = paint6;
        Paint paint7 = new Paint(1);
        paint7.setColor(context.getColor(R.color.away_primary));
        paint7.setStrokeWidth(ao2.s(2, context));
        paint7.setStrokeCap(cap);
        paint7.setStyle(style2);
        this.v = paint7;
        Paint paint8 = new Paint(1);
        paint8.setColor(context.getColor(R.color.home_primary));
        paint8.setStyle(style);
        this.w = paint8;
        Paint paint9 = new Paint(1);
        paint9.setColor(context.getColor(R.color.away_primary));
        paint9.setStyle(style);
        this.x = paint9;
    }

    public final void a(Canvas canvas, boolean z) {
        etg etgVar = this.k;
        if (etgVar != null) {
            ArrayList arrayList = etgVar.a;
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (((l6h) next).a == z) {
                    arrayList2.add(next);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            etg etgVar2 = this.j;
            if (etgVar2 != null) {
                ArrayList arrayList4 = etgVar2.a;
                ArrayList arrayList5 = new ArrayList();
                Iterator it2 = arrayList4.iterator();
                while (it2.hasNext()) {
                    Object next2 = it2.next();
                    if (((l6h) next2).a == z) {
                        arrayList5.add(next2);
                    }
                }
                arrayList3.addAll(arrayList5);
            }
            Iterator it3 = arrayList2.iterator();
            int i = 0;
            while (it3.hasNext()) {
                Object next3 = it3.next();
                int i2 = i + 1;
                if (i < 0) {
                    b.q();
                    throw null;
                }
                l6h l6hVar = (l6h) next3;
                List arrayList6 = arrayList3.size() > i ? ((l6h) arrayList3.get(i)).b : new ArrayList();
                boolean z2 = l6hVar.a;
                List list = l6hVar.b;
                Path path = new Path();
                int i3 = 0;
                for (Object obj : list) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        b.q();
                        throw null;
                    }
                    PointF pointF = (PointF) obj;
                    PointF pointF2 = arrayList6.size() > i3 ? (PointF) arrayList6.get(i3) : pointF;
                    float f = this.g;
                    if (i3 == 0) {
                        float f2 = pointF.x;
                        float f3 = pointF2.x;
                        path.moveTo((((f2 - f3) * this.d) + f3) * getWidth(), Float.max(Float.min(pointF.y, 0.98f), 0.02f) * f);
                    } else {
                        float f4 = pointF.x;
                        float f5 = pointF2.x;
                        path.lineTo((((f4 - f5) * this.d) + f5) * getWidth(), Float.max(Float.min(pointF.y, 0.98f), 0.02f) * f);
                    }
                    i3 = i4;
                }
                canvas.drawPath(path, z2 ? this.w : this.x);
                canvas.drawPath(path, z2 ? this.u : this.v);
                i = i2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(float f, etg etgVar, boolean z, Guideline guideline, ImageView imageView, boolean z2) {
        boolean z3;
        List list;
        l6h l6hVar;
        List list2;
        ArrayList arrayList = etgVar.a;
        this.l = z;
        this.h = guideline;
        this.m = !(this.b == f);
        etg etgVar2 = this.k;
        if (etgVar2 != null && etgVar2.a.size() == arrayList.size()) {
            etg etgVar3 = this.k;
            Integer num = null;
            Integer valueOf = (etgVar3 == null || (l6hVar = (l6h) CollectionsKt.j0(etgVar3.a)) == null || (list2 = l6hVar.b) == null) ? null : Integer.valueOf(list2.size());
            l6h l6hVar2 = (l6h) CollectionsKt.j0(arrayList);
            if (l6hVar2 != null && (list = l6hVar2.b) != null) {
                num = Integer.valueOf(list.size());
            }
            if (Intrinsics.c(valueOf, num)) {
                z3 = false;
                this.n = z3;
                this.a = this.b;
                this.j = this.k;
                this.b = f;
                this.k = etgVar;
                if (this.i < 0) {
                    ViewGroup.LayoutParams layoutParams = guideline.getLayoutParams();
                    layoutParams.getClass();
                    this.i = ((tl3) layoutParams).a;
                }
                if (this.m && !this.n) {
                    imageView.setVisibility(z ? 0 : 8);
                    invalidate();
                    return;
                }
                imageView.setVisibility(8);
                if (!this.o) {
                    this.d = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    final float f2 = this.b - this.a;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
                    ofFloat.setDuration(300L);
                    ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ftg
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            float floatValue = ((Float) fn0.i(valueAnimator)).floatValue();
                            htg htgVar = htg.this;
                            htgVar.d = floatValue;
                            htgVar.c = (floatValue * f2) + htgVar.a;
                            htgVar.invalidate();
                        }
                    });
                    ofFloat.addListener(new gtg(imageView, 0, z));
                    ofFloat.start();
                    return;
                }
                this.o = true;
                if (!z2) {
                    this.c = this.b;
                    return;
                }
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.c, this.b);
                ofFloat2.setDuration(1000L);
                ofFloat2.addUpdateListener(new s2(this, 16));
                ofFloat2.addListener(new gtg(imageView, 1, z));
                ofFloat2.start();
                return;
            }
        }
        z3 = true;
        this.n = z3;
        this.a = this.b;
        this.j = this.k;
        this.b = f;
        this.k = etgVar;
        if (this.i < 0) {
        }
        if (this.m) {
        }
        imageView.setVisibility(8);
        if (!this.o) {
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.getClass();
        super.onDraw(canvas);
        canvas.drawLine(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.f, getWidth(), this.f, this.q);
        canvas.save();
        float width = getWidth() * this.c;
        float f = this.g;
        canvas.clipRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, width, f);
        float width2 = getWidth();
        canvas.drawRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, width2, this.g, this.p);
        canvas.drawRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, width2, this.f, this.s);
        canvas.drawRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.f, width2, this.g, this.t);
        canvas.restore();
        canvas.save();
        float width3 = getWidth() * this.c;
        float f2 = this.f;
        canvas.clipRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, width3, f2 + 1.0f);
        a(canvas, true);
        canvas.restore();
        canvas.save();
        canvas.clipRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2 - 1.0f, getWidth() * this.c, f);
        a(canvas, false);
        canvas.restore();
        canvas.save();
        canvas.clipRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, getWidth(), f);
        if (this.l) {
            float f3 = this.c;
            float f4 = this.b;
            float f5 = this.e;
            if (f3 == f4) {
                float width4 = (getWidth() * this.c) - f5;
                canvas.drawLine(width4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, width4, this.g, this.r);
            }
            Guideline guideline = this.h;
            if (guideline != null) {
                ViewGroup.LayoutParams layoutParams = guideline.getLayoutParams();
                layoutParams.getClass();
                tl3 tl3Var = (tl3) layoutParams;
                tl3Var.a = (int) Float.min(((getWidth() * this.b) + this.i) - f5, (getWidth() * this.c) + this.i);
                guideline.setLayoutParams(tl3Var);
            }
        }
        canvas.restore();
    }
}
