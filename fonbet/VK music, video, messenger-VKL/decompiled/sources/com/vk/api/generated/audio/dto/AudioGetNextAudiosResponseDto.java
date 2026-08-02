package com.vk.api.generated.audio.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AudioGetNextAudiosResponseDto.kt */
/* loaded from: classes14.dex */
public final class AudioGetNextAudiosResponseDto implements Parcelable {
    public static final Parcelable.Creator<AudioGetNextAudiosResponseDto> CREATOR = new a();

    @pmi0("audios")
    private final List<AudioAudioRawIdTrackedDto> audios;

    @pmi0("next_from")
    private final AudioGetNextAudiosNextFromDto nextFrom;

    @pmi0("parent_entity")
    private final AudioGetNextAudiosParentEntityDto parentEntity;

    /* compiled from: AudioGetNextAudiosResponseDto.kt */
    public static final class a implements Parcelable.Creator<AudioGetNextAudiosResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final AudioGetNextAudiosResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(AudioAudioRawIdTrackedDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new AudioGetNextAudiosResponseDto(arrayList, parcel.readInt() == 0 ? null : AudioGetNextAudiosNextFromDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? AudioGetNextAudiosParentEntityDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final AudioGetNextAudiosResponseDto[] newArray(int i) {
            return new AudioGetNextAudiosResponseDto[i];
        }
    }

    public AudioGetNextAudiosResponseDto(List<AudioAudioRawIdTrackedDto> list, AudioGetNextAudiosNextFromDto audioGetNextAudiosNextFromDto, AudioGetNextAudiosParentEntityDto audioGetNextAudiosParentEntityDto) {
        this.audios = list;
        this.nextFrom = audioGetNextAudiosNextFromDto;
        this.parentEntity = audioGetNextAudiosParentEntityDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioGetNextAudiosResponseDto)) {
            return false;
        }
        AudioGetNextAudiosResponseDto audioGetNextAudiosResponseDto = (AudioGetNextAudiosResponseDto) obj;
        return epx.f(this.audios, audioGetNextAudiosResponseDto.audios) && epx.f(this.nextFrom, audioGetNextAudiosResponseDto.nextFrom) && epx.f(this.parentEntity, audioGetNextAudiosResponseDto.parentEntity);
    }

    public final int hashCode() {
        int hashCode = this.audios.hashCode() * 31;
        AudioGetNextAudiosNextFromDto audioGetNextAudiosNextFromDto = this.nextFrom;
        int hashCode2 = (hashCode + (audioGetNextAudiosNextFromDto == null ? 0 : audioGetNextAudiosNextFromDto.hashCode())) * 31;
        AudioGetNextAudiosParentEntityDto audioGetNextAudiosParentEntityDto = this.parentEntity;
        return hashCode2 + (audioGetNextAudiosParentEntityDto != null ? audioGetNextAudiosParentEntityDto.hashCode() : 0);
    }

    public final String toString() {
        return "AudioGetNextAudiosResponseDto(audios=" + this.audios + ", nextFrom=" + this.nextFrom + ", parentEntity=" + this.parentEntity + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.audios);
        while (a2.hasNext()) {
            ((AudioAudioRawIdTrackedDto) a2.next()).writeToParcel(parcel, i);
        }
        AudioGetNextAudiosNextFromDto audioGetNextAudiosNextFromDto = this.nextFrom;
        if (audioGetNextAudiosNextFromDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            audioGetNextAudiosNextFromDto.writeToParcel(parcel, i);
        }
        AudioGetNextAudiosParentEntityDto audioGetNextAudiosParentEntityDto = this.parentEntity;
        if (audioGetNextAudiosParentEntityDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            audioGetNextAudiosParentEntityDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ AudioGetNextAudiosResponseDto(List list, AudioGetNextAudiosNextFromDto audioGetNextAudiosNextFromDto, AudioGetNextAudiosParentEntityDto audioGetNextAudiosParentEntityDto, int i, zcl zclVar) {
        this(list, (i & 2) != 0 ? null : audioGetNextAudiosNextFromDto, (i & 4) != 0 ? null : audioGetNextAudiosParentEntityDto);
    }
}
