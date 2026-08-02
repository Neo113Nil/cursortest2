package com.vk.api.generated.catalog.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: CatalogSectionBlockLinkDto.kt */
/* loaded from: classes14.dex */
public final class CatalogSectionBlockLinkDto implements Parcelable {
    public static final Parcelable.Creator<CatalogSectionBlockLinkDto> CREATOR = new a();

    @pmi0("block_id")
    private final String blockId;

    @pmi0("title")
    private final String title;

    /* compiled from: CatalogSectionBlockLinkDto.kt */
    public static final class a implements Parcelable.Creator<CatalogSectionBlockLinkDto> {
        @Override // android.os.Parcelable.Creator
        public final CatalogSectionBlockLinkDto createFromParcel(Parcel parcel) {
            return new CatalogSectionBlockLinkDto(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CatalogSectionBlockLinkDto[] newArray(int i) {
            return new CatalogSectionBlockLinkDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CatalogSectionBlockLinkDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogSectionBlockLinkDto)) {
            return false;
        }
        CatalogSectionBlockLinkDto catalogSectionBlockLinkDto = (CatalogSectionBlockLinkDto) obj;
        return epx.f(this.title, catalogSectionBlockLinkDto.title) && epx.f(this.blockId, catalogSectionBlockLinkDto.blockId);
    }

    public final int hashCode() {
        String str = this.title;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.blockId;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CatalogSectionBlockLinkDto(title=");
        sb.append(this.title);
        sb.append(", blockId=");
        return ho8.a(sb, this.blockId, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeString(this.blockId);
    }

    public CatalogSectionBlockLinkDto(String str, String str2) {
        this.title = str;
        this.blockId = str2;
    }

    public /* synthetic */ CatalogSectionBlockLinkDto(String str, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
