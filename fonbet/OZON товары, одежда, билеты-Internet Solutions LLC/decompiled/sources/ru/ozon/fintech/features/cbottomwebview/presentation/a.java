package ru.ozon.fintech.features.cbottomwebview.presentation;

import E30.g;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import g.AbstractC6592d;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.fintech.features.cbottomwebview.presentation.CbottomWebViewDialogFragment;

/* loaded from: classes3.dex */
public final class a extends WebChromeClient {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ CbottomWebViewDialogFragment f95435a;

    a(CbottomWebViewDialogFragment cbottomWebViewDialogFragment) {
        this.f95435a = cbottomWebViewDialogFragment;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        final CbottomWebViewDialogFragment cbottomWebViewDialogFragment = this.f95435a;
        Boolean bool = (Boolean) g.a(new Function2() { // from class: J50.c
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                ValueCallback valueCallback2;
                boolean z11;
                Intent createIntent;
                AbstractC6592d abstractC6592d;
                ValueCallback callBack = (ValueCallback) obj;
                WebChromeClient.FileChooserParams params = (WebChromeClient.FileChooserParams) obj2;
                Intrinsics.checkNotNullParameter(callBack, "callBack");
                Intrinsics.checkNotNullParameter(params, "params");
                CbottomWebViewDialogFragment cbottomWebViewDialogFragment2 = CbottomWebViewDialogFragment.this;
                valueCallback2 = cbottomWebViewDialogFragment2.f95413i;
                if (valueCallback2 != null) {
                    valueCallback2.onReceiveValue(null);
                }
                cbottomWebViewDialogFragment2.f95413i = callBack;
                try {
                    createIntent = params.createIntent();
                    createIntent.putExtra("android.intent.extra.MIME_TYPES", params.getAcceptTypes());
                    z11 = true;
                    if (params.getMode() == 1) {
                        createIntent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
                    }
                    abstractC6592d = cbottomWebViewDialogFragment2.f95414j;
                } catch (ActivityNotFoundException e11) {
                    L80.a.c("CbottomWebViewDialogFragment", null, e11);
                    cbottomWebViewDialogFragment2.G().A0();
                    cbottomWebViewDialogFragment2.f95413i = null;
                    z11 = false;
                }
                if (abstractC6592d != null) {
                    abstractC6592d.a(createIntent);
                    return Boolean.valueOf(z11);
                }
                Intrinsics.n("fileChooserLauncher");
                throw null;
            }
        }, valueCallback, fileChooserParams);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }
}
