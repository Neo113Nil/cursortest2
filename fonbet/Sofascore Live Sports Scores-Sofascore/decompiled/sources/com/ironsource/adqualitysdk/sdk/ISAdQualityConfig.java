package com.ironsource.adqualitysdk.sdk;

import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.i.AbstractC0420;
import com.ironsource.adqualitysdk.sdk.i.AbstractC0428;
import com.ironsource.adqualitysdk.sdk.i.AbstractC1067;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Deprecated
/* loaded from: classes4.dex */
public class ISAdQualityConfig {

    /* renamed from: ﮌ, reason: contains not printable characters */
    public final HashMap f14;

    /* renamed from: ﮐ, reason: contains not printable characters */
    public final ISAdQualityDeviceIdType f15;

    /* renamed from: ﱟ, reason: contains not printable characters */
    public final boolean f16;

    /* renamed from: ﱡ, reason: contains not printable characters */
    public final boolean f17;

    /* renamed from: ﺙ, reason: contains not printable characters */
    public final String f18;

    /* renamed from: ﻏ, reason: contains not printable characters */
    public final ISAdQualityLogLevel f19;

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final HashSet f20;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final boolean f21;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final boolean f22;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final boolean f23;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final String f24;

    public ISAdQualityConfig(String str, boolean z, boolean z2, boolean z3, ISAdQualityLogLevel iSAdQualityLogLevel, HashSet hashSet, String str2, boolean z4, boolean z5, ISAdQualityDeviceIdType iSAdQualityDeviceIdType, HashMap hashMap) {
        this.f24 = str;
        this.f23 = z;
        this.f22 = z2;
        this.f21 = z3;
        this.f19 = iSAdQualityLogLevel;
        this.f20 = hashSet;
        this.f18 = str2;
        this.f17 = z4;
        this.f16 = z5;
        this.f15 = iSAdQualityDeviceIdType;
        this.f14 = hashMap;
    }

    @Deprecated
    public static ISAdQualityConfig merge(ISAdQualityConfig iSAdQualityConfig, ISAdQualityConfig iSAdQualityConfig2) {
        Builder builder = new Builder();
        if (iSAdQualityConfig.f23) {
            builder.setUserId(iSAdQualityConfig.f24);
        } else if (iSAdQualityConfig2.f23) {
            builder.setUserId(iSAdQualityConfig2.f24);
        }
        if (iSAdQualityConfig.f21) {
            builder.setTestMode(iSAdQualityConfig.f22);
        } else if (iSAdQualityConfig2.f21) {
            builder.setTestMode(iSAdQualityConfig2.f22);
        }
        if (iSAdQualityConfig.f16) {
            builder.setCoppa(iSAdQualityConfig.f17);
        } else if (iSAdQualityConfig2.f16) {
            builder.setCoppa(iSAdQualityConfig2.f17);
        }
        ISAdQualityLogLevel iSAdQualityLogLevel = iSAdQualityConfig.f19;
        if (iSAdQualityLogLevel == null) {
            iSAdQualityLogLevel = iSAdQualityConfig2.f19;
        }
        builder.setLogLevel(iSAdQualityLogLevel);
        Iterator it = iSAdQualityConfig.f20.iterator();
        while (it.hasNext()) {
            builder.addAdQualityInitListener((ISAdQualityInitListener) it.next());
        }
        Iterator it2 = iSAdQualityConfig2.f20.iterator();
        while (it2.hasNext()) {
            builder.addAdQualityInitListener((ISAdQualityInitListener) it2.next());
        }
        String str = iSAdQualityConfig.f18;
        if (str != null) {
            builder.setInitializationSource(str);
        } else {
            String str2 = iSAdQualityConfig2.f18;
            if (str2 != null) {
                builder.setInitializationSource(str2);
            }
        }
        ISAdQualityDeviceIdType iSAdQualityDeviceIdType = iSAdQualityConfig.f15;
        if (iSAdQualityDeviceIdType == null) {
            iSAdQualityDeviceIdType = iSAdQualityConfig2.f15;
        }
        builder.setDeviceIdType(iSAdQualityDeviceIdType);
        HashMap hashMap = new HashMap(iSAdQualityConfig2.f14);
        hashMap.putAll(iSAdQualityConfig.f14);
        for (Map.Entry entry : hashMap.entrySet()) {
            builder.setMetaData((String) entry.getKey(), (String) entry.getValue());
        }
        return builder.build();
    }

    @Deprecated
    public Set<ISAdQualityInitListener> getAdQualityInitListeners() {
        return this.f20;
    }

    @Deprecated
    public boolean getCoppa() {
        return this.f17;
    }

    @Deprecated
    public ISAdQualityDeviceIdType getDeviceIdType() {
        return this.f15;
    }

    @Deprecated
    public String getInitializationSource() {
        return this.f18;
    }

    @Deprecated
    public ISAdQualityLogLevel getLogLevel() {
        return this.f19;
    }

    @Deprecated
    public Map<String, String> getMetaData() {
        return this.f14;
    }

