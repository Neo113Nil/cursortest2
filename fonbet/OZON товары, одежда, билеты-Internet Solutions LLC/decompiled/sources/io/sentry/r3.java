package io.sentry;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class r3 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final W2 f68409a;

    public r3(@NotNull W2 w22) {
        this.f68409a = w22;
    }

    @NotNull
    public final s3 a(@NotNull C7205t1 c7205t1) {
        Double a11 = c7205t1.a();
        s3 k11 = c7205t1.b().k();
        if (k11 != null) {
            return io.sentry.util.t.a(k11);
        }
        W2 w22 = this.f68409a;
        w22.getProfilesSampler();
        Double profilesSampleRate = w22.getProfilesSampleRate();
        Boolean valueOf = Boolean.valueOf(profilesSampleRate != null && profilesSampleRate.doubleValue() >= a11.doubleValue());
        w22.getTracesSampler();
        s3 v11 = c7205t1.b().v();
        if (v11 != null) {
            return io.sentry.util.t.a(v11);
        }
        Double tracesSampleRate = w22.getTracesSampleRate();
        Double valueOf2 = tracesSampleRate == null ? null : Double.valueOf(tracesSampleRate.doubleValue() / Math.pow(2.0d, w22.getBackpressureMonitor().a()));
        if (valueOf2 != null) {
            return new s3(Boolean.valueOf(valueOf2.doubleValue() >= a11.doubleValue()), valueOf2, a11, valueOf, profilesSampleRate);
        }
        Boolean bool = Boolean.FALSE;
        return new s3(bool, null, a11, bool, null);
    }

    public final boolean b(double d11) {
        Double profileSessionSampleRate = this.f68409a.getProfileSessionSampleRate();
        return profileSessionSampleRate != null && profileSessionSampleRate.doubleValue() >= d11;
    }
}
