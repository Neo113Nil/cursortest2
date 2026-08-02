package n2;

import E0.C2942q;
import f2.C6404d;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import m2.C8044b;

/* loaded from: classes8.dex */
public final class o {

    /* renamed from: f, reason: collision with root package name */
    static int f76337f;

    /* renamed from: b, reason: collision with root package name */
    int f76339b;

    /* renamed from: c, reason: collision with root package name */
    int f76340c;

    /* renamed from: a, reason: collision with root package name */
    ArrayList<m2.e> f76338a = new ArrayList<>();

    /* renamed from: d, reason: collision with root package name */
    ArrayList<a> f76341d = null;

    /* renamed from: e, reason: collision with root package name */
    private int f76342e = -1;

    static class a {
    }

    public o(int i11) {
        int i12 = f76337f;
        f76337f = i12 + 1;
        this.f76339b = i12;
        this.f76340c = i11;
    }

    public final boolean a(m2.e eVar) {
        ArrayList<m2.e> arrayList = this.f76338a;
        if (arrayList.contains(eVar)) {
            return false;
        }
        arrayList.add(eVar);
        return true;
    }

    public final void b(ArrayList<o> arrayList) {
        int size = this.f76338a.size();
        if (this.f76342e != -1 && size > 0) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                o oVar = arrayList.get(i11);
                if (this.f76342e == oVar.f76339b) {
                    f(this.f76340c, oVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public final int c() {
        return this.f76339b;
    }

    public final int d() {
        return this.f76340c;
    }

    public final int e(C6404d c6404d, int i11) {
        int o11;
        int o12;
        ArrayList<m2.e> arrayList = this.f76338a;
        if (arrayList.size() == 0) {
            return 0;
        }
        m2.f fVar = (m2.f) arrayList.get(0).f74116W;
        c6404d.u();
        fVar.f(c6404d, false);
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            arrayList.get(i12).f(c6404d, false);
        }
        if (i11 == 0 && fVar.f74172E0 > 0) {
            C8044b.a(fVar, c6404d, arrayList, 0);
        }
        if (i11 == 1 && fVar.f74173F0 > 0) {
            C8044b.a(fVar, c6404d, arrayList, 1);
        }
        try {
            c6404d.q();
        } catch (Exception e11) {
            System.err.println(e11.toString() + "\n" + Arrays.toString(e11.getStackTrace()).replace("[", "   at ").replace(",", "\n   at").replace("]", ""));
        }
        this.f76341d = new ArrayList<>();
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            m2.e eVar = arrayList.get(i13);
            a aVar = new a();
            new WeakReference(eVar);
            C6404d.o(eVar.f74104K);
            C6404d.o(eVar.f74105L);
            C6404d.o(eVar.f74106M);
            C6404d.o(eVar.f74107N);
            C6404d.o(eVar.f74108O);
            this.f76341d.add(aVar);
        }
        if (i11 == 0) {
            o11 = C6404d.o(fVar.f74104K);
            o12 = C6404d.o(fVar.f74106M);
            c6404d.u();
        } else {
            o11 = C6404d.o(fVar.f74105L);
            o12 = C6404d.o(fVar.f74107N);
            c6404d.u();
        }
        return o12 - o11;
    }

    public final void f(int i11, o oVar) {
        Iterator<m2.e> it = this.f76338a.iterator();
        while (it.hasNext()) {
            m2.e next = it.next();
            oVar.a(next);
            int i12 = oVar.f76339b;
            if (i11 == 0) {
                next.f74159t0 = i12;
            } else {
                next.f74161u0 = i12;
            }
        }
        this.f76342e = oVar.f76339b;
    }

    public final void g() {
        this.f76340c = 2;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        int i11 = this.f76340c;
        sb2.append(i11 == 0 ? "Horizontal" : i11 == 1 ? "Vertical" : i11 == 2 ? "Both" : "Unknown");
        sb2.append(" [");
        String e11 = K00.b.e(this.f76339b, "] <", sb2);
        Iterator<m2.e> it = this.f76338a.iterator();
        while (it.hasNext()) {
            m2.e next = it.next();
            StringBuilder e12 = C2942q.e(e11, " ");
            e12.append(next.s());
            e11 = e12.toString();
        }
        return U7.d.e(e11, " >");
    }
}
