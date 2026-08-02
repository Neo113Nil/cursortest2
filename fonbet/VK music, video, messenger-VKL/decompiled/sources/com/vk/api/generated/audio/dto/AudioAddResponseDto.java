package com.vk.api.generated.audio.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.shy;
import xsna.zcl;

/* compiled from: AudioAddResponseDto.kt */
/* loaded from: classes14.dex */
public final class AudioAddResponseDto implements Parcelable {
    public static final Parcelable.Creator<AudioAddResponseDto> CREATOR = new a();

    @pmi0(SignalingProtocol.KEY_ERRORS)
    private final List<AudioAddErrorDto> errors;

    @pmi0("errors_count")
    private final int errorsCount;

    @pmi0("items")
    private final List<AudioAddResultDto> items;

    @pmi0("items_count")
    private final int itemsCount;

    /* compiled from: AudioAddResponseDto.kt */
    public static final class a implements Parcelable.Creator<AudioAddResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final AudioAddResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            int i = 0;
            ArrayList arrayList2 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt3 = parcel.readInt();
                arrayList = new ArrayList(readInt3);
                int i2 = 0;
                while (i2 != readInt3) {
                    i2 = en.a(AudioAddResultDto.CREATOR, parcel, arrayList, i2, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int readInt4 = parcel.readInt();
                arrayList2 = new ArrayList(readInt4);
                while (i != readInt4) {
                    i = en.a(AudioAddErrorDto.CREATOR, parcel, arrayList2, i, 1);
                }
            }
            return new AudioAddResponseDto(readInt, readInt2, arrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final AudioAddResponseDto[] newArray(int i) {
            return new AudioAddResponseDto[i];
        }
    }

    public AudioAddResponseDto(int i, int i2, List<AudioAddResultDto> list, List<AudioAddErrorDto> list2) {
        this.itemsCount = i;
        this.errorsCount = i2;
        this.items = list;
        this.errors = list2;
    }

    public final List<AudioAddErrorDto> d() {
        return this.errors;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<AudioAddResultDto> e() {
        return this.items;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioAddResponseDto)) {
            return false;
        }
        AudioAddResponseDto audioAddResponseDto = (AudioAddResponseDto) obj;
        return this.itemsCount == audioAddResponseDto.itemsCount && this.errorsCount == audioAddResponseDto.errorsCount && epx.f(this.items, audioAddResponseDto.items) && epx.f(this.errors, audioAddResponseDto.errors);
    }

    public final int hashCode() {
        int a2 = shy.a(this.errorsCount, Integer.hashCode(this.itemsCount) * 31, 31);
        List<AudioAddResultDto> list = this.items;
        int hashCode = (a2 + (list == null ? 0 : list.hashCode())) * 31;
        List<AudioAddErrorDto> list2 = this.errors;
        return hashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioAddResponseDto(itemsCount=");
        sb.append(this.itemsCount);
        sb.append(", errorsCount=");
        sb.append(this.errorsCount);
        sb.append(", items=");
        sb.append(this.items);
        sb.append(", errors=");
        return ms9.a(')', sb, this.errors);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.itemsCount);
        parcel.writeInt(this.errorsCount);
        List<AudioAddResultDto> list = this.items;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((AudioAddResultDto) f.next()).writeToParcel(parcel, i);
            }
        }
        List<AudioAddErrorDto> list2 = this.errors;
        if (list2 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f2 = dn.f(parcel, list2, 1);
        while (f2.hasNext()) {
            ((AudioAddErrorDto) f2.next()).writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ AudioAddResponseDto(int i, int i2, List list, List list2, int i3, zcl zclVar) {
        this(i, i2, (i3 & 4) != 0 ? null : list, (i3 & 8) != 0 ? null : list2);
    }
}
