package com.ironsource;

import android.content.Context;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: com.ironsource.ig, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C2478ig {
    private final String[] a = C2461hg.a.a();
    private final O6 b = new O6();

    @Deprecated(level = DeprecationLevel.WARNING, message = "Use the new method getToken(context: Context)")
    public final JSONObject a() {
        JSONObject a = this.b.a(this.a);
        Intrinsics.checkNotNullExpressionValue(a, "mGlobalDataReader.getDataByKeys(mTokenKeyList)");
        return a(a);
    }

    public final JSONObject a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        JSONObject a = this.b.a(context, this.a);
        Intrinsics.checkNotNullExpressionValue(a, "mGlobalDataReader.getDat…s(context, mTokenKeyList)");
        return a(a);
    }

    private final JSONObject a(JSONObject jSONObject) {
        JSONObject b = P6.b(jSONObject.optJSONObject(M6.u));
        if (b != null) {
            jSONObject.put(M6.u, b);
        }
        return jSONObject;
    }
}
