package ru.ozon.app.android.favorites.data.favoritebutton.favoriteToggleProductButton.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.notification.NotificationModelWrapper;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\b\tR\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005\u0082\u0001\u0002\n\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/favorites/data/favoritebutton/favoriteToggleProductButton/model/FavoriteToggleProductButtonChangeResult;", "", "sku", "", "getSku", "()Ljava/lang/Long;", "giftId", "getGiftId", "Success", "Failure", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteToggleProductButton/model/FavoriteToggleProductButtonChangeResult$Failure;", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteToggleProductButton/model/FavoriteToggleProductButtonChangeResult$Success;", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface FavoriteToggleProductButtonChangeResult {

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/favorites/data/favoritebutton/favoriteToggleProductButton/model/FavoriteToggleProductButtonChangeResult$Failure;", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteToggleProductButton/model/FavoriteToggleProductButtonChangeResult;", "", "sku", "giftId", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Long;", "getSku", "()Ljava/lang/Long;", "getGiftId", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Failure implements FavoriteToggleProductButtonChangeResult {
        private final Long giftId;
        private final Long sku;

        public Failure(Long l11, Long l12) {
            this.sku = l11;
            this.giftId = l12;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Failure)) {
                return false;
            }
            Failure failure = (Failure) other;
            return Intrinsics.d(this.sku, failure.sku) && Intrinsics.d(this.giftId, failure.giftId);
        }

        @Override // ru.ozon.app.android.favorites.data.favoritebutton.favoriteToggleProductButton.model.FavoriteToggleProductButtonChangeResult
        public Long getGiftId() {
            return this.giftId;
        }

        @Override // ru.ozon.app.android.favorites.data.favoritebutton.favoriteToggleProductButton.model.FavoriteToggleProductButtonChangeResult
        public Long getSku() {
            return this.sku;
        }

        public int hashCode() {
            Long l11 = this.sku;
            int hashCode = (l11 == null ? 0 : l11.hashCode()) * 31;
            Long l12 = this.giftId;
            return hashCode + (l12 != null ? l12.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Failure(sku=" + this.sku + ", giftId=" + this.giftId + ")";
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/favorites/data/favoritebutton/favoriteToggleProductButton/model/FavoriteToggleProductButtonChangeResult$Success;", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteToggleProductButton/model/FavoriteToggleProductButtonChangeResult;", "", "sku", "giftId", "Lru/ozon/uni/atoms/data/notification/NotificationModelWrapper;", "notification", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;Lru/ozon/uni/atoms/data/notification/NotificationModelWrapper;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Long;", "getSku", "()Ljava/lang/Long;", "getGiftId", "Lru/ozon/uni/atoms/data/notification/NotificationModelWrapper;", "getNotification", "()Lru/ozon/uni/atoms/data/notification/NotificationModelWrapper;", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Success implements FavoriteToggleProductButtonChangeResult {
        private final Long giftId;
        private final NotificationModelWrapper notification;
        private final Long sku;

        public Success(Long l11, Long l12, NotificationModelWrapper notificationModelWrapper) {
            this.sku = l11;
            this.giftId = l12;
            this.notification = notificationModelWrapper;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Success)) {
                return false;
            }
            Success success = (Success) other;
            return Intrinsics.d(this.sku, success.sku) && Intrinsics.d(this.giftId, success.giftId) && Intrinsics.d(this.notification, success.notification);
        }

        @Override // ru.ozon.app.android.favorites.data.favoritebutton.favoriteToggleProductButton.model.FavoriteToggleProductButtonChangeResult
        public Long getGiftId() {
            return this.giftId;
        }

        public final NotificationModelWrapper getNotification() {
            return this.notification;
        }

        @Override // ru.ozon.app.android.favorites.data.favoritebutton.favoriteToggleProductButton.model.FavoriteToggleProductButtonChangeResult
        public Long getSku() {
            return this.sku;
        }

        public int hashCode() {
            Long l11 = this.sku;
            int hashCode = (l11 == null ? 0 : l11.hashCode()) * 31;
            Long l12 = this.giftId;
            int hashCode2 = (hashCode + (l12 == null ? 0 : l12.hashCode())) * 31;
            NotificationModelWrapper notificationModelWrapper = this.notification;
            return hashCode2 + (notificationModelWrapper != null ? notificationModelWrapper.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Success(sku=" + this.sku + ", giftId=" + this.giftId + ", notification=" + this.notification + ")";
        }
    }

    Long getGiftId();

    Long getSku();
}
