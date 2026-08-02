package ru.ozon.app.android.fresh.unsorted.widgets.deliveryToCharitiesInfo.presentation.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.lifecycle.J;
import jk0.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.unsorted.databinding.ItemCharityInstructionBinding;
import ru.ozon.app.android.fresh.unsorted.widgets.deliveryToCharitiesInfo.presentation.DeliveryToCharitiesInfoVO;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B#\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0016R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/deliveryToCharitiesInfo/presentation/adapter/DeliveryToCharitiesInfoAdapter;", "Ljk0/i;", "Lru/ozon/app/android/fresh/unsorted/widgets/deliveryToCharitiesInfo/presentation/DeliveryToCharitiesInfoVO$InstructionVO;", "Lru/ozon/app/android/fresh/unsorted/widgets/deliveryToCharitiesInfo/presentation/adapter/CharityInstructionViewHolder;", "Landroidx/lifecycle/J;", "containerViewLifecycleOwner", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "<init>", "(Landroidx/lifecycle/J;Lkotlin/jvm/functions/Function1;)V", "holder", "", "position", "onBindViewHolder", "(Lru/ozon/app/android/fresh/unsorted/widgets/deliveryToCharitiesInfo/presentation/adapter/CharityInstructionViewHolder;I)V", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/fresh/unsorted/widgets/deliveryToCharitiesInfo/presentation/adapter/CharityInstructionViewHolder;", "Landroidx/lifecycle/J;", "Lkotlin/jvm/functions/Function1;", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DeliveryToCharitiesInfoAdapter extends i<DeliveryToCharitiesInfoVO.InstructionVO, CharityInstructionViewHolder> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final J containerViewLifecycleOwner;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DeliveryToCharitiesInfoAdapter(@NotNull J containerViewLifecycleOwner, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        super(new CharityInstructionDiffUtil(), containerViewLifecycleOwner, null, 4, null);
        Intrinsics.checkNotNullParameter(containerViewLifecycleOwner, "containerViewLifecycleOwner");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.containerViewLifecycleOwner = containerViewLifecycleOwner;
        this.actionHandler = actionHandler;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull CharityInstructionViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        DeliveryToCharitiesInfoVO.InstructionVO instructionVO = getCurrentList().get(position);
        Intrinsics.checkNotNullExpressionValue(instructionVO, "get(...)");
        holder.bind(instructionVO);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public CharityInstructionViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        ItemCharityInstructionBinding inflate = ItemCharityInstructionBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return new CharityInstructionViewHolder(inflate, this.actionHandler);
    }
}
