package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class u8j extends bw4 implements ug3, g8j {
    public kkj q;
    public Function1 r;
    public Function1 s;
    public Function1 t;
    public g9i u;
    public final ay4 v = goh.b(new w1i(this, 17));
    public oqf w = oqf.e;

    public u8j(kkj kkjVar, Function1 function1, Function1 function12, Function1 function13) {
        this.q = kkjVar;
        this.r = function1;
        this.s = function12;
        this.t = function13;
    }

    @Override // defpackage.g8j
    public final f8j R() {
        return (f8j) this.v.getValue();
    }

    @Override // defpackage.wtc
    public final void c1() {
        kkj kkjVar = this.q;
        kkjVar.b = jkj.c;
        kkjVar.a = this;
    }

    @Override // defpackage.wtc
    public final void d1() {
        kkj kkjVar = this.q;
        kkjVar.b = jkj.b;
        kkjVar.a = null;
    }

    @Override // defpackage.g8j
    public final long m0(dma dmaVar) {
        return p0(dmaVar).f();
    }

    @Override // defpackage.g8j
    public final oqf p0(dma dmaVar) {
        if (!this.n) {
            return this.w;
        }
        oqf oqfVar = (oqf) this.t.invoke(dmaVar);
        if (oqfVar == null) {
            return this.w;
        }
        this.w = oqfVar;
        return oqfVar;
    }
}
