package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.model.WebViewConfiguration;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b6l;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;
import xsna.yvj;

/* compiled from: AndroidHandleGatewayAdResponse.kt */
@b6l(c = "com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$invoke$4", f = "AndroidHandleGatewayAdResponse.kt", l = {257}, m = "invokeSuspend")
/* loaded from: classes14.dex */
public final class AndroidHandleGatewayAdResponse$invoke$4 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ WebViewConfiguration $webviewConfiguration;
    int label;
    final /* synthetic */ AndroidHandleGatewayAdResponse this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidHandleGatewayAdResponse$invoke$4(AndroidHandleGatewayAdResponse androidHandleGatewayAdResponse, WebViewConfiguration webViewConfiguration, spj<? super AndroidHandleGatewayAdResponse$invoke$4> spjVar) {
        super(2, spjVar);
        this.this$0 = androidHandleGatewayAdResponse;
        this.$webviewConfiguration = webViewConfiguration;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new AndroidHandleGatewayAdResponse$invoke$4(this.this$0, this.$webviewConfiguration, spjVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CacheWebViewAssets cacheWebViewAssets;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            cacheWebViewAssets = this.this$0.cacheWebViewAssets;
            WebViewConfiguration webViewConfiguration = this.$webviewConfiguration;
            this.label = 1;
            if (cacheWebViewAssets.invoke(webViewConfiguration, true, this) == coroutineSingletons) {
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
        return ((AndroidHandleGatewayAdResponse$invoke$4) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }
}
