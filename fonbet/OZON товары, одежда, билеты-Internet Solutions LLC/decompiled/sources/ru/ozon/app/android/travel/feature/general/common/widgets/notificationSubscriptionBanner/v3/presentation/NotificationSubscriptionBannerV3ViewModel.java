package ru.ozon.app.android.travel.feature.general.common.widgets.notificationSubscriptionBanner.v3.presentation;

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
import Kk.c;
import Lm0.a;
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
import ru.ozon.app.android.platform.notifications.EnableNotificationsSuggestingHandler;
import ru.ozon.app.android.travel.feature.general.common.widgets.notificationSubscriptionBanner.v3.presentation.NotificationSubscriptionBannerV3VI;
import ru.ozon.app.android.travel.utils.FlowUtilsKt;
import ru.ozon.app.android.utils.dispatcherprovider.CoroutineDispatcherProvider;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import xe.C10727i;
import xe.J;
import xe.M;
import ze.h;
import ze.k;

@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u00002\u00020\u0001:\u0005GHIJKB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011H\u0082@¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0015\u0010\fJ%\u0010\u001a\u001a\u00020\n2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010 \u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\u0016H\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\nH\u0014¢\u0006\u0004\b\"\u0010\fJ\u0015\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0#¢\u0006\u0004\b%\u0010&J\u0013\u0010)\u001a\b\u0012\u0004\u0012\u00020(0'¢\u0006\u0004\b)\u0010*J\u0015\u0010+\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b+\u0010,R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010-R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010.R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010/R\u001c\u00101\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u001a\u00104\u001a\b\u0012\u0004\u0012\u00020\u0011038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u001a\u00106\u001a\b\u0012\u0004\u0012\u00020(038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00105R\u0018\u00108\u001a\u0004\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u001a\u0010<\u001a\b\u0012\u0004\u0012\u00020;0:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010?\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010A\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010@R\u001a\u0010C\u001a\b\u0012\u0004\u0012\u00020B038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u00105R\u001d\u0010D\u001a\b\u0012\u0004\u0012\u00020B0'8\u0006¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010*¨\u0006L"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/presentation/NotificationSubscriptionBannerV3ViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "actionV2Repository", "Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;", "coroutineDispatcherProvider", "Lru/ozon/app/android/platform/notifications/EnableNotificationsSuggestingHandler;", "enableNotificationsSuggestingHandler", "<init>", "(Lru/ozon/app/android/action/v2/ActionV2Repository;Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;Lru/ozon/app/android/platform/notifications/EnableNotificationsSuggestingHandler;)V", "", "observeViewIntents", "()V", "", "throwable", "onError", "(Ljava/lang/Throwable;)V", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/presentation/NotificationSubscriptionBannerV3ViewModel$ViewIntent;", "intent", "reduce", "(Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/presentation/NotificationSubscriptionBannerV3ViewModel$ViewIntent;Lkotlin/coroutines/d;)Ljava/lang/Object;", "subscribe", "", "actionName", "", "params", "hideWidget", "(Ljava/lang/String;Ljava/lang/Object;)V", "Lxe/M;", "scope", "exception", "locator", "handleCoroutineError", "(Lxe/M;Ljava/lang/Throwable;Ljava/lang/String;)V", "onCleared", "LAe/M0;", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/presentation/NotificationSubscriptionBannerV3ViewModel$ButtonState;", "getButtonStateFlow", "()LAe/M0;", "LAe/B0;", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/presentation/NotificationSubscriptionBannerV3ViewModel$ViewEffect;", "getViewEffectsSharedFlow", "()LAe/B0;", "onViewIntent", "(Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/presentation/NotificationSubscriptionBannerV3ViewModel$ViewIntent;)V", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;", "Lru/ozon/app/android/platform/notifications/EnableNotificationsSuggestingHandler;", "LAe/x0;", "buttonStateFlow", "LAe/x0;", "LAe/w0;", "viewIntents", "LAe/w0;", "viewEffects", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/presentation/NotificationSubscriptionBannerV3VI;", "itemVO", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/presentation/NotificationSubscriptionBannerV3VI;", "Lze/h;", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/presentation/NotificationSubscriptionBannerV3ViewModel$NotificationsRequestResult;", "syncChannel", "Lze/h;", "Lxe/J;", "networkExHandler", "Lxe/J;", "loggingExHandler", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/presentation/NotificationSubscriptionBannerV3ViewModel$Action;", "_actionFlow", "actionFlow", "LAe/B0;", "getActionFlow", "ButtonState", "ViewEffect", "ViewIntent", "Action", "NotificationsRequestResult", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class NotificationSubscriptionBannerV3ViewModel extends w0 {

    @NotNull
    private final Ae.w0<Action> _actionFlow;

    @NotNull
    private final B0<Action> actionFlow;

    @NotNull
    private final ActionV2Repository actionV2Repository;

    @NotNull
    private final x0<ButtonState> buttonStateFlow;

    @NotNull
    private final CoroutineDispatcherProvider coroutineDispatcherProvider;

    @NotNull
    private final EnableNotificationsSuggestingHandler enableNotificationsSuggestingHandler;
    private NotificationSubscriptionBannerV3VI itemVO;

    @NotNull
    private final J loggingExHandler;

    @NotNull
    private final J networkExHandler;

    @NotNull
    private final h<NotificationsRequestResult> syncChannel;

    @NotNull
    private final Ae.w0<ViewEffect> viewEffects;

    @NotNull
    private final Ae.w0<ViewIntent> viewIntents;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/presentation/NotificationSubscriptionBannerV3ViewModel$Action;", "", "Success", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/presentation/NotificationSubscriptionBannerV3ViewModel$Action$Success;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Action {

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/presentation/NotificationSubscriptionBannerV3ViewModel$Action$Success;", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/presentation/NotificationSubscriptionBannerV3ViewModel$Action;", "Lru/ozon/uni/atoms/af/AtomAction;", "atomAction", "<init>", "(Lru/ozon/uni/atoms/af/AtomAction;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/af/AtomAction;", "getAtomAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Success implements Action {
            public static final int $stable = AtomAction.$stable;

            @NotNull
            private final AtomAction atomAction;

            public Success(@NotNull AtomAction atomAction) {
                Intrinsics.checkNotNullParameter(atomAction, "atomAction");
                this.atomAction = atomAction;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Success) && Intrinsics.d(this.atomAction, ((Success) other).atomAction);
            }

            @NotNull
            public final AtomAction getAtomAction() {
                return this.atomAction;
            }

            public int hashCode() {
                return this.atomAction.hashCode();
            }

            @NotNull
            public String toString() {
                return c.e("Success(atomAction=", ")", this.atomAction);
            }
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0004\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/presentation/NotificationSubscriptionBannerV3ViewModel$ButtonState;", "", "", "subscribeActionSucceed", "isLoading", "<init>", "(ZZ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getSubscribeActionSucceed", "()Z", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ButtonState {
        private final boolean isLoading;
        private final boolean subscribeActionSucceed;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public ButtonState() {
            this(r2, r2, 3, null);
            boolean z11 = false;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ButtonState)) {
                return false;
            }
            ButtonState buttonState = (ButtonState) other;
            return this.subscribeActionSucceed == buttonState.subscribeActionSucceed && this.isLoading == buttonState.isLoading;
        }

        public final boolean getSubscribeActionSucceed() {
            return this.subscribeActionSucceed;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isLoading) + (Boolean.hashCode(this.subscribeActionSucceed) * 31);
        }

        /* renamed from: isLoading, reason: from getter */
        public final boolean getIsLoading() {
            return this.isLoading;
        }

        @NotNull
        public String toString() {
            return Ef0.c.c("ButtonState(subscribeActionSucceed=", ", isLoading=", ")", this.subscribeActionSucceed, this.isLoading);
        }

        public ButtonState(boolean z11, boolean z12) {
            this.subscribeActionSucceed = z11;
            this.isLoading = z12;
        }

        public /* synthetic */ ButtonState(boolean z11, boolean z12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? false : z11, (i11 & 2) != 0 ? false : z12);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\br\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/presentation/NotificationSubscriptionBannerV3ViewModel$NotificationsRequestResult;", "", "NotificationsGranted", "NotificationsRejected", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/presentation/NotificationSubscriptionBannerV3ViewModel$NotificationsRequestResult$NotificationsGranted;", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/presentation/NotificationSubscriptionBannerV3ViewModel$NotificationsRequestResult$NotificationsRejected;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    interface NotificationsRequestResult {

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/presentation/NotificationSubscriptionBannerV3ViewModel$NotificationsRequestResult$NotificationsGranted;", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/presentation/NotificationSubscriptionBannerV3ViewModel$NotificationsRequestResult;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class NotificationsGranted implements NotificationsRequestResult {

            @NotNull
            public static final NotificationsGranted INSTANCE = new NotificationsGranted();

            private NotificationsGranted() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof NotificationsGranted);
            }

            public int hashCode() {
                return -246969414;
            }

            @NotNull
            public String toString() {
                return "NotificationsGranted";
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/presentation/NotificationSubscriptionBannerV3ViewModel$NotificationsRequestResult$NotificationsRejected;", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/presentation/NotificationSubscriptionBannerV3ViewModel$NotificationsRequestResult;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class NotificationsRejected implements NotificationsRequestResult {

            @NotNull
            public static final NotificationsRejected INSTANCE = new NotificationsRejected();

            private NotificationsRejected() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof NotificationsRejected);
            }

            public int hashCode() {
                return 226172767;
            }

            @NotNull
            public String toString() {
                return "NotificationsRejected";
            }
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/presentation/NotificationSubscriptionBannerV3ViewModel$ViewEffect;", "", "ShowNetworkError", "RequestNotifications", "OpenSettings", "CheckNotifications", "ShowRationale", "RemoveWidget", "ShowNotification", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/presentation/NotificationSubscriptionBannerV3ViewModel$ViewEffect$CheckNotifications;", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/presentation/NotificationSubscriptionBannerV3ViewModel$ViewEffect$OpenSettings;", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/presentation/NotificationSubscriptionBannerV3ViewModel$ViewEffect$RemoveWidget;", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/presentation/NotificationSubscriptionBannerV3ViewModel$ViewEffect$RequestNotifications;", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/presentation/NotificationSubscriptionBannerV3ViewModel$ViewEffect$ShowNetworkError;", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/presentation/NotificationSubscriptionBannerV3ViewModel$ViewEffect$ShowNotification;", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/presentation/NotificationSubscriptionBannerV3ViewModel$ViewEffect$ShowRationale;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface ViewEffect {

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0003\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/presentation/NotificationSubscriptionBannerV3ViewModel$ViewEffect$CheckNotifications;", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/presentation/NotificationSubscriptionBannerV3ViewModel$ViewEffect;", "", "isPermissionForApiMoreThan32Requested", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "()Z", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
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

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/presentation/NotificationSubscriptionBannerV3ViewModel$ViewEffect$OpenSettings;", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/presentation/NotificationSubscriptionBannerV3ViewModel$ViewEffect;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class OpenSettings implements ViewEffect {

            @NotNull
            public static final OpenSettings INSTANCE = new OpenSettings();

            private OpenSettings() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof OpenSettings);
            }

            public int hashCode() {
                return -1204771646;
            }

            @NotNull
            public String toString() {
                return "OpenSettings";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/presentation/NotificationSubscriptionBannerV3ViewModel$ViewEffect$RemoveWidget;", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/presentation/NotificationSubscriptionBannerV3ViewModel$ViewEffect;", "", "widgetId", "<init>", "(J)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getWidgetId", "()J", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
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

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/presentation/NotificationSubscriptionBannerV3ViewModel$ViewEffect$RequestNotifications;", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/presentation/NotificationSubscriptionBannerV3ViewModel$ViewEffect;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class RequestNotifications implements ViewEffect {

            @NotNull
            public static final RequestNotifications INSTANCE = new RequestNotifications();

            private RequestNotifications() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof RequestNotifications);
            }

            public int hashCode() {
                return 790885838;
            }

            @NotNull
            public String toString() {
                return "RequestNotifications";
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/presentation/NotificationSubscriptionBannerV3ViewModel$ViewEffect$ShowNetworkError;", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/presentation/NotificationSubscriptionBannerV3ViewModel$ViewEffect;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ShowNetworkError implements ViewEffect {

            @NotNull
            public static final ShowNetworkError INSTANCE = new ShowNetworkError();

            private ShowNetworkError() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof ShowNetworkError);
            }

            public int hashCode() {
                return -61639220;
            }

            @NotNull
            public String toString() {
                return "ShowNetworkError";
            }
        }

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/presentation/NotificationSubscriptionBannerV3ViewModel$ViewEffect$ShowNotification;", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/presentation/NotificationSubscriptionBannerV3ViewModel$ViewEffect;", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "notification", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "postAction", "<init>", "(Lru/ozon/uni/atoms/data/notification/NotificationDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "getNotification", "()Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "getPostAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ShowNotification implements ViewEffect {
            public static final int $stable = NotificationDTO.$stable;

            @NotNull
            private final NotificationDTO notification;
            private final AtomActionDTO postAction;

            public ShowNotification(@NotNull NotificationDTO notification, AtomActionDTO atomActionDTO) {
                Intrinsics.checkNotNullParameter(notification, "notification");
                this.notification = notification;
                this.postAction = atomActionDTO;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ShowNotification)) {
                    return false;
                }
                ShowNotification showNotification = (ShowNotification) other;
                return Intrinsics.d(this.notification, showNotification.notification) && Intrinsics.d(this.postAction, showNotification.postAction);
            }

            @NotNull
            public final NotificationDTO getNotification() {
                return this.notification;
            }

            public int hashCode() {
                int hashCode = this.notification.hashCode() * 31;
                AtomActionDTO atomActionDTO = this.postAction;
                return hashCode + (atomActionDTO == null ? 0 : atomActionDTO.hashCode());
            }

            @NotNull
            public String toString() {
                return "ShowNotification(notification=" + this.notification + ", postAction=" + this.postAction + ")";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/presentation/NotificationSubscriptionBannerV3ViewModel$ViewEffect$ShowRationale;", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/presentation/NotificationSubscriptionBannerV3ViewModel$ViewEffect;", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/presentation/NotificationSubscriptionBannerV3VI$RationaleDialog;", "dialog", "<init>", "(Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/presentation/NotificationSubscriptionBannerV3VI$RationaleDialog;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/presentation/NotificationSubscriptionBannerV3VI$RationaleDialog;", "getDialog", "()Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/presentation/NotificationSubscriptionBannerV3VI$RationaleDialog;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ShowRationale implements ViewEffect {

            @NotNull
            private final NotificationSubscriptionBannerV3VI.RationaleDialog dialog;

            public ShowRationale(@NotNull NotificationSubscriptionBannerV3VI.RationaleDialog dialog) {
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
            public final NotificationSubscriptionBannerV3VI.RationaleDialog getDialog() {
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

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\b\n\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/presentation/NotificationSubscriptionBannerV3ViewModel$ViewIntent;", "", "OnNotificationsTurnedOn", "OnNotificationsRejected", "OnSettingsRequested", "OnSubscribe", "OnRemoveAlreadySubscribedWidget", "OnHideWidget", "OnNewState", "OnNotificationsTurnedOff", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/presentation/NotificationSubscriptionBannerV3ViewModel$ViewIntent$OnHideWidget;", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/presentation/NotificationSubscriptionBannerV3ViewModel$ViewIntent$OnNewState;", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/presentation/NotificationSubscriptionBannerV3ViewModel$ViewIntent$OnNotificationsRejected;", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/presentation/NotificationSubscriptionBannerV3ViewModel$ViewIntent$OnNotificationsTurnedOff;", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/presentation/NotificationSubscriptionBannerV3ViewModel$ViewIntent$OnNotificationsTurnedOn;", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/presentation/NotificationSubscriptionBannerV3ViewModel$ViewIntent$OnRemoveAlreadySubscribedWidget;", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/presentation/NotificationSubscriptionBannerV3ViewModel$ViewIntent$OnSettingsRequested;", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/presentation/NotificationSubscriptionBannerV3ViewModel$ViewIntent$OnSubscribe;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface ViewIntent {

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0007¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/presentation/NotificationSubscriptionBannerV3ViewModel$ViewIntent$OnHideWidget;", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/presentation/NotificationSubscriptionBannerV3ViewModel$ViewIntent;", "", "onHideComposerActionName", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getOnHideComposerActionName", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
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

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/presentation/NotificationSubscriptionBannerV3ViewModel$ViewIntent$OnNewState;", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/presentation/NotificationSubscriptionBannerV3ViewModel$ViewIntent;", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/presentation/NotificationSubscriptionBannerV3VI;", "itemVO", "<init>", "(Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/presentation/NotificationSubscriptionBannerV3VI;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/presentation/NotificationSubscriptionBannerV3VI;", "getItemVO", "()Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/presentation/NotificationSubscriptionBannerV3VI;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class OnNewState implements ViewIntent {

            @NotNull
            private final NotificationSubscriptionBannerV3VI itemVO;

            public OnNewState(@NotNull NotificationSubscriptionBannerV3VI itemVO) {
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
            public final NotificationSubscriptionBannerV3VI getItemVO() {
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

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/presentation/NotificationSubscriptionBannerV3ViewModel$ViewIntent$OnNotificationsRejected;", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/presentation/NotificationSubscriptionBannerV3ViewModel$ViewIntent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class OnNotificationsRejected implements ViewIntent {

            @NotNull
            public static final OnNotificationsRejected INSTANCE = new OnNotificationsRejected();

            private OnNotificationsRejected() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof OnNotificationsRejected);
            }

            public int hashCode() {
                return -365340259;
            }

            @NotNull
            public String toString() {
                return "OnNotificationsRejected";
            }
        }

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/presentation/NotificationSubscriptionBannerV3ViewModel$ViewIntent$OnNotificationsTurnedOff;", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/presentation/NotificationSubscriptionBannerV3ViewModel$ViewIntent;", "", "shouldShowRationale", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getShouldShowRationale", "()Z", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
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

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/presentation/NotificationSubscriptionBannerV3ViewModel$ViewIntent$OnNotificationsTurnedOn;", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/presentation/NotificationSubscriptionBannerV3ViewModel$ViewIntent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class OnNotificationsTurnedOn implements ViewIntent {

            @NotNull
            public static final OnNotificationsTurnedOn INSTANCE = new OnNotificationsTurnedOn();

            private OnNotificationsTurnedOn() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof OnNotificationsTurnedOn);
            }

            public int hashCode() {
                return 377858554;
            }

            @NotNull
            public String toString() {
                return "OnNotificationsTurnedOn";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/presentation/NotificationSubscriptionBannerV3ViewModel$ViewIntent$OnRemoveAlreadySubscribedWidget;", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/presentation/NotificationSubscriptionBannerV3ViewModel$ViewIntent;", "Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;", "hideAction", "<init>", "(Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;", "getHideAction", "()Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class OnRemoveAlreadySubscribedWidget implements ViewIntent {
            public static final int $stable = AtomAction.ComposerAction.$stable;
            private final AtomAction.ComposerAction hideAction;

            public OnRemoveAlreadySubscribedWidget(AtomAction.ComposerAction composerAction) {
                this.hideAction = composerAction;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof OnRemoveAlreadySubscribedWidget) && Intrinsics.d(this.hideAction, ((OnRemoveAlreadySubscribedWidget) other).hideAction);
            }

            public final AtomAction.ComposerAction getHideAction() {
                return this.hideAction;
            }

            public int hashCode() {
                AtomAction.ComposerAction composerAction = this.hideAction;
                if (composerAction == null) {
                    return 0;
                }
                return composerAction.hashCode();
            }

            @NotNull
            public String toString() {
                return "OnRemoveAlreadySubscribedWidget(hideAction=" + this.hideAction + ")";
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/presentation/NotificationSubscriptionBannerV3ViewModel$ViewIntent$OnSettingsRequested;", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/presentation/NotificationSubscriptionBannerV3ViewModel$ViewIntent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class OnSettingsRequested implements ViewIntent {

            @NotNull
            public static final OnSettingsRequested INSTANCE = new OnSettingsRequested();

            private OnSettingsRequested() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof OnSettingsRequested);
            }

            public int hashCode() {
                return -1896199646;
            }

            @NotNull
            public String toString() {
                return "OnSettingsRequested";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/presentation/NotificationSubscriptionBannerV3ViewModel$ViewIntent$OnSubscribe;", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/presentation/NotificationSubscriptionBannerV3ViewModel$ViewIntent;", "Lru/ozon/uni/atoms/af/AtomAction;", "atomAction", "<init>", "(Lru/ozon/uni/atoms/af/AtomAction;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/af/AtomAction;", "getAtomAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class OnSubscribe implements ViewIntent {
            public static final int $stable = AtomAction.$stable;

            @NotNull
            private final AtomAction atomAction;

            public OnSubscribe(@NotNull AtomAction atomAction) {
                Intrinsics.checkNotNullParameter(atomAction, "atomAction");
                this.atomAction = atomAction;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof OnSubscribe) && Intrinsics.d(this.atomAction, ((OnSubscribe) other).atomAction);
            }

            public int hashCode() {
                return this.atomAction.hashCode();
            }

            @NotNull
            public String toString() {
                return c.e("OnSubscribe(atomAction=", ")", this.atomAction);
            }
        }
    }

    public NotificationSubscriptionBannerV3ViewModel(@NotNull ActionV2Repository actionV2Repository, @NotNull CoroutineDispatcherProvider coroutineDispatcherProvider, @NotNull EnableNotificationsSuggestingHandler enableNotificationsSuggestingHandler) {
        Intrinsics.checkNotNullParameter(actionV2Repository, "actionV2Repository");
        Intrinsics.checkNotNullParameter(coroutineDispatcherProvider, "coroutineDispatcherProvider");
        Intrinsics.checkNotNullParameter(enableNotificationsSuggestingHandler, "enableNotificationsSuggestingHandler");
        this.actionV2Repository = actionV2Repository;
        this.coroutineDispatcherProvider = coroutineDispatcherProvider;
        this.enableNotificationsSuggestingHandler = enableNotificationsSuggestingHandler;
        this.buttonStateFlow = O0.a(null);
        this.viewIntents = E0.b(0, 0, null, 7);
        this.viewEffects = E0.b(0, 0, null, 7);
        this.syncChannel = k.a(-1, 6, null);
        J.a aVar = J.f105405n0;
        this.networkExHandler = new NotificationSubscriptionBannerV3ViewModel$special$$inlined$CoroutineExceptionHandler$1(aVar, this);
        this.loggingExHandler = new NotificationSubscriptionBannerV3ViewModel$special$$inlined$CoroutineExceptionHandler$2(aVar);
        Ae.w0<Action> SingleEventsFlow = FlowUtilsKt.SingleEventsFlow();
        this._actionFlow = SingleEventsFlow;
        this.actionFlow = C2399j.a(SingleEventsFlow);
        observeViewIntents();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleCoroutineError(M scope, Throwable exception, String locator) {
        C10727i.c(scope, null, null, new NotificationSubscriptionBannerV3ViewModel$handleCoroutineError$1(exception, locator, this, null), 3);
    }

    private final void hideWidget(String actionName, Object params) {
        C10727i.c(androidx.lifecycle.x0.a(this), this.coroutineDispatcherProvider.getIO().plus(this.networkExHandler), null, new NotificationSubscriptionBannerV3ViewModel$hideWidget$1(actionName, this, params, null), 2);
    }

    static /* synthetic */ void hideWidget$default(NotificationSubscriptionBannerV3ViewModel notificationSubscriptionBannerV3ViewModel, String str, Object obj, int i11, Object obj2) {
        if ((i11 & 2) != 0) {
            obj = null;
        }
        notificationSubscriptionBannerV3ViewModel.hideWidget(str, obj);
    }

    private final void observeViewIntents() {
        C2399j.C(new C(new C2408n0(this.viewIntents, new NotificationSubscriptionBannerV3ViewModel$observeViewIntents$1(this, null)), new NotificationSubscriptionBannerV3ViewModel$observeViewIntents$2(this, null)), androidx.lifecycle.x0.a(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onError(Throwable throwable) {
        a.f17149a.e(throwable);
        C10727i.c(androidx.lifecycle.x0.a(this), null, null, new NotificationSubscriptionBannerV3ViewModel$onError$1(this, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(7:0|1|(2:3|(4:5|6|7|(1:(1:(1:(1:(1:(3:14|15|16)(2:18|19))(4:20|21|22|23))(3:24|22|23))(4:25|26|22|23))(6:28|29|30|(1:31)|22|23))(4:36|(2:38|(1:39))(2:43|(1:45)(2:46|(5:48|(1:50)(1:55)|51|(1:53)|54)(2:56|(3:58|(1:59)|62)(3:64|(2:66|(1:68)(3:70|30|(1:31)))(2:71|(1:73)(2:75|(2:77|(2:79|(1:83))(2:85|(2:87|21)))(2:88|(1:90)(2:92|93))))|69))))|22|23)))|98|6|7|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0111, code lost:
    
        if (r11.n(r12, r0) == r1) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x013d, code lost:
    
        if (r12.emit(r2, r0) == r1) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0179, code lost:
    
        if (r11.emit(r12, r0) == r1) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0051, code lost:
    
        r11 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0114, code lost:
    
        Lm0.a.f17149a.e(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x005d, code lost:
    
        r11 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x00fd, code lost:
    
        Lm0.a.f17149a.e(r11);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object reduce(ViewIntent viewIntent, d<? super Unit> dVar) {
        NotificationSubscriptionBannerV3ViewModel$reduce$1 notificationSubscriptionBannerV3ViewModel$reduce$1;
        int i11;
        NotificationSubscriptionBannerV3ViewModel notificationSubscriptionBannerV3ViewModel;
        NotificationSubscriptionBannerV3VI.RationaleDialog dialog;
        NotificationSubscriptionBannerV3ViewModel notificationSubscriptionBannerV3ViewModel2;
        x0<ButtonState> x0Var;
        ButtonState value;
        if (dVar instanceof NotificationSubscriptionBannerV3ViewModel$reduce$1) {
            notificationSubscriptionBannerV3ViewModel$reduce$1 = (NotificationSubscriptionBannerV3ViewModel$reduce$1) dVar;
            int i12 = notificationSubscriptionBannerV3ViewModel$reduce$1.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                notificationSubscriptionBannerV3ViewModel$reduce$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = notificationSubscriptionBannerV3ViewModel$reduce$1.result;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = notificationSubscriptionBannerV3ViewModel$reduce$1.label;
                Object[] objArr = 0;
                Object[] objArr2 = 0;
                Object[] objArr3 = 0;
                boolean z11 = false;
                int i13 = 1;
                char c11 = 1;
                char c12 = 1;
                char c13 = 1;
                if (i11 == 0) {
                    if (i11 == 1) {
                        notificationSubscriptionBannerV3ViewModel2 = (NotificationSubscriptionBannerV3ViewModel) notificationSubscriptionBannerV3ViewModel$reduce$1.L$0;
                        s.b(obj);
                        x0Var = notificationSubscriptionBannerV3ViewModel2.buttonStateFlow;
                        do {
                            value = x0Var.getValue();
                            ButtonState buttonState = value;
                        } while (!x0Var.b(value, new ButtonState(z11, z11, i13, objArr3 == true ? 1 : 0)));
                        return Unit.f71690a;
                    }
                    if (i11 == 2) {
                        s.b(obj);
                        return Unit.f71690a;
                    }
                    if (i11 == 3) {
                        s.b(obj);
                        return Unit.f71690a;
                    }
                    if (i11 != 4) {
                        if (i11 != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        s.b(obj);
                        return Unit.f71690a;
                    }
                    notificationSubscriptionBannerV3ViewModel = (NotificationSubscriptionBannerV3ViewModel) notificationSubscriptionBannerV3ViewModel$reduce$1.L$0;
                    s.b(obj);
                    C10727i.c(androidx.lifecycle.x0.a(notificationSubscriptionBannerV3ViewModel), notificationSubscriptionBannerV3ViewModel.coroutineDispatcherProvider.getIO().plus(notificationSubscriptionBannerV3ViewModel.loggingExHandler), null, new NotificationSubscriptionBannerV3ViewModel$reduce$6(notificationSubscriptionBannerV3ViewModel, null), 2);
                    return Unit.f71690a;
                }
                s.b(obj);
                if (viewIntent instanceof ViewIntent.OnNewState) {
                    this.itemVO = ((ViewIntent.OnNewState) viewIntent).getItemVO();
                    x0<ButtonState> x0Var2 = this.buttonStateFlow;
                    do {
                    } while (!x0Var2.b(x0Var2.getValue(), new ButtonState(z11, z11, c13 == true ? 1 : 0, objArr2 == true ? 1 : 0)));
                } else if (viewIntent instanceof ViewIntent.OnHideWidget) {
                    hideWidget$default(this, ((ViewIntent.OnHideWidget) viewIntent).getOnHideComposerActionName(), null, 2, null);
                } else if (viewIntent instanceof ViewIntent.OnRemoveAlreadySubscribedWidget) {
                    ViewIntent.OnRemoveAlreadySubscribedWidget onRemoveAlreadySubscribedWidget = (ViewIntent.OnRemoveAlreadySubscribedWidget) viewIntent;
                    AtomAction.ComposerAction hideAction = onRemoveAlreadySubscribedWidget.getHideAction();
                    String actionName = hideAction != null ? hideAction.getActionName() : null;
                    AtomAction.ComposerAction hideAction2 = onRemoveAlreadySubscribedWidget.getHideAction();
                    hideWidget(actionName, hideAction2 != null ? hideAction2.getParams() : null);
                } else {
                    if (!(viewIntent instanceof ViewIntent.OnSubscribe)) {
                        if (viewIntent instanceof ViewIntent.OnNotificationsTurnedOn) {
                            h<NotificationsRequestResult> hVar = this.syncChannel;
                            NotificationsRequestResult.NotificationsGranted notificationsGranted = NotificationsRequestResult.NotificationsGranted.INSTANCE;
                            notificationSubscriptionBannerV3ViewModel$reduce$1.L$0 = this;
                            notificationSubscriptionBannerV3ViewModel$reduce$1.label = 1;
                            if (hVar.n(notificationsGranted, notificationSubscriptionBannerV3ViewModel$reduce$1) != aVar) {
                                notificationSubscriptionBannerV3ViewModel2 = this;
                                x0Var = notificationSubscriptionBannerV3ViewModel2.buttonStateFlow;
                                do {
                                    value = x0Var.getValue();
                                    ButtonState buttonState2 = value;
                                } while (!x0Var.b(value, new ButtonState(z11, z11, i13, objArr3 == true ? 1 : 0)));
                            }
                        } else if (viewIntent instanceof ViewIntent.OnNotificationsRejected) {
                            h<NotificationsRequestResult> hVar2 = this.syncChannel;
                            NotificationsRequestResult.NotificationsRejected notificationsRejected = NotificationsRequestResult.NotificationsRejected.INSTANCE;
                            notificationSubscriptionBannerV3ViewModel$reduce$1.label = 2;
                        } else if (viewIntent instanceof ViewIntent.OnNotificationsTurnedOff) {
                            if (((ViewIntent.OnNotificationsTurnedOff) viewIntent).getShouldShowRationale()) {
                                NotificationSubscriptionBannerV3VI notificationSubscriptionBannerV3VI = this.itemVO;
                                if (notificationSubscriptionBannerV3VI != null && (dialog = notificationSubscriptionBannerV3VI.getDialog()) != null) {
                                    Ae.w0<ViewEffect> w0Var = this.viewEffects;
                                    ViewEffect.ShowRationale showRationale = new ViewEffect.ShowRationale(dialog);
                                    notificationSubscriptionBannerV3ViewModel$reduce$1.label = 3;
                                }
                            } else {
                                Ae.w0<ViewEffect> w0Var2 = this.viewEffects;
                                ViewEffect.RequestNotifications requestNotifications = ViewEffect.RequestNotifications.INSTANCE;
                                notificationSubscriptionBannerV3ViewModel$reduce$1.L$0 = this;
                                notificationSubscriptionBannerV3ViewModel$reduce$1.label = 4;
                                if (w0Var2.emit(requestNotifications, notificationSubscriptionBannerV3ViewModel$reduce$1) != aVar) {
                                    notificationSubscriptionBannerV3ViewModel = this;
                                    C10727i.c(androidx.lifecycle.x0.a(notificationSubscriptionBannerV3ViewModel), notificationSubscriptionBannerV3ViewModel.coroutineDispatcherProvider.getIO().plus(notificationSubscriptionBannerV3ViewModel.loggingExHandler), null, new NotificationSubscriptionBannerV3ViewModel$reduce$6(notificationSubscriptionBannerV3ViewModel, null), 2);
                                }
                            }
                        } else {
                            if (!(viewIntent instanceof ViewIntent.OnSettingsRequested)) {
                                throw new o();
                            }
                            Ae.w0<ViewEffect> w0Var3 = this.viewEffects;
                            ViewEffect.OpenSettings openSettings = ViewEffect.OpenSettings.INSTANCE;
                            notificationSubscriptionBannerV3ViewModel$reduce$1.label = 5;
                        }
                        return aVar;
                    }
                    x0<ButtonState> x0Var3 = this.buttonStateFlow;
                    do {
                    } while (!x0Var3.b(x0Var3.getValue(), new ButtonState(z11, c12 == true ? 1 : 0, c11 == true ? 1 : 0, objArr == true ? 1 : 0)));
                    subscribe();
                }
                return Unit.f71690a;
            }
        }
        notificationSubscriptionBannerV3ViewModel$reduce$1 = new NotificationSubscriptionBannerV3ViewModel$reduce$1(this, dVar);
        Object obj2 = notificationSubscriptionBannerV3ViewModel$reduce$1.result;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = notificationSubscriptionBannerV3ViewModel$reduce$1.label;
        Object[] objArr4 = 0;
        Object[] objArr22 = 0;
        Object[] objArr32 = 0;
        boolean z112 = false;
        int i132 = 1;
        char c112 = 1;
        char c122 = 1;
        char c132 = 1;
        if (i11 == 0) {
        }
    }

    private final void subscribe() {
        NotificationSubscriptionBannerV3VI notificationSubscriptionBannerV3VI = this.itemVO;
        if (notificationSubscriptionBannerV3VI == null) {
            return;
        }
        C10727i.c(androidx.lifecycle.x0.a(this), this.coroutineDispatcherProvider.getIO().plus(this.networkExHandler), null, new NotificationSubscriptionBannerV3ViewModel$subscribe$1(this, notificationSubscriptionBannerV3VI, null), 2);
    }

    @NotNull
    public final B0<Action> getActionFlow() {
        return this.actionFlow;
    }

    @NotNull
    public final M0<ButtonState> getButtonStateFlow() {
        return C2399j.b(this.buttonStateFlow);
    }

    @NotNull
    public final B0<ViewEffect> getViewEffectsSharedFlow() {
        return C2399j.a(this.viewEffects);
    }

    @Override // androidx.lifecycle.w0
    protected void onCleared() {
        this.syncChannel.l(null);
        super.onCleared();
    }

    public final void onViewIntent(@NotNull ViewIntent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        C10727i.c(androidx.lifecycle.x0.a(this), null, null, new NotificationSubscriptionBannerV3ViewModel$onViewIntent$1(this, intent, null), 3);
    }
}
