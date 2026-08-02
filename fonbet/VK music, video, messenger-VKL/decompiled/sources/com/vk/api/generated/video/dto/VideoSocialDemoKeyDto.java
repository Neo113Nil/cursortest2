package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: VideoSocialDemoKeyDto.kt */
/* loaded from: classes15.dex */
public final class VideoSocialDemoKeyDto implements Parcelable {
    public static final Parcelable.Creator<VideoSocialDemoKeyDto> CREATOR = new a();

    @pmi0("id")
    private final String id;

    @pmi0("value")
    private final String value;

    /* compiled from: VideoSocialDemoKeyDto.kt */
    public static final class a implements Parcelable.Creator<VideoSocialDemoKeyDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoSocialDemoKeyDto createFromParcel(Parcel parcel) {
            return new VideoSocialDemoKeyDto(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VideoSocialDemoKeyDto[] newArray(int i) {
            return new VideoSocialDemoKeyDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VideoSocialDemoKeyDto() {
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
        if (!(obj instanceof VideoSocialDemoKeyDto)) {
            return false;
        }
        VideoSocialDemoKeyDto videoSocialDemoKeyDto = (VideoSocialDemoKeyDto) obj;
        return epx.f(this.id, videoSocialDemoKeyDto.id) && epx.f(this.value, videoSocialDemoKeyDto.value);
    }

    public final int hashCode() {
        String str = this.id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.value;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoSocialDemoKeyDto(id=");
        sb.append(this.id);
        sb.append(", value=");
        return ho8.a(sb, this.value, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeString(this.value);
    }

    public VideoSocialDemoKeyDto(String str, String str2) {
        this.id = str;
        this.value = str2;
    }

    public /* synthetic */ VideoSocialDemoKeyDto(String str, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
