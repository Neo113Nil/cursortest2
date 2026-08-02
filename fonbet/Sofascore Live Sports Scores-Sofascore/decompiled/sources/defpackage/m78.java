package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class m78 {
    public int a;
    public int b;
    public boolean c;
    public final List d;
    public final Object e;
    public Object f;

    public m78(q5f q5fVar, List list) {
        this.f = q5fVar;
        this.d = list;
        this.e = new List[list.size()];
        if (list.isEmpty()) {
            u3a.a("NestedPrefetchController shouldn't be created with no states");
        }
    }

    public void a(e4e e4eVar) {
        vg0 vg0Var = (vg0) this.d;
        ejg ejgVar = (ejg) this.e;
        e4eVar.getClass();
        this.c = true;
        if (!(e4eVar instanceof z3e)) {
            if (e4eVar instanceof w3e) {
                ejgVar.C(null, pfb.c);
                throw null;
            }
            if (e4eVar instanceof a4e) {
                a4e a4eVar = (a4e) e4eVar;
                ejgVar.B(a4eVar.a);
                this.f = a4eVar.b;
                return;
            } else {
                if (!(e4eVar instanceof d4e)) {
                    zzl.b();
                    return;
                }
                vg0Var.clear();
                this.b = 0;
                this.a = 0;
                vg0Var.addLast(new zvj(0, ((d4e) e4eVar).a));
                return;
            }
        }
        z3e z3eVar = (z3e) e4eVar;
        rfb rfbVar = z3eVar.e;
        int i = z3eVar.c;
        int i2 = z3eVar.d;
        List list = z3eVar.b;
        ejgVar.B(rfbVar);
        this.f = z3eVar.f;
        int ordinal = z3eVar.a.ordinal();
        if (ordinal == 0) {
            vg0Var.clear();
            this.b = i2;
            this.a = i;
            vg0Var.addAll(list);
            return;
        }
        if (ordinal == 1) {
            this.a = i;
            v6a it = llf.h(list.size() - 1, 0).iterator();
            while (it.c) {
                vg0Var.addFirst(list.get(it.nextInt()));
            }
            return;
        }
        if (ordinal != 2) {
            zzl.b();
        } else {
            this.b = i2;
            vg0Var.addAll(list);
        }
    }

    public List b() {
        vg0 vg0Var = (vg0) this.d;
        if (!this.c) {
            return km5.a;
        }
        ArrayList arrayList = new ArrayList();
        rfb F = ((ejg) this.e).F();
        if (vg0Var.isEmpty()) {
            arrayList.add(new a4e(F, (rfb) this.f));
            return arrayList;
        }
        List S0 = CollectionsKt.S0(vg0Var);
        int i = this.a;
        int i2 = this.b;
        rfb rfbVar = (rfb) this.f;
        S0.getClass();
        arrayList.add(new z3e(sfb.a, S0, i, i2, F, rfbVar));
        return arrayList;
    }

    public m78() {
        this.d = new vg0();
        this.e = new ejg(13);
    }
}
