package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class x4a extends wtc implements jyj {
    public w8l o;
    public w8l p;

    public x4a() {
        i68 i68Var = xw3.k;
        this.o = i68Var;
        this.p = i68Var;
    }

    @Override // defpackage.wtc
    public void c1() {
        jca.X(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", new w4a(this, 1));
        l1();
    }

    @Override // defpackage.wtc
    public void d1() {
        this.p = this.o;
        jca.Z(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", new w4a(this, 0));
    }

    @Override // defpackage.wtc
    public final void e1() {
        this.o = xw3.k;
    }

    public abstract w8l k1(w8l w8lVar);

    public void l1() {
        this.p = k1(this.o);
        jca.Z(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", new w4a(this, 0));
    }

    @Override // defpackage.jyj
    public final Object s() {
        return "androidx.compose.foundation.layout.ConsumedInsetsProvider";
    }
}
