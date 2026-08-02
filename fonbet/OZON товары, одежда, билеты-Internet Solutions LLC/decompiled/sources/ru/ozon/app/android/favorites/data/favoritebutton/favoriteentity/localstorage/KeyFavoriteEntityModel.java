package ru.ozon.app.android.favorites.data.favoritebutton.favoriteentity.localstorage;

import Ak.C2436a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\t¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/favorites/data/favoritebutton/favoriteentity/localstorage/KeyFavoriteEntityModel;", "", "", "sku", "", "type", "<init>", "(JLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getSku", "()J", "Ljava/lang/String;", "getType", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class KeyFavoriteEntityModel {
    private final long sku;

    @NotNull
    private final String type;

    public KeyFavoriteEntityModel(long j11, @NotNull String type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.sku = j11;
        this.type = type;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KeyFavoriteEntityModel)) {
            return false;
        }
        KeyFavoriteEntityModel keyFavoriteEntityModel = (KeyFavoriteEntityModel) other;
        return this.sku == keyFavoriteEntityModel.sku && Intrinsics.d(this.type, keyFavoriteEntityModel.type);
    }

    public final long getSku() {
        return this.sku;
    }

    public int hashCode() {
        return this.type.hashCode() + (Long.hashCode(this.sku) * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder c11 = C2436a.c(this.sku, "KeyFavoriteEntityModel(sku=", ", type=", this.type);
        c11.append(")");
        return c11.toString();
    }
}
