package com.ironsource.sdk.controller;

import com.ironsource.C2388df;
import com.ironsource.C2556n4;
import com.ironsource.InterfaceC2542m8;
import com.ironsource.J3;
import com.ironsource.Jb;
import com.ironsource.K3;
import com.ironsource.X3;
import com.ironsource.Y6;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.SDKUtils;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class FeaturesManager {
    private static volatile FeaturesManager d = null;
    private static final String e = "debugMode";
    private Map<String, ?> a;
    private final ArrayList<String> b = new a();
    private InterfaceC2542m8 c = Jb.Y().t();

    class a extends ArrayList<String> {
        a() {
            add(X3.d.f);
            add(X3.d.e);
            add(X3.d.g);
            add(X3.d.h);
            add(X3.d.i);
            add(X3.d.j);
            add(X3.d.k);
            add(X3.d.l);
            add(X3.d.m);
        }
    }

    private FeaturesManager() {
        if (d != null) {
            throw new RuntimeException("Use getInstance() method to get the single instance of this class.");
        }
        this.a = new HashMap();
    }

    public static FeaturesManager getInstance() {
        if (d == null) {
            synchronized (FeaturesManager.class) {
                if (d == null) {
                    d = new FeaturesManager();
                }
            }
        }
        return d;
    }

    ArrayList<String> a() {
        return new ArrayList<>(this.b);
    }

    public JSONObject getDataManagerConfig() {
        JSONObject networkConfiguration = SDKUtils.getNetworkConfiguration();
        return networkConfiguration.has(X3.a.d) ? networkConfiguration.optJSONObject(X3.a.d) : IronSourceNetworkBridge.jsonObjectInit();
    }

    public int getDebugMode() {
        Integer num = 0;
        try {
            if (this.a.containsKey("debugMode")) {
                num = (Integer) this.a.get("debugMode");
            }
        } catch (Exception e2) {
            C2556n4.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
        }
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public J3 getFeatureFlagCatchUrlError() {
        return new J3(SDKUtils.getNetworkConfiguration().optJSONObject(J3.a.c));
    }

    public K3 getFeatureFlagClickCheck() {
        return new K3(SDKUtils.getNetworkConfiguration());
    }

    public Y6 getFeatureFlagHealthCheck() {
        JSONObject a2 = this.c.a(X3.a.r);
        return a2 instanceof JSONObject ? new Y6(a2) : new Y6(null);
    }

    public boolean getFeatureFlagLoadControllerAndPlayerFromBundle() {
        return SDKUtils.getNetworkFeatureConfiguration().optBoolean(X3.a.w, false);
    }

    public int getInitRecoverTrials() {
        JSONObject optJSONObject = SDKUtils.getNetworkConfiguration().optJSONObject("init");
        if (optJSONObject != null) {
            return optJSONObject.optInt(X3.a.e, 0);
        }
        return 0;
    }

    public C2388df getSessionHistoryConfig() {
        JSONObject networkConfiguration = SDKUtils.getNetworkConfiguration();
        return new C2388df(networkConfiguration.has(X3.a.s) ? networkConfiguration.optJSONObject(X3.a.s) : IronSourceNetworkBridge.jsonObjectInit());
    }

    public boolean getStopUseOnResumeAndPause() {
        return Boolean.TRUE.equals(this.c.c(X3.a.u));
    }

    public void updateDebugConfigurations(Map<String, Object> map) {
        if (map == null) {
            return;
        }
        this.a = map;
    }
}
