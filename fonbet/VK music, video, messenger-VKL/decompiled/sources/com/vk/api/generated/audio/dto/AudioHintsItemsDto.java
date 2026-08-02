package com.vk.api.generated.audio.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;

/* compiled from: AudioHintsItemsDto.kt */
/* loaded from: classes14.dex */
public final class AudioHintsItemsDto implements Parcelable {
    public static final Parcelable.Creator<AudioHintsItemsDto> CREATOR = new a();

    @pmi0("count")
    private final int count;

    @pmi0("items")
    private final List<AudioHintDto> items;

    /* compiled from: AudioHintsItemsDto.kt */
    public static final class a implements Parcelable.Creator<AudioHintsItemsDto> {
        @Override // android.os.Parcelable.Creator
        public final AudioHintsItemsDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            int i = 0;
            while (i != readInt2) {
                i = en.a(AudioHintDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new AudioHintsItemsDto(readInt, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final AudioHintsItemsDto[] newArray(int i) {
            return new AudioHintsItemsDto[i];
        }
    }

    public AudioHintsItemsDto(int i, List<AudioHintDto> list) {
        this.count = i;
        this.items = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioHintsItemsDto)) {
            return false;
        }
        AudioHintsItemsDto audioHintsItemsDto = (AudioHintsItemsDto) obj;
        return this.count == audioHintsItemsDto.count && epx.f(this.items, audioHintsItemsDto.items);
    }

    public final int hashCode() {
        return this.items.hashCode() + (Integer.hashCode(this.count) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioHintsItemsDto(count=");
        sb.append(this.count);
        sb.append(", items=");
        return ms9.a(')', sb, this.items);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.count);
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            ((AudioHintDto) a2.next()).writeToParcel(parcel, i);
        }
    }
}
