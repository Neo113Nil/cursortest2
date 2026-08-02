package org.chromium.net.impl;

import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes10.dex */
public final class h0 extends org.chromium.net.A {

    /* renamed from: a, reason: collision with root package name */
    private final org.chromium.net.A f78931a;

    public h0(org.chromium.net.A a11) {
        this.f78931a = a11;
    }

    @Override // org.chromium.net.A
    public final long c() throws IOException {
        return this.f78931a.c();
    }

    @Override // org.chromium.net.A, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f78931a.close();
    }

    @Override // org.chromium.net.A
    public final void d(org.chromium.net.h hVar, ByteBuffer byteBuffer) throws IOException {
        this.f78931a.d(hVar, byteBuffer);
    }

    @Override // org.chromium.net.A
    public final void j(org.chromium.net.h hVar) throws IOException {
        this.f78931a.j(hVar);
    }
}
