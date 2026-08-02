package ru.ozon.app.android.travel.feature.general.common.widgets.pricesHistogram.v2.presentation.adapter;

import androidx.recyclerview.widget.i;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.adapterdelegates.AsyncListDifferDelegationAdapter;
import ru.ozon.app.android.travel.feature.general.common.widgets.pricesHistogram.v2.presentation.PricesHistogramV2VO;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v2/presentation/adapter/PricesHistogramV2MonthsAdapter;", "Lru/ozon/app/android/adapterdelegates/AsyncListDifferDelegationAdapter;", "Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v2/presentation/PricesHistogramV2VO$MonthVO;", "<init>", "()V", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PricesHistogramV2MonthsAdapter extends AsyncListDifferDelegationAdapter<PricesHistogramV2VO.MonthVO> {
    public PricesHistogramV2MonthsAdapter() {
        super(new i.d<PricesHistogramV2VO.MonthVO>() { // from class: ru.ozon.app.android.travel.feature.general.common.widgets.pricesHistogram.v2.presentation.adapter.PricesHistogramV2MonthsAdapter.1
            @Override // androidx.recyclerview.widget.i.d
            public boolean areContentsTheSame(PricesHistogramV2VO.MonthVO oldItem, PricesHistogramV2VO.MonthVO newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return Intrinsics.d(oldItem, newItem);
            }

            @Override // androidx.recyclerview.widget.i.d
            public boolean areItemsTheSame(PricesHistogramV2VO.MonthVO oldItem, PricesHistogramV2VO.MonthVO newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return oldItem.getId() == newItem.getId();
            }
        });
        this.delegatesManager.addDelegate(PricesHistogramV2MonthsAdapterDelegateKt.priceHistogramV2MonthsDelegate());
    }
}
