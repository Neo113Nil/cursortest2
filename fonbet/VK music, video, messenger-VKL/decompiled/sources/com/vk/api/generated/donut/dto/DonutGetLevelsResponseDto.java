package com.vk.api.generated.donut.dto;

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
import xsna.qoy;
import xsna.sn;
import xsna.tn;
import xsna.zcl;

/* compiled from: DonutGetLevelsResponseDto.kt */
/* loaded from: classes14.dex */
public final class DonutGetLevelsResponseDto implements Parcelable {
    public static final Parcelable.Creator<DonutGetLevelsResponseDto> CREATOR = new a();

    @pmi0("can_add")
    private final boolean canAdd;

    @pmi0("can_all_dons")
    private final Boolean canAllDons;

    @pmi0("levels")
    private final List<DonutLevelDto> levels;

    @pmi0("max_count")
    private final Integer maxCount;

    /* compiled from: DonutGetLevelsResponseDto.kt */
    public static final class a implements Parcelable.Creator<DonutGetLevelsResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final DonutGetLevelsResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(DonutLevelDto.CREATOR, parcel, arrayList, i, 1);
            }
            boolean z = parcel.readInt() != 0;
            Boolean bool = null;
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new DonutGetLevelsResponseDto(arrayList, z, valueOf, bool);
        }

        @Override // android.os.Parcelable.Creator
        public final DonutGetLevelsResponseDto[] newArray(int i) {
            return new DonutGetLevelsResponseDto[i];
        }
    }

    public DonutGetLevelsResponseDto(List<DonutLevelDto> list, boolean z, Integer num, Boolean bool) {
        this.levels = list;
        this.canAdd = z;
        this.maxCount = num;
        this.canAllDons = bool;
    }

    public final Boolean d() {
        return this.canAllDons;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<DonutLevelDto> e() {
        return this.levels;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DonutGetLevelsResponseDto)) {
            return false;
        }
        DonutGetLevelsResponseDto donutGetLevelsResponseDto = (DonutGetLevelsResponseDto) obj;
        return epx.f(this.levels, donutGetLevelsResponseDto.levels) && this.canAdd == donutGetLevelsResponseDto.canAdd && epx.f(this.maxCount, donutGetLevelsResponseDto.maxCount) && epx.f(this.canAllDons, donutGetLevelsResponseDto.canAllDons);
    }

    public final int hashCode() {
        int b = qoy.b(this.levels.hashCode() * 31, 31, this.canAdd);
        Integer num = this.maxCount;
        int hashCode = (b + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.canAllDons;
        return hashCode + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DonutGetLevelsResponseDto(levels=");
        sb.append(this.levels);
        sb.append(", canAdd=");
        sb.append(this.canAdd);
        sb.append(", maxCount=");
        sb.append(this.maxCount);
        sb.append(", canAllDons=");
        return tn.a(sb, this.canAllDons, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.levels);
        while (a2.hasNext()) {
            ((DonutLevelDto) a2.next()).writeToParcel(parcel, i);
        }
        parcel.writeInt(this.canAdd ? 1 : 0);
        Integer num = this.maxCount;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Boolean bool = this.canAllDons;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
    }

    public /* synthetic */ DonutGetLevelsResponseDto(List list, boolean z, Integer num, Boolean bool, int i, zcl zclVar) {
        this(list, z, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : bool);
    }
}
