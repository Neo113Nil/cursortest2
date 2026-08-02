package ru.ozon.app.android.travel.feature.avia.widgets.travelServicePackageIndMobileAddToOrder.v3.presentation.adapter;

import androidx.recyclerview.widget.i;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.adapterdelegates.AsyncListDifferDelegationAdapter;
import ru.ozon.app.android.travel.feature.avia.widgets.travelServicePackageIndMobileAddToOrder.v3.data.ServicePackSelectionV3DTO;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/travelServicePackageIndMobileAddToOrder/v3/presentation/adapter/ServicePackSelectionV3Adapter;", "Lru/ozon/app/android/adapterdelegates/AsyncListDifferDelegationAdapter;", "Lru/ozon/app/android/travel/feature/avia/widgets/travelServicePackageIndMobileAddToOrder/v3/data/ServicePackSelectionV3DTO$Benefit;", "<init>", "()V", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ServicePackSelectionV3Adapter extends AsyncListDifferDelegationAdapter<ServicePackSelectionV3DTO.Benefit> {
    public ServicePackSelectionV3Adapter() {
        super(new i.d<ServicePackSelectionV3DTO.Benefit>() { // from class: ru.ozon.app.android.travel.feature.avia.widgets.travelServicePackageIndMobileAddToOrder.v3.presentation.adapter.ServicePackSelectionV3Adapter.1
            @Override // androidx.recyclerview.widget.i.d
            public boolean areContentsTheSame(ServicePackSelectionV3DTO.Benefit oldItem, ServicePackSelectionV3DTO.Benefit newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return Intrinsics.d(oldItem, newItem);
            }

            @Override // androidx.recyclerview.widget.i.d
            public boolean areItemsTheSame(ServicePackSelectionV3DTO.Benefit oldItem, ServicePackSelectionV3DTO.Benefit newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return Intrinsics.d(oldItem.getDescription().getText(), newItem.getDescription().getText());
            }
        });
        this.delegatesManager.addDelegate(ServicePackSelectionV3AdapterDelegateKt.servicePackSelectionV3AdapterDelegate());
    }
}
