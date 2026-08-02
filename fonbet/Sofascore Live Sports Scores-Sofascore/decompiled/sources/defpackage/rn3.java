package defpackage;

import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.QueryProductDetailsParams;
import com.android.billingclient.api.QueryPurchasesParams;
import kotlin.Unit;
import kotlin.collections.a;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class rn3 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ sn3 b;

    public /* synthetic */ rn3(sn3 sn3Var, int i) {
        this.a = i;
        this.b = sn3Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        sn3 sn3Var = this.b;
        switch (i) {
            case 0:
                BillingClient billingClient = sn3Var.g;
                if (billingClient != null) {
                    QueryPurchasesParams build = QueryPurchasesParams.newBuilder().setProductType(BillingClient.ProductType.INAPP).build();
                    build.getClass();
                    billingClient.queryPurchasesAsync(build, new qn3(sn3Var, 3));
                }
                break;
            default:
                QueryProductDetailsParams build2 = QueryProductDetailsParams.newBuilder().setProductList(a.c(QueryProductDetailsParams.Product.newBuilder().setProductId("weekly_streak_restore_consume").setProductType(BillingClient.ProductType.INAPP).build())).build();
                build2.getClass();
                BillingClient billingClient2 = sn3Var.g;
                if (billingClient2 != null) {
                    billingClient2.queryProductDetailsAsync(build2, new qn3(sn3Var, 0));
                }
                break;
        }
        return Unit.a;
    }
}
