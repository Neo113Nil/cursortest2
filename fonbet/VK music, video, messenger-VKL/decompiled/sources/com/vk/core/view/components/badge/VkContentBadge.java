package com.vk.core.view.components.badge;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.tool.view.vkblur.VkBlurContentView;
import com.vk.core.tool.view.vkblur.VkBlurView;
import com.vk.core.ui.themes.VKReplacerView;
import com.vk.core.view.components.R$styleable;
import com.vk.core.view.components.badge.a;
import com.vk.core.view.components.text.VkFadeText;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.asp;
import xsna.avj;
import xsna.b8g;
import xsna.cut0;
import xsna.dko;
import xsna.e3m;
import xsna.epx;
import xsna.ey2;
import xsna.f4m;
import xsna.gko;
import xsna.gpo0;
import xsna.hav0;
import xsna.hbh0;
import xsna.his0;
import xsna.krv0;
import xsna.n8g;
import xsna.r890;
import xsna.sex0;
import xsna.too0;
import xsna.vev0;
import xsna.x7g;
import xsna.zrp;

/* compiled from: VkContentBadge.kt */
/* loaded from: classes.dex */
public final class VkContentBadge extends FrameLayout implements too0 {
    public Size b;
    public Mode c;
    public Appearance d;
    public boolean e;
    public boolean f;
    public boolean g;
    public a h;
    public final GradientDrawable i;
    public final VkBlurView j;
    public final View k;
    public final ViewGroup l;
    public final TextView m;
    public final VkFadeText n;
    public final View o;
    public final View p;
    public final View q;
    public final ViewGroup r;
    public final ImageView s;
    public final VKReplacerView t;
    public final VKReplacerView u;
    public final TextView v;
    public final ImageView w;

    /* compiled from: VkContentBadge.kt */
    public interface Appearance {

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: VkContentBadge.kt */
        public static final class Design implements Appearance {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ Design[] $VALUES;
            public static final Design Accent;
            public static final Design Negative;
            public static final Design Neutral;
            public static final Design Overlay;
            public static final Design Positive;

            static {
                Design design = new Design("Accent", 0);
                Accent = design;
                Design design2 = new Design("Positive", 1);
                Positive = design2;
                Design design3 = new Design("Negative", 2);
                Negative = design3;
                Design design4 = new Design("Neutral", 3);
                Neutral = design4;
                Design design5 = new Design("Overlay", 4);
                Overlay = design5;
                Design[] designArr = {design, design2, design3, design4, design5};
                $VALUES = designArr;
                $ENTRIES = new asp(designArr);
            }

            public Design() {
                throw null;
            }

            public static zrp<Design> h() {
                return $ENTRIES;
            }

            public static Design valueOf(String str) {
                return (Design) Enum.valueOf(Design.class, str);
            }

            public static Design[] values() {
                return (Design[]) $VALUES.clone();
            }
        }

        /* compiled from: VkContentBadge.kt */
        public static final class a implements Appearance {
            public final cut0 b;
            public final cut0 c;
            public final cut0 d;

            public a(cut0 cut0Var, cut0 cut0Var2, b8g b8gVar, int i) {
                b8gVar = (i & 4) != 0 ? b8g.d(0) : b8gVar;
                this.b = cut0Var;
                this.c = cut0Var2;
                this.d = b8gVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d);
            }

            public final int hashCode() {
                return Boolean.hashCode(false) + ((this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31)) * 31);
            }

