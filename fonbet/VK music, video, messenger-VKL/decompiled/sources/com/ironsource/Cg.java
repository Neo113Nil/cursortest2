package com.ironsource;

import xsna.fw3;

/* loaded from: classes13.dex */
public final class Cg implements Y5 {
    private final C4264cd a;
    private final String b;

    public Cg(C4264cd c4264cd, String str) {
        this.a = c4264cd;
        this.b = str;
    }

    public final String a() {
        return this.b;
    }

    @Override // com.ironsource.Y5
    public String value() {
        return fw3.c(this.a.a(), "/versions/", this.b, "/mobileController.html");
    }
}
