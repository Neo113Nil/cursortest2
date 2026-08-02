package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.sn;
import xsna.zcl;

/* compiled from: GroupsChannelInfoDto.kt */
/* loaded from: classes14.dex */
public final class GroupsChannelInfoDto implements Parcelable {
    public static final Parcelable.Creator<GroupsChannelInfoDto> CREATOR = new a();

    @pmi0("can_post")
    private final boolean canPost;

    @pmi0("channel_url")
    private final String channelUrl;

    @pmi0("has_posts")
    private final Boolean hasPosts;

    /* compiled from: GroupsChannelInfoDto.kt */
    public static final class a implements Parcelable.Creator<GroupsChannelInfoDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsChannelInfoDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            boolean z = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new GroupsChannelInfoDto(z, valueOf, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsChannelInfoDto[] newArray(int i) {
            return new GroupsChannelInfoDto[i];
        }
    }

    public GroupsChannelInfoDto(boolean z, Boolean bool, String str) {
        this.canPost = z;
        this.hasPosts = bool;
        this.channelUrl = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsChannelInfoDto)) {
            return false;
        }
        GroupsChannelInfoDto groupsChannelInfoDto = (GroupsChannelInfoDto) obj;
        return this.canPost == groupsChannelInfoDto.canPost && epx.f(this.hasPosts, groupsChannelInfoDto.hasPosts) && epx.f(this.channelUrl, groupsChannelInfoDto.channelUrl);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.canPost) * 31;
        Boolean bool = this.hasPosts;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.channelUrl;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupsChannelInfoDto(canPost=");
        sb.append(this.canPost);
        sb.append(", hasPosts=");
        sb.append(this.hasPosts);
        sb.append(", channelUrl=");
        return ho8.a(sb, this.channelUrl, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.canPost ? 1 : 0);
        Boolean bool = this.hasPosts;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        parcel.writeString(this.channelUrl);
    }

    public /* synthetic */ GroupsChannelInfoDto(boolean z, Boolean bool, String str, int i, zcl zclVar) {
        this(z, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : str);
    }
}
