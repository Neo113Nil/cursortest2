package tb0;

import De.C2862e;
import Hb0.f;
import Sc.InterfaceC4008j;
import Sc.s;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.B0;
import xe.C10727i;
import xe.H0;
import xe.M;
import xe.N;
import xe.Y;

/* renamed from: tb0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9793a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<Hb0.c> f99325a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C2862e f99326b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private AtomicInteger f99327c;

    /* renamed from: d, reason: collision with root package name */
    private volatile B0 f99328d;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.antibot.challenge.js.AntibotJSChallengeCounter$startResetCounterTimer$1", f = "AntibotJSChallengeCounter.kt", l = {54}, m = "invokeSuspend")
    /* renamed from: tb0.a$a, reason: collision with other inner class name */
    static final class C2185a extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f99329d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f99330e;

        C2185a(kotlin.coroutines.d<? super C2185a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            C2185a c2185a = C9793a.this.new C2185a(dVar);
            c2185a.f99330e = obj;
            return c2185a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((C2185a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            M m11;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f99329d;
            if (i11 == 0) {
                s.b(obj);
                M m12 = (M) this.f99330e;
                this.f99330e = m12;
                this.f99329d = 1;
                if (Y.b(30000L, this) == aVar) {
                    return aVar;
                }
                m11 = m12;
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                m11 = (M) this.f99330e;
                s.b(obj);
            }
            if (N.f(m11)) {
                C9793a.this.f99327c.set(0);
            }
            return Unit.f71690a;
        }
    }

    public C9793a() {
        throw null;
    }

    public C9793a(InterfaceC4008j featureFlagsStore) {
        C2862e coroutineScope = td0.f.a();
        Intrinsics.checkNotNullParameter(featureFlagsStore, "featureFlagsStore");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f99325a = featureFlagsStore;
        this.f99326b = coroutineScope;
        this.f99327c = new AtomicInteger(0);
    }

    public final boolean b() {
        if (!((Boolean) this.f99325a.getValue().b(f.d.f10798a)).booleanValue()) {
            return false;
        }
        B0 b02 = this.f99328d;
        if (b02 != null) {
            ((H0) b02).j(null);
        }
        this.f99328d = null;
        boolean z11 = this.f99327c.incrementAndGet() > 3;
        if (z11) {
            this.f99327c.set(0);
        }
        return z11;
    }

    public final void c() {
        if (((Boolean) this.f99325a.getValue().b(f.d.f10798a)).booleanValue()) {
            this.f99328d = C10727i.c(this.f99326b, null, null, new C2185a(null), 3);
        }
    }
}
