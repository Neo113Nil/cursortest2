package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzaw {
    public final HashMap a = new HashMap();
    public final zzbi b = new zzbi();

    public zzaw() {
        a(new zzau());
        a(new zzax());
        a(new zzay());
        a(new zzbb());
        a(new zzbg());
        a(new zzbh());
        a(new zzbj());
    }

    public final void a(zzav zzavVar) {
        Iterator it = zzavVar.a.iterator();
        while (it.hasNext()) {
            this.a.put(Integer.valueOf(((zzbk) it.next()).a).toString(), zzavVar);
        }
    }

    public final zzao b(zzg zzgVar, zzao zzaoVar) {
        zzh.k(zzgVar);
        if (!(zzaoVar instanceof zzap)) {
            return zzaoVar;
        }
        zzap zzapVar = (zzap) zzaoVar;
        ArrayList arrayList = zzapVar.b;
        String str = zzapVar.a;
        HashMap hashMap = this.a;
        return (hashMap.containsKey(str) ? (zzav) hashMap.get(str) : this.b).a(str, zzgVar, arrayList);
    }
}
