package ru.ozon.uni.ozi.components.cell;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import androidx.compose.ui.e;
import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.ozi.components.cell.addons.OziCellCenterScope;
import ru.ozon.uni.ozi.components.cell.addons.OziCellEndScope;
import ru.ozon.uni.ozi.components.cell.addons.OziCellStartScope;
import t0.q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class OziCellKt$BasicCell$13 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ InterfaceC6511n<OziCellCenterScope, InterfaceC3967k, Integer, Unit> $center;
    final /* synthetic */ InterfaceC6511n<OziCellEndScope, InterfaceC3967k, Integer, Unit> $end;
    final /* synthetic */ q $endInteractionSource;
    final /* synthetic */ float $endPadding;
    final /* synthetic */ q $interactionSource;
    final /* synthetic */ boolean $isEnabled;
    final /* synthetic */ e $modifier;
    final /* synthetic */ Function0<Unit> $onClick;
    final /* synthetic */ Function0<Unit> $onEndClick;
    final /* synthetic */ Function0<Unit> $onStartClick;
    final /* synthetic */ float $separatorThickness;
    final /* synthetic */ boolean $showSeparator;
    final /* synthetic */ InterfaceC6511n<OziCellStartScope, InterfaceC3967k, Integer, Unit> $start;
    final /* synthetic */ q $startInteractionSource;
    final /* synthetic */ float $startPadding;
    final /* synthetic */ float $verticalPadding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    OziCellKt$BasicCell$13(e eVar, InterfaceC6511n<? super OziCellStartScope, ? super InterfaceC3967k, ? super Integer, Unit> interfaceC6511n, InterfaceC6511n<? super OziCellCenterScope, ? super InterfaceC3967k, ? super Integer, Unit> interfaceC6511n2, InterfaceC6511n<? super OziCellEndScope, ? super InterfaceC3967k, ? super Integer, Unit> interfaceC6511n3, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, boolean z11, boolean z12, float f7, float f11, float f12, float f13, q qVar, q qVar2, q qVar3, int i11, int i12) {
        super(2);
        this.$modifier = eVar;
        this.$start = interfaceC6511n;
        this.$center = interfaceC6511n2;
        this.$end = interfaceC6511n3;
        this.$onStartClick = function0;
        this.$onEndClick = function02;
        this.$onClick = function03;
        this.$isEnabled = z11;
        this.$showSeparator = z12;
        this.$verticalPadding = f7;
        this.$startPadding = f11;
        this.$endPadding = f12;
        this.$separatorThickness = f13;
        this.$interactionSource = qVar;
        this.$startInteractionSource = qVar2;
        this.$endInteractionSource = qVar3;
        this.$$changed = i11;
        this.$$changed1 = i12;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        OziCellKt.m3071BasicCellzUQEyjg(this.$modifier, this.$start, this.$center, this.$end, this.$onStartClick, this.$onEndClick, this.$onClick, this.$isEnabled, this.$showSeparator, this.$verticalPadding, this.$startPadding, this.$endPadding, this.$separatorThickness, this.$interactionSource, this.$startInteractionSource, this.$endInteractionSource, interfaceC3967k, C2652m.e(this.$$changed | 1), C2652m.e(this.$$changed1));
    }
}
