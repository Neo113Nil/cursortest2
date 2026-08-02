package x2;

import Ph.C1469p;
import Ph.P;
import Ph.Q;
import android.adservices.measurement.MeasurementManager;
import android.net.Uri;
import android.view.InputEvent;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: x2.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6790l extends AbstractC6780b {

    /* renamed from: b, reason: collision with root package name */
    public final MeasurementManager f67824b;

    /* renamed from: x2.l$a */
    public static final class a extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f67825n;

        /* renamed from: o, reason: collision with root package name */
        public /* synthetic */ Object f67826o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ AbstractC6790l f67827p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC6791m abstractC6791m, AbstractC6790l abstractC6790l, Continuation continuation) {
            super(2, continuation);
            this.f67827p = abstractC6790l;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            a aVar = new a(null, this.f67827p, continuation);
            aVar.f67826o = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((a) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f67825n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            throw null;
        }
    }

    public AbstractC6790l(MeasurementManager mMeasurementManager) {
        Intrinsics.checkNotNullParameter(mMeasurementManager, "mMeasurementManager");
        this.f67824b = mMeasurementManager;
    }

    public static /* synthetic */ Object h(AbstractC6790l abstractC6790l, AbstractC6779a abstractC6779a, Continuation<? super Unit> continuation) {
        new C1469p(IntrinsicsKt.intercepted(continuation), 1).F();
        abstractC6790l.i();
        throw null;
    }

    public static /* synthetic */ Object j(AbstractC6790l abstractC6790l, Continuation<? super Integer> continuation) {
        C1469p c1469p = new C1469p(IntrinsicsKt.intercepted(continuation), 1);
        c1469p.F();
        abstractC6790l.i().getMeasurementApiStatus(new ExecutorC6789k(), u0.n.a(c1469p));
        Object z10 = c1469p.z();
        if (z10 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return z10;
    }

    public static /* synthetic */ Object k(AbstractC6790l abstractC6790l, Uri uri, InputEvent inputEvent, Continuation<? super Unit> continuation) {
        C1469p c1469p = new C1469p(IntrinsicsKt.intercepted(continuation), 1);
        c1469p.F();
        abstractC6790l.i().registerSource(uri, inputEvent, new ExecutorC6789k(), u0.n.a(c1469p));
        Object z10 = c1469p.z();
        if (z10 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return z10 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? z10 : Unit.INSTANCE;
    }

    public static /* synthetic */ Object l(AbstractC6790l abstractC6790l, AbstractC6791m abstractC6791m, Continuation<? super Unit> continuation) {
        Object g10 = Q.g(new a(abstractC6791m, abstractC6790l, null), continuation);
        return g10 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? g10 : Unit.INSTANCE;
    }

    public static /* synthetic */ Object m(AbstractC6790l abstractC6790l, Uri uri, Continuation<? super Unit> continuation) {
        C1469p c1469p = new C1469p(IntrinsicsKt.intercepted(continuation), 1);
        c1469p.F();
        abstractC6790l.i().registerTrigger(uri, new ExecutorC6789k(), u0.n.a(c1469p));
        Object z10 = c1469p.z();
        if (z10 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return z10 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? z10 : Unit.INSTANCE;
    }

    public static /* synthetic */ Object n(AbstractC6790l abstractC6790l, AbstractC6792n abstractC6792n, Continuation<? super Unit> continuation) {
        new C1469p(IntrinsicsKt.intercepted(continuation), 1).F();
        abstractC6790l.i();
        throw null;
    }

    public static /* synthetic */ Object o(AbstractC6790l abstractC6790l, AbstractC6793o abstractC6793o, Continuation<? super Unit> continuation) {
        new C1469p(IntrinsicsKt.intercepted(continuation), 1).F();
        abstractC6790l.i();
        throw null;
    }

    @Override // x2.AbstractC6780b
    @Nullable
    public Object a(@NotNull AbstractC6779a abstractC6779a, @NotNull Continuation<? super Unit> continuation) {
        return h(this, abstractC6779a, continuation);
    }

    @Override // x2.AbstractC6780b
    @Nullable
    public Object b(@NotNull Continuation<? super Integer> continuation) {
        return j(this, continuation);
    }

    @Override // x2.AbstractC6780b
    @Nullable
    public Object c(@NotNull Uri uri, @Nullable InputEvent inputEvent, @NotNull Continuation<? super Unit> continuation) {
        return k(this, uri, inputEvent, continuation);
    }

    @Override // x2.AbstractC6780b
    @Nullable
    public Object d(@NotNull AbstractC6791m abstractC6791m, @NotNull Continuation<? super Unit> continuation) {
        return l(this, abstractC6791m, continuation);
    }

    @Override // x2.AbstractC6780b
    @Nullable
    public Object e(@NotNull Uri uri, @NotNull Continuation<? super Unit> continuation) {
        return m(this, uri, continuation);
    }

    @Override // x2.AbstractC6780b
    @Nullable
    public Object f(@NotNull AbstractC6792n abstractC6792n, @NotNull Continuation<? super Unit> continuation) {
        return n(this, abstractC6792n, continuation);
    }

    @Override // x2.AbstractC6780b
    @Nullable
    public Object g(@NotNull AbstractC6793o abstractC6793o, @NotNull Continuation<? super Unit> continuation) {
        return o(this, abstractC6793o, continuation);
    }

    public final MeasurementManager i() {
        return this.f67824b;
    }
}
