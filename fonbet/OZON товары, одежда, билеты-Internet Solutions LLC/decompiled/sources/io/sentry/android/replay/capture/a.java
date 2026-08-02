package io.sentry.android.replay.capture;

import Sc.InterfaceC4008j;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.view.MotionEvent;
import io.sentry.A1;
import io.sentry.C7165l;
import io.sentry.W2;
import io.sentry.X2;
import io.sentry.android.core.internal.tombstone.TombstoneProtos$Tombstone;
import io.sentry.android.replay.capture.u;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@SuppressLint({"UseRequiresApi"})
@TargetApi(TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER)
/* loaded from: classes10.dex */
public abstract class a implements u {

    /* renamed from: q, reason: collision with root package name */
    static final /* synthetic */ kotlin.reflect.m<Object>[] f67447q = {I1.w.c(a.class, "recorderConfig", "getRecorderConfig$sentry_android_replay_release()Lio/sentry/android/replay/ScreenshotRecorderConfig;", 0), I1.w.c(a.class, "segmentTimestamp", "getSegmentTimestamp()Ljava/util/Date;", 0), I1.w.c(a.class, "screenAtStart", "getScreenAtStart()Ljava/lang/String;", 0), I1.w.c(a.class, "currentReplayId", "getCurrentReplayId()Lio/sentry/protocol/SentryId;", 0), I1.w.c(a.class, "currentSegment", "getCurrentSegment()I", 0), I1.w.c(a.class, "replayType", "getReplayType()Lio/sentry/SentryReplayEvent$ReplayType;", 0)};

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final W2 f67448a;

    /* renamed from: b, reason: collision with root package name */
    private final A1 f67449b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final io.sentry.transport.c f67450c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final ScheduledExecutorService f67451d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f67452e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final io.sentry.android.replay.gestures.b f67453f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final AtomicBoolean f67454g;

    /* renamed from: h, reason: collision with root package name */
    private io.sentry.android.replay.j f67455h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final j f67456i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final l f67457j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final AtomicLong f67458k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private final n f67459l;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private final d f67460m;

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    private final f f67461n;

    /* renamed from: o, reason: collision with root package name */
    @NotNull
    private final h f67462o;

    /* renamed from: p, reason: collision with root package name */
    @NotNull
    private final ConcurrentLinkedDeque f67463p;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: io.sentry.android.replay.capture.a$a, reason: collision with other inner class name */
    static final class ThreadFactoryC1106a implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        private int f67464a;

