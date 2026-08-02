package com.mbridge.msdk.thrid.okhttp.internal.http;

import com.mbridge.msdk.thrid.okhttp.b0;
import com.mbridge.msdk.thrid.okhttp.u;

/* compiled from: RealResponseBody.java */
/* loaded from: classes14.dex */
public final class h extends b0 {
    private final String a;
    private final long b;
    private final com.mbridge.msdk.thrid.okio.e c;

    public h(String str, long j, com.mbridge.msdk.thrid.okio.e eVar) {
        this.a = str;
        this.b = j;
        this.c = eVar;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.b0
    public long k() {
        return this.b;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.b0
    public u l() {
        String str = this.a;
        if (str != null) {
            return u.b(str);
        }
        return null;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.b0
    public com.mbridge.msdk.thrid.okio.e m() {
        return this.c;
    }
}
