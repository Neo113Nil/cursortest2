package com.vk.core.view.components.counter;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.components.R$styleable;
import com.vk.core.view.components.counter.VkCounter;
import com.vk.core.view.components.text.VkText;
import com.vkontakte.android.R;
import xsna.asp;
import xsna.d3m;
import xsna.epx;
import xsna.gpo0;
import xsna.hav0;
import xsna.php;
import xsna.s3q0;
import xsna.too0;
import xsna.vu5;
import xsna.x2j0;
import xsna.xpm0;
import xsna.ylb;
import xsna.zrp;

/* compiled from: VkCounter.kt */
/* loaded from: classes17.dex */
public class VkCounter extends View implements too0 {
    public static final CounterAppearance.a t = new CounterAppearance.a(R.attr.vk_ui_background_contrast_inverse, R.attr.vk_ui_text_contrast);
    public boolean b;
    public ValueAnimator c;
    public float d;
    public StaticLayout e;
    public StaticLayout f;
    public StaticLayout g;
    public StaticLayout h;
    public final VkText i;
    public int j;
    public int k;
    public int l;
    public CounterAppearance m;
    public Mode n;
    public Size o;
    public boolean p;
    public int q;
    public int r;
    public int s;

    /* compiled from: VkCounter.kt */
    public interface CounterAppearance {

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: VkCounter.kt */
        public static final class Appearance implements CounterAppearance {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ Appearance[] $VALUES;
            public static final Appearance Accent;
            public static final Appearance AccentGreen;
            public static final Appearance AccentRed;
            public static final Appearance Neutral;

            static {
                Appearance appearance = new Appearance("Accent", 0);
                Accent = appearance;
                Appearance appearance2 = new Appearance("Neutral", 1);
                Neutral = appearance2;
                Appearance appearance3 = new Appearance("AccentGreen", 2);
                AccentGreen = appearance3;
                Appearance appearance4 = new Appearance("AccentRed", 3);
                AccentRed = appearance4;
                Appearance[] appearanceArr = {appearance, appearance2, appearance3, appearance4};
                $VALUES = appearanceArr;
                $ENTRIES = new asp(appearanceArr);
            }

            public Appearance() {
                throw null;
            }

            public static zrp<Appearance> h() {
                return $ENTRIES;
            }

            public static Appearance valueOf(String str) {
                return (Appearance) Enum.valueOf(Appearance.class, str);
            }

