package com.vk.api.generated.shortVideo.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import defpackage.q0;
import xsna.epx;
import xsna.pmi0;

/* compiled from: ShortVideoGetDownloadUrlResponseDto.kt */
/* loaded from: classes15.dex */
public final class ShortVideoGetDownloadUrlResponseDto implements Parcelable {
    public static final Parcelable.Creator<ShortVideoGetDownloadUrlResponseDto> CREATOR = new a();

    @pmi0(DownloadModel.DOWNLOAD_URL)
    private final String downloadUrl;

    @pmi0("is_muted")
    private final boolean isMuted;

    /* compiled from: ShortVideoGetDownloadUrlResponseDto.kt */
    public static final class a implements Parcelable.Creator<ShortVideoGetDownloadUrlResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final ShortVideoGetDownloadUrlResponseDto createFromParcel(Parcel parcel) {
            return new ShortVideoGetDownloadUrlResponseDto(parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final ShortVideoGetDownloadUrlResponseDto[] newArray(int i) {
            return new ShortVideoGetDownloadUrlResponseDto[i];
        }
    }

    public ShortVideoGetDownloadUrlResponseDto(String str, boolean z) {
        this.downloadUrl = str;
        this.isMuted = z;
    }

    public final String d() {
        return this.downloadUrl;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean e() {
        return this.isMuted;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShortVideoGetDownloadUrlResponseDto)) {
            return false;
        }
        ShortVideoGetDownloadUrlResponseDto shortVideoGetDownloadUrlResponseDto = (ShortVideoGetDownloadUrlResponseDto) obj;
        return epx.f(this.downloadUrl, shortVideoGetDownloadUrlResponseDto.downloadUrl) && this.isMuted == shortVideoGetDownloadUrlResponseDto.isMuted;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.isMuted) + (this.downloadUrl.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShortVideoGetDownloadUrlResponseDto(downloadUrl=");
        sb.append(this.downloadUrl);
        sb.append(", isMuted=");
        return q0.a(sb, this.isMuted, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.downloadUrl);
        parcel.writeInt(this.isMuted ? 1 : 0);
    }
}
