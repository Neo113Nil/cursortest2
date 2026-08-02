package io.sentry.android.replay.capture;

import ag.u;
import android.view.MotionEvent;
import androidx.appcompat.app.t;
import androidx.fragment.app.r;
import io.sentry.android.core.c0;
import io.sentry.android.replay.v;
import io.sentry.b1;
import io.sentry.b5;
import io.sentry.b6;
import io.sentry.c6;
import io.sentry.y3;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class g extends c {

    /* renamed from: r, reason: collision with root package name */
    public final b6 f16002r;

    /* renamed from: s, reason: collision with root package name */
    public final b1 f16003s;

    /* renamed from: t, reason: collision with root package name */
    public final io.sentry.transport.f f16004t;

    /* renamed from: u, reason: collision with root package name */
    public final io.sentry.util.i f16005u;

    /* renamed from: v, reason: collision with root package name */
    public final ArrayList f16006v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(b6 options, y3 y3Var, io.sentry.transport.d dateProvider, io.sentry.util.i random, io.sentry.android.replay.util.f executor) {
        super(options, y3Var, dateProvider, executor);
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(random, "random");
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.f16002r = options;
        this.f16003s = y3Var;
        this.f16004t = dateProvider;
        this.f16005u = random;
        this.f16006v = new ArrayList();
    }

    @Override // io.sentry.android.replay.capture.c, io.sentry.android.replay.capture.l
    public final void a(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        super.a(event);
        long d10 = this.f16004t.d() - this.f16002r.getSessionReplay().f16406g;
        ConcurrentLinkedDeque events = this.f15989p;
        Intrinsics.checkNotNullParameter(events, "events");
        Iterator it = events.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            if (((io.sentry.rrweb.b) it.next()).f17005b < d10) {
                it.remove();
            }
        }
    }

    @Override // io.sentry.android.replay.capture.l
    public final void b(v recorderConfig) {
        Intrinsics.checkNotNullParameter(recorderConfig, "recorderConfig");
        n("configuration_changed", new e(this, 0));
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
        n("pause", new e(this, 1));
    }

    @Override // io.sentry.android.replay.capture.l
    public final l d() {
        boolean z5 = this.f15981g.get();
        b6 b6Var = this.f16002r;
        if (z5) {
            b6Var.getLogger().h(b5.DEBUG, "Not converting to session mode, because the process is about to terminate", new Object[0]);
            return this;
        }
        o oVar = new o(b6Var, this.f16003s, this.f16004t, this.f15978d);
        v k6 = k();
        u property = c.q[0];
        b bVar = oVar.f15983i;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(property, "property");
        Object andSet = bVar.f15972b.getAndSet(k6);
        if (!Intrinsics.areEqual(andSet, k6)) {
            a aVar = new a(andSet, k6, bVar.f15974d, 2);
            c cVar = bVar.f15973c;
            b6 b6Var2 = cVar.f15975a;
            if (b6Var2.getThreadChecker().c()) {
                ((ScheduledExecutorService) cVar.f15979e.getValue()).submit(new io.sentry.android.replay.util.g(new androidx.core.widget.b(13, aVar), "CaptureStrategy.runInBackground"));
            } else {
                try {
                    aVar.invoke();
                } catch (Throwable th2) {
                    b6Var2.getLogger().e(b5.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th2);
                }
            }
        }
        oVar.e(j(), i(), c6.BUFFER);
        return oVar;
    }

    @Override // io.sentry.android.replay.capture.l
    public final void f(boolean z5, r onSegmentSent) {
        Intrinsics.checkNotNullParameter(onSegmentSent, "onSegmentSent");
        b6 b6Var = this.f16002r;
        Double d10 = b6Var.getSessionReplay().f16401b;
        io.sentry.util.i iVar = this.f16005u;
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        if (d10 == null || d10.doubleValue() < iVar.c()) {
            b6Var.getLogger().h(b5.INFO, "Replay wasn't sampled by onErrorSampleRate, not capturing for event", new Object[0]);
            return;
        }
        b1 b1Var = this.f16003s;
        if (b1Var != null) {
            b1Var.y(new io.sentry.android.core.internal.gestures.c(2, this));
        }
        if (!z5) {
            n("capture_replay", new f2.a(1, this, onSegmentSent));
        } else {
            this.f15981g.set(true);
            b6Var.getLogger().h(b5.DEBUG, "Not capturing replay for crashed event, will be captured on next launch", new Object[0]);
        }
    }

    @Override // io.sentry.android.replay.capture.l
    public final void g(io.sentry.android.replay.m store) {
        Intrinsics.checkNotNullParameter(store, "store");
        this.f15978d.submit(new io.sentry.android.replay.util.g(new c0(this, store, this.f16004t.d()), "BufferCaptureStrategy.add_frame"));
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0054, code lost:
    
        if (r4 != null) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n(String str, Function1 function1) {
        Date o3;
        v k6 = k();
        b6 b6Var = this.f16002r;
        if (k6 == null) {
            b6Var.getLogger().h(b5.DEBUG, "Recorder config is not set, not creating segment for task: ".concat(str), new Object[0]);
            return;
        }
        long j = b6Var.getSessionReplay().f16406g;
        long d10 = this.f16004t.d();
        io.sentry.android.replay.j jVar = this.f15982h;
        if (jVar != null) {
            io.sentry.r a7 = jVar.f16056f.a();
            try {
                io.sentry.android.replay.k kVar = (io.sentry.android.replay.k) CollectionsKt.firstOrNull(jVar.f16059i);
                Long valueOf = kVar != null ? Long.valueOf(kVar.f16062b) : null;
                u6.h.g(a7, null);
                if (valueOf != null) {
                    o3 = com.google.android.play.core.appupdate.b.o(valueOf.longValue());
                }
            } finally {
            }
        }
        o3 = com.google.android.play.core.appupdate.b.o(d10 - j);
        Intrinsics.checkNotNull(o3);
        this.f15978d.submit(new io.sentry.android.replay.util.g(new d(this, d10 - o3.getTime(), o3, i(), k6, function1), "BufferCaptureStrategy.".concat(str)));
    }

    @Override // io.sentry.android.replay.capture.c, io.sentry.android.replay.capture.l
    public final void stop() {
        io.sentry.android.replay.j jVar = this.f15982h;
        this.f15978d.submit(new io.sentry.android.replay.util.g(new t(28, jVar != null ? jVar.n() : null, this), "BufferCaptureStrategy.stop"));
        super.stop();
    }
}
