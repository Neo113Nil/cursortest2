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
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;

/* compiled from: VideoMusicStreamMixCatalogItemDto.kt */
/* loaded from: classes15.dex */
public final class VideoMusicStreamMixCatalogItemDto implements Parcelable {
    public static final Parcelable.Creator<VideoMusicStreamMixCatalogItemDto> CREATOR = new a();

    @pmi0("background_image_url")
    private final String backgroundImageUrl;

    @pmi0("description")
    private final String description;

    @pmi0("id")
    private final String id;

    @pmi0("recom_payload")
    private final String recomPayload;

    @pmi0("title")
    private final String title;

    @pmi0("videos")
    private final List<VideoVideoFullDto> videos;

    /* compiled from: VideoMusicStreamMixCatalogItemDto.kt */
    public static final class a implements Parcelable.Creator<VideoMusicStreamMixCatalogItemDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoMusicStreamMixCatalogItemDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = bo.b(VideoMusicStreamMixCatalogItemDto.class, parcel, arrayList, i, 1);
                }
            }
            return new VideoMusicStreamMixCatalogItemDto(readString, readString2, readString3, readString4, readString5, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final VideoMusicStreamMixCatalogItemDto[] newArray(int i) {
            return new VideoMusicStreamMixCatalogItemDto[i];
        }
    }

    public VideoMusicStreamMixCatalogItemDto(String str, String str2, String str3, String str4, String str5, List<VideoVideoFullDto> list) {
        this.id = str;
        this.title = str2;
        this.description = str3;
        this.backgroundImageUrl = str4;
        this.recomPayload = str5;
        this.videos = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoMusicStreamMixCatalogItemDto)) {
            return false;
        }
        VideoMusicStreamMixCatalogItemDto videoMusicStreamMixCatalogItemDto = (VideoMusicStreamMixCatalogItemDto) obj;
        return epx.f(this.id, videoMusicStreamMixCatalogItemDto.id) && epx.f(this.title, videoMusicStreamMixCatalogItemDto.title) && epx.f(this.description, videoMusicStreamMixCatalogItemDto.description) && epx.f(this.backgroundImageUrl, videoMusicStreamMixCatalogItemDto.backgroundImageUrl) && epx.f(this.recomPayload, videoMusicStreamMixCatalogItemDto.recomPayload) && epx.f(this.videos, videoMusicStreamMixCatalogItemDto.videos);
    }

    public final int hashCode() {
        int a2 = urd0.a(urd0.a(this.id.hashCode() * 31, 31, this.title), 31, this.description);
        String str = this.backgroundImageUrl;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.recomPayload;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<VideoVideoFullDto> list = this.videos;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoMusicStreamMixCatalogItemDto(id=");
        sb.append(this.id);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", description=");
        sb.append(this.description);
        sb.append(", backgroundImageUrl=");
        sb.append(this.backgroundImageUrl);
        sb.append(", recomPayload=");
        sb.append(this.recomPayload);
        sb.append(", videos=");
        return ms9.a(')', sb, this.videos);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeString(this.title);
        parcel.writeString(this.description);
        parcel.writeString(this.backgroundImageUrl);
        parcel.writeString(this.recomPayload);
        List<VideoVideoFullDto> list = this.videos;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            parcel.writeParcelable((Parcelable) f.next(), i);
        }
    }

    public /* synthetic */ VideoMusicStreamMixCatalogItemDto(String str, String str2, String str3, String str4, String str5, List list, int i, zcl zclVar) {
        this(str, str2, str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : list);
    }
}
