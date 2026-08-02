package com.my.tracker.obfuscated;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.my.tracker.obfuscated.e0;
import com.my.tracker.obfuscated.m0;
import com.my.tracker.obfuscated.n0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import xsna.ke9;

/* loaded from: classes.dex */
public final class n0 {
    final Context a;
    final e0 b;
    final e0.c c = new e0.c() { // from class: xsna.f6z0
        @Override // com.my.tracker.obfuscated.e0.c
        public final void a(List list) {
            com.my.tracker.obfuscated.n0.this.b(list);
        }
    };

    /* loaded from: classes14.dex */
    public final class a implements m0.b {
        private final List a;

        public a(List list) {
            this.a = list;
        }

        @Override // com.my.tracker.obfuscated.m0.b
        public void a(int i, final Map map) {
            if (i == 1) {
                x2.b("GooglePlayPurchaseHandler error: can't retrieve information about products");
            } else {
                m.a(new Runnable() { // from class: com.my.tracker.obfuscated.g3
                    @Override // java.lang.Runnable
                    public final void run() {
                        n0.a.this.a(map);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(Map map) {
            for (o0 o0Var : this.a) {
                o0Var.a((JSONObject) map.get(o0Var.c()));
            }
            n0.this.b.d(this.a);
        }
    }

    private n0(e0 e0Var, Context context) {
        this.b = e0Var;
        this.a = context.getApplicationContext();
    }

    public static n0 a(e0 e0Var, Context context) {
        return new n0(e0Var, context);
    }

    public void b(List list) {
        x2.a("GooglePlayPurchaseHandler: processing raw purchases");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            o0 o0Var = (o0) it.next();
            String c = o0Var.c();
            if (o0Var.g()) {
                x2.a("GooglePlayPurchaseHandler: inapp raw purchase, product id: " + c);
                arrayList2.add(o0Var);
            } else {
                x2.a("GooglePlayPurchaseHandler: subs raw purchase, product id: " + c);
                arrayList.add(o0Var);
            }
        }
        a((List) arrayList, false);
        a((List) arrayList2, true);
    }

    public void a() {
        this.b.a(this.c);
    }

    public void a(JSONObject jSONObject, JSONObject jSONObject2, String str, Map map) {
        this.b.a(jSONObject, jSONObject2, str, map);
    }

    public void a(int i, Intent intent) {
        if (!m0.g.booleanValue()) {
            x2.b("GooglePlayPurchaseHandler error: classes com.android.billingclient:billing aren't found");
            return;
        }
        if (i != -1) {
            x2.a("GooglePlayPurchaseHandler: result code isn't equal to RESULT_OK");
            return;
        }
        if (intent == null) {
            x2.a("GooglePlayPurchaseHandler: empty intent has been received");
            return;
        }
        final String stringExtra = intent.getStringExtra("INAPP_PURCHASE_DATA");
        if (TextUtils.isEmpty(stringExtra)) {
            x2.a("GooglePlayPurchaseHandler: empty purchase data in intent");
            return;
        }
        final String stringExtra2 = intent.getStringExtra("INAPP_DATA_SIGNATURE");
        if (stringExtra2 == null) {
            x2.a("GooglePlayPurchaseHandler: null data signature in intent");
        } else {
            m.a(new Runnable() { // from class: xsna.g6z0
                @Override // java.lang.Runnable
                public final void run() {
                    com.my.tracker.obfuscated.n0.this.a(stringExtra, stringExtra2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, String str2) {
        o0 a2 = o0.a(str, str2, v2.a());
        if (a2 == null) {
            return;
        }
        this.b.a(Collections.singletonList(a2), this.c);
    }

    public void a(int i, List list) {
        if (i != 0) {
            x2.a("GooglePlayPurchaseHandler: response code isn't equal to BILLING_OK_RESPONSE_CODE");
            return;
        }
        if (list != null && !list.isEmpty()) {
            if (!m0.g.booleanValue()) {
                x2.b("GooglePlayPurchaseHandler error: classes com.android.billingclient:billing aren't found");
                return;
            } else {
                m.a(new ke9(8, this, list));
                return;
            }
        }
        x2.a("GooglePlayPurchaseHandler: null or empty purchases list has been received");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(List list) {
        x2.a("GooglePlayPurchaseHandler: iterating over unchecked list of objects");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            o0 a2 = m0.a(it.next());
            if (a2 == null) {
                x2.a("GooglePlayPurchaseHandler: null purchase data after processing");
            } else {
                arrayList.add(a2);
            }
        }
        if (arrayList.isEmpty()) {
            x2.a("GooglePlayPurchaseHandler: skip empty purchases list");
        } else {
            this.b.a(arrayList, this.c);
        }
    }

    public void a(List list, boolean z) {
        if (!list.isEmpty()) {
            m0.a(list, z, new a(list), this.a);
        } else if (z) {
            x2.a("GooglePlayPurchaseHandler: empty inapp raw purchases list");
        } else {
            x2.a("GooglePlayPurchaseHandler: empty subs raw purchases list");
        }
    }
}
