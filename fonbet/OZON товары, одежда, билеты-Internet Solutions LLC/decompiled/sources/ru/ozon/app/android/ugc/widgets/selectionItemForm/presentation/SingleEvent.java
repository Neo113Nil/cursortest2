package ru.ozon.app.android.ugc.widgets.selectionItemForm.presentation;

import B0.A0;
import B90.C2618u;
import HY.b;
import Nh.a;
import T7.P;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.presentation.ViewIntent;
import ru.ozon.tracker.model.TrinityEventEntityKt;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u0082\u0001\t\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/ugc/widgets/selectionItemForm/presentation/SingleEvent;", "", "CloseForm", "ShowError", "ShowCancelSheet", "ShowNotification", "ShowRequiredTextError", "UpdateLoader", "SubmitButtonAvailability", "HandleResponseAction", "HandleSheetAction", "Lru/ozon/app/android/ugc/widgets/selectionItemForm/presentation/SingleEvent$CloseForm;", "Lru/ozon/app/android/ugc/widgets/selectionItemForm/presentation/SingleEvent$HandleResponseAction;", "Lru/ozon/app/android/ugc/widgets/selectionItemForm/presentation/SingleEvent$HandleSheetAction;", "Lru/ozon/app/android/ugc/widgets/selectionItemForm/presentation/SingleEvent$ShowCancelSheet;", "Lru/ozon/app/android/ugc/widgets/selectionItemForm/presentation/SingleEvent$ShowError;", "Lru/ozon/app/android/ugc/widgets/selectionItemForm/presentation/SingleEvent$ShowNotification;", "Lru/ozon/app/android/ugc/widgets/selectionItemForm/presentation/SingleEvent$ShowRequiredTextError;", "Lru/ozon/app/android/ugc/widgets/selectionItemForm/presentation/SingleEvent$SubmitButtonAvailability;", "Lru/ozon/app/android/ugc/widgets/selectionItemForm/presentation/SingleEvent$UpdateLoader;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface SingleEvent {

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/ugc/widgets/selectionItemForm/presentation/SingleEvent$CloseForm;", "Lru/ozon/app/android/ugc/widgets/selectionItemForm/presentation/SingleEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CloseForm implements SingleEvent {

        @NotNull
        public static final CloseForm INSTANCE = new CloseForm();

        private CloseForm() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof CloseForm);
        }

        public int hashCode() {
            return -1355818088;
        }

        @NotNull
        public String toString() {
            return "CloseForm";
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R%\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0018\u001a\u0004\b\u001b\u0010\u001a¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/ugc/widgets/selectionItemForm/presentation/SingleEvent$HandleResponseAction;", "Lru/ozon/app/android/ugc/widgets/selectionItemForm/presentation/SingleEvent;", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "action", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "", "customTrackingInfo", "<init>", "(Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "Ljava/util/Map;", "getTrackingInfo", "()Ljava/util/Map;", "getCustomTrackingInfo", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class HandleResponseAction implements SingleEvent {

        @NotNull
        private final AtomActionDTO action;

        @NotNull
        private final Map<String, Object> customTrackingInfo;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        public HandleResponseAction(@NotNull AtomActionDTO action, Map<String, TokenizedTrackingInfo> map, @NotNull Map<String, ? extends Object> customTrackingInfo) {
            Intrinsics.checkNotNullParameter(action, "action");
            Intrinsics.checkNotNullParameter(customTrackingInfo, "customTrackingInfo");
            this.action = action;
            this.trackingInfo = map;
            this.customTrackingInfo = customTrackingInfo;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof HandleResponseAction)) {
                return false;
            }
            HandleResponseAction handleResponseAction = (HandleResponseAction) other;
            return Intrinsics.d(this.action, handleResponseAction.action) && Intrinsics.d(this.trackingInfo, handleResponseAction.trackingInfo) && Intrinsics.d(this.customTrackingInfo, handleResponseAction.customTrackingInfo);
        }

        @NotNull
        public final AtomActionDTO getAction() {
            return this.action;
        }

        @NotNull
        public final Map<String, Object> getCustomTrackingInfo() {
            return this.customTrackingInfo;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int hashCode = this.action.hashCode() * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return this.customTrackingInfo.hashCode() + ((hashCode + (map == null ? 0 : map.hashCode())) * 31);
        }

        @NotNull
        public String toString() {
            AtomActionDTO atomActionDTO = this.action;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            Map<String, Object> map2 = this.customTrackingInfo;
            StringBuilder sb2 = new StringBuilder("HandleResponseAction(action=");
            sb2.append(atomActionDTO);
            sb2.append(", trackingInfo=");
            sb2.append(map);
            sb2.append(", customTrackingInfo=");
            return P.f(sb2, map2, ")");
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/ugc/widgets/selectionItemForm/presentation/SingleEvent$HandleSheetAction;", "Lru/ozon/app/android/ugc/widgets/selectionItemForm/presentation/SingleEvent;", "Lru/ozon/app/android/ugc/widgets/selectionItemForm/presentation/ViewIntent$SheetAction$ActionType;", TrinityEventEntityKt.ACTION_TYPE_JSON_NAME, "", "", "", "customTrackingInfo", "<init>", "(Lru/ozon/app/android/ugc/widgets/selectionItemForm/presentation/ViewIntent$SheetAction$ActionType;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/ugc/widgets/selectionItemForm/presentation/ViewIntent$SheetAction$ActionType;", "getActionType", "()Lru/ozon/app/android/ugc/widgets/selectionItemForm/presentation/ViewIntent$SheetAction$ActionType;", "Ljava/util/Map;", "getCustomTrackingInfo", "()Ljava/util/Map;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class HandleSheetAction implements SingleEvent {

        @NotNull
        private final ViewIntent.SheetAction.ActionType actionType;

        @NotNull
        private final Map<String, Object> customTrackingInfo;

        public HandleSheetAction(@NotNull ViewIntent.SheetAction.ActionType actionType, @NotNull Map<String, ? extends Object> customTrackingInfo) {
            Intrinsics.checkNotNullParameter(actionType, "actionType");
            Intrinsics.checkNotNullParameter(customTrackingInfo, "customTrackingInfo");
            this.actionType = actionType;
            this.customTrackingInfo = customTrackingInfo;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof HandleSheetAction)) {
                return false;
            }
            HandleSheetAction handleSheetAction = (HandleSheetAction) other;
            return Intrinsics.d(this.actionType, handleSheetAction.actionType) && Intrinsics.d(this.customTrackingInfo, handleSheetAction.customTrackingInfo);
        }

        @NotNull
        public final ViewIntent.SheetAction.ActionType getActionType() {
            return this.actionType;
        }

        @NotNull
        public final Map<String, Object> getCustomTrackingInfo() {
            return this.customTrackingInfo;
        }

        public int hashCode() {
            return this.customTrackingInfo.hashCode() + (this.actionType.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "HandleSheetAction(actionType=" + this.actionType + ", customTrackingInfo=" + this.customTrackingInfo + ")";
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/ugc/widgets/selectionItemForm/presentation/SingleEvent$ShowCancelSheet;", "Lru/ozon/app/android/ugc/widgets/selectionItemForm/presentation/SingleEvent;", "", "", "", "customTrackingInfo", "<init>", "(Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Map;", "getCustomTrackingInfo", "()Ljava/util/Map;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ShowCancelSheet implements SingleEvent {

        @NotNull
        private final Map<String, Object> customTrackingInfo;

        public ShowCancelSheet(@NotNull Map<String, ? extends Object> customTrackingInfo) {
            Intrinsics.checkNotNullParameter(customTrackingInfo, "customTrackingInfo");
            this.customTrackingInfo = customTrackingInfo;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ShowCancelSheet) && Intrinsics.d(this.customTrackingInfo, ((ShowCancelSheet) other).customTrackingInfo);
        }

        @NotNull
        public final Map<String, Object> getCustomTrackingInfo() {
            return this.customTrackingInfo;
        }

        public int hashCode() {
            return this.customTrackingInfo.hashCode();
        }

        @NotNull
        public String toString() {
            return b.b("ShowCancelSheet(customTrackingInfo=", ")", this.customTrackingInfo);
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/ugc/widgets/selectionItemForm/presentation/SingleEvent$ShowError;", "Lru/ozon/app/android/ugc/widgets/selectionItemForm/presentation/SingleEvent;", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "notification", "<init>", "(Lru/ozon/uni/atoms/data/notification/NotificationDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "getNotification", "()Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ShowError implements SingleEvent {
        public static final int $stable = NotificationDTO.$stable;
        private final NotificationDTO notification;

        /* JADX WARN: Multi-variable type inference failed */
        public ShowError() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ShowError) && Intrinsics.d(this.notification, ((ShowError) other).notification);
        }

        public final NotificationDTO getNotification() {
            return this.notification;
        }

        public int hashCode() {
            NotificationDTO notificationDTO = this.notification;
            if (notificationDTO == null) {
                return 0;
            }
            return notificationDTO.hashCode();
        }

        @NotNull
        public String toString() {
            return a.e("ShowError(notification=", ")", this.notification);
        }

        public ShowError(NotificationDTO notificationDTO) {
            this.notification = notificationDTO;
        }

        public /* synthetic */ ShowError(NotificationDTO notificationDTO, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : notificationDTO);
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/ugc/widgets/selectionItemForm/presentation/SingleEvent$ShowNotification;", "Lru/ozon/app/android/ugc/widgets/selectionItemForm/presentation/SingleEvent;", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "notification", "<init>", "(Lru/ozon/uni/atoms/data/notification/NotificationDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "getNotification", "()Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ShowNotification implements SingleEvent {
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

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0007¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/ugc/widgets/selectionItemForm/presentation/SingleEvent$ShowRequiredTextError;", "Lru/ozon/app/android/ugc/widgets/selectionItemForm/presentation/SingleEvent;", "", "uploadKey", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUploadKey", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ShowRequiredTextError implements SingleEvent {

        @NotNull
        private final String uploadKey;

        public ShowRequiredTextError(@NotNull String uploadKey) {
            Intrinsics.checkNotNullParameter(uploadKey, "uploadKey");
            this.uploadKey = uploadKey;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ShowRequiredTextError) && Intrinsics.d(this.uploadKey, ((ShowRequiredTextError) other).uploadKey);
        }

        @NotNull
        public final String getUploadKey() {
            return this.uploadKey;
        }

        public int hashCode() {
            return this.uploadKey.hashCode();
        }

        @NotNull
        public String toString() {
            return A0.b("ShowRequiredTextError(uploadKey=", this.uploadKey, ")");
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/ugc/widgets/selectionItemForm/presentation/SingleEvent$SubmitButtonAvailability;", "Lru/ozon/app/android/ugc/widgets/selectionItemForm/presentation/SingleEvent;", "", "enable", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getEnable", "()Z", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SubmitButtonAvailability implements SingleEvent {
        private final boolean enable;

        public SubmitButtonAvailability(boolean z11) {
            this.enable = z11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SubmitButtonAvailability) && this.enable == ((SubmitButtonAvailability) other).enable;
        }

        public final boolean getEnable() {
            return this.enable;
        }

        public int hashCode() {
            return Boolean.hashCode(this.enable);
        }

        @NotNull
        public String toString() {
            return C2618u.g("SubmitButtonAvailability(enable=", ")", this.enable);
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/ugc/widgets/selectionItemForm/presentation/SingleEvent$UpdateLoader;", "Lru/ozon/app/android/ugc/widgets/selectionItemForm/presentation/SingleEvent;", "", "show", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getShow", "()Z", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class UpdateLoader implements SingleEvent {
        private final boolean show;

        public UpdateLoader(boolean z11) {
            this.show = z11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof UpdateLoader) && this.show == ((UpdateLoader) other).show;
        }

        public final boolean getShow() {
            return this.show;
        }

        public int hashCode() {
            return Boolean.hashCode(this.show);
        }

        @NotNull
        public String toString() {
            return C2618u.g("UpdateLoader(show=", ")", this.show);
        }
    }
}
