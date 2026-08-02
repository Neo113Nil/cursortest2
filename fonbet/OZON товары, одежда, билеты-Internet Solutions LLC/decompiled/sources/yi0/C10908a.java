package yi0;

import Ae.C2399j;
import Ae.C2406m0;
import Ae.C2408n0;
import De.C2862e;
import Sc.s;
import ei0.InterfaceC6369b;
import ij0.d;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vi0.AbstractC10323a;
import xe.C10720e0;
import xe.N;

/* renamed from: yi0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10908a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final d f106756a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC6369b f106757b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C2862e f106758c;

    @e(c = "ru.ozon.tracker.debug.menu.domain.tracker.manager.TrackerTestModeManager$startObservingMode$1", f = "TrackerTestModeManager.kt", l = {}, m = "invokeSuspend")
    /* renamed from: yi0.a$a, reason: collision with other inner class name */
    static final class C2310a extends j implements Function2<Boolean, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ boolean f106759d;

        C2310a(kotlin.coroutines.d<? super C2310a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            C2310a c2310a = C10908a.this.new C2310a(dVar);
            c2310a.f106759d = ((Boolean) obj).booleanValue();
            return c2310a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Boolean bool, kotlin.coroutines.d<? super Unit> dVar) {
            Boolean bool2 = bool;
            bool2.booleanValue();
            return ((C2310a) create(bool2, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            s.b(obj);
            C10908a.this.f106757b.b(this.f106759d);
            return Unit.f71690a;
        }
    }

    public C10908a(@NotNull d loadConfigurationValue, @NotNull InterfaceC6369b tracker) {
        Intrinsics.checkNotNullParameter(loadConfigurationValue, "loadConfigurationValue");
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        this.f106756a = loadConfigurationValue;
        this.f106757b = tracker;
        C10720e0 c10720e0 = C10720e0.f105451a;
        this.f106758c = N.a(He.b.f10879b);
    }

    public final void b() {
        C2399j.C(new C2408n0(new C2406m0(this.f106756a.a(AbstractC10323a.j.f102992c)), new C2310a(null)), this.f106758c);
    }
}
