package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class iof extends nnh {
    public final Function1 e;
    public int f;

    public iof(long j, rnh rnhVar, Function1 function1) {
        super(j, rnhVar);
        this.e = function1;
        this.f = 1;
    }

    @Override // defpackage.nnh
    public final void c() {
        if (this.c) {
            return;
        }
        l();
        super.c();
    }

    @Override // defpackage.nnh
    public final Function1 e() {
        return this.e;
    }

    @Override // defpackage.nnh
    public final boolean f() {
        return true;
    }

    @Override // defpackage.nnh
    public final Function1 i() {
        return null;
    }

    @Override // defpackage.nnh
    public final void k() {
        this.f++;
    }

    @Override // defpackage.nnh
    public final void l() {
        int i = this.f - 1;
        this.f = i;
        if (i == 0) {
            a();
        }
    }

    @Override // defpackage.nnh
    public final void n(qdi qdiVar) {
        z1h z1hVar = snh.a;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    @Override // defpackage.nnh
    public final nnh u(Function1 function1) {
        snh.v(this);
        return new d9d(this.b, this.a, snh.i(function1, this.e, true), this);
    }

    @Override // defpackage.nnh
    public final void m() {
    }
}
