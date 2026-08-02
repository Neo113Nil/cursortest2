package defpackage;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.internal.ads.zzbjg;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class trn {
    public final zzg a;

    public trn(zzg zzgVar) {
        this.a = zzgVar;
    }

    public final void a(int i, long j) {
        if (((Boolean) zzba.zzc().a(zzbjg.j1)).booleanValue()) {
            return;
        }
        zzg zzgVar = this.a;
        if (j - zzgVar.zzF() < 0) {
            zze.zza("Receiving npa decision in the past, ignoring.");
            return;
        }
        if (((Boolean) zzba.zzc().a(zzbjg.k1)).booleanValue()) {
            zzgVar.zzE(i);
            zzgVar.zzG(j);
        } else {
            zzgVar.zzE(-1);
            zzgVar.zzG(j);
        }
    }
}
