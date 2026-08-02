package com.google.android.gms.internal.measurement;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@ShowFirstParty
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes3.dex */
public final class zzjq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzjq> CREATOR = new zzjr();
    public final String a;
    public final String b;
    public final zzjo c;
    public final boolean d;

    public zzjq(String str, String str2, zzjo zzjoVar, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = zzjoVar;
        this.d = z;
    }

    public final void Y0(StringBuilder sb) {
        sb.append("FlagOverride(");
        sb.append(this.a);
        sb.append(", ");
        sb.append(this.b);
        sb.append(", ");
        this.c.Y0(sb);
        sb.append(", ");
        sb.append(this.d);
        sb.append(")");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzjq)) {
            return false;
        }
        zzjq zzjqVar = (zzjq) obj;
        return zzkl.a(this.a, zzjqVar.a) && zzkl.a(this.b, zzjqVar.b) && zzkl.a(this.c, zzjqVar.c) && this.d == zzjqVar.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        Y0(sb);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = SafeParcelWriter.s(parcel, 20293);
        SafeParcelWriter.m(parcel, 2, this.a, false);
        SafeParcelWriter.m(parcel, 3, this.b, false);
        SafeParcelWriter.l(parcel, 4, this.c, i, false);
        SafeParcelWriter.r(parcel, 5, 4);
        parcel.writeInt(this.d ? 1 : 0);
        SafeParcelWriter.t(parcel, s);
    }
}
