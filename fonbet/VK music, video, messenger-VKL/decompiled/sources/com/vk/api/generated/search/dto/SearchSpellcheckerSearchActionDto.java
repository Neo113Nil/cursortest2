package com.vk.api.generated.search.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: SearchSpellcheckerSearchActionDto.kt */
/* loaded from: classes15.dex */
public final class SearchSpellcheckerSearchActionDto implements Parcelable {
    public static final Parcelable.Creator<SearchSpellcheckerSearchActionDto> CREATOR = new a();

    @pmi0("next_search_query")
    private final String nextSearchQuery;

    @pmi0("text")
    private final String text;

    /* compiled from: SearchSpellcheckerSearchActionDto.kt */
    public static final class a implements Parcelable.Creator<SearchSpellcheckerSearchActionDto> {
        @Override // android.os.Parcelable.Creator
        public final SearchSpellcheckerSearchActionDto createFromParcel(Parcel parcel) {
            return new SearchSpellcheckerSearchActionDto(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SearchSpellcheckerSearchActionDto[] newArray(int i) {
            return new SearchSpellcheckerSearchActionDto[i];
        }
    }

    public SearchSpellcheckerSearchActionDto(String str, String str2) {
        this.text = str;
        this.nextSearchQuery = str2;
    }

    public final String d() {
        return this.nextSearchQuery;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.text;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchSpellcheckerSearchActionDto)) {
            return false;
        }
        SearchSpellcheckerSearchActionDto searchSpellcheckerSearchActionDto = (SearchSpellcheckerSearchActionDto) obj;
        return epx.f(this.text, searchSpellcheckerSearchActionDto.text) && epx.f(this.nextSearchQuery, searchSpellcheckerSearchActionDto.nextSearchQuery);
    }

    public final int hashCode() {
        return this.nextSearchQuery.hashCode() + (this.text.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SearchSpellcheckerSearchActionDto(text=");
        sb.append(this.text);
        sb.append(", nextSearchQuery=");
        return ho8.a(sb, this.nextSearchQuery, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.text);
        parcel.writeString(this.nextSearchQuery);
    }
}
