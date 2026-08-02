package io.appmetrica.analytics.billingv6.impl;

import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchaseHistoryRecord;
import com.android.billingclient.api.q;
import io.appmetrica.analytics.billinginterface.internal.ProductInfo;
import io.appmetrica.analytics.billinginterface.internal.ProductType;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class j extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f11541a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.android.billingclient.api.k f11542b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f11543c;

    public j(k kVar, com.android.billingclient.api.k kVar2, List list) {
        this.f11541a = kVar;
        this.f11542b = kVar2;
        this.f11543c = list;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01a0 A[SYNTHETIC] */
    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void runSafety() {
        LinkedHashMap linkedHashMap;
        Iterator it;
        ProductInfo productInfo;
        ProductInfo productInfo2;
        String str;
        String str2;
        String str3;
        k kVar = this.f11541a;
        com.android.billingclient.api.k kVar2 = this.f11542b;
        List<Purchase> list = this.f11543c;
        kVar.getClass();
        if (kVar2.f4037a != 0) {
            kVar.f11549f.onUpdateFinished();
        } else {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Purchase purchase : list) {
                Iterator it2 = purchase.a().iterator();
                while (it2.hasNext()) {
                    linkedHashMap2.put((String) it2.next(), purchase);
                }
            }
            List<PurchaseHistoryRecord> list2 = kVar.f11546c;
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            for (PurchaseHistoryRecord purchaseHistoryRecord : list2) {
                Iterator it3 = purchaseHistoryRecord.a().iterator();
                while (it3.hasNext()) {
                    linkedHashMap3.put((String) it3.next(), purchaseHistoryRecord);
                }
            }
            List list3 = kVar.f11547d;
            ArrayList arrayList = new ArrayList();
            Iterator it4 = list3.iterator();
            while (it4.hasNext()) {
                q qVar = (q) it4.next();
                String str4 = qVar.f4069c;
                String str5 = qVar.f4070d;
                PurchaseHistoryRecord purchaseHistoryRecord2 = (PurchaseHistoryRecord) linkedHashMap3.get(str4);
                if (purchaseHistoryRecord2 != null) {
                    JSONObject jSONObject = purchaseHistoryRecord2.f3962c;
                    Purchase purchase2 = (Purchase) linkedHashMap2.get(qVar.f4069c);
                    int hashCode = str5.hashCode();
                    linkedHashMap = linkedHashMap2;
                    it = it4;
                    if (hashCode != 3541555) {
                        if (hashCode == 100343516 && str5.equals("inapp")) {
                            ProductType productType = Intrinsics.areEqual(str5, "inapp") ? ProductType.INAPP : Intrinsics.areEqual(str5, "subs") ? ProductType.SUBS : ProductType.UNKNOWN;
                            String str6 = qVar.f4069c;
                            int optInt = jSONObject.optInt("quantity", 1);
                            com.android.billingclient.api.n a7 = qVar.a();
                            long j = a7 != null ? a7.f4049b : 0L;
                            com.android.billingclient.api.n a10 = qVar.a();
                            if (a10 == null || (str2 = a10.f4050c) == null) {
                                str2 = "";
                            }
                            productInfo = new ProductInfo(productType, str6, optInt, j, str2, 0L, null, 1, null, purchaseHistoryRecord2.f3961b, purchaseHistoryRecord2.b(), jSONObject.optLong("purchaseTime"), purchase2 != null ? purchase2.f3959c.optBoolean("autoRenewing") : false, (purchase2 == null || (str3 = purchase2.f3957a) == null) ? "{}" : str3);
                        }
                    } else if (str5.equals("subs")) {
                        productInfo = new ProductInfo(Intrinsics.areEqual(str5, "inapp") ? ProductType.INAPP : Intrinsics.areEqual(str5, "subs") ? ProductType.SUBS : ProductType.UNKNOWN, qVar.f4069c, jSONObject.optInt("quantity", 1), 0L, "", 0L, null, 1, null, purchaseHistoryRecord2.f3961b, purchaseHistoryRecord2.b(), jSONObject.optLong("purchaseTime"), purchase2 != null ? purchase2.f3959c.optBoolean("autoRenewing") : false, (purchase2 == null || (str = purchase2.f3957a) == null) ? "{}" : str);
                    }
                    productInfo2 = productInfo;
                    if (productInfo2 == null) {
                        arrayList.add(productInfo2);
                    }
                    linkedHashMap2 = linkedHashMap;
                    it4 = it;
                } else {
                    linkedHashMap = linkedHashMap2;
                    it = it4;
                }
                productInfo = null;
                productInfo2 = productInfo;
                if (productInfo2 == null) {
                }
                linkedHashMap2 = linkedHashMap;
                it4 = it;
            }
            kVar.f11544a.getBillingInfoSender().sendInfo(arrayList);
            kVar.f11545b.invoke();
            kVar.f11549f.onUpdateFinished();
        }
        k kVar3 = this.f11541a;
        kVar3.f11548e.a(kVar3);
    }
}
