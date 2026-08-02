package ru.ozon.app.android.favorites.ui.favoriteReserveButton;

import A00.a;
import Pk0.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.favorites.data.favoriteReserveButton.FavoriteReserveButtonMolecule;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lru/ozon/app/android/favorites/ui/favoriteReserveButton/FavoriteReserveButtonUpdate;", "LA00/a$J$a;", "", "sku", "wishlistId", "", "uniqId", "Lru/ozon/app/android/favorites/data/favoriteReserveButton/FavoriteReserveButtonMolecule;", "molecule", "<init>", "(Ljava/lang/Long;JLjava/lang/String;Lru/ozon/app/android/favorites/data/favoriteReserveButton/FavoriteReserveButtonMolecule;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Long;", "getSku", "()Ljava/lang/Long;", "J", "getWishlistId", "()J", "Ljava/lang/String;", "getUniqId", "Lru/ozon/app/android/favorites/data/favoriteReserveButton/FavoriteReserveButtonMolecule;", "getMolecule", "()Lru/ozon/app/android/favorites/data/favoriteReserveButton/FavoriteReserveButtonMolecule;", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class FavoriteReserveButtonUpdate implements a.J.InterfaceC0007a {

    @NotNull
    private final FavoriteReserveButtonMolecule molecule;
    private final Long sku;
    private final String uniqId;
    private final long wishlistId;

    public FavoriteReserveButtonUpdate(Long l11, long j11, String str, @NotNull FavoriteReserveButtonMolecule molecule) {
        Intrinsics.checkNotNullParameter(molecule, "molecule");
        this.sku = l11;
        this.wishlistId = j11;
        this.uniqId = str;
        this.molecule = molecule;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FavoriteReserveButtonUpdate)) {
            return false;
        }
        FavoriteReserveButtonUpdate favoriteReserveButtonUpdate = (FavoriteReserveButtonUpdate) other;
        return Intrinsics.d(this.sku, favoriteReserveButtonUpdate.sku) && this.wishlistId == favoriteReserveButtonUpdate.wishlistId && Intrinsics.d(this.uniqId, favoriteReserveButtonUpdate.uniqId) && Intrinsics.d(this.molecule, favoriteReserveButtonUpdate.molecule);
    }

    @NotNull
    public final FavoriteReserveButtonMolecule getMolecule() {
        return this.molecule;
    }

    public final Long getSku() {
        return this.sku;
    }

    public final String getUniqId() {
        return this.uniqId;
    }

    public final long getWishlistId() {
        return this.wishlistId;
    }

    public int hashCode() {
        Long l11 = this.sku;
        int a11 = c.a((l11 == null ? 0 : l11.hashCode()) * 31, 31, this.wishlistId);
        String str = this.uniqId;
        return this.molecule.hashCode() + ((a11 + (str != null ? str.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        return "FavoriteReserveButtonUpdate(sku=" + this.sku + ", wishlistId=" + this.wishlistId + ", uniqId=" + this.uniqId + ", molecule=" + this.molecule + ")";
    }
}
