package com.google.android.gms.internal.measurement;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import defpackage.fn0;
import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@ShowFirstParty
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes3.dex */
public final class zzjh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzjh> CREATOR = new zzji();
    public final String a;
    public final byte[] b;
    public final String c;
    public final zzjf[] d;
    public final TreeMap e = new TreeMap();
    public final boolean f;
    public final long g;

    public zzjh(String str, String str2, zzjf[] zzjfVarArr, boolean z, byte[] bArr, long j) {
        this.a = str;
        this.c = str2;
        this.d = zzjfVarArr;
        this.f = z;
        this.b = bArr;
        this.g = j;
        for (zzjf zzjfVar : zzjfVarArr) {
            this.e.put(Integer.valueOf(zzjfVar.a), zzjfVar);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzjh)) {
            return false;
        }
        zzjh zzjhVar = (zzjh) obj;
        return zzkl.a(this.a, zzjhVar.a) && zzkl.a(this.c, zzjhVar.c) && this.e.equals(zzjhVar.e) && this.f == zzjhVar.f && Arrays.equals(this.b, zzjhVar.b) && this.g == zzjhVar.g;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.c, this.e, Boolean.valueOf(this.f), this.b, Long.valueOf(this.g)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Configurations('");
        sb.append(this.a);
        sb.append("', '");
        sb.append(this.c);
        sb.append("', (");
        Iterator it = this.e.values().iterator();
        while (it.hasNext()) {
            sb.append((zzjf) it.next());
            sb.append(", ");
        }
        sb.append("), ");
        sb.append(this.f);
        sb.append(", ");
        byte[] bArr = this.b;
        sb.append(bArr == null ? "null" : Base64.encodeToString(bArr, 3));
        sb.append(", ");
        return fn0.n(sb, this.g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = SafeParcelWriter.s(parcel, 20293);
        SafeParcelWriter.m(parcel, 2, this.a, false);
        SafeParcelWriter.m(parcel, 3, this.c, false);
        SafeParcelWriter.p(parcel, 4, this.d, i);
        SafeParcelWriter.r(parcel, 5, 4);
        parcel.writeInt(this.f ? 1 : 0);
        SafeParcelWriter.c(parcel, 6, this.b, false);
        SafeParcelWriter.r(parcel, 7, 8);
        parcel.writeLong(this.g);
        SafeParcelWriter.t(parcel, s);
    }
}
