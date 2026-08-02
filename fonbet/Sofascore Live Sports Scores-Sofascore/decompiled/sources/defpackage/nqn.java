package defpackage;

import com.google.android.gms.internal.ads.zzbnm;
import com.google.android.gms.internal.ads.zzbnv;
import com.google.android.gms.internal.ads.zzbzg;
import com.google.android.gms.internal.ads.zzbzh;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class nqn extends zzbnv {
    public final /* synthetic */ zzbzg a;

    @Override // com.google.android.gms.internal.ads.zzbnw
    public final void C1(zzbnm zzbnmVar, String str) {
        zzbzh zzbzhVar;
        zzbzg zzbzgVar = this.a;
        if (zzbzgVar.b == null) {
            return;
        }
        synchronized (zzbzgVar) {
            zzbzhVar = zzbzgVar.c;
            if (zzbzhVar == null) {
                zzbzhVar = new zzbzh(zzbnmVar);
                zzbzgVar.c = zzbzhVar;
            }
        }
        zzbzgVar.b.onCustomClick(zzbzhVar, str);
    }
}
