package ru.ozon.app.android.pdp.widgets.translateButton.data;

import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0001\u0018\u00002\u00020\u0001:\u0001\u001fBW\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\t\u0012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\f\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u001f\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lru/ozon/app/android/pdp/widgets/translateButton/data/TranslateButtonDTO;", "", "translateButton", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "translatedButton", "notifications", "Lru/ozon/app/android/pdp/widgets/translateButton/data/TranslateButtonDTO$Notification;", "attributeKeys", "", "", "loaderTopPadding", "", "tabGroupId", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/app/android/pdp/widgets/translateButton/data/TranslateButtonDTO$Notification;Ljava/util/List;ILjava/lang/String;Ljava/util/Map;)V", "getTranslateButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getTranslatedButton", "getNotifications", "()Lru/ozon/app/android/pdp/widgets/translateButton/data/TranslateButtonDTO$Notification;", "getAttributeKeys", "()Ljava/util/List;", "getLoaderTopPadding", "()I", "getTabGroupId", "()Ljava/lang/String;", "getTrackingInfo", "()Ljava/util/Map;", "Notification", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class TranslateButtonDTO {
    public static final int $stable = 8;

    @NotNull
    private final List<String> attributeKeys;
    private final int loaderTopPadding;

    @NotNull
    private final Notification notifications;
    private final String tabGroupId;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;
    private final ButtonV3DTO translateButton;

    @NotNull
    private final ButtonV3DTO translatedButton;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/pdp/widgets/translateButton/data/TranslateButtonDTO$Notification;", "", "serverError", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "networkError", "<init>", "(Lru/ozon/uni/atoms/data/notification/NotificationDTO;Lru/ozon/uni/atoms/data/notification/NotificationDTO;)V", "getServerError", "()Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "getNetworkError", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Notification {
        public static final int $stable = NotificationDTO.$stable;

        @NotNull
        private final NotificationDTO networkError;

        @NotNull
        private final NotificationDTO serverError;

        public Notification(@NotNull NotificationDTO serverError, @NotNull NotificationDTO networkError) {
            Intrinsics.checkNotNullParameter(serverError, "serverError");
            Intrinsics.checkNotNullParameter(networkError, "networkError");
            this.serverError = serverError;
            this.networkError = networkError;
        }

        public static /* synthetic */ Notification copy$default(Notification notification, NotificationDTO notificationDTO, NotificationDTO notificationDTO2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                notificationDTO = notification.serverError;
            }
            if ((i11 & 2) != 0) {
                notificationDTO2 = notification.networkError;
            }
            return notification.copy(notificationDTO, notificationDTO2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final NotificationDTO getServerError() {
            return this.serverError;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final NotificationDTO getNetworkError() {
            return this.networkError;
        }

        @NotNull
        public final Notification copy(@NotNull NotificationDTO serverError, @NotNull NotificationDTO networkError) {
            Intrinsics.checkNotNullParameter(serverError, "serverError");
            Intrinsics.checkNotNullParameter(networkError, "networkError");
            return new Notification(serverError, networkError);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Notification)) {
                return false;
            }
            Notification notification = (Notification) other;
            return Intrinsics.d(this.serverError, notification.serverError) && Intrinsics.d(this.networkError, notification.networkError);
        }

        @NotNull
        public final NotificationDTO getNetworkError() {
            return this.networkError;
        }

        @NotNull
        public final NotificationDTO getServerError() {
            return this.serverError;
        }

        public int hashCode() {
            return this.networkError.hashCode() + (this.serverError.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "Notification(serverError=" + this.serverError + ", networkError=" + this.networkError + ")";
        }
    }

    public TranslateButtonDTO(ButtonV3DTO buttonV3DTO, @NotNull ButtonV3DTO translatedButton, @NotNull Notification notifications, @NotNull List<String> attributeKeys, int i11, String str, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(translatedButton, "translatedButton");
        Intrinsics.checkNotNullParameter(notifications, "notifications");
        Intrinsics.checkNotNullParameter(attributeKeys, "attributeKeys");
        this.translateButton = buttonV3DTO;
        this.translatedButton = translatedButton;
        this.notifications = notifications;
        this.attributeKeys = attributeKeys;
        this.loaderTopPadding = i11;
        this.tabGroupId = str;
        this.trackingInfo = map;
    }

    @NotNull
    public final List<String> getAttributeKeys() {
        return this.attributeKeys;
    }

    public final int getLoaderTopPadding() {
        return this.loaderTopPadding;
    }

    @NotNull
    public final Notification getNotifications() {
        return this.notifications;
    }

    public final String getTabGroupId() {
        return this.tabGroupId;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public final ButtonV3DTO getTranslateButton() {
        return this.translateButton;
    }

    @NotNull
    public final ButtonV3DTO getTranslatedButton() {
        return this.translatedButton;
    }
}
