package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: VideoModerLogLinksDto.kt */
/* loaded from: classes15.dex */
public final class VideoModerLogLinksDto implements Parcelable {
    public static final Parcelable.Creator<VideoModerLogLinksDto> CREATOR = new a();

    @pmi0("catalog_emo_link")
    private final String catalogEmoLink;

    @pmi0("odkl_clip_link")
    private final String odklClipLink;

    @pmi0("odkl_video_link")
    private final String odklVideoLink;

    @pmi0("vk_video_link")
    private final String vkVideoLink;

    /* compiled from: VideoModerLogLinksDto.kt */
    public static final class a implements Parcelable.Creator<VideoModerLogLinksDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoModerLogLinksDto createFromParcel(Parcel parcel) {
            return new VideoModerLogLinksDto(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VideoModerLogLinksDto[] newArray(int i) {
            return new VideoModerLogLinksDto[i];
        }
    }

    public VideoModerLogLinksDto() {
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
        if (!(obj instanceof VideoModerLogLinksDto)) {
            return false;
        }
        VideoModerLogLinksDto videoModerLogLinksDto = (VideoModerLogLinksDto) obj;
        return epx.f(this.vkVideoLink, videoModerLogLinksDto.vkVideoLink) && epx.f(this.odklVideoLink, videoModerLogLinksDto.odklVideoLink) && epx.f(this.odklClipLink, videoModerLogLinksDto.odklClipLink) && epx.f(this.catalogEmoLink, videoModerLogLinksDto.catalogEmoLink);
    }

    public final int hashCode() {
        String str = this.vkVideoLink;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.odklVideoLink;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.odklClipLink;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.catalogEmoLink;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoModerLogLinksDto(vkVideoLink=");
        sb.append(this.vkVideoLink);
        sb.append(", odklVideoLink=");
        sb.append(this.odklVideoLink);
        sb.append(", odklClipLink=");
        sb.append(this.odklClipLink);
        sb.append(", catalogEmoLink=");
        return ho8.a(sb, this.catalogEmoLink, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.vkVideoLink);
        parcel.writeString(this.odklVideoLink);
        parcel.writeString(this.odklClipLink);
        parcel.writeString(this.catalogEmoLink);
    }

    public VideoModerLogLinksDto(String str, String str2, String str3, String str4) {
        this.vkVideoLink = str;
        this.odklVideoLink = str2;
        this.odklClipLink = str3;
        this.catalogEmoLink = str4;
    }

    public /* synthetic */ VideoModerLogLinksDto(String str, String str2, String str3, String str4, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }
}
