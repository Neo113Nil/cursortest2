package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: VideoCommonStartupAppDataDto.kt */
/* loaded from: classes15.dex */
public final class VideoCommonStartupAppDataDto implements Parcelable {
    public static final Parcelable.Creator<VideoCommonStartupAppDataDto> CREATOR = new a();

    @pmi0("child_avatar")
    private final String childAvatar;

    @pmi0("default_avatar")
    private final String defaultAvatar;

    /* compiled from: VideoCommonStartupAppDataDto.kt */
    public static final class a implements Parcelable.Creator<VideoCommonStartupAppDataDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoCommonStartupAppDataDto createFromParcel(Parcel parcel) {
            return new VideoCommonStartupAppDataDto(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VideoCommonStartupAppDataDto[] newArray(int i) {
            return new VideoCommonStartupAppDataDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VideoCommonStartupAppDataDto() {
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
        if (!(obj instanceof VideoCommonStartupAppDataDto)) {
            return false;
        }
        VideoCommonStartupAppDataDto videoCommonStartupAppDataDto = (VideoCommonStartupAppDataDto) obj;
        return epx.f(this.defaultAvatar, videoCommonStartupAppDataDto.defaultAvatar) && epx.f(this.childAvatar, videoCommonStartupAppDataDto.childAvatar);
    }

    public final int hashCode() {
        String str = this.defaultAvatar;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.childAvatar;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoCommonStartupAppDataDto(defaultAvatar=");
        sb.append(this.defaultAvatar);
        sb.append(", childAvatar=");
        return ho8.a(sb, this.childAvatar, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.defaultAvatar);
        parcel.writeString(this.childAvatar);
    }

    public VideoCommonStartupAppDataDto(String str, String str2) {
        this.defaultAvatar = str;
        this.childAvatar = str2;
    }

    public /* synthetic */ VideoCommonStartupAppDataDto(String str, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
