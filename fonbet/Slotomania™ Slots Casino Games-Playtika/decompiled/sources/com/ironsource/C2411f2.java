package com.ironsource;

import com.ironsource.M6;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: com.ironsource.f2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C2411f2 {
    private final M6.a a;
    private final ArrayList<String> b = new ArrayList<>(new C2375d2().a());
    private final O6 c = new O6();

    public C2411f2(M6.a aVar) {
        this.a = aVar;
    }

    public final JSONObject a() {
        M6.a aVar = this.a;
        JSONObject a = aVar != null ? this.c.a(this.b, aVar) : null;
        if (a == null) {
            a = this.c.a(this.b);
            Intrinsics.checkNotNullExpressionValue(a, "mGlobalDataReader.getDataByKeys(mAuctionKeyList)");
        }
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
