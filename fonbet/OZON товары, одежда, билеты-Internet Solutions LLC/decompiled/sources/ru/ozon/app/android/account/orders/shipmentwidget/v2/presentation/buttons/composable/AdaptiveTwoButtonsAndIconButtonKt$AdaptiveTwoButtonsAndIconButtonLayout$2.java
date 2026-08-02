package ru.ozon.app.android.account.orders.shipmentwidget.v2.presentation.buttons.composable;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import androidx.compose.ui.e;
import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class AdaptiveTwoButtonsAndIconButtonKt$AdaptiveTwoButtonsAndIconButtonLayout$2 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ InterfaceC6511n<e, InterfaceC3967k, Integer, Unit> $firstButton;
    final /* synthetic */ float $horizontalSpacing;
    final /* synthetic */ Function2<InterfaceC3967k, Integer, Unit> $iconButton;
    final /* synthetic */ e $modifier;
    final /* synthetic */ InterfaceC6511n<e, InterfaceC3967k, Integer, Unit> $secondButton;
    final /* synthetic */ float $verticalSpacing;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    AdaptiveTwoButtonsAndIconButtonKt$AdaptiveTwoButtonsAndIconButtonLayout$2(e eVar, float f7, float f11, InterfaceC6511n<? super e, ? super InterfaceC3967k, ? super Integer, Unit> interfaceC6511n, InterfaceC6511n<? super e, ? super InterfaceC3967k, ? super Integer, Unit> interfaceC6511n2, Function2<? super InterfaceC3967k, ? super Integer, Unit> function2, int i11, int i12) {
        super(2);
        this.$modifier = eVar;
        this.$horizontalSpacing = f7;
        this.$verticalSpacing = f11;
        this.$firstButton = interfaceC6511n;
        this.$secondButton = interfaceC6511n2;
        this.$iconButton = function2;
        this.$$changed = i11;
        this.$$default = i12;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        AdaptiveTwoButtonsAndIconButtonKt.m465AdaptiveTwoButtonsAndIconButtonLayoutZUYZQmM(this.$modifier, this.$horizontalSpacing, this.$verticalSpacing, this.$firstButton, this.$secondButton, this.$iconButton, interfaceC3967k, C2652m.e(this.$$changed | 1), this.$$default);
    }
}
