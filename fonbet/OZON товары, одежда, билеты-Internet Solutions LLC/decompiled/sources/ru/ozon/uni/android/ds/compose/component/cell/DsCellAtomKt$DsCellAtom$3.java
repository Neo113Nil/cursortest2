package ru.ozon.uni.android.ds.compose.component.cell;

import S0.InterfaceC3967k;
import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.android.ds.compose.component.cell.DsCell;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lru/ozon/uni/android/ds/compose/component/cell/DsCell$CenterScope;", "", "invoke", "(Lru/ozon/uni/android/ds/compose/component/cell/DsCell$CenterScope;LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes7.dex */
final class DsCellAtomKt$DsCellAtom$3 extends AbstractC7737t implements InterfaceC6511n<DsCell.CenterScope, InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ DsCellLocator $cellLocator;
    final /* synthetic */ CellDTO $dto;
    final /* synthetic */ Function1<AtomAction, Unit> $onAction;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    DsCellAtomKt$DsCellAtom$3(CellDTO cellDTO, DsCellLocator dsCellLocator, Function1<? super AtomAction, Unit> function1) {
        super(3);
        this.$dto = cellDTO;
        this.$cellLocator = dsCellLocator;
        this.$onAction = function1;
    }

    @Override // fd.InterfaceC6511n
    public /* bridge */ /* synthetic */ Unit invoke(DsCell.CenterScope centerScope, InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(centerScope, interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(DsCell.CenterScope DsCell, InterfaceC3967k interfaceC3967k, int i11) {
        Intrinsics.checkNotNullParameter(DsCell, "$this$DsCell");
        if ((i11 & 6) == 0) {
            i11 |= interfaceC3967k.n(DsCell) ? 4 : 2;
        }
        if ((i11 & 19) == 18 && interfaceC3967k.b()) {
            interfaceC3967k.j();
        } else {
            DsCellAtomKt.CenterBlock(DsCell, this.$dto.getCenterBlock(), this.$cellLocator.getCenterBlock().invoke(), this.$onAction, interfaceC3967k, i11 & 14);
        }
    }
}