        @Override // java.util.concurrent.ThreadFactory
        @NotNull
        public final Thread newThread(@NotNull Runnable r11) {
            Intrinsics.checkNotNullParameter(r11, "r");
            StringBuilder sb2 = new StringBuilder("SentryReplayPersister-");
            int i11 = this.f67464a;
            this.f67464a = i11 + 1;
            sb2.append(i11);
            Thread thread = new Thread(r11, sb2.toString());
            thread.setDaemon(true);
            return thread;
        }
    }

    public a(@NotNull W2 options, A1 a12, @NotNull io.sentry.transport.c dateProvider, @NotNull ScheduledExecutorService replayExecutor) {
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(replayExecutor, "replayExecutor");
        this.f67448a = options;
        this.f67449b = a12;
        this.f67450c = dateProvider;
        this.f67451d = replayExecutor;
        this.f67452e = Sc.k.b(new b(this));
        this.f67453f = new io.sentry.android.replay.gestures.b(dateProvider);
        this.f67454g = new AtomicBoolean(false);
        this.f67456i = new j(this, this);
        this.f67457j = new l(this, this);
        this.f67458k = new AtomicLong();
        this.f67459l = new n(this, this);
        this.f67460m = new d(io.sentry.protocol.t.f68325b, this, this);
        this.f67461n = new f(this, this);
        this.f67462o = new h(this, this);
        this.f67463p = new ConcurrentLinkedDeque();
    }

    public static final ScheduledExecutorService l(a aVar) {
        return (ScheduledExecutorService) aVar.f67452e.getValue();
    }

    public static u.c m(a aVar, long j11, Date currentSegmentTimestamp, io.sentry.protocol.t replayId, int i11, int i12, int i13, int i14, int i15) {
        h hVar = aVar.f67462o;
        kotlin.reflect.m<?>[] mVarArr = f67447q;
        X2.b replayType = (X2.b) hVar.getValue(aVar, mVarArr[5]);
        io.sentry.android.replay.j jVar = aVar.f67455h;
        String str = (String) aVar.f67459l.getValue(aVar, mVarArr[2]);
        ConcurrentLinkedDeque events = aVar.f67463p;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(currentSegmentTimestamp, "currentSegmentTimestamp");
        Intrinsics.checkNotNullParameter(replayId, "replayId");
        Intrinsics.checkNotNullParameter(replayType, "replayType");
        Intrinsics.checkNotNullParameter(events, "events");
        return u.a.a(aVar.f67449b, aVar.f67448a, j11, currentSegmentTimestamp, replayId, i11, i12, i13, replayType, jVar, i14, i15, str, null, events);
    }

    @Override // io.sentry.android.replay.capture.u
    public void a(@NotNull io.sentry.android.replay.t recorderConfig) {
        Intrinsics.checkNotNullParameter(recorderConfig, "recorderConfig");
        u(recorderConfig);
    }

    @Override // io.sentry.android.replay.capture.u
    public final void b(int i11) {
        this.f67461n.setValue(this, f67447q[4], Integer.valueOf(i11));
    }

    @Override // io.sentry.android.replay.capture.u
    public final int d() {
        return ((Number) this.f67461n.getValue(this, f67447q[4])).intValue();
    }

    @Override // io.sentry.android.replay.capture.u
    public void f(int i11, @NotNull io.sentry.protocol.t replayId, X2.b bVar) {
        Intrinsics.checkNotNullParameter(replayId, "replayId");
        this.f67455h = new io.sentry.android.replay.j(this.f67448a, replayId);
        Intrinsics.checkNotNullParameter(replayId, "<set-?>");
        kotlin.reflect.m<?>[] mVarArr = f67447q;
        this.f67460m.setValue(this, mVarArr[3], replayId);
        b(i11);
        if (bVar == null) {
            bVar = this instanceof y ? X2.b.SESSION : X2.b.BUFFER;
        }
        Intrinsics.checkNotNullParameter(bVar, "<set-?>");
        this.f67462o.setValue(this, mVarArr[5], bVar);
        i(C7165l.b());
        AtomicLong atomicLong = this.f67458k;
        this.f67450c.getClass();
        atomicLong.set(System.currentTimeMillis());
    }

    @Override // io.sentry.android.replay.capture.u
    @NotNull
    public final io.sentry.protocol.t g() {
        return (io.sentry.protocol.t) this.f67460m.getValue(this, f67447q[3]);
    }

    @Override // io.sentry.android.replay.capture.u
    public void h(@NotNull MotionEvent event) {
        List<io.sentry.rrweb.d> a11;
        Intrinsics.checkNotNullParameter(event, "event");
        io.sentry.android.replay.t p11 = p();
        if (p11 == null || (a11 = this.f67453f.a(event, p11)) == null) {
            return;
        }
        C7714v.p(a11, this.f67463p);
    }

    @Override // io.sentry.android.replay.capture.u
    public final void i(Date date) {
        this.f67457j.setValue(this, f67447q[1], date);
    }

    protected final io.sentry.android.replay.j n() {
        return this.f67455h;
    }

    @NotNull
    protected final ConcurrentLinkedDeque o() {
        return this.f67463p;
    }

    public final io.sentry.android.replay.t p() {
        return (io.sentry.android.replay.t) this.f67456i.getValue(this, f67447q[0]);
    }

    @Override // io.sentry.android.replay.capture.u
    public void pause() {
    }

    @NotNull
    protected final ScheduledExecutorService q() {
        return this.f67451d;
    }

    @NotNull
    protected final AtomicLong r() {
        return this.f67458k;
    }

    @Override // io.sentry.android.replay.capture.u
    public final void resume() {
        i(C7165l.b());
    }

    public final Date s() {
        return (Date) this.f67457j.getValue(this, f67447q[1]);
    }

    @Override // io.sentry.android.replay.capture.u
    public void stop() {
        io.sentry.android.replay.j jVar = this.f67455h;
        if (jVar != null) {
            jVar.close();
        }
        this.f67458k.set(0L);
        i(null);
        io.sentry.protocol.t EMPTY_ID = io.sentry.protocol.t.f68325b;
        Intrinsics.checkNotNullExpressionValue(EMPTY_ID, "EMPTY_ID");
        Intrinsics.checkNotNullParameter(EMPTY_ID, "<set-?>");
        this.f67460m.setValue(this, f67447q[3], EMPTY_ID);
    }

    @NotNull
    protected final AtomicBoolean t() {
        return this.f67454g;
    }

    public final void u(io.sentry.android.replay.t tVar) {
        this.f67456i.setValue(this, f67447q[0], tVar);
    }

    protected final void v(String str) {
        this.f67459l.setValue(this, f67447q[2], str);
    }
}
