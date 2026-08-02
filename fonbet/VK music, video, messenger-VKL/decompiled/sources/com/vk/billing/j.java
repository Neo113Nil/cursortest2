package com.vk.billing;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.webkit.WebView;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.vk.billing.SberpayPurchasesManager;
import com.vkontakte.android.R;
import xsna.h7u0;

/* compiled from: SberpayPurchasesManagerImpl.kt */
/* loaded from: classes.dex */
public final class j implements SberpayPurchasesManager {
    @Override // com.vk.billing.SberpayPurchasesManager
    public final SberpayPurchasesManager.SberpayUriHandleResult a(final Context context, Uri uri, final WebView webView, final String str, SberpayPurchasesManager.SberpayUriHandleResult sberpayUriHandleResult) {
        SberpayPurchasesManager.SberpayUriHandleResult sberpayUriHandleResult2;
        h7u0.a c;
        String scheme = uri.getScheme();
        if (!"sberpay".equals(scheme) && !"sbolpay".equals(scheme)) {
            return SberpayPurchasesManager.SberpayUriHandleResult.IRRELEVANT;
        }
        Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, uri);
        intent.setFlags(268435456);
        try {
            context.startActivity(intent);
            return SberpayPurchasesManager.SberpayUriHandleResult.SUCCESS;
        } catch (ActivityNotFoundException unused) {
            if (sberpayUriHandleResult == SberpayPurchasesManager.SberpayUriHandleResult.IRRELEVANT || sberpayUriHandleResult == (sberpayUriHandleResult2 = SberpayPurchasesManager.SberpayUriHandleResult.SECOND_FAIL)) {
                return SberpayPurchasesManager.SberpayUriHandleResult.FIRST_FAIL;
            }
            int i = h7u0.p;
            c = h7u0.b.c(context);
            c.U(R.string.sberpay_app_required);
            c.c0(R.string.install_app_button, new DialogInterface.OnClickListener() { // from class: xsna.n2h0
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    dialogInterface.dismiss();
                    Intent intent2 = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse("https://www.sberbank.com/ru/person/dist_services/sberbank-online-android"));
                    intent2.setFlags(268435456);
                    context.startActivity(intent2);
                    WebView webView2 = webView;
                    webView2.loadUrl(str);
                    webView2.clearHistory();
                }
            });
            c.W(R.string.cancel, new DialogInterface.OnClickListener() { // from class: xsna.o2h0
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    dialogInterface.dismiss();
                    WebView webView2 = webView;
                    webView2.loadUrl(str);
                    webView2.clearHistory();
                }
            });
            c.S();
            c.m();
            return sberpayUriHandleResult2;
        }
    }
}
