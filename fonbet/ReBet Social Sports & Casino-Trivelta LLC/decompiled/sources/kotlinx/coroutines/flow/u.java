package kotlinx.coroutines.flow;

import Ph.AbstractC1455i;
import Ph.C0;
import Ph.S;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.flow.I;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class u {

    public static final class a extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f54917n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ I f54918o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ InterfaceC5321f f54919p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ x f54920q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ Object f54921r;

        /* renamed from: kotlinx.coroutines.flow.u$a$a, reason: collision with other inner class name */
        public static final class C0796a extends SuspendLambda implements Function2 {

            /* renamed from: n, reason: collision with root package name */
            public int f54922n;

            /* renamed from: o, reason: collision with root package name */
            public /* synthetic */ int f54923o;

            public C0796a(Continuation continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                C0796a c0796a = new C0796a(continuation);
                c0796a.f54923o = ((Number) obj).intValue();
                return c0796a;
            }

            public final Object i(int i10, Continuation continuation) {
                return ((C0796a) create(Integer.valueOf(i10), continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return i(((Number) obj).intValue(), (Continuation) obj2);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f54922n != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Boxing.boxBoolean(this.f54923o > 0);
            }
        }

        public static final class b extends SuspendLambda implements Function2 {

            /* renamed from: n, reason: collision with root package name */
            public int f54924n;

            /* renamed from: o, reason: collision with root package name */
            public /* synthetic */ Object f54925o;

            /* renamed from: p, reason: collision with root package name */
            public final /* synthetic */ InterfaceC5321f f54926p;

            /* renamed from: q, reason: collision with root package name */
            public final /* synthetic */ x f54927q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ Object f54928r;

            /* renamed from: kotlinx.coroutines.flow.u$a$b$a, reason: collision with other inner class name */
            public /* synthetic */ class C0797a {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[G.values().length];
                    try {
                        iArr[G.f54633a.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[G.f54634b.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[G.f54635c.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(InterfaceC5321f interfaceC5321f, x xVar, Object obj, Continuation continuation) {
                super(2, continuation);
                this.f54926p = interfaceC5321f;
                this.f54927q = xVar;
                this.f54928r = obj;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                b bVar = new b(this.f54926p, this.f54927q, this.f54928r, continuation);
                bVar.f54925o = obj;
                return bVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public final Object invoke(G g10, Continuation continuation) {
                return ((b) create(g10, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i10 = this.f54924n;
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    int i11 = C0797a.$EnumSwitchMapping$0[((G) this.f54925o).ordinal()];
                    if (i11 == 1) {
                        InterfaceC5321f interfaceC5321f = this.f54926p;
                        x xVar = this.f54927q;
                        this.f54924n = 1;
                        if (interfaceC5321f.collect(xVar, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else if (i11 != 2) {
                        if (i11 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        Object obj2 = this.f54928r;
                        if (obj2 == E.f54630a) {
                            this.f54927q.h();
                        } else {
                            Boxing.boxBoolean(this.f54927q.a(obj2));
                        }
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
        public a(I i10, InterfaceC5321f interfaceC5321f, x xVar, Object obj, Continuation continuation) {
            super(2, continuation);
            this.f54918o = i10;
            this.f54919p = interfaceC5321f;
            this.f54920q = xVar;
            this.f54921r = obj;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new a(this.f54918o, this.f54919p, this.f54920q, this.f54921r, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Ph.P p10, Continuation continuation) {
            return ((a) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x0066, code lost:
        
            if (r8.collect(r1, r7) == r0) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x003c, code lost:
        
            if (r8.collect(r1, r7) == r0) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0059, code lost:
        
            if (kotlinx.coroutines.flow.AbstractC5323h.s(r8, r1, r7) == r0) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x008a, code lost:
        
            if (kotlinx.coroutines.flow.AbstractC5323h.h(r8, r1, r7) == r0) goto L28;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f54917n;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        ResultKt.throwOnFailure(obj);
                        InterfaceC5321f interfaceC5321f = this.f54919p;
                        x xVar = this.f54920q;
                        this.f54917n = 3;
                    } else if (i10 != 3 && i10 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            I i11 = this.f54918o;
            I.a aVar = I.f54641a;
            if (i11 == aVar.a()) {
                InterfaceC5321f interfaceC5321f2 = this.f54919p;
                x xVar2 = this.f54920q;
                this.f54917n = 1;
            } else if (this.f54918o == aVar.b()) {
                L g10 = this.f54920q.g();
                C0796a c0796a = new C0796a(null);
                this.f54917n = 2;
            } else {
                InterfaceC5321f k10 = AbstractC5323h.k(this.f54918o.a(this.f54920q.g()));
                b bVar = new b(this.f54919p, this.f54920q, this.f54921r, null);
                this.f54917n = 4;
            }
            return coroutine_suspended;
        }
    }

    public static final C a(x xVar) {
        return new z(xVar, null);
    }

    public static final L b(y yVar) {
        return new A(yVar, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002d, code lost:
    
        if (r3 == 0) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final H c(InterfaceC5321f interfaceC5321f, int i10) {
        kotlinx.coroutines.flow.internal.e eVar;
        InterfaceC5321f j10;
        int coerceAtLeast = RangesKt.coerceAtLeast(i10, Rh.j.f10362p3.a()) - i10;
        if (!(interfaceC5321f instanceof kotlinx.coroutines.flow.internal.e) || (j10 = (eVar = (kotlinx.coroutines.flow.internal.e) interfaceC5321f).j()) == null) {
            return new H(interfaceC5321f, coerceAtLeast, Rh.d.f10307a, EmptyCoroutineContext.INSTANCE);
        }
        int i11 = eVar.f54710b;
        if (i11 != -3 && i11 != -2 && i11 != 0) {
            coerceAtLeast = i11;
        } else if (eVar.f54711c != Rh.d.f10307a) {
            if (i10 == 0) {
                coerceAtLeast = 1;
            }
            coerceAtLeast = 0;
        }
        return new H(j10, coerceAtLeast, eVar.f54711c, eVar.f54709a);
    }

    public static final C0 d(Ph.P p10, CoroutineContext coroutineContext, InterfaceC5321f interfaceC5321f, x xVar, I i10, Object obj) {
        return AbstractC1455i.c(p10, coroutineContext, Intrinsics.areEqual(i10, I.f54641a.a()) ? S.f9047a : S.f9050d, new a(i10, interfaceC5321f, xVar, obj, null));
    }

    public static final C e(InterfaceC5321f interfaceC5321f, Ph.P p10, I i10, int i11) {
        H c10 = c(interfaceC5321f, i11);
        x a10 = E.a(i11, c10.f54638b, c10.f54639c);
        return new z(a10, d(p10, c10.f54640d, c10.f54637a, a10, i10, E.f54630a));
    }

    public static /* synthetic */ C f(InterfaceC5321f interfaceC5321f, Ph.P p10, I i10, int i11, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            i11 = 0;
        }
        return AbstractC5323h.K(interfaceC5321f, p10, i10, i11);
    }
}
