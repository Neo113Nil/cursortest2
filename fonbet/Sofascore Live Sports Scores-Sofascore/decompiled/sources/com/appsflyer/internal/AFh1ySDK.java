package com.appsflyer.internal;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.appsflyer.migration.internal.MigrationDataProvider;
import com.appsflyer.sdk_base.referrer.Referrer;
import com.ironsource.B1;
import com.ironsource.Ua;
import defpackage.sub;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class AFh1ySDK implements AFg1aSDK {

    @Nullable
    private JSONObject AFKeystoreWrapper;

    @Nullable
    private Long AFLogger;

    @Nullable
    private Long d;
    private boolean e;
    private boolean force;
    private boolean i;

    @NotNull
    private final AFi1lSDK registerClient;

    @NotNull
    private final AFc1hSDK unregisterClient;

    public AFh1ySDK(@NotNull AFc1hSDK aFc1hSDK, @NotNull AFi1lSDK aFi1lSDK) {
        aFc1hSDK.getClass();
        aFi1lSDK.getClass();
        this.unregisterClient = aFc1hSDK;
        this.registerClient = aFi1lSDK;
    }

    private final void AFKeystoreWrapper(Map<String, Object> map, AFe1zSDK aFe1zSDK) {
        Long l = aFe1zSDK == AFd1aSDK.afInfoLog ? this.d : aFe1zSDK == AFd1aSDK.force ? this.AFLogger : null;
        if (l != null) {
            AFj1tSDK.d(map).put("migration", sub.d(new Pair("delay", Long.valueOf(l.longValue()))));
        }
    }

    private final void AFLogger(String str, AFh1zSDK aFh1zSDK, JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        hashMap.put(str, jSONObject);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("branch", hashMap);
        HashMap hashMap3 = new HashMap();
        hashMap3.put(B1.e, hashMap2);
        aFh1zSDK.AFLogger(hashMap3);
        Map<String, Object> map = aFh1zSDK.AFKeystoreWrapper;
        map.getClass();
        AFe1zSDK d = aFh1zSDK.d();
        d.getClass();
        AFKeystoreWrapper(map, d);
    }

    @Override // com.appsflyer.internal.AFg1aSDK
    public final boolean d() {
        return this.i;
    }

    @Override // com.appsflyer.internal.AFg1aSDK
    public final void registerClient(@NotNull AFf1wSDK aFf1wSDK, @NotNull Function0<Unit> function0) {
        JSONObject AFLogger;
        aFf1wSDK.getClass();
        function0.getClass();
        if (this.unregisterClient.AFKeystoreWrapper.d("appsFlyerCount", 0) == 1 && aFf1wSDK.d == AFd1aSDK.unregisterClient) {
            Iterator<Referrer> it = this.registerClient.unregisterClient.iterator();
            while (it.hasNext()) {
                if (it.next().getState() == Referrer.State.STARTED) {
                    return;
                }
            }
            if (this.i || (AFLogger = AFLogger()) == null) {
                return;
            }
            this.AFKeystoreWrapper = AFLogger;
            function0.invoke();
        }
    }

    @Override // com.appsflyer.internal.AFg1aSDK
    public final void unregisterClient(@NotNull AFh1zSDK aFh1zSDK) {
        aFh1zSDK.getClass();
        JSONObject jSONObject = this.AFKeystoreWrapper;
        if (jSONObject != null) {
            jSONObject.getClass();
            AFLogger("attr", aFh1zSDK, jSONObject);
        } else {
            JSONObject AFLogger = AFLogger();
            if (AFLogger != null) {
                AFLogger("attr", aFh1zSDK, AFLogger);
            }
        }
        MigrationDataProvider.clear();
    }

    @Override // com.appsflyer.internal.AFg1aSDK
    public final void z_(@NotNull Intent intent, @NotNull AFa1mSDK aFa1mSDK) {
        intent.getClass();
        aFa1mSDK.getClass();
        Uri data = intent.getData();
        if (data == null) {
            return;
        }
        try {
            Object[] objArr = {data, aFa1mSDK};
            Map map = AFb1ySDK.getInstance;
            Object obj = map.get(-130779650);
            if (obj == null) {
                obj = ((Class) AFb1ySDK.AFLogger(Color.alpha(0) + 37, ViewConfiguration.getTouchSlop() >> 8, (char) ((ViewConfiguration.getTapTimeout() >> 16) + 31739))).getDeclaredConstructor(Uri.class, AFa1mSDK.class);
                map.put(-130779650, obj);
            }
            Object newInstance = ((Constructor) obj).newInstance(objArr);
            Object obj2 = map.get(-1563021701);
            if (obj2 == null) {
                obj2 = ((Class) AFb1ySDK.AFLogger(36 - TextUtils.indexOf((CharSequence) "", '0', 0), (-1) - MotionEvent.axisFromString(""), (char) (MotionEvent.axisFromString("") + 31740))).getMethod("registerClient", null);
                map.put(-1563021701, obj2);
            }
            Object invoke = ((Method) obj2).invoke(newInstance, null);
            Object obj3 = map.get(2130924844);
            if (obj3 == null) {
                obj3 = ((Class) AFb1ySDK.AFLogger((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 51, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 36, (char) (ViewConfiguration.getScrollDefaultDelay() >> 16))).getMethod("unregisterClient", null);
                map.put(2130924844, obj3);
            }
            boolean booleanValue = ((Boolean) ((Method) obj3).invoke(invoke, null)).booleanValue();
            this.e = !booleanValue;
            this.force = booleanValue;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    @Override // com.appsflyer.internal.AFg1aSDK
    public final boolean unregisterClient() {
        return this.e;
    }

    @Override // com.appsflyer.internal.AFg1aSDK
    public final void AFKeystoreWrapper() {
        this.e = false;
        this.force = false;
        MigrationDataProvider.clear();
    }

    private final JSONObject AFLogger() {
        long currentTimeMillis = System.currentTimeMillis();
        JSONObject waitForAttributionData = MigrationDataProvider.waitForAttributionData(Ua.C);
        if (waitForAttributionData != null) {
            this.AFLogger = Long.valueOf(System.currentTimeMillis() - currentTimeMillis);
        }
        return waitForAttributionData;
    }

    @Override // com.appsflyer.internal.AFg1aSDK
    public final void AFLogger(@NotNull AFh1zSDK aFh1zSDK) {
        aFh1zSDK.getClass();
        JSONObject attributionData = MigrationDataProvider.getAttributionData();
        if (attributionData != null) {
            AFLogger("attr", aFh1zSDK, attributionData);
            this.i = true;
        }
        MigrationDataProvider.clear();
    }

    @Override // com.appsflyer.internal.AFg1aSDK
    public final void registerClient() {
        if (this.e || this.force || MigrationDataProvider.waitForDeepLinkingData(0L) == null) {
            return;
        }
        this.e = true;
    }

    @Override // com.appsflyer.internal.AFg1aSDK
    public final void registerClient(@NotNull AFh1zSDK aFh1zSDK) {
        aFh1zSDK.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        JSONObject waitForDeepLinkingData = MigrationDataProvider.waitForDeepLinkingData(Ua.C);
        if (waitForDeepLinkingData != null) {
            this.d = Long.valueOf(System.currentTimeMillis() - currentTimeMillis);
            AFLogger("dl", aFh1zSDK, waitForDeepLinkingData);
        }
        MigrationDataProvider.clear();
    }
}
