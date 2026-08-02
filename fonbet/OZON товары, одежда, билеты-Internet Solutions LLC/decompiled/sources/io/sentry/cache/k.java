package io.sentry.cache;

import io.sentry.C7141f;
import io.sentry.I2;
import io.sentry.W2;
import io.sentry.cache.tape.c;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
final class k implements c.a<C7141f> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ l f67797a;

    k(l lVar) {
        this.f67797a = lVar;
    }

    @Override // io.sentry.cache.tape.c.a
    public final C7141f a(byte[] bArr) throws IOException {
        W2 w22;
        Charset charset;
        W2 w23;
        l lVar = this.f67797a;
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            charset = l.f67798c;
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(byteArrayInputStream, charset));
            try {
                w23 = lVar.f67799a;
                C7141f c7141f = (C7141f) w23.getSerializer().c(bufferedReader, C7141f.class);
                bufferedReader.close();
                return c7141f;
            } finally {
            }
        } catch (Throwable th2) {
            w22 = lVar.f67799a;
            w22.getLogger().b(I2.ERROR, th2, "Error reading entity from scope cache", new Object[0]);
            return null;
        }
    }

    @Override // io.sentry.cache.tape.c.a
    public final void b(C7141f c7141f, OutputStream outputStream) throws IOException {
        Charset charset;
        W2 w22;
        charset = l.f67798c;
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, charset));
        try {
            w22 = this.f67797a.f67799a;
            w22.getSerializer().a(bufferedWriter, c7141f);
            bufferedWriter.close();
        } catch (Throwable th2) {
            try {
                bufferedWriter.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }
}
