package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.dynamic.ObjectWrapper;
import defpackage.u2o;
import defpackage.x6k;
import defpackage.y2o;
import defpackage.z2o;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzech implements u2o {
    public final long a;
    public final zzebw b;
    public final zzfku c;

    public zzech(long j, Context context, zzebw zzebwVar, zzcob zzcobVar, String str) {
        this.a = j;
        this.b = zzebwVar;
        x6k m = zzcobVar.m();
        m.d = context;
        m.c = str;
        this.c = m.B().q();
    }

    @Override // defpackage.u2o
    public final void a(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        try {
            this.c.zzb(zzmVar, new y2o(this));
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // defpackage.u2o
    public final void zzb() {
        try {
            zzfku zzfkuVar = this.c;
            zzfkuVar.zzd(new z2o(this));
            zzfkuVar.zza(new ObjectWrapper(null));
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // defpackage.u2o
    public final void zzc() {
    }
}
