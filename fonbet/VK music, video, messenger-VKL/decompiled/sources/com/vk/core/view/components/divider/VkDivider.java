package com.vk.core.view.components.divider;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.components.R$styleable;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.asp;
import xsna.cut0;
import xsna.hbh0;
import xsna.too0;
import xsna.x7g;
import xsna.x9;
import xsna.zrp;

/* compiled from: VkDivider.kt */
/* loaded from: classes.dex */
public class VkDivider extends View implements too0 {
    public Alignment b;
    public float c;
    public final x7g d;
    public final Paint e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VkDivider.kt */
    public static final class Alignment {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Alignment[] $VALUES;
        public static final Alignment Center;
        public static final Alignment Top;

        static {
            Alignment alignment = new Alignment("Top", 0);
            Top = alignment;
            Alignment alignment2 = new Alignment("Center", 1);
            Center = alignment2;
            Alignment[] alignmentArr = {alignment, alignment2};
            $VALUES = alignmentArr;
            $ENTRIES = new asp(alignmentArr);
        }

        public Alignment() {
            throw null;
        }

        public static Alignment valueOf(String str) {
            return (Alignment) Enum.valueOf(Alignment.class, str);
        }

        public static Alignment[] values() {
            return (Alignment[]) $VALUES.clone();
        }
    }

    /* compiled from: VkDivider.kt */
    /* loaded from: classes17.dex */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Alignment.values().length];
            try {
                iArr[Alignment.Top.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Alignment.Center.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public VkDivider(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    @Override // xsna.too0
    public final void Ng() {
        Context context = getContext();
        x7g x7gVar = this.d;
        x7gVar.getClass();
        this.e.setColor(cut0.a.a(x7gVar, context));
    }

    public final Alignment getAlignment() {
        return this.b;
    }

    public final float getDividerHeight() {
        return this.c;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f;
        int i = a.$EnumSwitchMapping$0[this.b.ordinal()];
        if (i == 1) {
            f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            f = (getHeight() / 2.0f) - (this.c / 2.0f);
        }
        float f2 = f;
        canvas.drawRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, getWidth(), f2 + this.c, this.e);
    }

    public final void setAlignment(Alignment alignment) {
        this.b = alignment;
        invalidate();
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable instanceof ColorDrawable) {
            this.e.setColor(((ColorDrawable) drawable).getColor());
            invalidate();
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.e.setColor(i);
        invalidate();
    }

    public final void setDividerHeight(float f) {
        this.c = f;
        invalidate();
    }

    public /* synthetic */ VkDivider(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    public VkDivider(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        this.b = Alignment.Center;
        this.c = hbh0.a(context, 0.5f);
        x7g x7gVar = new x7g(R.attr.vk_ui_separator_primary2x);
        this.d = x7gVar;
        Paint c = x9.c(true);
        c.setColor(cut0.a.a(x7gVar, context));
        this.e = c;
        setImportantForAccessibility(2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.m, 0, 0);
        setDividerHeight(obtainStyledAttributes.getDimension(0, this.c));
        obtainStyledAttributes.recycle();
    }
}
