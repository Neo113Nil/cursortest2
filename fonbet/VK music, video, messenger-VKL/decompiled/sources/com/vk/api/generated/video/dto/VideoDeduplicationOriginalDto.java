package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.Hb;
import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.ho8;
import xsna.nr;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: VideoDeduplicationOriginalDto.kt */
/* loaded from: classes15.dex */
public final class VideoDeduplicationOriginalDto implements Parcelable {
    public static final Parcelable.Creator<VideoDeduplicationOriginalDto> CREATOR = new a();

    @pmi0("owner_id")
    private final UserId ownerId;

    @pmi0("random_tag")
    private final String randomTag;

    @pmi0(Hb.a)
    private final Integer server;

    @pmi0("video_id")
    private final Integer videoId;

    /* compiled from: VideoDeduplicationOriginalDto.kt */
    public static final class a implements Parcelable.Creator<VideoDeduplicationOriginalDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoDeduplicationOriginalDto createFromParcel(Parcel parcel) {
            return new VideoDeduplicationOriginalDto((UserId) parcel.readParcelable(VideoDeduplicationOriginalDto.class.getClassLoader()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VideoDeduplicationOriginalDto[] newArray(int i) {
            return new VideoDeduplicationOriginalDto[i];
        }
    }

    public VideoDeduplicationOriginalDto() {
        this(null, null, null, null, 15, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoDeduplicationOriginalDto)) {
            return false;
        }
        VideoDeduplicationOriginalDto videoDeduplicationOriginalDto = (VideoDeduplicationOriginalDto) obj;
        return epx.f(this.ownerId, videoDeduplicationOriginalDto.ownerId) && epx.f(this.videoId, videoDeduplicationOriginalDto.videoId) && epx.f(this.server, videoDeduplicationOriginalDto.server) && epx.f(this.randomTag, videoDeduplicationOriginalDto.randomTag);
    }

    public final int hashCode() {
        UserId userId = this.ownerId;
        int hashCode = (userId == null ? 0 : Long.hashCode(userId.b)) * 31;
        Integer num = this.videoId;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.server;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.randomTag;
        return hashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoDeduplicationOriginalDto(ownerId=");
        sb.append(this.ownerId);
        sb.append(", videoId=");
        sb.append(this.videoId);
        sb.append(", server=");
        sb.append(this.server);
        sb.append(", randomTag=");
        return ho8.a(sb, this.randomTag, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.ownerId, i);
        Integer num = this.videoId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.server;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        parcel.writeString(this.randomTag);
    }

    public VideoDeduplicationOriginalDto(UserId userId, Integer num, Integer num2, String str) {
        this.ownerId = userId;
        this.videoId = num;
        this.server = num2;
        this.randomTag = str;
    }

    public /* synthetic */ VideoDeduplicationOriginalDto(UserId userId, Integer num, Integer num2, String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : userId, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : num2, (i & 8) != 0 ? null : str);
    }
}
