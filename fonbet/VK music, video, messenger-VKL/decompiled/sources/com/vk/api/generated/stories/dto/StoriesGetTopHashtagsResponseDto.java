package com.vk.api.generated.stories.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;

/* compiled from: StoriesGetTopHashtagsResponseDto.kt */
/* loaded from: classes15.dex */
public final class StoriesGetTopHashtagsResponseDto implements Parcelable {
    public static final Parcelable.Creator<StoriesGetTopHashtagsResponseDto> CREATOR = new a();

    @pmi0("hashtags")
    private final List<String> hashtags;

    /* compiled from: StoriesGetTopHashtagsResponseDto.kt */
    public static final class a implements Parcelable.Creator<StoriesGetTopHashtagsResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final StoriesGetTopHashtagsResponseDto createFromParcel(Parcel parcel) {
            return new StoriesGetTopHashtagsResponseDto(parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final StoriesGetTopHashtagsResponseDto[] newArray(int i) {
            return new StoriesGetTopHashtagsResponseDto[i];
        }
    }

    public StoriesGetTopHashtagsResponseDto(List<String> list) {
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
        return (obj instanceof StoriesGetTopHashtagsResponseDto) && epx.f(this.hashtags, ((StoriesGetTopHashtagsResponseDto) obj).hashtags);
    }

    public final int hashCode() {
        return this.hashtags.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("StoriesGetTopHashtagsResponseDto(hashtags="), this.hashtags);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.hashtags);
    }
}
