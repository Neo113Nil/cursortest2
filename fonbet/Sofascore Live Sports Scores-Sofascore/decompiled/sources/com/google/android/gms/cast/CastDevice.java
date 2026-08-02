package com.google.android.gms.cast;

import android.net.Network;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.cast.internal.CastUtils;
import com.google.android.gms.cast.internal.zzaa;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import defpackage.mz1;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes3.dex */
public class CastDevice extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<CastDevice> CREATOR = new zzr();
    public final String a;
    public final String b;
    public final InetAddress c;
    public final String d;
    public final String e;
    public final String f;
    public final int g;
    public final List h;
    public final com.google.android.gms.cast.internal.zzp i;
    public final int j;
    public final String k;
    public final String l;
    public final int m;
    public final String n;
    public final byte[] o;
    public final String p;
    public final boolean q;
    public final zzaa r;
    public final Integer s;
    public final Boolean t;
    public final Network u;

    public CastDevice(String str, String str2, String str3, String str4, String str5, int i, ArrayList arrayList, int i2, int i3, String str6, String str7, int i4, String str8, byte[] bArr, String str9, boolean z, zzaa zzaaVar, Integer num, Boolean bool, Network network) {
        this.a = str == null ? "" : str;
        str2 = str2 == null ? "" : str2;
        this.b = str2;
        if (!TextUtils.isEmpty(str2)) {
            try {
                this.c = InetAddress.getByName(str2);
            } catch (UnknownHostException e) {
                new StringBuilder(String.valueOf(this.b).length() + 48 + String.valueOf(e.getMessage()).length());
            }
        }
        this.d = str3 == null ? "" : str3;
        this.e = str4 == null ? "" : str4;
        this.f = str5 == null ? "" : str5;
        this.g = i;
        this.h = arrayList == null ? new ArrayList() : arrayList;
        this.j = i3;
        this.k = str6 == null ? "" : str6;
        this.l = str7;
        this.m = i4;
        this.n = str8;
        this.o = bArr;
        this.p = str9;
        this.q = z;
        this.r = zzaaVar;
        this.s = num;
        this.t = bool;
        this.u = network;
        this.i = new com.google.android.gms.cast.internal.zzp(i2);
    }

    public static CastDevice Y0(Bundle bundle) {
        ClassLoader classLoader;
        if (bundle == null || (classLoader = CastDevice.class.getClassLoader()) == null) {
            return null;
        }
        bundle.setClassLoader(classLoader);
        return (CastDevice) bundle.getParcelable("com.google.android.gms.cast.EXTRA_CAST_DEVICE");
    }

    public final zzaa Z0() {
        zzaa zzaaVar = this.r;
        return (zzaaVar == null && this.i.c()) ? new zzaa(1, false, false, null, null, null, null, null, false, false) : zzaaVar;
    }

    public final int a1() {
        com.google.android.gms.cast.internal.zzp zzpVar = this.i;
        if (zzpVar.a(64)) {
            return 4;
        }
        if (zzpVar.b()) {
            return 3;
        }
        if (zzpVar.c()) {
            return 5;
        }
        return zzpVar.a(1) ? 2 : 1;
    }

    public final boolean equals(Object obj) {
        int i;
        byte[] bArr;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CastDevice)) {
            return false;
        }
        CastDevice castDevice = (CastDevice) obj;
        byte[] bArr2 = castDevice.o;
        int i2 = castDevice.g;
        String str = castDevice.f;
        String str2 = castDevice.a;
        String str3 = this.a;
        if (str3 == null) {
            return str2 == null;
        }
        if (CastUtils.c(str3, str2) && CastUtils.c(this.c, castDevice.c) && CastUtils.c(this.e, castDevice.e) && CastUtils.c(this.d, castDevice.d)) {
            String str4 = this.f;
            if (CastUtils.c(str4, str) && (i = this.g) == i2 && CastUtils.c(this.h, castDevice.h) && this.i.a == castDevice.i.a && this.j == castDevice.j && CastUtils.c(this.k, castDevice.k) && CastUtils.c(Integer.valueOf(this.m), Integer.valueOf(castDevice.m)) && CastUtils.c(this.n, castDevice.n) && CastUtils.c(this.l, castDevice.l) && CastUtils.c(str4, str) && i == i2 && ((((bArr = this.o) == null && bArr2 == null) || Arrays.equals(bArr, bArr2)) && CastUtils.c(this.p, castDevice.p) && this.q == castDevice.q && CastUtils.c(Z0(), castDevice.Z0()))) {
                if (CastUtils.c(Boolean.valueOf(zze()), Boolean.valueOf(castDevice.zze() && CastUtils.c(this.u, castDevice.u)))) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        com.google.android.gms.cast.internal.zzp zzpVar = this.i;
        String str = zzpVar.a(64) ? "[dynamic group]" : zzpVar.b() ? "[static group]" : zzpVar.c() ? "[speaker pair]" : "";
        if (zzpVar.a(262144)) {
            str = str.concat("[cast connect]");
        }
        Locale locale = Locale.ROOT;
        Pattern pattern = CastUtils.a;
        String str2 = this.d;
        if (!TextUtils.isEmpty(str2)) {
            int length = str2.length();
            str2 = length <= 2 ? length == 2 ? "xx" : "x" : String.format(locale, "%c%d%c", Character.valueOf(str2.charAt(0)), Integer.valueOf(length - 2), Character.valueOf(str2.charAt(length - 1)));
        }
        StringBuilder s = mz1.s("\"", str2, "\" (", this.a, ") ");
        s.append(str);
        return s.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = SafeParcelWriter.s(parcel, 20293);
        SafeParcelWriter.m(parcel, 2, this.a, false);
        SafeParcelWriter.m(parcel, 3, this.b, false);
        SafeParcelWriter.m(parcel, 4, this.d, false);
        SafeParcelWriter.m(parcel, 5, this.e, false);
        SafeParcelWriter.m(parcel, 6, this.f, false);
        SafeParcelWriter.r(parcel, 7, 4);
        parcel.writeInt(this.g);
        SafeParcelWriter.q(parcel, 8, Collections.unmodifiableList(this.h), false);
        int i2 = this.i.a;
        SafeParcelWriter.r(parcel, 9, 4);
        parcel.writeInt(i2);
        SafeParcelWriter.r(parcel, 10, 4);
        parcel.writeInt(this.j);
        SafeParcelWriter.m(parcel, 11, this.k, false);
        SafeParcelWriter.m(parcel, 12, this.l, false);
        SafeParcelWriter.r(parcel, 13, 4);
        parcel.writeInt(this.m);
        SafeParcelWriter.m(parcel, 14, this.n, false);
        SafeParcelWriter.c(parcel, 15, this.o, false);
        SafeParcelWriter.m(parcel, 16, this.p, false);
        SafeParcelWriter.r(parcel, 17, 4);
        parcel.writeInt(this.q ? 1 : 0);
        SafeParcelWriter.l(parcel, 18, Z0(), i, false);
        SafeParcelWriter.i(parcel, 19, this.s);
        SafeParcelWriter.a(parcel, 20, Boolean.valueOf(zze()));
        SafeParcelWriter.l(parcel, 21, this.u, i, false);
        SafeParcelWriter.t(parcel, s);
    }

    public final boolean zze() {
        Boolean bool = this.t;
        if (bool != null) {
            return bool.booleanValue();
        }
        int i = this.j;
        return i != -1 && (i & 2) > 0;
    }
}
