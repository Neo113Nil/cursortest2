package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import defpackage.dmi;
import defpackage.fn0;
import defpackage.me4;
import defpackage.wt3;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes3.dex */
public final class zzl extends AbstractSafeParcelable implements com.google.android.gms.wearable.zzb {
    public static final Parcelable.Creator<zzl> CREATOR = new zzm();
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final byte h;
    public final byte i;
    public final byte j;
    public final byte k;
    public final String l;

    public zzl(int i, String str, String str2, String str3, String str4, String str5, String str6, byte b, byte b2, byte b3, byte b4, String str7) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = b;
        this.i = b2;
        this.j = b3;
        this.k = b4;
        this.l = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzl.class != obj.getClass()) {
            return false;
        }
        zzl zzlVar = (zzl) obj;
        if (this.a != zzlVar.a || this.h != zzlVar.h || this.i != zzlVar.i || this.j != zzlVar.j || this.k != zzlVar.k || !this.b.equals(zzlVar.b)) {
            return false;
        }
        String str = zzlVar.c;
        String str2 = this.c;
        if (str2 == null ? str != null : !str2.equals(str)) {
            return false;
        }
        if (!this.d.equals(zzlVar.d) || !this.e.equals(zzlVar.e) || !this.f.equals(zzlVar.f)) {
            return false;
        }
        String str3 = zzlVar.g;
        String str4 = this.g;
        if (str4 == null ? str3 != null : !str4.equals(str3)) {
            return false;
        }
        String str5 = zzlVar.l;
        String str6 = this.l;
        return str6 != null ? str6.equals(str5) : str5 == null;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() + ((this.a + 31) * 31);
        String str = this.c;
        int c = dmi.c(dmi.c(dmi.c(((hashCode * 31) + (str != null ? str.hashCode() : 0)) * 31, 31, this.d), 31, this.e), 31, this.f);
        String str2 = this.g;
        int hashCode2 = (((((((((c + (str2 != null ? str2.hashCode() : 0)) * 31) + this.h) * 31) + this.i) * 31) + this.j) * 31) + this.k) * 31;
        String str3 = this.l;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        int i = this.a;
        int length = String.valueOf(i).length();
        String str = this.b;
        int length2 = String.valueOf(str).length();
        String str2 = this.c;
        int length3 = String.valueOf(str2).length();
        byte b = this.h;
        int length4 = String.valueOf((int) b).length();
        byte b2 = this.i;
        int length5 = String.valueOf((int) b2).length();
        byte b3 = this.j;
        int length6 = String.valueOf((int) b3).length();
        byte b4 = this.k;
        int length7 = String.valueOf((int) b4).length();
        String str3 = this.l;
        StringBuilder sb = new StringBuilder(length + 41 + length2 + 13 + length3 + 11 + length4 + 13 + length5 + 13 + length6 + 16 + length7 + 15 + String.valueOf(str3).length() + 2);
        fn0.s(i, "AncsNotificationParcelable{, id=", ", appId='", str, sb);
        wt3.t(b, "', dateTime='", str2, "', eventId=", sb);
        me4.r(sb, ", eventFlags=", b2, ", categoryId=", b3);
        fn0.s(b4, ", categoryCount=", ", packageName='", str3, sb);
        sb.append("'}");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = SafeParcelWriter.s(parcel, 20293);
        SafeParcelWriter.r(parcel, 2, 4);
        parcel.writeInt(this.a);
        String str = this.b;
        SafeParcelWriter.m(parcel, 3, str, false);
        SafeParcelWriter.m(parcel, 4, this.c, false);
        SafeParcelWriter.m(parcel, 5, this.d, false);
        SafeParcelWriter.m(parcel, 6, this.e, false);
        SafeParcelWriter.m(parcel, 7, this.f, false);
        String str2 = this.g;
        if (str2 != null) {
            str = str2;
        }
        SafeParcelWriter.m(parcel, 8, str, false);
        SafeParcelWriter.r(parcel, 9, 4);
        parcel.writeInt(this.h);
        SafeParcelWriter.r(parcel, 10, 4);
        parcel.writeInt(this.i);
        SafeParcelWriter.r(parcel, 11, 4);
        parcel.writeInt(this.j);
        SafeParcelWriter.r(parcel, 12, 4);
        parcel.writeInt(this.k);
        SafeParcelWriter.m(parcel, 13, this.l, false);
        SafeParcelWriter.t(parcel, s);
    }
}
