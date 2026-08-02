package com.mbridge.msdk.thrid.okio;

import defpackage.a70;
import java.io.IOException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public abstract class g implements r {
    private final r a;

    public g(r rVar) {
        if (rVar != null) {
            this.a = rVar;
        } else {
            a70.p("delegate == null");
            throw null;
        }
    }

    @Override // com.mbridge.msdk.thrid.okio.r
    public void a(c cVar, long j) throws IOException {
        this.a.a(cVar, j);
    }

    @Override // com.mbridge.msdk.thrid.okio.r
    public t b() {
        return this.a.b();
    }

    @Override // com.mbridge.msdk.thrid.okio.r, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.a.close();
    }

    @Override // com.mbridge.msdk.thrid.okio.r, java.io.Flushable
    public void flush() throws IOException {
        this.a.flush();
    }

    public String toString() {
        return getClass().getSimpleName() + "(" + this.a.toString() + ")";
    }
}
