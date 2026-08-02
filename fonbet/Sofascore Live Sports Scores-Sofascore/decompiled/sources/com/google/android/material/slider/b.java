package com.google.android.material.slider;

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
import android.graphics.drawable.DrawableWrapper;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewOverlay;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.focus.FocusRingDrawable;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.a70;
import defpackage.bsk;
import defpackage.by4;
import defpackage.e6;
import defpackage.e80;
import defpackage.e9j;
import defpackage.eb;
import defpackage.eq3;
import defpackage.he8;
import defpackage.hg6;
import defpackage.hz8;
import defpackage.k13;
import defpackage.l4a;
import defpackage.m6k;
import defpackage.me4;
import defpackage.mz1;
import defpackage.o23;
import defpackage.o3a;
import defpackage.oyn;
import defpackage.p61;
import defpackage.pjf;
import defpackage.q0;
import defpackage.q61;
import defpackage.qzb;
import defpackage.r61;
import defpackage.s2;
import defpackage.s6a;
import defpackage.skj;
import defpackage.tk2;
import defpackage.ug5;
import defpackage.uk2;
import defpackage.vha;
import defpackage.w3a;
import defpackage.wah;
import defpackage.wt3;
import defpackage.wzb;
import defpackage.x2a;
import defpackage.xah;
import defpackage.xrk;
import defpackage.y2;
import defpackage.yfa;
import defpackage.z7j;
import defpackage.zzl;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class b extends View {
    public static final /* synthetic */ int f1 = 0;
    public final int A;
    public int A0;
    public int B;
    public boolean B0;
    public final int C;
    public boolean C0;
    public int D;
    public ColorStateList D0;
    public int E;
    public ColorStateList E0;
    public int F;
    public ColorStateList F0;
    public int G;
    public ColorStateList G0;
    public int H;
    public ColorStateList H0;
    public int I;
    public final Path I0;
    public int J;
    public final RectF J0;
    public int K;
    public final RectF K0;
    public int L;
    public final RectF L0;
    public int M;
    public final RectF M0;
    public int N;
    public final Rect N0;
    public int O;
    public final RectF O0;
    public int P;
    public final Rect P0;
    public int Q;
    public final Matrix Q0;
    public boolean R;
    public final ArrayList R0;
    public Drawable S;
    public Drawable S0;
    public boolean T;
    public List T0;
    public Drawable U;
    public float U0;
    public boolean V;
    public float V0;
    public ColorStateList W;
    public ColorStateList W0;
    public ColorStateList X0;
    public float Y0;
    public int Z0;
    public final Paint a;
    public Drawable a0;
    public final int a1;
    public final Paint b;
    public boolean b0;
    public final p61 b1;
    public final Paint c;
    public Drawable c0;
    public final e6 c1;
    public final Paint d;
    public boolean d0;
    public final y2 d1;
    public final Paint e;
    public ColorStateList e0;
    public boolean e1;
    public final Paint f;
    public int f0;
    public final Paint g;
    public final int g0;
    public final r61 h;
    public final int h0;
    public final AccessibilityManager i;
    public float i0;
    public q61 j;
    public float j0;
    public final int k;
    public MotionEvent k0;
    public final ArrayList l;
    public final Rect l0;
    public final ArrayList m;
    public final ArrayList m0;
    public final ArrayList n;
    public List n0;
    public boolean o;
    public boolean o0;
    public ValueAnimator p;
    public float p0;
    public ValueAnimator q;
    public float q0;
    public final int r;
    public ArrayList r0;
    public final int s;
    public int s0;
    public final int t;
    public int t0;
    public final int u;
    public float u0;
    public final int v;
    public int v0;
    public final int w;
    public float[] w0;
    public final int x;
    public int x0;
    public final int y;
    public int y0;
    public final int z;
    public int z0;

    public b(Context context, AttributeSet attributeSet) {
        super(oyn.U(context, attributeSet, R.attr.sliderStyle, R.style.Widget_MaterialComponents_Slider), attributeSet, R.attr.sliderStyle);
        this.l = new ArrayList();
        this.m = new ArrayList();
        this.n = new ArrayList();
        this.o = false;
        this.L = -1;
        this.M = -1;
        this.N = -1;
        this.R = false;
        this.T = false;
        this.V = false;
        this.b0 = false;
        this.d0 = false;
        this.l0 = new Rect();
        this.m0 = new ArrayList();
        this.n0 = new ArrayList();
        this.o0 = false;
        this.r0 = new ArrayList();
        this.s0 = -1;
        this.t0 = -1;
        this.u0 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.v0 = 0;
        this.B0 = false;
        this.I0 = new Path();
        this.J0 = new RectF();
        this.K0 = new RectF();
        this.L0 = new RectF();
        this.M0 = new RectF();
        this.N0 = new Rect();
        this.O0 = new RectF();
        this.P0 = new Rect();
        this.Q0 = new Matrix();
        this.R0 = new ArrayList();
        this.T0 = Collections.EMPTY_LIST;
        this.Z0 = 0;
        RangeSlider rangeSlider = (RangeSlider) this;
        this.b1 = new p61(0, rangeSlider);
        this.c1 = new e6(1, rangeSlider);
        this.d1 = new y2(rangeSlider, 23);
        Context context2 = getContext();
        this.e1 = isShown();
        this.a = new Paint();
        this.b = new Paint();
        Paint paint = new Paint(1);
        this.c = paint;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        Paint paint2 = new Paint(1);
        this.d = paint2;
        paint2.setStyle(style);
        Paint paint3 = new Paint();
        this.e = paint3;
        Paint.Style style2 = Paint.Style.STROKE;
        paint3.setStyle(style2);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint3.setStrokeCap(cap);
        Paint paint4 = new Paint();
        this.f = paint4;
        paint4.setStyle(style2);
        paint4.setStrokeCap(cap);
        Paint paint5 = new Paint();
        this.g = paint5;
        paint5.setStyle(style);
        paint5.setStrokeCap(cap);
        this.s = context2.getResources().getDimensionPixelSize(R.dimen.m3_slider_focus_ring_thumb_height_decrease);
        Resources resources = context2.getResources();
        this.C = resources.getDimensionPixelSize(R.dimen.mtrl_slider_widget_height);
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_slider_track_side_padding);
        this.t = dimensionPixelOffset;
        this.G = dimensionPixelOffset;
        this.u = resources.getDimensionPixelSize(R.dimen.mtrl_slider_thumb_radius);
        this.v = resources.getDimensionPixelSize(R.dimen.mtrl_slider_track_height);
        this.w = resources.getDimensionPixelSize(R.dimen.mtrl_slider_tick_radius);
        this.x = resources.getDimensionPixelSize(R.dimen.mtrl_slider_tick_radius);
        this.y = resources.getDimensionPixelSize(R.dimen.mtrl_slider_tick_min_spacing);
        this.h0 = resources.getDimensionPixelSize(R.dimen.mtrl_slider_label_padding);
        this.g0 = resources.getDimensionPixelOffset(R.dimen.m3_slider_track_icon_padding);
        this.A = resources.getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        m6k.v(context2, attributeSet, R.attr.sliderStyle, R.style.Widget_MaterialComponents_Slider);
        int[] iArr = pjf.P;
        m6k.w(context2, attributeSet, iArr, R.attr.sliderStyle, R.style.Widget_MaterialComponents_Slider, new int[0]);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, R.attr.sliderStyle, R.style.Widget_MaterialComponents_Slider);
        setOrientation(obtainStyledAttributes.getInt(2, 0));
        this.k = obtainStyledAttributes.getResourceId(11, R.style.Widget_MaterialComponents_Tooltip);
        this.p0 = obtainStyledAttributes.getFloat(4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.q0 = obtainStyledAttributes.getFloat(5, 1.0f);
        setCentered(obtainStyledAttributes.getBoolean(6, false));
        this.u0 = obtainStyledAttributes.getFloat(3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.v0 = obtainStyledAttributes.getInt(7, 0);
        this.z = (int) Math.ceil(obtainStyledAttributes.getDimension(12, x2a.N(context2)));
        boolean hasValue = obtainStyledAttributes.hasValue(28);
        int i = hasValue ? 28 : 30;
        int i2 = hasValue ? 28 : 29;
        ColorStateList x = w3a.x(context2, obtainStyledAttributes, i);
        setTrackInactiveTintList(x == null ? eq3.q(R.color.material_slider_inactive_track_color, context2) : x);
        ColorStateList x2 = w3a.x(context2, obtainStyledAttributes, i2);
        setTrackActiveTintList(x2 == null ? eq3.q(R.color.material_slider_active_track_color, context2) : x2);
        ColorStateList x3 = w3a.x(context2, obtainStyledAttributes, 13);
        setThumbTintList(x3 == null ? eq3.q(R.color.material_slider_thumb_color, context2) : x3);
        if (obtainStyledAttributes.hasValue(17)) {
            setThumbStrokeColor(w3a.x(context2, obtainStyledAttributes, 17));
        }
        setThumbStrokeWidth(obtainStyledAttributes.getDimension(18, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        ColorStateList x4 = w3a.x(context2, obtainStyledAttributes, 8);
        setHaloTintList(x4 == null ? eq3.q(R.color.material_slider_halo_color, context2) : x4);
        this.x0 = obtainStyledAttributes.hasValue(26) ? obtainStyledAttributes.getInt(26, -1) : obtainStyledAttributes.getBoolean(27, true) ? 0 : 2;
        boolean hasValue2 = obtainStyledAttributes.hasValue(21);
        int i3 = hasValue2 ? 21 : 23;
        int i4 = hasValue2 ? 21 : 22;
        ColorStateList x5 = w3a.x(context2, obtainStyledAttributes, i3);
        setTickInactiveTintList(x5 == null ? eq3.q(R.color.material_slider_inactive_tick_marks_color, context2) : x5);
        ColorStateList x6 = w3a.x(context2, obtainStyledAttributes, i4);
        setTickActiveTintList(x6 == null ? eq3.q(R.color.material_slider_active_tick_marks_color, context2) : x6);
        setThumbTrackGapSize(obtainStyledAttributes.getDimensionPixelSize(19, 0));
        setTrackStopIndicatorSize(obtainStyledAttributes.getDimensionPixelSize(41, 0));
        setTrackCornerSize(obtainStyledAttributes.getDimensionPixelSize(31, -1));
        setTrackInsideCornerSize(obtainStyledAttributes.getDimensionPixelSize(40, 0));
        setTrackIconActiveStart(w3a.z(context2, obtainStyledAttributes, 35));
        setTrackIconActiveEnd(w3a.z(context2, obtainStyledAttributes, 34));
        setTrackIconActiveColor(w3a.x(context2, obtainStyledAttributes, 33));
        setTrackIconInactiveStart(w3a.z(context2, obtainStyledAttributes, 38));
        setTrackIconInactiveEnd(w3a.z(context2, obtainStyledAttributes, 37));
        setTrackIconInactiveColor(w3a.x(context2, obtainStyledAttributes, 36));
        setTrackIconSize(obtainStyledAttributes.getDimensionPixelSize(39, 0));
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(16, 0) * 2;
        int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(20, dimensionPixelSize);
        int dimensionPixelSize3 = obtainStyledAttributes.getDimensionPixelSize(15, dimensionPixelSize);
        setThumbWidth(dimensionPixelSize2);
        setThumbHeight(dimensionPixelSize3);
        setHaloRadius(obtainStyledAttributes.getDimensionPixelSize(9, 0));
        setThumbElevation(obtainStyledAttributes.getDimension(14, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        setTrackHeight(obtainStyledAttributes.getDimensionPixelSize(32, 0));
        setTickActiveRadius(obtainStyledAttributes.getDimensionPixelSize(24, this.O / 2));
        setTickInactiveRadius(obtainStyledAttributes.getDimensionPixelSize(25, this.O / 2));
        setLabelBehavior(obtainStyledAttributes.getInt(10, 0));
        if (!obtainStyledAttributes.getBoolean(0, true)) {
            setEnabled(false);
        }
        setValues(Float.valueOf(this.p0));
        obtainStyledAttributes.recycle();
        setFocusable(true);
        setClickable(true);
        this.r = ViewConfiguration.get(context2).getScaledTouchSlop();
        r61 r61Var = new r61(rangeSlider);
        this.h = r61Var;
        bsk.q(this, r61Var);
        AccessibilityManager accessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.i = accessibilityManager;
        if (Build.VERSION.SDK_INT >= 29) {
            this.a1 = accessibilityManager.getRecommendedTimeoutMillis(10000, 6);
        } else {
            this.a1 = UnityAdsConstants.RequestPolicy.RETRY_MAX_DURATION;
        }
    }

    public final void A(int i, int i2, Integer num) {
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.R0;
            if (i3 >= arrayList.size()) {
                Q(false);
                return;
            }
            if (num == null || i3 == num.intValue()) {
                qzb qzbVar = (qzb) arrayList.get(i3);
                ug5 ug5Var = new ug5();
                ug5 ug5Var2 = new ug5();
                ug5 ug5Var3 = new ug5();
                ug5 ug5Var4 = new ug5();
                float f = i / 2.0f;
                hz8 n = l4a.n(0);
                q0 q0Var = new q0(f);
                q0 q0Var2 = new q0(f);
                q0 q0Var3 = new q0(f);
                q0 q0Var4 = new q0(f);
                xah xahVar = new xah();
                xahVar.a = n;
                xahVar.b = n;
                xahVar.c = n;
                xahVar.d = n;
                xahVar.e = q0Var;
                xahVar.f = q0Var2;
                xahVar.g = q0Var3;
                xahVar.h = q0Var4;
                xahVar.i = ug5Var;
                xahVar.j = ug5Var2;
                xahVar.k = ug5Var3;
                xahVar.l = ug5Var4;
                qzbVar.setShapeAppearanceModel(xahVar);
                ((qzb) arrayList.get(i3)).setBounds(0, 0, i, i2 >= 0 ? i2 : this.I);
            }
            i3++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00c6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B(skj skjVar, float f) {
        int v;
        int intrinsicWidth;
        int d;
        int intrinsicHeight;
        int i;
        ViewOverlay overlay;
        String format = String.format(((float) ((int) f)) == f ? "%.0f" : "%.2f", Float.valueOf(f));
        if (!TextUtils.equals(skjVar.H, format)) {
            skjVar.H = format;
            skjVar.K.e = true;
            skjVar.invalidateSelf();
        }
        boolean t = t();
        int i2 = this.G;
        int i3 = this.h0;
        if (t) {
            v = (i2 + ((int) (v(f) * this.A0))) - (skjVar.getIntrinsicHeight() / 2);
            intrinsicWidth = skjVar.getIntrinsicHeight() + v;
            if (!s()) {
                i = (this.I / 2) + i3 + d();
                d = skjVar.getIntrinsicWidth() + i;
                Rect rect = this.N0;
                rect.set(v, i, intrinsicWidth, d);
                if (t()) {
                    RectF rectF = new RectF(rect);
                    this.Q0.mapRect(rectF);
                    rectF.round(rect);
                }
                by4.c(vha.s(this), this, rect);
                skjVar.setBounds(rect);
                ViewGroup s = vha.s(this);
                overlay = s != null ? null : s.getOverlay();
                if (overlay != null) {
                    return;
                }
                overlay.add(skjVar);
                return;
            }
            d = d() - ((this.I / 2) + i3);
            intrinsicHeight = skjVar.getIntrinsicWidth();
        } else {
            v = (i2 + ((int) (v(f) * this.A0))) - (skjVar.getIntrinsicWidth() / 2);
            intrinsicWidth = skjVar.getIntrinsicWidth() + v;
            d = d() - ((this.I / 2) + i3);
            intrinsicHeight = skjVar.getIntrinsicHeight();
        }
        i = d - intrinsicHeight;
        Rect rect2 = this.N0;
        rect2.set(v, i, intrinsicWidth, d);
        if (t()) {
        }
        by4.c(vha.s(this), this, rect2);
        skjVar.setBounds(rect2);
        ViewGroup s2 = vha.s(this);
        if (s2 != null) {
        }
        if (overlay != null) {
        }
    }

    public final void C(ArrayList arrayList) {
        ViewGroup s;
        int resourceId;
        ViewGroup s2;
        if (arrayList.isEmpty()) {
            a70.p("At least one value must be set");
            return;
        }
        Collections.sort(arrayList);
        if (this.r0.size() == arrayList.size() && this.r0.equals(arrayList)) {
            return;
        }
        this.r0 = arrayList;
        this.C0 = true;
        ArrayList arrayList2 = this.R0;
        if (arrayList2.size() != this.r0.size()) {
            arrayList2.clear();
            for (int i = 0; i < this.r0.size(); i++) {
                qzb qzbVar = new qzb();
                qzbVar.w();
                qzbVar.t(getThumbTintList());
                ug5 ug5Var = new ug5();
                ug5 ug5Var2 = new ug5();
                ug5 ug5Var3 = new ug5();
                ug5 ug5Var4 = new ug5();
                float f = this.H / 2.0f;
                hz8 n = l4a.n(0);
                q0 q0Var = new q0(f);
                q0 q0Var2 = new q0(f);
                q0 q0Var3 = new q0(f);
                q0 q0Var4 = new q0(f);
                xah xahVar = new xah();
                xahVar.a = n;
                xahVar.b = n;
                xahVar.c = n;
                xahVar.d = n;
                xahVar.e = q0Var;
                xahVar.f = q0Var2;
                xahVar.g = q0Var3;
                xahVar.h = q0Var4;
                xahVar.i = ug5Var;
                xahVar.j = ug5Var2;
                xahVar.k = ug5Var3;
                xahVar.l = ug5Var4;
                qzbVar.setShapeAppearanceModel(xahVar);
                qzbVar.setBounds(0, 0, this.H, this.I);
                qzbVar.s(getThumbElevation());
                qzbVar.A(getThumbStrokeWidth());
                qzbVar.z(getThumbStrokeColor());
                qzbVar.setState(getDrawableState());
                arrayList2.add(qzbVar);
            }
        }
        this.t0 = 0;
        G();
        ArrayList arrayList3 = this.l;
        if (arrayList3.size() > this.r0.size()) {
            List<skj> subList = arrayList3.subList(this.r0.size(), arrayList3.size());
            for (skj skjVar : subList) {
                if (isAttachedToWindow() && (s2 = vha.s(this)) != null) {
                    s2.getOverlay().remove(skjVar);
                    s2.removeOnLayoutChangeListener(skjVar.L);
                }
            }
            subList.clear();
        }
        while (arrayList3.size() < this.r0.size()) {
            Context context = getContext();
            int i2 = this.k;
            skj skjVar2 = new skj(context, i2);
            TypedArray Y = m6k.Y(skjVar2.I, null, pjf.W, 0, i2, new int[0]);
            Context context2 = skjVar2.I;
            skjVar2.S = context2.getResources().getDimensionPixelSize(R.dimen.mtrl_tooltip_arrowSize);
            boolean z = Y.getBoolean(8, true);
            skjVar2.R = z;
            if (z) {
                wah m = skjVar2.k().m();
                m.k = skjVar2.G();
                skjVar2.setShapeAppearanceModel(m.a());
            } else {
                skjVar2.S = 0;
            }
            CharSequence text = Y.getText(6);
            boolean equals = TextUtils.equals(skjVar2.H, text);
            e9j e9jVar = skjVar2.K;
            if (!equals) {
                skjVar2.H = text;
                e9jVar.e = true;
                skjVar2.invalidateSelf();
            }
            z7j z7jVar = (!Y.hasValue(0) || (resourceId = Y.getResourceId(0, 0)) == 0) ? null : new z7j(context2, resourceId);
            if (z7jVar != null && Y.hasValue(1)) {
                z7jVar.k = w3a.x(context2, Y, 1);
            }
            e9jVar.c(z7jVar, context2);
            skjVar2.t(ColorStateList.valueOf(Y.getColor(7, o23.h(o23.k(o3a.O(context2, x2a.P(context2, R.attr.colorOnBackground, skj.class.getCanonicalName())), 153), o23.k(o3a.O(context2, x2a.P(context2, android.R.attr.colorBackground, skj.class.getCanonicalName())), 229)))));
            skjVar2.y(ColorStateList.valueOf(o3a.O(context2, x2a.P(context2, R.attr.colorSurface, skj.class.getCanonicalName()))));
            skjVar2.N = Y.getDimensionPixelSize(2, 0);
            skjVar2.O = Y.getDimensionPixelSize(4, 0);
            skjVar2.P = Y.getDimensionPixelSize(5, 0);
            skjVar2.Q = Y.getDimensionPixelSize(3, 0);
            Y.recycle();
            arrayList3.add(skjVar2);
            if (isAttachedToWindow() && (s = vha.s(this)) != null) {
                int[] iArr = new int[2];
                s.getLocationOnScreen(iArr);
                skjVar2.T = iArr[0];
                s.getWindowVisibleDisplayFrame(skjVar2.M);
                s.addOnLayoutChangeListener(skjVar2.L);
            }
        }
        int i3 = arrayList3.size() == 1 ? 0 : 1;
        Iterator it = arrayList3.iterator();
        while (it.hasNext()) {
            ((skj) it.next()).A(i3);
        }
        Iterator it2 = this.m.iterator();
        while (it2.hasNext()) {
            tk2 tk2Var = (tk2) it2.next();
            Iterator it3 = this.r0.iterator();
            while (it3.hasNext()) {
                ((Float) it3.next()).getClass();
                tk2Var.a(this);
            }
        }
        postInvalidate();
    }

    public final boolean D(float f, int i) {
        ViewParent parent;
        this.t0 = i;
        if (Math.abs(f - ((Float) this.r0.get(i)).floatValue()) < 1.0E-4d) {
            return false;
        }
        float minSeparation = getMinSeparation();
        if (this.Z0 == 0) {
            if (minSeparation == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                minSeparation = 0.0f;
            } else {
                float f2 = this.p0;
                minSeparation = me4.b(f2, this.q0, (minSeparation - this.G) / this.A0, f2);
            }
        }
        if (s() || t()) {
            minSeparation = -minSeparation;
        }
        int i2 = i + 1;
        int i3 = i - 1;
        this.r0.set(i, Float.valueOf(s6a.s(f, i3 < 0 ? this.p0 : minSeparation + ((Float) this.r0.get(i3)).floatValue(), i2 >= this.r0.size() ? this.q0 : ((Float) this.r0.get(i2)).floatValue() - minSeparation)));
        Iterator it = this.m.iterator();
        while (it.hasNext()) {
            tk2 tk2Var = (tk2) it.next();
            ((Float) this.r0.get(i)).getClass();
            tk2Var.a(this);
        }
        AccessibilityManager accessibilityManager = this.i;
        if (accessibilityManager != null && accessibilityManager.isEnabled()) {
            Runnable runnable = this.j;
            if (runnable == null) {
                this.j = new q61(this);
            } else {
                removeCallbacks(runnable);
            }
            q61 q61Var = this.j;
            q61Var.b = i;
            postDelayed(q61Var, 200L);
            r61 r61Var = this.h;
            View view = r61Var.i;
            if (i != Integer.MIN_VALUE && r61Var.h.isEnabled() && (parent = view.getParent()) != null) {
                AccessibilityEvent k = r61Var.k(i, com.ironsource.mediationsdk.metadata.a.o);
                k.setContentChangeTypes(0);
                parent.requestSendAccessibilityEvent(view, k);
            }
        }
        return true;
    }

    public final void E() {
        double d;
        float f = this.Y0;
        float f2 = this.u0;
        if (f2 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            d = Math.round(f * r1) / ((int) ((this.q0 - this.p0) / f2));
        } else {
            d = f;
        }
        if (s() || t()) {
            d = 1.0d - d;
        }
        float f3 = this.q0;
        D((float) ((d * (f3 - r1)) + this.p0), this.s0);
    }

    public final void F(int i, Rect rect) {
        int v = this.G + ((int) (v(((Float) getValues().get(i)).floatValue()) * this.A0));
        int d = d();
        int max = Math.max(this.z, this.A) / 2;
        int max2 = Math.max(this.H / 2, max);
        int max3 = Math.max(this.I / 2, max);
        RectF rectF = new RectF(v - max2, d - max3, v + max2, d + max3);
        if (t()) {
            this.Q0.mapRect(rectF);
        }
        rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
    }

    public final void G() {
        float f;
        float f2;
        float f3;
        float f4;
        RippleDrawable n;
        float v = (v(((Float) this.r0.get(this.t0)).floatValue()) * this.A0) + this.G;
        int d = d();
        if (n() != null && getMeasuredWidth() > 0 && (n = n()) != null) {
            float f5 = this.J;
            float[] fArr = {v - f5, d - r3, f5 + v, r3 + d};
            if (t()) {
                this.Q0.mapPoints(fArr);
            }
            n.setHotspotBounds((int) fArr[0], (int) fArr[1], (int) fArr[2], (int) fArr[3]);
        }
        float f6 = d;
        FocusRingDrawable c = FocusRingDrawable.c(getBackground());
        if (c != null) {
            float dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.m3_slider_focus_ring_padding);
            float f7 = (dimensionPixelOffset * 2.0f) + (this.H / 2.0f);
            float f8 = (this.I / 2.0f) + dimensionPixelOffset;
            if (t()) {
                f = f6 - f8;
                float f9 = f6 + f8;
                f2 = v - f7;
                f3 = v + f7;
                f4 = f9;
            } else {
                f = v - f7;
                f4 = v + f7;
                f2 = f6 - f8;
                f3 = f6 + f8;
            }
            c.mutate();
            int i = (int) f;
            int i2 = (int) f2;
            int i3 = (int) f4;
            int i4 = (int) f3;
            he8 he8Var = c.o;
            if (he8Var.w == null) {
                he8Var.w = new Rect();
            }
            c.o.w.set(i, i2, i3, i4);
        }
    }

    public final void H() {
        float f;
        boolean t = t();
        boolean s = s();
        float f2 = 0.5f;
        if (t && s) {
            f = 0.5f;
            f2 = -0.2f;
        } else {
            f = 1.2f;
            if (t) {
                f2 = 1.2f;
                f = 0.5f;
            }
        }
        Iterator it = this.l.iterator();
        while (it.hasNext()) {
            skj skjVar = (skj) it.next();
            skjVar.W = f2;
            skjVar.X = f;
            skjVar.invalidateSelf();
        }
        int i = this.E;
        if (i == 0 || i == 1) {
            if (this.s0 == -1 || !isEnabled()) {
                l();
                return;
            } else {
                k(false);
                return;
            }
        }
        if (i == 2) {
            l();
            return;
        }
        if (i != 3) {
            hg6.d(this.E, "Unexpected labelBehavior: ");
            return;
        }
        if (isEnabled()) {
            Rect rect = new Rect();
            vha.s(this).getHitRect(rect);
            if (getLocalVisibleRect(rect) && this.e1) {
                k(true);
                return;
            }
        }
        l();
    }

    public final void I() {
        if (this.K > 0 && this.S0 == null && this.T0.isEmpty()) {
            int i = this.H;
            this.L = i;
            this.N = this.I;
            this.M = this.K;
            int round = Math.round(i * 0.5f);
            FocusRingDrawable c = FocusRingDrawable.c(getBackground());
            A(round, (c == null || !c.o.c) ? -1 : this.I - this.s, Integer.valueOf(this.s0));
        }
    }

    public final void J() {
        int min;
        R();
        float f = this.u0;
        if (f <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            K(this.v0);
            return;
        }
        int i = this.x0;
        if (i != 0) {
            min = 0;
            if (i == 1) {
                int e = (int) wt3.e(this.q0, this.p0, f, 1.0f);
                if (e <= (this.A0 / this.y) + 1) {
                    min = e;
                }
            } else if (i != 2) {
                zzl.q(this.x0, "Unexpected tickVisibilityMode: ");
                return;
            }
        } else {
            min = Math.min((int) wt3.e(this.q0, this.p0, f, 1.0f), (this.A0 / this.y) + 1);
        }
        K(min);
    }

    public final void K(int i) {
        if (i == 0) {
            this.w0 = null;
            return;
        }
        float[] fArr = this.w0;
        if (fArr == null || fArr.length != i * 2) {
            this.w0 = new float[i * 2];
        }
        float f = this.A0 / (i - 1);
        float d = d();
        for (int i2 = 0; i2 < i * 2; i2 += 2) {
            float[] fArr2 = this.w0;
            fArr2[i2] = ((i2 / 2.0f) * f) + this.G;
            fArr2[i2 + 1] = d;
        }
        if (t()) {
            this.Q0.mapPoints(this.w0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void L(Canvas canvas, Paint paint, RectF rectF, float f, int i) {
        float f2;
        int C;
        boolean t;
        float T;
        float f3;
        if (rectF.isEmpty()) {
            return;
        }
        if (!this.r0.isEmpty() && this.K > 0) {
            float T2 = T(((Float) this.r0.get((s() || t()) ? this.r0.size() - 1 : 0)).floatValue()) - this.G;
            if (T2 < f) {
                f2 = Math.max(T2, this.Q);
                if (!this.r0.isEmpty() && this.K > 0) {
                    T = T(((Float) this.r0.get((!s() || t()) ? 0 : this.r0.size() - 1)).floatValue()) - this.G;
                    f3 = this.A0;
                    if (T > f3 - f) {
                        f = Math.max(f3 - T, this.Q);
                    }
                }
                C = wt3.C(i);
                if (C != 1) {
                    f = this.Q;
                } else if (C == 2) {
                    f2 = this.Q;
                } else if (C == 3) {
                    f2 = this.Q;
                    f = f2;
                }
                paint.setStyle(Paint.Style.FILL);
                paint.setStrokeCap(Paint.Cap.BUTT);
                if (this.K > 0) {
                    paint.setAntiAlias(true);
                }
                RectF rectF2 = new RectF(rectF);
                t = t();
                Matrix matrix = this.Q0;
                if (t) {
                    matrix.mapRect(rectF2);
                }
                Path path = this.I0;
                path.reset();
                if (rectF.width() < f2 + f) {
                    path.addRoundRect(rectF2, t() ? new float[]{f2, f2, f2, f2, f, f, f, f} : new float[]{f2, f2, f, f, f, f, f2, f2}, Path.Direction.CW);
                    canvas.drawPath(path, paint);
                    return;
                }
                float min = Math.min(f2, f);
                float max = Math.max(f2, f);
                canvas.save();
                path.addRoundRect(rectF2, min, min, Path.Direction.CW);
                canvas.clipPath(path);
                int C2 = wt3.C(i);
                RectF rectF3 = this.M0;
                if (C2 == 1) {
                    float f4 = rectF.left;
                    rectF3.set(f4, rectF.top, (2.0f * max) + f4, rectF.bottom);
                } else if (C2 != 2) {
                    rectF3.set(rectF.centerX() - max, rectF.top, rectF.centerX() + max, rectF.bottom);
                } else {
                    float f5 = rectF.right;
                    rectF3.set(f5 - (2.0f * max), rectF.top, f5, rectF.bottom);
                }
                if (t()) {
                    matrix.mapRect(rectF3);
                }
                canvas.drawRoundRect(rectF3, max, max, paint);
                canvas.restore();
                return;
            }
        }
        f2 = f;
        if (!this.r0.isEmpty()) {
            T = T(((Float) this.r0.get((!s() || t()) ? 0 : this.r0.size() - 1)).floatValue()) - this.G;
            f3 = this.A0;
            if (T > f3 - f) {
            }
        }
        C = wt3.C(i);
        if (C != 1) {
        }
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeCap(Paint.Cap.BUTT);
        if (this.K > 0) {
        }
        RectF rectF22 = new RectF(rectF);
        t = t();
        Matrix matrix2 = this.Q0;
        if (t) {
        }
        Path path2 = this.I0;
        path2.reset();
        if (rectF.width() < f2 + f) {
        }
    }

    public final void M() {
        Drawable drawable = this.U;
        if (drawable != null) {
            boolean z = this.V;
            if (!z && this.W != null) {
                drawable = drawable.mutate();
                this.U = drawable;
                z = true;
                this.V = true;
            }
            if (z) {
                drawable.setTintList(this.W);
            }
        }
    }

    public final void N() {
        Drawable drawable = this.S;
        if (drawable != null) {
            boolean z = this.T;
            if (!z && this.W != null) {
                drawable = drawable.mutate();
                this.S = drawable;
                z = true;
                this.T = true;
            }
            if (z) {
                drawable.setTintList(this.W);
            }
        }
    }

    public final void O() {
        Drawable drawable = this.c0;
        if (drawable != null) {
            boolean z = this.d0;
            if (!z && this.e0 != null) {
                drawable = drawable.mutate();
                this.c0 = drawable;
                z = true;
                this.d0 = true;
            }
            if (z) {
                drawable.setTintList(this.e0);
            }
        }
    }

    public final void P() {
        Drawable drawable = this.a0;
        if (drawable != null) {
            boolean z = this.b0;
            if (!z && this.e0 != null) {
                drawable = drawable.mutate();
                this.a0 = drawable;
                z = true;
                this.b0 = true;
            }
            if (z) {
                drawable.setTintList(this.e0);
            }
        }
    }

    public final void Q(boolean z) {
        int paddingTop;
        int paddingBottom;
        boolean z2;
        if (t()) {
            paddingTop = getPaddingLeft();
            paddingBottom = getPaddingRight();
        } else {
            paddingTop = getPaddingTop();
            paddingBottom = getPaddingBottom();
        }
        int i = paddingBottom + paddingTop;
        int max = Math.max(this.C, Math.max(this.F + i, this.I + i));
        boolean z3 = true;
        if (max == this.D) {
            z2 = false;
        } else {
            this.D = max;
            z2 = true;
        }
        int max2 = Math.max(Math.max(Math.max((this.H / 2) - this.u, 0), Math.max((this.F - this.v) / 2, 0)), Math.max(Math.max(this.y0 - this.w, 0), Math.max(this.z0 - this.x, 0))) + this.t;
        if (this.G == max2) {
            z3 = false;
        } else {
            this.G = max2;
            if (isLaidOut()) {
                this.A0 = Math.max((t() ? getHeight() : getWidth()) - (this.G * 2), 0);
                J();
            }
        }
        if (t()) {
            float d = d();
            Matrix matrix = this.Q0;
            matrix.reset();
            matrix.setRotate(90.0f, d, d);
        }
        if (z2 || z) {
            requestLayout();
        } else if (z3) {
            postInvalidate();
        }
    }

    public final void R() {
        if (this.C0) {
            float f = this.p0;
            float f2 = this.q0;
            if (f >= f2) {
                throw new IllegalStateException("valueFrom(" + f + ") must be smaller than valueTo(" + f2 + ")");
            }
            Iterator it = this.r0.iterator();
            while (it.hasNext()) {
                Float f3 = (Float) it.next();
                if (f3.floatValue() < this.p0 || f3.floatValue() > this.q0) {
                    throw new IllegalStateException("Slider value(" + f3 + ") must be greater or equal to valueFrom(" + this.p0 + "), and lower or equal to valueTo(" + this.q0 + ")");
                }
                if (this.u0 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && !S(f3.floatValue())) {
                    float f4 = this.p0;
                    float f5 = this.u0;
                    throw new IllegalStateException("Value(" + f3 + ") must be equal to valueFrom(" + f4 + ") plus a multiple of stepSize(" + f5 + ") when using stepSize(" + f5 + ")");
                }
            }
            if (this.u0 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && !S(this.q0)) {
                throw new IllegalStateException("The stepSize(" + this.u0 + ") must be 0, or a factor of the valueFrom(" + this.p0 + ")-valueTo(" + this.q0 + ") range");
            }
            float minSeparation = getMinSeparation();
            if (minSeparation < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                throw new IllegalStateException("minSeparation(" + minSeparation + ") must be greater or equal to 0");
            }
            float f6 = this.u0;
            if (f6 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && minSeparation > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                if (this.Z0 != 1) {
                    throw new IllegalStateException("minSeparation(" + minSeparation + ") cannot be set as a dimension when using stepSize(" + f6 + ")");
                }
                if (minSeparation < f6 || !p(minSeparation)) {
                    float f7 = this.u0;
                    throw new IllegalStateException("minSeparation(" + minSeparation + ") must be greater or equal and a multiple of stepSize(" + f7 + ") when using stepSize(" + f7 + ")");
                }
            }
            if (this.u0 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                int i = (((int) r0) > this.q0 ? 1 : (((int) r0) == this.q0 ? 0 : -1));
            }
            this.C0 = false;
        }
    }

    public final boolean S(float f) {
        return p(new BigDecimal(Float.toString(f)).subtract(new BigDecimal(Float.toString(this.p0)), MathContext.DECIMAL64).doubleValue());
    }

    public final float T(float f) {
        return (v(f) * this.A0) + this.G;
    }

    public final void a(Drawable drawable, int i) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth == -1 && intrinsicHeight == -1) {
            drawable.setBounds(0, 0, i, this.I);
        } else {
            float max = Math.max(i, this.I) / Math.max(intrinsicWidth, intrinsicHeight);
            drawable.setBounds(0, 0, (int) (intrinsicWidth * max), (int) (intrinsicHeight * max));
        }
    }

    public final void b(Canvas canvas, RectF rectF, Drawable drawable, boolean z) {
        if (drawable != null) {
            int i = this.f0;
            float f = rectF.right - rectF.left;
            int i2 = this.g0;
            float f2 = (i2 * 2) + i;
            RectF rectF2 = this.O0;
            if (f >= f2) {
                float f3 = z ^ (s() || t()) ? rectF.left + i2 : (rectF.right - i2) - i;
                float f4 = i;
                float d = d() - (f4 / 2.0f);
                rectF2.set(f3, d, f3 + f4, f4 + d);
            } else {
                rectF2.setEmpty();
            }
            if (rectF2.isEmpty()) {
                return;
            }
            if (t()) {
                this.Q0.mapRect(rectF2);
            }
            Rect rect = this.P0;
            rectF2.round(rect);
            drawable.setBounds(rect);
            drawable.draw(canvas);
        }
    }

    public final int c(int i) {
        if (!this.o0 || i != this.s0 || this.S0 != null || !this.T0.isEmpty()) {
            return this.K;
        }
        return this.K - ((this.H - Math.round(this.H * 0.5f)) / 2);
    }

    public final int d() {
        int i = this.D / 2;
        int i2 = this.E;
        int i3 = 0;
        if (i2 == 1 || i2 == 3) {
            ArrayList arrayList = this.l;
            if (!arrayList.isEmpty()) {
                i3 = ((skj) arrayList.get(0)).getIntrinsicHeight();
            }
        }
        return i + i3;
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return this.h.m(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        this.a.setColor(o(this.H0));
        this.b.setColor(o(this.G0));
        this.e.setColor(o(this.F0));
        this.f.setColor(o(this.E0));
        this.g.setColor(o(this.F0));
        Iterator it = this.l.iterator();
        while (it.hasNext()) {
            skj skjVar = (skj) it.next();
            if (skjVar.isStateful()) {
                skjVar.setState(getDrawableState());
            }
        }
        int i = 0;
        while (true) {
            ArrayList arrayList = this.R0;
            if (i >= arrayList.size()) {
                int o = o(this.D0);
                Paint paint = this.d;
                paint.setColor(o);
                paint.setAlpha(63);
                return;
            }
            if (((qzb) arrayList.get(i)).isStateful()) {
                ((qzb) arrayList.get(i)).setState(getDrawableState());
            }
            i++;
        }
    }

    public final ValueAnimator e(boolean z) {
        int M;
        TimeInterpolator E;
        float f = z ? 0.0f : 1.0f;
        ValueAnimator valueAnimator = z ? this.q : this.p;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f, z ? 1.0f : 0.0f);
        if (z) {
            M = x2a.M(getContext(), R.attr.motionDurationMedium4, 83);
            E = yfa.E(getContext(), R.attr.motionEasingEmphasizedInterpolator, e80.e);
        } else {
            M = x2a.M(getContext(), R.attr.motionDurationShort3, Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE);
            E = yfa.E(getContext(), R.attr.motionEasingEmphasizedAccelerateInterpolator, e80.c);
        }
        ofFloat.setDuration(M);
        ofFloat.setInterpolator(E);
        ofFloat.addUpdateListener(new s2(this, 3));
        return ofFloat;
    }

    public final void f(float f, float f2, float f3, float f4, Canvas canvas, RectF rectF, int i, int i2) {
        if (f2 - f > getTrackCornerSize() - i2) {
            rectF.set(f, f3, f2, f4);
        } else {
            rectF.setEmpty();
        }
        L(canvas, this.a, rectF, getTrackCornerSize(), i);
    }

    public final void g(Canvas canvas, float f, float f2) {
        for (int i = 0; i < this.r0.size(); i++) {
            float T = T(((Float) this.r0.get(i)).floatValue());
            float c = (this.H / 2.0f) + c(i);
            if (f >= T - c && f <= T + c) {
                return;
            }
        }
        boolean t = t();
        Paint paint = this.g;
        if (t) {
            canvas.drawPoint(f2, f, paint);
        } else {
            canvas.drawPoint(f, f2, paint);
        }
    }

    public final int getAccessibilityFocusedVirtualViewId() {
        return this.h.k;
    }

    public abstract float getMinSeparation();

    public abstract float getThumbElevation();

    public abstract int getThumbRadius();

    public abstract ColorStateList getThumbStrokeColor();

    public abstract float getThumbStrokeWidth();

    public abstract ColorStateList getThumbTintList();

    public abstract int getTrackCornerSize();

    public abstract List getValues();

    public final void h(Canvas canvas, int i, int i2, float f, Drawable drawable) {
        canvas.save();
        if (t()) {
            canvas.concat(this.Q0);
        }
        canvas.translate((this.G + ((int) (v(f) * i))) - (drawable.getBounds().width() / 2.0f), i2 - (drawable.getBounds().height() / 2.0f));
        drawable.draw(canvas);
        canvas.restore();
    }

    public final void i(int i, int i2, Canvas canvas, Paint paint) {
        int i3;
        while (i < i2) {
            boolean t = t();
            float[] fArr = this.w0;
            float f = t ? fArr[i + 1] : fArr[i];
            while (true) {
                if (i3 < this.r0.size()) {
                    float T = T(((Float) this.r0.get(i3)).floatValue());
                    float c = (this.H / 2.0f) + c(i3);
                    i3 = (f < T - c || f > T + c) ? i3 + 1 : 0;
                } else {
                    if (this.R) {
                        float f2 = ((this.G * 2) + this.A0) / 2.0f;
                        float f3 = this.K;
                        if (f >= f2 - f3 && f <= f2 + f3) {
                        }
                    }
                    float[] fArr2 = this.w0;
                    canvas.drawPoint(fArr2[i], fArr2[i + 1], paint);
                }
            }
            i += 2;
        }
    }

    public final void j(Canvas canvas, RectF rectF, RectF rectF2) {
        if (this.S == null && this.U == null && this.a0 == null && this.c0 == null) {
            return;
        }
        this.r0.size();
        b(canvas, rectF, this.S, true);
        b(canvas, rectF2, this.a0, true);
        b(canvas, rectF, this.U, false);
        b(canvas, rectF2, this.c0, false);
    }

    public final void k(boolean z) {
        if (!this.o) {
            this.o = true;
            ValueAnimator e = e(true);
            this.p = e;
            this.q = null;
            e.start();
        }
        ArrayList arrayList = this.l;
        Iterator it = arrayList.iterator();
        if (z) {
            for (int i = 0; i < this.r0.size() && it.hasNext(); i++) {
                if (i != this.t0) {
                    B((skj) it.next(), ((Float) this.r0.get(i)).floatValue());
                }
            }
        }
        if (!it.hasNext()) {
            throw new IllegalStateException(String.format("Not enough labels(%d) to display all the values(%d)", Integer.valueOf(arrayList.size()), Integer.valueOf(this.r0.size())));
        }
        B((skj) it.next(), ((Float) this.r0.get(this.t0)).floatValue());
    }

    public final void l() {
        if (this.o) {
            this.o = false;
            ValueAnimator e = e(false);
            this.q = e;
            this.p = null;
            e.addListener(new eb(this, 2));
            this.q.start();
        }
    }

    public final float[] m() {
        float floatValue = ((Float) this.r0.get(0)).floatValue();
        float floatValue2 = ((Float) mz1.h(this.r0, 1)).floatValue();
        if (this.r0.size() == 1) {
            floatValue = this.p0;
        }
        float v = v(floatValue);
        float v2 = v(floatValue2);
        if (this.R) {
            float min = Math.min(0.5f, v2);
            v2 = Math.max(0.5f, v2);
            v = min;
        }
        return (this.R || !(s() || t())) ? new float[]{v, v2} : new float[]{v2, v};
    }

    public final RippleDrawable n() {
        Drawable background = getBackground();
        if (background instanceof DrawableWrapper) {
            background = ((DrawableWrapper) background).getDrawable();
        }
        if (background instanceof RippleDrawable) {
            return (RippleDrawable) background;
        }
        return null;
    }

    public final int o(ColorStateList colorStateList) {
        return colorStateList.getColorForState(getDrawableState(), colorStateList.getDefaultColor());
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.e1 = isShown();
        getViewTreeObserver().addOnScrollChangedListener(this.b1);
        getViewTreeObserver().addOnGlobalLayoutListener(this.c1);
        Iterator it = this.l.iterator();
        while (it.hasNext()) {
            skj skjVar = (skj) it.next();
            ViewGroup s = vha.s(this);
            if (s == null) {
                skjVar.getClass();
            } else {
                skjVar.getClass();
                int[] iArr = new int[2];
                s.getLocationOnScreen(iArr);
                skjVar.T = iArr[0];
                s.getWindowVisibleDisplayFrame(skjVar.M);
                s.addOnLayoutChangeListener(skjVar.L);
            }
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        q61 q61Var = this.j;
        if (q61Var != null) {
            removeCallbacks(q61Var);
        }
        this.o = false;
        Iterator it = this.l.iterator();
        while (it.hasNext()) {
            skj skjVar = (skj) it.next();
            ViewGroup s = vha.s(this);
            if (s != null) {
                s.getOverlay().remove(skjVar);
                s.removeOnLayoutChangeListener(skjVar.L);
            }
        }
        getViewTreeObserver().removeOnScrollChangedListener(this.b1);
        getViewTreeObserver().removeOnGlobalLayoutListener(this.c1);
        super.onDetachedFromWindow();
    }

    /* JADX WARN: Removed duplicated region for block: B:130:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x02ee  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        int c;
        int c2;
        int i;
        int c3;
        float f;
        float f2;
        b bVar;
        int i2;
        if (this.C0) {
            R();
            J();
        }
        super.onDraw(canvas);
        int d = d();
        int i3 = this.A0;
        float[] m = m();
        float f3 = d;
        float f4 = this.F / 2.0f;
        float f5 = f3 - f4;
        float f6 = f4 + f3;
        float f7 = 0.5f;
        int i4 = 0;
        if (this.R && m[0] == 0.5f) {
            c = this.K;
        } else {
            c = c((s() || t()) ? this.r0.size() - 1 : 0);
        }
        int i5 = c;
        float trackCornerSize = this.G - getTrackCornerSize();
        float f8 = i3;
        float f9 = ((m[0] * f8) + this.G) - i5;
        RectF rectF = this.K0;
        f(trackCornerSize, f9, f5, f6, canvas, rectF, 2, i5);
        if (this.R && m[1] == 0.5f) {
            c2 = this.K;
        } else {
            c2 = c((s() || t()) ? 0 : this.r0.size() - 1);
        }
        int i6 = c2;
        float f10 = (m[1] * f8) + this.G + i6;
        int trackCornerSize2 = getTrackCornerSize();
        RectF rectF2 = this.L0;
        int i7 = 3;
        f(f10, trackCornerSize2 + r1 + i3, f5, f6, canvas, rectF2, 3, i6);
        int i8 = this.A0;
        float[] m2 = m();
        float f11 = this.G;
        float f12 = i8;
        float f13 = (m2[1] * f12) + f11;
        float f14 = (m2[0] * f12) + f11;
        int i9 = 2;
        float f15 = f13;
        RectF rectF3 = this.J0;
        if (f14 >= f13) {
            rectF3.setEmpty();
        } else {
            if (this.r0.size() != 1 || this.R) {
                i7 = 4;
            } else if (!s() && !t()) {
                i7 = 2;
            }
            int i10 = i7;
            int i11 = 0;
            while (i11 < this.r0.size()) {
                if (this.r0.size() > 1) {
                    f15 = i11 > 0 ? T(((Float) this.r0.get(i11 - 1)).floatValue()) : f14;
                    float T = T(((Float) this.r0.get(i11)).floatValue());
                    if (s() || t()) {
                        f14 = T;
                    } else {
                        f14 = f15;
                        f15 = T;
                    }
                }
                int trackCornerSize3 = getTrackCornerSize();
                float f16 = f7;
                int C = wt3.C(i10);
                if (C != 1) {
                    if (C != i9) {
                        i = i9;
                        if (C == 3) {
                            if (i11 > 0) {
                                f14 += c(i11 - 1);
                                c3 = c(i11);
                            } else if (m2[1] == f16) {
                                f14 += c(i11);
                            } else if (m2[0] == f16) {
                                c3 = c(i11);
                            }
                        }
                    } else {
                        i = i9;
                        f14 += c(i11);
                        f15 += trackCornerSize3;
                    }
                    f = f15;
                    f2 = f14;
                    if (f2 < f) {
                        rectF3.setEmpty();
                    } else {
                        float f17 = this.F / 2.0f;
                        rectF3.set(f2, f3 - f17, f, f17 + f3);
                        L(canvas, this.b, rectF3, trackCornerSize3, i10);
                    }
                    i11++;
                    f15 = f;
                    f14 = f2;
                    f7 = f16;
                    i9 = i;
                } else {
                    i = i9;
                    f14 -= trackCornerSize3;
                    c3 = c(i11);
                }
                f15 -= c3;
                f = f15;
                f2 = f14;
                if (f2 < f) {
                }
                i11++;
                f15 = f;
                f14 = f2;
                f7 = f16;
                i9 = i;
            }
        }
        Canvas canvas2 = canvas;
        int i12 = i9;
        if (s() || t()) {
            j(canvas2, rectF3, rectF);
        } else {
            j(canvas2, rectF3, rectF2);
        }
        float[] fArr = this.w0;
        if (fArr != null && fArr.length != 0) {
            float[] m3 = m();
            int ceil = (int) Math.ceil(((this.w0.length / 2.0f) - 1.0f) * m3[0]);
            int floor = (int) Math.floor(((this.w0.length / 2.0f) - 1.0f) * m3[1]);
            Paint paint = this.e;
            if (ceil > 0) {
                i(0, ceil * 2, canvas2, paint);
            }
            if (ceil <= floor) {
                i(ceil * 2, (floor + 1) * 2, canvas2, this.f);
            }
            int i13 = (floor + 1) * 2;
            float[] fArr2 = this.w0;
            if (i13 < fArr2.length) {
                i(i13, fArr2.length, canvas2, paint);
            }
        }
        if (this.O > 0 && !this.r0.isEmpty()) {
            float floatValue = ((Float) mz1.h(this.r0, 1)).floatValue();
            float f18 = this.q0;
            if (floatValue < f18) {
                g(canvas2, T(f18), f3);
            }
            if (this.R || (this.r0.size() > 1 && ((Float) this.r0.get(0)).floatValue() > this.p0)) {
                g(canvas2, T(this.p0), f3);
            }
        }
        if ((this.o0 || isFocused()) && isEnabled()) {
            int i14 = this.A0;
            if (n() == null) {
                float[] fArr3 = new float[i12];
                fArr3[0] = (v(((Float) this.r0.get(this.t0)).floatValue()) * i14) + this.G;
                fArr3[1] = f3;
                if (t()) {
                    this.Q0.mapPoints(fArr3);
                }
                if (Build.VERSION.SDK_INT < 28) {
                    float f19 = fArr3[0];
                    float f20 = this.J;
                    float f21 = fArr3[1];
                    bVar = this;
                    canvas.clipRect(f19 - f20, f21 - f20, f19 + f20, f21 + f20, Region.Op.UNION);
                    canvas2 = canvas;
                } else {
                    bVar = this;
                }
                canvas2.drawCircle(fArr3[0], fArr3[1], bVar.J, bVar.d);
                bVar.H();
                int i15 = bVar.A0;
                while (i4 < bVar.r0.size()) {
                    float floatValue2 = ((Float) bVar.r0.get(i4)).floatValue();
                    Drawable drawable = bVar.S0;
                    if (drawable != null) {
                        i2 = d;
                        bVar.h(canvas2, i15, i2, floatValue2, drawable);
                    } else {
                        b bVar2 = bVar;
                        i2 = d;
                        if (i4 < bVar2.T0.size()) {
                            bVar2.h(canvas, i15, i2, floatValue2, (Drawable) bVar2.T0.get(i4));
                        } else {
                            if (!bVar2.isEnabled()) {
                                canvas.drawCircle((bVar2.v(floatValue2) * i15) + bVar2.G, f3, bVar2.getThumbRadius(), bVar2.c);
                            }
                            bVar2.h(canvas, i15, i2, floatValue2, (Drawable) bVar2.R0.get(i4));
                        }
                    }
                    i4++;
                    bVar = this;
                    canvas2 = canvas;
                    d = i2;
                }
            }
        }
        bVar = this;
        bVar.H();
        int i152 = bVar.A0;
        while (i4 < bVar.r0.size()) {
        }
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        r61 r61Var = this.h;
        if (!z) {
            z();
            this.s0 = -1;
            r61Var.j(this.t0);
            return;
        }
        if (this.s0 == -1) {
            if (i == 1) {
                u(Integer.MAX_VALUE);
            } else if (i == 2) {
                u(Integer.MIN_VALUE);
            } else if (i == 17) {
                u((s() || t()) ? -2147483647 : Integer.MAX_VALUE);
            } else if (i == 66) {
                if (!s() && !t()) {
                    r0 = Integer.MIN_VALUE;
                }
                u(r0);
            }
            this.s0 = this.t0;
        }
        z();
        I();
        r61Var.v(this.t0);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setVisibleToUser(false);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        Float valueOf;
        if (!isEnabled()) {
            return super.onKeyDown(i, keyEvent);
        }
        this.s0 = this.t0;
        boolean isLongPress = this.B0 | keyEvent.isLongPress();
        this.B0 = isLongPress;
        float f = this.u0;
        if (isLongPress) {
            if (f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                f = 1.0f;
            }
            if ((this.q0 - this.p0) / f > 20.0f) {
                f *= Math.round(r0 / 20.0f);
            }
        } else if (f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            f = 1.0f;
        }
        if (i == 21) {
            if (!s()) {
                f = -f;
            }
            valueOf = Float.valueOf(f);
        } else if (i != 22) {
            valueOf = i != 69 ? (i == 70 || i == 81) ? Float.valueOf(f) : null : Float.valueOf(-f);
        } else {
            if (s()) {
                f = -f;
            }
            valueOf = Float.valueOf(f);
        }
        if (valueOf != null) {
            if (D(valueOf.floatValue() + ((Float) this.r0.get(this.s0)).floatValue(), this.s0)) {
                G();
                postInvalidate();
            }
            return true;
        }
        if (i != 61) {
            return super.onKeyDown(i, keyEvent);
        }
        z();
        if (keyEvent.hasNoModifiers()) {
            return u(1);
        }
        if (keyEvent.isShiftPressed()) {
            return u(-1);
        }
        return false;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        this.B0 = false;
        return super.onKeyUp(i, keyEvent);
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        Rect rect = this.l0;
        rect.left = 0;
        rect.top = 0;
        rect.right = i3 - i;
        rect.bottom = i4 - i2;
        ArrayList arrayList = this.m0;
        if (!arrayList.contains(rect)) {
            arrayList.add(rect);
        }
        WeakHashMap weakHashMap = bsk.a;
        if (Build.VERSION.SDK_INT >= 29) {
            xrk.c(this, arrayList);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3 = this.E;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.D + ((i3 == 1 || i3 == 3) ? ((skj) this.l.get(0)).getIntrinsicHeight() : 0), 1073741824);
        if (t()) {
            super.onMeasure(makeMeasureSpec, i2);
        } else {
            super.onMeasure(i, makeMeasureSpec);
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        BaseSlider$SliderState baseSlider$SliderState = (BaseSlider$SliderState) parcelable;
        super.onRestoreInstanceState(baseSlider$SliderState.getSuperState());
        this.p0 = baseSlider$SliderState.a;
        this.q0 = baseSlider$SliderState.b;
        C(baseSlider$SliderState.c);
        this.u0 = baseSlider$SliderState.d;
        if (baseSlider$SliderState.e) {
            requestFocus();
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        BaseSlider$SliderState baseSlider$SliderState = new BaseSlider$SliderState(super.onSaveInstanceState());
        baseSlider$SliderState.a = this.p0;
        baseSlider$SliderState.b = this.q0;
        baseSlider$SliderState.c = new ArrayList(this.r0);
        baseSlider$SliderState.d = this.u0;
        baseSlider$SliderState.e = hasFocus();
        return baseSlider$SliderState;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        if (t()) {
            i = i2;
        }
        this.A0 = Math.max(i - (this.G * 2), 0);
        J();
        G();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i = 0;
        if (isEnabled()) {
            float y = t() ? motionEvent.getY() : motionEvent.getX();
            float x = t() ? motionEvent.getX() : motionEvent.getY();
            float f = (y - this.G) / this.A0;
            this.Y0 = f;
            float max = Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f);
            this.Y0 = max;
            this.Y0 = Math.min(1.0f, max);
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                int i2 = this.r;
                if (actionMasked == 1) {
                    this.o0 = false;
                    MotionEvent motionEvent2 = this.k0;
                    if (motionEvent2 != null && motionEvent2.getActionMasked() == 0) {
                        float f2 = i2;
                        if (Math.abs(this.k0.getX() - motionEvent.getX()) <= f2 && Math.abs(this.k0.getY() - motionEvent.getY()) <= f2 && y()) {
                            w();
                        }
                    }
                    if (this.s0 != -1) {
                        E();
                        G();
                        z();
                        this.s0 = -1;
                        x();
                    }
                    invalidate();
                } else if (actionMasked == 2) {
                    if (!this.o0) {
                        if ((t() || !r(motionEvent) || Math.abs(y - this.i0) >= i2) && (!t() || !q(motionEvent) || Math.abs(x - this.j0) >= i2 * 0.8f)) {
                            getParent().requestDisallowInterceptTouchEvent(true);
                            if (y()) {
                                this.o0 = true;
                                I();
                                w();
                            }
                        }
                    }
                    E();
                    G();
                    invalidate();
                } else if (actionMasked == 3) {
                    this.o0 = false;
                    if (this.s0 != -1 && !this.n0.isEmpty()) {
                        while (true) {
                            if (i >= this.r0.size()) {
                                break;
                            }
                            if (i == this.s0) {
                                D(((Float) this.n0.get(i)).floatValue(), i);
                                break;
                            }
                            i++;
                        }
                    }
                    G();
                    z();
                    this.s0 = -1;
                    x();
                    invalidate();
                }
            } else {
                this.i0 = y;
                this.j0 = x;
                this.n0.clear();
                this.n0 = getValues();
                if ((t() || !r(motionEvent)) && (!t() || !q(motionEvent))) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                    if (y()) {
                        requestFocus();
                        this.o0 = true;
                        I();
                        w();
                        E();
                        G();
                        invalidate();
                    }
                }
            }
            setPressed(this.o0);
            this.k0 = MotionEvent.obtain(motionEvent);
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final void onVisibilityAggregated(boolean z) {
        super.onVisibilityAggregated(z);
        this.e1 = z;
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i != 0) {
            ViewGroup s = vha.s(this);
            ViewOverlay overlay = s == null ? null : s.getOverlay();
            if (overlay == null) {
                return;
            }
            Iterator it = this.l.iterator();
            while (it.hasNext()) {
                overlay.remove((skj) it.next());
            }
        }
    }

    public final boolean p(double d) {
        double doubleValue = new BigDecimal(Double.toString(d)).divide(new BigDecimal(Float.toString(this.u0)), MathContext.DECIMAL64).doubleValue();
        return Math.abs(((double) Math.round(doubleValue)) - doubleValue) < 1.0E-4d;
    }

    public final boolean q(MotionEvent motionEvent) {
        if (motionEvent.getToolType(0) != 3) {
            for (ViewParent parent = getParent(); parent instanceof ViewGroup; parent = parent.getParent()) {
                ViewGroup viewGroup = (ViewGroup) parent;
                if ((viewGroup.canScrollHorizontally(1) || viewGroup.canScrollHorizontally(-1)) && viewGroup.shouldDelayChildPressedState()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean r(MotionEvent motionEvent) {
        if (motionEvent.getToolType(0) != 3) {
            for (ViewParent parent = getParent(); parent instanceof ViewGroup; parent = parent.getParent()) {
                ViewGroup viewGroup = (ViewGroup) parent;
                if ((viewGroup.canScrollVertically(1) || viewGroup.canScrollVertically(-1)) && viewGroup.shouldDelayChildPressedState()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean s() {
        return getLayoutDirection() == 1;
    }

    public void setActiveThumbIndex(int i) {
        this.s0 = i;
    }

    public abstract void setCentered(boolean z);

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        setLayerType(z ? 0 : 2, null);
    }

    public abstract void setHaloRadius(int i);

    public abstract void setHaloTintList(ColorStateList colorStateList);

    public abstract void setLabelBehavior(int i);

    public abstract void setOrientation(int i);

    public void setSeparationUnit(int i) {
        this.Z0 = i;
        this.C0 = true;
        postInvalidate();
    }

    public abstract void setThumbElevation(float f);

    public abstract void setThumbHeight(int i);

    public abstract void setThumbStrokeColor(ColorStateList colorStateList);

    public abstract void setThumbStrokeWidth(float f);

    public abstract void setThumbTintList(ColorStateList colorStateList);

    public abstract void setThumbTrackGapSize(int i);

    public abstract void setThumbWidth(int i);

    public abstract void setTickActiveRadius(int i);

    public abstract void setTickActiveTintList(ColorStateList colorStateList);

    public abstract void setTickInactiveRadius(int i);

    public abstract void setTickInactiveTintList(ColorStateList colorStateList);

    public abstract void setTrackActiveTintList(ColorStateList colorStateList);

    public abstract void setTrackCornerSize(int i);

    public abstract void setTrackHeight(int i);

    public abstract void setTrackIconActiveColor(ColorStateList colorStateList);

    public abstract void setTrackIconActiveEnd(Drawable drawable);

    public abstract void setTrackIconActiveStart(Drawable drawable);

    public abstract void setTrackIconInactiveColor(ColorStateList colorStateList);

    public abstract void setTrackIconInactiveEnd(Drawable drawable);

    public abstract void setTrackIconInactiveStart(Drawable drawable);

    public abstract void setTrackIconSize(int i);

    public abstract void setTrackInactiveTintList(ColorStateList colorStateList);

    public abstract void setTrackInsideCornerSize(int i);

    public abstract void setTrackStopIndicatorSize(int i);

    public abstract void setValues(Float... fArr);

    public final boolean t() {
        return this.B == 1;
    }

    public final boolean u(int i) {
        int i2 = this.t0;
        long j = i2 + i;
        long size = this.r0.size() - 1;
        if (j < 0) {
            j = 0;
        } else if (j > size) {
            j = size;
        }
        int i3 = (int) j;
        this.t0 = i3;
        if (i3 == i2) {
            return false;
        }
        this.s0 = i3;
        I();
        G();
        postInvalidate();
        return true;
    }

    public final float v(float f) {
        float f2 = this.p0;
        float f3 = (f - f2) / (this.q0 - f2);
        return (s() || t()) ? 1.0f - f3 : f3;
    }

    public final void w() {
        Iterator it = this.n.iterator();
        while (it.hasNext()) {
            ((uk2) it.next()).getClass();
        }
    }

    public final void x() {
        Iterator it = this.n.iterator();
        while (it.hasNext()) {
            ((uk2) it.next()).getClass();
            RangeSlider rangeSlider = (RangeSlider) this;
            List<Float> values = rangeSlider.getValues();
            values.getClass();
            ArrayList arrayList = new ArrayList(k13.r(values, 10));
            Iterator<T> it2 = values.iterator();
            while (it2.hasNext()) {
                ((Float) it2.next()).getClass();
                arrayList.add(Float.valueOf(wzb.b(r4.floatValue())));
            }
            rangeSlider.setValues(arrayList);
        }
    }

    public final boolean y() {
        if (this.s0 != -1) {
            return true;
        }
        float f = this.Y0;
        if (s() || t()) {
            f = 1.0f - f;
        }
        float f2 = this.q0;
        float f3 = this.p0;
        float b = me4.b(f2, f3, f, f3);
        float T = T(b);
        this.s0 = 0;
        float abs = Math.abs(((Float) this.r0.get(0)).floatValue() - b);
        for (int i = 1; i < this.r0.size(); i++) {
            float abs2 = Math.abs(((Float) this.r0.get(i)).floatValue() - b);
            float T2 = T(((Float) this.r0.get(i)).floatValue());
            if (Float.compare(abs2, abs) > 0) {
                break;
            }
            boolean z = s() || t() ? T2 - T > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : T2 - T < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            if (Float.compare(abs2, abs) < 0) {
                this.s0 = i;
            } else {
                if (Float.compare(abs2, abs) != 0) {
                    continue;
                } else {
                    if (Math.abs(T2 - T) < this.r) {
                        this.s0 = -1;
                        return false;
                    }
                    if (z) {
                        this.s0 = i;
                    }
                }
            }
            abs = abs2;
        }
        return this.s0 != -1;
    }

    public final void z() {
        int i;
        if (this.K <= 0 || (i = this.L) == -1 || this.M == -1) {
            return;
        }
        A(i, this.N, Integer.valueOf(this.s0));
    }
}
