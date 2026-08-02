package com.vk.api.generated.catalog.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CatalogGetClassifiedsCatalogContextDto.kt */
/* loaded from: classes14.dex */
public final class CatalogGetClassifiedsCatalogContextDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CatalogGetClassifiedsCatalogContextDto[] $VALUES;

    @pmi0("classifieds")
    public static final CatalogGetClassifiedsCatalogContextDto CLASSIFIEDS;
    public static final Parcelable.Creator<CatalogGetClassifiedsCatalogContextDto> CREATOR;

    @pmi0("market")
    public static final CatalogGetClassifiedsCatalogContextDto MARKET;

    @pmi0("unknown")
    public static final CatalogGetClassifiedsCatalogContextDto UNKNOWN;
    private final String value;

    /* compiled from: CatalogGetClassifiedsCatalogContextDto.kt */
    public static final class a implements Parcelable.Creator<CatalogGetClassifiedsCatalogContextDto> {
        @Override // android.os.Parcelable.Creator
        public final CatalogGetClassifiedsCatalogContextDto createFromParcel(Parcel parcel) {
            return CatalogGetClassifiedsCatalogContextDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CatalogGetClassifiedsCatalogContextDto[] newArray(int i) {
            return new CatalogGetClassifiedsCatalogContextDto[i];
        }
    }

    static {
        CatalogGetClassifiedsCatalogContextDto catalogGetClassifiedsCatalogContextDto = new CatalogGetClassifiedsCatalogContextDto("CLASSIFIEDS", 0, "classifieds");
        CLASSIFIEDS = catalogGetClassifiedsCatalogContextDto;
        CatalogGetClassifiedsCatalogContextDto catalogGetClassifiedsCatalogContextDto2 = new CatalogGetClassifiedsCatalogContextDto("MARKET", 1, "market");
        MARKET = catalogGetClassifiedsCatalogContextDto2;
        CatalogGetClassifiedsCatalogContextDto catalogGetClassifiedsCatalogContextDto3 = new CatalogGetClassifiedsCatalogContextDto(GrsBaseInfo.CountryCodeSource.UNKNOWN, 2, "unknown");
        UNKNOWN = catalogGetClassifiedsCatalogContextDto3;
        CatalogGetClassifiedsCatalogContextDto[] catalogGetClassifiedsCatalogContextDtoArr = {catalogGetClassifiedsCatalogContextDto, catalogGetClassifiedsCatalogContextDto2, catalogGetClassifiedsCatalogContextDto3};
        $VALUES = catalogGetClassifiedsCatalogContextDtoArr;
        $ENTRIES = new asp(catalogGetClassifiedsCatalogContextDtoArr);
        CREATOR = new a();
    }

    private CatalogGetClassifiedsCatalogContextDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static CatalogGetClassifiedsCatalogContextDto valueOf(String str) {
        return (CatalogGetClassifiedsCatalogContextDto) Enum.valueOf(CatalogGetClassifiedsCatalogContextDto.class, str);
    }

    public static CatalogGetClassifiedsCatalogContextDto[] values() {
        return (CatalogGetClassifiedsCatalogContextDto[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String i() {
        return this.value;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
