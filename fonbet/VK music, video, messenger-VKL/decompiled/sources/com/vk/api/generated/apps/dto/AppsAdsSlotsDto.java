package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.C4313f8;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AppsAdsSlotsDto.kt */
/* loaded from: classes14.dex */
public final class AppsAdsSlotsDto implements Parcelable {
    public static final Parcelable.Creator<AppsAdsSlotsDto> CREATOR = new a();

    @pmi0(C4313f8.p)
    private final List<AppsAdsSlotsConfigItemDto> configs;

    /* compiled from: AppsAdsSlotsDto.kt */
    public static final class a implements Parcelable.Creator<AppsAdsSlotsDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsAdsSlotsDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(AppsAdsSlotsConfigItemDto.CREATOR, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new AppsAdsSlotsDto(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final AppsAdsSlotsDto[] newArray(int i) {
            return new AppsAdsSlotsDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AppsAdsSlotsDto() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final List<AppsAdsSlotsConfigItemDto> d() {
        return this.configs;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AppsAdsSlotsDto) && epx.f(this.configs, ((AppsAdsSlotsDto) obj).configs);
    }

    public final int hashCode() {
        List<AppsAdsSlotsConfigItemDto> list = this.configs;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("AppsAdsSlotsDto(configs="), this.configs);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<AppsAdsSlotsConfigItemDto> list = this.configs;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            ((AppsAdsSlotsConfigItemDto) f.next()).writeToParcel(parcel, i);
        }
    }

    public AppsAdsSlotsDto(List<AppsAdsSlotsConfigItemDto> list) {
        this.configs = list;
    }

    public /* synthetic */ AppsAdsSlotsDto(List list, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : list);
    }
}
