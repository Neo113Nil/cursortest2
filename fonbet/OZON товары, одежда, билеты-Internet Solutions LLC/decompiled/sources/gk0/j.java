package gk0;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import xe.C10727i;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.uikit.pool.precreation.ClientViewPoolImpl$fill$2", f = "ClientViewPool.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes7.dex */
final class j extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    private /* synthetic */ Object f64533d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ List<n> f64534e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ e f64535f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ String f64536g;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.uikit.pool.precreation.ClientViewPoolImpl$fill$2$1$1$1", f = "ClientViewPool.kt", l = {129}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f64537d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ e f64538e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ n f64539f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f64540g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(e eVar, n nVar, String str, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f64538e = eVar;
            this.f64539f = nVar;
            this.f64540g = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new a(this.f64538e, this.f64539f, this.f64540g, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f64537d;
            if (i11 == 0) {
                Sc.s.b(obj);
                this.f64537d = 1;
                if (e.b(this.f64538e, this.f64539f, this.f64540g, this) == aVar) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    j(List<? extends n> list, e eVar, String str, kotlin.coroutines.d<? super j> dVar) {
        super(2, dVar);
        this.f64534e = list;
        this.f64535f = eVar;
        this.f64536g = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        j jVar = new j(this.f64534e, this.f64535f, this.f64536g, dVar);
        jVar.f64533d = obj;
        return jVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((j) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        Sc.s.b(obj);
        M m11 = (M) this.f64533d;
        List<n> list = this.f64534e;
        Iterator<T> it = list.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        int a11 = ((n) it.next()).a();
        while (it.hasNext()) {
            int a12 = ((n) it.next()).a();
            if (a11 < a12) {
                a11 = a12;
            }
        }
        for (int i11 = 0; i11 < a11; i11++) {
            for (n nVar : list) {
                if (nVar.a() > i11) {
                    C10727i.c(m11, null, null, new a(this.f64535f, nVar, this.f64536g, null), 3);
                }
            }
        }
        return Unit.f71690a;
    }
}
