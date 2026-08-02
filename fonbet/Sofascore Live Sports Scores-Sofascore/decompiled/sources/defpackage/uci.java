package defpackage;

import kotlin.collections.CollectionsKt;
import kotlin.collections.a;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class uci implements xeh {
    public final long a;
    public final long b;

    public uci(long j, long j2) {
        this.a = j;
        this.b = j2;
        if (j < 0) {
            ogj.h(vxd.m("stopTimeout(", j, " ms) cannot be negative"));
            throw null;
        }
        if (j2 >= 0) {
            return;
        }
        ogj.h(vxd.m("replayExpiration(", j2, " ms) cannot be negative"));
        throw null;
    }

    @Override // defpackage.xeh
    public final z88 d(kki kkiVar) {
        return hkg.H(new v98(la8.a(kkiVar, new tci(this, null)), new d11(2, null, 17), 1));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof uci)) {
            return false;
        }
        uci uciVar = (uci) obj;
        return this.a == uciVar.a && this.b == uciVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        xbb xbbVar = new xbb(2);
        long j = this.a;
        if (j > 0) {
            xbbVar.add("stopTimeout=" + j + "ms");
        }
        long j2 = this.b;
        if (j2 < Long.MAX_VALUE) {
            xbbVar.add("replayExpiration=" + j2 + "ms");
        }
        return lnb.q(new StringBuilder("SharingStarted.WhileSubscribed("), CollectionsKt.f0(a.a(xbbVar), null, null, null, null, 63), ')');
    }
}
