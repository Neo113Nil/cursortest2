package ru.ozon.app.android.ugc.widgets.rateItemsV2.presentation.view;

import android.graphics.drawable.GradientDrawable;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.ugc.databinding.WidgetRateItemsV2ReviewsItemBinding;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ReviewsItemViewHolder$setupBackground$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ String $backgroundColor;
    final /* synthetic */ String $strokeColor;
    final /* synthetic */ ReviewsItemViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReviewsItemViewHolder$setupBackground$1(String str, ReviewsItemViewHolder reviewsItemViewHolder, String str2) {
        super(0);
        this.$backgroundColor = str;
        this.this$0 = reviewsItemViewHolder;
        this.$strokeColor = str2;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        UniColors uniColors;
        UniColors uniColors2;
        WidgetRateItemsV2ReviewsItemBinding widgetRateItemsV2ReviewsItemBinding;
        GradientDrawable gradientDrawable;
        GradientDrawable gradientDrawable2;
        UniColors uniColors3;
        int intColor;
        GradientDrawable gradientDrawable3;
        UniColors uniColors4;
        int intColor2;
        String str = this.$backgroundColor;
        uniColors = this.this$0.defaultBackgroundColor;
        if (!Intrinsics.d(str, uniColors.getToken())) {
            gradientDrawable3 = this.this$0.gradientDrawable;
            ReviewsItemViewHolder reviewsItemViewHolder = this.this$0;
            String str2 = this.$backgroundColor;
            uniColors4 = reviewsItemViewHolder.defaultBackgroundColor;
            intColor2 = reviewsItemViewHolder.getIntColor(str2, uniColors4.getResId());
            gradientDrawable3.setColor(intColor2);
        }
        String str3 = this.$strokeColor;
        uniColors2 = this.this$0.defaultStrokeColor;
        if (!Intrinsics.d(str3, uniColors2.getToken())) {
            gradientDrawable2 = this.this$0.gradientDrawable;
            ReviewsItemViewHolder reviewsItemViewHolder2 = this.this$0;
            String str4 = this.$strokeColor;
            int dp_1 = Dimens.INSTANCE.getDP_1();
            uniColors3 = reviewsItemViewHolder2.defaultStrokeColor;
            intColor = reviewsItemViewHolder2.getIntColor(str4, uniColors3.getResId());
            gradientDrawable2.setStroke(dp_1, intColor);
        }
        widgetRateItemsV2ReviewsItemBinding = this.this$0.binding;
        LinearLayout constraintLayout = widgetRateItemsV2ReviewsItemBinding.getConstraintLayout();
        gradientDrawable = this.this$0.gradientDrawable;
        constraintLayout.setBackground(gradientDrawable);
    }
}
