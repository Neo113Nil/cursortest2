package com.vk.clips.design.view.component.button;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatButton;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.asp;
import xsna.awt0;
import xsna.e3m;
import xsna.epx;
import xsna.ful0;
import xsna.gcd0;
import xsna.iah0;
import xsna.izs;
import xsna.msy;
import xsna.rl3;
import xsna.rlc;
import xsna.s3q0;
import xsna.s4;
import xsna.uqi;
import xsna.vby;
import xsna.vu5;
import xsna.zrp;

/* compiled from: ClipActionButton.kt */
/* loaded from: classes16.dex */
public final class ClipActionButton extends AppCompatButton {
    public static final float j = iah0.a(8);
    public a e;
    public Size f;
    public AnimatorSet g;
    public final RippleDrawable h;
    public final Object i;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ClipActionButton.kt */
    public static final class Size {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Size[] $VALUES;
        public static final Size MEDIUM;
        public static final Size SMALL;

        /* compiled from: ClipActionButton.kt */
        public static final /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Size.values().length];
                try {
                    iArr[Size.SMALL.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Size.MEDIUM.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        static {
            Size size = new Size("SMALL", 0);
            SMALL = size;
            Size size2 = new Size("MEDIUM", 1);
            MEDIUM = size2;
            Size[] sizeArr = {size, size2};
            $VALUES = sizeArr;
            $ENTRIES = new asp(sizeArr);
        }

        public Size() {
            throw null;
        }

        public static Size valueOf(String str) {
            return (Size) Enum.valueOf(Size.class, str);
        }

        public static Size[] values() {
            return (Size[]) $VALUES.clone();
        }

        public final int h() {
            int i = a.$EnumSwitchMapping$0[ordinal()];
            if (i == 1) {
                return iah0.a(30);
            }
            if (i == 2) {
                return iah0.a(36);
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* compiled from: ClipActionButton.kt */
    public static final class a {
        public final InterfaceC0571a a;
        public final InterfaceC0571a b;

        /* compiled from: ClipActionButton.kt */
        /* renamed from: com.vk.clips.design.view.component.button.ClipActionButton$a$a, reason: collision with other inner class name */
        public interface InterfaceC0571a {

            /* compiled from: ClipActionButton.kt */
            /* renamed from: com.vk.clips.design.view.component.button.ClipActionButton$a$a$a, reason: collision with other inner class name */
            public static final class C0572a implements InterfaceC0571a {
                public final int a;
                public final int b;

                public C0572a(int i, int i2) {
                    this.a = i;
                    this.b = i2;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C0572a)) {
                        return false;
                    }
                    C0572a c0572a = (C0572a) obj;
                    return this.a == c0572a.a && this.b == c0572a.b;
                }

                public final int hashCode() {
                    return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("Animated(from=");
                    sb.append(this.a);
                    sb.append(", to=");
                    return vu5.b(sb, this.b, ')');
                }
            }

            /* compiled from: ClipActionButton.kt */
            @vby
            /* renamed from: com.vk.clips.design.view.component.button.ClipActionButton$a$a$b */
            public static final class b implements InterfaceC0571a {
                public final int a;

                public /* synthetic */ b(int i) {
                    this.a = i;
                }

                public final boolean equals(Object obj) {
                    if (obj instanceof b) {
                        return this.a == ((b) obj).a;
                    }
                    return false;
                }

                public final int hashCode() {
                    return Integer.hashCode(this.a);
                }

                public final String toString() {
                    return uqi.a("Static(color=", this.a, ')');
                }
            }
        }

        public a(InterfaceC0571a interfaceC0571a, InterfaceC0571a interfaceC0571a2) {
            this.a = interfaceC0571a;
            this.b = interfaceC0571a2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Appearance(textColor=" + this.a + ", backgroundColor=" + this.b + ')';
        }
    }

    /* compiled from: ClipActionButton.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<Integer, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Integer num) {
            ((ClipActionButton) this.receiver).setBackgroundColor(num.intValue());
            return s3q0.a;
        }
    }

    /* compiled from: ClipActionButton.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements izs<Integer, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Integer num) {
            ((ClipActionButton) this.receiver).setTextColor(num.intValue());
            return s3q0.a;
        }
    }

    public ClipActionButton(Context context) {
        super(context, null, 0);
        Size size = Size.SMALL;
        this.f = size;
        e3m.a aVar = e3m.a;
        ColorStateList valueOf = ColorStateList.valueOf(context.getColor(R.color.vk_black_alpha16));
        GradientDrawable a2 = ful0.a(0);
        float f = j;
        a2.setCornerRadius(f);
        a2.setColor(0);
        s3q0 s3q0Var = s3q0.a;
        RippleDrawable rippleDrawable = new RippleDrawable(valueOf, a2, null);
        this.h = rippleDrawable;
        this.i = msy.a(LazyThreadSafetyMode.NONE, new s4(this, 20));
        gcd0.d(this, 6, f);
        float f2 = 8;
        awt0.x(this, iah0.a(f2), 0, iah0.a(f2), 0, 10);
        setTextAppearance(getContext(), R.style.VkUiTypography_SubheadMedium);
        setMinimumHeight(size.h());
        setBackground(rippleDrawable);
        setGravity(17);
        setEllipsize(TextUtils.TruncateAt.END);
        setSingleLine(true);
        int h = this.f.h();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams = layoutParams == null ? new ViewGroup.LayoutParams(-1, h) : layoutParams;
        layoutParams.height = h;
        setLayoutParams(layoutParams);
        a(this.e);
    }

    public static ValueAnimator b(a.InterfaceC0571a interfaceC0571a, izs izsVar) {
        if (interfaceC0571a instanceof a.InterfaceC0571a.b) {
            izsVar.invoke(Integer.valueOf(((a.InterfaceC0571a.b) interfaceC0571a).a));
            return null;
        }
        if (!(interfaceC0571a instanceof a.InterfaceC0571a.C0572a)) {
            throw new NoWhenBranchMatchedException();
        }
        a.InterfaceC0571a.C0572a c0572a = (a.InterfaceC0571a.C0572a) interfaceC0571a;
        ValueAnimator ofArgb = ValueAnimator.ofArgb(c0572a.a, c0572a.b);
        ofArgb.addUpdateListener(new rlc(izsVar));
        return ofArgb;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final GradientDrawable getRippleContentDrawable() {
        return (GradientDrawable) this.i.getValue();
    }

    private final void setAnimatorSet(AnimatorSet animatorSet) {
        AnimatorSet animatorSet2 = this.g;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        this.g = animatorSet;
    }

    public final void a(a aVar) {
        AnimatorSet animatorSet = null;
        if (aVar == null) {
            setAnimatorSet(null);
            return;
        }
        List I = rl3.I(new ValueAnimator[]{b(aVar.a, new c(1, this, ClipActionButton.class, "setTextColor", "setTextColor(I)V", 0)), b(aVar.b, new b(1, this, ClipActionButton.class, "setBackgroundColor", "setBackgroundColor(I)V", 0))});
        if (!I.isEmpty()) {
            animatorSet = new AnimatorSet();
            animatorSet.setDuration(400L);
            animatorSet.playTogether(I);
            animatorSet.start();
        }
        setAnimatorSet(animatorSet);
    }

    public final a getAppearance() {
        return this.e;
    }

    public final Size getSize() {
        return this.f;
    }

    public final void setAppearance(a aVar) {
        if (epx.f(this.e, aVar)) {
            return;
        }
        this.e = aVar;
        a(aVar);
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        GradientDrawable rippleContentDrawable = getRippleContentDrawable();
        if (rippleContentDrawable == null) {
            return;
        }
        if (drawable instanceof ColorDrawable) {
            rippleContentDrawable.setColor(((ColorDrawable) drawable).getColor());
            return;
        }
        if (!(drawable instanceof GradientDrawable)) {
            super.setBackground(this.h);
            return;
        }
        GradientDrawable gradientDrawable = (GradientDrawable) drawable;
        rippleContentDrawable.setShape(gradientDrawable.getShape());
        rippleContentDrawable.setCornerRadius(gradientDrawable.getCornerRadius());
        ColorStateList color = gradientDrawable.getColor();
        rippleContentDrawable.setColor(color != null ? color.getDefaultColor() : 0);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        GradientDrawable rippleContentDrawable = getRippleContentDrawable();
        if (rippleContentDrawable != null) {
            rippleContentDrawable.setColor(i);
        }
    }

    public final void setSize(Size size) {
        if (this.f != size) {
            this.f = size;
            int h = size.h();
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new ViewGroup.LayoutParams(-1, h);
            }
            layoutParams.height = h;
            setLayoutParams(layoutParams);
        }
    }
}
