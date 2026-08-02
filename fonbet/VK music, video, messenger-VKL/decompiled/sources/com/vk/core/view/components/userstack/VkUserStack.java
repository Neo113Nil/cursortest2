package com.vk.core.view.components.userstack;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SizeF;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.components.R$styleable;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.asp;
import xsna.ayv0;
import xsna.e3m;
import xsna.ey2;
import xsna.f4m;
import xsna.gpo0;
import xsna.rl3;
import xsna.tlo0;
import xsna.u11;
import xsna.weu0;
import xsna.zrp;

/* compiled from: VkUserStack.kt */
/* loaded from: classes17.dex */
public final class VkUserStack extends FrameLayout {
    public final boolean b;
    public Size c;
    public tlo0 d;
    public int e;
    public TextUtils.TruncateAt f;
    public AvatarsPosition g;
    public final weu0 h;
    public final TextView i;
    public final LinearLayout j;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VkUserStack.kt */
    public static final class AvatarsPosition {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ AvatarsPosition[] $VALUES;
        public static final AvatarsPosition Left;
        public static final AvatarsPosition Right;
        public static final AvatarsPosition Top;

        static {
            AvatarsPosition avatarsPosition = new AvatarsPosition("Left", 0);
            Left = avatarsPosition;
            AvatarsPosition avatarsPosition2 = new AvatarsPosition("Right", 1);
            Right = avatarsPosition2;
            AvatarsPosition avatarsPosition3 = new AvatarsPosition("Top", 2);
            Top = avatarsPosition3;
            AvatarsPosition[] avatarsPositionArr = {avatarsPosition, avatarsPosition2, avatarsPosition3};
            $VALUES = avatarsPositionArr;
            $ENTRIES = new asp(avatarsPositionArr);
        }

        public AvatarsPosition() {
            throw null;
        }

        public static zrp<AvatarsPosition> h() {
            return $ENTRIES;
        }

        public static AvatarsPosition valueOf(String str) {
            return (AvatarsPosition) Enum.valueOf(AvatarsPosition.class, str);
        }

        public static AvatarsPosition[] values() {
            return (AvatarsPosition[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VkUserStack.kt */
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

    /* compiled from: VkUserStack.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AvatarsPosition.values().length];
            try {
                iArr[AvatarsPosition.Top.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AvatarsPosition.Right.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AvatarsPosition.Left.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public VkUserStack(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public final void a() {
        if (this.b) {
            getContext();
            int i = a.$EnumSwitchMapping$0[this.g.ordinal()];
            TextView textView = this.i;
            LinearLayout linearLayout = this.j;
            if (i == 1) {
                linearLayout.setGravity(17);
                linearLayout.setOrientation(1);
                f4m.u(textView, 0, getContext().getResources().getDimensionPixelSize(R.dimen.vk_ui_spacing_size_m), 0, 0);
                linearLayout.removeView(textView);
                linearLayout.addView(textView);
                return;
            }
            if (i == 2) {
                linearLayout.setGravity(8388627);
                linearLayout.setOrientation(0);
                f4m.u(textView, 0, 0, getContext().getResources().getDimensionPixelSize(R.dimen.vk_ui_spacing_size_m), 0);
                linearLayout.removeView(textView);
                linearLayout.addView(textView, 0);
                return;
            }
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            linearLayout.setGravity(8388627);
            linearLayout.setOrientation(0);
            f4m.u(textView, getContext().getResources().getDimensionPixelSize(R.dimen.vk_ui_spacing_size_m), 0, 0, 0);
            linearLayout.removeView(textView);
            linearLayout.addView(textView);
        }
    }

    public final boolean b() {
        weu0 weu0Var = this.h;
        float avatarSize = weu0Var.getAvatarSize();
        Size size = this.c;
        getContext();
        boolean z = !(avatarSize == b.b(size));
        Size size2 = this.c;
        getContext();
        weu0Var.setAvatarSize(b.b(size2));
        Size size3 = this.c;
        getContext();
        weu0Var.setCutoutDiameter(b.d(size3));
        Size size4 = this.c;
        getContext();
        weu0Var.setAvatarOffset(new SizeF(-b.a(size4), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        Context context = getContext();
        Size size5 = this.c;
        getContext();
        weu0Var.setCounterFont(e3m.g(b.c(size5), context));
        return z;
    }

    public final void c() {
        tlo0 tlo0Var = this.d;
        TextView textView = this.i;
        ey2.h(textView, tlo0Var);
        f4m.E(textView, this.d != null);
        textView.setMaxLines(this.e);
        textView.setEllipsize(this.f);
    }

    public final AvatarsPosition getAvatarsPosition() {
        return this.g;
    }

    public final Integer getCounter() {
        return this.h.getCounter();
    }

    public final int getMaxLines() {
        return this.e;
    }

    public final TextUtils.TruncateAt getOverflow() {
        return this.f;
    }

    public final Size getSize() {
        return this.c;
    }

    public final tlo0 getText() {
        return this.d;
    }

    public final void setAvatars(List<? extends ayv0> list) {
        this.h.setAvatars(list);
    }

    public final void setAvatarsPosition(AvatarsPosition avatarsPosition) {
        AvatarsPosition avatarsPosition2 = this.g;
        this.g = avatarsPosition;
        if (avatarsPosition2 == avatarsPosition) {
            return;
        }
        a();
    }

    public final void setCounter(Integer num) {
        this.h.setCounter(num);
    }

    public final void setMaxLines(int i) {
        this.e = i;
        c();
    }

    public final void setOverflow(TextUtils.TruncateAt truncateAt) {
        this.f = truncateAt;
        c();
    }

    public final void setSize(Size size) {
        this.c = size;
        if (b()) {
            this.h.a();
        }
    }

    public final void setText(tlo0 tlo0Var) {
        this.d = tlo0Var;
        c();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r11v9, types: [java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r9v0, types: [android.view.ViewGroup, com.vk.core.view.components.userstack.VkUserStack] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public VkUserStack(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        Size size = Size.Medium;
        this.c = size;
        this.e = Integer.MAX_VALUE;
        AvatarsPosition avatarsPosition = AvatarsPosition.Left;
        this.g = avatarsPosition;
        weu0 weu0Var = new weu0(context);
        weu0Var.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        this.h = weu0Var;
        TextView textView = new TextView(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2, 1.0f);
        textView.setTextAppearance(e3m.g(R.attr.vk_ui_typography_footnote, context));
        textView.setIncludeFontPadding(false);
        gpo0.i(textView, R.attr.vk_ui_text_secondary);
        textView.setLayoutParams(layoutParams);
        this.i = textView;
        LinearLayout linearLayout = new LinearLayout(context);
        this.j = linearLayout;
        linearLayout.addView(weu0Var);
        addView(linearLayout);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.J);
        ?? r11 = (Enum) rl3.S(obtainStyledAttributes.getInt(3, size.ordinal()), Size.values());
        setSize(r11 != 0 ? r11 : size);
        ?? r112 = (Enum) rl3.S(obtainStyledAttributes.getInt(1, avatarsPosition.ordinal()), AvatarsPosition.values());
        setAvatarsPosition(r112 != 0 ? r112 : avatarsPosition);
        setText(obtainStyledAttributes.hasValue(0) ? u11.f(tlo0.Companion, obtainStyledAttributes.getText(0)) : null);
        setCounter(obtainStyledAttributes.hasValue(2) ? Integer.valueOf(obtainStyledAttributes.getInt(2, 0)) : null);
        obtainStyledAttributes.recycle();
        this.b = true;
        a();
        b();
    }
}
