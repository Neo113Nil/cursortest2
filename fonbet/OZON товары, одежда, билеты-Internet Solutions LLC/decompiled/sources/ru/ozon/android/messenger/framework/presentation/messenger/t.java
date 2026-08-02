package ru.ozon.android.messenger.framework.presentation.messenger;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ru.ozon.android.messenger.framework.data.repository.n0;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.messenger.MessengerViewModel$stopConnection$1", f = "MessengerViewModel.kt", l = {147, 148}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class t extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f91402d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ l f91403e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    t(l lVar, kotlin.coroutines.d<? super t> dVar) {
        super(2, dVar);
        this.f91403e = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new t(this.f91403e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((t) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0038, code lost:
    
        if (r6.v(r5) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002b, code lost:
    
        if (r6.e(r5) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        n0 n0Var;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f91402d;
        l lVar = this.f91403e;
        if (i11 == 0) {
            Sc.s.b(obj);
            n0Var = lVar.f91370d;
            this.f91402d = 1;
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
                return Unit.f71690a;
            }
            Sc.s.b(obj);
        }
        ru.ozon.android.messenger.framework.domain.repository.b bVar = lVar.f91368b;
        this.f91402d = 2;
    }
}
