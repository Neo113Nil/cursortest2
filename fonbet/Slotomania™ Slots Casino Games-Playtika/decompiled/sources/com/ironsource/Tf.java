package com.ironsource;

import android.app.Activity;
import android.content.Context;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseWrapper;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import com.unity3d.mediation.LevelPlayAdSize;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class Tf {
    public static final Tf a = new Tf();

    private Tf() {
    }

    public final String a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return E1.a(context, c(context));
    }

    public final String b(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return E1.b(context, c(context));
    }

    public final String c(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return E1.g(context);
    }

    public final ConcurrentHashMap<String, List<String>> d() {
        ConcurrentHashMap<String, List<String>> concurrentHashMap = new ConcurrentHashMap<>();
        concurrentHashMap.putAll(com.ironsource.mediationsdk.c.b().d());
        concurrentHashMap.putAll(C2526la.b().c());
        return concurrentHashMap;
    }

    public final void e() {
        com.ironsource.mediationsdk.p.h().H();
    }

    public final JSONObject a(boolean z) {
        JSONObject b = IronSourceUtils.b(z);
        Intrinsics.checkNotNullExpressionValue(b, "getMediationAdditionalData(isDemandOnlyMode)");
        return b;
    }

    public final JSONObject b() {
        JSONObject b = J6.a().b();
        Intrinsics.checkNotNullExpressionValue(b, "getProperties().toJSON()");
        return b;
    }

    public final JSONObject c() {
        JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
        try {
            ConcurrentHashMap<String, AdapterBaseWrapper> networkAdaptersMap = com.ironsource.mediationsdk.c.b().e();
            Intrinsics.checkNotNullExpressionValue(networkAdaptersMap, "networkAdaptersMap");
            for (Map.Entry<String, AdapterBaseWrapper> entry : networkAdaptersMap.entrySet()) {
                if (entry.getValue().getAdapterBaseInterface() != null) {
                    Tf tf = a;
                    String key = entry.getKey();
                    Intrinsics.checkNotNullExpressionValue(key, "entry.key");
                    String a2 = tf.a(key);
                    AdapterBaseInterface adapterBaseInterface = entry.getValue().getAdapterBaseInterface();
                    Intrinsics.checkNotNullExpressionValue(adapterBaseInterface, "entry.value.adapterBaseInterface");
                    String adapterVersion = adapterBaseInterface.getAdapterVersion();
                    Intrinsics.checkNotNullExpressionValue(adapterVersion, "adapterBaseInterface.adapterVersion");
                    jsonObjectInit.putOpt(a2, tf.a(adapterVersion, adapterBaseInterface.getNetworkSDKVersion()));
                }
            }
        } catch (Exception e) {
            C2556n4.d().a(e);
        }
        return jsonObjectInit;
    }

    public final void a(InterfaceC2402eb interfaceC2402eb) {
        C2363c8.a().b(interfaceC2402eb);
    }

    public final LevelPlayAdSize b(String str, int i, int i2) {
        if (str != null && str.length() != 0 && !Intrinsics.areEqual(str, "CUSTOM")) {
            if (Intrinsics.areEqual(str, com.ironsource.mediationsdk.j.c)) {
                return LevelPlayAdSize.MEDIUM_RECTANGLE;
            }
            return LevelPlayAdSize.Companion.createAdSize$mediationsdk_release(str);
        }
        return LevelPlayAdSize.Companion.createCustomSize(i, i2);
    }

    public final void a(InterfaceC2617qb interfaceC2617qb) {
        Md.a().b(interfaceC2617qb);
    }

    public final void a(Aa aa) {
        C2733x2.a().b(aa);
    }

    public final int a() {
        return Jb.u.d().a().c();
    }

    public final String a(C2440gd c2440gd) {
        String c;
        return (c2440gd == null || (c = c2440gd.c()) == null) ? new String() : c;
    }

    public final String a(NetworkSettings networkSettings) {
        Intrinsics.checkNotNullParameter(networkSettings, "networkSettings");
        String providerDefaultInstance = networkSettings.getProviderDefaultInstance();
        return providerDefaultInstance == null ? new String() : providerDefaultInstance;
    }

    public final boolean a(NetworkSettings networkSettings, IronSource.a adUnit) {
        Intrinsics.checkNotNullParameter(networkSettings, "networkSettings");
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        return networkSettings.isBidder(adUnit);
    }

    public final ISBannerSize a(String str, int i, int i2) {
        return new ISBannerSize(str, i, i2);
    }

    public final com.ironsource.mediationsdk.o a(Activity activity, ISBannerSize size) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(size, "size");
        com.ironsource.mediationsdk.o b = com.ironsource.mediationsdk.p.h().b(activity, size);
        Intrinsics.checkNotNullExpressionValue(b, "getInstance().createBanner(activity, size)");
        return b;
    }

    public final void a(EnumC2754y5 event, JSONObject data) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(data, "data");
        C2441ge.i().a(new C2736x5(event, data));
    }

    private final JSONObject a(String str, String str2) {
        return new JSONObject(MapsKt.mapOf(TuplesKt.to(Mf.b, str), TuplesKt.to("sdkVersion", str2)));
    }

    public final void b(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        IronLog.INTERNAL.error(message);
    }

    public final String a(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        try {
        } catch (Exception e) {
            e = e;
        }
        try {
            if (!StringsKt.contains$default((CharSequence) key, (CharSequence) "-", false, 2, (Object) null)) {
                return !StringsKt.contains$default((CharSequence) key, (CharSequence) "_", false, 2, (Object) null) ? key : (String) CollectionsKt.first(StringsKt.split$default((CharSequence) key, new String[]{"_"}, false, 0, 6, (Object) null));
            }
            String str = (String) CollectionsKt.last(StringsKt.split$default((CharSequence) key, new String[]{"-"}, false, 0, 6, (Object) null));
            return !StringsKt.contains$default((CharSequence) str, (CharSequence) "_", false, 2, (Object) null) ? str : (String) CollectionsKt.first(StringsKt.split$default((CharSequence) str, new String[]{"_"}, false, 0, 6, (Object) null));
        } catch (Exception e2) {
            e = e2;
            Exception exc = e;
            C2556n4.d().a(exc);
            IronLog.INTERNAL.error(exc.getMessage());
            return key;
        }
    }
}
