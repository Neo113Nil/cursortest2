package com.google.android.gms.cast.framework;

import android.os.Parcel;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.internal.cast.zza;
import com.google.android.gms.internal.cast.zzc;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzai extends zza implements zzak {
    @Override // com.google.android.gms.cast.framework.zzak
    public final void B0(ConnectionResult connectionResult) {
        Parcel J = J();
        zzc.b(J, connectionResult);
        Z1(J, 3);
    }

    @Override // com.google.android.gms.cast.framework.zzak
    public final void G2(boolean z) {
        Parcel J = J();
        int i = zzc.a;
        J.writeInt(z ? 1 : 0);
        J.writeInt(0);
        Z1(J, 6);
    }

    @Override // com.google.android.gms.cast.framework.zzak
    public final void e0(ApplicationMetadata applicationMetadata, String str, String str2, boolean z) {
        Parcel J = J();
        zzc.b(J, applicationMetadata);
        J.writeString(str);
        J.writeString(str2);
        J.writeInt(z ? 1 : 0);
        Z1(J, 4);
    }

    @Override // com.google.android.gms.cast.framework.zzak
    public final void h(int i) {
        Parcel J = J();
        J.writeInt(i);
        Z1(J, 5);
    }

    @Override // com.google.android.gms.cast.framework.zzak
    public final void v() {
        Parcel J = J();
        int i = zzc.a;
        J.writeInt(0);
        Z1(J, 1);
    }

    @Override // com.google.android.gms.cast.framework.zzak
    public final void zzf(int i) {
        Parcel J = J();
        J.writeInt(i);
        Z1(J, 2);
    }
}
