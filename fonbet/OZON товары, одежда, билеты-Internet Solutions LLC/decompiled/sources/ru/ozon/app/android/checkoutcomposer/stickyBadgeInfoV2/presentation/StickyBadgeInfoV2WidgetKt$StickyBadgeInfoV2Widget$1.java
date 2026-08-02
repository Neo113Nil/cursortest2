package ru.ozon.app.android.checkoutcomposer.stickyBadgeInfoV2.presentation;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.cart.common.presentation.TotalVisibilityViewModel;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class StickyBadgeInfoV2WidgetKt$StickyBadgeInfoV2Widget$1 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ StickyBadgeInfoV2VO $state;
    final /* synthetic */ TotalVisibilityViewModel $totalVisibilityViewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StickyBadgeInfoV2WidgetKt$StickyBadgeInfoV2Widget$1(StickyBadgeInfoV2VO stickyBadgeInfoV2VO, TotalVisibilityViewModel totalVisibilityViewModel, int i11) {
        super(2);
        this.$state = stickyBadgeInfoV2VO;
        this.$totalVisibilityViewModel = totalVisibilityViewModel;
        this.$$changed = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        StickyBadgeInfoV2WidgetKt.StickyBadgeInfoV2Widget(this.$state, this.$totalVisibilityViewModel, interfaceC3967k, C2652m.e(this.$$changed | 1));
    }
}
