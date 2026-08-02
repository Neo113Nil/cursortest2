package ru.ozon.app.android.travel.feature.general.common.widgets.pricesHistogram.v1.presentation.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.common.R$id;
import ru.ozon.app.android.travel.feature.general.common.widgets.pricesHistogram.v1.presentation.PricesHistogramVO;
import ru.ozon.app.android.travel.feature.general.common.widgets.pricesHistogram.v1.view.PricesHistogramItemView;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0012\u001a\n \u0011*\u0004\u0018\u00010\u00100\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v1/presentation/adapter/PriceHistogramDaysViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$C;", "", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v1/presentation/PricesHistogramVO$MonthVO$DayVO;", "item", "Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v1/presentation/PricesHistogramVO$AvailableColorsVO;", "colors", "", "haveDirectionTo", "", "bind", "(Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v1/presentation/PricesHistogramVO$MonthVO$DayVO;Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v1/presentation/PricesHistogramVO$AvailableColorsVO;Z)V", "Landroid/content/Context;", "kotlin.jvm.PlatformType", "context", "Landroid/content/Context;", "", "maxHeightFrom", "I", "maxHeightFromTo", "viewWidth", "minViewHeight", "Landroid/widget/LinearLayout;", "itemPricesHistogramLL", "Landroid/widget/LinearLayout;", "Landroid/widget/ImageView;", "arrowLowestPriceIV", "Landroid/widget/ImageView;", "Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v1/view/PricesHistogramItemView;", "itemPricesHistogramPIV", "Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v1/view/PricesHistogramItemView;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PriceHistogramDaysViewHolder extends RecyclerView.C {

    @NotNull
    private final ImageView arrowLowestPriceIV;
    private final Context context;

    @NotNull
    private final LinearLayout itemPricesHistogramLL;

    @NotNull
    private final PricesHistogramItemView itemPricesHistogramPIV;
    private final int maxHeightFrom;
    private final int maxHeightFromTo;
    private final int minViewHeight;
    private final int viewWidth;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PriceHistogramDaysViewHolder(@NotNull View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        Context context = itemView.getContext();
        this.context = context;
        Intrinsics.checkNotNullExpressionValue(context, "context");
        this.maxHeightFrom = ResourceExtKt.toPx(UserVerificationMethods.USER_VERIFY_PATTERN, context);
        Intrinsics.checkNotNullExpressionValue(context, "context");
        this.maxHeightFromTo = ResourceExtKt.toPx(64, context);
        Intrinsics.checkNotNullExpressionValue(context, "context");
        this.viewWidth = ResourceExtKt.toPx(24, context);
        Intrinsics.checkNotNullExpressionValue(context, "context");
        this.minViewHeight = ResourceExtKt.toPx(16, context);
        View findViewById = itemView.findViewById(R$id.itemPricesHistogramLL);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.itemPricesHistogramLL = (LinearLayout) findViewById;
        View findViewById2 = itemView.findViewById(R$id.arrowLowestPriceIV);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.arrowLowestPriceIV = (ImageView) findViewById2;
        View findViewById3 = itemView.findViewById(R$id.itemPricesHistogramPIV);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.itemPricesHistogramPIV = (PricesHistogramItemView) findViewById3;
    }

    public final void bind(@NotNull PricesHistogramVO.MonthVO.DayVO item, @NotNull PricesHistogramVO.AvailableColorsVO colors, boolean haveDirectionTo) {
        int i11;
        int textDefault;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(colors, "colors");
        int i12 = haveDirectionTo ? this.maxHeightFromTo : this.maxHeightFrom;
        int dayHeight = (int) ((i12 / 100.0f) * item.getDayHeight());
        if (dayHeight < this.minViewHeight && item.getDayHeight() != 0 && item.getPrice() != 0) {
            dayHeight = this.minViewHeight;
        }
        LinearLayout linearLayout = this.itemPricesHistogramLL;
        ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = i12;
        linearLayout.setLayoutParams(layoutParams);
        if (!item.getIsSelected() || item.getDayHeight() == 0) {
            i11 = colors.getDefault();
            textDefault = colors.getTextDefault();
        } else {
            i11 = colors.getSelected();
            textDefault = colors.getTextSelected();
        }
        if (item.getDayHeight() == 0) {
            PricesHistogramItemView pricesHistogramItemView = this.itemPricesHistogramPIV;
            ViewGroup.LayoutParams layoutParams2 = pricesHistogramItemView.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams2.height = this.minViewHeight;
            layoutParams2.width = this.viewWidth;
            Context context = pricesHistogramItemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            pricesHistogramItemView.setBgColor(ThemeExtKt.themeColor(context, R$attr.layerFloor1));
            pricesHistogramItemView.setLayoutParams(layoutParams2);
            pricesHistogramItemView.setTextColor(textDefault);
            pricesHistogramItemView.setText(item.getNumber());
        } else {
            PricesHistogramItemView pricesHistogramItemView2 = this.itemPricesHistogramPIV;
            ViewGroup.LayoutParams layoutParams3 = pricesHistogramItemView2.getLayoutParams();
            if (layoutParams3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams3.height = dayHeight;
            layoutParams3.width = this.viewWidth;
            pricesHistogramItemView2.setBgColor(i11);
            pricesHistogramItemView2.setLayoutParams(layoutParams3);
            pricesHistogramItemView2.setTextColor(textDefault);
            pricesHistogramItemView2.setText(item.getNumber());
        }
        ImageView imageView = this.arrowLowestPriceIV;
        imageView.setVisibility(item.getIsLowest() ? 0 : 8);
        ThemeExtKt.tint(imageView, Integer.valueOf(colors.getLowestPrice()));
    }
}
