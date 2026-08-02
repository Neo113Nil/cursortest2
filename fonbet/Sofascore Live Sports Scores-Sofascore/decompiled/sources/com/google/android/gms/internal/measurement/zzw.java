package com.google.android.gms.internal.measurement;

import defpackage.a70;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzw extends zzai {
    public final zzj c;
    public final HashMap d;

    public zzw(zzj zzjVar) {
        super("require");
        this.d = new HashMap();
        this.c = zzjVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzai
    public final zzao d(zzg zzgVar, List list) {
        zzao zzaoVar;
        zzh.a(1, "require", list);
        String zzc = zzgVar.b.b(zzgVar, (zzao) list.get(0)).zzc();
        HashMap hashMap = this.d;
        if (hashMap.containsKey(zzc)) {
            return (zzao) hashMap.get(zzc);
        }
        HashMap hashMap2 = this.c.a;
        if (hashMap2.containsKey(zzc)) {
            try {
                zzaoVar = (zzao) ((Callable) hashMap2.get(zzc)).call();
            } catch (Exception unused) {
                a70.r("Failed to create API implementation: ".concat(String.valueOf(zzc)));
                return null;
            }
        } else {
            zzaoVar = zzao.I7;
        }
        if (zzaoVar instanceof zzai) {
            hashMap.put(zzc, (zzai) zzaoVar);
        }
        return zzaoVar;
    }
}
