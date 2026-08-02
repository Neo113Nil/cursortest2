package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.model.AdObject;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.asl;
import xsna.b6l;
import xsna.myc0;
import xsna.s3q0;
import xsna.spj;
import xsna.v8i0;
import xsna.wzs;
import xsna.yvj;

/* compiled from: AndroidAdRefresh.kt */
@b6l(c = "com.unity3d.ads.core.domain.AndroidAdRefresh$invoke$3", f = "AndroidAdRefresh.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes14.dex */
public final class AndroidAdRefresh$invoke$3 extends SuspendLambda implements wzs<String, spj<? super s3q0>, Object> {
    final /* synthetic */ AdObject $adObject;
    final /* synthetic */ yvj $refreshScope;
    int label;
    final /* synthetic */ AndroidAdRefresh this$0;

    /* compiled from: AndroidAdRefresh.kt */
    @b6l(c = "com.unity3d.ads.core.domain.AndroidAdRefresh$invoke$3$1", f = "AndroidAdRefresh.kt", l = {Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE}, m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.domain.AndroidAdRefresh$invoke$3$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ AdObject $adObject;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ AndroidAdRefresh this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AdObject adObject, AndroidAdRefresh androidAdRefresh, spj<? super AnonymousClass1> spjVar) {
            super(2, spjVar);
            this.$adObject = adObject;
            this.this$0 = androidAdRefresh;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$adObject, this.this$0, spjVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                yvj yvjVar = (yvj) this.L$0;
                asl b = myc0.b(yvjVar, null, null, new AndroidAdRefresh$invoke$3$1$showing$1(this.$adObject, null), 3);
                asl b2 = myc0.b(yvjVar, null, null, new AndroidAdRefresh$invoke$3$1$refreshTask$1(this.this$0, this.$adObject, null), 3);
                AdObject adObject = this.$adObject;
                v8i0 v8i0Var = new v8i0(getContext());
                v8i0Var.j(b.a0(), new AndroidAdRefresh$invoke$3$1$1$1(b2, adObject, null));
                v8i0Var.j(b2.a0(), new AndroidAdRefresh$invoke$3$1$1$2(b, null));
                this.label = 1;
                if (v8i0Var.g(this) == coroutineSingletons) {
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
            return ((AnonymousClass1) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidAdRefresh$invoke$3(yvj yvjVar, AdObject adObject, AndroidAdRefresh androidAdRefresh, spj<? super AndroidAdRefresh$invoke$3> spjVar) {
        super(2, spjVar);
        this.$refreshScope = yvjVar;
        this.$adObject = adObject;
        this.this$0 = androidAdRefresh;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new AndroidAdRefresh$invoke$3(this.$refreshScope, this.$adObject, this.this$0, spjVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        myc0.h(this.$refreshScope, null, null, new AnonymousClass1(this.$adObject, this.this$0, null), 3);
        return s3q0.a;
    }

    @Override // xsna.wzs
    public final Object invoke(String str, spj<? super s3q0> spjVar) {
        return ((AndroidAdRefresh$invoke$3) create(str, spjVar)).invokeSuspend(s3q0.a);
    }
}
