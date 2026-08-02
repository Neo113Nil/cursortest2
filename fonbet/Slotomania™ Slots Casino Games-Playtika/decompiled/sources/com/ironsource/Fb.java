package com.ironsource;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class Fb {
    private final int a;
    private final int b;
    private final int c;
    private final boolean d;

    public Fb(JSONObject applicationLogger) {
        Intrinsics.checkNotNullParameter(applicationLogger, "applicationLogger");
        this.a = applicationLogger.optInt(Gb.a, 3);
        this.b = applicationLogger.optInt(Gb.b, 3);
        this.c = applicationLogger.optInt("console", 3);
        this.d = applicationLogger.optBoolean(Gb.d, false);
    }

    public final int a() {
        return this.c;
    }

    public final int b() {
        return this.b;
    }

    public final int c() {
        return this.a;
    }

    public final boolean d() {
        return this.d;
    }
}
