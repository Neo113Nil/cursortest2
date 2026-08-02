package defpackage;

import com.android.billingclient.api.BillingClientStateListener;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ProductDetailsResponseListener;
import com.android.billingclient.api.PurchasesResponseListener;
import com.android.billingclient.api.QueryProductDetailsResult;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class rki implements BillingClientStateListener, ProductDetailsResponseListener, PurchasesResponseListener {
    public final /* synthetic */ AtomicBoolean a;
    public final /* synthetic */ lj2 b;

    public /* synthetic */ rki(AtomicBoolean atomicBoolean, lj2 lj2Var) {
        this.a = atomicBoolean;
        this.b = lj2Var;
    }

    @Override // com.android.billingclient.api.BillingClientStateListener
    public void onBillingServiceDisconnected() {
        if (this.a.compareAndSet(false, true)) {
            lj2 lj2Var = this.b;
            if (lj2Var.r() instanceof oed) {
                p2g p2gVar = w2g.b;
                lj2Var.resumeWith(Boolean.FALSE);
            }
        }
    }

    @Override // com.android.billingclient.api.BillingClientStateListener
    public void onBillingSetupFinished(BillingResult billingResult) {
        billingResult.getClass();
        if (this.a.compareAndSet(false, true)) {
            lj2 lj2Var = this.b;
            if (lj2Var.r() instanceof oed) {
                p2g p2gVar = w2g.b;
                lj2Var.resumeWith(Boolean.valueOf(billingResult.getResponseCode() == 0));
            }
        }
    }

    @Override // com.android.billingclient.api.ProductDetailsResponseListener
    public void onProductDetailsResponse(BillingResult billingResult, QueryProductDetailsResult queryProductDetailsResult) {
        billingResult.getClass();
        queryProductDetailsResult.getClass();
        if (this.a.compareAndSet(false, true)) {
            lj2 lj2Var = this.b;
            if (lj2Var.r() instanceof oed) {
                if (billingResult.getResponseCode() == 0) {
                    p2g p2gVar = w2g.b;
                    lj2Var.resumeWith(queryProductDetailsResult.getProductDetailsList());
                } else {
                    p2g p2gVar2 = w2g.b;
                    lj2Var.resumeWith(null);
                }
            }
        }
    }

    @Override // com.android.billingclient.api.PurchasesResponseListener
    public void onQueryPurchasesResponse(BillingResult billingResult, List list) {
        billingResult.getClass();
        list.getClass();
        if (this.a.compareAndSet(false, true)) {
            lj2 lj2Var = this.b;
            if (lj2Var.r() instanceof oed) {
                if (billingResult.getResponseCode() == 0) {
                    p2g p2gVar = w2g.b;
                    lj2Var.resumeWith(list);
                } else {
                    p2g p2gVar2 = w2g.b;
                    lj2Var.resumeWith(null);
                }
            }
        }
    }
}
