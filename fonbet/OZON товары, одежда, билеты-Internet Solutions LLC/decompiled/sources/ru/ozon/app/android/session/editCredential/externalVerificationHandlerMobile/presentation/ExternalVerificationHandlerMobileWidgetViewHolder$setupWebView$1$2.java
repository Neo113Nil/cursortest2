package ru.ozon.app.android.session.editCredential.externalVerificationHandlerMobile.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.web.webview.OzonWebView;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ExternalVerificationHandlerMobileWidgetViewHolder$setupWebView$1$2 extends AbstractC7737t implements Function1<String, Unit> {
    final /* synthetic */ OzonWebView $this_with;
    final /* synthetic */ ExternalVerificationHandlerMobileWidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ExternalVerificationHandlerMobileWidgetViewHolder$setupWebView$1$2(ExternalVerificationHandlerMobileWidgetViewHolder externalVerificationHandlerMobileWidgetViewHolder, OzonWebView ozonWebView) {
        super(1);
        this.this$0 = externalVerificationHandlerMobileWidgetViewHolder;
        this.$this_with = ozonWebView;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        boolean z11;
        z11 = this.this$0.isJavascriptInjectionAllowed;
        if (z11) {
            this.$this_with.evaluateJavascript("(function() {function postMessageHandler(event) {ExternalVerificationInterface.postMessage(JSON.stringify(event.data))}window.addEventListener(\"message\", postMessageHandler, false);})()", null);
            this.this$0.isJavascriptInjectionAllowed = false;
        }
    }
}
