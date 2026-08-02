package com.vk.im.ui.views.counter;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.style.ReplacementSpan;
import android.util.AttributeSet;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import com.vk.im.design.R$styleable;
import com.vk.typography.FontFamily;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import xsna.abg0;
import xsna.asp;
import xsna.cn70;
import xsna.cu1;
import xsna.db;
import xsna.dhr0;
import xsna.epx;
import xsna.fpf0;
import xsna.g60;
import xsna.izs;
import xsna.msy;
import xsna.ot;
import xsna.p5j;
import xsna.p7f0;
import xsna.pt;
import xsna.py;
import xsna.qcy;
import xsna.qt;
import xsna.s3q0;
import xsna.too0;
import xsna.v7;
import xsna.wng0;
import xsna.xi2;
import xsna.xo2;
import xsna.xpm0;
import xsna.zrp;

/* compiled from: AnimatedCounterView.kt */
/* loaded from: classes2.dex */
public class AnimatedCounterView extends View implements too0 {
    public static final /* synthetic */ qcy<Object>[] w = {new MutablePropertyReference1Impl(AnimatedCounterView.class, "textSize", "getTextSize()I", 0), p5j.a(0, AnimatedCounterView.class, "corners", "getCorners()I", fpf0.a), new MutablePropertyReference1Impl(AnimatedCounterView.class, "minWidth", "getMinWidth()I", 0), new MutablePropertyReference1Impl(AnimatedCounterView.class, "minHeight", "getMinHeight()I", 0), new MutablePropertyReference1Impl(AnimatedCounterView.class, "paddingHorizontal", "getPaddingHorizontal()I", 0), new MutablePropertyReference1Impl(AnimatedCounterView.class, "baseColor", "getBaseColor()I", 0), new MutablePropertyReference1Impl(AnimatedCounterView.class, "isMuted", "isMuted()Z", 0)};
    public final Object b;
    public boolean c;
    public int d;
    public a e;
    public ValueAnimator f;
    public float g;
    public StaticLayout h;
    public StaticLayout i;
    public StaticLayout j;
    public StaticLayout k;
    public int l;
    public int m;
    public TextPaint n;
    public final c o;
    public final c p;
    public final c q;
    public final c r;
    public final c s;
    public final c t;
    public final c u;
    public final wng0 v;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AnimatedCounterView.kt */
    public static final class a {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a IN;
        public static final a NONE;
        public static final a OUT;
        public static final a REPLACE;

