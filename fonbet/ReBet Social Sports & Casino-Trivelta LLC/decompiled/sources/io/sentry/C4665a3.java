package io.sentry;

import io.sentry.C4665a3;
import io.sentry.util.AbstractC4851i;
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
import org.jetbrains.annotations.Nullable;

/* renamed from: io.sentry.a3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4665a3 {

    /* renamed from: c, reason: collision with root package name */
    public static final Charset f50589c = Charset.forName("UTF-8");

    /* renamed from: a, reason: collision with root package name */
    public final C4728b3 f50590a;

    /* renamed from: b, reason: collision with root package name */
    public final Callable f50591b;

    @Nullable
    private byte[] data;

    /* renamed from: io.sentry.a3$a */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final Callable f50592a;

        @Nullable
        private byte[] bytes;

        public a(Callable callable) {
            this.f50592a = callable;
        }

        public static byte[] b(byte[] bArr) {
            return bArr != null ? bArr : new byte[0];
        }

        public byte[] a() {
            Callable callable;
            if (this.bytes == null && (callable = this.f50592a) != null) {
                this.bytes = (byte[]) callable.call();
            }
            return b(this.bytes);
        }
    }

    public C4665a3(C4728b3 c4728b3, byte[] bArr) {
        this.f50590a = (C4728b3) io.sentry.util.w.c(c4728b3, "SentryEnvelopeItemHeader is required.");
        this.data = bArr;
        this.f50591b = null;
    }

    public static /* synthetic */ byte[] A(C4724b c4724b, long j10, InterfaceC4770k0 interfaceC4770k0, ILogger iLogger) {
        byte[] bArr;
        if (c4724b.g() != null) {
            byte[] g10 = c4724b.g();
            B(g10.length, j10, c4724b.i());
            return g10;
        }
        if (c4724b.k() != null) {
            byte[] c10 = io.sentry.util.o.c(interfaceC4770k0, iLogger, c4724b.k());
            if (c10 != null) {
                B(c10.length, j10, c4724b.i());
                return c10;
            }
        } else {
            if (c4724b.j() != null) {
                return AbstractC4851i.b(c4724b.j(), j10);
            }
            if (c4724b.f() != null && (bArr = (byte[]) c4724b.f().call()) != null) {
                B(bArr.length, j10, c4724b.i());
                return bArr;
            }
        }
        throw new io.sentry.exception.c(String.format("Couldn't attach the attachment %s.\nPlease check that either bytes, serializable, path or provider is set.", c4724b.i()));
    }

    public static void B(long j10, long j11, String str) {
        if (j10 > j11) {
            throw new io.sentry.exception.c(String.format("Dropping attachment with filename '%s', because the size of the passed bytes with %d bytes is bigger than the maximum allowed attachment size of %d bytes.", str, Long.valueOf(j10), Long.valueOf(j11)));
        }
    }

    public static C4665a3 C(final InterfaceC4770k0 interfaceC4770k0, final ILogger iLogger, final C4724b c4724b, final long j10) {
        final a aVar = new a(new Callable() { // from class: io.sentry.C2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C4665a3.A(C4724b.this, j10, interfaceC4770k0, iLogger);
            }
        });
        return new C4665a3(new C4728b3(EnumC4783m3.Attachment, new Callable() { // from class: io.sentry.D2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Integer valueOf;
                valueOf = Integer.valueOf(C4665a3.a.this.a().length);
                return valueOf;
            }
        }, c4724b.h(), c4724b.i(), c4724b.e()), new Callable() { // from class: io.sentry.E2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                byte[] a10;
                a10 = C4665a3.a.this.a();
                return a10;
            }
        });
    }

    public static C4665a3 D(final InterfaceC4770k0 interfaceC4770k0, final io.sentry.clientreport.c cVar) {
        io.sentry.util.w.c(interfaceC4770k0, "ISerializer is required.");
        io.sentry.util.w.c(cVar, "ClientReport is required.");
        final a aVar = new a(new Callable() { // from class: io.sentry.M2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C4665a3.d(InterfaceC4770k0.this, cVar);
            }
        });
        return new C4665a3(new C4728b3(EnumC4783m3.resolve(cVar), new Callable() { // from class: io.sentry.N2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Integer valueOf;
                valueOf = Integer.valueOf(C4665a3.a.this.a().length);
                return valueOf;
            }
        }, "application/json", null), new Callable() { // from class: io.sentry.O2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                byte[] a10;
                a10 = C4665a3.a.this.a();
                return a10;
            }
        });
    }

    public static C4665a3 E(final InterfaceC4770k0 interfaceC4770k0, final AbstractC4810q2 abstractC4810q2) {
        io.sentry.util.w.c(interfaceC4770k0, "ISerializer is required.");
        io.sentry.util.w.c(abstractC4810q2, "SentryEvent is required.");
        final a aVar = new a(new Callable() { // from class: io.sentry.I2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C4665a3.o(InterfaceC4770k0.this, abstractC4810q2);
            }
        });
        return new C4665a3(new C4728b3(EnumC4783m3.resolve(abstractC4810q2), new Callable() { // from class: io.sentry.J2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Integer valueOf;
                valueOf = Integer.valueOf(C4665a3.a.this.a().length);
                return valueOf;
            }
        }, "application/json", null), new Callable() { // from class: io.sentry.L2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                byte[] a10;
                a10 = C4665a3.a.this.a();
                return a10;
            }
        });
    }

    public static C4665a3 F(final InterfaceC4770k0 interfaceC4770k0, final C4815r3 c4815r3) {
        io.sentry.util.w.c(interfaceC4770k0, "ISerializer is required.");
        io.sentry.util.w.c(c4815r3, "SentryLogEvents is required.");
        final a aVar = new a(new Callable() { // from class: io.sentry.Z2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C4665a3.v(InterfaceC4770k0.this, c4815r3);
            }
        });
        return new C4665a3(new C4728b3(EnumC4783m3.Log, new Callable() { // from class: io.sentry.A2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Integer valueOf;
                valueOf = Integer.valueOf(C4665a3.a.this.a().length);
                return valueOf;
            }
        }, "application/vnd.sentry.items.log+json", (String) null, (String) null, (String) null, Integer.valueOf(c4815r3.a().size())), new Callable() { // from class: io.sentry.B2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                byte[] a10;
                a10 = C4665a3.a.this.a();
                return a10;
            }
        });
    }

    public static C4665a3 G(final InterfaceC4770k0 interfaceC4770k0, final C4862w3 c4862w3) {
        io.sentry.util.w.c(interfaceC4770k0, "ISerializer is required.");
        io.sentry.util.w.c(c4862w3, "SentryMetricsEvents is required.");
        final a aVar = new a(new Callable() { // from class: io.sentry.T2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C4665a3.t(InterfaceC4770k0.this, c4862w3);
            }
        });
        return new C4665a3(new C4728b3(EnumC4783m3.TraceMetric, new Callable() { // from class: io.sentry.U2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Integer valueOf;
                valueOf = Integer.valueOf(C4665a3.a.this.a().length);
                return valueOf;
            }
        }, "application/vnd.sentry.items.trace-metric+json", (String) null, (String) null, (String) null, Integer.valueOf(c4862w3.a().size())), new Callable() { // from class: io.sentry.V2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                byte[] a10;
                a10 = C4665a3.a.this.a();
                return a10;
            }
        });
    }

    public static C4665a3 H(final C4870y1 c4870y1, final InterfaceC4770k0 interfaceC4770k0, final InterfaceC4725b0 interfaceC4725b0) {
        final File q10 = c4870y1.q();
        final a aVar = new a(new Callable() { // from class: io.sentry.W2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C4665a3.x(q10, c4870y1, interfaceC4725b0, interfaceC4770k0);
            }
        });
        return new C4665a3(new C4728b3(EnumC4783m3.ProfileChunk, new Callable() { // from class: io.sentry.X2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Integer valueOf;
                valueOf = Integer.valueOf(C4665a3.a.this.a().length);
                return valueOf;
            }
        }, "application-json", q10 != null ? q10.getName() : null, (String) null, c4870y1.o(), (Integer) null), new Callable() { // from class: io.sentry.Y2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                byte[] a10;
                a10 = C4665a3.a.this.a();
                return a10;
            }
        });
    }

    public static C4665a3 I(final C1 c12, final long j10, final InterfaceC4770k0 interfaceC4770k0) {
        final File C10 = c12.C();
        final a aVar = new a(new Callable() { // from class: io.sentry.F2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C4665a3.p(C10, j10, c12, interfaceC4770k0);
            }
        });
        return new C4665a3(new C4728b3(EnumC4783m3.Profile, new Callable() { // from class: io.sentry.G2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Integer valueOf;
                valueOf = Integer.valueOf(C4665a3.a.this.a().length);
                return valueOf;
            }
        }, "application-json", C10.getName()), new Callable() { // from class: io.sentry.H2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                byte[] a10;
                a10 = C4665a3.a.this.a();
                return a10;
            }
        });
    }

    public static C4665a3 J(final InterfaceC4770k0 interfaceC4770k0, final ILogger iLogger, final G3 g32, final H1 h12, final boolean z10) {
        final File h02 = g32.h0();
        final a aVar = new a(new Callable() { // from class: io.sentry.P2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C4665a3.c(InterfaceC4770k0.this, g32, h12, h02, iLogger, z10);
            }
        });
        return new C4665a3(new C4728b3(EnumC4783m3.ReplayVideo, new Callable() { // from class: io.sentry.Q2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Integer valueOf;
                valueOf = Integer.valueOf(C4665a3.a.this.a().length);
                return valueOf;
            }
        }, null, null), new Callable() { // from class: io.sentry.R2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                byte[] a10;
                a10 = C4665a3.a.this.a();
                return a10;
            }
        });
    }

    public static C4665a3 K(final InterfaceC4770k0 interfaceC4770k0, final V3 v32) {
        io.sentry.util.w.c(interfaceC4770k0, "ISerializer is required.");
        io.sentry.util.w.c(v32, "Session is required.");
        final a aVar = new a(new Callable() { // from class: io.sentry.z2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C4665a3.w(InterfaceC4770k0.this, v32);
            }
        });
        return new C4665a3(new C4728b3(EnumC4783m3.Session, new Callable() { // from class: io.sentry.K2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Integer valueOf;
                valueOf = Integer.valueOf(C4665a3.a.this.a().length);
                return valueOf;
            }
        }, "application/json", null), new Callable() { // from class: io.sentry.S2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                byte[] a10;
                a10 = C4665a3.a.this.a();
                return a10;
            }
        });
    }

    public static byte[] S(Map map) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write((byte) (map.size() | 128));
            for (Map.Entry entry : map.entrySet()) {
                byte[] bytes = ((String) entry.getKey()).getBytes(f50589c);
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

    public static /* synthetic */ byte[] c(InterfaceC4770k0 interfaceC4770k0, G3 g32, H1 h12, File file, ILogger iLogger, boolean z10) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, f50589c), 512);
                try {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    interfaceC4770k0.a(g32, bufferedWriter);
                    linkedHashMap.put(EnumC4783m3.ReplayEvent.getItemType(), byteArrayOutputStream.toByteArray());
                    byteArrayOutputStream.reset();
                    if (h12 != null) {
                        interfaceC4770k0.a(h12, bufferedWriter);
                        linkedHashMap.put(EnumC4783m3.ReplayRecording.getItemType(), byteArrayOutputStream.toByteArray());
                        byteArrayOutputStream.reset();
                    }
                    if (file != null && file.exists()) {
                        byte[] b10 = AbstractC4851i.b(file.getPath(), 10485760L);
                        if (b10.length > 0) {
                            linkedHashMap.put(EnumC4783m3.ReplayVideo.getItemType(), b10);
                        }
                    }
                    byte[] S10 = S(linkedHashMap);
                    bufferedWriter.close();
                    byteArrayOutputStream.close();
                    if (file != null) {
                        if (z10) {
                            return S10;
                        }
                    }
                    return S10;
                } finally {
                }
            } finally {
            }
        } catch (Throwable th2) {
            try {
                iLogger.b(EnumC4788n3.ERROR, "Could not serialize replay recording", th2);
                if (file == null) {
                    return null;
                }
                if (z10) {
                    AbstractC4851i.a(file.getParentFile());
                    return null;
                }
                file.delete();
                return null;
            } finally {
                if (file != null) {
                    if (z10) {
                        AbstractC4851i.a(file.getParentFile());
                    } else {
                        file.delete();
                    }
                }
            }
        }
    }

    public static /* synthetic */ byte[] d(InterfaceC4770k0 interfaceC4770k0, io.sentry.clientreport.c cVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, f50589c), 512);
            try {
                interfaceC4770k0.a(cVar, bufferedWriter);
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

    public static /* synthetic */ byte[] o(InterfaceC4770k0 interfaceC4770k0, AbstractC4810q2 abstractC4810q2) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, f50589c), 512);
            try {
                interfaceC4770k0.a(abstractC4810q2, bufferedWriter);
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

    public static /* synthetic */ byte[] p(File file, long j10, C1 c12, InterfaceC4770k0 interfaceC4770k0) {
        if (!file.exists()) {
            throw new io.sentry.exception.c(String.format("Dropping profiling trace data, because the file '%s' doesn't exists", file.getName()));
        }
        String f10 = io.sentry.vendor.a.f(AbstractC4851i.b(file.getPath(), j10), 3);
        if (f10.isEmpty()) {
            throw new io.sentry.exception.c("Profiling trace file is empty");
        }
        c12.F(f10);
        c12.E();
        try {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, f50589c), 512);
                    try {
                        interfaceC4770k0.a(c12, bufferedWriter);
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
            } catch (IOException e10) {
                throw new io.sentry.exception.c(String.format("Failed to serialize profiling trace data\n%s", e10.getMessage()));
            }
        } finally {
            file.delete();
        }
    }

    public static /* synthetic */ byte[] t(InterfaceC4770k0 interfaceC4770k0, C4862w3 c4862w3) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, f50589c), 512);
            try {
                interfaceC4770k0.a(c4862w3, bufferedWriter);
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

    public static /* synthetic */ byte[] v(InterfaceC4770k0 interfaceC4770k0, C4815r3 c4815r3) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, f50589c), 512);
            try {
                interfaceC4770k0.a(c4815r3, bufferedWriter);
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

    public static /* synthetic */ byte[] w(InterfaceC4770k0 interfaceC4770k0, V3 v32) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, f50589c), 512);
            try {
                interfaceC4770k0.a(v32, bufferedWriter);
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

    public static /* synthetic */ byte[] x(File file, C4870y1 c4870y1, InterfaceC4725b0 interfaceC4725b0, InterfaceC4770k0 interfaceC4770k0) {
        if (file != null) {
            if (!file.exists()) {
                throw new io.sentry.exception.c(String.format("Dropping profile chunk, because the file '%s' doesn't exists", file.getName()));
            }
            if (!"java".equals(c4870y1.o())) {
                String f10 = io.sentry.vendor.a.f(AbstractC4851i.b(file.getPath(), 52428800L), 3);
                if (f10.isEmpty()) {
                    throw new io.sentry.exception.c("Profiling trace file is empty");
                }
                c4870y1.s(f10);
            } else {
                if (V0.b().equals(interfaceC4725b0)) {
                    throw new io.sentry.exception.c("No ProfileConverter available, dropping chunk.");
                }
                try {
                    c4870y1.t(interfaceC4725b0.a(file.getAbsolutePath()));
                } catch (Exception e10) {
                    throw new io.sentry.exception.c("Profile conversion failed", e10);
                }
            }
        }
        try {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, f50589c), 512);
                    try {
                        interfaceC4770k0.a(c4870y1, bufferedWriter);
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
            } catch (IOException e11) {
                throw new io.sentry.exception.c(String.format("Failed to serialize profile chunk\n%s", e11.getMessage()));
            }
        } finally {
            if (file != null) {
                file.delete();
            }
        }
    }

    public io.sentry.clientreport.c L(InterfaceC4770k0 interfaceC4770k0) {
        C4728b3 c4728b3 = this.f50590a;
        if (c4728b3 == null || c4728b3.e() != EnumC4783m3.ClientReport) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(M()), f50589c));
        try {
            io.sentry.clientreport.c cVar = (io.sentry.clientreport.c) interfaceC4770k0.c(bufferedReader, io.sentry.clientreport.c.class);
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

    public byte[] M() {
        Callable callable;
        if (this.data == null && (callable = this.f50591b) != null) {
            this.data = (byte[]) callable.call();
        }
        return this.data;
    }

    public C4733c3 N(InterfaceC4770k0 interfaceC4770k0) {
        C4728b3 c4728b3 = this.f50590a;
        if (c4728b3 == null || c4728b3.e() != EnumC4783m3.Event) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(M()), f50589c));
        try {
            C4733c3 c4733c3 = (C4733c3) interfaceC4770k0.c(bufferedReader, C4733c3.class);
            bufferedReader.close();
            return c4733c3;
        } catch (Throwable th2) {
            try {
                bufferedReader.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public C4728b3 O() {
        return this.f50590a;
    }

    public C4815r3 P(InterfaceC4770k0 interfaceC4770k0) {
        C4728b3 c4728b3 = this.f50590a;
        if (c4728b3 == null || c4728b3.e() != EnumC4783m3.Log) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(M()), f50589c));
        try {
            C4815r3 c4815r3 = (C4815r3) interfaceC4770k0.c(bufferedReader, C4815r3.class);
            bufferedReader.close();
            return c4815r3;
        } catch (Throwable th2) {
            try {
                bufferedReader.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public C4862w3 Q(InterfaceC4770k0 interfaceC4770k0) {
        C4728b3 c4728b3 = this.f50590a;
        if (c4728b3 == null || c4728b3.e() != EnumC4783m3.TraceMetric) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(M()), f50589c));
        try {
            C4862w3 c4862w3 = (C4862w3) interfaceC4770k0.c(bufferedReader, C4862w3.class);
            bufferedReader.close();
            return c4862w3;
        } catch (Throwable th2) {
            try {
                bufferedReader.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public io.sentry.protocol.B R(InterfaceC4770k0 interfaceC4770k0) {
        C4728b3 c4728b3 = this.f50590a;
        if (c4728b3 == null || c4728b3.e() != EnumC4783m3.Transaction) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(M()), f50589c));
        try {
            io.sentry.protocol.B b10 = (io.sentry.protocol.B) interfaceC4770k0.c(bufferedReader, io.sentry.protocol.B.class);
            bufferedReader.close();
            return b10;
        } catch (Throwable th2) {
            try {
                bufferedReader.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public C4665a3(C4728b3 c4728b3, Callable callable) {
        this.f50590a = (C4728b3) io.sentry.util.w.c(c4728b3, "SentryEnvelopeItemHeader is required.");
        this.f50591b = (Callable) io.sentry.util.w.c(callable, "DataFactory is required.");
        this.data = null;
    }
}
