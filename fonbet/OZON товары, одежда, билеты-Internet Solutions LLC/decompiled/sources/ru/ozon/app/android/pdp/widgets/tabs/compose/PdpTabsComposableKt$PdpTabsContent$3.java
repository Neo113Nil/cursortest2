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
import v0.I;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class PdpTabsComposableKt$PdpTabsContent$3 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ PdpTabsVO $item;
    final /* synthetic */ Function1<PdpTabsVO.Tab, Unit> $onTabClick;
    final /* synthetic */ Function1<t, Unit> $onView;
    final /* synthetic */ I $scrollState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    PdpTabsComposableKt$PdpTabsContent$3(PdpTabsVO pdpTabsVO, Function1<? super t, Unit> function1, Function1<? super PdpTabsVO.Tab, Unit> function12, I i11, int i12) {
        super(2);
        this.$item = pdpTabsVO;
        this.$onView = function1;
        this.$onTabClick = function12;
        this.$scrollState = i11;
        this.$$changed = i12;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        PdpTabsComposableKt.PdpTabsContent(this.$item, this.$onView, this.$onTabClick, this.$scrollState, interfaceC3967k, C2652m.e(this.$$changed | 1));
    }
}
