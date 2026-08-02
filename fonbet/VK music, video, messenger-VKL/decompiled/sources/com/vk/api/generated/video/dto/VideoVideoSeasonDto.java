package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import xsna.bh10;
import xsna.epx;
import xsna.pmi0;
import xsna.shy;
import xsna.sn;
import xsna.tn;
import xsna.urd0;
import xsna.zcl;

/* compiled from: VideoVideoSeasonDto.kt */
/* loaded from: classes15.dex */
public final class VideoVideoSeasonDto implements Parcelable {
    public static final Parcelable.Creator<VideoVideoSeasonDto> CREATOR = new a();

    @pmi0("count")
    private final int count;

    @pmi0("id")
    private final int id;

    @pmi0("is_contains_focus_video")
    private final Boolean isContainsFocusVideo;

    @pmi0("owner_id")
    private final UserId ownerId;

    @pmi0("series_id")
    private final int seriesId;

    @pmi0("title")
    private final String title;

    /* compiled from: VideoVideoSeasonDto.kt */
    public static final class a implements Parcelable.Creator<VideoVideoSeasonDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoVideoSeasonDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            int readInt = parcel.readInt();
            UserId userId = (UserId) parcel.readParcelable(VideoVideoSeasonDto.class.getClassLoader());
            int readInt2 = parcel.readInt();
            String readString = parcel.readString();
            int readInt3 = parcel.readInt();
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new VideoVideoSeasonDto(readInt, userId, readInt2, readString, readInt3, valueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final VideoVideoSeasonDto[] newArray(int i) {
            return new VideoVideoSeasonDto[i];
        }
    }

    public VideoVideoSeasonDto(int i, UserId userId, int i2, String str, int i3, Boolean bool) {
        this.id = i;
        this.ownerId = userId;
        this.seriesId = i2;
        this.title = str;
        this.count = i3;
        this.isContainsFocusVideo = bool;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoVideoSeasonDto)) {
            return false;
        }
        VideoVideoSeasonDto videoVideoSeasonDto = (VideoVideoSeasonDto) obj;
        return this.id == videoVideoSeasonDto.id && epx.f(this.ownerId, videoVideoSeasonDto.ownerId) && this.seriesId == videoVideoSeasonDto.seriesId && epx.f(this.title, videoVideoSeasonDto.title) && this.count == videoVideoSeasonDto.count && epx.f(this.isContainsFocusVideo, videoVideoSeasonDto.isContainsFocusVideo);
    }

    public final int hashCode() {
        int a2 = shy.a(this.count, urd0.a(shy.a(this.seriesId, bh10.a(Integer.hashCode(this.id) * 31, 31, this.ownerId.b), 31), 31, this.title), 31);
        Boolean bool = this.isContainsFocusVideo;
        return a2 + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoVideoSeasonDto(id=");
        sb.append(this.id);
        sb.append(", ownerId=");
        sb.append(this.ownerId);
        sb.append(", seriesId=");
        sb.append(this.seriesId);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", count=");
        sb.append(this.count);
        sb.append(", isContainsFocusVideo=");
        return tn.a(sb, this.isContainsFocusVideo, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        parcel.writeParcelable(this.ownerId, i);
        parcel.writeInt(this.seriesId);
        parcel.writeString(this.title);
        parcel.writeInt(this.count);
        Boolean bool = this.isContainsFocusVideo;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
    }

    public /* synthetic */ VideoVideoSeasonDto(int i, UserId userId, int i2, String str, int i3, Boolean bool, int i4, zcl zclVar) {
        this(i, userId, i2, str, i3, (i4 & 32) != 0 ? null : bool);
    }
}
