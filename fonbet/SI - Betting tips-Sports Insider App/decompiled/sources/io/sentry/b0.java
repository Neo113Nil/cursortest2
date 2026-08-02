package io.sentry;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b0 extends w {

    /* renamed from: e, reason: collision with root package name */
    public final b1 f16204e;

    /* renamed from: f, reason: collision with root package name */
    public final g1 f16205f;

    /* renamed from: g, reason: collision with root package name */
    public final ILogger f16206g;

    public b0(b1 b1Var, g1 g1Var, ILogger iLogger, long j, int i5) {
        super(b1Var, iLogger, j, i5);
        y4.a.C(b1Var, "Scopes are required.");
        this.f16204e = b1Var;
        y4.a.C(g1Var, "Serializer is required.");
        this.f16205f = g1Var;
        y4.a.C(iLogger, "Logger is required.");
        this.f16206g = iLogger;
    }

    public static void c(b0 b0Var, File file, io.sentry.hints.h hVar) {
        ILogger iLogger = b0Var.f16206g;
        if (hVar.a()) {
            iLogger.h(b5.INFO, "File not deleted since retry was marked. %s.", file.getAbsolutePath());
            return;
        }
        try {
            if (!file.delete()) {
                iLogger.h(b5.ERROR, "Failed to delete '%s' %s", file.getAbsolutePath(), "after trying to capture it");
            }
        } catch (Throwable th2) {
            iLogger.b(b5.ERROR, th2, "Failed to delete '%s' %s", file.getAbsolutePath(), "after trying to capture it");
        }
        iLogger.h(b5.DEBUG, "Deleted file %s.", file.getAbsolutePath());
    }

    @Override // io.sentry.w
    public final boolean a(String str) {
        return str.endsWith(".envelope");
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0141, code lost:
    
        if (r2 != null) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0118, code lost:
    
        c(r10, r11, (io.sentry.hints.h) r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0164, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0161, code lost:
    
        if (r2 != null) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0116, code lost:
    
        if (r2 != null) goto L55;
     */
    @Override // io.sentry.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(File file, h0 h0Var) {
        Object b10;
        boolean isFile = file.isFile();
        ILogger iLogger = this.f16206g;
        if (!isFile) {
            iLogger.h(b5.DEBUG, "'%s' is not a file.", file.getAbsolutePath());
            return;
        }
        if (!file.getName().endsWith(".envelope")) {
            iLogger.h(b5.DEBUG, "File '%s' doesn't match extension expected.", file.getAbsolutePath());
            return;
        }
        try {
            if (!file.getParentFile().canWrite()) {
                iLogger.h(b5.WARNING, "File '%s' cannot be deleted so it will not be processed.", file.getAbsolutePath());
                return;
            }
            try {
                try {
                    BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                    try {
                        l1.a d10 = this.f16205f.d(bufferedInputStream);
                        if (d10 == null) {
                            iLogger.h(b5.ERROR, "Failed to deserialize cached envelope %s", file.getAbsolutePath());
                        } else {
                            this.f16204e.l(d10, h0Var);
                        }
                        Object b11 = h0Var.b("sentry:typeCheckHint");
                        if (!io.sentry.hints.f.class.isInstance(h0Var.b("sentry:typeCheckHint")) || b11 == null) {
                            u6.h.r(io.sentry.hints.f.class, b11, iLogger);
                        } else if (!((io.sentry.hints.f) b11).d()) {
                            iLogger.h(b5.WARNING, "Timed out waiting for envelope submission.", new Object[0]);
                        }
                        bufferedInputStream.close();
                        Object b12 = h0Var.b("sentry:typeCheckHint");
                        if (!io.sentry.hints.h.class.isInstance(h0Var.b("sentry:typeCheckHint")) || b12 == null) {
                            u6.h.r(io.sentry.hints.h.class, b12, iLogger);
                        } else {
                            c(this, file, (io.sentry.hints.h) b12);
                        }
                    } catch (Throwable th2) {
                        try {
                            bufferedInputStream.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                } catch (IOException e7) {
                    iLogger.b(b5.ERROR, e7, "I/O on file '%s' failed.", file.getAbsolutePath());
                    b10 = h0Var.b("sentry:typeCheckHint");
                    if (io.sentry.hints.h.class.isInstance(h0Var.b("sentry:typeCheckHint"))) {
                    }
                    u6.h.r(io.sentry.hints.h.class, b10, iLogger);
                }
            } catch (FileNotFoundException e9) {
                iLogger.b(b5.ERROR, e9, "File '%s' cannot be found.", file.getAbsolutePath());
                b10 = h0Var.b("sentry:typeCheckHint");
                if (io.sentry.hints.h.class.isInstance(h0Var.b("sentry:typeCheckHint"))) {
                }
                u6.h.r(io.sentry.hints.h.class, b10, iLogger);
            } catch (Throwable th4) {
                iLogger.b(b5.ERROR, th4, "Failed to capture cached envelope %s", file.getAbsolutePath());
                Object b13 = h0Var.b("sentry:typeCheckHint");
                if (!io.sentry.hints.h.class.isInstance(h0Var.b("sentry:typeCheckHint")) || b13 == null) {
                    u6.h.r(io.sentry.hints.h.class, b13, iLogger);
                } else {
                    ((io.sentry.hints.h) b13).c(false);
                    iLogger.b(b5.INFO, th4, "File '%s' won't retry.", file.getAbsolutePath());
                }
                b10 = h0Var.b("sentry:typeCheckHint");
                if (io.sentry.hints.h.class.isInstance(h0Var.b("sentry:typeCheckHint"))) {
                }
                u6.h.r(io.sentry.hints.h.class, b10, iLogger);
            }
        } catch (Throwable th5) {
            Object b14 = h0Var.b("sentry:typeCheckHint");
            if (!io.sentry.hints.h.class.isInstance(h0Var.b("sentry:typeCheckHint")) || b14 == null) {
                u6.h.r(io.sentry.hints.h.class, b14, iLogger);
            } else {
                c(this, file, (io.sentry.hints.h) b14);
            }
            throw th5;
        }
    }
}
