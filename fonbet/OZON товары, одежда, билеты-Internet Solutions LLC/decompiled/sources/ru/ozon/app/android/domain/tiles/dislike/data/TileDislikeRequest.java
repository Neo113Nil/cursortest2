package ru.ozon.app.android.domain.tiles.dislike.data;

import B0.C2454a;
import Ql.c;
import com.squareup.moshi.j;
import g.C6594f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/domain/tiles/dislike/data/TileDislikeRequest;", "", "sku", "", "reason", "", "algorithm", "", "<init>", "(JILjava/lang/String;)V", "getSku", "()J", "getReason", "()I", "getAlgorithm", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "tiles_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class TileDislikeRequest {
    private final String algorithm;
    private final int reason;
    private final long sku;

    public TileDislikeRequest(long j11, int i11, String str) {
        this.sku = j11;
        this.reason = i11;
        this.algorithm = str;
    }

    public static /* synthetic */ TileDislikeRequest copy$default(TileDislikeRequest tileDislikeRequest, long j11, int i11, String str, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            j11 = tileDislikeRequest.sku;
        }
        if ((i12 & 2) != 0) {
            i11 = tileDislikeRequest.reason;
        }
        if ((i12 & 4) != 0) {
            str = tileDislikeRequest.algorithm;
        }
        return tileDislikeRequest.copy(j11, i11, str);
    }

    /* renamed from: component1, reason: from getter */
    public final long getSku() {
        return this.sku;
    }

    /* renamed from: component2, reason: from getter */
    public final int getReason() {
        return this.reason;
    }

    /* renamed from: component3, reason: from getter */
    public final String getAlgorithm() {
        return this.algorithm;
    }

    @NotNull
    public final TileDislikeRequest copy(long sku, int reason, String algorithm) {
        return new TileDislikeRequest(sku, reason, algorithm);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TileDislikeRequest)) {
            return false;
        }
        TileDislikeRequest tileDislikeRequest = (TileDislikeRequest) other;
        return this.sku == tileDislikeRequest.sku && this.reason == tileDislikeRequest.reason && Intrinsics.d(this.algorithm, tileDislikeRequest.algorithm);
    }

    public final String getAlgorithm() {
        return this.algorithm;
    }

    public final int getReason() {
        return this.reason;
    }

    public final long getSku() {
        return this.sku;
    }

    public int hashCode() {
        int a11 = C2454a.a(this.reason, Long.hashCode(this.sku) * 31, 31);
        String str = this.algorithm;
        return a11 + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return C6594f.a(", algorithm=", this.algorithm, ")", c.b(this.sku, "TileDislikeRequest(sku=", this.reason, ", reason="));
    }
}
