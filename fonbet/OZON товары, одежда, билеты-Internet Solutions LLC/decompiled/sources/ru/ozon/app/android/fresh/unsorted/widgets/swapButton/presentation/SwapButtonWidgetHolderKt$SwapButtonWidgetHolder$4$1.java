package ru.ozon.app.android.fresh.unsorted.widgets.swapButton.presentation;

import S0.A1;
import WZ.l;
import WZ.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.fresh.unsorted.widgets.swapButton.presentation.SwapButtonViewModel;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "atomAction", "Lru/ozon/uni/atoms/af/AtomAction;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class SwapButtonWidgetHolderKt$SwapButtonWidgetHolder$4$1 extends AbstractC7737t implements Function1<AtomAction, Unit> {
    final /* synthetic */ Function1<AtomAction, Unit> $actionHandler;
    final /* synthetic */ t $currentTokenizedEvent;
    final /* synthetic */ A1<SwapButtonViewModel.UiState> $state$delegate;
    final /* synthetic */ l $tokenizedAnalytics;
    final /* synthetic */ SwapButtonViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SwapButtonWidgetHolderKt$SwapButtonWidgetHolder$4$1(t tVar, SwapButtonViewModel swapButtonViewModel, Function1<? super AtomAction, Unit> function1, A1<SwapButtonViewModel.UiState> a12, l lVar) {
        super(1);
        this.$currentTokenizedEvent = tVar;
        this.$viewModel = swapButtonViewModel;
        this.$actionHandler = function1;
        this.$state$delegate = a12;
        this.$tokenizedAnalytics = lVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AtomAction atomAction) {
        invoke2(atomAction);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AtomAction atomAction) {
        SwapButtonViewModel.UiState SwapButtonWidgetHolder_egy_3UM$lambda$0;
        Intrinsics.checkNotNullParameter(atomAction, "atomAction");
        SwapButtonWidgetHolder_egy_3UM$lambda$0 = SwapButtonWidgetHolderKt.SwapButtonWidgetHolder_egy_3UM$lambda$0(this.$state$delegate);
        if (SwapButtonWidgetHolder_egy_3UM$lambda$0.getIsButtonEnabled()) {
            AtomAction.Click click = atomAction instanceof AtomAction.Click ? (AtomAction.Click) atomAction : null;
            if (click == null) {
                return;
            }
            if (!Intrinsics.d(click.getId(), "freshSubscriptionsToStock")) {
                this.$actionHandler.invoke(atomAction);
                return;
            }
            t tVar = this.$currentTokenizedEvent;
            if (tVar != null) {
                TokenizedAnalyticsExtensionsKt.processClickEvents$default(this.$tokenizedAnalytics, tVar, null, 2, null);
            }
            this.$viewModel.onSubscribeClick(click);
        }
    }
}
