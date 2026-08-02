package defpackage;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbff;
import com.google.android.gms.internal.ads.zzbfg;
import com.google.android.gms.internal.ads.zzbjg;
import com.google.android.gms.internal.ads.zzdqm;
import com.google.android.gms.internal.ads.zzdso;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class a0o implements zzbfg {
    public final /* synthetic */ String a;
    public final /* synthetic */ zzdqm b;

    public a0o(zzdqm zzdqmVar, String str) {
        this.a = str;
        this.b = zzdqmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbfg
    public final void A(zzbff zzbffVar) {
        if (!((Boolean) zzba.zzc().a(zzbjg.z2)).booleanValue()) {
            if (zzbffVar.j) {
                zzdqm zzdqmVar = this.b;
                if (zzdqmVar.w != null) {
                    zzdqmVar.H.put(this.a, Boolean.TRUE);
                    zzdso zzdsoVar = zzdqmVar.w;
                    if (zzdsoVar == null) {
                        return;
                    }
                    zzdqmVar.r(zzdsoVar.l2(), zzdsoVar.zzh(), zzdsoVar.zzi(), true);
                    return;
                }
                return;
            }
            return;
        }
        synchronized (this) {
            try {
                if (zzbffVar.j) {
                    zzdqm zzdqmVar2 = this.b;
                    if (zzdqmVar2.w != null) {
                        zzdqmVar2.H.put(this.a, Boolean.TRUE);
                        zzdso zzdsoVar2 = zzdqmVar2.w;
                        if (zzdsoVar2 == null) {
                        } else {
                            zzdqmVar2.r(zzdsoVar2.l2(), zzdqmVar2.w.zzh(), zzdqmVar2.w.zzi(), true);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
