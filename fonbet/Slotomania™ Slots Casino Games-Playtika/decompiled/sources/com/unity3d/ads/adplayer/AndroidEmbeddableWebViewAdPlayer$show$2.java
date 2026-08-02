package com.unity3d.ads.adplayer;

import android.content.Context;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.unity3d.services.banners.BannerView;
import com.unity3d.services.core.misc.ViewUtilities;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AndroidEmbeddableWebViewAdPlayer.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$2", f = "AndroidEmbeddableWebViewAdPlayer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
final class AndroidEmbeddableWebViewAdPlayer$show$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ BannerView $bannerView;
    int label;
    final /* synthetic */ AndroidEmbeddableWebViewAdPlayer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidEmbeddableWebViewAdPlayer$show$2(AndroidEmbeddableWebViewAdPlayer androidEmbeddableWebViewAdPlayer, BannerView bannerView, Continuation<? super AndroidEmbeddableWebViewAdPlayer$show$2> continuation) {
        super(2, continuation);
        this.this$0 = androidEmbeddableWebViewAdPlayer;
        this.$bannerView = bannerView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AndroidEmbeddableWebViewAdPlayer$show$2(this.this$0, this.$bannerView, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AndroidEmbeddableWebViewAdPlayer$show$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Context context;
        Context context2;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        WebView webView = this.this$0.getWebViewContainer().getWebView();
        context = this.this$0.context;
        int pxFromDp = (int) ViewUtilities.pxFromDp(context, this.$bannerView.getSize().getWidth());
        context2 = this.this$0.context;
        webView.setLayoutParams(new ViewGroup.LayoutParams(pxFromDp, (int) ViewUtilities.pxFromDp(context2, this.$bannerView.getSize().getHeight())));
        return Unit.INSTANCE;
    }
}
