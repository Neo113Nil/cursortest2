package defpackage;

import com.google.android.gms.internal.auth.zzez;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class j8o extends q8o {
    @Override // defpackage.q8o
    public final void a(Object obj, long j) {
        ((zzez) omo.c(obj, j)).zzb();
    }

    @Override // defpackage.q8o
    public final void b(long j, Object obj, Object obj2) {
        zzez zzezVar = (zzez) omo.c(obj, j);
        zzez zzezVar2 = (zzez) omo.c(obj2, j);
        int size = zzezVar.size();
        int size2 = zzezVar2.size();
        if (size > 0 && size2 > 0) {
            if (!zzezVar.zzc()) {
                zzezVar = zzezVar.i(size2 + size);
            }
            zzezVar.addAll(zzezVar2);
        }
        if (size > 0) {
            zzezVar2 = zzezVar;
        }
        omo.g(j, obj, zzezVar2);
    }
}
