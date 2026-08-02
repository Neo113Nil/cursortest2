package iZ;

import De.C2862e;
import Sc.s;
import hZ.C6894a;
import jZ.C7320a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import mZ.C8117b;
import xe.B0;
import xe.C10721f;
import xe.C10727i;
import xe.I;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.cdn.chooser.internal.domain.popreachability.PoPReachabilityInteractorImpl$poll$2", f = "PoPReachabilityInteractor.kt", l = {74}, m = "invokeSuspend")
/* loaded from: classes7.dex */
final class d extends j implements Function2<M, kotlin.coroutines.d<? super B0>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f66195d;

    /* renamed from: e, reason: collision with root package name */
    private /* synthetic */ Object f66196e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C6894a.c f66197f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ C7036c f66198g;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.cdn.chooser.internal.domain.popreachability.PoPReachabilityInteractorImpl$poll$2$1", f = "PoPReachabilityInteractor.kt", l = {79}, m = "invokeSuspend")
    static final class a extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f66199d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C7036c f66200e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ArrayList f66201f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C7036c c7036c, ArrayList arrayList, kotlin.coroutines.d dVar) {
            super(2, dVar);
            this.f66200e = c7036c;
            this.f66201f = arrayList;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new a(this.f66200e, this.f66201f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            f fVar;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f66199d;
            if (i11 == 0) {
                s.b(obj);
                fVar = this.f66200e.f66192a;
                C7320a c7320a = new C7320a(this.f66201f);
                this.f66199d = 1;
                if (fVar.b(c7320a, this) == aVar) {
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

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.cdn.chooser.internal.domain.popreachability.PoPReachabilityInteractorImpl$poll$2$pollEvents$1$1$1", f = "PoPReachabilityInteractor.kt", l = {71}, m = "invokeSuspend")
    static final class b extends j implements Function2<M, kotlin.coroutines.d<? super C7320a.C1133a>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f66202d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C7036c f66203e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C6894a.c.b f66204f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ C6894a.c.b.C1061a f66205g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C7036c c7036c, C6894a.c.b bVar, C6894a.c.b.C1061a c1061a, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f66203e = c7036c;
            this.f66204f = bVar;
            this.f66205g = c1061a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new b(this.f66203e, this.f66204f, this.f66205g, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super C7320a.C1133a> dVar) {
            return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            f fVar;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f66202d;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                return obj;
            }
            s.b(obj);
            fVar = this.f66203e.f66192a;
            String b11 = this.f66204f.b();
            this.f66202d = 1;
            Object a11 = fVar.a(b11, this.f66205g, this);
            return a11 == aVar ? aVar : a11;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(C6894a.c cVar, C7036c c7036c, kotlin.coroutines.d<? super d> dVar) {
        super(2, dVar);
        this.f66197f = cVar;
        this.f66198g = c7036c;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        d dVar2 = new d(this.f66197f, this.f66198g, dVar);
        dVar2.f66196e = obj;
        return dVar2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super B0> dVar) {
        return ((d) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        I i11;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i12 = this.f66195d;
        C7036c c7036c = this.f66198g;
        if (i12 == 0) {
            s.b(obj);
            M m11 = (M) this.f66196e;
            List<C6894a.c.b> b11 = this.f66197f.b();
            ArrayList arrayList = new ArrayList();
            for (C6894a.c.b bVar : b11) {
                List<C6894a.c.b.C1061a> a11 = bVar.a();
                ArrayList arrayList2 = new ArrayList(C7714v.z(a11, 10));
                Iterator<T> it = a11.iterator();
                while (it.hasNext()) {
                    arrayList2.add(C10727i.a(m11, null, null, new b(c7036c, bVar, (C6894a.c.b.C1061a) it.next(), null), 3));
                }
                C7714v.p(arrayList2, arrayList);
            }
            this.f66195d = 1;
            obj = C10721f.a(arrayList, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        ArrayList I11 = C7714v.I((Iterable) obj);
        C2862e a12 = C8117b.a();
        i11 = c7036c.f66193b;
        return C10727i.c(a12, i11, null, new a(c7036c, I11, null), 2);
    }
}
