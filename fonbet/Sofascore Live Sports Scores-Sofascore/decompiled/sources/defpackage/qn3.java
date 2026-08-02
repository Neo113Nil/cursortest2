package defpackage;

import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ProductDetails;
import com.android.billingclient.api.ProductDetailsResponseListener;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchasesResponseListener;
import com.android.billingclient.api.PurchasesUpdatedListener;
import com.android.billingclient.api.QueryProductDetailsResult;
import com.sofascore.results.weeklyChallenge.leaderboard.WeeklyLeaderboardFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.a;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class qn3 implements ProductDetailsResponseListener, PurchasesUpdatedListener, PurchasesResponseListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ sn3 b;

    public /* synthetic */ qn3(sn3 sn3Var, int i) {
        this.a = i;
        this.b = sn3Var;
    }

    @Override // com.android.billingclient.api.ProductDetailsResponseListener
    public void onProductDetailsResponse(BillingResult billingResult, QueryProductDetailsResult queryProductDetailsResult) {
        billingResult.getClass();
        queryProductDetailsResult.getClass();
        List<ProductDetails> productDetailsList = queryProductDetailsResult.getProductDetailsList();
        if (billingResult.getResponseCode() != 0 || productDetailsList == null || productDetailsList.isEmpty()) {
            return;
        }
        ProductDetails productDetails = productDetailsList.get(0);
        sn3 sn3Var = this.b;
        uri uriVar = sn3Var.d;
        if (uriVar != null) {
            Integer num = sn3Var.e;
            Integer valueOf = Integer.valueOf(num != null ? num.intValue() : 0);
            Long l = sn3Var.f;
            uriVar.invoke(productDetails, valueOf, Long.valueOf(l != null ? l.longValue() : 0L));
        }
    }

    @Override // com.android.billingclient.api.PurchasesUpdatedListener
    public void onPurchasesUpdated(BillingResult billingResult, List list) {
        billingResult.getClass();
        if (billingResult.getResponseCode() != 0 || list == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            sn3 sn3Var = this.b;
            if (!hasNext) {
                sn3Var.b(arrayList);
                return;
            }
            Purchase purchase = (Purchase) it.next();
            purchase.getProducts();
            if (purchase.getProducts().contains("weekly_streak_restore_consume")) {
                arrayList.add(purchase);
                f5p.E(sn3Var.a, new hy1(sn3Var, purchase, null, 19));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [rq3] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v3, types: [km5] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, sn3] */
    @Override // com.android.billingclient.api.PurchasesResponseListener
    public void onQueryPurchasesResponse(BillingResult billingResult, List list) {
        Object obj;
        int i = this.a;
        ?? r2 = 0;
        r2 = 0;
        ?? r7 = this.b;
        switch (i) {
            case 2:
                billingResult.getClass();
                list.getClass();
                if (billingResult.getResponseCode() == 0) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : list) {
                        Purchase purchase = (Purchase) obj2;
                        if (purchase.getPurchaseState() == 2 || (!purchase.isAcknowledged() && purchase.getPurchaseState() == 1)) {
                            arrayList.add(obj2);
                        }
                    }
                    yia yiaVar = r7.c;
                    if (yiaVar != null) {
                        boolean z = !arrayList.isEmpty();
                        fdi fdiVar = ((WeeklyLeaderboardFragment) yiaVar.b).D().r;
                        Boolean valueOf = Boolean.valueOf(z);
                        fdiVar.getClass();
                        fdiVar.m(null, valueOf);
                    }
                    ArrayList arrayList2 = r7.i;
                    ArrayList arrayList3 = new ArrayList(k13.r(arrayList, 10));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList3.add(((Purchase) it.next()).getPurchaseToken());
                    }
                    arrayList2.addAll(arrayList3);
                    ArrayList arrayList4 = new ArrayList();
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        Object next = it2.next();
                        Purchase purchase2 = (Purchase) next;
                        if (!purchase2.isAcknowledged() && purchase2.getPurchaseState() == 1) {
                            arrayList4.add(next);
                        }
                    }
                    Iterator it3 = arrayList4.iterator();
                    while (it3.hasNext()) {
                        Purchase purchase3 = (Purchase) it3.next();
                        if (purchase3.getProducts().contains("weekly_streak_restore_consume")) {
                            f5p.E(r7.a, new hy1(r7, purchase3, r2, 19));
                            yia yiaVar2 = r7.c;
                            if (yiaVar2 != null) {
                                yiaVar2.h(purchase3.getPurchaseToken(), tn3.e);
                            }
                        }
                    }
                    break;
                }
                break;
            default:
                billingResult.getClass();
                list.getClass();
                if (billingResult.getResponseCode() != 0) {
                    list = null;
                }
                if (list != null) {
                    Iterator it4 = list.iterator();
                    while (true) {
                        if (it4.hasNext()) {
                            obj = it4.next();
                            if (((Purchase) obj).getProducts().contains("weekly_streak_restore_consume")) {
                            }
                        } else {
                            obj = null;
                        }
                    }
                    Purchase purchase4 = (Purchase) obj;
                    if (purchase4 != null) {
                        r2 = a.c(purchase4);
                    }
                }
                if (r2 == 0) {
                    r2 = km5.a;
                }
                r7.b(r2);
                break;
        }
    }
}
