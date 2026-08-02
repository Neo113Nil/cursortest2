package io.sentry.android.replay;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Handler;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import com.sports.insider.MyApp;
import io.sentry.android.core.f0;
import io.sentry.b5;
import io.sentry.b6;
import io.sentry.d4;
import io.sentry.e1;
import io.sentry.e6;
import io.sentry.f6;
import io.sentry.l3;
import io.sentry.m3;
import io.sentry.n0;
import io.sentry.o0;
import io.sentry.p2;
import io.sentry.q1;
import io.sentry.y3;
import io.sentry.z4;
import java.io.Closeable;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0003:\u0002\u0007\b¨\u0006\t"}, d2 = {"Lio/sentry/android/replay/ReplayIntegration;", "Lio/sentry/q1;", "Ljava/io/Closeable;", "", "Lio/sentry/m3;", "Lio/sentry/o0;", "Lio/sentry/transport/o;", "io/sentry/android/replay/l", "io/sentry/j0", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nReplayIntegration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReplayIntegration.kt\nio/sentry/android/replay/ReplayIntegration\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,515:1\n13309#2,2:516\n*S KotlinDebug\n*F\n+ 1 ReplayIntegration.kt\nio/sentry/android/replay/ReplayIntegration\n*L\n406#1:516,2\n*E\n"})
/* loaded from: classes.dex */
public final class ReplayIntegration implements q1, Closeable, m3, o0, io.sentry.transport.o {

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ int f15922r = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Context f15923a;

    /* renamed from: b, reason: collision with root package name */
    public final io.sentry.transport.d f15924b;

    /* renamed from: c, reason: collision with root package name */
    public volatile n0 f15925c;

    /* renamed from: d, reason: collision with root package name */
    public b6 f15926d;

    /* renamed from: e, reason: collision with root package name */
    public y3 f15927e;

    /* renamed from: f, reason: collision with root package name */
    public c0 f15928f;

    /* renamed from: g, reason: collision with root package name */
    public io.sentry.android.replay.gestures.b f15929g;

    /* renamed from: h, reason: collision with root package name */
    public final gf.t f15930h;

    /* renamed from: i, reason: collision with root package name */
    public final gf.t f15931i;
    public final gf.t j;

    /* renamed from: k, reason: collision with root package name */
    public final AtomicBoolean f15932k;

    /* renamed from: l, reason: collision with root package name */
    public final AtomicBoolean f15933l;

    /* renamed from: m, reason: collision with root package name */
    public io.sentry.android.replay.capture.l f15934m;

    /* renamed from: n, reason: collision with root package name */
    public l3 f15935n;

    /* renamed from: o, reason: collision with root package name */
    public final f3.b f15936o;

    /* renamed from: p, reason: collision with root package name */
    public final io.sentry.util.a f15937p;
    public final p q;

    static {
        z4.d().b("maven:io.sentry:sentry-android-replay", "8.30.0");
    }

    public ReplayIntegration(MyApp context) {
        io.sentry.transport.d dateProvider = io.sentry.transport.d.f17127a;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(context, "<this>");
        Context applicationContext = context.getApplicationContext();
        context = applicationContext != null ? applicationContext : context;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f15923a = context;
        this.f15924b = dateProvider;
        this.f15925c = n0.UNKNOWN;
        this.f15930h = gf.k.b(a.f15939g);
        this.f15931i = gf.k.b(a.f15940h);
        this.j = gf.k.b(new n(0, this));
        this.f15932k = new AtomicBoolean(false);
        this.f15933l = new AtomicBoolean(false);
        p2 p2Var = p2.f16718a;
        Intrinsics.checkNotNullExpressionValue(p2Var, "getInstance(...)");
        this.f15935n = p2Var;
        this.f15936o = new f3.b(1);
        this.f15937p = new io.sentry.util.a();
        p pVar = new p();
        pVar.f16068a = q.INITIAL;
        this.q = pVar;
    }

