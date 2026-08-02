package ru.ozon.app.android.favorites.domain.wishlistInteractor;

import Bl.C2639a;
import Pk0.c;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.notification.NotificationModelWrapper;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/favorites/domain/wishlistInteractor/WishlistItemDelete;", "Lru/ozon/app/android/favorites/domain/wishlistInteractor/WishlistItemUpdate;", "Success", "Failure", "Lru/ozon/app/android/favorites/domain/wishlistInteractor/WishlistItemDelete$Failure;", "Lru/ozon/app/android/favorites/domain/wishlistInteractor/WishlistItemDelete$Success;", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface WishlistItemDelete extends WishlistItemUpdate {

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/favorites/domain/wishlistInteractor/WishlistItemDelete$Failure;", "Lru/ozon/app/android/favorites/domain/wishlistInteractor/WishlistItemDelete;", "", "id", "sku", "giftId", "<init>", "(JLjava/lang/Long;Ljava/lang/Long;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/Long;", "getSku", "()Ljava/lang/Long;", "getGiftId", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Failure implements WishlistItemDelete {
        private final Long giftId;
        private final long id;
        private final Long sku;

        public Failure(long j11, Long l11, Long l12) {
            this.id = j11;
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
            return this.id == failure.id && Intrinsics.d(this.sku, failure.sku) && Intrinsics.d(this.giftId, failure.giftId);
        }

        public Long getGiftId() {
            return this.giftId;
        }

        @Override // ru.ozon.app.android.favorites.domain.wishlistInteractor.WishlistUpdate
        public long getId() {
            return this.id;
        }

        @Override // ru.ozon.app.android.favorites.domain.wishlistInteractor.WishlistItemUpdate
        public Long getSku() {
            return this.sku;
        }

        public int hashCode() {
            int hashCode = Long.hashCode(this.id) * 31;
            Long l11 = this.sku;
            int hashCode2 = (hashCode + (l11 == null ? 0 : l11.hashCode())) * 31;
            Long l12 = this.giftId;
            return hashCode2 + (l12 != null ? l12.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Failure(id=" + this.id + ", sku=" + this.sku + ", giftId=" + this.giftId + ")";
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010 R%\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\n\u0010!\u001a\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lru/ozon/app/android/favorites/domain/wishlistInteractor/WishlistItemDelete$Success;", "Lru/ozon/app/android/favorites/domain/wishlistInteractor/WishlistItemDelete;", "", "sku", "id", "giftId", "Lru/ozon/uni/atoms/data/notification/NotificationModelWrapper;", "notification", "", "", "payloads", "<init>", "(Ljava/lang/Long;JLjava/lang/Long;Lru/ozon/uni/atoms/data/notification/NotificationModelWrapper;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Long;", "getSku", "()Ljava/lang/Long;", "J", "getId", "()J", "getGiftId", "Lru/ozon/uni/atoms/data/notification/NotificationModelWrapper;", "getNotification", "()Lru/ozon/uni/atoms/data/notification/NotificationModelWrapper;", "Ljava/util/Map;", "getPayloads", "()Ljava/util/Map;", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Success implements WishlistItemDelete {
        private final Long giftId;
        private final long id;
        private final NotificationModelWrapper notification;
        private final Map<String, String> payloads;
        private final Long sku;

        public Success(Long l11, long j11, Long l12, NotificationModelWrapper notificationModelWrapper, Map<String, String> map) {
            this.sku = l11;
            this.id = j11;
            this.giftId = l12;
            this.notification = notificationModelWrapper;
            this.payloads = map;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Success)) {
                return false;
            }
            Success success = (Success) other;
            return Intrinsics.d(this.sku, success.sku) && this.id == success.id && Intrinsics.d(this.giftId, success.giftId) && Intrinsics.d(this.notification, success.notification) && Intrinsics.d(this.payloads, success.payloads);
        }

        public Long getGiftId() {
            return this.giftId;
        }

        @Override // ru.ozon.app.android.favorites.domain.wishlistInteractor.WishlistUpdate
        public long getId() {
            return this.id;
        }

        public final NotificationModelWrapper getNotification() {
            return this.notification;
        }

        @Override // ru.ozon.app.android.favorites.domain.wishlistInteractor.WishlistItemUpdate
        public Long getSku() {
            return this.sku;
        }

        public int hashCode() {
            Long l11 = this.sku;
            int a11 = c.a((l11 == null ? 0 : l11.hashCode()) * 31, 31, this.id);
            Long l12 = this.giftId;
            int hashCode = (a11 + (l12 == null ? 0 : l12.hashCode())) * 31;
            NotificationModelWrapper notificationModelWrapper = this.notification;
            int hashCode2 = (hashCode + (notificationModelWrapper == null ? 0 : notificationModelWrapper.hashCode())) * 31;
            Map<String, String> map = this.payloads;
            return hashCode2 + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            Long l11 = this.sku;
            long j11 = this.id;
            Long l12 = this.giftId;
            NotificationModelWrapper notificationModelWrapper = this.notification;
            Map<String, String> map = this.payloads;
            StringBuilder sb2 = new StringBuilder("Success(sku=");
            sb2.append(l11);
            sb2.append(", id=");
            sb2.append(j11);
            sb2.append(", giftId=");
            sb2.append(l12);
            sb2.append(", notification=");
            sb2.append(notificationModelWrapper);
            return C2639a.b(sb2, ", payloads=", map, ")");
        }
    }
}
