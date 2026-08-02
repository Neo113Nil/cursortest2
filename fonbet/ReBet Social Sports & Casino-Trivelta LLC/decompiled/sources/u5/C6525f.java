package u5;

import Ph.AbstractC1459k;
import Ph.P;
import android.view.Choreographer;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.flow.AbstractC5323h;
import kotlinx.coroutines.flow.C;
import kotlinx.coroutines.flow.E;
import kotlinx.coroutines.flow.x;

/* renamed from: u5.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6525f {

    /* renamed from: a, reason: collision with root package name */
    public final P f66150a;

    /* renamed from: b, reason: collision with root package name */
    public final Function0 f66151b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f66152c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f66153d;

    /* renamed from: e, reason: collision with root package name */
    public y5.e f66154e;

    /* renamed from: f, reason: collision with root package name */
    public int f66155f;

    /* renamed from: g, reason: collision with root package name */
    public final int f66156g;

    /* renamed from: h, reason: collision with root package name */
    public final x f66157h;

    /* renamed from: i, reason: collision with root package name */
    public final C f66158i;

    /* renamed from: j, reason: collision with root package name */
    public final a f66159j;

    /* renamed from: u5.f$a */
    public static final class a implements Choreographer.FrameCallback {

        /* renamed from: u5.f$a$a, reason: collision with other inner class name */
        public static final class C0920a extends SuspendLambda implements Function2 {

            /* renamed from: n, reason: collision with root package name */
            public int f66161n;

            /* renamed from: o, reason: collision with root package name */
            public final /* synthetic */ C6525f f66162o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0920a(C6525f c6525f, Continuation continuation) {
                super(2, continuation);
                this.f66162o = c6525f;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new C0920a(this.f66162o, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(P p10, Continuation continuation) {
                return ((C0920a) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i10 = this.f66161n;
                try {
                    if (i10 == 0) {
                        ResultKt.throwOnFailure(obj);
                        y5.e eVar = (y5.e) this.f66162o.f66151b.invoke();
                        if (!Intrinsics.areEqual(eVar, this.f66162o.f66154e)) {
                            this.f66162o.f66154e = eVar;
                            x xVar = this.f66162o.f66157h;
                            this.f66161n = 1;
                            if (xVar.emit(eVar, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                } catch (Throwable th2) {
                    E5.b.f3006a.c("Error collecting hierarchy flow", th2);
                }
                return Unit.INSTANCE;
            }
        }

        public a() {
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j10) {
            Object obj = C6525f.this.f66153d;
            C6525f c6525f = C6525f.this;
            synchronized (obj) {
                try {
                    if (c6525f.f66152c.get()) {
                        c6525f.f66155f++;
                        if (c6525f.f66155f % c6525f.f66156g == 0) {
                            AbstractC1459k.d(c6525f.f66150a, null, null, new C0920a(c6525f, null), 3, null);
                        }
                        if (c6525f.f66152c.get()) {
                            Choreographer.getInstance().postFrameCallback(this);
                        }
                        Unit unit = Unit.INSTANCE;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* renamed from: u5.f$b */
    public static final class b extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f66163n;

        public b(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return C6525f.this.new b(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((b) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f66163n;
            try {
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    y5.e eVar = (y5.e) C6525f.this.f66151b.invoke();
                    C6525f.this.f66154e = eVar;
                    x xVar = C6525f.this.f66157h;
                    this.f66163n = 1;
                    if (xVar.emit(eVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
            } catch (Throwable th2) {
                E5.b.f3006a.c("Error collecting hierarchy flow", th2);
            }
            return Unit.INSTANCE;
        }
    }

    public C6525f(P scope, Function0 hierarchyProvider, int i10) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(hierarchyProvider, "hierarchyProvider");
        this.f66150a = scope;
        this.f66151b = hierarchyProvider;
        this.f66152c = new AtomicBoolean(false);
        this.f66153d = new Object();
        this.f66156g = RangesKt.coerceAtLeast(60 / i10, 1);
        x b10 = E.b(1, 0, null, 6, null);
        this.f66157h = b10;
        this.f66158i = AbstractC5323h.a(b10);
        this.f66159j = new a();
    }

    public static /* synthetic */ void m(C6525f c6525f, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        c6525f.l(z10);
    }

    public final C k() {
        return this.f66158i;
    }

    public final void l(boolean z10) {
        synchronized (this.f66153d) {
            try {
                if (this.f66152c.getAndSet(true)) {
                    return;
                }
                this.f66155f = 0;
                if (z10) {
                    AbstractC1459k.d(this.f66150a, null, null, new b(null), 3, null);
                }
                Choreographer.getInstance().postFrameCallback(this.f66159j);
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
