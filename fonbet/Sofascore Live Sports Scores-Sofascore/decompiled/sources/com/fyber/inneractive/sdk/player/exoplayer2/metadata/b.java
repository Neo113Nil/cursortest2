package com.fyber.inneractive.sdk.player.exoplayer2.metadata;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.o;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();
    public final o[] a;

    public b(Parcel parcel) {
        this.a = new o[parcel.readInt()];
        int i = 0;
        while (true) {
            o[] oVarArr = this.a;
            if (i >= oVarArr.length) {
                return;
            }
            oVarArr[i] = (o) parcel.readParcelable(o.class.getClassLoader());
            i++;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.a, ((b) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a.length);
        for (o oVar : this.a) {
            parcel.writeParcelable(oVar, 0);
        }
    }

    public b(ArrayList arrayList) {
        o[] oVarArr = new o[arrayList.size()];
        this.a = oVarArr;
        arrayList.toArray(oVarArr);
    }
}
