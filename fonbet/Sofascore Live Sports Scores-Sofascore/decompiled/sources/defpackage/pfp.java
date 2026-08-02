package defpackage;

import com.google.android.gms.internal.measurement.zzyl;
import com.google.android.gms.internal.measurement.zzzc;
import com.google.android.gms.internal.measurement.zzzm;
import com.google.android.gms.internal.measurement.zzzo;
import com.google.android.gms.internal.measurement.zzzp;
import com.google.android.gms.internal.measurement.zzzq;
import com.google.android.gms.internal.measurement.zzzt;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class pfp extends zzzq {
    public final HashMap a;
    public final HashMap b;
    public final ifp c;
    public final jfp d;

    public /* synthetic */ pfp(zzzm zzzmVar) {
        HashMap hashMap = new HashMap();
        this.a = hashMap;
        HashMap hashMap2 = new HashMap();
        this.b = hashMap2;
        hashMap.putAll(zzzmVar.a);
        hashMap2.putAll(zzzmVar.b);
        this.c = zzzt.a;
        this.d = zzzmVar.c;
    }

    @Override // com.google.android.gms.internal.measurement.zzzq
    public final void a(zzyl zzylVar, Object obj, zzzc zzzcVar) {
        zzzp zzzpVar = (zzzp) this.a.get(zzylVar);
        if (zzzpVar != null) {
            zzzpVar.a(zzylVar, obj, zzzcVar);
        } else {
            this.c.a(zzylVar, obj, zzzcVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzzq
    public final void b(zzyl zzylVar, Iterator it, zzzc zzzcVar) {
        zzzo zzzoVar = (zzzo) this.b.get(zzylVar);
        if (zzzoVar != null) {
            zzzoVar.a(zzylVar, it, zzzcVar);
            return;
        }
        jfp jfpVar = this.d;
        if (jfpVar != null && !this.a.containsKey(zzylVar)) {
            jfpVar.a(zzylVar, it, zzzcVar);
        } else {
            while (it.hasNext()) {
                a(zzylVar, it.next(), zzzcVar);
            }
        }
    }
}
