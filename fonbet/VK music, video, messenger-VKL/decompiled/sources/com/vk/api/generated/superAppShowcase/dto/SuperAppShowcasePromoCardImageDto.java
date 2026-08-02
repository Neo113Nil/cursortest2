package com.vk.api.generated.superAppShowcase.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.superApp.dto.SuperAppUniversalWidgetImageItemDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: SuperAppShowcasePromoCardImageDto.kt */
/* loaded from: classes15.dex */
public final class SuperAppShowcasePromoCardImageDto implements Parcelable {
    public static final Parcelable.Creator<SuperAppShowcasePromoCardImageDto> CREATOR = new a();

    @pmi0("dark")
    private final List<SuperAppUniversalWidgetImageItemDto> dark;

    @pmi0("light")
    private final List<SuperAppUniversalWidgetImageItemDto> light;

    /* compiled from: SuperAppShowcasePromoCardImageDto.kt */
    public static final class a implements Parcelable.Creator<SuperAppShowcasePromoCardImageDto> {
        @Override // android.os.Parcelable.Creator
        public final SuperAppShowcasePromoCardImageDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            int readInt = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt);
            int i = 0;
            int i2 = 0;
            while (i2 != readInt) {
                i2 = en.a(SuperAppUniversalWidgetImageItemDto.CREATOR, parcel, arrayList2, i2, 1);
            }
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt2 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(readInt2);
                while (i != readInt2) {
                    i = en.a(SuperAppUniversalWidgetImageItemDto.CREATOR, parcel, arrayList3, i, 1);
                }
                arrayList = arrayList3;
            }
            return new SuperAppShowcasePromoCardImageDto(arrayList2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final SuperAppShowcasePromoCardImageDto[] newArray(int i) {
            return new SuperAppShowcasePromoCardImageDto[i];
        }
    }

    public SuperAppShowcasePromoCardImageDto(List<SuperAppUniversalWidgetImageItemDto> list, List<SuperAppUniversalWidgetImageItemDto> list2) {
        this.light = list;
        this.dark = list2;
    }

    public final List<SuperAppUniversalWidgetImageItemDto> d() {
        return this.light;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuperAppShowcasePromoCardImageDto)) {
            return false;
        }
        SuperAppShowcasePromoCardImageDto superAppShowcasePromoCardImageDto = (SuperAppShowcasePromoCardImageDto) obj;
        return epx.f(this.light, superAppShowcasePromoCardImageDto.light) && epx.f(this.dark, superAppShowcasePromoCardImageDto.dark);
    }

    public final int hashCode() {
        int hashCode = this.light.hashCode() * 31;
        List<SuperAppUniversalWidgetImageItemDto> list = this.dark;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SuperAppShowcasePromoCardImageDto(light=");
        sb.append(this.light);
        sb.append(", dark=");
        return ms9.a(')', sb, this.dark);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.light);
        while (a2.hasNext()) {
            ((SuperAppUniversalWidgetImageItemDto) a2.next()).writeToParcel(parcel, i);
        }
        List<SuperAppUniversalWidgetImageItemDto> list = this.dark;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            ((SuperAppUniversalWidgetImageItemDto) f.next()).writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ SuperAppShowcasePromoCardImageDto(List list, List list2, int i, zcl zclVar) {
        this(list, (i & 2) != 0 ? null : list2);
    }
}
