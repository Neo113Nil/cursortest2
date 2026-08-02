package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class fpf {
    public final ou4 a;
    public final spf b;
    public final Object c = new Object();

    public fpf(ou4 ou4Var, spf spfVar) {
        this.a = ou4Var;
        this.b = spfVar;
    }

    public final oec a(nec necVar) {
        oec oecVar;
        oec oecVar2;
        synchronized (this.c) {
            try {
                mpf mpfVar = (mpf) ((LinkedHashMap) ((c78) this.a.c).d).get(necVar);
                oecVar = mpfVar != null ? new oec(mpfVar.a, mpfVar.b) : null;
                if (oecVar == null) {
                    spf spfVar = this.b;
                    ArrayList arrayList = (ArrayList) spfVar.a.get(necVar);
                    if (arrayList == null) {
                        oecVar = null;
                    } else {
                        int size = arrayList.size();
                        int i = 0;
                        while (true) {
                            if (i >= size) {
                                oecVar2 = null;
                                break;
                            }
                            qpf qpfVar = (qpf) arrayList.get(i);
                            nr9 nr9Var = (nr9) qpfVar.a.get();
                            oecVar2 = nr9Var != null ? new oec(nr9Var, qpfVar.b) : null;
                            if (oecVar2 != null) {
                                break;
                            }
                            i++;
                        }
                        spfVar.c();
                        oecVar = oecVar2;
                    }
                }
                if (oecVar != null && !oecVar.a.b()) {
                    synchronized (this.c) {
                        c78 c78Var = (c78) this.a.c;
                        Object remove = ((LinkedHashMap) c78Var.d).remove(necVar);
                        if (remove != null) {
                            c78Var.c = c78Var.h() - c78Var.k(necVar, remove);
                            c78Var.f(necVar, remove, null);
                        }
                        if (remove != null) {
                        }
                        if (this.b.a.remove(necVar) != null) {
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return oecVar;
    }

    public final void b(long j) {
        synchronized (this.c) {
            c78 c78Var = (c78) this.a.c;
            c78Var.b = j;
            c78Var.n(j);
            Unit unit = Unit.a;
        }
    }
}
