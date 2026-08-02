package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.urd0;

/* compiled from: VideoVideoBookmakerAdStateDto.kt */
/* loaded from: classes15.dex */
public final class VideoVideoBookmakerAdStateDto implements Parcelable {
    public static final Parcelable.Creator<VideoVideoBookmakerAdStateDto> CREATOR = new a();

    @pmi0("ad_template")
    private final String adTemplate;

    @pmi0("ads_config")
    private final VideoVideoBookmakerAdsConfigDataDto adsConfig;

    @pmi0("odds")
    private final VideoVideoBookmakerOddsDataDto odds;

    @pmi0("odds_template")
    private final String oddsTemplate;

    @pmi0("queue_info")
    private final VideoVideoBookmakerQueueInfoDataDto queueInfo;

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    /* compiled from: VideoVideoBookmakerAdStateDto.kt */
    public static final class a implements Parcelable.Creator<VideoVideoBookmakerAdStateDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoVideoBookmakerAdStateDto createFromParcel(Parcel parcel) {
            return new VideoVideoBookmakerAdStateDto(VideoVideoBookmakerOddsDataDto.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), VideoVideoBookmakerAdsConfigDataDto.CREATOR.createFromParcel(parcel), VideoVideoBookmakerQueueInfoDataDto.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VideoVideoBookmakerAdStateDto[] newArray(int i) {
            return new VideoVideoBookmakerAdStateDto[i];
        }
    }

    public VideoVideoBookmakerAdStateDto(VideoVideoBookmakerOddsDataDto videoVideoBookmakerOddsDataDto, String str, String str2, VideoVideoBookmakerAdsConfigDataDto videoVideoBookmakerAdsConfigDataDto, VideoVideoBookmakerQueueInfoDataDto videoVideoBookmakerQueueInfoDataDto, String str3) {
        this.odds = videoVideoBookmakerOddsDataDto;
        this.oddsTemplate = str;
        this.adTemplate = str2;
        this.adsConfig = videoVideoBookmakerAdsConfigDataDto;
        this.queueInfo = videoVideoBookmakerQueueInfoDataDto;
        this.requestId = str3;
    }

    public final String d() {
        return this.adTemplate;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final VideoVideoBookmakerAdsConfigDataDto e() {
        return this.adsConfig;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoVideoBookmakerAdStateDto)) {
            return false;
        }
        VideoVideoBookmakerAdStateDto videoVideoBookmakerAdStateDto = (VideoVideoBookmakerAdStateDto) obj;
        return epx.f(this.odds, videoVideoBookmakerAdStateDto.odds) && epx.f(this.oddsTemplate, videoVideoBookmakerAdStateDto.oddsTemplate) && epx.f(this.adTemplate, videoVideoBookmakerAdStateDto.adTemplate) && epx.f(this.adsConfig, videoVideoBookmakerAdStateDto.adsConfig) && epx.f(this.queueInfo, videoVideoBookmakerAdStateDto.queueInfo) && epx.f(this.requestId, videoVideoBookmakerAdStateDto.requestId);
    }

    public final VideoVideoBookmakerOddsDataDto f() {
        return this.odds;
    }

    public final String g() {
        return this.oddsTemplate;
    }

    public final int hashCode() {
        return this.requestId.hashCode() + ((this.queueInfo.hashCode() + ((this.adsConfig.hashCode() + urd0.a(urd0.a(this.odds.hashCode() * 31, 31, this.oddsTemplate), 31, this.adTemplate)) * 31)) * 31);
    }

    public final String i() {
        return this.requestId;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoVideoBookmakerAdStateDto(odds=");
        sb.append(this.odds);
        sb.append(", oddsTemplate=");
        sb.append(this.oddsTemplate);
        sb.append(", adTemplate=");
        sb.append(this.adTemplate);
        sb.append(", adsConfig=");
        sb.append(this.adsConfig);
        sb.append(", queueInfo=");
        sb.append(this.queueInfo);
        sb.append(", requestId=");
        return ho8.a(sb, this.requestId, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.odds.writeToParcel(parcel, i);
        parcel.writeString(this.oddsTemplate);
        parcel.writeString(this.adTemplate);
        this.adsConfig.writeToParcel(parcel, i);
        this.queueInfo.writeToParcel(parcel, i);
        parcel.writeString(this.requestId);
    }
}
