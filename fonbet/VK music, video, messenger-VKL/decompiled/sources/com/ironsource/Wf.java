package com.ironsource;

import android.app.Activity;
import android.content.Context;
import com.huawei.hms.framework.common.BundleUtil;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseWrapper;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.unity3d.mediation.LevelPlayAdSize;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import org.json.JSONObject;
import xsna.drm0;
import xsna.j5g;
import xsna.pn00;

/* loaded from: classes13.dex */
public final class Wf {
    public static final Wf a = new Wf();

    private Wf() {
    }

    public final String a(Context context) {
        return E1.a(context, c(context));
    }

    public final String b(Context context) {
        return E1.b(context, c(context));
    }

    public final String c(Context context) {
        return E1.g(context);
    }

    public final ConcurrentHashMap<String, List<String>> d() {
        ConcurrentHashMap<String, List<String>> concurrentHashMap = new ConcurrentHashMap<>();
        concurrentHashMap.putAll(com.ironsource.mediationsdk.c.b().d());
        concurrentHashMap.putAll(C4440ma.b().c());
        return concurrentHashMap;
    }

    public final void e() {
        com.ironsource.mediationsdk.p.h().H();
    }

    public final JSONObject a(boolean z) {
        return IronSourceUtils.b(z);
    }

    public final JSONObject b() {
        return L6.a().b();
    }

    public final JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry<String, AdapterBaseWrapper> entry : com.ironsource.mediationsdk.c.b().e().entrySet()) {
                if (entry.getValue().getAdapterBaseInterface() != null) {
                    Wf wf = a;
                    String a2 = wf.a(entry.getKey());
                    AdapterBaseInterface adapterBaseInterface = entry.getValue().getAdapterBaseInterface();
                    jSONObject.putOpt(a2, wf.a(adapterBaseInterface.getAdapterVersion(), adapterBaseInterface.getNetworkSDKVersion()));
                }
            }
            return jSONObject;
        } catch (Exception e) {
            C4452n4.d().a(e);
            return jSONObject;
        }
    }

    public final void a(InterfaceC4316fb interfaceC4316fb) {
        C4277d8.a().b(interfaceC4316fb);
    }

    public final LevelPlayAdSize b(String str, int i, int i2) {
        if (str != null && str.length() != 0 && !str.equals("CUSTOM")) {
            if (str.equals("RECTANGLE")) {
                return LevelPlayAdSize.MEDIUM_RECTANGLE;
            }
            return LevelPlayAdSize.Companion.createAdSize$mediationsdk_release(str);
        }
        return LevelPlayAdSize.Companion.createCustomSize(i, i2);
    }

    public final void a(InterfaceC4530rb interfaceC4530rb) {
        Md.a().b(interfaceC4530rb);
    }

    public final void a(Ba ba) {
        C4629x2.a().b(ba);
    }

    public final int a() {
        return Kb.u.d().a().c();
    }

    public final String a(C4336gd c4336gd) {
        String c;
        return (c4336gd == null || (c = c4336gd.c()) == null) ? new String() : c;
    }

    public final String a(NetworkSettings networkSettings) {
        String providerDefaultInstance = networkSettings.getProviderDefaultInstance();
        return providerDefaultInstance == null ? new String() : providerDefaultInstance;
    }

    public final boolean a(NetworkSettings networkSettings, IronSource.a aVar) {
        return networkSettings.isBidder(aVar);
    }

    public final ISBannerSize a(String str, int i, int i2) {
        return new ISBannerSize(str, i, i2);
    }

    public final void b(String str) {
        IronLog.INTERNAL.error(str);
    }

    public final com.ironsource.mediationsdk.o a(Activity activity, ISBannerSize iSBannerSize) {
        return com.ironsource.mediationsdk.p.h().b(activity, iSBannerSize);
    }

    public final void a(EnumC4650y5 enumC4650y5, JSONObject jSONObject) {
        C4337ge.i().a(new C4632x5(enumC4650y5, jSONObject));
    }

    private final JSONObject a(String str, String str2) {
        return new JSONObject(pn00.k(new Pair("adapterVersion", str), new Pair("sdkVersion", str2)));
    }

    public final String a(String str) {
        try {
            if (!drm0.D(str, "-", false)) {
                return !drm0.D(str, BundleUtil.UNDERLINE_TAG, false) ? str : (String) j5g.Y(drm0.c0(str, new String[]{BundleUtil.UNDERLINE_TAG}, 0, 6));
            }
            String str2 = (String) j5g.i0(drm0.c0(str, new String[]{"-"}, 0, 6));
            return !drm0.D(str2, BundleUtil.UNDERLINE_TAG, false) ? str2 : (String) j5g.Y(drm0.c0(str2, new String[]{BundleUtil.UNDERLINE_TAG}, 0, 6));
        } catch (Exception e) {
            C4452n4.d().a(e);
            IronLog.INTERNAL.error(e.getMessage());
            return str;
        }
    }
}
