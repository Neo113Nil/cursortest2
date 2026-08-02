package defpackage;

import android.content.Context;
import com.android.billingclient.api.AcknowledgePurchaseResponseListener;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ProductDetails;
import com.android.billingclient.api.Purchase;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class qki implements AcknowledgePurchaseResponseListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Purchase b;
    public final /* synthetic */ bli c;

    public /* synthetic */ qki(Purchase purchase, bli bliVar, int i) {
        this.a = i;
        this.b = purchase;
        this.c = bliVar;
    }

    @Override // com.android.billingclient.api.AcknowledgePurchaseResponseListener
    public final void onAcknowledgePurchaseResponse(BillingResult billingResult) {
        int i = this.a;
        bli bliVar = this.c;
        Purchase purchase = this.b;
        switch (i) {
            case 0:
                billingResult.getClass();
                List<String> products = purchase.getProducts();
                products.getClass();
                for (String str : products) {
                    Context context = bliVar.a;
                    str.getClass();
                    nv.I(context, str, (ProductDetails.PricingPhase) bli.s.get(str));
                }
                break;
            default:
                billingResult.getClass();
                if (billingResult.getResponseCode() == 0) {
                    List<String> products2 = purchase.getProducts();
                    products2.getClass();
                    for (String str2 : products2) {
                        Context context2 = bliVar.a;
                        str2.getClass();
                        nv.I(context2, str2, (ProductDetails.PricingPhase) bli.s.get(str2));
                    }
                    break;
                }
                break;
        }
    }
}
