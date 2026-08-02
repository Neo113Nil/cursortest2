package ru.ozon.android.messenger.framework.presentation.messenger;

import Ae.M0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ru.ozon.android.messenger.framework.data.remote.websocket.AbstractC9330a;
import ru.ozon.android.messenger.framework.domain.usecases.C9407y;
import ru.ozon.android.messenger.utils.i;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.messenger.MessengerViewModel$initializeChatOnSocketConnection$1", f = "MessengerViewModel.kt", l = {161, 162}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class p extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f91391d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ l f91392e;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.messenger.MessengerViewModel$initializeChatOnSocketConnection$1$1", f = "MessengerViewModel.kt", l = {}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<AbstractC9330a, kotlin.coroutines.d<? super Boolean>, Object> {

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f91393d;

        a() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            a aVar = new a(2, dVar);
            aVar.f91393d = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AbstractC9330a abstractC9330a, kotlin.coroutines.d<? super Boolean> dVar) {
            return ((a) create(abstractC9330a, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            Sc.s.b(obj);
            return Boolean.valueOf(((AbstractC9330a) this.f91393d) instanceof AbstractC9330a.C1590a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    p(l lVar, kotlin.coroutines.d<? super p> dVar) {
        super(2, dVar);
        this.f91392e = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new p(this.f91392e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((p) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0042, code lost:
    
        if (r7 == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0044, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0035, code lost:
    
        if (Ae.C2399j.v(r7, r1, r6) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        C9407y c9407y;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f91391d;
        l lVar = this.f91392e;
        if (i11 == 0) {
            Sc.s.b(obj);
            M0<AbstractC9330a> l11 = lVar.f91368b.l();
            a aVar2 = new a(2, null);
            this.f91391d = 1;
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
                ru.ozon.android.messenger.utils.i iVar = (ru.ozon.android.messenger.utils.i) obj;
                if (iVar instanceof i.a) {
                    Lm0.a.f17149a.w("InitializeChat Failed " + ((i.a) iVar), new Object[0]);
                }
                return Unit.f71690a;
            }
            Sc.s.b(obj);
        }
        c9407y = lVar.f91367a;
        this.f91391d = 2;
        obj = c9407y.a(this);
    }
}
