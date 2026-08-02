package com.vk.push.pushsdk.domain.interactor;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.b6l;
import xsna.ksr;
import xsna.lsr;
import xsna.s3q0;
import xsna.spj;
import xsna.ztr;

/* compiled from: SafeCollector.common.kt */
/* loaded from: classes5.dex */
public final class StopPushServiceInteractor$invoke$$inlined$filter$1 implements ksr<Boolean> {
    public final /* synthetic */ ztr b;

    /* compiled from: Emitters.kt */
    /* renamed from: com.vk.push.pushsdk.domain.interactor.StopPushServiceInteractor$invoke$$inlined$filter$1$2, reason: invalid class name */
    public static final class AnonymousClass2<T> implements lsr {
        public final /* synthetic */ lsr b;

        /* compiled from: Emitters.kt */
        @b6l(c = "com.vk.push.pushsdk.domain.interactor.StopPushServiceInteractor$invoke$$inlined$filter$1$2", f = "StopPushServiceInteractor.kt", l = {Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "emit")
        /* renamed from: com.vk.push.pushsdk.domain.interactor.StopPushServiceInteractor$invoke$$inlined$filter$1$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends ContinuationImpl {
            Object L$0;
            Object L$1;
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

        public AnonymousClass2(lsr lsrVar) {
            this.b = lsrVar;
        }

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
                        if (((Boolean) obj).booleanValue()) {
                            anonymousClass1.label = 1;
                            if (this.b.emit(obj, anonymousClass1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
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

    public StopPushServiceInteractor$invoke$$inlined$filter$1(ztr ztrVar) {
        this.b = ztrVar;
    }

    @Override // xsna.ksr
    public final Object collect(lsr<? super Boolean> lsrVar, spj spjVar) {
        Object collect = this.b.collect(new AnonymousClass2(lsrVar), spjVar);
        return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : s3q0.a;
    }
}
