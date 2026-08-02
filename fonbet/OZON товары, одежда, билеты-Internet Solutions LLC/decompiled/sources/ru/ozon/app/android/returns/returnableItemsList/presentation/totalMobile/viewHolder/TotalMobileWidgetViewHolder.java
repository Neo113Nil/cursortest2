package ru.ozon.app.android.returns.returnableItemsList.presentation.totalMobile.viewHolder;

import android.widget.LinearLayout;
import d20.AbstractC6064a;
import d20.InterfaceC6068e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.returns.returnableItemsList.presentation.totalMobile.viewObject.TotalMobileVO;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.SmallButtonView;
import ru.ozon.uni.android.uikit.view.atoms.price.PriceView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.buttons.WrappedButtonHolderKt;
import ru.ozon.uni.atoms.v3.holders.price.PriceHolderKt;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B%\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0010R \u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r0\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/returns/returnableItemsList/presentation/totalMobile/viewHolder/TotalMobileWidgetViewHolder;", "Ld20/a;", "Lru/ozon/app/android/returns/returnableItemsList/presentation/totalMobile/viewObject/TotalMobileVO;", "Lru/ozon/app/android/returns/returnableItemsList/presentation/totalMobile/viewHolder/ReturnTotalMobileView;", "returnTotalMobileView", "Ll10/i;", "container", "Ld20/e;", "Landroid/widget/LinearLayout;", "viewFactory", "<init>", "(Lru/ozon/app/android/returns/returnableItemsList/presentation/totalMobile/viewHolder/ReturnTotalMobileView;Ll10/i;Ld20/e;)V", "item", "", "bind", "(Lru/ozon/app/android/returns/returnableItemsList/presentation/totalMobile/viewObject/TotalMobileVO;)V", "Lru/ozon/app/android/returns/returnableItemsList/presentation/totalMobile/viewHolder/ReturnTotalMobileView;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class TotalMobileWidgetViewHolder extends AbstractC6064a<TotalMobileVO> {
    public static final int $stable = (SmallButtonView.$stable | TextAtomView.$stable) | PriceView.$stable;

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final ReturnTotalMobileView returnTotalMobileView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TotalMobileWidgetViewHolder(@NotNull ReturnTotalMobileView returnTotalMobileView, @NotNull i container, @NotNull InterfaceC6068e<LinearLayout> viewFactory) {
        super(container, viewFactory);
        Intrinsics.checkNotNullParameter(returnTotalMobileView, "returnTotalMobileView");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(viewFactory, "viewFactory");
        this.returnTotalMobileView = returnTotalMobileView;
        this.actionHandler = new ActionHandler.Builder(container, this).buildHandler();
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull TotalMobileVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        ReturnTotalMobileView returnTotalMobileView = this.returnTotalMobileView;
        PriceHolderKt.bind(returnTotalMobileView.getTotalPv(), item.getTotal(), this.actionHandler);
        TextAtomHolderKt.bind(returnTotalMobileView.getQuantityTv(), item.getQuantity(), this.actionHandler);
        WrappedButtonHolderKt.bind(returnTotalMobileView.getButtonSbv(), item.getButton(), this.actionHandler);
    }
}
