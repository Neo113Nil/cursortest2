package ru.ozon.uni.android.ds.compose.component.cell;

import S0.InterfaceC3967k;
import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.M;
import ru.ozon.uni.android.ds.compose.component.cell.DsCell;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lru/ozon/uni/android/ds/compose/component/cell/DsCell$StartScope;", "", "invoke", "(Lru/ozon/uni/android/ds/compose/component/cell/DsCell$StartScope;LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes7.dex */
final class DsCellAtomKt$DsCellAtom$4 extends AbstractC7737t implements InterfaceC6511n<DsCell.StartScope, InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ DsCellLocator $cellLocator;
    final /* synthetic */ CellDTO $dto;
    final /* synthetic */ M<AtomDTO> $startControlDto;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DsCellAtomKt$DsCellAtom$4(CellDTO cellDTO, M<AtomDTO> m11, DsCellLocator dsCellLocator) {
        super(3);
        this.$dto = cellDTO;
        this.$startControlDto = m11;
        this.$cellLocator = dsCellLocator;
    }

    @Override // fd.InterfaceC6511n
    public /* bridge */ /* synthetic */ Unit invoke(DsCell.StartScope startScope, InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(startScope, interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(DsCell.StartScope DsCell, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        DsCellLocator dsCellLocator;
        Intrinsics.checkNotNullParameter(DsCell, "$this$DsCell");
        if ((i11 & 6) == 0) {
            i12 = i11 | (interfaceC3967k.n(DsCell) ? 4 : 2);
        } else {
            i12 = i11;
        }
        if ((i12 & 19) == 18 && interfaceC3967k.b()) {
            interfaceC3967k.j();
            return;
        }
        CellDTO.LeftBlock leftBlock = this.$dto.getLeftBlock();
        if (leftBlock == null) {
            return;
        }
        M<AtomDTO> m11 = this.$startControlDto;
        DsCellLocator dsCellLocator2 = this.$cellLocator;
        interfaceC3967k.o(788443604);
        if (!leftBlock.getIsEmpty()) {
            AtomDTO atomDTO = m11.f71787a;
            if (atomDTO != null) {
                AtomDTO atomDTO2 = atomDTO;
                dsCellLocator = dsCellLocator2;
                leftBlock = CellDTO.LeftBlock.copy$default(leftBlock, null, null, null, null, null, null, null, atomDTO2, 127, null);
            } else {
                dsCellLocator = dsCellLocator2;
            }
            DsCellAtomKt.LeftBlock(DsCell, leftBlock, dsCellLocator.getLeftBlock().invoke(), interfaceC3967k, i12 & 14);
        }
        interfaceC3967k.k();
    }
}
