package defpackage;

import android.os.RemoteException;
import com.google.android.gms.measurement.internal.zzgb;
import com.google.android.gms.measurement.internal.zzgu;
import com.google.android.gms.measurement.internal.zzic;
import com.google.android.gms.measurement.internal.zznl;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class uyo implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zznl b;

    public /* synthetic */ uyo(zznl zznlVar, int i) {
        this.a = i;
        this.b = zznlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        zznl zznlVar = this.b;
        switch (i) {
            case 0:
                zznlVar.W();
                break;
            case 1:
                zzic zzicVar = (zzic) zznlVar.b;
                zzgb zzgbVar = zznlVar.e;
                if (zzgbVar == null) {
                    zzgu zzguVar = zzicVar.f;
                    zzic.m(zzguVar);
                    zzguVar.g.a("Failed to send Dma consent settings to service");
                    break;
                } else {
                    try {
                        zzgbVar.X0(zznlVar.g0(false));
                        zznlVar.d0();
                        break;
                    } catch (RemoteException e) {
                        zzgu zzguVar2 = zzicVar.f;
                        zzic.m(zzguVar2);
                        zzguVar2.g.b(e, "Failed to send Dma consent settings to the service");
                        return;
                    }
                }
            default:
                zzic zzicVar2 = (zzic) zznlVar.b;
                zzgb zzgbVar2 = zznlVar.e;
                if (zzgbVar2 == null) {
                    zzgu zzguVar3 = zzicVar2.f;
                    zzic.m(zzguVar3);
                    zzguVar3.g.a("Failed to send storage consent settings to service");
                    break;
                } else {
                    try {
                        zzgbVar2.K0(zznlVar.g0(false));
                        zznlVar.d0();
                        break;
                    } catch (RemoteException e2) {
                        zzgu zzguVar4 = zzicVar2.f;
                        zzic.m(zzguVar4);
                        zzguVar4.g.b(e2, "Failed to send storage consent settings to the service");
                    }
                }
        }
    }
}
