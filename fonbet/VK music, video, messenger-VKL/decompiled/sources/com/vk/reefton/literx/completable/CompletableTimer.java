package com.vk.reefton.literx.completable;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import xsna.b8h0;
import xsna.ign;
import xsna.l7i;
import xsna.u7i;

/* compiled from: CompletableTimer.kt */
/* loaded from: classes5.dex */
public final class CompletableTimer extends l7i {
    public final long a;
    public final TimeUnit b;
    public final b8h0 c;

    /* compiled from: CompletableTimer.kt */
    public static final class TimerDisposable extends AtomicBoolean implements ign, Runnable {
        private final long delay;
        private final u7i downstream;
        private final b8h0 scheduler;
        private ign schedulerDisposable;
        private final TimeUnit timeUnit;

        public TimerDisposable(u7i u7iVar, long j, TimeUnit timeUnit, b8h0 b8h0Var) {
            this.downstream = u7iVar;
            this.delay = j;
            this.timeUnit = timeUnit;
            this.scheduler = b8h0Var;
        }

        public final void d() {
            this.schedulerDisposable = this.scheduler.a(this, this.delay, this.timeUnit);
        }

        @Override // xsna.ign
        public final void dispose() {
            set(true);
            ign ignVar = this.schedulerDisposable;
            if (ignVar != null) {
                ignVar.dispose();
            }
            this.schedulerDisposable = null;
        }

        @Override // xsna.ign
        public final boolean h() {
            return get();
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.downstream.onComplete();
        }
    }

    public CompletableTimer(b8h0 b8h0Var) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.a = 500L;
        this.b = timeUnit;
        this.c = b8h0Var;
    }

    @Override // xsna.l7i
    public final void a(u7i u7iVar) {
        TimerDisposable timerDisposable = new TimerDisposable(u7iVar, this.a, this.b, this.c);
        u7iVar.a(timerDisposable);
        timerDisposable.d();
    }
}