    @Override // io.sentry.transport.o
    public final void C(e5.j rateLimiter) {
        Intrinsics.checkNotNullParameter(rateLimiter, "rateLimiter");
        if (this.f15934m instanceof io.sentry.android.replay.capture.o) {
            if (rateLimiter.k(io.sentry.l.All) || rateLimiter.k(io.sentry.l.Replay)) {
                U();
            } else {
                W();
            }
        }
    }

    @Override // io.sentry.m3
    /* renamed from: J, reason: from getter */
    public final l3 getF15935n() {
        return this.f15935n;
    }

    public final void K(String str) {
        File[] listFiles;
        b6 b6Var = this.f15926d;
        if (b6Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("options");
            b6Var = null;
        }
        String cacheDirPath = b6Var.getCacheDirPath();
        if (cacheDirPath == null || (listFiles = new File(cacheDirPath).listFiles()) == null) {
            return;
        }
        Intrinsics.checkNotNull(listFiles);
        for (File file : listFiles) {
            String name = file.getName();
            Intrinsics.checkNotNull(name);
            if (kotlin.text.z.o(name, "replay_", false)) {
                String vVar = k().toString();
                Intrinsics.checkNotNullExpressionValue(vVar, "toString(...)");
                if (!StringsKt.A(name, vVar, false) && (StringsKt.H(str) || !StringsKt.A(name, str, false))) {
                    io.sentry.config.a.g(file);
                }
            }
        }
    }

    public final boolean N() {
        return ((q) this.q.f16068a).compareTo(q.STARTED) >= 0 && ((q) this.q.f16068a).compareTo(q.STOPPED) < 0;
    }

    public final void O(Bitmap bitmap) {
        y3 y3Var;
        y3 y3Var2;
        e5.j d10;
        e5.j d11;
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        if (this.f15927e != null) {
            d4.c(new io.sentry.android.fragment.c(objectRef, 1));
        }
        io.sentry.android.replay.capture.l lVar = this.f15934m;
        if (lVar != null) {
            lVar.g(new m(bitmap, objectRef));
        }
        if (this.f15934m instanceof io.sentry.android.replay.capture.o) {
            if (this.f15925c == n0.DISCONNECTED || !(((y3Var = this.f15927e) == null || (d11 = y3Var.d()) == null || !d11.k(io.sentry.l.All)) && ((y3Var2 = this.f15927e) == null || (d10 = y3Var2.d()) == null || !d10.k(io.sentry.l.Replay)))) {
                U();
            }
        }
    }

