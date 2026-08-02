package com.google.android.gms.internal.measurement;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@ShowFirstParty
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes3.dex */
public final class zzjf extends AbstractSafeParcelable implements Comparable<zzjf> {
    public static final Parcelable.Creator<zzjf> CREATOR = new zzjg();
    public final int a;
    public final zzjo[] b;
    public final String[] c;
    public final TreeMap d = new TreeMap();

    public zzjf(int i, zzjo[] zzjoVarArr, String[] strArr) {
        this.a = i;
        this.b = zzjoVarArr;
        for (zzjo zzjoVar : zzjoVarArr) {
            this.d.put(zzjoVar.a, zzjoVar);
        }
        this.c = strArr;
        if (strArr != null) {
            Arrays.sort(strArr);
        }
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(zzjf zzjfVar) {
        return this.a - zzjfVar.a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzjf)) {
            return false;
        }
        zzjf zzjfVar = (zzjf) obj;
        return this.a == zzjfVar.a && zzkl.a(this.d, zzjfVar.d) && Arrays.equals(this.c, zzjfVar.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Configuration(");
        sb.append(this.a);
        sb.append(", (");
        Iterator it = this.d.values().iterator();
        while (it.hasNext()) {
            sb.append((zzjo) it.next());
            sb.append(", ");
        }
        sb.append("), (");
        String[] strArr = this.c;
        if (strArr != null) {
            for (String str : strArr) {
                sb.append(str);
                sb.append(", ");
            }
        } else {
            sb.append("null");
        }
        sb.append("))");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = SafeParcelWriter.s(parcel, 20293);
        SafeParcelWriter.r(parcel, 2, 4);
        parcel.writeInt(this.a);
        SafeParcelWriter.p(parcel, 3, this.b, i);
        SafeParcelWriter.n(parcel, 4, this.c);
        SafeParcelWriter.t(parcel, s);
    }
}
