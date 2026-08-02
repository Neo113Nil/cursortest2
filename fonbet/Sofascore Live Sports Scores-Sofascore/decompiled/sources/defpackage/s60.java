package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class s60 implements k1c {
    public final s70 a;
    public boolean b;

    public s60(s70 s70Var) {
        this.a = s70Var;
    }

    @Override // defpackage.k1c
    public final int a(l9a l9aVar, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int G = ((g1c) list.get(0)).G(i);
        int i2 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int G2 = ((g1c) list.get(i2)).G(i);
                if (G2 > G) {
                    G = G2;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return G;
    }

    @Override // defpackage.k1c
    public final l1c d(m1c m1cVar, List list, long j) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            qhe J = ((g1c) list.get(i3)).J(j);
            i = Math.max(i, J.a);
            i2 = Math.max(i2, J.b);
            arrayList.add(J);
        }
        boolean W = m1cVar.W();
        s70 s70Var = this.a;
        if (W) {
            this.b = true;
            ((eoh) s70Var.b).setValue(new c7a((i2 & 4294967295L) | (i << 32)));
        } else if (!this.b) {
            ((eoh) s70Var.b).setValue(new c7a((i2 & 4294967295L) | (i << 32)));
        }
        return m1c.G0(m1cVar, i, i2, new f00(arrayList, 2));
    }

    @Override // defpackage.k1c
    public final int h(l9a l9aVar, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int B = ((g1c) list.get(0)).B(i);
        int i2 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int B2 = ((g1c) list.get(i2)).B(i);
                if (B2 > B) {
                    B = B2;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return B;
    }

    @Override // defpackage.k1c
    public final int i(l9a l9aVar, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int b = ((g1c) list.get(0)).b(i);
        int i2 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int b2 = ((g1c) list.get(i2)).b(i);
                if (b2 > b) {
                    b = b2;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return b;
    }

    @Override // defpackage.k1c
    public final int j(l9a l9aVar, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int s = ((g1c) list.get(0)).s(i);
        int i2 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int s2 = ((g1c) list.get(i2)).s(i);
                if (s2 > s) {
                    s = s2;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return s;
    }
}
