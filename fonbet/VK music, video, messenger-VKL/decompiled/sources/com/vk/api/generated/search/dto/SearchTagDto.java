package com.vk.api.generated.search.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: SearchTagDto.kt */
/* loaded from: classes15.dex */
public final class SearchTagDto implements Parcelable {
    public static final Parcelable.Creator<SearchTagDto> CREATOR = new a();

    @pmi0("id")
    private final int id;

    @pmi0("name")
    private final String name;

    /* compiled from: SearchTagDto.kt */
    public static final class a implements Parcelable.Creator<SearchTagDto> {
        @Override // android.os.Parcelable.Creator
        public final SearchTagDto createFromParcel(Parcel parcel) {
            return new SearchTagDto(parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SearchTagDto[] newArray(int i) {
            return new SearchTagDto[i];
        }
    }

    public SearchTagDto(int i, String str) {
        this.id = i;
        this.name = str;
    }

    public final String d() {
        return this.name;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchTagDto)) {
            return false;
        }
        SearchTagDto searchTagDto = (SearchTagDto) obj;
        return this.id == searchTagDto.id && epx.f(this.name, searchTagDto.name);
    }

    public final int getId() {
        return this.id;
    }

    public final int hashCode() {
        return this.name.hashCode() + (Integer.hashCode(this.id) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SearchTagDto(id=");
        sb.append(this.id);
        sb.append(", name=");
        return ho8.a(sb, this.name, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        parcel.writeString(this.name);
    }
}
