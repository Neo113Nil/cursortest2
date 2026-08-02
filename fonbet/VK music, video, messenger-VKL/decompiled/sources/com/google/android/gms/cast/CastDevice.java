package com.google.android.gms.cast;

import android.net.Network;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.cast.internal.zzaa;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import xsna.in01;
import xsna.o0a;
import xsna.ozg0;
import xsna.qo01;
import xsna.xe9;

/* compiled from: com.google.android.gms:play-services-cast@@22.3.1 */
/* loaded from: classes12.dex */
public class CastDevice extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<CastDevice> CREATOR = new qo01();
    public final String b;
    public final String c;
    public final InetAddress d;
    public final String e;
    public final String f;
    public final String g;
    public final int h;
    public final List i;
    public final in01 j;
    public final int k;
    public final String l;

    @Nullable
    public final String m;
    public final int n;

    @Nullable
    public final String o;
    public final byte[] p;

    @Nullable
    public final String q;
    public final boolean r;

    @Nullable
    public final zzaa s;

    @Nullable
    public final Integer t;

    @Nullable
    public final Boolean u;

    @Nullable
    public final Network v;

    public CastDevice(String str, @Nullable String str2, String str3, String str4, String str5, int i, ArrayList arrayList, int i2, int i3, @Nullable String str6, @Nullable String str7, int i4, @Nullable String str8, byte[] bArr, @Nullable String str9, boolean z, @Nullable zzaa zzaaVar, @Nullable Integer num, @Nullable Boolean bool, @Nullable Network network) {
        this.b = str == null ? "" : str;
        str2 = str2 == null ? "" : str2;
        this.c = str2;
        if (!TextUtils.isEmpty(str2)) {
            try {
                this.d = InetAddress.getByName(str2);
            } catch (UnknownHostException e) {
                new StringBuilder(String.valueOf(this.c).length() + 48 + String.valueOf(e.getMessage()).length());
            }
        }
        this.e = str3 == null ? "" : str3;
        this.f = str4 == null ? "" : str4;
        this.g = str5 == null ? "" : str5;
        this.h = i;
        this.i = arrayList == null ? new ArrayList() : arrayList;
        this.k = i3;
        this.l = str6 == null ? "" : str6;
        this.m = str7;
        this.n = i4;
        this.o = str8;
        this.p = bArr;
        this.q = str9;
        this.r = z;
        this.s = zzaaVar;
        this.t = num;
        this.u = bool;
        this.v = network;
        this.j = new in01(i2);
    }

    @Nullable
    public static CastDevice j(@Nullable Bundle bundle) {
        ClassLoader classLoader;
        if (bundle == null || (classLoader = CastDevice.class.getClassLoader()) == null) {
            return null;
        }
        bundle.setClassLoader(classLoader);
        return (CastDevice) bundle.getParcelable("com.google.android.gms.cast.EXTRA_CAST_DEVICE");
    }

    public final boolean equals(@Nullable Object obj) {
        int i;
        byte[] bArr;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CastDevice)) {
            return false;
        }
        CastDevice castDevice = (CastDevice) obj;
        String str = this.b;
        if (str == null) {
            return castDevice.b == null;
        }
        String str2 = castDevice.b;
        byte[] bArr2 = castDevice.p;
        int i2 = castDevice.h;
        String str3 = castDevice.g;
        if (o0a.c(str, str2) && o0a.c(this.d, castDevice.d) && o0a.c(this.f, castDevice.f) && o0a.c(this.e, castDevice.e)) {
            String str4 = this.g;
            if (o0a.c(str4, str3) && (i = this.h) == i2 && o0a.c(this.i, castDevice.i) && this.j.a == castDevice.j.a && this.k == castDevice.k && o0a.c(this.l, castDevice.l) && o0a.c(Integer.valueOf(this.n), Integer.valueOf(castDevice.n)) && o0a.c(this.o, castDevice.o) && o0a.c(this.m, castDevice.m) && o0a.c(str4, str3) && i == i2 && ((((bArr = this.p) == null && bArr2 == null) || Arrays.equals(bArr, bArr2)) && o0a.c(this.q, castDevice.q) && this.r == castDevice.r && o0a.c(k(), castDevice.k()))) {
                if (o0a.c(Boolean.valueOf(l()), Boolean.valueOf(castDevice.l() && o0a.c(this.v, castDevice.v)))) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.b;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @NonNull
    public final String i() {
        String str = this.b;
        return str.startsWith("__cast_nearby__") ? str.substring(16) : str;
    }

    @Nullable
    public final zzaa k() {
        zzaa zzaaVar = this.s;
        return (zzaaVar == null && this.j.c()) ? new zzaa(1, false, false, null, null, null, null, null, false, false) : zzaaVar;
    }

    public final boolean l() {
        Boolean bool = this.u;
        if (bool != null) {
            return bool.booleanValue();
        }
        int i = this.k;
        return i != -1 && (i & 2) > 0;
    }

    @NonNull
    public final String toString() {
        in01 in01Var = this.j;
        String str = in01Var.a(64) ? "[dynamic group]" : in01Var.b() ? "[static group]" : in01Var.c() ? "[speaker pair]" : "";
        if (in01Var.a(SQLiteDatabase.OPEN_PRIVATECACHE)) {
            str = str.concat("[cast connect]");
        }
        Locale locale = Locale.ROOT;
        Pattern pattern = o0a.a;
        String str2 = this.e;
        if (!TextUtils.isEmpty(str2)) {
            int length = str2.length();
            str2 = length <= 2 ? length == 2 ? "xx" : "x" : String.format(locale, "%c%d%c", Character.valueOf(str2.charAt(0)), Integer.valueOf(length - 2), Character.valueOf(str2.charAt(length - 1)));
        }
        StringBuilder a = xe9.a("\"", str2, "\" (", this.b, ") ");
        a.append(str);
        return a.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.q(parcel, 2, this.b, false);
        ozg0.q(parcel, 3, this.c, false);
        ozg0.q(parcel, 4, this.e, false);
        ozg0.q(parcel, 5, this.f, false);
        ozg0.q(parcel, 6, this.g, false);
        ozg0.v(parcel, 7, 4);
        parcel.writeInt(this.h);
        ozg0.u(parcel, 8, Collections.unmodifiableList(this.i), false);
        int i2 = this.j.a;
        ozg0.v(parcel, 9, 4);
        parcel.writeInt(i2);
        ozg0.v(parcel, 10, 4);
        parcel.writeInt(this.k);
        ozg0.q(parcel, 11, this.l, false);
        ozg0.q(parcel, 12, this.m, false);
        ozg0.v(parcel, 13, 4);
        parcel.writeInt(this.n);
        ozg0.q(parcel, 14, this.o, false);
        ozg0.e(parcel, 15, this.p, false);
        ozg0.q(parcel, 16, this.q, false);
        ozg0.v(parcel, 17, 4);
        parcel.writeInt(this.r ? 1 : 0);
        ozg0.p(parcel, 18, k(), i, false);
        ozg0.k(parcel, 19, this.t);
        ozg0.c(parcel, 20, Boolean.valueOf(l()));
        ozg0.p(parcel, 21, this.v, i, false);
        ozg0.x(w, parcel);
    }

    public final int zzd() {
        in01 in01Var = this.j;
        if (in01Var.a(64)) {
            return 4;
        }
        if (in01Var.b()) {
            return 3;
        }
        if (in01Var.c()) {
            return 5;
        }
        return in01Var.a(1) ? 2 : 1;
    }
}
