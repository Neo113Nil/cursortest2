package com.unity3d.ads.core.domain;

import com.unity3d.ads.adplayer.AdPlayer;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.AdObjectState;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1;
import xsna.b6l;
import xsna.r570;
import xsna.rsr;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;
import xsna.yvj;
import xsna.zno;
import xsna.zvj;

/* compiled from: CleanUpWhenOpportunityExpires.kt */
@b6l(c = "com.unity3d.ads.core.domain.CleanUpWhenOpportunityExpires$invoke$job$1", f = "CleanUpWhenOpportunityExpires.kt", l = {35, 36, 41}, m = "invokeSuspend")
/* loaded from: classes14.dex */
public final class CleanUpWhenOpportunityExpires$invoke$job$1 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ AdObject $adObject;
    int label;

    /* compiled from: CleanUpWhenOpportunityExpires.kt */
    @b6l(c = "com.unity3d.ads.core.domain.CleanUpWhenOpportunityExpires$invoke$job$1$1", f = "CleanUpWhenOpportunityExpires.kt", l = {43}, m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.domain.CleanUpWhenOpportunityExpires$invoke$job$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ AdObject $adObject;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AdObject adObject, spj<? super AnonymousClass1> spjVar) {
            super(2, spjVar);
            this.$adObject = adObject;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new AnonymousClass1(this.$adObject, spjVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                this.$adObject.getState().setValue(AdObjectState.EXPIRED);
                AdPlayer adPlayer = this.$adObject.getAdPlayer();
                if (adPlayer != null) {
                    this.label = 1;
                    if (adPlayer.destroy(this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    zvj.c(this.$adObject.getAdScope(), null);
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
            return ((AnonymousClass1) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CleanUpWhenOpportunityExpires$invoke$job$1(AdObject adObject, spj<? super CleanUpWhenOpportunityExpires$invoke$job$1> spjVar) {
        super(2, spjVar);
        this.$adObject = adObject;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new CleanUpWhenOpportunityExpires$invoke$job$1(this.$adObject, spjVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0076, code lost:
    
        if (xsna.myc0.k(r7, r1, r6) == r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0078, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0055, code lost:
    
        if (xsna.qsl.c(r4, r6) != r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0048, code lost:
    
        if (r7 == r0) goto L26;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        long j;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            zno value = this.$adObject.getTtl().getValue();
            if (value != null) {
                j = value.b;
                this.label = 2;
            } else {
                FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1 flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(this.$adObject.getTtl());
                this.label = 1;
                obj = rsr.n(flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1, this);
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                    return s3q0.a;
                }
                kotlin.a.a(obj);
                if (this.$adObject.getState().getValue() != AdObjectState.SHOWING) {
                    r570 r570Var = r570.b;
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$adObject, null);
                    this.label = 3;
                }
                return s3q0.a;
            }
            kotlin.a.a(obj);
        }
        j = ((zno) obj).b;
        this.label = 2;
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((CleanUpWhenOpportunityExpires$invoke$job$1) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }
}
