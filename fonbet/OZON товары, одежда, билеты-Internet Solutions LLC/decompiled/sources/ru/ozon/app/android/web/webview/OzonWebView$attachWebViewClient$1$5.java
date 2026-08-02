package ru.ozon.app.android.web.webview;

import com.google.android.gms.common.internal.ImagesContract;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", ImagesContract.URL, "", "invoke", "(Ljava/lang/String;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class OzonWebView$attachWebViewClient$1$5 extends AbstractC7737t implements Function1<String, Boolean> {
    final /* synthetic */ OzonWebView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OzonWebView$attachWebViewClient$1$5(OzonWebView ozonWebView) {
        super(1);
        this.this$0 = ozonWebView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        return this.this$0.getOnRedirectListener().invoke(url);
    }
}
