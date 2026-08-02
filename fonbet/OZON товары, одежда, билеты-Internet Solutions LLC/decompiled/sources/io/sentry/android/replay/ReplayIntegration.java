package io.sentry.android.replay;

import B90.O;
import E.V;
import Sc.InterfaceC4008j;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.MotionEvent;
import io.sentry.A1;
import io.sentry.EnumC7161k;
import io.sentry.G2;
import io.sentry.I2;
import io.sentry.InterfaceC7097a0;
import io.sentry.InterfaceC7166l0;
import io.sentry.InterfaceC7179o1;
import io.sentry.InterfaceC7183p1;
import io.sentry.J;
import io.sentry.L0;
import io.sentry.W2;
import io.sentry.Y2;
import io.sentry.Z;
import io.sentry.android.replay.capture.u;
import io.sentry.android.replay.j;
import io.sentry.android.replay.r;
import io.sentry.android.replay.t;
import io.sentry.transport.m;
import java.io.Closeable;
import java.io.File;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.M;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007:\u0002\b\t¨\u0006\n"}, d2 = {"Lio/sentry/android/replay/ReplayIntegration;", "Lio/sentry/l0;", "Ljava/io/Closeable;", "", "Lio/sentry/p1;", "Lio/sentry/J$b;", "Lio/sentry/transport/m$b;", "Lio/sentry/android/replay/v;", "a", "b", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ReplayIntegration implements InterfaceC7166l0, Closeable, InterfaceC7183p1, J.b, m.b, v {

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ int f67417r = 0;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f67418a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final io.sentry.transport.c f67419b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private volatile J.a f67420c;

    /* renamed from: d, reason: collision with root package name */
    private W2 f67421d;

    /* renamed from: e, reason: collision with root package name */
    private A1 f67422e;

    /* renamed from: f, reason: collision with root package name */
    private x f67423f;

    /* renamed from: g, reason: collision with root package name */
    private io.sentry.android.replay.gestures.a f67424g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f67425h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f67426i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f67427j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final AtomicBoolean f67428k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private final AtomicBoolean f67429l;

    /* renamed from: m, reason: collision with root package name */
    private io.sentry.android.replay.capture.u f67430m;

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    private InterfaceC7179o1 f67431n;

    /* renamed from: o, reason: collision with root package name */
    @NotNull
    private io.sentry.android.replay.util.f f67432o;

    /* renamed from: p, reason: collision with root package name */
    @NotNull
    private final io.sentry.util.a f67433p;

    /* renamed from: q, reason: collision with root package name */
    @NotNull
    private final o f67434q;

    /* loaded from: classes10.dex */
    private static final class a implements io.sentry.hints.c {
        @Override // io.sentry.hints.c
        public final boolean e() {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes10.dex */
    static final class b implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        private int f67435a;

        @Override // java.util.concurrent.ThreadFactory
        @NotNull
        public final Thread newThread(@NotNull Runnable r11) {
            Intrinsics.checkNotNullParameter(r11, "r");
            StringBuilder sb2 = new StringBuilder("SentryReplayIntegration-");
            int i11 = this.f67435a;
            this.f67435a = i11 + 1;
            sb2.append(i11);
            Thread thread = new Thread(r11, sb2.toString());
            thread.setDaemon(true);
            return thread;
        }
    }

    /* loaded from: classes10.dex */
    static final class c extends AbstractC7737t implements Function1<Date, Unit> {
        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Date date) {
            Date newTimestamp = date;
            Intrinsics.checkNotNullParameter(newTimestamp, "newTimestamp");
            ReplayIntegration replayIntegration = ReplayIntegration.this;
            io.sentry.android.replay.capture.u uVar = replayIntegration.f67430m;
            if (uVar != null) {
                io.sentry.android.replay.capture.u uVar2 = replayIntegration.f67430m;
                Integer valueOf = uVar2 != null ? Integer.valueOf(uVar2.d()) : null;
                Intrinsics.f(valueOf);
                uVar.b(valueOf.intValue() + 1);
            }
            io.sentry.android.replay.capture.u uVar3 = replayIntegration.f67430m;
            if (uVar3 != null) {
                uVar3.i(newTimestamp);
            }
            return Unit.f71690a;
        }
    }

    /* loaded from: classes10.dex */
    static final class d extends AbstractC7737t implements Function2<j, Long, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Bitmap f67437b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ M<String> f67438c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Bitmap bitmap, M<String> m11) {
            super(2);
            this.f67437b = bitmap;
            this.f67438c = m11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(j jVar, Long l11) {
            j onScreenshotRecorded = jVar;
            long longValue = l11.longValue();
            Intrinsics.checkNotNullParameter(onScreenshotRecorded, "$this$onScreenshotRecorded");
            onScreenshotRecorded.m(this.f67437b, longValue, this.f67438c.f71787a);
            return Unit.f71690a;
        }
    }

    static {
        G2.d().b("maven:io.sentry:sentry-android-replay", "8.34.1");
    }

    public ReplayIntegration(@NotNull Context context, @NotNull io.sentry.transport.c dateProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(context, "<this>");
        Context applicationContext = context.getApplicationContext();
        context = applicationContext != null ? applicationContext : context;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f67418a = context;
        this.f67419b = dateProvider;
        this.f67420c = J.a.UNKNOWN;
        this.f67425h = Sc.k.b(l.f67596b);
        this.f67426i = Sc.k.b(n.f67598b);
        this.f67427j = Sc.k.b(new m(this));
        this.f67428k = new AtomicBoolean(false);
        this.f67429l = new AtomicBoolean(false);
        L0 b11 = L0.b();
        Intrinsics.checkNotNullExpressionValue(b11, "getInstance(...)");
        this.f67431n = b11;
        this.f67432o = new io.sentry.android.replay.util.f();
        this.f67433p = new io.sentry.util.a();
        this.f67434q = new o();
    }

    public static void p(ReplayIntegration replayIntegration) {
        W2 w22 = replayIntegration.f67421d;
        if (w22 == null) {
            Intrinsics.n("options");
            throw null;
        }
        io.sentry.cache.l findPersistingScopeObserver = w22.findPersistingScopeObserver();
        if (findPersistingScopeObserver != null) {
            W2 w23 = replayIntegration.f67421d;
            if (w23 == null) {
                Intrinsics.n("options");
                throw null;
            }
            String str = (String) findPersistingScopeObserver.G(w23, "replay.json", String.class);
            if (str != null) {
                io.sentry.protocol.t tVar = new io.sentry.protocol.t(str);
                if (tVar.equals(io.sentry.protocol.t.f68325b)) {
                    replayIntegration.s("");
                    return;
                }
                W2 w24 = replayIntegration.f67421d;
                if (w24 == null) {
                    Intrinsics.n("options");
                    throw null;
                }
                e a11 = j.a.a(w24, tVar);
                if (a11 == null) {
                    replayIntegration.s("");
                    return;
                }
                W2 w25 = replayIntegration.f67421d;
                if (w25 == null) {
                    Intrinsics.n("options");
                    throw null;
                }
                Object G11 = findPersistingScopeObserver.G(w25, "breadcrumbs.json", List.class);
                List list = G11 instanceof List ? (List) G11 : null;
                A1 a12 = replayIntegration.f67422e;
                W2 w26 = replayIntegration.f67421d;
                if (w26 == null) {
                    Intrinsics.n("options");
                    throw null;
                }
                u.c a13 = u.a.a(a12, w26, a11.b(), a11.h(), tVar, a11.d(), a11.e().c(), a11.e().d(), a11.f(), a11.a(), a11.e().b(), a11.e().a(), a11.g(), list, new LinkedList(a11.c()));
                if (a13 instanceof u.c.a) {
                    ((u.c.a) a13).a(replayIntegration.f67422e, io.sentry.util.h.a(new a()));
                }
                replayIntegration.s(str);
                return;
            }
        }
        replayIntegration.s("");
    }

    private final void s(String str) {
        File[] listFiles;
        io.sentry.protocol.t EMPTY_ID;
        W2 w22 = this.f67421d;
        if (w22 == null) {
            Intrinsics.n("options");
            throw null;
        }
        String cacheDirPath = w22.getCacheDirPath();
        if (cacheDirPath == null || (listFiles = new File(cacheDirPath).listFiles()) == null) {
            return;
        }
        for (File file : listFiles) {
            String name = file.getName();
            Intrinsics.f(name);
            if (kotlin.text.h.e0(name, "replay_", false)) {
                io.sentry.android.replay.capture.u uVar = this.f67430m;
                if (uVar == null || (EMPTY_ID = uVar.g()) == null) {
                    EMPTY_ID = io.sentry.protocol.t.f68325b;
                    Intrinsics.checkNotNullExpressionValue(EMPTY_ID, "EMPTY_ID");
                }
                String tVar = EMPTY_ID.toString();
                Intrinsics.checkNotNullExpressionValue(tVar, "toString(...)");
                if (!kotlin.text.h.t(name, tVar, false) && (kotlin.text.h.K(str) || !kotlin.text.h.t(name, str, false))) {
                    io.sentry.util.g.a(file);
                }
            }
        }
    }

    private final void y() {
        o oVar = this.f67434q;
        InterfaceC7097a0 a11 = this.f67433p.a();
        try {
            if (this.f67428k.get()) {
                p pVar = p.PAUSED;
                if (oVar.b(pVar)) {
                    x xVar = this.f67423f;
                    if (xVar != null) {
                        xVar.s();
                    }
                    io.sentry.android.replay.capture.u uVar = this.f67430m;
                    if (uVar != null) {
                        uVar.pause();
                    }
                    oVar.d(pVar);
                    Unit unit = Unit.f71690a;
                    a11.close();
                    return;
                }
            }
            a11.close();
        } finally {
        }
    }

    private final void z() {
        A1 a12;
        A1 a13;
        io.sentry.transport.m h11;
        io.sentry.transport.m h12;
        InterfaceC7097a0 a11 = this.f67433p.a();
        try {
            if (this.f67428k.get()) {
                o oVar = this.f67434q;
                p pVar = p.RESUMED;
                if (oVar.b(pVar)) {
                    if (!this.f67429l.get() && this.f67420c != J.a.DISCONNECTED && (((a12 = this.f67422e) == null || (h12 = a12.h()) == null || !h12.m(EnumC7161k.All)) && ((a13 = this.f67422e) == null || (h11 = a13.h()) == null || !h11.m(EnumC7161k.Replay)))) {
                        this.f67434q.d(pVar);
                        io.sentry.android.replay.capture.u uVar = this.f67430m;
                        if (uVar != null) {
                            uVar.resume();
                        }
                        x xVar = this.f67423f;
                        if (xVar != null) {
                            xVar.v();
                            Unit unit = Unit.f71690a;
                        }
                        a11.close();
                        return;
                    }
                    a11.close();
                    return;
                }
            }
            a11.close();
        } finally {
        }
    }

    @Override // io.sentry.InterfaceC7183p1
    public final void c(@NotNull io.sentry.android.replay.a converter) {
        Intrinsics.checkNotNullParameter(converter, "converter");
        this.f67431n = converter;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        io.sentry.transport.m h11;
        o oVar = this.f67434q;
        InterfaceC7097a0 a11 = this.f67433p.a();
        try {
            if (this.f67428k.get()) {
                p pVar = p.CLOSED;
                if (oVar.b(pVar)) {
                    W2 w22 = this.f67421d;
                    if (w22 == null) {
                        Intrinsics.n("options");
                        throw null;
                    }
                    w22.getConnectionStatusProvider().I0(this);
                    A1 a12 = this.f67422e;
                    if (a12 != null && (h11 = a12.h()) != null) {
                        h11.p(this);
                    }
                    stop();
                    x xVar = this.f67423f;
                    if (xVar != null) {
                        xVar.close();
                    }
                    this.f67423f = null;
                    ((r) this.f67426i.getValue()).close();
                    ((io.sentry.android.replay.util.h) this.f67427j.getValue()).shutdown();
                    oVar.d(pVar);
                    Unit unit = Unit.f71690a;
                    a11.close();
                    return;
                }
            }
            a11.close();
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                Jb.j.e(a11, th2);
                throw th3;
            }
        }
    }

    @Override // io.sentry.InterfaceC7166l0
    public final void d(@NotNull A1 scopes, @NotNull W2 options) {
        Intrinsics.checkNotNullParameter(scopes, "scopes");
        Intrinsics.checkNotNullParameter(options, "options");
        this.f67421d = options;
        if (!options.getSessionReplay().w() && !options.getSessionReplay().x()) {
            options.getLogger().c(I2.INFO, "Session replay is disabled, no sample rate specified", new Object[0]);
            return;
        }
        this.f67422e = scopes;
        this.f67423f = new x(options, this, this, this.f67432o, (io.sentry.android.replay.util.h) this.f67427j.getValue());
        this.f67424g = new io.sentry.android.replay.gestures.a(options, this);
        this.f67428k.set(true);
        options.getConnectionStatusProvider().O1(this);
        io.sentry.transport.m h11 = scopes.h();
        if (h11 != null) {
            h11.d(this);
        }
        io.sentry.util.j.a("Replay");
        W2 w22 = this.f67421d;
        if (w22 == null) {
            Intrinsics.n("options");
            throw null;
        }
        Z executorService = w22.getExecutorService();
        Intrinsics.checkNotNullExpressionValue(executorService, "getExecutorService(...)");
        W2 w23 = this.f67421d;
        if (w23 != null) {
            io.sentry.android.replay.util.d.a(executorService, w23, new V(this, 2));
        } else {
            Intrinsics.n("options");
            throw null;
        }
    }

    @Override // io.sentry.J.b
    public final void j(@NotNull J.a status) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.f67420c = status;
        if (this.f67430m instanceof io.sentry.android.replay.capture.y) {
            if (status == J.a.DISCONNECTED) {
                y();
            } else {
                z();
            }
        }
    }

    @Override // io.sentry.InterfaceC7183p1
    public final void k(Boolean bool) {
        if (this.f67428k.get() && t()) {
            io.sentry.protocol.t tVar = io.sentry.protocol.t.f68325b;
            io.sentry.android.replay.capture.u uVar = this.f67430m;
            if (tVar.equals(uVar != null ? uVar.g() : null)) {
                W2 w22 = this.f67421d;
                if (w22 != null) {
                    w22.getLogger().c(I2.DEBUG, "Replay id is not set, not capturing for event", new Object[0]);
                    return;
                } else {
                    Intrinsics.n("options");
                    throw null;
                }
            }
            io.sentry.android.replay.capture.u uVar2 = this.f67430m;
            if (uVar2 != null) {
                uVar2.c(new c(), bool.equals(Boolean.TRUE));
            }
            io.sentry.android.replay.capture.u uVar3 = this.f67430m;
            this.f67430m = uVar3 != null ? uVar3.e() : null;
        }
    }

    @Override // io.sentry.transport.m.b
    public final void m(@NotNull io.sentry.transport.m rateLimiter) {
        Intrinsics.checkNotNullParameter(rateLimiter, "rateLimiter");
        if (this.f67430m instanceof io.sentry.android.replay.capture.y) {
            if (rateLimiter.m(EnumC7161k.All) || rateLimiter.m(EnumC7161k.Replay)) {
                y();
            } else {
                z();
            }
        }
    }

    @Override // io.sentry.InterfaceC7183p1
    @NotNull
    /* renamed from: o, reason: from getter */
    public final InterfaceC7179o1 getF67431n() {
        return this.f67431n;
    }

    @Override // io.sentry.InterfaceC7183p1
    public final void pause() {
        this.f67429l.set(true);
        y();
    }

    @Override // io.sentry.InterfaceC7183p1
    public final void resume() {
        this.f67429l.set(false);
        z();
    }

    @Override // io.sentry.InterfaceC7183p1
    public final void start() {
        io.sentry.android.replay.capture.u qVar;
        o oVar = this.f67434q;
        InterfaceC7097a0 a11 = this.f67433p.a();
        try {
            if (!this.f67428k.get()) {
                a11.close();
                return;
            }
            p pVar = p.STARTED;
            if (!oVar.b(pVar)) {
                W2 w22 = this.f67421d;
                if (w22 == null) {
                    Intrinsics.n("options");
                    throw null;
                }
                w22.getLogger().c(I2.DEBUG, "Session replay is already being recorded, not starting a new one", new Object[0]);
                a11.close();
                return;
            }
            InterfaceC4008j interfaceC4008j = this.f67425h;
            io.sentry.util.s sVar = (io.sentry.util.s) interfaceC4008j.getValue();
            W2 w23 = this.f67421d;
            if (w23 == null) {
                Intrinsics.n("options");
                throw null;
            }
            boolean a12 = io.sentry.android.replay.util.j.a(sVar, w23.getSessionReplay().s());
            if (!a12) {
                W2 w24 = this.f67421d;
                if (w24 == null) {
                    Intrinsics.n("options");
                    throw null;
                }
                if (!w24.getSessionReplay().x()) {
                    W2 w25 = this.f67421d;
                    if (w25 == null) {
                        Intrinsics.n("options");
                        throw null;
                    }
                    w25.getLogger().c(I2.INFO, "Session replay is not started, full session was not sampled and onErrorSampleRate is not specified", new Object[0]);
                    a11.close();
                    return;
                }
            }
            oVar.d(pVar);
            InterfaceC4008j interfaceC4008j2 = this.f67427j;
            if (a12) {
                W2 w26 = this.f67421d;
                if (w26 == null) {
                    Intrinsics.n("options");
                    throw null;
                }
                qVar = new io.sentry.android.replay.capture.y(w26, this.f67422e, this.f67419b, (io.sentry.android.replay.util.h) interfaceC4008j2.getValue());
            } else {
                W2 w27 = this.f67421d;
                if (w27 == null) {
                    Intrinsics.n("options");
                    throw null;
                }
                qVar = new io.sentry.android.replay.capture.q(w27, this.f67422e, this.f67419b, (io.sentry.util.s) interfaceC4008j.getValue(), (io.sentry.android.replay.util.h) interfaceC4008j2.getValue());
            }
            this.f67430m = qVar;
            x xVar = this.f67423f;
            if (xVar != null) {
                xVar.w();
            }
            io.sentry.android.replay.capture.u uVar = this.f67430m;
            if (uVar != null) {
                uVar.f(0, new io.sentry.protocol.t(), null);
            }
            x xVar2 = this.f67423f;
            InterfaceC4008j interfaceC4008j3 = this.f67426i;
            if (xVar2 != null) {
                r.c k11 = ((r) interfaceC4008j3.getValue()).k();
                x xVar3 = this.f67423f;
                Intrinsics.g(xVar3, "null cannot be cast to non-null type io.sentry.android.replay.OnRootViewsChangedListener");
                k11.add(xVar3);
            }
            ((r) interfaceC4008j3.getValue()).k().add(this.f67424g);
            Unit unit = Unit.f71690a;
            a11.close();
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                Jb.j.e(a11, th2);
                throw th3;
            }
        }
    }

    @Override // io.sentry.InterfaceC7183p1
    public final void stop() {
        o oVar = this.f67434q;
        InterfaceC7097a0 a11 = this.f67433p.a();
        try {
            if (this.f67428k.get()) {
                p pVar = p.STOPPED;
                if (oVar.b(pVar)) {
                    x xVar = this.f67423f;
                    InterfaceC4008j interfaceC4008j = this.f67426i;
                    if (xVar != null) {
                        r.c k11 = ((r) interfaceC4008j.getValue()).k();
                        x xVar2 = this.f67423f;
                        Intrinsics.g(xVar2, "null cannot be cast to non-null type io.sentry.android.replay.OnRootViewsChangedListener");
                        k11.remove(xVar2);
                    }
                    ((r) interfaceC4008j.getValue()).k().remove(this.f67424g);
                    x xVar3 = this.f67423f;
                    if (xVar3 != null) {
                        xVar3.t();
                    }
                    x xVar4 = this.f67423f;
                    if (xVar4 != null) {
                        xVar4.x();
                    }
                    io.sentry.android.replay.gestures.a aVar = this.f67424g;
                    if (aVar != null) {
                        aVar.a();
                    }
                    io.sentry.android.replay.capture.u uVar = this.f67430m;
                    if (uVar != null) {
                        uVar.stop();
                    }
                    this.f67430m = null;
                    oVar.d(pVar);
                    Unit unit = Unit.f71690a;
                    a11.close();
                    return;
                }
            }
            a11.close();
        } finally {
        }
    }

    public final boolean t() {
        o oVar = this.f67434q;
        return oVar.a().compareTo(p.STARTED) >= 0 && oVar.a().compareTo(p.STOPPED) < 0;
    }

    public final void v(@NotNull Bitmap bitmap) {
        A1 a12;
        A1 a13;
        io.sentry.transport.m h11;
        io.sentry.transport.m h12;
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        M m11 = new M();
        A1 a14 = this.f67422e;
        if (a14 != null) {
            a14.m(new O(m11));
        }
        io.sentry.android.replay.capture.u uVar = this.f67430m;
        if (uVar != null) {
            uVar.j(new d(bitmap, m11));
        }
        if (this.f67430m instanceof io.sentry.android.replay.capture.y) {
            if (this.f67420c == J.a.DISCONNECTED || !(((a12 = this.f67422e) == null || (h12 = a12.h()) == null || !h12.m(EnumC7161k.All)) && ((a13 = this.f67422e) == null || (h11 = a13.h()) == null || !h11.m(EnumC7161k.Replay)))) {
                y();
            }
        }
    }

    public final void w(@NotNull MotionEvent event) {
        io.sentry.android.replay.capture.u uVar;
        Intrinsics.checkNotNullParameter(event, "event");
        if (this.f67428k.get() && this.f67434q.c() && (uVar = this.f67430m) != null) {
            uVar.h(event);
        }
    }

    public final void x(int i11, int i12) {
        x xVar;
        AtomicBoolean atomicBoolean = this.f67428k;
        if (atomicBoolean.get() && t()) {
            W2 w22 = this.f67421d;
            if (w22 == null) {
                Intrinsics.n("options");
                throw null;
            }
            if (w22.getSessionReplay().y()) {
                W2 w23 = this.f67421d;
                if (w23 == null) {
                    Intrinsics.n("options");
                    throw null;
                }
                Y2 sessionReplay = w23.getSessionReplay();
                Intrinsics.checkNotNullExpressionValue(sessionReplay, "getSessionReplay(...)");
                t config = t.a.a(this.f67418a, sessionReplay, i11, i12);
                Intrinsics.checkNotNullParameter(config, "config");
                if (atomicBoolean.get() && t()) {
                    io.sentry.android.replay.capture.u uVar = this.f67430m;
                    if (uVar != null) {
                        uVar.a(config);
                    }
                    x xVar2 = this.f67423f;
                    if (xVar2 != null) {
                        xVar2.r(config);
                    }
                    if (this.f67434q.a() != p.PAUSED || (xVar = this.f67423f) == null) {
                        return;
                    }
                    xVar.s();
                }
            }
        }
    }
}
