package defpackage;

import com.google.android.gms.internal.pal.zzacz;
import com.google.android.gms.internal.pal.zzadf;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class oan extends ran {
    @Override // defpackage.ran
    public final void a(Object obj, long j) {
        ((zzadf) sdn.g(obj, j)).zzb();
    }

    @Override // defpackage.ran
    public final void b(zzacz zzaczVar, Object obj, long j) {
        zzadf zzadfVar = (zzadf) sdn.g(zzaczVar, j);
        zzadf zzadfVar2 = (zzadf) sdn.g(obj, j);
        int size = zzadfVar.size();
        int size2 = zzadfVar2.size();
        if (size > 0 && size2 > 0) {
            if (!zzadfVar.zzc()) {
                zzadfVar = zzadfVar.i(size2 + size);
            }
            zzadfVar.addAll(zzadfVar2);
        }
        if (size > 0) {
            zzadfVar2 = zzadfVar;
        }
        sdn.j(j, zzaczVar, zzadfVar2);
    }
}
