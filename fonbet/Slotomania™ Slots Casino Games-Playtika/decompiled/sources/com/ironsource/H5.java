package com.ironsource;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class H5 {
    private final ArrayList<String> a = new ArrayList<>(new G5().a());
    private final O6 b = new O6();

    public final JSONObject a() {
        JSONObject a = this.b.a(this.a);
        Intrinsics.checkNotNullExpressionValue(a, "mGlobalDataReader.getDataByKeys(mEventsKeyList)");
        return a;
    }
}
