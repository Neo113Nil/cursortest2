package ru.ozon.uni.android.ds.compose.component.cell;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.android.ds.compose.component.cell.DsCell;
import ru.ozon.uni.android.ds.compose.modifier.Locator;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class DsCellAtomKt$CenterBlock$2 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ CellDTO.CenterBlock $blockDto;
    final /* synthetic */ Locator $locator;
    final /* synthetic */ Function1<AtomAction, Unit> $onAction;
    final /* synthetic */ DsCell.CenterScope $this_CenterBlock;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    DsCellAtomKt$CenterBlock$2(DsCell.CenterScope centerScope, CellDTO.CenterBlock centerBlock, Locator locator, Function1<? super AtomAction, Unit> function1, int i11) {
        super(2);
        this.$this_CenterBlock = centerScope;
        this.$blockDto = centerBlock;
        this.$locator = locator;
        this.$onAction = function1;
        this.$$changed = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        DsCellAtomKt.CenterBlock(this.$this_CenterBlock, this.$blockDto, this.$locator, this.$onAction, interfaceC3967k, C2652m.e(this.$$changed | 1));
    }
}
