package ru.ozon.uni.android.ds.compose.component.cell;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import androidx.compose.ui.e;
import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import l1.J0;
import ru.ozon.uni.android.ds.compose.component.cell.DsCell;
import t0.q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class DsCellKt$DsCell$14 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ int $$default;
    final /* synthetic */ long $backgroundColor;
    final /* synthetic */ float $bottomPadding;
    final /* synthetic */ InterfaceC6511n<DsCell.CenterScope, InterfaceC3967k, Integer, Unit> $center;
    final /* synthetic */ InterfaceC6511n<DsCell.EndScope, InterfaceC3967k, Integer, Unit> $end;
    final /* synthetic */ q $endInteractionSource;
    final /* synthetic */ long $indicationColor;
    final /* synthetic */ q $interactionSource;
    final /* synthetic */ boolean $isEnabled;
    final /* synthetic */ float $leftPadding;
    final /* synthetic */ e $modifier;
    final /* synthetic */ Function0<Unit> $onClick;
    final /* synthetic */ Function0<Unit> $onEndClick;
    final /* synthetic */ Function0<Unit> $onStartClick;
    final /* synthetic */ float $rightPadding;
    final /* synthetic */ long $separatorColor;
    final /* synthetic */ J0 $shape;
    final /* synthetic */ boolean $showSeparator;
    final /* synthetic */ InterfaceC6511n<DsCell.StartScope, InterfaceC3967k, Integer, Unit> $start;
    final /* synthetic */ q $startInteractionSource;
    final /* synthetic */ float $topPadding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    DsCellKt$DsCell$14(InterfaceC6511n<? super DsCell.CenterScope, ? super InterfaceC3967k, ? super Integer, Unit> interfaceC6511n, e eVar, InterfaceC6511n<? super DsCell.StartScope, ? super InterfaceC3967k, ? super Integer, Unit> interfaceC6511n2, InterfaceC6511n<? super DsCell.EndScope, ? super InterfaceC3967k, ? super Integer, Unit> interfaceC6511n3, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, boolean z11, boolean z12, long j11, long j12, long j13, J0 j02, float f7, float f11, float f12, float f13, q qVar, q qVar2, q qVar3, int i11, int i12, int i13) {
        super(2);
        this.$center = interfaceC6511n;
        this.$modifier = eVar;
        this.$start = interfaceC6511n2;
        this.$end = interfaceC6511n3;
        this.$onStartClick = function0;
        this.$onEndClick = function02;
        this.$onClick = function03;
        this.$isEnabled = z11;
        this.$showSeparator = z12;
        this.$separatorColor = j11;
        this.$backgroundColor = j12;
        this.$indicationColor = j13;
        this.$shape = j02;
        this.$leftPadding = f7;
        this.$topPadding = f11;
        this.$rightPadding = f12;
        this.$bottomPadding = f13;
        this.$interactionSource = qVar;
        this.$startInteractionSource = qVar2;
        this.$endInteractionSource = qVar3;
        this.$$changed = i11;
        this.$$changed1 = i12;
        this.$$default = i13;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        DsCellKt.m1701DsCell0rfeiU(this.$center, this.$modifier, this.$start, this.$end, this.$onStartClick, this.$onEndClick, this.$onClick, this.$isEnabled, this.$showSeparator, this.$separatorColor, this.$backgroundColor, this.$indicationColor, this.$shape, this.$leftPadding, this.$topPadding, this.$rightPadding, this.$bottomPadding, this.$interactionSource, this.$startInteractionSource, this.$endInteractionSource, interfaceC3967k, C2652m.e(this.$$changed | 1), C2652m.e(this.$$changed1), this.$$default);
    }
}
