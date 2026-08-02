package com.moloco.sdk.internal.services.events;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class c implements com.moloco.sdk.xenoss.sdkdevkit.android.core.services.c {
    public static final int b = 8;
    public e a;

    public c() {
        e eVar;
        eVar = d.a;
        this.a = eVar;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.core.services.c
    public void a(boolean z, boolean z2, String appForegroundUrl, String appBackgroundUrl) {
        Intrinsics.checkNotNullParameter(appForegroundUrl, "appForegroundUrl");
        Intrinsics.checkNotNullParameter(appBackgroundUrl, "appBackgroundUrl");
        this.a = new e(z, z2, appForegroundUrl, appBackgroundUrl);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.core.services.c
    public boolean b() {
        return this.a.h();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.core.services.c
    public boolean c() {
        return this.a.g();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.core.services.c
    public String d() {
        return this.a.f();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.core.services.c
    public String a() {
        return this.a.e();
    }
}
