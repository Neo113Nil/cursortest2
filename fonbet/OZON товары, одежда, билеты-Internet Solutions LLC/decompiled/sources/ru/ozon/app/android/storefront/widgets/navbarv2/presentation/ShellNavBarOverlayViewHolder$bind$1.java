package ru.ozon.app.android.storefront.widgets.navbarv2.presentation;

import WZ.l;
import WZ.m;
import WZ.t;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.storefront.widgets.navbarv2.presentation.vo.ShellNavBarVO;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class ShellNavBarOverlayViewHolder$bind$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ ShellNavBarVO $item;
    final /* synthetic */ ShellNavBarOverlayViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ShellNavBarOverlayViewHolder$bind$1(ShellNavBarVO shellNavBarVO, ShellNavBarOverlayViewHolder shellNavBarOverlayViewHolder) {
        super(0);
        this.$item = shellNavBarVO;
        this.this$0 = shellNavBarOverlayViewHolder;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        t mapToTokenizedEvent$default;
        l lVar;
        Map<String, TokenizedTrackingInfo> trackingInfo = this.$item.getBackIconVO().getBackButtonDTO().getTrackingInfo();
        if (trackingInfo == null || (mapToTokenizedEvent$default = TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, Long.valueOf(this.$item.getId()), null, 2, null)) == null) {
            return;
        }
        lVar = this.this$0.tokenizedAnalytics;
        m.a(lVar, mapToTokenizedEvent$default, null);
    }
}
