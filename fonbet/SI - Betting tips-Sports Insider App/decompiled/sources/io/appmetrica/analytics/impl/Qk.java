package io.appmetrica.analytics.impl;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Qk {

    /* renamed from: a, reason: collision with root package name */
    public final xo f12783a;

    public Qk(xo xoVar) {
        this.f12783a = xoVar;
    }

    public final long a() {
        long optLong;
        xo xoVar = this.f12783a;
        synchronized (xoVar) {
            optLong = xoVar.f14934a.a().optLong("session_id", -1L);
        }
        long j = optLong >= 10000000000L ? 1 + optLong : 10000000000L;
        this.f12783a.b(j);
        return j;
    }
}
