package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;

/* compiled from: VideoTvChannelSettingsDto.kt */
/* loaded from: classes15.dex */
public final class VideoTvChannelSettingsDto implements Parcelable {
    public static final Parcelable.Creator<VideoTvChannelSettingsDto> CREATOR = new a();

    @pmi0("channel_age_rating")
    private final String channelAgeRating;

    @pmi0("channel_id")
    private final int channelId;

    @pmi0("channel_name")
    private final String channelName;

    @pmi0("channel_version_id")
    private final String channelVersionId;

    @pmi0("default_action")
    private final String defaultAction;

    @pmi0("programmes")
    private final List<VideoTvChannelProgrammeDto> programmes;

    @pmi0("scte35_actions")
    private final List<VideoScte35ActionDto> scte35Actions;

    /* compiled from: VideoTvChannelSettingsDto.kt */
    public static final class a implements Parcelable.Creator<VideoTvChannelSettingsDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoTvChannelSettingsDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            int readInt = parcel.readInt();
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            int i = 0;
            ArrayList arrayList2 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt2 = parcel.readInt();
                arrayList = new ArrayList(readInt2);
                int i2 = 0;
                while (i2 != readInt2) {
                    i2 = bo.b(VideoTvChannelSettingsDto.class, parcel, arrayList, i2, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int readInt3 = parcel.readInt();
                arrayList2 = new ArrayList(readInt3);
                while (i != readInt3) {
                    i = bo.b(VideoTvChannelSettingsDto.class, parcel, arrayList2, i, 1);
                }
            }
            return new VideoTvChannelSettingsDto(readInt, readString, readString2, readString3, readString4, arrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final VideoTvChannelSettingsDto[] newArray(int i) {
            return new VideoTvChannelSettingsDto[i];
        }
    }

    public VideoTvChannelSettingsDto(int i, String str, String str2, String str3, String str4, List<VideoTvChannelProgrammeDto> list, List<VideoScte35ActionDto> list2) {
        this.channelId = i;
        this.channelName = str;
        this.channelVersionId = str2;
        this.channelAgeRating = str3;
        this.defaultAction = str4;
        this.programmes = list;
        this.scte35Actions = list2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoTvChannelSettingsDto)) {
            return false;
        }
        VideoTvChannelSettingsDto videoTvChannelSettingsDto = (VideoTvChannelSettingsDto) obj;
        return this.channelId == videoTvChannelSettingsDto.channelId && epx.f(this.channelName, videoTvChannelSettingsDto.channelName) && epx.f(this.channelVersionId, videoTvChannelSettingsDto.channelVersionId) && epx.f(this.channelAgeRating, videoTvChannelSettingsDto.channelAgeRating) && epx.f(this.defaultAction, videoTvChannelSettingsDto.defaultAction) && epx.f(this.programmes, videoTvChannelSettingsDto.programmes) && epx.f(this.scte35Actions, videoTvChannelSettingsDto.scte35Actions);
    }

    public final int hashCode() {
        int a2 = urd0.a(urd0.a(urd0.a(Integer.hashCode(this.channelId) * 31, 31, this.channelName), 31, this.channelVersionId), 31, this.channelAgeRating);
        String str = this.defaultAction;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        List<VideoTvChannelProgrammeDto> list = this.programmes;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<VideoScte35ActionDto> list2 = this.scte35Actions;
        return hashCode2 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoTvChannelSettingsDto(channelId=");
        sb.append(this.channelId);
        sb.append(", channelName=");
        sb.append(this.channelName);
        sb.append(", channelVersionId=");
        sb.append(this.channelVersionId);
        sb.append(", channelAgeRating=");
        sb.append(this.channelAgeRating);
        sb.append(", defaultAction=");
        sb.append(this.defaultAction);
        sb.append(", programmes=");
        sb.append(this.programmes);
        sb.append(", scte35Actions=");
        return ms9.a(')', sb, this.scte35Actions);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.channelId);
        parcel.writeString(this.channelName);
        parcel.writeString(this.channelVersionId);
        parcel.writeString(this.channelAgeRating);
        parcel.writeString(this.defaultAction);
        List<VideoTvChannelProgrammeDto> list = this.programmes;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        List<VideoScte35ActionDto> list2 = this.scte35Actions;
        if (list2 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f2 = dn.f(parcel, list2, 1);
        while (f2.hasNext()) {
            parcel.writeParcelable((Parcelable) f2.next(), i);
        }
    }

    public /* synthetic */ VideoTvChannelSettingsDto(int i, String str, String str2, String str3, String str4, List list, List list2, int i2, zcl zclVar) {
        this(i, str, str2, str3, (i2 & 16) != 0 ? null : str4, (i2 & 32) != 0 ? null : list, (i2 & 64) != 0 ? null : list2);
    }
}
