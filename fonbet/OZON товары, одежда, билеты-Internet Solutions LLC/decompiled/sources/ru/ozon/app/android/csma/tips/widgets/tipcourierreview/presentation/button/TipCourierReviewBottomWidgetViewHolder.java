package ru.ozon.app.android.csma.tips.widgets.tipcourierreview.presentation.button;

import GZ.g;
import Sc.o;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import d20.AbstractC6064a;
import d20.InterfaceC6068e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.csma.tips.databinding.WidgetCourierTipsDetailsNoUiBinding;
import ru.ozon.app.android.csma.tips.widgets.tipcourierreview.data.TipCourierReviewDO;
import ru.ozon.app.android.csma.tips.widgets.tipcourierreview.data.TipCourierReviewInitState;
import ru.ozon.app.android.csma.tips.widgets.tipcourierreview.presentation.TipCourierReviewViewModel;
import ru.ozon.app.android.csma.tips.widgets.tipcourierreview.presentation.TipsCourierReviewViewEffect;
import ru.ozon.app.android.payment.ui.createorder.CreateAndPayViewModel;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.v3.containers.SingleAtom;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B=\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001aR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001bR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001cR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001dR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001eR \u0010!\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00140\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lru/ozon/app/android/csma/tips/widgets/tipcourierreview/presentation/button/TipCourierReviewBottomWidgetViewHolder;", "Ld20/a;", "Lru/ozon/app/android/csma/tips/widgets/tipcourierreview/data/TipCourierReviewDO;", "Lru/ozon/app/android/csma/tips/databinding/WidgetCourierTipsDetailsNoUiBinding;", "binding", "Lru/ozon/app/android/csma/tips/widgets/tipcourierreview/presentation/TipCourierReviewViewModel;", "viewModel", "LGZ/g;", "router", "Lru/ozon/app/android/payment/ui/createorder/CreateAndPayViewModel;", "createAndPayViewModel", "Ll10/i;", "container", "Ld20/e;", "Landroid/widget/LinearLayout;", "viewFactory", "<init>", "(Lru/ozon/app/android/csma/tips/databinding/WidgetCourierTipsDetailsNoUiBinding;Lru/ozon/app/android/csma/tips/widgets/tipcourierreview/presentation/TipCourierReviewViewModel;LGZ/g;Lru/ozon/app/android/payment/ui/createorder/CreateAndPayViewModel;Ll10/i;Ld20/e;)V", "Lru/ozon/app/android/csma/tips/widgets/tipcourierreview/presentation/TipsCourierReviewViewEffect;", "viewEffect", "", "trigger", "(Lru/ozon/app/android/csma/tips/widgets/tipcourierreview/presentation/TipsCourierReviewViewEffect;)V", "item", "bind", "(Lru/ozon/app/android/csma/tips/widgets/tipcourierreview/data/TipCourierReviewDO;)V", "Lru/ozon/app/android/csma/tips/databinding/WidgetCourierTipsDetailsNoUiBinding;", "Lru/ozon/app/android/csma/tips/widgets/tipcourierreview/presentation/TipCourierReviewViewModel;", "LGZ/g;", "Lru/ozon/app/android/payment/ui/createorder/CreateAndPayViewModel;", "Ll10/i;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "tips_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class TipCourierReviewBottomWidgetViewHolder extends AbstractC6064a<TipCourierReviewDO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final WidgetCourierTipsDetailsNoUiBinding binding;

    @NotNull
    private final i container;

    @NotNull
    private final CreateAndPayViewModel createAndPayViewModel;

    @NotNull
    private final g router;

    @NotNull
    private final TipCourierReviewViewModel viewModel;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "atom", "Lru/ozon/uni/atoms/data/AtomDTO;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.csma.tips.widgets.tipcourierreview.presentation.button.TipCourierReviewBottomWidgetViewHolder$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<AtomDTO, Unit> {
        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(AtomDTO atomDTO) {
            invoke2(atomDTO);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(AtomDTO atomDTO) {
            if (atomDTO == null) {
                FrameLayout constraintLayout = TipCourierReviewBottomWidgetViewHolder.this.binding.getConstraintLayout();
                Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
                ViewExtKt.hide(constraintLayout);
            } else {
                SingleAtom.bind$default(TipCourierReviewBottomWidgetViewHolder.this.binding.tipActionButton, atomDTO, false, 2, null);
                FrameLayout constraintLayout2 = TipCourierReviewBottomWidgetViewHolder.this.binding.getConstraintLayout();
                Intrinsics.checkNotNullExpressionValue(constraintLayout2, "getRoot(...)");
                ViewExtKt.show(constraintLayout2);
            }
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.csma.tips.widgets.tipcourierreview.presentation.button.TipCourierReviewBottomWidgetViewHolder$2, reason: invalid class name */
    /* synthetic */ class AnonymousClass2 extends C7735q implements Function1<TipsCourierReviewViewEffect, Unit> {
        AnonymousClass2(Object obj) {
            super(1, obj, TipCourierReviewBottomWidgetViewHolder.class, "trigger", "trigger(Lru/ozon/app/android/csma/tips/widgets/tipcourierreview/presentation/TipsCourierReviewViewEffect;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(TipsCourierReviewViewEffect tipsCourierReviewViewEffect) {
            invoke2(tipsCourierReviewViewEffect);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(TipsCourierReviewViewEffect p02) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            ((TipCourierReviewBottomWidgetViewHolder) this.receiver).trigger(p02);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TipCourierReviewBottomWidgetViewHolder(@NotNull WidgetCourierTipsDetailsNoUiBinding binding, @NotNull TipCourierReviewViewModel viewModel, @NotNull g router, @NotNull CreateAndPayViewModel createAndPayViewModel, @NotNull i container, @NotNull InterfaceC6068e<LinearLayout> viewFactory) {
        super(container, viewFactory);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(createAndPayViewModel, "createAndPayViewModel");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(viewFactory, "viewFactory");
        this.binding = binding;
        this.viewModel = viewModel;
        this.router = router;
        this.createAndPayViewModel = createAndPayViewModel;
        this.container = container;
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(container, this).onClick(new TipCourierReviewBottomWidgetViewHolder$actionHandler$1(this)).buildHandler();
        this.actionHandler = buildHandler;
        binding.tipActionButton.setOnAction(buildHandler);
        viewModel.getActionButtonData().observe(this, new TipCourierReviewBottomWidgetViewHolder$sam$androidx_lifecycle_Observer$0(new AnonymousClass1()));
        viewModel.getViewEffects().observe(this, new TipCourierReviewBottomWidgetViewHolder$sam$androidx_lifecycle_Observer$0(new AnonymousClass2(this)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void trigger(TipsCourierReviewViewEffect viewEffect) {
        if (viewEffect instanceof TipsCourierReviewViewEffect.Refresh) {
            InterfaceC7851b.a.a(this.container.M(), ((TipsCourierReviewViewEffect.Refresh) viewEffect).getLink(), null, null, null, 14);
            return;
        }
        if (viewEffect instanceof TipsCourierReviewViewEffect.Navigate) {
            this.router.b(((TipsCourierReviewViewEffect.Navigate) viewEffect).getLink(), 889, U.c());
        } else {
            if (!(viewEffect instanceof TipsCourierReviewViewEffect.Pay)) {
                throw new o();
            }
            TipsCourierReviewViewEffect.Pay pay = (TipsCourierReviewViewEffect.Pay) viewEffect;
            this.createAndPayViewModel.pay(pay.getLink(), pay.getParams(), getTrackingData());
        }
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull TipCourierReviewDO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        TipCourierReviewInitState initState = item.getInitState();
        if (initState != null) {
            this.viewModel.initState(initState);
            this.container.M().update(new RemoveReviewInitState());
        }
    }
}
