package ru.ozon.app.android.barcodecache.data;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0017\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0012J>\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/barcodecache/data/BarcodeCacheResponseDTO;", "", "barcode", "Lru/ozon/app/android/barcodecache/data/BarcodeCacheDTO;", "teensBarcode", "errorRefreshInterval", "", "backendIsOkay", "", "<init>", "(Lru/ozon/app/android/barcodecache/data/BarcodeCacheDTO;Lru/ozon/app/android/barcodecache/data/BarcodeCacheDTO;Ljava/lang/Integer;Ljava/lang/Boolean;)V", "getBarcode", "()Lru/ozon/app/android/barcodecache/data/BarcodeCacheDTO;", "getTeensBarcode", "getErrorRefreshInterval", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getBackendIsOkay", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "copy", "(Lru/ozon/app/android/barcodecache/data/BarcodeCacheDTO;Lru/ozon/app/android/barcodecache/data/BarcodeCacheDTO;Ljava/lang/Integer;Ljava/lang/Boolean;)Lru/ozon/app/android/barcodecache/data/BarcodeCacheResponseDTO;", "equals", "other", "hashCode", "toString", "", "barcodecache_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BarcodeCacheResponseDTO {
    private final Boolean backendIsOkay;
    private final BarcodeCacheDTO barcode;
    private final Integer errorRefreshInterval;
    private final BarcodeCacheDTO teensBarcode;

    public BarcodeCacheResponseDTO(BarcodeCacheDTO barcodeCacheDTO, BarcodeCacheDTO barcodeCacheDTO2, Integer num, Boolean bool) {
        this.barcode = barcodeCacheDTO;
        this.teensBarcode = barcodeCacheDTO2;
        this.errorRefreshInterval = num;
        this.backendIsOkay = bool;
    }

    public static /* synthetic */ BarcodeCacheResponseDTO copy$default(BarcodeCacheResponseDTO barcodeCacheResponseDTO, BarcodeCacheDTO barcodeCacheDTO, BarcodeCacheDTO barcodeCacheDTO2, Integer num, Boolean bool, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            barcodeCacheDTO = barcodeCacheResponseDTO.barcode;
        }
        if ((i11 & 2) != 0) {
            barcodeCacheDTO2 = barcodeCacheResponseDTO.teensBarcode;
        }
        if ((i11 & 4) != 0) {
            num = barcodeCacheResponseDTO.errorRefreshInterval;
        }
        if ((i11 & 8) != 0) {
            bool = barcodeCacheResponseDTO.backendIsOkay;
        }
        return barcodeCacheResponseDTO.copy(barcodeCacheDTO, barcodeCacheDTO2, num, bool);
    }

    /* renamed from: component1, reason: from getter */
    public final BarcodeCacheDTO getBarcode() {
        return this.barcode;
    }

    /* renamed from: component2, reason: from getter */
    public final BarcodeCacheDTO getTeensBarcode() {
        return this.teensBarcode;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getErrorRefreshInterval() {
        return this.errorRefreshInterval;
    }

    /* renamed from: component4, reason: from getter */
    public final Boolean getBackendIsOkay() {
        return this.backendIsOkay;
    }

    @NotNull
    public final BarcodeCacheResponseDTO copy(BarcodeCacheDTO barcode, BarcodeCacheDTO teensBarcode, Integer errorRefreshInterval, Boolean backendIsOkay) {
        return new BarcodeCacheResponseDTO(barcode, teensBarcode, errorRefreshInterval, backendIsOkay);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BarcodeCacheResponseDTO)) {
            return false;
        }
        BarcodeCacheResponseDTO barcodeCacheResponseDTO = (BarcodeCacheResponseDTO) other;
        return Intrinsics.d(this.barcode, barcodeCacheResponseDTO.barcode) && Intrinsics.d(this.teensBarcode, barcodeCacheResponseDTO.teensBarcode) && Intrinsics.d(this.errorRefreshInterval, barcodeCacheResponseDTO.errorRefreshInterval) && Intrinsics.d(this.backendIsOkay, barcodeCacheResponseDTO.backendIsOkay);
    }

    public final Boolean getBackendIsOkay() {
        return this.backendIsOkay;
    }

    public final BarcodeCacheDTO getBarcode() {
        return this.barcode;
    }

    public final Integer getErrorRefreshInterval() {
        return this.errorRefreshInterval;
    }

    public final BarcodeCacheDTO getTeensBarcode() {
        return this.teensBarcode;
    }

    public int hashCode() {
        BarcodeCacheDTO barcodeCacheDTO = this.barcode;
        int hashCode = (barcodeCacheDTO == null ? 0 : barcodeCacheDTO.hashCode()) * 31;
        BarcodeCacheDTO barcodeCacheDTO2 = this.teensBarcode;
        int hashCode2 = (hashCode + (barcodeCacheDTO2 == null ? 0 : barcodeCacheDTO2.hashCode())) * 31;
        Integer num = this.errorRefreshInterval;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.backendIsOkay;
        return hashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "BarcodeCacheResponseDTO(barcode=" + this.barcode + ", teensBarcode=" + this.teensBarcode + ", errorRefreshInterval=" + this.errorRefreshInterval + ", backendIsOkay=" + this.backendIsOkay + ")";
    }
}
