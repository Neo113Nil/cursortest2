package ru.ozon.app.android.miniapp;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "", "it", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class MiniAppWebActivity$initWebView$1$1 extends AbstractC7737t implements Function1<String, Map<String, ? extends String>> {
    final /* synthetic */ MiniAppWebActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MiniAppWebActivity$initWebView$1$1(MiniAppWebActivity miniAppWebActivity) {
        super(1);
        this.this$0 = miniAppWebActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Map<String, String> invoke(String it) {
        Map<String, String> headers;
        Intrinsics.checkNotNullParameter(it, "it");
        headers = this.this$0.getHeaders();
        return headers;
    }
}
