package ru.ozon.app.android.travel.feature.general.common.widgets.travelImportantInfoModal.presentation.adapter;

import kotlin.Metadata;
import ru.ozon.app.android.adapterdelegates.AsyncListDifferDelegationAdapter;
import ru.ozon.app.android.travel.feature.general.common.widgets.travelImportantInfoModal.presentation.TravelImportantInfoModalVO;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/travelImportantInfoModal/presentation/adapter/TravelImportantInfoModalAdapter;", "Lru/ozon/app/android/adapterdelegates/AsyncListDifferDelegationAdapter;", "Lru/ozon/app/android/travel/feature/general/common/widgets/travelImportantInfoModal/presentation/TravelImportantInfoModalVO$InfoVO;", "<init>", "()V", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelImportantInfoModalAdapter extends AsyncListDifferDelegationAdapter<TravelImportantInfoModalVO.InfoVO> {
    public TravelImportantInfoModalAdapter() {
        super(new TravelImportantInfoModalDiffUtilCallback());
        this.delegatesManager.addDelegate(TravelImportantInfoModalAdapterDelegateKt.getTravelImportantInfoModalAdapterDelegate());
    }
}
