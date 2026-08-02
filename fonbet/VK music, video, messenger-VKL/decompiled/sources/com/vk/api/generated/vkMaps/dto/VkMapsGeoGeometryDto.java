package com.vk.api.generated.vkMaps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.Y3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.dn;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: VkMapsGeoGeometryDto.kt */
/* loaded from: classes15.dex */
public final class VkMapsGeoGeometryDto implements Parcelable {
    public static final Parcelable.Creator<VkMapsGeoGeometryDto> CREATOR = new a();

    @pmi0(Y3.f)
    private final List<List<List<Float>>> coordinates;

    @pmi0("type")
    private final String type;

    /* compiled from: VkMapsGeoGeometryDto.kt */
    public static final class a implements Parcelable.Creator<VkMapsGeoGeometryDto> {
        @Override // android.os.Parcelable.Creator
        public final VkMapsGeoGeometryDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                for (int i = 0; i != readInt; i++) {
                    int readInt2 = parcel.readInt();
                    ArrayList arrayList3 = new ArrayList(readInt2);
                    for (int i2 = 0; i2 != readInt2; i2++) {
                        int readInt3 = parcel.readInt();
                        ArrayList arrayList4 = new ArrayList(readInt3);
                        for (int i3 = 0; i3 != readInt3; i3++) {
                            arrayList4.add(Float.valueOf(parcel.readFloat()));
                        }
                        arrayList3.add(arrayList4);
                    }
                    arrayList2.add(arrayList3);
                }
                arrayList = arrayList2;
            }
            return new VkMapsGeoGeometryDto(arrayList, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VkMapsGeoGeometryDto[] newArray(int i) {
            return new VkMapsGeoGeometryDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VkMapsGeoGeometryDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VkMapsGeoGeometryDto)) {
            return false;
        }
        VkMapsGeoGeometryDto vkMapsGeoGeometryDto = (VkMapsGeoGeometryDto) obj;
        return epx.f(this.coordinates, vkMapsGeoGeometryDto.coordinates) && epx.f(this.type, vkMapsGeoGeometryDto.type);
    }

    public final int hashCode() {
        List<List<List<Float>>> list = this.coordinates;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.type;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VkMapsGeoGeometryDto(coordinates=");
        sb.append(this.coordinates);
        sb.append(", type=");
        return ho8.a(sb, this.type, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<List<List<Float>>> list = this.coordinates;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                Iterator a2 = ao.a(parcel, (List) f.next());
                while (a2.hasNext()) {
                    Iterator a3 = ao.a(parcel, (List) a2.next());
                    while (a3.hasNext()) {
                        parcel.writeFloat(((Number) a3.next()).floatValue());
                    }
                }
            }
        }
        parcel.writeString(this.type);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VkMapsGeoGeometryDto(List<? extends List<? extends List<Float>>> list, String str) {
        this.coordinates = list;
        this.type = str;
    }

    public /* synthetic */ VkMapsGeoGeometryDto(List list, String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : str);
    }
}
