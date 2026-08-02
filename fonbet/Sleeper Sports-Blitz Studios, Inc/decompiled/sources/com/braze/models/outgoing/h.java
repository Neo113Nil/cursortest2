package com.braze.models.outgoing;

import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.enums.DeviceKey;
import com.braze.models.IPutIntoJson;
import com.braze.models.m;
import com.braze.support.BrazeLogger;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class h implements IPutIntoJson, m {
    public static final g n = new g();

    /* renamed from: a, reason: collision with root package name */
    public final BrazeConfigurationProvider f642a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final Boolean h;
    public final Boolean i;
    public final String j;
    public final Boolean k;
    public boolean l;
    public boolean m;

    public h(BrazeConfigurationProvider configurationProvider, String str, String str2, String str3, String str4, String str5, String str6, Boolean bool, Boolean bool2, String str7, Boolean bool3) {
        Intrinsics.checkNotNullParameter(configurationProvider, "configurationProvider");
        this.f642a = configurationProvider;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = bool;
        this.i = bool2;
        this.j = str7;
        this.k = bool3;
        this.m = true;
    }

    public static final String c() {
        return "Caught exception creating device Json.";
    }

    @Override // com.braze.models.m
    public final boolean isEmpty() {
        return getJsonKey().length() == 0;
    }

    @Override // com.braze.models.IPutIntoJson
    /* renamed from: forJsonPut */
    public final JSONObject getJsonKey() {
        JSONObject jSONObject = new JSONObject();
        try {
            g gVar = n;
            gVar.a(this.f642a, jSONObject, DeviceKey.ANDROID_VERSION, this.b);
            gVar.a(this.f642a, jSONObject, DeviceKey.CARRIER, this.c);
            gVar.a(this.f642a, jSONObject, DeviceKey.BRAND, this.d);
            gVar.a(this.f642a, jSONObject, DeviceKey.MODEL, this.e);
            gVar.a(this.f642a, jSONObject, DeviceKey.LOCALE, this.f);
            if (this.m) {
                gVar.a(this.f642a, jSONObject, DeviceKey.NOTIFICATIONS_ENABLED, this.h);
            }
            gVar.a(this.f642a, jSONObject, DeviceKey.IS_BACKGROUND_RESTRICTED, this.i);
            gVar.a(this.f642a, jSONObject, DeviceKey.GOOGLE_ADVERTISING_ID, this.j);
            Boolean bool = this.k;
            if (bool != null) {
                gVar.a(this.f642a, jSONObject, DeviceKey.AD_TRACKING_ENABLED, bool);
            }
            String str = this.g;
            if (str != null && !StringsKt.isBlank(str)) {
                gVar.a(this.f642a, jSONObject, DeviceKey.TIMEZONE, this.g);
            }
            return jSONObject;
        } catch (JSONException e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, new Function0() { // from class: com.braze.models.outgoing.h$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return h.c();
                }
            }, 4, (Object) null);
            return jSONObject;
        }
    }
}
