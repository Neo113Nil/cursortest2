package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: VideoDonutChipDto.kt */
/* loaded from: classes15.dex */
public final class VideoDonutChipDto implements Parcelable {
    public static final Parcelable.Creator<VideoDonutChipDto> CREATOR = new a();

    @pmi0("accessibility_text")
    private final String accessibilityText;

    @pmi0("text")
    private final String text;

    /* compiled from: VideoDonutChipDto.kt */
    public static final class a implements Parcelable.Creator<VideoDonutChipDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoDonutChipDto createFromParcel(Parcel parcel) {
            return new VideoDonutChipDto(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VideoDonutChipDto[] newArray(int i) {
            return new VideoDonutChipDto[i];
        }
    }

    public VideoDonutChipDto(String str, String str2) {
        this.text = str;
        this.accessibilityText = str2;
    }

    public final String d() {
        return this.accessibilityText;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.text;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoDonutChipDto)) {
            return false;
        }
        VideoDonutChipDto videoDonutChipDto = (VideoDonutChipDto) obj;
        return epx.f(this.text, videoDonutChipDto.text) && epx.f(this.accessibilityText, videoDonutChipDto.accessibilityText);
    }

    public final int hashCode() {
        return this.accessibilityText.hashCode() + (this.text.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoDonutChipDto(text=");
        sb.append(this.text);
        sb.append(", accessibilityText=");
        return ho8.a(sb, this.accessibilityText, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.text);
        parcel.writeString(this.accessibilityText);
    }
}
