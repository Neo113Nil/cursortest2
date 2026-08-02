package ru.ozon.app.android.fresh.checkout.widgets.timeSlots.presentation.recyclerView;

import android.view.View;
import jk0.j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.checkout.widgets.timeSlots.domain.TimeSlotsVO;
import ru.ozon.uni.android.atom.aspect.AspectView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.apsect.AspectHolderKt;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000eR \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/timeSlots/presentation/recyclerView/TimeSlotItemViewHolder;", "Ljk0/j;", "Lru/ozon/uni/android/atom/aspect/AspectView;", "contentView", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "<init>", "(Lru/ozon/uni/android/atom/aspect/AspectView;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/fresh/checkout/widgets/timeSlots/domain/TimeSlotsVO$TimeSlot;", "item", "bind", "(Lru/ozon/app/android/fresh/checkout/widgets/timeSlots/domain/TimeSlotsVO$TimeSlot;)V", "Lru/ozon/uni/android/atom/aspect/AspectView;", "Lkotlin/jvm/functions/Function1;", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class TimeSlotItemViewHolder extends j {
    public static final int $stable = AspectView.$stable;

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final AspectView contentView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TimeSlotItemViewHolder(@NotNull AspectView contentView, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        super(contentView);
        Intrinsics.checkNotNullParameter(contentView, "contentView");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.contentView = contentView;
        this.actionHandler = actionHandler;
    }

    public final void bind(@NotNull TimeSlotsVO.TimeSlot item) {
        Intrinsics.checkNotNullParameter(item, "item");
        AspectHolderKt.bind(this.contentView, item.getWrapper(), this.actionHandler);
        View childAt = this.contentView.getChildAt(0);
        if (childAt instanceof TimeSlotComponentsView) {
            ((TimeSlotComponentsView) childAt).bind(item);
        }
    }
}
