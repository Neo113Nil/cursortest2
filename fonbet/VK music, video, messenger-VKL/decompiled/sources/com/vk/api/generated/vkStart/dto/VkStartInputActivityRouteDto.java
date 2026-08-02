package com.vk.api.generated.vkStart.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: VkStartInputActivityRouteDto.kt */
/* loaded from: classes15.dex */
public final class VkStartInputActivityRouteDto implements Parcelable {
    public static final Parcelable.Creator<VkStartInputActivityRouteDto> CREATOR = new a();

    @pmi0("points")
    private final List<VkStartInputActivityRoutePointDto> points;

    /* compiled from: VkStartInputActivityRouteDto.kt */
    public static final class a implements Parcelable.Creator<VkStartInputActivityRouteDto> {
        @Override // android.os.Parcelable.Creator
        public final VkStartInputActivityRouteDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(VkStartInputActivityRoutePointDto.CREATOR, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new VkStartInputActivityRouteDto(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final VkStartInputActivityRouteDto[] newArray(int i) {
            return new VkStartInputActivityRouteDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VkStartInputActivityRouteDto() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof VkStartInputActivityRouteDto) && epx.f(this.points, ((VkStartInputActivityRouteDto) obj).points);
    }

    public final int hashCode() {
        List<VkStartInputActivityRoutePointDto> list = this.points;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("VkStartInputActivityRouteDto(points="), this.points);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<VkStartInputActivityRoutePointDto> list = this.points;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            ((VkStartInputActivityRoutePointDto) f.next()).writeToParcel(parcel, i);
        }
    }

    public VkStartInputActivityRouteDto(List<VkStartInputActivityRoutePointDto> list) {
        this.points = list;
    }

    public /* synthetic */ VkStartInputActivityRouteDto(List list, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : list);
    }
}
