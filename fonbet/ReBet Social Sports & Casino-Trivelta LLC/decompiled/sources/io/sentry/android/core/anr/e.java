package io.sentry.android.core.anr;

import io.sentry.EnumC4788n3;
import io.sentry.F3;
import io.sentry.ILogger;
import io.sentry.cache.tape.c;
import io.sentry.cache.tape.d;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes3.dex */
public class e implements AutoCloseable {

    /* renamed from: a, reason: collision with root package name */
    public final io.sentry.cache.tape.c f50908a;

    public class a implements c.a {
        public a() {
        }

        @Override // io.sentry.cache.tape.c.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public i b(byte[] bArr) {
            return i.b(new DataInputStream(new ByteArrayInputStream(bArr)));
        }

        @Override // io.sentry.cache.tape.c.a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(i iVar, OutputStream outputStream) {
            DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
            try {
                iVar.c(dataOutputStream);
                dataOutputStream.flush();
                outputStream.flush();
                dataOutputStream.close();
            } catch (Throwable th2) {
                try {
                    dataOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }

    public e(F3 f32, File file) {
        io.sentry.cache.tape.d dVar;
        ILogger logger = f32.getLogger();
        try {
            try {
                dVar = new d.a(file).b(120).a();
            } catch (IOException unused) {
                if (!file.delete()) {
                    throw new IOException("Could not delete file");
                }
                dVar = new d.a(file).b(120).a();
            }
        } catch (IOException e10) {
            logger.b(EnumC4788n3.ERROR, "Failed to create stacktrace queue", e10);
            dVar = null;
        }
        if (dVar == null) {
            this.f50908a = io.sentry.cache.tape.c.A0();
        } else {
            this.f50908a = io.sentry.cache.tape.c.B(dVar, new a());
        }
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        this.f50908a.close();
    }

    public void d(i iVar) {
        this.f50908a.k(iVar);
    }

    public void k() {
        this.f50908a.clear();
    }

    public d r() {
        return new d(this.f50908a.r());
    }
}
