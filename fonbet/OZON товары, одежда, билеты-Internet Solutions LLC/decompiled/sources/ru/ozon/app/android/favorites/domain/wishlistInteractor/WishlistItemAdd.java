package ru.ozon.app.android.favorites.domain.wishlistInteractor;

import C.C2702w;
import Pk0.c;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.notification.NotificationModelWrapper;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/favorites/domain/wishlistInteractor/WishlistItemAdd;", "Lru/ozon/app/android/favorites/domain/wishlistInteractor/WishlistItemUpdate;", "Success", "Failure", "Lru/ozon/app/android/favorites/domain/wishlistInteractor/WishlistItemAdd$Failure;", "Lru/ozon/app/android/favorites/domain/wishlistInteractor/WishlistItemAdd$Success;", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface WishlistItemAdd extends WishlistItemUpdate {

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u0015¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/favorites/domain/wishlistInteractor/WishlistItemAdd$Failure;", "Lru/ozon/app/android/favorites/domain/wishlistInteractor/WishlistItemAdd;", "", "sku", "id", "giftId", "<init>", "(JJLjava/lang/Long;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getSku", "()Ljava/lang/Long;", "getId", "()J", "Ljava/lang/Long;", "getGiftId", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Failure implements WishlistItemAdd {
        private final Long giftId;
        private final long id;
        private final long sku;

        public Failure(long j11, long j12, Long l11) {
            this.sku = j11;
            this.id = j12;
            this.giftId = l11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Failure)) {
                return false;
            }
            Failure failure = (Failure) other;
            return this.sku == failure.sku && this.id == failure.id && Intrinsics.d(this.giftId, failure.giftId);
        }

        @Override // ru.ozon.app.android.favorites.domain.wishlistInteractor.WishlistUpdate
        public long getId() {
            return this.id;
        }

        @Override // ru.ozon.app.android.favorites.domain.wishlistInteractor.WishlistItemUpdate
        @NotNull
        public Long getSku() {
            return Long.valueOf(this.sku);
        }

        public int hashCode() {
            int a11 = c.a(Long.hashCode(this.sku) * 31, 31, this.id);
            Long l11 = this.giftId;
            return a11 + (l11 == null ? 0 : l11.hashCode());
        }

        @NotNull
        public String toString() {
            long j11 = this.sku;
            long j12 = this.id;
            Long l11 = this.giftId;
            StringBuilder d11 = C2702w.d(j11, "Failure(sku=", ", id=");
            d11.append(j12);
            d11.append(", giftId=");
            d11.append(l11);
            d11.append(")");
            return d11.toString();
        }

        public /* synthetic */ Failure(long j11, long j12, Long l11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(j11, j12, (i11 & 4) != 0 ? null : l11);
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010 R%\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\n\u0010!\u001a\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lru/ozon/app/android/favorites/domain/wishlistInteractor/WishlistItemAdd$Success;", "Lru/ozon/app/android/favorites/domain/wishlistInteractor/WishlistItemAdd;", "", "sku", "id", "giftId", "Lru/ozon/uni/atoms/data/notification/NotificationModelWrapper;", "notification", "", "", "payloads", "<init>", "(JJLjava/lang/Long;Lru/ozon/uni/atoms/data/notification/NotificationModelWrapper;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getSku", "()Ljava/lang/Long;", "getId", "()J", "Ljava/lang/Long;", "getGiftId", "Lru/ozon/uni/atoms/data/notification/NotificationModelWrapper;", "getNotification", "()Lru/ozon/uni/atoms/data/notification/NotificationModelWrapper;", "Ljava/util/Map;", "getPayloads", "()Ljava/util/Map;", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Success implements WishlistItemAdd {
        private final Long giftId;
        private final long id;
        private final NotificationModelWrapper notification;
        private final Map<String, String> payloads;
        private final long sku;

        public Success(long j11, long j12, Long l11, NotificationModelWrapper notificationModelWrapper, Map<String, String> map) {
            this.sku = j11;
            this.id = j12;
            this.giftId = l11;
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
            return this.sku == success.sku && this.id == success.id && Intrinsics.d(this.giftId, success.giftId) && Intrinsics.d(this.notification, success.notification) && Intrinsics.d(this.payloads, success.payloads);
        }

        @Override // ru.ozon.app.android.favorites.domain.wishlistInteractor.WishlistUpdate
        public long getId() {
            return this.id;
        }

        public final NotificationModelWrapper getNotification() {
            return this.notification;
        }

        public final Map<String, String> getPayloads() {
            return this.payloads;
        }

        @Override // ru.ozon.app.android.favorites.domain.wishlistInteractor.WishlistItemUpdate
        @NotNull
        public Long getSku() {
            return Long.valueOf(this.sku);
        }

        public int hashCode() {
            int a11 = c.a(Long.hashCode(this.sku) * 31, 31, this.id);
            Long l11 = this.giftId;
            int hashCode = (a11 + (l11 == null ? 0 : l11.hashCode())) * 31;
            NotificationModelWrapper notificationModelWrapper = this.notification;
            int hashCode2 = (hashCode + (notificationModelWrapper == null ? 0 : notificationModelWrapper.hashCode())) * 31;
            Map<String, String> map = this.payloads;
            return hashCode2 + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            long j11 = this.sku;
            long j12 = this.id;
            Long l11 = this.giftId;
            NotificationModelWrapper notificationModelWrapper = this.notification;
            Map<String, String> map = this.payloads;
            StringBuilder d11 = C2702w.d(j11, "Success(sku=", ", id=");
            d11.append(j12);
            d11.append(", giftId=");
            d11.append(l11);
            d11.append(", notification=");
            d11.append(notificationModelWrapper);
            d11.append(", payloads=");
            d11.append(map);
            d11.append(")");
            return d11.toString();
        }

        public /* synthetic */ Success(long j11, long j12, Long l11, NotificationModelWrapper notificationModelWrapper, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(j11, j12, (i11 & 4) != 0 ? null : l11, notificationModelWrapper, map);
        }
    }
}
