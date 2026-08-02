package com.vk.api.generated.wall.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;

/* compiled from: WallGetSuggestedHashtagsResponseDto.kt */
/* loaded from: classes15.dex */
public final class WallGetSuggestedHashtagsResponseDto implements Parcelable {
    public static final Parcelable.Creator<WallGetSuggestedHashtagsResponseDto> CREATOR = new a();

    @pmi0("hashtags")
    private final List<String> hashtags;

    /* compiled from: WallGetSuggestedHashtagsResponseDto.kt */
    public static final class a implements Parcelable.Creator<WallGetSuggestedHashtagsResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final WallGetSuggestedHashtagsResponseDto createFromParcel(Parcel parcel) {
            return new WallGetSuggestedHashtagsResponseDto(parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final WallGetSuggestedHashtagsResponseDto[] newArray(int i) {
            return new WallGetSuggestedHashtagsResponseDto[i];
        }
    }

    public WallGetSuggestedHashtagsResponseDto(List<String> list) {
        this.hashtags = list;
    }

    public final List<String> d() {
        return this.hashtags;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof WallGetSuggestedHashtagsResponseDto) && epx.f(this.hashtags, ((WallGetSuggestedHashtagsResponseDto) obj).hashtags);
    }

    public final int hashCode() {
        return this.hashtags.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("WallGetSuggestedHashtagsResponseDto(hashtags="), this.hashtags);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.hashtags);
    }
}
