package com.ironsource;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2372d implements W5 {
    private final C2368cd a;

    public C2372d(C2368cd folderRootUrl) {
        Intrinsics.checkNotNullParameter(folderRootUrl, "folderRootUrl");
        this.a = folderRootUrl;
    }

    @Override // com.ironsource.W5
    public String value() {
        return this.a.a() + "/abTestMap.json";
    }
}
