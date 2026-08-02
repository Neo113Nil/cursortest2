package com.vk.api.generated.audio.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.shy;
import xsna.sn;
import xsna.tn;
import xsna.zcl;

/* compiled from: AudioLyricsTimelinesDto.kt */
/* loaded from: classes14.dex */
public final class AudioLyricsTimelinesDto implements Parcelable {
    public static final Parcelable.Creator<AudioLyricsTimelinesDto> CREATOR = new a();

    @pmi0("begin")
    private final int begin;

    @pmi0("countdown")
    private final Integer countdown;

    @pmi0(TtmlNode.END)
    private final int end;

    @pmi0("interlude")
    private final Boolean interlude;

    @pmi0("line")
    private final String line;

    /* compiled from: AudioLyricsTimelinesDto.kt */
    public static final class a implements Parcelable.Creator<AudioLyricsTimelinesDto> {
        @Override // android.os.Parcelable.Creator
        public final AudioLyricsTimelinesDto createFromParcel(Parcel parcel) {
            Integer valueOf;
            Boolean bool;
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            if (parcel.readInt() == 0) {
                valueOf = null;
                bool = null;
            } else {
                valueOf = Integer.valueOf(parcel.readInt());
                bool = null;
            }
            String readString = parcel.readString();
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new AudioLyricsTimelinesDto(readInt, readInt2, valueOf, readString, bool);
        }

        @Override // android.os.Parcelable.Creator
        public final AudioLyricsTimelinesDto[] newArray(int i) {
            return new AudioLyricsTimelinesDto[i];
        }
    }

    public AudioLyricsTimelinesDto(int i, int i2, Integer num, String str, Boolean bool) {
        this.begin = i;
        this.end = i2;
        this.countdown = num;
        this.line = str;
        this.interlude = bool;
    }

    public final int d() {
        return this.begin;
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
        if (!(obj instanceof AudioLyricsTimelinesDto)) {
            return false;
        }
        AudioLyricsTimelinesDto audioLyricsTimelinesDto = (AudioLyricsTimelinesDto) obj;
        return this.begin == audioLyricsTimelinesDto.begin && this.end == audioLyricsTimelinesDto.end && epx.f(this.countdown, audioLyricsTimelinesDto.countdown) && epx.f(this.line, audioLyricsTimelinesDto.line) && epx.f(this.interlude, audioLyricsTimelinesDto.interlude);
    }

    public final Boolean f() {
        return this.interlude;
    }

    public final String g() {
        return this.line;
    }

    public final int hashCode() {
        int a2 = shy.a(this.end, Integer.hashCode(this.begin) * 31, 31);
        Integer num = this.countdown;
        int hashCode = (a2 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.line;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.interlude;
        return hashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioLyricsTimelinesDto(begin=");
        sb.append(this.begin);
        sb.append(", end=");
        sb.append(this.end);
        sb.append(", countdown=");
        sb.append(this.countdown);
        sb.append(", line=");
        sb.append(this.line);
        sb.append(", interlude=");
        return tn.a(sb, this.interlude, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.begin);
        parcel.writeInt(this.end);
        Integer num = this.countdown;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeString(this.line);
        Boolean bool = this.interlude;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
    }

    public /* synthetic */ AudioLyricsTimelinesDto(int i, int i2, Integer num, String str, Boolean bool, int i3, zcl zclVar) {
        this(i, i2, (i3 & 4) != 0 ? null : num, (i3 & 8) != 0 ? null : str, (i3 & 16) != 0 ? null : bool);
    }
}
