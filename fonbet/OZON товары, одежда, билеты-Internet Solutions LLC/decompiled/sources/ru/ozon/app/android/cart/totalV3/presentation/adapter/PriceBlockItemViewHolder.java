package ru.ozon.app.android.cart.totalV3.presentation.adapter;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.totalV3.presentation.TotalVO;
import ru.ozon.app.android.cart.totalV3.presentation.ViewExtKt;
import ru.ozon.app.android.cart.totalV3.presentation.views.TotalPriceBlockView;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lru/ozon/app/android/cart/totalV3/presentation/adapter/PriceBlockItemViewHolder;", "Lru/ozon/app/android/cart/totalV3/presentation/adapter/ItemViewHolder;", "Lru/ozon/app/android/cart/totalV3/presentation/TotalVO$TotalItemVO$PriceBlockVO;", "totalPriceBlockView", "Lru/ozon/app/android/cart/totalV3/presentation/views/TotalPriceBlockView;", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "<init>", "(Lru/ozon/app/android/cart/totalV3/presentation/views/TotalPriceBlockView;Lkotlin/jvm/functions/Function1;)V", "bind", "item", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PriceBlockItemViewHolder extends ItemViewHolder<TotalVO.TotalItemVO.PriceBlockVO> {

    @NotNull
    private final TotalPriceBlockView totalPriceBlockView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PriceBlockItemViewHolder(@NotNull TotalPriceBlockView totalPriceBlockView, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        super(totalPriceBlockView);
        Intrinsics.checkNotNullParameter(totalPriceBlockView, "totalPriceBlockView");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.totalPriceBlockView = totalPriceBlockView;
        totalPriceBlockView.setActionHandler(actionHandler);
    }

    public void bind(@NotNull TotalVO.TotalItemVO.PriceBlockVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.totalPriceBlockView.bind(item);
        ViewExtKt.setupMargins(this.totalPriceBlockView, item.getMargins());
    }
}
