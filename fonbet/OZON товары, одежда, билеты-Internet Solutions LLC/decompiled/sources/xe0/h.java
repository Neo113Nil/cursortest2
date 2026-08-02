package xe0;

import Ae.C2399j;
import Ae.C2408n0;
import Ae.x0;
import Sc.s;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import we0.C10544C;
import xe.B0;
import xe.C10749t0;
import xe.H0;

/* loaded from: classes3.dex */
public final class h implements InterfaceC10768g {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final WeakReference<j> f105530a;

    /* renamed from: b, reason: collision with root package name */
    private B0 f105531b;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.mapsdk.common.placemarkscontroller.PlacemarkSelectionControllerImpl$1", f = "PlacemarkSelectionControllerImpl.kt", l = {}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<C10544C, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f105532d;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            a aVar = h.this.new a(dVar);
            aVar.f105532d = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(C10544C c10544c, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(c10544c, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            s.b(obj);
            if (((C10544C) this.f105532d) == null) {
                return Unit.f71690a;
            }
            h hVar = h.this;
            hVar.getClass();
            hVar.getClass();
            return Unit.f71690a;
        }
    }

    public h(@NotNull WeakReference<j> singleSelectPinSynchronizer) {
        x0<C10544C> e11;
        Intrinsics.checkNotNullParameter(singleSelectPinSynchronizer, "singleSelectPinSynchronizer");
        this.f105530a = singleSelectPinSynchronizer;
        j jVar = singleSelectPinSynchronizer.get();
        B0 b02 = null;
        if (jVar != null && (e11 = jVar.e()) != null) {
            b02 = C2399j.C(new C2408n0(e11, new a(null)), C10749t0.f105499a);
        }
        this.f105531b = b02;
    }

    public final void a() {
        B0 b02 = this.f105531b;
        if (b02 != null) {
            ((H0) b02).j(null);
        }
        j jVar = this.f105530a.get();
        if (jVar != null) {
            jVar.b();
        }
    }
}
