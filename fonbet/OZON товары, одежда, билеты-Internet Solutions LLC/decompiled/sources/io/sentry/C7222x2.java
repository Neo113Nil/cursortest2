package io.sentry;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import io.sentry.C7222x2;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.sentry.x2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7222x2 {

    /* renamed from: d, reason: collision with root package name */
    private static final Charset f68663d = Charset.forName("UTF-8");

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f68664e = 0;

    /* renamed from: a, reason: collision with root package name */
    private final C7226y2 f68665a;

    /* renamed from: b, reason: collision with root package name */
    private final Callable<byte[]> f68666b;

    /* renamed from: c, reason: collision with root package name */
    private byte[] f68667c;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: io.sentry.x2$a */
    static class a {

        /* renamed from: a, reason: collision with root package name */
        private byte[] f68668a;

        /* renamed from: b, reason: collision with root package name */
        private final Callable<byte[]> f68669b;

        public a(Callable<byte[]> callable) {
            this.f68669b = callable;
        }

        @NotNull
        public final byte[] a() throws Exception {
            Callable<byte[]> callable;
            if (this.f68668a == null && (callable = this.f68669b) != null) {
                this.f68668a = callable.call();
            }
            byte[] bArr = this.f68668a;
            return bArr != null ? bArr : new byte[0];
        }
    }

    C7222x2(@NotNull C7226y2 c7226y2, byte[] bArr) {
        this.f68665a = c7226y2;
        this.f68667c = bArr;
        this.f68666b = null;
    }

    public static /* synthetic */ byte[] a(InterfaceC7126b0 interfaceC7126b0, X2 x22, C7194q1 c7194q1, File file, ILogger iLogger, boolean z11) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, f68663d));
                try {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    interfaceC7126b0.a(bufferedWriter, x22);
                    linkedHashMap.put(H2.ReplayEvent.getItemType(), byteArrayOutputStream.toByteArray());
                    byteArrayOutputStream.reset();
                    if (c7194q1 != null) {
                        interfaceC7126b0.a(bufferedWriter, c7194q1);
                        linkedHashMap.put(H2.ReplayRecording.getItemType(), byteArrayOutputStream.toByteArray());
                        byteArrayOutputStream.reset();
                    }
                    if (file != null && file.exists()) {
                        byte[] b11 = io.sentry.util.g.b(10485760L, file.getPath());
                        if (b11.length > 0) {
                            linkedHashMap.put(H2.ReplayVideo.getItemType(), b11);
                        }
                    }
                    byte[] t2 = t(linkedHashMap);
                    bufferedWriter.close();
                    byteArrayOutputStream.close();
                    if (file != null) {
                        if (z11) {
                            return t2;
                        }
                    }
                    return t2;
                } finally {
                }
            } finally {
            }
        } catch (Throwable th2) {
            try {
                iLogger.a(I2.ERROR, "Could not serialize replay recording", th2);
                if (file == null) {
                    return null;
                }
                if (z11) {
                    io.sentry.util.g.a(file.getParentFile());
                    return null;
                }
                file.delete();
                return null;
            } finally {
                if (file != null) {
                    if (z11) {
                        io.sentry.util.g.a(file.getParentFile());
                    } else {
                        file.delete();
                    }
                }
            }
        }
    }

    public static /* synthetic */ byte[] b(InterfaceC7126b0 interfaceC7126b0, io.sentry.clientreport.c cVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, f68663d));
            try {
                interfaceC7126b0.a(bufferedWriter, cVar);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                bufferedWriter.close();
                byteArrayOutputStream.close();
                return byteArray;
            } finally {
            }
        } catch (Throwable th2) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public static /* synthetic */ byte[] c(InterfaceC7126b0 interfaceC7126b0, O1 o12) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, f68663d));
            try {
                interfaceC7126b0.a(bufferedWriter, o12);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                bufferedWriter.close();
                byteArrayOutputStream.close();
                return byteArray;
            } finally {
            }
        } catch (Throwable th2) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public static byte[] d(File file, long j11, C7167l1 c7167l1, InterfaceC7126b0 interfaceC7126b0) {
        if (!file.exists()) {
            throw new io.sentry.exception.b(B0.A0.b("Dropping profiling trace data, because the file '", file.getName(), "' doesn't exists"));
        }
        String a11 = io.sentry.vendor.a.a(io.sentry.util.g.b(j11, file.getPath()));
        if (a11.isEmpty()) {
            throw new io.sentry.exception.b("Profiling trace file is empty");
        }
        c7167l1.D(a11);
        c7167l1.C();
        try {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, f68663d));
                    try {
                        interfaceC7126b0.a(bufferedWriter, c7167l1);
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        bufferedWriter.close();
                        byteArrayOutputStream.close();
                        return byteArray;
                    } finally {
                    }
                } catch (Throwable th2) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } finally {
                file.delete();
            }
        } catch (IOException e11) {
            throw new io.sentry.exception.b("Failed to serialize profiling trace data\n" + e11.getMessage());
        }
    }

    public static /* synthetic */ byte[] e(InterfaceC7126b0 interfaceC7126b0, R2 r22) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, f68663d));
            try {
                interfaceC7126b0.a(bufferedWriter, r22);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                bufferedWriter.close();
                byteArrayOutputStream.close();
                return byteArray;
            } finally {
            }
        } catch (Throwable th2) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public static /* synthetic */ byte[] f(InterfaceC7126b0 interfaceC7126b0, M2 m22) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, f68663d));
            try {
                interfaceC7126b0.a(bufferedWriter, m22);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                bufferedWriter.close();
                byteArrayOutputStream.close();
                return byteArray;
            } finally {
            }
        } catch (Throwable th2) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public static /* synthetic */ byte[] g(InterfaceC7126b0 interfaceC7126b0, h3 h3Var) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, f68663d));
            try {
                interfaceC7126b0.a(bufferedWriter, h3Var);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                bufferedWriter.close();
                byteArrayOutputStream.close();
                return byteArray;
            } finally {
            }
        } catch (Throwable th2) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public static byte[] h(File file, C7151h1 c7151h1, T t2, InterfaceC7126b0 interfaceC7126b0) {
        if (!file.exists()) {
            throw new io.sentry.exception.b(B0.A0.b("Dropping profile chunk, because the file '", file.getName(), "' doesn't exists"));
        }
        if (!"java".equals(c7151h1.o())) {
            String a11 = io.sentry.vendor.a.a(io.sentry.util.g.b(52428800L, file.getPath()));
            if (a11.isEmpty()) {
                throw new io.sentry.exception.b("Profiling trace file is empty");
            }
            c7151h1.r(a11);
        } else {
            if (K0.a().equals(t2)) {
                throw new io.sentry.exception.b("No ProfileConverter available, dropping chunk.");
            }
            try {
                file.getAbsolutePath();
                ((K0) t2).getClass();
                c7151h1.s(new io.sentry.protocol.profiling.a());
            } catch (Exception e11) {
                throw new io.sentry.exception.b("Profile conversion failed", e11);
            }
        }
        try {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, f68663d));
                    try {
                        interfaceC7126b0.a(bufferedWriter, c7151h1);
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        bufferedWriter.close();
                        byteArrayOutputStream.close();
                        return byteArray;
                    } finally {
                    }
                } catch (Throwable th2) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } finally {
                file.delete();
            }
        } catch (IOException e12) {
            throw new io.sentry.exception.b("Failed to serialize profile chunk\n" + e12.getMessage());
        }
    }

    public static byte[] i(C7125b c7125b, long j11, InterfaceC7126b0 interfaceC7126b0, ILogger iLogger) {
        byte[] bArr;
        if (c7125b.f() != null) {
            byte[] f7 = c7125b.f();
            j(c7125b.h(), f7.length, j11);
            return f7;
        }
        if (c7125b.i() != null) {
            byte[] b11 = io.sentry.util.k.b(interfaceC7126b0, iLogger, c7125b.i());
            if (b11 != null) {
                j(c7125b.h(), b11.length, j11);
                return b11;
            }
        } else if (c7125b.e() != null && (bArr = (byte[]) ((io.sentry.android.core.g0) c7125b.e()).call()) != null) {
            j(c7125b.h(), bArr.length, j11);
            return bArr;
        }
        throw new io.sentry.exception.b(B0.A0.b("Couldn't attach the attachment ", c7125b.h(), ".\nPlease check that either bytes, serializable, path or provider is set."));
    }

    private static void j(@NotNull String str, long j11, long j12) throws io.sentry.exception.b {
        if (j11 > j12) {
            throw new io.sentry.exception.b(String.format("Dropping attachment with filename '%s', because the size of the passed bytes with %d bytes is bigger than the maximum allowed attachment size of %d bytes.", str, Long.valueOf(j11), Long.valueOf(j12)));
        }
    }

    @NotNull
    public static C7222x2 k(@NotNull final InterfaceC7126b0 interfaceC7126b0, @NotNull final io.sentry.clientreport.c cVar) throws IOException {
        io.sentry.util.p.b(interfaceC7126b0, "ISerializer is required.");
        final a aVar = new a(new Callable() { // from class: io.sentry.n2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C7222x2.b(InterfaceC7126b0.this, cVar);
            }
        });
        return new C7222x2(new C7226y2(H2.resolve(cVar), new Callable() { // from class: io.sentry.o2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Integer.valueOf(C7222x2.a.this.a().length);
            }
        }, "application/json", null, null), (Callable<byte[]>) new Callable() { // from class: io.sentry.p2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C7222x2.a.this.a();
            }
        });
    }

    @NotNull
    public static C7222x2 l(@NotNull final C7151h1 c7151h1, @NotNull final InterfaceC7126b0 interfaceC7126b0, @NotNull final T t2) throws io.sentry.exception.b {
        final File p11 = c7151h1.p();
        final a aVar = new a(new Callable() { // from class: io.sentry.t2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C7222x2.h(p11, c7151h1, t2, interfaceC7126b0);
            }
        });
        return new C7222x2(new C7226y2(H2.ProfileChunk, (Callable<Integer>) new Callable() { // from class: io.sentry.u2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Integer.valueOf(C7222x2.a.this.a().length);
            }
        }, "application-json", p11.getName(), (String) null, c7151h1.o(), (Integer) null), (Callable<byte[]>) new Callable() { // from class: io.sentry.v2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C7222x2.a.this.a();
            }
        });
    }

    @NotNull
    public static C7222x2 m(@NotNull final InterfaceC7126b0 interfaceC7126b0, @NotNull final h3 h3Var) throws IOException {
        io.sentry.util.p.b(interfaceC7126b0, "ISerializer is required.");
        io.sentry.util.p.b(h3Var, "Session is required.");
        final a aVar = new a(new Callable() { // from class: io.sentry.w2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C7222x2.g(InterfaceC7126b0.this, h3Var);
            }
        });
        return new C7222x2(new C7226y2(H2.Session, new Callable() { // from class: io.sentry.Y1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Integer.valueOf(C7222x2.a.this.a().length);
            }
        }, "application/json", null, null), (Callable<byte[]>) new Callable() { // from class: io.sentry.Z1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C7222x2.a.this.a();
            }
        });
    }

    private static byte[] t(@NotNull LinkedHashMap linkedHashMap) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write((byte) (linkedHashMap.size() | UserVerificationMethods.USER_VERIFY_PATTERN));
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                byte[] bytes = ((String) entry.getKey()).getBytes(f68663d);
                int length = bytes.length;
                byteArrayOutputStream.write(-39);
                byteArrayOutputStream.write((byte) length);
                byteArrayOutputStream.write(bytes);
                byte[] bArr = (byte[]) entry.getValue();
                int length2 = bArr.length;
                byteArrayOutputStream.write(-58);
                byteArrayOutputStream.write(ByteBuffer.allocate(4).order(ByteOrder.BIG_ENDIAN).putInt(length2).array());
                byteArrayOutputStream.write(bArr);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th2) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final io.sentry.clientreport.c n(@NotNull InterfaceC7126b0 interfaceC7126b0) throws Exception {
        C7226y2 c7226y2 = this.f68665a;
        if (c7226y2 == null || c7226y2.e() != H2.ClientReport) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(o()), f68663d));
        try {
            io.sentry.clientreport.c cVar = (io.sentry.clientreport.c) interfaceC7126b0.c(bufferedReader, io.sentry.clientreport.c.class);
            bufferedReader.close();
            return cVar;
        } catch (Throwable th2) {
            try {
                bufferedReader.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @NotNull
    public final byte[] o() throws Exception {
        Callable<byte[]> callable;
        if (this.f68667c == null && (callable = this.f68666b) != null) {
            this.f68667c = callable.call();
        }
        return this.f68667c;
    }

    @NotNull
    public final C7226y2 p() {
        return this.f68665a;
    }

    public final M2 q(@NotNull InterfaceC7126b0 interfaceC7126b0) throws Exception {
        C7226y2 c7226y2 = this.f68665a;
        if (c7226y2 == null || c7226y2.e() != H2.Log) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(o()), f68663d));
        try {
            M2 m22 = (M2) interfaceC7126b0.c(bufferedReader, M2.class);
            bufferedReader.close();
            return m22;
        } catch (Throwable th2) {
            try {
                bufferedReader.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final R2 r(@NotNull InterfaceC7126b0 interfaceC7126b0) throws Exception {
        C7226y2 c7226y2 = this.f68665a;
        if (c7226y2 == null || c7226y2.e() != H2.TraceMetric) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(o()), f68663d));
        try {
            R2 r22 = (R2) interfaceC7126b0.c(bufferedReader, R2.class);
            bufferedReader.close();
            return r22;
        } catch (Throwable th2) {
            try {
                bufferedReader.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final io.sentry.protocol.A s(@NotNull InterfaceC7126b0 interfaceC7126b0) throws Exception {
        C7226y2 c7226y2 = this.f68665a;
        if (c7226y2 == null || c7226y2.e() != H2.Transaction) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(o()), f68663d));
        try {
            io.sentry.protocol.A a11 = (io.sentry.protocol.A) interfaceC7126b0.c(bufferedReader, io.sentry.protocol.A.class);
            bufferedReader.close();
            return a11;
        } catch (Throwable th2) {
            try {
                bufferedReader.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    C7222x2(@NotNull C7226y2 c7226y2, Callable<byte[]> callable) {
        this.f68665a = c7226y2;
        this.f68666b = callable;
        this.f68667c = null;
    }
}
