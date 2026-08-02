package com.ironsource;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class Z8 {
    private final ArrayList<String> a = new ArrayList<>(new Y8().a());
    private final O6 b = new O6();

    public final JSONObject a() {
        JSONObject a = this.b.a(this.a);
        Intrinsics.checkNotNullExpressionValue(a, "mGlobalDataReader.getDat…mInitDeferredDataKeyList)");
        return a;
    }
}
