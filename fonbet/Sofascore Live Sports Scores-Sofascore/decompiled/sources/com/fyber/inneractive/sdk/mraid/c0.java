package com.fyber.inneractive.sdk.mraid;

import defpackage.fc6;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class c0 extends y {
    public final int a;
    public final int b;

    public c0(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // com.fyber.inneractive.sdk.mraid.y
    public final String a() {
        StringBuilder sb = new StringBuilder("screenSize: { width: ");
        sb.append(this.a);
        sb.append(", height: ");
        return fc6.h(this.b, " }", sb);
    }
}
