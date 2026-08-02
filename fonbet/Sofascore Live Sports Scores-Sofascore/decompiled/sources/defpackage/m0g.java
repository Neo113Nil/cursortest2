package defpackage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class m0g implements pk3 {
    public final yih a;
    public final /* synthetic */ n0g b;

    public m0g(n0g n0gVar, yih yihVar) {
        this.b = n0gVar;
        this.a = yihVar;
    }

    @Override // defpackage.pk3
    public final void a(boolean z) {
        if (z) {
            synchronized (this.b) {
                yih yihVar = this.a;
                Iterator it = kik.z((Set) yihVar.c).iterator();
                while (it.hasNext()) {
                    rzf rzfVar = (rzf) it.next();
                    if (!rzfVar.d() && !rzfVar.c()) {
                        rzfVar.clear();
                        if (yihVar.b) {
                            ((HashSet) yihVar.d).add(rzfVar);
                        } else {
                            rzfVar.j();
                        }
                    }
                }
            }
        }
    }
}
