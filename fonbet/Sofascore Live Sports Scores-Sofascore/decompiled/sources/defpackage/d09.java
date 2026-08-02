package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class d09 extends c1d {
    @Override // defpackage.c1d
    public final c1d C(Function1 function1, Function1 function12) {
        return (c1d) ((nnh) snh.b(new k1e(9, new j87(20, function1, function12))));
    }

    @Override // defpackage.c1d, defpackage.nnh
    public final void c() {
        synchronized (snh.c) {
            o();
            Unit unit = Unit.a;
        }
    }

    @Override // defpackage.c1d, defpackage.nnh
    public final void k() {
        zm2.M();
        throw null;
    }

    @Override // defpackage.c1d, defpackage.nnh
    public final void l() {
        zm2.M();
        throw null;
    }

    @Override // defpackage.c1d, defpackage.nnh
    public final void m() {
        snh.c();
    }

    @Override // defpackage.c1d, defpackage.nnh
    public final nnh u(Function1 function1) {
        return (iof) ((nnh) snh.b(new k1e(9, new zn6(6, function1))));
    }

    @Override // defpackage.c1d
    public final oea w() {
        throw new IllegalStateException("Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot");
    }
}
