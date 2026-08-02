package ru.ozon.app.android.returns.details.presentation.viewHolder.delegate.components.dateSlots;

import androidx.recyclerview.widget.i;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.returns.details.data.dto.ReturnMethodDto;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/returns/details/presentation/viewHolder/delegate/components/dateSlots/DateSlotsDiffCallback;", "Landroidx/recyclerview/widget/i$d;", "Lru/ozon/app/android/returns/details/data/dto/ReturnMethodDto$TimeSlotDto;", "<init>", "()V", "oldItem", "newItem", "", "areItemsTheSame", "(Lru/ozon/app/android/returns/details/data/dto/ReturnMethodDto$TimeSlotDto;Lru/ozon/app/android/returns/details/data/dto/ReturnMethodDto$TimeSlotDto;)Z", "areContentsTheSame", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DateSlotsDiffCallback extends i.d<ReturnMethodDto.TimeSlotDto> {
    @Override // androidx.recyclerview.widget.i.d
    public boolean areContentsTheSame(@NotNull ReturnMethodDto.TimeSlotDto oldItem, @NotNull ReturnMethodDto.TimeSlotDto newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return Intrinsics.d(oldItem, newItem);
    }

    @Override // androidx.recyclerview.widget.i.d
    public boolean areItemsTheSame(@NotNull ReturnMethodDto.TimeSlotDto oldItem, @NotNull ReturnMethodDto.TimeSlotDto newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return Intrinsics.d(oldItem.getDay().getTitle(), newItem.getDay().getTitle());
    }
}
