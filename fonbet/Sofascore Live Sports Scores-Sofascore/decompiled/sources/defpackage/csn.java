package defpackage;

import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzb;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzbjj;
import com.google.android.gms.internal.ads.zzbjm;
import com.google.android.gms.internal.ads.zzcfv;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class csn extends zzb {
    public final /* synthetic */ zzcfv b;

    public csn(zzcfv zzcfvVar) {
        Objects.requireNonNull(zzcfvVar);
        this.b = zzcfvVar;
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final void zza() {
        zzcfv zzcfvVar = this.b;
        zzbjj zzbjjVar = new zzbjj(zzcfvVar.e, zzcfvVar.f.afmaVersion);
        synchronized (zzcfvVar.a) {
            try {
                zzt.zzm();
                zzbjm.a(zzcfvVar.h, zzbjjVar);
            } catch (IllegalArgumentException e) {
                int i = zze.zza;
                zzo.zzj("Cannot config CSI reporter.", e);
            }
        }
    }
}
