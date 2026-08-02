package ru.ozon.mapsdk.common.geoproxy.data.model;

import G.g;
import J8.b;
import N3.C3660k;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.mapsdk.common.geoproxy.data.model.GeoProviderConfig;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lru/ozon/mapsdk/common/geoproxy/data/model/KeyInfo;", "", "providerName", "", "keyId", "sdkType", "Lru/ozon/mapsdk/common/geoproxy/data/model/GeoProviderConfig$SdkType;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/mapsdk/common/geoproxy/data/model/GeoProviderConfig$SdkType;)V", "getProviderName", "()Ljava/lang/String;", "getKeyId", "getSdkType", "()Lru/ozon/mapsdk/common/geoproxy/data/model/GeoProviderConfig$SdkType;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "mapsdk_fullFirebaseOpenglRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class KeyInfo {

    @b("keyId")
    @NotNull
    private final String keyId;

    @b("providerName")
    @NotNull
    private final String providerName;

    @b("sdk")
    @NotNull
    private final GeoProviderConfig.SdkType sdkType;

    public KeyInfo(@NotNull String providerName, @NotNull String keyId, @NotNull GeoProviderConfig.SdkType sdkType) {
        Intrinsics.checkNotNullParameter(providerName, "providerName");
        Intrinsics.checkNotNullParameter(keyId, "keyId");
        Intrinsics.checkNotNullParameter(sdkType, "sdkType");
        this.providerName = providerName;
        this.keyId = keyId;
        this.sdkType = sdkType;
    }

    public static /* synthetic */ KeyInfo copy$default(KeyInfo keyInfo, String str, String str2, GeoProviderConfig.SdkType sdkType, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = keyInfo.providerName;
        }
        if ((i11 & 2) != 0) {
            str2 = keyInfo.keyId;
        }
        if ((i11 & 4) != 0) {
            sdkType = keyInfo.sdkType;
        }
        return keyInfo.copy(str, str2, sdkType);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getProviderName() {
        return this.providerName;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getKeyId() {
        return this.keyId;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final GeoProviderConfig.SdkType getSdkType() {
        return this.sdkType;
    }

    @NotNull
    public final KeyInfo copy(@NotNull String providerName, @NotNull String keyId, @NotNull GeoProviderConfig.SdkType sdkType) {
        Intrinsics.checkNotNullParameter(providerName, "providerName");
        Intrinsics.checkNotNullParameter(keyId, "keyId");
        Intrinsics.checkNotNullParameter(sdkType, "sdkType");
        return new KeyInfo(providerName, keyId, sdkType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KeyInfo)) {
            return false;
        }
        KeyInfo keyInfo = (KeyInfo) other;
        return Intrinsics.d(this.providerName, keyInfo.providerName) && Intrinsics.d(this.keyId, keyInfo.keyId) && Intrinsics.d(this.sdkType, keyInfo.sdkType);
    }

    @NotNull
    public final String getKeyId() {
        return this.keyId;
    }

    @NotNull
    public final String getProviderName() {
        return this.providerName;
    }

    @NotNull
    public final GeoProviderConfig.SdkType getSdkType() {
        return this.sdkType;
    }

    public int hashCode() {
        return this.sdkType.hashCode() + g.a(this.providerName.hashCode() * 31, 31, this.keyId);
    }

    @NotNull
    public String toString() {
        String str = this.providerName;
        String str2 = this.keyId;
        GeoProviderConfig.SdkType sdkType = this.sdkType;
        StringBuilder d11 = C3660k.d("KeyInfo(providerName=", str, ", keyId=", str2, ", sdkType=");
        d11.append(sdkType);
        d11.append(")");
        return d11.toString();
    }
}
