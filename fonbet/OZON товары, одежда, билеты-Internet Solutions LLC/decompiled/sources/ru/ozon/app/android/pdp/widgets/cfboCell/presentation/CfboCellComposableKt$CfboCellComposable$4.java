package ru.ozon.app.android.pdp.widgets.cfboCell.presentation;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import WZ.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class CfboCellComposableKt$CfboCellComposable$4 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ Function1<AtomAction, Unit> $onClick;
    final /* synthetic */ Function1<t, Unit> $onView;
    final /* synthetic */ CfboCellVI $state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    CfboCellComposableKt$CfboCellComposable$4(CfboCellVI cfboCellVI, Function1<? super t, Unit> function1, Function1<? super AtomAction, Unit> function12, int i11) {
        super(2);
        this.$state = cfboCellVI;
        this.$onView = function1;
        this.$onClick = function12;
        this.$$changed = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        CfboCellComposableKt.CfboCellComposable(this.$state, this.$onView, this.$onClick, interfaceC3967k, C2652m.e(this.$$changed | 1));
    }
}
