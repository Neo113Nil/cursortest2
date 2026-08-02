package ru.ozon.app.android.travel.feature.general.common.widgets.notificationSubscription.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "isChecked", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class NotificationSubscriptionWidgetViewHolder$observeLiveData$2 extends AbstractC7737t implements Function1<Boolean, Unit> {
    final /* synthetic */ NotificationSubscriptionWidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NotificationSubscriptionWidgetViewHolder$observeLiveData$2(NotificationSubscriptionWidgetViewHolder notificationSubscriptionWidgetViewHolder) {
        super(1);
        this.this$0 = notificationSubscriptionWidgetViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke2(bool);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Boolean bool) {
        NotificationSubscriptionWidgetViewHolder notificationSubscriptionWidgetViewHolder = this.this$0;
        Intrinsics.f(bool);
        notificationSubscriptionWidgetViewHolder.updateCheckboxState(bool.booleanValue());
    }
}
