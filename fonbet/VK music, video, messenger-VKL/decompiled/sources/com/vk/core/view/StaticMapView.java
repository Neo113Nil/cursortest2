package com.vk.core.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.StaticMapView;
import com.vk.design.ui.themehelper.R$styleable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.am00;
import xsna.epx;
import xsna.ger0;
import xsna.gp10;
import xsna.gyk0;
import xsna.i0q0;
import xsna.iah0;
import xsna.izs;
import xsna.jm00;
import xsna.msy;
import xsna.n3b0;
import xsna.ndr0;
import xsna.ofx;
import xsna.oj00;
import xsna.ozl;
import xsna.p2u;
import xsna.s3q0;
import xsna.tr;
import xsna.vj00;
import xsna.xl00;
import xsna.z0h0;
import xsna.zq5;

/* compiled from: StaticMapView.kt */
@ozl
/* loaded from: classes17.dex */
public final class StaticMapView extends ViewGroup {
    public static final int n = iah0.a(200);
    public static final xl00 o = new xl00(1792, true, false, false, false);
    public boolean b;
    public final jm00 c;
    public final Path d;
    public final RectF e;
    public final a f;
    public final Object g;
    public oj00 h;
    public final ArrayList i;
    public int j;
    public int k;
    public float l;
    public int m;

    /* compiled from: StaticMapView.kt */
    public static final class b implements ger0 {
        public final /* synthetic */ double a;
        public final /* synthetic */ double b;

        public b(double d, double d2) {
            this.a = d;
            this.b = d2;
        }

        @Override // xsna.ger0
        public final void a(ndr0 ndr0Var) {
            ndr0Var.j(this.a, this.b);
        }
    }

    /* compiled from: StaticMapView.kt */
    public static final class c implements ger0 {
        @Override // xsna.ger0
        public final void a(ndr0 ndr0Var) {
            ndr0Var.clear();
        }
    }

    /* compiled from: StaticMapView.kt */
    public static final class d implements ger0 {
        public final /* synthetic */ Ref$ObjectRef<oj00> a;
        public final /* synthetic */ StaticMapView b;

        public d(Ref$ObjectRef<oj00> ref$ObjectRef, StaticMapView staticMapView) {
            this.a = ref$ObjectRef;
            this.b = staticMapView;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // xsna.ger0
        public final void a(ndr0 ndr0Var) {
            Ref$ObjectRef<oj00> ref$ObjectRef = this.a;
            ref$ObjectRef.element = ndr0Var;
            StaticMapView staticMapView = this.b;
            Iterator it = staticMapView.i.iterator();
            while (it.hasNext()) {
                ((izs) it.next()).invoke(ref$ObjectRef.element);
            }
            staticMapView.i.clear();
            staticMapView.h = ref$ObjectRef.element;
        }
    }

    /* compiled from: StaticMapView.kt */
    public static final class e implements ger0 {
        public final /* synthetic */ am00 a;

        public e(am00 am00Var) {
            this.a = am00Var;
        }

        @Override // xsna.ger0
        public final void a(ndr0 ndr0Var) {
            ndr0Var.f(this.a);
        }
    }

    /* compiled from: StaticMapView.kt */
    public static final class f implements ger0 {
        public final /* synthetic */ boolean a;

        public f(boolean z) {
            this.a = z;
        }

        @Override // xsna.ger0
        public final void a(ndr0 ndr0Var) {
            ndr0Var.k(this.a);
        }
    }

    public StaticMapView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        vj00 vj00Var = ofx.a;
        this.c = (vj00Var == null ? null : vj00Var).d(getContext(), o);
        this.d = new Path();
        this.e = new RectF();
        a aVar = new a();
        this.f = aVar;
        this.g = msy.a(LazyThreadSafetyMode.NONE, new z0h0(6));
        this.i = new ArrayList();
        this.j = Integer.MAX_VALUE;
        this.k = Integer.MAX_VALUE;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.o, 0, 0);
        setMaxWidth(obtainStyledAttributes.getDimensionPixelSize(0, Integer.MAX_VALUE));
        setMaxHeight(obtainStyledAttributes.getDimensionPixelSize(1, Integer.MAX_VALUE));
        setAspectRatio(obtainStyledAttributes.getFloat(2, -1.0f));
        setCornerRadius(obtainStyledAttributes.getDimensionPixelSize(3, 0));
        setOverlayColor(obtainStyledAttributes.hasValue(4) ? Integer.valueOf(obtainStyledAttributes.getColor(4, 0)) : null);
        obtainStyledAttributes.recycle();
        addView((View) getMapView(), new ViewGroup.LayoutParams(-1, -1));
        setWillNotDraw(false);
        aVar.setCallback(this);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [T, java.lang.Object, xsna.oj00] */
    public static void a(StaticMapView staticMapView, izs izsVar) {
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ?? r1 = staticMapView.h;
        ArrayList arrayList = staticMapView.i;
        ref$ObjectRef.element = r1;
        if (r1 != 0) {
            izsVar.invoke(r1);
            return;
        }
        boolean isEmpty = arrayList.isEmpty();
        arrayList.add(izsVar);
        if (isEmpty) {
            staticMapView.getMapView().c(new d(ref$ObjectRef, staticMapView));
        }
    }

