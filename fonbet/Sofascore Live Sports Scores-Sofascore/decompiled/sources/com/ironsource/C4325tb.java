package com.ironsource;

import android.content.Context;
import com.ironsource.C4270q9;
import com.ironsource.Te;
import com.ironsource.U3;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.mediation.LevelPlay;
import defpackage.a70;
import defpackage.xka;
import java.util.ArrayList;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.tb, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4325tb {

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.tb$a */
    public static final class a extends xka implements Function1<Map.Entry<? extends String, ? extends Boolean>, CharSequence> {
        public static final a a = new a();

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(@NotNull Map.Entry<String, Boolean> entry) {
            entry.getClass();
            return entry.getKey() + U3.j.b + entry.getValue().booleanValue();
        }
    }

    public final void a(@NotNull String str, @NotNull LevelPlay.AdFormat adFormat, int i, @Nullable String str2) {
        str.getClass();
        adFormat.getClass();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(IronSourceConstants.EVENTS_ERROR_CODE, i);
        jSONObject.putOpt("reason", str2);
        jSONObject.put("placement", str);
        jSONObject.put(Ta.f, adFormat.getValue());
        jSONObject.put("adf", Gf.c(com.unity3d.mediation.a.a(adFormat)));
        jSONObject.put("isMultipleAdUnits", 1);
        Gf.a(EnumC4373w5.TROUBLESHOOTING_PLACEMENT_CAPPING_PARSE_ERROR, jSONObject);
    }

    public final void b(@NotNull String str, int i, @Nullable String str2) {
        str.getClass();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(IronSourceConstants.EVENTS_ERROR_CODE, i);
        jSONObject.putOpt("reason", str2);
        jSONObject.put("mediationAdUnitId", str);
        jSONObject.put("isMultipleAdUnits", 1);
        Gf.a(EnumC4373w5.TROUBLESHOOTING_AD_UNIT_REWARD_PARSE_ERROR, jSONObject);
    }

    public final void c(boolean z) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(IronSourceConstants.EVENTS_EXT1, String.valueOf(z));
        Gf.a(EnumC4373w5.GDPR_CONSENT, jSONObject);
    }

    @NotNull
    public final C4221ne b(@NotNull C4221ne c4221ne) {
        c4221ne.getClass();
        return c4221ne.c() == 2080 ? new C4221ne(c4221ne.c(), "serverResponseIsNotValid") : c4221ne;
    }

    public final void b(@NotNull Runnable runnable) {
        runnable.getClass();
        IronSourceThreadManager.postOnUiThreadTask$default(IronSourceThreadManager.INSTANCE, runnable, 0L, 2, null);
    }

    public final void b(boolean z) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(IronSourceConstants.EVENTS_EXT1, String.valueOf(z));
        Gf.a(EnumC4373w5.SET_COPPA, jSONObject);
    }

    public final void b() {
        Gf.a(EnumC4373w5.TROUBLESHOOTING_SET_COPPA_AFTER_INIT, new JSONObject());
    }

    public static /* synthetic */ void a(C4325tb c4325tb, Runnable runnable, long j, int i, Object obj) {
        if (obj != null) {
            a70.m("Super calls with default arguments not supported in this target, function: postOnUIThread");
            return;
        }
        if ((i & 2) != 0) {
            j = 0;
        }
        c4325tb.a(runnable, j);
    }

    public final void a(@NotNull Runnable runnable, long j) {
        runnable.getClass();
        IronSourceThreadManager.INSTANCE.postOnUiThreadTask(com.ironsource.environment.thread.a.a.a(runnable), j);
    }

    public final void a(@NotNull Context context) {
        context.getClass();
        C4270q9.a aVar = C4270q9.a;
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        aVar.a(applicationContext);
    }

    @NotNull
    public final IronSource.a[] a(@NotNull LevelPlay.AdFormat... adFormatArr) {
        adFormatArr.getClass();
        ArrayList arrayList = new ArrayList();
        for (LevelPlay.AdFormat adFormat : adFormatArr) {
            arrayList.add(a(adFormat));
        }
        return (IronSource.a[]) arrayList.toArray(new IronSource.a[0]);
    }

    @NotNull
    public final IronSource.a a(@NotNull LevelPlay.AdFormat adFormat) {
        adFormat.getClass();
        return com.unity3d.mediation.a.a(adFormat);
    }

    public final boolean a(@NotNull AdapterBaseInterface adapterBaseInterface, @NotNull IronSource.a aVar, @NotNull String str) {
        adapterBaseInterface.getClass();
        aVar.getClass();
        str.getClass();
        return Gf.a(adapterBaseInterface, aVar, str);
    }

    public static /* synthetic */ void a(C4325tb c4325tb, long j, Te.a aVar, long j2, JSONObject jSONObject, int i, Object obj) {
        if (obj != null) {
            a70.m("Super calls with default arguments not supported in this target, function: sendInitSuccessEvent");
            return;
        }
        if ((i & 8) != 0) {
            jSONObject = new JSONObject();
        }
        c4325tb.a(j, aVar, j2, jSONObject);
    }

    public final void a(long j, @NotNull Te.a aVar, long j2, @NotNull JSONObject jSONObject) {
        aVar.getClass();
        jSONObject.getClass();
        try {
            jSONObject.put("isMultipleAdUnits", 1);
            jSONObject.put(IronSourceConstants.EVENTS_DURATION, j);
            String b = aVar.b();
            b.getClass();
            jSONObject.put(IronSourceConstants.EVENTS_EXT1, a(b, j2));
        } catch (Exception e) {
            C4157k4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
        Gf.a(EnumC4373w5.SDK_INIT_SUCCESS, jSONObject);
    }

    @NotNull
    public final C4221ne a(@NotNull C4221ne c4221ne) {
        c4221ne.getClass();
        int c = c4221ne.c();
        if (c != 2070) {
            return c != 2110 ? c4221ne : new C4221ne(c4221ne.c(), IronSourceConstants.FALSE_AVAILABILITY_REASON_BAD_REQUEST);
        }
        return new C4221ne(c4221ne.c(), "noServerResponse");
    }

    private final String a(String str, long j) {
        return "responseOrigin=" + str + ";delayTimeAfterInitProcess=" + j;
    }

    public static /* synthetic */ void a(C4325tb c4325tb, C4221ne c4221ne, long j, JSONObject jSONObject, int i, Object obj) {
        if (obj != null) {
            a70.m("Super calls with default arguments not supported in this target, function: sendInitFailedEvent");
            return;
        }
        if ((i & 4) != 0) {
            jSONObject = new JSONObject();
        }
        c4325tb.a(c4221ne, j, jSONObject);
    }

    public final void a(@NotNull C4221ne c4221ne, long j, @NotNull JSONObject jSONObject) {
        c4221ne.getClass();
        jSONObject.getClass();
        try {
            jSONObject.put(IronSourceConstants.EVENTS_ERROR_CODE, c4221ne.c());
            jSONObject.put("reason", c4221ne.d());
            jSONObject.put("isMultipleAdUnits", 1);
            jSONObject.put(IronSourceConstants.EVENTS_DURATION, j);
        } catch (Exception e) {
            C4157k4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
        Gf.a(EnumC4373w5.SDK_INIT_FAILED, jSONObject);
    }

    public final void a(@NotNull Runnable runnable) {
        runnable.getClass();
        IronSourceThreadManager.INSTANCE.getLevelPlayThread().a(runnable);
    }

    public final void a(@NotNull String str, int i, @Nullable String str2) {
        str.getClass();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(IronSourceConstants.EVENTS_ERROR_CODE, i);
        jSONObject.putOpt("reason", str2);
        jSONObject.put("mediationAdUnitId", str);
        jSONObject.put("isMultipleAdUnits", 1);
        Gf.a(EnumC4373w5.TROUBLESHOOTING_AD_UNIT_CAPPING_PARSE_ERROR, jSONObject);
    }

    public final void a(@NotNull Map<String, Boolean> map) {
        map.getClass();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(IronSourceConstants.EVENTS_EXT1, CollectionsKt.f0(map.entrySet(), ";", null, null, a.a, 30));
        Gf.a(EnumC4373w5.GDPR_CONSENTS, jSONObject);
    }

    public final void a(boolean z) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(IronSourceConstants.EVENTS_EXT1, String.valueOf(z));
        Gf.a(EnumC4373w5.SET_CCPA, jSONObject);
    }

    public final boolean a() {
        return Ib.v.d().f().c();
    }
}
