package com.google.android.material.slider;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
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
import androidx.annotation.Nullable;
import com.google.android.material.R$attr;
import com.google.android.material.R$color;
import com.google.android.material.R$dimen;
import com.google.android.material.R$string;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.a;
import com.google.android.material.slider.BaseSlider;
import com.google.android.material.slider.Slider;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.reactivex.rxjava3.internal.operators.observable.n0;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;
import xsna.am;
import xsna.anj;
import xsna.b0u0;
import xsna.bdl;
import xsna.beo0;
import xsna.bxj0;
import xsna.cly;
import xsna.ezt0;
import xsna.fpo0;
import xsna.gq;
import xsna.i5p0;
import xsna.iut0;
import xsna.j1m;
import xsna.jl10;
import xsna.n8g;
import xsna.qm10;
import xsna.rq2;
import xsna.rv70;
import xsna.ryo;
import xsna.shy;
import xsna.sn6;
import xsna.t1u0;
import xsna.tb30;
import xsna.ti6;
import xsna.u11;
import xsna.ubo0;
import xsna.ui6;
import xsna.uuj;
import xsna.wog0;
import xsna.wuj;
import xsna.xwk;
import xsna.xy9;
import xsna.y9q;
import xsna.zm10;

/* loaded from: classes13.dex */
public abstract class BaseSlider<S extends BaseSlider<S, L, T>, L extends ti6<S>, T extends ui6<S>> extends View {
    public static final int v0 = R$style.Widget_MaterialComponents_Slider;
    public static final int w0 = R$attr.motionDurationMedium4;
    public static final int x0 = R$attr.motionDurationShort3;
    public static final int y0 = R$attr.motionEasingEmphasizedInterpolator;
    public static final int z0 = R$attr.motionEasingEmphasizedAccelerateInterpolator;
    public final int A;
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public final int N;
    public float O;
    public MotionEvent P;
    public boolean Q;
    public float R;
    public float S;
    public ArrayList<Float> T;
    public int U;
    public int V;
    public float W;
    public float[] a0;

    @NonNull
    public final Paint b;
    public boolean b0;

    @NonNull
    public final Paint c;
    public int c0;

    @NonNull
    public final Paint d;
    public int d0;

    @NonNull
    public final Paint e;
    public int e0;

    @NonNull
    public final Paint f;
    public boolean f0;

    @NonNull
    public final Paint g;
    public boolean g0;

    @NonNull
    public final Paint h;

    @NonNull
    public ColorStateList h0;

    @NonNull
    public final e i;

    @NonNull
    public ColorStateList i0;
    public final AccessibilityManager j;

    @NonNull
    public ColorStateList j0;
    public BaseSlider<S, L, T>.d k;

    @NonNull
    public ColorStateList k0;
    public final int l;

    @NonNull
    public ColorStateList l0;

    @NonNull
    public final ArrayList m;

    @NonNull
    public final Path m0;

    @NonNull
    public final ArrayList n;

    @NonNull
    public final RectF n0;

    @NonNull
    public final ArrayList o;

    @NonNull
    public final RectF o0;
    public boolean p;

    @NonNull
    public final MaterialShapeDrawable p0;
    public ValueAnimator q;

    @Nullable
    public Drawable q0;
    public ValueAnimator r;

    @NonNull
    public List<Drawable> r0;
    public final int s;
    public float s0;
    public final int t;
    public int t0;
    public final int u;

    @NonNull
    public final sn6 u0;
    public final int v;
    public final int w;
    public final int x;
    public final int y;
    public final int z;

    public static class SliderState extends View.BaseSavedState {
        public static final Parcelable.Creator<SliderState> CREATOR = new a();
        public float b;
        public float c;
        public ArrayList<Float> d;
        public float e;
        public boolean f;

        public class a implements Parcelable.Creator<SliderState> {
            @Override // android.os.Parcelable.Creator
            @NonNull
            public final SliderState createFromParcel(@NonNull Parcel parcel) {
                SliderState sliderState = new SliderState(parcel);
                sliderState.b = parcel.readFloat();
                sliderState.c = parcel.readFloat();
                ArrayList<Float> arrayList = new ArrayList<>();
                sliderState.d = arrayList;
                parcel.readList(arrayList, Float.class.getClassLoader());
                sliderState.e = parcel.readFloat();
                sliderState.f = parcel.createBooleanArray()[0];
                return sliderState;
            }

