package ru.ozon.app.android.returns.ui.molecules.balance.presentaion.recyclerView;

import Ax.ViewOnClickListenerC2451a;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.returns.ui.databinding.ReturnBalanceTotalRowBinding;
import ru.ozon.app.android.returns.ui.molecules.balance.data.BalanceRowItemDTO;
import ru.ozon.app.android.returns.ui.molecules.balance.viewObject.BalanceRow;
import ru.ozon.app.android.returns.ui.molecules.balance.viewObject.BalanceRowItem;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.price.ui.PriceAtomView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.v3.holders.icon.IconHolderKt;
import ru.ozon.uni.atoms.v3.holders.price.PriceAtomHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0012\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/returns/ui/molecules/balance/presentaion/recyclerView/ReturnCreationTotalRowViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Lru/ozon/app/android/returns/ui/databinding/ReturnBalanceTotalRowBinding;", "binding", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "<init>", "(Lru/ozon/app/android/returns/ui/databinding/ReturnBalanceTotalRowBinding;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/returns/ui/molecules/balance/viewObject/BalanceRowItem;", "rowItem", "bindRowItem", "(Lru/ozon/app/android/returns/ui/molecules/balance/viewObject/BalanceRowItem;)V", "Lru/ozon/app/android/returns/ui/molecules/balance/viewObject/BalanceRow;", "row", "bind", "(Lru/ozon/app/android/returns/ui/molecules/balance/viewObject/BalanceRow;)V", "bindOrGone", "Lru/ozon/app/android/returns/ui/databinding/ReturnBalanceTotalRowBinding;", "getBinding", "()Lru/ozon/app/android/returns/ui/databinding/ReturnBalanceTotalRowBinding;", "Lkotlin/jvm/functions/Function1;", "getActionHandler", "()Lkotlin/jvm/functions/Function1;", "boundRowItem", "Lru/ozon/app/android/returns/ui/molecules/balance/viewObject/BalanceRowItem;", "Landroid/view/View$OnClickListener;", "clickableAreaClickListener", "Landroid/view/View$OnClickListener;", "returns_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ReturnCreationTotalRowViewHolder extends RecyclerView.C {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final ReturnBalanceTotalRowBinding binding;
    private BalanceRowItem boundRowItem;

    @NotNull
    private final View.OnClickListener clickableAreaClickListener;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BalanceRowItemDTO.IconPosition.values().length];
            try {
                iArr[BalanceRowItemDTO.IconPosition.RIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BalanceRowItemDTO.IconPosition.LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ReturnCreationTotalRowViewHolder(@NotNull ReturnBalanceTotalRowBinding binding, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        super(binding.getConstraintLayout());
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.binding = binding;
        this.actionHandler = actionHandler;
        this.clickableAreaClickListener = new ViewOnClickListenerC2451a(this, 17);
    }

    private final void bindRowItem(BalanceRowItem rowItem) {
        ReturnBalanceTotalRowBinding returnBalanceTotalRowBinding = this.binding;
        TextAtomV2View leftText = returnBalanceTotalRowBinding.leftText;
        Intrinsics.checkNotNullExpressionValue(leftText, "leftText");
        TextHolderKt.bindOrGone$default(leftText, rowItem.getText(), null, 2, null);
        BalanceRowItemDTO.IconPosition iconPosition = rowItem.getIconPosition();
        int i11 = iconPosition == null ? -1 : WhenMappings.$EnumSwitchMapping$0[iconPosition.ordinal()];
        if (i11 == 1) {
            IconView leftStartIcon = returnBalanceTotalRowBinding.leftStartIcon;
            Intrinsics.checkNotNullExpressionValue(leftStartIcon, "leftStartIcon");
            IconHolderKt.bindOrGone$default(leftStartIcon, null, null, 2, null);
            IconView leftEndIcon = returnBalanceTotalRowBinding.leftEndIcon;
            Intrinsics.checkNotNullExpressionValue(leftEndIcon, "leftEndIcon");
            IconHolderKt.bindOrGone$default(leftEndIcon, rowItem.getIcon(), null, 2, null);
        } else if (i11 == 2) {
            IconView leftStartIcon2 = returnBalanceTotalRowBinding.leftStartIcon;
            Intrinsics.checkNotNullExpressionValue(leftStartIcon2, "leftStartIcon");
            IconHolderKt.bindOrGone$default(leftStartIcon2, rowItem.getIcon(), null, 2, null);
            IconView leftEndIcon2 = returnBalanceTotalRowBinding.leftEndIcon;
            Intrinsics.checkNotNullExpressionValue(leftEndIcon2, "leftEndIcon");
            IconHolderKt.bindOrGone$default(leftEndIcon2, null, null, 2, null);
        }
        if (rowItem.getCommon() != null) {
            this.boundRowItem = rowItem;
            returnBalanceTotalRowBinding.clickAreaView.setOnClickListener(this.clickableAreaClickListener);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void clickableAreaClickListener$lambda$1(ReturnCreationTotalRowViewHolder returnCreationTotalRowViewHolder, View view) {
        CommonControlSettings common;
        AtomActionDTO action;
        AtomAction atomAction;
        BalanceRowItem balanceRowItem = returnCreationTotalRowViewHolder.boundRowItem;
        if (balanceRowItem == null || (common = balanceRowItem.getCommon()) == null || (action = common.getAction()) == null || (atomAction = AtomActionMapperKt.toAtomAction(action, common.getTrackingInfo())) == null) {
            return;
        }
        returnCreationTotalRowViewHolder.actionHandler.invoke(atomAction);
    }

    public final void bind(@NotNull BalanceRow row) {
        Intrinsics.checkNotNullParameter(row, "row");
        ReturnBalanceTotalRowBinding returnBalanceTotalRowBinding = this.binding;
        bindRowItem(row.getLeftItem());
        PriceAtomView priceView = returnBalanceTotalRowBinding.priceView;
        Intrinsics.checkNotNullExpressionValue(priceView, "priceView");
        PriceAtomHolderKt.bindOrGone$default(priceView, row.getPrice(), null, 2, null);
        ConstraintLayout constraintLayout = returnBalanceTotalRowBinding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        ViewExtKt.show(constraintLayout);
    }

    public final void bindOrGone(BalanceRow row) {
        if (row != null) {
            bind(row);
            return;
        }
        ConstraintLayout constraintLayout = this.binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        ViewExtKt.gone(constraintLayout);
    }
}
