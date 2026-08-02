package io.sentry;

import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class p4 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16719a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f16720b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g1 f16721c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f16722d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f16723e;

    public /* synthetic */ p4(a aVar, long j, g1 g1Var, ILogger iLogger) {
        this.f16722d = aVar;
        this.f16720b = j;
        this.f16721c = g1Var;
        this.f16723e = iLogger;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i5 = this.f16719a;
        g1 g1Var = this.f16721c;
        Object obj = this.f16723e;
        long j = this.f16720b;
        Object obj2 = this.f16722d;
        switch (i5) {
            case 0:
                a aVar = (a) obj2;
                ILogger iLogger = (ILogger) obj;
                byte[] bArr = aVar.f15432a;
                String str = aVar.f15435d;
                if (bArr == null) {
                    io.sentry.protocol.j0 j0Var = aVar.f15433b;
                    if (j0Var == null) {
                        com.google.firebase.messaging.i iVar = aVar.f15434c;
                        if (iVar != null && (bArr = (byte[]) iVar.call()) != null) {
                            r4.a(bArr.length, j, str);
                        }
                        throw new io.sentry.exception.b(androidx.appcompat.widget.c1.n("Couldn't attach the attachment ", str, ".\nPlease check that either bytes, serializable, path or provider is set."));
                    }
                    Charset charset = io.sentry.util.d.f17158a;
                    try {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        try {
                            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, io.sentry.util.d.f17158a));
                            try {
                                g1Var.a(j0Var, bufferedWriter);
                                bArr = byteArrayOutputStream.toByteArray();
                                bufferedWriter.close();
                                byteArrayOutputStream.close();
                            } finally {
                            }
                        } finally {
                        }
                    } catch (Throwable th2) {
                        iLogger.e(b5.ERROR, "Could not serialize serializable", th2);
                        bArr = null;
                    }
                    if (bArr != null) {
                        r4.a(bArr.length, j, str);
                    }
                    throw new io.sentry.exception.b(androidx.appcompat.widget.c1.n("Couldn't attach the attachment ", str, ".\nPlease check that either bytes, serializable, path or provider is set."));
                }
                r4.a(bArr.length, j, str);
                return bArr;
            default:
                File file = (File) obj2;
                j3 j3Var = (j3) obj;
                if (!file.exists()) {
                    throw new io.sentry.exception.b(androidx.appcompat.widget.c1.n("Dropping profiling trace data, because the file '", file.getName(), "' doesn't exists"));
                }
                try {
                    String str2 = new String(io.sentry.vendor.a.a(io.sentry.config.a.v(j, file.getPath())), "US-ASCII");
                    if (str2.isEmpty()) {
                        throw new io.sentry.exception.b("Profiling trace file is empty");
                    }
                    j3Var.B = str2;
                    try {
                        j3Var.f16549l = (List) j3Var.f16540b.call();
                    } catch (Throwable unused) {
                    }
                    try {
                        try {
                            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                            try {
                                BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream2, r4.f16984d));
                                try {
                                    g1Var.a(j3Var, bufferedWriter2);
                                    byte[] byteArray = byteArrayOutputStream2.toByteArray();
                                    bufferedWriter2.close();
                                    byteArrayOutputStream2.close();
                                    return byteArray;
                                } finally {
                                }
                            } catch (Throwable th3) {
                                try {
                                    byteArrayOutputStream2.close();
                                } catch (Throwable th4) {
                                    th3.addSuppressed(th4);
                                }
                                throw th3;
                            }
                        } finally {
                            file.delete();
                        }
                    } catch (IOException e7) {
                        throw new io.sentry.exception.b("Failed to serialize profiling trace data\n" + e7.getMessage());
                    }
                } catch (UnsupportedEncodingException e9) {
                    throw new AssertionError(e9);
                }
        }
    }

    public /* synthetic */ p4(File file, long j, j3 j3Var, g1 g1Var) {
        this.f16722d = file;
        this.f16720b = j;
        this.f16723e = j3Var;
        this.f16721c = g1Var;
    }
}
