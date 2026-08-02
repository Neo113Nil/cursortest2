package com.vk.api.generated.search.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: SearchSeoPageMetaDto.kt */
/* loaded from: classes15.dex */
public final class SearchSeoPageMetaDto implements Parcelable {
    public static final Parcelable.Creator<SearchSeoPageMetaDto> CREATOR = new a();

    @pmi0("description")
    private final String description;

    @pmi0("keywords")
    private final String keywords;

    /* compiled from: SearchSeoPageMetaDto.kt */
    public static final class a implements Parcelable.Creator<SearchSeoPageMetaDto> {
        @Override // android.os.Parcelable.Creator
        public final SearchSeoPageMetaDto createFromParcel(Parcel parcel) {
            return new SearchSeoPageMetaDto(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SearchSeoPageMetaDto[] newArray(int i) {
            return new SearchSeoPageMetaDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SearchSeoPageMetaDto() {
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
        if (!(obj instanceof SearchSeoPageMetaDto)) {
            return false;
        }
        SearchSeoPageMetaDto searchSeoPageMetaDto = (SearchSeoPageMetaDto) obj;
        return epx.f(this.description, searchSeoPageMetaDto.description) && epx.f(this.keywords, searchSeoPageMetaDto.keywords);
    }

    public final int hashCode() {
        String str = this.description;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.keywords;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SearchSeoPageMetaDto(description=");
        sb.append(this.description);
        sb.append(", keywords=");
        return ho8.a(sb, this.keywords, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.description);
        parcel.writeString(this.keywords);
    }

    public SearchSeoPageMetaDto(String str, String str2) {
        this.description = str;
        this.keywords = str2;
    }

    public /* synthetic */ SearchSeoPageMetaDto(String str, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
