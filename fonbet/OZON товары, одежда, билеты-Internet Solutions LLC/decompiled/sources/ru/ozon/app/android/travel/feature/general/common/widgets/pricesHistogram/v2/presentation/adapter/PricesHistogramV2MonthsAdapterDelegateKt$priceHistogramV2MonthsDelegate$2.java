package ru.ozon.app.android.travel.feature.general.common.widgets.pricesHistogram.v2.presentation.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.adapterdelegates.dsl.AdapterDelegateViewBindingViewHolder;
import ru.ozon.app.android.travel.feature.general.common.widgets.pricesHistogram.v2.presentation.PricesHistogramV2VO;
import ru.ozon.app.android.travel.utils.TypedViewBinding;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0002H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "Lru/ozon/app/android/adapterdelegates/dsl/AdapterDelegateViewBindingViewHolder;", "Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v2/presentation/PricesHistogramV2VO$MonthVO;", "Lru/ozon/app/android/travel/utils/TypedViewBinding;", "Landroid/widget/LinearLayout;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class PricesHistogramV2MonthsAdapterDelegateKt$priceHistogramV2MonthsDelegate$2 extends AbstractC7737t implements Function1<AdapterDelegateViewBindingViewHolder<PricesHistogramV2VO.MonthVO, TypedViewBinding<LinearLayout>>, Unit> {
    public static final PricesHistogramV2MonthsAdapterDelegateKt$priceHistogramV2MonthsDelegate$2 INSTANCE = new PricesHistogramV2MonthsAdapterDelegateKt$priceHistogramV2MonthsDelegate$2();

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.travel.feature.general.common.widgets.pricesHistogram.v2.presentation.adapter.PricesHistogramV2MonthsAdapterDelegateKt$priceHistogramV2MonthsDelegate$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<List<? extends Object>, Unit> {
        final /* synthetic */ int $margin;
        final /* synthetic */ AdapterDelegateViewBindingViewHolder<PricesHistogramV2VO.MonthVO, TypedViewBinding<LinearLayout>> $this_adapterDelegateViewBinding;
        final /* synthetic */ int $viewWidth;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(AdapterDelegateViewBindingViewHolder<PricesHistogramV2VO.MonthVO, TypedViewBinding<LinearLayout>> adapterDelegateViewBindingViewHolder, int i11, int i12) {
            super(1);
            this.$this_adapterDelegateViewBinding = adapterDelegateViewBindingViewHolder;
            this.$viewWidth = i11;
            this.$margin = i12;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends Object> list) {
            invoke2(list);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(List<? extends Object> it) {
            int countOfDays;
            Intrinsics.checkNotNullParameter(it, "it");
            View itemView = this.$this_adapterDelegateViewBinding.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            AdapterDelegateViewBindingViewHolder<PricesHistogramV2VO.MonthVO, TypedViewBinding<LinearLayout>> adapterDelegateViewBindingViewHolder = this.$this_adapterDelegateViewBinding;
            int i11 = this.$viewWidth;
            int i12 = this.$margin;
            ViewGroup.LayoutParams layoutParams = itemView.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            if (adapterDelegateViewBindingViewHolder.getItem().getIsCornerItem()) {
                countOfDays = adapterDelegateViewBindingViewHolder.getItem().getCountOfEmptyDays() + adapterDelegateViewBindingViewHolder.getItem().getCountOfDays();
            } else {
                countOfDays = adapterDelegateViewBindingViewHolder.getItem().getCountOfDays();
            }
            layoutParams.width = (countOfDays * i11) - i12;
            itemView.setLayoutParams(layoutParams);
        }
    }

    PricesHistogramV2MonthsAdapterDelegateKt$priceHistogramV2MonthsDelegate$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AdapterDelegateViewBindingViewHolder<PricesHistogramV2VO.MonthVO, TypedViewBinding<LinearLayout>> adapterDelegateViewBindingViewHolder) {
        invoke2(adapterDelegateViewBindingViewHolder);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AdapterDelegateViewBindingViewHolder<PricesHistogramV2VO.MonthVO, TypedViewBinding<LinearLayout>> adapterDelegateViewBinding) {
        Intrinsics.checkNotNullParameter(adapterDelegateViewBinding, "$this$adapterDelegateViewBinding");
        adapterDelegateViewBinding.bind(new AnonymousClass1(adapterDelegateViewBinding, ResourceExtKt.toPx(26, adapterDelegateViewBinding.getContext()), ResourceExtKt.toPx(2, adapterDelegateViewBinding.getContext())));
    }
}
