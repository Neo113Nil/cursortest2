package com.vk.push.pushsdk.domain.interactor;

import com.vk.push.common.Logger;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import xsna.b6l;
import xsna.bdn;
import xsna.gzs;
import xsna.ksr;
import xsna.lsr;
import xsna.os9;
import xsna.ovj;
import xsna.rsr;
import xsna.s3q0;
import xsna.ske0;
import xsna.spj;
import xsna.wgl;
import xsna.wzs;
import xsna.yvj;
import xsna.yzs;
import xsna.ztr;

/* compiled from: StopPushServiceInteractor.kt */
/* loaded from: classes5.dex */
public final class StopPushServiceInteractor {
    public final ksr<Boolean> a;
    public final os9 b;
    public final ovj c;
    public final Logger d;

    /* compiled from: StopPushServiceInteractor.kt */
    @b6l(c = "com.vk.push.pushsdk.domain.interactor.StopPushServiceInteractor$invoke$1", f = "StopPushServiceInteractor.kt", l = {}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements yzs<Integer, Boolean, spj<? super Boolean>, Object> {
        /* synthetic */ int I$0;
        /* synthetic */ boolean Z$0;
        int label;

        public a(spj<? super a> spjVar) {
            super(3, spjVar);
        }

        @Override // xsna.yzs
        public final Object invoke(Integer num, Boolean bool, spj<? super Boolean> spjVar) {
            int intValue = num.intValue();
            boolean booleanValue = bool.booleanValue();
            a aVar = StopPushServiceInteractor.this.new a(spjVar);
            aVar.I$0 = intValue;
            aVar.Z$0 = booleanValue;
            return aVar.invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            int i = this.I$0;
            boolean z = this.Z$0;
            Logger.DefaultImpls.info$default(StopPushServiceInteractor.this.d, "Push tokens count = " + i + ", need to stop = " + z, null, 2, null);
            return Boolean.valueOf(i == 0 && z);
        }
    }

    /* compiled from: StopPushServiceInteractor.kt */
    @b6l(c = "com.vk.push.pushsdk.domain.interactor.StopPushServiceInteractor$invoke$4", f = "StopPushServiceInteractor.kt", l = {}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements wzs<s3q0, spj<? super s3q0>, Object> {
        final /* synthetic */ gzs<s3q0> $onStopPushService;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(gzs<s3q0> gzsVar, spj<? super b> spjVar) {
            super(2, spjVar);
            this.$onStopPushService = gzsVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return StopPushServiceInteractor.this.new b(this.$onStopPushService, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(s3q0 s3q0Var, spj<? super s3q0> spjVar) {
            return ((b) create(s3q0Var, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            Logger.DefaultImpls.info$default(StopPushServiceInteractor.this.d, "Stop push service", null, 2, null);
            this.$onStopPushService.invoke();
            return s3q0.a;
        }
    }

    public StopPushServiceInteractor() {
        throw null;
    }

    public StopPushServiceInteractor(ksr ksrVar, os9 os9Var, Logger logger) {
        bdn bdnVar = bdn.a;
        wgl wglVar = wgl.c;
        this.a = ksrVar;
        this.b = os9Var;
        this.c = wglVar;
        this.d = logger.createLogger(this);
    }

    public final void a(yvj yvjVar, gzs<s3q0> gzsVar) {
        final StopPushServiceInteractor$invoke$$inlined$filter$1 stopPushServiceInteractor$invoke$$inlined$filter$1 = new StopPushServiceInteractor$invoke$$inlined$filter$1(new ztr(rsr.l(((ske0) this.b.c).k()), this.a, new a(null)));
        rsr.s(rsr.q(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new ksr<s3q0>() { // from class: com.vk.push.pushsdk.domain.interactor.StopPushServiceInteractor$invoke$$inlined$map$1

            /* compiled from: Emitters.kt */
            /* renamed from: com.vk.push.pushsdk.domain.interactor.StopPushServiceInteractor$invoke$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements lsr {
                public final /* synthetic */ lsr b;

                /* compiled from: Emitters.kt */
                @b6l(c = "com.vk.push.pushsdk.domain.interactor.StopPushServiceInteractor$invoke$$inlined$map$1$2", f = "StopPushServiceInteractor.kt", l = {Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "emit")
                /* renamed from: com.vk.push.pushsdk.domain.interactor.StopPushServiceInteractor$invoke$$inlined$map$1$2$1, reason: invalid class name */
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
                                ((Boolean) obj).getClass();
                                s3q0 s3q0Var = s3q0.a;
                                anonymousClass1.label = 1;
                                if (this.b.emit(s3q0Var, anonymousClass1) == coroutineSingletons) {
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

            @Override // xsna.ksr
            public final Object collect(lsr<? super s3q0> lsrVar, spj spjVar) {
                Object collect = StopPushServiceInteractor$invoke$$inlined$filter$1.this.collect(new AnonymousClass2(lsrVar), spjVar);
                return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : s3q0.a;
            }
        }, new b(gzsVar, null)), this.c), yvjVar);
    }
}
