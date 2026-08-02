package androidx.lifecycle;

import Ph.AbstractC1455i;
import Ph.AbstractC1459k;
import Ph.C0;
import Ph.C1452g0;
import Ph.C1469p;
import Ph.InterfaceC1465n;
import Ph.M0;
import androidx.lifecycle.AbstractC2185j;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* loaded from: classes.dex */
public final class RepeatOnLifecycleKt$repeatOnLifecycle$3 extends SuspendLambda implements Function2 {

    /* renamed from: n, reason: collision with root package name */
    public int f20313n;

    /* renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f20314o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ AbstractC2185j f20315p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ AbstractC2185j.b f20316q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Function2 f20317r;

    /* renamed from: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public Object f20318n;

        /* renamed from: o, reason: collision with root package name */
        public Object f20319o;

        /* renamed from: p, reason: collision with root package name */
        public Object f20320p;

        /* renamed from: q, reason: collision with root package name */
        public Object f20321q;

        /* renamed from: r, reason: collision with root package name */
        public Object f20322r;

        /* renamed from: s, reason: collision with root package name */
        public Object f20323s;

        /* renamed from: t, reason: collision with root package name */
        public int f20324t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ AbstractC2185j f20325u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ AbstractC2185j.b f20326v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ Ph.P f20327w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ Function2 f20328x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AbstractC2185j abstractC2185j, AbstractC2185j.b bVar, Ph.P p10, Function2 function2, Continuation continuation) {
            super(2, continuation);
            this.f20325u = abstractC2185j;
            this.f20326v = bVar;
            this.f20327w = p10;
            this.f20328x = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.f20325u, this.f20326v, this.f20327w, this.f20328x, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Ph.P p10, Continuation continuation) {
            return ((AnonymousClass1) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x00c6  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x00cf  */
        /* JADX WARN: Removed duplicated region for block: B:26:? A[SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r4v3, types: [T, androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1, java.lang.Object] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Ref.ObjectRef objectRef;
            Throwable th2;
            Ref.ObjectRef objectRef2;
            C0 c02;
            InterfaceC2191p interfaceC2191p;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f20324t;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                if (this.f20325u.b() == AbstractC2185j.b.f20390a) {
                    return Unit.INSTANCE;
                }
                final Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
                objectRef = new Ref.ObjectRef();
                try {
                    AbstractC2185j.b bVar = this.f20326v;
                    AbstractC2185j abstractC2185j = this.f20325u;
                    final Ph.P p10 = this.f20327w;
                    final Function2 function2 = this.f20328x;
                    this.f20318n = objectRef3;
                    this.f20319o = objectRef;
                    this.f20320p = bVar;
                    this.f20321q = abstractC2185j;
                    this.f20322r = p10;
                    this.f20323s = function2;
                    this.f20324t = 1;
                    final C1469p c1469p = new C1469p(IntrinsicsKt.intercepted(this), 1);
                    c1469p.F();
                    AbstractC2185j.a.C0383a c0383a = AbstractC2185j.a.Companion;
                    final AbstractC2185j.a c10 = c0383a.c(bVar);
                    final AbstractC2185j.a a10 = c0383a.a(bVar);
                    final Wh.a b10 = Wh.g.b(false, 1, null);
                    ?? r42 = new InterfaceC2191p() { // from class: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1

                        public static final class a extends SuspendLambda implements Function2 {

                            /* renamed from: n, reason: collision with root package name */
                            public Object f20336n;

                            /* renamed from: o, reason: collision with root package name */
                            public Object f20337o;

                            /* renamed from: p, reason: collision with root package name */
                            public int f20338p;

                            /* renamed from: q, reason: collision with root package name */
                            public final /* synthetic */ Wh.a f20339q;

                            /* renamed from: r, reason: collision with root package name */
                            public final /* synthetic */ Function2 f20340r;

                            /* renamed from: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$a$a, reason: collision with other inner class name */
                            public static final class C0381a extends SuspendLambda implements Function2 {

                                /* renamed from: n, reason: collision with root package name */
                                public int f20341n;

                                /* renamed from: o, reason: collision with root package name */
                                public /* synthetic */ Object f20342o;

                                /* renamed from: p, reason: collision with root package name */
                                public final /* synthetic */ Function2 f20343p;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                public C0381a(Function2 function2, Continuation continuation) {
                                    super(2, continuation);
                                    this.f20343p = function2;
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Continuation create(Object obj, Continuation continuation) {
                                    C0381a c0381a = new C0381a(this.f20343p, continuation);
                                    c0381a.f20342o = obj;
                                    return c0381a;
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Ph.P p10, Continuation continuation) {
                                    return ((C0381a) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Object invokeSuspend(Object obj) {
                                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                    int i10 = this.f20341n;
                                    if (i10 == 0) {
                                        ResultKt.throwOnFailure(obj);
                                        Ph.P p10 = (Ph.P) this.f20342o;
                                        Function2 function2 = this.f20343p;
                                        this.f20341n = 1;
                                        if (function2.invoke(p10, this) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                    } else {
                                        if (i10 != 1) {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        ResultKt.throwOnFailure(obj);
                                    }
                                    return Unit.INSTANCE;
                                }
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            public a(Wh.a aVar, Function2 function2, Continuation continuation) {
                                super(2, continuation);
                                this.f20339q = aVar;
                                this.f20340r = function2;
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Continuation create(Object obj, Continuation continuation) {
                                return new a(this.f20339q, this.f20340r, continuation);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Ph.P p10, Continuation continuation) {
                                return ((a) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
                            }

                            /* JADX WARN: Code restructure failed: missing block: B:28:0x003f, code lost:
                            
                                if (r7.f(null, r6) == r0) goto L19;
                             */
                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object invokeSuspend(Object obj) {
                                Wh.a aVar;
                                Function2 function2;
                                Wh.a aVar2;
                                Throwable th2;
                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                int i10 = this.f20338p;
                                try {
                                    if (i10 == 0) {
                                        ResultKt.throwOnFailure(obj);
                                        aVar = this.f20339q;
                                        function2 = this.f20340r;
                                        this.f20336n = aVar;
                                        this.f20337o = function2;
                                        this.f20338p = 1;
                                    } else {
                                        if (i10 != 1) {
                                            if (i10 != 2) {
                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                            }
                                            aVar2 = (Wh.a) this.f20336n;
                                            try {
                                                ResultKt.throwOnFailure(obj);
                                                Unit unit = Unit.INSTANCE;
                                                aVar2.g(null);
                                                return Unit.INSTANCE;
                                            } catch (Throwable th3) {
                                                th2 = th3;
                                                aVar2.g(null);
                                                throw th2;
                                            }
                                        }
                                        function2 = (Function2) this.f20337o;
                                        Wh.a aVar3 = (Wh.a) this.f20336n;
                                        ResultKt.throwOnFailure(obj);
                                        aVar = aVar3;
                                    }
                                    C0381a c0381a = new C0381a(function2, null);
                                    this.f20336n = aVar;
                                    this.f20337o = null;
                                    this.f20338p = 2;
                                    if (Ph.Q.g(c0381a, this) != coroutine_suspended) {
                                        aVar2 = aVar;
                                        Unit unit2 = Unit.INSTANCE;
                                        aVar2.g(null);
                                        return Unit.INSTANCE;
                                    }
                                    return coroutine_suspended;
                                } catch (Throwable th4) {
                                    aVar2 = aVar;
                                    th2 = th4;
                                    aVar2.g(null);
                                    throw th2;
                                }
                            }
                        }

                        /* JADX WARN: Type inference failed for: r9v5, types: [Ph.C0, T] */
                        @Override // androidx.lifecycle.InterfaceC2191p
                        public final void k(InterfaceC2193s interfaceC2193s, AbstractC2185j.a event) {
                            ?? d10;
                            Intrinsics.checkNotNullParameter(interfaceC2193s, "<unused var>");
                            Intrinsics.checkNotNullParameter(event, "event");
                            if (event == AbstractC2185j.a.this) {
                                Ref.ObjectRef objectRef4 = objectRef3;
                                d10 = AbstractC1459k.d(p10, null, null, new a(b10, function2, null), 3, null);
                                objectRef4.element = d10;
                                return;
                            }
                            if (event == a10) {
                                C0 c03 = (C0) objectRef3.element;
                                if (c03 != null) {
                                    C0.a.b(c03, null, 1, null);
                                }
                                objectRef3.element = null;
                            }
                            if (event == AbstractC2185j.a.ON_DESTROY) {
                                InterfaceC1465n interfaceC1465n = c1469p;
                                Result.Companion companion = Result.INSTANCE;
                                interfaceC1465n.resumeWith(Result.m147constructorimpl(Unit.INSTANCE));
                            }
                        }
                    };
                    objectRef.element = r42;
                    Intrinsics.checkNotNull(r42, "null cannot be cast to non-null type androidx.lifecycle.LifecycleEventObserver");
                    abstractC2185j.a((InterfaceC2191p) r42);
                    Object z10 = c1469p.z();
                    if (z10 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        DebugProbesKt.probeCoroutineSuspended(this);
                    }
                    if (z10 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    objectRef2 = objectRef3;
                } catch (Throwable th3) {
                    th2 = th3;
                    objectRef2 = objectRef3;
                    c02 = (C0) objectRef2.element;
                    if (c02 != null) {
                        C0.a.b(c02, null, 1, null);
                    }
                    interfaceC2191p = (InterfaceC2191p) objectRef.element;
                    if (interfaceC2191p != null) {
                        throw th2;
                    }
                    this.f20325u.d(interfaceC2191p);
                    throw th2;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                objectRef = (Ref.ObjectRef) this.f20319o;
                objectRef2 = (Ref.ObjectRef) this.f20318n;
                try {
                    ResultKt.throwOnFailure(obj);
                } catch (Throwable th4) {
                    th2 = th4;
                    c02 = (C0) objectRef2.element;
                    if (c02 != null) {
                    }
                    interfaceC2191p = (InterfaceC2191p) objectRef.element;
                    if (interfaceC2191p != null) {
                    }
                }
            }
            C0 c03 = (C0) objectRef2.element;
            if (c03 != null) {
                C0.a.b(c03, null, 1, null);
            }
            InterfaceC2191p interfaceC2191p2 = (InterfaceC2191p) objectRef.element;
            if (interfaceC2191p2 != null) {
                this.f20325u.d(interfaceC2191p2);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RepeatOnLifecycleKt$repeatOnLifecycle$3(AbstractC2185j abstractC2185j, AbstractC2185j.b bVar, Function2 function2, Continuation continuation) {
        super(2, continuation);
        this.f20315p = abstractC2185j;
        this.f20316q = bVar;
        this.f20317r = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        RepeatOnLifecycleKt$repeatOnLifecycle$3 repeatOnLifecycleKt$repeatOnLifecycle$3 = new RepeatOnLifecycleKt$repeatOnLifecycle$3(this.f20315p, this.f20316q, this.f20317r, continuation);
        repeatOnLifecycleKt$repeatOnLifecycle$3.f20314o = obj;
        return repeatOnLifecycleKt$repeatOnLifecycle$3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Ph.P p10, Continuation continuation) {
        return ((RepeatOnLifecycleKt$repeatOnLifecycle$3) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.f20313n;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            Ph.P p10 = (Ph.P) this.f20314o;
            M0 e22 = C1452g0.c().e2();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f20315p, this.f20316q, p10, this.f20317r, null);
            this.f20313n = 1;
            if (AbstractC1455i.g(e22, anonymousClass1, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
