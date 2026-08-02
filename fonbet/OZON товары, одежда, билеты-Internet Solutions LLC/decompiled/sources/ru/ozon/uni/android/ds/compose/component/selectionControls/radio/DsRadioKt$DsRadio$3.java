package ru.ozon.uni.android.ds.compose.component.selectionControls.radio;

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
/* loaded from: classes8.dex */
final class DsRadioKt$DsRadio$3 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ q $interactionSource;
    final /* synthetic */ boolean $isSelected;
    final /* synthetic */ e $modifier;
    final /* synthetic */ Function0<Unit> $onClick;
    final /* synthetic */ DsRadioSize $size;
    final /* synthetic */ DsRadioState $state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DsRadioKt$DsRadio$3(e eVar, DsRadioState dsRadioState, DsRadioSize dsRadioSize, boolean z11, q qVar, Function0<Unit> function0, int i11, int i12) {
        super(2);
        this.$modifier = eVar;
        this.$state = dsRadioState;
        this.$size = dsRadioSize;
        this.$isSelected = z11;
        this.$interactionSource = qVar;
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
        DsRadioKt.DsRadio(this.$modifier, this.$state, this.$size, this.$isSelected, this.$interactionSource, this.$onClick, interfaceC3967k, C2652m.e(this.$$changed | 1), this.$$default);
    }
}
