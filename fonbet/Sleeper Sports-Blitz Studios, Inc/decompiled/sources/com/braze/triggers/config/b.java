package com.braze.triggers.config;

import com.braze.support.BrazeLogger;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    public final int f809a;

    public b(JSONObject json) {
        Intrinsics.checkNotNullParameter(json, "json");
        this.f809a = json.optInt("re_eligibility", -1);
    }

    public static final String c() {
        return "Could not convert ReEligibilityConfig to JSON";
    }

    public final Integer d() {
        int i = this.f809a;
        if (i > 0) {
            return Integer.valueOf(i);
        }
        return null;
    }

    public final boolean e() {
        return this.f809a == -1;
    }

    @Override // com.braze.models.IPutIntoJson
    /* renamed from: forJsonPut */
    public final JSONObject getPropertiesJSONObject() {
        try {
            return new JSONObject().put("re_eligibility", this.f809a);
        } catch (JSONException e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, new Function0() { // from class: com.braze.triggers.config.b$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return b.c();
                }
            }, 4, (Object) null);
            return null;
        }
    }
}
