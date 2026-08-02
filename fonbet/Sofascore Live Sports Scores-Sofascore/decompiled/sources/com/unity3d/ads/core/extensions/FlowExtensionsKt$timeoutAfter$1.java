package com.unity3d.ads.core.extensions;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import defpackage.a70;
import defpackage.b98;
import defpackage.dh;
import defpackage.hoi;
import defpackage.il4;
import defpackage.j8f;
import defpackage.k8f;
import defpackage.ku3;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.xw3;
import defpackage.y6a;
import defpackage.z88;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lk8f;", "", "<anonymous>", "(Lk8f;)V"}, k = 3, mv = {2, 1, 0})
@il4(c = "com.unity3d.ads.core.extensions.FlowExtensionsKt$timeoutAfter$1", f = "FlowExtensions.kt", l = {15, 17}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class FlowExtensionsKt$timeoutAfter$1 extends hoi implements Function2<k8f, rq3<? super Unit>, Object> {
    final /* synthetic */ boolean $active;
    final /* synthetic */ Function2<Function0<Unit>, rq3<? super Unit>, Object> $block;
    final /* synthetic */ z88 $this_timeoutAfter;
    final /* synthetic */ long $timeoutMillis;
    private /* synthetic */ Object L$0;
    int label;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku3;", "", "<anonymous>", "(Lku3;)V"}, k = 3, mv = {2, 1, 0})
    @il4(c = "com.unity3d.ads.core.extensions.FlowExtensionsKt$timeoutAfter$1$1", f = "FlowExtensions.kt", l = {10}, m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.extensions.FlowExtensionsKt$timeoutAfter$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends hoi implements Function2<ku3, rq3<? super Unit>, Object> {
        final /* synthetic */ k8f $$this$channelFlow;
        final /* synthetic */ z88 $this_timeoutAfter;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(z88 z88Var, k8f k8fVar, rq3<? super AnonymousClass1> rq3Var) {
            super(2, rq3Var);
            this.$this_timeoutAfter = z88Var;
            this.$$this$channelFlow = k8fVar;
        }

        @Override // defpackage.h21
        public final rq3<Unit> create(Object obj, rq3<?> rq3Var) {
            return new AnonymousClass1(this.$this_timeoutAfter, this.$$this$channelFlow, rq3Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ku3 ku3Var, rq3<? super Unit> rq3Var) {
            return ((AnonymousClass1) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.h21
        public final Object invokeSuspend(Object obj) {
            lu3 lu3Var = lu3.a;
            int i = this.label;
            if (i == 0) {
                y6a.M(obj);
                z88 z88Var = this.$this_timeoutAfter;
                final k8f k8fVar = this.$$this$channelFlow;
                b98 b98Var = new b98() { // from class: com.unity3d.ads.core.extensions.FlowExtensionsKt.timeoutAfter.1.1.1
                    @Override // defpackage.b98
                    public final Object emit(T t, rq3<? super Unit> rq3Var) {
                        Object q = ((j8f) k8f.this).e.q(rq3Var, t);
                        return q == lu3.a ? q : Unit.a;
                    }
                };
                this.label = 1;
                if (z88Var.collect(b98Var, this) == lu3Var) {
                    return lu3Var;
                }
            } else {
                if (i != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
            }
            ((j8f) this.$$this$channelFlow).r(null);
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowExtensionsKt$timeoutAfter$1(long j, boolean z, Function2<? super Function0<Unit>, ? super rq3<? super Unit>, ? extends Object> function2, z88 z88Var, rq3<? super FlowExtensionsKt$timeoutAfter$1> rq3Var) {
        super(2, rq3Var);
        this.$timeoutMillis = j;
        this.$active = z;
        this.$block = function2;
        this.$this_timeoutAfter = z88Var;
    }

    @Override // defpackage.h21
    public final rq3<Unit> create(Object obj, rq3<?> rq3Var) {
        FlowExtensionsKt$timeoutAfter$1 flowExtensionsKt$timeoutAfter$1 = new FlowExtensionsKt$timeoutAfter$1(this.$timeoutMillis, this.$active, this.$block, this.$this_timeoutAfter, rq3Var);
        flowExtensionsKt$timeoutAfter$1.L$0 = obj;
        return flowExtensionsKt$timeoutAfter$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(k8f k8fVar, rq3<? super Unit> rq3Var) {
        return ((FlowExtensionsKt$timeoutAfter$1) create(k8fVar, rq3Var)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0052, code lost:
    
        if (r8.invoke(r4, r7) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0054, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003c, code lost:
    
        if (defpackage.n4o.y(r5, r7) == r0) goto L17;
     */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        k8f k8fVar;
        lu3 lu3Var = lu3.a;
        int i = this.label;
        if (i == 0) {
            y6a.M(obj);
            k8fVar = (k8f) this.L$0;
            xw3.L(k8fVar, null, null, new AnonymousClass1(this.$this_timeoutAfter, k8fVar, null), 3);
            long j = this.$timeoutMillis;
            this.L$0 = k8fVar;
            this.label = 1;
        } else {
            if (i != 1) {
                if (i == 2) {
                    y6a.M(obj);
                    return Unit.a;
                }
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            k8fVar = (k8f) this.L$0;
            y6a.M(obj);
        }
        if (this.$active) {
            Function2<Function0<Unit>, rq3<? super Unit>, Object> function2 = this.$block;
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(k8fVar);
            this.L$0 = null;
            this.label = 2;
        }
        return Unit.a;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.unity3d.ads.core.extensions.FlowExtensionsKt$timeoutAfter$1$2, reason: invalid class name */
    public /* synthetic */ class AnonymousClass2 extends dh implements Function0<Unit> {
        public AnonymousClass2(Object obj) {
            super(0, 8, k8f.class, obj, CampaignEx.JSON_NATIVE_VIDEO_CLOSE, "close(Ljava/lang/Throwable;)Z");
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m753invoke() {
            ((j8f) ((k8f) this.receiver)).r(null);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m753invoke();
            return Unit.a;
        }
    }
}
