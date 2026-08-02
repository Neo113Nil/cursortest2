package com.fyber.inneractive.sdk.player.exoplayer2.util;

import com.vungle.ads.internal.protos.Sdk;

/* loaded from: classes12.dex */
public final class f {
    public final int a;
    public final int b;
    public final int c;
    public final long d;

    public f(byte[] bArr) {
        m mVar = new m(bArr);
        mVar.b(Sdk.SDKError.Reason.PRIVACY_URL_ERROR_VALUE);
        mVar.a(16);
        mVar.a(16);
        mVar.a(24);
        mVar.a(24);
        this.a = mVar.a(20);
        this.b = mVar.a(3) + 1;
        this.c = mVar.a(5) + 1;
        this.d = ((mVar.a(4) & 15) << 32) | (mVar.a(32) & 4294967295L);
    }
}
