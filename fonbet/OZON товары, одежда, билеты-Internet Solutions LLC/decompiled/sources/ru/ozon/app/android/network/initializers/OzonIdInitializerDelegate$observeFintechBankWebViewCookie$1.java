package ru.ozon.app.android.network.initializers;

import Ob0.a;
import android.webkit.WebView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "webView", "Landroid/webkit/WebView;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class OzonIdInitializerDelegate$observeFintechBankWebViewCookie$1 extends AbstractC7737t implements Function1<WebView, Unit> {
    final /* synthetic */ OzonIdInitializerDelegate this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OzonIdInitializerDelegate$observeFintechBankWebViewCookie$1(OzonIdInitializerDelegate ozonIdInitializerDelegate) {
        super(1);
        this.this$0 = ozonIdInitializerDelegate;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(WebView webView) {
        invoke2(webView);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(WebView webView) {
        a aVar;
        Intrinsics.checkNotNullParameter(webView, "webView");
        aVar = this.this$0.ozonIdAppApi;
        aVar.r(new Pb0.a(webView) { // from class: ru.ozon.app.android.network.initializers.OzonIdInitializerDelegate$observeFintechBankWebViewCookie$1.1
            private final WebView webView;

            {
                this.webView = webView;
            }

            @Override // Pb0.a
            public WebView getWebView() {
                return this.webView;
            }
        });
    }
}
