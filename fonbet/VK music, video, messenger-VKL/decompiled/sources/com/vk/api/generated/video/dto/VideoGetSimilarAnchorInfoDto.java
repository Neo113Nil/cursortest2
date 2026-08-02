package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: VideoGetSimilarAnchorInfoDto.kt */
/* loaded from: classes15.dex */
public final class VideoGetSimilarAnchorInfoDto implements Parcelable {
    public static final Parcelable.Creator<VideoGetSimilarAnchorInfoDto> CREATOR = new a();

    @pmi0("ref_block")
    private final String refBlock;

    @pmi0("ref_fullscreen")
    private final String refFullscreen;

    @pmi0("token")
    private final String token;

    /* compiled from: VideoGetSimilarAnchorInfoDto.kt */
    public static final class a implements Parcelable.Creator<VideoGetSimilarAnchorInfoDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoGetSimilarAnchorInfoDto createFromParcel(Parcel parcel) {
            return new VideoGetSimilarAnchorInfoDto(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VideoGetSimilarAnchorInfoDto[] newArray(int i) {
            return new VideoGetSimilarAnchorInfoDto[i];
        }
    }

    public VideoGetSimilarAnchorInfoDto() {
        this(null, null, null, 7, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoGetSimilarAnchorInfoDto)) {
            return false;
        }
        VideoGetSimilarAnchorInfoDto videoGetSimilarAnchorInfoDto = (VideoGetSimilarAnchorInfoDto) obj;
        return epx.f(this.refFullscreen, videoGetSimilarAnchorInfoDto.refFullscreen) && epx.f(this.refBlock, videoGetSimilarAnchorInfoDto.refBlock) && epx.f(this.token, videoGetSimilarAnchorInfoDto.token);
    }

    public final int hashCode() {
        String str = this.refFullscreen;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.refBlock;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.token;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoGetSimilarAnchorInfoDto(refFullscreen=");
        sb.append(this.refFullscreen);
        sb.append(", refBlock=");
        sb.append(this.refBlock);
        sb.append(", token=");
        return ho8.a(sb, this.token, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.refFullscreen);
        parcel.writeString(this.refBlock);
        parcel.writeString(this.token);
    }

    public VideoGetSimilarAnchorInfoDto(String str, String str2, String str3) {
        this.refFullscreen = str;
        this.refBlock = str2;
        this.token = str3;
    }

    public /* synthetic */ VideoGetSimilarAnchorInfoDto(String str, String str2, String str3, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
