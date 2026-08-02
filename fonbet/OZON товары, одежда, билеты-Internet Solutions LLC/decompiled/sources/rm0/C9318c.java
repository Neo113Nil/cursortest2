package rm0;

import Ae.C2399j;
import Ae.InterfaceC2395h;
import E.r;
import Sc.s;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qm0.C9085a;
import ze.u;

/* renamed from: rm0.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C9318c implements InterfaceC9317b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final zm0.a f83728a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ArrayList f83729b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Object f83730c;

    /* renamed from: d, reason: collision with root package name */
    private a.b f83731d;

    @e(c = "ru.sber.platform.clickstream.clickstreamlite.internal.data.EventsStorageImpl$subscribeToEvents$1", f = "EventsStorageImpl.kt", l = {50}, m = "invokeSuspend")
    /* renamed from: rm0.c$a */
    static final class a extends j implements Function2<u<? super List<? extends wm0.a>>, d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f83732d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f83733e;

        /* renamed from: rm0.c$a$a, reason: collision with other inner class name */
        static final class C1432a extends AbstractC7737t implements Function0<Unit> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C9318c f83735b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1432a(C9318c c9318c) {
                super(0);
                this.f83735b = c9318c;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Unit invoke() {
                C9318c.b(this.f83735b, null);
                return Unit.f71690a;
            }
        }

        /* renamed from: rm0.c$a$b */
        public static final class b {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ u<List<wm0.a>> f83736a;

            /* JADX WARN: Multi-variable type inference failed */
            b(u<? super List<wm0.a>> uVar) {
                this.f83736a = uVar;
            }
        }

        a(d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final d<Unit> create(Object obj, @NotNull d<?> dVar) {
            a aVar = C9318c.this.new a(dVar);
            aVar.f83733e = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(u<? super List<? extends wm0.a>> uVar, d<? super Unit> dVar) {
            return ((a) create(uVar, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f83732d;
            if (i11 == 0) {
                s.b(obj);
                u uVar = (u) this.f83733e;
                b bVar = new b(uVar);
                C9318c c9318c = C9318c.this;
                C9318c.b(c9318c, bVar);
                C1432a c1432a = new C1432a(c9318c);
                this.f83732d = 1;
                if (ze.s.a(uVar, c1432a, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            return Unit.f71690a;
        }
    }

    public C9318c(@NotNull C9085a settings, @NotNull zm0.a timer) {
        Intrinsics.checkNotNullParameter(settings, "settings");
        Intrinsics.checkNotNullParameter(timer, "timer");
        this.f83728a = timer;
        this.f83729b = new ArrayList();
        this.f83730c = new Object();
        timer.a(10000L, new r(this, 5));
    }

    public static void a(C9318c this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.c();
    }

    public static final void b(C9318c c9318c, a.b bVar) {
        c9318c.f83731d = bVar;
    }

    private final void c() {
        a.b bVar;
        synchronized (this.f83730c) {
            try {
                if (!this.f83729b.isEmpty() && (bVar = this.f83731d) != null) {
                    ArrayList arrayList = this.f83729b;
                    List<wm0.a> events = C7714v.U0(arrayList);
                    arrayList.clear();
                    Intrinsics.checkNotNullParameter(events, "events");
                    bVar.f83736a.b(events);
                }
                this.f83728a.a(10000L, new r(this, 5));
                Unit unit = Unit.f71690a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void d(@NotNull wm0.a event) {
        Intrinsics.checkNotNullParameter(event, "event");
        synchronized (this.f83730c) {
            try {
                this.f83729b.add(event);
                if (event.a()) {
                    c();
                } else if (this.f83729b.size() >= 10) {
                    c();
                }
                Unit unit = Unit.f71690a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @NotNull
    public final InterfaceC2395h<List<wm0.a>> e() {
        return C2399j.e(new a(null));
    }
}
