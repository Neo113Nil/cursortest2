package ru.ozon.app.android.travel.feature.general.booking.widgets.additionalServices.presentation.tariff;

import androidx.recyclerview.widget.i;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.booking.widgets.additionalServices.presentation.tariff.aspect.AdditionalServicesTariffAspectPayload;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\tJ!\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/tariff/AdditionalServicesTariffItemsCallback;", "Landroidx/recyclerview/widget/i$d;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/tariff/AdditionalServicesTariffItemVO;", "<init>", "()V", "oldItem", "newItem", "", "areItemsTheSame", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/tariff/AdditionalServicesTariffItemVO;Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/tariff/AdditionalServicesTariffItemVO;)Z", "areContentsTheSame", "", "getChangePayload", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/tariff/AdditionalServicesTariffItemVO;Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/tariff/AdditionalServicesTariffItemVO;)Ljava/lang/Object;", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AdditionalServicesTariffItemsCallback extends i.d<AdditionalServicesTariffItemVO> {
    @Override // androidx.recyclerview.widget.i.d
    public boolean areContentsTheSame(@NotNull AdditionalServicesTariffItemVO oldItem, @NotNull AdditionalServicesTariffItemVO newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return Intrinsics.d(oldItem, newItem);
    }

    @Override // androidx.recyclerview.widget.i.d
    public boolean areItemsTheSame(@NotNull AdditionalServicesTariffItemVO oldItem, @NotNull AdditionalServicesTariffItemVO newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return oldItem.getId() == newItem.getId();
    }

    @Override // androidx.recyclerview.widget.i.d
    public Object getChangePayload(@NotNull AdditionalServicesTariffItemVO oldItem, @NotNull AdditionalServicesTariffItemVO newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        ArrayList arrayList = new ArrayList();
        if ((oldItem instanceof AdditionalServicesTariffAspectVO) && (newItem instanceof AdditionalServicesTariffAspectVO)) {
            AdditionalServicesTariffAspectVO additionalServicesTariffAspectVO = (AdditionalServicesTariffAspectVO) oldItem;
            AdditionalServicesTariffAspectVO additionalServicesTariffAspectVO2 = (AdditionalServicesTariffAspectVO) newItem;
            if (!Intrinsics.d(additionalServicesTariffAspectVO.getAspect(), additionalServicesTariffAspectVO2.getAspect())) {
                arrayList.add(AdditionalServicesTariffAspectPayload.ASPECT);
            }
            if (!Intrinsics.d(additionalServicesTariffAspectVO.getTitle(), additionalServicesTariffAspectVO2.getTitle())) {
                arrayList.add(AdditionalServicesTariffAspectPayload.TITLE);
            }
            if (!Intrinsics.d(additionalServicesTariffAspectVO.getSubtitle(), additionalServicesTariffAspectVO2.getSubtitle())) {
                arrayList.add(AdditionalServicesTariffAspectPayload.SUBTITLE);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }
}
