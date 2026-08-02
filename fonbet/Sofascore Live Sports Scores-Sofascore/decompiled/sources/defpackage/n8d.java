package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class n8d {
    public final fdi a = gdi.a(p8d.a);
    public final fdi b;
    public final jof c;
    public final vg0 d;
    public final vg0 e;
    public h8d f;
    public int g;
    public m8d h;
    public final m0d i;
    public final m0d j;
    public final m0d k;
    public boolean l;
    public boolean m;
    public boolean n;

    public n8d() {
        fdi a = gdi.a(new k8d());
        this.b = a;
        this.c = un0.u(a);
        this.d = new vg0();
        this.e = new vg0();
        this.i = awd.a();
        this.j = awd.a();
        this.k = awd.a();
    }

    public final void a(f8d f8dVar, m8d m8dVar, int i) {
        f8dVar.getClass();
        if (m8dVar.a == null) {
            (i != 0 ? i != 1 ? this.i : this.j : this.k).g(m8dVar);
            m8dVar.a = f8dVar;
            ((k8d) this.c.a.getValue()).getClass();
            m8dVar.b(i != 0 ? i != 1 ? this.n : this.l : this.m);
            return;
        }
        StringBuilder sb = new StringBuilder("Input '");
        sb.append(m8dVar);
        f8d f8dVar2 = m8dVar.a;
        sb.append("' is already added to dispatcher ");
        sb.append(f8dVar2);
        sb.append('.');
        throw new IllegalArgumentException(sb.toString().toString());
    }

    public final void b() {
        boolean z;
        boolean z2;
        vg0 vg0Var = this.d;
        if (!vg0Var.isEmpty()) {
            Iterator it = vg0Var.iterator();
            while (it.hasNext()) {
                h8d h8dVar = (h8d) it.next();
                if (h8dVar.e || h8dVar.f) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        vg0 vg0Var2 = this.e;
        if (!vg0Var2.isEmpty()) {
            Iterator it2 = vg0Var2.iterator();
            while (it2.hasNext()) {
                h8d h8dVar2 = (h8d) it2.next();
                if (h8dVar2.e || h8dVar2.f) {
                    z2 = true;
                    break;
                }
            }
        }
        z2 = false;
        boolean z3 = z || z2;
        boolean z4 = this.m != z;
        boolean z5 = this.l != z2;
        boolean z6 = this.n != z3;
        if (z4) {
            m0d m0dVar = this.k;
            Object[] objArr = m0dVar.b;
            long[] jArr = m0dVar.c;
            int i = m0dVar.e;
            while (i != Integer.MAX_VALUE) {
                int i2 = (int) ((jArr[i] >> 31) & 2147483647L);
                ((m8d) objArr[i]).b(z);
                i = i2;
            }
        }
        if (z5) {
            m0d m0dVar2 = this.j;
            Object[] objArr2 = m0dVar2.b;
            long[] jArr2 = m0dVar2.c;
            int i3 = m0dVar2.e;
            while (i3 != Integer.MAX_VALUE) {
                int i4 = (int) ((jArr2[i3] >> 31) & 2147483647L);
                ((m8d) objArr2[i3]).b(z2);
                i3 = i4;
            }
        }
        if (z6) {
            m0d m0dVar3 = this.i;
            Object[] objArr3 = m0dVar3.b;
            long[] jArr3 = m0dVar3.c;
            int i5 = m0dVar3.e;
            while (i5 != Integer.MAX_VALUE) {
                int i6 = (int) ((jArr3[i5] >> 31) & 2147483647L);
                ((m8d) objArr3[i5]).b(z3);
                i5 = i6;
            }
        }
        this.m = z;
        this.l = z2;
        this.n = z3;
        h8d h8dVar3 = this.f;
        if (h8dVar3 == null) {
            h8dVar3 = c(0);
        }
        d(h8dVar3);
    }

    public final h8d c(int i) {
        Object obj;
        Object obj2;
        Object obj3;
        vg0 vg0Var = this.e;
        vg0 vg0Var2 = this.d;
        Object obj4 = null;
        if (i == -1) {
            Iterator it = vg0Var2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((h8d) obj).e) {
                    break;
                }
            }
            h8d h8dVar = (h8d) obj;
            if (h8dVar != null) {
                return h8dVar;
            }
            Iterator it2 = vg0Var.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (((h8d) next).e) {
                    obj4 = next;
                    break;
                }
            }
            return (h8d) obj4;
        }
        if (i == 0) {
            Iterator it3 = vg0Var2.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it3.next();
                h8d h8dVar2 = (h8d) obj2;
                if (h8dVar2.e || h8dVar2.f) {
                    break;
                }
            }
            h8d h8dVar3 = (h8d) obj2;
            if (h8dVar3 != null) {
                return h8dVar3;
            }
            Iterator it4 = vg0Var.iterator();
            while (it4.hasNext()) {
                Object next2 = it4.next();
                h8d h8dVar4 = (h8d) next2;
                if (h8dVar4.e || h8dVar4.f) {
                    obj4 = next2;
                    break;
                }
            }
            return (h8d) obj4;
        }
        if (i != 1) {
            throw new IllegalStateException(("Unsupported direction: '" + i + "'.").toString());
        }
        Iterator it5 = vg0Var2.iterator();
        while (true) {
            if (!it5.hasNext()) {
                obj3 = null;
                break;
            }
            obj3 = it5.next();
            if (((h8d) obj3).f) {
                break;
            }
        }
        h8d h8dVar5 = (h8d) obj3;
        if (h8dVar5 != null) {
            return h8dVar5;
        }
        Iterator it6 = vg0Var.iterator();
        while (true) {
            if (!it6.hasNext()) {
                break;
            }
            Object next3 = it6.next();
            if (((h8d) next3).f) {
                obj4 = next3;
                break;
            }
        }
        return (h8d) obj4;
    }

    public final void d(h8d h8dVar) {
        k8d k8dVar;
        h8d h8dVar2 = this.f;
        if (h8dVar2 == null) {
            h8dVar2 = c(0);
        }
        if (Intrinsics.c(h8dVar2, h8dVar)) {
            if (h8dVar2 == null) {
                k8dVar = new k8d();
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator<E> it = this.d.iterator();
                while (it.hasNext()) {
                    h8d h8dVar3 = (h8d) it.next();
                    if (h8dVar3.e && !h8dVar3.b.isEmpty()) {
                        arrayList.addAll(h8dVar3.b);
                    }
                }
                Iterator<E> it2 = this.e.iterator();
                while (it2.hasNext()) {
                    h8d h8dVar4 = (h8d) it2.next();
                    if (h8dVar4.e && !h8dVar4.b.isEmpty()) {
                        arrayList.addAll(h8dVar4.b);
                    }
                }
                l8d l8dVar = h8dVar2.a;
                List list = h8dVar2.c;
                l8dVar.getClass();
                list.getClass();
                k8dVar = new k8d(l8dVar, arrayList, list, arrayList.size());
            }
            fdi fdiVar = this.b;
            if (Intrinsics.c((k8d) fdiVar.getValue(), k8dVar)) {
                return;
            }
            fdiVar.m(null, k8dVar);
            m0d m0dVar = this.k;
            Object[] objArr = m0dVar.b;
            long[] jArr = m0dVar.c;
            int i = m0dVar.e;
            while (i != Integer.MAX_VALUE) {
                int i2 = (int) (2147483647L & (jArr[i] >> 31));
                ((m8d) objArr[i]).getClass();
                i = i2;
            }
            m0d m0dVar2 = this.j;
            Object[] objArr2 = m0dVar2.b;
            long[] jArr2 = m0dVar2.c;
            int i3 = m0dVar2.e;
            while (i3 != Integer.MAX_VALUE) {
                int i4 = (int) ((jArr2[i3] >> 31) & 2147483647L);
                ((m8d) objArr2[i3]).getClass();
                i3 = i4;
            }
            m0d m0dVar3 = this.i;
            Object[] objArr3 = m0dVar3.b;
            long[] jArr3 = m0dVar3.c;
            int i5 = m0dVar3.e;
            while (i5 != Integer.MAX_VALUE) {
                int i6 = (int) ((jArr3[i5] >> 31) & 2147483647L);
                ((m8d) objArr3[i5]).getClass();
                i5 = i6;
            }
        }
    }
}
