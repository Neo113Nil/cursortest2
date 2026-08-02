package defpackage;

import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class f45 extends xti {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f45(int i, Object obj, String str) {
        super(str);
        this.e = i;
        this.f = obj;
    }

    @Override // defpackage.xti
    public final long a() {
        long j;
        qof qofVar;
        int i = 0;
        long j2 = -1;
        switch (this.e) {
            case 0:
                l45 l45Var = (l45) this.f;
                synchronized (l45Var) {
                    if (l45Var.m && !l45Var.n) {
                        try {
                            l45Var.T();
                        } catch (IOException unused) {
                            l45Var.o = true;
                        }
                        try {
                            if (l45Var.n()) {
                                l45Var.H();
                                l45Var.j = 0;
                            }
                        } catch (IOException unused2) {
                            l45Var.p = true;
                            kof kofVar = l45Var.h;
                            if (kofVar != null) {
                                wol.b(kofVar);
                            }
                            l45Var.h = new kof(new fx1());
                        }
                    }
                }
                return -1L;
            case 1:
                wi5 wi5Var = (wi5) this.f;
                long nanoTime = System.nanoTime();
                long j3 = (nanoTime - wi5Var.a) + 1;
                Iterator it = ((ConcurrentLinkedQueue) wi5Var.d).iterator();
                it.getClass();
                long j4 = Long.MAX_VALUE;
                qof qofVar2 = null;
                long j5 = j3;
                qof qofVar3 = null;
                int i2 = 0;
                while (it.hasNext()) {
                    long j6 = j2;
                    qof qofVar4 = (qof) it.next();
                    qofVar4.getClass();
                    synchronized (qofVar4) {
                        if (wi5Var.a(qofVar4, nanoTime) > 0) {
                            i2++;
                        } else {
                            long j7 = j5;
                            long j8 = qofVar4.r;
                            if (j8 < j7) {
                                qofVar3 = qofVar4;
                                j7 = j8;
                            }
                            i++;
                            if (j8 < j4) {
                                qofVar2 = qofVar4;
                                j4 = j8;
                            }
                            j5 = j7;
                        }
                        Unit unit = Unit.a;
                    }
                    j2 = j6;
                }
                long j9 = j2;
                long j10 = j5;
                if (qofVar3 != null) {
                    qofVar = qofVar3;
                    j = j10;
                } else if (i > 5) {
                    j = j4;
                    qofVar = qofVar2;
                } else {
                    j = j9;
                    qofVar = null;
                }
                if (qofVar == null) {
                    return qofVar2 != null ? (j4 + wi5Var.a) - nanoTime : i2 > 0 ? wi5Var.a : j9;
                }
                synchronized (qofVar) {
                    if (qofVar.q.isEmpty() && qofVar.r == j) {
                        qofVar.k = true;
                        ((ConcurrentLinkedQueue) wi5Var.d).remove(qofVar);
                        yol.c(qofVar.e);
                        if (!((ConcurrentLinkedQueue) wi5Var.d).isEmpty()) {
                            return 0L;
                        }
                        ((bui) wi5Var.b).a();
                        return 0L;
                    }
                    return 0L;
                }
            case 2:
                ((Function0) this.f).invoke();
                return -1L;
            default:
                return ((Number) ((e40) this.f).invoke()).longValue();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f45(String str, Function0 function0, int i) {
        super(str);
        this.e = i;
        this.f = function0;
    }
}
