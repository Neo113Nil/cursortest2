package com.google.android.material.slider;

import Ga.f;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewOverlay;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.SeekBar;
import androidx.annotation.NonNull;
import androidx.core.view.AbstractC2082d0;
import com.google.android.material.shape.i;
import com.google.android.material.shape.n;
import com.google.android.material.slider.BaseSlider;
import ia.e;
import ia.k;
import ia.l;
import ia.m;
import ja.AbstractC5104a;
import java.math.BigDecimal;
import java.math.MathContext;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import n.AbstractC5596a;
import n0.AbstractC5597a;
import s0.AbstractC6307a;
import xa.AbstractC6816b;
import xa.o;
import y0.z;
import za.h;

/* loaded from: classes3.dex */
public abstract class BaseSlider extends View {

    /* renamed from: C5, reason: collision with root package name */
    public static final String f35939C5 = "BaseSlider";

    /* renamed from: D5, reason: collision with root package name */
    public static final int f35940D5 = l.f48557I;

    /* renamed from: E5, reason: collision with root package name */
    public static final int f35941E5 = ia.c.f48217V;

    /* renamed from: F5, reason: collision with root package name */
    public static final int f35942F5 = ia.c.f48219X;

    /* renamed from: G5, reason: collision with root package name */
    public static final int f35943G5 = ia.c.f48225b0;

    /* renamed from: H5, reason: collision with root package name */
    public static final int f35944H5 = ia.c.f48221Z;

    /* renamed from: A, reason: collision with root package name */
    public int f35945A;

    /* renamed from: A5, reason: collision with root package name */
    public final Runnable f35946A5;

    /* renamed from: B, reason: collision with root package name */
    public int f35947B;

    /* renamed from: B5, reason: collision with root package name */
    public boolean f35948B5;

    /* renamed from: C, reason: collision with root package name */
    public int f35949C;

    /* renamed from: D, reason: collision with root package name */
    public int f35950D;

    /* renamed from: E, reason: collision with root package name */
    public int f35951E;

    /* renamed from: F, reason: collision with root package name */
    public int f35952F;

    /* renamed from: G, reason: collision with root package name */
    public int f35953G;

    /* renamed from: H, reason: collision with root package name */
    public int f35954H;

    /* renamed from: I, reason: collision with root package name */
    public int f35955I;

    /* renamed from: J, reason: collision with root package name */
    public int f35956J;

    /* renamed from: K, reason: collision with root package name */
    public int f35957K;

    /* renamed from: L, reason: collision with root package name */
    public int f35958L;

    /* renamed from: O, reason: collision with root package name */
    public int f35959O;

    /* renamed from: P, reason: collision with root package name */
    public int f35960P;

    /* renamed from: P4, reason: collision with root package name */
    public MotionEvent f35961P4;

    /* renamed from: Q4, reason: collision with root package name */
    public boolean f35962Q4;

    /* renamed from: R, reason: collision with root package name */
    public boolean f35963R;

    /* renamed from: R4, reason: collision with root package name */
    public float f35964R4;

    /* renamed from: S4, reason: collision with root package name */
    public float f35965S4;

    /* renamed from: T, reason: collision with root package name */
    public Drawable f35966T;

    /* renamed from: T1, reason: collision with root package name */
    public boolean f35967T1;

    /* renamed from: T4, reason: collision with root package name */
    public ArrayList f35968T4;

    /* renamed from: U4, reason: collision with root package name */
    public int f35969U4;

    /* renamed from: V, reason: collision with root package name */
    public boolean f35970V;

    /* renamed from: V1, reason: collision with root package name */
    public ColorStateList f35971V1;

    /* renamed from: V4, reason: collision with root package name */
    public int f35972V4;

    /* renamed from: W, reason: collision with root package name */
    public Drawable f35973W;

    /* renamed from: W4, reason: collision with root package name */
    public float f35974W4;

    /* renamed from: X4, reason: collision with root package name */
    public int f35975X4;

    /* renamed from: Y4, reason: collision with root package name */
    public int f35976Y4;

    /* renamed from: Z4, reason: collision with root package name */
    public int f35977Z4;

    /* renamed from: a, reason: collision with root package name */
    public final Paint f35978a;

    /* renamed from: a5, reason: collision with root package name */
    public int f35979a5;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f35980b;

    /* renamed from: b1, reason: collision with root package name */
    public boolean f35981b1;

    /* renamed from: b2, reason: collision with root package name */
    public int f35982b2;

    /* renamed from: b5, reason: collision with root package name */
    public boolean f35983b5;

    /* renamed from: c, reason: collision with root package name */
    public final Paint f35984c;

    /* renamed from: c5, reason: collision with root package name */
    public boolean f35985c5;

    /* renamed from: d, reason: collision with root package name */
    public final Paint f35986d;

    /* renamed from: d5, reason: collision with root package name */
    public boolean f35987d5;

    /* renamed from: e, reason: collision with root package name */
    public final Paint f35988e;

    /* renamed from: e5, reason: collision with root package name */
    public ColorStateList f35989e5;

    /* renamed from: f, reason: collision with root package name */
    public final Paint f35990f;

    /* renamed from: f5, reason: collision with root package name */
    public ColorStateList f35991f5;

    /* renamed from: g, reason: collision with root package name */
    public final Paint f35992g;

    /* renamed from: g1, reason: collision with root package name */
    public ColorStateList f35993g1;

    /* renamed from: g2, reason: collision with root package name */
    public int f35994g2;

    /* renamed from: g5, reason: collision with root package name */
    public ColorStateList f35995g5;

    /* renamed from: h, reason: collision with root package name */
    public final c f35996h;

    /* renamed from: h5, reason: collision with root package name */
    public ColorStateList f35997h5;

    /* renamed from: i, reason: collision with root package name */
    public final AccessibilityManager f35998i;

    /* renamed from: i5, reason: collision with root package name */
    public ColorStateList f35999i5;

    /* renamed from: j, reason: collision with root package name */
    public b f36000j;

    /* renamed from: j5, reason: collision with root package name */
    public final Path f36001j5;

    /* renamed from: k, reason: collision with root package name */
    public int f36002k;

    /* renamed from: k5, reason: collision with root package name */
    public final RectF f36003k5;

    /* renamed from: l, reason: collision with root package name */
    public final List f36004l;

    /* renamed from: l5, reason: collision with root package name */
    public final RectF f36005l5;

    /* renamed from: m, reason: collision with root package name */
    public final List f36006m;

    /* renamed from: m5, reason: collision with root package name */
    public final RectF f36007m5;

    /* renamed from: n, reason: collision with root package name */
    public final List f36008n;

    /* renamed from: n5, reason: collision with root package name */
    public final RectF f36009n5;

    /* renamed from: o, reason: collision with root package name */
    public boolean f36010o;

    /* renamed from: o5, reason: collision with root package name */
    public final Rect f36011o5;

    /* renamed from: p, reason: collision with root package name */
    public ValueAnimator f36012p;

    /* renamed from: p1, reason: collision with root package name */
    public Drawable f36013p1;

    /* renamed from: p2, reason: collision with root package name */
    public int f36014p2;

    /* renamed from: p5, reason: collision with root package name */
    public final RectF f36015p5;

    /* renamed from: q, reason: collision with root package name */
    public ValueAnimator f36016q;

    /* renamed from: q5, reason: collision with root package name */
    public final Rect f36017q5;

    /* renamed from: r, reason: collision with root package name */
    public final int f36018r;

    /* renamed from: r5, reason: collision with root package name */
    public final Matrix f36019r5;

    /* renamed from: s, reason: collision with root package name */
    public int f36020s;

    /* renamed from: s5, reason: collision with root package name */
    public final i f36021s5;

    /* renamed from: t, reason: collision with root package name */
    public int f36022t;

    /* renamed from: t5, reason: collision with root package name */
    public Drawable f36023t5;
    private float[] ticksCoordinates;

    /* renamed from: u, reason: collision with root package name */
    public int f36024u;

    /* renamed from: u5, reason: collision with root package name */
    public List f36025u5;

    /* renamed from: v, reason: collision with root package name */
    public int f36026v;

    /* renamed from: v5, reason: collision with root package name */
    public float f36027v5;

    /* renamed from: w, reason: collision with root package name */
    public int f36028w;

    /* renamed from: w5, reason: collision with root package name */
    public int f36029w5;

    /* renamed from: x, reason: collision with root package name */
    public int f36030x;

    /* renamed from: x1, reason: collision with root package name */
    public boolean f36031x1;

    /* renamed from: x2, reason: collision with root package name */
    public float f36032x2;

    /* renamed from: x5, reason: collision with root package name */
    public final int f36033x5;

    /* renamed from: y, reason: collision with root package name */
    public int f36034y;

    /* renamed from: y1, reason: collision with root package name */
    public Drawable f36035y1;

    /* renamed from: y2, reason: collision with root package name */
    public float f36036y2;

    /* renamed from: y5, reason: collision with root package name */
    public final ViewTreeObserver.OnScrollChangedListener f36037y5;

    /* renamed from: z, reason: collision with root package name */
    public int f36038z;

    /* renamed from: z5, reason: collision with root package name */
    public final ViewTreeObserver.OnGlobalLayoutListener f36039z5;

    public static class SliderState extends View.BaseSavedState {
        public static final Parcelable.Creator<SliderState> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        public float f36040a;

        /* renamed from: b, reason: collision with root package name */
        public float f36041b;

        /* renamed from: c, reason: collision with root package name */
        public ArrayList f36042c;

        /* renamed from: d, reason: collision with root package name */
        public float f36043d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f36044e;

        public class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SliderState createFromParcel(Parcel parcel) {
                return new SliderState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SliderState[] newArray(int i10) {
                return new SliderState[i10];
            }
        }

        public /* synthetic */ SliderState(Parcel parcel, a aVar) {
            this(parcel);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeFloat(this.f36040a);
            parcel.writeFloat(this.f36041b);
            parcel.writeList(this.f36042c);
            parcel.writeFloat(this.f36043d);
            parcel.writeBooleanArray(new boolean[]{this.f36044e});
        }

        public SliderState(Parcelable parcelable) {
            super(parcelable);
        }

