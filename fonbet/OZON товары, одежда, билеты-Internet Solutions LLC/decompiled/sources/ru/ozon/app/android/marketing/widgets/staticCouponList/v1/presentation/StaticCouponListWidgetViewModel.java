package ru.ozon.app.android.marketing.widgets.staticCouponList.v1.presentation;

import Ae.C;
import Ae.C0;
import Ae.C2399j;
import Ae.C2408n0;
import Ae.E0;
import Ae.InterfaceC2395h;
import Ae.w0;
import Ak.b;
import B0.A0;
import W10.c;
import Wc.a;
import h20.InterfaceC6786a;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.action.v2.models.ActionV2Request;
import ru.ozon.app.android.platform.customActionHandlers.composerActionWithAction.ComposerActionWithActionDTO;
import ru.ozon.app.android.utils.dispatcherprovider.CoroutineDispatcherProvider;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import xe.B0;
import xe.H0;
import xe.M;
import xe.N;
import xe.X0;
import ze.EnumC11113a;

@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00060\u0001j\u0002`\u0002:\u000267B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\n\u001a\u00020\t2\n\u0010\r\u001a\u00060\u000bj\u0002`\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\"\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u000fH\u0082@¢\u0006\u0004\b\u0016\u0010\u0017J\"\u0010\u001c\u001a\u00020\u00152\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0082@¢\u0006\u0004\b\u001c\u0010\u001dJ\u0013\u0010\u001b\u001a\u00020\u001a*\u00020\u001eH\u0002¢\u0006\u0004\b\u001b\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0015H\u0016¢\u0006\u0004\b \u0010!J!\u0010$\u001a\u00020\u00152\u0006\u0010#\u001a\u00020\"2\n\u0010\r\u001a\u00060\u000bj\u0002`\f¢\u0006\u0004\b$\u0010%R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010&R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020(0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u001d\u0010,\u001a\b\u0012\u0004\u0012\u00020(0+8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0018\u00104\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105¨\u00068"}, d2 = {"Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListWidgetViewModel;", "Lh20/a;", "Lru/ozon/app/android/composer/viewmodel/ComposerWidgetViewModel;", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "actionV2Repository", "Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;", "dispatcherProvider", "<init>", "(Lru/ozon/app/android/action/v2/ActionV2Repository;Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;)V", "Lru/ozon/app/android/action/v2/models/ActionV2Request;", "request", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "LAe/h;", "Lru/ozon/app/android/platform/customActionHandlers/composerActionWithAction/ComposerActionWithActionDTO;", "callActionWithTrackingFlow", "(Lru/ozon/app/android/action/v2/models/ActionV2Request;LW10/c;)LAe/h;", "", "couponId", "data", "", "emitSuccessResult", "(JLru/ozon/app/android/platform/customActionHandlers/composerActionWithAction/ComposerActionWithActionDTO;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "message", "", "isNetworkRelatedError", "emitErrorResult", "(Ljava/lang/String;ZLkotlin/coroutines/d;)Ljava/lang/Object;", "", "(Ljava/lang/Throwable;)Z", "onCleared", "()V", "Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;", "action", "handleComposerAction", "(Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;LW10/c;)V", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "LAe/w0;", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListWidgetViewModel$Result;", "_resultFlow", "LAe/w0;", "LAe/B0;", "resultFlow", "LAe/B0;", "getResultFlow", "()LAe/B0;", "Lxe/M;", "viewModelScope", "Lxe/M;", "Lxe/B0;", "job", "Lxe/B0;", "ActionV2Throwable", "Result", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class StaticCouponListWidgetViewModel implements InterfaceC6786a {

    @NotNull
    private final w0<Result> _resultFlow;

    @NotNull
    private final ActionV2Repository actionV2Repository;
    private B0 job;

    @NotNull
    private final Ae.B0<Result> resultFlow;

    @NotNull
    private final M viewModelScope;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0007¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListWidgetViewModel$ActionV2Throwable;", "", "", "message", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getMessage", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ActionV2Throwable extends Throwable {
        private final String message;

        public ActionV2Throwable(String str) {
            this.message = str;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ActionV2Throwable) && Intrinsics.d(this.message, ((ActionV2Throwable) other).message);
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            return this.message;
        }

        public int hashCode() {
            String str = this.message;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @Override // java.lang.Throwable
        @NotNull
        public String toString() {
            return A0.b("ActionV2Throwable(message=", this.message, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListWidgetViewModel$Result;", "", "Success", "Error", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListWidgetViewModel$Result$Error;", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListWidgetViewModel$Result$Success;", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Result {

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0005\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListWidgetViewModel$Result$Error;", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListWidgetViewModel$Result;", "", "message", "", "isNetworkRelatedError", "<init>", "(Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getMessage", "Z", "()Z", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Error implements Result {
            private final boolean isNetworkRelatedError;
            private final String message;

            public Error(String str, boolean z11) {
                this.message = str;
                this.isNetworkRelatedError = z11;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Error)) {
                    return false;
                }
                Error error = (Error) other;
                return Intrinsics.d(this.message, error.message) && this.isNetworkRelatedError == error.isNetworkRelatedError;
            }

            public final String getMessage() {
                return this.message;
            }

            public int hashCode() {
                String str = this.message;
                return Boolean.hashCode(this.isNetworkRelatedError) + ((str == null ? 0 : str.hashCode()) * 31);
            }

            /* renamed from: isNetworkRelatedError, reason: from getter */
            public final boolean getIsNetworkRelatedError() {
                return this.isNetworkRelatedError;
            }

            @NotNull
            public String toString() {
                return b.f("Error(message=", this.message, ", isNetworkRelatedError=", ")", this.isNetworkRelatedError);
            }
        }

        @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListWidgetViewModel$Result$Success;", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListWidgetViewModel$Result;", "", "couponId", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "notification", "Lru/ozon/app/android/platform/customActionHandlers/composerActionWithAction/ComposerActionWithActionDTO$MessageDTO;", "message", "<init>", "(JLru/ozon/uni/atoms/af/AtomAction;Lru/ozon/uni/atoms/data/notification/NotificationDTO;Lru/ozon/app/android/platform/customActionHandlers/composerActionWithAction/ComposerActionWithActionDTO$MessageDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getCouponId", "()J", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "getNotification", "()Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "Lru/ozon/app/android/platform/customActionHandlers/composerActionWithAction/ComposerActionWithActionDTO$MessageDTO;", "getMessage", "()Lru/ozon/app/android/platform/customActionHandlers/composerActionWithAction/ComposerActionWithActionDTO$MessageDTO;", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Success implements Result {
            private final AtomAction action;
            private final long couponId;
            private final ComposerActionWithActionDTO.MessageDTO message;
            private final NotificationDTO notification;

            public Success(long j11, AtomAction atomAction, NotificationDTO notificationDTO, ComposerActionWithActionDTO.MessageDTO messageDTO) {
                this.couponId = j11;
                this.action = atomAction;
                this.notification = notificationDTO;
                this.message = messageDTO;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Success)) {
                    return false;
                }
                Success success = (Success) other;
                return this.couponId == success.couponId && Intrinsics.d(this.action, success.action) && Intrinsics.d(this.notification, success.notification) && Intrinsics.d(this.message, success.message);
            }

            public final AtomAction getAction() {
                return this.action;
            }

            public final long getCouponId() {
                return this.couponId;
            }

            public final ComposerActionWithActionDTO.MessageDTO getMessage() {
                return this.message;
            }

            public final NotificationDTO getNotification() {
                return this.notification;
            }

            public int hashCode() {
                int hashCode = Long.hashCode(this.couponId) * 31;
                AtomAction atomAction = this.action;
                int hashCode2 = (hashCode + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
                NotificationDTO notificationDTO = this.notification;
                int hashCode3 = (hashCode2 + (notificationDTO == null ? 0 : notificationDTO.hashCode())) * 31;
                ComposerActionWithActionDTO.MessageDTO messageDTO = this.message;
                return hashCode3 + (messageDTO != null ? messageDTO.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                return "Success(couponId=" + this.couponId + ", action=" + this.action + ", notification=" + this.notification + ", message=" + this.message + ")";
            }
        }
    }

    public StaticCouponListWidgetViewModel(@NotNull ActionV2Repository actionV2Repository, @NotNull CoroutineDispatcherProvider dispatcherProvider) {
        Intrinsics.checkNotNullParameter(actionV2Repository, "actionV2Repository");
        Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
        this.actionV2Repository = actionV2Repository;
        C0 b11 = E0.b(0, 1, EnumC11113a.DROP_OLDEST, 1);
        this._resultFlow = b11;
        this.resultFlow = C2399j.a(b11);
        this.viewModelScope = N.a(CoroutineContext.Element.a.d(dispatcherProvider.getIO(), (H0) X0.b()));
    }

    private final InterfaceC2395h<ComposerActionWithActionDTO> callActionWithTrackingFlow(ActionV2Request request, c trackingData) {
        return C2399j.A(new StaticCouponListWidgetViewModel$callActionWithTrackingFlow$1(this, request, trackingData, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object emitErrorResult(String str, boolean z11, d<? super Unit> dVar) {
        Object emit = this._resultFlow.emit(new Result.Error(str, z11), dVar);
        return emit == a.COROUTINE_SUSPENDED ? emit : Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object emitSuccessResult(long j11, ComposerActionWithActionDTO composerActionWithActionDTO, d<? super Unit> dVar) {
        AtomActionDTO action;
        Object emit = this._resultFlow.emit(new Result.Success(j11, (composerActionWithActionDTO == null || (action = composerActionWithActionDTO.getAction()) == null) ? null : AtomActionMapperKt.toAtomAction(action, null), composerActionWithActionDTO != null ? composerActionWithActionDTO.getNotificationBar() : null, composerActionWithActionDTO != null ? composerActionWithActionDTO.getMessage() : null), dVar);
        return emit == a.COROUTINE_SUSPENDED ? emit : Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isNetworkRelatedError(Throwable th2) {
        return (th2 instanceof UnknownHostException) || (th2 instanceof SocketTimeoutException) || (th2 instanceof SocketException);
    }

    @NotNull
    public final Ae.B0<Result> getResultFlow() {
        return this.resultFlow;
    }

    public final void handleComposerAction(@NotNull AtomAction.ComposerAction action, @NotNull c trackingData) {
        String str;
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        Map<String, String> params = action.getParams();
        LinkedHashMap u11 = params != null ? U.u(params) : null;
        if (u11 == null || (str = (String) u11.remove("COUPON_ID_PARAM")) == null) {
            str = "";
        }
        ActionV2Request actionV2Request = new ActionV2Request(u11, action.getActionName(), false, 4, null);
        B0 b02 = this.job;
        if (b02 != null) {
            b02.j(null);
        }
        this.job = C2399j.C(new C(new C2408n0(callActionWithTrackingFlow(actionV2Request, trackingData), new StaticCouponListWidgetViewModel$handleComposerAction$1(this, str, null)), new StaticCouponListWidgetViewModel$handleComposerAction$2(this, null)), this.viewModelScope);
    }

    @Override // h20.InterfaceC6786a
    public void onCleared() {
        N.c(this.viewModelScope, null);
    }
}
