package ru.ozon.app.android.fresh.unsorted.widgets.swapButton.presentation;

import S0.M;
import S0.N;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LS0/N;", "LS0/M;", "invoke", "(LS0/N;)LS0/M;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes12.dex */
final class SwapButtonWidgetHolderKt$SwapButtonWidgetHolder$3$1 extends AbstractC7737t implements Function1<N, M> {
    final /* synthetic */ SwapButtonViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SwapButtonWidgetHolderKt$SwapButtonWidgetHolder$3$1(SwapButtonViewModel swapButtonViewModel) {
        super(1);
        this.$viewModel = swapButtonViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final M invoke(N DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        final SwapButtonViewModel swapButtonViewModel = this.$viewModel;
        return new M() { // from class: ru.ozon.app.android.fresh.unsorted.widgets.swapButton.presentation.SwapButtonWidgetHolderKt$SwapButtonWidgetHolder$3$1$invoke$$inlined$onDispose$1
            @Override // S0.M
            public void dispose() {
                SwapButtonViewModel.this.onCleared();
            }
        };
    }
}
