package ru.ozon.app.android.orderdetails.ordershipment.orderShipment.presentation.annotation;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i;
import androidx.recyclerview.widget.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.orderdetails.databinding.ItemOrderShipmentAnnotationButtonBinding;
import ru.ozon.uni.android.uikit.view.atoms.buttons.borderless.SmallBorderlessButtonView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.v3.holders.buttons.WrappedBorderlessButtonHolderKt;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0015B\u001b\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/presentation/annotation/OrderShipmentAnnotationButtonsAdapter;", "Landroidx/recyclerview/widget/t;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;", "Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/presentation/annotation/OrderShipmentAnnotationButtonsAdapter$ButtonViewHolder;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/presentation/annotation/OrderShipmentAnnotationButtonsAdapter$ButtonViewHolder;", "holder", "position", "onBindViewHolder", "(Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/presentation/annotation/OrderShipmentAnnotationButtonsAdapter$ButtonViewHolder;I)V", "Lkotlin/jvm/functions/Function1;", "ButtonViewHolder", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class OrderShipmentAnnotationButtonsAdapter extends t<ButtonV3Atom.SmallBorderlessButton, ButtonViewHolder> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000eR \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/presentation/annotation/OrderShipmentAnnotationButtonsAdapter$ButtonViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Lru/ozon/app/android/orderdetails/databinding/ItemOrderShipmentAnnotationButtonBinding;", "binding", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "<init>", "(Lru/ozon/app/android/orderdetails/databinding/ItemOrderShipmentAnnotationButtonBinding;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;", "item", "bind", "(Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;)V", "Lru/ozon/app/android/orderdetails/databinding/ItemOrderShipmentAnnotationButtonBinding;", "Lkotlin/jvm/functions/Function1;", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ButtonViewHolder extends RecyclerView.C {

        @NotNull
        private final Function1<AtomAction, Unit> actionHandler;

        @NotNull
        private final ItemOrderShipmentAnnotationButtonBinding binding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public ButtonViewHolder(@NotNull ItemOrderShipmentAnnotationButtonBinding binding, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
            super(binding.getConstraintLayout());
            Intrinsics.checkNotNullParameter(binding, "binding");
            Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
            this.binding = binding;
            this.actionHandler = actionHandler;
        }

        public final void bind(@NotNull ButtonV3Atom.SmallBorderlessButton item) {
            Intrinsics.checkNotNullParameter(item, "item");
            SmallBorderlessButtonView buttonBa = this.binding.buttonBa;
            Intrinsics.checkNotNullExpressionValue(buttonBa, "buttonBa");
            WrappedBorderlessButtonHolderKt.bind(buttonBa, item, this.actionHandler);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OrderShipmentAnnotationButtonsAdapter(@NotNull Function1<? super AtomAction, Unit> actionHandler) {
        super(new i.d<ButtonV3Atom.SmallBorderlessButton>() { // from class: ru.ozon.app.android.orderdetails.ordershipment.orderShipment.presentation.annotation.OrderShipmentAnnotationButtonsAdapter.1
            @Override // androidx.recyclerview.widget.i.d
            public boolean areContentsTheSame(ButtonV3Atom.SmallBorderlessButton oldItem, ButtonV3Atom.SmallBorderlessButton newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return Intrinsics.d(oldItem, newItem);
            }

            @Override // androidx.recyclerview.widget.i.d
            public boolean areItemsTheSame(ButtonV3Atom.SmallBorderlessButton oldItem, ButtonV3Atom.SmallBorderlessButton newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return Intrinsics.d(oldItem, newItem);
            }
        });
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.actionHandler = actionHandler;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull ButtonViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        ButtonV3Atom.SmallBorderlessButton item = getItem(position);
        Intrinsics.checkNotNullExpressionValue(item, "getItem(...)");
        holder.bind(item);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public ButtonViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        ItemOrderShipmentAnnotationButtonBinding inflate = ItemOrderShipmentAnnotationButtonBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return new ButtonViewHolder(inflate, this.actionHandler);
    }
}
