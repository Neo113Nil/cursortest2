package ru.ozon.uni.android.ds.compose.component.cell;

import S0.InterfaceC3967k;
import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.M;
import ru.ozon.uni.android.ds.compose.component.cell.DsCell;
import ru.ozon.uni.android.ds.compose.modifier.Locator;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import t0.q;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lru/ozon/uni/android/ds/compose/component/cell/DsCell$EndScope;", "", "invoke", "(Lru/ozon/uni/android/ds/compose/component/cell/DsCell$EndScope;LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes7.dex */
final class DsCellAtomKt$DsCellAtom$5 extends AbstractC7737t implements InterfaceC6511n<DsCell.EndScope, InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ DsCellLocator $cellLocator;
    final /* synthetic */ CellDTO $dto;
    final /* synthetic */ M<AtomDTO> $endControlDto;
    final /* synthetic */ q $interactionSource;
    final /* synthetic */ Function0<Unit> $onClick;
    final /* synthetic */ Function0<Unit> $onEndClick;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DsCellAtomKt$DsCellAtom$5(CellDTO cellDTO, M<AtomDTO> m11, DsCellLocator dsCellLocator, q qVar, Function0<Unit> function0, Function0<Unit> function02) {
        super(3);
        this.$dto = cellDTO;
        this.$endControlDto = m11;
        this.$cellLocator = dsCellLocator;
        this.$interactionSource = qVar;
        this.$onEndClick = function0;
        this.$onClick = function02;
    }

    @Override // fd.InterfaceC6511n
    public /* bridge */ /* synthetic */ Unit invoke(DsCell.EndScope endScope, InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(endScope, interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(DsCell.EndScope DsCell, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        Function0<Unit> function0;
        Function0<Unit> function02;
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
        CellDTO.RightBlock rightBlock = this.$dto.getRightBlock();
        if (rightBlock == null) {
            return;
        }
        M<AtomDTO> m11 = this.$endControlDto;
        DsCellLocator dsCellLocator = this.$cellLocator;
        q qVar = this.$interactionSource;
        Function0<Unit> function03 = this.$onEndClick;
        Function0<Unit> function04 = this.$onClick;
        interfaceC3967k.o(788458935);
        if (!rightBlock.getIsEmpty()) {
            AtomDTO atomDTO = m11.f71787a;
            if (atomDTO != null) {
                AtomDTO atomDTO2 = atomDTO;
                function0 = function03;
                function02 = function04;
                rightBlock = CellDTO.RightBlock.copy$default(rightBlock, null, null, null, null, null, null, null, null, null, null, atomDTO2, null, 3071, null);
            } else {
                function0 = function03;
                function02 = function04;
            }
            Locator invoke = dsCellLocator.getRightBlock().invoke();
            interfaceC3967k.o(1815110691);
            boolean n11 = interfaceC3967k.n(function0) | interfaceC3967k.n(function02);
            Object C11 = interfaceC3967k.C();
            if (n11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new DsCellAtomKt$DsCellAtom$5$1$1$1(function0, function02);
                interfaceC3967k.x(C11);
            }
            interfaceC3967k.k();
            DsCellAtomKt.RightBlock(DsCell, rightBlock, invoke, qVar, (Function0) C11, interfaceC3967k, (i12 & 14) | 3072);
        }
        interfaceC3967k.k();
    }
}
