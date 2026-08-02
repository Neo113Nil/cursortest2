package com.google.android.gms.cast.framework;

import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.cast.zza;
import com.google.android.gms.internal.cast.zzc;
import defpackage.x5n;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzav extends zza implements zzaw {
    @Override // com.google.android.gms.cast.framework.zzaw
    public final void B4(zzbg zzbgVar) {
        Parcel J = J();
        zzc.c(J, zzbgVar);
        Z1(J, 3);
    }

    @Override // com.google.android.gms.cast.framework.zzaw
    public final void U3(zzbg zzbgVar) {
        Parcel J = J();
        zzc.c(J, zzbgVar);
        Z1(J, 2);
    }

    @Override // com.google.android.gms.cast.framework.zzaw
    public final void g4(boolean z) {
        Parcel J = J();
        int i = zzc.a;
        J.writeInt(1);
        J.writeInt(z ? 1 : 0);
        Z1(J, 6);
    }

    @Override // com.google.android.gms.cast.framework.zzaw
    public final IObjectWrapper zze() {
        return x5n.i(S1(J(), 1));
    }

    @Override // com.google.android.gms.cast.framework.zzaw
    public final IObjectWrapper zzk() {
        return x5n.i(S1(J(), 7));
    }
}
