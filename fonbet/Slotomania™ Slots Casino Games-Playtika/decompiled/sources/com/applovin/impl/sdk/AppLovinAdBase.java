package com.applovin.impl.sdk;

import android.graphics.Color;
import com.applovin.impl.g4;
import com.applovin.impl.h4;
import com.applovin.impl.j5;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.z4;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class AppLovinAdBase implements g4 {
    protected final JSONObject adObject;
    private final long createdAtMillis;
    protected final JSONObject fullResponse;
    protected final l sdk;
    protected final j5 synchronizedAdObject;
    protected final j5 synchronizedFullResponse;
    protected final Object adObjectLock = new Object();
    protected final Object fullResponseLock = new Object();

    protected AppLovinAdBase(JSONObject jSONObject, JSONObject jSONObject2, l lVar) {
        if (jSONObject == null) {
            throw new IllegalArgumentException("No ad object specified");
        }
        if (jSONObject2 == null) {
            throw new IllegalArgumentException("No response specified");
        }
        if (lVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        this.sdk = lVar;
        if (((Boolean) lVar.a(z4.G6)).booleanValue()) {
            this.synchronizedAdObject = new j5(jSONObject);
            this.synchronizedFullResponse = new j5(jSONObject2);
            this.adObject = null;
            this.fullResponse = null;
        } else {
            this.adObject = jSONObject;
            this.fullResponse = jSONObject2;
            this.synchronizedAdObject = null;
            this.synchronizedFullResponse = null;
        }
        this.createdAtMillis = System.currentTimeMillis();
    }

    protected boolean containsKeyForAdObject(String str) {
        boolean has;
        j5 j5Var = this.synchronizedAdObject;
        if (j5Var != null) {
            return j5Var.a(str);
        }
        synchronized (this.adObjectLock) {
            has = this.adObject.has(str);
        }
        return has;
    }

    public String getAdDomain() {
        return getStringFromFullResponse("adomain", "");
    }

    @Override // com.applovin.impl.g4
    public abstract /* synthetic */ h4 getAdEventTracker();

    public abstract long getAdIdNumber();

    protected boolean getBooleanFromAdObject(String str, Boolean bool) {
        boolean booleanValue;
        j5 j5Var = this.synchronizedAdObject;
        if (j5Var != null) {
            return j5Var.a(str, bool).booleanValue();
        }
        synchronized (this.adObjectLock) {
            booleanValue = JsonUtils.getBoolean(this.adObject, str, bool).booleanValue();
        }
        return booleanValue;
    }

    protected boolean getBooleanFromFullResponse(String str, boolean z) {
        boolean booleanValue;
        j5 j5Var = this.synchronizedFullResponse;
        if (j5Var != null) {
            return j5Var.a(str, Boolean.valueOf(z)).booleanValue();
        }
        synchronized (this.fullResponseLock) {
            booleanValue = JsonUtils.getBoolean(this.fullResponse, str, Boolean.valueOf(z)).booleanValue();
        }
        return booleanValue;
    }

    public String getClCode() {
        String stringFromAdObject = getStringFromAdObject("clcode", "");
        return StringUtils.isValidString(stringFromAdObject) ? stringFromAdObject : getStringFromFullResponse("clcode", "");
    }

    protected int getColorFromAdObject(String str, int i) {
        String stringFromAdObject = getStringFromAdObject(str, null);
        return StringUtils.isValidString(stringFromAdObject) ? Color.parseColor(stringFromAdObject) : i;
    }

    public long getCreatedAtMillis() {
        return this.createdAtMillis;
    }

    public String getDspId() {
        return getStringFromFullResponse("dsp_id", "");
    }

    public String getDspName() {
        return getStringFromFullResponse("dsp_name", "");
    }

    public long getFetchLatencyMillis() {
        return getLongFromFullResponse("ad_fetch_latency_millis", -1L);
    }

    public long getFetchResponseSize() {
        return getLongFromFullResponse("ad_fetch_response_size", -1L);
    }

    protected float getFloatFromAdObject(String str, float f) {
        float f2;
        j5 j5Var = this.synchronizedAdObject;
        if (j5Var != null) {
            return j5Var.a(str, f);
        }
        synchronized (this.adObjectLock) {
            f2 = JsonUtils.getFloat(this.adObject, str, f);
        }
        return f2;
    }

    protected int getIntFromAdObject(String str, int i) {
        int i2;
        j5 j5Var = this.synchronizedAdObject;
        if (j5Var != null) {
            return j5Var.a(str, i);
        }
        synchronized (this.adObjectLock) {
            i2 = JsonUtils.getInt(this.adObject, str, i);
        }
        return i2;
    }

    protected List<Integer> getIntegerListFromAdObject(String str, List<Integer> list) {
        List<Integer> integerList;
        j5 j5Var = this.synchronizedAdObject;
        if (j5Var != null) {
            return j5Var.a(str, (List) list);
        }
        synchronized (this.adObjectLock) {
            integerList = JsonUtils.getIntegerList(this.adObject, str, list);
        }
        return integerList;
    }

    protected JSONArray getJsonArrayFromAdObject(String str, JSONArray jSONArray) {
        JSONArray jSONArray2;
        j5 j5Var = this.synchronizedAdObject;
        if (j5Var != null) {
            return j5Var.a(str, jSONArray);
        }
        synchronized (this.adObjectLock) {
            jSONArray2 = JsonUtils.getJSONArray(this.adObject, str, jSONArray);
        }
        return jSONArray2;
    }

    protected JSONObject getJsonObjectFromAdObject(String str, JSONObject jSONObject) {
        JSONObject jSONObject2;
        j5 j5Var = this.synchronizedAdObject;
        if (j5Var != null) {
            return j5Var.a(str, jSONObject);
        }
        synchronized (this.adObjectLock) {
            jSONObject2 = JsonUtils.getJSONObject(this.adObject, str, jSONObject);
        }
        return jSONObject2;
    }

    protected long getLongFromAdObject(String str, long j) {
        long j2;
        j5 j5Var = this.synchronizedAdObject;
        if (j5Var != null) {
            return j5Var.a(str, j);
        }
        synchronized (this.adObjectLock) {
            j2 = JsonUtils.getLong(this.adObject, str, j);
        }
        return j2;
    }

    protected long getLongFromFullResponse(String str, long j) {
        long j2;
        j5 j5Var = this.synchronizedFullResponse;
        if (j5Var != null) {
            return j5Var.a(str, j);
        }
        synchronized (this.fullResponseLock) {
            j2 = JsonUtils.getLong(this.fullResponse, str, j);
        }
        return j2;
    }

    @Override // com.applovin.impl.g4
    public abstract /* synthetic */ String getOpenMeasurementContentUrl();

    @Override // com.applovin.impl.g4
    public abstract /* synthetic */ String getOpenMeasurementCustomReferenceData();

    @Override // com.applovin.impl.g4
    public abstract /* synthetic */ List getOpenMeasurementVerificationScriptResources();

    public l getSdk() {
        return this.sdk;
    }

    protected String getStringFromAdObject(String str, String str2) {
        String string;
        j5 j5Var = this.synchronizedAdObject;
        if (j5Var != null) {
            return j5Var.a(str, str2);
        }
        synchronized (this.adObjectLock) {
            string = JsonUtils.getString(this.adObject, str, str2);
        }
        return string;
    }

    protected String getStringFromFullResponse(String str, String str2) {
        String string;
        j5 j5Var = this.synchronizedFullResponse;
        if (j5Var != null) {
            return j5Var.a(str, str2);
        }
        synchronized (this.fullResponseLock) {
            string = JsonUtils.getString(this.fullResponse, str, str2);
        }
        return string;
    }

    protected List<String> getStringListFromAdObject(String str, List<String> list) {
        List<String> stringList;
        j5 j5Var = this.synchronizedAdObject;
        if (j5Var != null) {
            return j5Var.b(str, list);
        }
        synchronized (this.adObjectLock) {
            stringList = JsonUtils.getStringList(this.adObject, str, list);
        }
        return stringList;
    }

    @Override // com.applovin.impl.g4
    public abstract /* synthetic */ boolean isOpenMeasurementEnabled();
}
