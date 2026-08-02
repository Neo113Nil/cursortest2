package com.vk.clips.upload.vk.ui.impl.fragment.entity.params;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.clips.CoOwnerItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.epx;
import xsna.ms9;

/* compiled from: CoauthorsData.kt */
/* loaded from: classes17.dex */
public final class CoauthorsData implements Parcelable {
    public static final Parcelable.Creator<CoauthorsData> CREATOR = new a();
    public final List<CoOwnerItem> b;

    /* compiled from: CoauthorsData.kt */
    public static final class a implements Parcelable.Creator<CoauthorsData> {
        @Override // android.os.Parcelable.Creator
        public final CoauthorsData createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = bo.b(CoauthorsData.class, parcel, arrayList, i, 1);
            }
            return new CoauthorsData(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final CoauthorsData[] newArray(int i) {
            return new CoauthorsData[i];
        }
    }

    public CoauthorsData(List<CoOwnerItem> list) {
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
        return (obj instanceof CoauthorsData) && epx.f(this.b, ((CoauthorsData) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("CoauthorsData(coauthors="), this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.b);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
    }
}
