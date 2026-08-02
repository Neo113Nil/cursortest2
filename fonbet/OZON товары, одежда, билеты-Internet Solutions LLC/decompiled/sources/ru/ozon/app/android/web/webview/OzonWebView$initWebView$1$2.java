package ru.ozon.app.android.web.webview;

import android.net.Uri;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "valueCallback", "Landroid/webkit/ValueCallback;", "", "Landroid/net/Uri;", "fileChooserParams", "Landroid/webkit/WebChromeClient$FileChooserParams;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class OzonWebView$initWebView$1$2 extends AbstractC7737t implements Function2<ValueCallback<Uri[]>, WebChromeClient.FileChooserParams, Unit> {
    final /* synthetic */ OzonWebView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OzonWebView$initWebView$1$2(OzonWebView ozonWebView) {
        super(2);
        this.this$0 = ozonWebView;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        invoke2(valueCallback, fileChooserParams);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        Intrinsics.checkNotNullParameter(valueCallback, "valueCallback");
        Intrinsics.checkNotNullParameter(fileChooserParams, "fileChooserParams");
        Function2<ValueCallback<Uri[]>, WebChromeClient.FileChooserParams, Unit> onShowFileChooserListener = this.this$0.getOnShowFileChooserListener();
        if (onShowFileChooserListener != null) {
            onShowFileChooserListener.invoke(valueCallback, fileChooserParams);
        }
    }
}
