package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import defpackage.me4;
import defpackage.wt3;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes3.dex */
public final class zzj extends AbstractSafeParcelable implements com.google.android.gms.wearable.zza {
    public static final Parcelable.Creator<zzj> CREATOR = new zzk();
    public final byte a;
    public final byte b;
    public final String c;

    public zzj(byte b, byte b2, String str) {
        this.a = b;
        this.b = b2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzj.class != obj.getClass()) {
            return false;
        }
        zzj zzjVar = (zzj) obj;
        return this.a == zzjVar.a && this.b == zzjVar.b && this.c.equals(zzjVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((((this.a + 31) * 31) + this.b) * 31);
    }

    public final String toString() {
        byte b = this.a;
        int length = String.valueOf((int) b).length();
        byte b2 = this.b;
        int length2 = String.valueOf((int) b2).length();
        String str = this.c;
        StringBuilder sb = new StringBuilder(wt3.h(length, 53, length2, 10, String.valueOf(str).length()) + 2);
        me4.r(sb, "AmsEntityUpdateParcelable{, mEntityId=", b, ", mAttributeId=", b2);
        return wt3.m(", mValue='", str, sb, "'}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = SafeParcelWriter.s(parcel, 20293);
        SafeParcelWriter.r(parcel, 2, 4);
        parcel.writeInt(this.a);
        SafeParcelWriter.r(parcel, 3, 4);
        parcel.writeInt(this.b);
        SafeParcelWriter.m(parcel, 4, this.c, false);
        SafeParcelWriter.t(parcel, s);
    }
}
