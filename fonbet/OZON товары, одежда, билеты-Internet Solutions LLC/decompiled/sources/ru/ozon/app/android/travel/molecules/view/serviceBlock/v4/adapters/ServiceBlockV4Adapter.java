package ru.ozon.app.android.travel.molecules.view.serviceBlock.v4.adapters;

import androidx.recyclerview.widget.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.adapterdelegates.AsyncListDifferDelegationAdapter;
import ru.ozon.app.android.travel.molecules.dto.serviceBlock.v4.ServiceBlockV4DTO;
import ru.ozon.app.android.travel.molecules.view.serviceBlock.v4.ServiceBlockV4VO;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0016\b\u0002\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/travel/molecules/view/serviceBlock/v4/adapters/ServiceBlockV4Adapter;", "Lru/ozon/app/android/adapterdelegates/AsyncListDifferDelegationAdapter;", "Lru/ozon/app/android/travel/molecules/view/serviceBlock/v4/ServiceBlockV4VO$AdditionalListItem;", "copyHandler", "Lkotlin/Function1;", "Lru/ozon/app/android/travel/molecules/dto/serviceBlock/v4/ServiceBlockV4DTO$CopyAction;", "", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ServiceBlockV4Adapter extends AsyncListDifferDelegationAdapter<ServiceBlockV4VO.AdditionalListItem> {
    public ServiceBlockV4Adapter(Function1<? super ServiceBlockV4DTO.CopyAction, Unit> function1) {
        super(new i.d<ServiceBlockV4VO.AdditionalListItem>() { // from class: ru.ozon.app.android.travel.molecules.view.serviceBlock.v4.adapters.ServiceBlockV4Adapter.1
            @Override // androidx.recyclerview.widget.i.d
            public boolean areContentsTheSame(ServiceBlockV4VO.AdditionalListItem oldItem, ServiceBlockV4VO.AdditionalListItem newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return Intrinsics.d(oldItem, newItem);
            }

            @Override // androidx.recyclerview.widget.i.d
            public boolean areItemsTheSame(ServiceBlockV4VO.AdditionalListItem oldItem, ServiceBlockV4VO.AdditionalListItem newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return oldItem.getId() == newItem.getId();
            }
        });
        this.delegatesManager.addDelegate(ServiceBlockV4AdapterDelegateKt.serviceBlockV4AdapterDelegate());
        this.delegatesManager.addDelegate(ServiceBlockV4CopyAdapterDelegateKt.serviceBlockV4CopyAdapterDelegate(function1));
    }
}
