package ru.ozon.app.android.web.webview;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0002\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "<unused var>", "", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class OzonWebView$attachWebViewClient$1$3 extends AbstractC7737t implements Function2<String, Boolean, Unit> {
    final /* synthetic */ OzonWebView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OzonWebView$attachWebViewClient$1$3(OzonWebView ozonWebView) {
        super(2);
        this.this$0 = ozonWebView;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(String str, Boolean bool) {
        invoke(str, bool.booleanValue());
        return Unit.f71690a;
    }

    public final void invoke(String str, boolean z11) {
        this.this$0.clearHistoryIfNeeded();
    }
}
