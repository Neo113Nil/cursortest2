package ru.ozon.android.messenger.framework.data.repository;

import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ru.ozon.android.messenger.framework.core.initialization.d;
import ru.ozon.android.messenger.framework.presentation.models.A;
import xe.C10727i;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.data.repository.UpdateGlobalCounterRepository$start$2$1", f = "UpdateGlobalCounterRepository.kt", l = {47}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class k0 extends kotlin.coroutines.jvm.internal.j implements Function2<A.h, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f88565d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ n0 f88566e;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.data.repository.UpdateGlobalCounterRepository$start$2$1$1", f = "UpdateGlobalCounterRepository.kt", l = {}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ n0 f88567d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(n0 n0Var, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f88567d = n0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new a(this.f88567d, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            WeakReference weakReference;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            Sc.s.b(obj);
            weakReference = this.f88567d.f88592d;
            d.g gVar = (d.g) weakReference.get();
            if (gVar != null) {
                gVar.onChanged();
            }
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    k0(n0 n0Var, kotlin.coroutines.d<? super k0> dVar) {
        super(2, dVar);
        this.f88566e = n0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new k0(this.f88566e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(A.h hVar, kotlin.coroutines.d<? super Unit> dVar) {
        return ((k0) create(hVar, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        xe.I i11;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i12 = this.f88565d;
        if (i12 == 0) {
            Sc.s.b(obj);
            n0 n0Var = this.f88566e;
            i11 = n0Var.f88591c;
            a aVar2 = new a(n0Var, null);
            this.f88565d = 1;
            if (C10727i.f(i11, aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Sc.s.b(obj);
        }
        return Unit.f71690a;
    }
}
