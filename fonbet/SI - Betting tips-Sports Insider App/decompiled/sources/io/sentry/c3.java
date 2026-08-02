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
import java.util.concurrent.CountDownLatch;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class c3 extends w {

    /* renamed from: i, reason: collision with root package name */
    public static final Charset f16226i = Charset.forName("UTF-8");

    /* renamed from: e, reason: collision with root package name */
    public final b1 f16227e;

    /* renamed from: f, reason: collision with root package name */
    public final s0 f16228f;

    /* renamed from: g, reason: collision with root package name */
    public final g1 f16229g;

    /* renamed from: h, reason: collision with root package name */
    public final ILogger f16230h;

    public c3(b1 b1Var, s0 s0Var, g1 g1Var, ILogger iLogger, long j, int i5) {
        super(b1Var, iLogger, j, i5);
        y4.a.C(b1Var, "Scopes are required.");
        this.f16227e = b1Var;
        y4.a.C(s0Var, "Envelope reader is required.");
        this.f16228f = s0Var;
        y4.a.C(g1Var, "Serializer is required.");
        this.f16229g = g1Var;
        y4.a.C(iLogger, "Logger is required.");
        this.f16230h = iLogger;
    }

    public static /* synthetic */ void c(c3 c3Var, File file, io.sentry.hints.h hVar) {
        ILogger iLogger = c3Var.f16230h;
        if (hVar.a()) {
            return;
        }
        try {
            if (file.delete()) {
                return;
            }
            iLogger.h(b5.ERROR, "Failed to delete: %s", file.getAbsolutePath());
        } catch (RuntimeException e7) {
            iLogger.b(b5.ERROR, e7, "Failed to delete: %s", file.getAbsolutePath());
        }
    }

    @Override // io.sentry.w
    public final boolean a(String str) {
        return (str == null || str.startsWith("session") || str.startsWith("previous_session") || str.startsWith("startup_crash")) ? false : true;
    }

    @Override // io.sentry.w
    public final void b(File file, h0 h0Var) {
        boolean a7 = a(file.getName());
        ILogger iLogger = this.f16230h;
        try {
            if (!a7) {
                iLogger.h(b5.DEBUG, "File '%s' should be ignored.", file.getAbsolutePath());
                return;
            }
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                try {
                    l1.a a10 = this.f16228f.a(bufferedInputStream);
                    if (a10 == null) {
                        iLogger.h(b5.ERROR, "Stream from path %s resulted in a null envelope.", file.getAbsolutePath());
                    } else {
                        e(a10, h0Var);
                        iLogger.h(b5.DEBUG, "File '%s' is done.", file.getAbsolutePath());
                    }
                    bufferedInputStream.close();
                    Object b10 = h0Var.b("sentry:typeCheckHint");
                    if (!io.sentry.hints.h.class.isInstance(h0Var.b("sentry:typeCheckHint")) || b10 == null) {
                        u6.h.r(io.sentry.hints.h.class, b10, iLogger);
                    } else {
                        c(this, file, (io.sentry.hints.h) b10);
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
                iLogger.e(b5.ERROR, "Error processing envelope.", e7);
                Object b11 = h0Var.b("sentry:typeCheckHint");
                if (!io.sentry.hints.h.class.isInstance(h0Var.b("sentry:typeCheckHint")) || b11 == null) {
                    u6.h.r(io.sentry.hints.h.class, b11, iLogger);
                } else {
                    c(this, file, (io.sentry.hints.h) b11);
                }
            }
        } catch (Throwable th4) {
            Object b12 = h0Var.b("sentry:typeCheckHint");
            if (!io.sentry.hints.h.class.isInstance(h0Var.b("sentry:typeCheckHint")) || b12 == null) {
                u6.h.r(io.sentry.hints.h.class, b12, iLogger);
            } else {
                c(this, file, (io.sentry.hints.h) b12);
            }
            throw th4;
        }
    }

    public final c4.d d(t6 t6Var) {
        String str;
        ILogger iLogger = this.f16230h;
        if (t6Var != null && (str = t6Var.f17109g) != null) {
            try {
                Double valueOf = Double.valueOf(Double.parseDouble(str));
                if (ci.c.I(valueOf, false)) {
                    String str2 = t6Var.f17110h;
                    if (str2 != null) {
                        Double valueOf2 = Double.valueOf(Double.parseDouble(str2));
                        if (ci.c.I(valueOf2, false)) {
                            return new c4.d(Boolean.TRUE, valueOf, valueOf2);
                        }
                    }
                    return ci.c.e(new c4.d(Boolean.TRUE, valueOf));
                }
                iLogger.h(b5.ERROR, "Invalid sample rate parsed from TraceContext: %s", str);
            } catch (Exception unused) {
                iLogger.h(b5.ERROR, "Unable to parse sample rate from TraceContext: %s", str);
            }
        }
        return new c4.d(Boolean.TRUE, (Double) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x02a2 A[ADDED_TO_REGION] */
    /* JADX WARN: Type inference failed for: r23v1 */
    /* JADX WARN: Type inference failed for: r23v10 */
    /* JADX WARN: Type inference failed for: r23v11 */
    /* JADX WARN: Type inference failed for: r23v12 */
    /* JADX WARN: Type inference failed for: r23v13 */
    /* JADX WARN: Type inference failed for: r23v14 */
    /* JADX WARN: Type inference failed for: r23v15 */
    /* JADX WARN: Type inference failed for: r23v2 */
    /* JADX WARN: Type inference failed for: r23v3 */
    /* JADX WARN: Type inference failed for: r23v4 */
    /* JADX WARN: Type inference failed for: r23v6 */
    /* JADX WARN: Type inference failed for: r23v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(l1.a aVar, h0 h0Var) {
        int i5;
        Iterator it;
        int i10;
        String str;
        boolean z5;
        int i11;
        Object b10;
        Object b11;
        String str2;
        BufferedReader bufferedReader;
        b5 b5Var = b5.DEBUG;
        Iterable iterable = (Iterable) aVar.f19315c;
        m4 m4Var = (m4) aVar.f19314b;
        ?? r6 = 0;
        if (iterable instanceof Collection) {
            i5 = ((Collection) iterable).size();
        } else {
            Iterator it2 = iterable.iterator();
            int i12 = 0;
            while (it2.hasNext()) {
                it2.next();
                i12++;
            }
            i5 = i12;
        }
        int i13 = 1;
        Object[] objArr = {Integer.valueOf(i5)};
        ILogger iLogger = this.f16230h;
        iLogger.h(b5Var, "Processing Envelope with %d item(s)", objArr);
        Iterator it3 = iterable.iterator();
        int i14 = 0;
        while (it3.hasNext()) {
            r4 r4Var = (r4) it3.next();
            int i15 = i14 + 1;
            s4 s4Var = r4Var.f16985a;
            s4 s4Var2 = r4Var.f16985a;
            if (s4Var == null) {
                b5 b5Var2 = b5.ERROR;
                Object[] objArr2 = new Object[i13];
                objArr2[r6] = Integer.valueOf(i15);
                iLogger.h(b5Var2, "Item %d has no header", objArr2);
                it = it3;
                z5 = r6;
                i11 = i13;
                i10 = i15;
            } else {
                boolean equals = a5.Event.equals(s4Var.f17078e);
                ?? r23 = r6;
                int i16 = i13;
                g1 g1Var = this.f16229g;
                it = it3;
                Charset charset = f16226i;
                i10 = i15;
                b1 b1Var = this.f16227e;
                if (equals) {
                    try {
                        str = "Item failed to process.";
                    } catch (Throwable th2) {
                        th = th2;
                        str = "Item failed to process.";
                    }
                    try {
                        BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(r4Var.f()), charset));
                        try {
                            t4 t4Var = (t4) g1Var.c(bufferedReader2, t4.class);
                            if (t4Var == null) {
                                b5 b5Var3 = b5.ERROR;
                                Integer valueOf = Integer.valueOf(i10);
                                a5 a5Var = s4Var2.f17078e;
                                Object[] objArr3 = new Object[2];
                                objArr3[r23 == true ? 1 : 0] = valueOf;
                                objArr3[i16] = a5Var;
                                iLogger.h(b5Var3, "Item %d of type %s returned null by the parser.", objArr3);
                            } else {
                                io.sentry.protocol.t tVar = t4Var.f16457c;
                                if (tVar != null) {
                                    String str3 = tVar.f16910a;
                                    if (str3.startsWith("sentry.javascript") || str3.startsWith("sentry.dart") || str3.startsWith("sentry.dotnet")) {
                                        h0Var.d(Boolean.TRUE, "sentry:isFromHybridSdk");
                                    }
                                }
                                io.sentry.protocol.v vVar = m4Var.f16641a;
                                if (vVar == null || vVar.equals(t4Var.f16455a)) {
                                    b1Var.E(t4Var, h0Var);
                                    b5 b5Var4 = b5.DEBUG;
                                    Object[] objArr4 = new Object[i16];
                                    objArr4[r23 == true ? 1 : 0] = Integer.valueOf(i10);
                                    iLogger.h(b5Var4, "Item %d is being captured.", objArr4);
                                    if (!f(h0Var)) {
                                        io.sentry.protocol.v vVar2 = t4Var.f16455a;
                                        b5 b5Var5 = b5.WARNING;
                                        Object[] objArr5 = new Object[1];
                                        objArr5[r23 == true ? 1 : 0] = vVar2;
                                        iLogger.h(b5Var5, "Timed out waiting for event id submission: %s", objArr5);
                                        bufferedReader2.close();
                                        return;
                                    }
                                } else {
                                    io.sentry.protocol.v vVar3 = t4Var.f16455a;
                                    b5 b5Var6 = b5.ERROR;
                                    Integer valueOf2 = Integer.valueOf(i10);
                                    io.sentry.protocol.v vVar4 = m4Var.f16641a;
                                    Object[] objArr6 = new Object[3];
                                    objArr6[r23 == true ? 1 : 0] = valueOf2;
                                    objArr6[i16] = vVar4;
                                    objArr6[2] = vVar3;
                                    iLogger.h(b5Var6, "Item %d of has a different event id (%s) to the envelope header (%s)", objArr6);
                                    bufferedReader2.close();
                                    z5 = r23 == true ? 1 : 0;
                                    i11 = i16;
                                }
                            }
                            bufferedReader2.close();
                        } finally {
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        iLogger.e(b5.ERROR, str, th);
                        b10 = h0Var.b("sentry:typeCheckHint");
                        if (!(b10 instanceof io.sentry.hints.k)) {
                        }
                        b11 = h0Var.b("sentry:typeCheckHint");
                        if (io.sentry.android.core.r0.class.isInstance(h0Var.b("sentry:typeCheckHint"))) {
                        }
                        z5 = r23 == true ? 1 : 0;
                        i11 = 1;
                        i13 = i11;
                        it3 = it;
                        i14 = i10;
                        r6 = z5;
                    }
                } else {
                    a5 a5Var2 = a5.Transaction;
                    a5 a5Var3 = s4Var.f17078e;
                    a5 a5Var4 = s4Var.f17078e;
                    if (a5Var2.equals(a5Var3)) {
                        try {
                            str2 = "Item failed to process.";
                            try {
                                bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(r4Var.f()), charset));
                            } catch (Throwable th4) {
                                th = th4;
                                iLogger.e(b5.ERROR, str2, th);
                                b10 = h0Var.b("sentry:typeCheckHint");
                                if (!(b10 instanceof io.sentry.hints.k)) {
                                }
                                b11 = h0Var.b("sentry:typeCheckHint");
                                if (io.sentry.android.core.r0.class.isInstance(h0Var.b("sentry:typeCheckHint"))) {
                                    io.sentry.android.core.r0 r0Var = (io.sentry.android.core.r0) b11;
                                    i11 = 1;
                                    r0Var.f15830c = new CountDownLatch(1);
                                    z5 = r23 == true ? 1 : 0;
                                    r0Var.f15828a = z5;
                                    r0Var.f15829b = z5;
                                    i13 = i11;
                                    it3 = it;
                                    i14 = i10;
                                    r6 = z5;
                                }
                                z5 = r23 == true ? 1 : 0;
                                i11 = 1;
                                i13 = i11;
                                it3 = it;
                                i14 = i10;
                                r6 = z5;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            str2 = "Item failed to process.";
                        }
                        try {
                            io.sentry.protocol.e0 e0Var = (io.sentry.protocol.e0) g1Var.c(bufferedReader, io.sentry.protocol.e0.class);
                            if (e0Var == null) {
                                b5 b5Var7 = b5.ERROR;
                                Integer valueOf3 = Integer.valueOf(i10);
                                a5 a5Var5 = s4Var2.f17078e;
                                Object[] objArr7 = new Object[2];
                                objArr7[r23 == true ? 1 : 0] = valueOf3;
                                objArr7[1] = a5Var5;
                                iLogger.h(b5Var7, "Item %d of type %s returned null by the parser.", objArr7);
                            } else {
                                io.sentry.protocol.v vVar5 = m4Var.f16641a;
                                if (vVar5 == null || vVar5.equals(e0Var.f16455a)) {
                                    t6 t6Var = m4Var.f16643c;
                                    if (e0Var.f16456b.i() != null) {
                                        e0Var.f16456b.i().a(d(t6Var));
                                    }
                                    b1Var.t(e0Var, t6Var, h0Var);
                                    b5 b5Var8 = b5.DEBUG;
                                    Object[] objArr8 = new Object[1];
                                    objArr8[r23 == true ? 1 : 0] = Integer.valueOf(i10);
                                    iLogger.h(b5Var8, "Item %d is being captured.", objArr8);
                                    if (!f(h0Var)) {
                                        io.sentry.protocol.v vVar6 = e0Var.f16455a;
                                        b5 b5Var9 = b5.WARNING;
                                        Object[] objArr9 = new Object[1];
                                        objArr9[r23 == true ? 1 : 0] = vVar6;
                                        iLogger.h(b5Var9, "Timed out waiting for event id submission: %s", objArr9);
                                        bufferedReader.close();
                                        return;
                                    }
                                } else {
                                    io.sentry.protocol.v vVar7 = e0Var.f16455a;
                                    b5 b5Var10 = b5.ERROR;
                                    Integer valueOf4 = Integer.valueOf(i10);
                                    io.sentry.protocol.v vVar8 = m4Var.f16641a;
                                    Object[] objArr10 = new Object[3];
                                    objArr10[r23 == true ? 1 : 0] = valueOf4;
                                    objArr10[1] = vVar8;
                                    objArr10[2] = vVar7;
                                    iLogger.h(b5Var10, "Item %d of has a different event id (%s) to the envelope header (%s)", objArr10);
                                    bufferedReader.close();
                                    z5 = r23 == true ? 1 : 0;
                                    i11 = 1;
                                }
                            }
                            bufferedReader.close();
                        } finally {
                            try {
                                bufferedReader.close();
                                throw th;
                            } catch (Throwable th6) {
                                th.addSuppressed(th6);
                            }
                        }
                    } else {
                        b1Var.l(new l1.a(m4Var.f16641a, m4Var.f16642b, r4Var), h0Var);
                        b5 b5Var11 = b5.DEBUG;
                        String itemType = a5Var4.getItemType();
                        Integer valueOf5 = Integer.valueOf(i10);
                        Object[] objArr11 = new Object[2];
                        objArr11[r23 == true ? 1 : 0] = itemType;
                        objArr11[1] = valueOf5;
                        iLogger.h(b5Var11, "%s item %d is being captured.", objArr11);
                        if (!f(h0Var)) {
                            b5 b5Var12 = b5.WARNING;
                            Object[] objArr12 = new Object[1];
                            objArr12[r23 == true ? 1 : 0] = a5Var4.getItemType();
                            iLogger.h(b5Var12, "Timed out waiting for item type submission: %s", objArr12);
                            return;
                        }
                    }
                }
                b10 = h0Var.b("sentry:typeCheckHint");
                if (!(b10 instanceof io.sentry.hints.k) && !((io.sentry.hints.k) b10).e()) {
                    b5 b5Var13 = b5.WARNING;
                    Object[] objArr13 = new Object[1];
                    objArr13[r23 == true ? 1 : 0] = Integer.valueOf(i10);
                    iLogger.h(b5Var13, "Envelope had a failed capture at item %d. No more items will be sent.", objArr13);
                    return;
                }
                b11 = h0Var.b("sentry:typeCheckHint");
                if (io.sentry.android.core.r0.class.isInstance(h0Var.b("sentry:typeCheckHint")) && b11 != null) {
                    io.sentry.android.core.r0 r0Var2 = (io.sentry.android.core.r0) b11;
                    i11 = 1;
                    r0Var2.f15830c = new CountDownLatch(1);
                    z5 = r23 == true ? 1 : 0;
                    r0Var2.f15828a = z5;
                    r0Var2.f15829b = z5;
                }
                z5 = r23 == true ? 1 : 0;
                i11 = 1;
            }
            i13 = i11;
            it3 = it;
            i14 = i10;
            r6 = z5;
        }
    }

    public final boolean f(h0 h0Var) {
        Object b10 = h0Var.b("sentry:typeCheckHint");
        if (b10 instanceof io.sentry.hints.f) {
            return ((io.sentry.hints.f) b10).d();
        }
        u6.h.r(io.sentry.hints.f.class, b10, this.f16230h);
        return true;
    }
}
