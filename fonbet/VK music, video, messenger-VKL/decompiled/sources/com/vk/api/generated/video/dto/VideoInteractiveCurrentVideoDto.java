package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.bh10;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.shy;
import xsna.zcl;

/* compiled from: VideoInteractiveCurrentVideoDto.kt */
/* loaded from: classes15.dex */
public final class VideoInteractiveCurrentVideoDto implements Parcelable {
    public static final Parcelable.Creator<VideoInteractiveCurrentVideoDto> CREATOR = new a();

    @pmi0("files")
    private final VideoVideoFilesDto files;

    @pmi0("image")
    private final List<VideoVideoImageDto> image;

    @pmi0("ov_id")
    private final long ovId;

    @pmi0("owner_id")
    private final UserId ownerId;

    @pmi0("video_id")
    private final int videoId;

    /* compiled from: VideoInteractiveCurrentVideoDto.kt */
    public static final class a implements Parcelable.Creator<VideoInteractiveCurrentVideoDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoInteractiveCurrentVideoDto createFromParcel(Parcel parcel) {
            UserId userId = (UserId) parcel.readParcelable(VideoInteractiveCurrentVideoDto.class.getClassLoader());
            int readInt = parcel.readInt();
            long readLong = parcel.readLong();
            ArrayList arrayList = null;
            VideoVideoFilesDto createFromParcel = parcel.readInt() == 0 ? null : VideoVideoFilesDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                int readInt2 = parcel.readInt();
                arrayList = new ArrayList(readInt2);
                int i = 0;
                while (i != readInt2) {
                    i = en.a(VideoVideoImageDto.CREATOR, parcel, arrayList, i, 1);
                }
            }
            return new VideoInteractiveCurrentVideoDto(userId, readInt, readLong, createFromParcel, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final VideoInteractiveCurrentVideoDto[] newArray(int i) {
            return new VideoInteractiveCurrentVideoDto[i];
        }
    }

    public VideoInteractiveCurrentVideoDto(UserId userId, int i, long j, VideoVideoFilesDto videoVideoFilesDto, List<VideoVideoImageDto> list) {
        this.ownerId = userId;
        this.videoId = i;
        this.ovId = j;
        this.files = videoVideoFilesDto;
        this.image = list;
    }

    public final VideoVideoFilesDto d() {
        return this.files;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final long e() {
        return this.ovId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoInteractiveCurrentVideoDto)) {
            return false;
        }
        VideoInteractiveCurrentVideoDto videoInteractiveCurrentVideoDto = (VideoInteractiveCurrentVideoDto) obj;
        return epx.f(this.ownerId, videoInteractiveCurrentVideoDto.ownerId) && this.videoId == videoInteractiveCurrentVideoDto.videoId && this.ovId == videoInteractiveCurrentVideoDto.ovId && epx.f(this.files, videoInteractiveCurrentVideoDto.files) && epx.f(this.image, videoInteractiveCurrentVideoDto.image);
    }

    public final int f() {
        return this.videoId;
    }

    public final int hashCode() {
        int a2 = bh10.a(shy.a(this.videoId, Long.hashCode(this.ownerId.b) * 31, 31), 31, this.ovId);
        VideoVideoFilesDto videoVideoFilesDto = this.files;
        int hashCode = (a2 + (videoVideoFilesDto == null ? 0 : videoVideoFilesDto.hashCode())) * 31;
        List<VideoVideoImageDto> list = this.image;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoInteractiveCurrentVideoDto(ownerId=");
        sb.append(this.ownerId);
        sb.append(", videoId=");
        sb.append(this.videoId);
        sb.append(", ovId=");
        sb.append(this.ovId);
        sb.append(", files=");
        sb.append(this.files);
        sb.append(", image=");
        return ms9.a(')', sb, this.image);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.ownerId, i);
        parcel.writeInt(this.videoId);
        parcel.writeLong(this.ovId);
        VideoVideoFilesDto videoVideoFilesDto = this.files;
        if (videoVideoFilesDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            videoVideoFilesDto.writeToParcel(parcel, i);
        }
        List<VideoVideoImageDto> list = this.image;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            ((VideoVideoImageDto) f.next()).writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ VideoInteractiveCurrentVideoDto(UserId userId, int i, long j, VideoVideoFilesDto videoVideoFilesDto, List list, int i2, zcl zclVar) {
        this(userId, i, j, (i2 & 8) != 0 ? null : videoVideoFilesDto, (i2 & 16) != 0 ? null : list);
    }
}
