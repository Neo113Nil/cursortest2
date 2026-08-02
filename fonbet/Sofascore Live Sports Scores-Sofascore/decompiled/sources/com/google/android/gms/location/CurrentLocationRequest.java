package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.WorkSourceUtil;
import com.google.android.gms.internal.identity.ClientIdentity;
import com.google.android.gms.internal.identity.zzeo;
import defpackage.fc6;
import defpackage.fn0;
import defpackage.ilg;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes3.dex */
public final class CurrentLocationRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<CurrentLocationRequest> CREATOR = new zzj();
    public final long a;
    public final int b;
    public final int c;
    public final long d;
    public final boolean e;
    public final int f;
    public final WorkSource g;
    public final ClientIdentity h;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class Builder {
    }

    public CurrentLocationRequest(long j, int i, int i2, long j2, boolean z, int i3, WorkSource workSource, ClientIdentity clientIdentity) {
        this.a = j;
        this.b = i;
        this.c = i2;
        this.d = j2;
        this.e = z;
        this.f = i3;
        this.g = workSource;
        this.h = clientIdentity;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof CurrentLocationRequest)) {
            return false;
        }
        CurrentLocationRequest currentLocationRequest = (CurrentLocationRequest) obj;
        return this.a == currentLocationRequest.a && this.b == currentLocationRequest.b && this.c == currentLocationRequest.c && this.d == currentLocationRequest.d && this.e == currentLocationRequest.e && this.f == currentLocationRequest.f && Objects.a(this.g, currentLocationRequest.g) && Objects.a(this.h, currentLocationRequest.h);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c), Long.valueOf(this.d)});
    }

    public final String toString() {
        String str;
        StringBuilder q = fc6.q("CurrentLocationRequest[");
        q.append(zzan.a(this.c));
        long j = this.a;
        if (j != Long.MAX_VALUE) {
            q.append(", maxAge=");
            zzeo.a(j, q);
        }
        long j2 = this.d;
        if (j2 != Long.MAX_VALUE) {
            fn0.t(j2, ", duration=", "ms", q);
        }
        int i = this.b;
        if (i != 0) {
            q.append(", ");
            q.append(zzq.a(i));
        }
        if (this.e) {
            q.append(", bypass");
        }
        int i2 = this.f;
        if (i2 != 0) {
            q.append(", ");
            if (i2 == 0) {
                str = "THROTTLE_BACKGROUND";
            } else if (i2 == 1) {
                str = "THROTTLE_ALWAYS";
            } else {
                if (i2 != 2) {
                    ilg.c();
                    return null;
                }
                str = "THROTTLE_NEVER";
            }
            q.append(str);
        }
        WorkSource workSource = this.g;
        if (!WorkSourceUtil.b(workSource)) {
            q.append(", workSource=");
            q.append(workSource);
        }
        ClientIdentity clientIdentity = this.h;
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
        SafeParcelWriter.r(parcel, 1, 8);
        parcel.writeLong(this.a);
        SafeParcelWriter.r(parcel, 2, 4);
        parcel.writeInt(this.b);
        SafeParcelWriter.r(parcel, 3, 4);
        parcel.writeInt(this.c);
        SafeParcelWriter.r(parcel, 4, 8);
        parcel.writeLong(this.d);
        SafeParcelWriter.r(parcel, 5, 4);
        parcel.writeInt(this.e ? 1 : 0);
        SafeParcelWriter.l(parcel, 6, this.g, i, false);
        SafeParcelWriter.r(parcel, 7, 4);
        parcel.writeInt(this.f);
        SafeParcelWriter.l(parcel, 9, this.h, i, false);
        SafeParcelWriter.t(parcel, s);
    }
}
