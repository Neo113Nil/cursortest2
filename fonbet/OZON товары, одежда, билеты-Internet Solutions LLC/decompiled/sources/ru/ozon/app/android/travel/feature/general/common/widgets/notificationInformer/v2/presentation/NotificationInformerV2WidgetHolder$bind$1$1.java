package ru.ozon.app.android.travel.feature.general.common.widgets.notificationInformer.v2.presentation;

import WZ.t;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/uni/atoms/af/AtomAction;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class NotificationInformerV2WidgetHolder$bind$1$1 extends AbstractC7737t implements Function1<AtomAction, Unit> {
    final /* synthetic */ NotificationInformerV2VO $item;
    final /* synthetic */ NotificationInformerV2WidgetHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NotificationInformerV2WidgetHolder$bind$1$1(NotificationInformerV2WidgetHolder notificationInformerV2WidgetHolder, NotificationInformerV2VO notificationInformerV2VO) {
        super(1);
        this.this$0 = notificationInformerV2WidgetHolder;
        this.$item = notificationInformerV2VO;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AtomAction atomAction) {
        invoke2(atomAction);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AtomAction it) {
        Function1 function1;
        t mapToTokenizedEvent$default;
        i iVar;
        Intrinsics.checkNotNullParameter(it, "it");
        function1 = this.this$0.actionHandler;
        function1.invoke(it);
        Map<String, TokenizedTrackingInfo> trackingInfo = this.$item.getNotification().getTrackingInfo();
        if (trackingInfo == null || (mapToTokenizedEvent$default = TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, Long.valueOf(this.$item.getId()), null, 2, null)) == null) {
            return;
        }
        iVar = this.this$0.container;
        TokenizedAnalyticsExtensionsKt.processViewEvents$default(iVar.X(), mapToTokenizedEvent$default, null, 2, null);
    }
}
