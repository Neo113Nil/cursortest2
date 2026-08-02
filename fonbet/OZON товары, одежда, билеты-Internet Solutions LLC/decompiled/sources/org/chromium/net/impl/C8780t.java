package org.chromium.net.impl;

import android.net.http.UploadDataProvider;
import android.net.http.UploadDataSink;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Objects;

/* renamed from: org.chromium.net.impl.t, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C8780t extends UploadDataProvider {

    /* renamed from: a, reason: collision with root package name */
    private final org.chromium.net.A f78941a;

    public C8780t(org.chromium.net.A a11) {
        Objects.requireNonNull(a11, "Invalid UploadDataProvider.");
        this.f78941a = a11;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f78941a.close();
    }

    public final long getLength() throws IOException {
        return this.f78941a.c();
    }

    public final void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) throws IOException {
        this.f78941a.d(new C8781u(uploadDataSink), byteBuffer);
    }

    public final void rewind(UploadDataSink uploadDataSink) throws IOException {
        this.f78941a.j(new C8781u(uploadDataSink));
    }
}
