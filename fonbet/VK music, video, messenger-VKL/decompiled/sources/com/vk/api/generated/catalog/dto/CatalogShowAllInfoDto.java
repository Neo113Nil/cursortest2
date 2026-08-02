package com.vk.api.generated.catalog.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: CatalogShowAllInfoDto.kt */
/* loaded from: classes14.dex */
public final class CatalogShowAllInfoDto implements Parcelable {
    public static final Parcelable.Creator<CatalogShowAllInfoDto> CREATOR = new a();

    @pmi0("section_id")
    private final String sectionId;

    @pmi0("title")
    private final String title;

    /* compiled from: CatalogShowAllInfoDto.kt */
    public static final class a implements Parcelable.Creator<CatalogShowAllInfoDto> {
        @Override // android.os.Parcelable.Creator
        public final CatalogShowAllInfoDto createFromParcel(Parcel parcel) {
            return new CatalogShowAllInfoDto(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CatalogShowAllInfoDto[] newArray(int i) {
            return new CatalogShowAllInfoDto[i];
        }
    }

    public CatalogShowAllInfoDto(String str, String str2) {
        this.title = str;
        this.sectionId = str2;
    }

    public final String d() {
        return this.sectionId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogShowAllInfoDto)) {
            return false;
        }
        CatalogShowAllInfoDto catalogShowAllInfoDto = (CatalogShowAllInfoDto) obj;
        return epx.f(this.title, catalogShowAllInfoDto.title) && epx.f(this.sectionId, catalogShowAllInfoDto.sectionId);
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        return this.sectionId.hashCode() + (this.title.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CatalogShowAllInfoDto(title=");
        sb.append(this.title);
        sb.append(", sectionId=");
        return ho8.a(sb, this.sectionId, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeString(this.sectionId);
    }
}
