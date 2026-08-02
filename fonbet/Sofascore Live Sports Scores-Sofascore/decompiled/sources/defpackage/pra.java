package defpackage;

import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class pra implements hqa {
    public final ksa a;

    public pra(ksa ksaVar) {
        this.a = ksaVar;
    }

    @Override // defpackage.hqa
    public final int a() {
        int i;
        ksa ksaVar = this.a;
        if (ksaVar.j().k.isEmpty()) {
            return 0;
        }
        csa j = ksaVar.j();
        int e = (int) (j.o == ewd.a ? j.e() & 4294967295L : j.e() >> 32);
        int C = oea.C(ksaVar.j());
        if (C != 0 && (i = e / C) >= 1) {
            return i;
        }
        return 1;
    }

    @Override // defpackage.hqa
    public final boolean b() {
        return !this.a.j().k.isEmpty();
    }

    @Override // defpackage.hqa
    public final int c() {
        return Math.max(0, this.a.h());
    }

    @Override // defpackage.hqa
    public final int d() {
        return Math.min(getItemCount() - 1, ((dsa) CollectionsKt.h0(this.a.j().k)).a);
    }

    @Override // defpackage.hqa
    public final int getItemCount() {
        return this.a.j().n;
    }
}