    private final jm00 getMapView() {
        boolean z = this.b;
        jm00 jm00Var = this.c;
        if (!z && epx.f(Looper.getMainLooper(), Looper.myLooper())) {
            jm00Var.d(null);
            this.b = true;
        }
        return jm00Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final boolean getUseCachedMapInstance() {
        return ((Boolean) this.g.getValue()).booleanValue();
    }

    public final void b(final double d2, final double d3) {
        if (getUseCachedMapInstance()) {
            d(new izs() { // from class: xsna.fyk0
                @Override // xsna.izs
                public final Object invoke(Object obj) {
                    int i = StaticMapView.n;
                    ((oj00) obj).j(d2, d3);
                    return s3q0.a;
                }
            });
        } else {
            getMapView().c(new b(d2, d3));
        }
    }

    public final void c() {
        if (getUseCachedMapInstance()) {
            d(new p2u(28));
        } else {
            getMapView().c(new c());
        }
    }

    public final void d(izs<? super oj00, s3q0> izsVar) {
        i0q0.i(0L, new zq5(4, this, izsVar));
    }

    @Override // android.view.View
    @SuppressLint({"MissingSuperCall"})
    public final void draw(Canvas canvas) {
        int i = this.m;
        a aVar = this.f;
        if (i <= 0) {
            super.draw(canvas);
            aVar.draw(canvas);
            return;
        }
        int save = canvas.save();
        canvas.clipPath(this.d);
        super.draw(canvas);
        aVar.draw(canvas);
        canvas.restoreToCount(save);
    }

    public final void e(final double d2, final double d3) {
        if (getUseCachedMapInstance()) {
            d(new izs() { // from class: xsna.eyk0
                @Override // xsna.izs
                public final Object invoke(Object obj) {
                    int i = StaticMapView.n;
                    ((oj00) obj).d(d2, d3);
                    return s3q0.a;
                }
            });
        } else {
            getMapView().c(new gyk0(d2, d3));
        }
    }

    public final float getAspectRatio() {
        return this.l;
    }

    public final int getCornerRadius() {
        return this.m;
    }

    public final boolean getEnableInternalClickListener() {
        return ((View) getMapView()).isClickable();
    }

    public final int getMaxHeight() {
        return this.k;
    }

    public final int getMaxWidth() {
        return this.j;
    }

    public final Integer getOverlayColor() {
        return this.f.b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int measuredWidth = getMeasuredWidth() - getPaddingRight();
        int measuredHeight = getMeasuredHeight() - getPaddingBottom();
        ((View) getMapView()).layout(paddingLeft, paddingTop, measuredWidth, measuredHeight);
        this.f.setBounds(paddingLeft, paddingTop, measuredWidth, measuredHeight);
        if (this.m > 0) {
            float measuredWidth2 = getMeasuredWidth();
            float measuredHeight2 = getMeasuredHeight();
            RectF rectF = this.e;
            rectF.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, measuredWidth2, measuredHeight2);
            Path path = this.d;
            path.rewind();
            int i5 = this.m;
            path.addRoundRect(rectF, i5, i5, Path.Direction.CW);
            path.close();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int a2 = gp10.a(i, getMinimumWidth(), this.j, paddingRight);
        int a3 = gp10.a(i2, getMinimumHeight(), this.k, paddingBottom);
        float f2 = this.l;
        if (f2 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            if (f2 < 1.0f) {
                a2 = (int) (a3 / f2);
            } else {
                a3 = (int) (a2 / f2);
            }
        }
        int b2 = gp10.b(i, getMinimumWidth(), this.j, paddingRight, a2);
        int b3 = gp10.b(i2, getMinimumHeight(), this.k, paddingBottom, a3);
        ((View) getMapView()).measure(tr.a(Math.max(0, b2 - paddingRight), 1073741823, 0, 1073741824), tr.a(Math.max(0, b3 - paddingBottom), 1073741823, 0, 1073741824));
        setMeasuredDimension(b2, b3);
    }

    public final void setAspectRatio(float f2) {
        this.l = f2;
        requestLayout();
        invalidate();
    }

    public final void setCornerRadius(int i) {
        this.m = i;
        requestLayout();
        invalidate();
    }

    public final void setEnableInternalClickListener(boolean z) {
        ((View) getMapView()).setClickable(z);
    }

    public final void setMapClickInterceptFixEnabled(boolean z) {
        getMapView().getClass();
    }

    public final void setMapStyle(am00 am00Var) {
        if (getUseCachedMapInstance()) {
            d(new n3b0(am00Var, 14));
        } else {
            getMapView().c(new e(am00Var));
        }
    }

    public final void setMaxHeight(int i) {
        this.k = i;
        requestLayout();
        invalidate();
    }

    public final void setMaxWidth(int i) {
        this.j = i;
        requestLayout();
        invalidate();
    }

    public final void setMyLocationEnabled(final boolean z) {
        if (getUseCachedMapInstance()) {
            d(new izs() { // from class: xsna.dyk0
                @Override // xsna.izs
                public final Object invoke(Object obj) {
                    int i = StaticMapView.n;
                    ((oj00) obj).k(z);
                    return s3q0.a;
                }
            });
        } else {
            getMapView().c(new f(z));
        }
    }

    public final void setOverlayColor(Integer num) {
        a aVar = this.f;
        aVar.b = num;
        aVar.a.setColor(num != null ? num.intValue() : 0);
        aVar.invalidateSelf();
    }

    /* compiled from: StaticMapView.kt */
    public static final class a extends Drawable {
        public final Paint a = new Paint(1);
        public Integer b;

        @Override // android.graphics.drawable.Drawable
        public final void draw(Canvas canvas) {
            if (this.b != null) {
                canvas.drawRect(getBounds(), this.a);
            }
        }

        @Override // android.graphics.drawable.Drawable
        public final int getOpacity() {
            return -2;
        }

        @Override // android.graphics.drawable.Drawable
        public final void setAlpha(int i) {
        }

        @Override // android.graphics.drawable.Drawable
        public final void setColorFilter(ColorFilter colorFilter) {
        }
    }
}
