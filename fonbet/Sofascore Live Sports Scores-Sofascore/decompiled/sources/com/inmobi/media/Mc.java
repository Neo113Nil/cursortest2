package com.inmobi.media;

import android.os.Bundle;
import com.applovin.communicator.AppLovinCommunicatorEntity;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.inmobi.media.core.config.models.SignalsConfig;
import com.inmobi.signals.adinfo.SignalCollector;
import com.unity3d.services.core.fid.Constants;
import defpackage.b1c;
import defpackage.joa;
import defpackage.mpa;
import defpackage.ogb;
import defpackage.ypa;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public abstract class Mc {
    public static final AtomicBoolean a = new AtomicBoolean(false);
    public static final SignalsConfig b;
    public static final String c;
    public static final joa d;
    public static final joa e;
    public static Boolean f;
    public static final Function2 g;

    static {
        int i = 0;
        SignalsConfig signalsConfig = (SignalsConfig) AbstractC3435g4.a.a(SignalsConfig.class);
        b = signalsConfig;
        String topic = signalsConfig.getPublisher().getAuto().getTopic();
        if (topic.length() == 0) {
            topic = "max_revenue_events";
        }
        c = topic;
        d = ypa.b(new ogb(29));
        e = ypa.b(new b1c(i));
        g = new mpa(11);
    }

    public static LinkedHashMap a(Bundle bundle) {
        boolean z;
        Object obj;
        Object obj2;
        bundle.getClass();
        if (!a.get()) {
            return null;
        }
        SignalsConfig signalsConfig = b;
        if (!signalsConfig.getPublisher().getAuto().getEnabled()) {
            return null;
        }
        Map<String, SignalsConfig.PublisherConfig.KeyData> allowedKeys = signalsConfig.getPublisher().getAuto().getAllowedKeys();
        if (allowedKeys.isEmpty()) {
            return null;
        }
        Objects.toString(allowedKeys.keySet());
        Set<String> keySet = bundle.keySet();
        if (keySet.isEmpty()) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (keySet.contains("ad_format") && (obj2 = bundle.get("ad_format")) != null) {
            linkedHashMap.put("auto_type", obj2);
            z = true;
        } else {
            z = false;
        }
        Boolean valueOf = Boolean.valueOf(z);
        if (!z) {
            valueOf = null;
        }
        if (valueOf == null) {
            return null;
        }
        for (Map.Entry<String, SignalsConfig.PublisherConfig.KeyData> entry : allowedKeys.entrySet()) {
            String key = entry.getKey();
            SignalsConfig.PublisherConfig.KeyData value = entry.getValue();
            if (keySet.contains(key)) {
                String name = value.getName();
                if (N3.a(name) && (obj = bundle.get(key)) != null) {
                    linkedHashMap.put(name, obj);
                }
            }
        }
        if (linkedHashMap.isEmpty()) {
            return null;
        }
        return linkedHashMap;
    }

    public static final boolean b() {
        try {
            Class<?> cls = Class.forName("com.applovin.communicator.AppLovinCommunicator");
            if (Intrinsics.c(cls.getMethod(Constants.GET_INSTANCE, null).getReturnType(), cls) && Intrinsics.c(AppLovinCommunicatorSubscriber.class.getMethod("onMessageReceived", Class.forName("com.applovin.communicator.AppLovinCommunicatorMessage")).getReturnType(), Void.TYPE)) {
                return Intrinsics.c(AppLovinCommunicatorEntity.class.getMethod("getCommunicatorId", null).getReturnType(), String.class);
            }
            return false;
        } catch (Error | Exception unused) {
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
    
        if (r2 == null) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean c() {
        String str;
        Boolean bool = f;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            Object obj = Class.forName("com.applovin.sdk.AppLovinSdk").getField("VERSION").get(null);
            str = obj instanceof String ? (String) obj : null;
        } catch (Throwable unused) {
        }
        str = com.ironsource.Y1.f;
        List<String> incompatibleSdkVer = b.getPublisher().getAuto().getIncompatibleSdkVer();
        Objects.toString(incompatibleSdkVer);
        boolean z = str.equals(com.ironsource.Y1.f) || incompatibleSdkVer.contains(str);
        f = Boolean.valueOf(z);
        return z;
    }

    public static final SignalCollector d() {
        return new SignalCollector(kotlin.collections.a.c(c));
    }

    public static void a() {
        if (b.getPublisher().getAuto().getEnabled() && !c() && ((Boolean) e.getValue()).booleanValue() && c.length() != 0 && a.compareAndSet(false, true)) {
            ((SignalCollector) d.getValue()).setupAppLovinCommunicator(g);
        }
    }

    public static final Unit a(Bundle bundle, String str) {
        LinkedHashMap a2;
        str.getClass();
        if (bundle != null) {
            try {
                if (Intrinsics.c(str, c) && (a2 = a(bundle)) != null) {
                    C3422fh.a.getClass();
                    C3422fh.a(a2);
                    a2.toString();
                }
            } catch (Throwable unused) {
            }
        }
        return Unit.a;
    }
}
