package com.vk.api.generated.search.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.coremedia.iso.boxes.MetaBox;
import xsna.epx;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;

/* compiled from: SearchSeoPageDto.kt */
/* loaded from: classes15.dex */
public final class SearchSeoPageDto implements Parcelable {
    public static final Parcelable.Creator<SearchSeoPageDto> CREATOR = new a();

    @pmi0("description")
    private final String description;

    @pmi0("id")
    private final String id;

    @pmi0(MetaBox.TYPE)
    private final SearchSeoPageMetaDto meta;

    @pmi0("search_query")
    private final String searchQuery;

    @pmi0("title")
    private final String title;

    @pmi0("track_code")
    private final String trackCode;

    /* compiled from: SearchSeoPageDto.kt */
    public static final class a implements Parcelable.Creator<SearchSeoPageDto> {
        @Override // android.os.Parcelable.Creator
        public final SearchSeoPageDto createFromParcel(Parcel parcel) {
            return new SearchSeoPageDto(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : SearchSeoPageMetaDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final SearchSeoPageDto[] newArray(int i) {
            return new SearchSeoPageDto[i];
        }
    }

    public SearchSeoPageDto(String str, String str2, String str3, String str4, String str5, SearchSeoPageMetaDto searchSeoPageMetaDto) {
        this.id = str;
        this.title = str2;
        this.description = str3;
        this.searchQuery = str4;
        this.trackCode = str5;
        this.meta = searchSeoPageMetaDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchSeoPageDto)) {
            return false;
        }
        SearchSeoPageDto searchSeoPageDto = (SearchSeoPageDto) obj;
        return epx.f(this.id, searchSeoPageDto.id) && epx.f(this.title, searchSeoPageDto.title) && epx.f(this.description, searchSeoPageDto.description) && epx.f(this.searchQuery, searchSeoPageDto.searchQuery) && epx.f(this.trackCode, searchSeoPageDto.trackCode) && epx.f(this.meta, searchSeoPageDto.meta);
    }

    public final int hashCode() {
        int a2 = urd0.a(urd0.a(urd0.a(this.id.hashCode() * 31, 31, this.title), 31, this.description), 31, this.searchQuery);
        String str = this.trackCode;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        SearchSeoPageMetaDto searchSeoPageMetaDto = this.meta;
        return hashCode + (searchSeoPageMetaDto != null ? searchSeoPageMetaDto.hashCode() : 0);
    }

    public final String toString() {
        return "SearchSeoPageDto(id=" + this.id + ", title=" + this.title + ", description=" + this.description + ", searchQuery=" + this.searchQuery + ", trackCode=" + this.trackCode + ", meta=" + this.meta + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeString(this.title);
        parcel.writeString(this.description);
        parcel.writeString(this.searchQuery);
        parcel.writeString(this.trackCode);
        SearchSeoPageMetaDto searchSeoPageMetaDto = this.meta;
        if (searchSeoPageMetaDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            searchSeoPageMetaDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ SearchSeoPageDto(String str, String str2, String str3, String str4, String str5, SearchSeoPageMetaDto searchSeoPageMetaDto, int i, zcl zclVar) {
        this(str, str2, str3, str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : searchSeoPageMetaDto);
    }
}
