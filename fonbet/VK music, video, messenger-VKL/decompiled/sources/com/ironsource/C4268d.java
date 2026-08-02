package com.ironsource;

import xsna.fo8;

/* renamed from: com.ironsource.d, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4268d implements Y5 {
    private final C4264cd a;

    public C4268d(C4264cd c4264cd) {
        this.a = c4264cd;
    }

    @Override // com.ironsource.Y5
    public String value() {
        return fo8.a(this.a.a(), "/abTestMap.json");
    }
}
