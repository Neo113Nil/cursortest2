package com.vk.api.generated.shortVideo.dto;

import android.os.Parcel;
import android.os.Parcelable;
import io.appmetrica.analytics.impl.L2;
import java.util.List;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: ShortVideoShortVideoTrendingHashtagDto.kt */
/* loaded from: classes15.dex */
public final class ShortVideoShortVideoTrendingHashtagDto implements Parcelable {
    public static final Parcelable.Creator<ShortVideoShortVideoTrendingHashtagDto> CREATOR = new a();

    @pmi0(L2.g)
    private final List<String> background;

    @pmi0("hashtag")
    private final String hashtag;

    /* compiled from: ShortVideoShortVideoTrendingHashtagDto.kt */
    public static final class a implements Parcelable.Creator<ShortVideoShortVideoTrendingHashtagDto> {
        @Override // android.os.Parcelable.Creator
        public final ShortVideoShortVideoTrendingHashtagDto createFromParcel(Parcel parcel) {
            return new ShortVideoShortVideoTrendingHashtagDto(parcel.readString(), parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final ShortVideoShortVideoTrendingHashtagDto[] newArray(int i) {
            return new ShortVideoShortVideoTrendingHashtagDto[i];
        }
    }

    public ShortVideoShortVideoTrendingHashtagDto(String str, List<String> list) {
        this.hashtag = str;
        this.background = list;
    }

    public final List<String> d() {
        return this.background;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.hashtag;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShortVideoShortVideoTrendingHashtagDto)) {
            return false;
        }
        ShortVideoShortVideoTrendingHashtagDto shortVideoShortVideoTrendingHashtagDto = (ShortVideoShortVideoTrendingHashtagDto) obj;
        return epx.f(this.hashtag, shortVideoShortVideoTrendingHashtagDto.hashtag) && epx.f(this.background, shortVideoShortVideoTrendingHashtagDto.background);
    }

    public final int hashCode() {
        int hashCode = this.hashtag.hashCode() * 31;
        List<String> list = this.background;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShortVideoShortVideoTrendingHashtagDto(hashtag=");
        sb.append(this.hashtag);
        sb.append(", background=");
        return ms9.a(')', sb, this.background);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.hashtag);
        parcel.writeStringList(this.background);
    }

    public /* synthetic */ ShortVideoShortVideoTrendingHashtagDto(String str, List list, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : list);
    }
}
