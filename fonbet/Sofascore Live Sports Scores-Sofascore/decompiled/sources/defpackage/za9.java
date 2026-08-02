package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class za9 implements qtk {
    public static final uxf d = new uxf(25);
    public final loa a;
    public final qtk b;
    public final ne c;

    public za9(loa loaVar, qtk qtkVar, z41 z41Var) {
        this.a = loaVar;
        this.b = qtkVar;
        this.c = new ne(z41Var, 1);
    }

    @Override // defpackage.qtk
    public final ltk a(Class cls, qzc qzcVar) {
        return this.a.containsKey(cls) ? this.c.a(cls, qzcVar) : this.b.a(cls, qzcVar);
    }

    @Override // defpackage.qtk
    public final ltk b(Class cls) {
        if (!this.a.containsKey(cls)) {
            return this.b.b(cls);
        }
        a70.m("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
        return null;
    }
}
