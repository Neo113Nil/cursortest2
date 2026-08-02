package ru.ozon.app.android.utils;

import Hj.C3143a;
import android.graphics.Rect;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0005\u001a\u00020\u0004*\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0011\u0010\t\u001a\u00020\b*\u00020\u0007¢\u0006\u0004\b\t\u0010\n\u001a\u0011\u0010\t\u001a\u00020\b*\u00020\u000b¢\u0006\u0004\b\t\u0010\f\u001a\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u000f\u0010\u0010\"\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Ljava/math/BigDecimal;", "", "toFormattedPrice", "(Ljava/math/BigDecimal;)Ljava/lang/String;", "", "formatWithCurrency", "(Ljava/math/BigDecimal;)Ljava/lang/CharSequence;", "Landroid/widget/TextView;", "", "fixPriceGravity", "(Landroid/widget/TextView;)V", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)V", "price", "Landroid/text/SpannableStringBuilder;", "format", "(Ljava/math/BigDecimal;)Landroid/text/SpannableStringBuilder;", "Ljava/text/DecimalFormat;", "currencyFormat", "Ljava/text/DecimalFormat;", "utils_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PriceUtilsKt {

    @NotNull
    private static final DecimalFormat currencyFormat;

    static {
        DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");
        decimalFormat.setParseBigDecimal(true);
        currencyFormat = decimalFormat;
    }

    public static final void fixPriceGravity(@NotNull final TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        textView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: ru.ozon.app.android.utils.PriceUtilsKt$fixPriceGravity$listener$1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                if (textView.getMeasuredWidth() <= 0 || textView.getMeasuredHeight() <= 0) {
                    return;
                }
                textView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                Rect rect = new Rect();
                textView.getPaint().getTextBounds(textView.getText().toString(), 0, textView.getText().length(), rect);
                textView.setGravity(rect.width() > textView.getWidth() ? 8388611 : 1);
            }
        });
    }

    private static final SpannableStringBuilder format(BigDecimal bigDecimal) {
        String format = currencyFormat.format(bigDecimal);
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        String g10 = C3143a.g("\\s", new Regex("[.,]0+$").replace(format, ""), " ");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(g10);
        int J11 = h.J(g10, ",", 0, false, 6);
        if (J11 != -1) {
            int length = (spannableStringBuilder.length() - J11) - 1;
            int i11 = J11 + 1;
            spannableStringBuilder.setSpan(new StyleSpan(0), i11, length + i11, 0);
        }
        SpannableStringBuilder append = spannableStringBuilder.append((char) 8239);
        Intrinsics.checkNotNullExpressionValue(append, "append(...)");
        return append;
    }

    @NotNull
    public static final CharSequence formatWithCurrency(@NotNull BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(bigDecimal, "<this>");
        return format(bigDecimal);
    }

    @NotNull
    public static final String toFormattedPrice(@NotNull BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(bigDecimal, "<this>");
        String format = currencyFormat.format(bigDecimal);
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return new Regex("[.,]0+$").replace(format, "");
    }

    public static final void fixPriceGravity(@NotNull ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "<this>");
        int childCount = viewGroup.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = viewGroup.getChildAt(i11);
            if (childAt instanceof TextView) {
                fixPriceGravity((TextView) childAt);
            }
        }
    }
}
