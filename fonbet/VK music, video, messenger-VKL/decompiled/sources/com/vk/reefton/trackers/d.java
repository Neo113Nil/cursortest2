package com.vk.reefton.trackers;

import com.vk.reefton.dto.ReefHeartbeatType;
import com.vk.reefton.trackers.l;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import xsna.fnf0;
import xsna.hof0;
import xsna.l7i;
import xsna.m7i;
import xsna.qof0;
import xsna.vof0;
import xsna.xmf0;
import xsna.yh9;

/* compiled from: ReefHeartbeatTracker.kt */
/* loaded from: classes5.dex */
public final class d extends l {
    public final ReefHeartbeatType a;
    public final fnf0 b;
    public final hof0 c;
    public final com.vk.reefton.d d;
    public final long e;
    public final TimeUnit f;
    public final ScheduledThreadPoolExecutor g;
    public ScheduledFuture<?> h;

    /* compiled from: ReefHeartbeatTracker.kt */
    public static final class a implements l.a {
        public final ReefHeartbeatType a;
        public long b = 60000;
        public TimeUnit c = TimeUnit.MILLISECONDS;

        public a(ReefHeartbeatType reefHeartbeatType) {
            this.a = reefHeartbeatType;
        }

        @Override // com.vk.reefton.trackers.l.a
        public final l a(qof0 qof0Var) {
            return new d(this.a, qof0Var.a(), qof0Var.d(), qof0Var.f(), this.b, this.c);
        }
    }

    /* compiled from: ReefHeartbeatTracker.kt */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ReefHeartbeatType.values().length];
            try {
                iArr[ReefHeartbeatType.PLAYER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ReefHeartbeatType.APP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public d(ReefHeartbeatType reefHeartbeatType, fnf0 fnf0Var, hof0 hof0Var, com.vk.reefton.d dVar, long j, TimeUnit timeUnit) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        this.a = reefHeartbeatType;
        this.b = fnf0Var;
        this.c = hof0Var;
        this.d = dVar;
        this.e = j;
        this.f = timeUnit;
        this.g = scheduledThreadPoolExecutor;
    }

    @Override // com.vk.reefton.trackers.l
    public final l7i b(vof0 vof0Var) {
        return new m7i();
    }

    @Override // com.vk.reefton.trackers.l
    public final void c() {
        ScheduledFuture<?> scheduledFuture = this.h;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        this.h = null;
    }

    @Override // com.vk.reefton.trackers.l
    public final void f(xmf0 xmf0Var) {
        if ((!this.b.c() || this.c.a()) && this.h == null) {
            yh9 yh9Var = new yh9(this, 6);
            long j = this.e;
            this.h = this.g.scheduleAtFixedRate(yh9Var, j, j, this.f);
        }
    }
}