            public static Appearance[] values() {
                return (Appearance[]) $VALUES.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: VkCounter.kt */
        public static final class Priority implements CounterAppearance {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ Priority[] $VALUES;
            public static final Priority High;
            public static final Priority Low;
            public static final Priority Medium;

            static {
                Priority priority = new Priority("High", 0);
                High = priority;
                Priority priority2 = new Priority("Medium", 1);
                Medium = priority2;
                Priority priority3 = new Priority("Low", 2);
                Low = priority3;
                Priority[] priorityArr = {priority, priority2, priority3};
                $VALUES = priorityArr;
                $ENTRIES = new asp(priorityArr);
            }

            public Priority() {
                throw null;
            }

            public static Priority valueOf(String str) {
                return (Priority) Enum.valueOf(Priority.class, str);
            }

            public static Priority[] values() {
                return (Priority[]) $VALUES.clone();
            }
        }

        /* compiled from: VkCounter.kt */
        public static final class a implements CounterAppearance {
            public final int b;
            public final int c;

            public a(int i, int i2) {
                this.b = i;
                this.c = i2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return this.b == aVar.b && this.c == aVar.c;
            }

            public final int hashCode() {
                return Integer.hashCode(this.c) + (Integer.hashCode(this.b) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Custom(backgroundColor=");
                sb.append(this.b);
                sb.append(", contentColor=");
                return vu5.b(sb, this.c, ')');
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VkCounter.kt */
    public static final class Mode {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Mode[] $VALUES;
        public static final Mode Contrast;
        public static final Mode Primary;
        public static final Mode Tertiary;

        static {
            Mode mode = new Mode("Primary", 0);
            Primary = mode;
            Mode mode2 = new Mode("Contrast", 1);
            Contrast = mode2;
            Mode mode3 = new Mode("Tertiary", 2);
            Tertiary = mode3;
            Mode[] modeArr = {mode, mode2, mode3};
            $VALUES = modeArr;
            $ENTRIES = new asp(modeArr);
        }

        public Mode() {
            throw null;
        }

        public static zrp<Mode> h() {
            return $ENTRIES;
        }

        public static Mode valueOf(String str) {
            return (Mode) Enum.valueOf(Mode.class, str);
        }

        public static Mode[] values() {
            return (Mode[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VkCounter.kt */
    /* loaded from: classes.dex */
    public static final class Size {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Size[] $VALUES;
        public static final Size Large;
        public static final Size Medium;
        public static final Size Small;

        static {
            Size size = new Size("Small", 0);
            Small = size;
            Size size2 = new Size("Medium", 1);
            Medium = size2;
            Size size3 = new Size("Large", 2);
            Large = size3;
            Size[] sizeArr = {size, size2, size3};
            $VALUES = sizeArr;
            $ENTRIES = new asp(sizeArr);
        }

        public Size() {
            throw null;
        }

        public static zrp<Size> h() {
            return $ENTRIES;
        }

        public static Size valueOf(String str) {
            return (Size) Enum.valueOf(Size.class, str);
        }

        public static Size[] values() {
            return (Size[]) $VALUES.clone();
        }
    }

    /* compiled from: VkCounter.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Mode.values().length];
            try {
                iArr[Mode.Tertiary.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ VkCounter(Context context) {
        this(context, null);
    }

    @Override // xsna.too0
    public void Ng() {
        d();
    }

    public final float a(Canvas canvas) {
        float width = canvas.getWidth() / 2.0f;
        return this.b ? width : -width;
    }

    public final void b(Canvas canvas) {
        super.onDraw(canvas);
    }

    public final void c(Canvas canvas) {
        float f = this.d;
        if (f == 1.0f) {
            StaticLayout staticLayout = this.e;
            if (staticLayout != null) {
                canvas.save();
                canvas.translate((canvas.getWidth() - this.j) / 2.0f, (getHeight() - staticLayout.getHeight()) / 2.0f);
                s3q0 s3q0Var = s3q0.a;
                staticLayout.draw(canvas);
                canvas.restore();
                return;
            }
            return;
        }
        float f2 = f * 2;
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        canvas.save();
        StaticLayout staticLayout2 = this.g;
        VkText vkText = this.i;
        if (staticLayout2 != null) {
            float a2 = (1.0f - f2) * a(canvas);
            canvas.save();
            canvas.translate((canvas.getWidth() - this.j) / 2.0f, ((getHeight() - staticLayout2.getHeight()) / 2.0f) + a2);
            vkText.getPaint().setAlpha((int) (255 * f2));
            s3q0 s3q0Var2 = s3q0.a;
            staticLayout2.draw(canvas);
            canvas.restore();
        } else {
            StaticLayout staticLayout3 = this.e;
            if (staticLayout3 != null) {
                float a3 = (1.0f - f2) * a(canvas);
                canvas.save();
                canvas.translate((canvas.getWidth() - this.j) / 2.0f, ((getHeight() - staticLayout3.getHeight()) / 2.0f) + a3);
                vkText.getPaint().setAlpha((int) (255 * f2));
                s3q0 s3q0Var3 = s3q0.a;
                staticLayout3.draw(canvas);
                canvas.restore();
            }
        }
        StaticLayout staticLayout4 = this.f;
        if (staticLayout4 != null) {
            float f3 = (-a(canvas)) * f2;
            canvas.save();
            canvas.translate((canvas.getWidth() - this.j) / 2.0f, ((getHeight() - staticLayout4.getHeight()) / 2.0f) + f3);
            vkText.getPaint().setAlpha((int) ((1.0f - f2) * 255));
            s3q0 s3q0Var4 = s3q0.a;
            staticLayout4.draw(canvas);
            canvas.restore();
        }
        StaticLayout staticLayout5 = this.h;
        if (staticLayout5 != null) {
            canvas.save();
            canvas.translate((canvas.getWidth() - this.j) / 2.0f, (getHeight() - staticLayout5.getHeight()) / 2.0f);
            vkText.getPaint().setAlpha(255);
            s3q0 s3q0Var5 = s3q0.a;
            staticLayout5.draw(canvas);
            canvas.restore();
        }
        vkText.getPaint().setAlpha(255);
        canvas.restore();
    }

    public final void d() {
        if (this.p) {
            TextPaint paint = this.i.getPaint();
            getContext();
            paint.setColor(gpo0.d(com.vk.core.view.components.counter.a.c(this.n, this.m), this));
        }
    }

    public final CounterAppearance getAppearance() {
        return this.m;
    }

    @Override // android.view.View
    public int getBaseline() {
        StaticLayout staticLayout = this.e;
        if (staticLayout == null) {
            return -1;
        }
        return ((getMeasuredHeight() - staticLayout.getHeight()) / 2) + staticLayout.getLineBaseline(0);
    }

    @Override // android.view.View
    public CharSequence getContentDescription() {
        return String.valueOf(this.l);
    }

    public final int getCurrentCount() {
        return this.l;
    }

    public final Mode getMode() {
        return this.n;
    }

    public final Size getSize() {
        return this.o;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        c(canvas);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int max;
        int i3;
        Mode mode = this.n;
        int i4 = this.l;
        Mode mode2 = Mode.Tertiary;
        VkText vkText = this.i;
        if (mode == mode2) {
            max = (int) vkText.getPaint().measureText(xpm0.a(i4));
        } else {
            max = Math.max((this.s * 2) + ((int) vkText.getPaint().measureText(xpm0.a(i4))), this.q);
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
        if (this.n == mode2) {
            Paint.FontMetricsInt fontMetricsInt = vkText.getPaint().getFontMetricsInt();
            i3 = fontMetricsInt.descent - fontMetricsInt.ascent;
        } else {
            i3 = this.r;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(i3, 1073741824));
    }

    public final void setAppearance(CounterAppearance counterAppearance) {
        this.m = counterAppearance;
        getContext();
        gpo0.e(com.vk.core.view.components.counter.a.a(this.n, this.m), this);
        d();
        invalidate();
    }

    public final void setCounterWithAnimation(int i) {
        if (i == this.l || epx.f(xpm0.a(i), xpm0.a(this.l))) {
            return;
        }
        ValueAnimator valueAnimator = this.c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.d = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        ofFloat.setDuration(400L);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: xsna.eou0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                VkCounter.CounterAppearance.a aVar = VkCounter.t;
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                VkCounter vkCounter = VkCounter.this;
                vkCounter.d = floatValue;
                vkCounter.invalidate();
            }
        });
        d3m.g(ofFloat, new x2j0(this, 21));
        this.c = ofFloat;
        String a2 = xpm0.a(i);
        String a3 = xpm0.a(this.l);
        StaticLayout staticLayout = this.e;
        VkText vkText = this.i;
        if (staticLayout != null) {
            if (a3.length() == a2.length()) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(a3);
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(a2);
                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(a2);
                int length = a3.length();
                for (int i2 = 0; i2 < length; i2++) {
                    if (a3.charAt(i2) == a2.charAt(i2)) {
                        int i3 = i2 + 1;
                        spannableStringBuilder.setSpan(new php(), i2, i3, 0);
                        spannableStringBuilder2.setSpan(new php(), i2, i3, 0);
                    } else {
                        spannableStringBuilder3.setSpan(new php(), i2, i2 + 1, 0);
                    }
                }
                int measureText = (int) vkText.getPaint().measureText(a3);
                this.f = ylb.a(measureText, vkText.getPaint(), spannableStringBuilder);
                this.h = ylb.a(measureText, vkText.getPaint(), spannableStringBuilder3);
                this.g = ylb.a(measureText, vkText.getPaint(), spannableStringBuilder2);
            } else {
                this.f = this.e;
            }
        }
        this.b = i > this.l;
        ValueAnimator valueAnimator2 = this.c;
        if (valueAnimator2 != null) {
            valueAnimator2.start();
        }
        this.k = this.j;
        int measureText2 = (int) vkText.getPaint().measureText(a2);
        this.j = measureText2;
        this.e = ylb.a(measureText2, vkText.getPaint(), a2);
        this.l = i;
        if (this.j != this.k) {
            requestLayout();
        }
    }

    public final void setCounterWithoutAnimation(int i) {
        this.l = i;
        this.k = this.j;
        String a2 = xpm0.a(i);
        VkText vkText = this.i;
        int measureText = (int) vkText.getPaint().measureText(a2);
        this.j = measureText;
        this.e = ylb.a(measureText, vkText.getPaint(), a2);
        if (this.j != this.k) {
            requestLayout();
        } else {
            invalidate();
        }
    }

    public final void setMode(Mode mode) {
        this.n = mode;
        this.i.setTextAppearance(com.vk.core.view.components.counter.a.e(getContext(), this.n, this.o));
        getContext();
        gpo0.e(com.vk.core.view.components.counter.a.a(this.n, this.m), this);
        d();
        this.s = com.vk.core.view.components.counter.a.d(getContext(), this.n, this.o);
        setOutlineProvider(a.$EnumSwitchMapping$0[this.n.ordinal()] == 1 ? ViewOutlineProvider.BACKGROUND : hav0.a);
        invalidate();
    }

    public final void setSize(Size size) {
        this.o = size;
        this.i.setTextAppearance(com.vk.core.view.components.counter.a.e(getContext(), this.n, this.o));
        this.q = com.vk.core.view.components.counter.a.b(getContext(), this.o);
        this.r = com.vk.core.view.components.counter.a.b(getContext(), this.o);
        this.s = com.vk.core.view.components.counter.a.d(getContext(), this.n, this.o);
        requestLayout();
        invalidate();
    }

    public final void setTextColor$foundation_release(int i) {
        this.i.getPaint().setColor(gpo0.d(i, this));
        setTextColourful(false);
    }

    public final void setTextColourful(boolean z) {
        this.p = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VkCounter(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = 1.0f;
        this.i = new VkText(context, null, 6, 0);
        this.m = CounterAppearance.Appearance.AccentRed;
        this.n = Mode.Primary;
        Size size = Size.Small;
        this.o = size;
        this.p = true;
        this.q = com.vk.core.view.components.counter.a.b(context, size);
        this.r = com.vk.core.view.components.counter.a.b(context, size);
        this.s = com.vk.core.view.components.counter.a.d(context, this.n, this.o);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.l, 0, 0);
        int integer = obtainStyledAttributes.getInteger(1, 2);
        int integer2 = obtainStyledAttributes.getInteger(3, 0);
        int integer3 = obtainStyledAttributes.getInteger(2, 0);
        this.l = obtainStyledAttributes.getInteger(0, 0);
        setAppearance((CounterAppearance) CounterAppearance.Appearance.h().get(integer));
        setMode((Mode) Mode.h().get(integer3));
        setSize((Size) Size.h().get(integer2));
        this.q = com.vk.core.view.components.counter.a.b(context, this.o);
        this.r = com.vk.core.view.components.counter.a.b(context, this.o);
        this.s = com.vk.core.view.components.counter.a.d(context, this.n, this.o);
        setCounterWithoutAnimation(this.l);
        obtainStyledAttributes.recycle();
    }
}
