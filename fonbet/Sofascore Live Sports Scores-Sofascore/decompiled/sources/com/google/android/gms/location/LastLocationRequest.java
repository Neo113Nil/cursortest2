package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.identity.ClientIdentity;
import com.google.android.gms.internal.identity.zzeo;
import defpackage.fc6;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes3.dex */
public final class LastLocationRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<LastLocationRequest> CREATOR = new zzaa();
    public final long a;
    public final int b;
    public final boolean c;
    public final ClientIdentity d;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* loaded from: classes.dex */
    public static final class Builder {
    }

    public LastLocationRequest(long j, int i, boolean z, ClientIdentity clientIdentity) {
        this.a = j;
        this.b = i;
        this.c = z;
        this.d = clientIdentity;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof LastLocationRequest)) {
            return false;
        }
        LastLocationRequest lastLocationRequest = (LastLocationRequest) obj;
        return this.a == lastLocationRequest.a && this.b == lastLocationRequest.b && this.c == lastLocationRequest.c && Objects.a(this.d, lastLocationRequest.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), Integer.valueOf(this.b), Boolean.valueOf(this.c)});
    }

    public final String toString() {
        StringBuilder q = fc6.q("LastLocationRequest[");
        long j = this.a;
        if (j != Long.MAX_VALUE) {
            q.append("maxAge=");
            zzeo.a(j, q);
        }
        int i = this.b;
        if (i != 0) {
            q.append(", ");
            q.append(zzq.a(i));
        }
        if (this.c) {
            q.append(", bypass");
        }
        ClientIdentity clientIdentity = this.d;
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
        parcel.writeInt(this.c ? 1 : 0);
        SafeParcelWriter.l(parcel, 5, this.d, i, false);
        SafeParcelWriter.t(parcel, s);
    }
}
