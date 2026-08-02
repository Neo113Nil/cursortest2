package gd0;

import Jb0.s;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5412d0;
import androidx.lifecycle.J;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import xe.C10727i;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.restoreAccess.CantLoginInAccountActionsFragment$observeViewModel$lambda$4$$inlined$repeatOnStarted$1", f = "CantLoginInAccountActionsFragment.kt", l = {69}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class b extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f64256d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ J f64257e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ h f64258f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ e f64259g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ s f64260h;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.restoreAccess.CantLoginInAccountActionsFragment$observeViewModel$lambda$4$$inlined$repeatOnStarted$1$1", f = "CantLoginInAccountActionsFragment.kt", l = {}, m = "invokeSuspend")
    public static final class a extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f64261d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ h f64262e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ e f64263f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ s f64264g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(kotlin.coroutines.d dVar, h hVar, e eVar, s sVar) {
            super(2, dVar);
            this.f64262e = hVar;
            this.f64263f = eVar;
            this.f64264g = sVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            a aVar = new a(dVar, this.f64262e, this.f64263f, this.f64264g);
            aVar.f64261d = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            Sc.s.b(obj);
            C10727i.c((M) this.f64261d, null, null, new c(this.f64262e.j0(), null, this.f64263f, this.f64264g), 3);
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(J j11, kotlin.coroutines.d dVar, h hVar, e eVar, s sVar) {
        super(2, dVar);
        this.f64257e = j11;
        this.f64258f = hVar;
        this.f64259g = eVar;
        this.f64260h = sVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new b(this.f64257e, dVar, this.f64258f, this.f64259g, this.f64260h);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f64256d;
        if (i11 == 0) {
            Sc.s.b(obj);
            AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
            a aVar2 = new a(null, this.f64258f, this.f64259g, this.f64260h);
            this.f64256d = 1;
            if (C5412d0.b(this.f64257e, bVar, aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Sc.s.b(obj);
        }
        return Unit.f71690a;
    }
}
