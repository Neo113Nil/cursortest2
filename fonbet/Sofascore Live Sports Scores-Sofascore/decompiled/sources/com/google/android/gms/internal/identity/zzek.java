package com.google.android.gms.internal.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.location.Geofence;
import com.unity3d.services.UnityAdsConstants;
import defpackage.a70;
import defpackage.me4;
import defpackage.zzl;
import java.util.Locale;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes3.dex */
public final class zzek extends AbstractSafeParcelable implements Geofence {
    public static final Parcelable.Creator<zzek> CREATOR = new zzel();
    public final String a;
    public final long b;
    public final short c;
    public final double d;
    public final double e;
    public final float f;
    public final int g;
    public final int h;
    public final int i;

    public zzek(String str, int i, short s, double d, double d2, float f, long j, int i2, int i3) {
        if (str == null || str.length() > 100) {
            a70.p("requestId is null or too long: ".concat(String.valueOf(str)));
            throw null;
        }
        if (f <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            StringBuilder sb = new StringBuilder(String.valueOf(f).length() + 16);
            sb.append("invalid radius: ");
            sb.append(f);
            throw new IllegalArgumentException(sb.toString());
        }
        if (d > 90.0d || d < -90.0d) {
            zzl.f(String.valueOf(d).length() + 18, "invalid latitude: ", d);
            throw null;
        }
        if (d2 > 180.0d || d2 < -180.0d) {
            zzl.f(String.valueOf(d2).length() + 19, "invalid longitude: ", d2);
            throw null;
        }
        int i4 = i & 7;
        if (i4 == 0) {
            a70.p(me4.g(i, "No supported transition specified: ", new StringBuilder(String.valueOf(i).length() + 35)));
            throw null;
        }
        this.c = s;
        this.a = str;
        this.d = d;
        this.e = d2;
        this.f = f;
        this.b = j;
        this.g = i4;
        this.h = i2;
        this.i = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzek) {
            zzek zzekVar = (zzek) obj;
            if (this.f == zzekVar.f && this.d == zzekVar.d && this.e == zzekVar.e && this.c == zzekVar.c && this.g == zzekVar.g) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.d);
        long doubleToLongBits2 = Double.doubleToLongBits(this.e);
        return ((((Float.floatToIntBits(this.f) + ((((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) + 31) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31)) * 31) + this.c) * 31) + this.g;
    }

    public final String toString() {
        Locale locale = Locale.US;
        short s = this.c;
        return String.format(locale, "Geofence[%s id:%s transitions:%d %.6f, %.6f %.0fm, resp=%ds, dwell=%dms, @%d]", s != -1 ? s != 1 ? "UNKNOWN" : "CIRCLE" : "INVALID", this.a.replaceAll("\\p{C}", "?"), Integer.valueOf(this.g), Double.valueOf(this.d), Double.valueOf(this.e), Float.valueOf(this.f), Integer.valueOf(this.h / 1000), Integer.valueOf(this.i), Long.valueOf(this.b));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = SafeParcelWriter.s(parcel, 20293);
        SafeParcelWriter.m(parcel, 1, this.a, false);
        SafeParcelWriter.r(parcel, 2, 8);
        parcel.writeLong(this.b);
        SafeParcelWriter.r(parcel, 3, 4);
        parcel.writeInt(this.c);
        SafeParcelWriter.r(parcel, 4, 8);
        parcel.writeDouble(this.d);
        SafeParcelWriter.r(parcel, 5, 8);
        parcel.writeDouble(this.e);
        SafeParcelWriter.r(parcel, 6, 4);
        parcel.writeFloat(this.f);
        SafeParcelWriter.r(parcel, 7, 4);
        parcel.writeInt(this.g);
        SafeParcelWriter.r(parcel, 8, 4);
        parcel.writeInt(this.h);
        SafeParcelWriter.r(parcel, 9, 4);
        parcel.writeInt(this.i);
        SafeParcelWriter.t(parcel, s);
    }
}
