package ru.ozon.app.android.cml.delivery.widgets.personalInfoVerification.presentation.buttons;

import Vg.d;
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
import ru.ozon.app.android.cml.delivery.molecules.button.presentation.CmlButtonView;
import ru.ozon.app.android.cml.delivery.widgets.personalInfoVerification.presentation.PersonalInfoVerificationViewModel;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B9\u0012\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0015R \u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00120\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R$\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00120\u0016j\u0002`\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u0014\u0010\u001f\u001a\u00020\u001c8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/personalInfoVerification/presentation/buttons/PersonalInfoVerificationStickyButtonViewHolder;", "Ld20/a;", "Lru/ozon/app/android/cml/delivery/widgets/personalInfoVerification/presentation/buttons/PersonalInfoVerificationStickyButtonVO;", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "inhibitor", "Ll10/i;", "container", "Lru/ozon/app/android/cml/delivery/widgets/personalInfoVerification/presentation/PersonalInfoVerificationViewModel;", "viewModel", "Ld20/e;", "Landroid/widget/LinearLayout;", "viewFactory", "<init>", "(LVg/d;Lru/ozon/app/android/composer/throttle/HandlersInhibitor;Ll10/i;Lru/ozon/app/android/cml/delivery/widgets/personalInfoVerification/presentation/PersonalInfoVerificationViewModel;Ld20/e;)V", "item", "", "bind", "(Lru/ozon/app/android/cml/delivery/widgets/personalInfoVerification/presentation/buttons/PersonalInfoVerificationStickyButtonVO;)V", "Lru/ozon/app/android/cml/delivery/widgets/personalInfoVerification/presentation/PersonalInfoVerificationViewModel;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/action/BuildedActionHandler;", "preProcessActionHandler", "Lru/ozon/app/android/cml/delivery/molecules/button/presentation/CmlButtonView;", "getContainerView", "()Lru/ozon/app/android/cml/delivery/molecules/button/presentation/CmlButtonView;", "containerView", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PersonalInfoVerificationStickyButtonViewHolder extends AbstractC6064a<PersonalInfoVerificationStickyButtonVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final Function1<AtomAction, Unit> preProcessActionHandler;

    @NotNull
    private final PersonalInfoVerificationViewModel viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PersonalInfoVerificationStickyButtonViewHolder(@NotNull d customActionHandlersStoreFactory, @NotNull HandlersInhibitor inhibitor, @NotNull i container, @NotNull PersonalInfoVerificationViewModel viewModel, @NotNull InterfaceC6068e<LinearLayout> viewFactory) {
        super(container, viewFactory);
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        Intrinsics.checkNotNullParameter(inhibitor, "inhibitor");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(viewFactory, "viewFactory");
        this.viewModel = viewModel;
        this.actionHandler = new ActionHandler.Builder(container, this).enableClickThrottling(inhibitor).customActionHandlers(new PersonalInfoVerificationStickyButtonViewHolder$actionHandler$1(customActionHandlersStoreFactory)).buildHandler();
        this.preProcessActionHandler = new PersonalInfoVerificationStickyButtonViewHolder$preProcessActionHandler$1(this);
    }

    private final CmlButtonView getContainerView() {
        View view = getView();
        Intrinsics.g(view, "null cannot be cast to non-null type ru.ozon.app.android.cml.delivery.molecules.button.presentation.CmlButtonView");
        return (CmlButtonView) view;
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull PersonalInfoVerificationStickyButtonVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        getContainerView().bind(item.getConfirmButton(), this.preProcessActionHandler);
    }
}
