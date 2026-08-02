package io.sentry.android.core;

import io.appmetrica.analytics.impl.C0201ha;
import io.appmetrica.analytics.impl.C0644z2;
import io.appmetrica.analytics.impl.ap;
import io.sentry.b5;
import io.sentry.d4;
import io.sentry.y3;
import java.util.Timer;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class v0 implements e0 {

    /* renamed from: b, reason: collision with root package name */
    public final long f15866b;

    /* renamed from: c, reason: collision with root package name */
    public io.sentry.n f15867c;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f15871g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f15872h;

    /* renamed from: a, reason: collision with root package name */
    public final AtomicLong f15865a = new AtomicLong(0);

    /* renamed from: d, reason: collision with root package name */
    public final io.sentry.util.f f15868d = new io.sentry.util.f(new ap(26));

    /* renamed from: e, reason: collision with root package name */
    public final io.sentry.util.a f15869e = new io.sentry.util.a();

    /* renamed from: f, reason: collision with root package name */
    public final y3 f15870f = y3.f17255a;

    /* renamed from: i, reason: collision with root package name */
    public final io.sentry.transport.d f15873i = io.sentry.transport.d.f17127a;

    public v0(long j, boolean z5, boolean z7) {
        this.f15866b = j;
        this.f15871g = z5;
        this.f15872h = z7;
    }

    public final void a(String str) {
        if (this.f15872h) {
            io.sentry.e eVar = new io.sentry.e();
            eVar.f16334e = "navigation";
            eVar.c(str, "state");
            eVar.f16336g = "app.lifecycle";
            eVar.f16338i = b5.INFO;
            this.f15870f.c(eVar);
        }
    }

    public final void b() {
        io.sentry.r a7 = this.f15869e.a();
        try {
            io.sentry.n nVar = this.f15867c;
            if (nVar != null) {
                nVar.cancel();
                this.f15867c = null;
            }
            a7.close();
        } catch (Throwable th2) {
            try {
                a7.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // io.sentry.android.core.e0
    public final void k() {
        b();
        this.f15873i.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        androidx.credentials.playservices.controllers.CreateRestoreCredential.a aVar = new androidx.credentials.playservices.controllers.CreateRestoreCredential.a(28, this);
        y3 y3Var = this.f15870f;
        y3Var.getClass();
        d4.c(aVar);
        AtomicLong atomicLong = this.f15865a;
        long j = atomicLong.get();
        if (j == 0 || j + this.f15866b <= currentTimeMillis) {
            if (this.f15871g) {
                y3Var.q();
            }
            y3Var.m().getReplayController().z();
        }
        y3Var.m().getReplayController().t();
        atomicLong.set(currentTimeMillis);
        a(C0201ha.f13893g);
    }

    @Override // io.sentry.android.core.e0
    public final void n() {
        this.f15873i.getClass();
        this.f15865a.set(System.currentTimeMillis());
        this.f15870f.m().getReplayController().c();
        io.sentry.r a7 = this.f15869e.a();
        try {
            b();
            this.f15867c = new io.sentry.n(1, this);
            ((Timer) this.f15868d.a()).schedule(this.f15867c, this.f15866b);
            a7.close();
            a(C0644z2.f14985g);
        } catch (Throwable th2) {
            try {
                a7.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }
}
