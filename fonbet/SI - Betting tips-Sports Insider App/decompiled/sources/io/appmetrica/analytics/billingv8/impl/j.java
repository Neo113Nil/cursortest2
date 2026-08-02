package io.appmetrica.analytics.billingv8.impl;

import com.android.billingclient.api.Purchase;
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
    public final /* synthetic */ k f11594a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.android.billingclient.api.k f11595b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f11596c;

    public j(k kVar, com.android.billingclient.api.k kVar2, List list) {
        this.f11594a = kVar;
        this.f11595b = kVar2;
        this.f11596c = list;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x019a A[SYNTHETIC] */
    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void runSafety() {
        LinkedHashMap linkedHashMap;
        ProductInfo productInfo;
        ProductInfo productInfo2;
        String str;
        String str2;
        String str3;
        k kVar = this.f11594a;
        com.android.billingclient.api.k kVar2 = this.f11595b;
        List<Purchase> list = this.f11596c;
        kVar.getClass();
        if (kVar2.f4037a != 0) {
            kVar.f11602f.onUpdateFinished();
        } else {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Purchase purchase : list) {
                Iterator it = purchase.a().iterator();
                while (it.hasNext()) {
                    linkedHashMap2.put((String) it.next(), purchase);
                }
            }
            List<Purchase> list2 = kVar.f11599c;
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            for (Purchase purchase2 : list2) {
                Iterator it2 = purchase2.a().iterator();
                while (it2.hasNext()) {
                    linkedHashMap3.put((String) it2.next(), purchase2);
                }
            }
            List<q> list3 = kVar.f11600d;
            ArrayList arrayList = new ArrayList();
            for (q qVar : list3) {
                String str4 = qVar.f4069c;
                String str5 = qVar.f4070d;
                Purchase purchase3 = (Purchase) linkedHashMap3.get(str4);
                if (purchase3 != null) {
                    JSONObject jSONObject = purchase3.f3959c;
                    Purchase purchase4 = (Purchase) linkedHashMap2.get(qVar.f4069c);
                    int hashCode = str5.hashCode();
                    linkedHashMap = linkedHashMap2;
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
                            productInfo = new ProductInfo(productType, str6, optInt, j, str2, 0L, null, 1, null, purchase3.f3958b, purchase3.c(), purchase3.b(), purchase4 != null ? purchase4.f3959c.optBoolean("autoRenewing") : false, (purchase4 == null || (str3 = purchase4.f3957a) == null) ? "{}" : str3);
                        }
                    } else if (str5.equals("subs")) {
                        productInfo = new ProductInfo(Intrinsics.areEqual(str5, "inapp") ? ProductType.INAPP : Intrinsics.areEqual(str5, "subs") ? ProductType.SUBS : ProductType.UNKNOWN, qVar.f4069c, jSONObject.optInt("quantity", 1), 0L, "", 0L, null, 1, null, purchase3.f3958b, purchase3.c(), purchase3.b(), purchase4 != null ? purchase4.f3959c.optBoolean("autoRenewing") : false, (purchase4 == null || (str = purchase4.f3957a) == null) ? "{}" : str);
                    }
                    productInfo2 = productInfo;
                    if (productInfo2 == null) {
                        arrayList.add(productInfo2);
                    }
                    linkedHashMap2 = linkedHashMap;
                } else {
                    linkedHashMap = linkedHashMap2;
                }
                productInfo = null;
                productInfo2 = productInfo;
                if (productInfo2 == null) {
                }
                linkedHashMap2 = linkedHashMap;
            }
            kVar.f11597a.getBillingInfoSender().sendInfo(arrayList);
            kVar.f11598b.invoke();
            kVar.f11602f.onUpdateFinished();
        }
        k kVar3 = this.f11594a;
        kVar3.f11601e.a(kVar3);
    }
}
