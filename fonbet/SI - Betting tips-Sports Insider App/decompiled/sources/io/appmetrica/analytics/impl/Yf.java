package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.executors.InterruptionSafeThread;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Yf implements Wf {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0129eg f13228a;

    public Yf(C0129eg c0129eg) {
        this.f13228a = c0129eg;
    }

    @Override // io.appmetrica.analytics.impl.Wf
    public final void a() {
        C0129eg c0129eg = this.f13228a;
        C0652za c0652za = c0129eg.f13691b;
        Xf xf2 = new Xf(c0129eg);
        c0652za.getClass();
        try {
            FutureTask futureTask = new FutureTask(new CallableC0627ya(c0652za));
            C0353na.I.f14324d.f14148a.getClass();
            new InterruptionSafeThread(futureTask, "IAA-SHMSR-" + ThreadFactoryC0655zd.f14994a.incrementAndGet()).start();
            C0359ng c0359ng = (C0359ng) futureTask.get(5L, TimeUnit.SECONDS);
            lo.a(c0652za.f14993b);
            C0129eg.a(c0129eg, c0359ng, C0129eg.a(c0129eg));
        } catch (Throwable th2) {
            try {
                xf2.a(th2);
            } finally {
                lo.a(c0652za.f14993b);
            }
        }
    }
}
