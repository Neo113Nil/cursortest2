package com.vk.api.generated.audio.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AudioGetButtonTracksResponseDto.kt */
/* loaded from: classes14.dex */
public final class AudioGetButtonTracksResponseDto implements Parcelable {
    public static final Parcelable.Creator<AudioGetButtonTracksResponseDto> CREATOR = new a();

    @pmi0("audios")
    private final List<AudioAudioDto> audios;

    @pmi0("next_from")
    private final String nextFrom;

    @pmi0("prev_from")
    private final String prevFrom;

    /* compiled from: AudioGetButtonTracksResponseDto.kt */
    public static final class a implements Parcelable.Creator<AudioGetButtonTracksResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final AudioGetButtonTracksResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = bo.b(AudioGetButtonTracksResponseDto.class, parcel, arrayList, i, 1);
            }
            return new AudioGetButtonTracksResponseDto(arrayList, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AudioGetButtonTracksResponseDto[] newArray(int i) {
            return new AudioGetButtonTracksResponseDto[i];
        }
    }

    public AudioGetButtonTracksResponseDto(List<AudioAudioDto> list, String str, String str2) {
        this.audios = list;
        this.nextFrom = str;
        this.prevFrom = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioGetButtonTracksResponseDto)) {
            return false;
        }
        AudioGetButtonTracksResponseDto audioGetButtonTracksResponseDto = (AudioGetButtonTracksResponseDto) obj;
        return epx.f(this.audios, audioGetButtonTracksResponseDto.audios) && epx.f(this.nextFrom, audioGetButtonTracksResponseDto.nextFrom) && epx.f(this.prevFrom, audioGetButtonTracksResponseDto.prevFrom);
    }

    public final int hashCode() {
        int hashCode = this.audios.hashCode() * 31;
        String str = this.nextFrom;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.prevFrom;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioGetButtonTracksResponseDto(audios=");
        sb.append(this.audios);
        sb.append(", nextFrom=");
        sb.append(this.nextFrom);
        sb.append(", prevFrom=");
        return ho8.a(sb, this.prevFrom, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.audios);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
        parcel.writeString(this.nextFrom);
        parcel.writeString(this.prevFrom);
    }

    public /* synthetic */ AudioGetButtonTracksResponseDto(List list, String str, String str2, int i, zcl zclVar) {
        this(list, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2);
    }
}
