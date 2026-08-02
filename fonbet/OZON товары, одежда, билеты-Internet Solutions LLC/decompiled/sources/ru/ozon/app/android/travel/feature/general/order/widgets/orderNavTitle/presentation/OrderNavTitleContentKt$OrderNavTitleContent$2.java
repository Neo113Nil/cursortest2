package ru.ozon.app.android.travel.feature.general.order.widgets.orderNavTitle.presentation;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import l1.C7807Z;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class OrderNavTitleContentKt$OrderNavTitleContent$2 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ OrderNavTitleVO $item;
    final /* synthetic */ C7807Z $subtitleColor;
    final /* synthetic */ C7807Z $titleColor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OrderNavTitleContentKt$OrderNavTitleContent$2(OrderNavTitleVO orderNavTitleVO, C7807Z c7807z, C7807Z c7807z2, int i11) {
        super(2);
        this.$item = orderNavTitleVO;
        this.$titleColor = c7807z;
        this.$subtitleColor = c7807z2;
        this.$$changed = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        OrderNavTitleContentKt.m1309OrderNavTitleContenthtJMNJ8(this.$item, this.$titleColor, this.$subtitleColor, interfaceC3967k, C2652m.e(this.$$changed | 1));
    }
}
