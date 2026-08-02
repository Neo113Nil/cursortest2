package io.sentry;

import java.time.Instant;

/* renamed from: io.sentry.j3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4768j3 extends AbstractC4856v2 {

    /* renamed from: a, reason: collision with root package name */
    public final Instant f52132a;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C4768j3() {
        this(r0);
        Instant now;
        now = Instant.now();
    }

    @Override // io.sentry.AbstractC4856v2
    public long f() {
        long epochSecond;
        int nano;
        epochSecond = this.f52132a.getEpochSecond();
        long n10 = AbstractC4779m.n(epochSecond);
        nano = this.f52132a.getNano();
        return n10 + nano;
    }

    public C4768j3(Instant instant) {
        this.f52132a = instant;
    }
}
