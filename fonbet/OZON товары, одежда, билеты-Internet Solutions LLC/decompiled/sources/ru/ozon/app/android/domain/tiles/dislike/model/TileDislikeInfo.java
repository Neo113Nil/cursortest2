package ru.ozon.app.android.domain.tiles.dislike.model;

import B0.C2454a;
import W10.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\n\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u0010R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u000eR\u001f\u0010\n\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/domain/tiles/dislike/model/TileDislikeInfo;", "", "Lru/ozon/app/android/domain/tiles/dislike/model/TileDislikeId;", "dislikeId", "", "reason", "", "algorithm", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "<init>", "(Lru/ozon/app/android/domain/tiles/dislike/model/TileDislikeId;ILjava/lang/String;LW10/c;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/domain/tiles/dislike/model/TileDislikeId;", "getDislikeId", "()Lru/ozon/app/android/domain/tiles/dislike/model/TileDislikeId;", "I", "getReason", "Ljava/lang/String;", "getAlgorithm", "LW10/c;", "getTrackingData", "()LW10/c;", "tiles_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class TileDislikeInfo {
    private final String algorithm;

    @NotNull
    private final TileDislikeId dislikeId;
    private final int reason;
    private final c trackingData;

    public TileDislikeInfo(@NotNull TileDislikeId dislikeId, int i11, String str, c cVar) {
        Intrinsics.checkNotNullParameter(dislikeId, "dislikeId");
        this.dislikeId = dislikeId;
        this.reason = i11;
        this.algorithm = str;
        this.trackingData = cVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TileDislikeInfo)) {
            return false;
        }
        TileDislikeInfo tileDislikeInfo = (TileDislikeInfo) other;
        return Intrinsics.d(this.dislikeId, tileDislikeInfo.dislikeId) && this.reason == tileDislikeInfo.reason && Intrinsics.d(this.algorithm, tileDislikeInfo.algorithm) && Intrinsics.d(this.trackingData, tileDislikeInfo.trackingData);
    }

    public final String getAlgorithm() {
        return this.algorithm;
    }

    @NotNull
    public final TileDislikeId getDislikeId() {
        return this.dislikeId;
    }

    public final int getReason() {
        return this.reason;
    }

    public final c getTrackingData() {
        return this.trackingData;
    }

    public int hashCode() {
        int a11 = C2454a.a(this.reason, this.dislikeId.hashCode() * 31, 31);
        String str = this.algorithm;
        int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
        c cVar = this.trackingData;
        return hashCode + (cVar != null ? cVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "TileDislikeInfo(dislikeId=" + this.dislikeId + ", reason=" + this.reason + ", algorithm=" + this.algorithm + ", trackingData=" + this.trackingData + ")";
    }

    public /* synthetic */ TileDislikeInfo(TileDislikeId tileDislikeId, int i11, String str, c cVar, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(tileDislikeId, i11, str, (i12 & 8) != 0 ? null : cVar);
    }
}
