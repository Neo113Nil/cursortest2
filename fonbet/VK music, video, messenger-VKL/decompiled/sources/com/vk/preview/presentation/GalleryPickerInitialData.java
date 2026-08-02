package com.vk.preview.presentation;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.epx;
import xsna.ms9;
import xsna.pm0;

/* compiled from: GalleryPickerInitialData.kt */
/* loaded from: classes5.dex */
public final class GalleryPickerInitialData implements Parcelable {
    public static final Parcelable.Creator<GalleryPickerInitialData> CREATOR = new a();
    public final List<Integer> b;

    /* compiled from: GalleryPickerInitialData.kt */
    public static final class a implements Parcelable.Creator<GalleryPickerInitialData> {
        @Override // android.os.Parcelable.Creator
        public final GalleryPickerInitialData createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = pm0.b(parcel, arrayList, i, 1);
            }
            return new GalleryPickerInitialData(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final GalleryPickerInitialData[] newArray(int i) {
            return new GalleryPickerInitialData[i];
        }
    }

    public GalleryPickerInitialData(List<Integer> list) {
        this.b = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GalleryPickerInitialData) && epx.f(this.b, ((GalleryPickerInitialData) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("GalleryPickerInitialData(data="), this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.b);
        while (a2.hasNext()) {
            parcel.writeInt(((Number) a2.next()).intValue());
        }
    }
}
