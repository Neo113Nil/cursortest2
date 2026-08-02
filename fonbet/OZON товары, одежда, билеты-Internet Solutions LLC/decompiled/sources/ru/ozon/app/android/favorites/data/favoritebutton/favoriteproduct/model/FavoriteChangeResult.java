package ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.model;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMolecule;
import ru.ozon.uni.atoms.data.notification.NotificationModelWrapper;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\b\tB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0002\n\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/model/FavoriteChangeResult;", "", "sku", "", "<init>", "(J)V", "getSku", "()J", "Success", "Failure", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/model/FavoriteChangeResult$Failure;", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/model/FavoriteChangeResult$Success;", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class FavoriteChangeResult {
    private final long sku;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/model/FavoriteChangeResult$Failure;", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/model/FavoriteChangeResult;", "", "sku", "", "throwable", "<init>", "(JLjava/lang/Throwable;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getSku", "()J", "Ljava/lang/Throwable;", "getThrowable", "()Ljava/lang/Throwable;", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Failure extends FavoriteChangeResult {
        private final long sku;

        @NotNull
        private final Throwable throwable;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Failure(long j11, @NotNull Throwable throwable) {
            super(j11, null);
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            this.sku = j11;
            this.throwable = throwable;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Failure)) {
                return false;
            }
            Failure failure = (Failure) other;
            return this.sku == failure.sku && Intrinsics.d(this.throwable, failure.throwable);
        }

        @Override // ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.model.FavoriteChangeResult
        public long getSku() {
            return this.sku;
        }

        public int hashCode() {
            return this.throwable.hashCode() + (Long.hashCode(this.sku) * 31);
        }

        @NotNull
        public String toString() {
            return "Failure(sku=" + this.sku + ", throwable=" + this.throwable + ")";
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR%\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\n\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/model/FavoriteChangeResult$Success;", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/model/FavoriteChangeResult;", "", "sku", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;", "molecule", "Lru/ozon/uni/atoms/data/notification/NotificationModelWrapper;", "notification", "", "", "notificationPayloads", "<init>", "(JLru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;Lru/ozon/uni/atoms/data/notification/NotificationModelWrapper;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getSku", "()J", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;", "getMolecule", "()Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;", "Lru/ozon/uni/atoms/data/notification/NotificationModelWrapper;", "getNotification", "()Lru/ozon/uni/atoms/data/notification/NotificationModelWrapper;", "Ljava/util/Map;", "getNotificationPayloads", "()Ljava/util/Map;", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Success extends FavoriteChangeResult {

        @NotNull
        private final FavoriteProductMolecule molecule;
        private final NotificationModelWrapper notification;
        private final Map<String, String> notificationPayloads;
        private final long sku;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(long j11, @NotNull FavoriteProductMolecule molecule, NotificationModelWrapper notificationModelWrapper, Map<String, String> map) {
            super(j11, null);
            Intrinsics.checkNotNullParameter(molecule, "molecule");
            this.sku = j11;
            this.molecule = molecule;
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
            return this.sku == success.sku && Intrinsics.d(this.molecule, success.molecule) && Intrinsics.d(this.notification, success.notification) && Intrinsics.d(this.notificationPayloads, success.notificationPayloads);
        }

        @NotNull
        public final FavoriteProductMolecule getMolecule() {
            return this.molecule;
        }

        public final NotificationModelWrapper getNotification() {
            return this.notification;
        }

        public final Map<String, String> getNotificationPayloads() {
            return this.notificationPayloads;
        }

        @Override // ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.model.FavoriteChangeResult
        public long getSku() {
            return this.sku;
        }

        public int hashCode() {
            int hashCode = (this.molecule.hashCode() + (Long.hashCode(this.sku) * 31)) * 31;
            NotificationModelWrapper notificationModelWrapper = this.notification;
            int hashCode2 = (hashCode + (notificationModelWrapper == null ? 0 : notificationModelWrapper.hashCode())) * 31;
            Map<String, String> map = this.notificationPayloads;
            return hashCode2 + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Success(sku=" + this.sku + ", molecule=" + this.molecule + ", notification=" + this.notification + ", notificationPayloads=" + this.notificationPayloads + ")";
        }
    }

    public /* synthetic */ FavoriteChangeResult(long j11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11);
    }

    public long getSku() {
        return this.sku;
    }

    private FavoriteChangeResult(long j11) {
        this.sku = j11;
    }
}
