package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import io.reactivex.rxjava3.subjects.b;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.sn;
import xsna.zcl;

/* compiled from: VideoUserInfoSubscriptionDto.kt */
/* loaded from: classes15.dex */
public final class VideoUserInfoSubscriptionDto implements Parcelable {
    public static final Parcelable.Creator<VideoUserInfoSubscriptionDto> CREATOR = new a();

    @pmi0("activation_url")
    private final String activationUrl;

    @pmi0("active_info")
    private final String activeInfo;

    @pmi0("expires")
    private final Integer expires;

    @pmi0("is_active")
    private final boolean isActive;

    @pmi0("is_available")
    private final Boolean isAvailable;

    @pmi0("min_price")
    private final Float minPrice;

    @pmi0("terms_url")
    private final String termsUrl;

    @pmi0("trial")
    private final VideoUserInfoSubscriptionTrialDto trial;

    /* compiled from: VideoUserInfoSubscriptionDto.kt */
    public static final class a implements Parcelable.Creator<VideoUserInfoSubscriptionDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoUserInfoSubscriptionDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            boolean z = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new VideoUserInfoSubscriptionDto(z, valueOf, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() == 0 ? null : VideoUserInfoSubscriptionTrialDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final VideoUserInfoSubscriptionDto[] newArray(int i) {
            return new VideoUserInfoSubscriptionDto[i];
        }
    }

    public VideoUserInfoSubscriptionDto(boolean z, Boolean bool, Integer num, String str, String str2, String str3, Float f, VideoUserInfoSubscriptionTrialDto videoUserInfoSubscriptionTrialDto) {
        this.isActive = z;
        this.isAvailable = bool;
        this.expires = num;
        this.activationUrl = str;
        this.termsUrl = str2;
        this.activeInfo = str3;
        this.minPrice = f;
        this.trial = videoUserInfoSubscriptionTrialDto;
    }

    public final String d() {
        return this.activationUrl;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Integer e() {
        return this.expires;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoUserInfoSubscriptionDto)) {
            return false;
        }
        VideoUserInfoSubscriptionDto videoUserInfoSubscriptionDto = (VideoUserInfoSubscriptionDto) obj;
        return this.isActive == videoUserInfoSubscriptionDto.isActive && epx.f(this.isAvailable, videoUserInfoSubscriptionDto.isAvailable) && epx.f(this.expires, videoUserInfoSubscriptionDto.expires) && epx.f(this.activationUrl, videoUserInfoSubscriptionDto.activationUrl) && epx.f(this.termsUrl, videoUserInfoSubscriptionDto.termsUrl) && epx.f(this.activeInfo, videoUserInfoSubscriptionDto.activeInfo) && epx.f(this.minPrice, videoUserInfoSubscriptionDto.minPrice) && epx.f(this.trial, videoUserInfoSubscriptionDto.trial);
    }

    public final Float f() {
        return this.minPrice;
    }

    public final String g() {
        return this.termsUrl;
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.isActive) * 31;
        Boolean bool = this.isAvailable;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.expires;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.activationUrl;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.termsUrl;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.activeInfo;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Float f = this.minPrice;
        int hashCode7 = (hashCode6 + (f == null ? 0 : f.hashCode())) * 31;
        VideoUserInfoSubscriptionTrialDto videoUserInfoSubscriptionTrialDto = this.trial;
        return hashCode7 + (videoUserInfoSubscriptionTrialDto != null ? videoUserInfoSubscriptionTrialDto.hashCode() : 0);
    }

    public final boolean i() {
        return this.isActive;
    }

    public final Boolean j() {
        return this.isAvailable;
    }

    public final String toString() {
        return "VideoUserInfoSubscriptionDto(isActive=" + this.isActive + ", isAvailable=" + this.isAvailable + ", expires=" + this.expires + ", activationUrl=" + this.activationUrl + ", termsUrl=" + this.termsUrl + ", activeInfo=" + this.activeInfo + ", minPrice=" + this.minPrice + ", trial=" + this.trial + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.isActive ? 1 : 0);
        Boolean bool = this.isAvailable;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Integer num = this.expires;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeString(this.activationUrl);
        parcel.writeString(this.termsUrl);
        parcel.writeString(this.activeInfo);
        Float f = this.minPrice;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            b.d(parcel, 1, f);
        }
        VideoUserInfoSubscriptionTrialDto videoUserInfoSubscriptionTrialDto = this.trial;
        if (videoUserInfoSubscriptionTrialDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            videoUserInfoSubscriptionTrialDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ VideoUserInfoSubscriptionDto(boolean z, Boolean bool, Integer num, String str, String str2, String str3, Float f, VideoUserInfoSubscriptionTrialDto videoUserInfoSubscriptionTrialDto, int i, zcl zclVar) {
        this(z, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : f, (i & 128) != 0 ? null : videoUserInfoSubscriptionTrialDto);
    }
}