    public final void R(int i5, int i10) {
        c0 c0Var;
        z zVar;
        u uVar;
        if (this.f15932k.get() && N()) {
            b6 b6Var = this.f15926d;
            if (b6Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("options");
                b6Var = null;
            }
            if (b6Var.getSessionReplay().j) {
                Context context = this.f15923a;
                b6 b6Var2 = this.f15926d;
                if (b6Var2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("options");
                    b6Var2 = null;
                }
                f6 sessionReplay = b6Var2.getSessionReplay();
                Intrinsics.checkNotNullExpressionValue(sessionReplay, "getSessionReplay(...)");
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(sessionReplay, "sessionReplay");
                float f6 = i10;
                int b10 = wf.b.b((f6 / context.getResources().getDisplayMetrics().density) * sessionReplay.f16404e.sizeScale);
                int i11 = b10 % 16;
                int max = i11 <= 8 ? Math.max(16, b10 - i11) : b10 + (16 - i11);
                float f10 = i5;
                float f11 = f10 / context.getResources().getDisplayMetrics().density;
                e6 e6Var = sessionReplay.f16404e;
                int b11 = wf.b.b(f11 * e6Var.sizeScale);
                int i12 = b11 % 16;
                int max2 = i12 <= 8 ? Math.max(16, b11 - i12) : b11 + (16 - i12);
                v config = new v(max2, max, max2 / f10, max / f6, sessionReplay.f16405f, e6Var.bitRate);
                Intrinsics.checkNotNullParameter(config, "config");
                if (this.f15932k.get() && N()) {
                    io.sentry.android.replay.capture.l lVar = this.f15934m;
                    if (lVar != null) {
                        lVar.b(config);
                    }
                    c0 c0Var2 = this.f15928f;
                    if (c0Var2 != null) {
                        Intrinsics.checkNotNullParameter(config, "config");
                        if (c0Var2.f15959f.get()) {
                            if (c0Var2.f15964l == null) {
                                io.sentry.r a7 = c0Var2.j.a();
                                try {
                                    if (c0Var2.f15964l == null) {
                                        c0Var2.f15964l = new z(c0Var2.f15954a, c0Var2.f15957d);
                                    }
                                    Unit unit = Unit.f19194a;
                                    u6.h.g(a7, null);
                                } catch (Throwable th2) {
                                    try {
                                        throw th2;
                                    } catch (Throwable th3) {
                                        u6.h.g(a7, th2);
                                        throw th3;
                                    }
                                }
                            }
                            z zVar2 = c0Var2.f15964l;
                            if (zVar2 != null) {
                                zVar2.f16177e = config;
                            }
                            z zVar3 = c0Var2.f15964l;
                            if (zVar3 != null) {
                                zVar3.f16176d = new u(c0Var2.f15954a, c0Var2.f15955b, config, c0Var2);
                            }
                            WeakReference weakReference = (WeakReference) CollectionsKt.L(c0Var2.f15960g);
                            View view = weakReference != null ? (View) weakReference.get() : null;
                            if (view != null && (zVar = c0Var2.f15964l) != null && (uVar = (u) zVar.f16176d) != null) {
                                uVar.a(view);
                            }
                            f3.b bVar = c0Var2.f15957d;
                            z zVar4 = c0Var2.f15964l;
                            Handler handler = bVar.f9329a;
                            if (zVar4 != null) {
                                handler.removeCallbacks(zVar4);
                            }
                            f3.b bVar2 = c0Var2.f15957d;
                            z zVar5 = c0Var2.f15964l;
                            if (!(zVar5 == null ? false : bVar2.f9329a.postDelayed(zVar5, 100L))) {
                                c0Var2.f15954a.getLogger().h(b5.WARNING, "Failed to post the capture runnable, main looper is shutting down.", new Object[0]);
                            }
                        }
                    }
                    if (((q) this.q.f16068a) != q.PAUSED || (c0Var = this.f15928f) == null) {
                        return;
                    }
                    c0Var.r();
                }
            }
        }
    }

    public final void U() {
        p pVar = this.q;
        io.sentry.r a7 = this.f15937p.a();
        try {
            if (this.f15932k.get()) {
                q qVar = q.PAUSED;
                if (pVar.a(qVar)) {
                    c0 c0Var = this.f15928f;
                    if (c0Var != null) {
                        c0Var.r();
                    }
                    io.sentry.android.replay.capture.l lVar = this.f15934m;
                    if (lVar != null) {
                        lVar.c();
                    }
                    Intrinsics.checkNotNullParameter(qVar, "<set-?>");
                    pVar.f16068a = qVar;
                    Unit unit = Unit.f19194a;
                    u6.h.g(a7, null);
                    return;
                }
            }
            u6.h.g(a7, null);
        } finally {
        }
    }

