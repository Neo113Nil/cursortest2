package ru.ozon.uni.android.ds.compose.component.selectionControls.checkbox;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import androidx.compose.ui.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import t0.q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class DsCheckboxKt$DsCheckbox$5 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ float $cornerRadius;
    final /* synthetic */ q $interactionSource;
    final /* synthetic */ e $modifier;
    final /* synthetic */ Function0<Unit> $onClick;
    final /* synthetic */ Integer $quantity;
    final /* synthetic */ DsCheckboxSize $size;
    final /* synthetic */ DsCheckboxState $state;
    final /* synthetic */ DsCheckboxStatus $status;
    final /* synthetic */ DsCheckboxStyle $style;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DsCheckboxKt$DsCheckbox$5(e eVar, DsCheckboxSize dsCheckboxSize, DsCheckboxStatus dsCheckboxStatus, DsCheckboxState dsCheckboxState, float f7, Integer num, q qVar, DsCheckboxStyle dsCheckboxStyle, Function0<Unit> function0, int i11, int i12) {
        super(2);
        this.$modifier = eVar;
        this.$size = dsCheckboxSize;
        this.$status = dsCheckboxStatus;
        this.$state = dsCheckboxState;
        this.$cornerRadius = f7;
        this.$quantity = num;
        this.$interactionSource = qVar;
        this.$style = dsCheckboxStyle;
        this.$onClick = function0;
        this.$$changed = i11;
        this.$$default = i12;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        DsCheckboxKt.m1773DsCheckboxgNPyAyM(this.$modifier, this.$size, this.$status, this.$state, this.$cornerRadius, this.$quantity, this.$interactionSource, this.$style, this.$onClick, interfaceC3967k, C2652m.e(this.$$changed | 1), this.$$default);
    }
}
