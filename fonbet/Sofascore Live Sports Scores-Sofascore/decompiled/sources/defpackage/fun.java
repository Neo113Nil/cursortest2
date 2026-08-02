package defpackage;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzed;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.internal.ads.zzcms;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class fun implements Runnable {
    public final /* synthetic */ zzcms a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;

    public /* synthetic */ fun(zzcms zzcmsVar, int i, int i2, boolean z, boolean z2) {
        this.a = zzcmsVar;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = z2;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        int i;
        boolean z;
        boolean z2;
        zzed zzedVar;
        zzed zzedVar2;
        zzed zzedVar3;
        zzcms zzcmsVar = this.a;
        int i2 = this.b;
        int i3 = this.c;
        boolean z3 = this.d;
        boolean z4 = this.e;
        synchronized (zzcmsVar.b) {
            try {
                boolean z5 = zzcmsVar.g;
                if (z5 || i3 != 1) {
                    i = i3;
                    z = false;
                } else {
                    i3 = 1;
                    i = 1;
                    z = true;
                }
                boolean z6 = i2 != i3;
                if (z6 && i == 1) {
                    z2 = true;
                    i = 1;
                } else {
                    z2 = false;
                }
                boolean z7 = z6 && i == 2;
                boolean z8 = z6 && i == 3;
                zzcmsVar.g = z5 || z;
                if (z) {
                    try {
                        zzed zzedVar4 = zzcmsVar.f;
                        if (zzedVar4 != null) {
                            zzedVar4.zze();
                        }
                    } catch (RemoteException e) {
                        zzo.zzl("#007 Could not call remote method.", e);
                    }
                }
                if (z2 && (zzedVar3 = zzcmsVar.f) != null) {
                    zzedVar3.zzf();
                }
                if (z7 && (zzedVar2 = zzcmsVar.f) != null) {
                    zzedVar2.zzg();
                }
                if (z8) {
                    zzed zzedVar5 = zzcmsVar.f;
                    if (zzedVar5 != null) {
                        zzedVar5.zzh();
                    }
                    zzcmsVar.a.zzz();
                }
                if (z3 != z4 && (zzedVar = zzcmsVar.f) != null) {
                    zzedVar.zzi(z4);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
