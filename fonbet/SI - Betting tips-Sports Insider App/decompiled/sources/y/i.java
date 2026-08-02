package y;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class i extends n {
    @Override // y.d
    public final void a(d dVar) {
        x.a aVar = (x.a) this.f25514b;
        int i5 = aVar.f25265s0;
        e eVar = this.f25520h;
        Iterator it = eVar.f25499l.iterator();
        int i10 = 0;
        int i11 = -1;
        while (it.hasNext()) {
            int i12 = ((e) it.next()).f25495g;
            if (i11 == -1 || i12 < i11) {
                i11 = i12;
            }
            if (i10 < i12) {
                i10 = i12;
            }
        }
        if (i5 == 0 || i5 == 2) {
            eVar.d(i11 + aVar.f25267u0);
        } else {
            eVar.d(i10 + aVar.f25267u0);
        }
    }

    @Override // y.n
    public final void d() {
        x.d dVar = this.f25514b;
        if (dVar instanceof x.a) {
            e eVar = this.f25520h;
            eVar.f25490b = true;
            ArrayList arrayList = eVar.f25499l;
            x.a aVar = (x.a) dVar;
            int i5 = aVar.f25265s0;
            boolean z5 = aVar.f25266t0;
            int i10 = 0;
            if (i5 == 0) {
                eVar.f25493e = 4;
                while (i10 < aVar.f25369r0) {
                    x.d dVar2 = aVar.f25368q0[i10];
                    if (z5 || dVar2.f25305g0 != 8) {
                        e eVar2 = dVar2.f25299d.f25520h;
                        eVar2.f25498k.add(eVar);
                        arrayList.add(eVar2);
                    }
                    i10++;
                }
                m(this.f25514b.f25299d.f25520h);
                m(this.f25514b.f25299d.f25521i);
                return;
            }
            if (i5 == 1) {
                eVar.f25493e = 5;
                while (i10 < aVar.f25369r0) {
                    x.d dVar3 = aVar.f25368q0[i10];
                    if (z5 || dVar3.f25305g0 != 8) {
                        e eVar3 = dVar3.f25299d.f25521i;
                        eVar3.f25498k.add(eVar);
                        arrayList.add(eVar3);
                    }
                    i10++;
                }
                m(this.f25514b.f25299d.f25520h);
                m(this.f25514b.f25299d.f25521i);
                return;
            }
            if (i5 == 2) {
                eVar.f25493e = 6;
                while (i10 < aVar.f25369r0) {
                    x.d dVar4 = aVar.f25368q0[i10];
                    if (z5 || dVar4.f25305g0 != 8) {
                        e eVar4 = dVar4.f25301e.f25520h;
                        eVar4.f25498k.add(eVar);
                        arrayList.add(eVar4);
                    }
                    i10++;
                }
                m(this.f25514b.f25301e.f25520h);
                m(this.f25514b.f25301e.f25521i);
                return;
            }
            if (i5 != 3) {
                return;
            }
            eVar.f25493e = 7;
            while (i10 < aVar.f25369r0) {
                x.d dVar5 = aVar.f25368q0[i10];
                if (z5 || dVar5.f25305g0 != 8) {
                    e eVar5 = dVar5.f25301e.f25521i;
                    eVar5.f25498k.add(eVar);
                    arrayList.add(eVar5);
                }
                i10++;
            }
            m(this.f25514b.f25301e.f25520h);
            m(this.f25514b.f25301e.f25521i);
        }
    }

    @Override // y.n
    public final void e() {
        x.d dVar = this.f25514b;
        if (dVar instanceof x.a) {
            int i5 = ((x.a) dVar).f25265s0;
            e eVar = this.f25520h;
            if (i5 == 0 || i5 == 1) {
                dVar.Y = eVar.f25495g;
            } else {
                dVar.Z = eVar.f25495g;
            }
        }
    }

    @Override // y.n
    public final void f() {
        this.f25515c = null;
        this.f25520h.c();
    }

    @Override // y.n
    public final boolean k() {
        return false;
    }

    public final void m(e eVar) {
        e eVar2 = this.f25520h;
        eVar2.f25498k.add(eVar);
        eVar.f25499l.add(eVar2);
    }
}
