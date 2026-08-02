package ru.ozon.app.android.travel.feature.general.common.widgets.notificationSubscriptionBanner.v2.presentation;

import Ae.B0;
import Ae.C;
import Ae.C2399j;
import Ae.C2408n0;
import Ae.E0;
import Ae.M0;
import Ae.O0;
import Ae.x0;
import B0.A0;
import B90.C2618u;
import Lm0.a;
import Nh.a;
import Sc.o;
import Sc.s;
import Sh.b;
import androidx.lifecycle.w0;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.logger.LoggerExtKt;
import ru.ozon.app.android.platform.notifications.EnableNotificationsSuggestingHandler;
import ru.ozon.app.android.travel.actionhandler.utils.extensions.ActionV2RepositoryError;
import ru.ozon.app.android.travel.feature.general.common.widgets.notificationSubscriptionBanner.v2.presentation.NotificationSubscriptionBannerVO;
import ru.ozon.app.android.travel.logger.TravelActionLogger;
import ru.ozon.app.android.utils.buildUtils.BuildUtils;
import ru.ozon.app.android.utils.dispatcherprovider.CoroutineDispatcherProvider;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import xe.C10727i;
import xe.J;
import ze.h;
import ze.k;

@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001:\u0004=>?@B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011H\u0082@¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0015\u0010\fJ\u0017\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\nH\u0014¢\u0006\u0004\b\u001a\u0010\fJ\u0015\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0013\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001f¢\u0006\u0004\b!\u0010\"J\u0015\u0010#\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010%R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010&R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010'R\u001c\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00110+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020 0+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010-R\u0018\u00100\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u001a\u00104\u001a\b\u0012\u0004\u0012\u000203028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00107\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u00109\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u00108R\u0016\u0010;\u001a\u00020:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<¨\u0006A"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v2/presentation/NotificationSubscriptionBannerViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "actionV2Repository", "Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;", "coroutineDispatcherProvider", "Lru/ozon/app/android/platform/notifications/EnableNotificationsSuggestingHandler;", "enableNotificationsSuggestingHandler", "<init>", "(Lru/ozon/app/android/action/v2/ActionV2Repository;Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;Lru/ozon/app/android/platform/notifications/EnableNotificationsSuggestingHandler;)V", "", "observeViewIntents", "()V", "", "throwable", "onError", "(Ljava/lang/Throwable;)V", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v2/presentation/NotificationSubscriptionBannerViewModel$ViewIntent;", "intent", "reduce", "(Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v2/presentation/NotificationSubscriptionBannerViewModel$ViewIntent;Lkotlin/coroutines/d;)Ljava/lang/Object;", "subscribe", "", "actionName", "callOnHideAction", "(Ljava/lang/String;)V", "onCleared", "LAe/M0;", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v2/presentation/NotificationSubscriptionBannerViewModel$WidgetState;", "getWidgetStateFlow", "()LAe/M0;", "LAe/B0;", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v2/presentation/NotificationSubscriptionBannerViewModel$ViewEffect;", "getViewEffectsSharedFlow", "()LAe/B0;", "onViewIntent", "(Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v2/presentation/NotificationSubscriptionBannerViewModel$ViewIntent;)V", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;", "Lru/ozon/app/android/platform/notifications/EnableNotificationsSuggestingHandler;", "LAe/x0;", "widgetStateFlow", "LAe/x0;", "LAe/w0;", "viewIntents", "LAe/w0;", "viewEffects", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v2/presentation/NotificationSubscriptionBannerVO;", "itemVO", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v2/presentation/NotificationSubscriptionBannerVO;", "Lze/h;", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v2/presentation/NotificationSubscriptionBannerViewModel$NotificationsRequestResult;", "syncChannel", "Lze/h;", "Lxe/J;", "errorExHandler", "Lxe/J;", "loggingExHandler", "", "isWidgetRemoved", "Z", "WidgetState", "ViewEffect", "ViewIntent", "NotificationsRequestResult", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class NotificationSubscriptionBannerViewModel extends w0 {

    @NotNull
    private final ActionV2Repository actionV2Repository;

    @NotNull
    private final CoroutineDispatcherProvider coroutineDispatcherProvider;

    @NotNull
    private final EnableNotificationsSuggestingHandler enableNotificationsSuggestingHandler;

    @NotNull
    private final J errorExHandler;
    private volatile boolean isWidgetRemoved;
    private NotificationSubscriptionBannerVO itemVO;

    @NotNull
    private final J loggingExHandler;

    @NotNull
    private final h<NotificationsRequestResult> syncChannel;

    @NotNull
    private final Ae.w0<ViewEffect> viewEffects;

    @NotNull
    private final Ae.w0<ViewIntent> viewIntents;

    @NotNull
    private final x0<WidgetState> widgetStateFlow;

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\br\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v2/presentation/NotificationSubscriptionBannerViewModel$NotificationsRequestResult;", "", "NotificationsGranted", "NotificationsRejected", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v2/presentation/NotificationSubscriptionBannerViewModel$NotificationsRequestResult$NotificationsGranted;", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v2/presentation/NotificationSubscriptionBannerViewModel$NotificationsRequestResult$NotificationsRejected;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    interface NotificationsRequestResult {

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v2/presentation/NotificationSubscriptionBannerViewModel$NotificationsRequestResult$NotificationsGranted;", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v2/presentation/NotificationSubscriptionBannerViewModel$NotificationsRequestResult;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class NotificationsGranted implements NotificationsRequestResult {

            @NotNull
            public static final NotificationsGranted INSTANCE = new NotificationsGranted();

            private NotificationsGranted() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof NotificationsGranted);
            }

            public int hashCode() {
                return -1765995496;
            }

            @NotNull
            public String toString() {
                return "NotificationsGranted";
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v2/presentation/NotificationSubscriptionBannerViewModel$NotificationsRequestResult$NotificationsRejected;", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v2/presentation/NotificationSubscriptionBannerViewModel$NotificationsRequestResult;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class NotificationsRejected implements NotificationsRequestResult {

            @NotNull
            public static final NotificationsRejected INSTANCE = new NotificationsRejected();

            private NotificationsRejected() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof NotificationsRejected);
            }

            public int hashCode() {
                return 381004481;
            }

            @NotNull
            public String toString() {
                return "NotificationsRejected";
            }
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v2/presentation/NotificationSubscriptionBannerViewModel$ViewEffect;", "", "ShowNetworkError", "RequestNotifications", "OpenSettings", "CheckNotifications", "ShowRationale", "RemoveWidget", "ShowNotification", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v2/presentation/NotificationSubscriptionBannerViewModel$ViewEffect$CheckNotifications;", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v2/presentation/NotificationSubscriptionBannerViewModel$ViewEffect$OpenSettings;", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v2/presentation/NotificationSubscriptionBannerViewModel$ViewEffect$RemoveWidget;", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v2/presentation/NotificationSubscriptionBannerViewModel$ViewEffect$RequestNotifications;", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v2/presentation/NotificationSubscriptionBannerViewModel$ViewEffect$ShowNetworkError;", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v2/presentation/NotificationSubscriptionBannerViewModel$ViewEffect$ShowNotification;", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v2/presentation/NotificationSubscriptionBannerViewModel$ViewEffect$ShowRationale;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface ViewEffect {

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0003\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v2/presentation/NotificationSubscriptionBannerViewModel$ViewEffect$CheckNotifications;", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v2/presentation/NotificationSubscriptionBannerViewModel$ViewEffect;", "", "isPermissionForApiMoreThan32Requested", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "()Z", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class CheckNotifications implements ViewEffect {
            private final boolean isPermissionForApiMoreThan32Requested;

            public CheckNotifications(boolean z11) {
                this.isPermissionForApiMoreThan32Requested = z11;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof CheckNotifications) && this.isPermissionForApiMoreThan32Requested == ((CheckNotifications) other).isPermissionForApiMoreThan32Requested;
            }

            public int hashCode() {
                return Boolean.hashCode(this.isPermissionForApiMoreThan32Requested);
            }

            /* renamed from: isPermissionForApiMoreThan32Requested, reason: from getter */
            public final boolean getIsPermissionForApiMoreThan32Requested() {
                return this.isPermissionForApiMoreThan32Requested;
            }

            @NotNull
            public String toString() {
                return C2618u.g("CheckNotifications(isPermissionForApiMoreThan32Requested=", ")", this.isPermissionForApiMoreThan32Requested);
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v2/presentation/NotificationSubscriptionBannerViewModel$ViewEffect$OpenSettings;", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v2/presentation/NotificationSubscriptionBannerViewModel$ViewEffect;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class OpenSettings implements ViewEffect {

            @NotNull
            public static final OpenSettings INSTANCE = new OpenSettings();

            private OpenSettings() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof OpenSettings);
            }

            public int hashCode() {
                return -2022187232;
            }

            @NotNull
            public String toString() {
                return "OpenSettings";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v2/presentation/NotificationSubscriptionBannerViewModel$ViewEffect$RemoveWidget;", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v2/presentation/NotificationSubscriptionBannerViewModel$ViewEffect;", "", "widgetId", "<init>", "(J)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getWidgetId", "()J", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class RemoveWidget implements ViewEffect {
            private final long widgetId;

            public RemoveWidget(long j11) {
                this.widgetId = j11;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof RemoveWidget) && this.widgetId == ((RemoveWidget) other).widgetId;
            }

            public final long getWidgetId() {
                return this.widgetId;
            }

            public int hashCode() {
                return Long.hashCode(this.widgetId);
            }

            @NotNull
            public String toString() {
                return b.b(this.widgetId, "RemoveWidget(widgetId=", ")");
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v2/presentation/NotificationSubscriptionBannerViewModel$ViewEffect$RequestNotifications;", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v2/presentation/NotificationSubscriptionBannerViewModel$ViewEffect;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class RequestNotifications implements ViewEffect {

            @NotNull
            public static final RequestNotifications INSTANCE = new RequestNotifications();

            private RequestNotifications() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof RequestNotifications);
            }

            public int hashCode() {
                return -1179520468;
            }

            @NotNull
            public String toString() {
                return "RequestNotifications";
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v2/presentation/NotificationSubscriptionBannerViewModel$ViewEffect$ShowNetworkError;", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v2/presentation/NotificationSubscriptionBannerViewModel$ViewEffect;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ShowNetworkError implements ViewEffect {

            @NotNull
            public static final ShowNetworkError INSTANCE = new ShowNetworkError();

            private ShowNetworkError() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof ShowNetworkError);
            }

            public int hashCode() {
                return 110776618;
            }

            @NotNull
            public String toString() {
                return "ShowNetworkError";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v2/presentation/NotificationSubscriptionBannerViewModel$ViewEffect$ShowNotification;", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v2/presentation/NotificationSubscriptionBannerViewModel$ViewEffect;", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "notification", "<init>", "(Lru/ozon/uni/atoms/data/notification/NotificationDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "getNotification", "()Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ShowNotification implements ViewEffect {
            public static final int $stable = NotificationDTO.$stable;

            @NotNull
            private final NotificationDTO notification;

            public ShowNotification(@NotNull NotificationDTO notification) {
                Intrinsics.checkNotNullParameter(notification, "notification");
                this.notification = notification;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ShowNotification) && Intrinsics.d(this.notification, ((ShowNotification) other).notification);
            }

            @NotNull
            public final NotificationDTO getNotification() {
                return this.notification;
            }

            public int hashCode() {
                return this.notification.hashCode();
            }

            @NotNull
            public String toString() {
                return a.e("ShowNotification(notification=", ")", this.notification);
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v2/presentation/NotificationSubscriptionBannerViewModel$ViewEffect$ShowRationale;", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v2/presentation/NotificationSubscriptionBannerViewModel$ViewEffect;", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v2/presentation/NotificationSubscriptionBannerVO$RationaleDialog;", "dialog", "<init>", "(Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v2/presentation/NotificationSubscriptionBannerVO$RationaleDialog;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v2/presentation/NotificationSubscriptionBannerVO$RationaleDialog;", "getDialog", "()Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v2/presentation/NotificationSubscriptionBannerVO$RationaleDialog;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ShowRationale implements ViewEffect {

            @NotNull
            private final NotificationSubscriptionBannerVO.RationaleDialog dialog;

            public ShowRationale(@NotNull NotificationSubscriptionBannerVO.RationaleDialog dialog) {
                Intrinsics.checkNotNullParameter(dialog, "dialog");
                this.dialog = dialog;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ShowRationale) && Intrinsics.d(this.dialog, ((ShowRationale) other).dialog);
            }

            @NotNull
            public final NotificationSubscriptionBannerVO.RationaleDialog getDialog() {
                return this.dialog;
            }

            public int hashCode() {
                return this.dialog.hashCode();
            }

            @NotNull
            public String toString() {
                return "ShowRationale(dialog=" + this.dialog + ")";
            }
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v2/presentation/NotificationSubscriptionBannerViewModel$ViewIntent;", "", "OnSubscribe", "OnNotificationsTurnedOn", "OnNotificationsRejected", "OnSettingsRequested", "OnHideWidget", "OnNewState", "OnNotificationsTurnedOff", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v2/presentation/NotificationSubscriptionBannerViewModel$ViewIntent$OnHideWidget;", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v2/presentation/NotificationSubscriptionBannerViewModel$ViewIntent$OnNewState;", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v2/presentation/NotificationSubscriptionBannerViewModel$ViewIntent$OnNotificationsRejected;", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v2/presentation/NotificationSubscriptionBannerViewModel$ViewIntent$OnNotificationsTurnedOff;", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v2/presentation/NotificationSubscriptionBannerViewModel$ViewIntent$OnNotificationsTurnedOn;", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v2/presentation/NotificationSubscriptionBannerViewModel$ViewIntent$OnSettingsRequested;", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v2/presentation/NotificationSubscriptionBannerViewModel$ViewIntent$OnSubscribe;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface ViewIntent {

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0007¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v2/presentation/NotificationSubscriptionBannerViewModel$ViewIntent$OnHideWidget;", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v2/presentation/NotificationSubscriptionBannerViewModel$ViewIntent;", "", "onHideComposerActionName", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getOnHideComposerActionName", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class OnHideWidget implements ViewIntent {
            private final String onHideComposerActionName;

            public OnHideWidget(String str) {
                this.onHideComposerActionName = str;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof OnHideWidget) && Intrinsics.d(this.onHideComposerActionName, ((OnHideWidget) other).onHideComposerActionName);
            }

            public final String getOnHideComposerActionName() {
                return this.onHideComposerActionName;
            }

            public int hashCode() {
                String str = this.onHideComposerActionName;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            @NotNull
            public String toString() {
                return A0.b("OnHideWidget(onHideComposerActionName=", this.onHideComposerActionName, ")");
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v2/presentation/NotificationSubscriptionBannerViewModel$ViewIntent$OnNewState;", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v2/presentation/NotificationSubscriptionBannerViewModel$ViewIntent;", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v2/presentation/NotificationSubscriptionBannerVO;", "itemVO", "<init>", "(Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v2/presentation/NotificationSubscriptionBannerVO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v2/presentation/NotificationSubscriptionBannerVO;", "getItemVO", "()Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v2/presentation/NotificationSubscriptionBannerVO;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class OnNewState implements ViewIntent {

            @NotNull
            private final NotificationSubscriptionBannerVO itemVO;

            public OnNewState(@NotNull NotificationSubscriptionBannerVO itemVO) {
                Intrinsics.checkNotNullParameter(itemVO, "itemVO");
                this.itemVO = itemVO;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof OnNewState) && Intrinsics.d(this.itemVO, ((OnNewState) other).itemVO);
            }

            @NotNull
            public final NotificationSubscriptionBannerVO getItemVO() {
                return this.itemVO;
            }

            public int hashCode() {
                return this.itemVO.hashCode();
            }

            @NotNull
            public String toString() {
                return "OnNewState(itemVO=" + this.itemVO + ")";
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v2/presentation/NotificationSubscriptionBannerViewModel$ViewIntent$OnNotificationsRejected;", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v2/presentation/NotificationSubscriptionBannerViewModel$ViewIntent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class OnNotificationsRejected implements ViewIntent {

            @NotNull
            public static final OnNotificationsRejected INSTANCE = new OnNotificationsRejected();

            private OnNotificationsRejected() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof OnNotificationsRejected);
            }

            public int hashCode() {
                return -1421567873;
            }

            @NotNull
            public String toString() {
                return "OnNotificationsRejected";
            }
        }

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v2/presentation/NotificationSubscriptionBannerViewModel$ViewIntent$OnNotificationsTurnedOff;", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v2/presentation/NotificationSubscriptionBannerViewModel$ViewIntent;", "", "shouldShowRationale", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getShouldShowRationale", "()Z", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class OnNotificationsTurnedOff implements ViewIntent {
            private final boolean shouldShowRationale;

            public OnNotificationsTurnedOff(boolean z11) {
                this.shouldShowRationale = z11;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof OnNotificationsTurnedOff) && this.shouldShowRationale == ((OnNotificationsTurnedOff) other).shouldShowRationale;
            }

            public final boolean getShouldShowRationale() {
                return this.shouldShowRationale;
            }

            public int hashCode() {
                return Boolean.hashCode(this.shouldShowRationale);
            }

            @NotNull
            public String toString() {
                return C2618u.g("OnNotificationsTurnedOff(shouldShowRationale=", ")", this.shouldShowRationale);
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v2/presentation/NotificationSubscriptionBannerViewModel$ViewIntent$OnNotificationsTurnedOn;", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v2/presentation/NotificationSubscriptionBannerViewModel$ViewIntent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class OnNotificationsTurnedOn implements ViewIntent {

            @NotNull
            public static final OnNotificationsTurnedOn INSTANCE = new OnNotificationsTurnedOn();

            private OnNotificationsTurnedOn() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof OnNotificationsTurnedOn);
            }

            public int hashCode() {
                return -678369060;
            }

            @NotNull
            public String toString() {
                return "OnNotificationsTurnedOn";
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v2/presentation/NotificationSubscriptionBannerViewModel$ViewIntent$OnSettingsRequested;", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v2/presentation/NotificationSubscriptionBannerViewModel$ViewIntent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class OnSettingsRequested implements ViewIntent {

            @NotNull
            public static final OnSettingsRequested INSTANCE = new OnSettingsRequested();

            private OnSettingsRequested() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof OnSettingsRequested);
            }

            public int hashCode() {
                return 2058111492;
            }

            @NotNull
            public String toString() {
                return "OnSettingsRequested";
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v2/presentation/NotificationSubscriptionBannerViewModel$ViewIntent$OnSubscribe;", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v2/presentation/NotificationSubscriptionBannerViewModel$ViewIntent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class OnSubscribe implements ViewIntent {

            @NotNull
            public static final OnSubscribe INSTANCE = new OnSubscribe();

            private OnSubscribe() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof OnSubscribe);
            }

            public int hashCode() {
                return -1975927357;
            }

            @NotNull
            public String toString() {
                return "OnSubscribe";
            }
        }
    }

    public NotificationSubscriptionBannerViewModel(@NotNull ActionV2Repository actionV2Repository, @NotNull CoroutineDispatcherProvider coroutineDispatcherProvider, @NotNull EnableNotificationsSuggestingHandler enableNotificationsSuggestingHandler) {
        Intrinsics.checkNotNullParameter(actionV2Repository, "actionV2Repository");
        Intrinsics.checkNotNullParameter(coroutineDispatcherProvider, "coroutineDispatcherProvider");
        Intrinsics.checkNotNullParameter(enableNotificationsSuggestingHandler, "enableNotificationsSuggestingHandler");
        this.actionV2Repository = actionV2Repository;
        this.coroutineDispatcherProvider = coroutineDispatcherProvider;
        this.enableNotificationsSuggestingHandler = enableNotificationsSuggestingHandler;
        this.widgetStateFlow = O0.a(null);
        this.viewIntents = E0.b(0, 0, null, 7);
        this.viewEffects = E0.b(0, 0, null, 7);
        this.syncChannel = k.a(-1, 6, null);
        J.a aVar = J.f105405n0;
        this.errorExHandler = new NotificationSubscriptionBannerViewModel$special$$inlined$CoroutineExceptionHandler$1(aVar, this);
        this.loggingExHandler = new NotificationSubscriptionBannerViewModel$special$$inlined$CoroutineExceptionHandler$2(aVar);
        observeViewIntents();
    }

    private final void callOnHideAction(String actionName) {
        C10727i.c(androidx.lifecycle.x0.a(this), this.coroutineDispatcherProvider.getIO().plus(this.loggingExHandler), null, new NotificationSubscriptionBannerViewModel$callOnHideAction$1(this, actionName, null), 2);
    }

    private final void observeViewIntents() {
        C2399j.C(new C(new C2408n0(this.viewIntents, new NotificationSubscriptionBannerViewModel$observeViewIntents$1(this, null)), new NotificationSubscriptionBannerViewModel$observeViewIntents$2(this, null)), androidx.lifecycle.x0.a(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onError(Throwable throwable) {
        Throwable th2;
        if (throwable instanceof ActionV2RepositoryError) {
            TravelActionLogger.INSTANCE.logException(throwable, "travel_notificationSubscriptionBanner_onError");
            th2 = throwable;
        } else {
            th2 = throwable;
            LoggerExtKt.sendNonFatal$default(th2, null, "travel_notificationSubscriptionBanner_onError", null, 10, null);
        }
        BuildUtils buildUtils = BuildUtils.INSTANCE;
        if (buildUtils.isQaFlavor() || buildUtils.isDebug()) {
            a.b bVar = Lm0.a.f17149a;
            bVar.b("travel_notificationSubscriptionBanner_onError");
            bVar.e(th2);
        }
        C10727i.c(androidx.lifecycle.x0.a(this), null, null, new NotificationSubscriptionBannerViewModel$onError$1(this, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(7:0|1|(2:3|(4:5|6|7|8))|88|6|7|8) */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a0, code lost:
    
        if (r8.emit(r4, r0) == r1) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00e9, code lost:
    
        if (r7.n(r8, r0) == r1) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0102, code lost:
    
        if (r7.n(r8, r0) == r1) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x012f, code lost:
    
        if (r8.emit(r2, r0) == r1) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x016d, code lost:
    
        if (r7.emit(r8, r0) == r1) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x004c, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x00ed, code lost:
    
        Lm0.a.f17149a.e(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0044, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0105, code lost:
    
        Lm0.a.f17149a.e(r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003f A[Catch: q -> 0x0044, TRY_ENTER, TRY_LEAVE, TryCatch #1 {q -> 0x0044, blocks: (B:20:0x003f, B:63:0x00f7), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0047 A[Catch: q -> 0x004c, TRY_ENTER, TRY_LEAVE, TryCatch #0 {q -> 0x004c, blocks: (B:23:0x0047, B:59:0x00df), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object reduce(ViewIntent viewIntent, d<? super Unit> dVar) {
        NotificationSubscriptionBannerViewModel$reduce$1 notificationSubscriptionBannerViewModel$reduce$1;
        NotificationSubscriptionBannerViewModel notificationSubscriptionBannerViewModel;
        NotificationSubscriptionBannerVO.RationaleDialog dialog;
        ButtonV3DTO subscribeButton;
        NotificationSubscriptionBannerViewModel notificationSubscriptionBannerViewModel2;
        ButtonV3DTO subscribeButton2;
        String onHideComposerActionName;
        if (dVar instanceof NotificationSubscriptionBannerViewModel$reduce$1) {
            notificationSubscriptionBannerViewModel$reduce$1 = (NotificationSubscriptionBannerViewModel$reduce$1) dVar;
            int i11 = notificationSubscriptionBannerViewModel$reduce$1.label;
            if ((i11 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                notificationSubscriptionBannerViewModel$reduce$1.label = i11 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = notificationSubscriptionBannerViewModel$reduce$1.result;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i12 = 2;
                DefaultConstructorMarker defaultConstructorMarker = null;
                switch (notificationSubscriptionBannerViewModel$reduce$1.label) {
                    case 0:
                        s.b(obj);
                        if (!(viewIntent instanceof ViewIntent.OnNewState)) {
                            if (viewIntent instanceof ViewIntent.OnHideWidget) {
                                NotificationSubscriptionBannerVO notificationSubscriptionBannerVO = this.itemVO;
                                if (notificationSubscriptionBannerVO != null) {
                                    long id2 = notificationSubscriptionBannerVO.getId();
                                    Ae.w0<ViewEffect> w0Var = this.viewEffects;
                                    ViewEffect.RemoveWidget removeWidget = new ViewEffect.RemoveWidget(id2);
                                    notificationSubscriptionBannerViewModel$reduce$1.L$0 = this;
                                    notificationSubscriptionBannerViewModel$reduce$1.L$1 = viewIntent;
                                    notificationSubscriptionBannerViewModel$reduce$1.label = 1;
                                    break;
                                }
                                notificationSubscriptionBannerViewModel2 = this;
                                notificationSubscriptionBannerViewModel2.isWidgetRemoved = true;
                                onHideComposerActionName = ((ViewIntent.OnHideWidget) viewIntent).getOnHideComposerActionName();
                                if (onHideComposerActionName != null) {
                                    notificationSubscriptionBannerViewModel2.callOnHideAction(onHideComposerActionName);
                                }
                            } else if (viewIntent instanceof ViewIntent.OnSubscribe) {
                                NotificationSubscriptionBannerVO notificationSubscriptionBannerVO2 = this.itemVO;
                                if (notificationSubscriptionBannerVO2 != null && (subscribeButton = notificationSubscriptionBannerVO2.getSubscribeButton()) != null) {
                                    x0<WidgetState> x0Var = this.widgetStateFlow;
                                    while (!x0Var.b(x0Var.getValue(), new WidgetState(subscribeButton, true))) {
                                    }
                                }
                                subscribe();
                            } else if (viewIntent instanceof ViewIntent.OnNotificationsTurnedOn) {
                                h<NotificationsRequestResult> hVar = this.syncChannel;
                                NotificationsRequestResult.NotificationsGranted notificationsGranted = NotificationsRequestResult.NotificationsGranted.INSTANCE;
                                notificationSubscriptionBannerViewModel$reduce$1.label = 2;
                                break;
                            } else if (viewIntent instanceof ViewIntent.OnNotificationsRejected) {
                                h<NotificationsRequestResult> hVar2 = this.syncChannel;
                                NotificationsRequestResult.NotificationsRejected notificationsRejected = NotificationsRequestResult.NotificationsRejected.INSTANCE;
                                notificationSubscriptionBannerViewModel$reduce$1.label = 3;
                                break;
                            } else if (viewIntent instanceof ViewIntent.OnNotificationsTurnedOff) {
                                if (((ViewIntent.OnNotificationsTurnedOff) viewIntent).getShouldShowRationale()) {
                                    NotificationSubscriptionBannerVO notificationSubscriptionBannerVO3 = this.itemVO;
                                    if (notificationSubscriptionBannerVO3 != null && (dialog = notificationSubscriptionBannerVO3.getDialog()) != null) {
                                        Ae.w0<ViewEffect> w0Var2 = this.viewEffects;
                                        ViewEffect.ShowRationale showRationale = new ViewEffect.ShowRationale(dialog);
                                        notificationSubscriptionBannerViewModel$reduce$1.label = 4;
                                        break;
                                    }
                                } else {
                                    Ae.w0<ViewEffect> w0Var3 = this.viewEffects;
                                    ViewEffect.RequestNotifications requestNotifications = ViewEffect.RequestNotifications.INSTANCE;
                                    notificationSubscriptionBannerViewModel$reduce$1.L$0 = this;
                                    notificationSubscriptionBannerViewModel$reduce$1.label = 5;
                                    if (w0Var3.emit(requestNotifications, notificationSubscriptionBannerViewModel$reduce$1) != aVar) {
                                        notificationSubscriptionBannerViewModel = this;
                                        C10727i.c(androidx.lifecycle.x0.a(notificationSubscriptionBannerViewModel), notificationSubscriptionBannerViewModel.coroutineDispatcherProvider.getIO().plus(notificationSubscriptionBannerViewModel.loggingExHandler), null, new NotificationSubscriptionBannerViewModel$reduce$7(notificationSubscriptionBannerViewModel, null), 2);
                                    }
                                }
                            } else {
                                if (!(viewIntent instanceof ViewIntent.OnSettingsRequested)) {
                                    throw new o();
                                }
                                Ae.w0<ViewEffect> w0Var4 = this.viewEffects;
                                ViewEffect.OpenSettings openSettings = ViewEffect.OpenSettings.INSTANCE;
                                notificationSubscriptionBannerViewModel$reduce$1.label = 6;
                                break;
                            }
                            return aVar;
                        }
                        this.itemVO = ((ViewIntent.OnNewState) viewIntent).getItemVO();
                        boolean z11 = false;
                        this.isWidgetRemoved = false;
                        NotificationSubscriptionBannerVO notificationSubscriptionBannerVO4 = this.itemVO;
                        if (notificationSubscriptionBannerVO4 != null && (subscribeButton2 = notificationSubscriptionBannerVO4.getSubscribeButton()) != null) {
                            this.widgetStateFlow.b(null, new WidgetState(subscribeButton2, z11, i12, defaultConstructorMarker));
                        }
                        return Unit.f71690a;
                    case 1:
                        viewIntent = (ViewIntent) notificationSubscriptionBannerViewModel$reduce$1.L$1;
                        notificationSubscriptionBannerViewModel2 = (NotificationSubscriptionBannerViewModel) notificationSubscriptionBannerViewModel$reduce$1.L$0;
                        s.b(obj);
                        notificationSubscriptionBannerViewModel2.isWidgetRemoved = true;
                        onHideComposerActionName = ((ViewIntent.OnHideWidget) viewIntent).getOnHideComposerActionName();
                        if (onHideComposerActionName != null) {
                        }
                        return Unit.f71690a;
                    case 2:
                        s.b(obj);
                        return Unit.f71690a;
                    case 3:
                        s.b(obj);
                        return Unit.f71690a;
                    case 4:
                        s.b(obj);
                        return Unit.f71690a;
                    case 5:
                        notificationSubscriptionBannerViewModel = (NotificationSubscriptionBannerViewModel) notificationSubscriptionBannerViewModel$reduce$1.L$0;
                        s.b(obj);
                        C10727i.c(androidx.lifecycle.x0.a(notificationSubscriptionBannerViewModel), notificationSubscriptionBannerViewModel.coroutineDispatcherProvider.getIO().plus(notificationSubscriptionBannerViewModel.loggingExHandler), null, new NotificationSubscriptionBannerViewModel$reduce$7(notificationSubscriptionBannerViewModel, null), 2);
                        return Unit.f71690a;
                    case 6:
                        s.b(obj);
                        return Unit.f71690a;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        notificationSubscriptionBannerViewModel$reduce$1 = new NotificationSubscriptionBannerViewModel$reduce$1(this, dVar);
        Object obj2 = notificationSubscriptionBannerViewModel$reduce$1.result;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        int i122 = 2;
        DefaultConstructorMarker defaultConstructorMarker2 = null;
        switch (notificationSubscriptionBannerViewModel$reduce$1.label) {
        }
    }

    private final void subscribe() {
        NotificationSubscriptionBannerVO notificationSubscriptionBannerVO = this.itemVO;
        if (notificationSubscriptionBannerVO == null) {
            return;
        }
        C10727i.c(androidx.lifecycle.x0.a(this), this.coroutineDispatcherProvider.getIO().plus(this.errorExHandler), null, new NotificationSubscriptionBannerViewModel$subscribe$1(this, notificationSubscriptionBannerVO, null), 2);
    }

    @NotNull
    public final B0<ViewEffect> getViewEffectsSharedFlow() {
        return C2399j.a(this.viewEffects);
    }

    @NotNull
    public final M0<WidgetState> getWidgetStateFlow() {
        return C2399j.b(this.widgetStateFlow);
    }

    @Override // androidx.lifecycle.w0
    protected void onCleared() {
        this.syncChannel.l(null);
        super.onCleared();
    }

    public final void onViewIntent(@NotNull ViewIntent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        C10727i.c(androidx.lifecycle.x0.a(this), null, null, new NotificationSubscriptionBannerViewModel$onViewIntent$1(this, intent, null), 3);
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0005\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v2/presentation/NotificationSubscriptionBannerViewModel$WidgetState;", "", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "buttonState", "", "isLoading", "<init>", "(Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getButtonState", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "Z", "()Z", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class WidgetState {

        @NotNull
        private final ButtonV3DTO buttonState;
        private final boolean isLoading;

        public WidgetState(@NotNull ButtonV3DTO buttonState, boolean z11) {
            Intrinsics.checkNotNullParameter(buttonState, "buttonState");
            this.buttonState = buttonState;
            this.isLoading = z11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof WidgetState)) {
                return false;
            }
            WidgetState widgetState = (WidgetState) other;
            return Intrinsics.d(this.buttonState, widgetState.buttonState) && this.isLoading == widgetState.isLoading;
        }

        @NotNull
        public final ButtonV3DTO getButtonState() {
            return this.buttonState;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isLoading) + (this.buttonState.hashCode() * 31);
        }

        /* renamed from: isLoading, reason: from getter */
        public final boolean getIsLoading() {
            return this.isLoading;
        }

        @NotNull
        public String toString() {
            return "WidgetState(buttonState=" + this.buttonState + ", isLoading=" + this.isLoading + ")";
        }

        public /* synthetic */ WidgetState(ButtonV3DTO buttonV3DTO, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(buttonV3DTO, (i11 & 2) != 0 ? false : z11);
        }
    }
}
