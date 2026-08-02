package defpackage;

import android.app.Activity;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingFlowParams;
import com.android.billingclient.api.ProductDetails;
import com.android.billingclient.api.QueryProductDetailsParams;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.a;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class yki extends hoi implements Function2 {
    public int r;
    public final /* synthetic */ bli s;
    public final /* synthetic */ BillingClient t;
    public final /* synthetic */ WeakReference u;
    public final /* synthetic */ String v;
    public final /* synthetic */ String w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yki(bli bliVar, BillingClient billingClient, WeakReference weakReference, String str, String str2, rq3 rq3Var) {
        super(2, rq3Var);
        this.s = bliVar;
        this.t = billingClient;
        this.u = weakReference;
        this.v = str;
        this.w = str2;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new yki(this.s, this.t, this.u, this.v, this.w, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((yki) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.r;
        BillingClient billingClient = this.t;
        Object obj2 = null;
        if (i == 0) {
            y6a.M(obj);
            List list = this.s.n.a;
            ArrayList arrayList = new ArrayList(k13.r(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(QueryProductDetailsParams.Product.newBuilder().setProductId(((eli) it.next()).a).setProductType(BillingClient.ProductType.SUBS).build());
            }
            QueryProductDetailsParams build = QueryProductDetailsParams.newBuilder().setProductList(arrayList).build();
            build.getClass();
            this.r = 1;
            obj = bli.m(billingClient, build, this);
            if (obj == lu3Var) {
                return lu3Var;
            }
        } else {
            if (i != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
        }
        List list2 = (List) obj;
        if (list2 != null) {
            Iterator it2 = list2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (Intrinsics.c(((ProductDetails) next).getProductId(), this.v)) {
                    obj2 = next;
                    break;
                }
            }
            ProductDetails productDetails = (ProductDetails) obj2;
            if (productDetails != null) {
                Activity activity = (Activity) this.u.get();
                if (activity != null) {
                    LinkedHashMap linkedHashMap = bli.s;
                    BillingFlowParams build2 = BillingFlowParams.newBuilder().setProductDetailsParamsList(a.c(BillingFlowParams.ProductDetailsParams.newBuilder().setProductDetails(productDetails).setOfferToken(this.w).build())).build();
                    build2.getClass();
                    billingClient.launchBillingFlow(activity, build2);
                }
                return Unit.a;
            }
        }
        return Unit.a;
    }
}
