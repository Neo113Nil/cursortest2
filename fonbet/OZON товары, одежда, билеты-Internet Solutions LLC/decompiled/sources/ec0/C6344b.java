package ec0;

import Ae.C2406m0;
import Jb0.n;
import Sc.s;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5412d0;
import androidx.lifecycle.J;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import xe.C10727i;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.accountMerge.presentation.OzonIdAccountMergeFragment$observeViewModel$lambda$5$$inlined$repeatOnStarted$1", f = "OzonIdAccountMergeFragment.kt", l = {69}, m = "invokeSuspend")
/* renamed from: ec0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6344b extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f62110d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ J f62111e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ j f62112f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ h f62113g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ n f62114h;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.accountMerge.presentation.OzonIdAccountMergeFragment$observeViewModel$lambda$5$$inlined$repeatOnStarted$1$1", f = "OzonIdAccountMergeFragment.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ec0.b$a */
    public static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f62115d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ j f62116e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ h f62117f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ n f62118g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(kotlin.coroutines.d dVar, j jVar, h hVar, n nVar) {
            super(2, dVar);
            this.f62116e = jVar;
            this.f62117f = hVar;
            this.f62118g = nVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            a aVar = new a(dVar, this.f62116e, this.f62117f, this.f62118g);
            aVar.f62115d = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            s.b(obj);
            M m11 = (M) this.f62115d;
            j jVar = this.f62116e;
            C2406m0 a12 = jVar.a1();
            n nVar = this.f62118g;
            h hVar = this.f62117f;
            C10727i.c(m11, null, null, new c(a12, null, hVar, nVar), 3);
            C10727i.c(m11, null, null, new d(jVar.C0(), null, hVar), 3);
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6344b(J j11, kotlin.coroutines.d dVar, j jVar, h hVar, n nVar) {
        super(2, dVar);
        this.f62111e = j11;
        this.f62112f = jVar;
        this.f62113g = hVar;
        this.f62114h = nVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new C6344b(this.f62111e, dVar, this.f62112f, this.f62113g, this.f62114h);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C6344b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f62110d;
        if (i11 == 0) {
            s.b(obj);
            AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
            a aVar2 = new a(null, this.f62112f, this.f62113g, this.f62114h);
            this.f62110d = 1;
            if (C5412d0.b(this.f62111e, bVar, aVar2, this) == aVar) {
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
