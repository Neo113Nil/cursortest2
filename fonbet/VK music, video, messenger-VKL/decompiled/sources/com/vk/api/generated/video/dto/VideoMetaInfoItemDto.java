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
import xsna.ms9;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;

/* compiled from: VideoMetaInfoItemDto.kt */
/* loaded from: classes15.dex */
public final class VideoMetaInfoItemDto implements Parcelable {
    public static final Parcelable.Creator<VideoMetaInfoItemDto> CREATOR = new a();

    @pmi0("badge")
    private final String badge;

    @pmi0("id")
    private final String id;

    @pmi0("image")
    private final List<VideoVideoImageDto> image;

    @pmi0("linked_to_playlist_marks")
    private final List<String> linkedToPlaylistMarks;

    @pmi0("subtitle")
    private final String subtitle;

    @pmi0("title")
    private final String title;

    /* compiled from: VideoMetaInfoItemDto.kt */
    public static final class a implements Parcelable.Creator<VideoMetaInfoItemDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoMetaInfoItemDto createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = bo.b(VideoMetaInfoItemDto.class, parcel, arrayList, i, 1);
            }
            return new VideoMetaInfoItemDto(readString, readString2, arrayList, parcel.readString(), parcel.readString(), parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final VideoMetaInfoItemDto[] newArray(int i) {
            return new VideoMetaInfoItemDto[i];
        }
    }

    public VideoMetaInfoItemDto(String str, String str2, List<VideoVideoImageDto> list, String str3, String str4, List<String> list2) {
        this.id = str;
        this.title = str2;
        this.image = list;
        this.subtitle = str3;
        this.badge = str4;
        this.linkedToPlaylistMarks = list2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoMetaInfoItemDto)) {
            return false;
        }
        VideoMetaInfoItemDto videoMetaInfoItemDto = (VideoMetaInfoItemDto) obj;
        return epx.f(this.id, videoMetaInfoItemDto.id) && epx.f(this.title, videoMetaInfoItemDto.title) && epx.f(this.image, videoMetaInfoItemDto.image) && epx.f(this.subtitle, videoMetaInfoItemDto.subtitle) && epx.f(this.badge, videoMetaInfoItemDto.badge) && epx.f(this.linkedToPlaylistMarks, videoMetaInfoItemDto.linkedToPlaylistMarks);
    }

    public final int hashCode() {
        int a2 = fw3.a(urd0.a(this.id.hashCode() * 31, 31, this.title), 31, this.image);
        String str = this.subtitle;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.badge;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<String> list = this.linkedToPlaylistMarks;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoMetaInfoItemDto(id=");
        sb.append(this.id);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", image=");
        sb.append(this.image);
        sb.append(", subtitle=");
        sb.append(this.subtitle);
        sb.append(", badge=");
        sb.append(this.badge);
        sb.append(", linkedToPlaylistMarks=");
        return ms9.a(')', sb, this.linkedToPlaylistMarks);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeString(this.title);
        Iterator a2 = ao.a(parcel, this.image);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
        parcel.writeString(this.subtitle);
        parcel.writeString(this.badge);
        parcel.writeStringList(this.linkedToPlaylistMarks);
    }

    public /* synthetic */ VideoMetaInfoItemDto(String str, String str2, List list, String str3, String str4, List list2, int i, zcl zclVar) {
        this(str, str2, list, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : list2);
    }
}
