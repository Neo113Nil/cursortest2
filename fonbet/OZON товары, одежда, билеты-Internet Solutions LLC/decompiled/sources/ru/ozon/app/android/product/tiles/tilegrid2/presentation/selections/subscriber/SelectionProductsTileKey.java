package ru.ozon.app.android.product.tiles.tilegrid2.presentation.selections.subscriber;

import V.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0012\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/product/tiles/tilegrid2/presentation/selections/subscriber/SelectionProductsTileKey;", "", "", "tileId", "selectionUuid", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTileId", "getSelectionUuid", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class SelectionProductsTileKey {

    @NotNull
    private final String selectionUuid;

    @NotNull
    private final String tileId;

    public SelectionProductsTileKey(@NotNull String tileId, @NotNull String selectionUuid) {
        Intrinsics.checkNotNullParameter(tileId, "tileId");
        Intrinsics.checkNotNullParameter(selectionUuid, "selectionUuid");
        this.tileId = tileId;
        this.selectionUuid = selectionUuid;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SelectionProductsTileKey)) {
            return false;
        }
        SelectionProductsTileKey selectionProductsTileKey = (SelectionProductsTileKey) other;
        return Intrinsics.d(this.tileId, selectionProductsTileKey.tileId) && Intrinsics.d(this.selectionUuid, selectionProductsTileKey.selectionUuid);
    }

    public int hashCode() {
        return this.selectionUuid.hashCode() + (this.tileId.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return e.a("SelectionProductsTileKey(tileId=", this.tileId, ", selectionUuid=", this.selectionUuid, ")");
    }
}
