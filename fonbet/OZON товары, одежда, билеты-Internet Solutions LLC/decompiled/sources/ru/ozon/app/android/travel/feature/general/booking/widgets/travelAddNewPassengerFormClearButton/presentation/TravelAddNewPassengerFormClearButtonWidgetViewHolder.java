package ru.ozon.app.android.travel.feature.general.booking.widgets.travelAddNewPassengerFormClearButton.presentation;

import Sx.a;
import Vg.d;
import android.view.View;
import androidx.lifecycle.AbstractC5434v;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.travel.feature.general.booking.databinding.WidgetTravelAddNewPassengerFormClearButtonBinding;
import ru.ozon.app.android.travel.feature.general.booking.widgets.travelAddNewPassengerForm.v2.presentation.TravelAddNewPassengerFormV2ViewModel;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.R$style;
import ru.ozon.uni.android.uikit.view.atoms.buttons.borderless.SmallBorderlessButtonView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.v3.holders.buttons.WrappedBorderlessButtonHolderKt;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B+\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\u0010\f\u001a\u00060\nj\u0002`\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00022\n\u0010\u0015\u001a\u00060\u0013j\u0002`\u0014H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0018\u0010\u0011J\u000f\u0010\u0019\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0019\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R \u0010#\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u000f0!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerFormClearButton/presentation/TravelAddNewPassengerFormClearButtonWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerFormClearButton/presentation/TravelAddNewPassengerFormClearButtonVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v2/presentation/TravelAddNewPassengerFormV2ViewModel;", "viewModel", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "<init>", "(Landroid/view/View;Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v2/presentation/TravelAddNewPassengerFormV2ViewModel;Lru/ozon/app/android/composer/ComposerReferences;LVg/d;)V", "", "observeLiveData", "()V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerFormClearButton/presentation/TravelAddNewPassengerFormClearButtonVO;Ll20/d;)V", "onAttach", "onDetach", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v2/presentation/TravelAddNewPassengerFormV2ViewModel;", "Lru/ozon/app/android/travel/feature/general/booking/databinding/WidgetTravelAddNewPassengerFormClearButtonBinding;", "binding", "Lru/ozon/app/android/travel/feature/general/booking/databinding/WidgetTravelAddNewPassengerFormClearButtonBinding;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TravelAddNewPassengerFormClearButtonWidgetViewHolder extends k<TravelAddNewPassengerFormClearButtonVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final WidgetTravelAddNewPassengerFormClearButtonBinding binding;

    @NotNull
    private final View containerView;

    @NotNull
    private final TravelAddNewPassengerFormV2ViewModel viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TravelAddNewPassengerFormClearButtonWidgetViewHolder(@NotNull View containerView, @NotNull TravelAddNewPassengerFormV2ViewModel viewModel, @NotNull ComposerReferences references, @NotNull d customActionHandlersStoreFactory) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        this.containerView = containerView;
        this.viewModel = viewModel;
        WidgetTravelAddNewPassengerFormClearButtonBinding bind = WidgetTravelAddNewPassengerFormClearButtonBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        this.actionHandler = new ActionHandler.Builder(references, this).customActionHandlers(new TravelAddNewPassengerFormClearButtonWidgetViewHolder$actionHandler$1(customActionHandlersStoreFactory)).buildHandler();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$1$lambda$0(TravelAddNewPassengerFormClearButtonWidgetViewHolder travelAddNewPassengerFormClearButtonWidgetViewHolder, TravelAddNewPassengerFormClearButtonVO travelAddNewPassengerFormClearButtonVO, View view) {
        AtomAction atomAction;
        travelAddNewPassengerFormClearButtonWidgetViewHolder.viewModel.onClearButtonClicked();
        AtomActionDTO action = travelAddNewPassengerFormClearButtonVO.getClearButton().getAction();
        if (action == null || (atomAction = AtomActionMapperKt.toAtomAction(action, travelAddNewPassengerFormClearButtonVO.getClearButton().getTrackingInfo())) == null) {
            return;
        }
        travelAddNewPassengerFormClearButtonWidgetViewHolder.actionHandler.invoke(atomAction);
    }

    private final void observeLiveData() {
        this.viewModel.getClearButtonVisibilityLiveData().observe(this, new TravelAddNewPassengerFormClearButtonWidgetViewHolder$sam$androidx_lifecycle_Observer$0(new TravelAddNewPassengerFormClearButtonWidgetViewHolder$observeLiveData$1(this)));
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        super.onAttach();
        setLifecycleState(AbstractC5434v.b.RESUMED);
        observeLiveData();
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onDetach() {
        setLifecycleState(AbstractC5434v.b.DESTROYED);
        super.onDetach();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull TravelAddNewPassengerFormClearButtonVO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        SmallBorderlessButtonView smallBorderlessButtonView = this.binding.clearButtonSbbv;
        Intrinsics.f(smallBorderlessButtonView);
        WrappedBorderlessButtonHolderKt.bind(smallBorderlessButtonView, item.getClearButton(), this.actionHandler);
        smallBorderlessButtonView.setOnClickListener(new a(2, this, item));
        smallBorderlessButtonView.setTextAppearance(R$style.TextStyle_Body_L_Blue);
    }
}
