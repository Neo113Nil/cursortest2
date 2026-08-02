package io.sentry;

import io.sentry.util.AbstractC4845c;
import io.sentry.util.l;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

/* renamed from: io.sentry.v1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4855v1 extends AbstractC4838u implements U {

    /* renamed from: i, reason: collision with root package name */
    public static final Charset f52822i = Charset.forName("UTF-8");

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC4740e0 f52823e;

    /* renamed from: f, reason: collision with root package name */
    public final T f52824f;

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC4770k0 f52825g;

    /* renamed from: h, reason: collision with root package name */
    public final ILogger f52826h;

    public C4855v1(InterfaceC4740e0 interfaceC4740e0, T t10, InterfaceC4770k0 interfaceC4770k0, ILogger iLogger, long j10, int i10) {
        super(interfaceC4740e0, iLogger, j10, i10);
        this.f52823e = (InterfaceC4740e0) io.sentry.util.w.c(interfaceC4740e0, "Scopes are required.");
        this.f52824f = (T) io.sentry.util.w.c(t10, "Envelope reader is required.");
        this.f52825g = (InterfaceC4770k0) io.sentry.util.w.c(interfaceC4770k0, "Serializer is required.");
        this.f52826h = (ILogger) io.sentry.util.w.c(iLogger, "Logger is required.");
    }

    public static /* synthetic */ void f(C4855v1 c4855v1, File file, io.sentry.hints.l lVar) {
        c4855v1.getClass();
        if (lVar.a()) {
            return;
        }
        try {
            if (file.delete()) {
                return;
            }
            c4855v1.f52826h.c(EnumC4788n3.ERROR, "Failed to delete: %s", file.getAbsolutePath());
        } catch (RuntimeException e10) {
            c4855v1.f52826h.a(EnumC4788n3.ERROR, e10, "Failed to delete: %s", file.getAbsolutePath());
        }
    }

    @Override // io.sentry.U
    public void a(String str, J j10) {
        io.sentry.util.w.c(str, "Path is required.");
        e(new File(str), j10);
    }

    @Override // io.sentry.AbstractC4838u
    public boolean c(String str) {
        return (str == null || str.startsWith("session") || str.startsWith("previous_session") || str.startsWith("startup_crash")) ? false : true;
    }

    @Override // io.sentry.AbstractC4838u
    public /* bridge */ /* synthetic */ void d(File file) {
        super.d(file);
    }

    @Override // io.sentry.AbstractC4838u
    public void e(final File file, J j10) {
        io.sentry.util.w.c(file, "File is required.");
        try {
            if (!c(file.getName())) {
                this.f52826h.c(EnumC4788n3.DEBUG, "File '%s' should be ignored.", file.getAbsolutePath());
                return;
            }
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            try {
                C4866x2 a10 = this.f52824f.a(bufferedInputStream);
                if (a10 == null) {
                    this.f52826h.c(EnumC4788n3.ERROR, "Stream from path %s resulted in a null envelope.", file.getAbsolutePath());
                } else {
                    m(a10, j10);
                    this.f52826h.c(EnumC4788n3.DEBUG, "File '%s' is done.", file.getAbsolutePath());
                }
                bufferedInputStream.close();
            } catch (Throwable th2) {
                try {
                    bufferedInputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (IOException e10) {
            this.f52826h.b(EnumC4788n3.ERROR, "Error processing envelope.", e10);
        } finally {
            io.sentry.util.l.j(j10, io.sentry.hints.l.class, this.f52826h, new l.a() { // from class: io.sentry.t1
                @Override // io.sentry.util.l.a
                public final void accept(Object obj) {
                    C4855v1.f(C4855v1.this, file, (io.sentry.hints.l) obj);
                }
            });
        }
    }

    public final l4 h(j4 j4Var) {
        String b10;
        if (j4Var != null && (b10 = j4Var.b()) != null) {
            try {
                Double valueOf = Double.valueOf(Double.parseDouble(b10));
                if (io.sentry.util.A.h(valueOf, false)) {
                    String a10 = j4Var.a();
                    if (a10 != null) {
                        Double valueOf2 = Double.valueOf(Double.parseDouble(a10));
                        if (io.sentry.util.A.h(valueOf2, false)) {
                            return new l4(Boolean.TRUE, valueOf, valueOf2);
                        }
                    }
                    return io.sentry.util.A.a(new l4(Boolean.TRUE, valueOf));
                }
                this.f52826h.c(EnumC4788n3.ERROR, "Invalid sample rate parsed from TraceContext: %s", b10);
            } catch (Exception unused) {
                this.f52826h.c(EnumC4788n3.ERROR, "Unable to parse sample rate from TraceContext: %s", b10);
            }
        }
        return new l4(Boolean.TRUE);
    }

    public final void i(C4665a3 c4665a3, int i10) {
        this.f52826h.c(EnumC4788n3.ERROR, "Item %d of type %s returned null by the parser.", Integer.valueOf(i10), c4665a3.O().e());
    }

    public final void j(int i10) {
        this.f52826h.c(EnumC4788n3.DEBUG, "Item %d is being captured.", Integer.valueOf(i10));
    }

    public final void k(io.sentry.protocol.u uVar) {
        this.f52826h.c(EnumC4788n3.WARNING, "Timed out waiting for event id submission: %s", uVar);
    }

    public final void l(C4866x2 c4866x2, io.sentry.protocol.u uVar, int i10) {
        this.f52826h.c(EnumC4788n3.ERROR, "Item %d of has a different event id (%s) to the envelope header (%s)", Integer.valueOf(i10), c4866x2.b().a(), uVar);
    }

    public final void m(C4866x2 c4866x2, J j10) {
        BufferedReader bufferedReader;
        Object e10;
        this.f52826h.c(EnumC4788n3.DEBUG, "Processing Envelope with %d item(s)", Integer.valueOf(AbstractC4845c.e(c4866x2.c())));
        int i10 = 0;
        for (C4665a3 c4665a3 : c4866x2.c()) {
            i10++;
            if (c4665a3.O() == null) {
                this.f52826h.c(EnumC4788n3.ERROR, "Item %d has no header", Integer.valueOf(i10));
            } else if (EnumC4783m3.Event.equals(c4665a3.O().e())) {
                try {
                    bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(c4665a3.M()), f52822i));
                } catch (Throwable th2) {
                    this.f52826h.b(EnumC4788n3.ERROR, "Item failed to process.", th2);
                }
                try {
                    C4733c3 c4733c3 = (C4733c3) this.f52825g.c(bufferedReader, C4733c3.class);
                    if (c4733c3 == null) {
                        i(c4665a3, i10);
                    } else {
                        if (c4733c3.L() != null) {
                            io.sentry.util.l.l(j10, c4733c3.L().e());
                        }
                        if (c4866x2.b().a() == null || c4866x2.b().a().equals(c4733c3.G())) {
                            this.f52823e.v(c4733c3, j10);
                            j(i10);
                            if (!n(j10)) {
                                k(c4733c3.G());
                                bufferedReader.close();
                                return;
                            }
                        } else {
                            l(c4866x2, c4733c3.G(), i10);
                            bufferedReader.close();
                        }
                    }
                    bufferedReader.close();
                    e10 = io.sentry.util.l.e(j10);
                    if (!(e10 instanceof io.sentry.hints.q) && !((io.sentry.hints.q) e10).e()) {
                        this.f52826h.c(EnumC4788n3.WARNING, "Envelope had a failed capture at item %d. No more items will be sent.", Integer.valueOf(i10));
                        return;
                    }
                    io.sentry.util.l.h(j10, io.sentry.hints.k.class, new l.a() { // from class: io.sentry.u1
                        @Override // io.sentry.util.l.a
                        public final void accept(Object obj) {
                            ((io.sentry.hints.k) obj).reset();
                        }
                    });
                } finally {
                }
            } else {
                if (EnumC4783m3.Transaction.equals(c4665a3.O().e())) {
                    try {
                        bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(c4665a3.M()), f52822i));
                        try {
                            io.sentry.protocol.B b10 = (io.sentry.protocol.B) this.f52825g.c(bufferedReader, io.sentry.protocol.B.class);
                            if (b10 == null) {
                                i(c4665a3, i10);
                            } else if (c4866x2.b().a() == null || c4866x2.b().a().equals(b10.G())) {
                                j4 c10 = c4866x2.b().c();
                                if (b10.C().j() != null) {
                                    b10.C().j().w(h(c10));
                                }
                                this.f52823e.j(b10, c10, j10);
                                j(i10);
                                if (!n(j10)) {
                                    k(b10.G());
                                    bufferedReader.close();
                                    return;
                                }
                            } else {
                                l(c4866x2, b10.G(), i10);
                                bufferedReader.close();
                            }
                            bufferedReader.close();
                        } finally {
                        }
                    } catch (Throwable th3) {
                        this.f52826h.b(EnumC4788n3.ERROR, "Item failed to process.", th3);
                    }
                } else {
                    this.f52823e.f(new C4866x2(c4866x2.b().a(), c4866x2.b().b(), c4665a3), j10);
                    this.f52826h.c(EnumC4788n3.DEBUG, "%s item %d is being captured.", c4665a3.O().e().getItemType(), Integer.valueOf(i10));
                    if (!n(j10)) {
                        this.f52826h.c(EnumC4788n3.WARNING, "Timed out waiting for item type submission: %s", c4665a3.O().e().getItemType());
                        return;
                    }
                }
                e10 = io.sentry.util.l.e(j10);
                if (!(e10 instanceof io.sentry.hints.q)) {
                }
                io.sentry.util.l.h(j10, io.sentry.hints.k.class, new l.a() { // from class: io.sentry.u1
                    @Override // io.sentry.util.l.a
                    public final void accept(Object obj) {
                        ((io.sentry.hints.k) obj).reset();
                    }
                });
            }
        }
    }

    public final boolean n(J j10) {
        Object e10 = io.sentry.util.l.e(j10);
        if (e10 instanceof io.sentry.hints.i) {
            return ((io.sentry.hints.i) e10).g();
        }
        io.sentry.util.t.a(io.sentry.hints.i.class, e10, this.f52826h);
        return true;
    }
}
