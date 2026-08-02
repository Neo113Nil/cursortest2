package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.libs.identity.ClientIdentity;
import g6.v;
import h8.b;
import java.util.Arrays;
import n6.a;
import v.f;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class zzad extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzad> CREATOR = new a(8);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f5756a;

    /* renamed from: b, reason: collision with root package name */
    public final ClientIdentity f5757b;

    public zzad(boolean z5, ClientIdentity clientIdentity) {
        this.f5756a = z5;
        this.f5757b = clientIdentity;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzad)) {
            return false;
        }
        zzad zzadVar = (zzad) obj;
        return this.f5756a == zzadVar.f5756a && v.k(this.f5757b, zzadVar.f5757b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f5756a)});
    }

    public final String toString() {
        StringBuilder b10 = f.b("LocationAvailabilityRequest[");
        if (this.f5756a) {
            b10.append("bypass, ");
        }
        ClientIdentity clientIdentity = this.f5757b;
        if (clientIdentity != null) {
            b10.append("impersonation=");
            b10.append(clientIdentity);
            b10.append(", ");
        }
        b10.setLength(b10.length() - 2);
        b10.append(']');
        return b10.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int V = b.V(parcel, 20293);
        b.U(parcel, 1, 4);
        parcel.writeInt(this.f5756a ? 1 : 0);
        b.N(parcel, 2, this.f5757b, i5, false);
        b.W(parcel, V);
    }
}
