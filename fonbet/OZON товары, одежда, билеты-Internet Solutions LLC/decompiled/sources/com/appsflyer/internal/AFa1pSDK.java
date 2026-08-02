package com.appsflyer.internal;

import android.net.Uri;
import androidx.annotation.NonNull;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class AFa1pSDK {
    public String AFInAppEventParameterName;
    public AppsFlyerRequestListener AFInAppEventType;
    public Map<String, Object> AFKeystoreWrapper;
    public String AFLogger;

    /* renamed from: d, reason: collision with root package name */
    public String f57364d;

    /* renamed from: e, reason: collision with root package name */
    public String f57365e;
    private final boolean force;
    public int registerClient;
    public String unregisterClient;

    /* renamed from: v, reason: collision with root package name */
    private byte[] f57366v;
    protected final Map<String, Object> valueOf;
    public String values;

    public AFa1pSDK() {
        this(null, null, null);
    }

    @NonNull
    protected static String AFKeystoreWrapper(String str) {
        String AFLogger = AFb1tSDK.valueOf().values().AFInAppEventType().AFLogger();
        return AFLogger != null ? Uri.parse(str).buildUpon().appendQueryParameter(AppsFlyerProperties.CHANNEL, AFLogger).build().toString() : str;
    }

    public AFa1pSDK AFInAppEventParameterName(String str) {
        this.unregisterClient = str;
        return this;
    }

    public final AFa1pSDK AFInAppEventType(String str, Object obj) {
        synchronized (this.valueOf) {
            this.valueOf.put(str, obj);
        }
        return this;
    }

    public abstract AFf1zSDK AFKeystoreWrapper();

    public boolean d() {
        return true;
    }

    public boolean e() {
        return true;
    }

    public boolean registerClient() {
        return true;
    }

    public boolean unregisterClient() {
        return false;
    }

    public final Map<String, Object> valueOf() {
        return this.valueOf;
    }

    public final boolean values() {
        return this.AFLogger == null && this.AFInAppEventParameterName == null;
    }

    public AFa1pSDK(String str, String str2, Boolean bool) {
        this.valueOf = new HashMap();
        this.AFLogger = str;
        this.unregisterClient = str2;
        this.force = bool != null ? bool.booleanValue() : true;
    }

    public final AFa1pSDK AFInAppEventParameterName(Map<String, ?> map) {
        synchronized (map) {
            this.valueOf.putAll(map);
        }
        return this;
    }

    public final AFa1pSDK values(byte[] bArr) {
        this.f57366v = bArr;
        return this;
    }

    public static boolean values(double d11) {
        if (d11 < 0.0d || d11 >= 1.0d) {
            return false;
        }
        if (d11 == 0.0d) {
            return true;
        }
        int i11 = (int) (1.0d / d11);
        if (i11 + 1 > 0) {
            return ((int) ((Math.random() * ((double) i11)) + 1.0d)) != i11;
        }
        throw new IllegalArgumentException("Unsupported max value");
    }

    public final AFa1pSDK AFInAppEventType(int i11) {
        this.registerClient = i11;
        synchronized (this.valueOf) {
            try {
                if (this.valueOf.containsKey("counter")) {
                    this.valueOf.put("counter", Integer.toString(i11));
                }
                if (this.valueOf.containsKey("launch_counter")) {
                    this.valueOf.put("launch_counter", Integer.toString(i11));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return this;
    }

    public final boolean AFInAppEventParameterName() {
        return this.force;
    }

    public final byte[] AFInAppEventType() {
        return this.f57366v;
    }
}
