package io.ktor.utils.io;

import Ph.AbstractC1459k;
import Ph.C0;
import Ph.C1452g0;
import Ph.L;
import Ph.P;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public abstract class n {

    public static final class a extends Lambda implements Function1 {

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ c f49527d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(c cVar) {
            super(1);
            this.f49527d = cVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(Throwable th2) {
            this.f49527d.a(th2);
        }
    }

    public static final class b extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f49528n;

        /* renamed from: o, reason: collision with root package name */
        public /* synthetic */ Object f49529o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ boolean f49530p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ c f49531q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ Function2 f49532r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ L f49533s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z10, c cVar, Function2 function2, L l10, Continuation continuation) {
            super(2, continuation);
            this.f49530p = z10;
            this.f49531q = cVar;
            this.f49532r = function2;
            this.f49533s = l10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            b bVar = new b(this.f49530p, this.f49531q, this.f49532r, this.f49533s, continuation);
            bVar.f49529o = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((b) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f49528n;
            try {
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    P p10 = (P) this.f49529o;
                    if (this.f49530p) {
                        c cVar = this.f49531q;
                        CoroutineContext.Element element = p10.getCoroutineContext().get(C0.f9001U2);
                        Intrinsics.checkNotNull(element);
                        cVar.g((C0) element);
                    }
                    l lVar = new l(p10, this.f49531q);
                    Function2 function2 = this.f49532r;
                    this.f49528n = 1;
                    if (function2.invoke(lVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
            } catch (Throwable th2) {
                if (!Intrinsics.areEqual(this.f49533s, C1452g0.d()) && this.f49533s != null) {
                    throw th2;
                }
                this.f49531q.cancel(th2);
            }
            return Unit.INSTANCE;
        }
    }

    public static final k a(P p10, CoroutineContext coroutineContext, c cVar, boolean z10, Function2 function2) {
        C0 d10;
        d10 = AbstractC1459k.d(p10, coroutineContext, null, new b(z10, cVar, function2, (L) p10.getCoroutineContext().get(L.f9039a), null), 2, null);
        d10.invokeOnCompletion(new a(cVar));
        return new k(d10, cVar);
    }

    public static final q b(P p10, CoroutineContext coroutineContext, boolean z10, Function2 block) {
        Intrinsics.checkNotNullParameter(p10, "<this>");
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        Intrinsics.checkNotNullParameter(block, "block");
        return a(p10, coroutineContext, e.a(z10), true, block);
    }

    public static /* synthetic */ q c(P p10, CoroutineContext coroutineContext, boolean z10, Function2 function2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return b(p10, coroutineContext, z10, function2);
    }
}
