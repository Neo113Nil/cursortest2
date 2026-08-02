package com.ironsource;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: com.ironsource.j0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C2480j0 {
    private final ArrayList<String> a = new ArrayList<>(new C2463i0().a());
    private final O6 b = new O6();

    public final JSONObject a() {
        JSONObject a = this.b.a(this.a);
        Intrinsics.checkNotNullExpressionValue(a, "mGlobalDataReader.getDataByKeys(mAdQualityKeyList)");
        return a;
    }
}
