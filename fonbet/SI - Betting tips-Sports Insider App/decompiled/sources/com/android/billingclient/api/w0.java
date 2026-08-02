package com.android.billingclient.api;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import com.google.android.gms.internal.play_billing.a3;
import com.google.android.gms.internal.play_billing.a4;
import com.google.android.gms.internal.play_billing.d3;
import com.google.android.gms.internal.play_billing.p1;
import com.google.android.gms.internal.play_billing.q4;
import j$.util.Objects;
import java.util.ArrayList;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class w0 extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public boolean f4112a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f4113b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x0 f4114c;

    public w0(x0 x0Var, boolean z5) {
        this.f4114c = x0Var;
        this.f4113b = z5;
    }

    public final synchronized void a(Context context, IntentFilter intentFilter) {
        try {
            if (this.f4112a) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                context.registerReceiver(this, intentFilter, true != this.f4113b ? 4 : 2);
            } else {
                context.registerReceiver(this, intentFilter);
            }
            this.f4112a = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void b(Context context, IntentFilter intentFilter) {
        w0 w0Var;
        try {
            try {
                if (this.f4112a) {
                    return;
                }
                if (Build.VERSION.SDK_INT >= 33) {
                    w0Var = this;
                    context.registerReceiver(w0Var, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null, true != this.f4113b ? 4 : 2);
                } else {
                    w0Var = this;
                    context.registerReceiver(this, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null);
                }
                w0Var.f4112a = true;
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    public final synchronized void c(Context context) {
        if (!this.f4112a) {
            p1.g("BillingBroadcastManager", "Receiver is not registered.");
        } else {
            context.unregisterReceiver(this);
            this.f4112a = false;
        }
    }

    public final void d(Bundle bundle, k kVar, int i5) {
        a3 q;
        try {
            if (bundle.getByteArray("FAILURE_LOGGING_PAYLOAD") == null) {
                ((l1.a) ((s0) this.f4114c.f4118d)).O(r0.b(23, i5, kVar));
                return;
            }
            s0 s0Var = (s0) this.f4114c.f4118d;
            byte[] byteArray = bundle.getByteArray("FAILURE_LOGGING_PAYLOAD");
            int i10 = a3.f5396a;
            synchronized (a3.class) {
                int i11 = a3.f5396a;
                a4 a4Var = a4.f5397c;
                q = d3.q();
                int i12 = a3.f5396a;
            }
            ((l1.a) s0Var).O(q4.n(byteArray, q));
        } catch (Throwable unused) {
            p1.g("BillingBroadcastManager", "Failed parsing Api failure.");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0109  */
    @Override // android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onReceive(Context context, Intent intent) {
        x0 x0Var = this.f4114c;
        s0 s0Var = (s0) x0Var.f4118d;
        x xVar = (x) x0Var.f4117c;
        Bundle extras = intent.getExtras();
        ArrayList arrayList = null;
        if (extras == null) {
            p1.g("BillingBroadcastManager", "Bundle is null.");
            k kVar = t0.j;
            ((l1.a) s0Var).O(r0.b(11, 1, kVar));
            if (xVar != null) {
                xVar.onPurchasesUpdated(kVar, null);
                return;
            }
            return;
        }
        k d10 = p1.d(intent, "BillingBroadcastManager");
        String action = intent.getAction();
        int i5 = true == Objects.equals(extras.getString("INTENT_SOURCE"), "LAUNCH_BILLING_FLOW") ? 2 : 1;
        if (!action.equals("com.android.vending.billing.PURCHASES_UPDATED") && !action.equals("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED")) {
            if (action.equals("com.android.vending.billing.ALTERNATIVE_BILLING")) {
                if (d10.f4037a != 0) {
                    d(extras, d10, i5);
                    com.google.android.gms.internal.play_billing.a0 a0Var = com.google.android.gms.internal.play_billing.d0.f5420b;
                    xVar.onPurchasesUpdated(d10, com.google.android.gms.internal.play_billing.s0.f5567e);
                    return;
                } else {
                    p1.g("BillingBroadcastManager", "AlternativeBillingListener and UserChoiceBillingListener is null.");
                    k kVar2 = t0.j;
                    ((l1.a) s0Var).O(r0.b(77, i5, kVar2));
                    com.google.android.gms.internal.play_billing.a0 a0Var2 = com.google.android.gms.internal.play_billing.d0.f5420b;
                    xVar.onPurchasesUpdated(kVar2, com.google.android.gms.internal.play_billing.s0.f5567e);
                    return;
                }
            }
            return;
        }
        ArrayList<String> stringArrayList = extras.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
        ArrayList<String> stringArrayList2 = extras.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
        ArrayList arrayList2 = new ArrayList();
        if (stringArrayList == null || stringArrayList2 == null) {
            Purchase j = p1.j(extras.getString("INAPP_PURCHASE_DATA"), extras.getString("INAPP_DATA_SIGNATURE"));
            if (j == null) {
                p1.f("BillingHelper", "Couldn't find single purchase data as well.");
                if (d10.f4037a != 0) {
                    ((l1.a) s0Var).Q(r0.d(i5));
                } else {
                    d(extras, d10, i5);
                }
                xVar.onPurchasesUpdated(d10, arrayList);
            }
            arrayList2.add(j);
        } else {
            p1.f("BillingHelper", "Found purchase list of " + stringArrayList.size() + " items");
            for (int i10 = 0; i10 < stringArrayList.size() && i10 < stringArrayList2.size(); i10++) {
                Purchase j6 = p1.j(stringArrayList.get(i10), stringArrayList2.get(i10));
                if (j6 != null) {
                    arrayList2.add(j6);
                }
            }
        }
        arrayList = arrayList2;
        if (d10.f4037a != 0) {
        }
        xVar.onPurchasesUpdated(d10, arrayList);
    }
}
