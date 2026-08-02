package com.vk.api.generated.audio.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AudioGetAudioIdsBySourceResponseDto.kt */
/* loaded from: classes14.dex */
public final class AudioGetAudioIdsBySourceResponseDto implements Parcelable {
    public static final Parcelable.Creator<AudioGetAudioIdsBySourceResponseDto> CREATOR = new a();

    @pmi0("audios")
    private final List<AudioAudioRawIdTrackedDto> audios;

    @pmi0("last_listened_audio_id")
    private final String lastListenedAudioId;

    @pmi0("radios")
    private final List<AudioFullRadioStationIdDto> radios;

    /* compiled from: AudioGetAudioIdsBySourceResponseDto.kt */
    public static final class a implements Parcelable.Creator<AudioGetAudioIdsBySourceResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final AudioGetAudioIdsBySourceResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            int readInt = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt);
            int i = 0;
            int i2 = 0;
            while (i2 != readInt) {
                i2 = en.a(AudioAudioRawIdTrackedDto.CREATOR, parcel, arrayList2, i2, 1);
            }
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt2 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(readInt2);
                while (i != readInt2) {
                    i = en.a(AudioFullRadioStationIdDto.CREATOR, parcel, arrayList3, i, 1);
                }
                arrayList = arrayList3;
            }
            return new AudioGetAudioIdsBySourceResponseDto(arrayList2, readString, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final AudioGetAudioIdsBySourceResponseDto[] newArray(int i) {
            return new AudioGetAudioIdsBySourceResponseDto[i];
        }
    }

    public AudioGetAudioIdsBySourceResponseDto(List<AudioAudioRawIdTrackedDto> list, String str, List<AudioFullRadioStationIdDto> list2) {
        this.audios = list;
        this.lastListenedAudioId = str;
        this.radios = list2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioGetAudioIdsBySourceResponseDto)) {
            return false;
        }
        AudioGetAudioIdsBySourceResponseDto audioGetAudioIdsBySourceResponseDto = (AudioGetAudioIdsBySourceResponseDto) obj;
        return epx.f(this.audios, audioGetAudioIdsBySourceResponseDto.audios) && epx.f(this.lastListenedAudioId, audioGetAudioIdsBySourceResponseDto.lastListenedAudioId) && epx.f(this.radios, audioGetAudioIdsBySourceResponseDto.radios);
    }

    public final int hashCode() {
        int hashCode = this.audios.hashCode() * 31;
        String str = this.lastListenedAudioId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<AudioFullRadioStationIdDto> list = this.radios;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioGetAudioIdsBySourceResponseDto(audios=");
        sb.append(this.audios);
        sb.append(", lastListenedAudioId=");
        sb.append(this.lastListenedAudioId);
        sb.append(", radios=");
        return ms9.a(')', sb, this.radios);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.audios);
        while (a2.hasNext()) {
            ((AudioAudioRawIdTrackedDto) a2.next()).writeToParcel(parcel, i);
        }
        parcel.writeString(this.lastListenedAudioId);
        List<AudioFullRadioStationIdDto> list = this.radios;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            ((AudioFullRadioStationIdDto) f.next()).writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ AudioGetAudioIdsBySourceResponseDto(List list, String str, List list2, int i, zcl zclVar) {
        this(list, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : list2);
    }
}
