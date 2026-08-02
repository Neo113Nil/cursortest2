package com.vk.api.generated.services.dto;

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
import xsna.urd0;

/* compiled from: ServicesCategoryDto.kt */
/* loaded from: classes15.dex */
public final class ServicesCategoryDto implements Parcelable {
    public static final Parcelable.Creator<ServicesCategoryDto> CREATOR = new a();

    @pmi0("id")
    private final int id;

    @pmi0("items")
    private final List<ServicesServiceDto> items;

    @pmi0("name")
    private final String name;

    /* compiled from: ServicesCategoryDto.kt */
    public static final class a implements Parcelable.Creator<ServicesCategoryDto> {
        @Override // android.os.Parcelable.Creator
        public final ServicesCategoryDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            String readString = parcel.readString();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            int i = 0;
            while (i != readInt2) {
                i = en.a(ServicesServiceDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new ServicesCategoryDto(readInt, readString, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final ServicesCategoryDto[] newArray(int i) {
            return new ServicesCategoryDto[i];
        }
    }

    public ServicesCategoryDto(int i, String str, List<ServicesServiceDto> list) {
        this.id = i;
        this.name = str;
        this.items = list;
    }

    public final List<ServicesServiceDto> d() {
        return this.items;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.name;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ServicesCategoryDto)) {
            return false;
        }
        ServicesCategoryDto servicesCategoryDto = (ServicesCategoryDto) obj;
        return this.id == servicesCategoryDto.id && epx.f(this.name, servicesCategoryDto.name) && epx.f(this.items, servicesCategoryDto.items);
    }

    public final int getId() {
        return this.id;
    }

    public final int hashCode() {
        return this.items.hashCode() + urd0.a(Integer.hashCode(this.id) * 31, 31, this.name);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ServicesCategoryDto(id=");
        sb.append(this.id);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", items=");
        return ms9.a(')', sb, this.items);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        parcel.writeString(this.name);
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            ((ServicesServiceDto) a2.next()).writeToParcel(parcel, i);
        }
    }
}
