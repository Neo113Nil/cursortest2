package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import g6.j;
import g6.v;
import h8.b;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class ClientIdentity extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<ClientIdentity> CREATOR = new j(0);

    /* renamed from: a, reason: collision with root package name */
    public final int f4495a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4496b;

    public ClientIdentity(int i5, String str) {
        this.f4495a = i5;
        this.f4496b = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ClientIdentity)) {
            return false;
        }
        ClientIdentity clientIdentity = (ClientIdentity) obj;
        return clientIdentity.f4495a == this.f4495a && v.k(clientIdentity.f4496b, this.f4496b);
    }

    public final int hashCode() {
        return this.f4495a;
    }

    public final String toString() {
        int i5 = this.f4495a;
        int length = String.valueOf(i5).length();
        String str = this.f4496b;
        StringBuilder sb2 = new StringBuilder(length + 1 + String.valueOf(str).length());
        sb2.append(i5);
        sb2.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
        sb2.append(str);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int V = b.V(parcel, 20293);
        b.U(parcel, 1, 4);
        parcel.writeInt(this.f4495a);
        b.O(parcel, 2, this.f4496b, false);
        b.W(parcel, V);
    }
}
