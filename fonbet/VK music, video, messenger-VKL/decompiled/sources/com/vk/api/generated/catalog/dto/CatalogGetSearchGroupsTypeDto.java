package com.vk.api.generated.catalog.dto;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.NotificationCompat;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CatalogGetSearchGroupsTypeDto.kt */
/* loaded from: classes14.dex */
public final class CatalogGetSearchGroupsTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CatalogGetSearchGroupsTypeDto[] $VALUES;
    public static final Parcelable.Creator<CatalogGetSearchGroupsTypeDto> CREATOR;

    @pmi0(NotificationCompat.CATEGORY_EVENT)
    public static final CatalogGetSearchGroupsTypeDto EVENT;

    @pmi0("group")
    public static final CatalogGetSearchGroupsTypeDto GROUP;

    @pmi0("page")
    public static final CatalogGetSearchGroupsTypeDto PAGE;
    private final String value;

    /* compiled from: CatalogGetSearchGroupsTypeDto.kt */
    public static final class a implements Parcelable.Creator<CatalogGetSearchGroupsTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final CatalogGetSearchGroupsTypeDto createFromParcel(Parcel parcel) {
            return CatalogGetSearchGroupsTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CatalogGetSearchGroupsTypeDto[] newArray(int i) {
            return new CatalogGetSearchGroupsTypeDto[i];
        }
    }

    static {
        CatalogGetSearchGroupsTypeDto catalogGetSearchGroupsTypeDto = new CatalogGetSearchGroupsTypeDto("EVENT", 0, NotificationCompat.CATEGORY_EVENT);
        EVENT = catalogGetSearchGroupsTypeDto;
        CatalogGetSearchGroupsTypeDto catalogGetSearchGroupsTypeDto2 = new CatalogGetSearchGroupsTypeDto("GROUP", 1, "group");
        GROUP = catalogGetSearchGroupsTypeDto2;
        CatalogGetSearchGroupsTypeDto catalogGetSearchGroupsTypeDto3 = new CatalogGetSearchGroupsTypeDto("PAGE", 2, "page");
        PAGE = catalogGetSearchGroupsTypeDto3;
        CatalogGetSearchGroupsTypeDto[] catalogGetSearchGroupsTypeDtoArr = {catalogGetSearchGroupsTypeDto, catalogGetSearchGroupsTypeDto2, catalogGetSearchGroupsTypeDto3};
        $VALUES = catalogGetSearchGroupsTypeDtoArr;
        $ENTRIES = new asp(catalogGetSearchGroupsTypeDtoArr);
        CREATOR = new a();
    }

    private CatalogGetSearchGroupsTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static CatalogGetSearchGroupsTypeDto valueOf(String str) {
        return (CatalogGetSearchGroupsTypeDto) Enum.valueOf(CatalogGetSearchGroupsTypeDto.class, str);
    }

    public static CatalogGetSearchGroupsTypeDto[] values() {
        return (CatalogGetSearchGroupsTypeDto[]) $VALUES.clone();
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
