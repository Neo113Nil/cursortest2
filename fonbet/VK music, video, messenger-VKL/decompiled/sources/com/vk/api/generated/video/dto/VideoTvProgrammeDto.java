package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: VideoTvProgrammeDto.kt */
/* loaded from: classes15.dex */
public final class VideoTvProgrammeDto implements Parcelable {
    public static final Parcelable.Creator<VideoTvProgrammeDto> CREATOR = new a();

    @pmi0("default_action")
    private final String defaultAction;

    @pmi0("programmes")
    private final List<VideoTvChannelProgrammeDto> programmes;

    @pmi0("scte35_actions")
    private final List<VideoScte35ActionDto> scte35Actions;

    @pmi0("social_demo_link")
    private final VideoSocialDemoAdsLinkDto socialDemoLink;

    @pmi0("video_id")
    private final String videoId;

    /* compiled from: VideoTvProgrammeDto.kt */
    public static final class a implements Parcelable.Creator<VideoTvProgrammeDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoTvProgrammeDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            VideoSocialDemoAdsLinkDto videoSocialDemoAdsLinkDto;
            ArrayList arrayList2;
            String readString = parcel.readString();
            int i = 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i2 = 0;
                while (i2 != readInt) {
                    i2 = en.a(VideoTvChannelProgrammeDto.CREATOR, parcel, arrayList, i2, 1);
                }
            }
            if (parcel.readInt() == 0) {
                videoSocialDemoAdsLinkDto = null;
                arrayList2 = null;
            } else {
                int readInt2 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(readInt2);
                while (i != readInt2) {
                    i = en.a(VideoScte35ActionDto.CREATOR, parcel, arrayList3, i, 1);
                }
                videoSocialDemoAdsLinkDto = null;
                arrayList2 = arrayList3;
            }
            return new VideoTvProgrammeDto(readString, arrayList, arrayList2, parcel.readString(), parcel.readInt() == 0 ? videoSocialDemoAdsLinkDto : VideoSocialDemoAdsLinkDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final VideoTvProgrammeDto[] newArray(int i) {
            return new VideoTvProgrammeDto[i];
        }
    }

    public VideoTvProgrammeDto(String str, List<VideoTvChannelProgrammeDto> list, List<VideoScte35ActionDto> list2, String str2, VideoSocialDemoAdsLinkDto videoSocialDemoAdsLinkDto) {
        this.videoId = str;
        this.programmes = list;
        this.scte35Actions = list2;
        this.defaultAction = str2;
        this.socialDemoLink = videoSocialDemoAdsLinkDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoTvProgrammeDto)) {
            return false;
        }
        VideoTvProgrammeDto videoTvProgrammeDto = (VideoTvProgrammeDto) obj;
        return epx.f(this.videoId, videoTvProgrammeDto.videoId) && epx.f(this.programmes, videoTvProgrammeDto.programmes) && epx.f(this.scte35Actions, videoTvProgrammeDto.scte35Actions) && epx.f(this.defaultAction, videoTvProgrammeDto.defaultAction) && epx.f(this.socialDemoLink, videoTvProgrammeDto.socialDemoLink);
    }

    public final int hashCode() {
        int hashCode = this.videoId.hashCode() * 31;
        List<VideoTvChannelProgrammeDto> list = this.programmes;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<VideoScte35ActionDto> list2 = this.scte35Actions;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str = this.defaultAction;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        VideoSocialDemoAdsLinkDto videoSocialDemoAdsLinkDto = this.socialDemoLink;
        return hashCode4 + (videoSocialDemoAdsLinkDto != null ? videoSocialDemoAdsLinkDto.hashCode() : 0);
    }

    public final String toString() {
        return "VideoTvProgrammeDto(videoId=" + this.videoId + ", programmes=" + this.programmes + ", scte35Actions=" + this.scte35Actions + ", defaultAction=" + this.defaultAction + ", socialDemoLink=" + this.socialDemoLink + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.videoId);
        List<VideoTvChannelProgrammeDto> list = this.programmes;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((VideoTvChannelProgrammeDto) f.next()).writeToParcel(parcel, i);
            }
        }
        List<VideoScte35ActionDto> list2 = this.scte35Actions;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f2 = dn.f(parcel, list2, 1);
            while (f2.hasNext()) {
                ((VideoScte35ActionDto) f2.next()).writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.defaultAction);
        VideoSocialDemoAdsLinkDto videoSocialDemoAdsLinkDto = this.socialDemoLink;
        if (videoSocialDemoAdsLinkDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            videoSocialDemoAdsLinkDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ VideoTvProgrammeDto(String str, List list, List list2, String str2, VideoSocialDemoAdsLinkDto videoSocialDemoAdsLinkDto, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : list2, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : videoSocialDemoAdsLinkDto);
    }
}
