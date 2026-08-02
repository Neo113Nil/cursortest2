package ru.ozon.app.android.barcodecache.data;

import G.g;
import N3.C3660k;
import P4.f;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/barcodecache/data/BarcodeCacheDTO;", "", "code", "", "visibleCode", "cacheLifetime", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;J)V", "getCode", "()Ljava/lang/String;", "getVisibleCode", "getCacheLifetime", "()J", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "barcodecache_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BarcodeCacheDTO {
    private final long cacheLifetime;

    @NotNull
    private final String code;

    @NotNull
    private final String visibleCode;

    public BarcodeCacheDTO(@NotNull String code, @NotNull String visibleCode, long j11) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(visibleCode, "visibleCode");
        this.code = code;
        this.visibleCode = visibleCode;
        this.cacheLifetime = j11;
    }

    public static /* synthetic */ BarcodeCacheDTO copy$default(BarcodeCacheDTO barcodeCacheDTO, String str, String str2, long j11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = barcodeCacheDTO.code;
        }
        if ((i11 & 2) != 0) {
            str2 = barcodeCacheDTO.visibleCode;
        }
        if ((i11 & 4) != 0) {
            j11 = barcodeCacheDTO.cacheLifetime;
        }
        return barcodeCacheDTO.copy(str, str2, j11);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getVisibleCode() {
        return this.visibleCode;
    }

    /* renamed from: component3, reason: from getter */
    public final long getCacheLifetime() {
        return this.cacheLifetime;
    }

    @NotNull
    public final BarcodeCacheDTO copy(@NotNull String code, @NotNull String visibleCode, long cacheLifetime) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(visibleCode, "visibleCode");
        return new BarcodeCacheDTO(code, visibleCode, cacheLifetime);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BarcodeCacheDTO)) {
            return false;
        }
        BarcodeCacheDTO barcodeCacheDTO = (BarcodeCacheDTO) other;
        return Intrinsics.d(this.code, barcodeCacheDTO.code) && Intrinsics.d(this.visibleCode, barcodeCacheDTO.visibleCode) && this.cacheLifetime == barcodeCacheDTO.cacheLifetime;
    }

    public final long getCacheLifetime() {
        return this.cacheLifetime;
    }

    @NotNull
    public final String getCode() {
        return this.code;
    }

    @NotNull
    public final String getVisibleCode() {
        return this.visibleCode;
    }

    public int hashCode() {
        return Long.hashCode(this.cacheLifetime) + g.a(this.code.hashCode() * 31, 31, this.visibleCode);
    }

    @NotNull
    public String toString() {
        return f.a(this.cacheLifetime, ")", C3660k.d("BarcodeCacheDTO(code=", this.code, ", visibleCode=", this.visibleCode, ", cacheLifetime="));
    }
}
