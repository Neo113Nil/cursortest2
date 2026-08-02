package com.braze.lrucache;

import java.io.Closeable;
import java.io.InputStream;
import java.nio.charset.Charset;

/* loaded from: classes6.dex */
public final class e implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final InputStream[] f565a;

    public e(InputStream[] inputStreamArr) {
        this.f565a = inputStreamArr;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        for (InputStream inputStream : this.f565a) {
            Charset charset = j.f570a;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (RuntimeException e) {
                    throw e;
                } catch (Exception unused) {
                }
            }
        }
    }
}
