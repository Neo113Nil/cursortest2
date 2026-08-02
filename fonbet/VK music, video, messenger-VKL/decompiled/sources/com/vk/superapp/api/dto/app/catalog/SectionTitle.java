package com.vk.superapp.api.dto.app.catalog;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dn;
import xsna.epx;
import xsna.ms9;
import xsna.pm0;

/* compiled from: SectionTitle.kt */
/* loaded from: classes6.dex */
public final class SectionTitle implements Parcelable {
    public static final Parcelable.Creator<SectionTitle> CREATOR = new a();
    public final String b;
    public final List<Integer> c;

    /* compiled from: SectionTitle.kt */
    public static final class a implements Parcelable.Creator<SectionTitle> {
        @Override // android.os.Parcelable.Creator
        public final SectionTitle createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = pm0.b(parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new SectionTitle(readString, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final SectionTitle[] newArray(int i) {
            return new SectionTitle[i];
        }
    }

    public SectionTitle(String str, List<Integer> list) {
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
        if (!(obj instanceof SectionTitle)) {
            return false;
        }
        SectionTitle sectionTitle = (SectionTitle) obj;
        return epx.f(this.b, sectionTitle.b) && epx.f(this.c, sectionTitle.c);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        List<Integer> list = this.c;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SectionTitle(title=");
        sb.append(this.b);
        sb.append(", colors=");
        return ms9.a(')', sb, this.c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        List<Integer> list = this.c;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            parcel.writeInt(((Number) f.next()).intValue());
        }
    }
}
