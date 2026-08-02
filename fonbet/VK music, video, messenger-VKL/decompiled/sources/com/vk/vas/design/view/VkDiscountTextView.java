package com.vk.vas.design.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.GradientDrawable;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.ReplacementSpan;
import android.text.style.StrikethroughSpan;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.vk.vas.design.R$styleable;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.asp;
import xsna.krv0;
import xsna.pup0;
import xsna.zrp;

/* compiled from: VkDiscountTextView.kt */
/* loaded from: classes6.dex */
public final class VkDiscountTextView extends AppCompatTextView {
    public int b;
    public ButtonStyle c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VkDiscountTextView.kt */
    public static final class ButtonStyle {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ButtonStyle[] $VALUES;
        public static final ButtonStyle COMMERCE;
        public static final ButtonStyle MUTED;
        public static final ButtonStyle PRIMARY;

        static {
            ButtonStyle buttonStyle = new ButtonStyle("COMMERCE", 0);
            COMMERCE = buttonStyle;
            ButtonStyle buttonStyle2 = new ButtonStyle("PRIMARY", 1);
            PRIMARY = buttonStyle2;
            ButtonStyle buttonStyle3 = new ButtonStyle("MUTED", 2);
            MUTED = buttonStyle3;
            ButtonStyle[] buttonStyleArr = {buttonStyle, buttonStyle2, buttonStyle3};
            $VALUES = buttonStyleArr;
            $ENTRIES = new asp(buttonStyleArr);
        }

        public ButtonStyle() {
            throw null;
        }

        public static zrp<ButtonStyle> h() {
            return $ENTRIES;
        }

        public static ButtonStyle valueOf(String str) {
            return (ButtonStyle) Enum.valueOf(ButtonStyle.class, str);
        }

        public static ButtonStyle[] values() {
            return (ButtonStyle[]) $VALUES.clone();
        }
    }

    /* compiled from: VkDiscountTextView.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ButtonStyle.values().length];
            try {
                iArr[ButtonStyle.COMMERCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ButtonStyle.PRIMARY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ButtonStyle.MUTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VkDiscountTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.c = ButtonStyle.COMMERCE;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.b, 0, 0);
        boolean z = obtainStyledAttributes.getBoolean(0, true);
        int color = context.getColor(R.color.vk_white_alpha60);
        if (z) {
            float f = getContext().getResources().getDisplayMetrics().density;
            setTextAppearance(getContext(), R.style.VkUiTypography_SubheadMedium);
            setSingleLine(true);
            setEllipsize(TextUtils.TruncateAt.END);
            setGravity(17);
            setIncludeFontPadding(false);
            int i = (int) (6.5f * f);
            int i2 = (int) (7.5f * f);
            int i3 = (int) (f * 16.0f);
            setPadding(i3, i, i3, i2);
        }
        this.b = obtainStyledAttributes.getColor(2, color);
        setButtonStyle((ButtonStyle) ButtonStyle.h().get(obtainStyledAttributes.getInt(1, 0)));
        obtainStyledAttributes.recycle();
        b();
    }

    public final void b() {
        float f = getContext().getResources().getDisplayMetrics().density * 8.0f;
        int i = a.$EnumSwitchMapping$0[this.c.ordinal()];
        if (i == 1) {
            int m = krv0.m(R.attr.vk_ui_background_positive, getContext());
            setTextColor(krv0.m(R.attr.vk_ui_text_contrast, getContext()));
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(f);
            gradientDrawable.setColor(m);
            setBackground(gradientDrawable);
            return;
        }
        if (i == 2) {
            int m2 = krv0.m(R.attr.vk_ui_background_accent_themed, getContext());
            setTextColor(krv0.m(R.attr.vk_ui_text_contrast_themed, getContext()));
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setCornerRadius(f);
            gradientDrawable2.setColor(m2);
            setBackground(gradientDrawable2);
            return;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        int m3 = krv0.m(R.attr.vk_ui_background_secondary, getContext());
        setTextColor(krv0.m(R.attr.vk_ui_text_link, getContext()));
        GradientDrawable gradientDrawable3 = new GradientDrawable();
        gradientDrawable3.setCornerRadius(f);
        gradientDrawable3.setColor(m3);
        setBackground(gradientDrawable3);
    }

    public final void e(String str, String str2) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        CharSequence charSequence = str;
        if (str2.length() > 0) {
            spannableStringBuilder.clear();
            SpannableStringBuilder append = spannableStringBuilder.append(str2, new StrikethroughSpan(), 33);
            append.setSpan(new ForegroundColorSpan(this.b), 0, append.length(), 33);
            int i = (int) (7.0f * getContext().getResources().getDisplayMetrics().density);
            Spannable newSpannable = Spannable.Factory.getInstance().newSpannable(" ");
            newSpannable.setSpan(new b(i), 0, 1, 0);
            charSequence = append.append((CharSequence) newSpannable).append(str, new pup0(getTypeface()), 33);
        }
        setText(charSequence);
    }

    public final ButtonStyle getButtonStyle() {
        return this.c;
    }

    public final void setButtonStyle(ButtonStyle buttonStyle) {
        this.c = buttonStyle;
        b();
    }

    public final void setDiscountTextColor(int i) {
        this.b = i;
    }

    /* compiled from: VkDiscountTextView.kt */
    public static final class b extends ReplacementSpan {
        public final int b;

        public b(int i) {
            this.b = i;
        }

        @Override // android.text.style.ReplacementSpan
        public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
            return this.b;
        }

        @Override // android.text.style.ReplacementSpan
        public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        }
    }
}
