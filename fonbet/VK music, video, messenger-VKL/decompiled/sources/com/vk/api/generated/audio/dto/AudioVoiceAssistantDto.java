package com.vk.api.generated.audio.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.dn;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AudioVoiceAssistantDto.kt */
/* loaded from: classes14.dex */
public final class AudioVoiceAssistantDto implements Parcelable {
    public static final Parcelable.Creator<AudioVoiceAssistantDto> CREATOR = new a();

    @pmi0("flags")
    private final String flags;

    @pmi0("kws_skip")
    private final List<List<Float>> kwsSkip;

    @pmi0("source")
    private final AudioVoiceAssistantSourceDto source;

    @pmi0("track_id")
    private final Integer trackId;

    /* compiled from: AudioVoiceAssistantDto.kt */
    public static final class a implements Parcelable.Creator<AudioVoiceAssistantDto> {
        @Override // android.os.Parcelable.Creator
        public final AudioVoiceAssistantDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                for (int i = 0; i != readInt; i++) {
                    int readInt2 = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(readInt2);
                    for (int i2 = 0; i2 != readInt2; i2++) {
                        arrayList2.add(Float.valueOf(parcel.readFloat()));
                    }
                    arrayList.add(arrayList2);
                }
            }
            return new AudioVoiceAssistantDto(arrayList, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readInt() != 0 ? AudioVoiceAssistantSourceDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final AudioVoiceAssistantDto[] newArray(int i) {
            return new AudioVoiceAssistantDto[i];
        }
    }

    public AudioVoiceAssistantDto() {
        this(null, null, null, null, 15, null);
    }

    public final String d() {
        return this.flags;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<List<Float>> e() {
        return this.kwsSkip;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioVoiceAssistantDto)) {
            return false;
        }
        AudioVoiceAssistantDto audioVoiceAssistantDto = (AudioVoiceAssistantDto) obj;
        return epx.f(this.kwsSkip, audioVoiceAssistantDto.kwsSkip) && epx.f(this.trackId, audioVoiceAssistantDto.trackId) && epx.f(this.flags, audioVoiceAssistantDto.flags) && epx.f(this.source, audioVoiceAssistantDto.source);
    }

    public final AudioVoiceAssistantSourceDto f() {
        return this.source;
    }

    public final Integer g() {
        return this.trackId;
    }

    public final int hashCode() {
        List<List<Float>> list = this.kwsSkip;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        Integer num = this.trackId;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.flags;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        AudioVoiceAssistantSourceDto audioVoiceAssistantSourceDto = this.source;
        return hashCode3 + (audioVoiceAssistantSourceDto != null ? audioVoiceAssistantSourceDto.hashCode() : 0);
    }

    public final String toString() {
        return "AudioVoiceAssistantDto(kwsSkip=" + this.kwsSkip + ", trackId=" + this.trackId + ", flags=" + this.flags + ", source=" + this.source + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<List<Float>> list = this.kwsSkip;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                Iterator a2 = ao.a(parcel, (List) f.next());
                while (a2.hasNext()) {
                    parcel.writeFloat(((Number) a2.next()).floatValue());
                }
            }
        }
        Integer num = this.trackId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeString(this.flags);
        AudioVoiceAssistantSourceDto audioVoiceAssistantSourceDto = this.source;
        if (audioVoiceAssistantSourceDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            audioVoiceAssistantSourceDto.writeToParcel(parcel, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AudioVoiceAssistantDto(List<? extends List<Float>> list, Integer num, String str, AudioVoiceAssistantSourceDto audioVoiceAssistantSourceDto) {
        this.kwsSkip = list;
        this.trackId = num;
        this.flags = str;
        this.source = audioVoiceAssistantSourceDto;
    }

    public /* synthetic */ AudioVoiceAssistantDto(List list, Integer num, String str, AudioVoiceAssistantSourceDto audioVoiceAssistantSourceDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : audioVoiceAssistantSourceDto);
    }
}
