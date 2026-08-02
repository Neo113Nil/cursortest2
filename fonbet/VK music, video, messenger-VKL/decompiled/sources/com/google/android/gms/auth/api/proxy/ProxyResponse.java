package com.google.android.gms.auth.api.proxy;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import xsna.ozg0;
import xsna.p101;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes12.dex */
public class ProxyResponse extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<ProxyResponse> CREATOR = new p101();
    public final int b;

    @NonNull
    public final PendingIntent c;
    public final int d;

    @NonNull
    public final byte[] e;
    public final int f;
    public final Bundle g;

    public ProxyResponse(int i, int i2, PendingIntent pendingIntent, int i3, Bundle bundle, byte[] bArr) {
        this.f = i;
        this.b = i2;
        this.d = i3;
        this.g = bundle;
        this.e = bArr;
        this.c = pendingIntent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.v(parcel, 1, 4);
        parcel.writeInt(this.b);
        ozg0.p(parcel, 2, this.c, i, false);
        ozg0.v(parcel, 3, 4);
        parcel.writeInt(this.d);
        ozg0.d(parcel, 4, this.g, false);
        ozg0.e(parcel, 5, this.e, false);
        ozg0.v(parcel, 1000, 4);
        parcel.writeInt(this.f);
        ozg0.x(w, parcel);
    }
}
