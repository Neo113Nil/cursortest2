package com.unity3d.ads.adplayer;

import android.content.Context;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.unity3d.services.banners.BannerView;
import com.unity3d.services.core.misc.ViewUtilities;
import kotlin.a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b6l;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;
import xsna.yvj;

/* compiled from: AndroidEmbeddableWebViewAdPlayer.kt */
@b6l(c = "com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$1", f = "AndroidEmbeddableWebViewAdPlayer.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes14.dex */
public final class AndroidEmbeddableWebViewAdPlayer$show$1 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ BannerView $bannerView;
    int label;
    final /* synthetic */ AndroidEmbeddableWebViewAdPlayer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidEmbeddableWebViewAdPlayer$show$1(AndroidEmbeddableWebViewAdPlayer androidEmbeddableWebViewAdPlayer, BannerView bannerView, spj<? super AndroidEmbeddableWebViewAdPlayer$show$1> spjVar) {
        super(2, spjVar);
        this.this$0 = androidEmbeddableWebViewAdPlayer;
        this.$bannerView = bannerView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new AndroidEmbeddableWebViewAdPlayer$show$1(this.this$0, this.$bannerView, spjVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Context context;
        Context context2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        a.a(obj);
        WebView webView = this.this$0.getWebViewContainer().getWebView();
        context = this.this$0.context;
        int pxFromDp = (int) ViewUtilities.pxFromDp(context, this.$bannerView.getSize().getWidth());
        context2 = this.this$0.context;
        webView.setLayoutParams(new ViewGroup.LayoutParams(pxFromDp, (int) ViewUtilities.pxFromDp(context2, this.$bannerView.getSize().getHeight())));
        return s3q0.a;
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((AndroidEmbeddableWebViewAdPlayer$show$1) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }
}
