package ru.ozon.app.android.returns.details.presentation.viewHolder.delegate.items.exemplarstates;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.t;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.returns.databinding.ItemExemplarStateBinding;
import ru.ozon.app.android.returns.details.data.dto.ReturnItemsDto;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/returns/details/presentation/viewHolder/delegate/items/exemplarstates/ExemplarStatesAdapter;", "Landroidx/recyclerview/widget/t;", "Lru/ozon/app/android/returns/details/data/dto/ReturnItemsDto$ExemplarState;", "Lru/ozon/app/android/returns/details/presentation/viewHolder/delegate/items/exemplarstates/ExemplarStatesAdapter$ViewHolder;", "<init>", "()V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/returns/details/presentation/viewHolder/delegate/items/exemplarstates/ExemplarStatesAdapter$ViewHolder;", "holder", "position", "", "onBindViewHolder", "(Lru/ozon/app/android/returns/details/presentation/viewHolder/delegate/items/exemplarstates/ExemplarStatesAdapter$ViewHolder;I)V", "ViewHolder", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ExemplarStatesAdapter extends t<ReturnItemsDto.ExemplarState, ViewHolder> {

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/returns/details/presentation/viewHolder/delegate/items/exemplarstates/ExemplarStatesAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Lru/ozon/app/android/returns/databinding/ItemExemplarStateBinding;", "binding", "<init>", "(Lru/ozon/app/android/returns/databinding/ItemExemplarStateBinding;)V", "Lru/ozon/app/android/returns/details/data/dto/ReturnItemsDto$ExemplarState;", "item", "", "bind", "(Lru/ozon/app/android/returns/details/data/dto/ReturnItemsDto$ExemplarState;)V", "Lru/ozon/app/android/returns/databinding/ItemExemplarStateBinding;", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ViewHolder extends RecyclerView.C {

        @NotNull
        private final ItemExemplarStateBinding binding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(@NotNull ItemExemplarStateBinding binding) {
            super(binding.getConstraintLayout());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.binding = binding;
        }

        public final void bind(@NotNull ReturnItemsDto.ExemplarState item) {
            Intrinsics.checkNotNullParameter(item, "item");
            ItemExemplarStateBinding itemExemplarStateBinding = this.binding;
            BadgeView exemplarStatusBv = itemExemplarStateBinding.exemplarStatusBv;
            Intrinsics.checkNotNullExpressionValue(exemplarStatusBv, "exemplarStatusBv");
            BadgeHolderKt.bind$default(exemplarStatusBv, item.getBadge(), (Function1) null, 2, (Object) null);
            TextAtomView quantityTav = itemExemplarStateBinding.quantityTav;
            Intrinsics.checkNotNullExpressionValue(quantityTav, "quantityTav");
            TextAtomHolderKt.bindOrGone$default(quantityTav, item.getQuantity(), null, 2, null);
        }
    }

    public ExemplarStatesAdapter() {
        super(new ExemplarStatesDiffCallback());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull ViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        ReturnItemsDto.ExemplarState item = getItem(position);
        Intrinsics.checkNotNullExpressionValue(item, "getItem(...)");
        holder.bind(item);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        ItemExemplarStateBinding inflate = ItemExemplarStateBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return new ViewHolder(inflate);
    }
}
