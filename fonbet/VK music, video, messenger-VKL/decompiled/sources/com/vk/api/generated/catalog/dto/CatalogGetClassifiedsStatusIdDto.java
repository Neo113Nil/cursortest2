package com.vk.api.generated.catalog.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.C4217a2;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CatalogGetClassifiedsStatusIdDto.kt */
/* loaded from: classes14.dex */
public final class CatalogGetClassifiedsStatusIdDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CatalogGetClassifiedsStatusIdDto[] $VALUES;

    @pmi0("all_items")
    public static final CatalogGetClassifiedsStatusIdDto ALL_ITEMS;

    @pmi0("banned")
    public static final CatalogGetClassifiedsStatusIdDto BANNED;
    public static final Parcelable.Creator<CatalogGetClassifiedsStatusIdDto> CREATOR;

    @pmi0(C4217a2.e)
    public static final CatalogGetClassifiedsStatusIdDto DISABLED;

    @pmi0("not_in_market")
    public static final CatalogGetClassifiedsStatusIdDto NOT_IN_MARKET;
    private final String value;

    /* compiled from: CatalogGetClassifiedsStatusIdDto.kt */
    public static final class a implements Parcelable.Creator<CatalogGetClassifiedsStatusIdDto> {
        @Override // android.os.Parcelable.Creator
        public final CatalogGetClassifiedsStatusIdDto createFromParcel(Parcel parcel) {
            return CatalogGetClassifiedsStatusIdDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CatalogGetClassifiedsStatusIdDto[] newArray(int i) {
            return new CatalogGetClassifiedsStatusIdDto[i];
        }
    }

    static {
        CatalogGetClassifiedsStatusIdDto catalogGetClassifiedsStatusIdDto = new CatalogGetClassifiedsStatusIdDto("ALL_ITEMS", 0, "all_items");
        ALL_ITEMS = catalogGetClassifiedsStatusIdDto;
        CatalogGetClassifiedsStatusIdDto catalogGetClassifiedsStatusIdDto2 = new CatalogGetClassifiedsStatusIdDto("BANNED", 1, "banned");
        BANNED = catalogGetClassifiedsStatusIdDto2;
        CatalogGetClassifiedsStatusIdDto catalogGetClassifiedsStatusIdDto3 = new CatalogGetClassifiedsStatusIdDto("DISABLED", 2, C4217a2.e);
        DISABLED = catalogGetClassifiedsStatusIdDto3;
        CatalogGetClassifiedsStatusIdDto catalogGetClassifiedsStatusIdDto4 = new CatalogGetClassifiedsStatusIdDto("NOT_IN_MARKET", 3, "not_in_market");
        NOT_IN_MARKET = catalogGetClassifiedsStatusIdDto4;
        CatalogGetClassifiedsStatusIdDto[] catalogGetClassifiedsStatusIdDtoArr = {catalogGetClassifiedsStatusIdDto, catalogGetClassifiedsStatusIdDto2, catalogGetClassifiedsStatusIdDto3, catalogGetClassifiedsStatusIdDto4};
        $VALUES = catalogGetClassifiedsStatusIdDtoArr;
        $ENTRIES = new asp(catalogGetClassifiedsStatusIdDtoArr);
        CREATOR = new a();
    }

    private CatalogGetClassifiedsStatusIdDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static CatalogGetClassifiedsStatusIdDto valueOf(String str) {
        return (CatalogGetClassifiedsStatusIdDto) Enum.valueOf(CatalogGetClassifiedsStatusIdDto.class, str);
    }

    public static CatalogGetClassifiedsStatusIdDto[] values() {
        return (CatalogGetClassifiedsStatusIdDto[]) $VALUES.clone();
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
