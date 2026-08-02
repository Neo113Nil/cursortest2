package ru.ozon.app.android.fresh.unsorted.widgets.swapButton.presentation;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import WZ.l;
import androidx.compose.ui.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import l10.InterfaceC7851b;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class SwapButtonWidgetHolderKt$SwapButtonWidgetHolder$5 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ Function1<AtomAction, Unit> $actionHandler;
    final /* synthetic */ float $buttonPadding;
    final /* synthetic */ InterfaceC7851b $composerController;
    final /* synthetic */ ComposerNavigator $composerNavigator;
    final /* synthetic */ SwapButtonVO $item;
    final /* synthetic */ e $modifier;
    final /* synthetic */ l $tokenizedAnalytics;
    final /* synthetic */ SwapButtonViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SwapButtonWidgetHolderKt$SwapButtonWidgetHolder$5(e eVar, SwapButtonVO swapButtonVO, Function1<? super AtomAction, Unit> function1, SwapButtonViewModel swapButtonViewModel, ComposerNavigator composerNavigator, InterfaceC7851b interfaceC7851b, l lVar, float f7, int i11, int i12) {
        super(2);
        this.$modifier = eVar;
        this.$item = swapButtonVO;
        this.$actionHandler = function1;
        this.$viewModel = swapButtonViewModel;
        this.$composerNavigator = composerNavigator;
        this.$composerController = interfaceC7851b;
        this.$tokenizedAnalytics = lVar;
        this.$buttonPadding = f7;
        this.$$changed = i11;
        this.$$default = i12;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        SwapButtonWidgetHolderKt.m774SwapButtonWidgetHolderegy_3UM(this.$modifier, this.$item, this.$actionHandler, this.$viewModel, this.$composerNavigator, this.$composerController, this.$tokenizedAnalytics, this.$buttonPadding, interfaceC3967k, C2652m.e(this.$$changed | 1), this.$$default);
    }
}
