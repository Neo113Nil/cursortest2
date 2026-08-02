package ru.ozon.app.android.ugc.widgets.reviewFormMobile.presentation;

import B90.C2618u;
import Pk0.a;
import T7.P;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.android.haptic.HapticToken;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\b\n\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewFormMobile/presentation/SingleEvent;", "", "SubmitAndCloseReview", "ShowActionsSheet", "PassResult", "UpdateLoader", "ShowError", "ShowNotification", "UpdateClosingTrackingInfo", "ProcessValidationAction", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/presentation/SingleEvent$PassResult;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/presentation/SingleEvent$ProcessValidationAction;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/presentation/SingleEvent$ShowActionsSheet;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/presentation/SingleEvent$ShowError;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/presentation/SingleEvent$ShowNotification;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/presentation/SingleEvent$SubmitAndCloseReview;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/presentation/SingleEvent$UpdateClosingTrackingInfo;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/presentation/SingleEvent$UpdateLoader;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface SingleEvent {

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0007HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\fR%\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewFormMobile/presentation/SingleEvent$PassResult;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/presentation/SingleEvent;", "", "link", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "", "customTrackingInfo", "<init>", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getLink", "Ljava/util/Map;", "getTrackingInfo", "()Ljava/util/Map;", "getCustomTrackingInfo", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PassResult implements SingleEvent {

        @NotNull
        private final Map<String, Object> customTrackingInfo;
        private final String link;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        public PassResult(String str, Map<String, TokenizedTrackingInfo> map, @NotNull Map<String, ? extends Object> customTrackingInfo) {
            Intrinsics.checkNotNullParameter(customTrackingInfo, "customTrackingInfo");
            this.link = str;
            this.trackingInfo = map;
            this.customTrackingInfo = customTrackingInfo;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PassResult)) {
                return false;
            }
            PassResult passResult = (PassResult) other;
            return Intrinsics.d(this.link, passResult.link) && Intrinsics.d(this.trackingInfo, passResult.trackingInfo) && Intrinsics.d(this.customTrackingInfo, passResult.customTrackingInfo);
        }

        @NotNull
        public final Map<String, Object> getCustomTrackingInfo() {
            return this.customTrackingInfo;
        }

        public final String getLink() {
            return this.link;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            String str = this.link;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return this.customTrackingInfo.hashCode() + ((hashCode + (map != null ? map.hashCode() : 0)) * 31);
        }

        @NotNull
        public String toString() {
            String str = this.link;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            Map<String, Object> map2 = this.customTrackingInfo;
            StringBuilder sb2 = new StringBuilder("PassResult(link=");
            sb2.append(str);
            sb2.append(", trackingInfo=");
            sb2.append(map);
            sb2.append(", customTrackingInfo=");
            return P.f(sb2, map2, ")");
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R%\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0018\u001a\u0004\b\u001b\u0010\u001a¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewFormMobile/presentation/SingleEvent$ProcessValidationAction;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/presentation/SingleEvent;", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "action", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "", "customTrackingInfo", "<init>", "(Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "Ljava/util/Map;", "getTrackingInfo", "()Ljava/util/Map;", "getCustomTrackingInfo", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ProcessValidationAction implements SingleEvent {
        private final AtomActionDTO action;

        @NotNull
        private final Map<String, Object> customTrackingInfo;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        public ProcessValidationAction(AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map, @NotNull Map<String, ? extends Object> customTrackingInfo) {
            Intrinsics.checkNotNullParameter(customTrackingInfo, "customTrackingInfo");
            this.action = atomActionDTO;
            this.trackingInfo = map;
            this.customTrackingInfo = customTrackingInfo;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ProcessValidationAction)) {
                return false;
            }
            ProcessValidationAction processValidationAction = (ProcessValidationAction) other;
            return Intrinsics.d(this.action, processValidationAction.action) && Intrinsics.d(this.trackingInfo, processValidationAction.trackingInfo) && Intrinsics.d(this.customTrackingInfo, processValidationAction.customTrackingInfo);
        }

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
            AtomActionDTO atomActionDTO = this.action;
            int hashCode = (atomActionDTO == null ? 0 : atomActionDTO.hashCode()) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return this.customTrackingInfo.hashCode() + ((hashCode + (map != null ? map.hashCode() : 0)) * 31);
        }

        @NotNull
        public String toString() {
            AtomActionDTO atomActionDTO = this.action;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            Map<String, Object> map2 = this.customTrackingInfo;
            StringBuilder sb2 = new StringBuilder("ProcessValidationAction(action=");
            sb2.append(atomActionDTO);
            sb2.append(", trackingInfo=");
            sb2.append(map);
            sb2.append(", customTrackingInfo=");
            return P.f(sb2, map2, ")");
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewFormMobile/presentation/SingleEvent$ShowActionsSheet;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/presentation/SingleEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ShowActionsSheet implements SingleEvent {

        @NotNull
        public static final ShowActionsSheet INSTANCE = new ShowActionsSheet();

        private ShowActionsSheet() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof ShowActionsSheet);
        }

        public int hashCode() {
            return 751427584;
        }

        @NotNull
        public String toString() {
            return "ShowActionsSheet";
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewFormMobile/presentation/SingleEvent$ShowError;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/presentation/SingleEvent;", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "notification", "Lru/ozon/uni/android/haptic/HapticToken;", "notificationHaptic", "<init>", "(Lru/ozon/uni/atoms/data/notification/NotificationDTO;Lru/ozon/uni/android/haptic/HapticToken;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "getNotification", "()Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "Lru/ozon/uni/android/haptic/HapticToken;", "getNotificationHaptic", "()Lru/ozon/uni/android/haptic/HapticToken;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ShowError implements SingleEvent {
        public static final int $stable = NotificationDTO.$stable;
        private final NotificationDTO notification;
        private final HapticToken notificationHaptic;

        public ShowError(NotificationDTO notificationDTO, HapticToken hapticToken) {
            this.notification = notificationDTO;
            this.notificationHaptic = hapticToken;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ShowError)) {
                return false;
            }
            ShowError showError = (ShowError) other;
            return Intrinsics.d(this.notification, showError.notification) && this.notificationHaptic == showError.notificationHaptic;
        }

        public final NotificationDTO getNotification() {
            return this.notification;
        }

        public final HapticToken getNotificationHaptic() {
            return this.notificationHaptic;
        }

        public int hashCode() {
            NotificationDTO notificationDTO = this.notification;
            int hashCode = (notificationDTO == null ? 0 : notificationDTO.hashCode()) * 31;
            HapticToken hapticToken = this.notificationHaptic;
            return hashCode + (hapticToken != null ? hapticToken.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "ShowError(notification=" + this.notification + ", notificationHaptic=" + this.notificationHaptic + ")";
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u0007\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewFormMobile/presentation/SingleEvent$ShowNotification;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/presentation/SingleEvent;", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "notification", "Lru/ozon/uni/android/haptic/HapticToken;", "notificationHaptic", "", "isError", "<init>", "(Lru/ozon/uni/atoms/data/notification/NotificationDTO;Lru/ozon/uni/android/haptic/HapticToken;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "getNotification", "()Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "Lru/ozon/uni/android/haptic/HapticToken;", "getNotificationHaptic", "()Lru/ozon/uni/android/haptic/HapticToken;", "Z", "()Z", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ShowNotification implements SingleEvent {
        public static final int $stable = NotificationDTO.$stable;
        private final boolean isError;

        @NotNull
        private final NotificationDTO notification;
        private final HapticToken notificationHaptic;

        public ShowNotification(@NotNull NotificationDTO notification, HapticToken hapticToken, boolean z11) {
            Intrinsics.checkNotNullParameter(notification, "notification");
            this.notification = notification;
            this.notificationHaptic = hapticToken;
            this.isError = z11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ShowNotification)) {
                return false;
            }
            ShowNotification showNotification = (ShowNotification) other;
            return Intrinsics.d(this.notification, showNotification.notification) && this.notificationHaptic == showNotification.notificationHaptic && this.isError == showNotification.isError;
        }

        @NotNull
        public final NotificationDTO getNotification() {
            return this.notification;
        }

        public final HapticToken getNotificationHaptic() {
            return this.notificationHaptic;
        }

        public int hashCode() {
            int hashCode = this.notification.hashCode() * 31;
            HapticToken hapticToken = this.notificationHaptic;
            return Boolean.hashCode(this.isError) + ((hashCode + (hapticToken == null ? 0 : hapticToken.hashCode())) * 31);
        }

        /* renamed from: isError, reason: from getter */
        public final boolean getIsError() {
            return this.isError;
        }

        @NotNull
        public String toString() {
            NotificationDTO notificationDTO = this.notification;
            HapticToken hapticToken = this.notificationHaptic;
            boolean z11 = this.isError;
            StringBuilder sb2 = new StringBuilder("ShowNotification(notification=");
            sb2.append(notificationDTO);
            sb2.append(", notificationHaptic=");
            sb2.append(hapticToken);
            sb2.append(", isError=");
            return a.a(")", sb2, z11);
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewFormMobile/presentation/SingleEvent$SubmitAndCloseReview;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/presentation/SingleEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SubmitAndCloseReview implements SingleEvent {

        @NotNull
        public static final SubmitAndCloseReview INSTANCE = new SubmitAndCloseReview();

        private SubmitAndCloseReview() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof SubmitAndCloseReview);
        }

        public int hashCode() {
            return -1404764974;
        }

        @NotNull
        public String toString() {
            return "SubmitAndCloseReview";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewFormMobile/presentation/SingleEvent$UpdateClosingTrackingInfo;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/presentation/SingleEvent;", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "", "", "", "customTrackingInfo", "<init>", "(Lru/ozon/uni/atoms/af/AtomAction;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "Ljava/util/Map;", "getCustomTrackingInfo", "()Ljava/util/Map;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class UpdateClosingTrackingInfo implements SingleEvent {
        private final AtomAction action;

        @NotNull
        private final Map<String, Object> customTrackingInfo;

        public UpdateClosingTrackingInfo(AtomAction atomAction, @NotNull Map<String, ? extends Object> customTrackingInfo) {
            Intrinsics.checkNotNullParameter(customTrackingInfo, "customTrackingInfo");
            this.action = atomAction;
            this.customTrackingInfo = customTrackingInfo;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UpdateClosingTrackingInfo)) {
                return false;
            }
            UpdateClosingTrackingInfo updateClosingTrackingInfo = (UpdateClosingTrackingInfo) other;
            return Intrinsics.d(this.action, updateClosingTrackingInfo.action) && Intrinsics.d(this.customTrackingInfo, updateClosingTrackingInfo.customTrackingInfo);
        }

        public final AtomAction getAction() {
            return this.action;
        }

        @NotNull
        public final Map<String, Object> getCustomTrackingInfo() {
            return this.customTrackingInfo;
        }

        public int hashCode() {
            AtomAction atomAction = this.action;
            return this.customTrackingInfo.hashCode() + ((atomAction == null ? 0 : atomAction.hashCode()) * 31);
        }

        @NotNull
        public String toString() {
            return "UpdateClosingTrackingInfo(action=" + this.action + ", customTrackingInfo=" + this.customTrackingInfo + ")";
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewFormMobile/presentation/SingleEvent$UpdateLoader;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/presentation/SingleEvent;", "", "show", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getShow", "()Z", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
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
