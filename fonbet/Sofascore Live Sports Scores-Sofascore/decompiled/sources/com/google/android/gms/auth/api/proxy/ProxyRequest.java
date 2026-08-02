package com.google.android.gms.auth.api.proxy;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdkWithMembers;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import defpackage.vxd;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@ShowFirstParty
@KeepForSdkWithMembers
@SafeParcelable.Class
/* loaded from: classes3.dex */
public class ProxyRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<ProxyRequest> CREATOR = new zza();
    public final String a;
    public final int b;
    public final long c;
    public final byte[] d;
    public final int e;
    public final Bundle f;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @ShowFirstParty
    @KeepForSdkWithMembers
    public static class Builder {
    }

    public ProxyRequest(int i, String str, int i2, long j, byte[] bArr, Bundle bundle) {
        this.e = i;
        this.a = str;
        this.b = i2;
        this.c = j;
        this.d = bArr;
        this.f = bundle;
    }

    public final String toString() {
        return vxd.k(this.b, "ProxyRequest[ url: ", this.a, ", method: ", " ]");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = SafeParcelWriter.s(parcel, 20293);
        SafeParcelWriter.m(parcel, 1, this.a, false);
        SafeParcelWriter.r(parcel, 2, 4);
        parcel.writeInt(this.b);
        SafeParcelWriter.r(parcel, 3, 8);
        parcel.writeLong(this.c);
        SafeParcelWriter.c(parcel, 4, this.d, false);
        SafeParcelWriter.b(parcel, 5, this.f);
        SafeParcelWriter.r(parcel, 1000, 4);
        parcel.writeInt(this.e);
        SafeParcelWriter.t(parcel, s);
    }
}
