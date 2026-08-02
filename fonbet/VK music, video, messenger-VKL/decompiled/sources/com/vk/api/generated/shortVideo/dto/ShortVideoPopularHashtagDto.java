package com.vk.api.generated.shortVideo.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.qoy;
import xsna.zcl;

/* compiled from: ShortVideoPopularHashtagDto.kt */
/* loaded from: classes15.dex */
public final class ShortVideoPopularHashtagDto implements Parcelable {
    public static final Parcelable.Creator<ShortVideoPopularHashtagDto> CREATOR = new a();

    @pmi0("description")
    private final String description;

    @pmi0("hashtag")
    private final String hashtag;

    @pmi0("is_trend")
    private final boolean isTrend;

    /* compiled from: ShortVideoPopularHashtagDto.kt */
    public static final class a implements Parcelable.Creator<ShortVideoPopularHashtagDto> {
        @Override // android.os.Parcelable.Creator
        public final ShortVideoPopularHashtagDto createFromParcel(Parcel parcel) {
            return new ShortVideoPopularHashtagDto(parcel.readString(), parcel.readInt() != 0, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ShortVideoPopularHashtagDto[] newArray(int i) {
            return new ShortVideoPopularHashtagDto[i];
        }
    }

    public ShortVideoPopularHashtagDto(String str, boolean z, String str2) {
        this.hashtag = str;
        this.isTrend = z;
        this.description = str2;
    }

    public final String d() {
        return this.hashtag;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean e() {
        return this.isTrend;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShortVideoPopularHashtagDto)) {
            return false;
        }
        ShortVideoPopularHashtagDto shortVideoPopularHashtagDto = (ShortVideoPopularHashtagDto) obj;
        return epx.f(this.hashtag, shortVideoPopularHashtagDto.hashtag) && this.isTrend == shortVideoPopularHashtagDto.isTrend && epx.f(this.description, shortVideoPopularHashtagDto.description);
    }

    public final String getDescription() {
        return this.description;
    }

    public final int hashCode() {
        int b = qoy.b(this.hashtag.hashCode() * 31, 31, this.isTrend);
        String str = this.description;
        return b + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShortVideoPopularHashtagDto(hashtag=");
        sb.append(this.hashtag);
        sb.append(", isTrend=");
        sb.append(this.isTrend);
        sb.append(", description=");
        return ho8.a(sb, this.description, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.hashtag);
        parcel.writeInt(this.isTrend ? 1 : 0);
        parcel.writeString(this.description);
    }

    public /* synthetic */ ShortVideoPopularHashtagDto(String str, boolean z, String str2, int i, zcl zclVar) {
        this(str, z, (i & 4) != 0 ? null : str2);
    }
}
