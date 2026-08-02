package ru.ozon.app.android.fresh.main.ui.atoms.cartPrice;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.flexbox.FlexboxLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.main.databinding.PriceFlexViewBinding;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikit.view.atoms.AtomView;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ$\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\b\u0001\u0010\u0014\u001a\u00020\bJ$\u0010\u0015\u001a\u00020\u000f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00112\b\u0010\u0017\u001a\u0004\u0018\u00010\u00132\b\b\u0001\u0010\u0014\u001a\u00020\bJ\u001a\u0010\u0018\u001a\u00020\u000f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u00132\b\b\u0001\u0010\u0014\u001a\u00020\bJ\u0010\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\bH\u0002J\f\u0010\u001c\u001a\u00020\b*\u00020\u001dH\u0002R\u000e\u0010\u000b\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/fresh/main/ui/atoms/cartPrice/PriceFlexboxView;", "Lcom/google/android/flexbox/FlexboxLayout;", "Lru/ozon/uni/android/uikit/view/atoms/AtomView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "priceMargin", "binding", "Lru/ozon/app/android/fresh/main/databinding/PriceFlexViewBinding;", "setPrice", "", "price", "", "priceColor", "", "defaultColor", "setOriginPrice", "originalPrice", "originalPriceColor", "setOriginPriceLineColor", "color", "updatePriceMargins", "margin", "bottomBaseline", "Landroid/widget/TextView;", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PriceFlexboxView extends FlexboxLayout implements AtomView {

    @NotNull
    private final PriceFlexViewBinding binding;
    private final int priceMargin;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PriceFlexboxView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final int bottomBaseline(TextView textView) {
        return textView.getPaddingBottom() + textView.getPaint().getFontMetricsInt().bottom;
    }

    private final void updatePriceMargins(int margin) {
        ViewGroup.LayoutParams layoutParams = this.binding.priceTv.getLayoutParams();
        Intrinsics.g(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams).setMarginEnd(margin);
        ViewGroup.LayoutParams layoutParams2 = this.binding.originalPriceTv.getLayoutParams();
        Intrinsics.g(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        TextView priceTv = this.binding.priceTv;
        Intrinsics.checkNotNullExpressionValue(priceTv, "priceTv");
        int bottomBaseline = bottomBaseline(priceTv);
        TextView originalPriceTv = this.binding.originalPriceTv;
        Intrinsics.checkNotNullExpressionValue(originalPriceTv, "originalPriceTv");
        ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = bottomBaseline - bottomBaseline(originalPriceTv);
        requestLayout();
    }

    public final void setOriginPrice(CharSequence originalPrice, String originalPriceColor, int defaultColor) {
        if (originalPrice == null) {
            ConstraintLayout originalPriceGroup = this.binding.originalPriceGroup;
            Intrinsics.checkNotNullExpressionValue(originalPriceGroup, "originalPriceGroup");
            ViewExtKt.gone(originalPriceGroup);
            return;
        }
        ConstraintLayout originalPriceGroup2 = this.binding.originalPriceGroup;
        Intrinsics.checkNotNullExpressionValue(originalPriceGroup2, "originalPriceGroup");
        ViewExtKt.show(originalPriceGroup2);
        this.binding.originalPriceTv.setText(originalPrice);
        TextView textView = this.binding.originalPriceTv;
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        textView.setTextColor(styleParser.parseColor(context, originalPriceColor, defaultColor));
    }

    public final void setOriginPriceLineColor(String color, int defaultColor) {
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int parseColor = styleParser.parseColor(context, color, defaultColor);
        View originalPriceStrikeThrough = this.binding.originalPriceStrikeThrough;
        Intrinsics.checkNotNullExpressionValue(originalPriceStrikeThrough, "originalPriceStrikeThrough");
        ViewExtKt.setBackgroundTint(originalPriceStrikeThrough, parseColor);
    }

    public final void setPrice(CharSequence price, String priceColor, int defaultColor) {
        if (price == null) {
            TextView priceTv = this.binding.priceTv;
            Intrinsics.checkNotNullExpressionValue(priceTv, "priceTv");
            ViewExtKt.gone(priceTv);
            updatePriceMargins(0);
            return;
        }
        TextView priceTv2 = this.binding.priceTv;
        Intrinsics.checkNotNullExpressionValue(priceTv2, "priceTv");
        ViewExtKt.show(priceTv2);
        this.binding.priceTv.setText(price);
        TextView textView = this.binding.priceTv;
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        textView.setTextColor(styleParser.parseColor(context, priceColor, defaultColor));
        updatePriceMargins(this.priceMargin);
    }

    public /* synthetic */ PriceFlexboxView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PriceFlexboxView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.priceMargin = ResourceExtKt.toPx(4);
        setAlignItems(2);
        setFlexDirection(0);
        setFlexWrap(1);
        setLayoutParams(new FlexboxLayout.a(-2, -2));
        this.binding = PriceFlexViewBinding.inflate(LayoutInflater.from(context), this);
    }
}
