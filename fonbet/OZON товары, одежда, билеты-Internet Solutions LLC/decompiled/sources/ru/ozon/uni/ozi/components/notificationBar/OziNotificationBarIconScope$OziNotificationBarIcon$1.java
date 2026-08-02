package ru.ozon.uni.ozi.components.notificationBar;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import androidx.compose.ui.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import l1.C7807Z;
import q1.AbstractC8972b;
import ru.ozon.uni.ozi.components.icon.OziIconState;
import ru.ozon.uni.ozi.components.icon.presets.OziIconBorder;
import ru.ozon.uni.ozi.components.icon.presets.OziIconShape;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class OziNotificationBarIconScope$OziNotificationBarIcon$1 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ int $$default;
    final /* synthetic */ C7807Z $backgroundColor;
    final /* synthetic */ AbstractC8972b $backgroundImage;
    final /* synthetic */ AbstractC8972b $graphic;
    final /* synthetic */ C7807Z $graphicColor;
    final /* synthetic */ boolean $hasParanja;
    final /* synthetic */ e $modifier;
    final /* synthetic */ OziIconShape $shape;
    final /* synthetic */ boolean $showBackgroundImage;
    final /* synthetic */ OziIconState $state;
    final /* synthetic */ OziNotificationBarIconScope $tmp2_rcvr;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OziNotificationBarIconScope$OziNotificationBarIcon$1(OziNotificationBarIconScope oziNotificationBarIconScope, AbstractC8972b abstractC8972b, e eVar, OziIconState oziIconState, AbstractC8972b abstractC8972b2, OziIconShape oziIconShape, OziIconBorder oziIconBorder, boolean z11, boolean z12, C7807Z c7807z, C7807Z c7807z2, int i11, int i12, int i13) {
        super(2);
        this.$tmp2_rcvr = oziNotificationBarIconScope;
        this.$graphic = abstractC8972b;
        this.$modifier = eVar;
        this.$state = oziIconState;
        this.$backgroundImage = abstractC8972b2;
        this.$shape = oziIconShape;
        this.$showBackgroundImage = z11;
        this.$hasParanja = z12;
        this.$graphicColor = c7807z;
        this.$backgroundColor = c7807z2;
        this.$$changed = i11;
        this.$$changed1 = i12;
        this.$$default = i13;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        this.$tmp2_rcvr.m3122OziNotificationBarIconR_BKmV8(this.$graphic, this.$modifier, this.$state, this.$backgroundImage, this.$shape, null, this.$showBackgroundImage, this.$hasParanja, this.$graphicColor, this.$backgroundColor, interfaceC3967k, C2652m.e(this.$$changed | 1), C2652m.e(this.$$changed1), this.$$default);
    }
}
