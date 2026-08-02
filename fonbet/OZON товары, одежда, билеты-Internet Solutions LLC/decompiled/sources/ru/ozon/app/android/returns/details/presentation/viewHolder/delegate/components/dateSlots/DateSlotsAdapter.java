package ru.ozon.app.android.returns.details.presentation.viewHolder.delegate.components.dateSlots;

import CG.c;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.returns.details.data.dto.ReturnMethodDto;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0014B!\u0012\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R&\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0013¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/returns/details/presentation/viewHolder/delegate/components/dateSlots/DateSlotsAdapter;", "Landroidx/recyclerview/widget/t;", "Lru/ozon/app/android/returns/details/data/dto/ReturnMethodDto$TimeSlotDto;", "Lru/ozon/app/android/returns/details/presentation/viewHolder/delegate/components/dateSlots/DateSlotsAdapter$ViewHolder;", "Lkotlin/Function2;", "", "", "onDateSelected", "<init>", "(Lkotlin/jvm/functions/Function2;)V", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/returns/details/presentation/viewHolder/delegate/components/dateSlots/DateSlotsAdapter$ViewHolder;", "holder", "position", "onBindViewHolder", "(Lru/ozon/app/android/returns/details/presentation/viewHolder/delegate/components/dateSlots/DateSlotsAdapter$ViewHolder;I)V", "Lkotlin/jvm/functions/Function2;", "ViewHolder", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DateSlotsAdapter extends t<ReturnMethodDto.TimeSlotDto, ViewHolder> {

    @NotNull
    private final Function2<ReturnMethodDto.TimeSlotDto, Integer, Unit> onDateSelected;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000eR&\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u000fR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/returns/details/presentation/viewHolder/delegate/components/dateSlots/DateSlotsAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Lru/ozon/app/android/returns/details/presentation/viewHolder/delegate/components/dateSlots/ItemReturnDateSlotView;", "dateSlotView", "Lkotlin/Function2;", "Lru/ozon/app/android/returns/details/data/dto/ReturnMethodDto$TimeSlotDto;", "", "", "onDateSelected", "<init>", "(Lru/ozon/app/android/returns/details/presentation/viewHolder/delegate/components/dateSlots/ItemReturnDateSlotView;Lkotlin/jvm/functions/Function2;)V", "item", "bind", "(Lru/ozon/app/android/returns/details/data/dto/ReturnMethodDto$TimeSlotDto;)V", "Lru/ozon/app/android/returns/details/presentation/viewHolder/delegate/components/dateSlots/ItemReturnDateSlotView;", "Lkotlin/jvm/functions/Function2;", "Lru/ozon/app/android/returns/details/data/dto/ReturnMethodDto$TimeSlotDto;", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ViewHolder extends RecyclerView.C {

        @NotNull
        private final ItemReturnDateSlotView dateSlotView;
        private ReturnMethodDto.TimeSlotDto item;

        @NotNull
        private final Function2<ReturnMethodDto.TimeSlotDto, Integer, Unit> onDateSelected;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public ViewHolder(@NotNull ItemReturnDateSlotView dateSlotView, @NotNull Function2<? super ReturnMethodDto.TimeSlotDto, ? super Integer, Unit> onDateSelected) {
            super(dateSlotView);
            Intrinsics.checkNotNullParameter(dateSlotView, "dateSlotView");
            Intrinsics.checkNotNullParameter(onDateSelected, "onDateSelected");
            this.dateSlotView = dateSlotView;
            this.onDateSelected = onDateSelected;
            dateSlotView.setOnClickListener(new c(this, 13));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void _init_$lambda$1(ViewHolder viewHolder, View view) {
            ReturnMethodDto.TimeSlotDto timeSlotDto = viewHolder.item;
            if (timeSlotDto != null) {
                viewHolder.onDateSelected.invoke(timeSlotDto, Integer.valueOf(viewHolder.getAdapterPosition()));
            }
        }

        public final void bind(@NotNull ReturnMethodDto.TimeSlotDto item) {
            Intrinsics.checkNotNullParameter(item, "item");
            ItemReturnDateSlotView itemReturnDateSlotView = this.dateSlotView;
            this.item = item;
            itemReturnDateSlotView.getDateSlotTitleTv().setText(item.getDay().getTitle());
            itemReturnDateSlotView.getDateSlotSubtitleTv().setText(item.getDay().getSubtitle());
            Boolean selected = item.getDay().getSelected();
            itemReturnDateSlotView.setActivated(selected != null ? selected.booleanValue() : false);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DateSlotsAdapter(@NotNull Function2<? super ReturnMethodDto.TimeSlotDto, ? super Integer, Unit> onDateSelected) {
        super(new DateSlotsDiffCallback());
        Intrinsics.checkNotNullParameter(onDateSelected, "onDateSelected");
        this.onDateSelected = onDateSelected;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull ViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        ReturnMethodDto.TimeSlotDto item = getItem(position);
        Intrinsics.checkNotNullExpressionValue(item, "getItem(...)");
        holder.bind(item);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return new ViewHolder(new ItemReturnDateSlotView(context, null, 0, 0, 14, null), this.onDateSelected);
    }
}
