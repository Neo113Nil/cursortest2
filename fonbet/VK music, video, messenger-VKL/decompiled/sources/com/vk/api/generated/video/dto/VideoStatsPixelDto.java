package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vk.api.generated.base.dto.BasePropertyExistsDto;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: VideoStatsPixelDto.kt */
/* loaded from: classes15.dex */
public final class VideoStatsPixelDto implements Parcelable {
    public static final Parcelable.Creator<VideoStatsPixelDto> CREATOR = new a();

    @pmi0(NotificationCompat.CATEGORY_EVENT)
    private final EventDto event;

    @pmi0("is_intermediate_url")
    private final BasePropertyExistsDto isIntermediateUrl;

    @pmi0("params")
    private final VideoStatsPixelParamsDto params;

    @pmi0("url")
    private final String url;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VideoStatsPixelDto.kt */
    public static final class EventDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventDto[] $VALUES;

        @pmi0("ad_clip_click")
        public static final EventDto AD_CLIP_CLICK;

        @pmi0("ad_clip_show")
        public static final EventDto AD_CLIP_SHOW;

        @pmi0(CampaignEx.JSON_NATIVE_VIDEO_COMPLETE)
        public static final EventDto COMPLETE;
        public static final Parcelable.Creator<EventDto> CREATOR;

        @pmi0("heartbeat")
        public static final EventDto HEARTBEAT;

        @pmi0("load")
        public static final EventDto LOAD;

        @pmi0("pause")
        public static final EventDto PAUSE;

        @pmi0(CampaignEx.JSON_NATIVE_VIDEO_RESUME)
        public static final EventDto RESUME;

        @pmi0("start")
        public static final EventDto START;

        @pmi0("stop")
        public static final EventDto STOP;
        private final String value;

        /* compiled from: VideoStatsPixelDto.kt */
        public static final class a implements Parcelable.Creator<EventDto> {
            @Override // android.os.Parcelable.Creator
            public final EventDto createFromParcel(Parcel parcel) {
                return EventDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final EventDto[] newArray(int i) {
                return new EventDto[i];
            }
        }

        static {
            EventDto eventDto = new EventDto("LOAD", 0, "load");
            LOAD = eventDto;
            EventDto eventDto2 = new EventDto("START", 1, "start");
            START = eventDto2;
            EventDto eventDto3 = new EventDto("STOP", 2, "stop");
            STOP = eventDto3;
            EventDto eventDto4 = new EventDto("PAUSE", 3, "pause");
            PAUSE = eventDto4;
            EventDto eventDto5 = new EventDto("RESUME", 4, CampaignEx.JSON_NATIVE_VIDEO_RESUME);
            RESUME = eventDto5;
            EventDto eventDto6 = new EventDto("COMPLETE", 5, CampaignEx.JSON_NATIVE_VIDEO_COMPLETE);
            COMPLETE = eventDto6;
            EventDto eventDto7 = new EventDto("HEARTBEAT", 6, "heartbeat");
            HEARTBEAT = eventDto7;
            EventDto eventDto8 = new EventDto("AD_CLIP_CLICK", 7, "ad_clip_click");
            AD_CLIP_CLICK = eventDto8;
            EventDto eventDto9 = new EventDto("AD_CLIP_SHOW", 8, "ad_clip_show");
            AD_CLIP_SHOW = eventDto9;
            EventDto[] eventDtoArr = {eventDto, eventDto2, eventDto3, eventDto4, eventDto5, eventDto6, eventDto7, eventDto8, eventDto9};
            $VALUES = eventDtoArr;
            $ENTRIES = new asp(eventDtoArr);
            CREATOR = new a();
        }

        private EventDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static EventDto valueOf(String str) {
            return (EventDto) Enum.valueOf(EventDto.class, str);
        }

        public static EventDto[] values() {
            return (EventDto[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String i() {
            return this.value;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    /* compiled from: VideoStatsPixelDto.kt */
    public static final class a implements Parcelable.Creator<VideoStatsPixelDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoStatsPixelDto createFromParcel(Parcel parcel) {
            return new VideoStatsPixelDto(EventDto.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() == 0 ? null : BasePropertyExistsDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? VideoStatsPixelParamsDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final VideoStatsPixelDto[] newArray(int i) {
            return new VideoStatsPixelDto[i];
        }
    }

    public VideoStatsPixelDto(EventDto eventDto, String str, BasePropertyExistsDto basePropertyExistsDto, VideoStatsPixelParamsDto videoStatsPixelParamsDto) {
        this.event = eventDto;
        this.url = str;
        this.isIntermediateUrl = basePropertyExistsDto;
        this.params = videoStatsPixelParamsDto;
    }

    public final EventDto d() {
        return this.event;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final VideoStatsPixelParamsDto e() {
        return this.params;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoStatsPixelDto)) {
            return false;
        }
        VideoStatsPixelDto videoStatsPixelDto = (VideoStatsPixelDto) obj;
        return this.event == videoStatsPixelDto.event && epx.f(this.url, videoStatsPixelDto.url) && this.isIntermediateUrl == videoStatsPixelDto.isIntermediateUrl && epx.f(this.params, videoStatsPixelDto.params);
    }

    public final BasePropertyExistsDto f() {
        return this.isIntermediateUrl;
    }

    public final String getUrl() {
        return this.url;
    }

    public final int hashCode() {
        int a2 = urd0.a(this.event.hashCode() * 31, 31, this.url);
        BasePropertyExistsDto basePropertyExistsDto = this.isIntermediateUrl;
        int hashCode = (a2 + (basePropertyExistsDto == null ? 0 : basePropertyExistsDto.hashCode())) * 31;
        VideoStatsPixelParamsDto videoStatsPixelParamsDto = this.params;
        return hashCode + (videoStatsPixelParamsDto != null ? videoStatsPixelParamsDto.hashCode() : 0);
    }

    public final String toString() {
        return "VideoStatsPixelDto(event=" + this.event + ", url=" + this.url + ", isIntermediateUrl=" + this.isIntermediateUrl + ", params=" + this.params + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.event.writeToParcel(parcel, i);
        parcel.writeString(this.url);
        BasePropertyExistsDto basePropertyExistsDto = this.isIntermediateUrl;
        if (basePropertyExistsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            basePropertyExistsDto.writeToParcel(parcel, i);
        }
        VideoStatsPixelParamsDto videoStatsPixelParamsDto = this.params;
        if (videoStatsPixelParamsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            videoStatsPixelParamsDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ VideoStatsPixelDto(EventDto eventDto, String str, BasePropertyExistsDto basePropertyExistsDto, VideoStatsPixelParamsDto videoStatsPixelParamsDto, int i, zcl zclVar) {
        this(eventDto, str, (i & 4) != 0 ? null : basePropertyExistsDto, (i & 8) != 0 ? null : videoStatsPixelParamsDto);
    }
}
