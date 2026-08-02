package com.vk.api.generated.newsfeed.dto;

import android.os.Parcel;
import android.os.Parcelable;
import io.reactivex.rxjava3.subjects.b;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: NewsfeedItemAnimatedBlockAnimationDto.kt */
/* loaded from: classes15.dex */
public final class NewsfeedItemAnimatedBlockAnimationDto implements Parcelable {
    public static final Parcelable.Creator<NewsfeedItemAnimatedBlockAnimationDto> CREATOR = new a();

    @pmi0("height")
    private final Float height;

    @pmi0("play_count")
    private final Integer playCount;

    @pmi0("url")
    private final String url;

    @pmi0("width")
    private final Float width;

    /* compiled from: NewsfeedItemAnimatedBlockAnimationDto.kt */
    public static final class a implements Parcelable.Creator<NewsfeedItemAnimatedBlockAnimationDto> {
        @Override // android.os.Parcelable.Creator
        public final NewsfeedItemAnimatedBlockAnimationDto createFromParcel(Parcel parcel) {
            return new NewsfeedItemAnimatedBlockAnimationDto(parcel.readString(), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final NewsfeedItemAnimatedBlockAnimationDto[] newArray(int i) {
            return new NewsfeedItemAnimatedBlockAnimationDto[i];
        }
    }

    public NewsfeedItemAnimatedBlockAnimationDto() {
        this(null, null, null, null, 15, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewsfeedItemAnimatedBlockAnimationDto)) {
            return false;
        }
        NewsfeedItemAnimatedBlockAnimationDto newsfeedItemAnimatedBlockAnimationDto = (NewsfeedItemAnimatedBlockAnimationDto) obj;
        return epx.f(this.url, newsfeedItemAnimatedBlockAnimationDto.url) && epx.f(this.width, newsfeedItemAnimatedBlockAnimationDto.width) && epx.f(this.height, newsfeedItemAnimatedBlockAnimationDto.height) && epx.f(this.playCount, newsfeedItemAnimatedBlockAnimationDto.playCount);
    }

    public final int hashCode() {
        String str = this.url;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Float f = this.width;
        int hashCode2 = (hashCode + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.height;
        int hashCode3 = (hashCode2 + (f2 == null ? 0 : f2.hashCode())) * 31;
        Integer num = this.playCount;
        return hashCode3 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NewsfeedItemAnimatedBlockAnimationDto(url=");
        sb.append(this.url);
        sb.append(", width=");
        sb.append(this.width);
        sb.append(", height=");
        sb.append(this.height);
        sb.append(", playCount=");
        return uqi.b(sb, this.playCount, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.url);
        Float f = this.width;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            b.d(parcel, 1, f);
        }
        Float f2 = this.height;
        if (f2 == null) {
            parcel.writeInt(0);
        } else {
            b.d(parcel, 1, f2);
        }
        Integer num = this.playCount;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }

    public NewsfeedItemAnimatedBlockAnimationDto(String str, Float f, Float f2, Integer num) {
        this.url = str;
        this.width = f;
        this.height = f2;
        this.playCount = num;
    }

    public /* synthetic */ NewsfeedItemAnimatedBlockAnimationDto(String str, Float f, Float f2, Integer num, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : f, (i & 4) != 0 ? null : f2, (i & 8) != 0 ? null : num);
    }
}
