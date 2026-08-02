package ru.ozon.app.android.travel.feature.general.main.widgets.unpaidOrderList.presentation;

import WZ.l;
import WZ.t;
import fd.InterfaceC6511n;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0006H\n¢\u0006\u0002\b\t"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/uni/atoms/af/AtomAction;", "tracking", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "time", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class UnpaidOrderListWidgetViewHolder$ordersAdapter$1 extends AbstractC7737t implements InterfaceC6511n<AtomAction, Map<String, ? extends TokenizedTrackingInfo>, String, Unit> {
    final /* synthetic */ UnpaidOrderListWidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UnpaidOrderListWidgetViewHolder$ordersAdapter$1(UnpaidOrderListWidgetViewHolder unpaidOrderListWidgetViewHolder) {
        super(3);
        this.this$0 = unpaidOrderListWidgetViewHolder;
    }

    @Override // fd.InterfaceC6511n
    public /* bridge */ /* synthetic */ Unit invoke(AtomAction atomAction, Map<String, ? extends TokenizedTrackingInfo> map, String str) {
        invoke2(atomAction, (Map<String, TokenizedTrackingInfo>) map, str);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AtomAction action, Map<String, TokenizedTrackingInfo> map, String str) {
        t tVar;
        Function1 function1;
        l lVar;
        Intrinsics.checkNotNullParameter(action, "action");
        if (map != null) {
            UnpaidOrderListVO boundData = this.this$0.getBoundData();
            tVar = TrackingInfoMapperKt.toTokenizedEvent$default(map, boundData != null ? Long.valueOf(boundData.getId()) : null, null, 2, null);
        } else {
            tVar = null;
        }
        if (tVar != null) {
            UnpaidOrderListWidgetViewHolder unpaidOrderListWidgetViewHolder = this.this$0;
            lVar = unpaidOrderListWidgetViewHolder.tokenizedAnalytics;
            TokenizedAnalyticsExtensionsKt.processClickEvents(lVar, tVar, str != null ? unpaidOrderListWidgetViewHolder.getCustomParamsModifier(str) : null);
        }
        function1 = this.this$0.actionHandler;
        function1.invoke(action);
    }
}
