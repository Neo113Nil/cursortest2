package ru.ozon.app.android.favorites.data.favoriteReserveButton.model;

import P4.f;
import Pk0.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.favorites.data.favoriteReserveButton.FavoriteReserveButtonMolecule;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\r\u000eR\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u0004\u0018\u00010\nX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f\u0082\u0001\u0002\u000f\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/favorites/data/favoriteReserveButton/model/FavoriteReservedChangeResult;", "", "sku", "", "getSku", "()Ljava/lang/Long;", "wishlistId", "getWishlistId", "()J", "uniqId", "", "getUniqId", "()Ljava/lang/String;", "Success", "Error", "Lru/ozon/app/android/favorites/data/favoriteReserveButton/model/FavoriteReservedChangeResult$Error;", "Lru/ozon/app/android/favorites/data/favoriteReserveButton/model/FavoriteReservedChangeResult$Success;", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface FavoriteReservedChangeResult {

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/favorites/data/favoriteReserveButton/model/FavoriteReservedChangeResult$Error;", "Lru/ozon/app/android/favorites/data/favoriteReserveButton/model/FavoriteReservedChangeResult;", "", "sku", "", "uniqId", "wishlistId", "<init>", "(Ljava/lang/Long;Ljava/lang/String;J)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Long;", "getSku", "()Ljava/lang/Long;", "Ljava/lang/String;", "getUniqId", "J", "getWishlistId", "()J", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Error implements FavoriteReservedChangeResult {
        private final Long sku;
        private final String uniqId;
        private final long wishlistId;

        public Error(Long l11, String str, long j11) {
            this.sku = l11;
            this.uniqId = str;
            this.wishlistId = j11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Error)) {
                return false;
            }
            Error error = (Error) other;
            return Intrinsics.d(this.sku, error.sku) && Intrinsics.d(this.uniqId, error.uniqId) && this.wishlistId == error.wishlistId;
        }

        @Override // ru.ozon.app.android.favorites.data.favoriteReserveButton.model.FavoriteReservedChangeResult
        public Long getSku() {
            return this.sku;
        }

        @Override // ru.ozon.app.android.favorites.data.favoriteReserveButton.model.FavoriteReservedChangeResult
        public String getUniqId() {
            return this.uniqId;
        }

        @Override // ru.ozon.app.android.favorites.data.favoriteReserveButton.model.FavoriteReservedChangeResult
        public long getWishlistId() {
            return this.wishlistId;
        }

        public int hashCode() {
            Long l11 = this.sku;
            int hashCode = (l11 == null ? 0 : l11.hashCode()) * 31;
            String str = this.uniqId;
            return Long.hashCode(this.wishlistId) + ((hashCode + (str != null ? str.hashCode() : 0)) * 31);
        }

        @NotNull
        public String toString() {
            Long l11 = this.sku;
            String str = this.uniqId;
            long j11 = this.wishlistId;
            StringBuilder sb2 = new StringBuilder("Error(sku=");
            sb2.append(l11);
            sb2.append(", uniqId=");
            sb2.append(str);
            sb2.append(", wishlistId=");
            return f.a(j11, ")", sb2);
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u000eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\"\u001a\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lru/ozon/app/android/favorites/data/favoriteReserveButton/model/FavoriteReservedChangeResult$Success;", "Lru/ozon/app/android/favorites/data/favoriteReserveButton/model/FavoriteReservedChangeResult;", "", "sku", "wishlistId", "", "uniqId", "Lru/ozon/app/android/favorites/data/favoriteReserveButton/FavoriteReserveButtonMolecule;", "molecule", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "<init>", "(Ljava/lang/Long;JLjava/lang/String;Lru/ozon/app/android/favorites/data/favoriteReserveButton/FavoriteReserveButtonMolecule;Lru/ozon/uni/atoms/af/AtomAction;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Long;", "getSku", "()Ljava/lang/Long;", "J", "getWishlistId", "()J", "Ljava/lang/String;", "getUniqId", "Lru/ozon/app/android/favorites/data/favoriteReserveButton/FavoriteReserveButtonMolecule;", "getMolecule", "()Lru/ozon/app/android/favorites/data/favoriteReserveButton/FavoriteReserveButtonMolecule;", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Success implements FavoriteReservedChangeResult {
        private final AtomAction action;

        @NotNull
        private final FavoriteReserveButtonMolecule molecule;
        private final Long sku;
        private final String uniqId;
        private final long wishlistId;

        public Success(Long l11, long j11, String str, @NotNull FavoriteReserveButtonMolecule molecule, AtomAction atomAction) {
            Intrinsics.checkNotNullParameter(molecule, "molecule");
            this.sku = l11;
            this.wishlistId = j11;
            this.uniqId = str;
            this.molecule = molecule;
            this.action = atomAction;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Success)) {
                return false;
            }
            Success success = (Success) other;
            return Intrinsics.d(this.sku, success.sku) && this.wishlistId == success.wishlistId && Intrinsics.d(this.uniqId, success.uniqId) && Intrinsics.d(this.molecule, success.molecule) && Intrinsics.d(this.action, success.action);
        }

        public final AtomAction getAction() {
            return this.action;
        }

        @NotNull
        public final FavoriteReserveButtonMolecule getMolecule() {
            return this.molecule;
        }

        @Override // ru.ozon.app.android.favorites.data.favoriteReserveButton.model.FavoriteReservedChangeResult
        public Long getSku() {
            return this.sku;
        }

        @Override // ru.ozon.app.android.favorites.data.favoriteReserveButton.model.FavoriteReservedChangeResult
        public String getUniqId() {
            return this.uniqId;
        }

        @Override // ru.ozon.app.android.favorites.data.favoriteReserveButton.model.FavoriteReservedChangeResult
        public long getWishlistId() {
            return this.wishlistId;
        }

        public int hashCode() {
            Long l11 = this.sku;
            int a11 = c.a((l11 == null ? 0 : l11.hashCode()) * 31, 31, this.wishlistId);
            String str = this.uniqId;
            int hashCode = (this.molecule.hashCode() + ((a11 + (str == null ? 0 : str.hashCode())) * 31)) * 31;
            AtomAction atomAction = this.action;
            return hashCode + (atomAction != null ? atomAction.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Success(sku=" + this.sku + ", wishlistId=" + this.wishlistId + ", uniqId=" + this.uniqId + ", molecule=" + this.molecule + ", action=" + this.action + ")";
        }
    }

    Long getSku();

    String getUniqId();

    long getWishlistId();
}
