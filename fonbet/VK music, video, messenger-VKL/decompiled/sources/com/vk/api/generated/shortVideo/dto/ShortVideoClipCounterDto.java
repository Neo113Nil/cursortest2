package com.vk.api.generated.shortVideo.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: ShortVideoClipCounterDto.kt */
/* loaded from: classes15.dex */
public final class ShortVideoClipCounterDto implements Parcelable {
    public static final Parcelable.Creator<ShortVideoClipCounterDto> CREATOR = new a();

    @pmi0("audio_id")
    private final String audioId;

    @pmi0("compilation_id")
    private final String compilationId;

    @pmi0("count")
    private final Integer count;

    @pmi0("likes_count")
    private final Integer likesCount;

    @pmi0("mask_id")
    private final String maskId;

    @pmi0("place_id")
    private final String placeId;

    @pmi0("tag")
    private final String tag;

    @pmi0("views_count")
    private final Integer viewsCount;

    /* compiled from: ShortVideoClipCounterDto.kt */
    public static final class a implements Parcelable.Creator<ShortVideoClipCounterDto> {
        @Override // android.os.Parcelable.Creator
        public final ShortVideoClipCounterDto createFromParcel(Parcel parcel) {
            return new ShortVideoClipCounterDto(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final ShortVideoClipCounterDto[] newArray(int i) {
            return new ShortVideoClipCounterDto[i];
        }
    }

    public ShortVideoClipCounterDto() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public final Integer d() {
        return this.count;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Integer e() {
        return this.likesCount;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShortVideoClipCounterDto)) {
            return false;
        }
        ShortVideoClipCounterDto shortVideoClipCounterDto = (ShortVideoClipCounterDto) obj;
        return epx.f(this.tag, shortVideoClipCounterDto.tag) && epx.f(this.audioId, shortVideoClipCounterDto.audioId) && epx.f(this.placeId, shortVideoClipCounterDto.placeId) && epx.f(this.maskId, shortVideoClipCounterDto.maskId) && epx.f(this.compilationId, shortVideoClipCounterDto.compilationId) && epx.f(this.count, shortVideoClipCounterDto.count) && epx.f(this.viewsCount, shortVideoClipCounterDto.viewsCount) && epx.f(this.likesCount, shortVideoClipCounterDto.likesCount);
    }

    public final Integer f() {
        return this.viewsCount;
    }

    public final int hashCode() {
        String str = this.tag;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.audioId;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.placeId;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.maskId;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.compilationId;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num = this.count;
        int hashCode6 = (hashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.viewsCount;
        int hashCode7 = (hashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.likesCount;
        return hashCode7 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShortVideoClipCounterDto(tag=");
        sb.append(this.tag);
        sb.append(", audioId=");
        sb.append(this.audioId);
        sb.append(", placeId=");
        sb.append(this.placeId);
        sb.append(", maskId=");
        sb.append(this.maskId);
        sb.append(", compilationId=");
        sb.append(this.compilationId);
        sb.append(", count=");
        sb.append(this.count);
        sb.append(", viewsCount=");
        sb.append(this.viewsCount);
        sb.append(", likesCount=");
        return uqi.b(sb, this.likesCount, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.tag);
        parcel.writeString(this.audioId);
        parcel.writeString(this.placeId);
        parcel.writeString(this.maskId);
        parcel.writeString(this.compilationId);
        Integer num = this.count;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.viewsCount;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        Integer num3 = this.likesCount;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num3);
        }
    }

    public ShortVideoClipCounterDto(String str, String str2, String str3, String str4, String str5, Integer num, Integer num2, Integer num3) {
        this.tag = str;
        this.audioId = str2;
        this.placeId = str3;
        this.maskId = str4;
        this.compilationId = str5;
        this.count = num;
        this.viewsCount = num2;
        this.likesCount = num3;
    }

    public /* synthetic */ ShortVideoClipCounterDto(String str, String str2, String str3, String str4, String str5, Integer num, Integer num2, Integer num3, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : num, (i & 64) != 0 ? null : num2, (i & 128) != 0 ? null : num3);
    }
}
