package ru.ozon.app.android.travel.feature.general.booking.widgets.additionalServices.presentation.cell;

import androidx.recyclerview.widget.i;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\tJ!\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/cell/AdditionalServicesCellCallback;", "Landroidx/recyclerview/widget/i$d;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/cell/AdditionalServicesCellVO;", "<init>", "()V", "oldItem", "newItem", "", "areItemsTheSame", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/cell/AdditionalServicesCellVO;Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/cell/AdditionalServicesCellVO;)Z", "areContentsTheSame", "", "getChangePayload", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/cell/AdditionalServicesCellVO;Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/cell/AdditionalServicesCellVO;)Ljava/lang/Object;", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AdditionalServicesCellCallback extends i.d<AdditionalServicesCellVO> {
    @Override // androidx.recyclerview.widget.i.d
    public boolean areContentsTheSame(@NotNull AdditionalServicesCellVO oldItem, @NotNull AdditionalServicesCellVO newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return Intrinsics.d(oldItem, newItem);
    }

    @Override // androidx.recyclerview.widget.i.d
    public boolean areItemsTheSame(@NotNull AdditionalServicesCellVO oldItem, @NotNull AdditionalServicesCellVO newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return oldItem.getId() == newItem.getId();
    }

    @Override // androidx.recyclerview.widget.i.d
    public Object getChangePayload(@NotNull AdditionalServicesCellVO oldItem, @NotNull AdditionalServicesCellVO newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        ArrayList arrayList = new ArrayList();
        if (!Intrinsics.d(oldItem.getImage(), newItem.getImage())) {
            arrayList.add(AdditionalServicesCellPayload.IMAGE);
        }
        if (!Intrinsics.d(oldItem.getTitle(), newItem.getTitle())) {
            arrayList.add(AdditionalServicesCellPayload.TITLE);
        }
        if (!Intrinsics.d(oldItem.getSubtitle(), newItem.getSubtitle())) {
            arrayList.add(AdditionalServicesCellPayload.SUBTITLE);
        }
        arrayList.add(AdditionalServicesCellPayload.TITLE_INFO_BUTTON);
        arrayList.add(AdditionalServicesCellPayload.SUBTITLE_SKELETON);
        if (!Intrinsics.d(oldItem.getControl(), newItem.getControl())) {
            arrayList.add(AdditionalServicesCellPayload.CONTROL);
        }
        if (!Intrinsics.d(oldItem.getCellType(), newItem.getCellType())) {
            arrayList.add(AdditionalServicesCellPayload.CELL_TYPE);
        }
        if (oldItem.getIsTariffsVisible() != newItem.getIsTariffsVisible()) {
            arrayList.add(AdditionalServicesCellPayload.TARIFFS_VISIBILITY);
        }
        if (oldItem.getIsTariffSkeletonsVisible() != newItem.getIsTariffSkeletonsVisible()) {
            arrayList.add(AdditionalServicesCellPayload.TARIFF_SKELETONS);
        }
        if (oldItem.getHideSeparator() != newItem.getHideSeparator()) {
            arrayList.add(AdditionalServicesCellPayload.SEPARATOR);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }
}
