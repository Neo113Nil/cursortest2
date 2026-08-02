package com.vk.api.generated.gifts.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: GiftsAnimationDto.kt */
/* loaded from: classes14.dex */
public final class GiftsAnimationDto implements Parcelable {
    public static final Parcelable.Creator<GiftsAnimationDto> CREATOR = new a();

    @pmi0("repeat_count")
    private final Integer repeatCount;

    @pmi0("sources")
    private final List<GiftsAnimationSourceDto> sources;

    /* compiled from: GiftsAnimationDto.kt */
    public static final class a implements Parcelable.Creator<GiftsAnimationDto> {
        @Override // android.os.Parcelable.Creator
        public final GiftsAnimationDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(GiftsAnimationSourceDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new GiftsAnimationDto(arrayList, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final GiftsAnimationDto[] newArray(int i) {
            return new GiftsAnimationDto[i];
        }
    }

    public GiftsAnimationDto(List<GiftsAnimationSourceDto> list, Integer num) {
        this.sources = list;
        this.repeatCount = num;
    }

    public final Integer d() {
        return this.repeatCount;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<GiftsAnimationSourceDto> e() {
        return this.sources;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GiftsAnimationDto)) {
            return false;
        }
        GiftsAnimationDto giftsAnimationDto = (GiftsAnimationDto) obj;
        return epx.f(this.sources, giftsAnimationDto.sources) && epx.f(this.repeatCount, giftsAnimationDto.repeatCount);
    }

    public final int hashCode() {
        int hashCode = this.sources.hashCode() * 31;
        Integer num = this.repeatCount;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GiftsAnimationDto(sources=");
        sb.append(this.sources);
        sb.append(", repeatCount=");
        return uqi.b(sb, this.repeatCount, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.sources);
        while (a2.hasNext()) {
            ((GiftsAnimationSourceDto) a2.next()).writeToParcel(parcel, i);
        }
        Integer num = this.repeatCount;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }

    public /* synthetic */ GiftsAnimationDto(List list, Integer num, int i, zcl zclVar) {
        this(list, (i & 2) != 0 ? null : num);
    }
}
