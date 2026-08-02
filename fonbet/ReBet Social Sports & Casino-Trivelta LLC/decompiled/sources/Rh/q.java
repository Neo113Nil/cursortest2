package Rh;

import Ph.AbstractC1457j;
import Ph.P;
import Rh.n;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class q {

    public static final class a extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f10372n;

        /* renamed from: o, reason: collision with root package name */
        public /* synthetic */ Object f10373o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ B f10374p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ Object f10375q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(B b10, Object obj, Continuation continuation) {
            super(2, continuation);
            this.f10374p = b10;
            this.f10375q = obj;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            a aVar = new a(this.f10374p, this.f10375q, continuation);
            aVar.f10373o = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((a) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object m147constructorimpl;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f10372n;
            try {
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    B b10 = this.f10374p;
                    Object obj2 = this.f10375q;
                    Result.Companion companion = Result.INSTANCE;
                    this.f10372n = 1;
                    if (b10.o(obj2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                m147constructorimpl = Result.m147constructorimpl(Unit.INSTANCE);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th2));
            }
            return n.b(Result.m154isSuccessimpl(m147constructorimpl) ? n.f10366b.c(Unit.INSTANCE) : n.f10366b.a(Result.m150exceptionOrNullimpl(m147constructorimpl)));
        }
    }

    public static final Object a(B b10, Object obj) {
        Object b11;
        Object h10 = b10.h(obj);
        if (h10 instanceof n.c) {
            b11 = AbstractC1457j.b(null, new a(b10, obj, null), 1, null);
            return ((n) b11).k();
        }
        return n.f10366b.c(Unit.INSTANCE);
    }
}
