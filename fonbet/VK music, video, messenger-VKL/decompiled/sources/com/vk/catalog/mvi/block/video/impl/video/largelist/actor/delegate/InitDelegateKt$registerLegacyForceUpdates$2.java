package com.vk.catalog.mvi.block.video.impl.video.largelist.actor.delegate;

import com.vk.libvideo.pip.VideoPipStateHolder;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.ars0;
import xsna.b6l;
import xsna.cdn;
import xsna.ksr;
import xsna.lsr;
import xsna.rsr;
import xsna.s3q0;
import xsna.spj;
import xsna.u4u;
import xsna.wzs;
import xsna.ysg0;
import xsna.yvj;

/* compiled from: InitDelegate.kt */
@b6l(c = "com.vk.catalog.mvi.block.video.impl.video.largelist.actor.delegate.InitDelegateKt$registerLegacyForceUpdates$2", f = "InitDelegate.kt", l = {Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE}, m = "invokeSuspend")
/* loaded from: classes16.dex */
public final class InitDelegateKt$registerLegacyForceUpdates$2 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ ars0 $this_registerLegacyForceUpdates;
    int label;

    /* compiled from: InitDelegate.kt */
    public static final class a<T> implements lsr {
        public final /* synthetic */ ars0 b;

        public a(ars0 ars0Var) {
            this.b = ars0Var;
        }

        @Override // xsna.lsr
        public final Object emit(Object obj, spj spjVar) {
            this.b.m(new u4u(5));
            return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitDelegateKt$registerLegacyForceUpdates$2(ars0 ars0Var, spj<? super InitDelegateKt$registerLegacyForceUpdates$2> spjVar) {
        super(2, spjVar);
        this.$this_registerLegacyForceUpdates = ars0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new InitDelegateKt$registerLegacyForceUpdates$2(this.$this_registerLegacyForceUpdates, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((InitDelegateKt$registerLegacyForceUpdates$2) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            final InitDelegateKt$registerLegacyForceUpdates$2$invokeSuspend$$inlined$filterIsInstance$1 initDelegateKt$registerLegacyForceUpdates$2$invokeSuspend$$inlined$filterIsInstance$1 = new InitDelegateKt$registerLegacyForceUpdates$2$invokeSuspend$$inlined$filterIsInstance$1(cdn.a(ysg0.b.a));
            ksr l = rsr.l(new ksr<VideoPipStateHolder.State>() { // from class: com.vk.catalog.mvi.block.video.impl.video.largelist.actor.delegate.InitDelegateKt$registerLegacyForceUpdates$2$invokeSuspend$$inlined$filter$1

                /* compiled from: Emitters.kt */
                /* renamed from: com.vk.catalog.mvi.block.video.impl.video.largelist.actor.delegate.InitDelegateKt$registerLegacyForceUpdates$2$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements lsr {
                    public final /* synthetic */ lsr b;

                    @b6l(c = "com.vk.catalog.mvi.block.video.impl.video.largelist.actor.delegate.InitDelegateKt$registerLegacyForceUpdates$2$invokeSuspend$$inlined$filter$1$2", f = "InitDelegate.kt", l = {50}, m = "emit")
                    /* renamed from: com.vk.catalog.mvi.block.video.impl.video.largelist.actor.delegate.InitDelegateKt$registerLegacyForceUpdates$2$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
                    public static final class AnonymousClass1 extends ContinuationImpl {
                        int I$0;
                        Object L$0;
                        Object L$1;
                        Object L$2;
                        Object L$3;
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

                    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
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
                                    VideoPipStateHolder.State state = (VideoPipStateHolder.State) obj;
                                    if (state == VideoPipStateHolder.State.NONE || state == VideoPipStateHolder.State.OPENED) {
                                        anonymousClass1.L$0 = null;
                                        anonymousClass1.L$1 = null;
                                        anonymousClass1.L$2 = null;
                                        anonymousClass1.L$3 = null;
                                        anonymousClass1.I$0 = 0;
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

                @Override // xsna.ksr
                public final Object collect(lsr<? super VideoPipStateHolder.State> lsrVar, spj spjVar) {
                    Object collect = InitDelegateKt$registerLegacyForceUpdates$2$invokeSuspend$$inlined$filterIsInstance$1.this.collect(new AnonymousClass2(lsrVar), spjVar);
                    return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : s3q0.a;
                }
            });
            a aVar = new a(this.$this_registerLegacyForceUpdates);
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
