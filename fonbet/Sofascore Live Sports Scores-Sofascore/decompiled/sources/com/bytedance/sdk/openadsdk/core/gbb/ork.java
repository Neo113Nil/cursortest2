package com.bytedance.sdk.openadsdk.core.gbb;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashSet;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class ork {
    private final String gm;
    private final String oo;
    private final String pcc;
    private final URL sf;

    private ork(String str, String str2, String str3, String str4) throws MalformedURLException {
        this.pcc = str2;
        this.sf = new URL(str);
        this.gm = str3;
        this.oo = str4;
    }

    public static ork pcc(JSONObject jSONObject) {
        try {
            String optString = jSONObject.optString("apiFramework");
            String optString2 = jSONObject.optString("javascriptResourceUrl");
            if (CampaignEx.KEY_OMID.equalsIgnoreCase(optString) && !TextUtils.isEmpty(optString2)) {
                return new ork(optString2, jSONObject.optString("vendorKey"), jSONObject.optString("verificationParameters"), jSONObject.optString("verificationNotExecuted"));
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ork)) {
            return false;
        }
        ork orkVar = (ork) obj;
        if (pcc(this.pcc, orkVar.pcc) && pcc(this.sf, orkVar.sf) && pcc(this.gm, orkVar.gm)) {
            return pcc(this.oo, orkVar.oo);
        }
        return false;
    }

    public URL gm() {
        return this.sf;
    }

    public int hashCode() {
        String str = this.pcc;
        int hashCode = (this.sf.hashCode() + ((str != null ? str.hashCode() : 0) * 31)) * 31;
        String str2 = this.gm;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.oo;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String sf() {
        return this.gm;
    }

    private boolean pcc(Object obj, Object obj2) {
        return Objects.equals(obj, obj2);
    }

    public static ork pcc(String str, String str2, String str3, String str4) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new ork(str, str2, str3, str4);
        } catch (Throwable unused) {
            return null;
        }
    }

    public String pcc() {
        return this.pcc;
    }

    public static HashSet<ork> pcc(JSONArray jSONArray) {
        HashSet<ork> hashSet = new HashSet<>();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    hashSet.add(pcc(jSONArray.getJSONObject(i)));
                } catch (Throwable unused) {
                }
            }
        }
        return hashSet;
    }
}