    public final void W() {
        y3 y3Var;
        y3 y3Var2;
        e5.j d10;
        e5.j d11;
        io.sentry.r a7 = this.f15937p.a();
        try {
            if (this.f15932k.get()) {
                p pVar = this.q;
                q qVar = q.RESUMED;
                if (pVar.a(qVar)) {
                    if (!this.f15933l.get() && this.f15925c != n0.DISCONNECTED && (((y3Var = this.f15927e) == null || (d11 = y3Var.d()) == null || !d11.k(io.sentry.l.All)) && ((y3Var2 = this.f15927e) == null || (d10 = y3Var2.d()) == null || !d10.k(io.sentry.l.Replay)))) {
                        p pVar2 = this.q;
                        pVar2.getClass();
                        Intrinsics.checkNotNullParameter(qVar, "<set-?>");
                        pVar2.f16068a = qVar;
                        io.sentry.android.replay.capture.l lVar = this.f15934m;
                        if (lVar != null) {
                            ((io.sentry.android.replay.capture.c) lVar).m(com.google.android.play.core.appupdate.b.n());
                        }
                        c0 c0Var = this.f15928f;
                        if (c0Var != null) {
                            c0Var.t();
                            Unit unit = Unit.f19194a;
                        }
                        u6.h.g(a7, null);
                        return;
                    }
                    u6.h.g(a7, null);
                    return;
                }
            }
            u6.h.g(a7, null);
        } finally {
        }
    }

    @Override // io.sentry.m3
    public final void c() {
        this.f15933l.set(true);
        U();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        e5.j d10;
        p pVar = this.q;
        io.sentry.r a7 = this.f15937p.a();
        try {
            if (this.f15932k.get()) {
                q qVar = q.CLOSED;
                if (pVar.a(qVar)) {
                    b6 b6Var = this.f15926d;
                    if (b6Var == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("options");
                        b6Var = null;
                    }
                    b6Var.getConnectionStatusProvider().e0(this);
                    y3 y3Var = this.f15927e;
                    if (y3Var != null && (d10 = y3Var.d()) != null) {
                        ((CopyOnWriteArrayList) d10.f8648e).remove(this);
                    }
                    stop();
                    c0 c0Var = this.f15928f;
                    if (c0Var != null) {
                        c0Var.close();
                    }
                    this.f15928f = null;
                    ((s) this.f15931i.getValue()).close();
                    ((io.sentry.android.replay.util.f) this.j.getValue()).shutdown();
                    Intrinsics.checkNotNullParameter(qVar, "<set-?>");
                    pVar.f16068a = qVar;
                    Unit unit = Unit.f19194a;
                    u6.h.g(a7, null);
                    return;
                }
            }
            u6.h.g(a7, null);
        } finally {
        }
    }

    @Override // io.sentry.m3
    public final io.sentry.protocol.v k() {
        io.sentry.protocol.v i5;
        io.sentry.android.replay.capture.l lVar = this.f15934m;
        if (lVar != null && (i5 = ((io.sentry.android.replay.capture.c) lVar).i()) != null) {
            return i5;
        }
        io.sentry.protocol.v EMPTY_ID = io.sentry.protocol.v.f16922b;
        Intrinsics.checkNotNullExpressionValue(EMPTY_ID, "EMPTY_ID");
        return EMPTY_ID;
    }

    @Override // io.sentry.m3
    public final void n(Boolean bool) {
        if (this.f15932k.get() && N()) {
            io.sentry.protocol.v vVar = io.sentry.protocol.v.f16922b;
            io.sentry.android.replay.capture.l lVar = this.f15934m;
            b6 b6Var = null;
            if (vVar.equals(lVar != null ? ((io.sentry.android.replay.capture.c) lVar).i() : null)) {
                b6 b6Var2 = this.f15926d;
                if (b6Var2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("options");
                } else {
                    b6Var = b6Var2;
                }
                b6Var.getLogger().h(b5.DEBUG, "Replay id is not set, not capturing for event", new Object[0]);
                return;
            }
            io.sentry.android.replay.capture.l lVar2 = this.f15934m;
            if (lVar2 != null) {
                lVar2.f(Intrinsics.areEqual(bool, Boolean.TRUE), new androidx.fragment.app.r(2, this));
            }
            io.sentry.android.replay.capture.l lVar3 = this.f15934m;
            this.f15934m = lVar3 != null ? lVar3.d() : null;
        }
    }

