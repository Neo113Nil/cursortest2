package com.vk.api.generated.catalog.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CatalogGetClassifiedsSortDirectionDto.kt */
/* loaded from: classes14.dex */
public final class CatalogGetClassifiedsSortDirectionDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CatalogGetClassifiedsSortDirectionDto[] $VALUES;

    @pmi0("asc")
    public static final CatalogGetClassifiedsSortDirectionDto ASC;
    public static final Parcelable.Creator<CatalogGetClassifiedsSortDirectionDto> CREATOR;

    @pmi0(CampaignEx.JSON_KEY_DESC)
    public static final CatalogGetClassifiedsSortDirectionDto DESC;
    private final String value;

    /* compiled from: CatalogGetClassifiedsSortDirectionDto.kt */
    public static final class a implements Parcelable.Creator<CatalogGetClassifiedsSortDirectionDto> {
        @Override // android.os.Parcelable.Creator
        public final CatalogGetClassifiedsSortDirectionDto createFromParcel(Parcel parcel) {
            return CatalogGetClassifiedsSortDirectionDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CatalogGetClassifiedsSortDirectionDto[] newArray(int i) {
            return new CatalogGetClassifiedsSortDirectionDto[i];
        }
    }

    static {
        CatalogGetClassifiedsSortDirectionDto catalogGetClassifiedsSortDirectionDto = new CatalogGetClassifiedsSortDirectionDto("ASC", 0, "asc");
        ASC = catalogGetClassifiedsSortDirectionDto;
        CatalogGetClassifiedsSortDirectionDto catalogGetClassifiedsSortDirectionDto2 = new CatalogGetClassifiedsSortDirectionDto("DESC", 1, CampaignEx.JSON_KEY_DESC);
        DESC = catalogGetClassifiedsSortDirectionDto2;
        CatalogGetClassifiedsSortDirectionDto[] catalogGetClassifiedsSortDirectionDtoArr = {catalogGetClassifiedsSortDirectionDto, catalogGetClassifiedsSortDirectionDto2};
        $VALUES = catalogGetClassifiedsSortDirectionDtoArr;
        $ENTRIES = new asp(catalogGetClassifiedsSortDirectionDtoArr);
        CREATOR = new a();
    }

    private CatalogGetClassifiedsSortDirectionDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static CatalogGetClassifiedsSortDirectionDto valueOf(String str) {
        return (CatalogGetClassifiedsSortDirectionDto) Enum.valueOf(CatalogGetClassifiedsSortDirectionDto.class, str);
    }

    public static CatalogGetClassifiedsSortDirectionDto[] values() {
        return (CatalogGetClassifiedsSortDirectionDto[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
