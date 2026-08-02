package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsPageDetails.presentation.additionalInfo;

import androidx.recyclerview.widget.i;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.adapterdelegates.AsyncListDifferDelegationAdapter;
import ru.ozon.app.android.travel.molecules.view.iconWithText.v2.IconWithTextV2VO;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageDetails/presentation/additionalInfo/AdditionalInfoAdapter;", "Lru/ozon/app/android/adapterdelegates/AsyncListDifferDelegationAdapter;", "Lru/ozon/app/android/travel/molecules/view/iconWithText/v2/IconWithTextV2VO;", "<init>", "()V", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AdditionalInfoAdapter extends AsyncListDifferDelegationAdapter<IconWithTextV2VO> {
    public AdditionalInfoAdapter() {
        super(new i.d<IconWithTextV2VO>() { // from class: ru.ozon.app.android.travel.feature.hotels.widgets.hotelsPageDetails.presentation.additionalInfo.AdditionalInfoAdapter.1
            @Override // androidx.recyclerview.widget.i.d
            public boolean areContentsTheSame(IconWithTextV2VO oldItem, IconWithTextV2VO newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return Intrinsics.d(oldItem, newItem);
            }

            @Override // androidx.recyclerview.widget.i.d
            public boolean areItemsTheSame(IconWithTextV2VO oldItem, IconWithTextV2VO newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return Intrinsics.d(oldItem.getText().getText(), newItem.getText().getText());
            }
        });
        this.delegatesManager.addDelegate(AdditionalInfoAdapterDelegateKt.additionalInfoAdapterDelegate());
    }
}
