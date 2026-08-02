package com.ironsource;

import java.util.HashSet;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class F1 {
    private final boolean a;
    private final HashSet<String> b;
    private final String c;
    private final String d;
    private final boolean e;
    private final int f;
    private final boolean g;

    public F1(JSONObject applicationCrashReporterSettings) {
        Intrinsics.checkNotNullParameter(applicationCrashReporterSettings, "applicationCrashReporterSettings");
        this.a = applicationCrashReporterSettings.optBoolean("enabled", false);
        List<String> b = C2455ha.b(applicationCrashReporterSettings.optJSONArray(H1.b));
        this.b = b != null ? CollectionsKt.toHashSet(b) : null;
        String optString = applicationCrashReporterSettings.optString(H1.c);
        Intrinsics.checkNotNullExpressionValue(optString, "applicationCrashReporter…(CRASHREPORTER_URL_FIELD)");
        this.c = optString;
        String optString2 = applicationCrashReporterSettings.optString(H1.d);
        Intrinsics.checkNotNullExpressionValue(optString2, "applicationCrashReporter…SHREPORTER_KEYWORD_FIELD)");
        this.d = optString2;
        this.e = applicationCrashReporterSettings.optBoolean(H1.e, false);
        this.f = applicationCrashReporterSettings.optInt("timeout", 5000);
        this.g = applicationCrashReporterSettings.optBoolean(H1.g, false);
    }

    public final int a() {
        return this.f;
    }

    public final HashSet<String> b() {
        return this.b;
    }

    public final String c() {
        return this.d;
    }

    public final String d() {
        return this.c;
    }

    public final boolean e() {
        return this.e;
    }

    public final boolean f() {
        return this.a;
    }

    public final boolean g() {
        return this.g;
    }
}
