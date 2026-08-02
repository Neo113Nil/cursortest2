package defpackage;

import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class t4 extends u4 implements RandomAccess {
    public final u4 a;
    public final int b;
    public final int c;

    public t4(u4 u4Var, int i, int i2) {
        this.a = u4Var;
        this.b = i;
        q4 q4Var = u4.Companion;
        int size = u4Var.size();
        q4Var.getClass();
        q4.d(i, i2, size);
        this.c = i2 - i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        u4.Companion.getClass();
        q4.b(i, this.c);
        return this.a.get(this.b + i);
    }

    @Override // defpackage.v2
    public final int getSize() {
        return this.c;
    }

    @Override // defpackage.u4, java.util.List, defpackage.gv9
    public final List subList(int i, int i2) {
        u4.Companion.getClass();
        q4.d(i, i2, this.c);
        int i3 = this.b;
        return new t4(this.a, i + i3, i3 + i2);
    }
}
