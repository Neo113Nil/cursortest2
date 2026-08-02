package ru.ozon.app.android.web.webview;

import android.webkit.WebView;
import com.google.android.gms.common.internal.ImagesContract;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.uikit.screenstate.ScreenState;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", ImagesContract.URL, "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class OzonWebView$attachWebViewClient$1$2 extends AbstractC7737t implements Function1<String, Unit> {
    final /* synthetic */ OzonWebView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OzonWebView$attachWebViewClient$1$2(OzonWebView ozonWebView) {
        super(1);
        this.this$0 = ozonWebView;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        if (!(this.this$0.getScreenState().getLastState() instanceof ScreenState.ServerIssue)) {
            this.this$0.getScreenState().showState(new ScreenState.NoScreen());
            WebView webView = this.this$0.getWebView();
            if (webView != null) {
                ViewExtKt.show(webView);
            }
        }
        Function1<String, Unit> onPageFinishedListener = this.this$0.getOnPageFinishedListener();
        if (onPageFinishedListener != null) {
            onPageFinishedListener.invoke(str);
        }
    }
}
