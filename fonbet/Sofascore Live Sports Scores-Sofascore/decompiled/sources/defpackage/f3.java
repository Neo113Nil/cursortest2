package defpackage;

import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class f3 extends o02 {
    public final List m;
    public final List n;

    public f3(List list, List list2) {
        list.getClass();
        list2.getClass();
        this.m = list;
        this.n = list2;
    }

    @Override // defpackage.o02
    public boolean H(int i, int i2) {
        return this instanceof r6f;
    }

    @Override // defpackage.o02
    public Object R(int i, int i2) {
        return this.n.get(i2);
    }

    @Override // defpackage.o02
    public int W() {
        return this.n.size();
    }

    @Override // defpackage.o02
    public int X() {
        return this.m.size();
    }
}
