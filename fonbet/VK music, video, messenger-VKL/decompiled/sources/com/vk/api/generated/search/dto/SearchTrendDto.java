package com.vk.api.generated.search.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: SearchTrendDto.kt */
/* loaded from: classes15.dex */
public final class SearchTrendDto implements Parcelable {
    public static final Parcelable.Creator<SearchTrendDto> CREATOR = new a();

    @pmi0("caption")
    private final String caption;

    @pmi0("name")
    private final String name;

    /* compiled from: SearchTrendDto.kt */
    public static final class a implements Parcelable.Creator<SearchTrendDto> {
        @Override // android.os.Parcelable.Creator
        public final SearchTrendDto createFromParcel(Parcel parcel) {
            return new SearchTrendDto(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SearchTrendDto[] newArray(int i) {
            return new SearchTrendDto[i];
        }
    }

    public SearchTrendDto(String str, String str2) {
        this.name = str;
        this.caption = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchTrendDto)) {
            return false;
        }
        SearchTrendDto searchTrendDto = (SearchTrendDto) obj;
        return epx.f(this.name, searchTrendDto.name) && epx.f(this.caption, searchTrendDto.caption);
    }

    public final int hashCode() {
        int hashCode = this.name.hashCode() * 31;
        String str = this.caption;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SearchTrendDto(name=");
        sb.append(this.name);
        sb.append(", caption=");
        return ho8.a(sb, this.caption, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.name);
        parcel.writeString(this.caption);
    }

    public /* synthetic */ SearchTrendDto(String str, String str2, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : str2);
    }
}
