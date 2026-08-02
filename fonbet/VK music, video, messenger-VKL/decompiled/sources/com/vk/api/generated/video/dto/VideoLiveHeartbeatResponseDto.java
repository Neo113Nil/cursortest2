package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.ho8;
import xsna.nr;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: VideoLiveHeartbeatResponseDto.kt */
/* loaded from: classes15.dex */
public final class VideoLiveHeartbeatResponseDto implements Parcelable {
    public static final Parcelable.Creator<VideoLiveHeartbeatResponseDto> CREATOR = new a();

    @pmi0("balance")
    private final Integer balance;

    @pmi0("live_status")
    private final VideoLiveStatusDto liveStatus;

    @pmi0("profiles")
    private final List<UsersUserFullDto> profiles;

    @pmi0("spectators")
    private final VideoLiveSpectatorsDto spectators;

    @pmi0("status")
    private final String status;

    @pmi0("url")
    private final String url;

    /* compiled from: VideoLiveHeartbeatResponseDto.kt */
    public static final class a implements Parcelable.Creator<VideoLiveHeartbeatResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoLiveHeartbeatResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String readString = parcel.readString();
            VideoLiveStatusDto videoLiveStatusDto = (VideoLiveStatusDto) parcel.readParcelable(VideoLiveHeartbeatResponseDto.class.getClassLoader());
            VideoLiveSpectatorsDto createFromParcel = parcel.readInt() == 0 ? null : VideoLiveSpectatorsDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = bo.b(VideoLiveHeartbeatResponseDto.class, parcel, arrayList, i, 1);
                }
            }
            return new VideoLiveHeartbeatResponseDto(readString, videoLiveStatusDto, createFromParcel, arrayList, parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VideoLiveHeartbeatResponseDto[] newArray(int i) {
            return new VideoLiveHeartbeatResponseDto[i];
        }
    }

    public VideoLiveHeartbeatResponseDto(String str, VideoLiveStatusDto videoLiveStatusDto, VideoLiveSpectatorsDto videoLiveSpectatorsDto, List<UsersUserFullDto> list, Integer num, String str2) {
        this.status = str;
        this.liveStatus = videoLiveStatusDto;
        this.spectators = videoLiveSpectatorsDto;
        this.profiles = list;
        this.balance = num;
        this.url = str2;
    }

    public final List<UsersUserFullDto> d() {
        return this.profiles;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final VideoLiveSpectatorsDto e() {
        return this.spectators;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoLiveHeartbeatResponseDto)) {
            return false;
        }
        VideoLiveHeartbeatResponseDto videoLiveHeartbeatResponseDto = (VideoLiveHeartbeatResponseDto) obj;
        return epx.f(this.status, videoLiveHeartbeatResponseDto.status) && this.liveStatus == videoLiveHeartbeatResponseDto.liveStatus && epx.f(this.spectators, videoLiveHeartbeatResponseDto.spectators) && epx.f(this.profiles, videoLiveHeartbeatResponseDto.profiles) && epx.f(this.balance, videoLiveHeartbeatResponseDto.balance) && epx.f(this.url, videoLiveHeartbeatResponseDto.url);
    }

    public final int hashCode() {
        int hashCode = this.status.hashCode() * 31;
        VideoLiveStatusDto videoLiveStatusDto = this.liveStatus;
        int hashCode2 = (hashCode + (videoLiveStatusDto == null ? 0 : videoLiveStatusDto.hashCode())) * 31;
        VideoLiveSpectatorsDto videoLiveSpectatorsDto = this.spectators;
        int hashCode3 = (hashCode2 + (videoLiveSpectatorsDto == null ? 0 : videoLiveSpectatorsDto.hashCode())) * 31;
        List<UsersUserFullDto> list = this.profiles;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.balance;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.url;
        return hashCode5 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoLiveHeartbeatResponseDto(status=");
        sb.append(this.status);
        sb.append(", liveStatus=");
        sb.append(this.liveStatus);
        sb.append(", spectators=");
        sb.append(this.spectators);
        sb.append(", profiles=");
        sb.append(this.profiles);
        sb.append(", balance=");
        sb.append(this.balance);
        sb.append(", url=");
        return ho8.a(sb, this.url, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.status);
        parcel.writeParcelable(this.liveStatus, i);
        VideoLiveSpectatorsDto videoLiveSpectatorsDto = this.spectators;
        if (videoLiveSpectatorsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            videoLiveSpectatorsDto.writeToParcel(parcel, i);
        }
        List<UsersUserFullDto> list = this.profiles;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        Integer num = this.balance;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeString(this.url);
    }

    public /* synthetic */ VideoLiveHeartbeatResponseDto(String str, VideoLiveStatusDto videoLiveStatusDto, VideoLiveSpectatorsDto videoLiveSpectatorsDto, List list, Integer num, String str2, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : videoLiveStatusDto, (i & 4) != 0 ? null : videoLiveSpectatorsDto, (i & 8) != 0 ? null : list, (i & 16) != 0 ? null : num, (i & 32) != 0 ? null : str2);
    }
}
