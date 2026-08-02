package ru.ozon.app.android.ugc.widgets.rateItemsV2.presentation.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.haptic.HapticToken;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/ugc/widgets/rateItemsV2/presentation/model/RateItemsWidgetUiEffect;", "", "AnimateIgnoreItem", "ShowNotification", "Vibrate", "Lru/ozon/app/android/ugc/widgets/rateItemsV2/presentation/model/RateItemsWidgetUiEffect$AnimateIgnoreItem;", "Lru/ozon/app/android/ugc/widgets/rateItemsV2/presentation/model/RateItemsWidgetUiEffect$ShowNotification;", "Lru/ozon/app/android/ugc/widgets/rateItemsV2/presentation/model/RateItemsWidgetUiEffect$Vibrate;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface RateItemsWidgetUiEffect {

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/ugc/widgets/rateItemsV2/presentation/model/RateItemsWidgetUiEffect$AnimateIgnoreItem;", "Lru/ozon/app/android/ugc/widgets/rateItemsV2/presentation/model/RateItemsWidgetUiEffect;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AnimateIgnoreItem implements RateItemsWidgetUiEffect {

        @NotNull
        public static final AnimateIgnoreItem INSTANCE = new AnimateIgnoreItem();

        private AnimateIgnoreItem() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof AnimateIgnoreItem);
        }

        public int hashCode() {
            return -614090309;
        }

        @NotNull
        public String toString() {
            return "AnimateIgnoreItem";
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/ugc/widgets/rateItemsV2/presentation/model/RateItemsWidgetUiEffect$ShowNotification;", "Lru/ozon/app/android/ugc/widgets/rateItemsV2/presentation/model/RateItemsWidgetUiEffect;", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "notification", "Lru/ozon/uni/android/haptic/HapticToken;", "hapticToken", "<init>", "(Lru/ozon/uni/atoms/data/notification/NotificationDTO;Lru/ozon/uni/android/haptic/HapticToken;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "getNotification", "()Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "Lru/ozon/uni/android/haptic/HapticToken;", "getHapticToken", "()Lru/ozon/uni/android/haptic/HapticToken;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ShowNotification implements RateItemsWidgetUiEffect {
        public static final int $stable = NotificationDTO.$stable;
        private final HapticToken hapticToken;
        private final NotificationDTO notification;

        /* JADX WARN: Multi-variable type inference failed */
        public ShowNotification() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ShowNotification)) {
                return false;
            }
            ShowNotification showNotification = (ShowNotification) other;
            return Intrinsics.d(this.notification, showNotification.notification) && this.hapticToken == showNotification.hapticToken;
        }

        public final HapticToken getHapticToken() {
            return this.hapticToken;
        }

        public final NotificationDTO getNotification() {
            return this.notification;
        }

        public int hashCode() {
            NotificationDTO notificationDTO = this.notification;
            int hashCode = (notificationDTO == null ? 0 : notificationDTO.hashCode()) * 31;
            HapticToken hapticToken = this.hapticToken;
            return hashCode + (hapticToken != null ? hapticToken.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "ShowNotification(notification=" + this.notification + ", hapticToken=" + this.hapticToken + ")";
        }

        public ShowNotification(NotificationDTO notificationDTO, HapticToken hapticToken) {
            this.notification = notificationDTO;
            this.hapticToken = hapticToken;
        }

        public /* synthetic */ ShowNotification(NotificationDTO notificationDTO, HapticToken hapticToken, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : notificationDTO, (i11 & 2) != 0 ? null : hapticToken);
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/ugc/widgets/rateItemsV2/presentation/model/RateItemsWidgetUiEffect$Vibrate;", "Lru/ozon/app/android/ugc/widgets/rateItemsV2/presentation/model/RateItemsWidgetUiEffect;", "Lru/ozon/uni/android/haptic/HapticToken;", "hapticToken", "<init>", "(Lru/ozon/uni/android/haptic/HapticToken;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/android/haptic/HapticToken;", "getHapticToken", "()Lru/ozon/uni/android/haptic/HapticToken;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Vibrate implements RateItemsWidgetUiEffect {
        private final HapticToken hapticToken;

        /* JADX WARN: Multi-variable type inference failed */
        public Vibrate() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Vibrate) && this.hapticToken == ((Vibrate) other).hapticToken;
        }

        public final HapticToken getHapticToken() {
            return this.hapticToken;
        }

        public int hashCode() {
            HapticToken hapticToken = this.hapticToken;
            if (hapticToken == null) {
                return 0;
            }
            return hapticToken.hashCode();
        }

        @NotNull
        public String toString() {
            return "Vibrate(hapticToken=" + this.hapticToken + ")";
        }

        public Vibrate(HapticToken hapticToken) {
            this.hapticToken = hapticToken;
        }

        public /* synthetic */ Vibrate(HapticToken hapticToken, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : hapticToken);
        }
    }
}
