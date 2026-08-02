package ru.ozon.app.android.favorites.domain.wishlistInteractor;

import Bl.C2639a;
import Sh.b;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.notification.NotificationModelWrapper;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/favorites/domain/wishlistInteractor/WishlistDelete;", "Lru/ozon/app/android/favorites/domain/wishlistInteractor/WishlistUpdate;", "Started", "Success", "Failure", "Lru/ozon/app/android/favorites/domain/wishlistInteractor/WishlistDelete$Failure;", "Lru/ozon/app/android/favorites/domain/wishlistInteractor/WishlistDelete$Success;", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface WishlistDelete extends WishlistUpdate {

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/favorites/domain/wishlistInteractor/WishlistDelete$Failure;", "Lru/ozon/app/android/favorites/domain/wishlistInteractor/WishlistDelete;", "", "id", "<init>", "(J)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Failure implements WishlistDelete {
        private final long id;

        public Failure(long j11) {
            this.id = j11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Failure) && this.id == ((Failure) other).id;
        }

        @Override // ru.ozon.app.android.favorites.domain.wishlistInteractor.WishlistUpdate
        public long getId() {
            return this.id;
        }

        public int hashCode() {
            return Long.hashCode(this.id);
        }

        @NotNull
        public String toString() {
            return b.b(this.id, "Failure(id=", ")");
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/favorites/domain/wishlistInteractor/WishlistDelete$Started;", "Lru/ozon/app/android/favorites/domain/wishlistInteractor/WishlistUpdate;", "", "id", "<init>", "(J)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Started implements WishlistUpdate {
        private final long id;

        public Started(long j11) {
            this.id = j11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Started) && this.id == ((Started) other).id;
        }

        @Override // ru.ozon.app.android.favorites.domain.wishlistInteractor.WishlistUpdate
        public long getId() {
            return this.id;
        }

        public int hashCode() {
            return Long.hashCode(this.id);
        }

        @NotNull
        public String toString() {
            return b.b(this.id, "Started(id=", ")");
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR%\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/favorites/domain/wishlistInteractor/WishlistDelete$Success;", "Lru/ozon/app/android/favorites/domain/wishlistInteractor/WishlistDelete;", "", "id", "Lru/ozon/uni/atoms/data/notification/NotificationModelWrapper;", "notification", "", "", "payloads", "<init>", "(JLru/ozon/uni/atoms/data/notification/NotificationModelWrapper;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/notification/NotificationModelWrapper;", "getNotification", "()Lru/ozon/uni/atoms/data/notification/NotificationModelWrapper;", "Ljava/util/Map;", "getPayloads", "()Ljava/util/Map;", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Success implements WishlistDelete {
        private final long id;
        private final NotificationModelWrapper notification;
        private final Map<String, String> payloads;

        public Success(long j11, NotificationModelWrapper notificationModelWrapper, Map<String, String> map) {
            this.id = j11;
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
            return this.id == success.id && Intrinsics.d(this.notification, success.notification) && Intrinsics.d(this.payloads, success.payloads);
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

        public int hashCode() {
            int hashCode = Long.hashCode(this.id) * 31;
            NotificationModelWrapper notificationModelWrapper = this.notification;
            int hashCode2 = (hashCode + (notificationModelWrapper == null ? 0 : notificationModelWrapper.hashCode())) * 31;
            Map<String, String> map = this.payloads;
            return hashCode2 + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            long j11 = this.id;
            NotificationModelWrapper notificationModelWrapper = this.notification;
            Map<String, String> map = this.payloads;
            StringBuilder sb2 = new StringBuilder("Success(id=");
            sb2.append(j11);
            sb2.append(", notification=");
            sb2.append(notificationModelWrapper);
            return C2639a.b(sb2, ", payloads=", map, ")");
        }
    }
}
