package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import xsna.bh10;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.shy;
import xsna.uqi;
import xsna.urd0;
import xsna.zcl;

/* compiled from: VideoVkliveChannelDto.kt */
/* loaded from: classes15.dex */
public final class VideoVkliveChannelDto implements Parcelable {
    public static final Parcelable.Creator<VideoVkliveChannelDto> CREATOR = new a();

    @pmi0("category_id")
    private final String categoryId;

    @pmi0("status")
    private final String status;

    @pmi0("stream_id")
    private final String streamId;

    @pmi0("stream_preview_url")
    private final String streamPreviewUrl;

    @pmi0("stream_started_at")
    private final Integer streamStartedAt;

    @pmi0("stream_title")
    private final String streamTitle;

    @pmi0("stream_video_id")
    private final String streamVideoId;

    @pmi0("stream_viewers")
    private final int streamViewers;

    @pmi0("url")
    private final String url;

    @pmi0("vk_video_id")
    private final Integer vkVideoId;

    @pmi0("vk_video_owner_id")
    private final UserId vkVideoOwnerId;

    @pmi0("vklive_owner_avatar_url")
    private final String vkliveOwnerAvatarUrl;

    @pmi0("vklive_owner_id")
    private final UserId vkliveOwnerId;

    @pmi0("vklive_owner_nick")
    private final String vkliveOwnerNick;

    /* compiled from: VideoVkliveChannelDto.kt */
    public static final class a implements Parcelable.Creator<VideoVkliveChannelDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoVkliveChannelDto createFromParcel(Parcel parcel) {
            return new VideoVkliveChannelDto(parcel.readString(), parcel.readString(), parcel.readString(), (UserId) parcel.readParcelable(VideoVkliveChannelDto.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), (UserId) parcel.readParcelable(VideoVkliveChannelDto.class.getClassLoader()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final VideoVkliveChannelDto[] newArray(int i) {
            return new VideoVkliveChannelDto[i];
        }
    }

    public VideoVkliveChannelDto(String str, String str2, String str3, UserId userId, String str4, String str5, int i, String str6, String str7, String str8, Integer num, String str9, UserId userId2, Integer num2) {
        this.url = str;
        this.status = str2;
        this.vkliveOwnerNick = str3;
        this.vkliveOwnerId = userId;
        this.streamId = str4;
        this.streamTitle = str5;
        this.streamViewers = i;
        this.categoryId = str6;
        this.streamVideoId = str7;
        this.vkliveOwnerAvatarUrl = str8;
        this.streamStartedAt = num;
        this.streamPreviewUrl = str9;
        this.vkVideoOwnerId = userId2;
        this.vkVideoId = num2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoVkliveChannelDto)) {
            return false;
        }
        VideoVkliveChannelDto videoVkliveChannelDto = (VideoVkliveChannelDto) obj;
        return epx.f(this.url, videoVkliveChannelDto.url) && epx.f(this.status, videoVkliveChannelDto.status) && epx.f(this.vkliveOwnerNick, videoVkliveChannelDto.vkliveOwnerNick) && epx.f(this.vkliveOwnerId, videoVkliveChannelDto.vkliveOwnerId) && epx.f(this.streamId, videoVkliveChannelDto.streamId) && epx.f(this.streamTitle, videoVkliveChannelDto.streamTitle) && this.streamViewers == videoVkliveChannelDto.streamViewers && epx.f(this.categoryId, videoVkliveChannelDto.categoryId) && epx.f(this.streamVideoId, videoVkliveChannelDto.streamVideoId) && epx.f(this.vkliveOwnerAvatarUrl, videoVkliveChannelDto.vkliveOwnerAvatarUrl) && epx.f(this.streamStartedAt, videoVkliveChannelDto.streamStartedAt) && epx.f(this.streamPreviewUrl, videoVkliveChannelDto.streamPreviewUrl) && epx.f(this.vkVideoOwnerId, videoVkliveChannelDto.vkVideoOwnerId) && epx.f(this.vkVideoId, videoVkliveChannelDto.vkVideoId);
    }

    public final int hashCode() {
        int a2 = urd0.a(urd0.a(shy.a(this.streamViewers, urd0.a(urd0.a(bh10.a(urd0.a(urd0.a(this.url.hashCode() * 31, 31, this.status), 31, this.vkliveOwnerNick), 31, this.vkliveOwnerId.b), 31, this.streamId), 31, this.streamTitle), 31), 31, this.categoryId), 31, this.streamVideoId);
        String str = this.vkliveOwnerAvatarUrl;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.streamStartedAt;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.streamPreviewUrl;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        UserId userId = this.vkVideoOwnerId;
        int hashCode4 = (hashCode3 + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
        Integer num2 = this.vkVideoId;
        return hashCode4 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoVkliveChannelDto(url=");
        sb.append(this.url);
        sb.append(", status=");
        sb.append(this.status);
        sb.append(", vkliveOwnerNick=");
        sb.append(this.vkliveOwnerNick);
        sb.append(", vkliveOwnerId=");
        sb.append(this.vkliveOwnerId);
        sb.append(", streamId=");
        sb.append(this.streamId);
        sb.append(", streamTitle=");
        sb.append(this.streamTitle);
        sb.append(", streamViewers=");
        sb.append(this.streamViewers);
        sb.append(", categoryId=");
        sb.append(this.categoryId);
        sb.append(", streamVideoId=");
        sb.append(this.streamVideoId);
        sb.append(", vkliveOwnerAvatarUrl=");
        sb.append(this.vkliveOwnerAvatarUrl);
        sb.append(", streamStartedAt=");
        sb.append(this.streamStartedAt);
        sb.append(", streamPreviewUrl=");
        sb.append(this.streamPreviewUrl);
        sb.append(", vkVideoOwnerId=");
        sb.append(this.vkVideoOwnerId);
        sb.append(", vkVideoId=");
        return uqi.b(sb, this.vkVideoId, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.url);
        parcel.writeString(this.status);
        parcel.writeString(this.vkliveOwnerNick);
        parcel.writeParcelable(this.vkliveOwnerId, i);
        parcel.writeString(this.streamId);
        parcel.writeString(this.streamTitle);
        parcel.writeInt(this.streamViewers);
        parcel.writeString(this.categoryId);
        parcel.writeString(this.streamVideoId);
        parcel.writeString(this.vkliveOwnerAvatarUrl);
        Integer num = this.streamStartedAt;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeString(this.streamPreviewUrl);
        parcel.writeParcelable(this.vkVideoOwnerId, i);
        Integer num2 = this.vkVideoId;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
    }

    public /* synthetic */ VideoVkliveChannelDto(String str, String str2, String str3, UserId userId, String str4, String str5, int i, String str6, String str7, String str8, Integer num, String str9, UserId userId2, Integer num2, int i2, zcl zclVar) {
        this(str, str2, str3, userId, str4, str5, i, str6, str7, (i2 & 512) != 0 ? null : str8, (i2 & 1024) != 0 ? null : num, (i2 & 2048) != 0 ? null : str9, (i2 & 4096) != 0 ? null : userId2, (i2 & 8192) != 0 ? null : num2);
    }
}
