package com.my.tracker.obfuscated;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.huawei.hmf.tasks.Task;
import com.huawei.hms.iap.Iap;
import com.huawei.hms.iap.IapClient;
import com.huawei.hms.iap.entity.OwnedPurchasesReq;
import com.huawei.hms.iap.entity.OwnedPurchasesResult;
import com.huawei.hms.iap.entity.ProductInfo;
import com.huawei.hms.iap.entity.ProductInfoReq;
import com.huawei.hms.iap.entity.ProductInfoResult;
import com.huawei.hms.iap.entity.PurchaseResultInfo;
import com.my.tracker.obfuscated.d;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONObject;
import ru.ok.android.webrtc.stat.listener.mapper.RTCStatsConstants;
import xsna.boy0;
import xsna.c680;
import xsna.cc80;
import xsna.dez0;
import xsna.ger;
import xsna.j6o0;
import xsna.rff;
import xsna.vny0;

/* loaded from: classes.dex */
public final class d {
    final IapClient a;
    final Context b;
    final b c;
    Set d;

    public static final class a {
        final IapClient a;
        final Context b;

        public a(IapClient iapClient, Context context) {
            this.a = iapClient;
            this.b = context;
        }

        public d a(b bVar) {
            return new d(this.a, bVar, this.b);
        }
    }

    public interface b {
        void a(List list);

        void c(List list);
    }

    /* loaded from: classes14.dex */
    public final class c implements cc80 {
        final int a;
        final int b;
        final List c = dez0.b();
        final List d = dez0.b();
        String e;

