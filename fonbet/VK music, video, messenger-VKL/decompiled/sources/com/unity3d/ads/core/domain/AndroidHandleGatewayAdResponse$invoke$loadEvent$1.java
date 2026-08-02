package com.unity3d.ads.core.domain;

import com.unity3d.ads.adplayer.AndroidWebViewContainer;
import com.unity3d.ads.core.data.model.AdObject;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b6l;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;
import xsna.yvj;

/* compiled from: AndroidHandleGatewayAdResponse.kt */
@b6l(c = "com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$invoke$loadEvent$1", f = "AndroidHandleGatewayAdResponse.kt", l = {228}, m = "invokeSuspend")
/* loaded from: classes14.dex */
public final class AndroidHandleGatewayAdResponse$invoke$loadEvent$1 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ AdObject $tmpAdObject;
    final /* synthetic */ String $webViewUrl;
    final /* synthetic */ AndroidWebViewContainer $webviewContainer;
    int label;
    final /* synthetic */ AndroidHandleGatewayAdResponse this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidHandleGatewayAdResponse$invoke$loadEvent$1(AndroidHandleGatewayAdResponse androidHandleGatewayAdResponse, AdObject adObject, String str, AndroidWebViewContainer androidWebViewContainer, spj<? super AndroidHandleGatewayAdResponse$invoke$loadEvent$1> spjVar) {
        super(2, spjVar);
        this.this$0 = androidHandleGatewayAdResponse;
        this.$tmpAdObject = adObject;
        this.$webViewUrl = str;
        this.$webviewContainer = androidWebViewContainer;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new AndroidHandleGatewayAdResponse$invoke$loadEvent$1(this.this$0, this.$tmpAdObject, this.$webViewUrl, this.$webviewContainer, spjVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object loadUrl;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            AndroidHandleGatewayAdResponse androidHandleGatewayAdResponse = this.this$0;
            AdObject adObject = this.$tmpAdObject;
            String str = this.$webViewUrl;
            AndroidWebViewContainer androidWebViewContainer = this.$webviewContainer;
            this.label = 1;
            loadUrl = androidHandleGatewayAdResponse.loadUrl(adObject, str, androidWebViewContainer, this);
            if (loadUrl == coroutineSingletons) {
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
        return ((AndroidHandleGatewayAdResponse$invoke$loadEvent$1) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }
}
