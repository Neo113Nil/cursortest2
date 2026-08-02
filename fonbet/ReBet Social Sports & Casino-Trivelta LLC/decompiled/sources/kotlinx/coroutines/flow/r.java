package kotlinx.coroutines.flow;

import Ph.F0;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.flow.internal.C5325a;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class r {

    public static final class a implements InterfaceC5321f {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC5321f f54839a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f54840b;

        public a(InterfaceC5321f interfaceC5321f, int i10) {
            this.f54839a = interfaceC5321f;
            this.f54840b = i10;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC5321f
        public Object collect(InterfaceC5322g interfaceC5322g, Continuation continuation) {
            Object collect = this.f54839a.collect(new b(new Ref.IntRef(), this.f54840b, interfaceC5322g), continuation);
            return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
        }
    }

    public static final class b implements InterfaceC5322g {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Ref.IntRef f54841a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f54842b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ InterfaceC5322g f54843c;

        public static final class a extends ContinuationImpl {

            /* renamed from: n, reason: collision with root package name */
            public /* synthetic */ Object f54844n;

            /* renamed from: p, reason: collision with root package name */
            public int f54846p;

            public a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f54844n = obj;
                this.f54846p |= Integer.MIN_VALUE;
                return b.this.emit(null, this);
            }
        }

        public b(Ref.IntRef intRef, int i10, InterfaceC5322g interfaceC5322g) {
            this.f54841a = intRef;
            this.f54842b = i10;
            this.f54843c = interfaceC5322g;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
        @Override // kotlinx.coroutines.flow.InterfaceC5322g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, Continuation continuation) {
            a aVar;
            int i10;
            if (continuation instanceof a) {
                aVar = (a) continuation;
                int i11 = aVar.f54846p;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    aVar.f54846p = i11 - Integer.MIN_VALUE;
                    Object obj2 = aVar.f54844n;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i10 = aVar.f54846p;
                    if (i10 != 0) {
                        ResultKt.throwOnFailure(obj2);
                        Ref.IntRef intRef = this.f54841a;
                        int i12 = intRef.element;
                        if (i12 < this.f54842b) {
                            intRef.element = i12 + 1;
                            return Unit.INSTANCE;
                        }
                        InterfaceC5322g interfaceC5322g = this.f54843c;
                        aVar.f54846p = 1;
                        if (interfaceC5322g.emit(obj, aVar) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }
            aVar = new a(continuation);
            Object obj22 = aVar.f54844n;
            Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i10 = aVar.f54846p;
            if (i10 != 0) {
            }
            return Unit.INSTANCE;
        }
    }

    public static final class c implements InterfaceC5321f {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC5321f f54847a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Function2 f54848b;

        public c(InterfaceC5321f interfaceC5321f, Function2 function2) {
            this.f54847a = interfaceC5321f;
            this.f54848b = function2;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC5321f
        public Object collect(InterfaceC5322g interfaceC5322g, Continuation continuation) {
            Object collect = this.f54847a.collect(new d(new Ref.BooleanRef(), interfaceC5322g, this.f54848b), continuation);
            return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
        }
    }

    public static final class d implements InterfaceC5322g {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Ref.BooleanRef f54849a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC5322g f54850b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Function2 f54851c;

        public static final class a extends ContinuationImpl {

            /* renamed from: n, reason: collision with root package name */
            public Object f54852n;

            /* renamed from: o, reason: collision with root package name */
            public Object f54853o;

            /* renamed from: p, reason: collision with root package name */
            public /* synthetic */ Object f54854p;

            /* renamed from: r, reason: collision with root package name */
            public int f54856r;

            public a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f54854p = obj;
                this.f54856r |= Integer.MIN_VALUE;
                return d.this.emit(null, this);
            }
        }

        public d(Ref.BooleanRef booleanRef, InterfaceC5322g interfaceC5322g, Function2 function2) {
            this.f54849a = booleanRef;
            this.f54850b = interfaceC5322g;
            this.f54851c = function2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0085, code lost:
        
            if (r8.emit(r7, r0) == r1) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0056, code lost:
        
            if (r8.emit(r7, r0) == r1) goto L33;
         */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0074  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x008b  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0045  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
        @Override // kotlinx.coroutines.flow.InterfaceC5322g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, Continuation continuation) {
            a aVar;
            int i10;
            d dVar;
            if (continuation instanceof a) {
                aVar = (a) continuation;
                int i11 = aVar.f54856r;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    aVar.f54856r = i11 - Integer.MIN_VALUE;
                    Object obj2 = aVar.f54854p;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i10 = aVar.f54856r;
                    if (i10 != 0) {
                        ResultKt.throwOnFailure(obj2);
                        if (this.f54849a.element) {
                            InterfaceC5322g interfaceC5322g = this.f54850b;
                            aVar.f54856r = 1;
                        } else {
                            Function2 function2 = this.f54851c;
                            aVar.f54852n = this;
                            aVar.f54853o = obj;
                            aVar.f54856r = 2;
                            obj2 = function2.invoke(obj, aVar);
                            if (obj2 != coroutine_suspended) {
                                dVar = this;
                                if (!((Boolean) obj2).booleanValue()) {
                                }
                            }
                        }
                        return coroutine_suspended;
                    }
                    if (i10 == 1) {
                        ResultKt.throwOnFailure(obj2);
                        return Unit.INSTANCE;
                    }
                    if (i10 != 2) {
                        if (i10 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                        return Unit.INSTANCE;
                    }
                    obj = aVar.f54853o;
                    dVar = (d) aVar.f54852n;
                    ResultKt.throwOnFailure(obj2);
                    if (!((Boolean) obj2).booleanValue()) {
                        return Unit.INSTANCE;
                    }
                    dVar.f54849a.element = true;
                    InterfaceC5322g interfaceC5322g2 = dVar.f54850b;
                    aVar.f54852n = null;
                    aVar.f54853o = null;
                    aVar.f54856r = 3;
                }
            }
            aVar = new a(continuation);
            Object obj22 = aVar.f54854p;
            Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i10 = aVar.f54856r;
            if (i10 != 0) {
            }
        }
    }

    public static final class e extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f54857n;

        /* renamed from: o, reason: collision with root package name */
        public /* synthetic */ Object f54858o;

        /* renamed from: p, reason: collision with root package name */
        public int f54859p;

        public e(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f54858o = obj;
            this.f54859p |= Integer.MIN_VALUE;
            return r.d(null, null, null, this);
        }
    }

    public static final class f implements InterfaceC5321f {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC5321f f54860a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f54861b;

        public static final class a extends ContinuationImpl {

            /* renamed from: n, reason: collision with root package name */
            public /* synthetic */ Object f54862n;

            /* renamed from: o, reason: collision with root package name */
            public int f54863o;

            /* renamed from: q, reason: collision with root package name */
            public Object f54865q;

            public a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f54862n = obj;
                this.f54863o |= Integer.MIN_VALUE;
                return f.this.collect(null, this);
            }
        }

        public f(InterfaceC5321f interfaceC5321f, int i10) {
            this.f54860a = interfaceC5321f;
            this.f54861b = i10;
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
        @Override // kotlinx.coroutines.flow.InterfaceC5321f
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object collect(InterfaceC5322g interfaceC5322g, Continuation continuation) {
            a aVar;
            int i10;
            C5325a e10;
            Object obj;
            if (continuation instanceof a) {
                aVar = (a) continuation;
                int i11 = aVar.f54863o;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    aVar.f54863o = i11 - Integer.MIN_VALUE;
                    Object obj2 = aVar.f54862n;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i10 = aVar.f54863o;
                    if (i10 != 0) {
                        ResultKt.throwOnFailure(obj2);
                        Object obj3 = new Object();
                        Ref.IntRef intRef = new Ref.IntRef();
                        try {
                            InterfaceC5321f interfaceC5321f = this.f54860a;
                            g gVar = new g(intRef, this.f54861b, interfaceC5322g, obj3);
                            aVar.f54865q = obj3;
                            aVar.f54863o = 1;
                            if (interfaceC5321f.collect(gVar, aVar) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } catch (C5325a e11) {
                            e10 = e11;
                            obj = obj3;
                            kotlinx.coroutines.flow.internal.p.a(e10, obj);
                            return Unit.INSTANCE;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        obj = aVar.f54865q;
                        try {
                            ResultKt.throwOnFailure(obj2);
                        } catch (C5325a e12) {
                            e10 = e12;
                            kotlinx.coroutines.flow.internal.p.a(e10, obj);
                            return Unit.INSTANCE;
                        }
                    }
                    return Unit.INSTANCE;
                }
            }
            aVar = new a(continuation);
            Object obj22 = aVar.f54862n;
            Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i10 = aVar.f54863o;
            if (i10 != 0) {
            }
            return Unit.INSTANCE;
        }
    }

    public static final class g implements InterfaceC5322g {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Ref.IntRef f54866a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f54867b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ InterfaceC5322g f54868c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Object f54869d;

        public static final class a extends ContinuationImpl {

            /* renamed from: n, reason: collision with root package name */
            public /* synthetic */ Object f54870n;

            /* renamed from: p, reason: collision with root package name */
            public int f54872p;

            public a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f54870n = obj;
                this.f54872p |= Integer.MIN_VALUE;
                return g.this.emit(null, this);
            }
        }

        public g(Ref.IntRef intRef, int i10, InterfaceC5322g interfaceC5322g, Object obj) {
            this.f54866a = intRef;
            this.f54867b = i10;
            this.f54868c = interfaceC5322g;
            this.f54869d = obj;
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x004e, code lost:
        
            if (r7.emit(r6, r0) == r1) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x005e, code lost:
        
            if (kotlinx.coroutines.flow.r.d(r7, r6, r2, r0) == r1) goto L25;
         */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0038  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
        @Override // kotlinx.coroutines.flow.InterfaceC5322g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, Continuation continuation) {
            a aVar;
            int i10;
            if (continuation instanceof a) {
                aVar = (a) continuation;
                int i11 = aVar.f54872p;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    aVar.f54872p = i11 - Integer.MIN_VALUE;
                    Object obj2 = aVar.f54870n;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i10 = aVar.f54872p;
                    if (i10 == 0) {
                        if (i10 == 1) {
                            ResultKt.throwOnFailure(obj2);
                            return Unit.INSTANCE;
                        }
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                        return Unit.INSTANCE;
                    }
                    ResultKt.throwOnFailure(obj2);
                    Ref.IntRef intRef = this.f54866a;
                    int i12 = intRef.element + 1;
                    intRef.element = i12;
                    if (i12 < this.f54867b) {
                        InterfaceC5322g interfaceC5322g = this.f54868c;
                        aVar.f54872p = 1;
                    } else {
                        InterfaceC5322g interfaceC5322g2 = this.f54868c;
                        Object obj3 = this.f54869d;
                        aVar.f54872p = 2;
                    }
                    return coroutine_suspended;
                }
            }
            aVar = new a(continuation);
            Object obj22 = aVar.f54870n;
            Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i10 = aVar.f54872p;
            if (i10 == 0) {
            }
        }
    }

    public static final class h implements InterfaceC5321f {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC5321f f54873a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Function2 f54874b;

        public static final class a extends ContinuationImpl {

            /* renamed from: n, reason: collision with root package name */
            public /* synthetic */ Object f54875n;

            /* renamed from: o, reason: collision with root package name */
            public int f54876o;

            /* renamed from: q, reason: collision with root package name */
            public Object f54878q;

            public a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f54875n = obj;
                this.f54876o |= Integer.MIN_VALUE;
                return h.this.collect(null, this);
            }
        }

        public h(InterfaceC5321f interfaceC5321f, Function2 function2) {
            this.f54873a = interfaceC5321f;
            this.f54874b = function2;
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
        @Override // kotlinx.coroutines.flow.InterfaceC5321f
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object collect(InterfaceC5322g interfaceC5322g, Continuation continuation) {
            a aVar;
            int i10;
            i iVar;
            if (continuation instanceof a) {
                aVar = (a) continuation;
                int i11 = aVar.f54876o;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    aVar.f54876o = i11 - Integer.MIN_VALUE;
                    Object obj = aVar.f54875n;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i10 = aVar.f54876o;
                    if (i10 != 0) {
                        ResultKt.throwOnFailure(obj);
                        InterfaceC5321f interfaceC5321f = this.f54873a;
                        i iVar2 = new i(this.f54874b, interfaceC5322g);
                        try {
                            aVar.f54878q = iVar2;
                            aVar.f54876o = 1;
                            if (interfaceC5321f.collect(iVar2, aVar) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } catch (C5325a e10) {
                            e = e10;
                            iVar = iVar2;
                            kotlinx.coroutines.flow.internal.p.a(e, iVar);
                            F0.m(aVar.get$context());
                            return Unit.INSTANCE;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        iVar = (i) aVar.f54878q;
                        try {
                            ResultKt.throwOnFailure(obj);
                        } catch (C5325a e11) {
                            e = e11;
                            kotlinx.coroutines.flow.internal.p.a(e, iVar);
                            F0.m(aVar.get$context());
                            return Unit.INSTANCE;
                        }
                    }
                    return Unit.INSTANCE;
                }
            }
            aVar = new a(continuation);
            Object obj2 = aVar.f54875n;
            Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i10 = aVar.f54876o;
            if (i10 != 0) {
            }
            return Unit.INSTANCE;
        }
    }

    public static final class i implements InterfaceC5322g {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Function2 f54879a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC5322g f54880b;

        public static final class a extends ContinuationImpl {

            /* renamed from: n, reason: collision with root package name */
            public Object f54881n;

            /* renamed from: o, reason: collision with root package name */
            public /* synthetic */ Object f54882o;

            /* renamed from: p, reason: collision with root package name */
            public int f54883p;

            /* renamed from: r, reason: collision with root package name */
            public Object f54885r;

            public a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f54882o = obj;
                this.f54883p |= Integer.MIN_VALUE;
                return i.this.emit(null, this);
            }
        }

        public i(Function2 function2, InterfaceC5322g interfaceC5322g) {
            this.f54879a = function2;
            this.f54880b = interfaceC5322g;
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x0078, code lost:
        
            if (r2.emit(r9, r0) == r1) goto L24;
         */
        /* JADX WARN: Removed duplicated region for block: B:12:0x007e  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0081  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x006b  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x007b  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0046  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
        @Override // kotlinx.coroutines.flow.InterfaceC5322g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object emit(Object obj, Continuation continuation) {
            a aVar;
            int i10;
            boolean z10;
            Object obj2;
            Object obj3;
            i iVar;
            if (continuation instanceof a) {
                aVar = (a) continuation;
                int i11 = aVar.f54883p;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    aVar.f54883p = i11 - Integer.MIN_VALUE;
                    Object obj4 = aVar.f54882o;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i10 = aVar.f54883p;
                    z10 = true;
                    if (i10 != 0) {
                        ResultKt.throwOnFailure(obj4);
                        Function2 function2 = this.f54879a;
                        aVar.f54881n = this;
                        aVar.f54885r = obj;
                        aVar.f54883p = 1;
                        InlineMarker.mark(6);
                        Object invoke = function2.invoke(obj, aVar);
                        InlineMarker.mark(7);
                        if (invoke != coroutine_suspended) {
                            obj2 = invoke;
                            obj3 = obj;
                            iVar = this;
                        }
                        return coroutine_suspended;
                    }
                    if (i10 != 1) {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        iVar = (i) aVar.f54881n;
                        ResultKt.throwOnFailure(obj4);
                        if (z10) {
                            return Unit.INSTANCE;
                        }
                        throw new C5325a(iVar);
                    }
                    Object obj5 = aVar.f54885r;
                    i iVar2 = (i) aVar.f54881n;
                    ResultKt.throwOnFailure(obj4);
                    obj3 = obj5;
                    iVar = iVar2;
                    obj2 = obj4;
                    if (((Boolean) obj2).booleanValue()) {
                        z10 = false;
                    } else {
                        InterfaceC5322g interfaceC5322g = iVar.f54880b;
                        aVar.f54881n = iVar;
                        aVar.f54885r = null;
                        aVar.f54883p = 2;
                    }
                    if (z10) {
                    }
                }
            }
            aVar = new a(continuation);
            Object obj42 = aVar.f54882o;
            Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i10 = aVar.f54883p;
            z10 = true;
            if (i10 != 0) {
            }
            if (((Boolean) obj2).booleanValue()) {
            }
            if (z10) {
            }
        }
    }

    public static final InterfaceC5321f b(InterfaceC5321f interfaceC5321f, int i10) {
        if (i10 >= 0) {
            return new a(interfaceC5321f, i10);
        }
        throw new IllegalArgumentException(("Drop count should be non-negative, but had " + i10).toString());
    }

    public static final InterfaceC5321f c(InterfaceC5321f interfaceC5321f, Function2 function2) {
        return new c(interfaceC5321f, function2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(InterfaceC5322g interfaceC5322g, Object obj, Object obj2, Continuation continuation) {
        e eVar;
        int i10;
        if (continuation instanceof e) {
            eVar = (e) continuation;
            int i11 = eVar.f54859p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                eVar.f54859p = i11 - Integer.MIN_VALUE;
                Object obj3 = eVar.f54858o;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = eVar.f54859p;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj3);
                    eVar.f54857n = obj2;
                    eVar.f54859p = 1;
                    if (interfaceC5322g.emit(obj, eVar) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj2 = eVar.f54857n;
                    ResultKt.throwOnFailure(obj3);
                }
                throw new C5325a(obj2);
            }
        }
        eVar = new e(continuation);
        Object obj32 = eVar.f54858o;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = eVar.f54859p;
        if (i10 != 0) {
        }
        throw new C5325a(obj2);
    }

    public static final InterfaceC5321f e(InterfaceC5321f interfaceC5321f, int i10) {
        if (i10 > 0) {
            return new f(interfaceC5321f, i10);
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " should be positive").toString());
    }

    public static final InterfaceC5321f f(InterfaceC5321f interfaceC5321f, Function2 function2) {
        return new h(interfaceC5321f, function2);
    }
}
