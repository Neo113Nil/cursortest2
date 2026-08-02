package y;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import s7.t;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: f, reason: collision with root package name */
    public static int f25507f;

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f25508a;

    /* renamed from: b, reason: collision with root package name */
    public int f25509b;

    /* renamed from: c, reason: collision with root package name */
    public int f25510c;

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f25511d;

    /* renamed from: e, reason: collision with root package name */
    public int f25512e;

    public final void a(ArrayList arrayList) {
        int size = this.f25508a.size();
        if (this.f25512e != -1 && size > 0) {
            for (int i5 = 0; i5 < arrayList.size(); i5++) {
                m mVar = (m) arrayList.get(i5);
                if (this.f25512e == mVar.f25509b) {
                    c(this.f25510c, mVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public final int b(v.c cVar, int i5) {
        int n9;
        int n10;
        ArrayList arrayList = this.f25508a;
        if (arrayList.size() == 0) {
            return 0;
        }
        x.e eVar = (x.e) ((x.d) arrayList.get(0)).T;
        cVar.t();
        eVar.b(cVar, false);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((x.d) arrayList.get(i10)).b(cVar, false);
        }
        if (i5 == 0 && eVar.z0 > 0) {
            x.j.a(eVar, cVar, arrayList, 0);
        }
        if (i5 == 1 && eVar.A0 > 0) {
            x.j.a(eVar, cVar, arrayList, 1);
        }
        try {
            cVar.p();
        } catch (Exception e7) {
            System.err.println(e7.toString() + "\n" + Arrays.toString(e7.getStackTrace()).replace("[", "   at ").replace(StringUtils.COMMA, "\n   at").replace("]", ""));
        }
        this.f25511d = new ArrayList();
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            x.d dVar = (x.d) arrayList.get(i11);
            t tVar = new t(23);
            new WeakReference(dVar);
            v.c.n(dVar.I);
            v.c.n(dVar.J);
            v.c.n(dVar.K);
            v.c.n(dVar.L);
            v.c.n(dVar.M);
            this.f25511d.add(tVar);
        }
        if (i5 == 0) {
            n9 = v.c.n(eVar.I);
            n10 = v.c.n(eVar.K);
            cVar.t();
        } else {
            n9 = v.c.n(eVar.J);
            n10 = v.c.n(eVar.L);
            cVar.t();
        }
        return n10 - n9;
    }

    public final void c(int i5, m mVar) {
        int i10 = mVar.f25509b;
        Iterator it = this.f25508a.iterator();
        while (it.hasNext()) {
            x.d dVar = (x.d) it.next();
            ArrayList arrayList = mVar.f25508a;
            if (!arrayList.contains(dVar)) {
                arrayList.add(dVar);
            }
            if (i5 == 0) {
                dVar.f25316n0 = i10;
            } else {
                dVar.f25318o0 = i10;
            }
        }
        this.f25512e = i10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        int i5 = this.f25510c;
        sb2.append(i5 == 0 ? "Horizontal" : i5 == 1 ? "Vertical" : i5 == 2 ? "Both" : "Unknown");
        sb2.append(" [");
        String n9 = r4.k.n(sb2, this.f25509b, "] <");
        Iterator it = this.f25508a.iterator();
        while (it.hasNext()) {
            x.d dVar = (x.d) it.next();
            StringBuilder c2 = v.f.c(n9, " ");
            c2.append(dVar.f25307h0);
            n9 = c2.toString();
        }
        return r4.k.l(n9, " >");
    }
}
