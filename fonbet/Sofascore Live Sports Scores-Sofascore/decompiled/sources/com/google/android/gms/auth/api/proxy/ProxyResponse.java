package com.google.android.gms.auth.api.proxy;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdkWithMembers;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@ShowFirstParty
@KeepForSdkWithMembers
@SafeParcelable.Class
/* loaded from: classes3.dex */
public class ProxyResponse extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<ProxyResponse> CREATOR = new zzb();
    public final int a;
    public final PendingIntent b;
    public final int c;
    public final byte[] d;
    public final int e;
    public final Bundle f;

    public ProxyResponse(int i, int i2, PendingIntent pendingIntent, int i3, Bundle bundle, byte[] bArr) {
        this.e = i;
        this.a = i2;
        this.c = i3;
        this.f = bundle;
        this.d = bArr;
        this.b = pendingIntent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = SafeParcelWriter.s(parcel, 20293);
        SafeParcelWriter.r(parcel, 1, 4);
        parcel.writeInt(this.a);
        SafeParcelWriter.l(parcel, 2, this.b, i, false);
        SafeParcelWriter.r(parcel, 3, 4);
        parcel.writeInt(this.c);
        SafeParcelWriter.b(parcel, 4, this.f);
        SafeParcelWriter.c(parcel, 5, this.d, false);
        SafeParcelWriter.r(parcel, 1000, 4);
        parcel.writeInt(this.e);
        SafeParcelWriter.t(parcel, s);
    }
}
