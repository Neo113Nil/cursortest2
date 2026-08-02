package ru.ozon.app.android.web;

import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.AbstractC5434v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.web.webview.WebViewRouter;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/String;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class WebFragment$setupWebView$2 extends AbstractC7737t implements Function1<String, Boolean> {
    final /* synthetic */ WebFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WebFragment$setupWebView$2(WebFragment webFragment) {
        super(1);
        this.this$0 = webFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(String it) {
        ComponentCallbacksC5392m parentFragment;
        AbstractC5434v lifecycle;
        AbstractC5434v.b b11;
        Intrinsics.checkNotNullParameter(it, "it");
        boolean openDeeplink$default = WebViewRouter.DefaultImpls.openDeeplink$default(this.this$0.getWebViewRouter(), it, null, 2, null);
        if (openDeeplink$default && (parentFragment = this.this$0.getParentFragment()) != null && (lifecycle = parentFragment.getLifecycle()) != null && (b11 = lifecycle.b()) != null && b11.a(AbstractC5434v.b.STARTED)) {
            ComponentCallbacksC5392m parentFragment2 = this.this$0.getParentFragment();
            WebBottomSheetFragment webBottomSheetFragment = parentFragment2 instanceof WebBottomSheetFragment ? (WebBottomSheetFragment) parentFragment2 : null;
            if (webBottomSheetFragment != null) {
                webBottomSheetFragment.closeFragment();
            }
        }
        return Boolean.valueOf(openDeeplink$default);
    }
}
