package com.vk.reefton;

import com.vk.reefton.ReefEvent;
import com.vk.reefton.literx.observable.ObservableConcatMapSingle;
import com.vk.reefton.literx.observable.ObservableFilter;
import com.vk.reefton.literx.observable.ObservableMap;
import com.vk.reefton.literx.observable.ObservableObserveOn;
import com.vk.reefton.literx.observable.ObservableSubscribeOn;
import com.vk.reefton.literx.sbjects.PublishSubject;
import com.vk.reefton.literx.sbjects.ReplaySubject;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.b8h0;
import xsna.bnc0;
import xsna.f0z;
import xsna.fuc0;
import xsna.gnf0;
import xsna.hof0;
import xsna.jfv0;
import xsna.qof0;
import xsna.r820;
import xsna.s3q0;
import xsna.som0;
import xsna.w910;
import xsna.xmf0;
import xsna.xmz;
import xsna.z1v;
import xsna.zrp;

/* compiled from: Reef.kt */
/* loaded from: classes5.dex */
public final class Reef {
    public static volatile c j;
    public static volatile ReplaySubject l;
    public static jfv0.b o;
    public final xmf0 a;
    public final ArrayList b;
    public final ArrayList c;
    public final qof0 d;
    public final PublishSubject<ReefEvent> e = new PublishSubject<>();
    public State f = State.RELEASED;
    public final PublishSubject<State> g;
    public final int h;
    public static final AtomicInteger i = new AtomicInteger(0);
    public static final Object k = new Object();
    public static final AtomicInteger m = new AtomicInteger(0);
    public static final long n = System.currentTimeMillis();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Reef.kt */
    public static final class State {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;
        public static final State PAUSED;
        public static final State RELEASED;
        public static final State SETUP;
        public static final State STARTED;

        static {
            State state = new State("RELEASED", 0);
            RELEASED = state;
            State state2 = new State("SETUP", 1);
            SETUP = state2;
            State state3 = new State(SignalingProtocol.STATE_STARTED, 2);
            STARTED = state3;
            State state4 = new State("PAUSED", 3);
            PAUSED = state4;
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

    /* compiled from: Reef.kt */
    public static final class a {
        public static void a(Throwable th) {
            AtomicInteger atomicInteger = Reef.i;
            jfv0.b bVar = Reef.o;
            if (bVar != null) {
                bVar.invoke(th);
                return;
            }
            th.printStackTrace();
            Thread currentThread = Thread.currentThread();
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = currentThread.getUncaughtExceptionHandler();
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(currentThread, th);
            }
        }

        public static void b(jfv0.b bVar) {
            Reef.o = bVar;
            z1v.a = bVar;
        }
    }

    /* compiled from: Reef.kt */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[State.values().length];
            try {
                iArr[State.SETUP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[State.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[State.PAUSED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[State.RELEASED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public Reef(xmf0 xmf0Var, ArrayList arrayList, ArrayList arrayList2, qof0 qof0Var) {
        Throwable th;
        this.a = xmf0Var;
        this.b = arrayList;
        this.c = arrayList2;
        this.d = qof0Var;
        PublishSubject<State> publishSubject = new PublishSubject<>();
        this.g = publishSubject;
        this.h = i.incrementAndGet();
        synchronized (k) {
            try {
                if (j == null) {
                    try {
                        c cVar = new c(qof0Var);
                        cVar.a();
                        j = cVar;
                        s3q0 s3q0Var = s3q0.a;
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
                if (l == null) {
                    qof0Var.getClass();
                    som0 som0Var = qof0.M;
                    if (som0Var == null) {
                        qof0.N.getClass();
                        som0Var = new som0();
                        qof0.M = som0Var;
                    }
                    l = (ReplaySubject) som0Var.b;
                    s3q0 s3q0Var2 = s3q0.a;
                }
                new ObservableObserveOn(publishSubject, qof0Var.e()).c(new com.vk.reefton.a(1, this, Reef.class, "onNewState", "onNewState(Lcom/vk/reefton/Reef$State;)V", 0), new xmz(27));
                ReplaySubject replaySubject = qof0Var.f().a;
                b8h0 e = qof0Var.e();
                replaySubject.getClass();
                new ObservableConcatMapSingle(new ObservableMap(new ObservableFilter(new ObservableObserveOn(new ObservableSubscribeOn(replaySubject, e), qof0Var.e()), new fuc0(this, 6)), new f0z(this, 23)), new bnc0(this, 4)).c(new r820(this, 19), new w910(this, 21));
                gnf0 gnf0Var = qof0.A;
                if (gnf0Var == null) {
                    gnf0Var = (gnf0) qof0.B.invoke(qof0Var);
                    qof0.A = gnf0Var;
                }
                gnf0Var.a();
                qof0Var.a().getClass();
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    public final void a(ReefEvent reefEvent) {
        boolean z = reefEvent instanceof ReefEvent.x;
        qof0 qof0Var = this.d;
        if (z) {
            hof0 d = qof0Var.d();
            d.c = null;
            d.d = null;
        }
        if (!qof0Var.a().c() || qof0Var.d().a()) {
            this.e.onNext(reefEvent);
        }
    }

    public final void b() {
        this.g.onNext(State.PAUSED);
    }

    public final void c() {
        this.g.onNext(State.SETUP);
    }

    public final void d() {
        this.g.onNext(State.STARTED);
    }
}
