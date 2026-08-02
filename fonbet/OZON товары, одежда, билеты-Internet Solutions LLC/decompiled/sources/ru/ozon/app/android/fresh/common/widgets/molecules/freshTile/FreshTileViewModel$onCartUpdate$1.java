package ru.ozon.app.android.fresh.common.widgets.molecules.freshTile;

import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.account.adult.presenter.AdultHandler;
import ru.ozon.app.android.cart.common.domain.CartState;
import ru.ozon.app.android.cart.common.domain.local.CartSource;
import ru.ozon.app.android.cart.common.models.CartItemInfo;
import ru.ozon.app.android.fresh.common.widgets.molecules.QuantCountStrategy;
import ru.ozon.app.android.fresh.common.widgets.molecules.productActionBar.presentation.ProductActionBarVO;
import ru.ozon.uni.atoms.af.AtomAction;
import ze.h;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010&\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "", "Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarVO;", "<destruct>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class FreshTileViewModel$onCartUpdate$1 extends AbstractC7737t implements Function1<Map.Entry<? extends Long, ? extends ProductActionBarVO>, Pair<? extends Long, ? extends ProductActionBarVO>> {
    final /* synthetic */ CartState $cartState;
    final /* synthetic */ FreshTileViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FreshTileViewModel$onCartUpdate$1(CartState cartState, FreshTileViewModel freshTileViewModel) {
        super(1);
        this.$cartState = cartState;
        this.this$0 = freshTileViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Pair<? extends Long, ? extends ProductActionBarVO> invoke(Map.Entry<? extends Long, ? extends ProductActionBarVO> entry) {
        return invoke2((Map.Entry<Long, ProductActionBarVO>) entry);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Pair<Long, ProductActionBarVO> invoke2(Map.Entry<Long, ProductActionBarVO> entry) {
        HashMap hashMap;
        boolean isIncrementDisabled;
        AdultHandler adultHandler;
        ProductActionBarVO copyWithNewState;
        AtomAction atomAction;
        AtomAction atomAction2;
        h hVar;
        AtomAction atomAction3;
        Intrinsics.checkNotNullParameter(entry, "<destruct>");
        long longValue = entry.getKey().longValue();
        ProductActionBarVO value = entry.getValue();
        Pair<Long, ProductActionBarVO> pair = new Pair<>(Long.valueOf(longValue), value);
        ProductActionBarVO.State state = value.getState();
        ProductActionBarVO.State.QuantityControl quantityControl = state instanceof ProductActionBarVO.State.QuantityControl ? (ProductActionBarVO.State.QuantityControl) state : null;
        if (quantityControl != null) {
            CartItemInfo cartItemInfo = this.$cartState.getItems().get(Long.valueOf(quantityControl.getSku()));
            int quantity = cartItemInfo != null ? cartItemInfo.getQuantity() : 0;
            if (quantity == quantityControl.getValue()) {
                atomAction = this.this$0.additionalAction;
                if (atomAction != null && this.$cartState.getSource() == CartSource.REMOTE) {
                    atomAction2 = this.this$0.additionalAction;
                    if (Intrinsics.d(atomAction2, quantityControl.getAdditionalAction())) {
                        hVar = this.this$0.additionalActionFlow;
                        atomAction3 = this.this$0.additionalAction;
                        hVar.b(atomAction3);
                        this.this$0.additionalAction = null;
                        return pair;
                    }
                }
            } else {
                hashMap = this.this$0.strategyList;
                QuantCountStrategy quantCountStrategy = (QuantCountStrategy) hashMap.get(Long.valueOf(longValue));
                if (quantCountStrategy != null) {
                    FreshTileViewModel freshTileViewModel = this.this$0;
                    isIncrementDisabled = freshTileViewModel.isIncrementDisabled(quantityControl, quantCountStrategy, quantity, cartItemInfo);
                    adultHandler = this.this$0.adultHandler;
                    copyWithNewState = freshTileViewModel.copyWithNewState(value, quantityControl, quantity, true, isIncrementDisabled, adultHandler.isUserAnAdult());
                    return new Pair<>(Long.valueOf(longValue), copyWithNewState);
                }
            }
        }
        return pair;
    }
}
