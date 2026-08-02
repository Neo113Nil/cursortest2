package io.sentry;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class u6 {

    /* renamed from: a, reason: collision with root package name */
    public final b6 f17153a;

    public u6(b6 b6Var) {
        this.f17153a = b6Var;
    }

    public final c4.d a(l1.a aVar) {
        Double d10 = (Double) aVar.f19315c;
        v6 v6Var = (v6) aVar.f19314b;
        c4.d dVar = v6Var.f16670d;
        if (dVar != null) {
            return ci.c.e(dVar);
        }
        b6 b6Var = this.f17153a;
        b6Var.getProfilesSampler();
        Double profilesSampleRate = b6Var.getProfilesSampleRate();
        Boolean valueOf = Boolean.valueOf(profilesSampleRate != null && profilesSampleRate.doubleValue() >= d10.doubleValue());
        b6Var.getTracesSampler();
        c4.d dVar2 = v6Var.f17200r;
        if (dVar2 != null) {
            return ci.c.e(dVar2);
        }
        Double tracesSampleRate = b6Var.getTracesSampleRate();
        Double valueOf2 = tracesSampleRate == null ? null : Double.valueOf(tracesSampleRate.doubleValue() / Math.pow(2.0d, b6Var.getBackpressureMonitor().a()));
        if (valueOf2 == null) {
            Boolean bool = Boolean.FALSE;
            return new c4.d(bool, (Double) null, d10, bool, (Double) null);
        }
        boolean z5 = false;
        if (valueOf2.doubleValue() >= d10.doubleValue()) {
            z5 = true;
        }
        return new c4.d(Boolean.valueOf(z5), valueOf2, d10, valueOf, profilesSampleRate);
    }
}
