package com.android.billingclient.api;

import android.app.Activity;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.ResultReceiver;
import androidx.appcompat.widget.c1;
import com.google.android.gms.internal.play_billing.p1;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONException;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class c0 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3976a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f3977b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3978c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f3979d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f3980e;

    public /* synthetic */ c0(d dVar, Object obj, Object obj2, Object obj3, int i5) {
        this.f3976a = i5;
        this.f3977b = dVar;
        this.f3978c = obj;
        this.f3979d = obj2;
        this.f3980e = obj3;
    }

    private final Object a() {
        com.google.android.gms.internal.play_billing.d dVar;
        d dVar2 = this.f3977b;
        Bundle bundle = (Bundle) this.f3978c;
        Activity activity = (Activity) this.f3979d;
        ResultReceiver resultReceiver = (ResultReceiver) this.f3980e;
        dVar2.getClass();
        try {
            synchronized (dVar2.f3981a) {
                dVar = dVar2.f3988h;
            }
            if (dVar == null) {
                dVar2.H(-1, 119, null);
                return null;
            }
            ((com.google.android.gms.internal.play_billing.b) dVar).f0(dVar2.f3986f.getPackageName(), bundle, new i0(new WeakReference(activity), resultReceiver));
            return null;
        } catch (DeadObjectException e7) {
            dVar2.H(-1, 118, e7);
            return null;
        } catch (Exception e9) {
            dVar2.H(6, 118, e9);
            return null;
        }
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        androidx.transition.n0 n0Var;
        com.google.android.gms.internal.play_billing.d dVar;
        Bundle c02;
        switch (this.f3976a) {
            case 0:
                return a();
            default:
                d dVar2 = this.f3977b;
                String str = (String) this.f3978c;
                ArrayList arrayList = (ArrayList) this.f3979d;
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                int i5 = 0;
                while (true) {
                    if (i5 < size) {
                        int i10 = i5 + 20;
                        ArrayList<String> arrayList3 = new ArrayList<>(arrayList.subList(i5, i10 > size ? size : i10));
                        Bundle bundle = new Bundle();
                        bundle.putStringArrayList("ITEM_ID_LIST", arrayList3);
                        bundle.putString("playBillingLibraryVersion", dVar2.f3983c);
                        try {
                            synchronized (dVar2.f3981a) {
                                dVar = dVar2.f3988h;
                            }
                            if (dVar == null) {
                                n0Var = dVar2.z(t0.f4090l, 119, "Service has been reset to null.", null);
                            } else {
                                if (dVar2.f3995p) {
                                    String packageName = dVar2.f3986f.getPackageName();
                                    int i11 = dVar2.f3991l;
                                    dVar2.B.getClass();
                                    if (dVar2.f4001w) {
                                        dVar2.B.getClass();
                                    }
                                    String str2 = dVar2.f3983c;
                                    long longValue = dVar2.F.longValue();
                                    Bundle bundle2 = new Bundle();
                                    if (i11 >= 9) {
                                        p1.b(bundle2, str2, longValue);
                                    }
                                    if (i11 >= 9) {
                                        bundle2.putBoolean("enablePendingPurchases", true);
                                    }
                                    c02 = ((com.google.android.gms.internal.play_billing.b) dVar).d0(10, packageName, str, bundle, bundle2);
                                } else {
                                    c02 = ((com.google.android.gms.internal.play_billing.b) dVar).c0(dVar2.f3986f.getPackageName(), str, bundle);
                                }
                                if (c02 == null) {
                                    n0Var = dVar2.z(t0.B, 44, "querySkuDetailsAsync got null sku details list", null);
                                } else if (c02.containsKey("DETAILS_LIST")) {
                                    ArrayList<String> stringArrayList = c02.getStringArrayList("DETAILS_LIST");
                                    if (stringArrayList != null) {
                                        for (int i12 = 0; i12 < stringArrayList.size(); i12++) {
                                            try {
                                                SkuDetails skuDetails = new SkuDetails(stringArrayList.get(i12));
                                                p1.f("BillingClient", "Got sku details: ".concat(skuDetails.toString()));
                                                arrayList2.add(skuDetails);
                                            } catch (JSONException e7) {
                                                n0Var = dVar2.z(t0.a(6, "Error trying to decode SkuDetails."), 47, "Got a JSON exception trying to decode SkuDetails.", e7);
                                            }
                                        }
                                        i5 = i10;
                                    } else {
                                        n0Var = dVar2.z(t0.B, 46, "querySkuDetailsAsync got null response list", null);
                                    }
                                } else {
                                    int a7 = p1.a(c02, "BillingClient");
                                    String e9 = p1.e(c02, "BillingClient");
                                    n0Var = a7 != 0 ? dVar2.z(t0.a(a7, e9), 23, c1.i(a7, "getSkuDetails() failed. Response code: "), null) : dVar2.z(t0.a(6, e9), 45, "getSkuDetails() returned a bundle with neither an error nor a detail list.", null);
                                }
                            }
                        } catch (DeadObjectException e10) {
                            n0Var = dVar2.z(t0.f4090l, 43, "querySkuDetailsAsync got a remote exception (try to reconnect).", e10);
                        } catch (Exception e11) {
                            n0Var = dVar2.z(t0.j, 43, "querySkuDetailsAsync got a remote exception (try to reconnect).", e11);
                        }
                    } else {
                        n0Var = new androidx.transition.n0(0, 2, "", arrayList2);
                    }
                }
                ((e) this.f3980e).e(t0.a(n0Var.f2733b, (String) n0Var.f2735d), (List) n0Var.f2734c);
                return null;
        }
    }
}
