package com.vk.api.generated.audio.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SearchAudioSortDto.kt */
/* loaded from: classes14.dex */
public final class SearchAudioSortDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ SearchAudioSortDto[] $VALUES;
    public static final Parcelable.Creator<SearchAudioSortDto> CREATOR;

    @pmi0("0")
    public static final SearchAudioSortDto DATE_ADDED;

    @pmi0("1")
    public static final SearchAudioSortDto DURATION;

    @pmi0("2")
    public static final SearchAudioSortDto POPULARITY;
    private final int value;

    /* compiled from: SearchAudioSortDto.kt */
    public static final class a implements Parcelable.Creator<SearchAudioSortDto> {
        @Override // android.os.Parcelable.Creator
        public final SearchAudioSortDto createFromParcel(Parcel parcel) {
            return SearchAudioSortDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SearchAudioSortDto[] newArray(int i) {
            return new SearchAudioSortDto[i];
        }
    }

    static {
        SearchAudioSortDto searchAudioSortDto = new SearchAudioSortDto("DATE_ADDED", 0, 0);
        DATE_ADDED = searchAudioSortDto;
        SearchAudioSortDto searchAudioSortDto2 = new SearchAudioSortDto("DURATION", 1, 1);
        DURATION = searchAudioSortDto2;
        SearchAudioSortDto searchAudioSortDto3 = new SearchAudioSortDto("POPULARITY", 2, 2);
        POPULARITY = searchAudioSortDto3;
        SearchAudioSortDto[] searchAudioSortDtoArr = {searchAudioSortDto, searchAudioSortDto2, searchAudioSortDto3};
        $VALUES = searchAudioSortDtoArr;
        $ENTRIES = new asp(searchAudioSortDtoArr);
        CREATOR = new a();
    }

    private SearchAudioSortDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static SearchAudioSortDto valueOf(String str) {
        return (SearchAudioSortDto) Enum.valueOf(SearchAudioSortDto.class, str);
    }

    public static SearchAudioSortDto[] values() {
        return (SearchAudioSortDto[]) $VALUES.clone();
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
