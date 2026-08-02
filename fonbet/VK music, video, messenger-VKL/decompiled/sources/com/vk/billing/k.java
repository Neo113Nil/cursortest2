package com.vk.billing;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.webkit.WebView;
import com.vk.billing.SberpayPurchasesManager;
import com.vk.billing.StorePurchasesManager;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.util.ArrayList;
import java.util.Map;
import xsna.ang;
import xsna.fsk;
import xsna.gt8;
import xsna.mge0;
import xsna.oge0;
import xsna.qge0;

/* compiled from: StubPurchasesManager.kt */
/* loaded from: classes15.dex */
public final class k implements oge0 {
    @Override // com.vk.billing.SberpayPurchasesManager
    public final SberpayPurchasesManager.SberpayUriHandleResult a(Context context, Uri uri, WebView webView, String str, SberpayPurchasesManager.SberpayUriHandleResult sberpayUriHandleResult) {
        return SberpayPurchasesManager.SberpayUriHandleResult.IRRELEVANT;
    }

    @Override // com.vk.billing.StorePurchasesManager
    public final q c(Context context) {
        return q.T(StorePurchasesManager.BillingAvailabilityStatus.READY);
    }

    @Override // com.vk.billing.StorePurchasesManager
    public final qge0 d(Activity activity, StorePurchasesManager.a aVar, mge0 mge0Var) {
        aVar.b();
        return new fsk();
    }

    @Override // com.vk.billing.StorePurchasesManager
    public final <D extends mge0> void e(Map<String, ? extends D> map, StorePurchasesManager.b bVar) {
        if (bVar != null) {
            bVar.d(map.size());
        }
    }

    @Override // com.vk.billing.StorePurchasesManager
    public final qge0 f(Activity activity, StorePurchasesManager.a aVar, mge0 mge0Var) {
        if (aVar != null) {
            aVar.b();
        }
        return new fsk();
    }

    @Override // com.vk.billing.StorePurchasesManager
    public final qge0 g(Activity activity, ArrayList arrayList, ang.a aVar) {
        aVar.b();
        return new fsk();
    }

    @Override // com.vk.billing.StorePurchasesManager
    public final <D extends mge0> void h(Map<String, ? extends D> map, StorePurchasesManager.b bVar) {
        bVar.d(map.size());
    }

    @Override // com.vk.billing.d
    public final io.reactivex.rxjava3.disposables.c i(Activity activity, ArrayList arrayList, ang.a aVar, Boolean bool, Boolean bool2) {
        return EmptyDisposable.INSTANCE;
    }

    @Override // com.vk.billing.d
    public final io.reactivex.rxjava3.disposables.c j(Activity activity, StorePurchasesManager.a aVar, mge0 mge0Var) {
        return EmptyDisposable.INSTANCE;
    }

    @Override // com.vk.billing.d
    public final <D extends mge0> io.reactivex.rxjava3.disposables.c k(Activity activity, D d, StorePurchasesManager.a<D> aVar, Boolean bool, Boolean bool2) {
        return EmptyDisposable.INSTANCE;
    }

    @Override // com.vk.billing.StorePurchasesManager
    public final qge0 l(Activity activity, mge0 mge0Var, StorePurchasesManager.ProrationMode prorationMode, gt8 gt8Var) {
        return new fsk();
    }

    @Override // com.vk.billing.StorePurchasesManager
    public final String m() {
        return "";
    }

    @Override // com.vk.billing.StorePurchasesManager
    public final void b() {
    }
}
