package com.android.billingclient.api;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.appcompat.widget.c1;
import com.google.android.gms.internal.play_billing.p1;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONException;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class b0 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3972a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f3973b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3974c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f3975d;

    public /* synthetic */ b0(d dVar, Object obj, Object obj2, int i5) {
        this.f3972a = i5;
        this.f3973b = dVar;
        this.f3974c = obj;
        this.f3975d = obj2;
    }

    private final Object a() {
        Exception exc;
        DeadObjectException deadObjectException;
        com.google.android.gms.internal.play_billing.d dVar;
        String str;
        int i5;
        String e7;
        d dVar2 = this.f3973b;
        a aVar = (a) this.f3974c;
        e eVar = (e) this.f3975d;
        String str2 = "Error consuming purchase with token. Response code: ";
        String str3 = aVar.f3966b;
        try {
            p1.f("BillingClient", "Consuming purchase with token: " + str3);
            synchronized (dVar2.f3981a) {
                try {
                    try {
                        dVar = dVar2.f3988h;
                    } catch (Throwable th2) {
                        th = th2;
                        while (true) {
                            try {
                                throw th;
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        }
                    }
                } catch (DeadObjectException e9) {
                    e = e9;
                } catch (Exception e10) {
                    e = e10;
                }
            }
            if (dVar == null) {
                try {
                    str2 = str3;
                    try {
                        dVar2.C(eVar, str2, t0.f4090l, 119, "Service has been reset to null.", null);
                        return null;
                    } catch (DeadObjectException e11) {
                        e = e11;
                        deadObjectException = e;
                        dVar2.C(eVar, str2, t0.f4090l, 29, "Error consuming purchase!", deadObjectException);
                        return null;
                    } catch (Exception e12) {
                        e = e12;
                        exc = e;
                        dVar2.C(eVar, str2, t0.j, 29, "Error consuming purchase!", exc);
                        return null;
                    }
                } catch (DeadObjectException e13) {
                    e = e13;
                    str = str3;
                    deadObjectException = e;
                    str2 = str;
                    dVar2.C(eVar, str2, t0.f4090l, 29, "Error consuming purchase!", deadObjectException);
                    return null;
                } catch (Exception e14) {
                    e = e14;
                    str = str3;
                    exc = e;
                    str2 = str;
                    dVar2.C(eVar, str2, t0.j, 29, "Error consuming purchase!", exc);
                    return null;
                }
            }
            str = str3;
            try {
                if (dVar2.f3994o) {
                    try {
                        String packageName = dVar2.f3986f.getPackageName();
                        boolean z5 = dVar2.f3994o;
                        String str4 = dVar2.f3983c;
                        long longValue = dVar2.F.longValue();
                        Bundle bundle = new Bundle();
                        if (z5) {
                            p1.b(bundle, str4, longValue);
                        }
                        Bundle W = ((com.google.android.gms.internal.play_billing.b) dVar).W(packageName, str, bundle);
                        i5 = W.getInt("RESPONSE_CODE");
                        e7 = p1.e(W, "BillingClient");
                    } catch (DeadObjectException e15) {
                        e = e15;
                        deadObjectException = e;
                        str2 = str;
                        dVar2.C(eVar, str2, t0.f4090l, 29, "Error consuming purchase!", deadObjectException);
                        return null;
                    } catch (Exception e16) {
                        e = e16;
                        exc = e;
                        str2 = str;
                        dVar2.C(eVar, str2, t0.j, 29, "Error consuming purchase!", exc);
                        return null;
                    }
                } else {
                    String packageName2 = dVar2.f3986f.getPackageName();
                    com.google.android.gms.internal.play_billing.b bVar = (com.google.android.gms.internal.play_billing.b) dVar;
                    Parcel R = bVar.R();
                    R.writeInt(3);
                    R.writeString(packageName2);
                    R.writeString(str);
                    Parcel S = bVar.S(R, 5);
                    i5 = S.readInt();
                    S.recycle();
                    e7 = "";
                }
                k a7 = t0.a(i5, e7);
                if (i5 == 0) {
                    p1.f("BillingClient", "Successfully consumed purchase.");
                    eVar.c(a7, str);
                    return null;
                }
                dVar2.C(eVar, str, a7, 23, "Error consuming purchase with token. Response code: " + i5, null);
                return null;
            } catch (DeadObjectException e17) {
                e = e17;
                str2 = str;
                deadObjectException = e;
                dVar2.C(eVar, str2, t0.f4090l, 29, "Error consuming purchase!", deadObjectException);
                return null;
            } catch (Exception e18) {
                e = e18;
                str2 = str;
                exc = e;
                dVar2.C(eVar, str2, t0.j, 29, "Error consuming purchase!", exc);
                return null;
            }
        } catch (DeadObjectException e19) {
            e = e19;
            str2 = str3;
        } catch (Exception e20) {
            e = e20;
            str2 = str3;
        }
    }

    private final Object b() {
        androidx.transition.n0 n0Var;
        com.google.android.gms.internal.play_billing.d dVar;
        d dVar2 = this.f3973b;
        y yVar = (y) this.f3974c;
        ArrayList arrayList = new ArrayList();
        String str = ((z) yVar.f4121a.get(0)).f4126b;
        com.google.android.gms.internal.play_billing.d0 d0Var = yVar.f4121a;
        int size = d0Var.size();
        int i5 = 0;
        while (true) {
            if (i5 >= size) {
                n0Var = new androidx.transition.n0(0, 1, "", arrayList);
                break;
            }
            int i10 = i5 + 20;
            ArrayList arrayList2 = new ArrayList(d0Var.subList(i5, i10 > size ? size : i10));
            ArrayList<String> arrayList3 = new ArrayList<>();
            int size2 = arrayList2.size();
            for (int i11 = 0; i11 < size2; i11++) {
                arrayList3.add(((z) arrayList2.get(i11)).f4125a);
            }
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("ITEM_ID_LIST", arrayList3);
            bundle.putString("playBillingLibraryVersion", dVar2.f3983c);
            try {
                synchronized (dVar2.f3981a) {
                    dVar = dVar2.f3988h;
                }
                if (dVar == null) {
                    n0Var = dVar2.w(t0.f4090l, 119, "Service has been reset to null.", null);
                    break;
                }
                int i12 = true != dVar2.f4002x ? 17 : 20;
                String packageName = dVar2.f3986f.getPackageName();
                if (dVar2.f4001w) {
                    dVar2.B.getClass();
                }
                String str2 = dVar2.f3983c;
                dVar2.m();
                dVar2.m();
                dVar2.m();
                dVar2.m();
                long longValue = dVar2.F.longValue();
                Bundle bundle2 = new Bundle();
                p1.b(bundle2, str2, longValue);
                bundle2.putBoolean("enablePendingPurchases", true);
                bundle2.putString("SKU_DETAILS_RESPONSE_FORMAT", "PRODUCT_DETAILS");
                ArrayList<String> arrayList4 = new ArrayList<>();
                ArrayList<String> arrayList5 = new ArrayList<>();
                int size3 = arrayList2.size();
                int i13 = 0;
                boolean z5 = false;
                while (i13 < size3) {
                    com.google.android.gms.internal.play_billing.d0 d0Var2 = d0Var;
                    z zVar = (z) arrayList2.get(i13);
                    int i14 = size;
                    arrayList4.add(null);
                    z5 |= !TextUtils.isEmpty(null);
                    if (zVar.f4126b.equals("first_party")) {
                        throw new NullPointerException("Serialized DocId is required for constructing ExtraParams to query ProductDetails for all first party products.");
                    }
                    i13++;
                    size = i14;
                    d0Var = d0Var2;
                }
                com.google.android.gms.internal.play_billing.d0 d0Var3 = d0Var;
                int i15 = size;
                if (z5) {
                    bundle2.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList4);
                }
                if (!arrayList5.isEmpty()) {
                    bundle2.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList5);
                }
                Bundle d02 = ((com.google.android.gms.internal.play_billing.b) dVar).d0(i12, packageName, str, bundle, bundle2);
                if (d02 == null) {
                    n0Var = dVar2.w(t0.B, 44, "queryProductDetailsAsync got empty product details response.", null);
                    break;
                }
                if (d02.containsKey("DETAILS_LIST")) {
                    ArrayList<String> stringArrayList = d02.getStringArrayList("DETAILS_LIST");
                    if (stringArrayList == null) {
                        n0Var = dVar2.w(t0.B, 46, "queryProductDetailsAsync got null response list", null);
                        break;
                    }
                    for (int i16 = 0; i16 < stringArrayList.size(); i16++) {
                        try {
                            q qVar = new q(stringArrayList.get(i16));
                            p1.f("BillingClient", "Got product details: ".concat(qVar.toString()));
                            arrayList.add(qVar);
                        } catch (JSONException e7) {
                            n0Var = dVar2.w(t0.a(6, "Error trying to decode SkuDetails."), 47, "Got a JSON exception trying to decode ProductDetails. \n Exception: ", e7);
                            ((r) this.f3975d).onProductDetailsResponse(t0.a(n0Var.f2733b, (String) n0Var.f2735d), (ArrayList) n0Var.f2734c);
                            return null;
                        }
                    }
                    i5 = i10;
                    size = i15;
                    d0Var = d0Var3;
                } else {
                    int a7 = p1.a(d02, "BillingClient");
                    String e9 = p1.e(d02, "BillingClient");
                    n0Var = a7 != 0 ? dVar2.w(t0.a(a7, e9), 23, c1.i(a7, "getSkuDetails() failed for queryProductDetailsAsync. Response code: "), null) : dVar2.w(t0.a(6, e9), 45, "getSkuDetails() returned a bundle with neither an error nor a product detail list for queryProductDetailsAsync.", null);
                }
            } catch (DeadObjectException e10) {
                n0Var = dVar2.w(t0.f4090l, 43, "queryProductDetailsAsync got a remote exception (try to reconnect).", e10);
            } catch (Exception e11) {
                n0Var = dVar2.w(t0.j, 43, "queryProductDetailsAsync got a remote exception (try to reconnect).", e11);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x004d, code lost:
    
        r17 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0043, code lost:
    
        r0 = r2.y(com.android.billingclient.api.t0.f4090l, 119, "Service has been reset to null", r9);
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x016a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object c() {
        Exception exc;
        d7.e y5;
        List list;
        com.google.android.gms.internal.play_billing.d dVar;
        Bundle a02;
        d dVar2 = this.f3973b;
        String str = (String) this.f3974c;
        p1.f("BillingClient", "Querying owned items, item type: ".concat(String.valueOf(str)));
        ArrayList arrayList = new ArrayList();
        boolean z5 = dVar2.f3994o;
        boolean z7 = dVar2.f4001w;
        dVar2.B.getClass();
        dVar2.B.getClass();
        Bundle c2 = p1.c(z5, z7, dVar2.f3983c, dVar2.F.longValue());
        Exception exc2 = null;
        String str2 = null;
        while (true) {
            try {
                synchronized (dVar2.f3981a) {
                    try {
                        dVar = dVar2.f3988h;
                    } catch (Throwable th2) {
                        th = th2;
                        exc = exc2;
                        while (true) {
                            try {
                                try {
                                    throw th;
                                } catch (DeadObjectException e7) {
                                    e = e7;
                                    y5 = dVar2.y(t0.f4090l, 52, "Got exception trying to get purchases try to reconnect", e);
                                    list = (List) y5.f8268b;
                                    if (list != null) {
                                    }
                                    return exc;
                                } catch (Exception e9) {
                                    e = e9;
                                    y5 = dVar2.y(t0.j, 52, "Got exception trying to get purchases try to reconnect", e);
                                    list = (List) y5.f8268b;
                                    if (list != null) {
                                    }
                                    return exc;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        }
                    }
                }
                if (dVar == null) {
                    break;
                }
                if (dVar2.f3994o) {
                    a02 = ((com.google.android.gms.internal.play_billing.b) dVar).b0(true != dVar2.f4001w ? 9 : 19, dVar2.f3986f.getPackageName(), str, str2, c2);
                } else {
                    a02 = ((com.google.android.gms.internal.play_billing.b) dVar).a0(dVar2.f3986f.getPackageName(), str, str2);
                }
                l0 y10 = u6.h.y(a02, "getPurchase()");
                k kVar = (k) y10.f4045c;
                if (kVar != t0.f4089k) {
                    y5 = dVar2.y(kVar, y10.f4044b, "Purchase bundle invalid", exc2);
                    break;
                }
                ArrayList<String> stringArrayList = a02.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                ArrayList<String> stringArrayList2 = a02.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                ArrayList<String> stringArrayList3 = a02.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                int i5 = 0;
                boolean z10 = false;
                while (i5 < stringArrayList2.size()) {
                    String str3 = stringArrayList2.get(i5);
                    String str4 = stringArrayList3.get(i5);
                    exc = exc2;
                    p1.f("BillingClient", "Sku is owned: ".concat(String.valueOf(stringArrayList.get(i5))));
                    try {
                        Purchase purchase = new Purchase(str3, str4);
                        if (TextUtils.isEmpty(purchase.c())) {
                            p1.g("BillingClient", "BUG: empty/null token!");
                            z10 = true;
                        }
                        arrayList.add(purchase);
                        i5++;
                        exc2 = exc;
                    } catch (JSONException e10) {
                        y5 = dVar2.y(t0.j, 51, "Got an exception trying to decode the purchase!", e10);
                    }
                }
                exc = exc2;
                if (z10) {
                    dVar2.I(26, 9, t0.j);
                }
                str2 = a02.getString("INAPP_CONTINUATION_TOKEN");
                p1.f("BillingClient", "Continuation token: ".concat(String.valueOf(str2)));
                if (TextUtils.isEmpty(str2)) {
                    y5 = new d7.e(t0.f4089k, arrayList);
                    break;
                }
                exc2 = exc;
            } catch (DeadObjectException e11) {
                e = e11;
                exc = exc2;
            } catch (Exception e12) {
                e = e12;
                exc = exc2;
            }
        }
        list = (List) y5.f8268b;
        if (list != null) {
            ((v) this.f3975d).onQueryPurchasesResponse((k) y5.f8269c, list);
        } else {
            v vVar = (v) this.f3975d;
            k kVar2 = (k) y5.f8269c;
            com.google.android.gms.internal.play_billing.a0 a0Var = com.google.android.gms.internal.play_billing.d0.f5420b;
            vVar.onQueryPurchasesResponse(kVar2, com.google.android.gms.internal.play_billing.s0.f5567e);
        }
        return exc;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0058, code lost:
    
        r0 = r2.x(com.android.billingclient.api.t0.f4090l, 119, "Service reset to null", r5);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object d() {
        x5.h hVar;
        Exception exc;
        com.google.android.gms.internal.play_billing.d dVar;
        d dVar2 = this.f3973b;
        String str = (String) this.f3974c;
        p1.f("BillingClient", "Querying purchase history, item type: ".concat(String.valueOf(str)));
        ArrayList arrayList = new ArrayList();
        boolean z5 = dVar2.f3994o;
        boolean z7 = dVar2.f4001w;
        dVar2.B.getClass();
        dVar2.B.getClass();
        Bundle c2 = p1.c(z5, z7, dVar2.f3983c, dVar2.F.longValue());
        Exception exc2 = null;
        String str2 = null;
        while (true) {
            if (!dVar2.f3992m) {
                p1.g("BillingClient", "getPurchaseHistory is not supported on current device");
                hVar = new x5.h(t0.f4094p, exc2);
                break;
            }
            try {
                synchronized (dVar2.f3981a) {
                    try {
                        dVar = dVar2.f3988h;
                    } catch (Throwable th2) {
                        th = th2;
                        exc = exc2;
                        while (true) {
                            try {
                                try {
                                    throw th;
                                } catch (DeadObjectException e7) {
                                    e = e7;
                                    hVar = dVar2.x(t0.f4090l, 59, "Got exception trying to get purchase history", e);
                                    ((t) this.f3975d).onPurchaseHistoryResponse((k) hVar.f25410b, (List) hVar.f25409a);
                                    return exc;
                                } catch (Exception e9) {
                                    e = e9;
                                    hVar = dVar2.x(t0.j, 59, "Got exception trying to get purchase history", e);
                                    ((t) this.f3975d).onPurchaseHistoryResponse((k) hVar.f25410b, (List) hVar.f25409a);
                                    return exc;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        }
                    }
                }
                if (dVar == null) {
                    break;
                }
                Bundle Z = ((com.google.android.gms.internal.play_billing.b) dVar).Z(dVar2.f3986f.getPackageName(), str, str2, c2);
                l0 y5 = u6.h.y(Z, "getPurchaseHistory()");
                k kVar = (k) y5.f4045c;
                if (kVar != t0.f4089k) {
                    dVar2.I(y5.f4044b, 11, kVar);
                    hVar = new x5.h(kVar, exc2);
                    break;
                }
                ArrayList<String> stringArrayList = Z.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                ArrayList<String> stringArrayList2 = Z.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                ArrayList<String> stringArrayList3 = Z.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                int i5 = 0;
                boolean z10 = false;
                while (i5 < stringArrayList2.size()) {
                    String str3 = stringArrayList2.get(i5);
                    String str4 = stringArrayList3.get(i5);
                    exc = exc2;
                    p1.f("BillingClient", "Purchase record found for sku : ".concat(String.valueOf(stringArrayList.get(i5))));
                    try {
                        PurchaseHistoryRecord purchaseHistoryRecord = new PurchaseHistoryRecord(str3, str4);
                        if (TextUtils.isEmpty(purchaseHistoryRecord.b())) {
                            p1.g("BillingClient", "BUG: empty/null token!");
                            z10 = true;
                        }
                        arrayList.add(purchaseHistoryRecord);
                        i5++;
                        exc2 = exc;
                    } catch (JSONException e10) {
                        hVar = dVar2.x(t0.j, 51, "Got an exception trying to decode the purchase!", e10);
                    }
                }
                exc = exc2;
                if (z10) {
                    dVar2.I(26, 11, t0.j);
                }
                str2 = Z.getString("INAPP_CONTINUATION_TOKEN");
                p1.f("BillingClient", "Continuation token: ".concat(String.valueOf(str2)));
                if (TextUtils.isEmpty(str2)) {
                    hVar = new x5.h(t0.f4089k, arrayList);
                    break;
                }
                exc2 = exc;
            } catch (DeadObjectException e11) {
                e = e11;
                exc = exc2;
            } catch (Exception e12) {
                e = e12;
                exc = exc2;
            }
        }
        exc = exc2;
        ((t) this.f3975d).onPurchaseHistoryResponse((k) hVar.f25410b, (List) hVar.f25409a);
        return exc;
    }

    private final Object e() {
        Bundle i5;
        com.google.android.gms.internal.play_billing.d dVar;
        d dVar2 = this.f3973b;
        String str = (String) this.f3974c;
        String str2 = (String) this.f3975d;
        try {
            synchronized (dVar2.f3981a) {
                dVar = dVar2.f3988h;
            }
            if (dVar == null) {
                return p1.i(t0.f4090l, 119);
            }
            return ((com.google.android.gms.internal.play_billing.b) dVar).X(dVar2.f3986f.getPackageName(), str, str2);
        } catch (DeadObjectException e7) {
            k kVar = t0.f4090l;
            String a7 = r0.a(e7);
            i5 = p1.i(kVar, 5);
            if (a7 != null) {
                i5.putString("ADDITIONAL_LOG_DETAILS", a7);
            }
            return i5;
        } catch (Exception e9) {
            k kVar2 = t0.j;
            String a10 = r0.a(e9);
            i5 = p1.i(kVar2, 5);
            if (a10 != null) {
                i5.putString("ADDITIONAL_LOG_DETAILS", a10);
            }
            return i5;
        }
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        com.google.android.gms.internal.play_billing.d dVar;
        switch (this.f3972a) {
            case 0:
                return a();
            case 1:
                return b();
            case 2:
                return c();
            case 3:
                return d();
            case 4:
                return e();
            default:
                d dVar2 = this.f3973b;
                e eVar = (e) this.f3974c;
                a aVar = (a) this.f3975d;
                try {
                    synchronized (dVar2.f3981a) {
                        dVar = dVar2.f3988h;
                    }
                    if (dVar == null) {
                        dVar2.B(eVar, t0.f4090l, 119, null);
                    } else {
                        String packageName = dVar2.f3986f.getPackageName();
                        String str = aVar.f3966b;
                        String str2 = dVar2.f3983c;
                        long longValue = dVar2.F.longValue();
                        Bundle bundle = new Bundle();
                        p1.b(bundle, str2, longValue);
                        Bundle V = ((com.google.android.gms.internal.play_billing.b) dVar).V(packageName, str, bundle);
                        eVar.a(t0.a(p1.a(V, "BillingClient"), p1.e(V, "BillingClient")));
                    }
                } catch (DeadObjectException e7) {
                    dVar2.B(eVar, t0.f4090l, 28, e7);
                } catch (Exception e9) {
                    dVar2.B(eVar, t0.j, 28, e9);
                }
                return null;
        }
    }
}
