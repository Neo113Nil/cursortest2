package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.WorkSource;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.WorkSourceUtil;
import com.google.android.gms.internal.identity.ClientIdentity;
import com.google.android.gms.internal.identity.zzeo;
import com.unity3d.services.UnityAdsConstants;
import defpackage.fc6;
import defpackage.ilg;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes3.dex */
public final class LocationRequest extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<LocationRequest> CREATOR = new zzaf();
    public final int a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final int f;
    public final float g;
    public final boolean h;
    public final long i;
    public final int j;
    public final int k;
    public final boolean l;
    public final WorkSource m;
    public final ClientIdentity n;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class Builder {
        public int a;
        public long b;
        public long c;
        public long d;
        public long e;
        public int f;
        public float g;
        public boolean h;
        public long i;
        public int j;
        public int k;
        public boolean l;
        public WorkSource m;
        public ClientIdentity n;
    }

    public LocationRequest(int i, long j, long j2, long j3, long j4, long j5, int i2, float f, boolean z, long j6, int i3, int i4, boolean z2, WorkSource workSource, ClientIdentity clientIdentity) {
        this.a = i;
        if (i == 105) {
            this.b = Long.MAX_VALUE;
        } else {
            this.b = j;
        }
        this.c = j2;
        this.d = j3;
        this.e = j4 == Long.MAX_VALUE ? j5 : Math.min(Math.max(1L, j4 - SystemClock.elapsedRealtime()), j5);
        this.f = i2;
        this.g = f;
        this.h = z;
        this.i = j6 != -1 ? j6 : j;
        this.j = i3;
        this.k = i4;
        this.l = z2;
        this.m = workSource;
        this.n = clientIdentity;
    }

    public static String Z0(long j) {
        String sb;
        if (j == Long.MAX_VALUE) {
            return "∞";
        }
        StringBuilder sb2 = zzeo.b;
        synchronized (sb2) {
            sb2.setLength(0);
            zzeo.a(j, sb2);
            sb = sb2.toString();
        }
        return sb;
    }

    public final boolean Y0() {
        long j = this.d;
        return j > 0 && (j >> 1) >= this.b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof LocationRequest)) {
            return false;
        }
        LocationRequest locationRequest = (LocationRequest) obj;
        int i = locationRequest.a;
        int i2 = this.a;
        if (i2 != i) {
            return false;
        }
        if ((i2 == 105 || this.b == locationRequest.b) && this.c == locationRequest.c && Y0() == locationRequest.Y0()) {
            return (!Y0() || this.d == locationRequest.d) && this.e == locationRequest.e && this.f == locationRequest.f && this.g == locationRequest.g && this.h == locationRequest.h && this.j == locationRequest.j && this.k == locationRequest.k && this.l == locationRequest.l && this.m.equals(locationRequest.m) && Objects.a(this.n, locationRequest.n);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Long.valueOf(this.b), Long.valueOf(this.c), this.m});
    }

    public final String toString() {
        String str;
        StringBuilder q = fc6.q("Request[");
        int i = this.a;
        long j = this.b;
        long j2 = this.d;
        if (i == 105) {
            q.append(zzan.a(i));
            if (j2 > 0) {
                q.append("/");
                zzeo.a(j2, q);
            }
        } else {
            q.append("@");
            if (Y0()) {
                zzeo.a(j, q);
                q.append("/");
                zzeo.a(j2, q);
            } else {
                zzeo.a(j, q);
            }
            q.append(" ");
            q.append(zzan.a(i));
        }
        long j3 = this.c;
        if (i == 105 || j3 != j) {
            q.append(", minUpdateInterval=");
            q.append(Z0(j3));
        }
        float f = this.g;
        if (f > 0.0d) {
            q.append(", minUpdateDistance=");
            q.append(f);
        }
        long j4 = this.i;
        if (i != 105 ? j4 != j : j4 != Long.MAX_VALUE) {
            q.append(", maxUpdateAge=");
            q.append(Z0(j4));
        }
        long j5 = this.e;
        if (j5 != Long.MAX_VALUE) {
            q.append(", duration=");
            zzeo.a(j5, q);
        }
        int i2 = this.f;
        if (i2 != Integer.MAX_VALUE) {
            q.append(", maxUpdates=");
            q.append(i2);
        }
        int i3 = this.k;
        if (i3 != 0) {
            q.append(", ");
            if (i3 == 0) {
                str = "THROTTLE_BACKGROUND";
            } else if (i3 == 1) {
                str = "THROTTLE_ALWAYS";
            } else {
                if (i3 != 2) {
                    ilg.c();
                    return null;
                }
                str = "THROTTLE_NEVER";
            }
            q.append(str);
        }
        int i4 = this.j;
        if (i4 != 0) {
            q.append(", ");
            q.append(zzq.a(i4));
        }
        if (this.h) {
            q.append(", waitForAccurateLocation");
        }
        if (this.l) {
            q.append(", bypass");
        }
        WorkSource workSource = this.m;
        if (!WorkSourceUtil.b(workSource)) {
            q.append(", ");
            q.append(workSource);
        }
        ClientIdentity clientIdentity = this.n;
        if (clientIdentity != null) {
            q.append(", impersonation=");
            q.append(clientIdentity);
        }
        q.append(']');
        return q.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = SafeParcelWriter.s(parcel, 20293);
        SafeParcelWriter.r(parcel, 1, 4);
        parcel.writeInt(this.a);
        SafeParcelWriter.r(parcel, 2, 8);
        parcel.writeLong(this.b);
        SafeParcelWriter.r(parcel, 3, 8);
        parcel.writeLong(this.c);
        SafeParcelWriter.r(parcel, 6, 4);
        parcel.writeInt(this.f);
        SafeParcelWriter.r(parcel, 7, 4);
        parcel.writeFloat(this.g);
        SafeParcelWriter.r(parcel, 8, 8);
        parcel.writeLong(this.d);
        SafeParcelWriter.r(parcel, 9, 4);
        parcel.writeInt(this.h ? 1 : 0);
        SafeParcelWriter.r(parcel, 10, 8);
        parcel.writeLong(this.e);
        SafeParcelWriter.r(parcel, 11, 8);
        parcel.writeLong(this.i);
        SafeParcelWriter.r(parcel, 12, 4);
        parcel.writeInt(this.j);
        SafeParcelWriter.r(parcel, 13, 4);
        parcel.writeInt(this.k);
        SafeParcelWriter.r(parcel, 15, 4);
        parcel.writeInt(this.l ? 1 : 0);
        SafeParcelWriter.l(parcel, 16, this.m, i, false);
        SafeParcelWriter.l(parcel, 17, this.n, i, false);
        SafeParcelWriter.t(parcel, s);
    }

    @Deprecated
    public LocationRequest() {
        this(102, 3600000L, TTAdConstant.AD_MAX_EVENT_TIME, 0L, Long.MAX_VALUE, Long.MAX_VALUE, Integer.MAX_VALUE, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, true, 3600000L, 0, 0, false, new WorkSource(), null);
    }
}
