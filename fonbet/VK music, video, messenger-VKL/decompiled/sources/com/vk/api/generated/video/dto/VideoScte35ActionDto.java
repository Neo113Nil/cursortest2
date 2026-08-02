package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: VideoScte35ActionDto.kt */
/* loaded from: classes15.dex */
public final class VideoScte35ActionDto implements Parcelable {
    public static final Parcelable.Creator<VideoScte35ActionDto> CREATOR = new a();

    @pmi0("action")
    private final String action;

    @pmi0("unique_program_id")
    private final String uniqueProgramId;

    /* compiled from: VideoScte35ActionDto.kt */
    public static final class a implements Parcelable.Creator<VideoScte35ActionDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoScte35ActionDto createFromParcel(Parcel parcel) {
            return new VideoScte35ActionDto(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VideoScte35ActionDto[] newArray(int i) {
            return new VideoScte35ActionDto[i];
        }
    }

    public VideoScte35ActionDto(String str, String str2) {
        this.uniqueProgramId = str;
        this.action = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoScte35ActionDto)) {
            return false;
        }
        VideoScte35ActionDto videoScte35ActionDto = (VideoScte35ActionDto) obj;
        return epx.f(this.uniqueProgramId, videoScte35ActionDto.uniqueProgramId) && epx.f(this.action, videoScte35ActionDto.action);
    }

    public final int hashCode() {
        return this.action.hashCode() + (this.uniqueProgramId.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoScte35ActionDto(uniqueProgramId=");
        sb.append(this.uniqueProgramId);
        sb.append(", action=");
        return ho8.a(sb, this.action, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.uniqueProgramId);
        parcel.writeString(this.action);
    }
}
