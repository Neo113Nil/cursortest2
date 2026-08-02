package com.google.android.gms.location;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.location.zzd;
import com.google.android.gms.internal.location.zzdj;
import java.util.Arrays;
import ru.ok.tracer.base.ucum.UcumUtils;
import xsna.cdi;
import xsna.dd80;
import xsna.dq70;
import xsna.exc0;
import xsna.exx0;
import xsna.fw3;
import xsna.ozg0;
import xsna.tg01;
import xsna.tj0;

/* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
/* loaded from: classes12.dex */
public final class CurrentLocationRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<CurrentLocationRequest> CREATOR = new tg01();
    public final long b;
    public final int c;
    public final int d;
    public final long e;
    public final boolean f;
    public final int g;

    @Nullable
    public final String h;
    public final WorkSource i;

    @Nullable
    public final zzd j;

    /* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
    public static final class a {
        public int a = 102;

        @NonNull
        public final CurrentLocationRequest a() {
            return new CurrentLocationRequest(60000L, 0, this.a, Long.MAX_VALUE, false, 0, null, new WorkSource(null), null);
        }

        @NonNull
        public final void b(int i) {
            cdi.M(i);
            this.a = i;
        }
    }

    public CurrentLocationRequest(long j, int i, int i2, long j2, boolean z, int i3, @Nullable String str, WorkSource workSource, @Nullable zzd zzdVar) {
        boolean z2 = true;
        if (Build.VERSION.SDK_INT >= 30 && str != null) {
            z2 = false;
        }
        exc0.b(z2);
        this.b = j;
        this.c = i;
        this.d = i2;
        this.e = j2;
        this.f = z;
        this.g = i3;
        this.h = str;
        this.i = workSource;
        this.j = zzdVar;
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof CurrentLocationRequest)) {
            return false;
        }
        CurrentLocationRequest currentLocationRequest = (CurrentLocationRequest) obj;
        return this.b == currentLocationRequest.b && this.c == currentLocationRequest.c && this.d == currentLocationRequest.d && this.e == currentLocationRequest.e && this.f == currentLocationRequest.f && this.g == currentLocationRequest.g && dq70.b(this.h, currentLocationRequest.h) && dq70.b(this.i, currentLocationRequest.i) && dq70.b(this.j, currentLocationRequest.j);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.d), Long.valueOf(this.e)});
    }

    public final long i() {
        return this.e;
    }

    public final int j() {
        return this.c;
    }

    public final long k() {
        return this.b;
    }

    public final int l() {
        return this.d;
    }

    @NonNull
    public final WorkSource n() {
        return this.i;
    }

    public final boolean o() {
        return this.f;
    }

    @NonNull
    public final String toString() {
        String str;
        StringBuilder e = fw3.e("CurrentLocationRequest[");
        e.append(cdi.N(this.d));
        long j = this.b;
        if (j != Long.MAX_VALUE) {
            e.append(", maxAge=");
            zzdj.zzb(j, e);
        }
        long j2 = this.e;
        if (j2 != Long.MAX_VALUE) {
            tj0.d(e, ", duration=", j2, UcumUtils.UCUM_MILLISECODS);
        }
        int i = this.c;
        if (i != 0) {
            e.append(", ");
            e.append(dd80.k(i));
        }
        if (this.f) {
            e.append(", bypass");
        }
        int i2 = this.g;
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
        String str2 = this.h;
        if (str2 != null) {
            e.append(", moduleId=");
            e.append(str2);
        }
        WorkSource workSource = this.i;
        if (!exx0.b(workSource)) {
            e.append(", workSource=");
            e.append(workSource);
        }
        zzd zzdVar = this.j;
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
        ozg0.v(parcel, 1, 8);
        parcel.writeLong(this.b);
        ozg0.v(parcel, 2, 4);
        parcel.writeInt(this.c);
        ozg0.v(parcel, 3, 4);
        parcel.writeInt(this.d);
        ozg0.v(parcel, 4, 8);
        parcel.writeLong(this.e);
        ozg0.v(parcel, 5, 4);
        parcel.writeInt(this.f ? 1 : 0);
        ozg0.p(parcel, 6, this.i, i, false);
        ozg0.v(parcel, 7, 4);
        parcel.writeInt(this.g);
        ozg0.q(parcel, 8, this.h, false);
        ozg0.p(parcel, 9, this.j, i, false);
        ozg0.x(w, parcel);
    }

    public final int zza() {
        return this.g;
    }

    @Nullable
    @Deprecated
    public final String zzd() {
        return this.h;
    }
}
