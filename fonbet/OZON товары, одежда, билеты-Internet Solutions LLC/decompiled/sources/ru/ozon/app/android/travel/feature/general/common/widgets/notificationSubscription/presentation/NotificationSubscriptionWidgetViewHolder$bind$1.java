package ru.ozon.app.android.travel.feature.general.common.widgets.notificationSubscription.presentation;

import WZ.l;
import WZ.t;
import WZ.x;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.pdp.ui.configurators.analitycs.TokenizedAnalyticsExtKt;
import ru.ozon.app.android.travel.feature.general.common.widgets.notificationSubscription.presentation.NotificationSubscriptionVO;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/uni/atoms/af/AtomAction;", "isChecked", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class NotificationSubscriptionWidgetViewHolder$bind$1 extends AbstractC7737t implements Function2<AtomAction, Boolean, Unit> {
    final /* synthetic */ NotificationSubscriptionVO $item;
    final /* synthetic */ NotificationSubscriptionWidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NotificationSubscriptionWidgetViewHolder$bind$1(NotificationSubscriptionWidgetViewHolder notificationSubscriptionWidgetViewHolder, NotificationSubscriptionVO notificationSubscriptionVO) {
        super(2);
        this.this$0 = notificationSubscriptionWidgetViewHolder;
        this.$item = notificationSubscriptionVO;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(AtomAction atomAction, Boolean bool) {
        invoke(atomAction, bool.booleanValue());
        return Unit.f71690a;
    }

    public final void invoke(AtomAction atomAction, boolean z11) {
        l lVar;
        NotificationSubscriptionViewModel notificationSubscriptionViewModel;
        lVar = this.this$0.tokenizedAnalytics;
        Map<String, TokenizedTrackingInfo> analytics = ((NotificationSubscriptionVO.Loaded) this.$item.getState()).getAnalytics();
        t tVar = null;
        if (analytics != null) {
            NotificationSubscriptionVO boundData = this.this$0.getBoundData();
            Long valueOf = boundData != null ? Long.valueOf(boundData.getId()) : null;
            Intrinsics.checkNotNullParameter(analytics, "<this>");
            tVar = x.b(analytics, valueOf, null);
        }
        TokenizedAnalyticsExtKt.processClickEvents(lVar, tVar);
        notificationSubscriptionViewModel = this.this$0.viewModel;
        notificationSubscriptionViewModel.checkboxClicked(atomAction, z11);
    }
}