        static {
            a aVar = new a("IN", 0);
            IN = aVar;
            a aVar2 = new a("OUT", 1);
            OUT = aVar2;
            a aVar3 = new a("REPLACE", 2);
            REPLACE = aVar3;
            a aVar4 = new a("NONE", 3);
            NONE = aVar4;
            a[] aVarArr = {aVar, aVar2, aVar3, aVar4};
            $VALUES = aVarArr;
            $ENTRIES = new asp(aVarArr);
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    /* compiled from: AnimatedCounterView.kt */
    public static final class c<T, V> implements p7f0<T, V> {
        public final izs<T, s3q0> b;
        public V c;

        /* JADX WARN: Multi-variable type inference failed */
        public c(V v, izs<? super T, s3q0> izsVar) {
            this.b = izsVar;
            this.c = v;
        }

        @Override // xsna.i7f0
        public final V getValue(T t, qcy<?> qcyVar) {
            return this.c;
        }

        @Override // xsna.p7f0
        public final void setValue(T t, qcy<?> qcyVar, V v) {
            this.c = v;
            this.b.invoke(t);
        }
    }

    /* compiled from: AnimatedCounterView.kt */
    public static final /* synthetic */ class d {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.REPLACE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public AnimatedCounterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = msy.a(LazyThreadSafetyMode.NONE, new cu1(1));
        this.d = -1;
        this.e = a.NONE;
        this.g = 1.0f;
        this.o = new c(Integer.valueOf(cn70.b(12)), new g60(this, 1));
        this.p = new c(Integer.valueOf(cn70.b(12)), new v7(4));
        this.q = new c(Integer.valueOf(cn70.b(18)), new db(5));
        this.r = new c(Integer.valueOf(cn70.b(18)), new ot(3));
        this.s = new c(Integer.valueOf(cn70.b(5)), new pt(5));
        this.t = new c(Integer.valueOf(R.attr.vk_ui_background_accent_themed), new qt(3));
        this.u = new c(Boolean.FALSE, new py(2));
        wng0 wng0Var = new wng0();
        this.v = wng0Var;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.a, 0, 0);
        setTextSize(obtainStyledAttributes.getDimensionPixelSize(0, cn70.b(12)));
        setMinWidth(obtainStyledAttributes.getDimensionPixelSize(1, cn70.b(18)));
        setMinHeight(obtainStyledAttributes.getDimensionPixelSize(2, cn70.b(18)));
        setCorners(obtainStyledAttributes.getDimensionPixelSize(4, cn70.b(12)));
        setPaddingHorizontal(obtainStyledAttributes.getDimensionPixelSize(3, cn70.b(5)));
        obtainStyledAttributes.recycle();
        TextPaint textPaint = new TextPaint(1);
        textPaint.setColor(-1);
        textPaint.setTextSize(getTextSize());
        this.n = textPaint;
        wng0.e(getCorners(), wng0Var);
        setBackground(wng0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void c(AnimatedCounterView animatedCounterView, int i) {
        a aVar;
        if (i == animatedCounterView.d || epx.f(xpm0.a(i), xpm0.a(animatedCounterView.d))) {
            return;
        }
        ValueAnimator valueAnimator = animatedCounterView.f;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int i2 = animatedCounterView.d;
        if (i2 == 0 && animatedCounterView.h == null) {
            animatedCounterView.setCounterWithoutAnimation(i);
            return;
        }
        Object[] objArr = 0;
        if (i2 < 0) {
            animatedCounterView.n.setAlpha(0);
            animatedCounterView.v.setAlpha(0);
            aVar = a.IN;
        } else {
            aVar = i2 == 0 ? a.OUT : a.REPLACE;
        }
        animatedCounterView.e = aVar;
        animatedCounterView.g = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        ofFloat.setDuration(d.$EnumSwitchMapping$0[animatedCounterView.e.ordinal()] == 1 ? 400L : 150L);
        ofFloat.addUpdateListener(new xi2(animatedCounterView, objArr == true ? 1 : 0));
        xo2.h(ofFloat, new com.vk.movika.sdk.base.model.b(animatedCounterView, 5));
        animatedCounterView.f = ofFloat;
        String a2 = xpm0.a(i);
        String a3 = xpm0.a(animatedCounterView.d);
        if (animatedCounterView.h != null) {
            if (a3.length() == a2.length()) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(a3);
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(a2);
                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(a2);
                int length = a3.length();
                for (int i3 = 0; i3 < length; i3++) {
                    if (a3.charAt(i3) == a2.charAt(i3)) {
                        int i4 = i3 + 1;
                        spannableStringBuilder.setSpan(new b(), i3, i4, 0);
                        spannableStringBuilder2.setSpan(new b(), i3, i4, 0);
                    } else {
                        spannableStringBuilder3.setSpan(new b(), i3, i3 + 1, 0);
                    }
                }
                int measureText = (int) animatedCounterView.n.measureText(a3);
                animatedCounterView.i = animatedCounterView.d(measureText, spannableStringBuilder);
                animatedCounterView.k = animatedCounterView.d(measureText, spannableStringBuilder3);
                animatedCounterView.j = animatedCounterView.d(measureText, spannableStringBuilder2);
            } else {
                animatedCounterView.i = animatedCounterView.h;
            }
        }
        animatedCounterView.m = animatedCounterView.l;
        animatedCounterView.c = i > animatedCounterView.d;
        ValueAnimator valueAnimator2 = animatedCounterView.f;
        if (valueAnimator2 != null) {
            valueAnimator2.start();
        }
        if (i > 0) {
            int measureText2 = (int) animatedCounterView.n.measureText(a2);
            animatedCounterView.l = measureText2;
            animatedCounterView.h = animatedCounterView.d(measureText2, a2);
        }
        animatedCounterView.d = i;
        if (animatedCounterView.l != animatedCounterView.m) {
            animatedCounterView.requestLayout();
        }
    }

    private final void setCounterWithoutAnimation(int i) {
        this.d = i;
        this.m = this.l;
        String a2 = xpm0.a(i);
        int measureText = (int) this.n.measureText(a2);
        this.l = measureText;
        this.h = d(measureText, a2);
        if (this.l != this.m) {
            requestLayout();
        } else {
            invalidate();
        }
    }

    @Override // xsna.too0
    public final void Ng() {
        b();
    }

    public final void a(Canvas canvas) {
        StaticLayout staticLayout = this.h;
        if (staticLayout != null) {
            canvas.save();
            canvas.translate((canvas.getWidth() - getMeasuredWidth()) / 2.0f, (getHeight() - staticLayout.getHeight()) / 2.0f);
            s3q0 s3q0Var = s3q0.a;
            staticLayout.draw(canvas);
            canvas.restore();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    public final void b() {
        Pair pair;
        Integer valueOf = Integer.valueOf(R.attr.vk_ui_text_contrast_themed);
        boolean booleanValue = ((Boolean) this.b.getValue()).booleanValue();
        qcy<Object>[] qcyVarArr = w;
        c cVar = this.u;
        if (booleanValue) {
            qcy<Object> qcyVar = qcyVarArr[6];
            pair = ((Boolean) cVar.c).booleanValue() ? new Pair(Integer.valueOf(R.attr.vk_ui_text_contrast), Integer.valueOf(R.attr.vk_ui_icon_secondary)) : new Pair(valueOf, Integer.valueOf(R.attr.vk_ui_background_accent_themed));
        } else {
            qcy<Object> qcyVar2 = qcyVarArr[6];
            pair = ((Boolean) cVar.c).booleanValue() ? new Pair(valueOf, Integer.valueOf(R.attr.vk_ui_icon_tertiary)) : new Pair(valueOf, Integer.valueOf(getBaseColor()));
        }
        int intValue = ((Number) pair.d()).intValue();
        int intValue2 = ((Number) pair.g()).intValue();
        TextPaint textPaint = this.n;
        abg0 abg0Var = dhr0.t;
        textPaint.setColor(abg0Var.c(intValue));
        this.v.b(abg0Var.c(intValue2));
        invalidate();
    }

    public final StaticLayout d(int i, CharSequence charSequence) {
        StaticLayout.Builder includePad = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.n, i > getMinWidth() / 2 ? (getPaddingHorizontal() * 2) + i : getMinWidth()).setAlignment(Layout.Alignment.ALIGN_CENTER).setIncludePad(false);
        if (Build.VERSION.SDK_INT >= 35) {
            includePad.setUseBoundsForWidth(true);
            includePad.setShiftDrawingOffsetForStartOverhang(true);
        }
        return includePad.build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int getBaseColor() {
        qcy<Object> qcyVar = w[5];
        return ((Number) this.t.c).intValue();
    }

    public final wng0 getBgDrawable() {
        return this.v;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int getCorners() {
        qcy<Object> qcyVar = w[1];
        return ((Number) this.p.c).intValue();
    }

    public final int getCurrentCount() {
        return this.d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int getMinHeight() {
        qcy<Object> qcyVar = w[3];
        return ((Number) this.r.c).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int getMinWidth() {
        qcy<Object> qcyVar = w[2];
        return ((Number) this.q.c).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int getPaddingHorizontal() {
        qcy<Object> qcyVar = w[4];
        return ((Number) this.s.c).intValue();
    }

    public final TextPaint getTextPaint() {
        return this.n;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int getTextSize() {
        qcy<Object> qcyVar = w[0];
        return ((Number) this.o.c).intValue();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        a aVar;
        super.onDraw(canvas);
        float f = this.g;
        if (!(f == 1.0f) && ((aVar = this.e) == a.IN || aVar == a.OUT)) {
            a(canvas);
            float f2 = 255;
            this.v.setAlpha((int) (this.g * f2));
            this.n.setAlpha((int) (this.g * f2));
            return;
        }
        if ((f == 1.0f) || this.e != a.REPLACE) {
            if (f == 1.0f) {
                a(canvas);
                return;
            }
            return;
        }
        float f3 = f * 2;
        if (f3 > 1.0f) {
            f3 = 1.0f;
        }
        canvas.save();
        StaticLayout staticLayout = this.j;
        if (staticLayout != null) {
            float height = (getHeight() - staticLayout.getHeight()) / 2.0f;
            int b2 = this.c ? cn70.b(13) : cn70.b(-13);
            canvas.save();
            canvas.translate((canvas.getWidth() - getMeasuredWidth()) / 2.0f, height + ((1.0f - f3) * b2));
            this.n.setAlpha((int) (255 * f3));
            s3q0 s3q0Var = s3q0.a;
            staticLayout.draw(canvas);
            canvas.restore();
        } else {
            StaticLayout staticLayout2 = this.h;
            if (staticLayout2 != null) {
                float height2 = (getHeight() - staticLayout2.getHeight()) / 2.0f;
                int b3 = this.c ? cn70.b(13) : cn70.b(-13);
                canvas.save();
                canvas.translate((canvas.getWidth() - getMeasuredWidth()) / 2.0f, height2 + ((1.0f - f3) * b3));
                this.n.setAlpha((int) (255 * f3));
                s3q0 s3q0Var2 = s3q0.a;
                staticLayout2.draw(canvas);
                canvas.restore();
            }
        }
        StaticLayout staticLayout3 = this.i;
        if (staticLayout3 != null) {
            float height3 = (getHeight() - staticLayout3.getHeight()) / 2.0f;
            int b4 = this.c ? cn70.b(-13) : cn70.b(13);
            canvas.save();
            canvas.translate((canvas.getWidth() - getMeasuredWidth()) / 2.0f, height3 + (b4 * f3));
            this.n.setAlpha((int) ((1.0f - f3) * 255));
            s3q0 s3q0Var3 = s3q0.a;
            staticLayout3.draw(canvas);
            canvas.restore();
        }
        StaticLayout staticLayout4 = this.k;
        if (staticLayout4 != null) {
            canvas.save();
            canvas.translate((canvas.getWidth() - getMeasuredWidth()) / 2.0f, (getHeight() - this.k.getHeight()) / 2.0f);
            this.n.setAlpha(255);
            s3q0 s3q0Var4 = s3q0.a;
            staticLayout4.draw(canvas);
            canvas.restore();
        }
        this.n.setAlpha(255);
        canvas.restore();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measureText = (int) this.n.measureText(xpm0.a(this.d));
        setMeasuredDimension(measureText > getMinWidth() / 2 ? (getPaddingHorizontal() * 2) + measureText : getMinWidth(), getMinHeight());
    }

    public final void setBaseColor(int i) {
        this.t.setValue(this, w[5], Integer.valueOf(i));
    }

    public final void setCorners(int i) {
        this.p.setValue(this, w[1], Integer.valueOf(i));
    }

    public final void setFontFamily(FontFamily fontFamily) {
        com.vk.typography.b.j(this.n, getContext(), fontFamily, null, 12);
    }

    public final void setMinHeight(int i) {
        this.r.setValue(this, w[3], Integer.valueOf(i));
    }

    public final void setMinWidth(int i) {
        this.q.setValue(this, w[2], Integer.valueOf(i));
    }

    public final void setMuted(boolean z) {
        this.u.setValue(this, w[6], Boolean.valueOf(z));
    }

    public final void setPaddingHorizontal(int i) {
        this.s.setValue(this, w[4], Integer.valueOf(i));
    }

    public final void setTextPaint(TextPaint textPaint) {
        this.n = textPaint;
    }

    public final void setTextSize(int i) {
        this.o.setValue(this, w[0], Integer.valueOf(i));
    }

    /* compiled from: AnimatedCounterView.kt */
    public static final class b extends ReplacementSpan {
        @Override // android.text.style.ReplacementSpan
        public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
            return (int) paint.measureText(charSequence, i, i2);
        }

        @Override // android.text.style.ReplacementSpan
        public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        }
    }
}
