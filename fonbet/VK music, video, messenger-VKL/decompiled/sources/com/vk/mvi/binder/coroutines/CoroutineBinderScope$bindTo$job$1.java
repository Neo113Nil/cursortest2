package com.vk.mvi.binder.coroutines;

import com.vk.mvi.binder.BinderLifecycleMode;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b6l;
import xsna.izs;
import xsna.ksr;
import xsna.lm50;
import xsna.lsr;
import xsna.myc0;
import xsna.ptk0;
import xsna.rsr;
import xsna.s3q0;
import xsna.spj;
import xsna.wo1;
import xsna.wzs;
import xsna.yvj;

/* compiled from: CoroutineBinder.kt */
@b6l(c = "com.vk.mvi.binder.coroutines.CoroutineBinderScope$bindTo$job$1", f = "CoroutineBinder.kt", l = {83}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class CoroutineBinderScope$bindTo$job$1 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ d $consumeContext;
    final /* synthetic */ BinderLifecycleMode $lifecycleMode;
    final /* synthetic */ ptk0<Object> $stateConsumer;
    final /* synthetic */ izs<Object, Object> $stateTransform;
    final /* synthetic */ ksr<Object> $this_bindTo;
    int label;

    /* compiled from: CoroutineBinder.kt */
    public static final class a<T> implements lsr {
        public final /* synthetic */ d b;
        public final /* synthetic */ BinderLifecycleMode c;
        public final /* synthetic */ ptk0<Object> d;

        public a(d dVar, BinderLifecycleMode binderLifecycleMode, ptk0<Object> ptk0Var) {
            this.b = dVar;
            this.c = binderLifecycleMode;
            this.d = ptk0Var;
        }

        @Override // xsna.lsr
        public final Object emit(Object obj, spj spjVar) {
            lm50 lm50Var = (lm50) obj;
            ptk0<Object> ptk0Var = this.d;
            BinderLifecycleMode binderLifecycleMode = this.c;
            d dVar = this.b;
            if (dVar != null) {
                Object k = myc0.k(dVar, new com.vk.mvi.binder.coroutines.a(binderLifecycleMode, ptk0Var, lm50Var, null), spjVar);
                return k == CoroutineSingletons.COROUTINE_SUSPENDED ? k : s3q0.a;
            }
            binderLifecycleMode.a(new wo1(4, ptk0Var, lm50Var));
            return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineBinderScope$bindTo$job$1(ksr<Object> ksrVar, izs<Object, Object> izsVar, d dVar, BinderLifecycleMode binderLifecycleMode, ptk0<Object> ptk0Var, spj<? super CoroutineBinderScope$bindTo$job$1> spjVar) {
        super(2, spjVar);
        this.$this_bindTo = ksrVar;
        this.$stateTransform = izsVar;
        this.$consumeContext = dVar;
        this.$lifecycleMode = binderLifecycleMode;
        this.$stateConsumer = ptk0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new CoroutineBinderScope$bindTo$job$1(this.$this_bindTo, this.$stateTransform, this.$consumeContext, this.$lifecycleMode, this.$stateConsumer, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((CoroutineBinderScope$bindTo$job$1) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            final ksr<Object> ksrVar = this.$this_bindTo;
            final izs<Object, Object> izsVar = this.$stateTransform;
            ksr l = rsr.l(new ksr<Object>() { // from class: com.vk.mvi.binder.coroutines.CoroutineBinderScope$bindTo$job$1$invokeSuspend$$inlined$map$1

                /* compiled from: Emitters.kt */
                /* renamed from: com.vk.mvi.binder.coroutines.CoroutineBinderScope$bindTo$job$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements lsr {
                    public final /* synthetic */ lsr b;
                    public final /* synthetic */ izs c;

                    @b6l(c = "com.vk.mvi.binder.coroutines.CoroutineBinderScope$bindTo$job$1$invokeSuspend$$inlined$map$1$2", f = "CoroutineBinder.kt", l = {50}, m = "emit")
                    /* renamed from: com.vk.mvi.binder.coroutines.CoroutineBinderScope$bindTo$job$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                    public static final class AnonymousClass1 extends ContinuationImpl {
                        Object L$0;
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(spj spjVar) {
                            super(spjVar);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(lsr lsrVar, izs izsVar) {
                        this.b = lsrVar;
                        this.c = izsVar;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
                    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
                    @Override // xsna.lsr
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object emit(Object obj, spj spjVar) {
                        AnonymousClass1 anonymousClass1;
                        int i;
                        if (spjVar instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) spjVar;
                            int i2 = anonymousClass1.label;
                            if ((i2 & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.label = i2 - Integer.MIN_VALUE;
                                Object obj2 = anonymousClass1.result;
                                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                                i = anonymousClass1.label;
                                if (i != 0) {
                                    kotlin.a.a(obj2);
                                    Object invoke = this.c.invoke((lm50) obj);
                                    anonymousClass1.label = 1;
                                    if (this.b.emit(invoke, anonymousClass1) == coroutineSingletons) {
                                        return coroutineSingletons;
                                    }
                                } else {
                                    if (i != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    kotlin.a.a(obj2);
                                }
                                return s3q0.a;
                            }
                        }
                        anonymousClass1 = new AnonymousClass1(spjVar);
                        Object obj22 = anonymousClass1.result;
                        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i = anonymousClass1.label;
                        if (i != 0) {
                        }
                        return s3q0.a;
                    }
                }

                @Override // xsna.ksr
                public final Object collect(lsr<? super Object> lsrVar, spj spjVar) {
                    Object collect = ksr.this.collect(new AnonymousClass2(lsrVar, izsVar), spjVar);
                    return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : s3q0.a;
                }
            });
            a aVar = new a(this.$consumeContext, this.$lifecycleMode, this.$stateConsumer);
            this.label = 1;
            if (l.collect(aVar, this) == coroutineSingletons) {
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
