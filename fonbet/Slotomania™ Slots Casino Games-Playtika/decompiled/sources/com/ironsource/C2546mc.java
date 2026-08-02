package com.ironsource;

import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.ironsource.mc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C2546mc {

    /* renamed from: com.ironsource.mc$a */
    public static final class a {
        public static final a a = new a();
        public static final String b = "SDKPluginType";
        public static final String c = "sessionid";

        private a() {
        }
    }

    public final Map<String, String> a() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String pluginType = ConfigFile.getConfigFile().getPluginType();
        if (pluginType != null) {
            linkedHashMap.put(a.b, pluginType);
        }
        String d = IronSourceUtils.d();
        if (d != null) {
            linkedHashMap.put("sessionid", d);
        }
        return linkedHashMap;
    }
}
