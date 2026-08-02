package com.google.android.gms.internal.cast;

import android.os.RemoteException;
import androidx.annotation.Nullable;
import xsna.exc0;
import xsna.fx10;
import xsna.o100;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
public final class zzbl extends fx10.a {
    private static final o100 zza = new o100("MediaRouterCallback", null);
    private final zzbg zzb;
    private final zzbx zzc;

    @Nullable
    private final zzce zzd;

    public zzbl(zzbg zzbgVar, zzbx zzbxVar, @Nullable zzce zzceVar) {
        exc0.i(zzbgVar);
        this.zzb = zzbgVar;
        this.zzc = zzbxVar;
        this.zzd = zzceVar;
    }

    private final void zza(fx10 fx10Var) {
        zzce zzceVar = this.zzd;
        if (zzceVar != null) {
            zzceVar.zzf(fx10Var);
        }
    }

    @Override // xsna.fx10.a
    public final void onRouteAdded(fx10 fx10Var, fx10.h hVar) {
        try {
            this.zzb.zzf(hVar.c, hVar.s);
        } catch (RemoteException unused) {
            zza.b("Unable to call %s on %s.", "onRouteAdded", "zzbg");
        }
        zza(fx10Var);
    }

    @Override // xsna.fx10.a
    public final void onRouteChanged(fx10 fx10Var, fx10.h hVar) {
        if (hVar.g()) {
            try {
                this.zzb.zzg(hVar.c, hVar.s);
            } catch (RemoteException unused) {
                zza.b("Unable to call %s on %s.", "onRouteChanged", "zzbg");
            }
            zza(fx10Var);
        }
    }

    @Override // xsna.fx10.a
    public final void onRouteConnected(fx10 fx10Var, fx10.h hVar, fx10.h hVar2) {
        int i = hVar.l;
        String str = hVar.c;
        if (i != 1) {
            zza.c("ignore onRouteConnected for non-remote connected routeId: %s", str);
            return;
        }
        zza.c("onRouteConnected with connectedRouteId = %s", str);
        this.zzc.zzp(true);
        try {
            zzbg zzbgVar = this.zzb;
            if (zzbgVar.zze() >= 251600000) {
                zzbgVar.zzl(hVar2.c, str, hVar.s);
            } else {
                zzbgVar.zzk(hVar2.c, str, hVar.s);
            }
        } catch (RemoteException unused) {
            zza.b("Unable to call %s on %s.", "onRouteConnected", "zzbg");
        }
    }

    @Override // xsna.fx10.a
    public final void onRouteDisconnected(fx10 fx10Var, @Nullable fx10.h hVar, fx10.h hVar2, int i) {
        if (hVar != null) {
            String str = hVar.c;
            if (hVar.l == 1) {
                zza.c("onRouteDisconnected with disconnectedRouteId = %s, requestedRouteId = %s, reason = %d", str, hVar2.c, Integer.valueOf(i));
                this.zzc.zzp(false);
                try {
                    zzbg zzbgVar = this.zzb;
                    if (zzbgVar.zze() >= 251600000) {
                        zzbgVar.zzm(hVar2.c, str, hVar.s, i);
                        return;
                    } else {
                        zzbgVar.zzj(str, hVar.s, i);
                        return;
                    }
                } catch (RemoteException unused) {
                    zza.b("Unable to call %s on %s.", "onRouteDisconnected", "zzbg");
                    return;
                }
            }
        }
        zza.c("ignore onRouteDisconnected for invalid or non-remote disconnected route", new Object[0]);
    }

    @Override // xsna.fx10.a
    public final void onRouteRemoved(fx10 fx10Var, fx10.h hVar) {
        try {
            this.zzb.zzh(hVar.c, hVar.s);
        } catch (RemoteException unused) {
            zza.b("Unable to call %s on %s.", "onRouteRemoved", "zzbg");
        }
        zza(fx10Var);
    }

    @Override // xsna.fx10.a
    public final void onRouteSelected(fx10 fx10Var, fx10.h hVar, int i, fx10.h hVar2) {
        int i2 = hVar.l;
        String str = hVar.c;
        if (i2 != 1) {
            zza.c("ignore onRouteSelected for non-remote selected routeId: %s", str);
            return;
        }
        zza.c("onRouteSelected with reason = %d, routeId = %s", Integer.valueOf(i), str);
        try {
            zzbg zzbgVar = this.zzb;
            if (zzbgVar.zze() >= 220400000) {
                zzbgVar.zzk(hVar2.c, str, hVar.s);
            } else {
                zzbgVar.zzi(hVar2.c, hVar.s);
            }
        } catch (RemoteException unused) {
            zza.b("Unable to call %s on %s.", "onRouteSelected", "zzbg");
        }
        zza(fx10Var);
    }

    @Override // xsna.fx10.a
    public final void onRouteUnselected(fx10 fx10Var, fx10.h hVar, int i) {
        int i2 = hVar.l;
        String str = hVar.c;
        if (i2 != 1) {
            zza.c("ignore onRouteUnselected for non-remote routeId: %s", str);
            return;
        }
        zza.c("onRouteUnselected with reason = %d, routeId = %s", Integer.valueOf(i), str);
        try {
            this.zzb.zzj(str, hVar.s, i);
        } catch (RemoteException unused) {
            zza.b("Unable to call %s on %s.", "onRouteUnselected", "zzbg");
        }
        zza(fx10Var);
    }
}
