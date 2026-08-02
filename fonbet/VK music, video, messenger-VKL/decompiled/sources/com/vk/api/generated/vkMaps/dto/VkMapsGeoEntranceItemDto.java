package com.vk.api.generated.vkMaps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dn;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: VkMapsGeoEntranceItemDto.kt */
/* loaded from: classes15.dex */
public final class VkMapsGeoEntranceItemDto implements Parcelable {
    public static final Parcelable.Creator<VkMapsGeoEntranceItemDto> CREATOR = new a();

    @pmi0("name")
    private final String name;

    @pmi0("pin")
    private final List<Float> pin;

    /* compiled from: VkMapsGeoEntranceItemDto.kt */
    public static final class a implements Parcelable.Creator<VkMapsGeoEntranceItemDto> {
        @Override // android.os.Parcelable.Creator
        public final VkMapsGeoEntranceItemDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                for (int i = 0; i != readInt; i++) {
                    arrayList2.add(Float.valueOf(parcel.readFloat()));
                }
                arrayList = arrayList2;
            }
            return new VkMapsGeoEntranceItemDto(readString, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final VkMapsGeoEntranceItemDto[] newArray(int i) {
            return new VkMapsGeoEntranceItemDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VkMapsGeoEntranceItemDto() {
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
        if (!(obj instanceof VkMapsGeoEntranceItemDto)) {
            return false;
        }
        VkMapsGeoEntranceItemDto vkMapsGeoEntranceItemDto = (VkMapsGeoEntranceItemDto) obj;
        return epx.f(this.name, vkMapsGeoEntranceItemDto.name) && epx.f(this.pin, vkMapsGeoEntranceItemDto.pin);
    }

    public final int hashCode() {
        String str = this.name;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<Float> list = this.pin;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VkMapsGeoEntranceItemDto(name=");
        sb.append(this.name);
        sb.append(", pin=");
        return ms9.a(')', sb, this.pin);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.name);
        List<Float> list = this.pin;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            parcel.writeFloat(((Number) f.next()).floatValue());
        }
    }

    public VkMapsGeoEntranceItemDto(String str, List<Float> list) {
        this.name = str;
        this.pin = list;
    }

    public /* synthetic */ VkMapsGeoEntranceItemDto(String str, List list, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : list);
    }
}