        public SliderState(Parcel parcel) {
            super(parcel);
            this.f36040a = parcel.readFloat();
            this.f36041b = parcel.readFloat();
            ArrayList arrayList = new ArrayList();
            this.f36042c = arrayList;
            parcel.readList(arrayList, Float.class.getClassLoader());
            this.f36043d = parcel.readFloat();
            this.f36044e = parcel.createBooleanArray()[0];
        }
    }

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            ViewOverlay W10 = BaseSlider.this.W();
            if (W10 == null) {
                return;
            }
            Iterator it = BaseSlider.this.f36004l.iterator();
            while (it.hasNext()) {
                W10.remove((Ma.a) it.next());
            }
        }
    }

    public static class c extends androidx.customview.widget.a {

        /* renamed from: a, reason: collision with root package name */
        public final BaseSlider f36048a;

        /* renamed from: b, reason: collision with root package name */
        public final Rect f36049b;

        public c(BaseSlider baseSlider) {
            super(baseSlider);
            this.f36049b = new Rect();
            this.f36048a = baseSlider;
        }

        @Override // androidx.customview.widget.a
        public int getVirtualViewAt(float f10, float f11) {
            for (int i10 = 0; i10 < this.f36048a.getValues().size(); i10++) {
                this.f36048a.T0(i10, this.f36049b);
                if (this.f36049b.contains((int) f10, (int) f11)) {
                    return i10;
                }
            }
            return -1;
        }

        @Override // androidx.customview.widget.a
        public void getVisibleVirtualViews(List list) {
            for (int i10 = 0; i10 < this.f36048a.getValues().size(); i10++) {
                list.add(Integer.valueOf(i10));
            }
        }

        @Override // androidx.customview.widget.a
        public boolean onPerformActionForVirtualView(int i10, int i11, Bundle bundle) {
            if (!this.f36048a.isEnabled()) {
                return false;
            }
            if (i11 != 4096 && i11 != 8192) {
                if (i11 == 16908349 && bundle != null && bundle.containsKey("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE")) {
                    if (this.f36048a.R0(i10, bundle.getFloat("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE"))) {
                        this.f36048a.U0();
                        this.f36048a.postInvalidate();
                        invalidateVirtualView(i10);
                        return true;
                    }
                }
                return false;
            }
            float v10 = this.f36048a.v(20);
            if (i11 == 8192) {
                v10 = -v10;
            }
            if (this.f36048a.q0()) {
                v10 = -v10;
            }
            if (!this.f36048a.R0(i10, AbstractC6307a.a(this.f36048a.getValues().get(i10).floatValue() + v10, this.f36048a.getValueFrom(), this.f36048a.getValueTo()))) {
                return false;
            }
            this.f36048a.setActiveThumbIndex(i10);
            this.f36048a.K0();
            this.f36048a.U0();
            this.f36048a.postInvalidate();
            invalidateVirtualView(i10);
            return true;
        }

        @Override // androidx.customview.widget.a
        public void onPopulateNodeForVirtualView(int i10, z zVar) {
            zVar.b(z.a.f68208L);
            List<Float> values = this.f36048a.getValues();
            Float f10 = values.get(i10);
            float floatValue = f10.floatValue();
            float valueFrom = this.f36048a.getValueFrom();
            float valueTo = this.f36048a.getValueTo();
            if (this.f36048a.isEnabled()) {
                if (floatValue > valueFrom) {
                    zVar.a(8192);
                }
                if (floatValue < valueTo) {
                    zVar.a(4096);
                }
            }
            NumberFormat numberInstance = NumberFormat.getNumberInstance();
            numberInstance.setMaximumFractionDigits(2);
            try {
                valueFrom = numberInstance.parse(numberInstance.format(valueFrom)).floatValue();
                valueTo = numberInstance.parse(numberInstance.format(valueTo)).floatValue();
                floatValue = numberInstance.parse(numberInstance.format(floatValue)).floatValue();
            } catch (ParseException unused) {
                Log.w(BaseSlider.f35939C5, String.format("Error parsing value(%s), valueFrom(%s), and valueTo(%s) into a float.", f10, Float.valueOf(valueFrom), Float.valueOf(valueTo)));
            }
            zVar.Q0(z.h.d(1, valueFrom, valueTo, floatValue));
            zVar.w0(SeekBar.class.getName());
            StringBuilder sb2 = new StringBuilder();
            if (this.f36048a.getContentDescription() != null) {
                sb2.append(this.f36048a.getContentDescription());
                sb2.append(",");
            }
            String R10 = this.f36048a.R(floatValue);
            String string = this.f36048a.getContext().getString(k.f48539q);
            if (values.size() > 1) {
                string = t(i10);
            }
            CharSequence H10 = AbstractC2082d0.H(this.f36048a);
            if (TextUtils.isEmpty(H10)) {
                sb2.append(String.format(Locale.getDefault(), "%s, %s", string, R10));
            } else {
                zVar.Y0(H10);
            }
            zVar.A0(sb2.toString());
            this.f36048a.T0(i10, this.f36049b);
            zVar.s0(this.f36049b);
        }

        public final String t(int i10) {
            return i10 == this.f36048a.getValues().size() + (-1) ? this.f36048a.getContext().getString(k.f48537o) : i10 == 0 ? this.f36048a.getContext().getString(k.f48538p) : "";
        }
    }

    public enum d {
        BOTH,
        LEFT,
        RIGHT,
        NONE
    }

    public BaseSlider(Context context, AttributeSet attributeSet, int i10) {
        super(La.a.d(context, attributeSet, i10, f35940D5), attributeSet, i10);
        int recommendedTimeoutMillis;
        this.f36004l = new ArrayList();
        this.f36006m = new ArrayList();
        this.f36008n = new ArrayList();
        this.f36010o = false;
        this.f35956J = -1;
        this.f35957K = -1;
        this.f35963R = false;
        this.f35970V = false;
        this.f35981b1 = false;
        this.f36031x1 = false;
        this.f35967T1 = false;
        this.f35962Q4 = false;
        this.f35968T4 = new ArrayList();
        this.f35969U4 = -1;
        this.f35972V4 = -1;
        this.f35974W4 = 0.0f;
        this.f35985c5 = false;
        this.f36001j5 = new Path();
        this.f36003k5 = new RectF();
        this.f36005l5 = new RectF();
        this.f36007m5 = new RectF();
        this.f36009n5 = new RectF();
        this.f36011o5 = new Rect();
        this.f36015p5 = new RectF();
        this.f36017q5 = new Rect();
        this.f36019r5 = new Matrix();
        i iVar = new i();
        this.f36021s5 = iVar;
        this.f36025u5 = Collections.EMPTY_LIST;
        this.f36029w5 = 0;
        this.f36037y5 = new ViewTreeObserver.OnScrollChangedListener() { // from class: Ga.c
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                BaseSlider.this.W0();
            }
        };
        this.f36039z5 = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: Ga.d
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                BaseSlider.this.W0();
            }
        };
        this.f35946A5 = new Runnable() { // from class: Ga.e
            @Override // java.lang.Runnable
            public final void run() {
                BaseSlider.a(BaseSlider.this);
            }
        };
        Context context2 = getContext();
        this.f35948B5 = isShown();
        this.f35978a = new Paint();
        this.f35980b = new Paint();
        Paint paint = new Paint(1);
        this.f35984c = paint;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        Paint paint2 = new Paint(1);
        this.f35986d = paint2;
        paint2.setStyle(style);
        Paint paint3 = new Paint();
        this.f35988e = paint3;
        Paint.Style style2 = Paint.Style.STROKE;
        paint3.setStyle(style2);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint3.setStrokeCap(cap);
        Paint paint4 = new Paint();
        this.f35990f = paint4;
        paint4.setStyle(style2);
        paint4.setStrokeCap(cap);
        Paint paint5 = new Paint();
        this.f35992g = paint5;
        paint5.setStyle(style);
        paint5.setStrokeCap(cap);
        u0(context2.getResources());
        I0(context2, attributeSet, i10);
        setFocusable(true);
        setClickable(true);
        iVar.k0(2);
        this.f36018r = ViewConfiguration.get(context2).getScaledTouchSlop();
        c cVar = new c(this);
        this.f35996h = cVar;
        AbstractC2082d0.l0(this, cVar);
        AccessibilityManager accessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f35998i = accessibilityManager;
        if (Build.VERSION.SDK_INT < 29) {
            this.f36033x5 = 120000;
        } else {
            recommendedTimeoutMillis = accessibilityManager.getRecommendedTimeoutMillis(10000, 6);
            this.f36033x5 = recommendedTimeoutMillis;
        }
    }

    public static float T(ValueAnimator valueAnimator, float f10) {
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            return f10;
        }
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        valueAnimator.cancel();
        return floatValue;
    }

    public static /* synthetic */ void a(BaseSlider baseSlider) {
        baseSlider.setActiveThumbIndex(-1);
        baseSlider.invalidate();
    }

    public static /* synthetic */ void b(BaseSlider baseSlider, ValueAnimator valueAnimator) {
        baseSlider.getClass();
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        Iterator it = baseSlider.f36004l.iterator();
        while (it.hasNext()) {
            ((Ma.a) it.next()).I0(floatValue);
        }
        baseSlider.postInvalidateOnAnimation();
    }

    public static boolean k0(MotionEvent motionEvent) {
        return motionEvent.getToolType(0) == 3;
    }

    public final void A() {
        if (this.f36004l.size() > this.f35968T4.size()) {
            List<Ma.a> subList = this.f36004l.subList(this.f35968T4.size(), this.f36004l.size());
            for (Ma.a aVar : subList) {
                if (isAttachedToWindow()) {
                    B(aVar);
                }
            }
            subList.clear();
        }
        while (true) {
            if (this.f36004l.size() >= this.f35968T4.size()) {
                break;
            }
            Ma.a A02 = Ma.a.A0(getContext(), null, 0, this.f36002k);
            this.f36004l.add(A02);
            if (isAttachedToWindow()) {
                o(A02);
            }
        }
        int i10 = this.f36004l.size() != 1 ? 1 : 0;
        Iterator it = this.f36004l.iterator();
        while (it.hasNext()) {
            ((Ma.a) it.next()).p0(i10);
        }
    }

    public final boolean A0(int i10) {
        int i11 = this.f35972V4;
        int c10 = (int) AbstractC6307a.c(i11 + i10, 0L, this.f35968T4.size() - 1);
        this.f35972V4 = c10;
        if (c10 == i11) {
            return false;
        }
        if (this.f35969U4 != -1) {
            this.f35969U4 = c10;
        }
        U0();
        postInvalidate();
        return true;
    }

    public final void B(Ma.a aVar) {
        ViewGroup f10 = o.f(this);
        if (f10 == null) {
            return;
        }
        f10.getOverlay().remove(aVar);
        aVar.C0(f10);
    }

    public final boolean B0(int i10) {
        if (q0() || t0()) {
            i10 = i10 == Integer.MIN_VALUE ? Integer.MAX_VALUE : -i10;
        }
        return A0(i10);
    }

    public final float C(float f10) {
        if (f10 == 0.0f) {
            return 0.0f;
        }
        float f11 = (f10 - this.f35951E) / this.f35979a5;
        float f12 = this.f35964R4;
        return (f11 * (f12 - this.f35965S4)) + f12;
    }

    public final float C0(float f10) {
        float f11 = this.f35964R4;
        float f12 = (f10 - f11) / (this.f35965S4 - f11);
        return (q0() || t0()) ? 1.0f - f12 : f12;
    }

    public final void D(int i10) {
        Iterator it = this.f36006m.iterator();
        while (it.hasNext()) {
            ((Ga.a) it.next()).a(this, ((Float) this.f35968T4.get(i10)).floatValue(), true);
        }
        AccessibilityManager accessibilityManager = this.f35998i;
        if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
            return;
        }
        J0(i10);
    }

    public final Boolean D0(int i10, KeyEvent keyEvent) {
        if (i10 == 61) {
            return keyEvent.hasNoModifiers() ? Boolean.valueOf(A0(1)) : keyEvent.isShiftPressed() ? Boolean.valueOf(A0(-1)) : Boolean.FALSE;
        }
        if (i10 != 66) {
            if (i10 != 81) {
                if (i10 == 69) {
                    A0(-1);
                    return Boolean.TRUE;
                }
                if (i10 != 70) {
                    switch (i10) {
                        case 21:
                            B0(-1);
                            break;
                        case 22:
                            B0(1);
                            break;
                    }
                    return Boolean.TRUE;
                }
            }
            A0(1);
            return Boolean.TRUE;
        }
        this.f35969U4 = this.f35972V4;
        postInvalidate();
        return Boolean.TRUE;
    }

    public final void E() {
        for (Ga.a aVar : this.f36006m) {
            Iterator it = this.f35968T4.iterator();
            while (it.hasNext()) {
                aVar.a(this, ((Float) it.next()).floatValue(), false);
            }
        }
    }

    public final void E0() {
        Iterator it = this.f36008n.iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void F(Canvas canvas, int i10, int i11) {
        int i12;
        float f10;
        float f11;
        BaseSlider baseSlider = this;
        float[] S10 = baseSlider.S();
        int i13 = baseSlider.f35951E;
        float f12 = i10;
        float f13 = i13 + (S10[1] * f12);
        float f14 = i13 + (S10[0] * f12);
        if (f14 >= f13) {
            baseSlider.f36003k5.setEmpty();
            return;
        }
        d dVar = d.NONE;
        if (baseSlider.f35968T4.size() == 1 && !baseSlider.h0()) {
            dVar = (baseSlider.q0() || baseSlider.t0()) ? d.RIGHT : d.LEFT;
        }
        d dVar2 = dVar;
        int i14 = 0;
        while (i14 < baseSlider.f35968T4.size()) {
            if (baseSlider.f35968T4.size() > 1) {
                if (i14 > 0) {
                    f14 = baseSlider.n1(((Float) baseSlider.f35968T4.get(i14 - 1)).floatValue());
                }
                f13 = baseSlider.n1(((Float) baseSlider.f35968T4.get(i14)).floatValue());
                if (baseSlider.q0() || baseSlider.t0()) {
                    f13 = f14;
                    f14 = f13;
                }
            }
            int trackCornerSize = baseSlider.getTrackCornerSize();
            int ordinal = dVar2.ordinal();
            if (ordinal != 1) {
                if (ordinal == 2) {
                    f14 += baseSlider.f35955I;
                    f13 += trackCornerSize;
                } else if (ordinal == 3) {
                    if (!baseSlider.h0()) {
                        i12 = baseSlider.f35955I;
                        f14 += i12;
                    } else if (S10[1] == 0.5f) {
                        f14 += baseSlider.f35955I;
                    } else if (S10[0] == 0.5f) {
                        i12 = baseSlider.f35955I;
                    }
                }
                f10 = f14;
                f11 = f13;
                if (f10 < f11) {
                    baseSlider.f36003k5.setEmpty();
                } else {
                    RectF rectF = baseSlider.f36003k5;
                    float f15 = i11;
                    int i15 = baseSlider.f35950D;
                    rectF.set(f10, f15 - (i15 / 2.0f), f11, f15 + (i15 / 2.0f));
                    baseSlider.b1(canvas, baseSlider.f35980b, baseSlider.f36003k5, trackCornerSize, dVar2);
                }
                i14++;
                baseSlider = this;
                f14 = f10;
                f13 = f11;
            } else {
                f14 -= trackCornerSize;
                i12 = baseSlider.f35955I;
            }
            f13 -= i12;
            f10 = f14;
            f11 = f13;
            if (f10 < f11) {
            }
            i14++;
            baseSlider = this;
            f14 = f10;
            f13 = f11;
        }
    }

    public final void F0() {
        Iterator it = this.f36008n.iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            throw null;
        }
    }

    public final void G(float f10, float f11, float f12, float f13, Canvas canvas, RectF rectF, d dVar) {
        if (f11 - f10 > getTrackCornerSize() - this.f35955I) {
            rectF.set(f10, f12, f11, f13);
        } else {
            rectF.setEmpty();
        }
        b1(canvas, this.f35978a, rectF, getTrackCornerSize(), dVar);
    }

    public boolean G0() {
        if (this.f35969U4 != -1) {
            return true;
        }
        float b02 = b0();
        float n12 = n1(b02);
        this.f35969U4 = 0;
        float abs = Math.abs(((Float) this.f35968T4.get(0)).floatValue() - b02);
        for (int i10 = 1; i10 < this.f35968T4.size(); i10++) {
            float abs2 = Math.abs(((Float) this.f35968T4.get(i10)).floatValue() - b02);
            float n13 = n1(((Float) this.f35968T4.get(i10)).floatValue());
            if (Float.compare(abs2, abs) > 0) {
                break;
            }
            boolean z10 = q0() || t0() ? n13 - n12 > 0.0f : n13 - n12 < 0.0f;
            if (Float.compare(abs2, abs) < 0) {
                this.f35969U4 = i10;
            } else {
                if (Float.compare(abs2, abs) != 0) {
                    continue;
                } else {
                    if (Math.abs(n13 - n12) < this.f36018r) {
                        this.f35969U4 = -1;
                        return false;
                    }
                    if (z10) {
                        this.f35969U4 = i10;
                    }
                }
            }
            abs = abs2;
        }
        return this.f35969U4 != -1;
    }

    public final void H(Canvas canvas, int i10, int i11) {
        float[] S10 = S();
        float f10 = i11;
        int i12 = this.f35950D;
        float f11 = f10 - (i12 / 2.0f);
        float f12 = f10 + (i12 / 2.0f);
        float f13 = i10;
        G(this.f35951E - getTrackCornerSize(), (this.f35951E + (S10[0] * f13)) - this.f35955I, f11, f12, canvas, this.f36005l5, d.LEFT);
        G(this.f35951E + (S10[1] * f13) + this.f35955I, r13 + i10 + getTrackCornerSize(), f11, f12, canvas, this.f36007m5, d.RIGHT);
    }

    public final void H0(Ma.a aVar, float f10) {
        s(aVar, f10);
        if (t0()) {
            RectF rectF = new RectF(this.f36011o5);
            this.f36019r5.mapRect(rectF);
            rectF.round(this.f36011o5);
        }
        AbstractC6816b.c(o.f(this), this, this.f36011o5);
        aVar.setBounds(this.f36011o5);
    }

    public final void I(Canvas canvas, float f10, float f11) {
        Iterator it = this.f35968T4.iterator();
        while (it.hasNext()) {
            float n12 = n1(((Float) it.next()).floatValue());
            float f12 = this.f35955I + (this.f35952F / 2.0f);
            if (f10 >= n12 - f12 && f10 <= n12 + f12) {
                return;
            }
        }
        if (t0()) {
            canvas.drawPoint(f11, f10, this.f35992g);
        } else {
            canvas.drawPoint(f10, f11, this.f35992g);
        }
    }

    public final void I0(Context context, AttributeSet attributeSet, int i10) {
        TypedArray i11 = xa.l.i(context, attributeSet, m.Slider, i10, f35940D5, new int[0]);
        setOrientation(i11.getInt(m.f48704L5, 0));
        this.f36002k = i11.getResourceId(m.f48783T5, l.f48561M);
        this.f35964R4 = i11.getFloat(m.f48724N5, 0.0f);
        this.f35965S4 = i11.getFloat(m.f48734O5, 1.0f);
        setValues(Float.valueOf(this.f35964R4));
        setCentered(i11.getBoolean(m.f48744P5, false));
        this.f35974W4 = i11.getFloat(m.f48714M5, 0.0f);
        this.f36034y = (int) Math.ceil(i11.getDimension(m.f48792U5, Ca.b.e(context)));
        boolean hasValue = i11.hasValue(m.f48947k6);
        int i12 = hasValue ? m.f48947k6 : m.f48967m6;
        int i13 = hasValue ? m.f48947k6 : m.f48957l6;
        ColorStateList a10 = Ca.c.a(context, i11, i12);
        if (a10 == null) {
            a10 = AbstractC5596a.a(context, ia.d.f48283j);
        }
        setTrackInactiveTintList(a10);
        ColorStateList a11 = Ca.c.a(context, i11, i13);
        if (a11 == null) {
            a11 = AbstractC5596a.a(context, ia.d.f48280g);
        }
        setTrackActiveTintList(a11);
        this.f36021s5.f0(Ca.c.a(context, i11, m.f48801V5));
        if (i11.hasValue(m.f48837Z5)) {
            setThumbStrokeColor(Ca.c.a(context, i11, m.f48837Z5));
        }
        setThumbStrokeWidth(i11.getDimension(m.f48847a6, 0.0f));
        ColorStateList a12 = Ca.c.a(context, i11, m.f48754Q5);
        if (a12 == null) {
            a12 = AbstractC5596a.a(context, ia.d.f48281h);
        }
        setHaloTintList(a12);
        this.f35975X4 = i11.hasValue(m.f48927i6) ? i11.getInt(m.f48927i6, -1) : y(i11.getBoolean(m.f48937j6, true));
        boolean hasValue2 = i11.hasValue(m.f48877d6);
        int i14 = hasValue2 ? m.f48877d6 : m.f48897f6;
        int i15 = hasValue2 ? m.f48877d6 : m.f48887e6;
        ColorStateList a13 = Ca.c.a(context, i11, i14);
        if (a13 == null) {
            a13 = AbstractC5596a.a(context, ia.d.f48282i);
        }
        setTickInactiveTintList(a13);
        ColorStateList a14 = Ca.c.a(context, i11, i15);
        if (a14 == null) {
            a14 = AbstractC5596a.a(context, ia.d.f48279f);
        }
        setTickActiveTintList(a14);
        setThumbTrackGapSize(i11.getDimensionPixelSize(m.f48857b6, 0));
        setTrackStopIndicatorSize(i11.getDimensionPixelSize(m.f49077x6, 0));
        setTrackCornerSize(i11.getDimensionPixelSize(m.f48977n6, -1));
        setTrackInsideCornerSize(i11.getDimensionPixelSize(m.f49067w6, 0));
        setTrackIconActiveStart(Ca.c.e(context, i11, m.f49017r6));
        setTrackIconActiveEnd(Ca.c.e(context, i11, m.f49007q6));
        setTrackIconActiveColor(Ca.c.a(context, i11, m.f48997p6));
        setTrackIconInactiveStart(Ca.c.e(context, i11, m.f49047u6));
        setTrackIconInactiveEnd(Ca.c.e(context, i11, m.f49037t6));
        setTrackIconInactiveColor(Ca.c.a(context, i11, m.f49027s6));
        setTrackIconSize(i11.getDimensionPixelSize(m.f49057v6, 0));
        int dimensionPixelSize = i11.getDimensionPixelSize(m.f48828Y5, 0) * 2;
        int dimensionPixelSize2 = i11.getDimensionPixelSize(m.f48867c6, dimensionPixelSize);
        int dimensionPixelSize3 = i11.getDimensionPixelSize(m.f48819X5, dimensionPixelSize);
        setThumbWidth(dimensionPixelSize2);
        setThumbHeight(dimensionPixelSize3);
        setHaloRadius(i11.getDimensionPixelSize(m.f48764R5, 0));
        setThumbElevation(i11.getDimension(m.f48810W5, 0.0f));
        setTrackHeight(i11.getDimensionPixelSize(m.f48987o6, 0));
        setTickActiveRadius(i11.getDimensionPixelSize(m.f48907g6, this.f35958L / 2));
        setTickInactiveRadius(i11.getDimensionPixelSize(m.f48917h6, this.f35958L / 2));
        setLabelBehavior(i11.getInt(m.f48774S5, 0));
        if (!i11.getBoolean(m.f48694K5, true)) {
            setEnabled(false);
        }
        i11.recycle();
    }

    public final void J(Canvas canvas, int i10, int i11, float f10, Drawable drawable) {
        canvas.save();
        if (t0()) {
            canvas.concat(this.f36019r5);
        }
        canvas.translate((this.f35951E + ((int) (C0(f10) * i10))) - (drawable.getBounds().width() / 2.0f), i11 - (drawable.getBounds().height() / 2.0f));
        drawable.draw(canvas);
        canvas.restore();
    }

    public final void J0(int i10) {
        b bVar = this.f36000j;
        if (bVar == null) {
            this.f36000j = new b(this, null);
        } else {
            removeCallbacks(bVar);
        }
        this.f36000j.a(i10);
        postDelayed(this.f36000j, 200L);
    }

    public final void K(Canvas canvas, int i10, int i11) {
        Canvas canvas2;
        int i12;
        int i13;
        int i14 = 0;
        while (i14 < this.f35968T4.size()) {
            float floatValue = ((Float) this.f35968T4.get(i14)).floatValue();
            Drawable drawable = this.f36023t5;
            if (drawable != null) {
                canvas2 = canvas;
                i12 = i10;
                i13 = i11;
                J(canvas2, i12, i13, floatValue, drawable);
            } else {
                canvas2 = canvas;
                i12 = i10;
                i13 = i11;
                if (i14 < this.f36025u5.size()) {
                    J(canvas2, i12, i13, floatValue, (Drawable) this.f36025u5.get(i14));
                } else {
                    if (!isEnabled()) {
                        canvas2.drawCircle(this.f35951E + (C0(floatValue) * i12), i13, getThumbRadius(), this.f35984c);
                    }
                    J(canvas2, i12, i13, floatValue, this.f36021s5);
                }
            }
            i14++;
            canvas = canvas2;
            i10 = i12;
            i11 = i13;
        }
    }

    public void K0() {
        removeCallbacks(this.f35946A5);
        postDelayed(this.f35946A5, this.f36033x5);
    }

    public final void L(int i10, int i11, Canvas canvas, Paint paint) {
        while (i10 < i11) {
            float f10 = t0() ? this.ticksCoordinates[i10 + 1] : this.ticksCoordinates[i10];
            if (!n0(f10) && (!h0() || !m0(f10))) {
                float[] fArr = this.ticksCoordinates;
                canvas.drawPoint(fArr[i10], fArr[i10 + 1], paint);
            }
            i10 += 2;
        }
    }

    public final void L0(Ma.a aVar, float f10) {
        aVar.J0(R(f10));
        H0(aVar, f10);
        ViewOverlay W10 = W();
        if (W10 == null) {
            return;
        }
        W10.add(aVar);
    }

    public final void M(Canvas canvas, RectF rectF, Drawable drawable) {
        if (t0()) {
            this.f36019r5.mapRect(rectF);
        }
        rectF.round(this.f36017q5);
        drawable.setBounds(this.f36017q5);
        drawable.draw(canvas);
    }

    public final void M0(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            throw new IllegalArgumentException("At least one value must be set");
        }
        Collections.sort(arrayList);
        if (this.f35968T4.size() == arrayList.size() && this.f35968T4.equals(arrayList)) {
            return;
        }
        this.f35968T4 = arrayList;
        this.f35987d5 = true;
        this.f35972V4 = 0;
        U0();
        A();
        E();
        postInvalidate();
    }

    public final void N(Canvas canvas, RectF rectF, RectF rectF2) {
        if (e0()) {
            if (this.f35968T4.size() > 1) {
                Log.w(f35939C5, "Track icons can only be used when only 1 thumb is present.");
            }
            p(canvas, rectF, this.f35966T, true);
            p(canvas, rectF2, this.f36013p1, true);
            p(canvas, rectF, this.f35973W, false);
            p(canvas, rectF2, this.f36035y1, false);
        }
    }

    public final boolean N0() {
        return this.f35949C == 3;
    }

    public final void O() {
        if (!this.f36010o) {
            this.f36010o = true;
            ValueAnimator z10 = z(true);
            this.f36012p = z10;
            this.f36016q = null;
            z10.start();
        }
        Iterator it = this.f36004l.iterator();
        for (int i10 = 0; i10 < this.f35968T4.size() && it.hasNext(); i10++) {
            if (i10 != this.f35972V4) {
                L0((Ma.a) it.next(), ((Float) this.f35968T4.get(i10)).floatValue());
            }
        }
        if (!it.hasNext()) {
            throw new IllegalStateException(String.format("Not enough labels(%d) to display all the values(%d)", Integer.valueOf(this.f36004l.size()), Integer.valueOf(this.f35968T4.size())));
        }
        L0((Ma.a) it.next(), ((Float) this.f35968T4.get(this.f35972V4)).floatValue());
    }

    public final boolean O0() {
        return this.f35983b5 || !(getBackground() instanceof RippleDrawable);
    }

    public final void P() {
        if (this.f36010o) {
            this.f36010o = false;
            ValueAnimator z10 = z(false);
            this.f36016q = z10;
            this.f36012p = null;
            z10.addListener(new a());
            this.f36016q.start();
        }
    }

    public final boolean P0(float f10) {
        return R0(this.f35969U4, f10);
    }

    public final void Q(int i10) {
        if (i10 == 1) {
            A0(Integer.MAX_VALUE);
            return;
        }
        if (i10 == 2) {
            A0(Integer.MIN_VALUE);
        } else if (i10 == 17) {
            B0(Integer.MAX_VALUE);
        } else {
            if (i10 != 66) {
                return;
            }
            B0(Integer.MIN_VALUE);
        }
    }

    public final double Q0(float f10) {
        float f11 = this.f35974W4;
        if (f11 <= 0.0f) {
            return f10;
        }
        return Math.round(f10 * r0) / ((int) ((this.f35965S4 - this.f35964R4) / f11));
    }

    public final String R(float f10) {
        if (d0()) {
            throw null;
        }
        return String.format(((float) ((int) f10)) == f10 ? "%.0f" : "%.2f", Float.valueOf(f10));
    }

    public final boolean R0(int i10, float f10) {
        this.f35972V4 = i10;
        if (Math.abs(f10 - ((Float) this.f35968T4.get(i10)).floatValue()) < 1.0E-4d) {
            return false;
        }
        this.f35968T4.set(i10, Float.valueOf(U(i10, f10)));
        D(i10);
        return true;
    }

    public final float[] S() {
        float floatValue = ((Float) this.f35968T4.get(0)).floatValue();
        ArrayList arrayList = this.f35968T4;
        float floatValue2 = ((Float) arrayList.get(arrayList.size() - 1)).floatValue();
        if (this.f35968T4.size() == 1) {
            floatValue = this.f35964R4;
        }
        float C02 = C0(floatValue);
        float C03 = C0(floatValue2);
        if (h0()) {
            float min = Math.min(0.5f, C03);
            C03 = Math.max(0.5f, C03);
            C02 = min;
        }
        return (h0() || !(q0() || t0())) ? new float[]{C02, C03} : new float[]{C03, C02};
    }

    public final boolean S0() {
        return P0(a0());
    }

    public void T0(int i10, Rect rect) {
        int C02 = this.f35951E + ((int) (C0(getValues().get(i10).floatValue()) * this.f35979a5));
        int w10 = w();
        int max = Math.max(this.f35952F / 2, this.f36034y / 2);
        int max2 = Math.max(this.f35953G / 2, this.f36034y / 2);
        RectF rectF = new RectF(C02 - max, w10 - max2, C02 + max, w10 + max2);
        if (t0()) {
            this.f36019r5.mapRect(rectF);
        }
        rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
    }

    public final float U(int i10, float f10) {
        float minSeparation = getMinSeparation();
        if (this.f36029w5 == 0) {
            minSeparation = C(minSeparation);
        }
        if (q0() || t0()) {
            minSeparation = -minSeparation;
        }
        int i11 = i10 + 1;
        int i12 = i10 - 1;
        return AbstractC6307a.a(f10, i12 < 0 ? this.f35964R4 : ((Float) this.f35968T4.get(i12)).floatValue() + minSeparation, i11 >= this.f35968T4.size() ? this.f35965S4 : ((Float) this.f35968T4.get(i11)).floatValue() - minSeparation);
    }

    public final void U0() {
        if (O0() || getMeasuredWidth() <= 0) {
            return;
        }
        Drawable background = getBackground();
        if (background instanceof RippleDrawable) {
            float C02 = (C0(((Float) this.f35968T4.get(this.f35972V4)).floatValue()) * this.f35979a5) + this.f35951E;
            int w10 = w();
            int i10 = this.f35954H;
            float[] fArr = {C02 - i10, w10 - i10, C02 + i10, w10 + i10};
            if (t0()) {
                this.f36019r5.mapPoints(fArr);
            }
            background.setHotspotBounds((int) fArr[0], (int) fArr[1], (int) fArr[2], (int) fArr[3]);
        }
    }

    public final int V(ColorStateList colorStateList) {
        return colorStateList.getColorForState(getDrawableState(), colorStateList.getDefaultColor());
    }

    public final void V0() {
        float f10;
        boolean t02 = t0();
        boolean q02 = q0();
        float f11 = 0.5f;
        if (t02 && q02) {
            f10 = 0.5f;
            f11 = -0.2f;
        } else {
            f10 = 1.2f;
            if (t02) {
                f11 = 1.2f;
                f10 = 0.5f;
            }
        }
        Iterator it = this.f36004l.iterator();
        while (it.hasNext()) {
            ((Ma.a) it.next()).G0(f11, f10);
        }
    }

    public final ViewOverlay W() {
        ViewGroup f10 = o.f(this);
        if (f10 == null) {
            return null;
        }
        return f10.getOverlay();
    }

    public final void W0() {
        V0();
        int i10 = this.f35949C;
        if (i10 == 0 || i10 == 1) {
            if (this.f35969U4 == -1 || !isEnabled()) {
                P();
                return;
            } else {
                O();
                return;
            }
        }
        if (i10 == 2) {
            P();
            return;
        }
        if (i10 != 3) {
            throw new IllegalArgumentException("Unexpected labelBehavior: " + this.f35949C);
        }
        if (isEnabled() && r0()) {
            O();
        } else {
            P();
        }
    }

    public final float[] X(float f10, float f11) {
        return t0() ? new float[]{f10, f10, f10, f10, f11, f11, f11, f11} : new float[]{f10, f10, f11, f11, f11, f11, f10, f10};
    }

    public final void X0() {
        float w10 = w();
        this.f36019r5.reset();
        this.f36019r5.setRotate(90.0f, w10, w10);
    }

    public final int Y() {
        return (int) (((this.f35965S4 - this.f35964R4) / this.f35974W4) + 1.0f);
    }

    public final void Y0() {
        if (c0()) {
            int i10 = this.f35952F;
            this.f35956J = i10;
            this.f35957K = this.f35955I;
            int round = Math.round(i10 * 0.5f);
            int i11 = this.f35952F - round;
            setThumbWidth(round);
            setThumbTrackGapSize(this.f35955I - (i11 / 2));
        }
    }

    public final int Z() {
        return (this.f35979a5 / this.f36030x) + 1;
    }

    public final void Z0() {
        i1();
        int i10 = 0;
        if (this.f35974W4 <= 0.0f) {
            a1(0);
            return;
        }
        int i11 = this.f35975X4;
        if (i11 == 0) {
            i10 = Math.min(Y(), Z());
        } else if (i11 == 1) {
            int Y10 = Y();
            if (Y10 <= Z()) {
                i10 = Y10;
            }
        } else if (i11 != 2) {
            throw new IllegalStateException("Unexpected tickVisibilityMode: " + this.f35975X4);
        }
        a1(i10);
    }

    public final float a0() {
        double Q02 = Q0(this.f36027v5);
        if (q0() || t0()) {
            Q02 = 1.0d - Q02;
        }
        float f10 = this.f35965S4;
        return (float) ((Q02 * (f10 - r3)) + this.f35964R4);
    }

    public final void a1(int i10) {
        if (i10 == 0) {
            this.ticksCoordinates = null;
            return;
        }
        float[] fArr = this.ticksCoordinates;
        if (fArr == null || fArr.length != i10 * 2) {
            this.ticksCoordinates = new float[i10 * 2];
        }
        float f10 = this.f35979a5 / (i10 - 1);
        float w10 = w();
        for (int i11 = 0; i11 < i10 * 2; i11 += 2) {
            float[] fArr2 = this.ticksCoordinates;
            fArr2[i11] = this.f35951E + ((i11 / 2.0f) * f10);
            fArr2[i11 + 1] = w10;
        }
        if (t0()) {
            this.f36019r5.mapPoints(this.ticksCoordinates);
        }
    }

    public final float b0() {
        float f10 = this.f36027v5;
        if (q0() || t0()) {
            f10 = 1.0f - f10;
        }
        float f11 = this.f35965S4;
        float f12 = this.f35964R4;
        return (f10 * (f11 - f12)) + f12;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b1(Canvas canvas, Paint paint, RectF rectF, float f10, d dVar) {
        int i10;
        if (rectF.isEmpty()) {
            return;
        }
        float t10 = t(f10);
        float q10 = q(f10);
        int ordinal = dVar.ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                t10 = this.f35960P;
            } else if (ordinal == 3) {
                i10 = this.f35960P;
                t10 = i10;
            }
            paint.setStyle(Paint.Style.FILL);
            paint.setStrokeCap(Paint.Cap.BUTT);
            if (c0()) {
                paint.setAntiAlias(true);
            }
            RectF rectF2 = new RectF(rectF);
            if (t0()) {
                this.f36019r5.mapRect(rectF2);
            }
            this.f36001j5.reset();
            if (rectF.width() < t10 + q10) {
                this.f36001j5.addRoundRect(rectF2, X(t10, q10), Path.Direction.CW);
                canvas.drawPath(this.f36001j5, paint);
                return;
            }
            float min = Math.min(t10, q10);
            float max = Math.max(t10, q10);
            canvas.save();
            this.f36001j5.addRoundRect(rectF2, min, min, Path.Direction.CW);
            canvas.clipPath(this.f36001j5);
            int ordinal2 = dVar.ordinal();
            if (ordinal2 == 1) {
                RectF rectF3 = this.f36009n5;
                float f11 = rectF.left;
                rectF3.set(f11, rectF.top, (2.0f * max) + f11, rectF.bottom);
            } else if (ordinal2 != 2) {
                this.f36009n5.set(rectF.centerX() - max, rectF.top, rectF.centerX() + max, rectF.bottom);
            } else {
                RectF rectF4 = this.f36009n5;
                float f12 = rectF.right;
                rectF4.set(f12 - (2.0f * max), rectF.top, f12, rectF.bottom);
            }
            if (t0()) {
                this.f36019r5.mapRect(this.f36009n5);
            }
            canvas.drawRoundRect(this.f36009n5, max, max, paint);
            canvas.restore();
            return;
        }
        i10 = this.f35960P;
        q10 = i10;
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeCap(Paint.Cap.BUTT);
        if (c0()) {
        }
        RectF rectF22 = new RectF(rectF);
        if (t0()) {
        }
        this.f36001j5.reset();
        if (rectF.width() < t10 + q10) {
        }
    }

    public final boolean c0() {
        return this.f35955I > 0;
    }

    public final void c1() {
        Drawable drawable = this.f35973W;
        if (drawable != null) {
            if (!this.f35981b1 && this.f35993g1 != null) {
                this.f35973W = AbstractC5597a.r(drawable).mutate();
                this.f35981b1 = true;
            }
            if (this.f35981b1) {
                this.f35973W.setTintList(this.f35993g1);
            }
        }
    }

    public boolean d0() {
        return false;
    }

    public final void d1() {
        Drawable drawable = this.f35966T;
        if (drawable != null) {
            if (!this.f35970V && this.f35993g1 != null) {
                this.f35966T = AbstractC5597a.r(drawable).mutate();
                this.f35970V = true;
            }
            if (this.f35970V) {
                this.f35966T.setTintList(this.f35993g1);
            }
        }
    }

    @Override // android.view.View
    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return this.f35996h.dispatchHoverEvent(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        this.f35978a.setColor(V(this.f35999i5));
        this.f35980b.setColor(V(this.f35997h5));
        this.f35988e.setColor(V(this.f35995g5));
        this.f35990f.setColor(V(this.f35991f5));
        this.f35992g.setColor(V(this.f35995g5));
        for (Ma.a aVar : this.f36004l) {
            if (aVar.isStateful()) {
                aVar.setState(getDrawableState());
            }
        }
        if (this.f36021s5.isStateful()) {
            this.f36021s5.setState(getDrawableState());
        }
        this.f35986d.setColor(V(this.f35989e5));
        this.f35986d.setAlpha(63);
    }

    public final boolean e0() {
        return (this.f35966T == null && this.f35973W == null && this.f36013p1 == null && this.f36035y1 == null) ? false : true;
    }

    public final void e1() {
        Drawable drawable = this.f36035y1;
        if (drawable != null) {
            if (!this.f35967T1 && this.f35971V1 != null) {
                this.f36035y1 = AbstractC5597a.r(drawable).mutate();
                this.f35967T1 = true;
            }
            if (this.f35967T1) {
                this.f36035y1.setTintList(this.f35971V1);
            }
        }
    }

    public final Drawable f0(Drawable drawable) {
        Drawable newDrawable = drawable.mutate().getConstantState().newDrawable();
        n(newDrawable);
        return newDrawable;
    }

    public final void f1() {
        Drawable drawable = this.f36013p1;
        if (drawable != null) {
            if (!this.f36031x1 && this.f35971V1 != null) {
                this.f36013p1 = AbstractC5597a.r(drawable).mutate();
                this.f36031x1 = true;
            }
            if (this.f36031x1) {
                this.f36013p1.setTintList(this.f35971V1);
            }
        }
    }

    public final void g0() {
        this.f35978a.setStrokeWidth(this.f35950D);
        this.f35980b.setStrokeWidth(this.f35950D);
    }

    public final void g1(int i10) {
        this.f35979a5 = Math.max(i10 - (this.f35951E * 2), 0);
        Z0();
    }

    @Override // android.view.View
    public CharSequence getAccessibilityClassName() {
        return SeekBar.class.getName();
    }

    public final int getAccessibilityFocusedVirtualViewId() {
        return this.f35996h.getAccessibilityFocusedVirtualViewId();
    }

    public int getActiveThumbIndex() {
        return this.f35969U4;
    }

    public int getFocusedThumbIndex() {
        return this.f35972V4;
    }

    public int getHaloRadius() {
        return this.f35954H;
    }

    public ColorStateList getHaloTintList() {
        return this.f35989e5;
    }

    public int getLabelBehavior() {
        return this.f35949C;
    }

    public float getMinSeparation() {
        return 0.0f;
    }

    public float getStepSize() {
        return this.f35974W4;
    }

    public float getThumbElevation() {
        return this.f36021s5.A();
    }

    public int getThumbHeight() {
        return this.f35953G;
    }

    public int getThumbRadius() {
        return this.f35952F / 2;
    }

    public ColorStateList getThumbStrokeColor() {
        return this.f36021s5.I();
    }

    public float getThumbStrokeWidth() {
        return this.f36021s5.K();
    }

    public ColorStateList getThumbTintList() {
        return this.f36021s5.B();
    }

    public int getThumbTrackGapSize() {
        return this.f35955I;
    }

    public int getThumbWidth() {
        return this.f35952F;
    }

    public int getTickActiveRadius() {
        return this.f35976Y4;
    }

    public ColorStateList getTickActiveTintList() {
        return this.f35991f5;
    }

    public int getTickInactiveRadius() {
        return this.f35977Z4;
    }

    public ColorStateList getTickInactiveTintList() {
        return this.f35995g5;
    }

    public ColorStateList getTickTintList() {
        if (this.f35995g5.equals(this.f35991f5)) {
            return this.f35991f5;
        }
        throw new IllegalStateException("The inactive and active ticks are different colors. Use the getTickColorInactive() and getTickColorActive() methods instead.");
    }

    public int getTickVisibilityMode() {
        return this.f35975X4;
    }

    public ColorStateList getTrackActiveTintList() {
        return this.f35997h5;
    }

    public int getTrackCornerSize() {
        int i10 = this.f35959O;
        return i10 == -1 ? this.f35950D / 2 : i10;
    }

    public int getTrackHeight() {
        return this.f35950D;
    }

    public ColorStateList getTrackIconActiveColor() {
        return this.f35993g1;
    }

    public Drawable getTrackIconActiveEnd() {
        return this.f35973W;
    }

    public Drawable getTrackIconActiveStart() {
        return this.f35966T;
    }

    public ColorStateList getTrackIconInactiveColor() {
        return this.f35971V1;
    }

    public Drawable getTrackIconInactiveEnd() {
        return this.f36035y1;
    }

    public Drawable getTrackIconInactiveStart() {
        return this.f36013p1;
    }

    public int getTrackIconSize() {
        return this.f35982b2;
    }

    public ColorStateList getTrackInactiveTintList() {
        return this.f35999i5;
    }

    public int getTrackInsideCornerSize() {
        return this.f35960P;
    }

    public int getTrackSidePadding() {
        return this.f35951E;
    }

    public int getTrackStopIndicatorSize() {
        return this.f35958L;
    }

    public ColorStateList getTrackTintList() {
        if (this.f35999i5.equals(this.f35997h5)) {
            return this.f35997h5;
        }
        throw new IllegalStateException("The inactive and active parts of the track are different colors. Use the getInactiveTrackColor() and getActiveTrackColor() methods instead.");
    }

    public int getTrackWidth() {
        return this.f35979a5;
    }

    public float getValueFrom() {
        return this.f35964R4;
    }

    public float getValueTo() {
        return this.f35965S4;
    }

    @NonNull
    public List<Float> getValues() {
        return new ArrayList(this.f35968T4);
    }

    public boolean h0() {
        return this.f35963R;
    }

    public final void h1(boolean z10) {
        boolean z02 = z0();
        boolean y02 = y0();
        if (t0()) {
            X0();
        }
        if (z02 || z10) {
            requestLayout();
        } else if (y02) {
            postInvalidate();
        }
    }

    public final boolean i0() {
        for (ViewParent parent = getParent(); parent instanceof ViewGroup; parent = parent.getParent()) {
            ViewGroup viewGroup = (ViewGroup) parent;
            if ((viewGroup.canScrollHorizontally(1) || viewGroup.canScrollHorizontally(-1)) && viewGroup.shouldDelayChildPressedState()) {
                return true;
            }
        }
        return false;
    }

    public final void i1() {
        if (this.f35987d5) {
            l1();
            k1();
            j1();
            o1();
            this.f35987d5 = false;
        }
    }

    public final boolean j0() {
        for (ViewParent parent = getParent(); parent instanceof ViewGroup; parent = parent.getParent()) {
            ViewGroup viewGroup = (ViewGroup) parent;
            if ((viewGroup.canScrollVertically(1) || viewGroup.canScrollVertically(-1)) && viewGroup.shouldDelayChildPressedState()) {
                return true;
            }
        }
        return false;
    }

    public final void j1() {
        float minSeparation = getMinSeparation();
        if (minSeparation < 0.0f) {
            throw new IllegalStateException(String.format("minSeparation(%s) must be greater or equal to 0", Float.valueOf(minSeparation)));
        }
        float f10 = this.f35974W4;
        if (f10 <= 0.0f || minSeparation <= 0.0f) {
            return;
        }
        if (this.f36029w5 != 1) {
            throw new IllegalStateException(String.format("minSeparation(%s) cannot be set as a dimension when using stepSize(%s)", Float.valueOf(minSeparation), Float.valueOf(this.f35974W4)));
        }
        if (minSeparation < f10 || !l0(minSeparation)) {
            throw new IllegalStateException(String.format("minSeparation(%s) must be greater or equal and a multiple of stepSize(%s) when using stepSize(%s)", Float.valueOf(minSeparation), Float.valueOf(this.f35974W4), Float.valueOf(this.f35974W4)));
        }
    }

    public final void k1() {
        if (this.f35974W4 > 0.0f && !m1(this.f35965S4)) {
            throw new IllegalStateException(String.format("The stepSize(%s) must be 0, or a factor of the valueFrom(%s)-valueTo(%s) range", Float.valueOf(this.f35974W4), Float.valueOf(this.f35964R4), Float.valueOf(this.f35965S4)));
        }
    }

    public final boolean l0(double d10) {
        double doubleValue = new BigDecimal(Double.toString(d10)).divide(new BigDecimal(Float.toString(this.f35974W4)), MathContext.DECIMAL64).doubleValue();
        return Math.abs(((double) Math.round(doubleValue)) - doubleValue) < 1.0E-4d;
    }

    public final void l1() {
        if (this.f35964R4 >= this.f35965S4) {
            throw new IllegalStateException(String.format("valueFrom(%s) must be smaller than valueTo(%s)", Float.valueOf(this.f35964R4), Float.valueOf(this.f35965S4)));
        }
        Iterator it = this.f35968T4.iterator();
        while (it.hasNext()) {
            Float f10 = (Float) it.next();
            if (f10.floatValue() < this.f35964R4 || f10.floatValue() > this.f35965S4) {
                throw new IllegalStateException(String.format("Slider value(%s) must be greater or equal to valueFrom(%s), and lower or equal to valueTo(%s)", f10, Float.valueOf(this.f35964R4), Float.valueOf(this.f35965S4)));
            }
            if (this.f35974W4 > 0.0f && !m1(f10.floatValue())) {
                throw new IllegalStateException(String.format("Value(%s) must be equal to valueFrom(%s) plus a multiple of stepSize(%s) when using stepSize(%s)", f10, Float.valueOf(this.f35964R4), Float.valueOf(this.f35974W4), Float.valueOf(this.f35974W4)));
            }
        }
    }

    public void m(Ga.a aVar) {
        this.f36006m.add(aVar);
    }

    public final boolean m0(float f10) {
        float f11 = this.f35955I + (this.f35952F / 2.0f);
        float f12 = (this.f35979a5 + (this.f35951E * 2)) / 2.0f;
        return f10 >= f12 - f11 && f10 <= f12 + f11;
    }

    public final boolean m1(float f10) {
        return l0(new BigDecimal(Float.toString(f10)).subtract(new BigDecimal(Float.toString(this.f35964R4)), MathContext.DECIMAL64).doubleValue());
    }

    public final void n(Drawable drawable) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth == -1 && intrinsicHeight == -1) {
            drawable.setBounds(0, 0, this.f35952F, this.f35953G);
        } else {
            float max = Math.max(this.f35952F, this.f35953G) / Math.max(intrinsicWidth, intrinsicHeight);
            drawable.setBounds(0, 0, (int) (intrinsicWidth * max), (int) (intrinsicHeight * max));
        }
    }

    public final boolean n0(float f10) {
        float f11 = this.f35955I + (this.f35952F / 2.0f);
        Iterator it = this.f35968T4.iterator();
        if (it.hasNext()) {
            float n12 = n1(((Float) it.next()).floatValue());
            if (f10 >= n12 - f11 && f10 <= n12 + f11) {
                return true;
            }
        }
        return false;
    }

    public final float n1(float f10) {
        return (C0(f10) * this.f35979a5) + this.f35951E;
    }

    public final void o(Ma.a aVar) {
        aVar.H0(o.f(this));
    }

    public final boolean o0(MotionEvent motionEvent) {
        return !k0(motionEvent) && i0();
    }

    public final void o1() {
        float f10 = this.f35974W4;
        if (f10 == 0.0f) {
            return;
        }
        if (((int) f10) != f10) {
            Log.w(f35939C5, String.format("Floating point value used for %s(%s). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.", "stepSize", Float.valueOf(f10)));
        }
        float f11 = this.f35964R4;
        if (((int) f11) != f11) {
            Log.w(f35939C5, String.format("Floating point value used for %s(%s). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.", "valueFrom", Float.valueOf(f11)));
        }
        float f12 = this.f35965S4;
        if (((int) f12) != f12) {
            Log.w(f35939C5, String.format("Floating point value used for %s(%s). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.", "valueTo", Float.valueOf(f12)));
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f35948B5 = isShown();
        getViewTreeObserver().addOnScrollChangedListener(this.f36037y5);
        getViewTreeObserver().addOnGlobalLayoutListener(this.f36039z5);
        Iterator it = this.f36004l.iterator();
        while (it.hasNext()) {
            o((Ma.a) it.next());
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        b bVar = this.f36000j;
        if (bVar != null) {
            removeCallbacks(bVar);
        }
        this.f36010o = false;
        Iterator it = this.f36004l.iterator();
        while (it.hasNext()) {
            B((Ma.a) it.next());
        }
        getViewTreeObserver().removeOnScrollChangedListener(this.f36037y5);
        getViewTreeObserver().removeOnGlobalLayoutListener(this.f36039z5);
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.f35987d5) {
            i1();
            Z0();
        }
        super.onDraw(canvas);
        int w10 = w();
        H(canvas, this.f35979a5, w10);
        F(canvas, this.f35979a5, w10);
        if (q0() || t0()) {
            N(canvas, this.f36003k5, this.f36005l5);
        } else {
            N(canvas, this.f36003k5, this.f36007m5);
        }
        x0(canvas);
        w0(canvas, w10);
        if ((this.f35962Q4 || isFocused()) && isEnabled()) {
            v0(canvas, this.f35979a5, w10);
        }
        W0();
        K(canvas, this.f35979a5, w10);
    }

    @Override // android.view.View
    public void onFocusChanged(boolean z10, int i10, Rect rect) {
        super.onFocusChanged(z10, i10, rect);
        if (z10) {
            Q(i10);
            this.f35996h.requestKeyboardFocusForVirtualView(this.f35972V4);
        } else {
            this.f35969U4 = -1;
            this.f35996h.clearKeyboardFocusForVirtualView(this.f35972V4);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setVisibleToUser(false);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (!isEnabled()) {
            return super.onKeyDown(i10, keyEvent);
        }
        if (this.f35968T4.size() == 1) {
            this.f35969U4 = 0;
        }
        if (this.f35969U4 == -1) {
            Boolean D02 = D0(i10, keyEvent);
            return D02 != null ? D02.booleanValue() : super.onKeyDown(i10, keyEvent);
        }
        this.f35985c5 |= keyEvent.isLongPress();
        Float r10 = r(i10);
        if (r10 != null) {
            if (P0(((Float) this.f35968T4.get(this.f35969U4)).floatValue() + r10.floatValue())) {
                U0();
                postInvalidate();
            }
            return true;
        }
        if (i10 != 23) {
            if (i10 == 61) {
                if (keyEvent.hasNoModifiers()) {
                    return A0(1);
                }
                if (keyEvent.isShiftPressed()) {
                    return A0(-1);
                }
                return false;
            }
            if (i10 != 66) {
                return super.onKeyDown(i10, keyEvent);
            }
        }
        this.f35969U4 = -1;
        postInvalidate();
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i10, KeyEvent keyEvent) {
        this.f35985c5 = false;
        return super.onKeyUp(i10, keyEvent);
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f35947B + ((this.f35949C == 1 || N0()) ? ((Ma.a) this.f36004l.get(0)).getIntrinsicHeight() : 0), 1073741824);
        if (t0()) {
            super.onMeasure(makeMeasureSpec, i11);
        } else {
            super.onMeasure(i10, makeMeasureSpec);
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        SliderState sliderState = (SliderState) parcelable;
        super.onRestoreInstanceState(sliderState.getSuperState());
        this.f35964R4 = sliderState.f36040a;
        this.f35965S4 = sliderState.f36041b;
        M0(sliderState.f36042c);
        this.f35974W4 = sliderState.f36043d;
        if (sliderState.f36044e) {
            requestFocus();
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SliderState sliderState = new SliderState(super.onSaveInstanceState());
        sliderState.f36040a = this.f35964R4;
        sliderState.f36041b = this.f35965S4;
        sliderState.f36042c = new ArrayList(this.f35968T4);
        sliderState.f36043d = this.f35974W4;
        sliderState.f36044e = hasFocus();
        return sliderState;
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        if (t0()) {
            i10 = i11;
        }
        g1(i10);
        U0();
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004d, code lost:
    
        if (r3 != 3) goto L78;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i10;
        if (!isEnabled()) {
            return false;
        }
        float y10 = t0() ? motionEvent.getY() : motionEvent.getX();
        float x10 = t0() ? motionEvent.getX() : motionEvent.getY();
        float f10 = (y10 - this.f35951E) / this.f35979a5;
        this.f36027v5 = f10;
        float max = Math.max(0.0f, f10);
        this.f36027v5 = max;
        this.f36027v5 = Math.min(1.0f, max);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (!this.f35962Q4) {
                        if (!t0() && p0(motionEvent) && Math.abs(y10 - this.f36032x2) < this.f36018r) {
                            return false;
                        }
                        if (t0() && o0(motionEvent) && Math.abs(x10 - this.f36036y2) < this.f36018r * 0.8f) {
                            return false;
                        }
                        getParent().requestDisallowInterceptTouchEvent(true);
                        if (G0()) {
                            this.f35962Q4 = true;
                            Y0();
                            E0();
                        }
                    }
                    S0();
                    U0();
                    invalidate();
                }
            }
            this.f35962Q4 = false;
            MotionEvent motionEvent2 = this.f35961P4;
            if (motionEvent2 != null && motionEvent2.getActionMasked() == 0 && Math.abs(this.f35961P4.getX() - motionEvent.getX()) <= this.f36018r && Math.abs(this.f35961P4.getY() - motionEvent.getY()) <= this.f36018r && G0()) {
                E0();
            }
            if (this.f35969U4 != -1) {
                S0();
                U0();
                if (c0() && (i10 = this.f35956J) != -1 && this.f35957K != -1) {
                    setThumbWidth(i10);
                    setThumbTrackGapSize(this.f35957K);
                }
                this.f35969U4 = -1;
                F0();
            }
            invalidate();
        } else {
            this.f36032x2 = y10;
            this.f36036y2 = x10;
            if ((t0() || !p0(motionEvent)) && (!t0() || !o0(motionEvent))) {
                getParent().requestDisallowInterceptTouchEvent(true);
                if (G0()) {
                    requestFocus();
                    this.f35962Q4 = true;
                    Y0();
                    E0();
                    S0();
                    U0();
                    invalidate();
                }
            }
        }
        setPressed(this.f35962Q4);
        this.f35961P4 = MotionEvent.obtain(motionEvent);
        return true;
    }

    @Override // android.view.View
    public void onVisibilityAggregated(boolean z10) {
        super.onVisibilityAggregated(z10);
        this.f35948B5 = z10;
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i10) {
        ViewOverlay W10;
        super.onVisibilityChanged(view, i10);
        if (i10 == 0 || (W10 = W()) == null) {
            return;
        }
        Iterator it = this.f36004l.iterator();
        while (it.hasNext()) {
            W10.remove((Ma.a) it.next());
        }
    }

    public final void p(Canvas canvas, RectF rectF, Drawable drawable, boolean z10) {
        if (drawable != null) {
            x(rectF, this.f36015p5, this.f35982b2, this.f35994g2, z10);
            if (this.f36015p5.isEmpty()) {
                return;
            }
            M(canvas, this.f36015p5, drawable);
        }
    }

    public final boolean p0(MotionEvent motionEvent) {
        return !k0(motionEvent) && j0();
    }

    public final float q(float f10) {
        if (this.f35968T4.isEmpty() || !c0()) {
            return f10;
        }
        float n12 = n1(((Float) this.f35968T4.get((q0() || t0()) ? 0 : this.f35968T4.size() - 1)).floatValue()) - this.f35951E;
        int i10 = this.f35979a5;
        return n12 > ((float) i10) - f10 ? Math.max(i10 - n12, this.f35960P) : f10;
    }

    public final boolean q0() {
        return getLayoutDirection() == 1;
    }

    public final Float r(int i10) {
        float v10 = this.f35985c5 ? v(20) : u();
        if (i10 == 69) {
            return Float.valueOf(-v10);
        }
        if (i10 == 70 || i10 == 81) {
            return Float.valueOf(v10);
        }
        switch (i10) {
            case 19:
                if (t0()) {
                    return Float.valueOf(v10);
                }
                return null;
            case 20:
                if (t0()) {
                    return Float.valueOf(-v10);
                }
                return null;
            case 21:
                if (!q0()) {
                    v10 = -v10;
                }
                return Float.valueOf(v10);
            case 22:
                if (q0()) {
                    v10 = -v10;
                }
                return Float.valueOf(v10);
            default:
                return null;
        }
    }

    public final boolean r0() {
        Rect rect = new Rect();
        o.f(this).getHitRect(rect);
        return getLocalVisibleRect(rect) && s0();
    }

    public final void s(Ma.a aVar, float f10) {
        int C02;
        int intrinsicWidth;
        int w10;
        int intrinsicHeight;
        int i10;
        if (t0()) {
            C02 = (this.f35951E + ((int) (C0(f10) * this.f35979a5))) - (aVar.getIntrinsicHeight() / 2);
            intrinsicWidth = aVar.getIntrinsicHeight() + C02;
            if (!q0()) {
                int w11 = w() + this.f36014p2 + (this.f35953G / 2);
                w10 = aVar.getIntrinsicWidth() + w11;
                i10 = w11;
                this.f36011o5.set(C02, i10, intrinsicWidth, w10);
            }
            w10 = w() - (this.f36014p2 + (this.f35953G / 2));
            intrinsicHeight = aVar.getIntrinsicWidth();
        } else {
            C02 = (this.f35951E + ((int) (C0(f10) * this.f35979a5))) - (aVar.getIntrinsicWidth() / 2);
            intrinsicWidth = aVar.getIntrinsicWidth() + C02;
            w10 = w() - (this.f36014p2 + (this.f35953G / 2));
            intrinsicHeight = aVar.getIntrinsicHeight();
        }
        i10 = w10 - intrinsicHeight;
        this.f36011o5.set(C02, i10, intrinsicWidth, w10);
    }

    public final boolean s0() {
        return this.f35948B5;
    }

    public void setActiveThumbIndex(int i10) {
        this.f35969U4 = i10;
    }

    public void setCentered(boolean z10) {
        if (this.f35963R == z10) {
            return;
        }
        this.f35963R = z10;
        if (z10) {
            setValues(Float.valueOf((this.f35964R4 + this.f35965S4) / 2.0f));
        } else {
            setValues(Float.valueOf(this.f35964R4));
        }
        h1(true);
    }

    public void setCustomThumbDrawable(int i10) {
        setCustomThumbDrawable(getResources().getDrawable(i10));
    }

    public void setCustomThumbDrawablesForValues(@NonNull int... iArr) {
        Drawable[] drawableArr = new Drawable[iArr.length];
        for (int i10 = 0; i10 < iArr.length; i10++) {
            drawableArr[i10] = getResources().getDrawable(iArr[i10]);
        }
        setCustomThumbDrawablesForValues(drawableArr);
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        setLayerType(z10 ? 0 : 2, null);
    }

    public void setFocusedThumbIndex(int i10) {
        if (i10 < 0 || i10 >= this.f35968T4.size()) {
            throw new IllegalArgumentException("index out of range");
        }
        this.f35972V4 = i10;
        this.f35996h.requestKeyboardFocusForVirtualView(i10);
        postInvalidate();
    }

    public void setHaloRadius(int i10) {
        if (i10 == this.f35954H) {
            return;
        }
        this.f35954H = i10;
        Drawable background = getBackground();
        if (O0() || !(background instanceof RippleDrawable)) {
            postInvalidate();
        } else {
            ua.d.k((RippleDrawable) background, this.f35954H);
        }
    }

    public void setHaloRadiusResource(int i10) {
        setHaloRadius(getResources().getDimensionPixelSize(i10));
    }

    public void setHaloTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.f35989e5)) {
            return;
        }
        this.f35989e5 = colorStateList;
        Drawable background = getBackground();
        if (!O0() && (background instanceof RippleDrawable)) {
            ((RippleDrawable) background).setColor(colorStateList);
            return;
        }
        this.f35986d.setColor(V(colorStateList));
        this.f35986d.setAlpha(63);
        invalidate();
    }

    public void setLabelBehavior(int i10) {
        if (this.f35949C != i10) {
            this.f35949C = i10;
            h1(true);
        }
    }

    public void setOrientation(int i10) {
        if (this.f36038z == i10) {
            return;
        }
        this.f36038z = i10;
        h1(true);
    }

    public void setSeparationUnit(int i10) {
        this.f36029w5 = i10;
        this.f35987d5 = true;
        postInvalidate();
    }

    public void setStepSize(float f10) {
        if (f10 < 0.0f) {
            throw new IllegalArgumentException(String.format("The stepSize(%s) must be 0, or a factor of the valueFrom(%s)-valueTo(%s) range", Float.valueOf(f10), Float.valueOf(this.f35964R4), Float.valueOf(this.f35965S4)));
        }
        if (this.f35974W4 != f10) {
            this.f35974W4 = f10;
            this.f35987d5 = true;
            postInvalidate();
        }
    }

    public void setThumbElevation(float f10) {
        this.f36021s5.e0(f10);
    }

    public void setThumbElevationResource(int i10) {
        setThumbElevation(getResources().getDimension(i10));
    }

    public void setThumbHeight(int i10) {
        if (i10 == this.f35953G) {
            return;
        }
        this.f35953G = i10;
        this.f36021s5.setBounds(0, 0, this.f35952F, i10);
        Drawable drawable = this.f36023t5;
        if (drawable != null) {
            n(drawable);
        }
        Iterator it = this.f36025u5.iterator();
        while (it.hasNext()) {
            n((Drawable) it.next());
        }
        h1(false);
    }

    public void setThumbHeightResource(int i10) {
        setThumbHeight(getResources().getDimensionPixelSize(i10));
    }

    public void setThumbRadius(int i10) {
        int i11 = i10 * 2;
        setThumbWidth(i11);
        setThumbHeight(i11);
    }

    public void setThumbRadiusResource(int i10) {
        setThumbRadius(getResources().getDimensionPixelSize(i10));
    }

    public void setThumbStrokeColor(ColorStateList colorStateList) {
        this.f36021s5.o0(colorStateList);
        postInvalidate();
    }

    public void setThumbStrokeColorResource(int i10) {
        if (i10 != 0) {
            setThumbStrokeColor(AbstractC5596a.a(getContext(), i10));
        }
    }

    public void setThumbStrokeWidth(float f10) {
        this.f36021s5.p0(f10);
        postInvalidate();
    }

    public void setThumbStrokeWidthResource(int i10) {
        if (i10 != 0) {
            setThumbStrokeWidth(getResources().getDimension(i10));
        }
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.f36021s5.B())) {
            return;
        }
        this.f36021s5.f0(colorStateList);
        invalidate();
    }

    public void setThumbTrackGapSize(int i10) {
        if (this.f35955I == i10) {
            return;
        }
        this.f35955I = i10;
        invalidate();
    }

    public void setThumbWidth(int i10) {
        if (i10 == this.f35952F) {
            return;
        }
        this.f35952F = i10;
        this.f36021s5.setShapeAppearanceModel(n.a().q(0, this.f35952F / 2.0f).m());
        this.f36021s5.setBounds(0, 0, this.f35952F, this.f35953G);
        Drawable drawable = this.f36023t5;
        if (drawable != null) {
            n(drawable);
        }
        Iterator it = this.f36025u5.iterator();
        while (it.hasNext()) {
            n((Drawable) it.next());
        }
        h1(false);
    }

    public void setThumbWidthResource(int i10) {
        setThumbWidth(getResources().getDimensionPixelSize(i10));
    }

    public void setTickActiveRadius(int i10) {
        if (this.f35976Y4 != i10) {
            this.f35976Y4 = i10;
            this.f35990f.setStrokeWidth(i10 * 2);
            h1(false);
        }
    }

    public void setTickActiveTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.f35991f5)) {
            return;
        }
        this.f35991f5 = colorStateList;
        this.f35990f.setColor(V(colorStateList));
        invalidate();
    }

    public void setTickInactiveRadius(int i10) {
        if (this.f35977Z4 != i10) {
            this.f35977Z4 = i10;
            this.f35988e.setStrokeWidth(i10 * 2);
            h1(false);
        }
    }

    public void setTickInactiveTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.f35995g5)) {
            return;
        }
        this.f35995g5 = colorStateList;
        this.f35988e.setColor(V(colorStateList));
        invalidate();
    }

    public void setTickTintList(ColorStateList colorStateList) {
        setTickInactiveTintList(colorStateList);
        setTickActiveTintList(colorStateList);
    }

    public void setTickVisibilityMode(int i10) {
        if (this.f35975X4 != i10) {
            this.f35975X4 = i10;
            postInvalidate();
        }
    }

    public void setTickVisible(boolean z10) {
        setTickVisibilityMode(y(z10));
    }

    public void setTrackActiveTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.f35997h5)) {
            return;
        }
        this.f35997h5 = colorStateList;
        this.f35980b.setColor(V(colorStateList));
        invalidate();
    }

    public void setTrackCornerSize(int i10) {
        if (this.f35959O == i10) {
            return;
        }
        this.f35959O = i10;
        invalidate();
    }

    public void setTrackHeight(int i10) {
        if (this.f35950D != i10) {
            this.f35950D = i10;
            g0();
            h1(false);
        }
    }

    public void setTrackIconActiveColor(ColorStateList colorStateList) {
        if (colorStateList == this.f35993g1) {
            return;
        }
        this.f35993g1 = colorStateList;
        d1();
        c1();
        invalidate();
    }

    public void setTrackIconActiveEnd(Drawable drawable) {
        if (drawable == this.f35973W) {
            return;
        }
        this.f35973W = drawable;
        this.f35981b1 = false;
        c1();
        invalidate();
    }

    public void setTrackIconActiveStart(Drawable drawable) {
        if (drawable == this.f35966T) {
            return;
        }
        this.f35966T = drawable;
        this.f35970V = false;
        d1();
        invalidate();
    }

    public void setTrackIconInactiveColor(ColorStateList colorStateList) {
        if (colorStateList == this.f35971V1) {
            return;
        }
        this.f35971V1 = colorStateList;
        f1();
        e1();
        invalidate();
    }

    public void setTrackIconInactiveEnd(Drawable drawable) {
        if (drawable == this.f36035y1) {
            return;
        }
        this.f36035y1 = drawable;
        this.f35967T1 = false;
        e1();
        invalidate();
    }

    public void setTrackIconInactiveStart(Drawable drawable) {
        if (drawable == this.f36013p1) {
            return;
        }
        this.f36013p1 = drawable;
        this.f36031x1 = false;
        f1();
        invalidate();
    }

    public void setTrackIconSize(int i10) {
        if (this.f35982b2 == i10) {
            return;
        }
        this.f35982b2 = i10;
        invalidate();
    }

    public void setTrackInactiveTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.f35999i5)) {
            return;
        }
        this.f35999i5 = colorStateList;
        this.f35978a.setColor(V(colorStateList));
        invalidate();
    }

    public void setTrackInsideCornerSize(int i10) {
        if (this.f35960P == i10) {
            return;
        }
        this.f35960P = i10;
        invalidate();
    }

    public void setTrackStopIndicatorSize(int i10) {
        if (this.f35958L == i10) {
            return;
        }
        this.f35958L = i10;
        this.f35992g.setStrokeWidth(i10);
        invalidate();
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        setTrackInactiveTintList(colorStateList);
        setTrackActiveTintList(colorStateList);
    }

    public void setValueFrom(float f10) {
        this.f35964R4 = f10;
        this.f35987d5 = true;
        postInvalidate();
    }

    public void setValueTo(float f10) {
        this.f35965S4 = f10;
        this.f35987d5 = true;
        postInvalidate();
    }

    public void setValues(@NonNull Float... fArr) {
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, fArr);
        M0(arrayList);
    }

    public final float t(float f10) {
        if (this.f35968T4.isEmpty() || !c0()) {
            return f10;
        }
        float n12 = n1(((Float) this.f35968T4.get((q0() || t0()) ? this.f35968T4.size() - 1 : 0)).floatValue()) - this.f35951E;
        return n12 < f10 ? Math.max(n12, this.f35960P) : f10;
    }

    public boolean t0() {
        return this.f36038z == 1;
    }

    public final float u() {
        float f10 = this.f35974W4;
        if (f10 == 0.0f) {
            return 1.0f;
        }
        return f10;
    }

    public final void u0(Resources resources) {
        this.f35945A = resources.getDimensionPixelSize(e.f48306I0);
        int dimensionPixelOffset = resources.getDimensionPixelOffset(e.f48304H0);
        this.f36020s = dimensionPixelOffset;
        this.f35951E = dimensionPixelOffset;
        this.f36022t = resources.getDimensionPixelSize(e.f48296D0);
        this.f36024u = resources.getDimensionPixelSize(e.f48302G0);
        this.f36026v = resources.getDimensionPixelSize(e.f48300F0);
        this.f36028w = resources.getDimensionPixelSize(e.f48300F0);
        this.f36030x = resources.getDimensionPixelSize(e.f48298E0);
        this.f36014p2 = resources.getDimensionPixelSize(e.f48294C0);
        this.f35994g2 = resources.getDimensionPixelOffset(e.f48305I);
    }

    public final float v(int i10) {
        float u10 = u();
        return (this.f35965S4 - this.f35964R4) / u10 <= i10 ? u10 : Math.round(r1 / r4) * u10;
    }

    public final void v0(Canvas canvas, int i10, int i11) {
        Canvas canvas2;
        if (O0()) {
            float[] fArr = {this.f35951E + (C0(((Float) this.f35968T4.get(this.f35972V4)).floatValue()) * i10), i11};
            if (t0()) {
                this.f36019r5.mapPoints(fArr);
            }
            if (Build.VERSION.SDK_INT < 28) {
                float f10 = fArr[0];
                int i12 = this.f35954H;
                float f11 = fArr[1];
                canvas2 = canvas;
                canvas2.clipRect(f10 - i12, f11 - i12, f10 + i12, f11 + i12, Region.Op.UNION);
            } else {
                canvas2 = canvas;
            }
            canvas2.drawCircle(fArr[0], fArr[1], this.f35954H, this.f35986d);
        }
    }

    public final int w() {
        return (this.f35947B / 2) + ((this.f35949C == 1 || N0()) ? ((Ma.a) this.f36004l.get(0)).getIntrinsicHeight() : 0);
    }

    public final void w0(Canvas canvas, int i10) {
        if (this.f35958L <= 0 || this.f35968T4.isEmpty()) {
            return;
        }
        ArrayList arrayList = this.f35968T4;
        float floatValue = ((Float) arrayList.get(arrayList.size() - 1)).floatValue();
        float f10 = this.f35965S4;
        if (floatValue < f10) {
            I(canvas, n1(f10), i10);
        }
        if (h0() || (this.f35968T4.size() > 1 && ((Float) this.f35968T4.get(0)).floatValue() > this.f35964R4)) {
            I(canvas, n1(this.f35964R4), i10);
        }
    }

    public final void x(RectF rectF, RectF rectF2, int i10, int i11, boolean z10) {
        if (rectF.right - rectF.left < (i11 * 2) + i10) {
            rectF2.setEmpty();
            return;
        }
        float f10 = z10 ^ (q0() || t0()) ? rectF.left + i11 : (rectF.right - i11) - i10;
        float f11 = i10;
        float w10 = w() - (f11 / 2.0f);
        rectF2.set(f10, w10, f10 + f11, f11 + w10);
    }

    public final void x0(Canvas canvas) {
        float[] fArr = this.ticksCoordinates;
        if (fArr == null || fArr.length == 0) {
            return;
        }
        float[] S10 = S();
        int ceil = (int) Math.ceil(S10[0] * ((this.ticksCoordinates.length / 2.0f) - 1.0f));
        int floor = (int) Math.floor(S10[1] * ((this.ticksCoordinates.length / 2.0f) - 1.0f));
        if (ceil > 0) {
            L(0, ceil * 2, canvas, this.f35988e);
        }
        if (ceil <= floor) {
            L(ceil * 2, (floor + 1) * 2, canvas, this.f35990f);
        }
        int i10 = (floor + 1) * 2;
        float[] fArr2 = this.ticksCoordinates;
        if (i10 < fArr2.length) {
            L(i10, fArr2.length, canvas, this.f35988e);
        }
    }

    public final int y(boolean z10) {
        return z10 ? 0 : 2;
    }

    public final boolean y0() {
        int max = this.f36020s + Math.max(Math.max(Math.max((this.f35952F / 2) - this.f36022t, 0), Math.max((this.f35950D - this.f36024u) / 2, 0)), Math.max(Math.max(this.f35976Y4 - this.f36026v, 0), Math.max(this.f35977Z4 - this.f36028w, 0)));
        if (this.f35951E == max) {
            return false;
        }
        this.f35951E = max;
        if (!isLaidOut()) {
            return true;
        }
        g1(t0() ? getHeight() : getWidth());
        return true;
    }

    public final ValueAnimator z(boolean z10) {
        int f10;
        TimeInterpolator g10;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(T(z10 ? this.f36016q : this.f36012p, z10 ? 0.0f : 1.0f), z10 ? 1.0f : 0.0f);
        if (z10) {
            f10 = h.f(getContext(), f35941E5, 83);
            g10 = h.g(getContext(), f35943G5, AbstractC5104a.f53862e);
        } else {
            f10 = h.f(getContext(), f35942F5, 117);
            g10 = h.g(getContext(), f35944H5, AbstractC5104a.f53860c);
        }
        ofFloat.setDuration(f10);
        ofFloat.setInterpolator(g10);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: Ga.b
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                BaseSlider.b(BaseSlider.this, valueAnimator);
            }
        });
        return ofFloat;
    }

    public final boolean z0() {
        int paddingTop;
        int paddingBottom;
        if (t0()) {
            paddingTop = getPaddingLeft();
            paddingBottom = getPaddingRight();
        } else {
            paddingTop = getPaddingTop();
            paddingBottom = getPaddingBottom();
        }
        int i10 = paddingTop + paddingBottom;
        int max = Math.max(this.f35945A, Math.max(this.f35950D + i10, this.f35953G + i10));
        if (max == this.f35947B) {
            return false;
        }
        this.f35947B = max;
        return true;
    }

    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public int f36046a;

        public b() {
            this.f36046a = -1;
        }

        public void a(int i10) {
            this.f36046a = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            BaseSlider.this.f35996h.sendEventForVirtualView(this.f36046a, 4);
        }

        public /* synthetic */ b(BaseSlider baseSlider, a aVar) {
            this();
        }
    }

    public void setCustomThumbDrawable(Drawable drawable) {
        this.f36023t5 = f0(drawable);
        this.f36025u5.clear();
        postInvalidate();
    }

    public void setValues(@NonNull List<Float> list) {
        M0(new ArrayList(list));
    }

    public void setCustomThumbDrawablesForValues(@NonNull Drawable... drawableArr) {
        this.f36023t5 = null;
        this.f36025u5 = new ArrayList();
        for (Drawable drawable : drawableArr) {
            this.f36025u5.add(f0(drawable));
        }
        postInvalidate();
    }

    public void setTrackIconActiveEnd(int i10) {
        setTrackIconActiveEnd(i10 != 0 ? AbstractC5596a.b(getContext(), i10) : null);
    }

    public void setTrackIconActiveStart(int i10) {
        setTrackIconActiveStart(i10 != 0 ? AbstractC5596a.b(getContext(), i10) : null);
    }

    public void setTrackIconInactiveEnd(int i10) {
        setTrackIconInactiveEnd(i10 != 0 ? AbstractC5596a.b(getContext(), i10) : null);
    }

    public void setTrackIconInactiveStart(int i10) {
        setTrackIconInactiveStart(i10 != 0 ? AbstractC5596a.b(getContext(), i10) : null);
    }

    public void setLabelFormatter(f fVar) {
    }
}
