package defpackage;

import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class gk0 extends o02 {
    public final /* synthetic */ hk0 m;

    public gk0(hk0 hk0Var) {
        this.m = hk0Var;
    }

    @Override // defpackage.o02
    public final boolean H(int i, int i2) {
        hk0 hk0Var = this.m;
        Object obj = ((List) hk0Var.c).get(i);
        Object obj2 = ((List) hk0Var.d).get(i2);
        if (obj != null && obj2 != null) {
            return ((j25) ((ik0) hk0Var.f).b.c).a(obj, obj2);
        }
        if (obj == null && obj2 == null) {
            return true;
        }
        ogj.b();
        return false;
    }

    @Override // defpackage.o02
    public final boolean I(int i, int i2) {
        hk0 hk0Var = this.m;
        Object obj = ((List) hk0Var.c).get(i);
        Object obj2 = ((List) hk0Var.d).get(i2);
        return (obj == null || obj2 == null) ? obj == null && obj2 == null : ((j25) ((ik0) hk0Var.f).b.c).b(obj, obj2);
    }

    @Override // defpackage.o02
    public final Object R(int i, int i2) {
        hk0 hk0Var = this.m;
        Object obj = ((List) hk0Var.c).get(i);
        Object obj2 = ((List) hk0Var.d).get(i2);
        if (obj == null || obj2 == null) {
            ogj.b();
            return null;
        }
        ((j25) ((ik0) hk0Var.f).b.c).getClass();
        return null;
    }

    @Override // defpackage.o02
    public final int W() {
        return ((List) this.m.d).size();
    }

    @Override // defpackage.o02
    public final int X() {
        return ((List) this.m.c).size();
    }
}
