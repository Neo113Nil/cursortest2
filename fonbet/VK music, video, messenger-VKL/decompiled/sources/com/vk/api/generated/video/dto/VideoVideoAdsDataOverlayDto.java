package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: VideoVideoAdsDataOverlayDto.kt */
/* loaded from: classes15.dex */
public final class VideoVideoAdsDataOverlayDto implements Parcelable {
    public static final Parcelable.Creator<VideoVideoAdsDataOverlayDto> CREATOR = new a();

    @pmi0("close_button_delay")
    private final Integer closeButtonDelay;

    @pmi0("duration")
    private final Integer duration;

    @pmi0("slot_id")
    private final Integer slotId;

    /* compiled from: VideoVideoAdsDataOverlayDto.kt */
    public static final class a implements Parcelable.Creator<VideoVideoAdsDataOverlayDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoVideoAdsDataOverlayDto createFromParcel(Parcel parcel) {
            return new VideoVideoAdsDataOverlayDto(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final VideoVideoAdsDataOverlayDto[] newArray(int i) {
            return new VideoVideoAdsDataOverlayDto[i];
        }
    }

    public VideoVideoAdsDataOverlayDto() {
        this(null, null, null, 7, null);
    }

    public final Integer d() {
        return this.closeButtonDelay;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Integer e() {
        return this.duration;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoVideoAdsDataOverlayDto)) {
            return false;
        }
        VideoVideoAdsDataOverlayDto videoVideoAdsDataOverlayDto = (VideoVideoAdsDataOverlayDto) obj;
        return epx.f(this.slotId, videoVideoAdsDataOverlayDto.slotId) && epx.f(this.duration, videoVideoAdsDataOverlayDto.duration) && epx.f(this.closeButtonDelay, videoVideoAdsDataOverlayDto.closeButtonDelay);
    }

    public final Integer f() {
        return this.slotId;
    }

    public final int hashCode() {
        Integer num = this.slotId;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.duration;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.closeButtonDelay;
        return hashCode2 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoVideoAdsDataOverlayDto(slotId=");
        sb.append(this.slotId);
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
        Integer num2 = this.duration;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        Integer num3 = this.closeButtonDelay;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num3);
        }
    }

    public VideoVideoAdsDataOverlayDto(Integer num, Integer num2, Integer num3) {
        this.slotId = num;
        this.duration = num2;
        this.closeButtonDelay = num3;
    }

    public /* synthetic */ VideoVideoAdsDataOverlayDto(Integer num, Integer num2, Integer num3, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : num3);
    }
}
