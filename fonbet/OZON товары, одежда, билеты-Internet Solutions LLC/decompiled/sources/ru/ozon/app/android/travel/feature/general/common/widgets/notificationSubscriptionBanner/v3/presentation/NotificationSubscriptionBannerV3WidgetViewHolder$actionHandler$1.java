package ru.ozon.app.android.travel.feature.general.common.widgets.notificationSubscriptionBanner.v3.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.travel.feature.general.common.widgets.notificationSubscriptionBanner.v3.presentation.NotificationSubscriptionBannerV3ViewModel;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/uni/atoms/af/AtomAction$Click;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class NotificationSubscriptionBannerV3WidgetViewHolder$actionHandler$1 extends AbstractC7737t implements Function1<AtomAction.Click, Unit> {
    final /* synthetic */ NotificationSubscriptionBannerV3WidgetViewHolder this$0;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.travel.feature.general.common.widgets.notificationSubscriptionBanner.v3.presentation.NotificationSubscriptionBannerV3WidgetViewHolder$actionHandler$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function0<Unit> {
        final /* synthetic */ AtomAction.Click $action;
        final /* synthetic */ NotificationSubscriptionBannerV3WidgetViewHolder this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(NotificationSubscriptionBannerV3WidgetViewHolder notificationSubscriptionBannerV3WidgetViewHolder, AtomAction.Click click) {
            super(0);
            this.this$0 = notificationSubscriptionBannerV3WidgetViewHolder;
            this.$action = click;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            NotificationSubscriptionBannerV3ViewModel notificationSubscriptionBannerV3ViewModel;
            notificationSubscriptionBannerV3ViewModel = this.this$0.viewModel;
            notificationSubscriptionBannerV3ViewModel.onViewIntent(new NotificationSubscriptionBannerV3ViewModel.ViewIntent.OnSubscribe(this.$action));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NotificationSubscriptionBannerV3WidgetViewHolder$actionHandler$1(NotificationSubscriptionBannerV3WidgetViewHolder notificationSubscriptionBannerV3WidgetViewHolder) {
        super(1);
        this.this$0 = notificationSubscriptionBannerV3WidgetViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AtomAction.Click click) {
        invoke2(click);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AtomAction.Click action) {
        HandlersInhibitor handlersInhibitor;
        NotificationSubscriptionBannerV3ViewModel notificationSubscriptionBannerV3ViewModel;
        Intrinsics.checkNotNullParameter(action, "action");
        String id2 = action.getId();
        if (Intrinsics.d(id2, "hideWidget")) {
            notificationSubscriptionBannerV3ViewModel = this.this$0.viewModel;
            notificationSubscriptionBannerV3ViewModel.onViewIntent(new NotificationSubscriptionBannerV3ViewModel.ViewIntent.OnHideWidget(action.getLink()));
        } else if (Intrinsics.d(id2, "subscribe")) {
            handlersInhibitor = this.this$0.inhibitor;
            HandlersInhibitor.run$default(handlersInhibitor, 0L, new AnonymousClass1(this.this$0, action), 1, null);
        }
    }
}
