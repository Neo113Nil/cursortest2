package com.ironsource;

import android.graphics.Rect;
import com.ironsource.AbstractC2412f3;
import com.ironsource.Ef;
import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;

/* loaded from: classes3.dex */
public final class Fa implements La {
    private final Ba a;
    private final L2 b;
    private final Long c;
    private Ef.a d;
    private final long e;

    static final class a extends Lambda implements Function0<Unit> {
        final /* synthetic */ AbstractC2412f3.c b;
        final /* synthetic */ long c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(AbstractC2412f3.c cVar, long j) {
            super(0);
            this.b = cVar;
            this.c = j;
        }

        public final void a() {
            Fa.this.a.a(Fa.this.b, this.b, Long.valueOf(this.c));
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    public Fa(Ba strategy, L2 currentAdUnit, Long l) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        Intrinsics.checkNotNullParameter(currentAdUnit, "currentAdUnit");
        this.a = strategy;
        this.b = currentAdUnit;
        this.c = l;
        this.e = strategy.p().a();
        strategy.r();
        e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(final Fa this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        C2688ub.a(this$0.a.a(), new Runnable() { // from class: com.ironsource.Fa$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                Fa.d(Fa.this);
            }
        }, 0L, 2, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(Fa this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!Cg.a(this$0.a.k(), new Rect())) {
            this$0.e();
            return;
        }
        long a2 = this$0.a.p().a();
        long j = a2 - this$0.e;
        Long l = this$0.c;
        C2688ub.a((C2688ub) this$0.a.a(), AbstractRunnableC2512ke.a.a(this$0.new a(new AbstractC2412f3.c(l != null ? a2 - l.longValue() : 0L, new AbstractC2412f3.d.f(j)), a2)), 0L, 2, (Object) null);
    }

    private final void e() {
        long q = this.a.q();
        Ef o = this.a.o();
        Runnable runnable = new Runnable() { // from class: com.ironsource.Fa$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                Fa.c(Fa.this);
            }
        };
        Duration.Companion companion = Duration.INSTANCE;
        this.d = o.a(runnable, DurationKt.toDuration(q, DurationUnit.MILLISECONDS));
    }

    @Override // com.ironsource.La
    public void f() {
    }

    @Override // com.ironsource.M0
    public void a(C2677u0 adUnitCallback) {
        Intrinsics.checkNotNullParameter(adUnitCallback, "adUnitCallback");
        this.a.a("Received load success while paused not visible");
    }

    @Override // com.ironsource.La
    public void b() {
        this.a.a("Loading a loaded ad");
    }

    @Override // com.ironsource.La
    public void c() {
        Ef.a aVar = this.d;
        if (aVar != null) {
            aVar.a();
        }
        this.b.a(true);
        Ba ba = this.a;
        ba.a((La) new Ea(ba));
    }

    @Override // com.ironsource.M0
    public void a(IronSourceError ironSourceError) {
        this.a.a("Received load success while paused not visible");
    }

    @Override // com.ironsource.La
    public void d() {
        Ef.a aVar = this.d;
        if (aVar != null) {
            aVar.a();
        }
        Ba ba = this.a;
        ba.a((La) new Ha(ba, this.b));
    }
}
