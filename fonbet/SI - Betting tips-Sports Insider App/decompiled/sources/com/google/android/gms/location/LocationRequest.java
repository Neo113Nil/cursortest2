package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.WorkSource;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.libs.identity.ClientIdentity;
import g6.v;
import h8.b;
import java.util.Arrays;
import kotlin.jvm.internal.LongCompanionObject;
import m7.j;
import n6.a;
import p7.e;
import v.f;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class LocationRequest extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<LocationRequest> CREATOR = new a(9);

    /* renamed from: a, reason: collision with root package name */
    public int f5714a;

    /* renamed from: b, reason: collision with root package name */
    public long f5715b;

    /* renamed from: c, reason: collision with root package name */
    public long f5716c;

    /* renamed from: d, reason: collision with root package name */
    public final long f5717d;

    /* renamed from: e, reason: collision with root package name */
    public final long f5718e;

    /* renamed from: f, reason: collision with root package name */
    public final int f5719f;

    /* renamed from: g, reason: collision with root package name */
    public final float f5720g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f5721h;

    /* renamed from: i, reason: collision with root package name */
    public long f5722i;
    public final int j;

    /* renamed from: k, reason: collision with root package name */
    public final int f5723k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f5724l;

    /* renamed from: m, reason: collision with root package name */
    public final WorkSource f5725m;

    /* renamed from: n, reason: collision with root package name */
    public final ClientIdentity f5726n;

    public LocationRequest(int i5, long j, long j6, long j10, long j11, long j12, int i10, float f6, boolean z5, long j13, int i11, int i12, boolean z7, WorkSource workSource, ClientIdentity clientIdentity) {
        this.f5714a = i5;
        if (i5 == 105) {
            this.f5715b = LongCompanionObject.MAX_VALUE;
        } else {
            this.f5715b = j;
        }
        this.f5716c = j6;
        this.f5717d = j10;
        this.f5718e = j11 == LongCompanionObject.MAX_VALUE ? j12 : Math.min(Math.max(1L, j11 - SystemClock.elapsedRealtime()), j12);
        this.f5719f = i10;
        this.f5720g = f6;
        this.f5721h = z5;
        this.f5722i = j13 != -1 ? j13 : j;
        this.j = i11;
        this.f5723k = i12;
        this.f5724l = z7;
        this.f5725m = workSource;
        this.f5726n = clientIdentity;
    }

    public static String l0(long j) {
        String sb2;
        if (j == LongCompanionObject.MAX_VALUE) {
            return "∞";
        }
        StringBuilder sb3 = j.f20461b;
        synchronized (sb3) {
            sb3.setLength(0);
            j.a(j, sb3);
            sb2 = sb3.toString();
        }
        return sb2;
    }

    public final boolean c() {
        long j = this.f5717d;
        return j > 0 && (j >> 1) >= this.f5715b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof LocationRequest)) {
            return false;
        }
        LocationRequest locationRequest = (LocationRequest) obj;
        int i5 = this.f5714a;
        if (i5 != locationRequest.f5714a) {
            return false;
        }
        if ((i5 == 105 || this.f5715b == locationRequest.f5715b) && this.f5716c == locationRequest.f5716c && c() == locationRequest.c()) {
            return (!c() || this.f5717d == locationRequest.f5717d) && this.f5718e == locationRequest.f5718e && this.f5719f == locationRequest.f5719f && this.f5720g == locationRequest.f5720g && this.f5721h == locationRequest.f5721h && this.j == locationRequest.j && this.f5723k == locationRequest.f5723k && this.f5724l == locationRequest.f5724l && this.f5725m.equals(locationRequest.f5725m) && v.k(this.f5726n, locationRequest.f5726n);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f5714a), Long.valueOf(this.f5715b), Long.valueOf(this.f5716c), this.f5725m});
    }

    public final String toString() {
        String str;
        StringBuilder b10 = f.b("Request[");
        int i5 = this.f5714a;
        long j = this.f5717d;
        if (i5 == 105) {
            b10.append(e.b(i5));
            if (j > 0) {
                b10.append("/");
                j.a(j, b10);
            }
        } else {
            b10.append("@");
            if (c()) {
                j.a(this.f5715b, b10);
                b10.append("/");
                j.a(j, b10);
            } else {
                j.a(this.f5715b, b10);
            }
            b10.append(" ");
            b10.append(e.b(this.f5714a));
        }
        if (this.f5714a == 105 || this.f5716c != this.f5715b) {
            b10.append(", minUpdateInterval=");
            b10.append(l0(this.f5716c));
        }
        float f6 = this.f5720g;
        if (f6 > 0.0d) {
            b10.append(", minUpdateDistance=");
            b10.append(f6);
        }
        if (this.f5714a != 105 ? this.f5722i != this.f5715b : this.f5722i != LongCompanionObject.MAX_VALUE) {
            b10.append(", maxUpdateAge=");
            b10.append(l0(this.f5722i));
        }
        long j6 = this.f5718e;
        if (j6 != LongCompanionObject.MAX_VALUE) {
            b10.append(", duration=");
            j.a(j6, b10);
        }
        int i10 = this.f5719f;
        if (i10 != Integer.MAX_VALUE) {
            b10.append(", maxUpdates=");
            b10.append(i10);
        }
        int i11 = this.f5723k;
        if (i11 != 0) {
            b10.append(", ");
            if (i11 == 0) {
                str = "THROTTLE_BACKGROUND";
            } else if (i11 == 1) {
                str = "THROTTLE_ALWAYS";
            } else {
                if (i11 != 2) {
                    throw new IllegalArgumentException();
                }
                str = "THROTTLE_NEVER";
            }
            b10.append(str);
        }
        int i12 = this.j;
        if (i12 != 0) {
            b10.append(", ");
            b10.append(e.c(i12));
        }
        if (this.f5721h) {
            b10.append(", waitForAccurateLocation");
        }
        if (this.f5724l) {
            b10.append(", bypass");
        }
        WorkSource workSource = this.f5725m;
        if (!q6.f.c(workSource)) {
            b10.append(", ");
            b10.append(workSource);
        }
        ClientIdentity clientIdentity = this.f5726n;
        if (clientIdentity != null) {
            b10.append(", impersonation=");
            b10.append(clientIdentity);
        }
        b10.append(']');
        return b10.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int V = b.V(parcel, 20293);
        int i10 = this.f5714a;
        b.U(parcel, 1, 4);
        parcel.writeInt(i10);
        long j = this.f5715b;
        b.U(parcel, 2, 8);
        parcel.writeLong(j);
        long j6 = this.f5716c;
        b.U(parcel, 3, 8);
        parcel.writeLong(j6);
        b.U(parcel, 6, 4);
        parcel.writeInt(this.f5719f);
        b.U(parcel, 7, 4);
        parcel.writeFloat(this.f5720g);
        b.U(parcel, 8, 8);
        parcel.writeLong(this.f5717d);
        b.U(parcel, 9, 4);
        parcel.writeInt(this.f5721h ? 1 : 0);
        b.U(parcel, 10, 8);
        parcel.writeLong(this.f5718e);
        long j10 = this.f5722i;
        b.U(parcel, 11, 8);
        parcel.writeLong(j10);
        b.U(parcel, 12, 4);
        parcel.writeInt(this.j);
        b.U(parcel, 13, 4);
        parcel.writeInt(this.f5723k);
        b.U(parcel, 15, 4);
        parcel.writeInt(this.f5724l ? 1 : 0);
        b.N(parcel, 16, this.f5725m, i5, false);
        b.N(parcel, 17, this.f5726n, i5, false);
        b.W(parcel, V);
    }
}
