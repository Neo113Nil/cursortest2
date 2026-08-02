package I0;

import Ph.AbstractC1459k;
import Ph.C0;
import Ph.P;
import Ph.Q;
import Rh.n;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class B {

    /* renamed from: a, reason: collision with root package name */
    public final P f5047a;

    /* renamed from: b, reason: collision with root package name */
    public final Function2 f5048b;

    /* renamed from: c, reason: collision with root package name */
    public final Rh.j f5049c;

    /* renamed from: d, reason: collision with root package name */
    public final C1337b f5050d;

    public static final class a extends Lambda implements Function1 {

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Function1 f5051d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ B f5052e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ Function2 f5053f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Function1 function1, B b10, Function2 function2) {
            super(1);
            this.f5051d = function1;
            this.f5052e = b10;
            this.f5053f = function2;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(Throwable th2) {
            Unit unit;
            this.f5051d.invoke(th2);
            this.f5052e.f5049c.a(th2);
            do {
                Object f10 = Rh.n.f(this.f5052e.f5049c.i());
                if (f10 != null) {
                    this.f5053f.invoke(f10, th2);
                    unit = Unit.INSTANCE;
                } else {
                    unit = null;
                }
            } while (unit != null);
        }
    }

    public static final class b extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public Object f5054n;

        /* renamed from: o, reason: collision with root package name */
        public int f5055o;

        public b(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return B.this.new b(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((b) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x005a, code lost:
        
            if (r1.invoke(r6, r5) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x005c, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x004e, code lost:
        
            if (r6 != r0) goto L15;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x005a -> B:6:0x005d). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Function2 function2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f5055o;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                if (B.this.f5050d.b() <= 0) {
                    throw new IllegalStateException("Check failed.");
                }
                Q.h(B.this.f5047a);
                function2 = B.this.f5048b;
                Rh.j jVar = B.this.f5049c;
                this.f5054n = function2;
                this.f5055o = 1;
                obj = jVar.m(this);
            } else if (i10 == 1) {
                function2 = (Function2) this.f5054n;
                ResultKt.throwOnFailure(obj);
                this.f5054n = null;
                this.f5055o = 2;
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                if (B.this.f5050d.a() == 0) {
                    return Unit.INSTANCE;
                }
                Q.h(B.this.f5047a);
                function2 = B.this.f5048b;
                Rh.j jVar2 = B.this.f5049c;
                this.f5054n = function2;
                this.f5055o = 1;
                obj = jVar2.m(this);
            }
        }
    }

    public B(P scope, Function1 onComplete, Function2 onUndeliveredElement, Function2 consumeMessage) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        Intrinsics.checkNotNullParameter(onUndeliveredElement, "onUndeliveredElement");
        Intrinsics.checkNotNullParameter(consumeMessage, "consumeMessage");
        this.f5047a = scope;
        this.f5048b = consumeMessage;
        this.f5049c = Rh.m.b(Integer.MAX_VALUE, null, null, 6, null);
        this.f5050d = new C1337b(0);
        C0 c02 = (C0) scope.getCoroutineContext().get(C0.f9001U2);
        if (c02 != null) {
            c02.invokeOnCompletion(new a(onComplete, this, onUndeliveredElement));
        }
    }

    public final void e(Object obj) {
        Object h10 = this.f5049c.h(obj);
        if (h10 instanceof n.a) {
            Throwable e10 = Rh.n.e(h10);
            if (e10 != null) {
                throw e10;
            }
            throw new Rh.t("Channel was closed normally");
        }
        if (!Rh.n.i(h10)) {
            throw new IllegalStateException("Check failed.");
        }
        if (this.f5050d.c() == 0) {
            AbstractC1459k.d(this.f5047a, null, null, new b(null), 3, null);
        }
    }
}
