package ru.ozon.debugMenu.internal.core.ui.widgets.cell;

import B1.U;
import Bl0.C2652m;
import S0.InterfaceC3967k;
import Z1.h;
import androidx.compose.ui.e;
import e1.InterfaceC6250b;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class FoundationCellKt$FoundationCell$4 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ int $$default;
    final /* synthetic */ float $bottomPadding;
    final /* synthetic */ Function2<InterfaceC3967k, Integer, Unit> $center;
    final /* synthetic */ Function2<InterfaceC3967k, Integer, Unit> $end;
    final /* synthetic */ Function2<InterfaceC3967k, Integer, Unit> $endClickHandler;
    final /* synthetic */ float $endPadding;
    final /* synthetic */ Function1<List<? extends List<? extends U>>, List<InterfaceC6250b.c>> $getAlignments;
    final /* synthetic */ Function1<U, h> $getCenterMinWidth;
    final /* synthetic */ e $modifier;
    final /* synthetic */ Function2<InterfaceC3967k, Integer, Unit> $separator;
    final /* synthetic */ Function2<InterfaceC3967k, Integer, Unit> $start;
    final /* synthetic */ Function2<InterfaceC3967k, Integer, Unit> $startClickHandler;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    FoundationCellKt$FoundationCell$4(Function2<? super InterfaceC3967k, ? super Integer, Unit> function2, Function2<? super InterfaceC3967k, ? super Integer, Unit> function22, Function2<? super InterfaceC3967k, ? super Integer, Unit> function23, Function2<? super InterfaceC3967k, ? super Integer, Unit> function24, Function2<? super InterfaceC3967k, ? super Integer, Unit> function25, Function2<? super InterfaceC3967k, ? super Integer, Unit> function26, float f7, float f11, e eVar, Function1<? super List<? extends List<? extends U>>, ? extends List<? extends InterfaceC6250b.c>> function1, Function1<? super U, h> function12, int i11, int i12, int i13) {
        super(2);
        this.$start = function2;
        this.$center = function22;
        this.$end = function23;
        this.$separator = function24;
        this.$startClickHandler = function25;
        this.$endClickHandler = function26;
        this.$bottomPadding = f7;
        this.$endPadding = f11;
        this.$modifier = eVar;
        this.$getAlignments = function1;
        this.$getCenterMinWidth = function12;
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
        FoundationCellKt.m1613FoundationCelleXZ4JBQ(this.$start, this.$center, this.$end, this.$separator, this.$startClickHandler, this.$endClickHandler, this.$bottomPadding, this.$endPadding, this.$modifier, this.$getAlignments, this.$getCenterMinWidth, interfaceC3967k, C2652m.e(this.$$changed | 1), C2652m.e(this.$$changed1), this.$$default);
    }
}
