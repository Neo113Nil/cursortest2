package com.google.android.gms.internal.cast;

import android.os.Bundle;
import com.google.android.gms.cast.CastDevice;
import java.util.Map;
import java.util.Objects;
import xsna.e0a;
import xsna.fx10;
import xsna.o100;
import xsna.uz9;
import xsna.zn01;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
final class zzed extends fx10.a {
    final /* synthetic */ zzee zza;

    public /* synthetic */ zzed(zzee zzeeVar, byte[] bArr) {
        Objects.requireNonNull(zzeeVar);
        this.zza = zzeeVar;
    }

    @Override // xsna.fx10.a
    public final void onRouteAdded(fx10 fx10Var, fx10.h hVar) {
        o100 o100Var;
        o100Var = zzee.zzb;
        o100Var.a("RemoteConnectionMediaRouterCallback.onRouteAdded.", new Object[0]);
        this.zza.zzf(hVar.s);
    }

    @Override // xsna.fx10.a
    public final void onRouteChanged(fx10 fx10Var, fx10.h hVar) {
        o100 o100Var;
        o100Var = zzee.zzb;
        o100Var.a("RemoteConnectionMediaRouterCallback.onRouteChanged.", new Object[0]);
        this.zza.zzf(hVar.s);
    }

    @Override // xsna.fx10.a
    public final void onRouteRemoved(fx10 fx10Var, fx10.h hVar) {
        o100 o100Var;
        CastDevice j;
        o100Var = zzee.zzb;
        o100Var.a("RemoteConnectionMediaRouterCallback.onRouteRemoved.", new Object[0]);
        Bundle bundle = hVar.s;
        if (bundle == null || (j = CastDevice.j(bundle)) == null) {
            return;
        }
        String string = bundle.getString("com.google.android.gms.cast.EXTRA_RUNNING_RECEIVER_APP_ID");
        zzee zzeeVar = this.zza;
        zzdz zzdzVar = (zzdz) zzeeVar.zzi().get(j.i());
        if (zzdzVar != null && string != null) {
            throw null;
        }
        if (zzdzVar != null) {
            if (uz9.o != null) {
                e0a e0aVar = uz9.o.l;
                if (e0aVar == null) {
                    uz9.m.c("castReasonCodes hasn't been initialized yet", new Object[0]);
                } else {
                    Map map = (Map) e0aVar.b;
                    if (map != null && map.containsKey(2422)) {
                    }
                }
            }
            zzdzVar.zzb(new zn01());
        }
        if (zzdzVar != null) {
            throw null;
        }
        zzeeVar.zzg(j);
    }
}
