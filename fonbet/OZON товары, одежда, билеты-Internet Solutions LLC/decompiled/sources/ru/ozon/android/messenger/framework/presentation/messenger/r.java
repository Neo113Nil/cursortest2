package ru.ozon.android.messenger.framework.presentation.messenger;

import Ae.InterfaceC2397i;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import ru.ozon.android.messenger.framework.presentation.models.A;
import ru.ozon.android.messenger.framework.presentation.models.x;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.messenger.MessengerViewModel$observeNotifyEvents$1", f = "MessengerViewModel.kt", l = {240, 240}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class r extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f91397d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ l f91398e;

    static final class a<T> implements InterfaceC2397i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ l f91399a;

        a(l lVar) {
            this.f91399a = lVar;
        }

        @Override // Ae.InterfaceC2397i
        public final Object emit(Object obj, kotlin.coroutines.d dVar) {
            ru.ozon.android.messenger.framework.navigation.controller.b bVar;
            A a11 = (A) obj;
            if (a11 instanceof A.b) {
                ru.ozon.android.messenger.framework.presentation.models.u uVar = (ru.ozon.android.messenger.framework.presentation.models.u) C7714v.M(((A.b) a11).a().b());
                ru.ozon.android.messenger.framework.presentation.models.g c11 = uVar != null ? uVar.c() : null;
                if (c11 instanceof ru.ozon.android.messenger.blocks.curtain.c) {
                    bVar = this.f91399a.f91373g;
                    bVar.e((ru.ozon.android.messenger.blocks.curtain.c) c11);
                }
            }
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    r(l lVar, kotlin.coroutines.d<? super r> dVar) {
        super(2, dVar);
        this.f91398e = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new r(this.f91398e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((r) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003f, code lost:
    
        if (((Ae.InterfaceC2395h) r6).collect(r1, r5) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:
    
        if (r6 == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ru.ozon.android.messenger.framework.domain.usecases.r rVar;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f91397d;
        l lVar = this.f91398e;
        if (i11 == 0) {
            Sc.s.b(obj);
            rVar = lVar.f91369c;
            this.f91397d = 1;
            obj = rVar.a(new x[0], null, this);
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
        a aVar2 = new a(lVar);
        this.f91397d = 2;
    }
}
