package io.sentry;

import io.sentry.util.l;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class C extends AbstractC4838u implements U {

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC4740e0 f50200e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC4770k0 f50201f;

    /* renamed from: g, reason: collision with root package name */
    public final ILogger f50202g;

    public C(InterfaceC4740e0 interfaceC4740e0, InterfaceC4770k0 interfaceC4770k0, ILogger iLogger, long j10, int i10) {
        super(interfaceC4740e0, iLogger, j10, i10);
        this.f50200e = (InterfaceC4740e0) io.sentry.util.w.c(interfaceC4740e0, "Scopes are required.");
        this.f50201f = (InterfaceC4770k0) io.sentry.util.w.c(interfaceC4770k0, "Serializer is required.");
        this.f50202g = (ILogger) io.sentry.util.w.c(iLogger, "Logger is required.");
    }

    public static /* synthetic */ void f(C c10, io.sentry.hints.i iVar) {
        c10.getClass();
        if (iVar.g()) {
            return;
        }
        c10.f50202g.c(EnumC4788n3.WARNING, "Timed out waiting for envelope submission.", new Object[0]);
    }

    public static /* synthetic */ void g(C c10, File file, io.sentry.hints.l lVar) {
        c10.getClass();
        if (lVar.a()) {
            c10.f50202g.c(EnumC4788n3.INFO, "File not deleted since retry was marked. %s.", file.getAbsolutePath());
        } else {
            c10.i(file, "after trying to capture it");
            c10.f50202g.c(EnumC4788n3.DEBUG, "Deleted file %s.", file.getAbsolutePath());
        }
    }

    public static /* synthetic */ void h(C c10, Throwable th2, File file, io.sentry.hints.l lVar) {
        c10.getClass();
        lVar.d(false);
        c10.f50202g.a(EnumC4788n3.INFO, th2, "File '%s' won't retry.", file.getAbsolutePath());
    }

    @Override // io.sentry.U
    public void a(String str, J j10) {
        io.sentry.util.w.c(str, "Path is required.");
        e(new File(str), j10);
    }

    @Override // io.sentry.AbstractC4838u
    public boolean c(String str) {
        return str.endsWith(".envelope");
    }

    @Override // io.sentry.AbstractC4838u
    public /* bridge */ /* synthetic */ void d(File file) {
        super.d(file);
    }

    @Override // io.sentry.AbstractC4838u
    public void e(final File file, J j10) {
        ILogger iLogger;
        l.a aVar;
        if (!file.isFile()) {
            this.f50202g.c(EnumC4788n3.DEBUG, "'%s' is not a file.", file.getAbsolutePath());
            return;
        }
        if (!c(file.getName())) {
            this.f50202g.c(EnumC4788n3.DEBUG, "File '%s' doesn't match extension expected.", file.getAbsolutePath());
            return;
        }
        try {
            if (!file.getParentFile().canWrite()) {
                this.f50202g.c(EnumC4788n3.WARNING, "File '%s' cannot be deleted so it will not be processed.", file.getAbsolutePath());
                return;
            }
            try {
                try {
                    BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                    try {
                        C4866x2 d10 = this.f50201f.d(bufferedInputStream);
                        if (d10 == null) {
                            this.f50202g.c(EnumC4788n3.ERROR, "Failed to deserialize cached envelope %s", file.getAbsolutePath());
                        } else {
                            this.f50200e.f(d10, j10);
                        }
                        io.sentry.util.l.j(j10, io.sentry.hints.i.class, this.f50202g, new l.a() { // from class: io.sentry.z
                            @Override // io.sentry.util.l.a
                            public final void accept(Object obj) {
                                C.f(C.this, (io.sentry.hints.i) obj);
                            }
                        });
                        bufferedInputStream.close();
                        io.sentry.util.l.j(j10, io.sentry.hints.l.class, this.f50202g, new l.a() { // from class: io.sentry.A
                            @Override // io.sentry.util.l.a
                            public final void accept(Object obj) {
                                C.g(C.this, file, (io.sentry.hints.l) obj);
                            }
                        });
                    } catch (Throwable th2) {
                        try {
                            bufferedInputStream.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                } catch (FileNotFoundException e10) {
                    this.f50202g.a(EnumC4788n3.ERROR, e10, "File '%s' cannot be found.", file.getAbsolutePath());
                    iLogger = this.f50202g;
                    aVar = new l.a() { // from class: io.sentry.A
                        @Override // io.sentry.util.l.a
                        public final void accept(Object obj) {
                            C.g(C.this, file, (io.sentry.hints.l) obj);
                        }
                    };
                    io.sentry.util.l.j(j10, io.sentry.hints.l.class, iLogger, aVar);
                }
            } catch (IOException e11) {
                this.f50202g.a(EnumC4788n3.ERROR, e11, "I/O on file '%s' failed.", file.getAbsolutePath());
                iLogger = this.f50202g;
                aVar = new l.a() { // from class: io.sentry.A
                    @Override // io.sentry.util.l.a
                    public final void accept(Object obj) {
                        C.g(C.this, file, (io.sentry.hints.l) obj);
                    }
                };
                io.sentry.util.l.j(j10, io.sentry.hints.l.class, iLogger, aVar);
            } catch (Throwable th4) {
                this.f50202g.a(EnumC4788n3.ERROR, th4, "Failed to capture cached envelope %s", file.getAbsolutePath());
                io.sentry.util.l.j(j10, io.sentry.hints.l.class, this.f50202g, new l.a() { // from class: io.sentry.B
                    @Override // io.sentry.util.l.a
                    public final void accept(Object obj) {
                        C.h(C.this, th4, file, (io.sentry.hints.l) obj);
                    }
                });
                iLogger = this.f50202g;
                aVar = new l.a() { // from class: io.sentry.A
                    @Override // io.sentry.util.l.a
                    public final void accept(Object obj) {
                        C.g(C.this, file, (io.sentry.hints.l) obj);
                    }
                };
                io.sentry.util.l.j(j10, io.sentry.hints.l.class, iLogger, aVar);
            }
        } catch (Throwable th5) {
            io.sentry.util.l.j(j10, io.sentry.hints.l.class, this.f50202g, new l.a() { // from class: io.sentry.A
                @Override // io.sentry.util.l.a
                public final void accept(Object obj) {
                    C.g(C.this, file, (io.sentry.hints.l) obj);
                }
            });
            throw th5;
        }
    }

    public final void i(File file, String str) {
        try {
            if (file.delete()) {
                return;
            }
            this.f50202g.c(EnumC4788n3.ERROR, "Failed to delete '%s' %s", file.getAbsolutePath(), str);
        } catch (Throwable th2) {
            this.f50202g.a(EnumC4788n3.ERROR, th2, "Failed to delete '%s' %s", file.getAbsolutePath(), str);
        }
    }
}
