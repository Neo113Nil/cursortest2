package com.braze.storage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.enums.DeviceKey;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import com.braze.support.StringUtils;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class v0 extends b {
    public static final u0 f = new u0();
    public final BrazeConfigurationProvider b;
    public final SharedPreferences c;
    public final SharedPreferences d;
    public com.braze.models.outgoing.h e;

    public v0(Context context, String str, String str2) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.b = new BrazeConfigurationProvider(context);
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.appboy.storage.device_cache.v3" + StringUtils.getCacheFileSuffix(context, str, str2), 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getSharedPreferences(...)");
        this.c = sharedPreferences;
        SharedPreferences sharedPreferences2 = context.getSharedPreferences("com.braze.storage.device_cache.metadata" + StringUtils.getCacheFileSuffix(context, str, str2), 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences2, "getSharedPreferences(...)");
        this.d = sharedPreferences2;
    }

    public static final String a(boolean z, boolean z2) {
        return "Exporting the full device due to either: shouldShouldFullDeviceOnNextExport: " + z + ", shouldReportPushPermissionsAsGranted: " + z2;
    }

    public static final String d() {
        return "Caught exception confirming and unlocking device cache.";
    }

    public static final String f() {
        return "Sending full device on next export but keeping cache intact.";
    }

    public static final String h() {
        return "Caught exception confirming and unlocking JSON objects.";
    }

    public static final String i() {
        return "Failed to generate diff between the cached and live device. Returning the live device.";
    }

    public static final String j() {
        return "Remote Notification Enabled changed to true. Updating user subscription.";
    }

    public final void e() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, new Function0() { // from class: com.braze.storage.v0$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return v0.f();
            }
        }, 6, (Object) null);
        this.d.edit().putBoolean("sfone", true).apply();
    }

    @Override // com.braze.storage.b
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final com.braze.models.outgoing.h c() {
        JSONObject jsonObject;
        String str = "{}";
        JSONObject jSONObject = new JSONObject();
        com.braze.models.outgoing.h hVar = this.e;
        JSONObject jsonKey = hVar != null ? hVar.getJsonKey() : new JSONObject();
        try {
            String string = this.c.getString("cached_device", "{}");
            if (string != null) {
                str = string;
            }
            jSONObject = new JSONObject(str);
        } catch (JSONException e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, new Function0() { // from class: com.braze.storage.v0$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return v0.h();
                }
            }, 4, (Object) null);
        }
        u0 u0Var = f;
        SharedPreferences sharedPreferences = this.d;
        int i = Build.VERSION.SDK_INT;
        final boolean a2 = u0Var.a(jSONObject, jsonKey, sharedPreferences.getInt("ldov", i), i);
        final boolean z = this.d.getBoolean("sfone", false);
        if (z || a2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.storage.v0$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return v0.a(z, a2);
                }
            }, 7, (Object) null);
            jsonObject = u0Var.a(new JSONObject(), jsonKey);
        } else {
            jsonObject = u0Var.a(jSONObject, jsonKey);
        }
        if (jsonObject == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.storage.v0$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return v0.i();
                }
            }, 7, (Object) null);
            return this.e;
        }
        BrazeConfigurationProvider configurationProvider = this.b;
        Intrinsics.checkNotNullParameter(configurationProvider, "configurationProvider");
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        Intrinsics.checkNotNullParameter(configurationProvider, "configurationProvider");
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        Boolean bool = null;
        Boolean bool2 = null;
        String str8 = null;
        Boolean bool3 = null;
        for (DeviceKey deviceKey : DeviceKey.getEntries()) {
            String key = deviceKey.getKey();
            switch (com.braze.models.outgoing.f.f641a[deviceKey.ordinal()]) {
                case 1:
                    str7 = JsonUtils.getOptionalString(jsonObject, key);
                    break;
                case 2:
                    str3 = JsonUtils.getOptionalString(jsonObject, key);
                    break;
                case 3:
                    str2 = JsonUtils.getOptionalString(jsonObject, key);
                    break;
                case 4:
                    str6 = JsonUtils.getOptionalString(jsonObject, key);
                    break;
                case 5:
                    String optionalString = JsonUtils.getOptionalString(jsonObject, key);
                    if (optionalString != null && !StringsKt.isBlank(optionalString)) {
                        str4 = optionalString;
                        break;
                    }
                    break;
                case 6:
                    str5 = JsonUtils.getOptionalString(jsonObject, key);
                    break;
                case 7:
                    if (jsonObject.has(key)) {
                        bool = Boolean.valueOf(jsonObject.optBoolean(key, true));
                    }
                    Unit unit = Unit.INSTANCE;
                    break;
                case 8:
                    if (jsonObject.has(key)) {
                        bool2 = Boolean.valueOf(jsonObject.optBoolean(key, false));
                    }
                    Unit unit2 = Unit.INSTANCE;
                    break;
                case 9:
                    str8 = JsonUtils.getOptionalString(jsonObject, key);
                    break;
                case 10:
                    if (jsonObject.has(key)) {
                        bool3 = Boolean.valueOf(jsonObject.optBoolean(key));
                    }
                    Unit unit3 = Unit.INSTANCE;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
        com.braze.models.outgoing.h hVar2 = new com.braze.models.outgoing.h(configurationProvider, str2, str3, str4, str5, str6, str7, bool, bool2, str8, bool3);
        if (a2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, new Function0() { // from class: com.braze.storage.v0$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return v0.j();
                }
            }, 6, (Object) null);
            hVar2.l = true;
        }
        return hVar2;
    }

    @Override // com.braze.storage.b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void c(com.braze.models.outgoing.h outboundObject, boolean z) {
        String str = "{}";
        Intrinsics.checkNotNullParameter(outboundObject, "outboundObject");
        if (z) {
            try {
                String string = this.c.getString("cached_device", "{}");
                if (string != null) {
                    str = string;
                }
                this.c.edit().putString("cached_device", JsonUtils.mergeJsonObjects(new JSONObject(str), outboundObject.getJsonKey()).toString()).apply();
                this.d.edit().putBoolean("sfone", false).putInt("ldov", Build.VERSION.SDK_INT).apply();
            } catch (JSONException e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, new Function0() { // from class: com.braze.storage.v0$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return v0.d();
                    }
                }, 4, (Object) null);
            }
        }
    }
}
