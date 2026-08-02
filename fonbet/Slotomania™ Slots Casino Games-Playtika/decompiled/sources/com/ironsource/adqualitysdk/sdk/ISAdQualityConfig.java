package com.ironsource.adqualitysdk.sdk;

import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.i.am;
import com.ironsource.adqualitysdk.sdk.i.kn;
import com.ironsource.adqualitysdk.sdk.i.m;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ISAdQualityConfig {

    /* renamed from: ﮌ, reason: contains not printable characters */
    private final Map<String, String> f28;

    /* renamed from: ﮐ, reason: contains not printable characters */
    private final boolean f29;

    /* renamed from: ﱟ, reason: contains not printable characters */
    private final String f30;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private final boolean f31;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private final ISAdQualityDeviceIdType f32;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private final ISAdQualityLogLevel f33;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private final boolean f34;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private final Set<ISAdQualityInitListener> f35;

    /* renamed from: ｋ, reason: contains not printable characters */
    private final String f36;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private final boolean f37;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private final boolean f38;

    /* synthetic */ ISAdQualityConfig(String str, boolean z, boolean z2, boolean z3, ISAdQualityLogLevel iSAdQualityLogLevel, Set set, String str2, boolean z4, boolean z5, ISAdQualityDeviceIdType iSAdQualityDeviceIdType, Map map, byte b) {
        this(str, z, z2, z3, iSAdQualityLogLevel, set, str2, z4, z5, iSAdQualityDeviceIdType, map);
    }

    private ISAdQualityConfig(String str, boolean z, boolean z2, boolean z3, ISAdQualityLogLevel iSAdQualityLogLevel, Set<ISAdQualityInitListener> set, String str2, boolean z4, boolean z5, ISAdQualityDeviceIdType iSAdQualityDeviceIdType, Map<String, String> map) {
        this.f36 = str;
        this.f38 = z;
        this.f37 = z2;
        this.f34 = z3;
        this.f33 = iSAdQualityLogLevel;
        this.f35 = set;
        this.f30 = str2;
        this.f29 = z4;
        this.f31 = z5;
        this.f32 = iSAdQualityDeviceIdType;
        this.f28 = map;
    }

    public static ISAdQualityConfig merge(ISAdQualityConfig iSAdQualityConfig, ISAdQualityConfig iSAdQualityConfig2) {
        Builder builder = new Builder();
        if (iSAdQualityConfig.f38) {
            builder.setUserId(iSAdQualityConfig.f36);
        } else if (iSAdQualityConfig2.f38) {
            builder.setUserId(iSAdQualityConfig2.f36);
        }
        if (iSAdQualityConfig.f34) {
            builder.setTestMode(iSAdQualityConfig.f37);
        } else if (iSAdQualityConfig2.f34) {
            builder.setTestMode(iSAdQualityConfig2.f37);
        }
        if (iSAdQualityConfig.f31) {
            builder.setCoppa(iSAdQualityConfig.f29);
        } else if (iSAdQualityConfig2.f31) {
            builder.setCoppa(iSAdQualityConfig2.f29);
        }
        ISAdQualityLogLevel iSAdQualityLogLevel = iSAdQualityConfig.f33;
        if (iSAdQualityLogLevel == null) {
            iSAdQualityLogLevel = iSAdQualityConfig2.f33;
        }
        builder.setLogLevel(iSAdQualityLogLevel);
        Iterator<ISAdQualityInitListener> it = iSAdQualityConfig.f35.iterator();
        while (it.hasNext()) {
            builder.addAdQualityInitListener(it.next());
        }
        Iterator<ISAdQualityInitListener> it2 = iSAdQualityConfig2.f35.iterator();
        while (it2.hasNext()) {
            builder.addAdQualityInitListener(it2.next());
        }
        String str = iSAdQualityConfig.f30;
        if (str != null) {
            builder.setInitializationSource(str);
        } else {
            String str2 = iSAdQualityConfig2.f30;
            if (str2 != null) {
                builder.setInitializationSource(str2);
            }
        }
        ISAdQualityDeviceIdType iSAdQualityDeviceIdType = iSAdQualityConfig.f32;
        if (iSAdQualityDeviceIdType == null) {
            iSAdQualityDeviceIdType = iSAdQualityConfig2.f32;
        }
        builder.setDeviceIdType(iSAdQualityDeviceIdType);
        HashMap hashMap = new HashMap(iSAdQualityConfig2.f28);
        hashMap.putAll(iSAdQualityConfig.f28);
        for (Map.Entry entry : hashMap.entrySet()) {
            builder.setMetaData((String) entry.getKey(), (String) entry.getValue());
        }
        return builder.build();
    }

    public String getUserId() {
        return this.f36;
    }

    public boolean isUserIdSet() {
        return this.f38;
    }

    public boolean isTestMode() {
        return this.f37;
    }

    public ISAdQualityLogLevel getLogLevel() {
        return this.f33;
    }

    public Set<ISAdQualityInitListener> getAdQualityInitListeners() {
        return this.f35;
    }

    public String getInitializationSource() {
        return this.f30;
    }

    public boolean getCoppa() {
        return this.f29;
    }

    public ISAdQualityDeviceIdType getDeviceIdType() {
        return this.f32;
    }

    public Map<String, String> getMetaData() {
        return this.f28;
    }

    public static class Builder {

        /* renamed from: ｋ, reason: contains not printable characters */
        private String f47 = null;

        /* renamed from: ﻛ, reason: contains not printable characters */
        private boolean f46 = false;

        /* renamed from: ﾒ, reason: contains not printable characters */
        private boolean f49 = false;

        /* renamed from: ﻐ, reason: contains not printable characters */
        private boolean f45 = false;

        /* renamed from: ﾇ, reason: contains not printable characters */
        private ISAdQualityLogLevel f48 = ISAdQualityLogLevel.INFO;

        /* renamed from: ﱟ, reason: contains not printable characters */
        private final Set<ISAdQualityInitListener> f41 = new HashSet();

        /* renamed from: ﱡ, reason: contains not printable characters */
        private String f42 = null;

        /* renamed from: ﺙ, reason: contains not printable characters */
        private boolean f43 = false;

        /* renamed from: ﮐ, reason: contains not printable characters */
        private boolean f40 = false;

        /* renamed from: ﻏ, reason: contains not printable characters */
        private ISAdQualityDeviceIdType f44 = ISAdQualityDeviceIdType.NONE;

        /* renamed from: ﭖ, reason: contains not printable characters */
        private final Map<String, String> f39 = new HashMap();

        public Builder setUserId(String str) {
            this.f47 = str;
            this.f46 = true;
            return this;
        }

        public Builder setTestMode(boolean z) {
            this.f49 = z;
            this.f45 = true;
            return this;
        }

        public Builder setLogLevel(ISAdQualityLogLevel iSAdQualityLogLevel) {
            this.f48 = iSAdQualityLogLevel;
            return this;
        }

        @Deprecated
        public Builder setAdQualityInitListener(ISAdQualityInitListener iSAdQualityInitListener) {
            return addAdQualityInitListener(iSAdQualityInitListener);
        }

        public Builder addAdQualityInitListener(ISAdQualityInitListener iSAdQualityInitListener) {
            this.f41.add(iSAdQualityInitListener);
            return this;
        }

        public Builder removeAdQualityInitListener(ISAdQualityInitListener iSAdQualityInitListener) {
            this.f41.remove(iSAdQualityInitListener);
            return this;
        }

        public Builder setInitializationSource(String str) {
            if (kn.m8477(str, 20)) {
                this.f42 = str;
                return this;
            }
            m.m8523("ISAdQualityConfig", new StringBuilder("setInitializationSource( ").append(str).append(" ) init source must have length of 1-20").toString());
            return this;
        }

        public Builder setCoppa(boolean z) {
            this.f43 = z;
            this.f40 = true;
            return this;
        }

        public Builder setDeviceIdType(ISAdQualityDeviceIdType iSAdQualityDeviceIdType) {
            this.f44 = iSAdQualityDeviceIdType;
            return this;
        }

        public Builder setMetaData(JSONObject jSONObject) {
            if (jSONObject != null) {
                for (int i = 0; i < jSONObject.names().length(); i++) {
                    try {
                        String string = jSONObject.names().getString(i);
                        Object opt = jSONObject.opt(string);
                        if (opt instanceof String) {
                            setMetaData(string, (String) opt);
                        } else {
                            m.m8523("ISAdQualityConfig", new StringBuilder("setMetaData( ").append(string).append(" , ").append(opt).append(" ) value must be a string").toString());
                        }
                    } catch (Exception unused) {
                    }
                }
            }
            return this;
        }

        public Builder setMetaData(String str, String str2) {
            try {
                if (!TextUtils.isEmpty(str2)) {
                    if (!am.m6008(str)) {
                        if (am.m6012(this.f39, str)) {
                            m.m8523("ISAdQualityConfig", new StringBuilder("setMetaData( ").append(str).append(" , ").append(str2).append(" ) limited to 5 meta data values. Ignoring meta data value.").toString());
                            return this;
                        }
                        if (!am.m6011(str, str2)) {
                            m.m8523("ISAdQualityConfig", new StringBuilder("setMetaData( ").append(str).append(" , ").append(str2).append(" ) the length of both the key and the value should be between 1 and 64 characters.").toString());
                            return this;
                        }
                    }
                    this.f39.put(str, str2);
                }
            } catch (Exception unused) {
            }
            return this;
        }

        public ISAdQualityConfig build() {
            return new ISAdQualityConfig(this.f47, this.f46, this.f49, this.f45, this.f48, this.f41, this.f42, this.f43, this.f40, this.f44, this.f39, (byte) 0);
        }
    }
}
