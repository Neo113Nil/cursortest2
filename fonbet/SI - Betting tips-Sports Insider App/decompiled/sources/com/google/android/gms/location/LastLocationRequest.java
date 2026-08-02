package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
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
public final class LastLocationRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<LastLocationRequest> CREATOR = new a(6);

    /* renamed from: a, reason: collision with root package name */
    public final long f5705a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5706b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f5707c;

    /* renamed from: d, reason: collision with root package name */
    public final ClientIdentity f5708d;

    public LastLocationRequest(long j, int i5, boolean z5, ClientIdentity clientIdentity) {
        this.f5705a = j;
        this.f5706b = i5;
        this.f5707c = z5;
        this.f5708d = clientIdentity;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof LastLocationRequest)) {
            return false;
        }
        LastLocationRequest lastLocationRequest = (LastLocationRequest) obj;
        return this.f5705a == lastLocationRequest.f5705a && this.f5706b == lastLocationRequest.f5706b && this.f5707c == lastLocationRequest.f5707c && v.k(this.f5708d, lastLocationRequest.f5708d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f5705a), Integer.valueOf(this.f5706b), Boolean.valueOf(this.f5707c)});
    }

    public final String toString() {
        StringBuilder b10 = f.b("LastLocationRequest[");
        long j = this.f5705a;
        if (j != LongCompanionObject.MAX_VALUE) {
            b10.append("maxAge=");
            j.a(j, b10);
        }
        int i5 = this.f5706b;
        if (i5 != 0) {
            b10.append(", ");
            b10.append(e.c(i5));
        }
        if (this.f5707c) {
            b10.append(", bypass");
        }
        ClientIdentity clientIdentity = this.f5708d;
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
        b.U(parcel, 1, 8);
        parcel.writeLong(this.f5705a);
        b.U(parcel, 2, 4);
        parcel.writeInt(this.f5706b);
        b.U(parcel, 3, 4);
        parcel.writeInt(this.f5707c ? 1 : 0);
        b.N(parcel, 5, this.f5708d, i5, false);
        b.W(parcel, V);
    }
}
