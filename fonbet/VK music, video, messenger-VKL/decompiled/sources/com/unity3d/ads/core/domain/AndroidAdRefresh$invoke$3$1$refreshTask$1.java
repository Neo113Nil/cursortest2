package com.unity3d.ads.core.domain;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.AdRefreshState;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b6l;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;
import xsna.yvj;

/* compiled from: AndroidAdRefresh.kt */
@b6l(c = "com.unity3d.ads.core.domain.AndroidAdRefresh$invoke$3$1$refreshTask$1", f = "AndroidAdRefresh.kt", l = {43}, m = "invokeSuspend")
/* loaded from: classes14.dex */
public final class AndroidAdRefresh$invoke$3$1$refreshTask$1 extends SuspendLambda implements wzs<yvj, spj<? super Result<? extends s3q0>>, Object> {
    final /* synthetic */ AdObject $adObject;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AndroidAdRefresh this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidAdRefresh$invoke$3$1$refreshTask$1(AndroidAdRefresh androidAdRefresh, AdObject adObject, spj<? super AndroidAdRefresh$invoke$3$1$refreshTask$1> spjVar) {
        super(2, spjVar);
        this.this$0 = androidAdRefresh;
        this.$adObject = adObject;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        AndroidAdRefresh$invoke$3$1$refreshTask$1 androidAdRefresh$invoke$3$1$refreshTask$1 = new AndroidAdRefresh$invoke$3$1$refreshTask$1(this.this$0, this.$adObject, spjVar);
        androidAdRefresh$invoke$3$1$refreshTask$1.L$0 = obj;
        return androidAdRefresh$invoke$3$1$refreshTask$1;
    }

    @Override // xsna.wzs
    public /* bridge */ /* synthetic */ Object invoke(yvj yvjVar, spj<? super Result<? extends s3q0>> spjVar) {
        return invoke2(yvjVar, (spj<? super Result<s3q0>>) spjVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object failure;
        boolean canUpdateRefreshData;
        AdObject.WebViewLessLoadingRequiredData webViewLessLoadingRequiredData;
        Object performRefresh;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.a.a(obj);
                AndroidAdRefresh androidAdRefresh = this.this$0;
                ByteString opportunityId = this.$adObject.getOpportunityId();
                this.label = 1;
                performRefresh = androidAdRefresh.performRefresh(opportunityId, this);
                if (performRefresh == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            failure = s3q0.a;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        AndroidAdRefresh androidAdRefresh2 = this.this$0;
        AdObject adObject = this.$adObject;
        if (Result.a(failure) != null) {
            canUpdateRefreshData = androidAdRefresh2.canUpdateRefreshData(adObject.getState().getValue());
            if (canUpdateRefreshData && (webViewLessLoadingRequiredData = adObject.getWebViewLessLoadingRequiredData()) != null) {
                webViewLessLoadingRequiredData.setAdRefreshState(AdRefreshState.REUSE_ERROR);
            }
        }
        return new Result(failure);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(yvj yvjVar, spj<? super Result<s3q0>> spjVar) {
        return ((AndroidAdRefresh$invoke$3$1$refreshTask$1) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }
}
