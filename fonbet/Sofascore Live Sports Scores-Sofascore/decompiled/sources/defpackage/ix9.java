package defpackage;

import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingClientStateListener;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.QueryProductDetailsParams;
import kotlin.collections.a;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class ix9 implements BillingClientStateListener {
    public final /* synthetic */ jx9 a;
    public final /* synthetic */ oog b;
    public final /* synthetic */ BillingClient c;

    public ix9(jx9 jx9Var, oog oogVar, BillingClient billingClient) {
        this.a = jx9Var;
        this.b = oogVar;
        this.c = billingClient;
    }

    @Override // com.android.billingclient.api.BillingClientStateListener
    public final void onBillingServiceDisconnected() {
        Boolean bool = Boolean.FALSE;
        this.a.getClass();
        jx9.a(this.b, bool);
    }

    @Override // com.android.billingclient.api.BillingClientStateListener
    public final void onBillingSetupFinished(BillingResult billingResult) {
        billingResult.getClass();
        int responseCode = billingResult.getResponseCode();
        oog oogVar = this.b;
        BillingClient billingClient = this.c;
        jx9 jx9Var = this.a;
        if (responseCode == 0) {
            QueryProductDetailsParams build = QueryProductDetailsParams.newBuilder().setProductList(a.c(QueryProductDetailsParams.Product.newBuilder().setProductId("remove_ads_subscription_v3").setProductType(BillingClient.ProductType.SUBS).build())).build();
            build.getClass();
            billingClient.queryProductDetailsAsync(build, new hcc(11, jx9Var, billingClient, oogVar));
        } else if (billingResult.getResponseCode() == 3) {
            jx9Var.b(false);
            billingClient.endConnection();
            jx9.a(oogVar, Boolean.FALSE);
        }
    }
}
