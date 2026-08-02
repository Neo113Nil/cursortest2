package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.model.InitializationState;
import com.unity3d.ads.core.data.repository.SessionRepository;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b6l;
import xsna.ksr;
import xsna.lsr;
import xsna.rsr;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;
import xsna.yvj;

/* compiled from: CommonAwaitInitialization.kt */
@b6l(c = "com.unity3d.ads.core.domain.CommonAwaitInitialization$invoke$2", f = "CommonAwaitInitialization.kt", l = {15}, m = "invokeSuspend")
/* loaded from: classes14.dex */
public final class CommonAwaitInitialization$invoke$2 extends SuspendLambda implements wzs<yvj, spj<? super InitializationState>, Object> {
    int label;
    final /* synthetic */ CommonAwaitInitialization this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonAwaitInitialization$invoke$2(CommonAwaitInitialization commonAwaitInitialization, spj<? super CommonAwaitInitialization$invoke$2> spjVar) {
        super(2, spjVar);
        this.this$0 = commonAwaitInitialization;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new CommonAwaitInitialization$invoke$2(this.this$0, spjVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        SessionRepository sessionRepository;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            return obj;
        }
        kotlin.a.a(obj);
        sessionRepository = this.this$0.sessionRepository;
        final ksr<InitializationState> observeInitializationState = sessionRepository.getObserveInitializationState();
        ksr<InitializationState> ksrVar = new ksr<InitializationState>() { // from class: com.unity3d.ads.core.domain.CommonAwaitInitialization$invoke$2$invokeSuspend$$inlined$filter$1

            /* compiled from: Emitters.kt */
            /* renamed from: com.unity3d.ads.core.domain.CommonAwaitInitialization$invoke$2$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements lsr {
                final /* synthetic */ lsr $this_unsafeFlow;

                @b6l(c = "com.unity3d.ads.core.domain.CommonAwaitInitialization$invoke$2$invokeSuspend$$inlined$filter$1$2", f = "CommonAwaitInitialization.kt", l = {50}, m = "emit")
                /* renamed from: com.unity3d.ads.core.domain.CommonAwaitInitialization$invoke$2$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
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
                    this.$this_unsafeFlow = lsrVar;
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
                                kotlin.a.a(obj2);
                                lsr lsrVar = this.$this_unsafeFlow;
                                InitializationState initializationState = (InitializationState) obj;
                                if (initializationState == InitializationState.INITIALIZED || initializationState == InitializationState.FAILED) {
                                    anonymousClass1.label = 1;
                                    if (lsrVar.emit(obj, anonymousClass1) == coroutineSingletons) {
                                        return coroutineSingletons;
                                    }
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
            public Object collect(lsr<? super InitializationState> lsrVar, spj spjVar) {
                Object collect = ksr.this.collect(new AnonymousClass2(lsrVar), spjVar);
                return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : s3q0.a;
            }
        };
        this.label = 1;
        Object n = rsr.n(ksrVar, this);
        return n == coroutineSingletons ? coroutineSingletons : n;
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super InitializationState> spjVar) {
        return ((CommonAwaitInitialization$invoke$2) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }
}
