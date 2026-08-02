package com.vk.api.generated.search.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: SearchSpellcheckerQueryDto.kt */
/* loaded from: classes15.dex */
public final class SearchSpellcheckerQueryDto implements Parcelable {
    public static final Parcelable.Creator<SearchSpellcheckerQueryDto> CREATOR = new a();

    @pmi0("text")
    private final String text;

    /* compiled from: SearchSpellcheckerQueryDto.kt */
    public static final class a implements Parcelable.Creator<SearchSpellcheckerQueryDto> {
        @Override // android.os.Parcelable.Creator
        public final SearchSpellcheckerQueryDto createFromParcel(Parcel parcel) {
            return new SearchSpellcheckerQueryDto(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SearchSpellcheckerQueryDto[] newArray(int i) {
            return new SearchSpellcheckerQueryDto[i];
        }
    }

    public SearchSpellcheckerQueryDto(String str) {
        this.text = str;
    }

    public final String d() {
        return this.text;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SearchSpellcheckerQueryDto) && epx.f(this.text, ((SearchSpellcheckerQueryDto) obj).text);
    }

    public final int hashCode() {
        return this.text.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("SearchSpellcheckerQueryDto(text="), this.text, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.text);
    }
}
