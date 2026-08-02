package com.fyber.inneractive.sdk.mraid;

import defpackage.fc6;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
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
        return fc6.h(this.b, " }", sb);
    }
}
