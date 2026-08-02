package ru.ozon.app.android.travel.feature.general.common.widgets.notificationSubscription.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.travel.feature.general.common.widgets.notificationSubscription.presentation.NotificationSubscriptionVO;
import ru.ozon.app.android.travel.feature.general.common.widgets.notificationSubscription.view.NotificationSubscriptionView;
import ru.ozon.uni.atoms.data.selectionControls.checkbox.CheckBoxDTO;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class NotificationSubscriptionWidgetViewHolder$observeLiveData$1 extends AbstractC7737t implements Function1<Unit, Unit> {
    final /* synthetic */ NotificationSubscriptionWidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NotificationSubscriptionWidgetViewHolder$observeLiveData$1(NotificationSubscriptionWidgetViewHolder notificationSubscriptionWidgetViewHolder) {
        super(1);
        this.this$0 = notificationSubscriptionWidgetViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
        invoke2(unit);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Unit unit) {
        CheckBoxDTO checkbox;
        NotificationSubscriptionView notificationSubscriptionView;
        NotificationSubscriptionVO boundData = this.this$0.getBoundData();
        NotificationSubscriptionVO.State state = boundData != null ? boundData.getState() : null;
        NotificationSubscriptionVO.Loaded loaded = state instanceof NotificationSubscriptionVO.Loaded ? (NotificationSubscriptionVO.Loaded) state : null;
        if (loaded == null || (checkbox = loaded.getCheckbox()) == null) {
            return;
        }
        notificationSubscriptionView = this.this$0.containerView;
        notificationSubscriptionView.bindCheckbox(checkbox);
    }
}
