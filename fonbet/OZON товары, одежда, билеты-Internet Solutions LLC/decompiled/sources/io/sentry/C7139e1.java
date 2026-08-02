package io.sentry;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.sentry.e1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7139e1 extends AbstractC7203t {

    /* renamed from: i, reason: collision with root package name */
    private static final Charset f67860i = Charset.forName("UTF-8");

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final A1 f67861e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final M f67862f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final InterfaceC7126b0 f67863g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final ILogger f67864h;

    public C7139e1(@NotNull A1 a12, @NotNull M m11, @NotNull InterfaceC7126b0 interfaceC7126b0, @NotNull ILogger iLogger, long j11, int i11) {
        super(a12, iLogger, j11, i11);
        io.sentry.util.p.b(a12, "Scopes are required.");
        this.f67861e = a12;
        io.sentry.util.p.b(m11, "Envelope reader is required.");
        this.f67862f = m11;
        io.sentry.util.p.b(interfaceC7126b0, "Serializer is required.");
        this.f67863g = interfaceC7126b0;
        io.sentry.util.p.b(iLogger, "Logger is required.");
        this.f67864h = iLogger;
    }

    public static /* synthetic */ void d(C7139e1 c7139e1, File file, io.sentry.hints.l lVar) {
        ILogger iLogger = c7139e1.f67864h;
        if (lVar.c()) {
            return;
        }
        try {
            if (file.delete()) {
                return;
            }
            iLogger.c(I2.ERROR, "Failed to delete: %s", file.getAbsolutePath());
        } catch (RuntimeException e11) {
            iLogger.b(I2.ERROR, e11, "Failed to delete: %s", file.getAbsolutePath());
        }
    }

    @NotNull
    private s3 e(q3 q3Var) {
        String b11;
        ILogger iLogger = this.f67864h;
        if (q3Var != null && (b11 = q3Var.b()) != null) {
            try {
                Double valueOf = Double.valueOf(Double.parseDouble(b11));
                if (io.sentry.util.t.h(valueOf)) {
                    String a11 = q3Var.a();
                    if (a11 != null) {
                        Double valueOf2 = Double.valueOf(Double.parseDouble(a11));
                        if (io.sentry.util.t.h(valueOf2)) {
                            return new s3(Boolean.TRUE, valueOf, valueOf2, Boolean.FALSE, null);
                        }
                    }
                    return io.sentry.util.t.a(new s3(Boolean.TRUE, valueOf));
                }
                iLogger.c(I2.ERROR, "Invalid sample rate parsed from TraceContext: %s", b11);
            } catch (Exception unused) {
                iLogger.c(I2.ERROR, "Unable to parse sample rate from TraceContext: %s", b11);
            }
        }
        return new s3(Boolean.TRUE, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x02dd A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x02e4 A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void f(@NotNull V1 v12, @NotNull E e11) throws IOException {
        int i11;
        Iterator<C7222x2> it;
        int i12;
        BufferedReader bufferedReader;
        Object d11;
        Object d12;
        I2 i22 = I2.DEBUG;
        Iterable<C7222x2> b11 = v12.b();
        int i13 = 0;
        if (b11 instanceof Collection) {
            i11 = ((Collection) b11).size();
        } else {
            Iterator<C7222x2> it2 = b11.iterator();
            int i14 = 0;
            while (it2.hasNext()) {
                it2.next();
                i14++;
            }
            i11 = i14;
        }
        Object[] objArr = {Integer.valueOf(i11)};
        ILogger iLogger = this.f67864h;
        iLogger.c(i22, "Processing Envelope with %d item(s)", objArr);
        Iterator<C7222x2> it3 = v12.b().iterator();
        while (it3.hasNext()) {
            C7222x2 next = it3.next();
            int i15 = i13 + 1;
            if (next.p() == null) {
                iLogger.c(I2.ERROR, "Item %d has no header", Integer.valueOf(i15));
                it = it3;
                i12 = i15;
            } else {
                boolean equals = H2.Event.equals(next.p().e());
                InterfaceC7126b0 interfaceC7126b0 = this.f67863g;
                Charset charset = f67860i;
                A1 a12 = this.f67861e;
                if (equals) {
                    try {
                        it = it3;
                        try {
                            i12 = i15;
                        } catch (Throwable th2) {
                            th = th2;
                            i12 = i15;
                            iLogger.a(I2.ERROR, "Item failed to process.", th);
                            d11 = e11.d("sentry:typeCheckHint");
                            if (!(d11 instanceof io.sentry.hints.o)) {
                            }
                            d12 = e11.d("sentry:typeCheckHint");
                            if (io.sentry.hints.k.class.isInstance(e11.d("sentry:typeCheckHint"))) {
                            }
                            it3 = it;
                            i13 = i12;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        it = it3;
                    }
                    try {
                        bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(next.o()), charset));
                        try {
                            C7230z2 c7230z2 = (C7230z2) interfaceC7126b0.c(bufferedReader, C7230z2.class);
                            if (c7230z2 == null) {
                                iLogger.c(I2.ERROR, "Item %d of type %s returned null by the parser.", Integer.valueOf(i12), next.p().e());
                            } else {
                                if (c7230z2.L() != null) {
                                    String c11 = c7230z2.L().c();
                                    if (c11.startsWith("sentry.javascript") || c11.startsWith("sentry.dart") || c11.startsWith("sentry.dotnet")) {
                                        e11.k(Boolean.TRUE, "sentry:isFromHybridSdk");
                                    }
                                }
                                if (v12.a().a() == null || v12.a().a().equals(c7230z2.G())) {
                                    a12.z(c7230z2, e11);
                                    iLogger.c(I2.DEBUG, "Item %d is being captured.", Integer.valueOf(i12));
                                    if (!h(e11)) {
                                        iLogger.c(I2.WARNING, "Timed out waiting for event id submission: %s", c7230z2.G());
                                        bufferedReader.close();
                                        return;
                                    }
                                } else {
                                    iLogger.c(I2.ERROR, "Item %d of has a different event id (%s) to the envelope header (%s)", Integer.valueOf(i12), v12.a().a(), c7230z2.G());
                                    bufferedReader.close();
                                }
                            }
                            bufferedReader.close();
                        } finally {
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        iLogger.a(I2.ERROR, "Item failed to process.", th);
                        d11 = e11.d("sentry:typeCheckHint");
                        if (!(d11 instanceof io.sentry.hints.o)) {
                        }
                        d12 = e11.d("sentry:typeCheckHint");
                        if (io.sentry.hints.k.class.isInstance(e11.d("sentry:typeCheckHint"))) {
                        }
                        it3 = it;
                        i13 = i12;
                    }
                    d11 = e11.d("sentry:typeCheckHint");
                    if (!(d11 instanceof io.sentry.hints.o) && !((io.sentry.hints.o) d11).b()) {
                        iLogger.c(I2.WARNING, "Envelope had a failed capture at item %d. No more items will be sent.", Integer.valueOf(i12));
                        return;
                    }
                    d12 = e11.d("sentry:typeCheckHint");
                    if (io.sentry.hints.k.class.isInstance(e11.d("sentry:typeCheckHint")) && d12 != null) {
                        ((io.sentry.hints.k) d12).reset();
                    }
                } else {
                    it = it3;
                    i12 = i15;
                    if (H2.Transaction.equals(next.p().e())) {
                        try {
                            bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(next.o()), charset));
                            try {
                                io.sentry.protocol.A a11 = (io.sentry.protocol.A) interfaceC7126b0.c(bufferedReader, io.sentry.protocol.A.class);
                                if (a11 == null) {
                                    iLogger.c(I2.ERROR, "Item %d of type %s returned null by the parser.", Integer.valueOf(i12), next.p().e());
                                } else if (v12.a().a() == null || v12.a().a().equals(a11.G())) {
                                    q3 c12 = v12.a().c();
                                    if (a11.C().j() != null) {
                                        a11.C().j().r(e(c12));
                                    }
                                    a12.v(a11, c12, e11, null);
                                    iLogger.c(I2.DEBUG, "Item %d is being captured.", Integer.valueOf(i12));
                                    if (!h(e11)) {
                                        iLogger.c(I2.WARNING, "Timed out waiting for event id submission: %s", a11.G());
                                        bufferedReader.close();
                                        return;
                                    }
                                } else {
                                    iLogger.c(I2.ERROR, "Item %d of has a different event id (%s) to the envelope header (%s)", Integer.valueOf(i12), v12.a().a(), a11.G());
                                    bufferedReader.close();
                                }
                                bufferedReader.close();
                            } finally {
                                try {
                                    bufferedReader.close();
                                    throw th;
                                } catch (Throwable th5) {
                                    th.addSuppressed(th5);
                                }
                            }
                        } catch (Throwable th6) {
                            iLogger.a(I2.ERROR, "Item failed to process.", th6);
                        }
                    } else {
                        a12.k(new V1(v12.a().a(), v12.a().b(), next), e11);
                        iLogger.c(I2.DEBUG, "%s item %d is being captured.", next.p().e().getItemType(), Integer.valueOf(i12));
                        if (!h(e11)) {
                            iLogger.c(I2.WARNING, "Timed out waiting for item type submission: %s", next.p().e().getItemType());
                            return;
                        }
                    }
                    d11 = e11.d("sentry:typeCheckHint");
                    if (!(d11 instanceof io.sentry.hints.o)) {
                    }
                    d12 = e11.d("sentry:typeCheckHint");
                    if (io.sentry.hints.k.class.isInstance(e11.d("sentry:typeCheckHint"))) {
                        ((io.sentry.hints.k) d12).reset();
                    }
                }
            }
            it3 = it;
            i13 = i12;
        }
    }

    private boolean h(@NotNull E e11) {
        Object d11 = e11.d("sentry:typeCheckHint");
        if (d11 instanceof io.sentry.hints.i) {
            return ((io.sentry.hints.i) d11).h();
        }
        io.sentry.util.n.a(io.sentry.hints.i.class, d11, this.f67864h);
        return true;
    }

    @Override // io.sentry.AbstractC7203t
    protected final boolean a(String str) {
        return (str == null || str.startsWith("session") || str.startsWith("previous_session") || str.startsWith("startup_crash")) ? false : true;
    }

    @Override // io.sentry.AbstractC7203t
    protected final void c(@NotNull File file, @NotNull E e11) {
        boolean a11 = a(file.getName());
        ILogger iLogger = this.f67864h;
        try {
            if (!a11) {
                iLogger.c(I2.DEBUG, "File '%s' should be ignored.", file.getAbsolutePath());
                return;
            }
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                try {
                    V1 a12 = this.f67862f.a(bufferedInputStream);
                    if (a12 == null) {
                        iLogger.c(I2.ERROR, "Stream from path %s resulted in a null envelope.", file.getAbsolutePath());
                    } else {
                        f(a12, e11);
                        iLogger.c(I2.DEBUG, "File '%s' is done.", file.getAbsolutePath());
                    }
                    bufferedInputStream.close();
                    Object d11 = e11.d("sentry:typeCheckHint");
                    if (!io.sentry.hints.l.class.isInstance(e11.d("sentry:typeCheckHint")) || d11 == null) {
                        io.sentry.util.n.a(io.sentry.hints.l.class, d11, iLogger);
                    } else {
                        d(this, file, (io.sentry.hints.l) d11);
                    }
                } catch (Throwable th2) {
                    try {
                        bufferedInputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (IOException e12) {
                iLogger.a(I2.ERROR, "Error processing envelope.", e12);
                Object d12 = e11.d("sentry:typeCheckHint");
                if (!io.sentry.hints.l.class.isInstance(e11.d("sentry:typeCheckHint")) || d12 == null) {
                    io.sentry.util.n.a(io.sentry.hints.l.class, d12, iLogger);
                } else {
                    d(this, file, (io.sentry.hints.l) d12);
                }
            }
        } catch (Throwable th4) {
            Object d13 = e11.d("sentry:typeCheckHint");
            if (!io.sentry.hints.l.class.isInstance(e11.d("sentry:typeCheckHint")) || d13 == null) {
                io.sentry.util.n.a(io.sentry.hints.l.class, d13, iLogger);
            } else {
                d(this, file, (io.sentry.hints.l) d13);
            }
            throw th4;
        }
    }

    public final void g(@NotNull String str, @NotNull E e11) {
        io.sentry.util.p.b(str, "Path is required.");
        c(new File(str), e11);
    }
}
