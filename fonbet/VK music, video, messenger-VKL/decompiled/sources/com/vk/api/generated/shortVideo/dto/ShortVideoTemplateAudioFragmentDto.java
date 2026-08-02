package com.vk.api.generated.shortVideo.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import xsna.epx;
import xsna.pmi0;
import xsna.shy;
import xsna.urd0;
import xsna.vu5;

/* compiled from: ShortVideoTemplateAudioFragmentDto.kt */
/* loaded from: classes15.dex */
public final class ShortVideoTemplateAudioFragmentDto implements Parcelable {
    public static final Parcelable.Creator<ShortVideoTemplateAudioFragmentDto> CREATOR = new a();

    @pmi0("audio_offset")
    private final int audioOffset;

    @pmi0("audio_raw_id")
    private final String audioRawId;

    @pmi0(TtmlNode.END)
    private final int end;

    @pmi0("start")
    private final int start;

    /* compiled from: ShortVideoTemplateAudioFragmentDto.kt */
    public static final class a implements Parcelable.Creator<ShortVideoTemplateAudioFragmentDto> {
        @Override // android.os.Parcelable.Creator
        public final ShortVideoTemplateAudioFragmentDto createFromParcel(Parcel parcel) {
            return new ShortVideoTemplateAudioFragmentDto(parcel.readInt(), parcel.readString(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final ShortVideoTemplateAudioFragmentDto[] newArray(int i) {
            return new ShortVideoTemplateAudioFragmentDto[i];
        }
    }

    public ShortVideoTemplateAudioFragmentDto(int i, String str, int i2, int i3) {
        this.audioOffset = i;
        this.audioRawId = str;
        this.start = i2;
        this.end = i3;
    }

    public final int d() {
        return this.audioOffset;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int e() {
        return this.end;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShortVideoTemplateAudioFragmentDto)) {
            return false;
        }
        ShortVideoTemplateAudioFragmentDto shortVideoTemplateAudioFragmentDto = (ShortVideoTemplateAudioFragmentDto) obj;
        return this.audioOffset == shortVideoTemplateAudioFragmentDto.audioOffset && epx.f(this.audioRawId, shortVideoTemplateAudioFragmentDto.audioRawId) && this.start == shortVideoTemplateAudioFragmentDto.start && this.end == shortVideoTemplateAudioFragmentDto.end;
    }

    public final int f() {
        return this.start;
    }

    public final int hashCode() {
        return Integer.hashCode(this.end) + shy.a(this.start, urd0.a(Integer.hashCode(this.audioOffset) * 31, 31, this.audioRawId), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShortVideoTemplateAudioFragmentDto(audioOffset=");
        sb.append(this.audioOffset);
        sb.append(", audioRawId=");
        sb.append(this.audioRawId);
        sb.append(", start=");
        sb.append(this.start);
        sb.append(", end=");
        return vu5.b(sb, this.end, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.audioOffset);
        parcel.writeString(this.audioRawId);
        parcel.writeInt(this.start);
        parcel.writeInt(this.end);
    }
}
