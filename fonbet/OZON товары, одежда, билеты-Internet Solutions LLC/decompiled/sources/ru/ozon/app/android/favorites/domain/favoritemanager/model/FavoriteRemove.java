package ru.ozon.app.android.favorites.domain.favoritemanager.model;

import Lh.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/favorites/domain/favoritemanager/model/FavoriteRemove;", "Lru/ozon/app/android/favorites/domain/favoritemanager/model/FavoriteEvent;", "", "sku", "", "changeSourceId", "<init>", "(JLjava/lang/Integer;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getSku", "()J", "Ljava/lang/Integer;", "getChangeSourceId", "()Ljava/lang/Integer;", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class FavoriteRemove extends FavoriteEvent {
    private final Integer changeSourceId;
    private final long sku;

    public FavoriteRemove(long j11, Integer num) {
        super(j11, num, null);
        this.sku = j11;
        this.changeSourceId = num;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FavoriteRemove)) {
            return false;
        }
        FavoriteRemove favoriteRemove = (FavoriteRemove) other;
        return this.sku == favoriteRemove.sku && Intrinsics.d(this.changeSourceId, favoriteRemove.changeSourceId);
    }

    @Override // ru.ozon.app.android.favorites.domain.favoritemanager.model.FavoriteEvent
    public Integer getChangeSourceId() {
        return this.changeSourceId;
    }

    @Override // ru.ozon.app.android.favorites.domain.favoritemanager.model.FavoriteEvent
    public long getSku() {
        return this.sku;
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.sku) * 31;
        Integer num = this.changeSourceId;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    @NotNull
    public String toString() {
        StringBuilder c11 = a.c("FavoriteRemove(sku=", this.sku, ", changeSourceId=", this.changeSourceId);
        c11.append(")");
        return c11.toString();
    }
}
