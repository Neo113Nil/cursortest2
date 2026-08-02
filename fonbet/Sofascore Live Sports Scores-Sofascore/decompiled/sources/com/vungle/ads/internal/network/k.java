package com.vungle.ads.internal.network;

import defpackage.i2g;
import defpackage.l62;
import defpackage.zdc;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class k extends i2g {
    public final zdc a;
    public final long b;

    public k(zdc zdcVar, long j) {
        this.a = zdcVar;
        this.b = j;
    }

    @Override // defpackage.i2g
    public final long contentLength() {
        return this.b;
    }

    @Override // defpackage.i2g
    public final zdc contentType() {
        return this.a;
    }

    @Override // defpackage.i2g
    public final l62 source() {
        throw new IllegalStateException("Cannot read raw response body of a converted body.");
    }
}