    @Deprecated
    public String getUserId() {
        return this.f24;
    }

    @Deprecated
    public boolean isTestMode() {
        return this.f22;
    }

    @Deprecated
    public boolean isUserIdSet() {
        return this.f23;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Deprecated
    public static class Builder {

        /* renamed from: ﾒ, reason: contains not printable characters */
        public String f35 = null;

        /* renamed from: ﾇ, reason: contains not printable characters */
        public boolean f34 = false;

        /* renamed from: ｋ, reason: contains not printable characters */
        public boolean f33 = false;

        /* renamed from: ﻛ, reason: contains not printable characters */
        public boolean f32 = false;

        /* renamed from: ﻐ, reason: contains not printable characters */
        public ISAdQualityLogLevel f31 = ISAdQualityLogLevel.INFO;

        /* renamed from: ﻏ, reason: contains not printable characters */
        public final HashSet f30 = new HashSet();

        /* renamed from: ﺙ, reason: contains not printable characters */
        public String f29 = null;

        /* renamed from: ﱡ, reason: contains not printable characters */
        public boolean f28 = false;

        /* renamed from: ﱟ, reason: contains not printable characters */
        public boolean f27 = false;

        /* renamed from: ﮐ, reason: contains not printable characters */
        public ISAdQualityDeviceIdType f26 = ISAdQualityDeviceIdType.NONE;

        /* renamed from: ﮌ, reason: contains not printable characters */
        public final HashMap f25 = new HashMap();

        @Deprecated
        public Builder() {
        }

        @Deprecated
        public Builder addAdQualityInitListener(ISAdQualityInitListener iSAdQualityInitListener) {
            this.f30.add(iSAdQualityInitListener);
            return this;
        }

        @Deprecated
        public ISAdQualityConfig build() {
            return new ISAdQualityConfig(this.f35, this.f34, this.f33, this.f32, this.f31, this.f30, this.f29, this.f28, this.f27, this.f26, this.f25);
        }

        @Deprecated
        public Builder removeAdQualityInitListener(ISAdQualityInitListener iSAdQualityInitListener) {
            this.f30.remove(iSAdQualityInitListener);
            return this;
        }

        @Deprecated
        public Builder setAdQualityInitListener(ISAdQualityInitListener iSAdQualityInitListener) {
            return addAdQualityInitListener(iSAdQualityInitListener);
        }

        @Deprecated
        public Builder setCoppa(boolean z) {
            this.f28 = z;
            this.f27 = true;
            return this;
        }

        @Deprecated
        public Builder setDeviceIdType(ISAdQualityDeviceIdType iSAdQualityDeviceIdType) {
            this.f26 = iSAdQualityDeviceIdType;
            return this;
        }

        @Deprecated
        public Builder setInitializationSource(String str) {
            if (AbstractC1067.m638(str, 20)) {
                this.f29 = str;
                return this;
            }
            AbstractC0420.m245("ISAdQualityConfig", "setInitializationSource( " + str + " ) init source must have length of 1-20");
            return this;
        }

        @Deprecated
        public Builder setLogLevel(ISAdQualityLogLevel iSAdQualityLogLevel) {
            this.f31 = iSAdQualityLogLevel;
            return this;
        }

        @Deprecated
        public Builder setMetaData(String str, String str2) {
            try {
                if (!TextUtils.isEmpty(str2)) {
                    if (!AbstractC0428.f1222.contains(str)) {
                        if (AbstractC0428.m261(this.f25, str)) {
                            AbstractC0420.m245("ISAdQualityConfig", "setMetaData( " + str + " , " + str2 + " ) limited to 5 meta data values. Ignoring meta data value.");
                            return this;
                        }
                        if (!AbstractC1067.m638(str, 64) || !AbstractC1067.m638(str2, 64)) {
                            AbstractC0420.m245("ISAdQualityConfig", "setMetaData( " + str + " , " + str2 + " ) the length of both the key and the value should be between 1 and 64 characters.");
                            return this;
                        }
                    }
                    this.f25.put(str, str2);
                }
            } catch (Exception unused) {
            }
            return this;
        }

        @Deprecated
        public Builder setTestMode(boolean z) {
            this.f33 = z;
            this.f32 = true;
            return this;
        }

        @Deprecated
        public Builder setUserId(String str) {
            this.f35 = str;
            this.f34 = true;
            return this;
        }

        @Deprecated
        public Builder setMetaData(JSONObject jSONObject) {
            if (jSONObject != null) {
                for (int i = 0; i < jSONObject.names().length(); i++) {
                    try {
                        String string = jSONObject.names().getString(i);
                        Object opt = jSONObject.opt(string);
                        if (opt instanceof String) {
                            setMetaData(string, (String) opt);
                        } else {
                            AbstractC0420.m245("ISAdQualityConfig", "setMetaData( " + string + " , " + opt + " ) value must be a string");
                        }
                    } catch (Exception unused) {
                    }
                }
            }
            return this;
        }
    }
}
