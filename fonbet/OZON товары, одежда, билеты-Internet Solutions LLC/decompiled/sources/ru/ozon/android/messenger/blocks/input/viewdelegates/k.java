package ru.ozon.android.messenger.blocks.input.viewdelegates;

import Ae.InterfaceC2397i;
import Ae.x0;
import Sc.C4005g;
import Sc.s;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ru.ozon.android.messenger.blocks.input.viewmodel.o;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.blocks.input.viewdelegates.InputCustomBlockViewDelegate$onBind$1", f = "InputCustomBlockViewDelegate.kt", l = {50}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class k extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f85590d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ l f85591e;

    static final class a<T> implements InterfaceC2397i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ l f85592a;

        a(l lVar) {
            this.f85592a = lVar;
        }

        @Override // Ae.InterfaceC2397i
        public final Object emit(Object obj, kotlin.coroutines.d dVar) {
            l.b(this.f85592a, (o) obj);
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    k(l lVar, kotlin.coroutines.d<? super k> dVar) {
        super(2, dVar);
        this.f85591e = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new k(this.f85591e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((k) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ru.ozon.android.messenger.blocks.input.viewmodel.h hVar;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f85590d;
        if (i11 == 0) {
            s.b(obj);
            l lVar = this.f85591e;
            hVar = lVar.f85593a;
            x0 f91308a = hVar.getF91308a();
            a aVar2 = new a(lVar);
            this.f85590d = 1;
            if (f91308a.collect(aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        throw new C4005g();
    }
}
