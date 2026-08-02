package com.vk.clips.viewer.impl.grid.toolbar.profile.swap.utils.shadow;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.ms9;

/* compiled from: CustomShadowParams.kt */
/* loaded from: classes17.dex */
public final class CustomShadowParams implements Parcelable {
    public static final Parcelable.Creator<CustomShadowParams> CREATOR = new a();
    public final String b;
    public final List<Shadow> c;

    /* compiled from: CustomShadowParams.kt */
    public static final class a implements Parcelable.Creator<CustomShadowParams> {
        @Override // android.os.Parcelable.Creator
        public final CustomShadowParams createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(Shadow.CREATOR, parcel, arrayList, i, 1);
            }
            return new CustomShadowParams(readString, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final CustomShadowParams[] newArray(int i) {
            return new CustomShadowParams[i];
        }
    }

    public CustomShadowParams(String str, List<Shadow> list) {
        this.b = str;
        this.c = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomShadowParams)) {
            return false;
        }
        CustomShadowParams customShadowParams = (CustomShadowParams) obj;
        return epx.f(this.b, customShadowParams.b) && epx.f(this.c, customShadowParams.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CustomShadowParams(name=");
        sb.append(this.b);
        sb.append(", layers=");
        return ms9.a(')', sb, this.c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        Iterator a2 = ao.a(parcel, this.c);
        while (a2.hasNext()) {
            ((Shadow) a2.next()).writeToParcel(parcel, i);
        }
    }
}
