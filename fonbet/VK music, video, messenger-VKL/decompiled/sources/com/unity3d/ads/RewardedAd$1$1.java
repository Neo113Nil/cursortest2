package com.unity3d.ads;

import com.unity3d.ads.RewardedAd$1$1;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.AdObjectState;
import com.unity3d.ads.core.domain.SafeCallbackInvoke;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1;
import xsna.b6l;
import xsna.gzs;
import xsna.ksr;
import xsna.lsr;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;
import xsna.xh50;
import xsna.yvj;

/* compiled from: RewardedAd.kt */
@b6l(c = "com.unity3d.ads.RewardedAd$1$1", f = "RewardedAd.kt", l = {59}, m = "invokeSuspend")
/* loaded from: classes14.dex */
public final class RewardedAd$1$1 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    int label;
    final /* synthetic */ RewardedAd this$0;

    /* compiled from: RewardedAd.kt */
    /* renamed from: com.unity3d.ads.RewardedAd$1$1$2, reason: invalid class name */
    public static final class AnonymousClass2<T> implements lsr {
        final /* synthetic */ RewardedAd this$0;

        public AnonymousClass2(RewardedAd rewardedAd) {
            this.this$0 = rewardedAd;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final s3q0 emit$lambda$0(RewardedAd rewardedAd) {
            AdExpiredListener<RewardedAd> onAdExpired = rewardedAd.getOnAdExpired();
            if (onAdExpired != null) {
                onAdExpired.onAdExpired(rewardedAd);
            }
            return s3q0.a;
        }

        @Override // xsna.lsr
        public /* bridge */ /* synthetic */ Object emit(Object obj, spj spjVar) {
            return emit((AdObjectState) obj, (spj<? super s3q0>) spjVar);
        }

        public final Object emit(AdObjectState adObjectState, spj<? super s3q0> spjVar) {
            SafeCallbackInvoke safeCallbackInvoke;
            safeCallbackInvoke = this.this$0.safeCallbackInvoke;
            final RewardedAd rewardedAd = this.this$0;
            safeCallbackInvoke.invoke(new gzs() { // from class: com.unity3d.ads.d
                @Override // xsna.gzs
                public final Object invoke() {
                    s3q0 emit$lambda$0;
                    emit$lambda$0 = RewardedAd$1$1.AnonymousClass2.emit$lambda$0(RewardedAd.this);
                    return emit$lambda$0;
                }
            });
            return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RewardedAd$1$1(RewardedAd rewardedAd, spj<? super RewardedAd$1$1> spjVar) {
        super(2, spjVar);
        this.this$0 = rewardedAd;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new RewardedAd$1$1(this.this$0, spjVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        AdObject adObject;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            adObject = this.this$0.adObject;
            final xh50<AdObjectState> state = adObject.getState();
            final AdObjectState adObjectState = AdObjectState.EXPIRED;
            FlowKt__LimitKt$take$$inlined$unsafeFlow$1 flowKt__LimitKt$take$$inlined$unsafeFlow$1 = new FlowKt__LimitKt$take$$inlined$unsafeFlow$1(new ksr<AdObjectState>() { // from class: com.unity3d.ads.RewardedAd$1$1$invokeSuspend$$inlined$filter$1

                /* compiled from: Emitters.kt */
                /* renamed from: com.unity3d.ads.RewardedAd$1$1$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements lsr {
                    final /* synthetic */ lsr $this_unsafeFlow;
                    final /* synthetic */ AdObjectState receiver$inlined;

                    @b6l(c = "com.unity3d.ads.RewardedAd$1$1$invokeSuspend$$inlined$filter$1$2", f = "RewardedAd.kt", l = {50}, m = "emit")
                    /* renamed from: com.unity3d.ads.RewardedAd$1$1$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
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

                    public AnonymousClass2(lsr lsrVar, AdObjectState adObjectState) {
                        this.$this_unsafeFlow = lsrVar;
                        this.receiver$inlined = adObjectState;
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
                                    if (this.receiver$inlined.equals(obj)) {
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
                public Object collect(lsr<? super AdObjectState> lsrVar, spj spjVar) {
                    Object collect = ksr.this.collect(new AnonymousClass2(lsrVar, adObjectState), spjVar);
                    return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : s3q0.a;
                }
            });
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0);
            this.label = 1;
            if (flowKt__LimitKt$take$$inlined$unsafeFlow$1.collect(anonymousClass2, this) == coroutineSingletons) {
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

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((RewardedAd$1$1) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }
}
