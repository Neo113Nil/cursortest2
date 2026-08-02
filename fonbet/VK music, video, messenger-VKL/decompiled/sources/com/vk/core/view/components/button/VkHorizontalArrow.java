package com.vk.core.view.components.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.vk.core.view.components.R$styleable;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.asp;
import xsna.bpn0;
import xsna.hbh0;
import xsna.krv0;
import xsna.nl1;
import xsna.oyu0;
import xsna.rl3;
import xsna.shy;
import xsna.vu5;
import xsna.wpj0;
import xsna.zrp;

/* compiled from: VkHorizontalArrow.kt */
/* loaded from: classes17.dex */
public final class VkHorizontalArrow extends FrameLayout {
    public ArrowSize b;
    public ArrowDirection c;
    public boolean d;
    public final FrameLayout e;
    public final FrameLayout f;
    public final ImageView g;
    public final int h;
    public final float i;
    public int j;
    public final bpn0 k;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VkHorizontalArrow.kt */
    public static final class ArrowDirection {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ArrowDirection[] $VALUES;
        public static final a Companion;
        public static final ArrowDirection Left;
        public static final ArrowDirection Right;

        /* compiled from: VkHorizontalArrow.kt */
        public static final class a {
        }

        static {
            ArrowDirection arrowDirection = new ArrowDirection("Left", 0);
            Left = arrowDirection;
            ArrowDirection arrowDirection2 = new ArrowDirection("Right", 1);
            Right = arrowDirection2;
            ArrowDirection[] arrowDirectionArr = {arrowDirection, arrowDirection2};
            $VALUES = arrowDirectionArr;
            $ENTRIES = new asp(arrowDirectionArr);
            Companion = new a();
        }

        public ArrowDirection() {
            throw null;
        }

        public static ArrowDirection valueOf(String str) {
            return (ArrowDirection) Enum.valueOf(ArrowDirection.class, str);
        }

