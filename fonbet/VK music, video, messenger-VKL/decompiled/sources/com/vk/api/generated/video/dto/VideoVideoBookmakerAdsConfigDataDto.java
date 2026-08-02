package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.pmi0;
import xsna.shy;
import xsna.vu5;

/* compiled from: VideoVideoBookmakerAdsConfigDataDto.kt */
/* loaded from: classes15.dex */
public final class VideoVideoBookmakerAdsConfigDataDto implements Parcelable {
    public static final Parcelable.Creator<VideoVideoBookmakerAdsConfigDataDto> CREATOR = new a();

    @pmi0("delay_sec")
    private final int delaySec;

    @pmi0("hide_after_sec")
    private final int hideAfterSec;

    @pmi0("interval_sec")
    private final int intervalSec;

    @pmi0("update_odds_interval_sec")
    private final int updateOddsIntervalSec;

    /* compiled from: VideoVideoBookmakerAdsConfigDataDto.kt */
    public static final class a implements Parcelable.Creator<VideoVideoBookmakerAdsConfigDataDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoVideoBookmakerAdsConfigDataDto createFromParcel(Parcel parcel) {
            return new VideoVideoBookmakerAdsConfigDataDto(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final VideoVideoBookmakerAdsConfigDataDto[] newArray(int i) {
            return new VideoVideoBookmakerAdsConfigDataDto[i];
        }
    }

    public VideoVideoBookmakerAdsConfigDataDto(int i, int i2, int i3, int i4) {
        this.intervalSec = i;
        this.delaySec = i2;
        this.updateOddsIntervalSec = i3;
        this.hideAfterSec = i4;
    }

    public final int d() {
        return this.delaySec;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int e() {
        return this.hideAfterSec;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoVideoBookmakerAdsConfigDataDto)) {
            return false;
        }
        VideoVideoBookmakerAdsConfigDataDto videoVideoBookmakerAdsConfigDataDto = (VideoVideoBookmakerAdsConfigDataDto) obj;
        return this.intervalSec == videoVideoBookmakerAdsConfigDataDto.intervalSec && this.delaySec == videoVideoBookmakerAdsConfigDataDto.delaySec && this.updateOddsIntervalSec == videoVideoBookmakerAdsConfigDataDto.updateOddsIntervalSec && this.hideAfterSec == videoVideoBookmakerAdsConfigDataDto.hideAfterSec;
    }

    public final int f() {
        return this.intervalSec;
    }

    public final int g() {
        return this.updateOddsIntervalSec;
    }

    public final int hashCode() {
        return Integer.hashCode(this.hideAfterSec) + shy.a(this.updateOddsIntervalSec, shy.a(this.delaySec, Integer.hashCode(this.intervalSec) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoVideoBookmakerAdsConfigDataDto(intervalSec=");
        sb.append(this.intervalSec);
        sb.append(", delaySec=");
        sb.append(this.delaySec);
        sb.append(", updateOddsIntervalSec=");
        sb.append(this.updateOddsIntervalSec);
        sb.append(", hideAfterSec=");
        return vu5.b(sb, this.hideAfterSec, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.intervalSec);
        parcel.writeInt(this.delaySec);
        parcel.writeInt(this.updateOddsIntervalSec);
        parcel.writeInt(this.hideAfterSec);
    }
}
