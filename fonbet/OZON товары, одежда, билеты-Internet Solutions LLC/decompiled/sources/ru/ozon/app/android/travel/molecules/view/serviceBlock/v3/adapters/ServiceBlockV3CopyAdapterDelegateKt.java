package ru.ozon.app.android.travel.molecules.view.serviceBlock.v3.adapters;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.adapterdelegates.AdapterDelegate;
import ru.ozon.app.android.adapterdelegates.dsl.DslViewBindingListAdapterDelegate;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.travel.molecules.dto.serviceBlock.v3.ServiceBlockV3DTO;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001c\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\u0000¨\u0006\u0006"}, d2 = {"serviceBlockV3CopyAdapterDelegate", "Lru/ozon/app/android/adapterdelegates/AdapterDelegate;", "", "Lru/ozon/app/android/travel/molecules/dto/serviceBlock/v3/ServiceBlockV3DTO$CopyBlock;", "refs", "Lru/ozon/app/android/composer/ComposerReferences;", "molecules_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ServiceBlockV3CopyAdapterDelegateKt {
    @NotNull
    public static final AdapterDelegate<List<ServiceBlockV3DTO.CopyBlock>> serviceBlockV3CopyAdapterDelegate(@NotNull ComposerReferences refs) {
        Intrinsics.checkNotNullParameter(refs, "refs");
        return new DslViewBindingListAdapterDelegate(ServiceBlockV3CopyAdapterDelegateKt$serviceBlockV3CopyAdapterDelegate$1.INSTANCE, ServiceBlockV3CopyAdapterDelegateKt$serviceBlockV3CopyAdapterDelegate$$inlined$adapterDelegateViewBinding$default$1.INSTANCE, new ServiceBlockV3CopyAdapterDelegateKt$serviceBlockV3CopyAdapterDelegate$2(refs), ServiceBlockV3CopyAdapterDelegateKt$serviceBlockV3CopyAdapterDelegate$$inlined$adapterDelegateViewBinding$default$2.INSTANCE);
    }
}
