package com.google.android.gms.location;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.WorkSource;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.location.zzd;
import com.google.android.gms.internal.location.zzdj;
import com.unity3d.services.UnityAdsConstants;
import java.util.Arrays;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.cdi;
import xsna.dd80;
import xsna.dq70;
import xsna.exc0;
import xsna.exx0;
import xsna.fw3;
import xsna.is01;
import xsna.ozg0;

/* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
/* loaded from: classes12.dex */
public final class LocationRequest extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<LocationRequest> CREATOR = new is01();
    public int b;
    public long c;
    public long d;
    public final long e;
    public final long f;
    public int g;
    public final float h;
    public final boolean i;
    public long j;
    public final int k;
    public final int l;

    @Nullable
    public final String m;
    public final boolean n;
    public final WorkSource o;

    @Nullable
    public final zzd p;

    @Deprecated
    public LocationRequest() {
        this(102, 3600000L, 600000L, 0L, Long.MAX_VALUE, Long.MAX_VALUE, Integer.MAX_VALUE, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, true, 3600000L, 0, 0, null, false, new WorkSource(), null);
    }

    @NonNull
    @Deprecated
    public static LocationRequest i() {
        return new LocationRequest(102, 3600000L, 600000L, 0L, Long.MAX_VALUE, Long.MAX_VALUE, Integer.MAX_VALUE, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, true, 3600000L, 0, 0, null, false, new WorkSource(), null);
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof LocationRequest)) {
            return false;
        }
        LocationRequest locationRequest = (LocationRequest) obj;
        int i = this.b;
        if (i != locationRequest.b) {
            return false;
        }
        if ((i == 105 || this.c == locationRequest.c) && this.d == locationRequest.d && j() == locationRequest.j()) {
            return (!j() || this.e == locationRequest.e) && this.f == locationRequest.f && this.g == locationRequest.g && this.h == locationRequest.h && this.i == locationRequest.i && this.k == locationRequest.k && this.l == locationRequest.l && this.n == locationRequest.n && this.o.equals(locationRequest.o) && dq70.b(this.m, locationRequest.m) && dq70.b(this.p, locationRequest.p);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), Long.valueOf(this.c), Long.valueOf(this.d), this.o});
    }

    public final boolean j() {
        long j = this.e;
        return j > 0 && (j >> 1) >= this.c;
    }

    @NonNull
    @Deprecated
    public final void k(long j) {
        exc0.a("intervalMillis must be greater than or equal to 0", j >= 0);
        long j2 = this.d;
        long j3 = this.c;
        if (j2 == j3 / 6) {
            this.d = j / 6;
        }
        if (this.j == j3) {
            this.j = j;
        }
        this.c = j;
    }

    @NonNull
    @Deprecated
    public final void l() {
        this.g = 1;
    }

    @NonNull
    @Deprecated
    public final void n() {
        cdi.M(100);
        this.b = 100;
    }

    @NonNull
    public final String toString() {
        String str;
        StringBuilder e = fw3.e("Request[");
        int i = this.b;
        if (i == 105) {
            e.append(cdi.N(i));
        } else {
            e.append("@");
            if (j()) {
                zzdj.zzb(this.c, e);
                e.append(DomExceptionUtils.SEPARATOR);
                zzdj.zzb(this.e, e);
            } else {
                zzdj.zzb(this.c, e);
            }
            e.append(" ");
            e.append(cdi.N(this.b));
        }
        if (this.b == 105 || this.d != this.c) {
            e.append(", minUpdateInterval=");
            long j = this.d;
            e.append(j == Long.MAX_VALUE ? "∞" : zzdj.zza(j));
        }
        float f = this.h;
        if (f > ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
            e.append(", minUpdateDistance=");
            e.append(f);
        }
        if (this.b != 105 ? this.j != this.c : this.j != Long.MAX_VALUE) {
            e.append(", maxUpdateAge=");
            long j2 = this.j;
            e.append(j2 != Long.MAX_VALUE ? zzdj.zza(j2) : "∞");
        }
        long j3 = this.f;
        if (j3 != Long.MAX_VALUE) {
            e.append(", duration=");
            zzdj.zzb(j3, e);
        }
        if (this.g != Integer.MAX_VALUE) {
            e.append(", maxUpdates=");
            e.append(this.g);
        }
        int i2 = this.l;
        if (i2 != 0) {
            e.append(", ");
            if (i2 == 0) {
                str = "THROTTLE_BACKGROUND";
            } else if (i2 == 1) {
                str = "THROTTLE_ALWAYS";
            } else {
                if (i2 != 2) {
                    throw new IllegalArgumentException();
                }
                str = "THROTTLE_NEVER";
            }
            e.append(str);
        }
        int i3 = this.k;
        if (i3 != 0) {
            e.append(", ");
            e.append(dd80.k(i3));
        }
        if (this.i) {
            e.append(", waitForAccurateLocation");
        }
        if (this.n) {
            e.append(", bypass");
        }
        String str2 = this.m;
        if (str2 != null) {
            e.append(", moduleId=");
            e.append(str2);
        }
        WorkSource workSource = this.o;
        if (!exx0.b(workSource)) {
            e.append(", ");
            e.append(workSource);
        }
        zzd zzdVar = this.p;
        if (zzdVar != null) {
            e.append(", impersonation=");
            e.append(zzdVar);
        }
        e.append(']');
        return e.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        int i2 = this.b;
        ozg0.v(parcel, 1, 4);
        parcel.writeInt(i2);
        long j = this.c;
        ozg0.v(parcel, 2, 8);
        parcel.writeLong(j);
        long j2 = this.d;
        ozg0.v(parcel, 3, 8);
        parcel.writeLong(j2);
        int i3 = this.g;
        ozg0.v(parcel, 6, 4);
        parcel.writeInt(i3);
        ozg0.v(parcel, 7, 4);
        parcel.writeFloat(this.h);
        ozg0.v(parcel, 8, 8);
        parcel.writeLong(this.e);
        ozg0.v(parcel, 9, 4);
        parcel.writeInt(this.i ? 1 : 0);
        ozg0.v(parcel, 10, 8);
        parcel.writeLong(this.f);
        long j3 = this.j;
        ozg0.v(parcel, 11, 8);
        parcel.writeLong(j3);
        ozg0.v(parcel, 12, 4);
        parcel.writeInt(this.k);
        ozg0.v(parcel, 13, 4);
        parcel.writeInt(this.l);
        ozg0.q(parcel, 14, this.m, false);
        ozg0.v(parcel, 15, 4);
        parcel.writeInt(this.n ? 1 : 0);
        ozg0.p(parcel, 16, this.o, i, false);
        ozg0.p(parcel, 17, this.p, i, false);
        ozg0.x(w, parcel);
    }

    /* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
    public static final class a {
        public final int a;
        public final long b;
        public long c;
        public final long d;
        public long e;
        public final int f;
        public final float g;
        public boolean h;
        public long i;
        public int j;
        public int k;

        @Nullable
        public String l;
        public boolean m;

        @Nullable
        public WorkSource n;

        @Nullable
        public final zzd o;

        public a(int i) {
            cdi.M(i);
            this.a = i;
            this.b = 0L;
            this.c = -1L;
            this.d = 0L;
            this.e = Long.MAX_VALUE;
            this.f = Integer.MAX_VALUE;
            this.g = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.h = true;
            this.i = -1L;
            this.j = 0;
            this.k = 0;
            this.l = null;
            this.m = false;
            this.n = null;
            this.o = null;
        }

        @NonNull
        public final LocationRequest a() {
            long j = this.c;
            int i = this.a;
            long j2 = this.b;
            if (j == -1) {
                j = j2;
            } else if (i != 105) {
                j = Math.min(j, j2);
            }
            long j3 = this.d;
            long j4 = this.b;
            long max = Math.max(j3, j4);
            long j5 = j;
            long j6 = this.e;
            boolean z = this.h;
            long j7 = this.i;
            return new LocationRequest(i, j2, j5, max, Long.MAX_VALUE, j6, this.f, this.g, z, j7 == -1 ? j4 : j7, this.j, this.k, this.l, this.m, new WorkSource(this.n), this.o);
        }

        @NonNull
        public final void b(long j) {
            exc0.a("durationMillis must be greater than 0", j > 0);
            this.e = j;
        }

        @NonNull
        public final void c(int i) {
            int i2;
            boolean z = true;
            if (i != 0 && i != 1) {
                i2 = 2;
                if (i != 2) {
                    z = false;
                }
                exc0.c(z, "granularity %d must be a Granularity.GRANULARITY_* constant", Integer.valueOf(i2));
                this.j = i;
            }
            i2 = i;
            exc0.c(z, "granularity %d must be a Granularity.GRANULARITY_* constant", Integer.valueOf(i2));
            this.j = i;
        }

        @NonNull
        public final void d(long j) {
            boolean z = true;
            if (j != -1 && j < 0) {
                z = false;
            }
            exc0.a("maxUpdateAgeMillis must be greater than or equal to 0, or IMPLICIT_MAX_UPDATE_AGE", z);
            this.i = j;
        }

        @NonNull
        public final void e() {
            this.c = 0L;
        }

        @NonNull
        public final void f() {
            this.h = true;
        }

        @NonNull
        public final void g(boolean z) {
            this.m = z;
        }

        @NonNull
        @Deprecated
        public final void h(@Nullable String str) {
            if (Build.VERSION.SDK_INT < 30) {
                this.l = str;
            }
        }

        @NonNull
        public final void i(int i) {
            int i2;
            boolean z = true;
            if (i != 0 && i != 1) {
                i2 = 2;
                if (i == 2) {
                    i = 2;
                    exc0.c(z, "throttle behavior %d must be a ThrottleBehavior.THROTTLE_* constant", Integer.valueOf(i));
                    this.k = i2;
                }
                z = false;
            }
            i2 = i;
            exc0.c(z, "throttle behavior %d must be a ThrottleBehavior.THROTTLE_* constant", Integer.valueOf(i));
            this.k = i2;
        }

        @NonNull
        public final void j(@Nullable WorkSource workSource) {
            this.n = workSource;
        }

        public a(@NonNull LocationRequest locationRequest) {
            this.a = locationRequest.b;
            this.b = locationRequest.c;
            this.c = locationRequest.d;
            this.d = locationRequest.e;
            this.e = locationRequest.f;
            this.f = locationRequest.g;
            this.g = locationRequest.h;
            this.h = locationRequest.i;
            this.i = locationRequest.j;
            this.j = locationRequest.k;
            this.k = locationRequest.l;
            this.l = locationRequest.m;
            this.m = locationRequest.n;
            this.n = locationRequest.o;
            this.o = locationRequest.p;
        }
    }

    public LocationRequest(int i, long j, long j2, long j3, long j4, long j5, int i2, float f, boolean z, long j6, int i3, int i4, @Nullable String str, boolean z2, WorkSource workSource, @Nullable zzd zzdVar) {
        this.b = i;
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.f = j4 == Long.MAX_VALUE ? j5 : Math.min(Math.max(1L, j4 - SystemClock.elapsedRealtime()), j5);
        this.g = i2;
        this.h = f;
        this.i = z;
        this.j = j6 != -1 ? j6 : j;
        this.k = i3;
        this.l = i4;
        this.m = str;
        this.n = z2;
        this.o = workSource;
        this.p = zzdVar;
    }
}
