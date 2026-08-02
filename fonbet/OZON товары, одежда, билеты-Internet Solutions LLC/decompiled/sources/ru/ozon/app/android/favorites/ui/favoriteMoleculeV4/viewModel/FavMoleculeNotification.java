package ru.ozon.app.android.favorites.ui.favoriteMoleculeV4.viewModel;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.notification.NotificationModelWrapper;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/favorites/ui/favoriteMoleculeV4/viewModel/FavMoleculeNotification;", "", "Error", "Success", "Lru/ozon/app/android/favorites/ui/favoriteMoleculeV4/viewModel/FavMoleculeNotification$Error;", "Lru/ozon/app/android/favorites/ui/favoriteMoleculeV4/viewModel/FavMoleculeNotification$Success;", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface FavMoleculeNotification {

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/favorites/ui/favoriteMoleculeV4/viewModel/FavMoleculeNotification$Error;", "Lru/ozon/app/android/favorites/ui/favoriteMoleculeV4/viewModel/FavMoleculeNotification;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Error implements FavMoleculeNotification {

        @NotNull
        public static final Error INSTANCE = new Error();

        private Error() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Error);
        }

        public int hashCode() {
            return 1706469260;
        }

        @NotNull
        public String toString() {
            return "Error";
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R%\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/favorites/ui/favoriteMoleculeV4/viewModel/FavMoleculeNotification$Success;", "Lru/ozon/app/android/favorites/ui/favoriteMoleculeV4/viewModel/FavMoleculeNotification;", "Lru/ozon/uni/atoms/data/notification/NotificationModelWrapper;", "notification", "", "", "notificationPayloads", "<init>", "(Lru/ozon/uni/atoms/data/notification/NotificationModelWrapper;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/notification/NotificationModelWrapper;", "getNotification", "()Lru/ozon/uni/atoms/data/notification/NotificationModelWrapper;", "Ljava/util/Map;", "getNotificationPayloads", "()Ljava/util/Map;", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Success implements FavMoleculeNotification {
        private final NotificationModelWrapper notification;
        private final Map<String, String> notificationPayloads;

        public Success(NotificationModelWrapper notificationModelWrapper, Map<String, String> map) {
            this.notification = notificationModelWrapper;
            this.notificationPayloads = map;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Success)) {
                return false;
            }
            Success success = (Success) other;
            return Intrinsics.d(this.notification, success.notification) && Intrinsics.d(this.notificationPayloads, success.notificationPayloads);
        }

        public final NotificationModelWrapper getNotification() {
            return this.notification;
        }

        public final Map<String, String> getNotificationPayloads() {
            return this.notificationPayloads;
        }

        public int hashCode() {
            NotificationModelWrapper notificationModelWrapper = this.notification;
            int hashCode = (notificationModelWrapper == null ? 0 : notificationModelWrapper.hashCode()) * 31;
            Map<String, String> map = this.notificationPayloads;
            return hashCode + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Success(notification=" + this.notification + ", notificationPayloads=" + this.notificationPayloads + ")";
        }
    }
}
