package defpackage;

import java.io.FileNotFoundException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ipd extends bpd implements fml {
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a7 A[Catch: all -> 0x00b1, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x00b1, blocks: (B:18:0x00a7, B:30:0x00b3, B:61:0x0053), top: B:60:0x0053 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c7 A[Catch: Exception -> 0x00bf, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x00bf, blocks: (B:24:0x00c7, B:54:0x00bb, B:59:0x004a, B:51:0x00b6), top: B:7:0x0024, inners: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b3 A[Catch: all -> 0x00b1, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x00b1, blocks: (B:18:0x00a7, B:30:0x00b3, B:61:0x0053), top: B:60:0x0053 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0086 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0097 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    @Override // defpackage.fml
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(rq3 rq3Var, Object obj) {
        hpd hpdVar;
        int i;
        uae uaeVar;
        tha C;
        tha thaVar;
        Throwable th;
        kof kofVar;
        tha thaVar2;
        Throwable th2;
        try {
            if (rq3Var instanceof hpd) {
                hpdVar = (hpd) rq3Var;
                int i2 = hpdVar.w;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    hpdVar.w = i2 - Integer.MIN_VALUE;
                    Object obj2 = hpdVar.u;
                    lu3 lu3Var = lu3.a;
                    i = hpdVar.w;
                    uaeVar = this.b;
                    Throwable th3 = null;
                    if (i != 0) {
                        y6a.M(obj2);
                        if (((AtomicBoolean) this.d.a).get()) {
                            a70.r("This scope has already been closed.");
                            return null;
                        }
                        s18 s18Var = this.a;
                        uaeVar.getClass();
                        C = s18Var.C(uaeVar);
                        try {
                            kof kofVar2 = new kof(tha.e(C));
                            try {
                                cqa cqaVar = this.c;
                                hpdVar.r = C;
                                hpdVar.s = C;
                                hpdVar.t = kofVar2;
                                hpdVar.w = 1;
                                Object writeTo = ((c6h) cqaVar.a).writeTo(obj, new v52(kofVar2, 2), hpdVar);
                                if (writeTo != lu3Var) {
                                    writeTo = Unit.a;
                                }
                                if (writeTo == lu3Var) {
                                    return lu3Var;
                                }
                                thaVar2 = C;
                                thaVar = thaVar2;
                                kofVar = kofVar2;
                            } catch (Throwable th4) {
                                thaVar = C;
                                th = th4;
                                kofVar = kofVar2;
                                if (kofVar != null) {
                                }
                                th2 = th;
                                tha thaVar3 = thaVar;
                                if (th2 == null) {
                                }
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            if (C != null) {
                            }
                            th3 = th;
                            if (th3 == null) {
                            }
                        }
                    } else {
                        if (i != 1) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kofVar = hpdVar.t;
                        thaVar2 = hpdVar.s;
                        thaVar = hpdVar.r;
                        try {
                            y6a.M(obj2);
                        } catch (Throwable th6) {
                            th = th6;
                            if (kofVar != null) {
                                try {
                                    kofVar.close();
                                } catch (Throwable th7) {
                                    try {
                                        de6.a(th, th7);
                                    } catch (Throwable th8) {
                                        th = th8;
                                        C = thaVar;
                                        if (C != null) {
                                            try {
                                                C.close();
                                            } catch (Throwable th9) {
                                                de6.a(th, th9);
                                            }
                                        }
                                        th3 = th;
                                        if (th3 == null) {
                                        }
                                    }
                                }
                            }
                            th2 = th;
                            tha thaVar32 = thaVar;
                            if (th2 == null) {
                            }
                        }
                    }
                    thaVar2.flush();
                    Unit unit = Unit.a;
                    if (kofVar != null) {
                        try {
                            kofVar.close();
                        } catch (Throwable th10) {
                            th2 = th10;
                        }
                    }
                    th2 = null;
                    tha thaVar322 = thaVar;
                    if (th2 == null) {
                        throw th2;
                    }
                    Unit unit2 = Unit.a;
                    if (thaVar322 != null) {
                        try {
                            thaVar322.close();
                        } catch (Throwable th11) {
                            th3 = th11;
                        }
                    }
                    if (th3 == null) {
                        return Unit.a;
                    }
                    throw th3;
                }
            }
            if (i != 0) {
            }
            thaVar2.flush();
            Unit unit3 = Unit.a;
            if (kofVar != null) {
            }
            th2 = null;
            tha thaVar3222 = thaVar;
            if (th2 == null) {
            }
        } catch (Exception e) {
            if (e instanceof FileNotFoundException) {
                throw t62.P(String.valueOf(uaeVar.c()), (FileNotFoundException) e);
            }
            throw e;
        }
        hpdVar = new hpd(this, (sq3) rq3Var);
        Object obj22 = hpdVar.u;
        lu3 lu3Var2 = lu3.a;
        i = hpdVar.w;
        uaeVar = this.b;
        Throwable th32 = null;
    }
}
