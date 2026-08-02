package com.vk.movika.sdk.utils;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.b6l;
import xsna.ksr;
import xsna.lsr;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;
import xsna.yzs;

@b6l(c = "com.vk.movika.sdk.utils.TransformExtKt$scanWithExtractInitial$1", f = "TransformExt.kt", l = {13}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class j extends SuspendLambda implements wzs<lsr<Object>, spj<? super s3q0>, Object> {
    final /* synthetic */ wzs<Object, spj<Object>, Object> $initExtractor;
    final /* synthetic */ yzs<Object, Object, spj<Object>, Object> $operation;
    final /* synthetic */ ksr<Object> $this_scanWithExtractInitial;
    private /* synthetic */ Object L$0;
    int label;

    public static final class a<T> implements lsr {
        public final /* synthetic */ Ref$ObjectRef<Object> b;
        public final /* synthetic */ wzs<T, spj<Object>, Object> c;
        public final /* synthetic */ yzs<Object, T, spj<Object>, Object> d;
        public final /* synthetic */ lsr<Object> e;

        @b6l(c = "com.vk.movika.sdk.utils.TransformExtKt$scanWithExtractInitial$1$1", f = "TransformExt.kt", l = {15, 17, 19}, m = "emit")
        /* renamed from: com.vk.movika.sdk.utils.j$a$a, reason: collision with other inner class name */
        public static final class C1315a extends ContinuationImpl {
            Object L$0;
            Object L$1;
            int label;
            /* synthetic */ Object result;
            final /* synthetic */ a<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C1315a(a<? super T> aVar, spj<? super C1315a> spjVar) {
                super(spjVar);
                this.this$0 = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return this.this$0.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(Ref$ObjectRef<Object> ref$ObjectRef, wzs<? super T, ? super spj<Object>, ? extends Object> wzsVar, yzs<Object, ? super T, ? super spj<Object>, ? extends Object> yzsVar, lsr<Object> lsrVar) {
            this.b = ref$ObjectRef;
            this.c = wzsVar;
            this.d = yzsVar;
            this.e = lsrVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x007d, code lost:
        
            if (r8.emit(r9, r0) != r1) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x007f, code lost:
        
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0058, code lost:
        
            if (r8 == r1) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0066, code lost:
        
            r9 = (T) r8;
            r8 = r9;
            r2 = r7;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0063, code lost:
        
            if (r8 == r1) goto L28;
         */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0041  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
        @Override // xsna.lsr
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(T t, spj<? super s3q0> spjVar) {
            C1315a c1315a;
            int i;
            Object invoke;
            Ref$ObjectRef<Object> ref$ObjectRef;
            a<T> aVar;
            if (spjVar instanceof C1315a) {
                c1315a = (C1315a) spjVar;
                int i2 = c1315a.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    c1315a.label = i2 - Integer.MIN_VALUE;
                    T t2 = (T) c1315a.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = c1315a.label;
                    if (i != 0) {
                        kotlin.a.a(t2);
                        Ref$ObjectRef<Object> ref$ObjectRef2 = this.b;
                        Object obj = ref$ObjectRef2.element;
                        g gVar = g.a;
                        c1315a.L$0 = this;
                        c1315a.L$1 = ref$ObjectRef2;
                        if (obj == gVar) {
                            c1315a.label = 1;
                            invoke = this.c.invoke(t, c1315a);
                        } else {
                            c1315a.label = 2;
                            invoke = this.d.invoke(obj, t, c1315a);
                        }
                    } else {
                        if (i != 1 && i != 2) {
                            if (i != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            kotlin.a.a(t2);
                            return s3q0.a;
                        }
                        ref$ObjectRef = (Ref$ObjectRef) c1315a.L$1;
                        aVar = (a) c1315a.L$0;
                        kotlin.a.a(t2);
                    }
                    ref$ObjectRef.element = t2;
                    lsr<Object> lsrVar = aVar.e;
                    Object obj2 = aVar.b.element;
                    c1315a.L$0 = null;
                    c1315a.L$1 = null;
                    c1315a.label = 3;
                }
            }
            c1315a = new C1315a(this, spjVar);
            T t22 = (T) c1315a.result;
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            i = c1315a.label;
            if (i != 0) {
            }
            ref$ObjectRef.element = t22;
            lsr<Object> lsrVar2 = aVar.e;
            Object obj22 = aVar.b.element;
            c1315a.L$0 = null;
            c1315a.L$1 = null;
            c1315a.label = 3;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public j(ksr<Object> ksrVar, wzs<Object, ? super spj<Object>, ? extends Object> wzsVar, yzs<Object, Object, ? super spj<Object>, ? extends Object> yzsVar, spj<? super j> spjVar) {
        super(2, spjVar);
        this.$this_scanWithExtractInitial = ksrVar;
        this.$initExtractor = wzsVar;
        this.$operation = yzsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        j jVar = new j(this.$this_scanWithExtractInitial, this.$initExtractor, this.$operation, spjVar);
        jVar.L$0 = obj;
        return jVar;
    }

    @Override // xsna.wzs
    public final Object invoke(lsr<Object> lsrVar, spj<? super s3q0> spjVar) {
        return ((j) create(lsrVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [T, com.vk.movika.sdk.utils.g] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            lsr lsrVar = (lsr) this.L$0;
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            ref$ObjectRef.element = g.a;
            ksr<Object> ksrVar = this.$this_scanWithExtractInitial;
            a aVar = new a(ref$ObjectRef, this.$initExtractor, this.$operation, lsrVar);
            this.label = 1;
            if (ksrVar.collect(aVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        return s3q0.a;
    }
}
