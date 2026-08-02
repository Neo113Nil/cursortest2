package ru.ozon.app.android.favorites.data.shoppinglists.models;

import com.squareup.moshi.i;
import com.squareup.moshi.j;
import g.C6594f;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0006HÆ\u0003JH\u0010\u0019\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0012\u0010\u000eR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011¨\u0006!"}, d2 = {"Lru/ozon/app/android/favorites/data/shoppinglists/models/FavoritesWishlistRemoveRequest;", "", "favoritesListId", "", "productId", "from", "", "giftId", "uniqId", "<init>", "(JLjava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)V", "getFavoritesListId", "()J", "getProductId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getFrom", "()Ljava/lang/String;", "getGiftId", "getUniqId", "component1", "component2", "component3", "component4", "component5", "copy", "(JLjava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)Lru/ozon/app/android/favorites/data/shoppinglists/models/FavoritesWishlistRemoveRequest;", "equals", "", "other", "hashCode", "", "toString", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class FavoritesWishlistRemoveRequest {
    private final long favoritesListId;
    private final String from;
    private final Long giftId;
    private final Long productId;
    private final String uniqId;

    public FavoritesWishlistRemoveRequest(@i(name = "id") long j11, @i(name = "sku") Long l11, @i(name = "from") String str, @i(name = "giftId") Long l12, @i(name = "uniqId") String str2) {
        this.favoritesListId = j11;
        this.productId = l11;
        this.from = str;
        this.giftId = l12;
        this.uniqId = str2;
    }

    public static /* synthetic */ FavoritesWishlistRemoveRequest copy$default(FavoritesWishlistRemoveRequest favoritesWishlistRemoveRequest, long j11, Long l11, String str, Long l12, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = favoritesWishlistRemoveRequest.favoritesListId;
        }
        long j12 = j11;
        if ((i11 & 2) != 0) {
            l11 = favoritesWishlistRemoveRequest.productId;
        }
        Long l13 = l11;
        if ((i11 & 4) != 0) {
            str = favoritesWishlistRemoveRequest.from;
        }
        String str3 = str;
        if ((i11 & 8) != 0) {
            l12 = favoritesWishlistRemoveRequest.giftId;
        }
        Long l14 = l12;
        if ((i11 & 16) != 0) {
            str2 = favoritesWishlistRemoveRequest.uniqId;
        }
        return favoritesWishlistRemoveRequest.copy(j12, l13, str3, l14, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final long getFavoritesListId() {
        return this.favoritesListId;
    }

    /* renamed from: component2, reason: from getter */
    public final Long getProductId() {
        return this.productId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getFrom() {
        return this.from;
    }

    /* renamed from: component4, reason: from getter */
    public final Long getGiftId() {
        return this.giftId;
    }

    /* renamed from: component5, reason: from getter */
    public final String getUniqId() {
        return this.uniqId;
    }

    @NotNull
    public final FavoritesWishlistRemoveRequest copy(@i(name = "id") long favoritesListId, @i(name = "sku") Long productId, @i(name = "from") String from, @i(name = "giftId") Long giftId, @i(name = "uniqId") String uniqId) {
        return new FavoritesWishlistRemoveRequest(favoritesListId, productId, from, giftId, uniqId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FavoritesWishlistRemoveRequest)) {
            return false;
        }
        FavoritesWishlistRemoveRequest favoritesWishlistRemoveRequest = (FavoritesWishlistRemoveRequest) other;
        return this.favoritesListId == favoritesWishlistRemoveRequest.favoritesListId && Intrinsics.d(this.productId, favoritesWishlistRemoveRequest.productId) && Intrinsics.d(this.from, favoritesWishlistRemoveRequest.from) && Intrinsics.d(this.giftId, favoritesWishlistRemoveRequest.giftId) && Intrinsics.d(this.uniqId, favoritesWishlistRemoveRequest.uniqId);
    }

    public final long getFavoritesListId() {
        return this.favoritesListId;
    }

    public final String getFrom() {
        return this.from;
    }

    public final Long getGiftId() {
        return this.giftId;
    }

    public final Long getProductId() {
        return this.productId;
    }

    public final String getUniqId() {
        return this.uniqId;
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.favoritesListId) * 31;
        Long l11 = this.productId;
        int hashCode2 = (hashCode + (l11 == null ? 0 : l11.hashCode())) * 31;
        String str = this.from;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Long l12 = this.giftId;
        int hashCode4 = (hashCode3 + (l12 == null ? 0 : l12.hashCode())) * 31;
        String str2 = this.uniqId;
        return hashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.favoritesListId;
        Long l11 = this.productId;
        String str = this.from;
        Long l12 = this.giftId;
        String str2 = this.uniqId;
        StringBuilder sb2 = new StringBuilder("FavoritesWishlistRemoveRequest(favoritesListId=");
        sb2.append(j11);
        sb2.append(", productId=");
        sb2.append(l11);
        sb2.append(", from=");
        sb2.append(str);
        sb2.append(", giftId=");
        sb2.append(l12);
        return C6594f.a(", uniqId=", str2, ")", sb2);
    }

    public /* synthetic */ FavoritesWishlistRemoveRequest(long j11, Long l11, String str, Long l12, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, l11, (i11 & 4) != 0 ? null : str, (i11 & 8) != 0 ? null : l12, (i11 & 16) != 0 ? null : str2);
    }
}
