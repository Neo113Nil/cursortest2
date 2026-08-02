package com.vk.im.engine;

import android.os.SystemClock;
import android.os.Trace;
import com.ironsource.X3;
import com.vk.im.engine.exceptions.IllegalEnvironmentStateException;
import com.vk.im.engine.exceptions.stacktrace.StackTraceInfoException;
import com.vk.im.engine.internal.jobs.dialogs.a;
import com.vk.im.engine.internal.jobs.dialogs.c;
import com.vk.im.engine.models.ImBgSyncLaunchState;
import com.vk.im.engine.models.sync.ImBgSyncMode;
import io.reactivex.rxjava3.core.x;
import io.reactivex.rxjava3.internal.operators.single.l;
import io.reactivex.rxjava3.internal.operators.single.r;
import io.reactivex.rxjava3.subjects.d;
import java.util.Collections;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.a0b;
import xsna.a0g;
import xsna.a1b;
import xsna.a1g0;
import xsna.aii0;
import xsna.asp;
import xsna.asu0;
import xsna.b8;
import xsna.bim;
import xsna.bn30;
import xsna.bqf0;
import xsna.d9w;
import xsna.dz30;
import xsna.e1w;
import xsna.e43;
import xsna.e7b;
import xsna.emm;
import xsna.eua;
import xsna.f34;
import xsna.f9w;
import xsna.fju;
import xsna.fr6;
import xsna.fxv;
import xsna.g8i;
import xsna.gzs;
import xsna.h5o0;
import xsna.hh30;
import xsna.hi30;
import xsna.i3w;
import xsna.ixv;
import xsna.j3w;
import xsna.jb;
import xsna.jcg;
import xsna.jvn;
import xsna.k7b0;
import xsna.k8b;
import xsna.kbm;
import xsna.kim;
import xsna.l8i;
import xsna.m1b;
import xsna.mh00;
import xsna.mla;
import xsna.n2w;
import xsna.n3w;
import xsna.n3w.a;
import xsna.n6b;
import xsna.nb8;
import xsna.njm;
import xsna.nr2;
import xsna.ny30;
import xsna.o3w;
import xsna.o9o;
import xsna.oam;
import xsna.oug;
import xsna.pdb;
import xsna.py30;
import xsna.qfm;
import xsna.qhs;
import xsna.qpx;
import xsna.qxa;
import xsna.r14;
import xsna.r28;
import xsna.ri30;
import xsna.rl3;
import xsna.s3q0;
import xsna.sgm;
import xsna.si30;
import xsna.spx;
import xsna.sv30;
import xsna.t0b;
import xsna.tcb;
import xsna.tdb;
import xsna.uli0;
import xsna.w5b;
import xsna.wbw;
import xsna.wgm;
import xsna.wsm;
import xsna.wzs;
import xsna.xf1;
import xsna.xiu;
import xsna.yn00;
import xsna.zab;
import xsna.zhb;
import xsna.zrp;
import xsna.zy30;

/* compiled from: ImEnvironmentRunner.kt */
/* loaded from: classes.dex */
public final class ImEnvironmentRunner {
    public final n3w a;
    public final d9w b;
    public ImBgSyncMode d;
    public String e;
    public final Object c = new Object();
    public final d<wbw> f = d.N0();
    public State g = State.IDLE;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ImEnvironmentRunner.kt */
    public static final class State {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;
        public static final State IDLE;
        public static final State SHUTDOWN;
        public static final State STARTED;
        public static final State STARTING;

        static {
            State state = new State("IDLE", 0);
            IDLE = state;
            State state2 = new State("STARTING", 1);
            STARTING = state2;
            State state3 = new State(SignalingProtocol.STATE_STARTED, 2);
            STARTED = state3;
            State state4 = new State("SHUTDOWN", 3);
            SHUTDOWN = state4;
            State[] stateArr = {state, state2, state3, state4};
            $VALUES = stateArr;
            $ENTRIES = new asp(stateArr);
        }

        public State() {
            throw null;
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }
    }

