package io.sentry;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.sentry.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7223y extends AbstractC7203t {

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final A1 f68670e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final InterfaceC7126b0 f68671f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final ILogger f68672g;

    public C7223y(@NotNull A1 a12, @NotNull InterfaceC7126b0 interfaceC7126b0, @NotNull ILogger iLogger, long j11, int i11) {
        super(a12, iLogger, j11, i11);
        io.sentry.util.p.b(a12, "Scopes are required.");
        this.f68670e = a12;
        io.sentry.util.p.b(interfaceC7126b0, "Serializer is required.");
        this.f68671f = interfaceC7126b0;
        io.sentry.util.p.b(iLogger, "Logger is required.");
        this.f68672g = iLogger;
    }

    public static void d(C7223y c7223y, File file, io.sentry.hints.l lVar) {
        c7223y.getClass();
        boolean c11 = lVar.c();
        ILogger iLogger = c7223y.f68672g;
        if (c11) {
            iLogger.c(I2.INFO, "File not deleted since retry was marked. %s.", file.getAbsolutePath());
            return;
        }
        try {
            if (!file.delete()) {
                iLogger.c(I2.ERROR, "Failed to delete '%s' %s", file.getAbsolutePath(), "after trying to capture it");
            }
        } catch (Throwable th2) {
            iLogger.b(I2.ERROR, th2, "Failed to delete '%s' %s", file.getAbsolutePath(), "after trying to capture it");
        }
        iLogger.c(I2.DEBUG, "Deleted file %s.", file.getAbsolutePath());
    }

    @Override // io.sentry.AbstractC7203t
    protected final boolean a(@NotNull String str) {
        return str.endsWith(".envelope");
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0140, code lost:
    
        if (r2 != null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0117, code lost:
    
        d(r8, r9, (io.sentry.hints.l) r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0163, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0160, code lost:
    
        if (r2 != null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0115, code lost:
    
        if (r2 != null) goto L56;
     */
    @Override // io.sentry.AbstractC7203t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final void c(@NotNull File file, @NotNull E e11) {
        Object d11;
        boolean isFile = file.isFile();
        ILogger iLogger = this.f68672g;
        if (!isFile) {
            iLogger.c(I2.DEBUG, "'%s' is not a file.", file.getAbsolutePath());
            return;
        }
        if (!file.getName().endsWith(".envelope")) {
            iLogger.c(I2.DEBUG, "File '%s' doesn't match extension expected.", file.getAbsolutePath());
            return;
        }
        if (!file.getParentFile().canWrite()) {
            iLogger.c(I2.WARNING, "File '%s' cannot be deleted so it will not be processed.", file.getAbsolutePath());
            return;
        }
        try {
            try {
                try {
                    BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                    try {
                        V1 d12 = this.f68671f.d(bufferedInputStream);
                        if (d12 == null) {
                            iLogger.c(I2.ERROR, "Failed to deserialize cached envelope %s", file.getAbsolutePath());
                        } else {
                            this.f68670e.k(d12, e11);
                        }
                        Object d13 = e11.d("sentry:typeCheckHint");
                        if (!io.sentry.hints.i.class.isInstance(e11.d("sentry:typeCheckHint")) || d13 == null) {
                            io.sentry.util.n.a(io.sentry.hints.i.class, d13, iLogger);
                        } else if (!((io.sentry.hints.i) d13).h()) {
                            iLogger.c(I2.WARNING, "Timed out waiting for envelope submission.", new Object[0]);
                        }
                        bufferedInputStream.close();
                        Object d14 = e11.d("sentry:typeCheckHint");
                        if (!io.sentry.hints.l.class.isInstance(e11.d("sentry:typeCheckHint")) || d14 == null) {
                            io.sentry.util.n.a(io.sentry.hints.l.class, d14, iLogger);
                        } else {
                            d(this, file, (io.sentry.hints.l) d14);
                        }
                    } catch (Throwable th2) {
                        try {
                            bufferedInputStream.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                } catch (Throwable th4) {
                    Object d15 = e11.d("sentry:typeCheckHint");
                    if (!io.sentry.hints.l.class.isInstance(e11.d("sentry:typeCheckHint")) || d15 == null) {
                        io.sentry.util.n.a(io.sentry.hints.l.class, d15, iLogger);
                    } else {
                        d(this, file, (io.sentry.hints.l) d15);
                    }
                    throw th4;
                }
            } catch (IOException e12) {
                iLogger.b(I2.ERROR, e12, "I/O on file '%s' failed.", file.getAbsolutePath());
                d11 = e11.d("sentry:typeCheckHint");
                if (io.sentry.hints.l.class.isInstance(e11.d("sentry:typeCheckHint"))) {
                }
                io.sentry.util.n.a(io.sentry.hints.l.class, d11, iLogger);
            }
        } catch (FileNotFoundException e13) {
            iLogger.b(I2.ERROR, e13, "File '%s' cannot be found.", file.getAbsolutePath());
            d11 = e11.d("sentry:typeCheckHint");
            if (io.sentry.hints.l.class.isInstance(e11.d("sentry:typeCheckHint"))) {
            }
            io.sentry.util.n.a(io.sentry.hints.l.class, d11, iLogger);
        } catch (Throwable th5) {
            iLogger.b(I2.ERROR, th5, "Failed to capture cached envelope %s", file.getAbsolutePath());
            Object d16 = e11.d("sentry:typeCheckHint");
            if (!io.sentry.hints.l.class.isInstance(e11.d("sentry:typeCheckHint")) || d16 == null) {
                io.sentry.util.n.a(io.sentry.hints.l.class, d16, iLogger);
            } else {
                ((io.sentry.hints.l) d16).e(false);
                iLogger.b(I2.INFO, th5, "File '%s' won't retry.", file.getAbsolutePath());
            }
            d11 = e11.d("sentry:typeCheckHint");
            if (io.sentry.hints.l.class.isInstance(e11.d("sentry:typeCheckHint"))) {
            }
            io.sentry.util.n.a(io.sentry.hints.l.class, d11, iLogger);
        }
    }
}
