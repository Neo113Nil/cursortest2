package com.ironsource;

import android.app.Activity;
import android.text.TextUtils;
import androidx.credentials.provider.CredentialEntry;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;
import java.util.Map;
import xsna.dez0;

/* loaded from: classes13.dex */
public class O {
    private final F0 a;

    public O(F0 f0) {
        this.a = f0;
    }

    public void a(Activity activity, String str) {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("placement", str);
        }
        if (activity != null) {
            hashMap.put(IronSourceConstants.EVENTS_EXT1, IronSourceConstants.EVENTS_INIT_CONTEXT_FLOW);
        }
        this.a.a(C0.SHOW_AD, hashMap);
    }

    public void b(String str) {
        a(str, (String) null);
    }

    public void c(String str) {
        this.a.a(C0.AD_DISMISS_SCREEN, dez0.a("placement", str));
    }

    public void d(String str) {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("placement", str);
        }
        this.a.a(C0.AD_ENDED, hashMap);
    }

    public void e(String str) {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("placement", str);
        }
        this.a.a(C0.AD_INFO_CHANGED, hashMap);
    }

    public void f(String str) {
        this.a.a(C0.AD_LEFT_APPLICATION, dez0.a("placement", str));
    }

    public void g(String str) {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("placement", str);
        }
        this.a.a(C0.AD_OPENED, hashMap);
    }

    public void h(String str) {
        this.a.a(C0.AD_PRESENT_SCREEN, dez0.a("placement", str));
    }

    public void i(String str) {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("placement", str);
        }
        this.a.a(C0.AD_STARTED, hashMap);
    }

    public void j(String str) {
        this.a.a(C0.AD_VIEW_BOUND, dez0.a("placement", str));
    }

    public void k(String str) {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("placement", str);
        }
        this.a.a(C0.AD_VISIBLE, hashMap);
    }

    public void b(String str, String str2) {
        HashMap a = dez0.a("placement", str);
        if (!TextUtils.isEmpty(str2)) {
            a.put("reason", str2);
        }
        this.a.a(C0.PLACEMENT_CAPPED, a);
    }

    public void a(boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("status", z ? "true" : CredentialEntry.FALSE_STRING);
        this.a.a(C0.SHOW_AD_CHANCE, hashMap);
    }

    public void a(String str, int i, String str2, Nd nd) {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("placement", str);
        }
        hashMap.put("errorCode", Integer.valueOf(i));
        hashMap.put("reason", str2);
        String a = a(nd);
        if (a != null) {
            hashMap.put(IronSourceConstants.EVENTS_EXT1, a);
        }
        this.a.a(C0.SHOW_AD_FAILED, hashMap);
    }

    public void a(String str) {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("placement", str);
        }
        this.a.a(C0.AD_CLICKED, hashMap);
    }

    public void a(String str, String str2) {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("placement", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            hashMap.put(IronSourceConstants.EVENTS_EXT1, str2);
        }
        this.a.a(C0.AD_CLOSED, hashMap);
    }

    public void a(String str, String str2, int i, long j, String str3, long j2, Map<String, Object> map, String str4) {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("placement", str);
        }
        hashMap.put(IronSourceConstants.EVENTS_REWARD_NAME, str2);
        hashMap.put(IronSourceConstants.EVENTS_REWARD_AMOUNT, Integer.valueOf(i));
        hashMap.put("transId", str3);
        if (j2 != 0) {
            hashMap.put("duration", Long.valueOf(j2));
        }
        if (map != null) {
            hashMap.putAll(map);
        }
        if (!TextUtils.isEmpty(str4)) {
            hashMap.put(IronSourceConstants.EVENTS_DYNAMIC_USER_ID, str4);
        }
        this.a.a(C0.AD_REWARDED, hashMap, j);
    }

    public void a(String str, String str2, boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("isMultipleAdUnits", 1);
        hashMap.put("placement", str);
        if (!TextUtils.isEmpty(str2)) {
            hashMap.put("reason", str2);
        }
        hashMap.put(IronSourceConstants.EVENTS_EXT1, z ? "true" : CredentialEntry.FALSE_STRING);
        hashMap.put(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
        this.a.a(C0.CHECK_PLACEMENT_CAPPED, hashMap);
    }

    public void a() {
        this.a.a(C0.SESSION_CAPPED, null);
    }

    private static String a(Nd nd) {
        if (nd != Nd.NO_LOADED_ADS && nd != Nd.MAX_ATTEMPTS_REACHED) {
            return null;
        }
        return "recover show failed: " + nd.b();
    }
}
