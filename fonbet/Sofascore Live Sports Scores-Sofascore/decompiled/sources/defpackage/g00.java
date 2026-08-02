package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class g00 implements k1c {
    public static final g00 b = new g00(0);
    public static final g00 c = new g00(1);
    public static final g00 d = new g00(2);
    public static final g00 e = new g00(3);
    public static final g00 f = new g00(4);
    public static final g00 g = new g00(5);
    public static final qz4 h = new qz4(21);
    public static final g00 i = new g00(6);
    public static final g00 j = new g00(7);
    public static final g00 k = new g00(8);
    public static final g00 l = new g00(9);
    public final /* synthetic */ int a;

    public /* synthetic */ g00(int i2) {
        this.a = i2;
    }

    @Override // defpackage.k1c
    public final l1c d(m1c m1cVar, List list, long j2) {
        switch (this.a) {
            case 0:
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                int i2 = 0;
                int i3 = 0;
                for (int i4 = 0; i4 < size; i4++) {
                    qhe J = ((g1c) list.get(i4)).J(j2);
                    i2 = Math.max(i2, J.a);
                    i3 = Math.max(i3, J.b);
                    arrayList.add(J);
                }
                if (list.isEmpty()) {
                    i2 = an3.j(j2);
                    i3 = an3.i(j2);
                }
                return m1c.G0(m1cVar, i2, i3, new f00(arrayList, 0));
            case 1:
                int size2 = list.size();
                if (size2 == 0) {
                    return m1c.G0(m1cVar, 0, 0, ry.r);
                }
                if (size2 == 1) {
                    qhe J2 = ((g1c) list.get(0)).J(j2);
                    return m1c.G0(m1cVar, J2.a, J2.b, new jy(J2, 1));
                }
                ArrayList arrayList2 = new ArrayList(list.size());
                int size3 = list.size();
                int i5 = 0;
                int i6 = 0;
                while (r0 < size3) {
                    qhe J3 = ((g1c) list.get(r0)).J(j2);
                    i5 = Math.max(i5, J3.a);
                    i6 = Math.max(i6, J3.b);
                    arrayList2.add(J3);
                    r0++;
                }
                return m1c.G0(m1cVar, i5, i6, new f00(arrayList2, 1));
            case 2:
                ArrayList arrayList3 = new ArrayList(list.size());
                int size4 = list.size();
                for (int i7 = 0; i7 < size4; i7++) {
                    arrayList3.add(((g1c) list.get(i7)).J(j2));
                }
                return m1c.G0(m1cVar, an3.h(j2), an3.g(j2), new s80(arrayList3, r0));
            case 3:
                return m1c.G0(m1cVar, an3.j(j2), an3.i(j2), ry.E);
            case 4:
                return m1c.G0(m1cVar, an3.j(j2), an3.i(j2), new sx1(28));
            case 5:
                return m1c.G0(m1cVar, an3.h(j2), an3.g(j2), h);
            case 6:
                return m1c.G0(m1cVar, an3.j(j2), an3.i(j2), new yo9(9));
            case 7:
                ArrayList arrayList4 = new ArrayList(list.size());
                int size5 = list.size();
                int i8 = 0;
                int i9 = 0;
                while (r0 < size5) {
                    qhe J4 = ((g1c) list.get(r0)).J(j2);
                    i8 = Math.max(i8, J4.a);
                    i9 = Math.max(i9, J4.b);
                    arrayList4.add(J4);
                    r0++;
                }
                return m1c.G0(m1cVar, i8, i9, new s80(arrayList4, 4));
            case 8:
                return m1c.G0(m1cVar, an3.f(j2) ? an3.h(j2) : 0, an3.e(j2) ? an3.g(j2) : 0, new z1h(20));
            default:
                return m1c.G0(m1cVar, an3.j(j2), an3.i(j2), new wik(2));
        }
    }
}
