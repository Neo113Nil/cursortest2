package ru.ozon.app.android.travel.feature.general.common.widgets.pricesHistogram.v2.presentation.adapter;

import BS.a;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.common.widgets.pricesHistogram.v2.presentation.PricesHistogramV2VO;
import ru.ozon.app.android.travel.feature.general.common.widgets.pricesHistogram.v2.view.PricesHistogramV2ItemView;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B#\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\t\u0010\nJ%\u0010\u0011\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0013R \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0014R\u001c\u0010\u0017\u001a\n \u0016*\u0004\u0018\u00010\u00150\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001aR\u0014\u0010!\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001aR\u0014\u0010\"\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u001a¨\u0006#"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v2/presentation/adapter/PricesHistogramV2DaysViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$C;", "", "Landroid/widget/LinearLayout;", "itemPricesHistogramLL", "Lkotlin/Function1;", "", "", "onDayClickCallback", "<init>", "(Landroid/widget/LinearLayout;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v2/presentation/PricesHistogramV2VO$DayVO;", "item", "Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v2/presentation/PricesHistogramV2VO$AvailableColorsVO;", "colors", "", "isDirect", "bind", "(Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v2/presentation/PricesHistogramV2VO$DayVO;Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v2/presentation/PricesHistogramV2VO$AvailableColorsVO;Z)V", "Landroid/widget/LinearLayout;", "Lkotlin/jvm/functions/Function1;", "Landroid/content/Context;", "kotlin.jvm.PlatformType", "context", "Landroid/content/Context;", "maxHeightFrom", "I", "viewWidth", "minViewHeight", "Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v2/view/PricesHistogramV2ItemView;", "itemPricesHistogramPIV", "Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v2/view/PricesHistogramV2ItemView;", "textDefault", "textSelected", "bgEmptyDay", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PricesHistogramV2DaysViewHolder extends RecyclerView.C {
    private final int bgEmptyDay;
    private final Context context;

    @NotNull
    private final LinearLayout itemPricesHistogramLL;
    private final PricesHistogramV2ItemView itemPricesHistogramPIV;
    private final int maxHeightFrom;
    private final int minViewHeight;

    @NotNull
    private final Function1<Integer, Unit> onDayClickCallback;
    private final int textDefault;
    private final int textSelected;
    private final int viewWidth;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PricesHistogramV2DaysViewHolder(@NotNull LinearLayout itemPricesHistogramLL, @NotNull Function1<? super Integer, Unit> onDayClickCallback) {
        super(itemPricesHistogramLL);
        Intrinsics.checkNotNullParameter(itemPricesHistogramLL, "itemPricesHistogramLL");
        Intrinsics.checkNotNullParameter(onDayClickCallback, "onDayClickCallback");
        this.itemPricesHistogramLL = itemPricesHistogramLL;
        this.onDayClickCallback = onDayClickCallback;
        Context context = this.itemView.getContext();
        this.context = context;
        Intrinsics.checkNotNullExpressionValue(context, "context");
        this.maxHeightFrom = ResourceExtKt.toPx(UserVerificationMethods.USER_VERIFY_PATTERN, context);
        Intrinsics.checkNotNullExpressionValue(context, "context");
        this.viewWidth = ResourceExtKt.toPx(24, context);
        Intrinsics.checkNotNullExpressionValue(context, "context");
        this.minViewHeight = ResourceExtKt.toPx(16, context);
        View childAt = itemPricesHistogramLL.getChildAt(0);
        this.itemPricesHistogramPIV = childAt instanceof PricesHistogramV2ItemView ? (PricesHistogramV2ItemView) childAt : null;
        Intrinsics.checkNotNullExpressionValue(context, "context");
        this.textDefault = ThemeExtKt.themeColor(context, R$attr.textSecondary);
        Intrinsics.checkNotNullExpressionValue(context, "context");
        this.textSelected = ThemeExtKt.themeColor(context, R$attr.textLightKey);
        Intrinsics.checkNotNullExpressionValue(context, "context");
        this.bgEmptyDay = ThemeExtKt.themeColor(context, R$attr.layerFloor1);
        itemPricesHistogramLL.setOnClickListener(new a(this, 12));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(PricesHistogramV2DaysViewHolder pricesHistogramV2DaysViewHolder, View view) {
        pricesHistogramV2DaysViewHolder.onDayClickCallback.invoke(Integer.valueOf(pricesHistogramV2DaysViewHolder.getLayoutPosition()));
    }

    public final void bind(@NotNull PricesHistogramV2VO.DayVO item, @NotNull PricesHistogramV2VO.AvailableColorsVO colors, boolean isDirect) {
        int defaultColumnColor;
        int i11;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(colors, "colors");
        int i12 = this.maxHeightFrom;
        int dayHeightDirect = isDirect ? item.getDayHeightDirect() : item.getDayHeight();
        int i13 = (int) ((i12 / 100.0f) * dayHeightDirect);
        int priceDirect = isDirect ? item.getPriceDirect() : item.getPrice();
        int i14 = this.minViewHeight;
        if (i13 < i14 && dayHeightDirect != 0 && priceDirect != 0) {
            i13 = i14;
        }
        LinearLayout linearLayout = this.itemPricesHistogramLL;
        ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = i12;
        linearLayout.setLayoutParams(layoutParams);
        if (!item.getIsSelected() || dayHeightDirect == 0) {
            defaultColumnColor = colors.getDefaultColumnColor();
            i11 = this.textDefault;
        } else {
            defaultColumnColor = colors.getSelectedColumnColor();
            i11 = this.textSelected;
        }
        PricesHistogramV2ItemView pricesHistogramV2ItemView = this.itemPricesHistogramPIV;
        if (pricesHistogramV2ItemView != null) {
            if (dayHeightDirect == 0) {
                ViewGroup.LayoutParams layoutParams2 = pricesHistogramV2ItemView.getLayoutParams();
                if (layoutParams2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                layoutParams2.height = this.minViewHeight;
                layoutParams2.width = this.viewWidth;
                pricesHistogramV2ItemView.setLayoutParams(layoutParams2);
                pricesHistogramV2ItemView.setBgColor(this.bgEmptyDay);
            } else {
                ViewGroup.LayoutParams layoutParams3 = pricesHistogramV2ItemView.getLayoutParams();
                if (layoutParams3 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                layoutParams3.height = i13;
                layoutParams3.width = this.viewWidth;
                pricesHistogramV2ItemView.setLayoutParams(layoutParams3);
                pricesHistogramV2ItemView.setBgColor(defaultColumnColor);
            }
            pricesHistogramV2ItemView.setTextColor(i11);
            pricesHistogramV2ItemView.setText(item.getNumber());
        }
    }
}
