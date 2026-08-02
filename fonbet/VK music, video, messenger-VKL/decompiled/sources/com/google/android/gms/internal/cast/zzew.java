package com.google.android.gms.internal.cast;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.api.c;
import xsna.f0a;
import xsna.i380;
import xsna.o100;
import xsna.olc;
import xsna.u2u;
import xsna.x3j;

/* compiled from: com.google.android.gms:play-services-cast@@22.3.1 */
@Deprecated
/* loaded from: classes12.dex */
public final class zzew extends u2u implements IBinder.DeathRecipient {
    private static final o100 zze = new o100("CastRemoteDisplayClientImpl", null);
    private final f0a zzf;
    private final CastDevice zzg;
    private final Bundle zzh;

    public zzew(Context context, Looper looper, olc olcVar, CastDevice castDevice, Bundle bundle, f0a f0aVar, c.b bVar, c.InterfaceC0114c interfaceC0114c) {
        super(context, looper, 83, olcVar, (x3j) bVar, (i380) interfaceC0114c);
        zze.a("instance created", new Object[0]);
        this.zzg = castDevice;
        this.zzh = bundle;
    }

    @Override // xsna.rd6
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.remote_display.ICastRemoteDisplayService");
        return queryLocalInterface instanceof zzez ? (zzez) queryLocalInterface : new zzez(iBinder);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.rd6, com.google.android.gms.common.api.a.f
    public final void disconnect() {
        zze.a("disconnect", new Object[0]);
        try {
            ((zzez) getService()).zze(zzff.zza(getContext()));
        } catch (RemoteException | IllegalStateException unused) {
        } catch (Throwable th) {
            super.disconnect();
            throw th;
        }
        super.disconnect();
    }

    @Override // xsna.rd6, com.google.android.gms.common.api.a.f
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override // xsna.rd6
    public final String getServiceDescriptor() {
        return "com.google.android.gms.cast.remote_display.ICastRemoteDisplayService";
    }

    @Override // xsna.rd6
    public final String getStartServiceAction() {
        return "com.google.android.gms.cast.remote_display.service.START";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzp(zzey zzeyVar, zzfb zzfbVar, String str) throws RemoteException {
        zze.a("startRemoteDisplay", new Object[0]);
        zzev zzevVar = new zzev(this, zzfbVar);
        ((zzez) getService()).zzf(zzeyVar, zzevVar, this.zzg.i(), str, this.zzh, zzff.zza(getContext()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzq(zzey zzeyVar) throws RemoteException {
        zze.a("stopRemoteDisplay", new Object[0]);
        ((zzez) getService()).zzi(zzeyVar, zzff.zza(getContext()));
    }

    public final /* synthetic */ f0a zzs() {
        return null;
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
    }
}
