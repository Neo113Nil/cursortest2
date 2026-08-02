package ru.ozon.app.android.storefront.widgets.feedback.common;

import DS.a;
import Vg.c;
import android.view.View;
import android.widget.LinearLayout;
import d20.AbstractC6064a;
import d20.InterfaceC6068e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.storefront.databinding.CommonItemNextStepButtonBinding;
import ru.ozon.app.android.storefront.widgets.feedback.rateWidget.presentation.RateViewModel;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.LargeButtonView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.v3.holders.buttons.LargeButtonHolderKt;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B9\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\u0010\u000b\u001a\u00060\tj\u0002`\n\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0015R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0016R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001a\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR \u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00120\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lru/ozon/app/android/storefront/widgets/feedback/common/RateMainButtonViewHolder;", "Ld20/a;", "Lru/ozon/app/android/storefront/widgets/feedback/common/RateMainButtonVO;", "Lru/ozon/app/android/storefront/widgets/feedback/rateWidget/presentation/RateViewModel;", "viewModel", "Lru/ozon/app/android/storefront/databinding/CommonItemNextStepButtonBinding;", "binding", "Ll10/i;", "container", "LVg/c;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStore;", "customActionHandlersStore", "Ld20/e;", "Landroid/widget/LinearLayout;", "viewFactory", "<init>", "(Lru/ozon/app/android/storefront/widgets/feedback/rateWidget/presentation/RateViewModel;Lru/ozon/app/android/storefront/databinding/CommonItemNextStepButtonBinding;Ll10/i;LVg/c;Ld20/e;)V", "item", "", "bind", "(Lru/ozon/app/android/storefront/widgets/feedback/common/RateMainButtonVO;)V", "Lru/ozon/app/android/storefront/widgets/feedback/rateWidget/presentation/RateViewModel;", "Lru/ozon/app/android/storefront/databinding/CommonItemNextStepButtonBinding;", "currentItem", "Lru/ozon/app/android/storefront/widgets/feedback/common/RateMainButtonVO;", "Landroid/view/View$OnClickListener;", "buttonListener", "Landroid/view/View$OnClickListener;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RateMainButtonViewHolder extends AbstractC6064a<RateMainButtonVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final CommonItemNextStepButtonBinding binding;

    @NotNull
    private View.OnClickListener buttonListener;
    private RateMainButtonVO currentItem;

    @NotNull
    private final RateViewModel viewModel;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.storefront.widgets.feedback.common.RateMainButtonViewHolder$1, reason: invalid class name */
    /* synthetic */ class AnonymousClass1 extends C7735q implements Function1<Boolean, Unit> {
        AnonymousClass1(Object obj) {
            super(1, obj, LargeButtonView.class, "setEnabled", "setEnabled(Z)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.f71690a;
        }

        public final void invoke(boolean z11) {
            ((LargeButtonView) this.receiver).setEnabled(z11);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.storefront.widgets.feedback.common.RateMainButtonViewHolder$2, reason: invalid class name */
    /* synthetic */ class AnonymousClass2 extends C7735q implements Function1<AtomAction, Unit> {
        AnonymousClass2(Object obj) {
            super(1, obj, Function1.class, "invoke", "invoke(Ljava/lang/Object;)Ljava/lang/Object;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(AtomAction atomAction) {
            invoke2(atomAction);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(AtomAction p02) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            ((Function1) this.receiver).invoke(p02);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RateMainButtonViewHolder(@NotNull RateViewModel viewModel, @NotNull CommonItemNextStepButtonBinding binding, @NotNull i container, @NotNull c customActionHandlersStore, @NotNull InterfaceC6068e<LinearLayout> viewFactory) {
        super(container, viewFactory);
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(customActionHandlersStore, "customActionHandlersStore");
        Intrinsics.checkNotNullParameter(viewFactory, "viewFactory");
        this.viewModel = viewModel;
        this.binding = binding;
        this.buttonListener = new a(this, 1);
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(container, this).customActionHandlers(new RateMainButtonViewHolder$actionHandler$1(customActionHandlersStore)).buildHandler();
        this.actionHandler = buildHandler;
        viewModel.isButtonEnable().observe(container.Q().g(), new RateMainButtonViewHolder$sam$androidx_lifecycle_Observer$0(new AnonymousClass1(binding.buttonNext)));
        viewModel.getActionTrigger().observe(container.Q().g(), new RateMainButtonViewHolder$sam$androidx_lifecycle_Observer$0(new AnonymousClass2(buildHandler)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buttonListener$lambda$1(RateMainButtonViewHolder rateMainButtonViewHolder, View view) {
        ButtonV3Atom.LargeButton button;
        AtomActionDTO action;
        ButtonV3Atom.LargeButton button2;
        RateMainButtonVO rateMainButtonVO = rateMainButtonViewHolder.currentItem;
        if (rateMainButtonVO == null || (button = rateMainButtonVO.getButton()) == null || (action = button.getAction()) == null) {
            return;
        }
        RateViewModel rateViewModel = rateMainButtonViewHolder.viewModel;
        RateMainButtonVO rateMainButtonVO2 = rateMainButtonViewHolder.currentItem;
        rateViewModel.onNextButtonClick(AtomActionMapperKt.toAtomAction(action, (rateMainButtonVO2 == null || (button2 = rateMainButtonVO2.getButton()) == null) ? null : button2.getTrackingInfo()));
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull RateMainButtonVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.currentItem = item;
        CommonItemNextStepButtonBinding commonItemNextStepButtonBinding = this.binding;
        LargeButtonView buttonNext = commonItemNextStepButtonBinding.buttonNext;
        Intrinsics.checkNotNullExpressionValue(buttonNext, "buttonNext");
        LargeButtonHolderKt.bindOrGone$default(buttonNext, item.getButton(), null, 2, null);
        LargeButtonView largeButtonView = commonItemNextStepButtonBinding.buttonNext;
        Boolean value = this.viewModel.isButtonEnable().getValue();
        largeButtonView.setEnabled(value != null ? value.booleanValue() : false);
        commonItemNextStepButtonBinding.buttonNext.setOnClickListener(this.buttonListener);
        TextAtomView buttonDescription = commonItemNextStepButtonBinding.buttonDescription;
        Intrinsics.checkNotNullExpressionValue(buttonDescription, "buttonDescription");
        TextAtomHolderKt.bindOrGone(buttonDescription, item.getDescription(), this.actionHandler);
    }
}