    @Override // io.sentry.o0
    public final void r(n0 status) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.f15925c = status;
        if (this.f15934m instanceof io.sentry.android.replay.capture.o) {
            if (status == n0.DISCONNECTED) {
                U();
            } else {
                W();
            }
        }
    }

    @Override // io.sentry.m3
    public final void stop() {
        p pVar = this.q;
        io.sentry.r a7 = this.f15937p.a();
        try {
            if (this.f15932k.get()) {
                q qVar = q.STOPPED;
                if (pVar.a(qVar)) {
                    if (this.f15928f instanceof g) {
                        f0 f0Var = ((s) this.f15931i.getValue()).f16072c;
                        c0 c0Var = this.f15928f;
                        Intrinsics.checkNotNull(c0Var, "null cannot be cast to non-null type io.sentry.android.replay.OnRootViewsChangedListener");
                        f0Var.remove(c0Var);
                    }
                    ((s) this.f15931i.getValue()).f16072c.remove(this.f15929g);
                    c0 c0Var2 = this.f15928f;
                    if (c0Var2 != null) {
                        c0Var2.reset();
                    }
                    c0 c0Var3 = this.f15928f;
                    if (c0Var3 != null) {
                        c0Var3.w();
                    }
                    io.sentry.android.replay.gestures.b bVar = this.f15929g;
                    if (bVar != null) {
                        bVar.a();
                    }
                    io.sentry.android.replay.capture.l lVar = this.f15934m;
                    if (lVar != null) {
                        lVar.stop();
                    }
                    this.f15934m = null;
                    Intrinsics.checkNotNullParameter(qVar, "<set-?>");
                    pVar.f16068a = qVar;
                    Unit unit = Unit.f19194a;
                    u6.h.g(a7, null);
                    return;
                }
            }
            u6.h.g(a7, null);
        } finally {
        }
    }

    @Override // io.sentry.m3
    public final void t() {
        this.f15933l.set(false);
        W();
    }

    @Override // io.sentry.m3
    public final void w(d converter) {
        Intrinsics.checkNotNullParameter(converter, "converter");
        this.f15935n = converter;
    }

    @Override // io.sentry.q1
    public final void y(b6 options) {
        Double d10;
        y3 scopes = y3.f17255a;
        Intrinsics.checkNotNullParameter(scopes, "scopes");
        Intrinsics.checkNotNullParameter(options, "options");
        this.f15926d = options;
        if (Build.VERSION.SDK_INT < 26) {
            options.getLogger().h(b5.INFO, "Session replay is only supported on API 26 and above", new Object[0]);
            return;
        }
        Double d11 = options.getSessionReplay().f16400a;
        if ((d11 == null || d11.doubleValue() <= 0.0d) && ((d10 = options.getSessionReplay().f16401b) == null || d10.doubleValue() <= 0.0d)) {
            options.getLogger().h(b5.INFO, "Session replay is disabled, no sample rate specified", new Object[0]);
            return;
        }
        this.f15927e = scopes;
        this.f15928f = new c0(options, this, this, this.f15936o, (io.sentry.android.replay.util.f) this.j.getValue());
        this.f15929g = new io.sentry.android.replay.gestures.b(options, this);
        this.f15932k.set(true);
        options.getConnectionStatusProvider().X(this);
        e5.j d12 = scopes.d();
        if (d12 != null) {
            ((CopyOnWriteArrayList) d12.f8648e).add(this);
        }
        rh.g.a("Replay");
        b6 b6Var = this.f15926d;
        b6 options2 = null;
        if (b6Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("options");
            b6Var = null;
        }
        e1 executorService = b6Var.getExecutorService();
        Intrinsics.checkNotNullExpressionValue(executorService, "getExecutorService(...)");
        b6 b6Var2 = this.f15926d;
        if (b6Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("options");
        } else {
            options2 = b6Var2;
        }
        io.sentry.android.core.f task = new io.sentry.android.core.f(6, this);
        Intrinsics.checkNotNullParameter(executorService, "<this>");
        Intrinsics.checkNotNullParameter(options2, "options");
        Intrinsics.checkNotNullParameter("ReplayIntegration.finalize_previous_replay", "taskName");
        Intrinsics.checkNotNullParameter(task, "task");
        try {
            executorService.submit(new io.sentry.android.replay.util.c(0, task, options2));
        } catch (Throwable th2) {
            options2.getLogger().e(b5.ERROR, "Failed to submit task ReplayIntegration.finalize_previous_replay to executor", th2);
        }
    }

    @Override // io.sentry.m3
    public final void z() {
        b6 b6Var;
        io.sentry.android.replay.capture.l gVar;
        p pVar = this.q;
        io.sentry.r a7 = this.f15937p.a();
        try {
            if (!this.f15932k.get()) {
                u6.h.g(a7, null);
                return;
            }
            q qVar = q.STARTED;
            if (!pVar.a(qVar)) {
                b6 b6Var2 = this.f15926d;
                if (b6Var2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("options");
                    b6Var2 = null;
                }
                b6Var2.getLogger().h(b5.DEBUG, "Session replay is already being recorded, not starting a new one", new Object[0]);
                u6.h.g(a7, null);
                return;
            }
            io.sentry.util.i iVar = (io.sentry.util.i) this.f15930h.getValue();
            b6 b6Var3 = this.f15926d;
            if (b6Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("options");
                b6Var3 = null;
            }
            Double d10 = b6Var3.getSessionReplay().f16400a;
            Intrinsics.checkNotNullParameter(iVar, "<this>");
            boolean z5 = d10 != null && d10.doubleValue() >= iVar.c();
            if (!z5) {
                b6 b6Var4 = this.f15926d;
                if (b6Var4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("options");
                    b6Var4 = null;
                }
                Double d11 = b6Var4.getSessionReplay().f16401b;
                if (!(d11 != null && d11.doubleValue() > 0.0d)) {
                    b6 b6Var5 = this.f15926d;
                    if (b6Var5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("options");
                        b6Var5 = null;
                    }
                    b6Var5.getLogger().h(b5.INFO, "Session replay is not started, full session was not sampled and onErrorSampleRate is not specified", new Object[0]);
                    u6.h.g(a7, null);
                    return;
                }
            }
            Intrinsics.checkNotNullParameter(qVar, "<set-?>");
            pVar.f16068a = qVar;
            if (z5) {
                b6 b6Var6 = this.f15926d;
                if (b6Var6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("options");
                    b6Var6 = null;
                }
                gVar = new io.sentry.android.replay.capture.o(b6Var6, this.f15927e, this.f15924b, (io.sentry.android.replay.util.f) this.j.getValue());
            } else {
                b6 b6Var7 = this.f15926d;
                if (b6Var7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("options");
                    b6Var = null;
                } else {
                    b6Var = b6Var7;
                }
                gVar = new io.sentry.android.replay.capture.g(b6Var, this.f15927e, this.f15924b, (io.sentry.util.i) this.f15930h.getValue(), (io.sentry.android.replay.util.f) this.j.getValue());
            }
            this.f15934m = gVar;
            c0 c0Var = this.f15928f;
            if (c0Var != null) {
                c0Var.f15959f.getAndSet(true);
            }
            io.sentry.android.replay.capture.l lVar = this.f15934m;
            if (lVar != null) {
                lVar.e(0, new io.sentry.protocol.v(), null);
            }
            if (this.f15928f instanceof g) {
                f0 f0Var = ((s) this.f15931i.getValue()).f16072c;
                c0 c0Var2 = this.f15928f;
                Intrinsics.checkNotNull(c0Var2, "null cannot be cast to non-null type io.sentry.android.replay.OnRootViewsChangedListener");
                f0Var.add(c0Var2);
            }
            ((s) this.f15931i.getValue()).f16072c.add(this.f15929g);
            Unit unit = Unit.f19194a;
            u6.h.g(a7, null);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                u6.h.g(a7, th2);
                throw th3;
            }
        }
    }
}
