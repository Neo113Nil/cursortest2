package com.vk.api.generated.shortVideo.dto;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import xsna.asp;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.urd0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: ShortVideoShortVideoStatsPixelDto.kt */
/* loaded from: classes15.dex */
public final class ShortVideoShortVideoStatsPixelDto implements Parcelable {
    public static final Parcelable.Creator<ShortVideoShortVideoStatsPixelDto> CREATOR = new a();

    @pmi0(NotificationCompat.CATEGORY_EVENT)
    private final EventDto event;

    @pmi0("interval")
    private final Integer interval;

    @pmi0("url")
    private final String url;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ShortVideoShortVideoStatsPixelDto.kt */
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

        /* compiled from: ShortVideoShortVideoStatsPixelDto.kt */
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

    /* compiled from: ShortVideoShortVideoStatsPixelDto.kt */
    public static final class a implements Parcelable.Creator<ShortVideoShortVideoStatsPixelDto> {
        @Override // android.os.Parcelable.Creator
        public final ShortVideoShortVideoStatsPixelDto createFromParcel(Parcel parcel) {
            return new ShortVideoShortVideoStatsPixelDto(EventDto.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final ShortVideoShortVideoStatsPixelDto[] newArray(int i) {
            return new ShortVideoShortVideoStatsPixelDto[i];
        }
    }

    public ShortVideoShortVideoStatsPixelDto(EventDto eventDto, String str, Integer num) {
        this.event = eventDto;
        this.url = str;
        this.interval = num;
    }

    public final EventDto d() {
        return this.event;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Integer e() {
        return this.interval;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShortVideoShortVideoStatsPixelDto)) {
            return false;
        }
        ShortVideoShortVideoStatsPixelDto shortVideoShortVideoStatsPixelDto = (ShortVideoShortVideoStatsPixelDto) obj;
        return this.event == shortVideoShortVideoStatsPixelDto.event && epx.f(this.url, shortVideoShortVideoStatsPixelDto.url) && epx.f(this.interval, shortVideoShortVideoStatsPixelDto.interval);
    }

    public final String getUrl() {
        return this.url;
    }

    public final int hashCode() {
        int a2 = urd0.a(this.event.hashCode() * 31, 31, this.url);
        Integer num = this.interval;
        return a2 + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShortVideoShortVideoStatsPixelDto(event=");
        sb.append(this.event);
        sb.append(", url=");
        sb.append(this.url);
        sb.append(", interval=");
        return uqi.b(sb, this.interval, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.event.writeToParcel(parcel, i);
        parcel.writeString(this.url);
        Integer num = this.interval;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }

    public /* synthetic */ ShortVideoShortVideoStatsPixelDto(EventDto eventDto, String str, Integer num, int i, zcl zclVar) {
        this(eventDto, str, (i & 4) != 0 ? null : num);
    }
}
