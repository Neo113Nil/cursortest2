package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.sn;
import xsna.uqi;
import xsna.zcl;

/* compiled from: VideoUserInfoSubscriptionTrialDto.kt */
/* loaded from: classes15.dex */
public final class VideoUserInfoSubscriptionTrialDto implements Parcelable {
    public static final Parcelable.Creator<VideoUserInfoSubscriptionTrialDto> CREATOR = new a();

    @pmi0("days_count")
    private final Integer daysCount;

    @pmi0("is_available")
    private final Boolean isAvailable;

    /* compiled from: VideoUserInfoSubscriptionTrialDto.kt */
    public static final class a implements Parcelable.Creator<VideoUserInfoSubscriptionTrialDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoUserInfoSubscriptionTrialDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new VideoUserInfoSubscriptionTrialDto(valueOf, parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final VideoUserInfoSubscriptionTrialDto[] newArray(int i) {
            return new VideoUserInfoSubscriptionTrialDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VideoUserInfoSubscriptionTrialDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoUserInfoSubscriptionTrialDto)) {
            return false;
        }
        VideoUserInfoSubscriptionTrialDto videoUserInfoSubscriptionTrialDto = (VideoUserInfoSubscriptionTrialDto) obj;
        return epx.f(this.isAvailable, videoUserInfoSubscriptionTrialDto.isAvailable) && epx.f(this.daysCount, videoUserInfoSubscriptionTrialDto.daysCount);
    }

    public final int hashCode() {
        Boolean bool = this.isAvailable;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Integer num = this.daysCount;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoUserInfoSubscriptionTrialDto(isAvailable=");
        sb.append(this.isAvailable);
        sb.append(", daysCount=");
        return uqi.b(sb, this.daysCount, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Boolean bool = this.isAvailable;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Integer num = this.daysCount;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }

    public VideoUserInfoSubscriptionTrialDto(Boolean bool, Integer num) {
        this.isAvailable = bool;
        this.daysCount = num;
    }

    public /* synthetic */ VideoUserInfoSubscriptionTrialDto(Boolean bool, Integer num, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : num);
    }
}
