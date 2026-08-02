package com.appsflyer.internal;

import androidx.annotation.Nullable;
import com.appsflyer.share.attribution.AppsFlyerRequestListener;
import defpackage.a70;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class AFh1zSDK {
    public Map<String, Object> AFKeystoreWrapper;
    public final boolean AFLogger;

    @Nullable
    public String afDebugLog;
    public int afErrorLog;
    protected boolean afInfoLog;

    @Nullable
    public Map<String, Object> d;
    public String e;
    public byte[] force;

    @Nullable
    public String i;
    public final Map<String, String> registerClient;

    @Nullable
    public AppsFlyerRequestListener unregisterClient;
    public String v;
    public String w;

    public AFh1zSDK(@Nullable String str, @Nullable String str2, @Nullable Boolean bool) {
        this.AFKeystoreWrapper = new HashMap();
        this.registerClient = new HashMap();
        this.afInfoLog = false;
        this.v = str;
        this.w = str2;
        this.AFLogger = bool != null ? bool.booleanValue() : true;
    }

    public static boolean unregisterClient(double d) {
        if (d < 0.0d || d >= 1.0d) {
            return false;
        }
        if (d == 0.0d) {
            return true;
        }
        int i = (int) (1.0d / d);
        if (i + 1 > 0) {
            return ((int) ((Math.random() * ((double) i)) + 1.0d)) != i;
        }
        a70.p("Unsupported max value");
        return false;
    }

    public final AFh1zSDK AFKeystoreWrapper(int i) {
        this.afErrorLog = i;
        synchronized (this.AFKeystoreWrapper) {
            try {
                if (this.AFKeystoreWrapper.containsKey("counter")) {
                    this.AFKeystoreWrapper.put("counter", Integer.toString(i));
                }
                if (this.AFKeystoreWrapper.containsKey("launch_counter")) {
                    this.AFKeystoreWrapper.put("launch_counter", Integer.toString(i));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this;
    }

    public final AFh1zSDK AFLogger(Map<String, ?> map) {
        synchronized (map) {
            this.AFKeystoreWrapper.putAll(map);
        }
        return this;
    }

    public abstract AFe1zSDK d();

    public final AFh1zSDK registerClient(String str, Object obj) {
        synchronized (this.AFKeystoreWrapper) {
            this.AFKeystoreWrapper.put(str, obj);
        }
        return this;
    }

    public boolean AFLogger() {
        return true;
    }

    public boolean registerClient() {
        return false;
    }

    public AFh1zSDK() {
        this(null, null, null);
    }

    public boolean unregisterClient() {
        return true;
    }

    public final AFh1zSDK AFKeystoreWrapper() {
        this.afInfoLog = true;
        return this;
    }
}
