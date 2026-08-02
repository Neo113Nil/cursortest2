package ru.ozon.app.android.travel.molecules.view.serviceBlock.v3.adapters;

import androidx.recyclerview.widget.i;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.adapterdelegates.AsyncListDifferDelegationAdapter;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.travel.molecules.dto.serviceBlock.v3.ServiceBlockV3DTO;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/travel/molecules/view/serviceBlock/v3/adapters/ServiceBlockV3CopyAdapter;", "Lru/ozon/app/android/adapterdelegates/AsyncListDifferDelegationAdapter;", "Lru/ozon/app/android/travel/molecules/dto/serviceBlock/v3/ServiceBlockV3DTO$CopyBlock;", "refs", "Lru/ozon/app/android/composer/ComposerReferences;", "<init>", "(Lru/ozon/app/android/composer/ComposerReferences;)V", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ServiceBlockV3CopyAdapter extends AsyncListDifferDelegationAdapter<ServiceBlockV3DTO.CopyBlock> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ServiceBlockV3CopyAdapter(@NotNull ComposerReferences refs) {
        super(new i.d<ServiceBlockV3DTO.CopyBlock>() { // from class: ru.ozon.app.android.travel.molecules.view.serviceBlock.v3.adapters.ServiceBlockV3CopyAdapter.1
            @Override // androidx.recyclerview.widget.i.d
            public boolean areContentsTheSame(ServiceBlockV3DTO.CopyBlock oldItem, ServiceBlockV3DTO.CopyBlock newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return Intrinsics.d(oldItem, newItem);
            }

            @Override // androidx.recyclerview.widget.i.d
            public boolean areItemsTheSame(ServiceBlockV3DTO.CopyBlock oldItem, ServiceBlockV3DTO.CopyBlock newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return Intrinsics.d(oldItem.getText().getText(), newItem.getText().getText());
            }
        });
        Intrinsics.checkNotNullParameter(refs, "refs");
        this.delegatesManager.addDelegate(ServiceBlockV3CopyAdapterDelegateKt.serviceBlockV3CopyAdapterDelegate(refs));
    }
}
