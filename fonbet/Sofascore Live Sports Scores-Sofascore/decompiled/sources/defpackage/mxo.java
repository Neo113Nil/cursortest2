package defpackage;

import android.os.RemoteException;
import com.google.android.gms.measurement.internal.zzal;
import com.google.android.gms.measurement.internal.zzfx;
import com.google.android.gms.measurement.internal.zzfy;
import com.google.android.gms.measurement.internal.zzgb;
import com.google.android.gms.measurement.internal.zzgu;
import com.google.android.gms.measurement.internal.zzic;
import com.google.android.gms.measurement.internal.zznl;
import com.google.android.gms.measurement.internal.zzr;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class mxo implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zzr b;
    public final /* synthetic */ zznl c;

    public /* synthetic */ mxo(zznl zznlVar, zzr zzrVar, int i) {
        this.a = i;
        this.b = zzrVar;
        this.c = zznlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        zzr zzrVar = this.b;
        zznl zznlVar = this.c;
        switch (i) {
            case 0:
                zzgb zzgbVar = zznlVar.e;
                zzic zzicVar = (zzic) zznlVar.b;
                if (zzgbVar == null) {
                    zzgu zzguVar = zzicVar.f;
                    zzic.m(zzguVar);
                    zzguVar.g.a("Discarding data. Failed to send app launch");
                    break;
                } else {
                    try {
                        zzal zzalVar = zzicVar.d;
                        zzfx zzfxVar = zzfy.W0;
                        if (zzalVar.b0(null, zzfxVar)) {
                            zznlVar.i0(zzgbVar, null, zzrVar);
                        }
                        zzgbVar.L3(zzrVar);
                        zzicVar.n().V();
                        zzicVar.d.b0(null, zzfxVar);
                        zznlVar.i0(zzgbVar, null, zzrVar);
                        zznlVar.d0();
                        break;
                    } catch (RemoteException e) {
                        zzgu zzguVar2 = zzicVar.f;
                        zzic.m(zzguVar2);
                        zzguVar2.g.b(e, "Failed to send app launch to the service");
                        return;
                    }
                }
            default:
                zzic zzicVar2 = (zzic) zznlVar.b;
                zzgb zzgbVar2 = zznlVar.e;
                if (zzgbVar2 == null) {
                    zzgu zzguVar3 = zzicVar2.f;
                    zzic.m(zzguVar3);
                    zzguVar3.g.a("Failed to send measurementEnabled to service");
                    break;
                } else {
                    try {
                        zzgbVar2.U0(zzrVar);
                        zznlVar.d0();
                        break;
                    } catch (RemoteException e2) {
                        zzgu zzguVar4 = zzicVar2.f;
                        zzic.m(zzguVar4);
                        zzguVar4.g.b(e2, "Failed to send measurementEnabled to the service");
                    }
                }
        }
    }
}
