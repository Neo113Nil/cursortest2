package androidx.lifecycle;

import Ph.AbstractC1459k;
import Ph.C1452g0;
import Ph.G0;
import androidx.lifecycle.AbstractC2185j;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u00038\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Landroidx/lifecycle/LifecycleCoroutineScopeImpl;", "Landroidx/lifecycle/m;", "Landroidx/lifecycle/p;", "Landroidx/lifecycle/j;", "lifecycle", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "<init>", "(Landroidx/lifecycle/j;Lkotlin/coroutines/CoroutineContext;)V", "", "f", "()V", "Landroidx/lifecycle/s;", "source", "Landroidx/lifecycle/j$a;", "event", "k", "(Landroidx/lifecycle/s;Landroidx/lifecycle/j$a;)V", "a", "Landroidx/lifecycle/j;", "()Landroidx/lifecycle/j;", com.google.crypto.tink.integration.android.b.f37029b, "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "lifecycle-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LifecycleCoroutineScopeImpl extends AbstractC2188m implements InterfaceC2191p {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final AbstractC2185j lifecycle;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final CoroutineContext coroutineContext;

    public static final class a extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f20271n;

        /* renamed from: o, reason: collision with root package name */
        public /* synthetic */ Object f20272o;

        public a(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            a aVar = LifecycleCoroutineScopeImpl.this.new a(continuation);
            aVar.f20272o = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Ph.P p10, Continuation continuation) {
            return ((a) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f20271n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Ph.P p10 = (Ph.P) this.f20272o;
            if (LifecycleCoroutineScopeImpl.this.getLifecycle().b().compareTo(AbstractC2185j.b.f20391b) >= 0) {
                LifecycleCoroutineScopeImpl.this.getLifecycle().a(LifecycleCoroutineScopeImpl.this);
            } else {
                G0.e(p10.getCoroutineContext(), null, 1, null);
            }
            return Unit.INSTANCE;
        }
    }

    public LifecycleCoroutineScopeImpl(AbstractC2185j lifecycle, CoroutineContext coroutineContext) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        this.lifecycle = lifecycle;
        this.coroutineContext = coroutineContext;
        if (getLifecycle().b() == AbstractC2185j.b.f20390a) {
            G0.e(getCoroutineContext(), null, 1, null);
        }
    }

    @Override // androidx.lifecycle.AbstractC2188m
    /* renamed from: a, reason: from getter */
    public AbstractC2185j getLifecycle() {
        return this.lifecycle;
    }

    public final void f() {
        AbstractC1459k.d(this, C1452g0.c().e2(), null, new a(null), 2, null);
    }

    @Override // Ph.P
    public CoroutineContext getCoroutineContext() {
        return this.coroutineContext;
    }

    @Override // androidx.lifecycle.InterfaceC2191p
    public void k(InterfaceC2193s source, AbstractC2185j.a event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        if (getLifecycle().b().compareTo(AbstractC2185j.b.f20390a) <= 0) {
            getLifecycle().d(this);
            G0.e(getCoroutineContext(), null, 1, null);
        }
    }
}
