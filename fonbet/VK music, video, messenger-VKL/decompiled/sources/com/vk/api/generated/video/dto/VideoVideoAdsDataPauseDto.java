package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: VideoVideoAdsDataPauseDto.kt */
/* loaded from: classes15.dex */
public final class VideoVideoAdsDataPauseDto implements Parcelable {
    public static final Parcelable.Creator<VideoVideoAdsDataPauseDto> CREATOR = new a();

    @pmi0("close_button_delay")
    private final Integer closeButtonDelay;

    @pmi0("duration")
    private final Integer duration;

    @pmi0("next_show_after")
    private final Integer nextShowAfter;

    @pmi0("slot_id")
    private final Integer slotId;

    /* compiled from: VideoVideoAdsDataPauseDto.kt */
    public static final class a implements Parcelable.Creator<VideoVideoAdsDataPauseDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoVideoAdsDataPauseDto createFromParcel(Parcel parcel) {
            return new VideoVideoAdsDataPauseDto(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final VideoVideoAdsDataPauseDto[] newArray(int i) {
            return new VideoVideoAdsDataPauseDto[i];
        }
    }

    public VideoVideoAdsDataPauseDto() {
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
        if (!(obj instanceof VideoVideoAdsDataPauseDto)) {
            return false;
        }
        VideoVideoAdsDataPauseDto videoVideoAdsDataPauseDto = (VideoVideoAdsDataPauseDto) obj;
        return epx.f(this.slotId, videoVideoAdsDataPauseDto.slotId) && epx.f(this.nextShowAfter, videoVideoAdsDataPauseDto.nextShowAfter) && epx.f(this.duration, videoVideoAdsDataPauseDto.duration) && epx.f(this.closeButtonDelay, videoVideoAdsDataPauseDto.closeButtonDelay);
    }

    public final int hashCode() {
        Integer num = this.slotId;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.nextShowAfter;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.duration;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.closeButtonDelay;
        return hashCode3 + (num4 != null ? num4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoVideoAdsDataPauseDto(slotId=");
        sb.append(this.slotId);
        sb.append(", nextShowAfter=");
        sb.append(this.nextShowAfter);
        sb.append(", duration=");
        sb.append(this.duration);
        sb.append(", closeButtonDelay=");
        return uqi.b(sb, this.closeButtonDelay, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.slotId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.nextShowAfter;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        Integer num3 = this.duration;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num3);
        }
        Integer num4 = this.closeButtonDelay;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num4);
        }
    }

    public VideoVideoAdsDataPauseDto(Integer num, Integer num2, Integer num3, Integer num4) {
        this.slotId = num;
        this.nextShowAfter = num2;
        this.duration = num3;
        this.closeButtonDelay = num4;
    }

    public /* synthetic */ VideoVideoAdsDataPauseDto(Integer num, Integer num2, Integer num3, Integer num4, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : num3, (i & 8) != 0 ? null : num4);
    }
}
