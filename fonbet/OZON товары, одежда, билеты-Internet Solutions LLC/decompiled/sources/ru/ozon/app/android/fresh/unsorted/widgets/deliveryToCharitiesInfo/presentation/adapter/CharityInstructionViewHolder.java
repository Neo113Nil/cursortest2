package ru.ozon.app.android.fresh.unsorted.widgets.deliveryToCharitiesInfo.presentation.adapter;

import androidx.constraintlayout.widget.ConstraintLayout;
import jk0.j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.unsorted.databinding.ItemCharityInstructionBinding;
import ru.ozon.app.android.fresh.unsorted.widgets.deliveryToCharitiesInfo.presentation.DeliveryToCharitiesInfoVO;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000eR \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/deliveryToCharitiesInfo/presentation/adapter/CharityInstructionViewHolder;", "Ljk0/j;", "Lru/ozon/app/android/fresh/unsorted/databinding/ItemCharityInstructionBinding;", "binding", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "<init>", "(Lru/ozon/app/android/fresh/unsorted/databinding/ItemCharityInstructionBinding;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/fresh/unsorted/widgets/deliveryToCharitiesInfo/presentation/DeliveryToCharitiesInfoVO$InstructionVO;", "item", "bind", "(Lru/ozon/app/android/fresh/unsorted/widgets/deliveryToCharitiesInfo/presentation/DeliveryToCharitiesInfoVO$InstructionVO;)V", "Lru/ozon/app/android/fresh/unsorted/databinding/ItemCharityInstructionBinding;", "Lkotlin/jvm/functions/Function1;", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CharityInstructionViewHolder extends j {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final ItemCharityInstructionBinding binding;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CharityInstructionViewHolder(@NotNull ItemCharityInstructionBinding binding, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        super(r0);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        ConstraintLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        this.actionHandler = actionHandler;
    }

    public final void bind(@NotNull DeliveryToCharitiesInfoVO.InstructionVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        ItemCharityInstructionBinding itemCharityInstructionBinding = this.binding;
        itemCharityInstructionBinding.orderTv.setText(item.getOrderNumber());
        TextAtomV2View titleTv = itemCharityInstructionBinding.titleTv;
        Intrinsics.checkNotNullExpressionValue(titleTv, "titleTv");
        TextHolderKt.bindOrGone$default(titleTv, item.getTitle(), null, 2, null);
        TextAtomV2View subtitleTv = itemCharityInstructionBinding.subtitleTv;
        Intrinsics.checkNotNullExpressionValue(subtitleTv, "subtitleTv");
        TextHolderKt.bindOrGone$default(subtitleTv, item.getSubtitle(), null, 2, null);
        ButtonV3View buttonAddress = itemCharityInstructionBinding.buttonAddress;
        Intrinsics.checkNotNullExpressionValue(buttonAddress, "buttonAddress");
        ButtonV3HolderKt.bindOrGone(buttonAddress, item.getButtonV3DTO(), this.actionHandler);
    }
}
