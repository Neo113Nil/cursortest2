package defpackage;

import java.io.FileNotFoundException;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class bpd implements ynf {
    public final s18 a;
    public final uae b;
    public final cqa c;
    public final hpo d;

    public bpd(s18 s18Var, uae uaeVar, cqa cqaVar) {
        uaeVar.getClass();
        this.a = s18Var;
        this.b = uaeVar;
        this.c = cqaVar;
        this.d = new hpo(7);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00f5 A[Catch: Exception -> 0x00f6, TRY_ENTER, TRY_LEAVE, TryCatch #10 {Exception -> 0x00f6, blocks: (B:20:0x00f5, B:62:0x00b1), top: B:61:0x00b1 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a0 A[Catch: FileNotFoundException -> 0x0098, TRY_LEAVE, TryCatch #8 {FileNotFoundException -> 0x0098, blocks: (B:54:0x00a0, B:83:0x0094, B:80:0x008f), top: B:79:0x008f, inners: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x007e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x008f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v23, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r9v29, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r9v32 */
    /* JADX WARN: Type inference failed for: r9v34, types: [java.lang.Throwable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object f(bpd bpdVar, sq3 sq3Var) {
        apd apdVar;
        int i;
        lof o;
        bpd bpdVar2;
        lof lofVar;
        Throwable th;
        Throwable th2;
        s18 s18Var;
        uae uaeVar;
        bpd bpdVar3;
        lof lofVar2;
        ?? th3;
        Object readFrom;
        if (sq3Var instanceof apd) {
            apdVar = (apd) sq3Var;
            int i2 = apdVar.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                apdVar.v = i2 - Integer.MIN_VALUE;
                Object obj = apdVar.t;
                lu3 lu3Var = lu3.a;
                i = apdVar.v;
                int i3 = 4;
                Object th4 = null;
                if (i != 0) {
                    y6a.M(obj);
                    if (((AtomicBoolean) bpdVar.d.a).get()) {
                        a70.r("This scope has already been closed.");
                        return null;
                    }
                    try {
                        o = o6a.o(bpdVar.a.M(bpdVar.b));
                    } catch (FileNotFoundException unused) {
                        s18Var = bpdVar.a;
                        c6h c6hVar = (c6h) bpdVar.c.a;
                        uaeVar = bpdVar.b;
                        if (s18Var.k(uaeVar)) {
                            return c6hVar.getDefaultValue();
                        }
                        try {
                            lof o2 = o6a.o(bpdVar.a.M(uaeVar));
                            try {
                                apdVar.r = bpdVar;
                                apdVar.s = o2;
                                apdVar.v = 2;
                                readFrom = c6hVar.readFrom(new oy1(o2, i3), apdVar);
                            } catch (Throwable th5) {
                                bpdVar3 = bpdVar;
                                lofVar2 = o2;
                                th3 = th5;
                                if (lofVar2 != null) {
                                }
                                bpdVar = bpdVar3;
                                if (th3 != 0) {
                                }
                            }
                            if (readFrom != lu3Var) {
                                bpdVar3 = bpdVar;
                                lofVar2 = o2;
                                obj = readFrom;
                                if (lofVar2 != null) {
                                }
                                Object obj2 = th4;
                                th4 = obj;
                                th3 = obj2;
                                bpdVar = bpdVar3;
                                if (th3 != 0) {
                                }
                            }
                            return lu3Var;
                        } catch (Exception e) {
                            bpdVar3 = bpdVar;
                            e = e;
                            if (e instanceof FileNotFoundException) {
                            }
                        }
                    }
                    try {
                        cqa cqaVar = bpdVar.c;
                        apdVar.r = bpdVar;
                        apdVar.s = o;
                        apdVar.v = 1;
                        Object readFrom2 = ((c6h) cqaVar.a).readFrom(new oy1(o, i3), apdVar);
                        if (readFrom2 != lu3Var) {
                            bpdVar2 = bpdVar;
                            lofVar = o;
                            obj = readFrom2;
                        }
                        return lu3Var;
                    } catch (Throwable th6) {
                        bpdVar2 = bpdVar;
                        lofVar = o;
                        th = th6;
                        if (lofVar != null) {
                        }
                        th2 = th;
                        obj = null;
                        if (th2 != null) {
                        }
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        lofVar2 = apdVar.s;
                        bpdVar3 = apdVar.r;
                        try {
                            y6a.M(obj);
                            if (lofVar2 != null) {
                                try {
                                    lofVar2.close();
                                } catch (Throwable th7) {
                                    th4 = th7;
                                }
                            }
                            Object obj22 = th4;
                            th4 = obj;
                            th3 = obj22;
                        } catch (Throwable th8) {
                            th3 = th8;
                            if (lofVar2 != null) {
                                try {
                                    lofVar2.close();
                                } catch (Throwable th9) {
                                    try {
                                        de6.a(th3, th9);
                                    } catch (Exception e2) {
                                        e = e2;
                                        if (e instanceof FileNotFoundException) {
                                            throw e;
                                        }
                                        throw t62.P(String.valueOf(bpdVar3.b.c()), (FileNotFoundException) e);
                                    }
                                }
                            }
                            bpdVar = bpdVar3;
                            if (th3 != 0) {
                            }
                        }
                        bpdVar = bpdVar3;
                        if (th3 != 0) {
                            return th4;
                        }
                        throw th3;
                    }
                    lofVar = apdVar.s;
                    bpdVar2 = apdVar.r;
                    try {
                        y6a.M(obj);
                    } catch (Throwable th10) {
                        th = th10;
                        if (lofVar != null) {
                            try {
                                try {
                                    lofVar.close();
                                } catch (Throwable th11) {
                                    de6.a(th, th11);
                                }
                            } catch (FileNotFoundException unused2) {
                                bpdVar = bpdVar2;
                                s18Var = bpdVar.a;
                                c6h c6hVar2 = (c6h) bpdVar.c.a;
                                uaeVar = bpdVar.b;
                                if (s18Var.k(uaeVar)) {
                                }
                            }
                        }
                        th2 = th;
                        obj = null;
                        if (th2 != null) {
                        }
                    }
                }
                if (lofVar != null) {
                    try {
                        lofVar.close();
                    } catch (Throwable th12) {
                        th2 = th12;
                    }
                }
                th2 = null;
                if (th2 != null) {
                    return obj;
                }
                throw th2;
            }
        }
        apdVar = new apd(bpdVar, sq3Var);
        Object obj3 = apdVar.t;
        lu3 lu3Var2 = lu3.a;
        i = apdVar.v;
        int i32 = 4;
        Object th42 = null;
        if (i != 0) {
        }
        if (lofVar != null) {
        }
        th2 = null;
        if (th2 != null) {
        }
    }

    @Override // defpackage.ynf
    public final Object b(ff4 ff4Var) {
        return f(this, ff4Var);
    }

    @Override // defpackage.hz2
    public final void close() {
        ((AtomicBoolean) this.d.a).set(true);
    }
}
