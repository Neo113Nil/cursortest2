package Ij;

import Dj.s;
import Ej.j;
import Fj.r;
import Ph.AbstractC1455i;
import Ph.P;
import Wj.j;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Wj.c f5845a;

    /* renamed from: b, reason: collision with root package name */
    public final c f5846b;

    /* renamed from: c, reason: collision with root package name */
    public final e f5847c;

    /* renamed from: d, reason: collision with root package name */
    public final j f5848d;

    /* renamed from: e, reason: collision with root package name */
    public final r f5849e;

    /* renamed from: Ij.a$a, reason: collision with other inner class name */
    public static final class C0125a extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f5850n;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ Dj.c f5852p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0125a(Dj.c cVar, Continuation continuation) {
            super(2, continuation);
            this.f5852p = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return a.this.new C0125a(this.f5852p, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((C0125a) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f5850n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                Wj.c cVar = a.this.f5845a;
                String a10 = this.f5852p.a();
                this.f5850n = 1;
                obj = cVar.a(a10, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            Wj.j jVar = (Wj.j) obj;
            if (Intrinsics.areEqual(jVar, j.a.C0275a.f13343a)) {
                return s.a.C0061a.f2900a;
            }
            if (Intrinsics.areEqual(jVar, j.a.b.f13344a)) {
                return s.a.b.f2901a;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    public a(Wj.c accessTokenProvider, c optionsFactory, e callFactory, Ej.j coroutinesDispatchers, r listener) {
        Intrinsics.checkNotNullParameter(accessTokenProvider, "accessTokenProvider");
        Intrinsics.checkNotNullParameter(optionsFactory, "optionsFactory");
        Intrinsics.checkNotNullParameter(callFactory, "callFactory");
        Intrinsics.checkNotNullParameter(coroutinesDispatchers, "coroutinesDispatchers");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f5845a = accessTokenProvider;
        this.f5846b = optionsFactory;
        this.f5847c = callFactory;
        this.f5848d = coroutinesDispatchers;
        this.f5849e = listener;
    }

    public final Object b(Dj.c cVar, Continuation continuation) {
        return AbstractC1455i.g(this.f5848d.b(), new C0125a(cVar, null), continuation);
    }
}
