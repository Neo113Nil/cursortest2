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

/* compiled from: AudioGetHeadphoneMessagesResponseDto.kt */
/* loaded from: classes14.dex */
public final class AudioGetHeadphoneMessagesResponseDto implements Parcelable {
    public static final Parcelable.Creator<AudioGetHeadphoneMessagesResponseDto> CREATOR = new a();

    @pmi0("count")
    private final int count;

    @pmi0("items")
    private final List<AudioHeadphoneMessageDto> items;

    /* compiled from: AudioGetHeadphoneMessagesResponseDto.kt */
    public static final class a implements Parcelable.Creator<AudioGetHeadphoneMessagesResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final AudioGetHeadphoneMessagesResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            int i = 0;
            while (i != readInt2) {
                i = en.a(AudioHeadphoneMessageDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new AudioGetHeadphoneMessagesResponseDto(readInt, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final AudioGetHeadphoneMessagesResponseDto[] newArray(int i) {
            return new AudioGetHeadphoneMessagesResponseDto[i];
        }
    }

    public AudioGetHeadphoneMessagesResponseDto(int i, List<AudioHeadphoneMessageDto> list) {
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
        if (!(obj instanceof AudioGetHeadphoneMessagesResponseDto)) {
            return false;
        }
        AudioGetHeadphoneMessagesResponseDto audioGetHeadphoneMessagesResponseDto = (AudioGetHeadphoneMessagesResponseDto) obj;
        return this.count == audioGetHeadphoneMessagesResponseDto.count && epx.f(this.items, audioGetHeadphoneMessagesResponseDto.items);
    }

    public final int hashCode() {
        return this.items.hashCode() + (Integer.hashCode(this.count) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioGetHeadphoneMessagesResponseDto(count=");
        sb.append(this.count);
        sb.append(", items=");
        return ms9.a(')', sb, this.items);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.count);
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            ((AudioHeadphoneMessageDto) a2.next()).writeToParcel(parcel, i);
        }
    }
}
