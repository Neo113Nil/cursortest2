package defpackage;

import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.client.zzx;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.internal.ads.r;
import com.google.android.gms.internal.ads.zzcbv;
import com.google.android.gms.internal.ads.zzcby;
import com.google.android.gms.internal.ads.zzdcx;
import com.google.android.gms.internal.ads.zzehp;
import com.google.android.gms.internal.ads.zzfio;
import com.google.android.gms.internal.ads.zzflw;
import com.google.android.gms.internal.ads.zzfns;
import com.google.android.gms.internal.ads.zzfnw;
import com.google.android.gms.internal.ads.zzfnx;
import com.google.android.gms.internal.ads.zzgub;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class i8o implements zzgub {
    public final /* synthetic */ int a;
    public final /* synthetic */ utn b;

    public /* synthetic */ i8o(utn utnVar, int i) {
        this.a = i;
        this.b = utnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgub
    public final Object apply(Object obj) {
        int i = this.a;
        utn utnVar = this.b;
        switch (i) {
            case 0:
                int i2 = zze.zza;
                zzo.zzg("", (zzehp) obj);
                zze.zza("Failed to get a cache key, reverting to legacy flow.");
                zzflw zzb = ((zzdcx) utnVar.b).zzb();
                zzm zzmVar = zzb.d;
                String str = zzb.g;
                zzx zzxVar = zzb.k;
                zzfns zzfnsVar = ((r) utnVar.c).b;
                zzfio zzfioVar = new zzfio(null, new zzfnw(zzmVar, str, new zzcby(zzfnsVar.a).a().j, zzfnsVar.g, zzxVar));
                utnVar.e = zzfioVar;
                return zzfioVar;
            default:
                zzcbv zzcbvVar = (zzcbv) obj;
                zzfio zzfioVar2 = new zzfio(zzcbvVar, new zzfnx(zzcbvVar.j));
                utnVar.e = zzfioVar2;
                return zzfioVar2;
        }
    }
}
