package androidx.lifecycle;

import Ph.AbstractC1455i;
import Ph.C0;
import Ph.C1452g0;
import androidx.lifecycle.AbstractC2185j;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public abstract class F {

    public static final class a extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f20251n;

        /* renamed from: o, reason: collision with root package name */
        public /* synthetic */ Object f20252o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ AbstractC2185j f20253p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ AbstractC2185j.b f20254q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ Function2 f20255r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC2185j abstractC2185j, AbstractC2185j.b bVar, Function2 function2, Continuation continuation) {
            super(2, continuation);
            this.f20253p = abstractC2185j;
            this.f20254q = bVar;
            this.f20255r = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            a aVar = new a(this.f20253p, this.f20254q, this.f20255r, continuation);
            aVar.f20252o = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Ph.P p10, Continuation continuation) {
            return ((a) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            C2187l c2187l;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f20251n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                C0 c02 = (C0) ((Ph.P) this.f20252o).getCoroutineContext().get(C0.f9001U2);
                if (c02 == null) {
                    throw new IllegalStateException("when[State] methods should have a parent job");
                }
                E e10 = new E();
                C2187l c2187l2 = new C2187l(this.f20253p, this.f20254q, e10.f20250b, c02);
                try {
                    Function2 function2 = this.f20255r;
                    this.f20252o = c2187l2;
                    this.f20251n = 1;
                    obj = AbstractC1455i.g(e10, function2, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    c2187l = c2187l2;
                } catch (Throwable th2) {
                    th = th2;
                    c2187l = c2187l2;
                    c2187l.b();
                    throw th;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c2187l = (C2187l) this.f20252o;
                try {
                    ResultKt.throwOnFailure(obj);
                } catch (Throwable th3) {
                    th = th3;
                    c2187l.b();
                    throw th;
                }
            }
            c2187l.b();
            return obj;
        }
    }

    public static final Object a(AbstractC2185j abstractC2185j, Function2 function2, Continuation continuation) {
        return d(abstractC2185j, AbstractC2185j.b.f20392c, function2, continuation);
    }

    public static final Object b(AbstractC2185j abstractC2185j, Function2 function2, Continuation continuation) {
        return d(abstractC2185j, AbstractC2185j.b.f20394e, function2, continuation);
    }

    public static final Object c(AbstractC2185j abstractC2185j, Function2 function2, Continuation continuation) {
        return d(abstractC2185j, AbstractC2185j.b.f20393d, function2, continuation);
    }

    public static final Object d(AbstractC2185j abstractC2185j, AbstractC2185j.b bVar, Function2 function2, Continuation continuation) {
        return AbstractC1455i.g(C1452g0.c().e2(), new a(abstractC2185j, bVar, function2, null), continuation);
    }
}
