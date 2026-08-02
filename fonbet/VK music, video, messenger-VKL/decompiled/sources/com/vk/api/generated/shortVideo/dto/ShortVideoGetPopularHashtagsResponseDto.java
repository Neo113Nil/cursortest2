package com.vk.api.generated.shortVideo.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;

/* compiled from: ShortVideoGetPopularHashtagsResponseDto.kt */
/* loaded from: classes15.dex */
public final class ShortVideoGetPopularHashtagsResponseDto implements Parcelable {
    public static final Parcelable.Creator<ShortVideoGetPopularHashtagsResponseDto> CREATOR = new a();

    @pmi0("hashtags")
    private final List<ShortVideoPopularHashtagDto> hashtags;

    /* compiled from: ShortVideoGetPopularHashtagsResponseDto.kt */
    public static final class a implements Parcelable.Creator<ShortVideoGetPopularHashtagsResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final ShortVideoGetPopularHashtagsResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(ShortVideoPopularHashtagDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new ShortVideoGetPopularHashtagsResponseDto(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final ShortVideoGetPopularHashtagsResponseDto[] newArray(int i) {
            return new ShortVideoGetPopularHashtagsResponseDto[i];
        }
    }

    public ShortVideoGetPopularHashtagsResponseDto(List<ShortVideoPopularHashtagDto> list) {
        this.hashtags = list;
    }

    public final List<ShortVideoPopularHashtagDto> d() {
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
        return (obj instanceof ShortVideoGetPopularHashtagsResponseDto) && epx.f(this.hashtags, ((ShortVideoGetPopularHashtagsResponseDto) obj).hashtags);
    }

    public final int hashCode() {
        return this.hashtags.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("ShortVideoGetPopularHashtagsResponseDto(hashtags="), this.hashtags);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.hashtags);
        while (a2.hasNext()) {
            ((ShortVideoPopularHashtagDto) a2.next()).writeToParcel(parcel, i);
        }
    }
}
