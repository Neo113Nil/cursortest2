package com.vk.video.ui.upload.impl.publish.presentation.publish.feature.store.delegate;

import com.vk.movika.sdk.base.observable.q;
import com.vk.video.ui.upload.impl.publish.presentation.publish.feature.entity.PublishState;
import kotlin.a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import xsna.b6l;
import xsna.cdn;
import xsna.d3q;
import xsna.gce0;
import xsna.hqu0;
import xsna.ksr;
import xsna.ln50;
import xsna.lsr;
import xsna.owr0;
import xsna.ree0;
import xsna.rsr;
import xsna.s3q0;
import xsna.spj;
import xsna.wjs0;
import xsna.wzs;
import xsna.y75;
import xsna.yvj;

/* compiled from: InitDelegate.kt */
@b6l(c = "com.vk.video.ui.upload.impl.publish.presentation.publish.feature.store.delegate.InitDelegateKt$initEventBusListener$1", f = "InitDelegate.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class InitDelegateKt$initEventBusListener$1 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ gce0 $this_initEventBusListener;
    private /* synthetic */ Object L$0;
    int label;

    /* compiled from: InitDelegate.kt */
    @b6l(c = "com.vk.video.ui.upload.impl.publish.presentation.publish.feature.store.delegate.InitDelegateKt$initEventBusListener$1$1", f = "InitDelegate.kt", l = {}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<owr0, spj<? super s3q0>, Object> {
        final /* synthetic */ gce0 $this_initEventBusListener;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(gce0 gce0Var, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$this_initEventBusListener = gce0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            a aVar = new a(this.$this_initEventBusListener, spjVar);
            aVar.L$0 = obj;
            return aVar;
        }

        @Override // xsna.wzs
        public final Object invoke(owr0 owr0Var, spj<? super s3q0> spjVar) {
            return ((a) create(owr0Var, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            owr0 owr0Var = (owr0) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            gce0 gce0Var = this.$this_initEventBusListener;
            owr0Var.getClass();
            if (((PublishState) gce0Var.b.getCurrentState()).l) {
                d3q.a(gce0Var, ree0.a, ln50.a.b, new q(gce0Var, 7), new y75(gce0Var, null, null));
            }
            return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitDelegateKt$initEventBusListener$1(gce0 gce0Var, spj<? super InitDelegateKt$initEventBusListener$1> spjVar) {
        super(2, spjVar);
        this.$this_initEventBusListener = gce0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        InitDelegateKt$initEventBusListener$1 initDelegateKt$initEventBusListener$1 = new InitDelegateKt$initEventBusListener$1(this.$this_initEventBusListener, spjVar);
        initDelegateKt$initEventBusListener$1.L$0 = obj;
        return initDelegateKt$initEventBusListener$1;
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((InitDelegateKt$initEventBusListener$1) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        yvj yvjVar = (yvj) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        final ksr q = rsr.q(cdn.a(wjs0.b), hqu0.b());
        rsr.s(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new ksr<Object>() { // from class: com.vk.video.ui.upload.impl.publish.presentation.publish.feature.store.delegate.InitDelegateKt$initEventBusListener$1$invokeSuspend$$inlined$filterIsInstance$1

            /* compiled from: Emitters.kt */
            /* renamed from: com.vk.video.ui.upload.impl.publish.presentation.publish.feature.store.delegate.InitDelegateKt$initEventBusListener$1$invokeSuspend$$inlined$filterIsInstance$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements lsr {
                public final /* synthetic */ lsr b;

                @b6l(c = "com.vk.video.ui.upload.impl.publish.presentation.publish.feature.store.delegate.InitDelegateKt$initEventBusListener$1$invokeSuspend$$inlined$filterIsInstance$1$2", f = "InitDelegate.kt", l = {50}, m = "emit")
                /* renamed from: com.vk.video.ui.upload.impl.publish.presentation.publish.feature.store.delegate.InitDelegateKt$initEventBusListener$1$invokeSuspend$$inlined$filterIsInstance$1$2$1, reason: invalid class name */
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
                                if (obj instanceof owr0) {
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
            public final Object collect(lsr<? super Object> lsrVar, spj spjVar) {
                Object collect = ksr.this.collect(new AnonymousClass2(lsrVar), spjVar);
                return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : s3q0.a;
            }
        }, new a(this.$this_initEventBusListener, null)), yvjVar);
        return s3q0.a;
    }
}
