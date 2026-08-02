package ru.ozon.fintech.features.operations.network;

import V.e;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/fintech/features/operations/network/MerchantDto;", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "logoUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getLogoUrl", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "operations_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class MerchantDto {

    @NotNull
    private final String logoUrl;

    @NotNull
    private final String name;

    public MerchantDto(@i(name = "name") @NotNull String name, @i(name = "logoUrl") @NotNull String logoUrl) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(logoUrl, "logoUrl");
        this.name = name;
        this.logoUrl = logoUrl;
    }

    public static /* synthetic */ MerchantDto copy$default(MerchantDto merchantDto, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = merchantDto.name;
        }
        if ((i11 & 2) != 0) {
            str2 = merchantDto.logoUrl;
        }
        return merchantDto.copy(str, str2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getLogoUrl() {
        return this.logoUrl;
    }

    @NotNull
    public final MerchantDto copy(@i(name = "name") @NotNull String name, @i(name = "logoUrl") @NotNull String logoUrl) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(logoUrl, "logoUrl");
        return new MerchantDto(name, logoUrl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MerchantDto)) {
            return false;
        }
        MerchantDto merchantDto = (MerchantDto) other;
        return Intrinsics.d(this.name, merchantDto.name) && Intrinsics.d(this.logoUrl, merchantDto.logoUrl);
    }

    @NotNull
    public final String getLogoUrl() {
        return this.logoUrl;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return this.logoUrl.hashCode() + (this.name.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return e.a("MerchantDto(name=", this.name, ", logoUrl=", this.logoUrl, ")");
    }
}
