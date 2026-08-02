package defpackage;

import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class t5b extends y8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ v5b b;

    public /* synthetic */ t5b(v5b v5bVar, int i) {
        this.a = i;
        this.b = v5bVar;
    }

    @Override // defpackage.y8, defpackage.ynl
    public void c(snl snlVar) {
        switch (this.a) {
            case 1:
                snlVar.getClass();
                v5b v5bVar = this.b;
                v5bVar.setYouTubePlayerReady$core_release(true);
                LinkedHashSet linkedHashSet = v5bVar.f;
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    throw lnb.i(it);
                }
                linkedHashSet.clear();
                ((xnl) snlVar).d(this);
                return;
            default:
                super.c(snlVar);
                return;
        }
    }

    @Override // defpackage.y8, defpackage.ynl
    public void f(snl snlVar, bne bneVar) {
        switch (this.a) {
            case 0:
                snlVar.getClass();
                if (bneVar == bne.d) {
                    v5b v5bVar = this.b;
                    if (!v5bVar.g && !v5bVar.a.e) {
                        ((xnl) snlVar).c();
                        break;
                    }
                }
                break;
            default:
                super.f(snlVar, bneVar);
                break;
        }
    }
}
