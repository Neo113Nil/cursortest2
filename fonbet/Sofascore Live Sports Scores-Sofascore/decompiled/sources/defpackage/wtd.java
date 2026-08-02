package defpackage;

import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class wtd extends cvd {
    public static final wtd c = new wtd(0, 2, 1);

    @Override // defpackage.cvd
    public final void a(zz0 zz0Var, qf0 qf0Var, mlh mlhVar, qn2 qn2Var, dvd dvdVar) {
        int i = ((z6a) zz0Var.h(0)).a;
        List list = (List) zz0Var.h(1);
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            int i3 = i + i2;
            qf0Var.w(i3, obj);
            qf0Var.s(i3, obj);
        }
    }
}
