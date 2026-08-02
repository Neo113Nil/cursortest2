package com.vk.api.generated.videoChannels.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.bh10;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.qoy;
import xsna.urd0;
import xsna.zcl;

/* compiled from: VideoChannelsChannelRecomDto.kt */
/* loaded from: classes15.dex */
public final class VideoChannelsChannelRecomDto implements Parcelable {
    public static final Parcelable.Creator<VideoChannelsChannelRecomDto> CREATOR = new a();

    @pmi0("id")
    private final long id;

    @pmi0("is_member")
    private final boolean isMember;

    @pmi0("members_count")
    private final long membersCount;

    @pmi0("name")
    private final String name;

    @pmi0("photo_max")
    private final String photoMax;

    @pmi0("verified")
    private final boolean verified;

    /* compiled from: VideoChannelsChannelRecomDto.kt */
    public static final class a implements Parcelable.Creator<VideoChannelsChannelRecomDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoChannelsChannelRecomDto createFromParcel(Parcel parcel) {
            return new VideoChannelsChannelRecomDto(parcel.readLong(), parcel.readLong(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VideoChannelsChannelRecomDto[] newArray(int i) {
            return new VideoChannelsChannelRecomDto[i];
        }
    }

    public VideoChannelsChannelRecomDto(long j, long j2, String str, boolean z, boolean z2, String str2) {
        this.id = j;
        this.membersCount = j2;
        this.name = str;
        this.verified = z;
        this.isMember = z2;
        this.photoMax = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoChannelsChannelRecomDto)) {
            return false;
        }
        VideoChannelsChannelRecomDto videoChannelsChannelRecomDto = (VideoChannelsChannelRecomDto) obj;
        return this.id == videoChannelsChannelRecomDto.id && this.membersCount == videoChannelsChannelRecomDto.membersCount && epx.f(this.name, videoChannelsChannelRecomDto.name) && this.verified == videoChannelsChannelRecomDto.verified && this.isMember == videoChannelsChannelRecomDto.isMember && epx.f(this.photoMax, videoChannelsChannelRecomDto.photoMax);
    }

    public final int hashCode() {
        int b = qoy.b(qoy.b(urd0.a(bh10.a(Long.hashCode(this.id) * 31, 31, this.membersCount), 31, this.name), 31, this.verified), 31, this.isMember);
        String str = this.photoMax;
        return b + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoChannelsChannelRecomDto(id=");
        sb.append(this.id);
        sb.append(", membersCount=");
        sb.append(this.membersCount);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", verified=");
        sb.append(this.verified);
        sb.append(", isMember=");
        sb.append(this.isMember);
        sb.append(", photoMax=");
        return ho8.a(sb, this.photoMax, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.id);
        parcel.writeLong(this.membersCount);
        parcel.writeString(this.name);
        parcel.writeInt(this.verified ? 1 : 0);
        parcel.writeInt(this.isMember ? 1 : 0);
        parcel.writeString(this.photoMax);
    }

    public /* synthetic */ VideoChannelsChannelRecomDto(long j, long j2, String str, boolean z, boolean z2, String str2, int i, zcl zclVar) {
        this(j, j2, str, z, z2, (i & 32) != 0 ? null : str2);
    }
}
