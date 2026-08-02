package com.vk.api.generated.shortVideo.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.donut.dto.DonutAttachesDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: ShortVideoAvailableAttachesDto.kt */
/* loaded from: classes15.dex */
public final class ShortVideoAvailableAttachesDto implements Parcelable {
    public static final Parcelable.Creator<ShortVideoAvailableAttachesDto> CREATOR = new a();

    @pmi0("donut_levels")
    private final List<DonutAttachesDto> donutLevels;

    /* compiled from: ShortVideoAvailableAttachesDto.kt */
    public static final class a implements Parcelable.Creator<ShortVideoAvailableAttachesDto> {
        @Override // android.os.Parcelable.Creator
        public final ShortVideoAvailableAttachesDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(DonutAttachesDto.CREATOR, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new ShortVideoAvailableAttachesDto(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final ShortVideoAvailableAttachesDto[] newArray(int i) {
            return new ShortVideoAvailableAttachesDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ShortVideoAvailableAttachesDto() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final List<DonutAttachesDto> d() {
        return this.donutLevels;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ShortVideoAvailableAttachesDto) && epx.f(this.donutLevels, ((ShortVideoAvailableAttachesDto) obj).donutLevels);
    }

    public final int hashCode() {
        List<DonutAttachesDto> list = this.donutLevels;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("ShortVideoAvailableAttachesDto(donutLevels="), this.donutLevels);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<DonutAttachesDto> list = this.donutLevels;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            ((DonutAttachesDto) f.next()).writeToParcel(parcel, i);
        }
    }

    public ShortVideoAvailableAttachesDto(List<DonutAttachesDto> list) {
        this.donutLevels = list;
    }

    public /* synthetic */ ShortVideoAvailableAttachesDto(List list, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : list);
    }
}
