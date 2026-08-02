package com.vk.api.generated.audio.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AudioGetIdsBySourceResponseDto.kt */
/* loaded from: classes14.dex */
public final class AudioGetIdsBySourceResponseDto implements Parcelable {
    public static final Parcelable.Creator<AudioGetIdsBySourceResponseDto> CREATOR = new a();

    @pmi0("audios")
    private final List<AudioAudioRawIdTrackedDto> audios;

    @pmi0("last_listened_audio_id")
    private final String lastListenedAudioId;

    @pmi0("radios")
    private final List<AudioFullRadioStationIdDto> radios;

    /* compiled from: AudioGetIdsBySourceResponseDto.kt */
    public static final class a implements Parcelable.Creator<AudioGetIdsBySourceResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final AudioGetIdsBySourceResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String readString = parcel.readString();
            int i = 0;
            ArrayList arrayList2 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i2 = 0;
                while (i2 != readInt) {
                    i2 = en.a(AudioAudioRawIdTrackedDto.CREATOR, parcel, arrayList, i2, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int readInt2 = parcel.readInt();
                arrayList2 = new ArrayList(readInt2);
                while (i != readInt2) {
                    i = en.a(AudioFullRadioStationIdDto.CREATOR, parcel, arrayList2, i, 1);
                }
            }
            return new AudioGetIdsBySourceResponseDto(readString, arrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final AudioGetIdsBySourceResponseDto[] newArray(int i) {
            return new AudioGetIdsBySourceResponseDto[i];
        }
    }

    public AudioGetIdsBySourceResponseDto() {
        this(null, null, null, 7, null);
    }

    public final List<AudioAudioRawIdTrackedDto> d() {
        return this.audios;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.lastListenedAudioId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioGetIdsBySourceResponseDto)) {
            return false;
        }
        AudioGetIdsBySourceResponseDto audioGetIdsBySourceResponseDto = (AudioGetIdsBySourceResponseDto) obj;
        return epx.f(this.lastListenedAudioId, audioGetIdsBySourceResponseDto.lastListenedAudioId) && epx.f(this.audios, audioGetIdsBySourceResponseDto.audios) && epx.f(this.radios, audioGetIdsBySourceResponseDto.radios);
    }

    public final List<AudioFullRadioStationIdDto> f() {
        return this.radios;
    }

    public final int hashCode() {
        String str = this.lastListenedAudioId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<AudioAudioRawIdTrackedDto> list = this.audios;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<AudioFullRadioStationIdDto> list2 = this.radios;
        return hashCode2 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioGetIdsBySourceResponseDto(lastListenedAudioId=");
        sb.append(this.lastListenedAudioId);
        sb.append(", audios=");
        sb.append(this.audios);
        sb.append(", radios=");
        return ms9.a(')', sb, this.radios);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.lastListenedAudioId);
        List<AudioAudioRawIdTrackedDto> list = this.audios;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((AudioAudioRawIdTrackedDto) f.next()).writeToParcel(parcel, i);
            }
        }
        List<AudioFullRadioStationIdDto> list2 = this.radios;
        if (list2 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f2 = dn.f(parcel, list2, 1);
        while (f2.hasNext()) {
            ((AudioFullRadioStationIdDto) f2.next()).writeToParcel(parcel, i);
        }
    }

    public AudioGetIdsBySourceResponseDto(String str, List<AudioAudioRawIdTrackedDto> list, List<AudioFullRadioStationIdDto> list2) {
        this.lastListenedAudioId = str;
        this.audios = list;
        this.radios = list2;
    }

    public /* synthetic */ AudioGetIdsBySourceResponseDto(String str, List list, List list2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : list2);
    }
}
