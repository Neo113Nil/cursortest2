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
import com.unity3d.mediation.LevelPlayAdSize;
import defpackage.tub;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Uf {

    @NotNull
    public static final Uf a = new Uf();

    private Uf() {
    }

    @NotNull
    public final String a(@NotNull String str) {
        List split$default;
        List split$default2;
        List split$default3;
        str.getClass();
        try {
            if (!StringsKt.J(str, "-", false)) {
                if (!StringsKt.J(str, "_", false)) {
                    return str;
                }
                split$default3 = StringsKt__StringsKt.split$default(str, new String[]{"_"}, false, 0, 6, null);
                return (String) CollectionsKt.Y(split$default3);
            }
            split$default = StringsKt__StringsKt.split$default(str, new String[]{"-"}, false, 0, 6, null);
            String str2 = (String) CollectionsKt.h0(split$default);
            if (!StringsKt.J(str2, "_", false)) {
                return str2;
            }
            split$default2 = StringsKt__StringsKt.split$default(str2, new String[]{"_"}, false, 0, 6, null);
            return (String) CollectionsKt.Y(split$default2);
        } catch (Exception e) {
            C4157k4.d().a(e);
            IronLog.INTERNAL.error(e.getMessage());
            return str;
        }
    }

    @NotNull
    public final LevelPlayAdSize b(@Nullable String str, int i, int i2) {
        return (str == null || str.length() == 0 || str.equals(com.ironsource.mediationsdk.j.f)) ? LevelPlayAdSize.Companion.createCustomSize(i, i2) : str.equals(com.ironsource.mediationsdk.j.c) ? LevelPlayAdSize.MEDIUM_RECTANGLE : LevelPlayAdSize.Companion.createAdSize$mediationsdk_release(str);
    }

    @NotNull
    public final JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        try {
            ConcurrentHashMap<String, AdapterBaseWrapper> g = com.ironsource.mediationsdk.c.d().g();
            g.getClass();
            for (Map.Entry<String, AdapterBaseWrapper> entry : g.entrySet()) {
                if (entry.getValue().getAdapterBaseInterface() != null) {
                    Uf uf = a;
                    String key = entry.getKey();
                    key.getClass();
                    String a2 = uf.a(key);
                    AdapterBaseInterface adapterBaseInterface = entry.getValue().getAdapterBaseInterface();
                    adapterBaseInterface.getClass();
                    String adapterVersion = adapterBaseInterface.getAdapterVersion();
                    adapterVersion.getClass();
                    jSONObject.putOpt(a2, uf.a(adapterVersion, adapterBaseInterface.getNetworkSDKVersion()));
                }
            }
            return jSONObject;
        } catch (Exception e) {
            C4157k4.d().a(e);
            return jSONObject;
        }
    }

    @NotNull
    public final ConcurrentHashMap<String, List<String>> d() {
        ConcurrentHashMap<String, List<String>> concurrentHashMap = new ConcurrentHashMap<>();
        concurrentHashMap.putAll(com.ironsource.mediationsdk.c.d().f());
        concurrentHashMap.putAll(C4181la.b().c());
        return concurrentHashMap;
    }

    public final void e() {
        com.ironsource.mediationsdk.p.g().G();
    }

    @NotNull
    public final JSONObject b() {
        JSONObject b = I6.a().b();
        b.getClass();
        return b;
    }

    @Nullable
    public final String b(@NotNull Context context) {
        context.getClass();
        return C1.b(context, c(context));
    }

    public final void b(@NotNull String str) {
        str.getClass();
        IronLog.INTERNAL.error(str);
    }

    @NotNull
    public final JSONObject a(boolean z) {
        JSONObject b = IronSourceUtils.b(z);
        b.getClass();
        return b;
    }

    public final void a(@Nullable InterfaceC4021cb interfaceC4021cb) {
        C3957a8.a().b(interfaceC4021cb);
    }

    public final void a(@Nullable InterfaceC4236ob interfaceC4236ob) {
        Ld.a().b(interfaceC4236ob);
    }

    public final void a(@Nullable Aa aa) {
        C4352v2.a().b(aa);
    }

    public final int a() {
        return Ib.v.d().a().c();
    }

    @NotNull
    public final String a(@Nullable C4077fd c4077fd) {
        String c;
        return (c4077fd == null || (c = c4077fd.c()) == null) ? new String() : c;
    }

    @NotNull
    public final String a(@NotNull NetworkSettings networkSettings) {
        networkSettings.getClass();
        String providerDefaultInstance = networkSettings.getProviderDefaultInstance();
        return providerDefaultInstance == null ? new String() : providerDefaultInstance;
    }

    public final boolean a(@NotNull NetworkSettings networkSettings, @NotNull IronSource.a aVar) {
        networkSettings.getClass();
        aVar.getClass();
        return networkSettings.isBidder(aVar);
    }

    @NotNull
    public final ISBannerSize a(@Nullable String str, int i, int i2) {
        return new ISBannerSize(str, i, i2);
    }

    @NotNull
    public final com.ironsource.mediationsdk.o a(@NotNull Activity activity, @NotNull ISBannerSize iSBannerSize) {
        activity.getClass();
        iSBannerSize.getClass();
        com.ironsource.mediationsdk.o b = com.ironsource.mediationsdk.p.g().b(activity, iSBannerSize);
        b.getClass();
        return b;
    }

    public final void a(@NotNull EnumC4373w5 enumC4373w5, @NotNull JSONObject jSONObject) {
        enumC4373w5.getClass();
        jSONObject.getClass();
        C4078fe.i().a(new C4355v5(enumC4373w5, jSONObject));
    }

    private final JSONObject a(String str, String str2) {
        return new JSONObject(tub.h(new Pair(Nf.b, str), new Pair("sdkVersion", str2)));
    }

    @Nullable
    public final String c(@NotNull Context context) {
        context.getClass();
        return C1.g(context);
    }

    @Nullable
    public final String a(@NotNull Context context) {
        context.getClass();
        return C1.a(context, c(context));
    }
}
