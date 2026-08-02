package defpackage;

import android.app.Activity;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.ProductDetails;
import com.android.billingclient.api.QueryProductDetailsParams;
import com.sofascore.results.subscription.SubscriptionPriceBundle;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class zki extends hoi implements Function2 {
    public int r;
    public final /* synthetic */ s5k s;
    public final /* synthetic */ bli t;
    public final /* synthetic */ BillingClient u;
    public final /* synthetic */ WeakReference v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zki(s5k s5kVar, bli bliVar, BillingClient billingClient, WeakReference weakReference, rq3 rq3Var) {
        super(2, rq3Var);
        this.s = s5kVar;
        this.t = bliVar;
        this.u = billingClient;
        this.v = weakReference;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new zki(this.s, this.t, this.u, this.v, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((zki) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:0x01d4, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.c(r10, "freetrial1y") == false) goto L114;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0276 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x024d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0239  */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object m;
        ProductDetails productDetails;
        String str;
        Object obj2;
        ProductDetails productDetails2;
        ProductDetails productDetails3;
        SubscriptionPriceBundle subscriptionPriceBundle;
        ProductDetails.PricingPhase pricingPhase;
        Long l;
        long priceAmountMicros;
        long longValue;
        Iterator<E> it;
        Object obj3;
        Iterator<E> it2;
        Object obj4;
        Object obj5;
        ProductDetails.PricingPhases pricingPhases;
        ProductDetails.PricingPhases pricingPhases2;
        Object obj6;
        Object obj7;
        lu3 lu3Var = lu3.a;
        int i = this.r;
        if (i == 0) {
            y6a.M(obj);
            List list = this.s.a;
            ArrayList arrayList = new ArrayList(k13.r(list, 10));
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                arrayList.add(QueryProductDetailsParams.Product.newBuilder().setProductId(((eli) it3.next()).a).setProductType(BillingClient.ProductType.SUBS).build());
            }
            LinkedHashMap linkedHashMap = bli.s;
            QueryProductDetailsParams build = QueryProductDetailsParams.newBuilder().setProductList(arrayList).build();
            build.getClass();
            this.r = 1;
            m = bli.m(this.u, build, this);
            if (m == lu3Var) {
                return lu3Var;
            }
        } else {
            if (i != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
            m = obj;
        }
        List list2 = (List) m;
        Activity activity = (Activity) this.v.get();
        if (activity != null) {
            LinkedHashMap linkedHashMap2 = bli.s;
            bli bliVar = this.t;
            int ordinal = bliVar.n.ordinal();
            if (ordinal == 0 || ordinal == 1) {
                if (list2 != null) {
                    Iterator it4 = list2.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it4.next();
                        if (Intrinsics.c(((ProductDetails) obj2).getProductId(), "ai_analysis_subscription")) {
                            break;
                        }
                    }
                    productDetails = (ProductDetails) obj2;
                } else {
                    productDetails = null;
                }
                s5k s5kVar = bliVar.n;
                s5k s5kVar2 = s5k.b;
                SubscriptionPriceBundle e = bliVar.e(s5kVar, productDetails);
                if (productDetails != null) {
                    if ((e != null ? e.g : null) != null) {
                        boolean z = bliVar.n == s5kVar2 && e.m != null;
                        String str2 = z ? e.m : e.g;
                        if (z) {
                            cu cuVar = cu.e;
                            str = "black-friday-2025";
                        } else {
                            cu cuVar2 = e.i;
                            str = cuVar2 != null ? cuVar2.a : null;
                        }
                        bliVar.o = str;
                        BillingClient billingClient = bliVar.p;
                        if (billingClient != null) {
                            xw3.L(bliVar.e, null, null, new w32(new WeakReference(activity), billingClient, bliVar, productDetails, str2, null, 3), 3);
                        }
                    }
                }
            } else {
                if (ordinal != 2) {
                    zzl.b();
                    return null;
                }
                if (list2 != null) {
                    Iterator it5 = list2.iterator();
                    while (true) {
                        if (!it5.hasNext()) {
                            obj7 = null;
                            break;
                        }
                        obj7 = it5.next();
                        if (Intrinsics.c(((ProductDetails) obj7).getProductId(), "remove_ads_subscription_v3")) {
                            break;
                        }
                    }
                    productDetails2 = (ProductDetails) obj7;
                } else {
                    productDetails2 = null;
                }
                if (list2 != null) {
                    Iterator it6 = list2.iterator();
                    while (true) {
                        if (!it6.hasNext()) {
                            obj6 = null;
                            break;
                        }
                        obj6 = it6.next();
                        if (Intrinsics.c(((ProductDetails) obj6).getProductId(), "ai_analysis_subscription")) {
                            break;
                        }
                    }
                    productDetails3 = (ProductDetails) obj6;
                } else {
                    productDetails3 = null;
                }
                if (productDetails2 != null && productDetails3 != null) {
                    s5k s5kVar3 = bliVar.n;
                    List<ProductDetails.SubscriptionOfferDetails> subscriptionOfferDetails = productDetails2.getSubscriptionOfferDetails();
                    if (subscriptionOfferDetails == null) {
                        subscriptionOfferDetails = km5.a;
                    }
                    ProductDetails.SubscriptionOfferDetails d = bliVar.d(subscriptionOfferDetails, s5kVar3, false);
                    List<ProductDetails.SubscriptionOfferDetails> subscriptionOfferDetails2 = productDetails2.getSubscriptionOfferDetails();
                    if (subscriptionOfferDetails2 == null) {
                        subscriptionOfferDetails2 = km5.a;
                    }
                    ProductDetails.SubscriptionOfferDetails d2 = bliVar.d(subscriptionOfferDetails2, s5kVar3, true);
                    List<ProductDetails.PricingPhase> pricingPhaseList = (d == null || (pricingPhases2 = d.getPricingPhases()) == null) ? null : pricingPhases2.getPricingPhaseList();
                    List<ProductDetails.PricingPhase> pricingPhaseList2 = (d2 == null || (pricingPhases = d2.getPricingPhases()) == null) ? null : pricingPhases.getPricingPhaseList();
                    if (pricingPhaseList == null || (pricingPhase = (ProductDetails.PricingPhase) CollectionsKt.j0(pricingPhaseList)) == null) {
                        subscriptionPriceBundle = null;
                    } else {
                        ProductDetails.PricingPhase pricingPhase2 = (ProductDetails.PricingPhase) CollectionsKt.firstOrNull(pricingPhaseList);
                        Long valueOf = pricingPhase2 != null ? Long.valueOf(pricingPhase2.getPriceAmountMicros()) : null;
                        long priceAmountMicros2 = pricingPhase.getPriceAmountMicros();
                        if ((valueOf != null && priceAmountMicros2 == valueOf.longValue()) || (valueOf != null && valueOf.longValue() == 0)) {
                            valueOf = Long.valueOf(pricingPhase.getPriceAmountMicros());
                        }
                        ProductDetails.PricingPhase pricingPhase3 = pricingPhaseList2 != null ? (ProductDetails.PricingPhase) CollectionsKt.j0(pricingPhaseList2) : null;
                        if (pricingPhaseList2 != null) {
                            Iterator<T> it7 = pricingPhaseList2.iterator();
                            while (true) {
                                if (!it7.hasNext()) {
                                    obj5 = null;
                                    break;
                                }
                                obj5 = it7.next();
                                if (((ProductDetails.PricingPhase) obj5).getPriceAmountMicros() != 0) {
                                    break;
                                }
                            }
                            ProductDetails.PricingPhase pricingPhase4 = (ProductDetails.PricingPhase) obj5;
                            if (pricingPhase4 != null) {
                                l = Long.valueOf(pricingPhase4.getPriceAmountMicros());
                                if (Intrinsics.c(pricingPhase3 == null ? Long.valueOf(pricingPhase3.getPriceAmountMicros()) : null, l)) {
                                    l = pricingPhase3 != null ? Long.valueOf(pricingPhase3.getPriceAmountMicros()) : null;
                                }
                                double longValue2 = (valueOf == null ? valueOf.longValue() : pricingPhase.getPriceAmountMicros()) / 1000000.0d;
                                if (pricingPhase3 != null) {
                                    Long valueOf2 = Long.valueOf(pricingPhase3.getPriceAmountMicros());
                                    if (d2.getOfferId() != null) {
                                        String offerId = d2.getOfferId();
                                        iyf iyfVar = iyf.c;
                                    }
                                    valueOf2 = null;
                                    if (valueOf2 != null) {
                                        priceAmountMicros = valueOf2.longValue();
                                        double d3 = priceAmountMicros / 1000000.0d;
                                        if (l != null) {
                                            longValue = l.longValue();
                                        } else {
                                            Long valueOf3 = pricingPhase3 != null ? Long.valueOf(pricingPhase3.getPriceAmountMicros()) : null;
                                            longValue = valueOf3 != null ? valueOf3.longValue() : Long.MAX_VALUE;
                                        }
                                        double d4 = longValue / 1000000.0d;
                                        String productId = productDetails2.getProductId();
                                        productId.getClass();
                                        String priceCurrencyCode = pricingPhase.getPriceCurrencyCode();
                                        priceCurrencyCode.getClass();
                                        String offerToken = d.getOfferToken();
                                        offerToken.getClass();
                                        if (d2 != null || (r4 = d2.getOfferToken()) == null) {
                                            String str3 = "";
                                        }
                                        String str4 = str3;
                                        it = iyf.f.iterator();
                                        while (true) {
                                            if (!it.hasNext()) {
                                                obj3 = null;
                                                break;
                                            }
                                            obj3 = it.next();
                                            if (((iyf) obj3).a.equals(d.getOfferId())) {
                                                break;
                                            }
                                        }
                                        iyf iyfVar2 = (iyf) obj3;
                                        it2 = iyf.f.iterator();
                                        while (true) {
                                            if (!it2.hasNext()) {
                                                obj4 = null;
                                                break;
                                            }
                                            obj4 = it2.next();
                                            if (((iyf) obj4).a.equals(d2 != null ? d2.getOfferId() : null)) {
                                                break;
                                            }
                                        }
                                        subscriptionPriceBundle = new SubscriptionPriceBundle(productId, longValue2, null, Double.valueOf(d4), Double.valueOf(d3), priceCurrencyCode, offerToken, str4, null, iyfVar2, (iyf) obj4, null, null, 2308);
                                    }
                                }
                                priceAmountMicros = 12 * pricingPhase.getPriceAmountMicros();
                                double d32 = priceAmountMicros / 1000000.0d;
                                if (l != null) {
                                }
                                double d42 = longValue / 1000000.0d;
                                String productId2 = productDetails2.getProductId();
                                productId2.getClass();
                                String priceCurrencyCode2 = pricingPhase.getPriceCurrencyCode();
                                priceCurrencyCode2.getClass();
                                String offerToken2 = d.getOfferToken();
                                offerToken2.getClass();
                                if (d2 != null) {
                                }
                                String str32 = "";
                                String str42 = str32;
                                it = iyf.f.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                    }
                                }
                                iyf iyfVar22 = (iyf) obj3;
                                it2 = iyf.f.iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                    }
                                }
                                subscriptionPriceBundle = new SubscriptionPriceBundle(productId2, longValue2, null, Double.valueOf(d42), Double.valueOf(d32), priceCurrencyCode2, offerToken2, str42, null, iyfVar22, (iyf) obj4, null, null, 2308);
                            }
                        }
                        l = null;
                        if (Intrinsics.c(pricingPhase3 == null ? Long.valueOf(pricingPhase3.getPriceAmountMicros()) : null, l)) {
                        }
                        double longValue22 = (valueOf == null ? valueOf.longValue() : pricingPhase.getPriceAmountMicros()) / 1000000.0d;
                        if (pricingPhase3 != null) {
                        }
                        priceAmountMicros = 12 * pricingPhase.getPriceAmountMicros();
                        double d322 = priceAmountMicros / 1000000.0d;
                        if (l != null) {
                        }
                        double d422 = longValue / 1000000.0d;
                        String productId22 = productDetails2.getProductId();
                        productId22.getClass();
                        String priceCurrencyCode22 = pricingPhase.getPriceCurrencyCode();
                        priceCurrencyCode22.getClass();
                        String offerToken22 = d.getOfferToken();
                        offerToken22.getClass();
                        if (d2 != null) {
                        }
                        String str322 = "";
                        String str422 = str322;
                        it = iyf.f.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                            }
                        }
                        iyf iyfVar222 = (iyf) obj3;
                        it2 = iyf.f.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                            }
                        }
                        subscriptionPriceBundle = new SubscriptionPriceBundle(productId22, longValue22, null, Double.valueOf(d422), Double.valueOf(d322), priceCurrencyCode22, offerToken22, str422, null, iyfVar222, (iyf) obj4, null, null, 2308);
                    }
                    bliVar.l.m(null, new dli(subscriptionPriceBundle, bliVar.e(bliVar.n, productDetails3), 4));
                }
            }
        }
        return Unit.a;
    }
}
