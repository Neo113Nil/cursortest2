package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.identity.ClientIdentity;
import defpackage.fc6;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@SafeParcelable.Class
/* loaded from: classes3.dex */
public final class zzad extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzad> CREATOR = new zzae();
    public final boolean a;
    public final ClientIdentity b;

    public zzad(boolean z, ClientIdentity clientIdentity) {
        this.a = z;
        this.b = clientIdentity;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzad)) {
            return false;
        }
        zzad zzadVar = (zzad) obj;
        return this.a == zzadVar.a && Objects.a(this.b, zzadVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a)});
    }

    public final String toString() {
        StringBuilder q = fc6.q("LocationAvailabilityRequest[");
        if (this.a) {
            q.append("bypass, ");
        }
        ClientIdentity clientIdentity = this.b;
        if (clientIdentity != null) {
            q.append("impersonation=");
            q.append(clientIdentity);
            q.append(", ");
        }
        q.setLength(q.length() - 2);
        q.append(']');
        return q.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = SafeParcelWriter.s(parcel, 20293);
        SafeParcelWriter.r(parcel, 1, 4);
        parcel.writeInt(this.a ? 1 : 0);
        SafeParcelWriter.l(parcel, 2, this.b, i, false);
        SafeParcelWriter.t(parcel, s);
    }
}
