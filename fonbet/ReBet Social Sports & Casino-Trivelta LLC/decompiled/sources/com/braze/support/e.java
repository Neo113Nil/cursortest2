package com.braze.support;

import com.braze.models.FeatureFlag;
import com.braze.support.BrazeLogger;
import com.facebook.react.devsupport.StackTraceHelper;
import com.facebook.react.uimanager.ViewProps;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final e f29482a = new e();

    public static final String b(JSONObject jSONObject) {
        return "Failed to deserialize feature flag Json: " + jSONObject;
    }

    public final FeatureFlag a(final JSONObject featureFlagObject) {
        Intrinsics.checkNotNullParameter(featureFlagObject, "featureFlagObject");
        try {
            String string = featureFlagObject.getString(StackTraceHelper.ID_KEY);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            boolean z10 = featureFlagObject.getBoolean(ViewProps.ENABLED);
            JSONObject optJSONObject = featureFlagObject.optJSONObject("properties");
            if (optJSONObject == null) {
                optJSONObject = new JSONObject();
            }
            return new FeatureFlag(string, z10, optJSONObject, JsonUtils.getOptionalString(featureFlagObject, "fts"));
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29470E, (Throwable) e10, false, new Function0() { // from class: Y3.k1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.support.e.b(featureFlagObject);
                }
            }, 4, (Object) null);
            return null;
        }
    }
}