        public c(int i, int i2) {
            this.a = i;
            this.b = i2;
            x2.a("OwnedPurchaseLoader: loader created");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(OwnedPurchasesResult ownedPurchasesResult) {
            this.c.addAll(ownedPurchasesResult.getInAppPurchaseDataList());
            this.d.addAll(ownedPurchasesResult.getInAppSignature());
            String continuationToken = ownedPurchasesResult.getContinuationToken();
            if (!TextUtils.isEmpty(continuationToken)) {
                x2.a("OwnedPurchaseLoader: loading more obtainOwnedPurchasesRecord by continuationToken");
                b(continuationToken);
                return;
            }
            if (this.c.isEmpty()) {
                x2.a("OwnedPurchaseLoader: failure load obtain owned purchases. Purchases is null. source is " + this.b + " priceType is " + this.a);
                d.this.b(this);
                return;
            }
            if (!this.d.isEmpty()) {
                this.e = ownedPurchasesResult.getSignatureAlgorithm();
                d.this.a(this);
                return;
            }
            x2.a("OwnedPurchaseLoader: failure load obtain owned purchases. Signatures is null. source is " + this.b + " priceType is " + this.a);
            d.this.b(this);
        }

        @Override // xsna.cc80
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(final OwnedPurchasesResult ownedPurchasesResult) {
            m.a(new Runnable() { // from class: com.my.tracker.obfuscated.f3
                @Override // java.lang.Runnable
                public final void run() {
                    d.c.this.a(ownedPurchasesResult);
                }
            });
        }

        public void b(final String str) {
            m.f(new Runnable() { // from class: com.my.tracker.obfuscated.e3
                @Override // java.lang.Runnable
                public final void run() {
                    d.c.this.a(str);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(String str) {
            Task obtainOwnedPurchaseRecord;
            x2.a("OwnedPurchaseLoader: start loadPurchases");
            OwnedPurchasesReq ownedPurchasesReq = new OwnedPurchasesReq();
            ownedPurchasesReq.setPriceType(this.a);
            ownedPurchasesReq.setContinuationToken(str);
            int i = this.b;
            if (i == 2) {
                obtainOwnedPurchaseRecord = d.this.a.obtainOwnedPurchases(ownedPurchasesReq);
            } else if (i == 3) {
                obtainOwnedPurchaseRecord = d.this.a.obtainOwnedPurchaseRecord(ownedPurchasesReq);
            } else {
                x2.a("OwnedPurchaseLoader: invalid source to load purchases");
                d.this.b(this);
                return;
            }
            obtainOwnedPurchaseRecord.b(new c680() { // from class: com.my.tracker.obfuscated.d3
                @Override // xsna.c680
                public final void onFailure(Exception exc) {
                    d.c.this.a(exc);
                }
            });
            obtainOwnedPurchaseRecord.c(this);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(Exception exc) {
            x2.a("AppGalleryHelper: onLoadingPurchasesFailure ", exc);
            d.this.b(this);
        }
    }

    public d(IapClient iapClient, b bVar, Context context) {
        this.a = iapClient;
        this.c = bVar;
        this.b = context;
        x2.a("AppGalleryHelper AppGalleryHelper created");
    }

    public static a a(Context context) {
        try {
            return new a(Iap.getIapClient(context), context);
        } catch (Throwable th) {
            x2.b("AppGalleryHelper: creating AppGalleryHelperBuilder failed", th);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(Intent intent) {
        PurchaseResultInfo parsePurchaseResultInfoFromIntent = this.a.parsePurchaseResultInfoFromIntent(intent);
        int returnCode = parsePurchaseResultInfoFromIntent.getReturnCode();
        if (returnCode == 0) {
            this.c.a(Collections.singletonList(f.a(parsePurchaseResultInfoFromIntent.getInAppPurchaseData(), parsePurchaseResultInfoFromIntent.getInAppDataSignature(), parsePurchaseResultInfoFromIntent.getSignatureAlgorithm(), 1, v2.a())));
        } else {
            x2.b("AppGalleryHelper error: can not getting PurchaseResultInfo. resultCode " + returnCode);
        }
    }

    public static JSONObject a(Object obj) {
        x2.a("AppGalleryHelper: start parseProductInfoToJson");
        try {
            ProductInfo productInfo = (ProductInfo) obj;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(InAppPurchaseMetaData.KEY_PRODUCT_ID, productInfo.getProductId());
            jSONObject.put("productName", productInfo.getProductName());
            jSONObject.put("productDesc", productInfo.getProductDesc());
            jSONObject.put(InAppPurchaseMetaData.KEY_CURRENCY, productInfo.getCurrency());
            jSONObject.put("price", productInfo.getPrice());
            jSONObject.put("microsPrice", productInfo.getMicrosPrice());
            jSONObject.put("priceType", productInfo.getPriceType());
            jSONObject.put("originalMicroPrice", productInfo.getOriginalMicroPrice());
            jSONObject.put("originalLocalPrice", productInfo.getOriginalLocalPrice());
            jSONObject.put("subPeriod", productInfo.getSubPeriod());
            jSONObject.put("subSpecialPrice", productInfo.getSubSpecialPrice());
            jSONObject.put("subSpecialPriceMicros", productInfo.getSubSpecialPriceMicros());
            jSONObject.put("subSpecialPeriod", productInfo.getSubSpecialPeriod());
            jSONObject.put("subSpecialPeriodCycles", productInfo.getSubSpecialPeriodCycles());
            jSONObject.put("subFreeTrialPeriod", productInfo.getSubFreeTrialPeriod());
            jSONObject.put("subGroupId", productInfo.getSubGroupId());
            jSONObject.put("subGroupTitle", productInfo.getSubGroupTitle());
            jSONObject.put("subProductLevel", productInfo.getSubProductLevel());
            jSONObject.put("status", productInfo.getStatus());
            return jSONObject;
        } catch (NoClassDefFoundError e) {
            x2.b("AppGalleryHelper: ", e);
            return null;
        } catch (Throwable th) {
            x2.b("AppGalleryHelper: ", th);
            return null;
        }
    }

    public void b(c cVar) {
        Set set = this.d;
        if (set == null) {
            x2.a("AppGalleryHelper: can't remove OwnedPurchaseLoader, purchaseLoaders list is null");
            return;
        }
        set.remove(cVar);
        if (set.isEmpty()) {
            this.d = null;
        }
    }

    public static ArrayList a(List list, List list2, String str, int i) {
        ArrayList arrayList = new ArrayList();
        long a2 = v2.a();
        int i2 = 0;
        while (i2 < list.size()) {
            String str2 = str;
            int i3 = i;
            f a3 = f.a((String) list.get(i2), (String) list2.get(i2), str2, i3, a2);
            if (a3 == null) {
                x2.a("AppGalleryHelper: failed to create AppGalleryRawPurchase");
            } else {
                arrayList.add(a3);
            }
            i2++;
            str = str2;
            i = i3;
        }
        return arrayList;
    }

    public void a(Intent intent) {
        x2.a("AppGalleryHelper: starting getAppGalleryPurchaseByIntent");
        m.f(new ger(5, this, intent));
    }

    public void a() {
        HashSet hashSet = new HashSet();
        hashSet.add(new c(0, 2));
        hashSet.add(new c(1, 2));
        hashSet.add(new c(2, 2));
        hashSet.add(new c(0, 3));
        hashSet.add(new c(2, 3));
        this.d = Collections.synchronizedSet(hashSet);
        x2.a("AppGalleryHelper: purchase loaders created");
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((c) it.next()).b((String) null);
        }
    }

    public void a(List list) {
        x2.a("AppGalleryHelper: start loading all products");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            f fVar = (f) it.next();
            try {
                int i = fVar.e().getInt(RTCStatsConstants.KEY_KIND);
                if (i == 0) {
                    arrayList.add(fVar);
                } else if (i == 1) {
                    arrayList2.add(fVar);
                } else if (i == 2) {
                    arrayList3.add(fVar);
                }
            } catch (Throwable th) {
                x2.b("AppGalleryHelper: can not getting price type ", th);
            }
        }
        if (arrayList.size() > 0) {
            a(arrayList, 0);
        }
        if (arrayList2.size() > 0) {
            a(arrayList2, 1);
        }
        if (arrayList3.size() > 0) {
            a(arrayList3, 2);
        }
    }

    public JSONObject a(List list, String str) {
        if (str == null) {
            x2.a("AppGalleryHelper: can't get product by id, id is null");
            return null;
        }
        if (list == null) {
            x2.a("AppGalleryHelper: can't get product by id, productInfoListJson is null");
            return null;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            JSONObject jSONObject = (JSONObject) it.next();
            try {
            } catch (Throwable th) {
                x2.a("AppGalleryHelper: error while reading product_id", th);
            }
            if (jSONObject.getString(InAppPurchaseMetaData.KEY_PRODUCT_ID).equals(str)) {
                return jSONObject;
            }
        }
        return null;
    }

    public void a(List list, int i) {
        x2.a("AppGalleryHelper: start loading products by price");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext() && hashSet.size() < 200) {
            f fVar = (f) it.next();
            hashSet.add(fVar.c());
            arrayList.add(fVar);
            it.remove();
        }
        x2.a("AppGalleryHelper: product id's have been detected");
        while (it.hasNext()) {
            f fVar2 = (f) it.next();
            if (hashSet.contains(fVar2.c())) {
                arrayList.add(fVar2);
                it.remove();
            }
        }
        x2.a("AppGalleryHelper: products deduplication done");
        if (list.size() > 0) {
            x2.a("AppGalleryHelper: there are still unloaded products, we are loading more");
            a(list, i);
        }
        ProductInfoReq productInfoReq = new ProductInfoReq();
        productInfoReq.setPriceType(i);
        productInfoReq.setProductIds(new ArrayList(hashSet));
        m.f(new vny0(this, productInfoReq, arrayList, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(ProductInfoReq productInfoReq, final List list) {
        Task obtainProductInfo = this.a.obtainProductInfo(productInfoReq);
        obtainProductInfo.b(new rff(this, list));
        obtainProductInfo.c(new cc80() { // from class: xsna.eoy0
            @Override // xsna.cc80
            public final void onSuccess(Object obj) {
                com.my.tracker.obfuscated.d.this.a(list, (ProductInfoResult) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(List list, Exception exc) {
        m.a(new j6o0(this, exc, list, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Exception exc, List list) {
        x2.a("AppGalleryHelper: error while loading products ", exc);
        this.c.c(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(List list, ProductInfoResult productInfoResult) {
        m.a(new boy0(this, productInfoResult, list, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(ProductInfoResult productInfoResult, List list) {
        List productInfoList = productInfoResult.getProductInfoList();
        if (productInfoList == null) {
            x2.a("AppGalleryHelper: productInfoList is null, finish products loading");
            this.c.c(list);
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = productInfoList.iterator();
        while (it.hasNext()) {
            arrayList.add(a((ProductInfo) it.next()));
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            f fVar = (f) it2.next();
            fVar.a(a(arrayList, fVar.c()));
        }
        this.c.c(list);
    }

    public void a(c cVar) {
        this.c.a(a(cVar.c, cVar.d, cVar.e, cVar.b));
        b(cVar);
    }
}
