package defpackage;

import androidx.fragment.app.Fragment;
import java.util.Iterator;
import java.util.Objects;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class ga implements p6b {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ga(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.p6b
    public final void onStateChanged(u6b u6bVar, d6b d6bVar) {
        int i = this.a;
        Object obj = null;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((Function1) obj2).invoke(d6bVar);
                break;
            case 1:
                ip8 ip8Var = (ip8) obj2;
                if (d6bVar == d6b.ON_DESTROY) {
                    Fragment fragment = (Fragment) u6bVar;
                    for (Object obj3 : (Iterable) ip8Var.b().f.a.getValue()) {
                        if (((d6d) obj3).f.equals(fragment.getTag())) {
                            obj = obj3;
                        }
                    }
                    d6d d6dVar = (d6d) obj;
                    if (d6dVar != null) {
                        if (ip8.n()) {
                            d6dVar.toString();
                            Objects.toString(u6bVar);
                        }
                        ip8Var.b().c(d6dVar);
                        break;
                    }
                }
                break;
            case 2:
                ((fdi) obj2).m(null, d6bVar.d());
                break;
            case 3:
                k6d k6dVar = (k6d) obj2;
                k6dVar.q = d6bVar.d();
                if (k6dVar.c != null) {
                    Iterator it = CollectionsKt.U0(k6dVar.f).iterator();
                    while (it.hasNext()) {
                        d6d d6dVar2 = (d6d) it.next();
                        d6dVar2.getClass();
                        f6d f6dVar = d6dVar2.h;
                        f6dVar.getClass();
                        f6dVar.a.d = d6bVar.d();
                        f6dVar.d = d6bVar.d();
                        f6dVar.b();
                    }
                    break;
                }
                break;
            case 4:
                ge3 ge3Var = (ge3) obj2;
                ge3Var.getClass();
                ge3Var.b = d6bVar.d();
                ge3Var.a();
                break;
            case 5:
                pqg pqgVar = (pqg) obj2;
                if (d6bVar == d6b.ON_START) {
                    pqgVar.c = true;
                    break;
                } else if (d6bVar == d6b.ON_STOP) {
                    pqgVar.c = false;
                    break;
                }
                break;
            case 6:
                e1d e1dVar = (e1d) obj2;
                if (d6bVar == d6b.ON_PAUSE) {
                    e1dVar.setValue(Boolean.FALSE);
                    break;
                } else if (d6bVar == d6b.ON_RESUME) {
                    e1dVar.setValue(Boolean.TRUE);
                    break;
                }
                break;
            default:
                a3 a3Var = (a3) obj2;
                if (d6bVar == d6b.ON_DESTROY) {
                    a3Var.e();
                    break;
                }
                break;
        }
    }
}
