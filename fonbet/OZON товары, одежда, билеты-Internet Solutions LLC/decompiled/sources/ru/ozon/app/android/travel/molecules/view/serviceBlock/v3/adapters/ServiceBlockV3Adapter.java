package ru.ozon.app.android.travel.molecules.view.serviceBlock.v3.adapters;

import androidx.recyclerview.widget.i;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.adapterdelegates.AsyncListDifferDelegationAdapter;
import ru.ozon.app.android.travel.molecules.dto.serviceBlock.v3.ServiceBlockV3DTO;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/ozon/app/android/travel/molecules/view/serviceBlock/v3/adapters/ServiceBlockV3Adapter;", "Lru/ozon/app/android/adapterdelegates/AsyncListDifferDelegationAdapter;", "Lru/ozon/app/android/travel/molecules/dto/serviceBlock/v3/ServiceBlockV3DTO$AdditionalInfo;", "<init>", "()V", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ServiceBlockV3Adapter extends AsyncListDifferDelegationAdapter<ServiceBlockV3DTO.AdditionalInfo> {
    public ServiceBlockV3Adapter() {
        super(new i.d<ServiceBlockV3DTO.AdditionalInfo>() { // from class: ru.ozon.app.android.travel.molecules.view.serviceBlock.v3.adapters.ServiceBlockV3Adapter.1
            @Override // androidx.recyclerview.widget.i.d
            public boolean areContentsTheSame(ServiceBlockV3DTO.AdditionalInfo oldItem, ServiceBlockV3DTO.AdditionalInfo newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return Intrinsics.d(oldItem, newItem);
            }

            @Override // androidx.recyclerview.widget.i.d
            public boolean areItemsTheSame(ServiceBlockV3DTO.AdditionalInfo oldItem, ServiceBlockV3DTO.AdditionalInfo newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return Intrinsics.d(oldItem.getInfo(), newItem.getInfo());
            }
        });
        this.delegatesManager.addDelegate(ServiceBlockV3AdapterDelegateKt.serviceBlockV3AdapterDelegate());
    }
}
