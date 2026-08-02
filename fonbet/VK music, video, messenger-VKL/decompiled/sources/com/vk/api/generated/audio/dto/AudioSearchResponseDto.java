package com.vk.api.generated.audio.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;

/* compiled from: AudioSearchResponseDto.kt */
/* loaded from: classes14.dex */
public final class AudioSearchResponseDto implements Parcelable {
    public static final Parcelable.Creator<AudioSearchResponseDto> CREATOR = new a();

    @pmi0("count")
    private final int count;

    @pmi0("items")
    private final List<AudioAudioDto> items;

    /* compiled from: AudioSearchResponseDto.kt */
    public static final class a implements Parcelable.Creator<AudioSearchResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final AudioSearchResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            int i = 0;
            while (i != readInt2) {
                i = bo.b(AudioSearchResponseDto.class, parcel, arrayList, i, 1);
            }
            return new AudioSearchResponseDto(readInt, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final AudioSearchResponseDto[] newArray(int i) {
            return new AudioSearchResponseDto[i];
        }
    }

    public AudioSearchResponseDto(int i, List<AudioAudioDto> list) {
        this.count = i;
        this.items = list;
    }

    public final List<AudioAudioDto> d() {
        return this.items;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioSearchResponseDto)) {
            return false;
        }
        AudioSearchResponseDto audioSearchResponseDto = (AudioSearchResponseDto) obj;
        return this.count == audioSearchResponseDto.count && epx.f(this.items, audioSearchResponseDto.items);
    }

    public final int getCount() {
        return this.count;
    }

    public final int hashCode() {
        return this.items.hashCode() + (Integer.hashCode(this.count) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioSearchResponseDto(count=");
        sb.append(this.count);
        sb.append(", items=");
        return ms9.a(')', sb, this.items);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.count);
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
    }
}
