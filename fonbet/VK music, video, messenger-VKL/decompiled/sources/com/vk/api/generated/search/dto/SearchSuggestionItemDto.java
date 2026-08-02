package com.vk.api.generated.search.dto;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: SearchSuggestionItemDto.kt */
/* loaded from: classes15.dex */
public final class SearchSuggestionItemDto implements Parcelable {
    public static final Parcelable.Creator<SearchSuggestionItemDto> CREATOR = new a();

    @pmi0("formatted_title")
    private final String formattedTitle;

    @pmi0("icon")
    private final String icon;

    @pmi0("id")
    private final String id;

    @pmi0("link")
    private final String link;

    @pmi0("movie")
    private final SearchSuggestionMovieDto movie;

    @pmi0("subtitle")
    private final String subtitle;

    @pmi0("title")
    private final String title;

    @pmi0("track_code")
    private final String trackCode;

    @pmi0("type")
    private final String type;

    /* compiled from: SearchSuggestionItemDto.kt */
    public static final class a implements Parcelable.Creator<SearchSuggestionItemDto> {
        @Override // android.os.Parcelable.Creator
        public final SearchSuggestionItemDto createFromParcel(Parcel parcel) {
            return new SearchSuggestionItemDto(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : SearchSuggestionMovieDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final SearchSuggestionItemDto[] newArray(int i) {
            return new SearchSuggestionItemDto[i];
        }
    }

    public SearchSuggestionItemDto() {
        this(null, null, null, null, null, null, null, null, null, ApiInvocationException.ErrorCodes.IDS_BLOCKED, null);
    }

    public final String d() {
        return this.formattedTitle;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchSuggestionItemDto)) {
            return false;
        }
        SearchSuggestionItemDto searchSuggestionItemDto = (SearchSuggestionItemDto) obj;
        return epx.f(this.id, searchSuggestionItemDto.id) && epx.f(this.title, searchSuggestionItemDto.title) && epx.f(this.subtitle, searchSuggestionItemDto.subtitle) && epx.f(this.formattedTitle, searchSuggestionItemDto.formattedTitle) && epx.f(this.type, searchSuggestionItemDto.type) && epx.f(this.icon, searchSuggestionItemDto.icon) && epx.f(this.link, searchSuggestionItemDto.link) && epx.f(this.trackCode, searchSuggestionItemDto.trackCode) && epx.f(this.movie, searchSuggestionItemDto.movie);
    }

    public final String getId() {
        return this.id;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getType() {
        return this.type;
    }

    public final int hashCode() {
        String str = this.id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.title;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.subtitle;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.formattedTitle;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.type;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.icon;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.link;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.trackCode;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        SearchSuggestionMovieDto searchSuggestionMovieDto = this.movie;
        return hashCode8 + (searchSuggestionMovieDto != null ? searchSuggestionMovieDto.hashCode() : 0);
    }

    public final String r() {
        return this.trackCode;
    }

    public final String toString() {
        return "SearchSuggestionItemDto(id=" + this.id + ", title=" + this.title + ", subtitle=" + this.subtitle + ", formattedTitle=" + this.formattedTitle + ", type=" + this.type + ", icon=" + this.icon + ", link=" + this.link + ", trackCode=" + this.trackCode + ", movie=" + this.movie + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeString(this.title);
        parcel.writeString(this.subtitle);
        parcel.writeString(this.formattedTitle);
        parcel.writeString(this.type);
        parcel.writeString(this.icon);
        parcel.writeString(this.link);
        parcel.writeString(this.trackCode);
        SearchSuggestionMovieDto searchSuggestionMovieDto = this.movie;
        if (searchSuggestionMovieDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            searchSuggestionMovieDto.writeToParcel(parcel, i);
        }
    }

    public SearchSuggestionItemDto(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, SearchSuggestionMovieDto searchSuggestionMovieDto) {
        this.id = str;
        this.title = str2;
        this.subtitle = str3;
        this.formattedTitle = str4;
        this.type = str5;
        this.icon = str6;
        this.link = str7;
        this.trackCode = str8;
        this.movie = searchSuggestionMovieDto;
    }

    public /* synthetic */ SearchSuggestionItemDto(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, SearchSuggestionMovieDto searchSuggestionMovieDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : searchSuggestionMovieDto);
    }
}
