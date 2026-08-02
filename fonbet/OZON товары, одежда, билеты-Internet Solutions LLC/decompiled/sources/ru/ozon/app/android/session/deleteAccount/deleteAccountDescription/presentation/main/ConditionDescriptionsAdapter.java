package ru.ozon.app.android.session.deleteAccount.deleteAccountDescription.presentation.main;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i;
import androidx.recyclerview.widget.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.session.R$layout;
import ru.ozon.app.android.session.databinding.ItemDeleteAccountDescriptionConditionBinding;
import ru.ozon.app.android.session.deleteAccount.deleteAccountDescription.presentation.main.DeleteAccountDescriptionMainVO;
import ru.ozon.uni.android.uikit.extensions.view.ViewGroupExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.utils.ContainerExtKt;
import ru.ozon.uni.atoms.v3.containers.SingleAtom;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0007\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0001\u0015B\u001b\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ#\u0010\u000e\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0012\u001a\u00020\u00062\n\u0010\u0010\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0011\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/session/deleteAccount/deleteAccountDescription/presentation/main/ConditionDescriptionsAdapter;", "Landroidx/recyclerview/widget/t;", "Lru/ozon/app/android/session/deleteAccount/deleteAccountDescription/presentation/main/DeleteAccountDescriptionMainVO$Conditions$DescriptionsItem;", "Lru/ozon/app/android/session/deleteAccount/deleteAccountDescription/presentation/main/ConditionDescriptionsAdapter$ViewHolder;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onAction", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/session/deleteAccount/deleteAccountDescription/presentation/main/ConditionDescriptionsAdapter$ViewHolder;", "holder", "position", "onBindViewHolder", "(Lru/ozon/app/android/session/deleteAccount/deleteAccountDescription/presentation/main/ConditionDescriptionsAdapter$ViewHolder;I)V", "Lkotlin/jvm/functions/Function1;", "ViewHolder", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ConditionDescriptionsAdapter extends t<DeleteAccountDescriptionMainVO.Conditions.DescriptionsItem, ViewHolder> {

    @NotNull
    private final Function1<AtomAction, Unit> onAction;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/session/deleteAccount/deleteAccountDescription/presentation/main/ConditionDescriptionsAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Landroid/view/View;", "containerView", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onAction", "<init>", "(Lru/ozon/app/android/session/deleteAccount/deleteAccountDescription/presentation/main/ConditionDescriptionsAdapter;Landroid/view/View;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/session/deleteAccount/deleteAccountDescription/presentation/main/DeleteAccountDescriptionMainVO$Conditions$DescriptionsItem;", "item", "bind", "(Lru/ozon/app/android/session/deleteAccount/deleteAccountDescription/presentation/main/DeleteAccountDescriptionMainVO$Conditions$DescriptionsItem;)V", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "Lru/ozon/app/android/session/databinding/ItemDeleteAccountDescriptionConditionBinding;", "binding", "Lru/ozon/app/android/session/databinding/ItemDeleteAccountDescriptionConditionBinding;", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class ViewHolder extends RecyclerView.C {

        @NotNull
        private final ItemDeleteAccountDescriptionConditionBinding binding;

        @NotNull
        private final View containerView;
        final /* synthetic */ ConditionDescriptionsAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(@NotNull ConditionDescriptionsAdapter conditionDescriptionsAdapter, @NotNull View containerView, Function1<? super AtomAction, Unit> onAction) {
            super(containerView);
            Intrinsics.checkNotNullParameter(containerView, "containerView");
            Intrinsics.checkNotNullParameter(onAction, "onAction");
            this.this$0 = conditionDescriptionsAdapter;
            this.containerView = containerView;
            ItemDeleteAccountDescriptionConditionBinding bind = ItemDeleteAccountDescriptionConditionBinding.bind(containerView);
            Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
            this.binding = bind;
            bind.actionSA.setOnAction(onAction);
        }

        public final void bind(@NotNull DeleteAccountDescriptionMainVO.Conditions.DescriptionsItem item) {
            Intrinsics.checkNotNullParameter(item, "item");
            ItemDeleteAccountDescriptionConditionBinding itemDeleteAccountDescriptionConditionBinding = this.binding;
            SingleAtom.bind$default(itemDeleteAccountDescriptionConditionBinding.descriptionSA, item.getDescription(), false, 2, null);
            SingleAtom actionSA = itemDeleteAccountDescriptionConditionBinding.actionSA;
            Intrinsics.checkNotNullExpressionValue(actionSA, "actionSA");
            ContainerExtKt.bindOrGone$default(actionSA, item.getButton(), false, 2, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ConditionDescriptionsAdapter(@NotNull Function1<? super AtomAction, Unit> onAction) {
        super(new i.d<DeleteAccountDescriptionMainVO.Conditions.DescriptionsItem>() { // from class: ru.ozon.app.android.session.deleteAccount.deleteAccountDescription.presentation.main.ConditionDescriptionsAdapter.1
            @Override // androidx.recyclerview.widget.i.d
            public boolean areContentsTheSame(DeleteAccountDescriptionMainVO.Conditions.DescriptionsItem oldItem, DeleteAccountDescriptionMainVO.Conditions.DescriptionsItem newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return Intrinsics.d(oldItem, newItem);
            }

            @Override // androidx.recyclerview.widget.i.d
            public boolean areItemsTheSame(DeleteAccountDescriptionMainVO.Conditions.DescriptionsItem oldItem, DeleteAccountDescriptionMainVO.Conditions.DescriptionsItem newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return Intrinsics.d(oldItem, newItem);
            }
        });
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        this.onAction = onAction;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull ViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        DeleteAccountDescriptionMainVO.Conditions.DescriptionsItem item = getItem(position);
        Intrinsics.checkNotNullExpressionValue(item, "getItem(...)");
        holder.bind(item);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new ViewHolder(this, ViewGroupExtKt.inflate(parent, R$layout.item_delete_account_description_condition), this.onAction);
    }
}
