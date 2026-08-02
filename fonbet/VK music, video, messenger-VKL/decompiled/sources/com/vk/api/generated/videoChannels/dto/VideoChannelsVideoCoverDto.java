package com.vk.api.generated.videoChannels.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.sn;
import xsna.zcl;

/* compiled from: VideoChannelsVideoCoverDto.kt */
/* loaded from: classes15.dex */
public final class VideoChannelsVideoCoverDto implements Parcelable {
    public static final Parcelable.Creator<VideoChannelsVideoCoverDto> CREATOR = new a();

    @pmi0("enabled")
    private final Boolean enabled;

    @pmi0("images")
    private final List<VideoChannelsVideoCoverBaseImageDto> images;

    /* compiled from: VideoChannelsVideoCoverDto.kt */
    public static final class a implements Parcelable.Creator<VideoChannelsVideoCoverDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoChannelsVideoCoverDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            int i = 0;
            ArrayList arrayList = null;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                while (i != readInt) {
                    i = en.a(VideoChannelsVideoCoverBaseImageDto.CREATOR, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new VideoChannelsVideoCoverDto(valueOf, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final VideoChannelsVideoCoverDto[] newArray(int i) {
            return new VideoChannelsVideoCoverDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VideoChannelsVideoCoverDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoChannelsVideoCoverDto)) {
            return false;
        }
        VideoChannelsVideoCoverDto videoChannelsVideoCoverDto = (VideoChannelsVideoCoverDto) obj;
        return epx.f(this.enabled, videoChannelsVideoCoverDto.enabled) && epx.f(this.images, videoChannelsVideoCoverDto.images);
    }

    public final int hashCode() {
        Boolean bool = this.enabled;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        List<VideoChannelsVideoCoverBaseImageDto> list = this.images;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoChannelsVideoCoverDto(enabled=");
        sb.append(this.enabled);
        sb.append(", images=");
        return ms9.a(')', sb, this.images);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Boolean bool = this.enabled;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        List<VideoChannelsVideoCoverBaseImageDto> list = this.images;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            ((VideoChannelsVideoCoverBaseImageDto) f.next()).writeToParcel(parcel, i);
        }
    }

    public VideoChannelsVideoCoverDto(Boolean bool, List<VideoChannelsVideoCoverBaseImageDto> list) {
        this.enabled = bool;
        this.images = list;
    }

    public /* synthetic */ VideoChannelsVideoCoverDto(Boolean bool, List list, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : list);
    }
}
