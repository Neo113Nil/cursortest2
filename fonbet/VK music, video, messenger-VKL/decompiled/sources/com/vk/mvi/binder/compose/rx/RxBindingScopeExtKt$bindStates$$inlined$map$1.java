package com.vk.mvi.binder.compose.rx;

import kotlin.a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.b6l;
import xsna.izs;
import xsna.ksr;
import xsna.lm50;
import xsna.lsr;
import xsna.nb9;
import xsna.s3q0;
import xsna.spj;

/* compiled from: SafeCollector.common.kt */
/* loaded from: classes3.dex */
public final class RxBindingScopeExtKt$bindStates$$inlined$map$1 implements ksr<Object> {
    public final /* synthetic */ nb9 b;
    public final /* synthetic */ izs c;

    /* compiled from: Emitters.kt */
    /* renamed from: com.vk.mvi.binder.compose.rx.RxBindingScopeExtKt$bindStates$$inlined$map$1$2, reason: invalid class name */
    public static final class AnonymousClass2<T> implements lsr {
        public final /* synthetic */ lsr b;
        public final /* synthetic */ izs c;

        @b6l(c = "com.vk.mvi.binder.compose.rx.RxBindingScopeExtKt$bindStates$$inlined$map$1$2", f = "RxBindingScopeExt.kt", l = {50}, m = "emit")
        /* renamed from: com.vk.mvi.binder.compose.rx.RxBindingScopeExtKt$bindStates$$inlined$map$1$2$1, reason: invalid class name */
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
                        a.a(obj2);
                        Object invoke = this.c.invoke((lm50) obj);
                        anonymousClass1.label = 1;
                        if (this.b.emit(invoke, anonymousClass1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        a.a(obj2);
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

    public RxBindingScopeExtKt$bindStates$$inlined$map$1(nb9 nb9Var, izs izsVar) {
        this.b = nb9Var;
        this.c = izsVar;
    }

    @Override // xsna.ksr
    public final Object collect(lsr<? super Object> lsrVar, spj spjVar) {
        Object collect = this.b.collect(new AnonymousClass2(lsrVar, this.c), spjVar);
        return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : s3q0.a;
    }
}
