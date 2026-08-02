package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.AdObjectState;
import com.unity3d.ads.core.data.model.AdRefreshState;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b6l;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;
import xsna.zrl;

/* compiled from: AndroidAdRefresh.kt */
@b6l(c = "com.unity3d.ads.core.domain.AndroidAdRefresh$invoke$3$1$1$1", f = "AndroidAdRefresh.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes14.dex */
public final class AndroidAdRefresh$invoke$3$1$1$1 extends SuspendLambda implements wzs<AdObjectState, spj<? super s3q0>, Object> {
    final /* synthetic */ AdObject $adObject;
    final /* synthetic */ zrl<Result<s3q0>> $refreshTask;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidAdRefresh$invoke$3$1$1$1(zrl<Result<s3q0>> zrlVar, AdObject adObject, spj<? super AndroidAdRefresh$invoke$3$1$1$1> spjVar) {
        super(2, spjVar);
        this.$refreshTask = zrlVar;
        this.$adObject = adObject;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new AndroidAdRefresh$invoke$3$1$1$1(this.$refreshTask, this.$adObject, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(AdObjectState adObjectState, spj<? super s3q0> spjVar) {
        return ((AndroidAdRefresh$invoke$3$1$1$1) create(adObjectState, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        this.$refreshTask.b(null);
        AdObject.WebViewLessLoadingRequiredData webViewLessLoadingRequiredData = this.$adObject.getWebViewLessLoadingRequiredData();
        if (webViewLessLoadingRequiredData != null) {
            webViewLessLoadingRequiredData.setAdRefreshState(AdRefreshState.REUSE_DURING_RELOAD);
        }
        return s3q0.a;
    }
}
