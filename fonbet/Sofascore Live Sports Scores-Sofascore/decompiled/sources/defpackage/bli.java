package defpackage;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import com.android.billingclient.api.AcknowledgePurchaseParams;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.PendingPurchasesParams;
import com.android.billingclient.api.ProductDetails;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.QueryProductDetailsParams;
import com.android.billingclient.api.QueryPurchasesParams;
import com.sofascore.model.newNetwork.post.PremiumTokenResponse;
import com.sofascore.results.event.aiInsights.EventAiInsightsAlarmReceiver;
import com.sofascore.results.subscription.SubscriptionPriceBundle;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.coroutines.e;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class bli {
    public static final LinkedHashMap s = new LinkedHashMap();
    public final Context a;
    public final bfk b;
    public final el c;
    public final SharedPreferences d;
    public final ad2 e;
    public final fdi f;
    public final jof g;
    public final fdi h;
    public final jof i;
    public final fdi j;
    public final jof k;
    public final fdi l;
    public final jof m;
    public s5k n;
    public String o;
    public BillingClient p;
    public final fdi q;
    public final jof r;

    public bli(Context context, bfk bfkVar, el elVar, SharedPreferences sharedPreferences) {
        bfkVar.getClass();
        elVar.getClass();
        sharedPreferences.getClass();
        this.a = context;
        this.b = bfkVar;
        this.c = elVar;
        this.d = sharedPreferences;
        smi o = tz9.o();
        hs4 hs4Var = z45.a;
        this.e = s9a.c(e.d(o, rob.a));
        fdi a = gdi.a(null);
        this.f = a;
        this.g = un0.u(a);
        fdi a2 = gdi.a(null);
        this.h = a2;
        this.i = un0.u(a2);
        fdi a3 = gdi.a(null);
        this.j = a3;
        this.k = un0.u(a3);
        fdi a4 = gdi.a(new dli(null, null, 7));
        this.l = a4;
        this.m = un0.u(a4);
        this.n = s5k.d;
        fdi a5 = gdi.a(Boolean.FALSE);
        this.q = a5;
        this.r = un0.u(a5);
    }

    public static Object m(BillingClient billingClient, QueryProductDetailsParams queryProductDetailsParams, sq3 sq3Var) {
        lj2 lj2Var = new lj2(1, z9a.b(sq3Var));
        lj2Var.t();
        billingClient.queryProductDetailsAsync(queryProductDetailsParams, new rki(new AtomicBoolean(false), lj2Var));
        Object q = lj2Var.q();
        lu3 lu3Var = lu3.a;
        return q;
    }

    public static Object n(BillingClient billingClient, QueryPurchasesParams queryPurchasesParams, sq3 sq3Var) {
        lj2 lj2Var = new lj2(1, z9a.b(sq3Var));
        lj2Var.t();
        billingClient.queryPurchasesAsync(queryPurchasesParams, new rki(new AtomicBoolean(false), lj2Var));
        Object q = lj2Var.q();
        lu3 lu3Var = lu3.a;
        return q;
    }

    public final void a() {
        BillingClient billingClient = this.p;
        if (billingClient != null) {
            if (!billingClient.isReady()) {
                billingClient = null;
            }
            if (billingClient != null) {
                billingClient.endConnection();
            }
        }
        this.p = null;
        this.q.m(null, Boolean.FALSE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x0122, code lost:
    
        if (defpackage.bfk.e(r23.b, null, null, null, null, null, null, null, null, null, r13, 7167) == r2) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0152, code lost:
    
        if (r1 == r2) goto L65;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(sq3 sq3Var) {
        ski skiVar;
        int i;
        int i2;
        boolean z;
        SharedPreferences sharedPreferences;
        Object obj;
        if (sq3Var instanceof ski) {
            skiVar = (ski) sq3Var;
            int i3 = skiVar.u;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                skiVar.u = i3 - Integer.MIN_VALUE;
                ski skiVar2 = skiVar;
                Object obj2 = skiVar2.s;
                lu3 lu3Var = lu3.a;
                i = skiVar2.u;
                SharedPreferences sharedPreferences2 = this.d;
                r8 = null;
                List list = null;
                if (i != 0) {
                    y6a.M(obj2);
                    BillingClient billingClient = this.p;
                    if (billingClient == null) {
                        return Boolean.FALSE;
                    }
                    Boolean hasPremium = this.b.b().getHasPremium();
                    if (hasPremium != null ? hasPremium.booleanValue() : false) {
                        skiVar2.r = 0;
                        skiVar2.u = 1;
                        el elVar = this.c;
                        elVar.getClass();
                        obj2 = yaa.P(new dl(elVar, "", (String) null, (Long) null, (Long) null, (rq3) null), skiVar2);
                        if (obj2 != lu3Var) {
                            i2 = 0;
                            x2g x2gVar = (x2g) obj2;
                            z = x2gVar instanceof v2g;
                            Context context = this.a;
                            if (!z) {
                            }
                        }
                    } else {
                        QueryPurchasesParams build = QueryPurchasesParams.newBuilder().setProductType(BillingClient.ProductType.SUBS).build();
                        build.getClass();
                        skiVar2.r = 0;
                        skiVar2.u = 3;
                        obj2 = n(billingClient, build, skiVar2);
                    }
                    return lu3Var;
                }
                if (i != 1) {
                    if (i == 2) {
                        y6a.M(obj2);
                        sharedPreferences = sharedPreferences2;
                        SharedPreferences.Editor edit = sharedPreferences.edit();
                        edit.getClass();
                        edit.remove("PR_XAIST");
                        edit.apply();
                        return Boolean.FALSE;
                    }
                    if (i != 3) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj2);
                    List list2 = (List) obj2;
                    if (list2 != null) {
                        Iterator it = list2.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it.next();
                            if (((Purchase) obj).getProducts().contains("ai_analysis_subscription")) {
                                break;
                            }
                        }
                        Purchase purchase = (Purchase) obj;
                        if (purchase != null) {
                            list = a.c(purchase);
                        }
                    }
                    i(list, true);
                    return Boolean.TRUE;
                }
                i2 = skiVar2.r;
                y6a.M(obj2);
                x2g x2gVar2 = (x2g) obj2;
                z = x2gVar2 instanceof v2g;
                Context context2 = this.a;
                if (!z) {
                    PremiumTokenResponse premiumTokenResponse = (PremiumTokenResponse) ((v2g) x2gVar2).a;
                    String token = premiumTokenResponse.getToken();
                    if (token == null || token.length() == 0) {
                        nv.q0(context2, 2, "empty_token_force");
                    }
                    SharedPreferences.Editor edit2 = sharedPreferences2.edit();
                    edit2.getClass();
                    edit2.putString("PR_XAIST", premiumTokenResponse.getToken());
                    edit2.apply();
                    this.f.m(null, eli.AI);
                    return Boolean.TRUE;
                }
                if (!(x2gVar2 instanceof t2g)) {
                    zzl.b();
                    return null;
                }
                Throwable th = ((t2g) x2gVar2).a;
                wi9 wi9Var = th instanceof wi9 ? (wi9) th : null;
                Integer num = wi9Var != null ? new Integer(wi9Var.a) : null;
                if (num != null && num.intValue() == 403) {
                    nv.q0(context2, 2, "403_force");
                    SharedPreferences.Editor edit3 = sharedPreferences2.edit();
                    edit3.getClass();
                    edit3.remove("PR_XAIST");
                    edit3.apply();
                } else if (num != null && num.intValue() == 422) {
                    nv.q0(context2, 2, "422_force");
                    skiVar2.r = i2;
                    skiVar2.u = 2;
                    sharedPreferences = sharedPreferences2;
                }
                return Boolean.FALSE;
            }
        }
        skiVar = new ski(this, sq3Var);
        ski skiVar22 = skiVar;
        Object obj22 = skiVar22.s;
        lu3 lu3Var2 = lu3.a;
        i = skiVar22.u;
        SharedPreferences sharedPreferences22 = this.d;
        list = null;
        List list3 = null;
        if (i != 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v0, types: [bli] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(sq3 sq3Var) {
        tki tkiVar;
        Object obj;
        lu3 lu3Var;
        int i;
        ArrayList u;
        ?? r7;
        BillingClient billingClient;
        int i2;
        List list;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        List list2;
        if (sq3Var instanceof tki) {
            tkiVar = (tki) sq3Var;
            int i3 = tkiVar.w;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                tkiVar.w = i3 - Integer.MIN_VALUE;
                obj = tkiVar.u;
                lu3Var = lu3.a;
                i = tkiVar.w;
                if (i != 0) {
                    u = fc6.u(obj);
                    BillingClient billingClient2 = this.p;
                    if (billingClient2 != null) {
                        QueryPurchasesParams build = QueryPurchasesParams.newBuilder().setProductType(BillingClient.ProductType.INAPP).build();
                        build.getClass();
                        tkiVar.r = u;
                        tkiVar.s = billingClient2;
                        tkiVar.t = 0;
                        tkiVar.w = 1;
                        Object n = n(billingClient2, build, tkiVar);
                        if (n != lu3Var) {
                            r7 = u;
                            obj = n;
                            billingClient = billingClient2;
                            i2 = 0;
                        }
                        return lu3Var;
                    }
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    arrayList2 = new ArrayList();
                    while (r2.hasNext()) {
                    }
                    if (!arrayList2.isEmpty()) {
                    }
                    h(arrayList2);
                    arrayList3 = new ArrayList();
                    while (r10.hasNext()) {
                    }
                    if (!arrayList3.isEmpty()) {
                    }
                    i(arrayList3, false);
                    this.j.m(null, linkedHashSet);
                    return Unit.a;
                }
                if (i != 1) {
                    if (i != 2) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ?? r0 = tkiVar.r;
                    y6a.M(obj);
                    arrayList = r0;
                    list2 = (List) obj;
                    if (list2 != null) {
                        arrayList.addAll(list2);
                    }
                    u = arrayList;
                    LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                    arrayList2 = new ArrayList();
                    for (Object obj2 : u) {
                        List<String> products = ((Purchase) obj2).getProducts();
                        products.getClass();
                        if (!products.isEmpty()) {
                            Iterator it = products.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    if (fli.a.contains((String) it.next())) {
                                        arrayList2.add(obj2);
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    if (!arrayList2.isEmpty()) {
                        linkedHashSet2.add(eli.ADS);
                    }
                    h(arrayList2);
                    arrayList3 = new ArrayList();
                    for (Object obj3 : u) {
                        if (((Purchase) obj3).getProducts().contains("ai_analysis_subscription")) {
                            arrayList3.add(obj3);
                        }
                    }
                    if (!arrayList3.isEmpty()) {
                        linkedHashSet2.add(eli.AI);
                    }
                    i(arrayList3, false);
                    this.j.m(null, linkedHashSet2);
                    return Unit.a;
                }
                i2 = tkiVar.t;
                billingClient = tkiVar.s;
                r7 = tkiVar.r;
                y6a.M(obj);
                list = (List) obj;
                if (list != null) {
                    r7.addAll(list);
                }
                QueryPurchasesParams build2 = QueryPurchasesParams.newBuilder().setProductType(BillingClient.ProductType.SUBS).build();
                build2.getClass();
                tkiVar.r = r7;
                tkiVar.s = null;
                tkiVar.t = i2;
                tkiVar.w = 2;
                obj = n(billingClient, build2, tkiVar);
                if (obj != lu3Var) {
                    arrayList = r7;
                    list2 = (List) obj;
                    if (list2 != null) {
                    }
                    u = arrayList;
                    LinkedHashSet linkedHashSet22 = new LinkedHashSet();
                    arrayList2 = new ArrayList();
                    while (r2.hasNext()) {
                    }
                    if (!arrayList2.isEmpty()) {
                    }
                    h(arrayList2);
                    arrayList3 = new ArrayList();
                    while (r10.hasNext()) {
                    }
                    if (!arrayList3.isEmpty()) {
                    }
                    i(arrayList3, false);
                    this.j.m(null, linkedHashSet22);
                    return Unit.a;
                }
                return lu3Var;
            }
        }
        tkiVar = new tki(this, sq3Var);
        obj = tkiVar.u;
        lu3Var = lu3.a;
        i = tkiVar.w;
        if (i != 0) {
        }
        list = (List) obj;
        if (list != null) {
        }
        QueryPurchasesParams build22 = QueryPurchasesParams.newBuilder().setProductType(BillingClient.ProductType.SUBS).build();
        build22.getClass();
        tkiVar.r = r7;
        tkiVar.s = null;
        tkiVar.t = i2;
        tkiVar.w = 2;
        obj = n(billingClient, build22, tkiVar);
        if (obj != lu3Var) {
        }
        return lu3Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.String] */
    public final ProductDetails.SubscriptionOfferDetails d(List list, s5k s5kVar, boolean z) {
        ProductDetails.SubscriptionOfferDetails subscriptionOfferDetails;
        Object obj;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            subscriptionOfferDetails = null;
            if (!it.hasNext()) {
                break;
            }
            ProductDetails.SubscriptionOfferDetails subscriptionOfferDetails2 = (ProductDetails.SubscriptionOfferDetails) it.next();
            ?? offerId = subscriptionOfferDetails2.getOfferId();
            if ((!z && Intrinsics.c(subscriptionOfferDetails2.getBasePlanId(), "p1m")) || (z && Intrinsics.c(subscriptionOfferDetails2.getBasePlanId(), "p1y"))) {
                subscriptionOfferDetails = offerId;
            }
            if (subscriptionOfferDetails != null) {
                arrayList.add(subscriptionOfferDetails);
            }
        }
        iyf iyfVar = iyf.c;
        cli cliVar = new cli(s5kVar, false, false, arrayList.contains("freetrial1m") || arrayList.contains("freetrial1y"), this.a);
        Iterator it2 = iyf.f.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            iyf iyfVar2 = (iyf) obj;
            if (arrayList.contains(iyfVar2.a) && ((Boolean) iyfVar2.b.invoke(cliVar)).booleanValue()) {
                break;
            }
        }
        iyf iyfVar3 = (iyf) obj;
        for (?? r13 : list) {
            ProductDetails.SubscriptionOfferDetails subscriptionOfferDetails3 = (ProductDetails.SubscriptionOfferDetails) r13;
            if (Intrinsics.c(subscriptionOfferDetails3.getOfferId(), iyfVar3 != null ? iyfVar3.a : null) && ((!z && Intrinsics.c(subscriptionOfferDetails3.getBasePlanId(), "p1m")) || (z && Intrinsics.c(subscriptionOfferDetails3.getBasePlanId(), "p1y")))) {
                subscriptionOfferDetails = r13;
                break;
            }
        }
        return subscriptionOfferDetails;
    }

    public final SubscriptionPriceBundle e(s5k s5kVar, ProductDetails productDetails) {
        ProductDetails.PricingPhase pricingPhase;
        Object obj;
        Object obj2;
        ProductDetails.PricingPhases pricingPhases;
        List<ProductDetails.PricingPhase> pricingPhaseList;
        ProductDetails.PricingPhase pricingPhase2;
        ProductDetails.PricingPhases pricingPhases2;
        if (productDetails != null) {
            List<ProductDetails.SubscriptionOfferDetails> subscriptionOfferDetails = productDetails.getSubscriptionOfferDetails();
            if (subscriptionOfferDetails == null) {
                subscriptionOfferDetails = km5.a;
            }
            ProductDetails.SubscriptionOfferDetails g = g(subscriptionOfferDetails, s5kVar, false);
            List<ProductDetails.SubscriptionOfferDetails> subscriptionOfferDetails2 = productDetails.getSubscriptionOfferDetails();
            if (subscriptionOfferDetails2 == null) {
                subscriptionOfferDetails2 = km5.a;
            }
            ProductDetails.SubscriptionOfferDetails g2 = g(subscriptionOfferDetails2, s5kVar, true);
            List<ProductDetails.PricingPhase> pricingPhaseList2 = (g == null || (pricingPhases2 = g.getPricingPhases()) == null) ? null : pricingPhases2.getPricingPhaseList();
            if (pricingPhaseList2 != null && (pricingPhase = (ProductDetails.PricingPhase) CollectionsKt.j0(pricingPhaseList2)) != null) {
                Iterator<T> it = pricingPhaseList2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((ProductDetails.PricingPhase) obj).getPriceAmountMicros() > 0) {
                        break;
                    }
                }
                ProductDetails.PricingPhase pricingPhase3 = (ProductDetails.PricingPhase) obj;
                Long valueOf = pricingPhase3 != null ? Long.valueOf(pricingPhase3.getPriceAmountMicros()) : null;
                long priceAmountMicros = pricingPhase.getPriceAmountMicros();
                if (valueOf != null && priceAmountMicros == valueOf.longValue()) {
                    valueOf = Long.valueOf(pricingPhase.getPriceAmountMicros());
                }
                double priceAmountMicros2 = pricingPhase.getPriceAmountMicros() / 1000000.0d;
                double longValue = (valueOf != null ? valueOf.longValue() : pricingPhase.getPriceAmountMicros()) / 1000000.0d;
                ProductDetails.PricingPhase pricingPhase4 = (ProductDetails.PricingPhase) CollectionsKt.firstOrNull(pricingPhaseList2);
                if (pricingPhase4 == null || pricingPhase4.getPriceAmountMicros() != 0) {
                    wt3.v(this.d, "PREF_HAS_USED_ANALYST_TRIAL", true);
                }
                String productId = productDetails.getProductId();
                productId.getClass();
                Double valueOf2 = priceAmountMicros2 == longValue ? null : Double.valueOf(priceAmountMicros2);
                String offerToken = g.getOfferToken();
                offerToken.getClass();
                Iterator<E> it2 = cu.i.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it2.next();
                    if (Intrinsics.c(((cu) obj2).a, g.getOfferId())) {
                        break;
                    }
                }
                cu cuVar = (cu) obj2;
                String priceCurrencyCode = pricingPhase.getPriceCurrencyCode();
                priceCurrencyCode.getClass();
                return new SubscriptionPriceBundle(productId, longValue, valueOf2, null, null, priceCurrencyCode, offerToken, null, cuVar, null, null, (g2 == null || (pricingPhases = g2.getPricingPhases()) == null || (pricingPhaseList = pricingPhases.getPricingPhaseList()) == null || (pricingPhase2 = (ProductDetails.PricingPhase) CollectionsKt.firstOrNull(pricingPhaseList)) == null) ? null : Double.valueOf(pricingPhase2.getPriceAmountMicros() / 1000000.0d), g2 != null ? g2.getOfferToken() : null, 1688);
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(boolean z, s5k s5kVar, sq3 sq3Var) {
        uki ukiVar;
        int i;
        s5k s5kVar2;
        List list;
        ProductDetails productDetails;
        cu cuVar;
        cu cuVar2;
        Object obj;
        if (sq3Var instanceof uki) {
            ukiVar = (uki) sq3Var;
            int i2 = ukiVar.u;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ukiVar.u = i2 - Integer.MIN_VALUE;
                Object obj2 = ukiVar.s;
                lu3 lu3Var = lu3.a;
                i = ukiVar.u;
                if (i != 0) {
                    y6a.M(obj2);
                    BillingClient billingClient = this.p;
                    if (billingClient != null) {
                        QueryProductDetailsParams build = QueryProductDetailsParams.newBuilder().setProductList(a.c(QueryProductDetailsParams.Product.newBuilder().setProductId("ai_analysis_subscription").setProductType(BillingClient.ProductType.SUBS).build())).build();
                        build.getClass();
                        ukiVar.r = s5kVar;
                        ukiVar.u = 1;
                        obj2 = m(billingClient, build, ukiVar);
                        if (obj2 == lu3Var) {
                            return lu3Var;
                        }
                        s5kVar2 = s5kVar;
                    }
                    return null;
                }
                if (i != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                s5kVar2 = ukiVar.r;
                y6a.M(obj2);
                list = (List) obj2;
                if (list == null) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        if (Intrinsics.c(((ProductDetails) obj).getProductId(), "ai_analysis_subscription")) {
                            break;
                        }
                    }
                    productDetails = (ProductDetails) obj;
                } else {
                    productDetails = null;
                }
                if (productDetails != null) {
                    SubscriptionPriceBundle e = e(s5kVar2, productDetails);
                    Double d = e != null ? e.c : null;
                    String str = e != null ? e.f : null;
                    Double d2 = e != null ? new Double(e.b) : null;
                    if ((e != null ? e.m : null) != null) {
                        cuVar2 = cu.g;
                    } else {
                        if (e == null) {
                            cuVar = null;
                            return new im(d, str, d2, cuVar, e == null ? e.l : null, e != null ? e.m : null, e == null ? e.g : null, 128);
                        }
                        cuVar2 = e.i;
                    }
                    cuVar = cuVar2;
                    if (e == null) {
                    }
                    return new im(d, str, d2, cuVar, e == null ? e.l : null, e != null ? e.m : null, e == null ? e.g : null, 128);
                }
                return null;
            }
        }
        ukiVar = new uki(this, sq3Var);
        Object obj22 = ukiVar.s;
        lu3 lu3Var2 = lu3.a;
        i = ukiVar.u;
        if (i != 0) {
        }
        list = (List) obj22;
        if (list == null) {
        }
        if (productDetails != null) {
        }
        return null;
    }

    public final ProductDetails.SubscriptionOfferDetails g(List list, s5k s5kVar, boolean z) {
        Object obj;
        Object obj2;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String offerId = ((ProductDetails.SubscriptionOfferDetails) it.next()).getOfferId();
            if (offerId != null) {
                arrayList.add(offerId);
            }
        }
        cu cuVar = cu.e;
        cli cliVar = new cli(s5kVar, s5kVar == s5k.c, z, arrayList.contains("freetrial1m"), this.a);
        Iterator<E> it2 = cu.i.iterator();
        while (true) {
            obj = null;
            if (!it2.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it2.next();
            cu cuVar2 = (cu) obj2;
            if (cuVar2.d == z && arrayList.contains(cuVar2.a) && ((Boolean) cuVar2.b.invoke(cliVar)).booleanValue()) {
                break;
            }
        }
        cu cuVar3 = (cu) obj2;
        for (Object obj3 : list) {
            if (Intrinsics.c(((ProductDetails.SubscriptionOfferDetails) obj3).getOfferId(), cuVar3 != null ? cuVar3.a : null) && (!z || cuVar3 != null)) {
                obj = obj3;
                break;
            }
        }
        return (ProductDetails.SubscriptionOfferDetails) obj;
    }

    public final void h(ArrayList arrayList) {
        int i;
        bli bliVar;
        SharedPreferences d;
        asf asfVar = new asf();
        Iterator it = arrayList.iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            Purchase purchase = (Purchase) it.next();
            Context context = this.a;
            SharedPreferences sharedPreferences = uic.j;
            if (sharedPreferences == null) {
                Context applicationContext = context.getApplicationContext();
                synchronized (uic.i) {
                    d = a5f.d(applicationContext);
                    uic.j = d;
                }
                d.getClass();
                sharedPreferences = d;
            }
            if (sharedPreferences.getBoolean("PREF_REMOVE_ADS_PURCHASED", false)) {
                bliVar = this;
            } else {
                String originalJson = purchase.getOriginalJson();
                originalJson.getClass();
                bliVar = this;
                f5p.E(this.a, new kv7((Serializable) eli.ADS, false, (Object) bliVar, (Serializable) originalJson, (rq3) null, 8));
            }
            int i2 = 1;
            if (purchase.getPurchaseState() == 1) {
                asfVar.a = true;
                if (!purchase.isAcknowledged()) {
                    AcknowledgePurchaseParams build = AcknowledgePurchaseParams.newBuilder().setPurchaseToken(purchase.getPurchaseToken()).build();
                    build.getClass();
                    BillingClient billingClient = bliVar.p;
                    if (billingClient != null) {
                        billingClient.acknowledgePurchase(build, new qki(purchase, bliVar, i2));
                    }
                }
            }
            this = bliVar;
        }
        bli bliVar2 = this;
        rq3 rq3Var = null;
        xw3.L(bliVar2.e, null, null, new vki(bliVar2, asfVar, rq3Var, i), 3);
        if (asfVar.a) {
            xw3.L(bliVar2.e, null, null, new wki(bliVar2, rq3Var, i), 3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void i(List list, boolean z) {
        Object[] objArr = 0;
        Context context = this.a;
        int i = 1;
        rq3 rq3Var = null;
        SharedPreferences sharedPreferences = this.d;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Purchase purchase = (Purchase) it.next();
                if (purchase.getPurchaseState() == 1) {
                    if (purchase.isAcknowledged()) {
                        String string = sharedPreferences.getString("PR_XAIST", null);
                        if (string == null || string.length() == 0 || z) {
                            String originalJson = purchase.getOriginalJson();
                            originalJson.getClass();
                            f5p.E(context, new kv7(eli.AI, z, this, originalJson, (rq3) null, 8));
                        }
                    } else {
                        LocalDateTime localDateTime = cs5.a;
                        AlarmManager alarmManager = (AlarmManager) context.getSystemService(AlarmManager.class);
                        PendingIntent broadcast = PendingIntent.getBroadcast(context, 2, new Intent(context, (Class<?>) EventAiInsightsAlarmReceiver.class), 33554432);
                        broadcast.getClass();
                        alarmManager.cancel(broadcast);
                        String string2 = sharedPreferences.getString("PR_XAIST", null);
                        if (string2 == null || string2.length() == 0) {
                            String originalJson2 = purchase.getOriginalJson();
                            originalJson2.getClass();
                            f5p.E(context, new kv7((Serializable) eli.AI, false, (Object) this, (Serializable) originalJson2, (rq3) null, 8));
                        }
                        AcknowledgePurchaseParams build = AcknowledgePurchaseParams.newBuilder().setPurchaseToken(purchase.getPurchaseToken()).build();
                        build.getClass();
                        BillingClient billingClient = this.p;
                        if (billingClient != null) {
                            billingClient.acknowledgePurchase(build, new qki(purchase, this, objArr == true ? 1 : 0));
                        }
                        wt3.v(sharedPreferences, "PREF_HAS_USED_ANALYST_TRIAL", true);
                    }
                }
            }
        }
        if (list == null || list.isEmpty()) {
            Boolean hasPremium = this.b.b().getHasPremium();
            if ((hasPremium != null ? hasPremium.booleanValue() : false) || !z) {
                return;
            }
            String string3 = sharedPreferences.getString("PR_XAIST", null);
            if (string3 != null && string3.length() != 0) {
                nv.q0(context, 1, null);
            }
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.getClass();
            edit.remove("PR_XAIST");
            edit.apply();
            xw3.L(this.e, null, null, new wki(this, rq3Var, i), 3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(sq3 sq3Var) {
        xki xkiVar;
        int i;
        if (sq3Var instanceof xki) {
            xkiVar = (xki) sq3Var;
            int i2 = xkiVar.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                xkiVar.t = i2 - Integer.MIN_VALUE;
                Object obj = xkiVar.r;
                Object obj2 = lu3.a;
                i = xkiVar.t;
                fdi fdiVar = this.q;
                if (i != 0) {
                    y6a.M(obj);
                    if (((Boolean) fdiVar.getValue()).booleanValue()) {
                        return Unit.a;
                    }
                    xkiVar.t = 1;
                    if (o(xkiVar) == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                fdiVar.m(null, Boolean.TRUE);
                return Unit.a;
            }
        }
        xkiVar = new xki(this, sq3Var);
        Object obj3 = xkiVar.r;
        Object obj22 = lu3.a;
        i = xkiVar.t;
        fdi fdiVar2 = this.q;
        if (i != 0) {
        }
        fdiVar2.m(null, Boolean.TRUE);
        return Unit.a;
    }

    public final void k(Activity activity, String str, String str2, String str3) {
        activity.getClass();
        str.getClass();
        str2.getClass();
        this.o = str3;
        BillingClient billingClient = this.p;
        if (billingClient != null) {
            xw3.L(this.e, null, null, new yki(this, billingClient, new WeakReference(activity), str, str2, null), 3);
        }
    }

    public final void l(Activity activity, s5k s5kVar) {
        activity.getClass();
        s5kVar.getClass();
        WeakReference weakReference = new WeakReference(activity);
        this.n = s5kVar;
        this.l.m(null, new dli(null, null, 3));
        BillingClient billingClient = this.p;
        if (billingClient != null) {
            xw3.L(this.e, null, null, new zki(s5kVar, this, billingClient, weakReference, null), 3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b3, code lost:
    
        if (r14 == r1) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00d1, code lost:
    
        if (defpackage.n4o.y(r7, r0) == r1) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00e4, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00e2, code lost:
    
        if (c(r0) != r1) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00c3 -> B:19:0x00d7). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00d1 -> B:18:0x00d4). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(sq3 sq3Var) {
        ali aliVar;
        int i;
        long j;
        int i2;
        int i3;
        boolean z;
        BillingClient billingClient;
        if (sq3Var instanceof ali) {
            aliVar = (ali) sq3Var;
            int i4 = aliVar.w;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                aliVar.w = i4 - Integer.MIN_VALUE;
                Object obj = aliVar.u;
                Object obj2 = lu3.a;
                i = aliVar.w;
                if (i != 0) {
                    y6a.M(obj);
                    if (this.p != null) {
                        return Unit.a;
                    }
                    BillingClient build = BillingClient.newBuilder(this.a).enablePendingPurchases(PendingPurchasesParams.newBuilder().enableOneTimeProducts().build()).setListener(new imf(this, 17)).build();
                    this.p = build;
                    if (build != null && !build.isReady()) {
                        j = 1000;
                        i2 = 3;
                        i3 = 1;
                        billingClient = this.p;
                        if (billingClient != null) {
                        }
                        z = false;
                        if (!z) {
                        }
                    }
                    aliVar.w = 3;
                } else if (i == 1) {
                    i3 = aliVar.s;
                    j = aliVar.t;
                    i2 = aliVar.r;
                    y6a.M(obj);
                    if (((Boolean) obj).booleanValue()) {
                        z = true;
                        if (!z) {
                        }
                        aliVar.w = 3;
                    }
                    z = false;
                    if (!z) {
                    }
                    aliVar.w = 3;
                } else {
                    if (i != 2) {
                        if (i == 3) {
                            y6a.M(obj);
                            return Unit.a;
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i3 = aliVar.s;
                    j = aliVar.t;
                    i2 = aliVar.r;
                    y6a.M(obj);
                    j *= 2;
                    if (i3 != i2) {
                        i3++;
                        billingClient = this.p;
                        if (billingClient != null) {
                            aliVar.r = i2;
                            aliVar.t = j;
                            aliVar.s = i3;
                            aliVar.w = 1;
                            lj2 lj2Var = new lj2(1, z9a.b(aliVar));
                            lj2Var.t();
                            billingClient.startConnection(new rki(new AtomicBoolean(false), lj2Var));
                            obj = lj2Var.q();
                            lu3 lu3Var = lu3.a;
                        }
                        z = false;
                        if (!z) {
                            if (i3 < i2) {
                                aliVar.r = i2;
                                aliVar.t = j;
                                aliVar.s = i3;
                                aliVar.w = 2;
                            }
                            if (i3 != i2) {
                            }
                        }
                    }
                    aliVar.w = 3;
                }
            }
        }
        aliVar = new ali(this, sq3Var);
        Object obj3 = aliVar.u;
        Object obj22 = lu3.a;
        i = aliVar.w;
        if (i != 0) {
        }
    }
}
