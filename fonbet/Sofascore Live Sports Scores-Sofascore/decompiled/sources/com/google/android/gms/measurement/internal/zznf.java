package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.stats.ConnectionTracker;
import defpackage.dno;
import defpackage.jyo;
import defpackage.vvo;
import defpackage.yuo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zznf implements ServiceConnection, BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {
    public volatile boolean a;
    public volatile zzgo b;
    public final /* synthetic */ zznl c;

    public zznf(zznl zznlVar) {
        this.c = zznlVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void J(ConnectionResult connectionResult) {
        zznl zznlVar = this.c;
        zzhz zzhzVar = ((zzic) zznlVar.b).g;
        zzic.m(zzhzVar);
        zzhzVar.V();
        zzgu zzguVar = ((zzic) zznlVar.b).f;
        if (zzguVar == null || !zzguVar.c) {
            zzguVar = null;
        }
        if (zzguVar != null) {
            zzguVar.o.b(connectionResult, "Service connection failed");
        }
        synchronized (this) {
            this.a = false;
            this.b = null;
        }
        zzhz zzhzVar2 = ((zzic) this.c.b).g;
        zzic.m(zzhzVar2);
        zzhzVar2.Z(new jyo(1, this, connectionResult));
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        zzhz zzhzVar = ((zzic) this.c.b).g;
        zzic.m(zzhzVar);
        zzhzVar.V();
        synchronized (this) {
            try {
                Preconditions.i(this.b);
                zzgb zzgbVar = (zzgb) this.b.getService();
                zzhz zzhzVar2 = ((zzic) this.c.b).g;
                zzic.m(zzhzVar2);
                zzhzVar2.Z(new vvo(this, zzgbVar, false, 2));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.b = null;
                this.a = false;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        zzic zzicVar = (zzic) this.c.b;
        zzhz zzhzVar = zzicVar.g;
        zzic.m(zzhzVar);
        zzhzVar.V();
        zzgu zzguVar = zzicVar.f;
        zzic.m(zzguVar);
        zzguVar.n.a("Service connection suspended");
        zzhz zzhzVar2 = zzicVar.g;
        zzic.m(zzhzVar2);
        zzhzVar2.Z(new dno(this, 9));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        zzhz zzhzVar = ((zzic) this.c.b).g;
        zzic.m(zzhzVar);
        zzhzVar.V();
        synchronized (this) {
            if (iBinder == null) {
                this.a = false;
                zzgu zzguVar = ((zzic) this.c.b).f;
                zzic.m(zzguVar);
                zzguVar.g.a("Service connected with null binder");
                return;
            }
            Object obj = null;
            try {
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                    obj = queryLocalInterface instanceof zzgb ? (zzgb) queryLocalInterface : new zzfz(iBinder);
                    zzgu zzguVar2 = ((zzic) this.c.b).f;
                    zzic.m(zzguVar2);
                    zzguVar2.o.a("Bound to IMeasurementService interface");
                } else {
                    zzgu zzguVar3 = ((zzic) this.c.b).f;
                    zzic.m(zzguVar3);
                    zzguVar3.g.b(interfaceDescriptor, "Got binder with a wrong descriptor");
                }
            } catch (RemoteException unused) {
                zzgu zzguVar4 = ((zzic) this.c.b).f;
                zzic.m(zzguVar4);
                zzguVar4.g.a("Service connect failed to get IMeasurementService");
            }
            if (obj == null) {
                this.a = false;
                try {
                    ConnectionTracker b = ConnectionTracker.b();
                    zznl zznlVar = this.c;
                    b.c(((zzic) zznlVar.b).a, zznlVar.d);
                } catch (IllegalArgumentException unused2) {
                }
            } else {
                zzhz zzhzVar2 = ((zzic) this.c.b).g;
                zzic.m(zzhzVar2);
                zzhzVar2.Z(new yuo(this, obj, false, 3));
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        zzic zzicVar = (zzic) this.c.b;
        zzhz zzhzVar = zzicVar.g;
        zzic.m(zzhzVar);
        zzhzVar.V();
        zzgu zzguVar = zzicVar.f;
        zzic.m(zzguVar);
        zzguVar.n.a("Service disconnected");
        zzhz zzhzVar2 = zzicVar.g;
        zzic.m(zzhzVar2);
        zzhzVar2.Z(new vvo(this, componentName, false, 1));
    }
}