        public static ArrowDirection[] values() {
            return (ArrowDirection[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VkHorizontalArrow.kt */
    public static final class ArrowSize {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ArrowSize[] $VALUES;
        public static final a Companion;
        public static final ArrowSize Medium;
        public static final ArrowSize Small;

        /* compiled from: VkHorizontalArrow.kt */
        public static final class a {
        }

        static {
            ArrowSize arrowSize = new ArrowSize("Small", 0);
            Small = arrowSize;
            ArrowSize arrowSize2 = new ArrowSize("Medium", 1);
            Medium = arrowSize2;
            ArrowSize[] arrowSizeArr = {arrowSize, arrowSize2};
            $VALUES = arrowSizeArr;
            $ENTRIES = new asp(arrowSizeArr);
            Companion = new a();
        }

        public ArrowSize() {
            throw null;
        }

        public static ArrowSize valueOf(String str) {
            return (ArrowSize) Enum.valueOf(ArrowSize.class, str);
        }

        public static ArrowSize[] values() {
            return (ArrowSize[]) $VALUES.clone();
        }
    }

    /* compiled from: VkHorizontalArrow.kt */
    public static final class a {
        public final int a;
        public final int b;
        public final int c;
        public final int d;

        public a(int i, int i2, int i3, int i4) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c && this.d == aVar.d;
        }

        public final int hashCode() {
            return Integer.hashCode(this.d) + shy.a(this.c, shy.a(this.b, Integer.hashCode(this.a) * 31, 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PaddingValues(start=");
            sb.append(this.a);
            sb.append(", top=");
            sb.append(this.b);
            sb.append(", end=");
            sb.append(this.c);
            sb.append(", bottom=");
            return vu5.b(sb, this.d, ')');
        }
    }

    /* compiled from: VkHorizontalArrow.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ArrowSize.values().length];
            try {
                iArr[ArrowSize.Small.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ArrowSize.Medium.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public VkHorizontalArrow(Context context) {
        super(context, null, 0);
        ArrowSize arrowSize = ArrowSize.Small;
        this.b = arrowSize;
        ArrowDirection arrowDirection = ArrowDirection.Right;
        this.c = arrowDirection;
        this.d = true;
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f = frameLayout2;
        ImageView imageView = new ImageView(context);
        this.g = imageView;
        this.h = 44;
        this.i = 0.64f;
        this.k = new bpn0(new nl1(context, 2));
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        frameLayout2.addView(imageView);
        frameLayout.addView(frameLayout2);
        addView(frameLayout);
        setElevation(hbh0.b(3, context));
        setClipToOutline(true);
        setClickable(true);
        setFocusable(true);
        int m = krv0.m(R.attr.vk_ui_background_modal, getContext());
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.getPaint().setColor(m);
        frameLayout2.setBackground(shapeDrawable);
        setOutlineProvider(new oyu0(this));
        setOnTouchListener(new wpj0(this, 1));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, R$styleable.r, 0, 0);
        try {
            ArrowSize.a aVar = ArrowSize.Companion;
            int i = obtainStyledAttributes.getInt(1, arrowSize.ordinal());
            aVar.getClass();
            ArrowSize arrowSize2 = (ArrowSize) rl3.S(i, ArrowSize.values());
            if (arrowSize2 != null) {
                arrowSize = arrowSize2;
            }
            setSize(arrowSize);
            ArrowDirection.a aVar2 = ArrowDirection.Companion;
            int i2 = obtainStyledAttributes.getInt(0, arrowDirection.ordinal());
            aVar2.getClass();
            ArrowDirection arrowDirection2 = (ArrowDirection) rl3.S(i2, ArrowDirection.values());
            if (arrowDirection2 != null) {
                arrowDirection = arrowDirection2;
            }
            setDirection(arrowDirection);
            setEnabledArrow(obtainStyledAttributes.getBoolean(2, true));
            obtainStyledAttributes.recycle();
            imageView.setAlpha(0.64f);
            imageView.setColorFilter(getIconColor());
            d();
            b();
            c();
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public static void a(VkHorizontalArrow vkHorizontalArrow, MotionEvent motionEvent) {
        ImageView imageView = vkHorizontalArrow.g;
        int action = motionEvent.getAction();
        if (action == 0) {
            imageView.setAlpha(1.0f);
            imageView.setColorFilter(vkHorizontalArrow.getIconColor());
        } else if (action == 1 || action == 3) {
            imageView.setAlpha(vkHorizontalArrow.i);
            imageView.setColorFilter(vkHorizontalArrow.getIconColor());
        }
    }

    private final int getIconColor() {
        return ((Number) this.k.getValue()).intValue();
    }

    public final void b() {
        int i;
        int i2 = b.$EnumSwitchMapping$0[this.b.ordinal()];
        if (i2 == 1) {
            i = this.c == ArrowDirection.Left ? R.drawable.vk_icon_chevron_left_16 : R.drawable.vk_icon_chevron_16;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = this.c == ArrowDirection.Left ? R.drawable.vk_icon_chevron_left_small_outline_24 : R.drawable.vk_icon_chevron_right_small_outline_24;
        }
        Drawable drawable = getContext().getDrawable(i);
        ImageView imageView = this.g;
        imageView.setImageDrawable(drawable);
        imageView.setColorFilter(getIconColor());
    }

    public final void c() {
        a aVar;
        int i = b.$EnumSwitchMapping$0[this.b.ordinal()];
        if (i == 1) {
            aVar = this.c == ArrowDirection.Left ? new a(hbh0.b(8, getContext()), hbh0.b(6, getContext()), hbh0.b(8, getContext()), hbh0.b(6, getContext())) : new a(hbh0.b(7, getContext()), hbh0.b(6, getContext()), hbh0.b(5, getContext()), hbh0.b(6, getContext()));
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            aVar = new a(hbh0.b(8, getContext()), hbh0.b(8, getContext()), hbh0.b(8, getContext()), hbh0.b(8, getContext()));
        }
        int i2 = aVar.c;
        int i3 = aVar.d;
        ImageView imageView = this.g;
        imageView.setPadding(aVar.a, aVar.b, i2, i3);
        imageView.requestLayout();
    }

    public final void d() {
        int b2;
        int b3 = hbh0.b(this.h, getContext());
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            layoutParams2.width = b3;
            layoutParams2.height = b3;
        } else {
            layoutParams2 = new FrameLayout.LayoutParams(b3, b3);
        }
        setLayoutParams(layoutParams2);
        this.e.setLayoutParams(new FrameLayout.LayoutParams(b3, b3, 17));
        int i = b.$EnumSwitchMapping$0[this.b.ordinal()];
        if (i == 1) {
            b2 = hbh0.b(28, getContext());
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            b2 = hbh0.b(40, getContext());
        }
        this.j = b2;
        this.f.setLayoutParams(new FrameLayout.LayoutParams(b2, b2, 17));
        invalidateOutline();
        requestLayout();
    }

    public final ArrowDirection getDirection() {
        return this.c;
    }

    public final boolean getEnabledArrow() {
        return this.d;
    }

    public final ArrowSize getSize() {
        return this.b;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        invalidateOutline();
    }

    public final void setDirection(ArrowDirection arrowDirection) {
        this.c = arrowDirection;
        b();
        c();
    }

    public final void setEnabledArrow(boolean z) {
        this.d = z;
        setEnabled(z);
        setAlpha(z ? 1.0f : 0.5f);
    }

    public final void setSize(ArrowSize arrowSize) {
        this.b = arrowSize;
        d();
        b();
        c();
    }
}
