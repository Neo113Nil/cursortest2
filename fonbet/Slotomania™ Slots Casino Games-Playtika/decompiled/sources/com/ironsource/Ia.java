package com.ironsource;

import com.ironsource.AbstractC2412f3;
import com.ironsource.Ef;
import com.ironsource.InterfaceC2563nb;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;

/* loaded from: classes4.dex */
public final class Ia implements La {
    private final Ba a;
    private final L2 b;
    private final L2 c;
    private final long d;
    private final boolean e;
    private InterfaceC2563nb<LevelPlayAdInfo> f;
    private Ef.a g;

    static final class a extends Lambda implements Function1<Ia, Unit> {
        public static final a a = new a();

        a() {
            super(1);
        }

        public final void a(Ia weak) {
            Intrinsics.checkNotNullParameter(weak, "$this$weak");
            weak.e();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Ia ia) {
            a(ia);
            return Unit.INSTANCE;
        }
    }

    public Ia(Ba strategy, L2 currentAdUnit, L2 reloadingAdUnit, long j, boolean z) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        Intrinsics.checkNotNullParameter(currentAdUnit, "currentAdUnit");
        Intrinsics.checkNotNullParameter(reloadingAdUnit, "reloadingAdUnit");
        this.a = strategy;
        this.b = currentAdUnit;
        this.c = reloadingAdUnit;
        this.d = j;
        this.e = z;
        g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e() {
        InterfaceC2563nb<LevelPlayAdInfo> interfaceC2563nb = this.f;
        if (interfaceC2563nb == null) {
            Ba ba = this.a;
            ba.a((La) new Ka(ba, this.b, this.c, this.d, this.e));
        } else if (interfaceC2563nb instanceof InterfaceC2563nb.b) {
            a((LevelPlayAdInfo) ((InterfaceC2563nb.b) interfaceC2563nb).b());
        } else if (interfaceC2563nb instanceof InterfaceC2563nb.a) {
            b(((InterfaceC2563nb.a) interfaceC2563nb).b());
        }
    }

    private final void g() {
        Ef o = this.a.o();
        Ef.b a2 = T6.a(this, a.a);
        Duration.Companion companion = Duration.INSTANCE;
        this.g = o.a(a2, DurationKt.toDuration(this.a.l(), DurationUnit.MILLISECONDS));
    }

    @Override // com.ironsource.La
    public void b() {
        this.a.a("Loading an ad while reloading");
    }

    @Override // com.ironsource.La
    public void c() {
        Ef.a aVar = this.g;
        if (aVar != null) {
            aVar.a();
        }
        this.b.a(true);
        this.c.a(true);
        Ba ba = this.a;
        ba.a((La) new Ea(ba));
    }

    @Override // com.ironsource.La
    public void d() {
        Ef.a aVar = this.g;
        if (aVar != null) {
            aVar.a();
        }
        Ba ba = this.a;
        ba.a((La) new Ha(ba, this.b));
    }

    @Override // com.ironsource.La
    public void f() {
        Ba ba = this.a;
        ba.a((La) new Ia(ba, this.b, this.c, ba.p().a(), false, 16, null));
    }

    private final void b(IronSourceError ironSourceError) {
        this.a.a(ironSourceError, this.b, (AbstractC2412f3) new AbstractC2412f3.c(this.a.p().a() - this.d, AbstractC2412f3.d.g.a), this.e, false, Long.valueOf(this.d));
    }

    @Override // com.ironsource.M0
    public void a(C2677u0 adUnitCallback) {
        Intrinsics.checkNotNullParameter(adUnitCallback, "adUnitCallback");
        LevelPlayAdInfo c = adUnitCallback.c();
        if (c != null) {
            a(new InterfaceC2563nb.b(c));
        } else {
            a(new InterfaceC2563nb.a(new IronSourceError(0, "Missing ad info")));
        }
    }

    @Override // com.ironsource.M0
    public void a(IronSourceError ironSourceError) {
        if (ironSourceError == null) {
            ironSourceError = new IronSourceError(0, "Unknown error");
        }
        a(new InterfaceC2563nb.a(ironSourceError));
    }

    private final void a(LevelPlayAdInfo levelPlayAdInfo) {
        long a2 = this.a.p().a() - this.d;
        this.a.a(new C2677u0(this.c, levelPlayAdInfo), this.c, this.b, (AbstractC2412f3) new AbstractC2412f3.c(a2, AbstractC2412f3.d.h.a), false, Long.valueOf(this.d));
    }

    public /* synthetic */ Ia(Ba ba, L2 l2, L2 l22, long j, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(ba, l2, l22, j, (i & 16) != 0 ? true : z);
    }

    private final void a(InterfaceC2563nb<LevelPlayAdInfo> interfaceC2563nb) {
        String b;
        if (this.f != null) {
            Ba ba = this.a;
            b = Ja.b(interfaceC2563nb);
            ba.a("Received excessive load " + b + " while reloading");
            return;
        }
        this.f = interfaceC2563nb;
    }
}
