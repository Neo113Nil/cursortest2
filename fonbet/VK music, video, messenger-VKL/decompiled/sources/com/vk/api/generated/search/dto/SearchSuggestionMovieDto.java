package com.vk.api.generated.search.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import io.reactivex.rxjava3.subjects.b;
import xsna.epx;
import xsna.ho8;
import xsna.nr;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;

/* compiled from: SearchSuggestionMovieDto.kt */
/* loaded from: classes15.dex */
public final class SearchSuggestionMovieDto implements Parcelable {
    public static final Parcelable.Creator<SearchSuggestionMovieDto> CREATOR = new a();

    @pmi0("age_restrict")
    private final String ageRestrict;

    @pmi0("country")
    private final String country;

    @pmi0("duration")
    private final Integer duration;

    @pmi0("id")
    private final int id;

    @pmi0("name_eng")
    private final String nameEng;

    @pmi0("poster_picture")
    private final String posterPicture;

    @pmi0(CampaignEx.JSON_KEY_STAR)
    private final Float rating;

    @pmi0("year")
    private final Integer year;

    /* compiled from: SearchSuggestionMovieDto.kt */
    public static final class a implements Parcelable.Creator<SearchSuggestionMovieDto> {
        @Override // android.os.Parcelable.Creator
        public final SearchSuggestionMovieDto createFromParcel(Parcel parcel) {
            Float valueOf;
            Integer num;
            int readInt = parcel.readInt();
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf = null;
                num = null;
            } else {
                valueOf = Float.valueOf(parcel.readFloat());
                num = null;
            }
            String readString2 = parcel.readString();
            Integer valueOf2 = parcel.readInt() == 0 ? num : Integer.valueOf(parcel.readInt());
            String readString3 = parcel.readString();
            if (parcel.readInt() != 0) {
                num = Integer.valueOf(parcel.readInt());
            }
            return new SearchSuggestionMovieDto(readInt, readString, valueOf, readString2, valueOf2, readString3, num, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SearchSuggestionMovieDto[] newArray(int i) {
            return new SearchSuggestionMovieDto[i];
        }
    }

    public SearchSuggestionMovieDto(int i, String str, Float f, String str2, Integer num, String str3, Integer num2, String str4) {
        this.id = i;
        this.posterPicture = str;
        this.rating = f;
        this.ageRestrict = str2;
        this.year = num;
        this.country = str3;
        this.duration = num2;
        this.nameEng = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchSuggestionMovieDto)) {
            return false;
        }
        SearchSuggestionMovieDto searchSuggestionMovieDto = (SearchSuggestionMovieDto) obj;
        return this.id == searchSuggestionMovieDto.id && epx.f(this.posterPicture, searchSuggestionMovieDto.posterPicture) && epx.f(this.rating, searchSuggestionMovieDto.rating) && epx.f(this.ageRestrict, searchSuggestionMovieDto.ageRestrict) && epx.f(this.year, searchSuggestionMovieDto.year) && epx.f(this.country, searchSuggestionMovieDto.country) && epx.f(this.duration, searchSuggestionMovieDto.duration) && epx.f(this.nameEng, searchSuggestionMovieDto.nameEng);
    }

    public final int hashCode() {
        int a2 = urd0.a(Integer.hashCode(this.id) * 31, 31, this.posterPicture);
        Float f = this.rating;
        int hashCode = (a2 + (f == null ? 0 : f.hashCode())) * 31;
        String str = this.ageRestrict;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.year;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.country;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num2 = this.duration;
        int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str3 = this.nameEng;
        return hashCode5 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SearchSuggestionMovieDto(id=");
        sb.append(this.id);
        sb.append(", posterPicture=");
        sb.append(this.posterPicture);
        sb.append(", rating=");
        sb.append(this.rating);
        sb.append(", ageRestrict=");
        sb.append(this.ageRestrict);
        sb.append(", year=");
        sb.append(this.year);
        sb.append(", country=");
        sb.append(this.country);
        sb.append(", duration=");
        sb.append(this.duration);
        sb.append(", nameEng=");
        return ho8.a(sb, this.nameEng, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        parcel.writeString(this.posterPicture);
        Float f = this.rating;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            b.d(parcel, 1, f);
        }
        parcel.writeString(this.ageRestrict);
        Integer num = this.year;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeString(this.country);
        Integer num2 = this.duration;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        parcel.writeString(this.nameEng);
    }

    public /* synthetic */ SearchSuggestionMovieDto(int i, String str, Float f, String str2, Integer num, String str3, Integer num2, String str4, int i2, zcl zclVar) {
        this(i, str, (i2 & 4) != 0 ? null : f, (i2 & 8) != 0 ? null : str2, (i2 & 16) != 0 ? null : num, (i2 & 32) != 0 ? null : str3, (i2 & 64) != 0 ? null : num2, (i2 & 128) != 0 ? null : str4);
    }
}
