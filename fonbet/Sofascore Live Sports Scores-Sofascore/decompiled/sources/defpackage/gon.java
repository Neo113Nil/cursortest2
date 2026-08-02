package defpackage;

import com.google.android.gms.internal.ads.zzbnm;
import com.google.android.gms.internal.ads.zzbnn;
import com.google.android.gms.internal.ads.zzbnv;
import com.google.android.gms.internal.ads.zzbos;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class gon extends zzbnv {
    public final /* synthetic */ zzbos a;

    @Override // com.google.android.gms.internal.ads.zzbnw
    public final void C1(zzbnm zzbnmVar, String str) {
        zzbnn zzbnnVar;
        zzbos zzbosVar = this.a;
        if (zzbosVar.b == null) {
            return;
        }
        synchronized (zzbosVar) {
            zzbnnVar = zzbosVar.c;
            if (zzbnnVar == null) {
                zzbnnVar = new zzbnn(zzbnmVar);
                zzbosVar.c = zzbnnVar;
            }
        }
        zzbosVar.b.zzc(zzbnnVar, str);
    }
}
