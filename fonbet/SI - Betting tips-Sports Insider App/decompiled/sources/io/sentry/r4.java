package io.sentry;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class r4 {

    /* renamed from: d, reason: collision with root package name */
    public static final Charset f16984d = Charset.forName("UTF-8");

    /* renamed from: a, reason: collision with root package name */
    public final s4 f16985a;

    /* renamed from: b, reason: collision with root package name */
    public final Callable f16986b;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f16987c;

    public r4(s4 s4Var, byte[] bArr) {
        this.f16985a = s4Var;
        this.f16987c = bArr;
        this.f16986b = null;
    }

    public static void a(long j, long j6, String str) {
        if (j > j6) {
            throw new io.sentry.exception.b(String.format("Dropping attachment with filename '%s', because the size of the passed bytes with %d bytes is bigger than the maximum allowed attachment size of %d bytes.", str, Long.valueOf(j), Long.valueOf(j6)));
        }
    }

    public static r4 b(g1 g1Var, io.sentry.clientreport.c cVar) {
        y4.a.C(g1Var, "ISerializer is required.");
        d7.e eVar = new d7.e(10, new com.google.firebase.messaging.i(3, g1Var, cVar));
        return new r4(new s4(a5.resolve(cVar), new o4(eVar, 9), "application/json", null, null), new o4(eVar, 10));
    }

    public static r4 c(final g3 g3Var, final g1 g1Var, final y0 y0Var) {
        final File file = g3Var.f16434k;
        d7.e eVar = new d7.e(10, new Callable() { // from class: io.sentry.n4
            @Override // java.util.concurrent.Callable
            public final Object call() {
                g1 g1Var2 = g1Var;
                File file2 = file;
                if (!file2.exists()) {
                    throw new io.sentry.exception.b(androidx.appcompat.widget.c1.n("Dropping profile chunk, because the file '", file2.getName(), "' doesn't exists"));
                }
                g3 g3Var2 = g3Var;
                if ("java".equals(g3Var2.f16430f)) {
                    o2 o2Var = o2.f16683a;
                    y0 y0Var2 = y0Var;
                    if (o2Var.equals(y0Var2)) {
                        throw new io.sentry.exception.b("No ProfileConverter available, dropping chunk.");
                    }
                    try {
                        file2.getAbsolutePath();
                        ((o2) y0Var2).getClass();
                        g3Var2.f16436m = new io.sentry.protocol.profiling.a();
                    } catch (Exception e7) {
                        throw new io.sentry.exception.b("Profile conversion failed", e7);
                    }
                } else {
                    try {
                        String str = new String(io.sentry.vendor.a.a(io.sentry.config.a.v(52428800L, file2.getPath())), "US-ASCII");
                        if (str.isEmpty()) {
                            throw new io.sentry.exception.b("Profiling trace file is empty");
                        }
                        g3Var2.f16435l = str;
                    } catch (UnsupportedEncodingException e9) {
                        throw new AssertionError(e9);
                    }
                }
                try {
                    try {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        try {
                            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, r4.f16984d));
                            try {
                                g1Var2.a(g3Var2, bufferedWriter);
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
                        throw new io.sentry.exception.b("Failed to serialize profile chunk\n" + e10.getMessage());
                    }
                } finally {
                    file2.delete();
                }
            }
        });
        return new r4(new s4(a5.ProfileChunk, new o4(eVar, 7), "application-json", file.getName(), (String) null, g3Var.f16430f, (Integer) null), new o4(eVar, 13));
    }

    public static r4 d(g1 g1Var, l6 l6Var) {
        y4.a.C(g1Var, "ISerializer is required.");
        y4.a.C(l6Var, "Session is required.");
        d7.e eVar = new d7.e(10, new com.google.firebase.messaging.i(4, g1Var, l6Var));
        return new r4(new s4(a5.Session, new o4(eVar, 14), "application/json", null, null), new o4(eVar, 15));
    }

    public static byte[] j(LinkedHashMap linkedHashMap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write((byte) (linkedHashMap.size() | 128));
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                byte[] bytes = ((String) entry.getKey()).getBytes(f16984d);
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

    public final io.sentry.clientreport.c e(g1 g1Var) {
        s4 s4Var = this.f16985a;
        if (s4Var == null || s4Var.f17078e != a5.ClientReport) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(f()), f16984d));
        try {
            io.sentry.clientreport.c cVar = (io.sentry.clientreport.c) g1Var.c(bufferedReader, io.sentry.clientreport.c.class);
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

    public final byte[] f() {
        Callable callable;
        if (this.f16987c == null && (callable = this.f16986b) != null) {
            this.f16987c = (byte[]) callable.call();
        }
        return this.f16987c;
    }

    public final e5 g(g1 g1Var) {
        s4 s4Var = this.f16985a;
        if (s4Var == null || s4Var.f17078e != a5.Log) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(f()), f16984d));
        try {
            e5 e5Var = (e5) g1Var.c(bufferedReader, e5.class);
            bufferedReader.close();
            return e5Var;
        } catch (Throwable th2) {
            try {
                bufferedReader.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final i5 h(g1 g1Var) {
        s4 s4Var = this.f16985a;
        if (s4Var == null || s4Var.f17078e != a5.TraceMetric) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(f()), f16984d));
        try {
            i5 i5Var = (i5) g1Var.c(bufferedReader, i5.class);
            bufferedReader.close();
            return i5Var;
        } catch (Throwable th2) {
            try {
                bufferedReader.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final io.sentry.protocol.e0 i(g1 g1Var) {
        s4 s4Var = this.f16985a;
        if (s4Var == null || s4Var.f17078e != a5.Transaction) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(f()), f16984d));
        try {
            io.sentry.protocol.e0 e0Var = (io.sentry.protocol.e0) g1Var.c(bufferedReader, io.sentry.protocol.e0.class);
            bufferedReader.close();
            return e0Var;
        } catch (Throwable th2) {
            try {
                bufferedReader.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public r4(s4 s4Var, Callable callable) {
        this.f16985a = s4Var;
        this.f16986b = callable;
        this.f16987c = null;
    }
}
