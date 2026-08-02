package ru.ozon.app.android.travel.molecules.view.serviceBlock.v4.adapters;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.adapterdelegates.AdapterDelegate;
import ru.ozon.app.android.adapterdelegates.dsl.DslViewBindingListAdapterDelegate;
import ru.ozon.app.android.travel.molecules.dto.serviceBlock.v4.ServiceBlockV4DTO;
import ru.ozon.app.android.travel.molecules.view.serviceBlock.v4.ServiceBlockV4VO;

@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u001a*\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005H\u0000¨\u0006\b"}, d2 = {"serviceBlockV4CopyAdapterDelegate", "Lru/ozon/app/android/adapterdelegates/AdapterDelegate;", "", "Lru/ozon/app/android/travel/molecules/view/serviceBlock/v4/ServiceBlockV4VO$AdditionalListItem;", "copyHandler", "Lkotlin/Function1;", "Lru/ozon/app/android/travel/molecules/dto/serviceBlock/v4/ServiceBlockV4DTO$CopyAction;", "", "molecules_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ServiceBlockV4CopyAdapterDelegateKt {
    @NotNull
    public static final AdapterDelegate<List<ServiceBlockV4VO.AdditionalListItem>> serviceBlockV4CopyAdapterDelegate(Function1<? super ServiceBlockV4DTO.CopyAction, Unit> function1) {
        return new DslViewBindingListAdapterDelegate(ServiceBlockV4CopyAdapterDelegateKt$serviceBlockV4CopyAdapterDelegate$1.INSTANCE, ServiceBlockV4CopyAdapterDelegateKt$serviceBlockV4CopyAdapterDelegate$$inlined$adapterDelegateViewBinding$default$1.INSTANCE, new ServiceBlockV4CopyAdapterDelegateKt$serviceBlockV4CopyAdapterDelegate$2(function1), ServiceBlockV4CopyAdapterDelegateKt$serviceBlockV4CopyAdapterDelegate$$inlined$adapterDelegateViewBinding$default$2.INSTANCE);
    }
}