    /* compiled from: ImEnvironmentRunner.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[State.values().length];
            try {
                iArr[State.SHUTDOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[State.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[State.IDLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[State.STARTING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ImEnvironmentRunner(n3w n3wVar, f9w f9wVar) {
        this.a = n3wVar;
        this.b = f9wVar;
    }

    public final void a(State... stateArr) {
        synchronized (this.c) {
            if (!rl3.G(stateArr, this.g)) {
                throw new IllegalEnvironmentStateException(this.g, rl3.y0(stateArr));
            }
            s3q0 s3q0Var = s3q0.a;
        }
    }

    public final String b() {
        String str;
        synchronized (this.c) {
            try {
                a(State.IDLE, State.STARTING, State.STARTED);
                int i = a.$EnumSwitchMapping$0[this.g.ordinal()];
                str = null;
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3 && i != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        str = this.e;
                    } else {
                        n3w n3wVar = this.a;
                        synchronized (n3wVar.b) {
                            fxv fxvVar = n3wVar.r;
                            if (fxvVar != null) {
                                synchronized (fxvVar) {
                                    str = fxvVar.d;
                                }
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    public final ImBgSyncLaunchState c() {
        ImBgSyncLaunchState imBgSyncLaunchState;
        synchronized (this.c) {
            try {
                int i = a.$EnumSwitchMapping$0[this.g.ordinal()];
                if (i == 1 || i == 2) {
                    imBgSyncLaunchState = this.a.f;
                } else if (i == 3) {
                    imBgSyncLaunchState = ImBgSyncLaunchState.IDLE;
                } else {
                    if (i != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    imBgSyncLaunchState = this.d != null ? ImBgSyncLaunchState.LAUNCHING : ImBgSyncLaunchState.IDLE;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return imBgSyncLaunchState;
    }

    public final ImBgSyncMode d() {
        ImBgSyncMode imBgSyncMode;
        synchronized (this.c) {
            try {
                a(State.IDLE, State.STARTING, State.STARTED);
                int i = a.$EnumSwitchMapping$0[this.g.ordinal()];
                if (i == 1) {
                    imBgSyncMode = null;
                } else if (i != 2) {
                    if (i != 3 && i != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    imBgSyncMode = this.d;
                } else {
                    imBgSyncMode = this.a.h();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return imBgSyncMode;
    }

    public final ixv e() {
        ixv ixvVar;
        synchronized (this.c) {
            try {
                int i = a.$EnumSwitchMapping$0[this.g.ordinal()];
                if (i == 1) {
                    ixvVar = ixv.c;
                } else if (i != 2) {
                    if (i != 3 && i != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ixvVar = this.d != null ? ixv.d : ixv.c;
                } else {
                    ixvVar = this.a.b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return ixvVar;
    }

    public final void f() {
        synchronized (this.c) {
            a(State.IDLE);
            this.g = State.STARTING;
            s3q0 s3q0Var = s3q0.a;
        }
        this.b.debug(new nb8(6));
        long currentTimeMillis = System.currentTimeMillis();
        final n3w n3wVar = this.a;
        try {
            Trace.beginSection("ImEnvironmentImpl.initialize");
            synchronized (n3wVar.b) {
                LifecycleState lifecycleState = n3wVar.c;
                StackTraceInfoException stackTraceInfoException = n3wVar.e;
                if (lifecycleState != LifecycleState.IDLE) {
                    throw new IllegalStateException("Instance is not in idle state. Current state: " + lifecycleState, stackTraceInfoException);
                }
                n3wVar.i(LifecycleState.PREPARING_SERVICES);
                n3wVar.f = ImBgSyncLaunchState.IDLE;
            }
            Trace.endSection();
            n3wVar.u = ixv.c;
            uli0 uli0Var = new uli0();
            long uptimeMillis = SystemClock.uptimeMillis();
            asu0.a.getClass();
            final ScheduledExecutorService v = asu0.v();
            n3w.z.debug(new fr6(4));
            try {
                Trace.beginSection("ImEnvironmentImpl.initializeServices");
                Runnable runnable = new Runnable() { // from class: xsna.g3w
                    @Override // java.lang.Runnable
                    public final void run() {
                        n3w n3wVar2 = n3w.this;
                        n3wVar2.g = new fil0(n3wVar2);
                    }
                };
                EmptyList emptyList = EmptyList.b;
                int i = 1;
                h5o0.a c = uli0Var.c("StorageTrigger", Collections.singletonList(uli0Var.c("StorageTriggerHandler", emptyList, runnable)), new a0g(n3wVar, i));
                h5o0.a c2 = uli0Var.c("StorageChangesListener", emptyList, new Runnable() { // from class: xsna.h3w
                    @Override // java.lang.Runnable
                    public final void run() {
                        n3w n3wVar2 = n3w.this;
                        n3wVar2.i = new ngl0(n3wVar2);
                    }
                });
                h5o0.b(uli0Var, "SettingsStorageManager", new i3w(n3wVar, 0));
                uli0Var.c("SequenceGenerator", Collections.singletonList(uli0Var.c("StorageManager", e43.l(c2, c), new j3w(n3wVar, 0))), new Runnable() { // from class: xsna.k3w
                    @Override // java.lang.Runnable
                    public final void run() {
                        n3w n3wVar2 = n3w.this;
                        n3wVar2.l = new yki0(n3wVar2.j);
                    }
                });
                h5o0.b(uli0Var, "TaskExecutor", new jvn(n3wVar, 1));
                h5o0.b(uli0Var, "ComposingManager", new l8i(n3wVar, i));
                h5o0.b(uli0Var, "JobManager", new Runnable() { // from class: xsna.l3w
                    @Override // java.lang.Runnable
                    public final void run() {
                        n3w n3wVar2 = n3w.this;
                        pzv pzvVar = n3wVar2.a;
                        pzvVar.getClass();
                        n3wVar2.o = i2w.f.a(pzvVar.a.a, n3wVar2.H0());
                        n3wVar2.p = new u8w(n3wVar2.o);
                    }
                });
                h5o0.b(uli0Var, "EventHelper", new Runnable() { // from class: xsna.d3w
                    @Override // java.lang.Runnable
                    public final void run() {
                        n3w n3wVar2 = n3w.this;
                        n3wVar2.q = new czp(n3wVar2, n3wVar2);
                    }
                });
                h5o0.b(uli0Var, "BgSyncManager", new Runnable() { // from class: xsna.e3w
                    @Override // java.lang.Runnable
                    public final void run() {
                        n3w n3wVar2 = n3w.this;
                        n3wVar2.r = new fxv(n3wVar2, v, n3wVar2.new a());
                    }
                });
                h5o0.b(uli0Var, "CycleDetector", new qhs(n3wVar, i));
                h5o0.b(uli0Var, "BackpressureDetector", new Runnable() { // from class: xsna.f3w
                    @Override // java.lang.Runnable
                    public final void run() {
                        n3w.this.t = new ay5(new m3w(0));
                    }
                });
                Trace.endSection();
                n3wVar.i(LifecycleState.READY);
                h5o0.b(uli0Var, "JobManagerPrepare", new Runnable() { // from class: xsna.y2w
                    @Override // java.lang.Runnable
                    public final void run() {
                        x6x x6xVar = n3w.this.o;
                        x6xVar.g(bim.class, new bim.a());
                        x6xVar.g(wsm.class, new wsm.a());
                        x6xVar.g(qfm.class, new qfm.a());
                        x6xVar.g(bqf0.class, new bqf0.a());
                        x6xVar.g(mh00.class, new mh00.a());
                        x6xVar.g(xiu.class, new xiu.a());
                        x6xVar.g(sgm.class, new sgm.a());
                        x6xVar.g(bn30.class, new bn30.a());
                        x6xVar.g(ny30.class, new ny30.a());
                        x6xVar.g(w5b.class, new w5b.a());
                        x6xVar.g(zy30.class, new zy30.a());
                        x6xVar.g(dz30.class, new dz30.a());
                        x6xVar.g(sv30.class, new sv30.a());
                        x6xVar.g(py30.class, new py30.a());
                        x6xVar.g(ri30.class, new ri30.a());
                        x6xVar.g(hi30.class, new hi30.a());
                        x6xVar.g(si30.class, new si30.a());
                        x6xVar.g(r28.class, new r28.a());
                        x6xVar.g(qpx.class, new qpx.a());
                        x6xVar.g(a1g0.class, new a1g0.a());
                        x6xVar.g(spx.class, new spx.a());
                        x6xVar.g(wgm.class, new wgm.a());
                        x6xVar.g(r14.class, new r14.a());
                        x6xVar.g(kim.class, new kim.a());
                        x6xVar.g(emm.class, new emm.a());
                        x6xVar.g(njm.class, new njm.a());
                        x6xVar.g(hh30.class, new hh30.a());
                        x6xVar.g(oam.class, new oam.b());
                        x6xVar.g(com.vk.im.engine.internal.jobs.dialogs.a.class, new a.C1115a());
                        x6xVar.g(com.vk.im.engine.internal.jobs.dialogs.c.class, new c.a());
                        x6xVar.g(f34.class, new f34.a());
                        x6xVar.g(m1b.class, new m1b.a());
                        x6xVar.g(eua.class, new eua.a());
                        x6xVar.g(pdb.class, new pdb.a());
                        x6xVar.g(e7b.class, new e7b.a());
                        x6xVar.g(t0b.class, new t0b.a());
                        x6xVar.g(aii0.class, new aii0.a());
                        x6xVar.g(yn00.class, new yn00.a());
                        x6xVar.g(o9o.class, new o9o.a());
                        x6xVar.g(a1b.class, new a1b.a());
                        x6xVar.g(n6b.class, new n6b.a());
                        x6xVar.g(oug.class, new oug.a());
                        x6xVar.g(kbm.class, new kbm.a());
                        x6xVar.g(zab.class, new zab.a());
                        x6xVar.g(zhb.class, new zhb.a());
                        x6xVar.g(k8b.class, new k8b.a());
                        x6xVar.g(tdb.class, new tdb.a());
                        x6xVar.g(qxa.class, new qxa.a());
                        x6xVar.g(a0b.class, new a0b.a());
                        x6xVar.g(tcb.class, new tcb.a());
                    }
                });
                h5o0.b(uli0Var, "JobManagerStart", new Runnable() { // from class: xsna.z2w
                    @Override // java.lang.Runnable
                    public final void run() {
                        n3w n3wVar2 = n3w.this;
                        n3wVar2.o.f(n3wVar2);
                    }
                });
                h5o0.b(uli0Var, "MethodList", new Runnable() { // from class: xsna.a3w
                    @Override // java.lang.Runnable
                    public final void run() {
                        n3w n3wVar2 = n3w.this;
                        try {
                            n3wVar2.getExperiments();
                            n3wVar2.x = EmptyList.b;
                        } catch (Exception e) {
                            if (sv1.t(e)) {
                                return;
                            }
                            n3wVar2.a.g.a(e);
                        }
                    }
                });
                final long uptimeMillis2 = SystemClock.uptimeMillis() - uptimeMillis;
                n3w.n(uli0Var, "#initialize\n", 500L, new wzs() { // from class: xsna.b3w
                    @Override // xsna.wzs
                    public final Object invoke(Object obj, Object obj2) {
                        long longValue = ((Long) obj2).longValue();
                        n3w.this.a.O.g().a(longValue, uptimeMillis2, (String) obj);
                        return s3q0.a;
                    }
                });
                final long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                this.b.debug(new gzs() { // from class: xsna.p3w
                    @Override // xsna.gzs
                    public final Object invoke() {
                        return qlb0.a(currentTimeMillis2, "#ImEnvironment: init() done [", "ms]");
                    }
                });
                long currentTimeMillis3 = System.currentTimeMillis();
                synchronized (this.c) {
                    try {
                        ImBgSyncMode imBgSyncMode = this.d;
                        String str = this.e;
                        if (imBgSyncMode != null && str != null) {
                            this.a.k(imBgSyncMode, str);
                        }
                        this.f.onNext(this.a);
                        this.d = null;
                        this.e = null;
                        this.g = State.STARTED;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                final long currentTimeMillis4 = System.currentTimeMillis() - currentTimeMillis3;
                this.b.debug(new gzs() { // from class: xsna.q3w
                    @Override // xsna.gzs
                    public final Object invoke() {
                        return qlb0.a(currentTimeMillis4, "#ImEnvironment: submit done [", "ms]");
                    }
                });
                this.a.a.O.g().b(currentTimeMillis2, currentTimeMillis4);
            } finally {
            }
        } finally {
        }
    }

    public final boolean g() {
        boolean z;
        synchronized (this.c) {
            try {
                int i = a.$EnumSwitchMapping$0[this.g.ordinal()];
                z = false;
                if (i != 1) {
                    if (i == 2) {
                        z = this.a.X0();
                    } else if (this.a.a.m() != null) {
                        z = true;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    public final void h() {
        synchronized (this.c) {
            a(State.IDLE, State.STARTED);
            this.g = State.SHUTDOWN;
            this.f.onError(new CancellationException("ImEnvironment is shutdown"));
            s3q0 s3q0Var = s3q0.a;
        }
        this.b.debug(new jb(18));
        long currentTimeMillis = System.currentTimeMillis();
        n3w n3wVar = this.a;
        synchronized (n3wVar.b) {
            n3wVar.f();
            n3wVar.i(LifecycleState.SHUTTING_DOWN);
        }
        try {
            n3wVar.j();
            n3wVar.u = ixv.c;
            n3wVar.f = ImBgSyncLaunchState.IDLE;
            n3wVar.i(LifecycleState.IDLE);
            n3wVar.d.onComplete();
            n3wVar.g = null;
            n3wVar.h = null;
            n3wVar.i = null;
            n3wVar.j = null;
            n3wVar.k = null;
            n3wVar.l = null;
            n3wVar.m = null;
            n3wVar.n = null;
            n3wVar.o = null;
            n3wVar.p = null;
            n3wVar.q = null;
            n3wVar.r = null;
            n3wVar.v = null;
            final long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            this.b.debug(new gzs() { // from class: xsna.r3w
                @Override // xsna.gzs
                public final Object invoke() {
                    return qlb0.a(currentTimeMillis2, "#ImEnvironment: shutdown() done [", "ms]");
                }
            });
        } catch (Throwable th) {
            n3wVar.u = ixv.c;
            n3wVar.f = ImBgSyncLaunchState.IDLE;
            n3wVar.i(LifecycleState.IDLE);
            n3wVar.d.onComplete();
            n3wVar.g = null;
            n3wVar.h = null;
            n3wVar.i = null;
            n3wVar.j = null;
            n3wVar.k = null;
            n3wVar.l = null;
            n3wVar.m = null;
            n3wVar.n = null;
            n3wVar.o = null;
            n3wVar.p = null;
            n3wVar.q = null;
            n3wVar.r = null;
            n3wVar.v = null;
            throw th;
        }
    }

    public final void i(ImBgSyncMode imBgSyncMode, String str) {
        synchronized (this.c) {
            try {
                a(State.IDLE, State.STARTING, State.STARTED);
                int i = a.$EnumSwitchMapping$0[this.g.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3 && i != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        this.d = imBgSyncMode;
                        this.e = str;
                    } else {
                        this.a.k(imBgSyncMode, str);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final g8i j() {
        synchronized (this.c) {
            a(State.STARTING, State.STARTED, State.SHUTDOWN);
            int i = a.$EnumSwitchMapping$0[this.g.ordinal()];
            if (i == 1 || i == 2) {
                return this.a.l();
            }
            if (i == 3) {
                throw new IllegalStateException("Illegal runner state " + this.g);
            }
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            this.d = null;
            this.e = null;
            return k7b0.h("ImEnvironmentRunner");
        }
    }

    public final <V> x<V> k(e1w<V> e1wVar) {
        x<V> i;
        synchronized (this.c) {
            try {
                int i2 = a.$EnumSwitchMapping$0[this.g.ordinal()];
                if (i2 == 1) {
                    n2w g = this.a.a.O.g();
                    String c = e1wVar.c();
                    mla mlaVar = e1wVar.a;
                    if (mlaVar == null) {
                        mlaVar = null;
                    }
                    mlaVar.getClass();
                    g.c(SystemClock.uptimeMillis() - mlaVar.f, c, "shutdown");
                    int i3 = IllegalEnvironmentStateException.b;
                    IllegalEnvironmentStateException a2 = IllegalEnvironmentStateException.a.a();
                    mla mlaVar2 = e1wVar.a;
                    nr2.L(a2, (mlaVar2 != null ? mlaVar2 : null).b());
                    i = x.i(a2);
                } else if (i2 != 2) {
                    if (i2 != 3 && i2 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i = l(e1wVar);
                } else {
                    n2w g2 = this.a.a.O.g();
                    String c2 = e1wVar.c();
                    mla mlaVar3 = e1wVar.a;
                    mla mlaVar4 = mlaVar3 != null ? mlaVar3 : null;
                    mlaVar4.getClass();
                    g2.c(SystemClock.uptimeMillis() - mlaVar4.f, c2, X3.i.d0);
                    i = this.a.d(e1wVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return i;
    }

    public final l l(e1w e1wVar) {
        this.b.debug(new jcg(e1wVar, 26));
        return new r(this.f.r0(io.reactivex.rxjava3.schedulers.a.b()).K(), new b8(new fju(e1wVar, 1), 28)).h(new xf1(new o3w(e1wVar, 0), 28));
    }
}
