package com.unity3d.ads.core.extensions;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import kotlin.a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AdaptedFunctionReference;
import xsna.b6l;
import xsna.gzs;
import xsna.ksr;
import xsna.lsr;
import xsna.myc0;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;
import xsna.yvj;
import xsna.zhd0;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: FlowExtensions.kt */
@b6l(c = "com.unity3d.ads.core.extensions.FlowExtensionsKt$timeoutAfter$1", f = "FlowExtensions.kt", l = {15, 17}, m = "invokeSuspend")
/* loaded from: classes14.dex */
public final class FlowExtensionsKt$timeoutAfter$1<T> extends SuspendLambda implements wzs<zhd0<? super T>, spj<? super s3q0>, Object> {
    final /* synthetic */ boolean $active;
    final /* synthetic */ wzs<gzs<s3q0>, spj<? super s3q0>, Object> $block;
    final /* synthetic */ ksr<T> $this_timeoutAfter;
    final /* synthetic */ long $timeoutMillis;
    private /* synthetic */ Object L$0;
    int label;

    /* compiled from: FlowExtensions.kt */
    @b6l(c = "com.unity3d.ads.core.extensions.FlowExtensionsKt$timeoutAfter$1$1", f = "FlowExtensions.kt", l = {10}, m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.extensions.FlowExtensionsKt$timeoutAfter$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ zhd0<T> $$this$channelFlow;
        final /* synthetic */ ksr<T> $this_timeoutAfter;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(ksr<? extends T> ksrVar, zhd0<? super T> zhd0Var, spj<? super AnonymousClass1> spjVar) {
            super(2, spjVar);
            this.$this_timeoutAfter = ksrVar;
            this.$$this$channelFlow = zhd0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new AnonymousClass1(this.$this_timeoutAfter, this.$$this$channelFlow, spjVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                a.a(obj);
                ksr<T> ksrVar = this.$this_timeoutAfter;
                final zhd0<T> zhd0Var = this.$$this$channelFlow;
                lsr<? super T> lsrVar = new lsr() { // from class: com.unity3d.ads.core.extensions.FlowExtensionsKt.timeoutAfter.1.1.1
                    @Override // xsna.lsr
                    public final Object emit(T t, spj<? super s3q0> spjVar) {
                        Object t2 = zhd0Var.t(t, spjVar);
                        return t2 == CoroutineSingletons.COROUTINE_SUSPENDED ? t2 : s3q0.a;
                    }
                };
                this.label = 1;
                if (ksrVar.collect(lsrVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a.a(obj);
            }
            this.$$this$channelFlow.B(null);
            return s3q0.a;
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((AnonymousClass1) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }
    }

    /* compiled from: FlowExtensions.kt */
    /* renamed from: com.unity3d.ads.core.extensions.FlowExtensionsKt$timeoutAfter$1$2, reason: invalid class name */
    public /* synthetic */ class AnonymousClass2 extends AdaptedFunctionReference implements gzs<s3q0> {
        public AnonymousClass2(Object obj) {
            super(0, obj, zhd0.class, CampaignEx.JSON_NATIVE_VIDEO_CLOSE, "close(Ljava/lang/Throwable;)Z", 8);
        }

        @Override // xsna.gzs
        public /* bridge */ /* synthetic */ s3q0 invoke() {
            invoke2();
            return s3q0.a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((zhd0) this.receiver).B(null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowExtensionsKt$timeoutAfter$1(long j, boolean z, wzs<? super gzs<s3q0>, ? super spj<? super s3q0>, ? extends Object> wzsVar, ksr<? extends T> ksrVar, spj<? super FlowExtensionsKt$timeoutAfter$1> spjVar) {
        super(2, spjVar);
        this.$timeoutMillis = j;
        this.$active = z;
        this.$block = wzsVar;
        this.$this_timeoutAfter = ksrVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        FlowExtensionsKt$timeoutAfter$1 flowExtensionsKt$timeoutAfter$1 = new FlowExtensionsKt$timeoutAfter$1(this.$timeoutMillis, this.$active, this.$block, this.$this_timeoutAfter, spjVar);
        flowExtensionsKt$timeoutAfter$1.L$0 = obj;
        return flowExtensionsKt$timeoutAfter$1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0054, code lost:
    
        if (r8.invoke(r4, r7) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0056, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003e, code lost:
    
        if (xsna.qsl.b(r5, r7) == r0) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zhd0 zhd0Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            a.a(obj);
            zhd0Var = (zhd0) this.L$0;
            myc0.h(zhd0Var, null, null, new AnonymousClass1(this.$this_timeoutAfter, zhd0Var, null), 3);
            long j = this.$timeoutMillis;
            this.L$0 = zhd0Var;
            this.label = 1;
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a.a(obj);
                return s3q0.a;
            }
            zhd0Var = (zhd0) this.L$0;
            a.a(obj);
        }
        if (this.$active) {
            wzs<gzs<s3q0>, spj<? super s3q0>, Object> wzsVar = this.$block;
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(zhd0Var);
            this.L$0 = null;
            this.label = 2;
        }
        return s3q0.a;
    }

    @Override // xsna.wzs
    public final Object invoke(zhd0<? super T> zhd0Var, spj<? super s3q0> spjVar) {
        return ((FlowExtensionsKt$timeoutAfter$1) create(zhd0Var, spjVar)).invokeSuspend(s3q0.a);
    }
}
