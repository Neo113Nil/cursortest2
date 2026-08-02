package com.vk.ecomm.design.view.badge;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.vk.ecomm.design.R$styleable;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.an10;
import xsna.e3m;
import xsna.enj;
import xsna.f4m;
import xsna.iah0;
import xsna.krv0;
import xsna.rw00;

/* compiled from: MarketDiscountBadge.kt */
/* loaded from: classes18.dex */
public final class MarketDiscountBadge extends AppCompatTextView {
    public MarketDiscountBadgeStyle b;

    public MarketDiscountBadge(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    private final void setDiscount(String str) {
        setText(str);
    }

    public final MarketDiscountBadgeStyle getStyle() {
        return this.b;
    }

    public final void setDiscountFromText(String str) {
        String string = getContext().getString(R.string.ecomm_design_product_discount_simple_content_description, str);
        setDiscount(str);
        setContentDescription(string);
    }

    public final void setDiscountFromValue(int i) {
        String string = getContext().getString(R.string.ecomm_design_product_discount_temp, Integer.valueOf(Math.abs(i)));
        String string2 = getContext().getString(R.string.ecomm_design_product_discount_content_description, Integer.valueOf(Math.abs(i)));
        setDiscount(string);
        setContentDescription(string2);
    }

    public final void setStyle(MarketDiscountBadgeStyle marketDiscountBadgeStyle) {
        int i;
        int i2;
        this.b = marketDiscountBadgeStyle;
        Context context = getContext();
        MarketDiscountBadgeStyle marketDiscountBadgeStyle2 = this.b;
        int[] iArr = rw00.$EnumSwitchMapping$0;
        int i3 = iArr[marketDiscountBadgeStyle2.ordinal()];
        if (i3 == 1) {
            i = R.attr.vk_ui_accent_red;
        } else {
            if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = R.attr.vk_ui_background_contrast;
        }
        setBackgroundDrawable(enj.e(R.drawable.ecomm_market_discount_badge_shape, i, context));
        Context context2 = getContext();
        int i4 = iArr[this.b.ordinal()];
        if (i4 == 1) {
            i2 = R.attr.vk_ui_text_contrast;
        } else {
            if (i4 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i2 = R.attr.vk_ui_text_primary_invariably;
        }
        setTextColor(krv0.m(i2, context2));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MarketDiscountBadge(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, 0);
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        MarketDiscountBadgeStyle marketDiscountBadgeStyle = MarketDiscountBadgeStyle.Accent;
        this.b = marketDiscountBadgeStyle;
        setSingleLine();
        setEllipsize(TextUtils.TruncateAt.END);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.b, 0, 0);
        setStyle((MarketDiscountBadgeStyle) MarketDiscountBadgeStyle.h().get(obtainStyledAttributes.getInt(0, marketDiscountBadgeStyle.ordinal())));
        obtainStyledAttributes.recycle();
        int a = e3m.a(R.dimen.vk_ui_spacing_size_s, context);
        f4m.l(a, a, this);
        f4m.v(an10.b(iah0.b(1.5f)), this);
        setTextAppearance(context, R.style.VkUiTypography_Caption1Medium);
    }
}
