package defpackage;

import java.util.concurrent.Future;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class o7p extends l7p {
    public v4p l;
    public m7p m;

    static {
        new s2p();
    }

    @Override // defpackage.t6p
    public final void f() {
        v4p v4pVar = this.l;
        this.l = null;
        this.m = null;
        if ((this.a instanceof n6p) && (v4pVar != null)) {
            boolean l = l();
            m3p listIterator = v4pVar.listIterator(0);
            while (listIterator.hasNext()) {
                ((Future) listIterator.next()).cancel(l);
            }
        }
    }

    @Override // defpackage.t6p
    public final String g() {
        v4p v4pVar = this.l;
        return v4pVar != null ? "futures=".concat(v4pVar.toString()) : super.g();
    }

    @Override // defpackage.t6p
    public final void k() {
        m7p m7pVar = this.m;
        if (m7pVar != null) {
            m7pVar.k();
        }
    }
}
