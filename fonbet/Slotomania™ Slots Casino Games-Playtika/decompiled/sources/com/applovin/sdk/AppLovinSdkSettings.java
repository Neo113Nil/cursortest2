package com.applovin.sdk;

import android.content.Context;
import android.text.TextUtils;
import com.applovin.impl.f2;
import com.applovin.impl.q7;
import com.applovin.impl.sdk.l;
import com.applovin.impl.sdk.m;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class AppLovinSdkSettings {
    private boolean a;
    private boolean b;
    private String e;
    private String f;
    private String g;
    private final AppLovinTermsAndPrivacyPolicyFlowSettings j;
    private l k;
    private String l;
    private boolean d = true;
    private final Map h = Collections.synchronizedMap(new HashMap());
    private final Map i = Collections.synchronizedMap(new HashMap());
    private boolean c = true;

    AppLovinSdkSettings(Context context) {
        this.l = "";
        if (context == null) {
            p.h("AppLovinSdkSettings", "context cannot be null. Please provide a valid context.");
        }
        Context e = q7.e(context);
        this.a = q7.m(e);
        this.j = v0.a(e);
        this.l = e.getPackageName();
        a(e);
    }

    private void a(Context context) {
        int identifier = context.getResources().getIdentifier("applovin_settings", "raw", context.getPackageName());
        if (identifier == 0) {
            return;
        }
        String a = q7.a(identifier, context, (l) null);
        this.h.putAll(JsonUtils.tryToStringMap(StringUtils.isValidString(a) ? JsonUtils.jsonObjectFromJsonString(a, new JSONObject()) : new JSONObject()));
    }

    public void attachAppLovinSdk(l lVar) {
        this.k = lVar;
        if (StringUtils.isValidString(this.e)) {
            lVar.u0().a(Arrays.asList(this.e.split(",")));
            this.e = null;
        }
        if (this.f != null) {
            lVar.Q();
            if (p.a()) {
                lVar.Q().a("AppLovinSdkSettings", "Setting user id: " + this.f);
            }
            lVar.y0().a(this.f);
            this.f = null;
        }
        if (StringUtils.isValidString(this.g)) {
            m.a(this.g, lVar);
            this.g = null;
        }
        for (Map.Entry entry : this.i.entrySet()) {
            lVar.x0().a(f2.k, "preInitExtraParameter", CollectionUtils.hashMap("details", ((String) entry.getKey()) + ":" + ((String) entry.getValue())));
        }
        this.i.clear();
    }

    public Map<String, String> getExtraParameters() {
        Map<String, String> map;
        synchronized (this.h) {
            map = CollectionUtils.map(this.h);
        }
        return map;
    }

    public AppLovinTermsAndPrivacyPolicyFlowSettings getTermsAndPrivacyPolicyFlowSettings() {
        return this.j;
    }

    public String getUserIdentifier() {
        l lVar = this.k;
        return lVar == null ? this.f : lVar.y0().e();
    }

    public boolean isCreativeDebuggerEnabled() {
        return this.c;
    }

    public boolean isMuted() {
        return this.b;
    }

    public boolean isVerboseLoggingEnabled() {
        return this.a;
    }

    public void setCreativeDebuggerEnabled(boolean z) {
        p.e("AppLovinSdkSettings", "setCreativeDebuggerEnabled(creativeDebuggerEnabled=" + z + ")");
        if (this.c == z) {
            return;
        }
        this.c = z;
        l lVar = this.k;
        if (lVar == null) {
            return;
        }
        if (z) {
            lVar.z().l();
        } else {
            lVar.z().k();
        }
    }

    public void setExtraParameter(String str, String str2) {
        p.e("AppLovinSdkSettings", "setExtraParameter(key=" + str + ", value=" + str2 + ")");
        if (TextUtils.isEmpty(str)) {
            p.h("AppLovinSdkSettings", "Failed to set extra parameter for null or empty key: " + str);
            return;
        }
        String trim = str2 != null ? str2.trim() : null;
        if ("test_mode_network".equalsIgnoreCase(str)) {
            if (this.k == null) {
                this.e = trim;
            } else if (StringUtils.isValidString(trim)) {
                this.k.u0().a(Arrays.asList(trim.split(",")));
            } else {
                this.k.u0().a((String) null);
            }
        } else if ("fan".equals(str) || "esc".equals(str)) {
            if (!this.l.startsWith("com.unity.")) {
                return;
            }
        } else if ("disable_all_logs".equals(str)) {
            p.a(Boolean.parseBoolean(trim));
        } else if ("package_name_override".equals(str)) {
            l lVar = this.k;
            if (lVar != null) {
                m.a(trim, lVar);
            } else {
                this.g = trim;
            }
        }
        if (this.k != null) {
            this.k.x0().a(f2.k, "postInitExtraParameter", CollectionUtils.hashMap("details", str + ":" + str2));
        } else {
            this.i.put(str, trim);
        }
        this.h.put(str, trim);
    }

    public void setMuted(boolean z) {
        p.e("AppLovinSdkSettings", "setMuted(muted=" + z + ")");
        this.b = z;
    }

    public void setShouldFailAdDisplayIfDontKeepActivitiesIsEnabled(boolean z) {
        p.e("AppLovinSdkSettings", "setShouldFailAdDisplayIfDontKeepActivitiesIsEnabled(shouldFailAdDisplayIfDontKeepActivitiesIsEnabled=" + z + ")");
        this.d = z;
    }

    public void setUserIdentifier(String str) {
        p.e("AppLovinSdkSettings", "setUserIdentifier(userIdentifier=" + str + ")");
        if (StringUtils.isValidString(str) && str.length() > q7.d(8)) {
            p.h("AppLovinSdk", "Provided user id longer than supported (" + str.length() + " bytes, " + q7.d(8) + " maximum)");
        }
        l lVar = this.k;
        if (lVar == null) {
            this.f = str;
            return;
        }
        lVar.Q();
        if (p.a()) {
            this.k.Q().a("AppLovinSdkSettings", "Setting user id: " + str);
        }
        this.k.y0().a(str);
    }

    public void setVerboseLogging(boolean z) {
        p.e("AppLovinSdkSettings", "setVerboseLogging(isVerboseLoggingEnabled=" + z + ")");
        if (!q7.l()) {
            this.a = z;
            return;
        }
        p.h("AppLovinSdkSettings", "Ignoring setting of verbose logging - it is configured from Android manifest already.");
        if (q7.m(null) != z) {
            p.h("AppLovinSdkSettings", "Attempted to programmatically set verbose logging flag to value different from value configured in Android Manifest.");
        }
    }

    public boolean shouldFailAdDisplayIfDontKeepActivitiesIsEnabled() {
        return this.d;
    }

    public String toString() {
        return "AppLovinSdkSettings{isVerboseLoggingEnabled=" + this.a + ", muted=" + this.b + ", creativeDebuggerEnabled=" + this.c + AbstractJsonLexerKt.END_OBJ;
    }
}
