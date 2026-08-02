package com.fyber.inneractive.sdk.mraid;

import xsna.h5s;

/* loaded from: classes12.dex */
public final class x extends y {
    public final int a;
    public final int b;

    public x(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // com.fyber.inneractive.sdk.mraid.y
    public final String a() {
        StringBuilder sb = new StringBuilder("adSize: { width: ");
        sb.append(this.a);
        sb.append(", height: ");
        return h5s.c(this.b, " }", sb);
    }
}
