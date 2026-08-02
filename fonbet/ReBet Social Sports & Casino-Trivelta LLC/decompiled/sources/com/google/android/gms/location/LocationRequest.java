package com.google.android.gms.location;

import E9.b;
import V9.G;
import V9.P;
import V9.t;
import V9.v;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.WorkSource;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.AbstractC3189m;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.location.zzd;
import com.google.android.gms.internal.location.zzdj;
import kotlin.jvm.internal.LongCompanionObject;

/* loaded from: classes2.dex */
public final class LocationRequest extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<LocationRequest> CREATOR = new P();

    /* renamed from: a, reason: collision with root package name */
    public int f33096a;

    /* renamed from: b, reason: collision with root package name */
    public long f33097b;

    /* renamed from: c, reason: collision with root package name */
    public long f33098c;

    /* renamed from: d, reason: collision with root package name */
    public long f33099d;

    /* renamed from: e, reason: collision with root package name */
    public long f33100e;

    /* renamed from: f, reason: collision with root package name */
    public int f33101f;

    /* renamed from: g, reason: collision with root package name */
    public float f33102g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f33103h;

    /* renamed from: i, reason: collision with root package name */
    public long f33104i;

    /* renamed from: j, reason: collision with root package name */
    public final int f33105j;

    /* renamed from: k, reason: collision with root package name */
    public final int f33106k;

    /* renamed from: l, reason: collision with root package name */
    public final String f33107l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f33108m;

    /* renamed from: n, reason: collision with root package name */
    public final WorkSource f33109n;

    /* renamed from: o, reason: collision with root package name */
    public final zzd f33110o;

    @Deprecated
    public LocationRequest() {
        this(102, 3600000L, 600000L, 0L, LongCompanionObject.MAX_VALUE, LongCompanionObject.MAX_VALUE, Integer.MAX_VALUE, 0.0f, true, 3600000L, 0, 0, null, false, new WorkSource(), null);
    }

    public static LocationRequest g() {
        return new LocationRequest(102, 3600000L, 600000L, 0L, LongCompanionObject.MAX_VALUE, LongCompanionObject.MAX_VALUE, Integer.MAX_VALUE, 0.0f, true, 3600000L, 0, 0, null, false, new WorkSource(), null);
    }

    public static String n0(long j10) {
        return j10 == LongCompanionObject.MAX_VALUE ? "∞" : zzdj.zza(j10);
    }

    public float N() {
        return this.f33102g;
    }

    public long O() {
        return this.f33098c;
    }

    public int Y() {
        return this.f33096a;
    }

    public boolean Z() {
        long j10 = this.f33099d;
        return j10 > 0 && (j10 >> 1) >= this.f33097b;
    }

    public boolean a0() {
        return this.f33096a == 105;
    }

    public boolean d0() {
        return this.f33103h;
    }

    public LocationRequest e0(long j10) {
        AbstractC3191o.c(j10 >= 0, "illegal fastest interval: %d", Long.valueOf(j10));
        this.f33098c = j10;
        return this;
    }

    public boolean equals(Object obj) {
        if (obj instanceof LocationRequest) {
            LocationRequest locationRequest = (LocationRequest) obj;
            if (this.f33096a == locationRequest.f33096a && ((a0() || this.f33097b == locationRequest.f33097b) && this.f33098c == locationRequest.f33098c && Z() == locationRequest.Z() && ((!Z() || this.f33099d == locationRequest.f33099d) && this.f33100e == locationRequest.f33100e && this.f33101f == locationRequest.f33101f && this.f33102g == locationRequest.f33102g && this.f33103h == locationRequest.f33103h && this.f33105j == locationRequest.f33105j && this.f33106k == locationRequest.f33106k && this.f33108m == locationRequest.f33108m && this.f33109n.equals(locationRequest.f33109n) && AbstractC3189m.b(this.f33107l, locationRequest.f33107l) && AbstractC3189m.b(this.f33110o, locationRequest.f33110o)))) {
                return true;
            }
        }
        return false;
    }

    public LocationRequest f0(long j10) {
        AbstractC3191o.b(j10 >= 0, "intervalMillis must be greater than or equal to 0");
        long j11 = this.f33098c;
        long j12 = this.f33097b;
        if (j11 == j12 / 6) {
            this.f33098c = j10 / 6;
        }
        if (this.f33104i == j12) {
            this.f33104i = j10;
        }
        this.f33097b = j10;
        return this;
    }

    public LocationRequest g0(int i10) {
        if (i10 > 0) {
            this.f33101f = i10;
            return this;
        }
        throw new IllegalArgumentException("invalid numUpdates: " + i10);
    }

    public long h() {
        return this.f33100e;
    }

    public LocationRequest h0(int i10) {
        t.a(i10);
        this.f33096a = i10;
        return this;
    }

    public int hashCode() {
        return AbstractC3189m.c(Integer.valueOf(this.f33096a), Long.valueOf(this.f33097b), Long.valueOf(this.f33098c), this.f33109n);
    }

    public int i() {
        return this.f33105j;
    }

    public LocationRequest i0(float f10) {
        if (f10 >= 0.0f) {
            this.f33102g = f10;
            return this;
        }
        throw new IllegalArgumentException("invalid displacement: " + f10);
    }

    public long j() {
        return this.f33097b;
    }

    public final int j0() {
        return this.f33106k;
    }

    public long k() {
        return this.f33104i;
    }

    public final WorkSource k0() {
        return this.f33109n;
    }

    public long l() {
        return this.f33099d;
    }

    public final zzd l0() {
        return this.f33110o;
    }

    public int m() {
        return this.f33101f;
    }

    public final boolean m0() {
        return this.f33108m;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Request[");
        if (a0()) {
            sb2.append(t.b(this.f33096a));
        } else {
            sb2.append("@");
            if (Z()) {
                zzdj.zzb(this.f33097b, sb2);
                sb2.append("/");
                zzdj.zzb(this.f33099d, sb2);
            } else {
                zzdj.zzb(this.f33097b, sb2);
            }
            sb2.append(" ");
            sb2.append(t.b(this.f33096a));
        }
        if (a0() || this.f33098c != this.f33097b) {
            sb2.append(", minUpdateInterval=");
            sb2.append(n0(this.f33098c));
        }
        if (this.f33102g > 0.0d) {
            sb2.append(", minUpdateDistance=");
            sb2.append(this.f33102g);
        }
        if (!a0() ? this.f33104i != this.f33097b : this.f33104i != LongCompanionObject.MAX_VALUE) {
            sb2.append(", maxUpdateAge=");
            sb2.append(n0(this.f33104i));
        }
        if (this.f33100e != LongCompanionObject.MAX_VALUE) {
            sb2.append(", duration=");
            zzdj.zzb(this.f33100e, sb2);
        }
        if (this.f33101f != Integer.MAX_VALUE) {
            sb2.append(", maxUpdates=");
            sb2.append(this.f33101f);
        }
        if (this.f33106k != 0) {
            sb2.append(", ");
            sb2.append(v.a(this.f33106k));
        }
        if (this.f33105j != 0) {
            sb2.append(", ");
            sb2.append(G.b(this.f33105j));
        }
        if (this.f33103h) {
            sb2.append(", waitForAccurateLocation");
        }
        if (this.f33108m) {
            sb2.append(", bypass");
        }
        if (this.f33107l != null) {
            sb2.append(", moduleId=");
            sb2.append(this.f33107l);
        }
        if (!K9.t.d(this.f33109n)) {
            sb2.append(", ");
            sb2.append(this.f33109n);
        }
        if (this.f33110o != null) {
            sb2.append(", impersonation=");
            sb2.append(this.f33110o);
        }
        sb2.append(']');
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = b.a(parcel);
        b.u(parcel, 1, Y());
        b.y(parcel, 2, j());
        b.y(parcel, 3, O());
        b.u(parcel, 6, m());
        b.q(parcel, 7, N());
        b.y(parcel, 8, l());
        b.g(parcel, 9, d0());
        b.y(parcel, 10, h());
        b.y(parcel, 11, k());
        b.u(parcel, 12, i());
        b.u(parcel, 13, this.f33106k);
        b.F(parcel, 14, this.f33107l, false);
        b.g(parcel, 15, this.f33108m);
        b.D(parcel, 16, this.f33109n, i10, false);
        b.D(parcel, 17, this.f33110o, i10, false);
        b.b(parcel, a10);
    }

    public final String zzd() {
        return this.f33107l;
    }

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public int f33111a;

        /* renamed from: b, reason: collision with root package name */
        public long f33112b;

        /* renamed from: c, reason: collision with root package name */
        public long f33113c;

        /* renamed from: d, reason: collision with root package name */
        public long f33114d;

        /* renamed from: e, reason: collision with root package name */
        public long f33115e;

        /* renamed from: f, reason: collision with root package name */
        public int f33116f;

        /* renamed from: g, reason: collision with root package name */
        public float f33117g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f33118h;

        /* renamed from: i, reason: collision with root package name */
        public long f33119i;

        /* renamed from: j, reason: collision with root package name */
        public int f33120j;

        /* renamed from: k, reason: collision with root package name */
        public int f33121k;

        /* renamed from: l, reason: collision with root package name */
        public String f33122l;

        /* renamed from: m, reason: collision with root package name */
        public boolean f33123m;

        /* renamed from: n, reason: collision with root package name */
        public WorkSource f33124n;

        /* renamed from: o, reason: collision with root package name */
        public zzd f33125o;

        public a(int i10, long j10) {
            AbstractC3191o.b(j10 >= 0, "intervalMillis must be greater than or equal to 0");
            t.a(i10);
            this.f33111a = i10;
            this.f33112b = j10;
            this.f33113c = -1L;
            this.f33114d = 0L;
            this.f33115e = LongCompanionObject.MAX_VALUE;
            this.f33116f = Integer.MAX_VALUE;
            this.f33117g = 0.0f;
            this.f33118h = true;
            this.f33119i = -1L;
            this.f33120j = 0;
            this.f33121k = 0;
            this.f33122l = null;
            this.f33123m = false;
            this.f33124n = null;
            this.f33125o = null;
        }

        public LocationRequest a() {
            int i10 = this.f33111a;
            long j10 = this.f33112b;
            long j11 = this.f33113c;
            if (j11 == -1) {
                j11 = j10;
            } else if (i10 != 105) {
                j11 = Math.min(j11, j10);
            }
            long max = Math.max(this.f33114d, this.f33112b);
            long j12 = this.f33115e;
            int i11 = this.f33116f;
            float f10 = this.f33117g;
            boolean z10 = this.f33118h;
            long j13 = this.f33119i;
            if (j13 == -1) {
                j13 = this.f33112b;
            }
            return new LocationRequest(i10, j10, j11, max, LongCompanionObject.MAX_VALUE, j12, i11, f10, z10, j13, this.f33120j, this.f33121k, this.f33122l, this.f33123m, new WorkSource(this.f33124n), this.f33125o);
        }

        public a b(long j10) {
            AbstractC3191o.b(j10 > 0, "durationMillis must be greater than 0");
            this.f33115e = j10;
            return this;
        }

        public a c(int i10) {
            G.a(i10);
            this.f33120j = i10;
            return this;
        }

        public a d(long j10) {
            boolean z10 = true;
            if (j10 != -1 && j10 < 0) {
                z10 = false;
            }
            AbstractC3191o.b(z10, "maxUpdateAgeMillis must be greater than or equal to 0, or IMPLICIT_MAX_UPDATE_AGE");
            this.f33119i = j10;
            return this;
        }

        public a e(long j10) {
            boolean z10 = true;
            if (j10 != -1 && j10 < 0) {
                z10 = false;
            }
            AbstractC3191o.b(z10, "minUpdateIntervalMillis must be greater than or equal to 0, or IMPLICIT_MIN_UPDATE_INTERVAL");
            this.f33113c = j10;
            return this;
        }

        public a f(boolean z10) {
            this.f33118h = z10;
            return this;
        }

        public final a g(boolean z10) {
            this.f33123m = z10;
            return this;
        }

        public final a h(String str) {
            if (Build.VERSION.SDK_INT < 30) {
                this.f33122l = str;
            }
            return this;
        }

        public final a i(int i10) {
            int i11;
            boolean z10 = true;
            if (i10 != 0 && i10 != 1) {
                i11 = 2;
                if (i10 == 2) {
                    i10 = 2;
                    AbstractC3191o.c(z10, "throttle behavior %d must be a ThrottleBehavior.THROTTLE_* constant", Integer.valueOf(i10));
                    this.f33121k = i11;
                    return this;
                }
                z10 = false;
            }
            i11 = i10;
            AbstractC3191o.c(z10, "throttle behavior %d must be a ThrottleBehavior.THROTTLE_* constant", Integer.valueOf(i10));
            this.f33121k = i11;
            return this;
        }

        public final a j(WorkSource workSource) {
            this.f33124n = workSource;
            return this;
        }

        public a(LocationRequest locationRequest) {
            this.f33111a = locationRequest.Y();
            this.f33112b = locationRequest.j();
            this.f33113c = locationRequest.O();
            this.f33114d = locationRequest.l();
            this.f33115e = locationRequest.h();
            this.f33116f = locationRequest.m();
            this.f33117g = locationRequest.N();
            this.f33118h = locationRequest.d0();
            this.f33119i = locationRequest.k();
            this.f33120j = locationRequest.i();
            this.f33121k = locationRequest.j0();
            this.f33122l = locationRequest.zzd();
            this.f33123m = locationRequest.m0();
            this.f33124n = locationRequest.k0();
            this.f33125o = locationRequest.l0();
        }
    }

    public LocationRequest(int i10, long j10, long j11, long j12, long j13, long j14, int i11, float f10, boolean z10, long j15, int i12, int i13, String str, boolean z11, WorkSource workSource, zzd zzdVar) {
        this.f33096a = i10;
        this.f33097b = j10;
        this.f33098c = j11;
        this.f33099d = j12;
        this.f33100e = j13 == LongCompanionObject.MAX_VALUE ? j14 : Math.min(Math.max(1L, j13 - SystemClock.elapsedRealtime()), j14);
        this.f33101f = i11;
        this.f33102g = f10;
        this.f33103h = z10;
        this.f33104i = j15 != -1 ? j15 : j10;
        this.f33105j = i12;
        this.f33106k = i13;
        this.f33107l = str;
        this.f33108m = z11;
        this.f33109n = workSource;
        this.f33110o = zzdVar;
    }
}