            public final String toString() {
                return "Custom(contentColor=" + this.b + ", backgroundColor=" + this.c + ", borderColor=" + this.d + ", hasBlur=false)";
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VkContentBadge.kt */
    public static final class Mode {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Mode[] $VALUES;
        public static final Mode Outline;
        public static final Mode Primary;
        public static final Mode Secondary;

        static {
            Mode mode = new Mode("Primary", 0);
            Primary = mode;
            Mode mode2 = new Mode("Secondary", 1);
            Secondary = mode2;
            Mode mode3 = new Mode("Outline", 2);
            Outline = mode3;
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
    /* compiled from: VkContentBadge.kt */
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

    /* compiled from: VkContentBadge.kt */
    /* loaded from: classes17.dex */
    public interface a {

        /* compiled from: VkContentBadge.kt */
        /* renamed from: com.vk.core.view.components.badge.VkContentBadge$a$a, reason: collision with other inner class name */
        public static final class C0802a implements a {
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0802a)) {
                    return false;
                }
                ((C0802a) obj).getClass();
                return true;
            }

            public final int hashCode() {
                throw null;
            }

            public final String toString() {
                return "Avatar(content=null, border=null)";
            }
        }

        /* compiled from: VkContentBadge.kt */
        public static final class b implements a {
            public final dko a;

            public b(dko dkoVar) {
                this.a = dkoVar;
            }

            public final dko a() {
                return this.a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && this.a.equals(((b) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode() * 31;
            }

            public final String toString() {
                return "Icon(icon=" + this.a + ", iconTint=null)";
            }
        }

        /* compiled from: VkContentBadge.kt */
        public static final class c implements a {
        }
    }

    public VkContentBadge(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    private final int getBeforeSize() {
        avj avjVar = com.vk.core.view.components.badge.a.a;
        return com.vk.core.view.components.badge.a.b(getContext(), this.b, a());
    }

    public static void h(VkContentBadge vkContentBadge, Integer num) {
        sex0.j(vkContentBadge.w, num);
        boolean z = true;
        vkContentBadge.setTrailingIconColorful(true);
        vkContentBadge.f();
        VkFadeText vkFadeText = vkContentBadge.n;
        TextView textView = vkContentBadge.m;
        if (vkContentBadge.v.getVisibility() != 0 && vkContentBadge.w.getVisibility() != 0) {
            z = false;
        }
        int i = z ? 0 : -2;
        float f = z ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null && (layoutParams2.width != i || layoutParams2.weight != f)) {
            layoutParams2.width = i;
            layoutParams2.weight = f;
            textView.setLayoutParams(layoutParams2);
        }
        ViewGroup.LayoutParams layoutParams3 = vkFadeText.getLayoutParams();
        LinearLayout.LayoutParams layoutParams4 = layoutParams3 instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams3 : null;
        if (layoutParams4 != null) {
            if (layoutParams4.width == i && layoutParams4.weight == f) {
                return;
            }
            layoutParams4.width = i;
            layoutParams4.weight = f;
            vkFadeText.setLayoutParams(layoutParams4);
        }
    }

    @Override // xsna.too0
    public final void Ng() {
        k();
        i();
    }

    public final boolean a() {
        CharSequence text;
        CharSequence text2;
        TextView textView = this.m;
        if (textView.getVisibility() == 0 && (text2 = textView.getText()) != null && text2.length() != 0) {
            return true;
        }
        VkFadeText vkFadeText = this.n;
        return (vkFadeText.getVisibility() != 0 || (text = vkFadeText.getText()) == null || text.length() == 0) ? false : true;
    }

    public final boolean b() {
        return (c() || this.w.getVisibility() == 0 || this.r.getVisibility() != 0 || this.v.getVisibility() == 0) ? false : true;
    }

    public final boolean c() {
        return this.m.getVisibility() == 0 || this.n.getVisibility() == 0;
    }

    public final void d() {
        f4m.E(this.o, c() && this.r.getVisibility() == 0);
    }

    public final void e() {
        f4m.E(this.q, c() && this.v.getVisibility() == 0 && this.b != Size.Small);
    }

    public final void f() {
        f4m.E(this.p, (this.r.getVisibility() == 0 || c() || this.v.getVisibility() == 0) && this.w.getVisibility() == 0);
    }

    public final void g(boolean z, Integer num) {
        setBefore(null);
        if (num != null && num.intValue() != 0) {
            int intValue = num.intValue();
            dko.a.a(intValue);
            setBefore(new a.b(gko.c(intValue)));
        }
        if (!z) {
            gpo0.a(this.s);
        }
        setIconColorful(z);
        d();
        f();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "android.widget.Button";
    }

    public final Appearance getAppearance() {
        return this.d;
    }

    public final a getBefore() {
        return this.h;
    }

    public final boolean getCapsule() {
        return this.e;
    }

    public final boolean getIconColorful() {
        return this.f;
    }

    public final Mode getMode() {
        return this.c;
    }

    public final Size getSize() {
        return this.b;
    }

    public final boolean getTrailingIconColorful() {
        return this.g;
    }

    public final void i() {
        Integer num;
        int b;
        float a2;
        int i;
        int b2;
        int i2;
        avj avjVar = com.vk.core.view.components.badge.a.a;
        Appearance appearance = this.d;
        Mode mode = this.c;
        Context context = getContext();
        int[] iArr = a.C0803a.$EnumSwitchMapping$1;
        int i3 = iArr[mode.ordinal()];
        int i4 = R.attr.vk_ui_icon_secondary;
        int i5 = R.attr.vk_ui_accent_green;
        int i6 = R.attr.vk_ui_accent_red;
        int i7 = R.attr.vk_ui_transparent;
        if (i3 == 2) {
            if (appearance instanceof Appearance.Design) {
                int i8 = a.C0803a.$EnumSwitchMapping$2[((Appearance.Design) appearance).ordinal()];
                if (i8 == 1) {
                    i2 = R.attr.vk_ui_stroke_accent;
                } else if (i8 == 2) {
                    i2 = R.attr.vk_ui_icon_secondary;
                } else if (i8 == 3) {
                    i2 = R.attr.vk_ui_accent_green;
                } else if (i8 == 4) {
                    i2 = R.attr.vk_ui_accent_red;
                } else {
                    if (i8 != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i2 = R.attr.vk_ui_transparent;
                }
                b2 = krv0.m(i2, context);
            } else {
                if (!(appearance instanceof Appearance.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                b2 = ((Appearance.a) appearance).d.b(context);
            }
            num = Integer.valueOf(b2);
        } else {
            num = null;
        }
        Appearance appearance2 = this.d;
        Mode mode2 = this.c;
        Context context2 = getContext();
        if (appearance2 instanceof Appearance.Design) {
            int i9 = a.C0803a.$EnumSwitchMapping$2[((Appearance.Design) appearance2).ordinal()];
            if (i9 == 1) {
                int i10 = iArr[mode2.ordinal()];
                if (i10 == 1) {
                    i7 = R.attr.vk_ui_background_secondary_alpha;
                } else if (i10 != 2) {
                    if (i10 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i7 = R.attr.vk_ui_background_accent;
                }
                i = i7;
            } else if (i9 == 2) {
                int i11 = iArr[mode2.ordinal()];
                if (i11 == 1) {
                    i4 = R.attr.vk_ui_background_secondary_alpha;
                } else if (i11 == 2) {
                    i4 = R.attr.vk_ui_transparent;
                } else if (i11 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                i = i4;
            } else if (i9 == 3) {
                int i12 = iArr[mode2.ordinal()];
                if (i12 == 1) {
                    i5 = R.attr.vk_ui_background_positive_tint;
                } else if (i12 == 2) {
                    i5 = R.attr.vk_ui_transparent;
                } else if (i12 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                i = i5;
            } else if (i9 == 4) {
                int i13 = iArr[mode2.ordinal()];
                if (i13 == 1) {
                    i6 = R.attr.vk_ui_background_negative_tint;
                } else if (i13 == 2) {
                    i6 = R.attr.vk_ui_transparent;
                } else if (i13 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                i = i6;
            } else {
                if (i9 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                int i14 = iArr[mode2.ordinal()];
                if (i14 != 1) {
                    i = R.attr.vk_ui_overlay_primary;
                    if (i14 != 2 && i14 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    i = R.attr.vk_ui_overlay_secondary;
                }
            }
            b = krv0.m(i, context2);
        } else {
            if (!(appearance2 instanceof Appearance.a)) {
                throw new NoWhenBranchMatchedException();
            }
            b = ((Appearance.a) appearance2).c.b(context2);
            if (mode2 == Mode.Secondary) {
                b = n8g.l(b, 40);
            }
        }
        int a3 = (int) (iArr[this.c.ordinal()] == 2 ? hbh0.a(getContext(), 1.0f) : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        GradientDrawable gradientDrawable = this.i;
        gradientDrawable.setColor(b);
        Context context3 = getContext();
        Size size = this.b;
        boolean b3 = b();
        boolean z = this.e;
        int i15 = a.C0803a.$EnumSwitchMapping$0[size.ordinal()];
        if (i15 == 1) {
            a2 = b3 ? hbh0.a(context3, 50.0f) : z ? vev0.c : vev0.e;
        } else if (i15 == 2) {
            a2 = b3 ? hbh0.a(context3, 50.0f) : z ? vev0.c : vev0.f;
        } else {
            if (i15 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            a2 = b3 ? hbh0.a(context3, 50.0f) : z ? vev0.c : vev0.g;
        }
        gradientDrawable.setCornerRadius(a2);
        gradientDrawable.setStroke(a3, num != null ? num.intValue() : 0);
        setBackground(gradientDrawable);
        Mode mode3 = this.c;
        getContext();
        if (mode3 == Mode.Secondary) {
            Appearance.Design design = Appearance.Design.Accent;
        }
        this.j.setVisibility(8);
        this.k.setVisibility(8);
    }

    public final void j() {
        avj avjVar;
        r890 r890Var;
        boolean b = b();
        avj avjVar2 = com.vk.core.view.components.badge.a.a;
        getContext();
        Size size = this.b;
        boolean z = this.e;
        int[] iArr = a.C0803a.$EnumSwitchMapping$0;
        int i = iArr[size.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                if (b) {
                    avjVar = hav0.a;
                } else if (z) {
                    avj avjVar3 = hav0.a;
                    avjVar = com.vk.core.view.components.badge.a.f;
                } else {
                    avjVar = com.vk.core.view.components.badge.a.e;
                }
            } else if (b) {
                avjVar = hav0.a;
            } else if (z) {
                avj avjVar4 = hav0.a;
                avjVar = com.vk.core.view.components.badge.a.d;
            } else {
                avjVar = com.vk.core.view.components.badge.a.c;
            }
        } else if (b) {
            avjVar = hav0.a;
        } else if (z) {
            avj avjVar5 = hav0.a;
            avjVar = com.vk.core.view.components.badge.a.b;
        } else {
            avjVar = com.vk.core.view.components.badge.a.a;
        }
        Context context = getContext();
        Size size2 = this.b;
        boolean z2 = this.w.getVisibility() == 0 || this.r.getVisibility() == 0;
        int i2 = iArr[size2.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                r890Var = b ? new r890((int) vev0.e, 2, (Object) null) : new r890((int) vev0.f, 2, (Object) null);
            } else if (b) {
                r890Var = new r890((int) vev0.e, 2, (Object) null);
            } else if (z2) {
                int i3 = (int) vev0.f;
                int b2 = hbh0.b(3, context);
                r890Var = new r890(i3, b2, i3, b2);
            } else {
                r890Var = new r890((int) vev0.f, 2, (Object) null);
            }
        } else if (b) {
            r890Var = new r890(hbh0.b(3, context), 2, (Object) null);
        } else if (z2) {
            int i4 = (int) vev0.e;
            int b3 = hbh0.b(1, context);
            r890Var = new r890(i4, b3, i4, b3);
        } else {
            r890Var = new r890((int) vev0.e, 2, (Object) null);
        }
        setOutlineProvider(avjVar);
        int i5 = r890Var.b;
        int i6 = r890Var.d;
        ViewGroup viewGroup = this.l;
        int i7 = r890Var.a;
        viewGroup.setPadding(i7, i5, i7, i6);
        i();
        requestLayout();
        invalidate();
    }

    public final void k() {
        avj avjVar = com.vk.core.view.components.badge.a.a;
        int a2 = com.vk.core.view.components.badge.a.a(this.d, this.c, getContext());
        this.m.setTextColor(a2);
        this.n.setTextColor(a2);
        this.v.setTextColor(a2);
        if (this.f) {
            this.s.setColorFilter(a2);
        }
        if (this.g) {
            this.w.setColorFilter(a2);
        }
    }

    public final void l() {
        avj avjVar = com.vk.core.view.components.badge.a.a;
        int b = com.vk.core.view.components.badge.a.b(getContext(), this.b, a());
        VKReplacerView vKReplacerView = this.u;
        ViewGroup.LayoutParams layoutParams = vKReplacerView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = b;
        layoutParams.width = b;
        vKReplacerView.setLayoutParams(layoutParams);
        VKReplacerView vKReplacerView2 = this.t;
        ViewGroup.LayoutParams layoutParams2 = vKReplacerView2.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams2.height = b;
        layoutParams2.width = b;
        vKReplacerView2.setLayoutParams(layoutParams2);
        ImageView imageView = this.s;
        ViewGroup.LayoutParams layoutParams3 = imageView.getLayoutParams();
        if (layoutParams3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams3.height = b;
        layoutParams3.width = b;
        imageView.setLayoutParams(layoutParams3);
    }

    public final void setAppearance(Appearance appearance) {
        this.d = appearance;
        k();
        j();
    }

    public final void setBefore(a aVar) {
        this.h = aVar;
        f4m.E(this.r, aVar != null);
        ImageView imageView = this.s;
        f4m.j(imageView);
        f4m.j(this.u.getView());
        f4m.j(this.t.getView());
        a aVar2 = this.h;
        if (aVar2 != null) {
            if (aVar2 instanceof a.C0802a) {
            } else if (aVar2 instanceof a.b) {
                imageView.setVisibility(0);
                imageView.setImageDrawable(((a.b) aVar2).a().a(imageView.getContext()));
                avj avjVar = com.vk.core.view.components.badge.a.a;
                gpo0.g(imageView, new x7g(com.vk.core.view.components.badge.a.a(this.d, this.c, imageView.getContext())));
            } else {
                if (!(aVar2 instanceof a.c)) {
                    throw new NoWhenBranchMatchedException();
                }
            }
        }
        d();
        f();
    }

    public final void setCapsule(boolean z) {
        this.e = z;
        j();
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        setAlpha(his0.r(z));
    }

    public final void setIconColorful(boolean z) {
        this.f = z;
        k();
        j();
    }

    public final void setIconTint(int i) {
        gpo0.f(this.s, Integer.valueOf(i));
        setIconColorful(true);
    }

    public final void setMode(Mode mode) {
        this.c = mode;
        k();
        j();
    }

    public final void setSize(Size size) {
        int b;
        r890 r890Var;
        float f;
        this.b = size;
        avj avjVar = com.vk.core.view.components.badge.a.a;
        Context context = getContext();
        Size size2 = this.b;
        boolean b2 = b();
        int[] iArr = a.C0803a.$EnumSwitchMapping$0;
        int i = iArr[size2.ordinal()];
        if (i == 1) {
            b = hbh0.b(b2 ? 18 : 16, context);
        } else if (i == 2) {
            b = hbh0.b(b2 ? 24 : 20, context);
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            b = hbh0.b(28, context);
        }
        int b3 = com.vk.core.view.components.badge.a.b(getContext(), this.b, a());
        getContext();
        int i2 = iArr[this.b.ordinal()];
        if (i2 == 1) {
            r890Var = new r890(0, 3, (Object) null);
        } else if (i2 == 2) {
            r890Var = new r890(0, 3, (Object) null);
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            r890Var = new r890((int) vev0.d, 2, (Object) null);
        }
        r890 r890Var2 = iArr[this.b.ordinal()] == 1 ? new r890(0, 3, (Object) null) : new r890((int) vev0.d, 2, (Object) null);
        getContext();
        int i3 = iArr[this.b.ordinal()];
        if (i3 == 1) {
            f = vev0.e;
        } else {
            if (i3 != 2 && i3 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            f = vev0.e;
        }
        int i4 = (int) f;
        this.l.setMinimumHeight(b);
        int c = com.vk.core.view.components.badge.a.c(this.b, getContext());
        TextView textView = this.m;
        textView.setTextAppearance(c);
        int c2 = com.vk.core.view.components.badge.a.c(this.b, getContext());
        VkFadeText vkFadeText = this.n;
        vkFadeText.setTextAppearance(c2);
        int g = e3m.g(R.attr.vk_ui_typography_footnote_bold_unscaled, getContext());
        TextView textView2 = this.v;
        textView2.setTextAppearance(g);
        int i5 = r890Var.a;
        int i6 = r890Var.b;
        int i7 = r890Var.d;
        textView.setPadding(i5, i6, i5, i7);
        vkFadeText.setPadding(i5, i6, r890Var.c, i7);
        textView2.setPadding(r890Var2.a, r890Var2.b, r890Var2.c, r890Var2.d);
        ImageView imageView = this.s;
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = b3;
        layoutParams.width = b3;
        imageView.setLayoutParams(layoutParams);
        VKReplacerView vKReplacerView = this.u;
        View view = vKReplacerView.getView();
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams2.height = b3;
        layoutParams2.width = b3;
        view.setLayoutParams(layoutParams2);
        VKReplacerView vKReplacerView2 = this.t;
        View view2 = vKReplacerView2.getView();
        ViewGroup.LayoutParams layoutParams3 = view2.getLayoutParams();
        if (layoutParams3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams3.height = b3;
        layoutParams3.width = b3;
        view2.setLayoutParams(layoutParams3);
        ImageView imageView2 = this.w;
        ViewGroup.LayoutParams layoutParams4 = imageView2.getLayoutParams();
        if (layoutParams4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams4.height = b3;
        layoutParams4.width = b3;
        imageView2.setLayoutParams(layoutParams4);
        View view3 = this.o;
        ViewGroup.LayoutParams layoutParams5 = view3.getLayoutParams();
        if (layoutParams5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams5.width = i4;
        view3.setLayoutParams(layoutParams5);
        View view4 = this.p;
        ViewGroup.LayoutParams layoutParams6 = view4.getLayoutParams();
        if (layoutParams6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams6.width = i4;
        view4.setLayoutParams(layoutParams6);
        View view5 = this.q;
        ViewGroup.LayoutParams layoutParams7 = view5.getLayoutParams();
        if (layoutParams7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams7.width = i4;
        view5.setLayoutParams(layoutParams7);
        if (this.b == Size.Small) {
            f4m.j(vKReplacerView);
            f4m.j(vKReplacerView2);
            f4m.j(textView2);
        }
        j();
    }

    public final void setText(CharSequence charSequence) {
        ey2.i(this.m, charSequence);
        f4m.j(this.n);
        d();
        f();
        e();
        l();
        j();
    }

    public final void setTrailingIconColorful(boolean z) {
        this.g = z;
        k();
        j();
    }

    public final void setTrailingIconTint(int i) {
        gpo0.f(this.w, Integer.valueOf(i));
        setTrailingIconColorful(false);
    }

    public final void setupBlur(VkBlurContentView vkBlurContentView) {
        avj avjVar = com.vk.core.view.components.badge.a.a;
        Mode mode = this.c;
        getContext();
        if (mode == Mode.Secondary) {
            Appearance.Design design = Appearance.Design.Accent;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public VkContentBadge(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        this.b = Size.Large;
        this.c = Mode.Primary;
        this.d = Appearance.Design.Accent;
        this.f = true;
        this.g = true;
        this.i = new GradientDrawable();
        LayoutInflater.from(context).inflate(R.layout.ds_internal_badge_content, (ViewGroup) this, true);
        this.l = (ViewGroup) findViewById(R.id.content);
        TextView textView = (TextView) findViewById(R.id.badge_title);
        this.m = textView;
        VkFadeText vkFadeText = (VkFadeText) findViewById(R.id.badge_title_fade);
        this.n = vkFadeText;
        textView.setIncludeFontPadding(false);
        vkFadeText.setIncludeFontPadding(false);
        this.o = findViewById(R.id.gap_icon_title);
        this.p = findViewById(R.id.gap_title_trailing_icon);
        this.q = findViewById(R.id.gap_title_subtitle);
        this.r = (ViewGroup) findViewById(R.id.before);
        this.s = (ImageView) findViewById(R.id.left_icon_view);
        this.t = (VKReplacerView) findViewById(R.id.left_avatar_view);
        this.u = (VKReplacerView) findViewById(R.id.left_picture_view);
        this.w = (ImageView) findViewById(R.id.trailing_icon);
        TextView textView2 = (TextView) findViewById(R.id.badge_subtitle);
        this.v = textView2;
        textView2.setIncludeFontPadding(false);
        this.j = (VkBlurView) findViewById(R.id.content_badge_blur_background);
        this.k = findViewById(R.id.content_badge_blur_stroke);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.k, 0, 0);
        String string = obtainStyledAttributes.getString(6);
        int resourceId = obtainStyledAttributes.getResourceId(4, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(7, 0);
        setClipToOutline(true);
        setSize((Size) Size.h().get(obtainStyledAttributes.getInteger(3, 1)));
        setMode((Mode) Mode.h().get(obtainStyledAttributes.getInteger(2, 0)));
        setAppearance((Appearance) Appearance.Design.h().get(obtainStyledAttributes.getInteger(1, 0)));
        setIconColorful(obtainStyledAttributes.getBoolean(5, true));
        setTrailingIconColorful(obtainStyledAttributes.getBoolean(8, true));
        setCapsule(obtainStyledAttributes.getBoolean(0, false));
        setText(string);
        g(true, Integer.valueOf(resourceId));
        h(this, Integer.valueOf(resourceId2));
        d();
        f();
        e();
        setSubtitle(null);
        obtainStyledAttributes.recycle();
    }

    public final void setIconTint(ColorStateList colorStateList) {
        this.s.setImageTintList(colorStateList);
        setIconColorful(false);
    }

    public final void setTrailingIconTint(ColorStateList colorStateList) {
        this.w.setImageTintList(colorStateList);
        setTrailingIconColorful(false);
    }

    public final void setText(int i) {
        TextView textView = this.m;
        textView.setText(i);
        CharSequence text = textView.getText();
        f4m.D(textView, !(text == null || text.length() == 0));
        f4m.j(this.n);
        d();
        f();
        e();
        l();
        j();
    }

    public final void setFade(boolean z) {
    }

    public final void setSubtitle(CharSequence charSequence) {
    }
}
