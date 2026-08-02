package com.vk.newsfeed.posting.geo_picker.presentation.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.shy;
import xsna.vu5;

/* compiled from: PlacesPage.kt */
/* loaded from: classes4.dex */
public final class PlacesPage implements Parcelable {
    public static final Parcelable.Creator<PlacesPage> CREATOR = new a();
    public final String b;
    public final List<PickerPlaceDto> c;
    public final int d;
    public final int e;

    /* compiled from: PlacesPage.kt */
    public static final class a implements Parcelable.Creator<PlacesPage> {
        @Override // android.os.Parcelable.Creator
        public final PlacesPage createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(PickerPlaceDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new PlacesPage(readString, arrayList, parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final PlacesPage[] newArray(int i) {
            return new PlacesPage[i];
        }
    }

    public PlacesPage(String str, List<PickerPlaceDto> list, int i, int i2) {
        this.b = str;
        this.c = list;
        this.d = i;
        this.e = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlacesPage)) {
            return false;
        }
        PlacesPage placesPage = (PlacesPage) obj;
        return epx.f(this.b, placesPage.b) && epx.f(this.c, placesPage.c) && this.d == placesPage.d && this.e == placesPage.e;
    }

    public final int hashCode() {
        String str = this.b;
        return Integer.hashCode(this.e) + shy.a(this.d, fw3.a((str == null ? 0 : str.hashCode()) * 31, 31, this.c), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlacesPage(query=");
        sb.append(this.b);
        sb.append(", items=");
        sb.append(this.c);
        sb.append(", totalCount=");
        sb.append(this.d);
        sb.append(", offset=");
        return vu5.b(sb, this.e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        Iterator a2 = ao.a(parcel, this.c);
        while (a2.hasNext()) {
            ((PickerPlaceDto) a2.next()).writeToParcel(parcel, i);
        }
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
    }
}
