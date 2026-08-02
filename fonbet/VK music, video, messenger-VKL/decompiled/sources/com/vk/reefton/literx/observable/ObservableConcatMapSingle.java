package com.vk.reefton.literx.observable;

import java.lang.Thread;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.NoWhenBranchMatchedException;
import xsna.asp;
import xsna.bnc0;
import xsna.dtj0;
import xsna.epx;
import xsna.er70;
import xsna.ign;
import xsna.iq70;
import xsna.izs;
import xsna.jfv0;
import xsna.so;
import xsna.xuj0;
import xsna.z1v;
import xsna.zrp;

/* compiled from: ObservableConcatMapSingle.kt */
/* loaded from: classes5.dex */
public final class ObservableConcatMapSingle<T, R> extends iq70<R> {
    public final ObservableMap b;
    public final bnc0 c;

    /* compiled from: ObservableConcatMapSingle.kt */
    public static abstract class a<T> {

        /* compiled from: ObservableConcatMapSingle.kt */
        /* renamed from: com.vk.reefton.literx.observable.ObservableConcatMapSingle$a$a, reason: collision with other inner class name */
        public static final class C1754a<T> extends a<T> {
        }

        /* compiled from: ObservableConcatMapSingle.kt */
        public static final class b<T> extends a<T> {
            public final Throwable a;

            public b(Throwable th) {
                this.a = th;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "ErrorNode(t=" + this.a + ")";
            }
        }

        /* compiled from: ObservableConcatMapSingle.kt */
        public static final class c<T> extends a<T> {
            public final T a;

            public c(T t) {
                this.a = t;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
            }

            public final int hashCode() {
                T t = this.a;
                if (t == null) {
                    return 0;
                }
                return t.hashCode();
            }

            public final String toString() {
                return so.a(this.a, "ItemNode(item=", ")");
            }
        }
    }

    public ObservableConcatMapSingle(ObservableMap observableMap, bnc0 bnc0Var) {
        this.b = observableMap;
        this.c = bnc0Var;
    }

    @Override // xsna.iq70
    public final void d(er70<R> er70Var) {
        ConcatMapSingleObserver concatMapSingleObserver = new ConcatMapSingleObserver(er70Var, this.c);
        this.b.d(concatMapSingleObserver);
        er70Var.a(concatMapSingleObserver);
    }

    /* compiled from: ObservableConcatMapSingle.kt */
    public static final class ConcatMapSingleObserver<T, R> implements er70<T>, ign {
        public final Object b;
        public final izs<T, dtj0<R>> c;
        public R e;
        public boolean g;
        public ign i;
        public ConcatMapSingleObserver<T, R>.InnerObserver k;
        public final ConcurrentLinkedDeque<a<T>> d = new ConcurrentLinkedDeque<>();
        public State f = State.VIRGIN;
        public final AtomicInteger h = new AtomicInteger();
        public final AtomicBoolean j = new AtomicBoolean();

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: ObservableConcatMapSingle.kt */
        public static final class State {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ State[] $VALUES;
            public static final State HAS_RESULT;
            public static final State VIRGIN;
            public static final State WAIT_FOR_SINGLE;

            static {
                State state = new State("VIRGIN", 0);
                VIRGIN = state;
                State state2 = new State("WAIT_FOR_SINGLE", 1);
                WAIT_FOR_SINGLE = state2;
                State state3 = new State("HAS_RESULT", 2);
                HAS_RESULT = state3;
                State[] stateArr = {state, state2, state3};
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

        public ConcatMapSingleObserver(er70 er70Var, bnc0 bnc0Var) {
            this.b = er70Var;
            this.c = bnc0Var;
        }

        @Override // xsna.er70
        public final void a(ign ignVar) {
            this.i = ignVar;
        }

        /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, xsna.er70] */
        public final void b() {
            AtomicInteger atomicInteger = this.h;
            if (atomicInteger.getAndIncrement() != 0) {
                return;
            }
            while (!this.j.get()) {
                State state = this.f;
                State state2 = State.VIRGIN;
                ?? r3 = this.b;
                if (state == state2) {
                    a<T> poll = this.d.poll();
                    if (poll != null) {
                        if (poll instanceof a.c) {
                            try {
                                dtj0<R> invoke = this.c.invoke(((a.c) poll).a);
                                this.f = State.WAIT_FOR_SINGLE;
                                ConcatMapSingleObserver<T, R>.InnerObserver innerObserver = new InnerObserver();
                                invoke.a(innerObserver);
                                this.k = innerObserver;
                            } catch (Throwable th) {
                                if (th instanceof VirtualMachineError) {
                                    throw ((VirtualMachineError) th);
                                }
                                if (th instanceof ThreadDeath) {
                                    throw ((ThreadDeath) th);
                                }
                                if (th instanceof LinkageError) {
                                    throw ((LinkageError) th);
                                }
                                dispose();
                                r3.onError(th);
                                return;
                            }
                        } else if (poll instanceof a.b) {
                            r3.onError(((a.b) poll).a);
                            dispose();
                        } else {
                            if (!(poll instanceof a.C1754a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            r3.onComplete();
                            dispose();
                        }
                    }
                } else if (state == State.HAS_RESULT) {
                    R r = this.e;
                    if (r != null) {
                        r3.onNext(r);
                    }
                    this.e = null;
                    this.f = state2;
                }
                if (atomicInteger.decrementAndGet() == 0) {
                    return;
                }
            }
        }

        @Override // xsna.ign
        public final void dispose() {
            ign ignVar = this.i;
            if (ignVar != null) {
                ignVar.dispose();
            }
            this.j.set(true);
            this.d.clear();
            this.e = null;
            ConcatMapSingleObserver<T, R>.InnerObserver innerObserver = this.k;
            if (innerObserver != null) {
                innerObserver.set(true);
            }
            this.k = null;
        }

        @Override // xsna.ign
        public final boolean h() {
            return this.j.get();
        }

        @Override // xsna.er70
        public final void onComplete() {
            if (this.j.get() || this.g) {
                return;
            }
            this.d.offer(new a.C1754a());
            ign ignVar = this.i;
            if (ignVar != null) {
                ignVar.dispose();
            }
            this.g = true;
            b();
        }

        @Override // xsna.er70
        public final void onError(Throwable th) {
            if (!this.j.get() && !this.g) {
                this.d.offer(new a.b(th));
                ign ignVar = this.i;
                if (ignVar != null) {
                    ignVar.dispose();
                }
                this.g = true;
                b();
                return;
            }
            jfv0.b bVar = z1v.a;
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

        @Override // xsna.er70
        public final void onNext(T t) {
            if (this.j.get() || this.g) {
                return;
            }
            this.d.offer(new a.c(t));
            b();
        }

        /* compiled from: ObservableConcatMapSingle.kt */
        public final class InnerObserver extends AtomicBoolean implements xuj0<R>, ign {
            public InnerObserver() {
            }

            @Override // xsna.ign
            public final void dispose() {
                set(true);
            }

            @Override // xsna.ign
            public final boolean h() {
                return get();
            }

            @Override // xsna.xuj0
            public final void onError(Throwable th) {
                ConcatMapSingleObserver.this.onError(th);
            }

            @Override // xsna.xuj0
            public final void onSuccess(R r) {
                ConcatMapSingleObserver<T, R> concatMapSingleObserver = ConcatMapSingleObserver.this;
                concatMapSingleObserver.e = r;
                concatMapSingleObserver.f = State.HAS_RESULT;
                concatMapSingleObserver.b();
            }

            @Override // xsna.xuj0
            public final void a(ign ignVar) {
            }
        }
    }
}
