package com.google.android.gms.auth.api.proxy;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import xsna.iq;
import xsna.ozg0;
import xsna.ptz0;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes12.dex */
public class ProxyRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<ProxyRequest> CREATOR = new ptz0();

    @NonNull
    public final String b;
    public final int c;
    public final long d;

    @NonNull
    public final byte[] e;
    public final int f;
    public final Bundle g;

    public ProxyRequest(int i, String str, int i2, long j, byte[] bArr, Bundle bundle) {
        this.f = i;
        this.b = str;
        this.c = i2;
        this.d = j;
        this.e = bArr;
        this.g = bundle;
    }

    @NonNull
    public final String toString() {
        return iq.a(this.c, "ProxyRequest[ url: ", this.b, ", method: ", " ]");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.q(parcel, 1, this.b, false);
        ozg0.v(parcel, 2, 4);
        parcel.writeInt(this.c);
        ozg0.v(parcel, 3, 8);
        parcel.writeLong(this.d);
        ozg0.e(parcel, 4, this.e, false);
        ozg0.d(parcel, 5, this.g, false);
        ozg0.v(parcel, 1000, 4);
        parcel.writeInt(this.f);
        ozg0.x(w, parcel);
    }
}