            @Override // android.os.Parcelable.Creator
            @NonNull
            public final SliderState[] newArray(int i) {
                return new SliderState[i];
            }
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(@NonNull Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeFloat(this.b);
            parcel.writeFloat(this.c);
            parcel.writeList(this.d);
            parcel.writeFloat(this.e);
            parcel.writeBooleanArray(new boolean[]{this.f});
        }
    }

    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            BaseSlider baseSlider = BaseSlider.this;
            Iterator it = baseSlider.m.iterator();
            while (it.hasNext()) {
                i5p0 i5p0Var = (i5p0) it.next();
                i5p0Var.q = 1.2f;
                i5p0Var.o = floatValue;
                i5p0Var.p = floatValue;
                i5p0Var.r = rq2.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, 0.19f, 1.0f, floatValue);
                i5p0Var.invalidateSelf();
            }
            WeakHashMap<View, b0u0> weakHashMap = iut0.a;
            baseSlider.postInvalidateOnAnimation();
        }
    }

    public class b extends AnimatorListenerAdapter {
        public b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            BaseSlider baseSlider = BaseSlider.this;
            ViewGroup c = t1u0.c(baseSlider);
            ezt0 ezt0Var = c == null ? null : new ezt0((View) c);
            Iterator it = baseSlider.m.iterator();
            while (it.hasNext()) {
                ((ViewOverlay) ezt0Var.b).remove((i5p0) it.next());
            }
        }
    }

    public static /* synthetic */ class c {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[f.values().length];
            a = iArr;
            try {
                iArr[f.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[f.LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[f.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[f.BOTH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public class d implements Runnable {
        public int b = -1;

        public d() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            BaseSlider.this.i.sendEventForVirtualView(this.b, 4);
        }
    }

    public static class e extends y9q {
        public final BaseSlider<?, ?, ?> b;
        public final Rect c;

        public e(BaseSlider<?, ?, ?> baseSlider) {
            super(baseSlider);
            this.c = new Rect();
            this.b = baseSlider;
        }

        @Override // xsna.y9q
        public final int getVirtualViewAt(float f, float f2) {
            int i = 0;
            while (true) {
                BaseSlider<?, ?, ?> baseSlider = this.b;
                if (i >= baseSlider.getValues().size()) {
                    return -1;
                }
                Rect rect = this.c;
                baseSlider.t(i, rect);
                if (rect.contains((int) f, (int) f2)) {
                    return i;
                }
                i++;
            }
        }

        @Override // xsna.y9q
        public final void getVisibleVirtualViews(List<Integer> list) {
            for (int i = 0; i < this.b.getValues().size(); i++) {
                list.add(Integer.valueOf(i));
            }
        }

        @Override // xsna.y9q
        public final boolean onPerformActionForVirtualView(int i, int i2, Bundle bundle) {
            BaseSlider<?, ?, ?> baseSlider = this.b;
            if (!baseSlider.isEnabled()) {
                return false;
            }
            if (i2 != 4096 && i2 != 8192) {
                if (i2 != 16908349 || bundle == null || !bundle.containsKey("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE")) {
                    return false;
                }
                float f = bundle.getFloat("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE");
                int i3 = BaseSlider.v0;
                if (!baseSlider.s(f, i)) {
                    return false;
                }
                baseSlider.u();
                baseSlider.postInvalidate();
                invalidateVirtualView(i);
                return true;
            }
            int i4 = BaseSlider.v0;
            float f2 = baseSlider.W;
            if (f2 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                f2 = 1.0f;
            }
            if ((baseSlider.S - baseSlider.R) / f2 > 20) {
                f2 *= Math.round(r1 / r4);
            }
            if (i2 == 8192) {
                f2 = -f2;
            }
            if (baseSlider.k()) {
                f2 = -f2;
            }
            if (!baseSlider.s(xwk.a(baseSlider.getValues().get(i).floatValue() + f2, baseSlider.getValueFrom(), baseSlider.getValueTo()), i)) {
                return false;
            }
            baseSlider.u();
            baseSlider.postInvalidate();
            invalidateVirtualView(i);
            return true;
        }

        @Override // xsna.y9q
        public final void onPopulateNodeForVirtualView(int i, am amVar) {
            amVar.b(am.a.r);
            BaseSlider<?, ?, ?> baseSlider = this.b;
            List<Float> values = baseSlider.getValues();
            Float f = values.get(i);
            float floatValue = f.floatValue();
            float valueFrom = baseSlider.getValueFrom();
            float valueTo = baseSlider.getValueTo();
            if (baseSlider.isEnabled()) {
                if (floatValue > valueFrom) {
                    amVar.a(8192);
                }
                if (floatValue < valueTo) {
                    amVar.a(4096);
                }
            }
            amVar.a.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, valueFrom, valueTo, floatValue));
            amVar.n(SeekBar.class.getName());
            StringBuilder sb = new StringBuilder();
            if (baseSlider.getContentDescription() != null) {
                sb.append(baseSlider.getContentDescription());
                sb.append(StringUtils.COMMA);
            }
            String format = String.format(((float) ((int) floatValue)) == floatValue ? "%.0f" : "%.2f", f);
            String string = baseSlider.getContext().getString(R$string.material_slider_value);
            if (values.size() > 1) {
                string = i == baseSlider.getValues().size() - 1 ? baseSlider.getContext().getString(R$string.material_slider_range_end) : i == 0 ? baseSlider.getContext().getString(R$string.material_slider_range_start) : "";
            }
            Locale locale = Locale.US;
            sb.append(string + ", " + format);
            amVar.r(sb.toString());
            Rect rect = this.c;
            baseSlider.t(i, rect);
            amVar.j(rect);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class f {
        private static final /* synthetic */ f[] $VALUES;
        public static final f BOTH;
        public static final f LEFT;
        public static final f NONE;
        public static final f RIGHT;

        static {
            f fVar = new f("BOTH", 0);
            BOTH = fVar;
            f fVar2 = new f("LEFT", 1);
            LEFT = fVar2;
            f fVar3 = new f("RIGHT", 2);
            RIGHT = fVar3;
            f fVar4 = new f("NONE", 3);
            NONE = fVar4;
            $VALUES = new f[]{fVar, fVar2, fVar3, fVar4};
        }

        public f() {
            throw null;
        }

        public static f valueOf(String str) {
            return (f) Enum.valueOf(f.class, str);
        }

        public static f[] values() {
            return (f[]) $VALUES.clone();
        }
    }

    public BaseSlider(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.sliderStyle);
    }

    private float[] getActiveRange() {
        float floatValue = this.T.get(0).floatValue();
        float floatValue2 = ((Float) xy9.b(1, this.T)).floatValue();
        if (this.T.size() == 1) {
            floatValue = this.R;
        }
        float o = o(floatValue);
        float o2 = o(floatValue2);
        return k() ? new float[]{o2, o} : new float[]{o, o2};
    }

    private float getValueOfTouchPosition() {
        double d2;
        float f2 = this.s0;
        float f3 = this.W;
        if (f3 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            d2 = Math.round(f2 * r1) / ((int) ((this.S - this.R) / f3));
        } else {
            d2 = f2;
        }
        if (k()) {
            d2 = 1.0d - d2;
        }
        float f4 = this.S;
        return (float) ((d2 * (f4 - r1)) + this.R);
    }

    private float getValueOfTouchPositionAbsolute() {
        float f2 = this.s0;
        if (k()) {
            f2 = 1.0f - f2;
        }
        float f3 = this.S;
        float f4 = this.R;
        return u11.b(f3, f4, f2, f4);
    }

    private void setValuesInternal(@NonNull ArrayList<Float> arrayList) {
        ArrayList arrayList2;
        ViewGroup c2;
        int resourceId;
        BaseSlider<S, L, T> baseSlider = this;
        if (arrayList.isEmpty()) {
            throw new IllegalArgumentException("At least one value must be set");
        }
        Collections.sort(arrayList);
        if (baseSlider.T.size() == arrayList.size() && baseSlider.T.equals(arrayList)) {
            return;
        }
        baseSlider.T = arrayList;
        boolean z = true;
        baseSlider.g0 = true;
        int i = 0;
        baseSlider.V = 0;
        baseSlider.u();
        ArrayList arrayList3 = baseSlider.m;
        if (arrayList3.size() > baseSlider.T.size()) {
            List<i5p0> subList = arrayList3.subList(baseSlider.T.size(), arrayList3.size());
            for (i5p0 i5p0Var : subList) {
                WeakHashMap<View, b0u0> weakHashMap = iut0.a;
                if (baseSlider.isAttachedToWindow()) {
                    ViewGroup c3 = t1u0.c(baseSlider);
                    ezt0 ezt0Var = c3 == null ? null : new ezt0((View) c3);
                    if (ezt0Var != null) {
                        ((ViewOverlay) ezt0Var.b).remove(i5p0Var);
                        ViewGroup c4 = t1u0.c(baseSlider);
                        if (c4 == null) {
                            i5p0Var.getClass();
                        } else {
                            c4.removeOnLayoutChangeListener(i5p0Var.f);
                        }
                    }
                }
            }
            subList.clear();
        }
        while (arrayList3.size() < baseSlider.T.size()) {
            Context context = baseSlider.getContext();
            int i2 = baseSlider.l;
            i5p0 i5p0Var2 = new i5p0(context, i2);
            TypedArray d2 = fpo0.d(i5p0Var2.c, null, R$styleable.Tooltip, 0, i2, new int[i]);
            Context context2 = i5p0Var2.c;
            i5p0Var2.m = context2.getResources().getDimensionPixelSize(R$dimen.mtrl_tooltip_arrowSize);
            boolean z2 = d2.getBoolean(R$styleable.Tooltip_showMarker, z);
            i5p0Var2.l = z2;
            if (z2) {
                com.google.android.material.shape.a shapeAppearanceModel = i5p0Var2.getShapeAppearanceModel();
                shapeAppearanceModel.getClass();
                new wog0();
                new wog0();
                new wog0();
                new wog0();
                new ryo();
                new ryo();
                new ryo();
                new ryo();
                wuj wujVar = shapeAppearanceModel.a;
                wuj wujVar2 = shapeAppearanceModel.b;
                wuj wujVar3 = shapeAppearanceModel.c;
                wuj wujVar4 = shapeAppearanceModel.d;
                uuj uujVar = shapeAppearanceModel.e;
                uuj uujVar2 = shapeAppearanceModel.f;
                uuj uujVar3 = shapeAppearanceModel.g;
                uuj uujVar4 = shapeAppearanceModel.h;
                ryo ryoVar = shapeAppearanceModel.i;
                ryo ryoVar2 = shapeAppearanceModel.j;
                ryo ryoVar3 = shapeAppearanceModel.l;
                rv70 c5 = i5p0Var2.c();
                arrayList2 = arrayList3;
                com.google.android.material.shape.a aVar = new com.google.android.material.shape.a();
                aVar.a = wujVar;
                aVar.b = wujVar2;
                aVar.c = wujVar3;
                aVar.d = wujVar4;
                aVar.e = uujVar;
                aVar.f = uujVar2;
                aVar.g = uujVar3;
                aVar.h = uujVar4;
                aVar.i = ryoVar;
                aVar.j = ryoVar2;
                aVar.k = c5;
                aVar.l = ryoVar3;
                i5p0Var2.setShapeAppearanceModel(aVar);
            } else {
                arrayList2 = arrayList3;
                i5p0Var2.m = i;
            }
            CharSequence text = d2.getText(R$styleable.Tooltip_android_text);
            boolean equals = TextUtils.equals(i5p0Var2.b, text);
            beo0 beo0Var = i5p0Var2.e;
            if (!equals) {
                i5p0Var2.b = text;
                beo0Var.e = true;
                i5p0Var2.invalidateSelf();
            }
            int i3 = R$styleable.Tooltip_android_textAppearance;
            ubo0 ubo0Var = (!d2.hasValue(i3) || (resourceId = d2.getResourceId(i3, 0)) == 0) ? null : new ubo0(context2, resourceId);
            if (ubo0Var != null && d2.hasValue(R$styleable.Tooltip_android_textColor)) {
                ubo0Var.j = qm10.a(context2, d2, R$styleable.Tooltip_android_textColor);
            }
            beo0Var.c(ubo0Var, context2);
            TypedValue c6 = jl10.c(context2, R$attr.colorOnBackground, i5p0.class.getCanonicalName());
            int i4 = c6.resourceId;
            int color = i4 != 0 ? context2.getColor(i4) : c6.data;
            TypedValue c7 = jl10.c(context2, R.attr.colorBackground, i5p0.class.getCanonicalName());
            int i5 = c7.resourceId;
            i5p0Var2.setFillColor(ColorStateList.valueOf(d2.getColor(R$styleable.Tooltip_backgroundTint, n8g.i(n8g.l(color, 153), n8g.l(i5 != 0 ? context2.getColor(i5) : c7.data, 229)))));
            TypedValue c8 = jl10.c(context2, R$attr.colorSurface, i5p0.class.getCanonicalName());
            int i6 = c8.resourceId;
            i5p0Var2.setStrokeColor(ColorStateList.valueOf(i6 != 0 ? context2.getColor(i6) : c8.data));
            i5p0Var2.h = d2.getDimensionPixelSize(R$styleable.Tooltip_android_padding, 0);
            i5p0Var2.i = d2.getDimensionPixelSize(R$styleable.Tooltip_android_minWidth, 0);
            i5p0Var2.j = d2.getDimensionPixelSize(R$styleable.Tooltip_android_minHeight, 0);
            i5p0Var2.k = d2.getDimensionPixelSize(R$styleable.Tooltip_android_layout_margin, 0);
            d2.recycle();
            ArrayList arrayList4 = arrayList2;
            arrayList4.add(i5p0Var2);
            WeakHashMap<View, b0u0> weakHashMap2 = iut0.a;
            if (isAttachedToWindow() && (c2 = t1u0.c(this)) != null) {
                int[] iArr = new int[2];
                c2.getLocationOnScreen(iArr);
                i5p0Var2.n = iArr[0];
                c2.getWindowVisibleDisplayFrame(i5p0Var2.g);
                c2.addOnLayoutChangeListener(i5p0Var2.f);
            }
            z = true;
            i = 0;
            arrayList3 = arrayList4;
            baseSlider = this;
        }
        ArrayList arrayList5 = arrayList3;
        int i7 = arrayList5.size() == 1 ? 0 : 1;
        Iterator it = arrayList5.iterator();
        while (it.hasNext()) {
            ((i5p0) it.next()).setStrokeWidth(i7);
        }
        Iterator it2 = this.n.iterator();
        while (it2.hasNext()) {
            ti6 ti6Var = (ti6) it2.next();
            Iterator<Float> it3 = this.T.iterator();
            while (it3.hasNext()) {
                ti6Var.F0(this, it3.next().floatValue(), false);
            }
        }
        postInvalidate();
    }

    public final float A(float f2) {
        return (o(f2) * this.e0) + this.E;
    }

    public final void a(@NonNull Slider.a aVar) {
        this.n.add(aVar);
    }

    public final void b(Drawable drawable) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth == -1 && intrinsicHeight == -1) {
            drawable.setBounds(0, 0, this.F, this.G);
        } else {
            float max = Math.max(this.F, this.G) / Math.max(intrinsicWidth, intrinsicHeight);
            drawable.setBounds(0, 0, (int) (intrinsicWidth * max), (int) (intrinsicHeight * max));
        }
    }

    public final int c() {
        int i = this.B / 2;
        int i2 = this.C;
        return i + ((i2 == 1 || i2 == 3) ? ((i5p0) this.m.get(0)).getIntrinsicHeight() : 0);
    }

    public final ValueAnimator d(boolean z) {
        int c2;
        TimeInterpolator d2;
        float f2 = z ? 0.0f : 1.0f;
        ValueAnimator valueAnimator = z ? this.r : this.q;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            f2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, z ? 1.0f : 0.0f);
        if (z) {
            c2 = tb30.c(w0, 83, getContext());
            d2 = tb30.d(getContext(), y0, rq2.e);
        } else {
            c2 = tb30.c(x0, Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE, getContext());
            d2 = tb30.d(getContext(), z0, rq2.c);
        }
        ofFloat.setDuration(c2);
        ofFloat.setInterpolator(d2);
        ofFloat.addUpdateListener(new a());
        return ofFloat;
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(@NonNull MotionEvent motionEvent) {
        return this.i.dispatchHoverEvent(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        this.b.setColor(h(this.l0));
        this.c.setColor(h(this.k0));
        this.f.setColor(h(this.j0));
        this.g.setColor(h(this.i0));
        this.h.setColor(h(this.k0));
        Iterator it = this.m.iterator();
        while (it.hasNext()) {
            i5p0 i5p0Var = (i5p0) it.next();
            if (i5p0Var.isStateful()) {
                i5p0Var.setState(getDrawableState());
            }
        }
        MaterialShapeDrawable materialShapeDrawable = this.p0;
        if (materialShapeDrawable.isStateful()) {
            materialShapeDrawable.setState(getDrawableState());
        }
        int h = h(this.h0);
        Paint paint = this.e;
        paint.setColor(h);
        paint.setAlpha(63);
    }

    public final void e(@NonNull Canvas canvas, int i, int i2, float f2, @NonNull Drawable drawable) {
        canvas.save();
        canvas.translate((this.E + ((int) (o(f2) * i))) - (drawable.getBounds().width() / 2.0f), i2 - (drawable.getBounds().height() / 2.0f));
        drawable.draw(canvas);
        canvas.restore();
    }

    public final void f() {
        if (!this.p) {
            this.p = true;
            ValueAnimator d2 = d(true);
            this.q = d2;
            this.r = null;
            d2.start();
        }
        ArrayList arrayList = this.m;
        Iterator it = arrayList.iterator();
        for (int i = 0; i < this.T.size() && it.hasNext(); i++) {
            if (i != this.V) {
                r((i5p0) it.next(), this.T.get(i).floatValue());
            }
        }
        if (!it.hasNext()) {
            throw new IllegalStateException(String.format("Not enough labels(%d) to display all the values(%d)", Integer.valueOf(arrayList.size()), Integer.valueOf(this.T.size())));
        }
        r((i5p0) it.next(), this.T.get(this.V).floatValue());
    }

    public final void g() {
        if (this.p) {
            this.p = false;
            ValueAnimator d2 = d(false);
            this.r = d2;
            this.q = null;
            d2.addListener(new b());
            this.r.start();
        }
    }

    @Override // android.view.View
    @NonNull
    public CharSequence getAccessibilityClassName() {
        return SeekBar.class.getName();
    }

    public final int getAccessibilityFocusedVirtualViewId() {
        return this.i.getAccessibilityFocusedVirtualViewId();
    }

    public int getActiveThumbIndex() {
        return this.U;
    }

    public int getFocusedThumbIndex() {
        return this.V;
    }

    public int getHaloRadius() {
        return this.H;
    }

    @NonNull
    public ColorStateList getHaloTintList() {
        return this.h0;
    }

    public int getLabelBehavior() {
        return this.C;
    }

    public float getMinSeparation() {
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public float getStepSize() {
        return this.W;
    }

    public float getThumbElevation() {
        return this.p0.getElevation();
    }

    public int getThumbHeight() {
        return this.G;
    }

    public int getThumbRadius() {
        return this.F / 2;
    }

    public ColorStateList getThumbStrokeColor() {
        return this.p0.getStrokeColor();
    }

    public float getThumbStrokeWidth() {
        return this.p0.getStrokeWidth();
    }

    @NonNull
    public ColorStateList getThumbTintList() {
        return this.p0.getFillColor();
    }

    public int getThumbTrackGapSize() {
        return this.I;
    }

    public int getThumbWidth() {
        return this.F;
    }

    public int getTickActiveRadius() {
        return this.c0;
    }

    @NonNull
    public ColorStateList getTickActiveTintList() {
        return this.i0;
    }

    public int getTickInactiveRadius() {
        return this.d0;
    }

    @NonNull
    public ColorStateList getTickInactiveTintList() {
        return this.j0;
    }

    @NonNull
    public ColorStateList getTickTintList() {
        if (this.j0.equals(this.i0)) {
            return this.i0;
        }
        throw new IllegalStateException("The inactive and active ticks are different colors. Use the getTickColorInactive() and getTickColorActive() methods instead.");
    }

    @NonNull
    public ColorStateList getTrackActiveTintList() {
        return this.k0;
    }

    public int getTrackHeight() {
        return this.D;
    }

    @NonNull
    public ColorStateList getTrackInactiveTintList() {
        return this.l0;
    }

    public int getTrackInsideCornerSize() {
        return this.M;
    }

    public int getTrackSidePadding() {
        return this.E;
    }

    public int getTrackStopIndicatorSize() {
        return this.L;
    }

    @NonNull
    public ColorStateList getTrackTintList() {
        if (this.l0.equals(this.k0)) {
            return this.k0;
        }
        throw new IllegalStateException("The inactive and active parts of the track are different colors. Use the getInactiveTrackColor() and getActiveTrackColor() methods instead.");
    }

    public int getTrackWidth() {
        return this.e0;
    }

    public float getValueFrom() {
        return this.R;
    }

    public float getValueTo() {
        return this.S;
    }

    @NonNull
    public List<Float> getValues() {
        return new ArrayList(this.T);
    }

    public final int h(@NonNull ColorStateList colorStateList) {
        return colorStateList.getColorForState(getDrawableState(), colorStateList.getDefaultColor());
    }

    public final boolean i(double d2) {
        double doubleValue = new BigDecimal(Double.toString(d2)).divide(new BigDecimal(Float.toString(this.W)), MathContext.DECIMAL64).doubleValue();
        return Math.abs(((double) Math.round(doubleValue)) - doubleValue) < 1.0E-4d;
    }

    public final boolean j(MotionEvent motionEvent) {
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

    public final boolean k() {
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        return getLayoutDirection() == 1;
    }

    public final void l() {
        if (this.W <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return;
        }
        y();
        int min = Math.min((int) (((this.S - this.R) / this.W) + 1.0f), (this.e0 / this.y) + 1);
        float[] fArr = this.a0;
        if (fArr == null || fArr.length != min * 2) {
            this.a0 = new float[min * 2];
        }
        float f2 = this.e0 / (min - 1);
        for (int i = 0; i < min * 2; i += 2) {
            float[] fArr2 = this.a0;
            fArr2[i] = n0.b(i, 2.0f, f2, this.E);
            fArr2[i + 1] = c();
        }
    }

    public final boolean m(int i) {
        int i2 = this.V;
        long j = i2 + i;
        long size = this.T.size() - 1;
        if (j < 0) {
            j = 0;
        } else if (j > size) {
            j = size;
        }
        int i3 = (int) j;
        this.V = i3;
        if (i3 == i2) {
            return false;
        }
        if (this.U != -1) {
            this.U = i3;
        }
        u();
        postInvalidate();
        return true;
    }

    public final void n(int i) {
        if (k()) {
            i = i == Integer.MIN_VALUE ? Integer.MAX_VALUE : -i;
        }
        m(i);
    }

    public final float o(float f2) {
        float f3 = this.R;
        float f4 = (f2 - f3) / (this.S - f3);
        return k() ? 1.0f - f4 : f4;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnScrollChangedListener(this.u0);
        Iterator it = this.m.iterator();
        while (it.hasNext()) {
            i5p0 i5p0Var = (i5p0) it.next();
            ViewGroup c2 = t1u0.c(this);
            if (c2 == null) {
                i5p0Var.getClass();
            } else {
                i5p0Var.getClass();
                int[] iArr = new int[2];
                c2.getLocationOnScreen(iArr);
                i5p0Var.n = iArr[0];
                c2.getWindowVisibleDisplayFrame(i5p0Var.g);
                c2.addOnLayoutChangeListener(i5p0Var.f);
            }
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        BaseSlider<S, L, T>.d dVar = this.k;
        if (dVar != null) {
            removeCallbacks(dVar);
        }
        this.p = false;
        Iterator it = this.m.iterator();
        while (it.hasNext()) {
            i5p0 i5p0Var = (i5p0) it.next();
            ViewGroup c2 = t1u0.c(this);
            ezt0 ezt0Var = c2 == null ? null : new ezt0((View) c2);
            if (ezt0Var != null) {
                ((ViewOverlay) ezt0Var.b).remove(i5p0Var);
                ViewGroup c3 = t1u0.c(this);
                if (c3 == null) {
                    i5p0Var.getClass();
                } else {
                    c3.removeOnLayoutChangeListener(i5p0Var.f);
                }
            }
        }
        getViewTreeObserver().removeOnScrollChangedListener(this.u0);
        super.onDetachedFromWindow();
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0184 A[SYNTHETIC] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(@NonNull Canvas canvas) {
        float f2;
        int i;
        float f3;
        BaseSlider<S, L, T> baseSlider = this;
        Canvas canvas2 = canvas;
        if (baseSlider.g0) {
            baseSlider.y();
            baseSlider.l();
        }
        super.onDraw(canvas);
        int c2 = baseSlider.c();
        int i2 = 0;
        float floatValue = baseSlider.T.get(0).floatValue();
        float floatValue2 = ((Float) xy9.b(1, baseSlider.T)).floatValue();
        float f4 = baseSlider.S;
        RectF rectF = baseSlider.n0;
        if (floatValue2 < f4 || (baseSlider.T.size() > 1 && floatValue > baseSlider.R)) {
            int i3 = baseSlider.e0;
            float[] activeRange = baseSlider.getActiveRange();
            int i4 = baseSlider.E;
            float f5 = i3;
            float f6 = (activeRange[1] * f5) + i4;
            float f7 = i4 + i3;
            Paint paint = baseSlider.b;
            if (f6 < f7) {
                int i5 = baseSlider.I;
                if (i5 > 0) {
                    float f8 = f6 + i5;
                    float f9 = c2;
                    float f10 = baseSlider.D / 2.0f;
                    f2 = 2.0f;
                    rectF.set(f8, f9 - f10, i4 + i3 + f10, f10 + f9);
                    baseSlider.w(canvas2, paint, rectF, f.RIGHT);
                } else {
                    f2 = 2.0f;
                    paint.setStyle(Paint.Style.STROKE);
                    paint.setStrokeCap(Paint.Cap.ROUND);
                    float f11 = c2;
                    canvas2.drawLine(f6, f11, baseSlider.E + i3, f11, paint);
                }
            } else {
                f2 = 2.0f;
            }
            int i6 = baseSlider.E;
            float f12 = i6;
            float f13 = (activeRange[0] * f5) + f12;
            if (f13 > f12) {
                int i7 = baseSlider.I;
                if (i7 > 0) {
                    float f14 = baseSlider.D / f2;
                    float f15 = c2;
                    rectF.set(i6 - f14, f15 - f14, f13 - i7, f14 + f15);
                    baseSlider.w(canvas2, paint, rectF, f.LEFT);
                } else {
                    paint.setStyle(Paint.Style.STROKE);
                    paint.setStrokeCap(Paint.Cap.ROUND);
                    float f16 = c2;
                    canvas2.drawLine(baseSlider.E, f16, f13, f16, paint);
                }
            }
        } else {
            f2 = 2.0f;
        }
        if (floatValue2 > baseSlider.R) {
            int i8 = baseSlider.e0;
            float[] activeRange2 = baseSlider.getActiveRange();
            float f17 = baseSlider.E;
            float f18 = i8;
            float f19 = (activeRange2[1] * f18) + f17;
            float f20 = (activeRange2[0] * f18) + f17;
            int i9 = baseSlider.I;
            Paint paint2 = baseSlider.c;
            if (i9 > 0) {
                f fVar = f.NONE;
                if (baseSlider.T.size() == 1) {
                    fVar = baseSlider.k() ? f.RIGHT : f.LEFT;
                }
                for (int i10 = 0; i10 < baseSlider.T.size(); i10++) {
                    if (baseSlider.T.size() > 1) {
                        if (i10 > 0) {
                            f20 = baseSlider.A(baseSlider.T.get(i10 - 1).floatValue());
                        }
                        f19 = baseSlider.A(baseSlider.T.get(i10).floatValue());
                        if (baseSlider.k()) {
                            f19 = f20;
                            f20 = f19;
                        }
                    }
                    int i11 = c.a[fVar.ordinal()];
                    if (i11 == 1) {
                        f3 = baseSlider.I;
                        f20 += f3;
                    } else if (i11 != 2) {
                        if (i11 == 3) {
                            f20 += baseSlider.I;
                            f19 = (baseSlider.D / f2) + f19;
                        }
                        if (f20 >= f19) {
                            float f21 = c2;
                            float f22 = baseSlider.D / f2;
                            rectF.set(f20, f21 - f22, f19, f22 + f21);
                            baseSlider.w(canvas2, paint2, rectF, fVar);
                        }
                    } else {
                        f20 -= baseSlider.D / f2;
                        f3 = baseSlider.I;
                    }
                    f19 -= f3;
                    if (f20 >= f19) {
                    }
                }
            } else {
                paint2.setStyle(Paint.Style.STROKE);
                paint2.setStrokeCap(Paint.Cap.ROUND);
                float f23 = c2;
                canvas2.drawLine(f20, f23, f19, f23, paint2);
            }
        }
        if (baseSlider.b0 && baseSlider.W > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            float[] activeRange3 = baseSlider.getActiveRange();
            int ceil = (int) Math.ceil(((baseSlider.a0.length / f2) - 1.0f) * activeRange3[0]);
            int floor = (int) Math.floor(((baseSlider.a0.length / f2) - 1.0f) * activeRange3[1]);
            Paint paint3 = baseSlider.f;
            if (ceil > 0) {
                canvas2.drawPoints(baseSlider.a0, 0, ceil * 2, paint3);
            }
            if (ceil <= floor) {
                canvas2.drawPoints(baseSlider.a0, ceil * 2, ((floor - ceil) + 1) * 2, baseSlider.g);
            }
            int i12 = (floor + 1) * 2;
            float[] fArr = baseSlider.a0;
            if (i12 < fArr.length) {
                canvas2.drawPoints(fArr, i12, fArr.length - i12, paint3);
            }
        }
        if (baseSlider.L > 0) {
            int size = baseSlider.T.size();
            Paint paint4 = baseSlider.h;
            if (size >= 1) {
                float floatValue3 = ((Float) xy9.b(1, baseSlider.T)).floatValue();
                float f24 = baseSlider.S;
                if (floatValue3 < f24) {
                    canvas2.drawPoint(baseSlider.A(f24), c2, paint4);
                }
            }
            if (baseSlider.T.size() > 1) {
                float floatValue4 = baseSlider.T.get(0).floatValue();
                float f25 = baseSlider.R;
                if (floatValue4 > f25) {
                    canvas2.drawPoint(baseSlider.A(f25), c2, paint4);
                }
            }
        }
        if ((baseSlider.Q || baseSlider.isFocused()) && baseSlider.isEnabled()) {
            int i13 = baseSlider.e0;
            if (!(baseSlider.getBackground() instanceof RippleDrawable)) {
                canvas2.drawCircle((int) ((baseSlider.o(baseSlider.T.get(baseSlider.V).floatValue()) * i13) + baseSlider.E), c2, baseSlider.H, baseSlider.e);
            }
        }
        baseSlider.v();
        int i14 = baseSlider.e0;
        while (i2 < baseSlider.T.size()) {
            float floatValue5 = baseSlider.T.get(i2).floatValue();
            Drawable drawable = baseSlider.q0;
            if (drawable != null) {
                i = c2;
                baseSlider.e(canvas2, i14, i, floatValue5, drawable);
            } else {
                i = c2;
                if (i2 < baseSlider.r0.size()) {
                    baseSlider.e(canvas, i14, i, floatValue5, baseSlider.r0.get(i2));
                } else {
                    if (!baseSlider.isEnabled()) {
                        canvas.drawCircle((baseSlider.o(floatValue5) * i14) + baseSlider.E, i, baseSlider.getThumbRadius(), baseSlider.d);
                    }
                    baseSlider.e(canvas, i14, i, floatValue5, baseSlider.p0);
                }
            }
            i2++;
            baseSlider = this;
            canvas2 = canvas;
            c2 = i;
        }
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z, int i, @Nullable Rect rect) {
        super.onFocusChanged(z, i, rect);
        e eVar = this.i;
        if (!z) {
            this.U = -1;
            eVar.clearKeyboardFocusForVirtualView(this.V);
            return;
        }
        if (i == 1) {
            m(Integer.MAX_VALUE);
        } else if (i == 2) {
            m(Integer.MIN_VALUE);
        } else if (i == 17) {
            n(Integer.MAX_VALUE);
        } else if (i == 66) {
            n(Integer.MIN_VALUE);
        }
        eVar.requestKeyboardFocusForVirtualView(this.V);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, @NonNull KeyEvent keyEvent) {
        if (!isEnabled()) {
            return super.onKeyDown(i, keyEvent);
        }
        if (this.T.size() == 1) {
            this.U = 0;
        }
        Float f2 = null;
        Boolean valueOf = null;
        if (this.U == -1) {
            if (i != 61) {
                if (i != 66) {
                    if (i != 81) {
                        if (i == 69) {
                            m(-1);
                            valueOf = Boolean.TRUE;
                        } else if (i != 70) {
                            switch (i) {
                                case 21:
                                    n(-1);
                                    valueOf = Boolean.TRUE;
                                    break;
                                case 22:
                                    n(1);
                                    valueOf = Boolean.TRUE;
                                    break;
                            }
                        }
                    }
                    m(1);
                    valueOf = Boolean.TRUE;
                }
                this.U = this.V;
                postInvalidate();
                valueOf = Boolean.TRUE;
            } else {
                valueOf = keyEvent.hasNoModifiers() ? Boolean.valueOf(m(1)) : keyEvent.isShiftPressed() ? Boolean.valueOf(m(-1)) : Boolean.FALSE;
            }
            return valueOf != null ? valueOf.booleanValue() : super.onKeyDown(i, keyEvent);
        }
        boolean isLongPress = this.f0 | keyEvent.isLongPress();
        this.f0 = isLongPress;
        if (isLongPress) {
            float f3 = this.W;
            r10 = f3 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? f3 : 1.0f;
            if ((this.S - this.R) / r10 > 20) {
                r10 *= Math.round(r0 / r11);
            }
        } else {
            float f4 = this.W;
            if (f4 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                r10 = f4;
            }
        }
        if (i == 21) {
            if (!k()) {
                r10 = -r10;
            }
            f2 = Float.valueOf(r10);
        } else if (i == 22) {
            if (k()) {
                r10 = -r10;
            }
            f2 = Float.valueOf(r10);
        } else if (i == 69) {
            f2 = Float.valueOf(-r10);
        } else if (i == 70 || i == 81) {
            f2 = Float.valueOf(r10);
        }
        if (f2 != null) {
            if (s(f2.floatValue() + this.T.get(this.U).floatValue(), this.U)) {
                u();
                postInvalidate();
            }
            return true;
        }
        if (i != 23) {
            if (i == 61) {
                if (keyEvent.hasNoModifiers()) {
                    return m(1);
                }
                if (keyEvent.isShiftPressed()) {
                    return m(-1);
                }
                return false;
            }
            if (i != 66) {
                return super.onKeyDown(i, keyEvent);
            }
        }
        this.U = -1;
        postInvalidate();
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, @NonNull KeyEvent keyEvent) {
        this.f0 = false;
        return super.onKeyUp(i, keyEvent);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3 = this.B;
        int i4 = this.C;
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(i3 + ((i4 == 1 || i4 == 3) ? ((i5p0) this.m.get(0)).getIntrinsicHeight() : 0), 1073741824));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        SliderState sliderState = (SliderState) parcelable;
        super.onRestoreInstanceState(sliderState.getSuperState());
        this.R = sliderState.b;
        this.S = sliderState.c;
        setValuesInternal(sliderState.d);
        this.W = sliderState.e;
        if (sliderState.f) {
            requestFocus();
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SliderState sliderState = new SliderState(super.onSaveInstanceState());
        sliderState.b = this.R;
        sliderState.c = this.S;
        sliderState.d = new ArrayList<>(this.T);
        sliderState.e = this.W;
        sliderState.f = hasFocus();
        return sliderState;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        this.e0 = Math.max(i - (this.E * 2), 0);
        l();
        u();
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0035, code lost:
    
        if (r2 != 3) goto L60;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(@NonNull MotionEvent motionEvent) {
        int i;
        if (isEnabled()) {
            float x = motionEvent.getX();
            float f2 = (x - this.E) / this.e0;
            this.s0 = f2;
            float max = Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2);
            this.s0 = max;
            this.s0 = Math.min(1.0f, max);
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                int i2 = this.s;
                if (actionMasked != 1) {
                    if (actionMasked == 2) {
                        if (!this.Q) {
                            if (!j(motionEvent) || Math.abs(x - this.O) >= i2) {
                                getParent().requestDisallowInterceptTouchEvent(true);
                                p();
                            }
                        }
                        if (q()) {
                            this.Q = true;
                            s(getValueOfTouchPosition(), this.U);
                            u();
                            invalidate();
                        }
                    }
                }
                this.Q = false;
                MotionEvent motionEvent2 = this.P;
                if (motionEvent2 != null && motionEvent2.getActionMasked() == 0) {
                    float f3 = i2;
                    if (Math.abs(this.P.getX() - motionEvent.getX()) <= f3 && gq.a(motionEvent, this.P.getY()) <= f3 && q()) {
                        p();
                    }
                }
                if (this.U != -1) {
                    s(getValueOfTouchPosition(), this.U);
                    u();
                    if (this.I > 0 && (i = this.J) != -1 && this.K != -1) {
                        setThumbWidth(i);
                        setThumbTrackGapSize(this.K);
                    }
                    this.U = -1;
                    Iterator it = this.o.iterator();
                    while (it.hasNext()) {
                        ((ui6) it.next()).b(this);
                    }
                }
                invalidate();
            } else {
                this.O = x;
                if (!j(motionEvent)) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                    if (q()) {
                        requestFocus();
                        this.Q = true;
                        s(getValueOfTouchPosition(), this.U);
                        u();
                        int i3 = this.I;
                        if (i3 > 0) {
                            int i4 = this.F;
                            this.J = i4;
                            this.K = i3;
                            int round = Math.round(i4 * 0.5f);
                            int i5 = this.F - round;
                            setThumbWidth(round);
                            setThumbTrackGapSize(this.I - (i5 / 2));
                        }
                        invalidate();
                        p();
                    }
                }
            }
            setPressed(this.Q);
            this.P = MotionEvent.obtain(motionEvent);
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final void onVisibilityChanged(@NonNull View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i != 0) {
            ViewGroup c2 = t1u0.c(this);
            ezt0 ezt0Var = c2 == null ? null : new ezt0((View) c2);
            if (ezt0Var == null) {
                return;
            }
            Iterator it = this.m.iterator();
            while (it.hasNext()) {
                ((ViewOverlay) ezt0Var.b).remove((i5p0) it.next());
            }
        }
    }

    public final void p() {
        Iterator it = this.o.iterator();
        while (it.hasNext()) {
            ((ui6) it.next()).a(this);
        }
    }

    public boolean q() {
        if (this.U != -1) {
            return true;
        }
        float valueOfTouchPositionAbsolute = getValueOfTouchPositionAbsolute();
        float A = A(valueOfTouchPositionAbsolute);
        this.U = 0;
        float abs = Math.abs(this.T.get(0).floatValue() - valueOfTouchPositionAbsolute);
        for (int i = 1; i < this.T.size(); i++) {
            float abs2 = Math.abs(this.T.get(i).floatValue() - valueOfTouchPositionAbsolute);
            float A2 = A(this.T.get(i).floatValue());
            if (Float.compare(abs2, abs) > 0) {
                break;
            }
            boolean z = !k() ? A2 - A >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : A2 - A <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            if (Float.compare(abs2, abs) < 0) {
                this.U = i;
            } else {
                if (Float.compare(abs2, abs) != 0) {
                    continue;
                } else {
                    if (Math.abs(A2 - A) < this.s) {
                        this.U = -1;
                        return false;
                    }
                    if (z) {
                        this.U = i;
                    }
                }
            }
            abs = abs2;
        }
        return this.U != -1;
    }

    public final void r(i5p0 i5p0Var, float f2) {
        String format = String.format(((float) ((int) f2)) == f2 ? "%.0f" : "%.2f", Float.valueOf(f2));
        if (!TextUtils.equals(i5p0Var.b, format)) {
            i5p0Var.b = format;
            i5p0Var.e.e = true;
            i5p0Var.invalidateSelf();
        }
        int o = (this.E + ((int) (o(f2) * this.e0))) - (i5p0Var.getIntrinsicWidth() / 2);
        int c2 = c() - ((this.G / 2) + this.N);
        i5p0Var.setBounds(o, c2 - i5p0Var.getIntrinsicHeight(), i5p0Var.getIntrinsicWidth() + o, c2);
        Rect rect = new Rect(i5p0Var.getBounds());
        j1m.c(t1u0.c(this), this, rect);
        i5p0Var.setBounds(rect);
        ViewGroup c3 = t1u0.c(this);
        ((ViewOverlay) (c3 == null ? null : new ezt0((View) c3)).b).add(i5p0Var);
    }

    public final boolean s(float f2, int i) {
        this.V = i;
        if (Math.abs(f2 - this.T.get(i).floatValue()) < 1.0E-4d) {
            return false;
        }
        float minSeparation = getMinSeparation();
        if (this.t0 == 0) {
            if (minSeparation == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                minSeparation = 0.0f;
            } else {
                float f3 = this.R;
                minSeparation = u11.b(f3, this.S, (minSeparation - this.E) / this.e0, f3);
            }
        }
        if (k()) {
            minSeparation = -minSeparation;
        }
        int i2 = i + 1;
        int i3 = i - 1;
        this.T.set(i, Float.valueOf(xwk.a(f2, i3 < 0 ? this.R : minSeparation + this.T.get(i3).floatValue(), i2 >= this.T.size() ? this.S : this.T.get(i2).floatValue() - minSeparation)));
        Iterator it = this.n.iterator();
        while (it.hasNext()) {
            ((ti6) it.next()).F0(this, this.T.get(i).floatValue(), true);
        }
        AccessibilityManager accessibilityManager = this.j;
        if (accessibilityManager != null && accessibilityManager.isEnabled()) {
            BaseSlider<S, L, T>.d dVar = this.k;
            if (dVar == null) {
                this.k = new d();
            } else {
                removeCallbacks(dVar);
            }
            BaseSlider<S, L, T>.d dVar2 = this.k;
            dVar2.b = i;
            postDelayed(dVar2, 200L);
        }
        return true;
    }

    public void setActiveThumbIndex(int i) {
        this.U = i;
    }

    public void setCustomThumbDrawable(int i) {
        setCustomThumbDrawable(getResources().getDrawable(i));
    }

    public void setCustomThumbDrawablesForValues(@NonNull int... iArr) {
        Drawable[] drawableArr = new Drawable[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            drawableArr[i] = getResources().getDrawable(iArr[i]);
        }
        setCustomThumbDrawablesForValues(drawableArr);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        setLayerType(z ? 0 : 2, null);
    }

    public void setFocusedThumbIndex(int i) {
        if (i < 0 || i >= this.T.size()) {
            throw new IllegalArgumentException("index out of range");
        }
        this.V = i;
        this.i.requestKeyboardFocusForVirtualView(i);
        postInvalidate();
    }

    public void setHaloRadius(int i) {
        if (i == this.H) {
            return;
        }
        this.H = i;
        Drawable background = getBackground();
        if ((getBackground() instanceof RippleDrawable) && (background instanceof RippleDrawable)) {
            ((RippleDrawable) background).setRadius(this.H);
        } else {
            postInvalidate();
        }
    }

    public void setHaloRadiusResource(int i) {
        setHaloRadius(getResources().getDimensionPixelSize(i));
    }

    public void setHaloTintList(@NonNull ColorStateList colorStateList) {
        if (colorStateList.equals(this.h0)) {
            return;
        }
        this.h0 = colorStateList;
        Drawable background = getBackground();
        if ((getBackground() instanceof RippleDrawable) && (background instanceof RippleDrawable)) {
            ((RippleDrawable) background).setColor(colorStateList);
            return;
        }
        int h = h(colorStateList);
        Paint paint = this.e;
        paint.setColor(h);
        paint.setAlpha(63);
        invalidate();
    }

    public void setLabelBehavior(int i) {
        if (this.C != i) {
            this.C = i;
            requestLayout();
        }
    }

    public void setSeparationUnit(int i) {
        this.t0 = i;
        this.g0 = true;
        postInvalidate();
    }

    public void setStepSize(float f2) {
        if (f2 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            throw new IllegalArgumentException(shy.c(this.S, ") range", bxj0.a("The stepSize(", f2, ") must be 0, or a factor of the valueFrom(", this.R, ")-valueTo(")));
        }
        if (this.W != f2) {
            this.W = f2;
            this.g0 = true;
            postInvalidate();
        }
    }

    public void setThumbElevation(float f2) {
        this.p0.setElevation(f2);
    }

    public void setThumbElevationResource(int i) {
        setThumbElevation(getResources().getDimension(i));
    }

    public void setThumbHeight(int i) {
        if (i == this.G) {
            return;
        }
        this.G = i;
        this.p0.setBounds(0, 0, this.F, i);
        Drawable drawable = this.q0;
        if (drawable != null) {
            b(drawable);
        }
        Iterator<Drawable> it = this.r0.iterator();
        while (it.hasNext()) {
            b(it.next());
        }
        x();
    }

    public void setThumbHeightResource(int i) {
        setThumbHeight(getResources().getDimensionPixelSize(i));
    }

    public void setThumbRadius(int i) {
        int i2 = i * 2;
        setThumbWidth(i2);
        setThumbHeight(i2);
    }

    public void setThumbRadiusResource(int i) {
        setThumbRadius(getResources().getDimensionPixelSize(i));
    }

    public void setThumbStrokeColor(@Nullable ColorStateList colorStateList) {
        this.p0.setStrokeColor(colorStateList);
        postInvalidate();
    }

    public void setThumbStrokeColorResource(int i) {
        if (i != 0) {
            setThumbStrokeColor(anj.b(i, getContext()));
        }
    }

    public void setThumbStrokeWidth(float f2) {
        this.p0.setStrokeWidth(f2);
        postInvalidate();
    }

    public void setThumbStrokeWidthResource(int i) {
        if (i != 0) {
            setThumbStrokeWidth(getResources().getDimension(i));
        }
    }

    public void setThumbTintList(@NonNull ColorStateList colorStateList) {
        MaterialShapeDrawable materialShapeDrawable = this.p0;
        if (colorStateList.equals(materialShapeDrawable.getFillColor())) {
            return;
        }
        materialShapeDrawable.setFillColor(colorStateList);
        invalidate();
    }

    public void setThumbTrackGapSize(int i) {
        if (this.I == i) {
            return;
        }
        this.I = i;
        invalidate();
    }

    public void setThumbWidth(int i) {
        if (i == this.F) {
            return;
        }
        this.F = i;
        a.C0123a c0123a = new a.C0123a();
        float f2 = this.F / 2.0f;
        wuj a2 = bdl.a(0);
        c0123a.a = a2;
        float b2 = a.C0123a.b(a2);
        if (b2 != -1.0f) {
            c0123a.n(b2);
        }
        c0123a.b = a2;
        float b3 = a.C0123a.b(a2);
        if (b3 != -1.0f) {
            c0123a.q(b3);
        }
        c0123a.j(a2);
        c0123a.f(a2);
        c0123a.c(f2);
        com.google.android.material.shape.a a3 = c0123a.a();
        MaterialShapeDrawable materialShapeDrawable = this.p0;
        materialShapeDrawable.setShapeAppearanceModel(a3);
        materialShapeDrawable.setBounds(0, 0, this.F, this.G);
        Drawable drawable = this.q0;
        if (drawable != null) {
            b(drawable);
        }
        Iterator<Drawable> it = this.r0.iterator();
        while (it.hasNext()) {
            b(it.next());
        }
        x();
    }

    public void setThumbWidthResource(int i) {
        setThumbWidth(getResources().getDimensionPixelSize(i));
    }

    public void setTickActiveRadius(int i) {
        if (this.c0 != i) {
            this.c0 = i;
            this.g.setStrokeWidth(i * 2);
            x();
        }
    }

    public void setTickActiveTintList(@NonNull ColorStateList colorStateList) {
        if (colorStateList.equals(this.i0)) {
            return;
        }
        this.i0 = colorStateList;
        this.g.setColor(h(colorStateList));
        invalidate();
    }

    public void setTickInactiveRadius(int i) {
        if (this.d0 != i) {
            this.d0 = i;
            this.f.setStrokeWidth(i * 2);
            x();
        }
    }

    public void setTickInactiveTintList(@NonNull ColorStateList colorStateList) {
        if (colorStateList.equals(this.j0)) {
            return;
        }
        this.j0 = colorStateList;
        this.f.setColor(h(colorStateList));
        invalidate();
    }

    public void setTickTintList(@NonNull ColorStateList colorStateList) {
        setTickInactiveTintList(colorStateList);
        setTickActiveTintList(colorStateList);
    }

    public void setTickVisible(boolean z) {
        if (this.b0 != z) {
            this.b0 = z;
            postInvalidate();
        }
    }

    public void setTrackActiveTintList(@NonNull ColorStateList colorStateList) {
        if (colorStateList.equals(this.k0)) {
            return;
        }
        this.k0 = colorStateList;
        this.c.setColor(h(colorStateList));
        this.h.setColor(h(this.k0));
        invalidate();
    }

    public void setTrackHeight(int i) {
        if (this.D != i) {
            this.D = i;
            this.b.setStrokeWidth(i);
            this.c.setStrokeWidth(this.D);
            x();
        }
    }

    public void setTrackInactiveTintList(@NonNull ColorStateList colorStateList) {
        if (colorStateList.equals(this.l0)) {
            return;
        }
        this.l0 = colorStateList;
        this.b.setColor(h(colorStateList));
        invalidate();
    }

    public void setTrackInsideCornerSize(int i) {
        if (this.M == i) {
            return;
        }
        this.M = i;
        invalidate();
    }

    public void setTrackStopIndicatorSize(int i) {
        if (this.L == i) {
            return;
        }
        this.L = i;
        this.h.setStrokeWidth(i);
        invalidate();
    }

    public void setTrackTintList(@NonNull ColorStateList colorStateList) {
        setTrackInactiveTintList(colorStateList);
        setTrackActiveTintList(colorStateList);
    }

    public void setValueFrom(float f2) {
        this.R = f2;
        this.g0 = true;
        postInvalidate();
    }

    public void setValueTo(float f2) {
        this.S = f2;
        this.g0 = true;
        postInvalidate();
    }

    public void setValues(@NonNull Float... fArr) {
        ArrayList<Float> arrayList = new ArrayList<>();
        Collections.addAll(arrayList, fArr);
        setValuesInternal(arrayList);
    }

    public final void t(int i, Rect rect) {
        int o = this.E + ((int) (o(getValues().get(i).floatValue()) * this.e0));
        int c2 = c();
        int max = Math.max(this.F / 2, this.z / 2);
        int max2 = Math.max(this.G / 2, this.z / 2);
        rect.set(o - max, c2 - max2, o + max, c2 + max2);
    }

    public final void u() {
        if (!(getBackground() instanceof RippleDrawable) || getMeasuredWidth() <= 0) {
            return;
        }
        Drawable background = getBackground();
        if (background instanceof RippleDrawable) {
            int o = (int) ((o(this.T.get(this.V).floatValue()) * this.e0) + this.E);
            int c2 = c();
            int i = this.H;
            background.setHotspotBounds(o - i, c2 - i, o + i, c2 + i);
        }
    }

    public final void v() {
        int i = this.C;
        if (i == 0 || i == 1) {
            if (this.U == -1 || !isEnabled()) {
                g();
                return;
            } else {
                f();
                return;
            }
        }
        if (i == 2) {
            g();
            return;
        }
        if (i != 3) {
            throw new IllegalArgumentException("Unexpected labelBehavior: " + this.C);
        }
        if (isEnabled()) {
            Rect rect = new Rect();
            t1u0.c(this).getHitRect(rect);
            if (getLocalVisibleRect(rect)) {
                f();
                return;
            }
        }
        g();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void w(Canvas canvas, Paint paint, RectF rectF, f fVar) {
        int i;
        int i2 = this.D;
        float f2 = i2 / 2.0f;
        float f3 = i2 / 2.0f;
        int[] iArr = c.a;
        int i3 = iArr[fVar.ordinal()];
        if (i3 == 1) {
            i = this.M;
            f2 = i;
        } else {
            if (i3 != 2) {
                if (i3 == 3) {
                    f2 = this.M;
                }
                paint.setStyle(Paint.Style.FILL);
                paint.setStrokeCap(Paint.Cap.BUTT);
                paint.setAntiAlias(true);
                Path path = this.m0;
                path.reset();
                if (rectF.width() < f2 + f3) {
                    path.addRoundRect(rectF, new float[]{f2, f2, f3, f3, f3, f3, f2, f2}, Path.Direction.CW);
                    canvas.drawPath(path, paint);
                    return;
                }
                float min = Math.min(f2, f3);
                float max = Math.max(f2, f3);
                canvas.save();
                path.addRoundRect(rectF, min, min, Path.Direction.CW);
                canvas.clipPath(path);
                int i4 = iArr[fVar.ordinal()];
                RectF rectF2 = this.o0;
                if (i4 == 2) {
                    float f4 = rectF.left;
                    rectF2.set(f4, rectF.top, (2.0f * max) + f4, rectF.bottom);
                } else if (i4 != 3) {
                    rectF2.set(rectF.centerX() - max, rectF.top, rectF.centerX() + max, rectF.bottom);
                } else {
                    float f5 = rectF.right;
                    rectF2.set(f5 - (2.0f * max), rectF.top, f5, rectF.bottom);
                }
                canvas.drawRoundRect(rectF2, max, max, paint);
                canvas.restore();
                return;
            }
            i = this.M;
        }
        f3 = i;
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        Path path2 = this.m0;
        path2.reset();
        if (rectF.width() < f2 + f3) {
        }
    }

    public final void x() {
        boolean z;
        int max = Math.max(this.A, Math.max(this.D + getPaddingBottom() + getPaddingTop(), getPaddingBottom() + getPaddingTop() + this.G));
        boolean z2 = true;
        if (max == this.B) {
            z = false;
        } else {
            this.B = max;
            z = true;
        }
        int max2 = Math.max(Math.max(Math.max((this.F / 2) - this.u, 0), Math.max((this.D - this.v) / 2, 0)), Math.max(Math.max(this.c0 - this.w, 0), Math.max(this.d0 - this.x, 0))) + this.t;
        if (this.E == max2) {
            z2 = false;
        } else {
            this.E = max2;
            WeakHashMap<View, b0u0> weakHashMap = iut0.a;
            if (isLaidOut()) {
                this.e0 = Math.max(getWidth() - (this.E * 2), 0);
                l();
            }
        }
        if (z) {
            requestLayout();
        } else if (z2) {
            postInvalidate();
        }
    }

    public final void y() {
        if (this.g0) {
            float f2 = this.R;
            float f3 = this.S;
            if (f2 >= f3) {
                throw new IllegalStateException("valueFrom(" + this.R + ") must be smaller than valueTo(" + this.S + ")");
            }
            if (f3 <= f2) {
                throw new IllegalStateException("valueTo(" + this.S + ") must be greater than valueFrom(" + this.R + ")");
            }
            if (this.W > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && !z(f3)) {
                throw new IllegalStateException(shy.c(this.S, ") range", bxj0.a("The stepSize(", this.W, ") must be 0, or a factor of the valueFrom(", this.R, ")-valueTo(")));
            }
            Iterator<Float> it = this.T.iterator();
            while (it.hasNext()) {
                Float next = it.next();
                if (next.floatValue() < this.R || next.floatValue() > this.S) {
                    float f4 = this.R;
                    float f5 = this.S;
                    StringBuilder sb = new StringBuilder("Slider value(");
                    sb.append(next);
                    sb.append(") must be greater or equal to valueFrom(");
                    sb.append(f4);
                    sb.append("), and lower or equal to valueTo(");
                    throw new IllegalStateException(shy.c(f5, ")", sb));
                }
                if (this.W > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && !z(next.floatValue())) {
                    float f6 = this.R;
                    float f7 = this.W;
                    throw new IllegalStateException("Value(" + next + ") must be equal to valueFrom(" + f6 + ") plus a multiple of stepSize(" + f7 + ") when using stepSize(" + f7 + ")");
                }
            }
            float minSeparation = getMinSeparation();
            if (minSeparation < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                throw new IllegalStateException("minSeparation(" + minSeparation + ") must be greater or equal to 0");
            }
            float f8 = this.W;
            if (f8 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && minSeparation > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                if (this.t0 != 1) {
                    throw new IllegalStateException("minSeparation(" + minSeparation + ") cannot be set as a dimension when using stepSize(" + this.W + ")");
                }
                if (minSeparation < f8 || !i(minSeparation)) {
                    float f9 = this.W;
                    throw new IllegalStateException(shy.c(f9, ")", bxj0.a("minSeparation(", minSeparation, ") must be greater or equal and a multiple of stepSize(", f9, ") when using stepSize(")));
                }
            }
            if (this.W != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                int i = (((int) r0) > this.S ? 1 : (((int) r0) == this.S ? 0 : -1));
            }
            this.g0 = false;
        }
    }

    public final boolean z(float f2) {
        return i(new BigDecimal(Float.toString(f2)).subtract(new BigDecimal(Float.toString(this.R)), MathContext.DECIMAL64).doubleValue());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r0v5, types: [xsna.sn6] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public BaseSlider(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(zm10.a(context, attributeSet, i, r4), attributeSet, i);
        int i2 = v0;
        this.m = new ArrayList();
        this.n = new ArrayList();
        this.o = new ArrayList();
        this.p = false;
        this.J = -1;
        this.K = -1;
        this.Q = false;
        this.T = new ArrayList<>();
        this.U = -1;
        this.V = -1;
        this.W = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.b0 = true;
        this.f0 = false;
        this.m0 = new Path();
        this.n0 = new RectF();
        this.o0 = new RectF();
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
        this.p0 = materialShapeDrawable;
        this.r0 = Collections.EMPTY_LIST;
        this.t0 = 0;
        this.u0 = new ViewTreeObserver.OnScrollChangedListener() { // from class: xsna.sn6
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                int i3 = BaseSlider.v0;
                BaseSlider.this.v();
            }
        };
        Context context2 = getContext();
        this.b = new Paint();
        this.c = new Paint();
        Paint paint = new Paint(1);
        this.d = paint;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        Paint paint2 = new Paint(1);
        this.e = paint2;
        paint2.setStyle(style);
        Paint paint3 = new Paint();
        this.f = paint3;
        Paint.Style style2 = Paint.Style.STROKE;
        paint3.setStyle(style2);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint3.setStrokeCap(cap);
        Paint paint4 = new Paint();
        this.g = paint4;
        paint4.setStyle(style2);
        paint4.setStrokeCap(cap);
        Paint paint5 = new Paint();
        this.h = paint5;
        paint5.setStyle(style);
        paint5.setStrokeCap(cap);
        Resources resources = context2.getResources();
        this.A = resources.getDimensionPixelSize(R$dimen.mtrl_slider_widget_height);
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R$dimen.mtrl_slider_track_side_padding);
        this.t = dimensionPixelOffset;
        this.E = dimensionPixelOffset;
        this.u = resources.getDimensionPixelSize(R$dimen.mtrl_slider_thumb_radius);
        this.v = resources.getDimensionPixelSize(R$dimen.mtrl_slider_track_height);
        this.w = resources.getDimensionPixelSize(R$dimen.mtrl_slider_tick_radius);
        this.x = resources.getDimensionPixelSize(R$dimen.mtrl_slider_tick_radius);
        this.y = resources.getDimensionPixelSize(R$dimen.mtrl_slider_tick_min_spacing);
        this.N = resources.getDimensionPixelSize(R$dimen.mtrl_slider_label_padding);
        int[] iArr = R$styleable.Slider;
        fpo0.a(context2, attributeSet, i, i2);
        fpo0.b(context2, attributeSet, iArr, i, i2, new int[0]);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, i, i2);
        this.l = obtainStyledAttributes.getResourceId(R$styleable.Slider_labelStyle, R$style.Widget_MaterialComponents_Tooltip);
        this.R = obtainStyledAttributes.getFloat(R$styleable.Slider_android_valueFrom, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.S = obtainStyledAttributes.getFloat(R$styleable.Slider_android_valueTo, 1.0f);
        setValues(Float.valueOf(this.R));
        this.W = obtainStyledAttributes.getFloat(R$styleable.Slider_android_stepSize, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.z = (int) Math.ceil(obtainStyledAttributes.getDimension(R$styleable.Slider_minTouchTargetSize, (float) Math.ceil(t1u0.b(48, getContext()))));
        boolean hasValue = obtainStyledAttributes.hasValue(R$styleable.Slider_trackColor);
        int i3 = hasValue ? R$styleable.Slider_trackColor : R$styleable.Slider_trackColorInactive;
        int i4 = hasValue ? R$styleable.Slider_trackColor : R$styleable.Slider_trackColorActive;
        ColorStateList a2 = qm10.a(context2, obtainStyledAttributes, i3);
        setTrackInactiveTintList(a2 == null ? anj.b(R$color.material_slider_inactive_track_color, context2) : a2);
        ColorStateList a3 = qm10.a(context2, obtainStyledAttributes, i4);
        setTrackActiveTintList(a3 == null ? anj.b(R$color.material_slider_active_track_color, context2) : a3);
        materialShapeDrawable.setFillColor(qm10.a(context2, obtainStyledAttributes, R$styleable.Slider_thumbColor));
        if (obtainStyledAttributes.hasValue(R$styleable.Slider_thumbStrokeColor)) {
            setThumbStrokeColor(qm10.a(context2, obtainStyledAttributes, R$styleable.Slider_thumbStrokeColor));
        }
        setThumbStrokeWidth(obtainStyledAttributes.getDimension(R$styleable.Slider_thumbStrokeWidth, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        ColorStateList a4 = qm10.a(context2, obtainStyledAttributes, R$styleable.Slider_haloColor);
        setHaloTintList(a4 == null ? anj.b(R$color.material_slider_halo_color, context2) : a4);
        this.b0 = obtainStyledAttributes.getBoolean(R$styleable.Slider_tickVisible, true);
        boolean hasValue2 = obtainStyledAttributes.hasValue(R$styleable.Slider_tickColor);
        int i5 = hasValue2 ? R$styleable.Slider_tickColor : R$styleable.Slider_tickColorInactive;
        int i6 = hasValue2 ? R$styleable.Slider_tickColor : R$styleable.Slider_tickColorActive;
        ColorStateList a5 = qm10.a(context2, obtainStyledAttributes, i5);
        setTickInactiveTintList(a5 == null ? anj.b(R$color.material_slider_inactive_tick_marks_color, context2) : a5);
        ColorStateList a6 = qm10.a(context2, obtainStyledAttributes, i6);
        setTickActiveTintList(a6 == null ? anj.b(R$color.material_slider_active_tick_marks_color, context2) : a6);
        setThumbTrackGapSize(obtainStyledAttributes.getDimensionPixelSize(R$styleable.Slider_thumbTrackGapSize, 0));
        setTrackStopIndicatorSize(obtainStyledAttributes.getDimensionPixelSize(R$styleable.Slider_trackStopIndicatorSize, 0));
        setTrackInsideCornerSize(obtainStyledAttributes.getDimensionPixelSize(R$styleable.Slider_trackInsideCornerSize, 0));
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(R$styleable.Slider_thumbRadius, 0) * 2;
        int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(R$styleable.Slider_thumbWidth, dimensionPixelSize);
        int dimensionPixelSize3 = obtainStyledAttributes.getDimensionPixelSize(R$styleable.Slider_thumbHeight, dimensionPixelSize);
        setThumbWidth(dimensionPixelSize2);
        setThumbHeight(dimensionPixelSize3);
        setHaloRadius(obtainStyledAttributes.getDimensionPixelSize(R$styleable.Slider_haloRadius, 0));
        setThumbElevation(obtainStyledAttributes.getDimension(R$styleable.Slider_thumbElevation, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        setTrackHeight(obtainStyledAttributes.getDimensionPixelSize(R$styleable.Slider_trackHeight, 0));
        setTickActiveRadius(obtainStyledAttributes.getDimensionPixelSize(R$styleable.Slider_tickRadiusActive, this.L / 2));
        setTickInactiveRadius(obtainStyledAttributes.getDimensionPixelSize(R$styleable.Slider_tickRadiusInactive, this.L / 2));
        setLabelBehavior(obtainStyledAttributes.getInt(R$styleable.Slider_labelBehavior, 0));
        if (!obtainStyledAttributes.getBoolean(R$styleable.Slider_android_enabled, true)) {
            setEnabled(false);
        }
        obtainStyledAttributes.recycle();
        setFocusable(true);
        setClickable(true);
        materialShapeDrawable.setShadowCompatibilityMode(2);
        this.s = ViewConfiguration.get(context2).getScaledTouchSlop();
        e eVar = new e(this);
        this.i = eVar;
        iut0.q(this, eVar);
        this.j = (AccessibilityManager) getContext().getSystemService("accessibility");
    }

    public void setCustomThumbDrawable(@NonNull Drawable drawable) {
        Drawable newDrawable = drawable.mutate().getConstantState().newDrawable();
        b(newDrawable);
        this.q0 = newDrawable;
        this.r0.clear();
        postInvalidate();
    }

    public void setValues(@NonNull List<Float> list) {
        setValuesInternal(new ArrayList<>(list));
    }

    public void setCustomThumbDrawablesForValues(@NonNull Drawable... drawableArr) {
        this.q0 = null;
        this.r0 = new ArrayList();
        for (Drawable drawable : drawableArr) {
            List<Drawable> list = this.r0;
            Drawable newDrawable = drawable.mutate().getConstantState().newDrawable();
            b(newDrawable);
            list.add(newDrawable);
        }
        postInvalidate();
    }

    public void setLabelFormatter(@Nullable cly clyVar) {
    }
}
