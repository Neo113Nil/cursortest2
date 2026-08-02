package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import defpackage.bf3;
import defpackage.wt3;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@SafeParcelable.Class
/* loaded from: classes3.dex */
public final class zzn extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzn> CREATOR = new zzo();
    public final String a;
    public final String b;
    public final zzkq c;
    public final String d;
    public final String e;
    public final Float f;
    public final zzr g;

    public zzn(String str, String str2, zzkq zzkqVar, String str3, String str4, Float f, zzr zzrVar) {
        this.a = str;
        this.b = str2;
        this.c = zzkqVar;
        this.d = str3;
        this.e = str4;
        this.f = f;
        this.g = zzrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzn.class == obj.getClass()) {
            zzn zznVar = (zzn) obj;
            if (Objects.equals(this.a, zznVar.a) && Objects.equals(this.b, zznVar.b) && Objects.equals(this.c, zznVar.c) && Objects.equals(this.d, zznVar.d) && Objects.equals(this.e, zznVar.e) && Objects.equals(this.f, zznVar.f) && Objects.equals(this.g, zznVar.g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.g);
        String valueOf2 = String.valueOf(this.c);
        String str = this.b;
        int length = String.valueOf(str).length();
        String str2 = this.d;
        int length2 = String.valueOf(str2).length();
        String str3 = this.e;
        int length3 = String.valueOf(str3).length();
        Float f = this.f;
        int length4 = String.valueOf(f).length();
        int length5 = valueOf.length();
        String str4 = this.a;
        StringBuilder sb = new StringBuilder(length + 39 + length2 + 19 + length3 + 14 + length4 + 14 + length5 + 15 + String.valueOf(str4).length() + 8 + valueOf2.length() + 1);
        bf3.v(sb, "AppParcelable{title='", str, "', developerName='", str2);
        sb.append("', formattedPrice='");
        sb.append(str3);
        sb.append("', starRating=");
        sb.append(f);
        bf3.v(sb, ", wearDetails=", valueOf, ", deepLinkUri='", str4);
        return wt3.m("', icon=", valueOf2, sb, "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = SafeParcelWriter.s(parcel, 20293);
        SafeParcelWriter.m(parcel, 1, this.a, false);
        SafeParcelWriter.m(parcel, 2, this.b, false);
        SafeParcelWriter.l(parcel, 3, this.c, i, false);
        SafeParcelWriter.m(parcel, 4, this.d, false);
        SafeParcelWriter.m(parcel, 5, this.e, false);
        Float f = this.f;
        if (f != null) {
            SafeParcelWriter.r(parcel, 6, 4);
            parcel.writeFloat(f.floatValue());
        }
        SafeParcelWriter.l(parcel, 7, this.g, i, false);
        SafeParcelWriter.t(parcel, s);
    }
}
