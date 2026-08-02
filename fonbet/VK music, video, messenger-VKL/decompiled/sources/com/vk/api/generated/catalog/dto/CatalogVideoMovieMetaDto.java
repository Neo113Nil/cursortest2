package com.vk.api.generated.catalog.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import io.reactivex.rxjava3.subjects.b;
import java.util.List;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: CatalogVideoMovieMetaDto.kt */
/* loaded from: classes14.dex */
public final class CatalogVideoMovieMetaDto implements Parcelable {
    public static final Parcelable.Creator<CatalogVideoMovieMetaDto> CREATOR = new a();

    @pmi0("age_rating")
    private final String ageRating;

    @pmi0("countries")
    private final List<String> countries;

    @pmi0("duration")
    private final Integer duration;

    @pmi0("genres")
    private final List<String> genres;

    @pmi0("original_title")
    private final String originalTitle;

    @pmi0(CampaignEx.JSON_KEY_STAR)
    private final Float rating;

    @pmi0("seasons_in_playlist")
    private final Integer seasonsInPlaylist;

    @pmi0("series_stop_year")
    private final Integer seriesStopYear;

    @pmi0("year")
    private final Integer year;

    /* compiled from: CatalogVideoMovieMetaDto.kt */
    public static final class a implements Parcelable.Creator<CatalogVideoMovieMetaDto> {
        @Override // android.os.Parcelable.Creator
        public final CatalogVideoMovieMetaDto createFromParcel(Parcel parcel) {
            return new CatalogVideoMovieMetaDto(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.createStringArrayList(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.createStringArrayList(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final CatalogVideoMovieMetaDto[] newArray(int i) {
            return new CatalogVideoMovieMetaDto[i];
        }
    }

    public CatalogVideoMovieMetaDto() {
        this(null, null, null, null, null, null, null, null, null, ApiInvocationException.ErrorCodes.IDS_BLOCKED, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogVideoMovieMetaDto)) {
            return false;
        }
        CatalogVideoMovieMetaDto catalogVideoMovieMetaDto = (CatalogVideoMovieMetaDto) obj;
        return epx.f(this.ageRating, catalogVideoMovieMetaDto.ageRating) && epx.f(this.originalTitle, catalogVideoMovieMetaDto.originalTitle) && epx.f(this.duration, catalogVideoMovieMetaDto.duration) && epx.f(this.rating, catalogVideoMovieMetaDto.rating) && epx.f(this.genres, catalogVideoMovieMetaDto.genres) && epx.f(this.year, catalogVideoMovieMetaDto.year) && epx.f(this.seriesStopYear, catalogVideoMovieMetaDto.seriesStopYear) && epx.f(this.countries, catalogVideoMovieMetaDto.countries) && epx.f(this.seasonsInPlaylist, catalogVideoMovieMetaDto.seasonsInPlaylist);
    }

    public final int hashCode() {
        String str = this.ageRating;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.originalTitle;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.duration;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Float f = this.rating;
        int hashCode4 = (hashCode3 + (f == null ? 0 : f.hashCode())) * 31;
        List<String> list = this.genres;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num2 = this.year;
        int hashCode6 = (hashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.seriesStopYear;
        int hashCode7 = (hashCode6 + (num3 == null ? 0 : num3.hashCode())) * 31;
        List<String> list2 = this.countries;
        int hashCode8 = (hashCode7 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Integer num4 = this.seasonsInPlaylist;
        return hashCode8 + (num4 != null ? num4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CatalogVideoMovieMetaDto(ageRating=");
        sb.append(this.ageRating);
        sb.append(", originalTitle=");
        sb.append(this.originalTitle);
        sb.append(", duration=");
        sb.append(this.duration);
        sb.append(", rating=");
        sb.append(this.rating);
        sb.append(", genres=");
        sb.append(this.genres);
        sb.append(", year=");
        sb.append(this.year);
        sb.append(", seriesStopYear=");
        sb.append(this.seriesStopYear);
        sb.append(", countries=");
        sb.append(this.countries);
        sb.append(", seasonsInPlaylist=");
        return uqi.b(sb, this.seasonsInPlaylist, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.ageRating);
        parcel.writeString(this.originalTitle);
        Integer num = this.duration;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Float f = this.rating;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            b.d(parcel, 1, f);
        }
        parcel.writeStringList(this.genres);
        Integer num2 = this.year;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        Integer num3 = this.seriesStopYear;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num3);
        }
        parcel.writeStringList(this.countries);
        Integer num4 = this.seasonsInPlaylist;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num4);
        }
    }

    public CatalogVideoMovieMetaDto(String str, String str2, Integer num, Float f, List<String> list, Integer num2, Integer num3, List<String> list2, Integer num4) {
        this.ageRating = str;
        this.originalTitle = str2;
        this.duration = num;
        this.rating = f;
        this.genres = list;
        this.year = num2;
        this.seriesStopYear = num3;
        this.countries = list2;
        this.seasonsInPlaylist = num4;
    }

    public /* synthetic */ CatalogVideoMovieMetaDto(String str, String str2, Integer num, Float f, List list, Integer num2, Integer num3, List list2, Integer num4, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : f, (i & 16) != 0 ? null : list, (i & 32) != 0 ? null : num2, (i & 64) != 0 ? null : num3, (i & 128) != 0 ? null : list2, (i & 256) != 0 ? null : num4);
    }
}
