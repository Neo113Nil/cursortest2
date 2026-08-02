package ru.ozon.app.android.csma.tips.widgets.tipcourierdetails.presentation.button;

import GZ.g;
import Sc.o;
import android.widget.LinearLayout;
import d20.AbstractC6064a;
import d20.InterfaceC6068e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.csma.tips.databinding.WidgetCourierTipsDetailsNoUiBinding;
import ru.ozon.app.android.csma.tips.widgets.tipcourierdetails.presentation.RemoveDetailsInitState;
import ru.ozon.app.android.csma.tips.widgets.tipcourierdetails.presentation.TipCourierDetailsViewModel;
import ru.ozon.app.android.csma.tips.widgets.tipcourierdetails.presentation.TipsCourierDetailsViewEffect;
import ru.ozon.app.android.payment.ui.createorder.CreateAndPayViewModel;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.v3.containers.SingleAtom;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B=\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001aR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001bR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001cR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001dR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001eR \u0010!\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00140\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lru/ozon/app/android/csma/tips/widgets/tipcourierdetails/presentation/button/TipCourierDetailButtonViewHolder;", "Ld20/a;", "Lru/ozon/app/android/csma/tips/widgets/tipcourierdetails/presentation/button/TipCourierDetailsButtonVI;", "Lru/ozon/app/android/csma/tips/databinding/WidgetCourierTipsDetailsNoUiBinding;", "binding", "Lru/ozon/app/android/csma/tips/widgets/tipcourierdetails/presentation/TipCourierDetailsViewModel;", "viewModel", "Lru/ozon/app/android/payment/ui/createorder/CreateAndPayViewModel;", "createAndPayViewModel", "Ll10/i;", "container", "LGZ/g;", "router", "Ld20/e;", "Landroid/widget/LinearLayout;", "viewFactory", "<init>", "(Lru/ozon/app/android/csma/tips/databinding/WidgetCourierTipsDetailsNoUiBinding;Lru/ozon/app/android/csma/tips/widgets/tipcourierdetails/presentation/TipCourierDetailsViewModel;Lru/ozon/app/android/payment/ui/createorder/CreateAndPayViewModel;Ll10/i;LGZ/g;Ld20/e;)V", "Lru/ozon/app/android/csma/tips/widgets/tipcourierdetails/presentation/TipsCourierDetailsViewEffect;", "effect", "", "trigger", "(Lru/ozon/app/android/csma/tips/widgets/tipcourierdetails/presentation/TipsCourierDetailsViewEffect;)V", "item", "bind", "(Lru/ozon/app/android/csma/tips/widgets/tipcourierdetails/presentation/button/TipCourierDetailsButtonVI;)V", "Lru/ozon/app/android/csma/tips/databinding/WidgetCourierTipsDetailsNoUiBinding;", "Lru/ozon/app/android/csma/tips/widgets/tipcourierdetails/presentation/TipCourierDetailsViewModel;", "Lru/ozon/app/android/payment/ui/createorder/CreateAndPayViewModel;", "Ll10/i;", "LGZ/g;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "tips_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class TipCourierDetailButtonViewHolder extends AbstractC6064a<TipCourierDetailsButtonVI> {

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
    private final TipCourierDetailsViewModel viewModel;

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/uni/atoms/data/AtomDTO;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/uni/atoms/data/AtomDTO;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.csma.tips.widgets.tipcourierdetails.presentation.button.TipCourierDetailButtonViewHolder$1, reason: invalid class name */
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
            SingleAtom singleAtom = TipCourierDetailButtonViewHolder.this.binding.tipActionButton;
            Intrinsics.f(atomDTO);
            SingleAtom.bind$default(singleAtom, atomDTO, false, 2, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/csma/tips/widgets/tipcourierdetails/presentation/TipsCourierDetailsViewEffect;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/csma/tips/widgets/tipcourierdetails/presentation/TipsCourierDetailsViewEffect;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.csma.tips.widgets.tipcourierdetails.presentation.button.TipCourierDetailButtonViewHolder$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function1<TipsCourierDetailsViewEffect, Unit> {
        AnonymousClass2() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(TipsCourierDetailsViewEffect tipsCourierDetailsViewEffect) {
            invoke2(tipsCourierDetailsViewEffect);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(TipsCourierDetailsViewEffect tipsCourierDetailsViewEffect) {
            TipCourierDetailButtonViewHolder tipCourierDetailButtonViewHolder = TipCourierDetailButtonViewHolder.this;
            Intrinsics.f(tipsCourierDetailsViewEffect);
            tipCourierDetailButtonViewHolder.trigger(tipsCourierDetailsViewEffect);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TipCourierDetailButtonViewHolder(@NotNull WidgetCourierTipsDetailsNoUiBinding binding, @NotNull TipCourierDetailsViewModel viewModel, @NotNull CreateAndPayViewModel createAndPayViewModel, @NotNull i container, @NotNull g router, @NotNull InterfaceC6068e<LinearLayout> viewFactory) {
        super(container, viewFactory);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(createAndPayViewModel, "createAndPayViewModel");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(viewFactory, "viewFactory");
        this.binding = binding;
        this.viewModel = viewModel;
        this.createAndPayViewModel = createAndPayViewModel;
        this.container = container;
        this.router = router;
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(container, this).onClick(new TipCourierDetailButtonViewHolder$actionHandler$1(this)).buildHandler();
        this.actionHandler = buildHandler;
        binding.tipActionButton.setOnAction(buildHandler);
        viewModel.getActionButtonData().observe(this, new TipCourierDetailButtonViewHolder$sam$androidx_lifecycle_Observer$0(new AnonymousClass1()));
        viewModel.getViewEffects().observe(this, new TipCourierDetailButtonViewHolder$sam$androidx_lifecycle_Observer$0(new AnonymousClass2()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void trigger(TipsCourierDetailsViewEffect effect) {
        if (effect instanceof TipsCourierDetailsViewEffect.Refresh) {
            InterfaceC7851b.a.a(this.container.M(), ((TipsCourierDetailsViewEffect.Refresh) effect).getLink(), null, null, null, 14);
            return;
        }
        if (effect instanceof TipsCourierDetailsViewEffect.Navigate) {
            this.router.b(((TipsCourierDetailsViewEffect.Navigate) effect).getLink(), 889, U.c());
        } else {
            if (!(effect instanceof TipsCourierDetailsViewEffect.Pay)) {
                throw new o();
            }
            TipsCourierDetailsViewEffect.Pay pay = (TipsCourierDetailsViewEffect.Pay) effect;
            this.createAndPayViewModel.pay(pay.getLink(), pay.getParams(), getTrackingData());
        }
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull TipCourierDetailsButtonVI item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (item.getInitState() != null) {
            this.viewModel.initState(item.getInitState());
            this.container.M().update(new RemoveDetailsInitState());
        }
    }
}
