package ru.ozon.app.android.favorites.data.shoppinglists.models;

import G.g;
import Lh.b;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import g.C6594f;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J/\u0010\u0013\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/favorites/data/shoppinglists/models/ChangeProductsStateInFavoritesListRequest;", "", "favoritesListId", "", "productIds", "", "from", "", "<init>", "(JLjava/util/List;Ljava/lang/String;)V", "getFavoritesListId", "()J", "getProductIds", "()Ljava/util/List;", "getFrom", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ChangeProductsStateInFavoritesListRequest {
    private final long favoritesListId;
    private final String from;

    @NotNull
    private final List<Long> productIds;

    public ChangeProductsStateInFavoritesListRequest(@i(name = "id") long j11, @i(name = "skus") @NotNull List<Long> productIds, @i(name = "from") String str) {
        Intrinsics.checkNotNullParameter(productIds, "productIds");
        this.favoritesListId = j11;
        this.productIds = productIds;
        this.from = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ChangeProductsStateInFavoritesListRequest copy$default(ChangeProductsStateInFavoritesListRequest changeProductsStateInFavoritesListRequest, long j11, List list, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = changeProductsStateInFavoritesListRequest.favoritesListId;
        }
        if ((i11 & 2) != 0) {
            list = changeProductsStateInFavoritesListRequest.productIds;
        }
        if ((i11 & 4) != 0) {
            str = changeProductsStateInFavoritesListRequest.from;
        }
        return changeProductsStateInFavoritesListRequest.copy(j11, list, str);
    }

    /* renamed from: component1, reason: from getter */
    public final long getFavoritesListId() {
        return this.favoritesListId;
    }

    @NotNull
    public final List<Long> component2() {
        return this.productIds;
    }

    /* renamed from: component3, reason: from getter */
    public final String getFrom() {
        return this.from;
    }

    @NotNull
    public final ChangeProductsStateInFavoritesListRequest copy(@i(name = "id") long favoritesListId, @i(name = "skus") @NotNull List<Long> productIds, @i(name = "from") String from) {
        Intrinsics.checkNotNullParameter(productIds, "productIds");
        return new ChangeProductsStateInFavoritesListRequest(favoritesListId, productIds, from);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChangeProductsStateInFavoritesListRequest)) {
            return false;
        }
        ChangeProductsStateInFavoritesListRequest changeProductsStateInFavoritesListRequest = (ChangeProductsStateInFavoritesListRequest) other;
        return this.favoritesListId == changeProductsStateInFavoritesListRequest.favoritesListId && Intrinsics.d(this.productIds, changeProductsStateInFavoritesListRequest.productIds) && Intrinsics.d(this.from, changeProductsStateInFavoritesListRequest.from);
    }

    public final long getFavoritesListId() {
        return this.favoritesListId;
    }

    public final String getFrom() {
        return this.from;
    }

    @NotNull
    public final List<Long> getProductIds() {
        return this.productIds;
    }

    public int hashCode() {
        int b11 = g.b(Long.hashCode(this.favoritesListId) * 31, 31, this.productIds);
        String str = this.from;
        return b11 + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return C6594f.a(", from=", this.from, ")", b.b(this.favoritesListId, "ChangeProductsStateInFavoritesListRequest(favoritesListId=", ", productIds=", this.productIds));
    }

    public /* synthetic */ ChangeProductsStateInFavoritesListRequest(long j11, List list, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, list, (i11 & 4) != 0 ? null : str);
    }
}
