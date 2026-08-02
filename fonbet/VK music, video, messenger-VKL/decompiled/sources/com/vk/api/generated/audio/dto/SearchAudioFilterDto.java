package com.vk.api.generated.audio.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SearchAudioFilterDto.kt */
/* loaded from: classes14.dex */
public final class SearchAudioFilterDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ SearchAudioFilterDto[] $VALUES;

    @pmi0("all")
    public static final SearchAudioFilterDto ALL;
    public static final Parcelable.Creator<SearchAudioFilterDto> CREATOR;

    @pmi0("global")
    public static final SearchAudioFilterDto GLOBAL;

    @pmi0("owned")
    public static final SearchAudioFilterDto OWNED;
    private final String value;

    /* compiled from: SearchAudioFilterDto.kt */
    public static final class a implements Parcelable.Creator<SearchAudioFilterDto> {
        @Override // android.os.Parcelable.Creator
        public final SearchAudioFilterDto createFromParcel(Parcel parcel) {
            return SearchAudioFilterDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SearchAudioFilterDto[] newArray(int i) {
            return new SearchAudioFilterDto[i];
        }
    }

    static {
        SearchAudioFilterDto searchAudioFilterDto = new SearchAudioFilterDto("ALL", 0, "all");
        ALL = searchAudioFilterDto;
        SearchAudioFilterDto searchAudioFilterDto2 = new SearchAudioFilterDto("GLOBAL", 1, "global");
        GLOBAL = searchAudioFilterDto2;
        SearchAudioFilterDto searchAudioFilterDto3 = new SearchAudioFilterDto("OWNED", 2, "owned");
        OWNED = searchAudioFilterDto3;
        SearchAudioFilterDto[] searchAudioFilterDtoArr = {searchAudioFilterDto, searchAudioFilterDto2, searchAudioFilterDto3};
        $VALUES = searchAudioFilterDtoArr;
        $ENTRIES = new asp(searchAudioFilterDtoArr);
        CREATOR = new a();
    }

    private SearchAudioFilterDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static SearchAudioFilterDto valueOf(String str) {
        return (SearchAudioFilterDto) Enum.valueOf(SearchAudioFilterDto.class, str);
    }

    public static SearchAudioFilterDto[] values() {
        return (SearchAudioFilterDto[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
