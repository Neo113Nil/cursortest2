package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class ev9 extends u4 implements gv9 {
    public final b7 a;
    public final int b;
    public final int c;

    public ev9(int i, int i2, b7 b7Var) {
        this.a = b7Var;
        this.b = i;
        tz9.x(i, i2, b7Var.size());
        this.c = i2 - i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        tz9.v(i, this.c);
        return this.a.get(this.b + i);
    }

    @Override // defpackage.v2
    public final int getSize() {
        return this.c;
    }

    @Override // defpackage.u4, java.util.List, defpackage.gv9
    public final ev9 subList(int i, int i2) {
        tz9.x(i, i2, this.c);
        int i3 = this.b;
        return new ev9(i + i3, i3 + i2, this.a);
    }
}
