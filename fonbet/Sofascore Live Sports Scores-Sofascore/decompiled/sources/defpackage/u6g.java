package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class u6g extends tma {
    public static final u6g c = new u6g("Undefined intrinsics block and it is required", 0);
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u6g(String str, int i) {
        super(str);
        this.b = i;
    }

    @Override // defpackage.k1c
    public final l1c d(m1c m1cVar, List list, long j) {
        switch (this.b) {
            case 0:
                int size = list.size();
                if (size == 0) {
                    return m1c.G0(m1cVar, an3.j(j), an3.i(j), tyd.n);
                }
                if (size == 1) {
                    qhe J = ((g1c) list.get(0)).J(j);
                    return m1c.G0(m1cVar, cn3.g(J.a, j), cn3.f(J.b, j), new jy(J, 9));
                }
                ArrayList arrayList = new ArrayList(list.size());
                int size2 = list.size();
                int i = 0;
                int i2 = 0;
                for (int i3 = 0; i3 < size2; i3++) {
                    qhe J2 = ((g1c) list.get(i3)).J(j);
                    i = Math.max(J2.a, i);
                    i2 = Math.max(J2.b, i2);
                    arrayList.add(J2);
                }
                return m1c.G0(m1cVar, cn3.g(i, j), cn3.f(i2, j), new f00(arrayList, 3));
            default:
                throw new IllegalStateException("Undefined measure and it is required");
        }
    }
}
