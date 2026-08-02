package com.vk.billing;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.webkit.WebView;
import com.vk.billing.SberpayPurchasesManager;
import com.vk.billing.StorePurchasesManager;
import io.reactivex.rxjava3.core.q;
import java.util.ArrayList;
import java.util.Map;
import xsna.ang;
import xsna.gt8;
import xsna.mge0;
import xsna.oge0;
import xsna.qge0;

/* compiled from: PurchasesManagerImpl.kt */
/* loaded from: classes.dex */
public final class g implements StorePurchasesManager, d, SberpayPurchasesManager, oge0 {
    public final GoogleStorePurchasesManagerImpl a;
    public final d b;
    public final SberpayPurchasesManager c;

    public g(GoogleStorePurchasesManagerImpl googleStorePurchasesManagerImpl, d dVar, SberpayPurchasesManager sberpayPurchasesManager) {
        this.a = googleStorePurchasesManagerImpl;
        this.b = dVar;
        this.c = sberpayPurchasesManager;
    }

    @Override // com.vk.billing.SberpayPurchasesManager
    public final SberpayPurchasesManager.SberpayUriHandleResult a(Context context, Uri uri, WebView webView, String str, SberpayPurchasesManager.SberpayUriHandleResult sberpayUriHandleResult) {
        return this.c.a(context, uri, webView, str, sberpayUriHandleResult);
    }

    @Override // com.vk.billing.StorePurchasesManager
    public final void b() {
        this.a.b();
    }

    @Override // com.vk.billing.StorePurchasesManager
    public final q c(Context context) {
        return this.a.c(context);
    }

    @Override // com.vk.billing.StorePurchasesManager
    public final qge0 d(Activity activity, StorePurchasesManager.a aVar, mge0 mge0Var) {
        return this.a.d(activity, aVar, mge0Var);
    }

    @Override // com.vk.billing.StorePurchasesManager
    public final <D extends mge0> void e(Map<String, ? extends D> map, StorePurchasesManager.b bVar) {
        this.a.e(map, bVar);
    }

    @Override // com.vk.billing.StorePurchasesManager
    public final qge0 f(Activity activity, StorePurchasesManager.a aVar, mge0 mge0Var) {
        return this.a.f(activity, aVar, mge0Var);
    }

    @Override // com.vk.billing.StorePurchasesManager
    public final qge0 g(Activity activity, ArrayList arrayList, ang.a aVar) {
        return this.a.g(activity, arrayList, aVar);
    }

    @Override // com.vk.billing.StorePurchasesManager
    public final <D extends mge0> void h(Map<String, ? extends D> map, StorePurchasesManager.b bVar) {
        this.a.h(map, bVar);
    }

    @Override // com.vk.billing.d
    public final io.reactivex.rxjava3.disposables.c i(Activity activity, ArrayList arrayList, ang.a aVar, Boolean bool, Boolean bool2) {
        return this.b.i(activity, arrayList, aVar, bool, bool2);
    }

    @Override // com.vk.billing.d
    public final io.reactivex.rxjava3.disposables.c j(Activity activity, StorePurchasesManager.a aVar, mge0 mge0Var) {
        return this.b.j(activity, aVar, mge0Var);
    }

    @Override // com.vk.billing.d
    public final <D extends mge0> io.reactivex.rxjava3.disposables.c k(Activity activity, D d, StorePurchasesManager.a<D> aVar, Boolean bool, Boolean bool2) {
        return this.b.k(activity, d, aVar, bool, bool2);
    }

    @Override // com.vk.billing.StorePurchasesManager
    public final qge0 l(Activity activity, mge0 mge0Var, StorePurchasesManager.ProrationMode prorationMode, gt8 gt8Var) {
        return this.a.l(activity, mge0Var, prorationMode, gt8Var);
    }

    @Override // com.vk.billing.StorePurchasesManager
    public final String m() {
        return this.a.c;
    }
}
