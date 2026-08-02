package ru.ozon.app.android.web;

import android.net.Uri;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
/* synthetic */ class WebFragment$setupWebView$3 extends C7735q implements Function2<ValueCallback<Uri[]>, WebChromeClient.FileChooserParams, Unit> {
    WebFragment$setupWebView$3(Object obj) {
        super(2, obj, WebFragment.class, "showFileChooser", "showFileChooser(Landroid/webkit/ValueCallback;Landroid/webkit/WebChromeClient$FileChooserParams;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        invoke2(valueCallback, fileChooserParams);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ValueCallback<Uri[]> p02, WebChromeClient.FileChooserParams p12) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        Intrinsics.checkNotNullParameter(p12, "p1");
        ((WebFragment) this.receiver).showFileChooser(p02, p12);
    }
}
