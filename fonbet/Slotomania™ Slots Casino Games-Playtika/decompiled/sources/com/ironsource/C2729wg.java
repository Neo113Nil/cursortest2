package com.ironsource;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.wg, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2729wg implements W5 {
    private final C2368cd a;
    private final String b;

    public C2729wg(C2368cd folderRootUrl, String version) {
        Intrinsics.checkNotNullParameter(folderRootUrl, "folderRootUrl");
        Intrinsics.checkNotNullParameter(version, "version");
        this.a = folderRootUrl;
        this.b = version;
    }

    public final String a() {
        return this.b;
    }

    @Override // com.ironsource.W5
    public String value() {
        return this.a.a() + "/versions/" + this.b + "/mobileController.html";
    }
}
