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
import xsna.nr;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: VideoInteractiveVideoChapterInfoDto.kt */
/* loaded from: classes15.dex */
public final class VideoInteractiveVideoChapterInfoDto implements Parcelable {
    public static final Parcelable.Creator<VideoInteractiveVideoChapterInfoDto> CREATOR = new a();

    @pmi0("access_key")
    private final String accessKey;

    @pmi0("image")
    private final List<VideoVideoImageDto> image;

    @pmi0("video_id")
    private final int videoId;

    @pmi0("viewed_created")
    private final Integer viewedCreated;

    @pmi0("viewed_duration")
    private final Integer viewedDuration;

    /* compiled from: VideoInteractiveVideoChapterInfoDto.kt */
    public static final class a implements Parcelable.Creator<VideoInteractiveVideoChapterInfoDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoInteractiveVideoChapterInfoDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            int readInt = parcel.readInt();
            String readString = parcel.readString();
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt2 = parcel.readInt();
                arrayList = new ArrayList(readInt2);
                int i = 0;
                while (i != readInt2) {
                    i = bo.b(VideoInteractiveVideoChapterInfoDto.class, parcel, arrayList, i, 1);
                }
            }
            return new VideoInteractiveVideoChapterInfoDto(readInt, readString, valueOf, valueOf2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final VideoInteractiveVideoChapterInfoDto[] newArray(int i) {
            return new VideoInteractiveVideoChapterInfoDto[i];
        }
    }

    public VideoInteractiveVideoChapterInfoDto(int i, String str, Integer num, Integer num2, List<VideoVideoImageDto> list) {
        this.videoId = i;
        this.accessKey = str;
        this.viewedDuration = num;
        this.viewedCreated = num2;
        this.image = list;
    }

    public final String d() {
        return this.accessKey;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int e() {
        return this.videoId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoInteractiveVideoChapterInfoDto)) {
            return false;
        }
        VideoInteractiveVideoChapterInfoDto videoInteractiveVideoChapterInfoDto = (VideoInteractiveVideoChapterInfoDto) obj;
        return this.videoId == videoInteractiveVideoChapterInfoDto.videoId && epx.f(this.accessKey, videoInteractiveVideoChapterInfoDto.accessKey) && epx.f(this.viewedDuration, videoInteractiveVideoChapterInfoDto.viewedDuration) && epx.f(this.viewedCreated, videoInteractiveVideoChapterInfoDto.viewedCreated) && epx.f(this.image, videoInteractiveVideoChapterInfoDto.image);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.videoId) * 31;
        String str = this.accessKey;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.viewedDuration;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.viewedCreated;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        List<VideoVideoImageDto> list = this.image;
        return hashCode4 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoInteractiveVideoChapterInfoDto(videoId=");
        sb.append(this.videoId);
        sb.append(", accessKey=");
        sb.append(this.accessKey);
        sb.append(", viewedDuration=");
        sb.append(this.viewedDuration);
        sb.append(", viewedCreated=");
        sb.append(this.viewedCreated);
        sb.append(", image=");
        return ms9.a(')', sb, this.image);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.videoId);
        parcel.writeString(this.accessKey);
        Integer num = this.viewedDuration;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.viewedCreated;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        List<VideoVideoImageDto> list = this.image;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            parcel.writeParcelable((Parcelable) f.next(), i);
        }
    }

    public /* synthetic */ VideoInteractiveVideoChapterInfoDto(int i, String str, Integer num, Integer num2, List list, int i2, zcl zclVar) {
        this(i, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : num, (i2 & 8) != 0 ? null : num2, (i2 & 16) != 0 ? null : list);
    }
}
