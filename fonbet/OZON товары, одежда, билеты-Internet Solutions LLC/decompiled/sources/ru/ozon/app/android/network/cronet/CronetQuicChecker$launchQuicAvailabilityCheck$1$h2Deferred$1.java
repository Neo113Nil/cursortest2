package ru.ozon.app.android.network.cronet;

import Ib.a;
import Sc.r;
import Sc.s;
import We.E;
import We.G;
import We.L;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import xe.M;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lxe/M;", "LSc/r;", "LWe/L;", "<anonymous>", "(Lxe/M;)LSc/r;"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.network.cronet.CronetQuicChecker$launchQuicAvailabilityCheck$1$h2Deferred$1", f = "CronetQuicChecker.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class CronetQuicChecker$launchQuicAvailabilityCheck$1$h2Deferred$1 extends j implements Function2<M, d<? super r<? extends L>>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CronetQuicChecker this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CronetQuicChecker$launchQuicAvailabilityCheck$1$h2Deferred$1(CronetQuicChecker cronetQuicChecker, d<? super CronetQuicChecker$launchQuicAvailabilityCheck$1$h2Deferred$1> dVar) {
        super(2, dVar);
        this.this$0 = cronetQuicChecker;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        CronetQuicChecker$launchQuicAvailabilityCheck$1$h2Deferred$1 cronetQuicChecker$launchQuicAvailabilityCheck$1$h2Deferred$1 = new CronetQuicChecker$launchQuicAvailabilityCheck$1$h2Deferred$1(this.this$0, dVar);
        cronetQuicChecker$launchQuicAvailabilityCheck$1$h2Deferred$1.L$0 = obj;
        return cronetQuicChecker$launchQuicAvailabilityCheck$1$h2Deferred$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(M m11, d<? super r<? extends L>> dVar) {
        return invoke2(m11, (d<? super r<L>>) dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object a11;
        a aVar;
        G h2HeadRequest;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        CronetQuicChecker cronetQuicChecker = this.this$0;
        try {
            r.Companion companion = r.INSTANCE;
            aVar = cronetQuicChecker.simpleOkHttpClient;
            E e11 = (E) aVar.get();
            h2HeadRequest = cronetQuicChecker.getH2HeadRequest();
            a11 = e11.a(h2HeadRequest).execute();
        } catch (Throwable th2) {
            r.Companion companion2 = r.INSTANCE;
            a11 = s.a(th2);
        }
        return r.a(a11);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(M m11, d<? super r<L>> dVar) {
        return ((CronetQuicChecker$launchQuicAvailabilityCheck$1$h2Deferred$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
