package ru.ozon.app.android.favorites.data.shoppinglists.models;

import Lh.b;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/favorites/data/shoppinglists/models/FavoriteListSetSKUs;", "", "listId", "", "skus", "", "<init>", "(JLjava/util/List;)V", "getListId", "()J", "getSkus", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class FavoriteListSetSKUs {
    private final long listId;

    @NotNull
    private final List<Long> skus;

    public FavoriteListSetSKUs(@i(name = "list_id") long j11, @NotNull List<Long> skus) {
        Intrinsics.checkNotNullParameter(skus, "skus");
        this.listId = j11;
        this.skus = skus;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FavoriteListSetSKUs copy$default(FavoriteListSetSKUs favoriteListSetSKUs, long j11, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = favoriteListSetSKUs.listId;
        }
        if ((i11 & 2) != 0) {
            list = favoriteListSetSKUs.skus;
        }
        return favoriteListSetSKUs.copy(j11, list);
    }

    /* renamed from: component1, reason: from getter */
    public final long getListId() {
        return this.listId;
    }

    @NotNull
    public final List<Long> component2() {
        return this.skus;
    }

    @NotNull
    public final FavoriteListSetSKUs copy(@i(name = "list_id") long listId, @NotNull List<Long> skus) {
        Intrinsics.checkNotNullParameter(skus, "skus");
        return new FavoriteListSetSKUs(listId, skus);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FavoriteListSetSKUs)) {
            return false;
        }
        FavoriteListSetSKUs favoriteListSetSKUs = (FavoriteListSetSKUs) other;
        return this.listId == favoriteListSetSKUs.listId && Intrinsics.d(this.skus, favoriteListSetSKUs.skus);
    }

    public final long getListId() {
        return this.listId;
    }

    @NotNull
    public final List<Long> getSkus() {
        return this.skus;
    }

    public int hashCode() {
        return this.skus.hashCode() + (Long.hashCode(this.listId) * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder b11 = b.b(this.listId, "FavoriteListSetSKUs(listId=", ", skus=", this.skus);
        b11.append(")");
        return b11.toString();
    }
}
