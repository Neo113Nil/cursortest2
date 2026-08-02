package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes2.dex */
public class ClientIdentity extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<ClientIdentity> CREATOR = new C3196u();

    /* renamed from: a, reason: collision with root package name */
    public final int f32622a;

    /* renamed from: b, reason: collision with root package name */
    public final String f32623b;

    public ClientIdentity(int i10, String str) {
        this.f32622a = i10;
        this.f32623b = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ClientIdentity)) {
            return false;
        }
        ClientIdentity clientIdentity = (ClientIdentity) obj;
        return clientIdentity.f32622a == this.f32622a && AbstractC3189m.b(clientIdentity.f32623b, this.f32623b);
    }

    public final int hashCode() {
        return this.f32622a;
    }

    public final String toString() {
        return this.f32622a + ":" + this.f32623b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f32622a;
        int a10 = E9.b.a(parcel);
        E9.b.u(parcel, 1, i11);
        E9.b.F(parcel, 2, this.f32623b, false);
        E9.b.b(parcel, a10);
    }
}
