package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzo;
import defpackage.f2n;
import defpackage.wmn;
import defpackage.xmn;
import defpackage.ymn;
import java.util.concurrent.ScheduledFuture;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbhn {
    public ScheduledFuture a = null;
    public final f2n b = new f2n(this, 17);
    public final Object c = new Object();
    public zzbhq d;
    public Context e;
    public zzbht f;

    public final void a(Context context) {
        if (context == null) {
            return;
        }
        synchronized (this.c) {
            try {
                if (this.e != null) {
                    return;
                }
                this.e = context.getApplicationContext();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.o5)).booleanValue()) {
                    d();
                } else {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.n5)).booleanValue()) {
                        com.google.android.gms.ads.internal.zzt.zzg().b(new wmn(this));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final zzbho b(zzbhr zzbhrVar) {
        synchronized (this.c) {
            if (this.f == null) {
                return new zzbho();
            }
            try {
                boolean t = this.d.t();
                zzbht zzbhtVar = this.f;
                if (t) {
                    Parcel J = zzbhtVar.J();
                    zzbew.c(J, zzbhrVar);
                    Parcel S1 = zzbhtVar.S1(J, 2);
                    zzbho zzbhoVar = (zzbho) zzbew.b(S1, zzbho.CREATOR);
                    S1.recycle();
                    return zzbhoVar;
                }
                Parcel J2 = zzbhtVar.J();
                zzbew.c(J2, zzbhrVar);
                Parcel S12 = zzbhtVar.S1(J2, 1);
                zzbho zzbhoVar2 = (zzbho) zzbew.b(S12, zzbho.CREATOR);
                S12.recycle();
                return zzbhoVar2;
            } catch (RemoteException e) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzg("Unable to call into cache service.", e);
                return new zzbho();
            }
        }
    }

    public final /* synthetic */ void c() {
        synchronized (this.c) {
            try {
                zzbhq zzbhqVar = this.d;
                if (zzbhqVar == null) {
                    return;
                }
                if (zzbhqVar.isConnected() || this.d.isConnecting()) {
                    this.d.disconnect();
                }
                this.d = null;
                this.f = null;
                Binder.flushPendingCommands();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        zzbhq zzbhqVar;
        synchronized (this.c) {
            if (this.e != null && this.d == null) {
                xmn xmnVar = new xmn(this);
                ymn ymnVar = new ymn(this);
                synchronized (this) {
                    zzbhqVar = new zzbhq(this.e, com.google.android.gms.ads.internal.zzt.zzs().zza(), xmnVar, ymnVar);
                }
                this.d = zzbhqVar;
                zzbhqVar.checkAvailabilityAndConnect();
            }
        }
    }
}
