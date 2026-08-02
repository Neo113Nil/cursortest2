package defpackage;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class gpd implements lfi {
    public final s18 a;
    public final uae b;
    public final cqa c;
    public final h7a d;
    public final cpd e;
    public final hpo f;
    public final j2d g;

    public gpd(s18 s18Var, uae uaeVar, cqa cqaVar, h7a h7aVar, cpd cpdVar) {
        uaeVar.getClass();
        h7aVar.getClass();
        this.a = s18Var;
        this.b = uaeVar;
        this.c = cqaVar;
        this.d = h7aVar;
        this.e = cpdVar;
        this.f = new hpo(7);
        this.g = new j2d();
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x007b, code lost:
    
        if (r5 == r2) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b0 A[Catch: all -> 0x00ba, IOException -> 0x00bd, TRY_ENTER, TryCatch #5 {all -> 0x00ba, blocks: (B:20:0x00b0, B:22:0x00b6, B:23:0x00c1, B:27:0x00c9, B:33:0x00d7, B:36:0x00d4), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c9 A[Catch: all -> 0x00ba, IOException -> 0x00bd, TRY_ENTER, TRY_LEAVE, TryCatch #5 {all -> 0x00ba, blocks: (B:20:0x00b0, B:22:0x00b6, B:23:0x00c1, B:27:0x00c9, B:33:0x00d7, B:36:0x00d4), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [uae] */
    /* JADX WARN: Type inference failed for: r0v4, types: [uae] */
    /* JADX WARN: Type inference failed for: r11v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4, types: [h2d] */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r7v0, types: [s18] */
    @Override // defpackage.lfi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(pf4 pf4Var, sq3 sq3Var) {
        fpd fpdVar;
        lu3 lu3Var;
        int i;
        ?? r7;
        ?? r11;
        ?? r0;
        uae c;
        Function2 function2;
        ipd ipdVar;
        Throwable th;
        hz2 hz2Var;
        uae uaeVar;
        h2d h2dVar;
        try {
            try {
                try {
                    try {
                        try {
                            if (sq3Var instanceof fpd) {
                                fpdVar = (fpd) sq3Var;
                                int i2 = fpdVar.w;
                                if ((i2 & Integer.MIN_VALUE) != 0) {
                                    fpdVar.w = i2 - Integer.MIN_VALUE;
                                    Object obj = fpdVar.u;
                                    lu3Var = lu3.a;
                                    i = fpdVar.w;
                                    uae uaeVar2 = this.b;
                                    r7 = this.a;
                                    if (i != 0) {
                                        y6a.M(obj);
                                        if (((AtomicBoolean) this.f.a).get()) {
                                            a70.r("StorageConnection has already been disposed.");
                                            return null;
                                        }
                                        c = uaeVar2.c();
                                        if (c == null) {
                                            a70.r("must have a parent path");
                                            return null;
                                        }
                                        r7.g(c);
                                        fpdVar.r = pf4Var;
                                        fpdVar.s = c;
                                        j2d j2dVar = this.g;
                                        fpdVar.t = j2dVar;
                                        fpdVar.w = 1;
                                        Object e = j2dVar.e(fpdVar);
                                        function2 = pf4Var;
                                        r11 = j2dVar;
                                    } else {
                                        if (i != 1) {
                                            if (i != 2) {
                                                a70.r("call to 'resume' before 'invoke' with coroutine");
                                                return null;
                                            }
                                            hz2Var = (hz2) fpdVar.t;
                                            uaeVar = fpdVar.s;
                                            h2dVar = (h2d) fpdVar.r;
                                            try {
                                                y6a.M(obj);
                                                Unit unit = Unit.a;
                                                try {
                                                    hz2Var.close();
                                                    th = null;
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                }
                                                if (th == null) {
                                                    throw th;
                                                }
                                                if (r7.k(uaeVar)) {
                                                    r7.f(uaeVar, uaeVar2);
                                                }
                                                Unit unit2 = Unit.a;
                                                h2dVar.f(null);
                                                return Unit.a;
                                            } catch (Throwable th3) {
                                                th = th3;
                                                try {
                                                    hz2Var.close();
                                                } catch (Throwable th4) {
                                                    de6.a(th, th4);
                                                }
                                                throw th;
                                            }
                                        }
                                        h2d h2dVar2 = (h2d) fpdVar.t;
                                        c = fpdVar.s;
                                        Function2 function22 = (Function2) fpdVar.r;
                                        y6a.M(obj);
                                        r11 = h2dVar2;
                                        function2 = function22;
                                    }
                                    r0 = c.e(uaeVar2.b().concat(".tmp"));
                                    r7.i(r0);
                                    ipdVar = new ipd(r7, r0, this.c);
                                    fpdVar.r = r11;
                                    fpdVar.s = r0;
                                    fpdVar.t = ipdVar;
                                    fpdVar.w = 2;
                                    if (function2.invoke(ipdVar, fpdVar) != lu3Var) {
                                        uaeVar = r0;
                                        hz2Var = ipdVar;
                                        h2dVar = r11;
                                        Unit unit3 = Unit.a;
                                        hz2Var.close();
                                        th = null;
                                        if (th == null) {
                                        }
                                    }
                                    return lu3Var;
                                }
                            }
                            fpdVar.r = r11;
                            fpdVar.s = r0;
                            fpdVar.t = ipdVar;
                            fpdVar.w = 2;
                            if (function2.invoke(ipdVar, fpdVar) != lu3Var) {
                            }
                            return lu3Var;
                        } catch (Throwable th5) {
                            th = th5;
                            hz2Var = ipdVar;
                            hz2Var.close();
                            throw th;
                        }
                        r7.i(r0);
                        ipdVar = new ipd(r7, r0, this.c);
                    } catch (IOException e2) {
                        e = e2;
                        if (r7.k(r0)) {
                            try {
                                r7.i(r0);
                            } catch (IOException unused) {
                            }
                        }
                        throw e;
                    }
                    r0 = c.e(uaeVar2.b().concat(".tmp"));
                } catch (Throwable th6) {
                    th = th6;
                    r11.f(null);
                    throw th;
                }
                if (i != 0) {
                }
            } catch (Throwable th7) {
                th = th7;
                r11 = ".tmp";
                r11.f(null);
                throw th;
            }
        } catch (IOException e3) {
            e = e3;
            r11 = ".tmp";
            r0 = pf4Var;
        }
        fpdVar = new fpd(this, sq3Var);
        Object obj2 = fpdVar.u;
        lu3Var = lu3.a;
        i = fpdVar.w;
        uae uaeVar22 = this.b;
        r7 = this.a;
    }

    @Override // defpackage.hz2
    public final void close() {
        ((AtomicBoolean) this.f.a).set(true);
        this.e.invoke();
    }

    @Override // defpackage.lfi
    public final h7a d() {
        return this.d;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(8:5|6|7|(1:(3:10|11|12)(2:32|33))(2:34|(6:36|37|38|40|41|(1:43)(1:44))(2:52|53))|13|14|15|(2:(1:18)|19)(1:21)))|56|6|7|(0)(0)|13|14|15|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006e, code lost:
    
        r9 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0077 A[Catch: all -> 0x0078, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0078, blocks: (B:21:0x0077, B:28:0x0088, B:31:0x0085, B:27:0x0080), top: B:7:0x0022, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Type inference failed for: r8v0, types: [gpd] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v0, types: [ff4] */
    @Override // defpackage.lfi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(ff4 ff4Var, sq3 sq3Var) {
        epd epdVar;
        int i;
        j2d j2dVar;
        boolean z;
        Throwable th;
        bpd bpdVar;
        boolean z2;
        try {
            if (sq3Var instanceof epd) {
                epdVar = (epd) sq3Var;
                int i2 = epdVar.v;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    epdVar.v = i2 - Integer.MIN_VALUE;
                    Object obj = epdVar.t;
                    lu3 lu3Var = lu3.a;
                    i = epdVar.v;
                    j2dVar = this.g;
                    if (i != 0) {
                        y6a.M(obj);
                        if (((AtomicBoolean) this.f.a).get()) {
                            a70.r("StorageConnection has already been disposed.");
                            return null;
                        }
                        z = j2dVar.g();
                        try {
                            bpd bpdVar2 = new bpd(this.a, this.b, this.c);
                            try {
                                Boolean valueOf = Boolean.valueOf(z);
                                epdVar.s = bpdVar2;
                                epdVar.r = z;
                                epdVar.v = 1;
                                Object invoke = ff4Var.invoke(bpdVar2, valueOf, epdVar);
                                if (invoke == lu3Var) {
                                    return lu3Var;
                                }
                                obj = invoke;
                                z2 = z;
                                bpdVar = bpdVar2;
                            } catch (Throwable th2) {
                                th = th2;
                                this = z;
                                bpdVar = bpdVar2;
                                bpdVar.close();
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            if (z) {
                            }
                            throw th;
                        }
                    } else {
                        if (i != 1) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        this = epdVar.r;
                        bpdVar = epdVar.s;
                        try {
                            y6a.M(obj);
                            z2 = this;
                        } catch (Throwable th4) {
                            th = th4;
                            try {
                                bpdVar.close();
                            } catch (Throwable th5) {
                                de6.a(th, th5);
                            }
                            throw th;
                        }
                    }
                    bpdVar.close();
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
            bpdVar.close();
            th = null;
            if (th == null) {
            }
        } catch (Throwable th6) {
            th = th6;
            z = this;
            if (z) {
                j2dVar.f(null);
            }
            throw th;
        }
        epdVar = new epd(this, sq3Var);
        Object obj2 = epdVar.t;
        lu3 lu3Var2 = lu3.a;
        i = epdVar.v;
        j2dVar = this.g;
    }
}
