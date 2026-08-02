package io.sentry.android.core.internal.tombstone;

import s9.l0;
import s9.m0;
import s9.q;
import s9.r;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class l extends r {

    /* renamed from: g, reason: collision with root package name */
    public static final l f15682g;

    /* renamed from: h, reason: collision with root package name */
    public static volatile q f15683h;

    /* renamed from: e, reason: collision with root package name */
    public final l0 f15684e;

    /* renamed from: f, reason: collision with root package name */
    public final l0 f15685f;

    static {
        l lVar = new l();
        f15682g = lVar;
        lVar.f23373b &= Integer.MAX_VALUE;
        r.f23372d.put(l.class, lVar);
    }

    public l() {
        l0 l0Var = l0.f23351e;
        this.f15684e = l0Var;
        this.f15685f = l0Var;
    }

    @Override // s9.r
    public final Object a(int i5) {
        q qVar;
        int d10 = v.f.d(i5);
        if (d10 == 0) {
            return (byte) 1;
        }
        if (d10 == 2) {
            return new m0(f15682g, "\u0000\t\u0000\u0000\u0001\t\t\u0000\u0005\u0000\u0001\u0004\u0002Ȉ\u0003\u001b\u0004\u001b\u0005\u001b\u0006\u0002\u0007Ț\b\u0002\tȚ", new Object[]{"id_", "name_", "registers_", i.class, "currentBacktrace_", b.class, "memoryDump_", g.class, "taggedAddrCtrl_", "backtraceNote_", "pacEnabledKeys_", "unreadableElfFiles_"});
        }
        if (d10 == 3) {
            return new l();
        }
        if (d10 == 4) {
            return new j(f15682g);
        }
        if (d10 == 5) {
            return f15682g;
        }
        if (d10 != 6) {
            throw null;
        }
        q qVar2 = f15683h;
        if (qVar2 != null) {
            return qVar2;
        }
        synchronized (l.class) {
            try {
                qVar = f15683h;
                if (qVar == null) {
                    qVar = new q();
                    f15683h = qVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return qVar;
    }
}
