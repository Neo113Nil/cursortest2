package defpackage;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class zah implements yae, k41, cja {
    public final String b;
    public final boolean c;
    public final gmb d;
    public final ibh e;
    public boolean f;
    public final Path a = new Path();
    public final xl1 g = new xl1(1);

    public zah(gmb gmbVar, p41 p41Var, tbh tbhVar) {
        this.b = tbhVar.a;
        this.c = tbhVar.d;
        this.d = gmbVar;
        ibh ibhVar = new ibh((List) tbhVar.c.b);
        this.e = ibhVar;
        p41Var.f(ibhVar);
        ibhVar.a(this);
    }

    @Override // defpackage.k41
    public final void a() {
        this.f = false;
        this.d.invalidateSelf();
    }

    @Override // defpackage.fo3
    public final void b(List list, List list2) {
        ArrayList arrayList = null;
        int i = 0;
        while (true) {
            ArrayList arrayList2 = (ArrayList) list;
            if (i >= arrayList2.size()) {
                this.e.m = arrayList;
                return;
            }
            fo3 fo3Var = (fo3) arrayList2.get(i);
            if (fo3Var instanceof k1k) {
                k1k k1kVar = (k1k) fo3Var;
                if (k1kVar.c == 1) {
                    this.g.b.add(k1kVar);
                    k1kVar.c(this);
                    i++;
                }
            }
            if (fo3Var instanceof r7g) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                r7g r7gVar = (r7g) fo3Var;
                r7gVar.b.a(this);
                arrayList.add(r7gVar);
            }
            i++;
        }
    }

    @Override // defpackage.bja
    public final void c(aja ajaVar, int i, ArrayList arrayList, aja ajaVar2) {
        pkc.g(ajaVar, i, arrayList, ajaVar2, this);
    }

    @Override // defpackage.bja
    public final void d(wj9 wj9Var, Object obj) {
        if (obj == nmb.N) {
            this.e.j(wj9Var);
        }
    }

    @Override // defpackage.fo3
    public final String getName() {
        return this.b;
    }

    @Override // defpackage.yae
    public final Path n() {
        boolean z = this.f;
        ibh ibhVar = this.e;
        Path path = this.a;
        if (z && ibhVar.e == null) {
            return path;
        }
        path.reset();
        if (this.c) {
            this.f = true;
            return path;
        }
        Path path2 = (Path) ibhVar.e();
        if (path2 == null) {
            return path;
        }
        path.set(path2);
        path.setFillType(Path.FillType.EVEN_ODD);
        this.g.b(path);
        this.f = true;
        return path;
    }
}
