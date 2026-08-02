package com.applovin.impl;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import com.applovin.impl.f6;
import com.applovin.impl.g3;
import com.applovin.impl.r0;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxDebuggerActivity;
import com.applovin.sdk.AppLovinSdkUtils;
import com.ironsource.M6;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class r3 implements r0.e {
    private static WeakReference l;
    private static final AtomicBoolean m = new AtomicBoolean();
    private final com.applovin.impl.sdk.l a;
    private final com.applovin.impl.sdk.p b;
    private final Context c;
    private final q3 d;
    private boolean g;
    private boolean i;
    private Map j;
    private final b0 k;
    private final Map e = new HashMap();
    private final AtomicBoolean f = new AtomicBoolean();
    private int h = 2;

    class a extends b {
        a() {
        }

        @Override // com.applovin.impl.b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (activity instanceof MaxDebuggerActivity) {
                com.applovin.impl.sdk.p.g("AppLovinSdk", "Started mediation debugger");
                if (!r3.this.c() || r3.l.get() != activity) {
                    MaxDebuggerActivity maxDebuggerActivity = (MaxDebuggerActivity) activity;
                    WeakReference unused = r3.l = new WeakReference(maxDebuggerActivity);
                    maxDebuggerActivity.setListAdapter(r3.this.d, r3.this.a.e());
                }
                r3.m.set(false);
            }
        }

        @Override // com.applovin.impl.b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (activity instanceof MaxDebuggerActivity) {
                com.applovin.impl.sdk.p.g("AppLovinSdk", "Mediation debugger destroyed");
                WeakReference unused = r3.l = null;
            }
        }
    }

    public r3(com.applovin.impl.sdk.l lVar) {
        this.a = lVar;
        this.b = lVar.Q();
        Context p = com.applovin.impl.sdk.l.p();
        this.c = p;
        q3 q3Var = new q3(p);
        this.d = q3Var;
        this.k = new b0(lVar, q3Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d() {
        Activity w0 = this.a.w0();
        if (w0 == null || w0.isFinishing()) {
            com.applovin.impl.sdk.p.h("AppLovinSdk", "MAX Mediation Debugger has flagged several errors in your build. Make sure to resolve these before you go live.\n\nNote that this log will only be shown in your development builds. Live apps will not be affected.");
        } else {
            new AlertDialog.Builder(w0).setTitle("Review Integration Errors").setMessage("Looks like MAX Mediation Debugger flagged several errors in your build. Make sure to resolve these before you go live.\n\nNote that this prompt will only be shown in your development builds. Live apps will not be affected.").setPositiveButton("Show Mediation Debugger", new DialogInterface.OnClickListener() { // from class: com.applovin.impl.r3$$ExternalSyntheticLambda1
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    r3.this.a(dialogInterface, i);
                }
            }).setNegativeButton("DISMISS", (DialogInterface.OnClickListener) null).create().show();
        }
    }

    private void f() {
        this.a.e().a(new a());
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p1, com.safedk.android.utils.h.a);
        p0.startActivity(p1);
    }

    public void e() {
        if (this.f.compareAndSet(false, true)) {
            this.a.s0().a((k5) new y5(this, this.a), f6.b.OTHER);
        }
    }

    public boolean g() {
        return this.g;
    }

    public void h() {
        a((Map) null);
    }

    public String toString() {
        return "MediationDebuggerService{, listAdapter=" + this.d + "}";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean c() {
        WeakReference weakReference = l;
        return (weakReference == null || weakReference.get() == null) ? false : true;
    }

    public void a(boolean z, int i) {
        this.g = z;
        this.h = i;
    }

    public void a(Map map) {
        this.j = map;
        e();
        if (!c() && m.compareAndSet(false, true)) {
            if (!this.i) {
                f();
                this.i = true;
            }
            Intent intent = new Intent(this.c, (Class<?>) MaxDebuggerActivity.class);
            intent.setFlags(268435456);
            com.applovin.impl.sdk.p.g("AppLovinSdk", "Starting mediation debugger...");
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(this.c, intent);
            return;
        }
        com.applovin.impl.sdk.p.h("AppLovinSdk", "Mediation debugger is already showing");
    }

    public List a(String str) {
        Map map = this.j;
        if (map == null || map.isEmpty()) {
            return null;
        }
        return (List) this.j.get(str);
    }

    private void a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            g3 g3Var = (g3) it.next();
            if (g3Var.z() && g3Var.q() == g3.a.INVALID_INTEGRATION) {
                AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.r3$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        r3.this.d();
                    }
                }, TimeUnit.SECONDS.toMillis(2L));
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(DialogInterface dialogInterface, int i) {
        h();
    }

    private List a(JSONObject jSONObject, com.applovin.impl.sdk.l lVar) {
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, M6.G1, new JSONArray());
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArray, i, (JSONObject) null);
            if (jSONObject2 != null) {
                g3 g3Var = new g3(jSONObject2, lVar);
                arrayList.add(g3Var);
                this.e.put(g3Var.b(), g3Var);
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private List a(JSONObject jSONObject, List list, com.applovin.impl.sdk.l lVar) {
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "ad_units", new JSONArray());
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArray, i, (JSONObject) null);
            if (jSONObject2 != null) {
                arrayList.add(new n(jSONObject2, this.e, lVar));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private List a(List list, com.applovin.impl.sdk.l lVar) {
        List<String> adUnitIds = lVar.L() != null ? lVar.L().getAdUnitIds() : null;
        if (adUnitIds != null && !adUnitIds.isEmpty()) {
            ArrayList arrayList = new ArrayList(adUnitIds.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                n nVar = (n) it.next();
                if (adUnitIds.contains(nVar.c())) {
                    arrayList.add(nVar);
                }
            }
            return arrayList;
        }
        return Collections.emptyList();
    }

    private List a(JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        for (String str : JsonUtils.getList(jSONObject, "required_app_ads_txt_entries", new ArrayList())) {
            a0 a0Var = new a0(str);
            if (a0Var.h()) {
                arrayList.add(a0Var);
            } else if (com.applovin.impl.sdk.p.a()) {
                this.b.b("MediationDebuggerService", "app-ads.txt entry passed down for validation is misformatted: " + str);
            }
        }
        return arrayList;
    }

    @Override // com.applovin.impl.r0.e
    public void a(String str, JSONObject jSONObject, int i) {
        List a2 = a(jSONObject, this.a);
        List a3 = a(jSONObject, a2, this.a);
        List a4 = a(a3, this.a);
        List a5 = a(jSONObject);
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "alert", (JSONObject) null);
        this.d.a(a2, a3, a4, a5, JsonUtils.getString(jSONObject2, "title", null), JsonUtils.getString(jSONObject2, "message", null), JsonUtils.getString(jSONObject, "account_id", null), JsonUtils.getBoolean(jSONObject, "should_display_cmp_details", Boolean.TRUE).booleanValue(), this.a);
        if (!a5.isEmpty()) {
            this.k.a();
        }
        if (g()) {
            AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.r3$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    r3.this.h();
                }
            }, TimeUnit.SECONDS.toMillis(this.h));
        } else {
            a(a2);
        }
    }

    @Override // com.applovin.impl.r0.e
    public void a(String str, int i, String str2, JSONObject jSONObject) {
        if (com.applovin.impl.sdk.p.a()) {
            this.b.b("MediationDebuggerService", "Unable to fetch mediation debugger info: server returned " + i);
        }
        com.applovin.impl.sdk.p.h("AppLovinSdk", "Unable to show mediation debugger.");
        this.a.E().a("fetchMediationDebuggerInfo", str, i, str2);
        this.d.a(null, null, null, null, null, null, null, false, this.a);
        this.f.set(false);
    }
}
