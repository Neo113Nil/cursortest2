package com.unity3d.ads.adplayer;

import android.content.Context;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.unity3d.services.banners.BannerView;
import com.unity3d.services.core.misc.ViewUtilities;
import defpackage.a70;
import defpackage.hoi;
import defpackage.il4;
import defpackage.ku3;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku3;", "", "<anonymous>", "(Lku3;)V"}, k = 3, mv = {2, 1, 0})
@il4(c = "com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$1", f = "AndroidEmbeddableWebViewAdPlayer.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class AndroidEmbeddableWebViewAdPlayer$show$1 extends hoi implements Function2<ku3, rq3<? super Unit>, Object> {
    final /* synthetic */ BannerView $bannerView;
    int label;
    final /* synthetic */ AndroidEmbeddableWebViewAdPlayer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidEmbeddableWebViewAdPlayer$show$1(AndroidEmbeddableWebViewAdPlayer androidEmbeddableWebViewAdPlayer, BannerView bannerView, rq3<? super AndroidEmbeddableWebViewAdPlayer$show$1> rq3Var) {
        super(2, rq3Var);
        this.this$0 = androidEmbeddableWebViewAdPlayer;
        this.$bannerView = bannerView;
    }

    @Override // defpackage.h21
    public final rq3<Unit> create(Object obj, rq3<?> rq3Var) {
        return new AndroidEmbeddableWebViewAdPlayer$show$1(this.this$0, this.$bannerView, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ku3 ku3Var, rq3<? super Unit> rq3Var) {
        return ((AndroidEmbeddableWebViewAdPlayer$show$1) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        Context context;
        Context context2;
        lu3 lu3Var = lu3.a;
        if (this.label != 0) {
            a70.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        y6a.M(obj);
        WebView webView = this.this$0.getWebViewContainer().getWebView();
        context = this.this$0.context;
        int pxFromDp = (int) ViewUtilities.pxFromDp(context, this.$bannerView.getSize().getWidth());
        context2 = this.this$0.context;
        webView.setLayoutParams(new ViewGroup.LayoutParams(pxFromDp, (int) ViewUtilities.pxFromDp(context2, this.$bannerView.getSize().getHeight())));
        return Unit.a;
    }
}
