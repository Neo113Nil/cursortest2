package ru.ozon.uni.android.ds.compose.component.cell;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import e1.InterfaceC6250b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.android.ds.compose.component.cell.DsCell;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class DsCell$Scope$Addon$2 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ Function2<InterfaceC3967k, Integer, Unit> $content;
    final /* synthetic */ DsCell.Scope $tmp0_rcvr;
    final /* synthetic */ InterfaceC6250b.c $verticalAlignment;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    DsCell$Scope$Addon$2(DsCell.Scope scope, InterfaceC6250b.c cVar, Function2<? super InterfaceC3967k, ? super Integer, Unit> function2, int i11, int i12) {
        super(2);
        this.$tmp0_rcvr = scope;
        this.$verticalAlignment = cVar;
        this.$content = function2;
        this.$$changed = i11;
        this.$$default = i12;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        this.$tmp0_rcvr.Addon(this.$verticalAlignment, this.$content, interfaceC3967k, C2652m.e(this.$$changed | 1), this.$$default);
    }
}
