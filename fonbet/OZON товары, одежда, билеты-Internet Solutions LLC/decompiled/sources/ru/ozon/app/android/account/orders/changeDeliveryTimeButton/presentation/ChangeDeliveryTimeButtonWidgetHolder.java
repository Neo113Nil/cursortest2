package ru.ozon.app.android.account.orders.changeDeliveryTimeButton.presentation;

import android.view.View;
import android.widget.LinearLayout;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import d20.AbstractC6064a;
import d20.InterfaceC6068e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.cscore.buttonv2.viewmodel.ActionButtonViewModel;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.LargeButtonView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.buttons.LargeButtonHolderKt;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B%\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0010R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R \u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\r0\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/account/orders/changeDeliveryTimeButton/presentation/ChangeDeliveryTimeButtonWidgetHolder;", "Ld20/a;", "Lru/ozon/app/android/account/orders/changeDeliveryTimeButton/presentation/ChangeDeliveryTimeButtonVO;", "Lru/ozon/app/android/cscore/buttonv2/viewmodel/ActionButtonViewModel;", "viewModel", "Ll10/i;", "container", "Ld20/e;", "Landroid/widget/LinearLayout;", "viewFactory", "<init>", "(Lru/ozon/app/android/cscore/buttonv2/viewmodel/ActionButtonViewModel;Ll10/i;Ld20/e;)V", "item", "", "bind", "(Lru/ozon/app/android/account/orders/changeDeliveryTimeButton/presentation/ChangeDeliveryTimeButtonVO;)V", "Lru/ozon/app/android/cscore/buttonv2/viewmodel/ActionButtonViewModel;", "Lcom/squareup/moshi/JsonAdapter;", "", "moshiAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ChangeDeliveryTimeButtonWidgetHolder extends AbstractC6064a<ChangeDeliveryTimeButtonVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final JsonAdapter<Object> moshiAdapter;

    @NotNull
    private final ActionButtonViewModel viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChangeDeliveryTimeButtonWidgetHolder(@NotNull ActionButtonViewModel viewModel, @NotNull i container, @NotNull InterfaceC6068e<LinearLayout> viewFactory) {
        super(container, viewFactory);
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(viewFactory, "viewFactory");
        this.viewModel = viewModel;
        this.moshiAdapter = new Moshi(new Moshi.a()).c(Object.class);
        this.actionHandler = new ActionHandler.Builder(container, this).onComposerAction(new ChangeDeliveryTimeButtonWidgetHolder$actionHandler$1(this)).buildHandler();
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull ChangeDeliveryTimeButtonVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        View view = getView();
        Intrinsics.g(view, "null cannot be cast to non-null type ru.ozon.app.android.account.orders.changeDeliveryTimeButton.presentation.ChangeDeliveryTimeButtonView");
        LargeButtonView changeDeliveryTimeBtn = ((ChangeDeliveryTimeButtonView) view).getChangeDeliveryTimeBtn();
        changeDeliveryTimeBtn.setEnabled(!item.getDisabled());
        LargeButtonHolderKt.bind(changeDeliveryTimeBtn, item.getButton(), this.actionHandler);
    }
}
