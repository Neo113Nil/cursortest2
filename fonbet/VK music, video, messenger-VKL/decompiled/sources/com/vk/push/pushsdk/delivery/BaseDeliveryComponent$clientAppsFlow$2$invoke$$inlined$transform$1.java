package com.vk.push.pushsdk.delivery;

import com.vungle.ads.internal.protos.Sdk;
import java.util.Iterator;
import java.util.List;
import kotlin.a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b6l;
import xsna.e790;
import xsna.ksr;
import xsna.lsr;
import xsna.rc6;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;

/* compiled from: Emitters.kt */
@b6l(c = "com.vk.push.pushsdk.delivery.BaseDeliveryComponent$clientAppsFlow$2$invoke$$inlined$transform$1", f = "BaseDeliveryComponent.kt", l = {40}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class BaseDeliveryComponent$clientAppsFlow$2$invoke$$inlined$transform$1 extends SuspendLambda implements wzs<lsr<? super e790>, spj<? super s3q0>, Object> {
    final /* synthetic */ ksr $this_transform;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ rc6 this$0;

    /* compiled from: Emitters.kt */
    /* renamed from: com.vk.push.pushsdk.delivery.BaseDeliveryComponent$clientAppsFlow$2$invoke$$inlined$transform$1$1, reason: invalid class name */
    public static final class AnonymousClass1<T> implements lsr {
        public final /* synthetic */ lsr<e790> b;
        public final /* synthetic */ rc6 c;

        /* compiled from: Emitters.kt */
        @b6l(c = "com.vk.push.pushsdk.delivery.BaseDeliveryComponent$clientAppsFlow$2$invoke$$inlined$transform$1$1", f = "BaseDeliveryComponent.kt", l = {Sdk.SDKError.Reason.PRIVACY_ICON_FALLBACK_ERROR_VALUE}, m = "emit")
        /* renamed from: com.vk.push.pushsdk.delivery.BaseDeliveryComponent$clientAppsFlow$2$invoke$$inlined$transform$1$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C17341 extends ContinuationImpl {
            Object L$0;
            Object L$1;
            Object L$2;
            int label;
            /* synthetic */ Object result;

            public C17341(spj spjVar) {
                super(spjVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return AnonymousClass1.this.emit(null, this);
            }
        }

        public AnonymousClass1(lsr lsrVar, rc6 rc6Var) {
            this.c = rc6Var;
            this.b = lsrVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0050  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x003b  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        @Override // xsna.lsr
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(T t, spj<? super s3q0> spjVar) {
            C17341 c17341;
            int i;
            Iterator<T> it;
            AnonymousClass1<T> anonymousClass1;
            lsr<e790> lsrVar;
            if (spjVar instanceof C17341) {
                c17341 = (C17341) spjVar;
                int i2 = c17341.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    c17341.label = i2 - Integer.MIN_VALUE;
                    Object obj = c17341.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = c17341.label;
                    if (i != 0) {
                        a.a(obj);
                        it = ((List) t).iterator();
                        anonymousClass1 = this;
                        lsrVar = this.b;
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        it = (Iterator) c17341.L$2;
                        lsrVar = (lsr) c17341.L$1;
                        anonymousClass1 = (AnonymousClass1) c17341.L$0;
                        a.a(obj);
                    }
                    while (it.hasNext()) {
                        e790 e790Var = (e790) it.next();
                        if (e790Var.d == null) {
                            c17341.L$0 = anonymousClass1;
                            c17341.L$1 = lsrVar;
                            c17341.L$2 = it;
                            c17341.label = 1;
                            if (lsrVar.emit(e790Var, c17341) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        } else {
                            anonymousClass1.c.a(e790Var.b);
                        }
                    }
                    return s3q0.a;
                }
            }
            c17341 = new C17341(spjVar);
            Object obj2 = c17341.result;
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            i = c17341.label;
            if (i != 0) {
            }
            while (it.hasNext()) {
            }
            return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseDeliveryComponent$clientAppsFlow$2$invoke$$inlined$transform$1(ksr ksrVar, spj spjVar, rc6 rc6Var) {
        super(2, spjVar);
        this.$this_transform = ksrVar;
        this.this$0 = rc6Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        BaseDeliveryComponent$clientAppsFlow$2$invoke$$inlined$transform$1 baseDeliveryComponent$clientAppsFlow$2$invoke$$inlined$transform$1 = new BaseDeliveryComponent$clientAppsFlow$2$invoke$$inlined$transform$1(this.$this_transform, spjVar, this.this$0);
        baseDeliveryComponent$clientAppsFlow$2$invoke$$inlined$transform$1.L$0 = obj;
        return baseDeliveryComponent$clientAppsFlow$2$invoke$$inlined$transform$1;
    }

    @Override // xsna.wzs
    public final Object invoke(lsr<? super e790> lsrVar, spj<? super s3q0> spjVar) {
        return ((BaseDeliveryComponent$clientAppsFlow$2$invoke$$inlined$transform$1) create(lsrVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            a.a(obj);
            lsr lsrVar = (lsr) this.L$0;
            ksr ksrVar = this.$this_transform;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(lsrVar, this.this$0);
            this.label = 1;
            if (ksrVar.collect(anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a.a(obj);
        }
        return s3q0.a;
    }
}
