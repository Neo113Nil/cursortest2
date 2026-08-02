package defpackage;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzcb;
import com.google.android.gms.ads.internal.client.zzce;
import com.google.android.gms.ads.internal.client.zzfp;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.internal.ads.zzfvd;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class jao implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zzfvd b;

    public /* synthetic */ jao(zzfvd zzfvdVar, int i) {
        this.a = i;
        this.b = zzfvdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        zzfvd zzfvdVar = this.b;
        switch (i) {
            case 0:
                zzfvdVar.v();
                break;
            case 1:
                zzcb zzcbVar = zzfvdVar.h;
                if (zzcbVar != null) {
                    try {
                        zzcbVar.zzf((zzfp) zzfvdVar.e.get());
                    } catch (RemoteException unused) {
                        int i2 = zze.zza;
                        zzo.zzi("Failed to call onAdsExhausted");
                    }
                }
                zzce zzceVar = zzfvdVar.i;
                if (zzceVar != null) {
                    try {
                        zzceVar.zzf(zzfvdVar.l);
                        break;
                    } catch (RemoteException unused2) {
                        int i3 = zze.zza;
                        zzo.zzi("Failed to call onAdsExhausted");
                        return;
                    }
                }
                break;
            case 2:
                if (zzfvdVar.q != null) {
                    long a = zzfvdVar.r.a();
                    int s = zzfvdVar.s();
                    String g = zzfvdVar.g();
                    zzfvdVar.q.g("pae", "paeo_ts", a, s, 0, null, zzfvdVar.s, g);
                    break;
                }
                break;
            case 3:
                zzfvdVar.e();
                break;
            case 4:
                zzfvdVar.e();
                break;
            default:
                zzfvdVar.w();
                break;
        }
    }
}
