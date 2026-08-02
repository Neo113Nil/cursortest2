package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.VersionInfo;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import defpackage.me4;
import defpackage.wt3;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@SafeParcelable.Class
/* loaded from: classes3.dex */
public final class zzbyi extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbyi> CREATOR = new zzbyj();
    public final int a;
    public final int b;
    public final int c;

    public zzbyi(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public static zzbyi Y0(VersionInfo versionInfo) {
        return new zzbyi(versionInfo.getMajorVersion(), versionInfo.getMinorVersion(), versionInfo.getMicroVersion());
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof zzbyi)) {
            zzbyi zzbyiVar = (zzbyi) obj;
            if (zzbyiVar.c == this.c && zzbyiVar.b == this.b && zzbyiVar.a == this.a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new int[]{this.a, this.b, this.c});
    }

    public final String toString() {
        int i = this.a;
        int length = String.valueOf(i).length();
        int i2 = this.b;
        int length2 = String.valueOf(i2).length();
        int i3 = this.c;
        StringBuilder sb = new StringBuilder(wt3.h(length, 1, length2, 1, String.valueOf(i3).length()));
        me4.q(sb, i, ".", i2, ".");
        sb.append(i3);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = SafeParcelWriter.s(parcel, 20293);
        SafeParcelWriter.r(parcel, 1, 4);
        parcel.writeInt(this.a);
        SafeParcelWriter.r(parcel, 2, 4);
        parcel.writeInt(this.b);
        SafeParcelWriter.r(parcel, 3, 4);
        parcel.writeInt(this.c);
        SafeParcelWriter.t(parcel, s);
    }
}
