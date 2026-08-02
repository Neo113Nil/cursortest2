package com.vk.donut.video.subscription.impl;

import com.vk.donut.video.subscription.impl.model.CachedSubscription;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.a3o;
import xsna.b6l;
import xsna.caj0;
import xsna.ksr;
import xsna.lsr;
import xsna.s3q0;
import xsna.spj;

/* compiled from: SafeCollector.common.kt */
/* loaded from: classes.dex */
public final class DonutSubscriptionManagerImpl$init$$inlined$map$1 implements ksr<List<? extends CachedSubscription>> {
    public final /* synthetic */ ksr b;
    public final /* synthetic */ DonutSubscriptionManagerImpl c;

    /* compiled from: Emitters.kt */
    /* renamed from: com.vk.donut.video.subscription.impl.DonutSubscriptionManagerImpl$init$$inlined$map$1$2, reason: invalid class name */
    public static final class AnonymousClass2<T> implements lsr {
        public final /* synthetic */ lsr b;
        public final /* synthetic */ DonutSubscriptionManagerImpl c;

        @b6l(c = "com.vk.donut.video.subscription.impl.DonutSubscriptionManagerImpl$init$$inlined$map$1$2", f = "DonutSubscriptionManagerImpl.kt", l = {51, 50}, m = "emit")
        /* renamed from: com.vk.donut.video.subscription.impl.DonutSubscriptionManagerImpl$init$$inlined$map$1$2$1, reason: invalid class name */
        /* loaded from: classes18.dex */
        public static final class AnonymousClass1 extends ContinuationImpl {
            int I$0;
            int I$1;
            Object L$0;
            Object L$1;
            Object L$2;
            Object L$3;
            Object L$4;
            Object L$5;
            Object L$6;
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

        public AnonymousClass2(lsr lsrVar, DonutSubscriptionManagerImpl donutSubscriptionManagerImpl) {
            this.b = lsrVar;
            this.c = donutSubscriptionManagerImpl;
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0095, code lost:
        
            if (r2.emit(r9, r0) != r1) goto L23;
         */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
        @Override // xsna.lsr
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, spj spjVar) {
            AnonymousClass1 anonymousClass1;
            int i;
            int i2;
            lsr lsrVar;
            if (spjVar instanceof AnonymousClass1) {
                anonymousClass1 = (AnonymousClass1) spjVar;
                int i3 = anonymousClass1.label;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    anonymousClass1.label = i3 - Integer.MIN_VALUE;
                    Object obj2 = anonymousClass1.result;
                    Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = anonymousClass1.label;
                    if (i != 0) {
                        kotlin.a.a(obj2);
                        a3o a3oVar = this.c.a;
                        anonymousClass1.L$0 = null;
                        anonymousClass1.L$1 = null;
                        anonymousClass1.L$2 = null;
                        anonymousClass1.L$3 = null;
                        lsr lsrVar2 = this.b;
                        anonymousClass1.L$4 = lsrVar2;
                        anonymousClass1.L$5 = null;
                        anonymousClass1.L$6 = null;
                        anonymousClass1.I$0 = 0;
                        anonymousClass1.I$1 = 0;
                        anonymousClass1.label = 1;
                        Object c = a3oVar.c(anonymousClass1);
                        if (c != obj3) {
                            obj2 = c;
                            i2 = 0;
                            lsrVar = lsrVar2;
                        }
                        return obj3;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.a.a(obj2);
                        return s3q0.a;
                    }
                    i2 = anonymousClass1.I$0;
                    lsr lsrVar3 = (lsr) anonymousClass1.L$4;
                    kotlin.a.a(obj2);
                    lsrVar = lsrVar3;
                    anonymousClass1.L$0 = null;
                    anonymousClass1.L$1 = null;
                    anonymousClass1.L$2 = null;
                    anonymousClass1.L$3 = null;
                    anonymousClass1.L$4 = null;
                    anonymousClass1.L$5 = null;
                    anonymousClass1.L$6 = null;
                    anonymousClass1.I$0 = i2;
                    anonymousClass1.label = 2;
                }
            }
            anonymousClass1 = new AnonymousClass1(spjVar);
            Object obj22 = anonymousClass1.result;
            Object obj32 = CoroutineSingletons.COROUTINE_SUSPENDED;
            i = anonymousClass1.label;
            if (i != 0) {
            }
            anonymousClass1.L$0 = null;
            anonymousClass1.L$1 = null;
            anonymousClass1.L$2 = null;
            anonymousClass1.L$3 = null;
            anonymousClass1.L$4 = null;
            anonymousClass1.L$5 = null;
            anonymousClass1.L$6 = null;
            anonymousClass1.I$0 = i2;
            anonymousClass1.label = 2;
        }
    }

    public DonutSubscriptionManagerImpl$init$$inlined$map$1(caj0 caj0Var, DonutSubscriptionManagerImpl donutSubscriptionManagerImpl) {
        this.b = caj0Var;
        this.c = donutSubscriptionManagerImpl;
    }

    @Override // xsna.ksr
    public final Object collect(lsr<? super List<? extends CachedSubscription>> lsrVar, spj spjVar) {
        Object collect = this.b.collect(new AnonymousClass2(lsrVar, this.c), spjVar);
        return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : s3q0.a;
    }
}
