package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.epx;
import xsna.fw3;
import xsna.pmi0;
import xsna.shy;
import xsna.sn;
import xsna.tn;
import xsna.urd0;
import xsna.zcl;

/* compiled from: VideoPlaylistVideoDto.kt */
/* loaded from: classes15.dex */
public final class VideoPlaylistVideoDto implements Parcelable {
    public static final Parcelable.Creator<VideoPlaylistVideoDto> CREATOR = new a();

    @pmi0("date")
    private final int date;

    @pmi0("duration")
    private final int duration;

    @pmi0("id")
    private final int id;

    @pmi0("image")
    private final List<VideoVideoImageDto> image;

    @pmi0("is_video_added")
    private final Boolean isVideoAdded;

    @pmi0("title")
    private final String title;

    @pmi0("views")
    private final int views;

    /* compiled from: VideoPlaylistVideoDto.kt */
    public static final class a implements Parcelable.Creator<VideoPlaylistVideoDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoPlaylistVideoDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            int readInt3 = parcel.readInt();
            int readInt4 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt4);
            int i = 0;
            while (i != readInt4) {
                i = bo.b(VideoPlaylistVideoDto.class, parcel, arrayList, i, 1);
            }
            String readString = parcel.readString();
            int readInt5 = parcel.readInt();
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new VideoPlaylistVideoDto(readInt, readInt2, readInt3, arrayList, readString, readInt5, valueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final VideoPlaylistVideoDto[] newArray(int i) {
            return new VideoPlaylistVideoDto[i];
        }
    }

    public VideoPlaylistVideoDto(int i, int i2, int i3, List<VideoVideoImageDto> list, String str, int i4, Boolean bool) {
        this.id = i;
        this.date = i2;
        this.duration = i3;
        this.image = list;
        this.title = str;
        this.views = i4;
        this.isVideoAdded = bool;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoPlaylistVideoDto)) {
            return false;
        }
        VideoPlaylistVideoDto videoPlaylistVideoDto = (VideoPlaylistVideoDto) obj;
        return this.id == videoPlaylistVideoDto.id && this.date == videoPlaylistVideoDto.date && this.duration == videoPlaylistVideoDto.duration && epx.f(this.image, videoPlaylistVideoDto.image) && epx.f(this.title, videoPlaylistVideoDto.title) && this.views == videoPlaylistVideoDto.views && epx.f(this.isVideoAdded, videoPlaylistVideoDto.isVideoAdded);
    }

    public final int hashCode() {
        int a2 = shy.a(this.views, urd0.a(fw3.a(shy.a(this.duration, shy.a(this.date, Integer.hashCode(this.id) * 31, 31), 31), 31, this.image), 31, this.title), 31);
        Boolean bool = this.isVideoAdded;
        return a2 + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoPlaylistVideoDto(id=");
        sb.append(this.id);
        sb.append(", date=");
        sb.append(this.date);
        sb.append(", duration=");
        sb.append(this.duration);
        sb.append(", image=");
        sb.append(this.image);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", views=");
        sb.append(this.views);
        sb.append(", isVideoAdded=");
        return tn.a(sb, this.isVideoAdded, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        parcel.writeInt(this.date);
        parcel.writeInt(this.duration);
        Iterator a2 = ao.a(parcel, this.image);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
        parcel.writeString(this.title);
        parcel.writeInt(this.views);
        Boolean bool = this.isVideoAdded;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
    }

    public /* synthetic */ VideoPlaylistVideoDto(int i, int i2, int i3, List list, String str, int i4, Boolean bool, int i5, zcl zclVar) {
        this(i, i2, i3, list, str, i4, (i5 & 64) != 0 ? null : bool);
    }
}
