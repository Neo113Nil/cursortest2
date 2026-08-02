package com.vk.core.view.components.button.tool;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.vk.core.view.components.R$styleable;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.asp;
import xsna.e3m;
import xsna.f4m;
import xsna.gpo0;
import xsna.hav0;
import xsna.hbh0;
import xsna.ro;
import xsna.sex0;
import xsna.too0;
import xsna.u2p0;
import xsna.vev0;
import xsna.zrp;

/* compiled from: VkToolButton.kt */
/* loaded from: classes17.dex */
public final class VkToolButton extends FrameLayout implements too0 {
    public static final com.vk.core.view.components.button.tool.a t = new com.vk.core.view.components.button.tool.a();
    public TextPosition b;
    public Mode c;
    public Appearance d;
    public com.vk.core.view.components.button.tool.a e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public Integer j;
    public final GradientDrawable k;
    public final RippleDrawable l;
    public final ViewGroup m;
    public final LinearLayout n;
    public final TextView o;
    public final TextView p;
    public final ImageView q;
    public View r;
    public CharSequence s;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VkToolButton.kt */
    public static final class Appearance {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Appearance[] $VALUES;
        public static final Appearance Accent;
        public static final Appearance Neutral;
        public static final Appearance Overlay;

        static {
            Appearance appearance = new Appearance("Accent", 0);
            Accent = appearance;
            Appearance appearance2 = new Appearance("Neutral", 1);
            Neutral = appearance2;
            Appearance appearance3 = new Appearance("Overlay", 2);
            Overlay = appearance3;
            Appearance[] appearanceArr = {appearance, appearance2, appearance3};
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
    /* compiled from: VkToolButton.kt */
    public static final class Mode {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Mode[] $VALUES;
        public static final Mode Outline;
        public static final Mode Primary;
        public static final Mode Secondary;
        public static final Mode Tertiary;

        static {
            Mode mode = new Mode("Primary", 0);
            Primary = mode;
            Mode mode2 = new Mode("Secondary", 1);
            Secondary = mode2;
            Mode mode3 = new Mode("Tertiary", 2);
            Tertiary = mode3;
            Mode mode4 = new Mode("Outline", 3);
            Outline = mode4;
            Mode[] modeArr = {mode, mode2, mode3, mode4};
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
    /* compiled from: VkToolButton.kt */
    public static final class TextPosition {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TextPosition[] $VALUES;
        public static final TextPosition Bottom;
        public static final TextPosition None;
        public static final TextPosition Right;

        static {
            TextPosition textPosition = new TextPosition("None", 0);
            None = textPosition;
            TextPosition textPosition2 = new TextPosition("Right", 1);
            Right = textPosition2;
            TextPosition textPosition3 = new TextPosition("Bottom", 2);
            Bottom = textPosition3;
            TextPosition[] textPositionArr = {textPosition, textPosition2, textPosition3};
            $VALUES = textPositionArr;
            $ENTRIES = new asp(textPositionArr);
        }

        public TextPosition() {
            throw null;
        }

        public static zrp<TextPosition> h() {
            return $ENTRIES;
        }

        public static TextPosition valueOf(String str) {
            return (TextPosition) Enum.valueOf(TextPosition.class, str);
        }

        public static TextPosition[] values() {
            return (TextPosition[]) $VALUES.clone();
        }
    }

    /* compiled from: VkToolButton.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TextPosition.values().length];
            try {
                iArr[TextPosition.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TextPosition.Right.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TextPosition.Bottom.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public VkToolButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public static void b(VkToolButton vkToolButton, Drawable drawable) {
        ImageView imageView = vkToolButton.q;
        imageView.setImageDrawable(drawable);
        imageView.setVisibility(0);
        vkToolButton.setIconColorful(true);
        vkToolButton.m.removeView(vkToolButton.r);
        vkToolButton.r = null;
        vkToolButton.n.setVisibility(0);
    }

    public static void c(VkToolButton vkToolButton, Integer num) {
        sex0.j(vkToolButton.q, num);
        vkToolButton.setIconColorful(true);
        vkToolButton.m.removeView(vkToolButton.r);
        vkToolButton.r = null;
        vkToolButton.n.setVisibility(0);
    }

    @Override // xsna.too0
    public final void Ng() {
        a();
    }

    public final void a() {
        ColorStateList color;
        com.vk.core.view.components.button.tool.a aVar = this.e;
        getContext();
        u2p0 b = aVar.b(this.c, this.d);
        int i = b.b;
        if (this.h) {
            gpo0.i(this.o, i);
            gpo0.i(this.p, i);
        }
        if (this.f) {
            gpo0.f(this.q, Integer.valueOf(b.c));
        }
        com.vk.core.view.components.button.tool.a aVar2 = this.e;
        getContext();
        Integer a2 = aVar2.a(this.c, this.d);
        int d = gpo0.d(b.a, this);
        com.vk.core.view.components.button.tool.a aVar3 = this.e;
        getContext();
        Integer c = aVar3.c(this.c, this.d);
        boolean z = this.g;
        GradientDrawable gradientDrawable = this.k;
        if (z) {
            gradientDrawable.setColor(d);
        }
        gradientDrawable.setCornerRadius(hbh0.a(getContext(), 12.0f));
        gradientDrawable.setStroke(hbh0.b(1, getContext()), a2 != null ? gpo0.d(a2.intValue(), this) : 0);
        if (!this.g && (color = gradientDrawable.getColor()) != null) {
            d = color.getDefaultColor();
        }
        ColorStateList c2 = ro.c(d, c);
        RippleDrawable rippleDrawable = this.l;
        rippleDrawable.setColor(c2);
        setBackground(rippleDrawable);
        e();
    }

    public final void d() {
        int i = a.$EnumSwitchMapping$0[this.b.ordinal()];
        TextView textView = this.o;
        TextView textView2 = this.p;
        if (i == 1) {
            textView2.setText((CharSequence) null);
            textView.setText((CharSequence) null);
        } else if (i == 2) {
            getContext();
            textView2.setText((CharSequence) null);
            textView.setText(this.s);
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            textView2.setText(this.s);
            textView.setText((CharSequence) null);
        }
    }

    public final void e() {
        com.vk.core.view.components.button.tool.a aVar = this.e;
        Context context = getContext();
        aVar.getClass();
        int g = e3m.g(R.attr.vk_ui_typography_subhead, context);
        this.o.setTextAppearance(g);
        this.p.setTextAppearance(g);
    }

    public final void f() {
        CharSequence text;
        CharSequence text2;
        getContext();
        TextPosition textPosition = this.b;
        TextPosition textPosition2 = TextPosition.Right;
        boolean z = false;
        TextView textView = this.o;
        f4m.E(textView, (textPosition != textPosition2 || (text2 = textView.getText()) == null || text2.length() == 0) ? false : true);
        TextPosition textPosition3 = this.b;
        TextPosition textPosition4 = TextPosition.Bottom;
        TextView textView2 = this.p;
        if (textPosition3 == textPosition4 && (text = textView2.getText()) != null && text.length() != 0) {
            z = true;
        }
        f4m.E(textView2, z);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "android.widget.Button";
    }

    public final Appearance getAppearance() {
        return this.d;
    }

    public final boolean getBackgroundColorful() {
        return this.g;
    }

    public final boolean getIconColorful() {
        return this.f;
    }

    public final Mode getMode() {
        return this.c;
    }

    public final com.vk.core.view.components.button.tool.a getStyle() {
        return this.e;
    }

    public final boolean getTextColorful() {
        return this.h;
    }

    public final TextPosition getTextPosition() {
        return this.b;
    }

    public final boolean getUseUnscaledFont() {
        return this.i;
    }

    public final void setAppearance(Appearance appearance) {
        this.d = appearance;
        a();
        invalidate();
    }

    public final void setBackgroundColorful(boolean z) {
        this.g = z;
        a();
        invalidate();
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        setAlpha(z ? 1.0f : 0.64f);
    }

    public final void setFirstSlotCustomContent(View view) {
        View view2 = this.r;
        ViewGroup viewGroup = this.m;
        viewGroup.removeView(view2);
        this.r = view;
        this.n.setVisibility(8);
        viewGroup.addView(view, 0);
    }

    public final void setIconColorful(boolean z) {
        this.f = z;
        a();
        invalidate();
    }

    public final void setIconSize(Integer num) {
        this.j = num;
        int intValue = num != null ? num.intValue() : hbh0.b(28, getContext());
        ImageView imageView = this.q;
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = intValue;
        layoutParams.width = intValue;
        imageView.setLayoutParams(layoutParams);
    }

    public final void setMode(Mode mode) {
        this.c = mode;
        a();
        invalidate();
    }

    public final void setStyle(com.vk.core.view.components.button.tool.a aVar) {
        this.e = aVar;
        a();
        invalidate();
    }

    public final void setText(CharSequence charSequence) {
        this.s = charSequence;
        d();
        f();
    }

    public final void setTextColorful(boolean z) {
        this.h = z;
        a();
        invalidate();
    }

    public final void setTextPosition(TextPosition textPosition) {
        float f;
        this.b = textPosition;
        d();
        f();
        com.vk.core.view.components.button.tool.a aVar = this.e;
        getContext();
        TextPosition textPosition2 = this.b;
        aVar.getClass();
        int i = b.$EnumSwitchMapping$2[textPosition2.ordinal()];
        if (i == 1) {
            f = vev0.i;
        } else if (i == 2) {
            f = vev0.g;
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            f = vev0.g;
        }
        f4m.w((int) f, this.m);
        invalidate();
    }

    public final void setUseUnscaledFont(boolean z) {
        if (this.i != z) {
            this.i = z;
            e();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public VkToolButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        this.b = TextPosition.Bottom;
        this.c = Mode.Primary;
        this.d = Appearance.Accent;
        this.e = t;
        this.f = true;
        this.g = true;
        this.h = true;
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.k = gradientDrawable;
        this.l = new RippleDrawable(ColorStateList.valueOf(0), gradientDrawable, new ColorDrawable(-1));
        LayoutInflater.from(context).inflate(R.layout.ds_internal_tool_button_content, (ViewGroup) this, true);
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.content);
        this.m = viewGroup;
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.horizontal_content);
        this.n = linearLayout;
        this.o = (TextView) findViewById(R.id.title_end);
        this.p = (TextView) findViewById(R.id.title_bottom);
        ImageView imageView = (ImageView) findViewById(R.id.icon);
        this.q = imageView;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.I, 0, 0);
        String string = obtainStyledAttributes.getString(5);
        string = string == null ? obtainStyledAttributes.getString(0) : string;
        int resourceId = obtainStyledAttributes.getResourceId(2, 0);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(4, -1);
        this.j = dimensionPixelSize == -1 ? null : Integer.valueOf(dimensionPixelSize);
        setUseUnscaledFont(obtainStyledAttributes.getBoolean(10, false));
        setClipToOutline(true);
        setOutlineProvider(hav0.b);
        setMode((Mode) Mode.h().get(obtainStyledAttributes.getInteger(8, 0)));
        setTextPosition((TextPosition) TextPosition.h().get(obtainStyledAttributes.getInteger(9, 0)));
        setAppearance((Appearance) Appearance.h().get(obtainStyledAttributes.getInteger(7, 0)));
        setIconColorful(obtainStyledAttributes.getBoolean(3, true));
        setBackgroundColorful(obtainStyledAttributes.getBoolean(1, true));
        setTextColorful(obtainStyledAttributes.getBoolean(6, true));
        setText(string);
        Integer valueOf = Integer.valueOf(resourceId);
        boolean z = this.f;
        if (!z) {
            gpo0.a(imageView);
        }
        sex0.j(imageView, valueOf);
        setIconColorful(z);
        viewGroup.removeView(this.r);
        this.r = null;
        linearLayout.setVisibility(0);
        setIconSize(this.j);
        obtainStyledAttributes.recycle();
        e();
    }

    public final void setText(int i) {
        setText(getContext().getString(i));
    }
}
