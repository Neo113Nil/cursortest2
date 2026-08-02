package com.vk.api.generated.search.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.urd0;

/* compiled from: SearchSpellcheckerDto.kt */
/* loaded from: classes15.dex */
public final class SearchSpellcheckerDto implements Parcelable {
    public static final Parcelable.Creator<SearchSpellcheckerDto> CREATOR = new a();

    @pmi0("id")
    private final String id;

    @pmi0("query")
    private final SearchSpellcheckerQueryDto query;

    @pmi0("search_action")
    private final SearchSpellcheckerSearchActionDto searchAction;

    @pmi0("suggest")
    private final String suggest;

    @pmi0("title")
    private final String title;

    @pmi0("track_code")
    private final String trackCode;

    @pmi0("user_input_to_replace")
    private final String userInputToReplace;

    /* compiled from: SearchSpellcheckerDto.kt */
    public static final class a implements Parcelable.Creator<SearchSpellcheckerDto> {
        @Override // android.os.Parcelable.Creator
        public final SearchSpellcheckerDto createFromParcel(Parcel parcel) {
            return new SearchSpellcheckerDto(parcel.readString(), parcel.readString(), parcel.readString(), SearchSpellcheckerQueryDto.CREATOR.createFromParcel(parcel), SearchSpellcheckerSearchActionDto.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SearchSpellcheckerDto[] newArray(int i) {
            return new SearchSpellcheckerDto[i];
        }
    }

    public SearchSpellcheckerDto(String str, String str2, String str3, SearchSpellcheckerQueryDto searchSpellcheckerQueryDto, SearchSpellcheckerSearchActionDto searchSpellcheckerSearchActionDto, String str4, String str5) {
        this.id = str;
        this.trackCode = str2;
        this.userInputToReplace = str3;
        this.query = searchSpellcheckerQueryDto;
        this.searchAction = searchSpellcheckerSearchActionDto;
        this.title = str4;
        this.suggest = str5;
    }

    public final SearchSpellcheckerQueryDto d() {
        return this.query;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final SearchSpellcheckerSearchActionDto e() {
        return this.searchAction;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchSpellcheckerDto)) {
            return false;
        }
        SearchSpellcheckerDto searchSpellcheckerDto = (SearchSpellcheckerDto) obj;
        return epx.f(this.id, searchSpellcheckerDto.id) && epx.f(this.trackCode, searchSpellcheckerDto.trackCode) && epx.f(this.userInputToReplace, searchSpellcheckerDto.userInputToReplace) && epx.f(this.query, searchSpellcheckerDto.query) && epx.f(this.searchAction, searchSpellcheckerDto.searchAction) && epx.f(this.title, searchSpellcheckerDto.title) && epx.f(this.suggest, searchSpellcheckerDto.suggest);
    }

    public final String f() {
        return this.suggest;
    }

    public final String g() {
        return this.userInputToReplace;
    }

    public final String getId() {
        return this.id;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        return this.suggest.hashCode() + urd0.a((this.searchAction.hashCode() + ((this.query.hashCode() + urd0.a(urd0.a(this.id.hashCode() * 31, 31, this.trackCode), 31, this.userInputToReplace)) * 31)) * 31, 31, this.title);
    }

    public final String r() {
        return this.trackCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SearchSpellcheckerDto(id=");
        sb.append(this.id);
        sb.append(", trackCode=");
        sb.append(this.trackCode);
        sb.append(", userInputToReplace=");
        sb.append(this.userInputToReplace);
        sb.append(", query=");
        sb.append(this.query);
        sb.append(", searchAction=");
        sb.append(this.searchAction);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", suggest=");
        return ho8.a(sb, this.suggest, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeString(this.trackCode);
        parcel.writeString(this.userInputToReplace);
        this.query.writeToParcel(parcel, i);
        this.searchAction.writeToParcel(parcel, i);
        parcel.writeString(this.title);
        parcel.writeString(this.suggest);
    }
}
