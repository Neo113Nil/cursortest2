package ru.ozon.app.android.orderdetails.deliverytimeselector.v2.presentation.button.viewHolder;

import android.view.View;
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
import ru.ozon.app.android.orderdetails.deliverytimeselector.v2.presentation.button.ConfirmDateButtonViewModel;
import ru.ozon.app.android.orderdetails.deliverytimeselector.v2.presentation.button.viewItem.ConfirmDateButtonVO;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3HolderKt;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B%\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR \u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\r0\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/orderdetails/deliverytimeselector/v2/presentation/button/viewHolder/ConfirmDateButtonViewHolder;", "Ld20/a;", "Lru/ozon/app/android/orderdetails/deliverytimeselector/v2/presentation/button/viewItem/ConfirmDateButtonVO;", "Ll10/i;", "container", "Ld20/e;", "Landroid/widget/LinearLayout;", "viewFactory", "Lru/ozon/app/android/orderdetails/deliverytimeselector/v2/presentation/button/ConfirmDateButtonViewModel;", "viewModel", "<init>", "(Ll10/i;Ld20/e;Lru/ozon/app/android/orderdetails/deliverytimeselector/v2/presentation/button/ConfirmDateButtonViewModel;)V", "item", "", "bind", "(Lru/ozon/app/android/orderdetails/deliverytimeselector/v2/presentation/button/viewItem/ConfirmDateButtonVO;)V", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ConfirmDateButtonViewHolder extends AbstractC6064a<ConfirmDateButtonVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfirmDateButtonViewHolder(@NotNull i container, @NotNull InterfaceC6068e<LinearLayout> viewFactory, @NotNull ConfirmDateButtonViewModel viewModel) {
        super(container, viewFactory);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(viewFactory, "viewFactory");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        this.actionHandler = new ActionHandler.Builder(container, this).onComposerAction(new ConfirmDateButtonViewHolder$actionHandler$1(viewModel)).buildHandler();
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull ConfirmDateButtonVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        View view = getView();
        Intrinsics.g(view, "null cannot be cast to non-null type ru.ozon.uni.android.controls.buttonV3.ButtonV3View");
        ButtonV3HolderKt.bind((ButtonV3View) view, item.getButton(), this.actionHandler);
    }
}
