package defpackage;

import android.os.Bundle;
import androidx.fragment.app.s;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class yo8 implements p6b {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public yo8(e6b e6bVar, g6b g6bVar, lj2 lj2Var, Function0 function0) {
        this.b = e6bVar;
        this.d = g6bVar;
        this.c = lj2Var;
        this.e = function0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.p6b
    public final void onStateChanged(u6b u6bVar, d6b d6bVar) {
        Bundle bundle;
        boolean z;
        Object u2gVar;
        int i = 0;
        kj2 kj2Var = null;
        Object[] objArr = 0;
        switch (this.a) {
            case 0:
                s sVar = (s) this.e;
                Map map = sVar.m;
                String str = (String) this.b;
                if (d6bVar == d6b.ON_START && (bundle = (Bundle) map.get(str)) != null) {
                    ((op8) this.c).b(bundle, str);
                    map.remove(str);
                }
                if (d6bVar == d6b.ON_DESTROY) {
                    ((g6b) this.d).d(this);
                    sVar.n.remove(str);
                    return;
                }
                return;
            case 1:
                switch (pal.a[d6bVar.ordinal()]) {
                    case 1:
                        xw3.L((ad2) this.b, null, nu3.d, new kuj((fsf) this.e, (kqf) this.d, u6bVar, this, (rq3) null, 10), 1);
                        return;
                    case 2:
                        ece eceVar = (ece) this.c;
                        if (eceVar != null) {
                            en0 en0Var = eceVar.b;
                            synchronized (en0Var.c) {
                                try {
                                    synchronized (en0Var.c) {
                                        z = en0Var.b;
                                    }
                                    if (!z) {
                                        ArrayList arrayList = (ArrayList) en0Var.d;
                                        en0Var.d = (ArrayList) en0Var.e;
                                        en0Var.e = arrayList;
                                        en0Var.b = true;
                                        int size = arrayList.size();
                                        for (int i2 = 0; i2 < size; i2++) {
                                            rq3 rq3Var = (rq3) arrayList.get(i2);
                                            p2g p2gVar = w2g.b;
                                            rq3Var.resumeWith(Unit.a);
                                        }
                                        arrayList.clear();
                                        Unit unit = Unit.a;
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        }
                        kqf kqfVar = (kqf) this.d;
                        synchronized (kqfVar.d) {
                            if (kqfVar.u) {
                                kqfVar.u = false;
                                kj2Var = kqfVar.C();
                            }
                        }
                        if (kj2Var != null) {
                            p2g p2gVar2 = w2g.b;
                            ((lj2) kj2Var).resumeWith(Unit.a);
                            return;
                        }
                        return;
                    case 3:
                        kqf kqfVar2 = (kqf) this.d;
                        synchronized (kqfVar2.d) {
                            kqfVar2.u = true;
                            Unit unit2 = Unit.a;
                        }
                        return;
                    case 4:
                        ((kqf) this.d).A();
                        return;
                    case 5:
                    case 6:
                    case 7:
                        return;
                    default:
                        zzl.b();
                        return;
                }
            default:
                lj2 lj2Var = (lj2) this.c;
                g6b g6bVar = (g6b) this.d;
                b6b b6bVar = d6b.Companion;
                e6b e6bVar = (e6b) this.b;
                b6bVar.getClass();
                if (d6bVar != b6b.b(e6bVar)) {
                    if (d6bVar == d6b.ON_DESTROY) {
                        g6bVar.d(this);
                        p2g p2gVar3 = w2g.b;
                        lj2Var.resumeWith(new u2g(new l6b(objArr == true ? 1 : 0, i)));
                        return;
                    }
                    return;
                }
                g6bVar.d(this);
                Function0 function0 = (Function0) this.e;
                try {
                    p2g p2gVar4 = w2g.b;
                    u2gVar = function0.invoke();
                } catch (Throwable th2) {
                    p2g p2gVar5 = w2g.b;
                    u2gVar = new u2g(th2);
                }
                lj2Var.resumeWith(u2gVar);
                return;
        }
    }

    public yo8(ad2 ad2Var, ece eceVar, kqf kqfVar, fsf fsfVar) {
        this.b = ad2Var;
        this.c = eceVar;
        this.d = kqfVar;
        this.e = fsfVar;
    }

    public yo8(s sVar, String str, op8 op8Var, g6b g6bVar) {
        this.e = sVar;
        this.b = str;
        this.c = op8Var;
        this.d = g6bVar;
    }
}
