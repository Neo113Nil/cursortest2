package com.mbridge.msdk.thrid.okhttp;

import defpackage.yhk;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public abstract class b0 implements Closeable {

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class a extends b0 {
        final /* synthetic */ u a;
        final /* synthetic */ long b;
        final /* synthetic */ com.mbridge.msdk.thrid.okio.e c;

        public a(u uVar, long j, com.mbridge.msdk.thrid.okio.e eVar) {
            this.a = uVar;
            this.b = j;
            this.c = eVar;
        }

        @Override // com.mbridge.msdk.thrid.okhttp.b0
        public long k() {
            return this.b;
        }

        @Override // com.mbridge.msdk.thrid.okhttp.b0
        public u l() {
            return this.a;
        }

        @Override // com.mbridge.msdk.thrid.okhttp.b0
        public com.mbridge.msdk.thrid.okio.e m() {
            return this.c;
        }
    }

    public static b0 a(u uVar, byte[] bArr) {
        return a(uVar, bArr.length, new com.mbridge.msdk.thrid.okio.c().write(bArr));
    }

    private Charset h() {
        u l = l();
        return l != null ? l.a(com.mbridge.msdk.thrid.okhttp.internal.c.j) : com.mbridge.msdk.thrid.okhttp.internal.c.j;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        com.mbridge.msdk.thrid.okhttp.internal.c.a(m());
    }

    public final InputStream d() {
        return m().j();
    }

    public abstract long k();

    public abstract u l();

    public abstract com.mbridge.msdk.thrid.okio.e m();

    public final String n() throws IOException {
        com.mbridge.msdk.thrid.okio.e m = m();
        try {
            return m.a(com.mbridge.msdk.thrid.okhttp.internal.c.a(m, h()));
        } finally {
            com.mbridge.msdk.thrid.okhttp.internal.c.a(m);
        }
    }

    public static b0 a(u uVar, long j, com.mbridge.msdk.thrid.okio.e eVar) {
        if (eVar != null) {
            return new a(uVar, j, eVar);
        }
        yhk.s("source == null");
        return null;
    }
}
