package com.vk.core.view.components.userstack;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SizeF;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.components.R$styleable;
import com.vk.core.view.components.userstack.a;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.asp;
import xsna.ayv0;
import xsna.rl3;
import xsna.weu0;
import xsna.zrp;

/* compiled from: VkDiagonalUserStack.kt */
/* loaded from: classes17.dex */
public final class VkDiagonalUserStack extends FrameLayout {
    public Size b;
    public final weu0 c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VkDiagonalUserStack.kt */
    public static final class Size {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Size[] $VALUES;
        public static final Size ExtraLarge;
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
            Size size4 = new Size("ExtraLarge", 3);
            ExtraLarge = size4;
            Size[] sizeArr = {size, size2, size3, size4};
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

    public VkDiagonalUserStack(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public final boolean a() {
        float f;
        weu0 weu0Var = this.c;
        float avatarSize = weu0Var.getAvatarSize();
        Size size = this.b;
        getContext();
        boolean z = !(avatarSize == a.b(size));
        Size size2 = this.b;
        getContext();
        weu0Var.setAvatarSize(a.b(size2));
        Size size3 = this.b;
        getContext();
        int i = a.C0887a.$EnumSwitchMapping$0[size3.ordinal()];
        if (i == 1) {
            f = 19.0f;
        } else if (i == 2) {
            f = 23.0f;
        } else if (i == 3) {
            f = 27.0f;
        } else {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            f = 35.0f;
        }
        weu0Var.setCutoutDiameter(f);
        Size size4 = this.b;
        getContext();
        float f2 = -a.a(size4);
        Size size5 = this.b;
        getContext();
        weu0Var.setAvatarOffset(new SizeF(f2, a.a(size5)));
        weu0Var.setReverseCutoutDirection(false);
        return z;
    }

    public final Size getSize() {
        return this.b;
    }

    public final void setAvatars(List<? extends ayv0> list) {
        this.c.setAvatars(list);
    }

    public final void setSize(Size size) {
        this.b = size;
        if (a()) {
            this.c.a();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.view.ViewGroup, com.vk.core.view.components.userstack.VkDiagonalUserStack] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Enum] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public VkDiagonalUserStack(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        Size size = Size.Medium;
        this.b = size;
        weu0 weu0Var = new weu0(context);
        weu0Var.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        this.c = weu0Var;
        addView(weu0Var);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.t);
        ?? r7 = (Enum) rl3.S(obtainStyledAttributes.getInt(0, size.ordinal()), Size.values());
        setSize(r7 != 0 ? r7 : size);
        obtainStyledAttributes.recycle();
        a();
    }
}
