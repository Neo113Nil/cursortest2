package ru.ozon.app.android.monetization.widgets.cellHorizontalScroll.presentation.compose;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import WZ.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.monetization.widgets.cellHorizontalScroll.presentation.singleCell.SingleCellHorizontalScrollVI;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class SingleCellHorizontalScrollComposableKt$SingleCellHorizontalScrollComposable$3 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ Function1<AtomAction, Unit> $actionHandler;
    final /* synthetic */ Function2<SingleCellHorizontalScrollVI, t, Unit> $onView;
    final /* synthetic */ SingleCellHorizontalScrollVI $state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SingleCellHorizontalScrollComposableKt$SingleCellHorizontalScrollComposable$3(SingleCellHorizontalScrollVI singleCellHorizontalScrollVI, Function2<? super SingleCellHorizontalScrollVI, ? super t, Unit> function2, Function1<? super AtomAction, Unit> function1, int i11) {
        super(2);
        this.$state = singleCellHorizontalScrollVI;
        this.$onView = function2;
        this.$actionHandler = function1;
        this.$$changed = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        SingleCellHorizontalScrollComposableKt.SingleCellHorizontalScrollComposable(this.$state, this.$onView, this.$actionHandler, interfaceC3967k, C2652m.e(this.$$changed | 1));
    }
}
