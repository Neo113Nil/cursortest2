package com.moloco.sdk.internal.services;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.moloco.sdk.internal.services.j, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C2815j {
    public static final int d = 0;
    public final String a;
    public final String b;
    public final String c;

    public C2815j(String applicationName, String packageName, String version) {
        Intrinsics.checkNotNullParameter(applicationName, "applicationName");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(version, "version");
        this.a = applicationName;
        this.b = packageName;
        this.c = version;
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }
}
