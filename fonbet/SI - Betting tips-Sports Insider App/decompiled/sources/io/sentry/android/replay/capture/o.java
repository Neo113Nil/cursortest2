package io.sentry.android.replay.capture;

import ag.u;
import androidx.fragment.app.r;
import io.appmetrica.analytics.impl.ap;
import io.sentry.android.replay.v;
import io.sentry.b1;
import io.sentry.b5;
import io.sentry.b6;
import io.sentry.c6;
import java.util.Date;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class o extends c {

    /* renamed from: r, reason: collision with root package name */
    public final b6 f16016r;

    /* renamed from: s, reason: collision with root package name */
    public final b1 f16017s;

    /* renamed from: t, reason: collision with root package name */
    public final io.sentry.transport.f f16018t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(b6 options, b1 b1Var, io.sentry.transport.f dateProvider, ScheduledExecutorService executor) {
        super(options, b1Var, dateProvider, executor);
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.f16016r = options;
        this.f16017s = b1Var;
        this.f16018t = dateProvider;
    }

    @Override // io.sentry.android.replay.capture.l
    public final void b(v recorderConfig) {
        Intrinsics.checkNotNullParameter(recorderConfig, "recorderConfig");
        n("onConfigurationChanged", new n(this, 0));
        Intrinsics.checkNotNullParameter(recorderConfig, "recorderConfig");
        u property = c.q[0];
        b bVar = this.f15983i;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(property, "property");
        Object andSet = bVar.f15972b.getAndSet(recorderConfig);
        if (Intrinsics.areEqual(andSet, recorderConfig)) {
            return;
        }
        a aVar = new a(andSet, recorderConfig, bVar.f15974d, 2);
        c cVar = bVar.f15973c;
        b6 b6Var = cVar.f15975a;
        if (b6Var.getThreadChecker().c()) {
            ((ScheduledExecutorService) cVar.f15979e.getValue()).submit(new io.sentry.android.replay.util.g(new androidx.core.widget.b(13, aVar), "CaptureStrategy.runInBackground"));
            return;
        }
        try {
            aVar.invoke();
        } catch (Throwable th2) {
            b6Var.getLogger().e(b5.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th2);
        }
    }

    @Override // io.sentry.android.replay.capture.l
    public final void c() {
        n("pause", new n(this, 1));
    }

    @Override // io.sentry.android.replay.capture.c, io.sentry.android.replay.capture.l
    public final void e(int i5, io.sentry.protocol.v replayId, c6 c6Var) {
        Intrinsics.checkNotNullParameter(replayId, "replayId");
        super.e(i5, replayId, c6Var);
        b1 b1Var = this.f16017s;
        if (b1Var != null) {
            b1Var.y(new io.sentry.android.core.internal.gestures.c(3, this));
        }
    }

    @Override // io.sentry.android.replay.capture.l
    public final void f(boolean z5, r onSegmentSent) {
        Intrinsics.checkNotNullParameter(onSegmentSent, "onSegmentSent");
        b6 b6Var = this.f16016r;
        if (b6Var.getSessionReplay().f16410l) {
            b6Var.getLogger().h(b5.DEBUG, "Replay is already running in 'session' mode, not capturing for event", new Object[0]);
        }
        this.f15981g.set(z5);
    }

    @Override // io.sentry.android.replay.capture.l
    public final void g(final io.sentry.android.replay.m store) {
        Intrinsics.checkNotNullParameter(store, "store");
        final v k6 = k();
        final long d10 = this.f16018t.d();
        this.f15978d.submit(new io.sentry.android.replay.util.g(new Runnable() { // from class: io.sentry.android.replay.capture.m
            @Override // java.lang.Runnable
            public final void run() {
                o oVar = o.this;
                io.sentry.android.replay.j jVar = oVar.f15982h;
                b6 b6Var = oVar.f16016r;
                if (jVar != null) {
                    store.invoke(jVar, Long.valueOf(d10));
                }
                Date date = (Date) oVar.j.a(oVar, c.q[1]);
                if (date == null) {
                    b6Var.getLogger().h(b5.DEBUG, "Segment timestamp is not set, not recording frame", new Object[0]);
                    return;
                }
                if (oVar.f15981g.get()) {
                    b6Var.getLogger().h(b5.DEBUG, "Not capturing segment, because the app is terminating, will be captured on next launch", new Object[0]);
                    return;
                }
                v vVar = k6;
                if (vVar == null) {
                    b6Var.getLogger().h(b5.DEBUG, "Recorder config is not set, not capturing a segment", new Object[0]);
                    return;
                }
                long d11 = oVar.f16018t.d();
                if (d11 - date.getTime() >= b6Var.getSessionReplay().f16407h) {
                    k h10 = c.h(oVar, b6Var.getSessionReplay().f16407h, date, oVar.i(), oVar.j(), vVar.f16138b, vVar.f16137a, vVar.f16141e, vVar.f16142f);
                    if (h10 instanceof i) {
                        i iVar = (i) h10;
                        i.a(iVar, oVar.f16017s);
                        oVar.l(oVar.j() + 1);
                        oVar.m(iVar.f16007a.f16324u);
                    }
                }
                if (d11 - oVar.f15984k.get() >= b6Var.getSessionReplay().f16408i) {
                    b6Var.getReplayController().stop();
                    b6Var.getLogger().h(b5.INFO, "Session replay deadline exceeded (1h), stopping recording", new Object[0]);
                }
            }
        }, "SessionCaptureStrategy.add_frame"));
    }

    public final void n(String str, Function1 function1) {
        v k6 = k();
        if (k6 == null) {
            this.f16016r.getLogger().h(b5.DEBUG, "Recorder config is not set, not creating segment for task: ".concat(str), new Object[0]);
            return;
        }
        long d10 = this.f16018t.d();
        Date date = (Date) this.j.a(this, c.q[1]);
        if (date == null) {
            return;
        }
        long time = d10 - date.getTime();
        io.sentry.protocol.v i5 = i();
        this.f15978d.submit(new io.sentry.android.replay.util.g(new d(this, time, date, i5, k6, function1), "SessionCaptureStrategy.".concat(str)));
    }

    @Override // io.sentry.android.replay.capture.c, io.sentry.android.replay.capture.l
    public final void stop() {
        io.sentry.android.replay.j jVar = this.f15982h;
        n("stop", new f2.a(3, this, jVar != null ? jVar.n() : null));
        b1 b1Var = this.f16017s;
        if (b1Var != null) {
            b1Var.y(new ap(29));
        }
        super.stop();
    }

    @Override // io.sentry.android.replay.capture.l
    public final l d() {
        return this;
    }
}
