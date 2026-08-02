package c1;

import android.os.Build;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class p0 implements a {

    /* renamed from: a, reason: collision with root package name */
    public final File f3460a;

    /* renamed from: b, reason: collision with root package name */
    public final b1 f3461b;

    /* renamed from: c, reason: collision with root package name */
    public final a2.q f3462c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f3463d;

    /* renamed from: e, reason: collision with root package name */
    public final ng.c f3464e;

    public p0(File file, b1 coordinator, a2.q onClose) {
        Intrinsics.checkNotNullParameter(file, "file");
        g1.f serializer = g1.f.f9708a;
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        Intrinsics.checkNotNullParameter(coordinator, "coordinator");
        Intrinsics.checkNotNullParameter(onClose, "onClose");
        this.f3460a = file;
        this.f3461b = coordinator;
        this.f3462c = onClose;
        this.f3463d = new AtomicBoolean(false);
        this.f3464e = new ng.c();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(8:5|6|7|(1:(3:10|11|12)(2:32|33))(2:34|(6:36|37|38|40|41|(1:43)(1:44))(2:53|54))|13|14|15|(2:(1:18)|19)(1:21)))|56|6|7|(0)(0)|13|14|15|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0068, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0071 A[Catch: all -> 0x0072, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0072, blocks: (B:21:0x0071, B:28:0x0081, B:31:0x007e, B:27:0x0079), top: B:7:0x0022, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Type inference failed for: r9v0, types: [c1.r] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(r rVar, mf.c cVar) {
        n0 n0Var;
        int i5;
        Throwable th2;
        l0 l0Var;
        boolean z5;
        try {
            if (cVar instanceof n0) {
                n0Var = (n0) cVar;
                int i10 = n0Var.f3442e;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    n0Var.f3442e = i10 - Integer.MIN_VALUE;
                    Object obj = n0Var.f3440c;
                    lf.a aVar = lf.a.f20034a;
                    i5 = n0Var.f3442e;
                    ng.c cVar2 = this.f3464e;
                    if (i5 != 0) {
                        h8.b.B(obj);
                        if (this.f3463d.get()) {
                            throw new IllegalStateException("StorageConnection has already been disposed.");
                        }
                        boolean e7 = cVar2.e();
                        try {
                            l0 l0Var2 = new l0(this.f3460a);
                            try {
                                Boolean valueOf = Boolean.valueOf(e7);
                                n0Var.f3439b = l0Var2;
                                n0Var.f3438a = e7;
                                n0Var.f3442e = 1;
                                Object invoke = rVar.invoke(l0Var2, valueOf, n0Var);
                                if (invoke == aVar) {
                                    return aVar;
                                }
                                obj = invoke;
                                z5 = e7;
                                l0Var = l0Var2;
                            } catch (Throwable th3) {
                                th2 = th3;
                                rVar = e7;
                                l0Var = l0Var2;
                                l0Var.close();
                                throw th2;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            rVar = e7;
                            if (rVar != 0) {
                                cVar2.k(null);
                            }
                            throw th;
                        }
                    } else {
                        if (i5 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        rVar = n0Var.f3438a;
                        l0Var = n0Var.f3439b;
                        try {
                            h8.b.B(obj);
                            z5 = rVar;
                        } catch (Throwable th5) {
                            th2 = th5;
                            try {
                                l0Var.close();
                            } catch (Throwable th6) {
                                gf.d.a(th2, th6);
                            }
                            throw th2;
                        }
                    }
                    l0Var.close();
                    th = null;
                    if (th == null) {
                        throw th;
                    }
                    if (z5) {
                        cVar2.k(null);
                    }
                    return obj;
                }
            }
            if (i5 != 0) {
            }
            l0Var.close();
            th = null;
            if (th == null) {
            }
        } catch (Throwable th7) {
            th = th7;
        }
        n0Var = new n0(this, cVar);
        Object obj2 = n0Var.f3440c;
        lf.a aVar2 = lf.a.f20034a;
        i5 = n0Var.f3442e;
        ng.c cVar22 = this.f3464e;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(4:(3:(5:(2:3|(11:5|6|7|(1:(1:(8:11|12|13|14|15|16|17|(5:19|(3:21|(1:23)(1:29)|(1:25)(2:26|27))|30|31|32)(1:33))(2:44|45))(1:46))(2:64|(3:66|(2:68|(2:70|71))|72)(2:74|75))|47|48|49|51|52|(6:55|14|15|16|17|(0)(0))|54))|51|52|(0)|54)|48|49)|7|(0)(0)|47) */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0092, code lost:
    
        if (r12.c(r1) == r2) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0120, code lost:
    
        r11 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0121, code lost:
    
        r3 = r2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00dc A[Catch: all -> 0x011d, IOException -> 0x0120, TRY_ENTER, TryCatch #4 {IOException -> 0x0120, blocks: (B:19:0x00dc, B:21:0x00e2, B:23:0x00f2, B:26:0x00fe, B:27:0x011c, B:29:0x00f7, B:33:0x012c, B:40:0x013a, B:43:0x0137), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x012c A[Catch: all -> 0x011d, IOException -> 0x0120, TRY_ENTER, TRY_LEAVE, TryCatch #4 {IOException -> 0x0120, blocks: (B:19:0x00dc, B:21:0x00e2, B:23:0x00f2, B:26:0x00fe, B:27:0x011c, B:29:0x00f7, B:33:0x012c, B:40:0x013a, B:43:0x0137), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /* JADX WARN: Type inference failed for: r11v32, types: [ng.a] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v4, types: [ng.a] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.io.File, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(h0 h0Var, mf.c cVar) {
        o0 o0Var;
        ?? r12;
        lf.a aVar;
        int i5;
        ?? file;
        ng.c cVar2;
        Function2 function2;
        r0 r0Var;
        Throwable th2;
        r0 r0Var2;
        ng.a aVar2;
        File file2;
        try {
            try {
                try {
                    try {
                        if (cVar instanceof o0) {
                            o0Var = (o0) cVar;
                            int i10 = o0Var.f3456f;
                            if ((i10 & Integer.MIN_VALUE) != 0) {
                                o0Var.f3456f = i10 - Integer.MIN_VALUE;
                                r12 = o0Var.f3454d;
                                aVar = lf.a.f20034a;
                                i5 = o0Var.f3456f;
                                File toFile = this.f3460a;
                                if (i5 != 0) {
                                    h8.b.B(r12);
                                    if (this.f3463d.get()) {
                                        throw new IllegalStateException("StorageConnection has already been disposed.");
                                    }
                                    File parentFile = toFile.getCanonicalFile().getParentFile();
                                    if (parentFile != null) {
                                        parentFile.mkdirs();
                                        if (!parentFile.isDirectory()) {
                                            throw new IOException("Unable to create parent directories of " + toFile);
                                        }
                                    }
                                    o0Var.f3451a = h0Var;
                                    cVar2 = this.f3464e;
                                    o0Var.f3452b = cVar2;
                                    o0Var.f3456f = 1;
                                    function2 = h0Var;
                                } else {
                                    if (i5 != 1) {
                                        if (i5 != 2) {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        r0Var2 = o0Var.f3453c;
                                        file2 = (File) o0Var.f3452b;
                                        aVar2 = (ng.a) o0Var.f3451a;
                                        try {
                                            h8.b.B(r12);
                                            Unit unit = Unit.f19194a;
                                            try {
                                                r0Var2.close();
                                                th = null;
                                            } catch (Throwable th3) {
                                                th = th3;
                                            }
                                            if (th == null) {
                                                throw th;
                                            }
                                            if (file2.exists()) {
                                                Intrinsics.checkNotNullParameter(file2, "<this>");
                                                Intrinsics.checkNotNullParameter(toFile, "toFile");
                                                if (!(Build.VERSION.SDK_INT >= 26 ? s6.a.q(file2, toFile) : file2.renameTo(toFile))) {
                                                    throw new IOException("Unable to rename " + file2 + " to " + toFile + ". This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
                                                }
                                            }
                                            Unit unit2 = Unit.f19194a;
                                            aVar2.k(null);
                                            return Unit.f19194a;
                                        } catch (Throwable th4) {
                                            th2 = th4;
                                            try {
                                                r0Var2.close();
                                            } catch (Throwable th5) {
                                                gf.d.a(th2, th5);
                                            }
                                            throw th2;
                                        }
                                    }
                                    ?? r11 = (ng.a) o0Var.f3452b;
                                    Function2 function22 = (Function2) o0Var.f3451a;
                                    h8.b.B(r12);
                                    cVar2 = r11;
                                    function2 = function22;
                                }
                                file = new File(toFile.getAbsolutePath() + ".tmp");
                                g1.f serializer = g1.f.f9708a;
                                Intrinsics.checkNotNullParameter(file, "file");
                                Intrinsics.checkNotNullParameter(serializer, "serializer");
                                r0Var = new r0(file);
                                o0Var.f3451a = cVar2;
                                o0Var.f3452b = file;
                                o0Var.f3453c = r0Var;
                                o0Var.f3456f = 2;
                                if (function2.invoke(r0Var, o0Var) != aVar) {
                                    aVar2 = cVar2;
                                    file2 = file;
                                    r0Var2 = r0Var;
                                    Unit unit3 = Unit.f19194a;
                                    r0Var2.close();
                                    th = null;
                                    if (th == null) {
                                    }
                                }
                                return aVar;
                            }
                        }
                        o0Var.f3451a = cVar2;
                        o0Var.f3452b = file;
                        o0Var.f3453c = r0Var;
                        o0Var.f3456f = 2;
                        if (function2.invoke(r0Var, o0Var) != aVar) {
                        }
                        return aVar;
                    } catch (Throwable th6) {
                        th2 = th6;
                        r0Var2 = r0Var;
                        r0Var2.close();
                        throw th2;
                    }
                    g1.f serializer2 = g1.f.f9708a;
                    Intrinsics.checkNotNullParameter(file, "file");
                    Intrinsics.checkNotNullParameter(serializer2, "serializer");
                    r0Var = new r0(file);
                } catch (IOException e7) {
                    e = e7;
                    if (file.exists()) {
                        file.delete();
                    }
                    throw e;
                }
                if (i5 != 0) {
                }
                file = new File(toFile.getAbsolutePath() + ".tmp");
            } catch (Throwable th7) {
                th = th7;
                r12.k(null);
                throw th;
            }
        } catch (Throwable th8) {
            th = th8;
            r12 = o0Var;
            r12.k(null);
            throw th;
        }
        o0Var = new o0(this, cVar);
        r12 = o0Var.f3454d;
        aVar = lf.a.f20034a;
        i5 = o0Var.f3456f;
        File toFile2 = this.f3460a;
    }

    @Override // c1.a
    public final void close() {
        this.f3463d.set(true);
        this.f3462c.invoke();
    }
}
