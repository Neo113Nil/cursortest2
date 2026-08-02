package io.sentry.android.core.internal.tombstone;

import s9.b0;
import s9.l0;
import s9.m0;
import s9.q;
import s9.r;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class o extends r {

    /* renamed from: h, reason: collision with root package name */
    public static final o f15688h;

    /* renamed from: i, reason: collision with root package name */
    public static volatile q f15689i;

    /* renamed from: e, reason: collision with root package name */
    public final l0 f15690e;

    /* renamed from: f, reason: collision with root package name */
    public final b0 f15691f = b0.f23284b;

    /* renamed from: g, reason: collision with root package name */
    public final l0 f15692g;

    static {
        o oVar = new o();
        f15688h = oVar;
        oVar.f23373b &= Integer.MAX_VALUE;
        r.f23372d.put(o.class, oVar);
    }

    public o() {
        l0 l0Var = l0.f23351e;
        this.f15690e = l0Var;
        this.f15692g = l0Var;
    }

    @Override // s9.r
    public final Object a(int i5) {
        q qVar;
        int d10 = v.f.d(i5);
        if (d10 == 0) {
            return (byte) 1;
        }
        if (d10 == 2) {
            return new m0(f15688h, "\u0000\u0017\u0000\u0001\u0001\u001a\u0017\u0002\u0006\u0000\u0001\f\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005\u000b\u0006\u000b\u0007\u000b\bȈ\tȚ\nဉ\u0000\u000eȈ\u000f\u001b\u00102\u0011\u001b\u0012\u001b\u0013\u001b\u0014\u000b\u0015\u001b\u0016\u000b\u0017\u0007\u0018\f\u00192\u001aဉ\u0001", new Object[]{"bitField0_", "arch_", "buildFingerprint_", "revision_", "timestamp_", "pid_", "tid_", "uid_", "selinuxLabel_", "commandLine_", "signalInfo_", "abortMessage_", "causes_", c.class, "threads_", n.f15687a, "memoryMappings_", h.class, "logBuffers_", f.class, "openFds_", e.class, "processUptime_", "crashDetails_", d.class, "pageSize_", "hasBeen16KbMode_", "guestArch_", "guestThreads_", m.f15686a, "stackHistoryBuffer_"});
        }
        if (d10 == 3) {
            return new o();
        }
        if (d10 == 4) {
            return new j(f15688h);
        }
        if (d10 == 5) {
            return f15688h;
        }
        if (d10 != 6) {
            throw null;
        }
        q qVar2 = f15689i;
        if (qVar2 != null) {
            return qVar2;
        }
        synchronized (o.class) {
            try {
                qVar = f15689i;
                if (qVar == null) {
                    qVar = new q();
                    f15689i = qVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return qVar;
    }
}
