package com.google.android.gms.libs.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import g6.j;
import h8.b;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import java.util.Locale;
import r4.k;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class zzek extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzek> CREATOR = new j(22);

    /* renamed from: a, reason: collision with root package name */
    public final String f4881a;

    /* renamed from: b, reason: collision with root package name */
    public final long f4882b;

    /* renamed from: c, reason: collision with root package name */
    public final short f4883c;

    /* renamed from: d, reason: collision with root package name */
    public final double f4884d;

    /* renamed from: e, reason: collision with root package name */
    public final double f4885e;

    /* renamed from: f, reason: collision with root package name */
    public final float f4886f;

    /* renamed from: g, reason: collision with root package name */
    public final int f4887g;

    /* renamed from: h, reason: collision with root package name */
    public final int f4888h;

    /* renamed from: i, reason: collision with root package name */
    public final int f4889i;

    public zzek(String str, int i5, short s8, double d10, double d11, float f6, long j, int i10, int i11) {
        if (str == null || str.length() > 100) {
            throw new IllegalArgumentException("requestId is null or too long: ".concat(String.valueOf(str)));
        }
        if (f6 <= 0.0f) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(f6).length() + 16);
            sb2.append("invalid radius: ");
            sb2.append(f6);
            throw new IllegalArgumentException(sb2.toString());
        }
        if (d10 > 90.0d || d10 < -90.0d) {
            StringBuilder sb3 = new StringBuilder(String.valueOf(d10).length() + 18);
            sb3.append("invalid latitude: ");
            sb3.append(d10);
            throw new IllegalArgumentException(sb3.toString());
        }
        if (d11 > 180.0d || d11 < -180.0d) {
            StringBuilder sb4 = new StringBuilder(String.valueOf(d11).length() + 19);
            sb4.append("invalid longitude: ");
            sb4.append(d11);
            throw new IllegalArgumentException(sb4.toString());
        }
        int i12 = i5 & 7;
        if (i12 == 0) {
            throw new IllegalArgumentException(k.o(new StringBuilder(String.valueOf(i5).length() + 35), "No supported transition specified: ", i5));
        }
        this.f4883c = s8;
        this.f4881a = str;
        this.f4884d = d10;
        this.f4885e = d11;
        this.f4886f = f6;
        this.f4882b = j;
        this.f4887g = i12;
        this.f4888h = i10;
        this.f4889i = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzek) {
            zzek zzekVar = (zzek) obj;
            if (this.f4886f == zzekVar.f4886f && this.f4884d == zzekVar.f4884d && this.f4885e == zzekVar.f4885e && this.f4883c == zzekVar.f4883c && this.f4887g == zzekVar.f4887g) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f4884d);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f4885e);
        return ((((Float.floatToIntBits(this.f4886f) + ((((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) + 31) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31)) * 31) + this.f4883c) * 31) + this.f4887g;
    }

    public final String toString() {
        Locale locale = Locale.US;
        short s8 = this.f4883c;
        return String.format(locale, "Geofence[%s id:%s transitions:%d %.6f, %.6f %.0fm, resp=%ds, dwell=%dms, @%d]", s8 != -1 ? s8 != 1 ? "UNKNOWN" : "CIRCLE" : "INVALID", this.f4881a.replaceAll("\\p{C}", "?"), Integer.valueOf(this.f4887g), Double.valueOf(this.f4884d), Double.valueOf(this.f4885e), Float.valueOf(this.f4886f), Integer.valueOf(this.f4888h / AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT), Integer.valueOf(this.f4889i), Long.valueOf(this.f4882b));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int V = b.V(parcel, 20293);
        b.O(parcel, 1, this.f4881a, false);
        b.U(parcel, 2, 8);
        parcel.writeLong(this.f4882b);
        b.U(parcel, 3, 4);
        parcel.writeInt(this.f4883c);
        b.U(parcel, 4, 8);
        parcel.writeDouble(this.f4884d);
        b.U(parcel, 5, 8);
        parcel.writeDouble(this.f4885e);
        b.U(parcel, 6, 4);
        parcel.writeFloat(this.f4886f);
        b.U(parcel, 7, 4);
        parcel.writeInt(this.f4887g);
        b.U(parcel, 8, 4);
        parcel.writeInt(this.f4888h);
        b.U(parcel, 9, 4);
        parcel.writeInt(this.f4889i);
        b.W(parcel, V);
    }
}
