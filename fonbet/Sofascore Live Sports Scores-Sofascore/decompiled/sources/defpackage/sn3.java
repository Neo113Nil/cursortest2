package defpackage;

import android.app.Activity;
import android.content.Context;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.QueryPurchasesParams;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class sn3 {
    public final Context a;
    public final el b;
    public yia c;
    public uri d;
    public Integer e;
    public Long f;
    public BillingClient g;
    public boolean h;
    public final ArrayList i;
    public WeakReference j;

    public sn3(Context context, el elVar) {
        elVar.getClass();
        this.a = context;
        this.b = elVar;
        this.i = new ArrayList();
    }

    public final void a() {
        QueryPurchasesParams build = QueryPurchasesParams.newBuilder().setProductType(BillingClient.ProductType.INAPP).build();
        build.getClass();
        BillingClient billingClient = this.g;
        if (billingClient != null) {
            billingClient.queryPurchasesAsync(build, new qn3(this, 2));
        }
    }

    public final void b(List list) {
        Activity activity;
        Activity activity2;
        fsf fsfVar = new fsf();
        fsf fsfVar2 = new fsf();
        Iterator it = list.iterator();
        boolean z = false;
        while (it.hasNext()) {
            Purchase purchase = (Purchase) it.next();
            fsfVar.a = purchase.getPurchaseToken();
            fsfVar2.a = purchase.getPurchaseState() == 2 ? tn3.d : this.i.contains(purchase.getPurchaseToken()) ? tn3.e : purchase.getPurchaseState() == 1 ? tn3.c : null;
            z = true;
        }
        WeakReference weakReference = this.j;
        if (z) {
            if (weakReference == null || (activity2 = (Activity) weakReference.get()) == null) {
                return;
            }
            activity2.runOnUiThread(new p3(10, this, fsfVar, fsfVar2));
            return;
        }
        if (weakReference == null || (activity = (Activity) weakReference.get()) == null) {
            return;
        }
        activity.runOnUiThread(new x(this, 7));
    }
}
