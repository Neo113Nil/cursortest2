package defpackage;

import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.overlay.zzaa;
import com.google.android.gms.internal.ads.zzbqv;
import com.google.android.gms.internal.ads.zzbte;
import com.google.android.gms.internal.ads.zzdlw;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class von implements zzaa {
    public boolean a = false;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ zza c;
    public final /* synthetic */ HashMap d;
    public final /* synthetic */ Map e;

    public von(zzbqv zzbqvVar, boolean z, zza zzaVar, HashMap hashMap, Map map) {
        this.b = z;
        this.c = zzaVar;
        this.d = hashMap;
        this.e = map;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzaa
    public final void zza(boolean z) {
        if (this.a) {
            return;
        }
        zza zzaVar = this.c;
        if (z && this.b) {
            ((zzdlw) zzaVar).M();
        }
        this.a = true;
        String str = (String) this.e.get("event_id");
        Boolean valueOf = Boolean.valueOf(z);
        HashMap hashMap = this.d;
        hashMap.put(str, valueOf);
        ((zzbte) zzaVar).n("openIntentAsync", hashMap);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzaa
    public final void zzb(int i) {
    }
}
