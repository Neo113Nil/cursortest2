package io.sentry;

/* loaded from: classes3.dex */
public final class k4 {

    /* renamed from: a, reason: collision with root package name */
    public final F3 f52152a;

    public k4(F3 f32) {
        this.f52152a = (F3) io.sentry.util.w.c(f32, "options are required");
    }

    public l4 a(K1 k12) {
        Double a10 = k12.a();
        l4 m10 = k12.b().m();
        if (m10 != null) {
            return io.sentry.util.A.a(m10);
        }
        this.f52152a.getProfilesSampler();
        Double profilesSampleRate = this.f52152a.getProfilesSampleRate();
        Boolean valueOf = Boolean.valueOf(profilesSampleRate != null && b(profilesSampleRate, a10));
        this.f52152a.getTracesSampler();
        l4 B10 = k12.b().B();
        if (B10 != null) {
            return io.sentry.util.A.a(B10);
        }
        Double tracesSampleRate = this.f52152a.getTracesSampleRate();
        Double valueOf2 = tracesSampleRate == null ? null : Double.valueOf(tracesSampleRate.doubleValue() / Math.pow(2.0d, this.f52152a.getBackpressureMonitor().a()));
        if (valueOf2 != null) {
            return new l4(Boolean.valueOf(b(valueOf2, a10)), valueOf2, a10, valueOf, profilesSampleRate);
        }
        Boolean bool = Boolean.FALSE;
        return new l4(bool, null, a10, bool, null);
    }

    public final boolean b(Double d10, Double d11) {
        return d10.doubleValue() >= d11.doubleValue();
    }

    public boolean c(double d10) {
        Double profileSessionSampleRate = this.f52152a.getProfileSessionSampleRate();
        return profileSessionSampleRate != null && b(profileSessionSampleRate, Double.valueOf(d10));
    }
}
