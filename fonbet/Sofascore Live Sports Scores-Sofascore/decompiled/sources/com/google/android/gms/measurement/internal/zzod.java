package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import com.ironsource.U3;
import defpackage.vvf;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzod {
    public final HashMap a;

    public zzod(Map map) {
        HashMap hashMap = new HashMap();
        this.a = hashMap;
        hashMap.putAll(map);
    }

    public final String a() {
        StringBuilder sb = new StringBuilder();
        vvf vvfVar = zzof.a;
        int i = vvfVar.d;
        for (int i2 = 0; i2 < i; i2++) {
            String str = (String) vvfVar.get(i2);
            HashMap hashMap = this.a;
            if (hashMap.containsKey(str)) {
                if (sb.length() > 0) {
                    sb.append(";");
                }
                sb.append(str);
                sb.append(U3.j.b);
                sb.append((String) hashMap.get(str));
            }
        }
        return sb.toString();
    }

    public final Bundle b() {
        HashMap hashMap = this.a;
        if ("1".equals(hashMap.get("gdprApplies")) && "1".equals(hashMap.get("EnableAdvertiserConsentMode"))) {
            String str = "denied";
            if (hashMap.get("Version") == null) {
                if (!"1".equals(hashMap.get("GoogleConsent"))) {
                    return Bundle.EMPTY;
                }
                int c = c();
                if (c < 0) {
                    return Bundle.EMPTY;
                }
                String str2 = (String) hashMap.get("PurposeConsents");
                if (TextUtils.isEmpty(str2)) {
                    return Bundle.EMPTY;
                }
                Bundle bundle = new Bundle();
                if (str2.length() > 0) {
                    bundle.putString("ad_storage", str2.charAt(0) == '1' ? "granted" : "denied");
                }
                if (str2.length() > 3) {
                    bundle.putString("ad_personalization", (str2.charAt(2) == '1' && str2.charAt(3) == '1') ? "granted" : "denied");
                }
                if (str2.length() > 6 && c >= 4) {
                    if (str2.charAt(0) == '1' && str2.charAt(6) == '1') {
                        str = "granted";
                    }
                    bundle.putString("ad_user_data", str);
                }
                return bundle;
            }
            if (c() >= 0) {
                Bundle bundle2 = new Bundle();
                bundle2.putString("ad_storage", true != Objects.equals(hashMap.get("AuthorizePurpose1"), "1") ? "denied" : "granted");
                bundle2.putString("ad_personalization", (Objects.equals(hashMap.get("AuthorizePurpose3"), "1") && Objects.equals(hashMap.get("AuthorizePurpose4"), "1")) ? "granted" : "denied");
                if (c() >= 4) {
                    if (Objects.equals(hashMap.get("AuthorizePurpose1"), "1") && Objects.equals(hashMap.get("AuthorizePurpose7"), "1")) {
                        str = "granted";
                    }
                    bundle2.putString("ad_user_data", str);
                }
                return bundle2;
            }
        }
        return Bundle.EMPTY;
    }

    public final int c() {
        try {
            String str = (String) this.a.get("PolicyVersion");
            if (TextUtils.isEmpty(str)) {
                return -1;
            }
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzod) {
            return a().equalsIgnoreCase(((zzod) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        return a();
    }
}
