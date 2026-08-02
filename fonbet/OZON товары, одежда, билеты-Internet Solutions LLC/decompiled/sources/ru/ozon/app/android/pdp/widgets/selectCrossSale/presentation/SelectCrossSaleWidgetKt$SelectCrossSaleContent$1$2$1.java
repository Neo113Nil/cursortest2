package ru.ozon.app.android.pdp.widgets.selectCrossSale.presentation;

import a1.C4912a;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import u0.InterfaceC9894c;
import v0.G;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv0/G;", "", "invoke", "(Lv0/G;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes13.dex */
final class SelectCrossSaleWidgetKt$SelectCrossSaleContent$1$2$1 extends AbstractC7737t implements Function1<G, Unit> {
    final /* synthetic */ Function1<AtomAction, Unit> $actionHandler;
    final /* synthetic */ InterfaceC9894c $boxScope;
    final /* synthetic */ float $horizontalPadding;
    final /* synthetic */ SelectCrossSaleVI $state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SelectCrossSaleWidgetKt$SelectCrossSaleContent$1$2$1(SelectCrossSaleVI selectCrossSaleVI, InterfaceC9894c interfaceC9894c, float f7, Function1<? super AtomAction, Unit> function1) {
        super(1);
        this.$state = selectCrossSaleVI;
        this.$boxScope = interfaceC9894c;
        this.$horizontalPadding = f7;
        this.$actionHandler = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(G g10) {
        invoke2(g10);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(G LazyRow) {
        Intrinsics.checkNotNullParameter(LazyRow, "$this$LazyRow");
        List<CellDTO> cells = this.$state.getCells();
        LazyRow.a(cells.size(), null, new SelectCrossSaleWidgetKt$SelectCrossSaleContent$1$2$1$invoke$$inlined$itemsIndexed$default$2(cells), new C4912a(true, -1091073711, new SelectCrossSaleWidgetKt$SelectCrossSaleContent$1$2$1$invoke$$inlined$itemsIndexed$default$3(cells, this.$state, this.$boxScope, this.$horizontalPadding, this.$actionHandler)));
    }
}
