package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.location.zzd;
import com.google.android.gms.internal.location.zzdj;
import java.util.Arrays;
import xsna.dd80;
import xsna.dq70;
import xsna.fw3;
import xsna.ir01;
import xsna.ozg0;

/* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
/* loaded from: classes.dex */
public final class LastLocationRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<LastLocationRequest> CREATOR = new ir01();
    public final long b;
    public final int c;
    public final boolean d;

    @Nullable
    public final String e;

    @Nullable
    public final zzd f;

    public LastLocationRequest(long j, int i, boolean z, @Nullable String str, @Nullable zzd zzdVar) {
        this.b = j;
        this.c = i;
        this.d = z;
        this.e = str;
        this.f = zzdVar;
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof LastLocationRequest)) {
            return false;
        }
        LastLocationRequest lastLocationRequest = (LastLocationRequest) obj;
        return this.b == lastLocationRequest.b && this.c == lastLocationRequest.c && this.d == lastLocationRequest.d && dq70.b(this.e, lastLocationRequest.e) && dq70.b(this.f, lastLocationRequest.f);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.b), Integer.valueOf(this.c), Boolean.valueOf(this.d)});
    }

    @NonNull
    public final String toString() {
        StringBuilder e = fw3.e("LastLocationRequest[");
        long j = this.b;
        if (j != Long.MAX_VALUE) {
            e.append("maxAge=");
            zzdj.zzb(j, e);
        }
        int i = this.c;
        if (i != 0) {
            e.append(", ");
            e.append(dd80.k(i));
        }
        if (this.d) {
            e.append(", bypass");
        }
        String str = this.e;
        if (str != null) {
            e.append(", moduleId=");
            e.append(str);
        }
        zzd zzdVar = this.f;
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
        parcel.writeInt(this.d ? 1 : 0);
        ozg0.q(parcel, 4, this.e, false);
        ozg0.p(parcel, 5, this.f, i, false);
        ozg0.x(w, parcel);
    }
}
