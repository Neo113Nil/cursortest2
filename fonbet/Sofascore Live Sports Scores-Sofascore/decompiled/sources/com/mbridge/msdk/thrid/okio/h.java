package com.mbridge.msdk.thrid.okio;

import defpackage.a70;
import java.io.IOException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public abstract class h implements s {
    private final s a;

    public h(s sVar) {
        if (sVar != null) {
            this.a = sVar;
        } else {
            a70.p("delegate == null");
            throw null;
        }
    }

    @Override // com.mbridge.msdk.thrid.okio.s
    public t b() {
        return this.a.b();
    }

    @Override // com.mbridge.msdk.thrid.okio.s, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.a.close();
    }

    public final s d() {
        return this.a;
    }

    public String toString() {
        return getClass().getSimpleName() + "(" + this.a.toString() + ")";
    }
}
