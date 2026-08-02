package com.vk.api.generated.base.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;

/* compiled from: BaseCountryWithCitiesDto.kt */
/* loaded from: classes14.dex */
public final class BaseCountryWithCitiesDto implements Parcelable {
    public static final Parcelable.Creator<BaseCountryWithCitiesDto> CREATOR = new a();

    @pmi0("cities")
    private final List<BaseCityDto> cities;

    @pmi0("id")
    private final int id;

    @pmi0("title")
    private final String title;

    /* compiled from: BaseCountryWithCitiesDto.kt */
    public static final class a implements Parcelable.Creator<BaseCountryWithCitiesDto> {
        @Override // android.os.Parcelable.Creator
        public final BaseCountryWithCitiesDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            int readInt = parcel.readInt();
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt2);
                int i = 0;
                while (i != readInt2) {
                    i = bo.b(BaseCountryWithCitiesDto.class, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new BaseCountryWithCitiesDto(readInt, readString, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final BaseCountryWithCitiesDto[] newArray(int i) {
            return new BaseCountryWithCitiesDto[i];
        }
    }

    public BaseCountryWithCitiesDto(int i, String str, List<BaseCityDto> list) {
        this.id = i;
        this.title = str;
        this.cities = list;
    }

    public final List<BaseCityDto> d() {
        return this.cities;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BaseCountryWithCitiesDto)) {
            return false;
        }
        BaseCountryWithCitiesDto baseCountryWithCitiesDto = (BaseCountryWithCitiesDto) obj;
        return this.id == baseCountryWithCitiesDto.id && epx.f(this.title, baseCountryWithCitiesDto.title) && epx.f(this.cities, baseCountryWithCitiesDto.cities);
    }

    public final int getId() {
        return this.id;
    }

    public final int hashCode() {
        int a2 = urd0.a(Integer.hashCode(this.id) * 31, 31, this.title);
        List<BaseCityDto> list = this.cities;
        return a2 + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseCountryWithCitiesDto(id=");
        sb.append(this.id);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", cities=");
        return ms9.a(')', sb, this.cities);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        parcel.writeString(this.title);
        List<BaseCityDto> list = this.cities;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            parcel.writeParcelable((Parcelable) f.next(), i);
        }
    }

    public /* synthetic */ BaseCountryWithCitiesDto(int i, String str, List list, int i2, zcl zclVar) {
        this(i, str, (i2 & 4) != 0 ? null : list);
    }
}
