package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ora extends wtc implements p3h {
    public Function0 o;
    public ira p;
    public ewd q;
    public boolean r;
    public wtg s;
    public final mra t = new mra(this, 0);
    public mra u;

    public ora(Function0 function0, ira iraVar, ewd ewdVar, boolean z) {
        this.o = function0;
        this.p = iraVar;
        this.q = ewdVar;
        this.r = z;
        k1();
    }

    @Override // defpackage.wtc
    public final boolean Z0() {
        return false;
    }

    @Override // defpackage.p3h
    public final void i(b4h b4hVar) {
        KProperty[] kPropertyArr;
        y3h.m(b4hVar);
        b4hVar.a(w3h.P, this.t);
        ewd ewdVar = this.q;
        ewd ewdVar2 = ewd.a;
        wtg wtgVar = this.s;
        if (ewdVar == ewdVar2) {
            if (wtgVar == null) {
                Intrinsics.i("scrollAxisRange");
                throw null;
            }
            a4h a4hVar = w3h.w;
            kPropertyArr = y3h.a;
            KProperty kProperty = kPropertyArr[13];
            b4hVar.a(a4hVar, wtgVar);
        } else {
            if (wtgVar == null) {
                Intrinsics.i("scrollAxisRange");
                throw null;
            }
            a4h a4hVar2 = w3h.v;
            kPropertyArr = y3h.a;
            KProperty kProperty2 = kPropertyArr[12];
            b4hVar.a(a4hVar2, wtgVar);
        }
        mra mraVar = this.u;
        if (mraVar != null) {
            b4hVar.a(k3h.f, new m9(null, mraVar));
        }
        b4hVar.a(k3h.C, new m9(null, new xjd(new nra(this, 2), 5)));
        f13 c = this.p.c();
        a4h a4hVar3 = w3h.f;
        KProperty kProperty3 = kPropertyArr[24];
        b4hVar.a(a4hVar3, c);
    }

    public final void k1() {
        this.s = new wtg(new nra(this, 0), new nra(this, 1));
        this.u = this.r ? new mra(this, 1) : null;
    }
}
