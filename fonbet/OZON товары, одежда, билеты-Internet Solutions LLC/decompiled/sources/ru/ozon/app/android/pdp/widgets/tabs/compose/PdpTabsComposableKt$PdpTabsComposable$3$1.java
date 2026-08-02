package ru.ozon.app.android.pdp.widgets.tabs.compose;

import WZ.t;
import e3.n;
import e3.o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.pdp.widgets.tabs.presentation.PdpTabsVO;
import ru.ozon.app.android.pdp.widgets.tabs.presentation.PdpTabsViewModel;
import v0.I;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Le3/o;", "Le3/n;", "invoke", "(Le3/o;)Le3/n;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes13.dex */
final class PdpTabsComposableKt$PdpTabsComposable$3$1 extends AbstractC7737t implements Function1<o, n> {
    final /* synthetic */ PdpTabsVO $item;
    final /* synthetic */ Function1<t, Unit> $onView;
    final /* synthetic */ I $scrollState;
    final /* synthetic */ PdpTabsViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    PdpTabsComposableKt$PdpTabsComposable$3$1(PdpTabsVO pdpTabsVO, Function1<? super t, Unit> function1, PdpTabsViewModel pdpTabsViewModel, I i11) {
        super(1);
        this.$item = pdpTabsVO;
        this.$onView = function1;
        this.$viewModel = pdpTabsViewModel;
        this.$scrollState = i11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final n invoke(final o LifecycleResumeEffect) {
        Intrinsics.checkNotNullParameter(LifecycleResumeEffect, "$this$LifecycleResumeEffect");
        t tokenizedEvent = this.$item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            this.$onView.invoke(tokenizedEvent);
        }
        final PdpTabsViewModel pdpTabsViewModel = this.$viewModel;
        final I i11 = this.$scrollState;
        return new n() { // from class: ru.ozon.app.android.pdp.widgets.tabs.compose.PdpTabsComposableKt$PdpTabsComposable$3$1$invoke$$inlined$onPauseOrDispose$1
            @Override // e3.n
            public void runPauseOrOnDisposeEffect() {
                pdpTabsViewModel.saveScroll(i11.o(), i11.p());
            }
        };
    }
}
