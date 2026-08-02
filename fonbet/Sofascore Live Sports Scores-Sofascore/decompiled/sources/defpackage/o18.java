package defpackage;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class o18 implements lfi {
    public final File a;
    public final c6h b;
    public final h7a c;
    public final qo6 d;
    public final AtomicBoolean e;
    public final j2d f;

    public o18(File file, c6h c6hVar, h7a h7aVar, qo6 qo6Var) {
        c6hVar.getClass();
        h7aVar.getClass();
        this.a = file;
        this.b = c6hVar;
        this.c = h7aVar;
        this.d = qo6Var;
        this.e = new AtomicBoolean(false);
        this.f = new j2d();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(4:(3:(5:(2:3|(11:5|6|7|(1:(1:(8:11|12|13|14|15|16|17|(5:19|(4:21|22|23|(2:25|26))|30|31|32)(1:33))(2:44|45))(1:46))(2:64|(3:66|(2:68|(2:70|71))|72)(2:74|75))|47|48|49|51|52|(6:55|14|15|16|17|(0)(0))|54))|51|52|(0)|54)|48|49)|7|(0)(0)|47) */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0086, code lost:
    
        if (r12.e(r1) == r2) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0109, code lost:
    
        r10 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x010a, code lost:
    
        r3 = r11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00c9 A[Catch: all -> 0x0107, IOException -> 0x0109, TRY_ENTER, TRY_LEAVE, TryCatch #0 {IOException -> 0x0109, blocks: (B:19:0x00c9, B:25:0x00e8, B:26:0x0106, B:33:0x0115, B:40:0x0123, B:43:0x0120), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0115 A[Catch: all -> 0x0107, IOException -> 0x0109, TRY_ENTER, TRY_LEAVE, TryCatch #0 {IOException -> 0x0109, blocks: (B:19:0x00c9, B:25:0x00e8, B:26:0x0106, B:33:0x0115, B:40:0x0123, B:43:0x0120), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /* JADX WARN: Type inference failed for: r11v7, types: [h2d] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3, types: [h2d] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.io.File, java.lang.Object] */
    @Override // defpackage.lfi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(pf4 pf4Var, sq3 sq3Var) {
        n18 n18Var;
        ?? r12;
        lu3 lu3Var;
        int i;
        ?? r3;
        j2d j2dVar;
        Function2 function2;
        z18 z18Var;
        Throwable th;
        z18 z18Var2;
        h2d h2dVar;
        File file;
        try {
            try {
                try {
                    try {
                        if (sq3Var instanceof n18) {
                            n18Var = (n18) sq3Var;
                            int i2 = n18Var.w;
                            if ((i2 & Integer.MIN_VALUE) != 0) {
                                n18Var.w = i2 - Integer.MIN_VALUE;
                                r12 = n18Var.u;
                                lu3Var = lu3.a;
                                i = n18Var.w;
                                boolean z = true;
                                File file2 = this.a;
                                if (i != 0) {
                                    y6a.M(r12);
                                    if (this.e.get()) {
                                        a70.r("StorageConnection has already been disposed.");
                                        return null;
                                    }
                                    File parentFile = file2.getCanonicalFile().getParentFile();
                                    if (parentFile != null) {
                                        parentFile.mkdirs();
                                        if (!parentFile.isDirectory()) {
                                            is8.e(fc6.k(file2, "Unable to create parent directories of "));
                                            return null;
                                        }
                                    }
                                    n18Var.r = pf4Var;
                                    j2dVar = this.f;
                                    n18Var.s = j2dVar;
                                    n18Var.w = 1;
                                    function2 = pf4Var;
                                } else {
                                    if (i != 1) {
                                        if (i != 2) {
                                            a70.r("call to 'resume' before 'invoke' with coroutine");
                                            return null;
                                        }
                                        z18Var2 = n18Var.t;
                                        file = (File) n18Var.s;
                                        h2dVar = (h2d) n18Var.r;
                                        try {
                                            y6a.M(r12);
                                            Unit unit = Unit.a;
                                            try {
                                                z18Var2.close();
                                                th = null;
                                            } catch (Throwable th2) {
                                                th = th2;
                                            }
                                            if (th == null) {
                                                throw th;
                                            }
                                            if (file.exists()) {
                                                try {
                                                    Files.move(file.toPath(), file2.toPath(), StandardCopyOption.REPLACE_EXISTING);
                                                } catch (IOException unused) {
                                                    z = false;
                                                }
                                                if (!z) {
                                                    throw new IOException("Unable to rename " + file + " to " + file2 + ". This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
                                                }
                                            }
                                            Unit unit2 = Unit.a;
                                            h2dVar.f(null);
                                            return Unit.a;
                                        } catch (Throwable th3) {
                                            th = th3;
                                            try {
                                                z18Var2.close();
                                            } catch (Throwable th4) {
                                                de6.a(th, th4);
                                            }
                                            throw th;
                                        }
                                    }
                                    ?? r11 = (h2d) n18Var.s;
                                    Function2 function22 = (Function2) n18Var.r;
                                    y6a.M(r12);
                                    j2dVar = r11;
                                    function2 = function22;
                                }
                                r3 = new File(file2.getAbsolutePath() + ".tmp");
                                c6h c6hVar = this.b;
                                c6hVar.getClass();
                                z18Var = new z18(r3, c6hVar);
                                n18Var.r = j2dVar;
                                n18Var.s = r3;
                                n18Var.t = z18Var;
                                n18Var.w = 2;
                                if (function2.invoke(z18Var, n18Var) != lu3Var) {
                                    h2dVar = j2dVar;
                                    file = r3;
                                    z18Var2 = z18Var;
                                    Unit unit3 = Unit.a;
                                    z18Var2.close();
                                    th = null;
                                    if (th == null) {
                                    }
                                }
                                return lu3Var;
                            }
                        }
                        n18Var.r = j2dVar;
                        n18Var.s = r3;
                        n18Var.t = z18Var;
                        n18Var.w = 2;
                        if (function2.invoke(z18Var, n18Var) != lu3Var) {
                        }
                        return lu3Var;
                    } catch (Throwable th5) {
                        th = th5;
                        z18Var2 = z18Var;
                        z18Var2.close();
                        throw th;
                    }
                    c6h c6hVar2 = this.b;
                    c6hVar2.getClass();
                    z18Var = new z18(r3, c6hVar2);
                } catch (IOException e) {
                    e = e;
                    if (r3.exists()) {
                        r3.delete();
                    }
                    throw e;
                }
                if (i != 0) {
                }
                r3 = new File(file2.getAbsolutePath() + ".tmp");
            } catch (Throwable th6) {
                th = th6;
                r12.f(null);
                throw th;
            }
        } catch (Throwable th7) {
            th = th7;
            r12 = n18Var;
            r12.f(null);
            throw th;
        }
        n18Var = new n18(this, sq3Var);
        r12 = n18Var.u;
        lu3Var = lu3.a;
        i = n18Var.w;
        boolean z2 = true;
        File file22 = this.a;
    }

    @Override // defpackage.hz2
    public final void close() {
        this.e.set(true);
        this.d.invoke();
    }

    @Override // defpackage.lfi
    public final h7a d() {
        return this.c;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(8:5|6|7|(1:(3:10|11|12)(2:32|33))(2:34|(6:36|37|38|40|41|(1:43)(1:44))(2:52|53))|13|14|15|(2:(1:18)|19)(1:21)))|56|6|7|(0)(0)|13|14|15|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0068, code lost:
    
        r8 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0071 A[Catch: all -> 0x0072, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0072, blocks: (B:21:0x0071, B:28:0x0082, B:31:0x007f, B:27:0x007a), top: B:7:0x0022, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Type inference failed for: r7v0, types: [o18] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v0, types: [ff4] */
    @Override // defpackage.lfi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(ff4 ff4Var, sq3 sq3Var) {
        m18 m18Var;
        int i;
        boolean z;
        Throwable th;
        k18 k18Var;
        boolean z2;
        try {
            if (sq3Var instanceof m18) {
                m18Var = (m18) sq3Var;
                int i2 = m18Var.v;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    m18Var.v = i2 - Integer.MIN_VALUE;
                    Object obj = m18Var.t;
                    lu3 lu3Var = lu3.a;
                    i = m18Var.v;
                    j2d j2dVar = this.f;
                    if (i != 0) {
                        y6a.M(obj);
                        if (this.e.get()) {
                            a70.r("StorageConnection has already been disposed.");
                            return null;
                        }
                        z = j2dVar.g();
                        try {
                            k18 k18Var2 = new k18(this.a, this.b);
                            try {
                                Boolean valueOf = Boolean.valueOf(z);
                                m18Var.s = k18Var2;
                                m18Var.r = z;
                                m18Var.v = 1;
                                Object invoke = ff4Var.invoke(k18Var2, valueOf, m18Var);
                                if (invoke == lu3Var) {
                                    return lu3Var;
                                }
                                obj = invoke;
                                z2 = z;
                                k18Var = k18Var2;
                            } catch (Throwable th2) {
                                th = th2;
                                this = z;
                                k18Var = k18Var2;
                                k18Var.close();
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            if (z) {
                                j2dVar.f(null);
                            }
                            throw th;
                        }
                    } else {
                        if (i != 1) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        this = m18Var.r;
                        k18Var = m18Var.s;
                        try {
                            y6a.M(obj);
                            z2 = this;
                        } catch (Throwable th4) {
                            th = th4;
                            try {
                                k18Var.close();
                            } catch (Throwable th5) {
                                de6.a(th, th5);
                            }
                            throw th;
                        }
                    }
                    k18Var.close();
                    th = null;
                    if (th == null) {
                        throw th;
                    }
                    if (z2) {
                        j2dVar.f(null);
                    }
                    return obj;
                }
            }
            if (i != 0) {
            }
            k18Var.close();
            th = null;
            if (th == null) {
            }
        } catch (Throwable th6) {
            th = th6;
            z = this;
        }
        m18Var = new m18(this, sq3Var);
        Object obj2 = m18Var.t;
        lu3 lu3Var2 = lu3.a;
        i = m18Var.v;
        j2d j2dVar2 = this.f;
    }
}
