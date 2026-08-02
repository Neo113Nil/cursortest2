package com.fyber.inneractive.sdk.mraid;

import xsna.h5s;

/* loaded from: classes12.dex */
public final class z extends y {
    public final int a;
    public final int b;
    public final int d = 0;
    public final int c = 0;

    public z(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // com.fyber.inneractive.sdk.mraid.y
    public final String a() {
        StringBuilder sb = new StringBuilder("currentPosition: { x: ");
        sb.append(this.c);
        sb.append(", y: ");
        sb.append(this.d);
        sb.append(", width: ");
        sb.append(this.a);
        sb.append(", height: ");
        return h5s.c(this.b, " }", sb);
    }
}
