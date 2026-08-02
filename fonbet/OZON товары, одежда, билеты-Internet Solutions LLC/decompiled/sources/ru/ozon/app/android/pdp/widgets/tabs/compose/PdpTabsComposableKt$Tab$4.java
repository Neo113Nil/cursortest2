package ru.ozon.app.android.pdp.widgets.tabs.compose;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import WZ.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.pdp.widgets.tabs.presentation.PdpTabsVO;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class PdpTabsComposableKt$Tab$4 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ PdpTabsVO.Tab $item;
    final /* synthetic */ Function1<PdpTabsVO.Tab, Unit> $onTabClick;
    final /* synthetic */ Function1<t, Unit> $onView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    PdpTabsComposableKt$Tab$4(PdpTabsVO.Tab tab, Function1<? super PdpTabsVO.Tab, Unit> function1, Function1<? super t, Unit> function12, int i11) {
        super(2);
        this.$item = tab;
        this.$onTabClick = function1;
        this.$onView = function12;
        this.$$changed = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        PdpTabsComposableKt.Tab(this.$item, this.$onTabClick, this.$onView, interfaceC3967k, C2652m.e(this.$$changed | 1));
    }
}
