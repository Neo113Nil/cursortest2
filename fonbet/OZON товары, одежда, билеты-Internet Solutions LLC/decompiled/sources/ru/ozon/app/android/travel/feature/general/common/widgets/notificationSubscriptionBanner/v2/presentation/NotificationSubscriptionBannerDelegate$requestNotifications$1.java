package ru.ozon.app.android.travel.feature.general.common.widgets.notificationSubscriptionBanner.v2.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.permission.PermissionRequest;
import ru.ozon.app.android.travel.feature.general.common.widgets.notificationSubscriptionBanner.v2.presentation.NotificationSubscriptionBannerViewModel;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lru/ozon/app/android/permission/PermissionRequest$Builder;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class NotificationSubscriptionBannerDelegate$requestNotifications$1 extends AbstractC7737t implements Function1<PermissionRequest.Builder, Unit> {
    final /* synthetic */ NotificationSubscriptionBannerDelegate this$0;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.travel.feature.general.common.widgets.notificationSubscriptionBanner.v2.presentation.NotificationSubscriptionBannerDelegate$requestNotifications$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function0<Unit> {
        final /* synthetic */ NotificationSubscriptionBannerDelegate this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(NotificationSubscriptionBannerDelegate notificationSubscriptionBannerDelegate) {
            super(0);
            this.this$0 = notificationSubscriptionBannerDelegate;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            NotificationSubscriptionBannerViewModel notificationSubscriptionBannerViewModel;
            notificationSubscriptionBannerViewModel = this.this$0.viewModel;
            notificationSubscriptionBannerViewModel.onViewIntent(NotificationSubscriptionBannerViewModel.ViewIntent.OnNotificationsTurnedOn.INSTANCE);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.travel.feature.general.common.widgets.notificationSubscriptionBanner.v2.presentation.NotificationSubscriptionBannerDelegate$requestNotifications$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function0<Unit> {
        final /* synthetic */ NotificationSubscriptionBannerDelegate this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(NotificationSubscriptionBannerDelegate notificationSubscriptionBannerDelegate) {
            super(0);
            this.this$0 = notificationSubscriptionBannerDelegate;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            NotificationSubscriptionBannerViewModel notificationSubscriptionBannerViewModel;
            notificationSubscriptionBannerViewModel = this.this$0.viewModel;
            notificationSubscriptionBannerViewModel.onViewIntent(NotificationSubscriptionBannerViewModel.ViewIntent.OnNotificationsRejected.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NotificationSubscriptionBannerDelegate$requestNotifications$1(NotificationSubscriptionBannerDelegate notificationSubscriptionBannerDelegate) {
        super(1);
        this.this$0 = notificationSubscriptionBannerDelegate;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(PermissionRequest.Builder builder) {
        invoke2(builder);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(PermissionRequest.Builder requestPermission) {
        Intrinsics.checkNotNullParameter(requestPermission, "$this$requestPermission");
        requestPermission.permissions("android.permission.POST_NOTIFICATIONS");
        requestPermission.onPermissionGranted(new AnonymousClass1(this.this$0));
        requestPermission.onPermissionDenied(new AnonymousClass2(this.this$0));
    }
}
