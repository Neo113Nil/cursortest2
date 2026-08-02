package ru.ozon.app.android.returns.details.presentation.viewHolder.delegate.components;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.returns.details.data.dto.ReturnMethodDto;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
/* synthetic */ class ReturnMethodViewHolder$dateSlotsAdapter$1 extends C7735q implements Function2<ReturnMethodDto.TimeSlotDto, Integer, Unit> {
    ReturnMethodViewHolder$dateSlotsAdapter$1(Object obj) {
        super(2, obj, ReturnMethodViewHolder.class, "onDateSlotChange", "onDateSlotChange(Lru/ozon/app/android/returns/details/data/dto/ReturnMethodDto$TimeSlotDto;I)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(ReturnMethodDto.TimeSlotDto timeSlotDto, Integer num) {
        invoke(timeSlotDto, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(ReturnMethodDto.TimeSlotDto p02, int i11) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        ((ReturnMethodViewHolder) this.receiver).onDateSlotChange(p02, i11);
    }
}
