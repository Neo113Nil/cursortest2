package rc;

import com.google.android.gms.internal.measurement.y3;
import eg.c0;
import eg.m0;
import kotlin.Unit;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class r {
    public static fa.a d() {
        return (fa.a) y3.m(fa.a.class, null, 6);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(mf.c cVar) {
        k kVar;
        int i5;
        if (cVar instanceof k) {
            kVar = (k) cVar;
            int i10 = kVar.f22420c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                kVar.f22420c = i10 - Integer.MIN_VALUE;
                Object obj = kVar.f22418a;
                lf.a aVar = lf.a.f20034a;
                i5 = kVar.f22420c;
                if (i5 != 0) {
                    h8.b.B(obj);
                    la.b bVar = (la.b) y3.m(la.b.class, null, 6);
                    kVar.f22420c = 1;
                    bVar.getClass();
                    y8.d dVar = new y8.d();
                    lg.e eVar = m0.f9201a;
                    obj = c0.A(lg.d.f20063c, new cb.a(dVar, null, r3), kVar);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                Integer num = (Integer) obj;
                return new Integer(num != null ? num.intValue() : 0);
            }
        }
        kVar = new k(this, cVar);
        Object obj2 = kVar.f22418a;
        lf.a aVar2 = lf.a.f20034a;
        i5 = kVar.f22420c;
        if (i5 != 0) {
        }
        Integer num2 = (Integer) obj2;
        return new Integer(num2 != null ? num2.intValue() : 0);
    }

    public final Object b(mf.c cVar) {
        lg.e eVar = m0.f9201a;
        return c0.A(lg.d.f20063c, new m(this, null, 0), cVar);
    }

    public final Object c(boolean z5, mf.i iVar) {
        lg.e eVar = m0.f9201a;
        Object A = c0.A(lg.d.f20063c, new l(this, z5, null, 0), iVar);
        return A == lf.a.f20034a ? A : Unit.f19194a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(mf.c cVar) {
        q qVar;
        int i5;
        Integer num;
        if (cVar instanceof q) {
            qVar = (q) cVar;
            int i10 = qVar.f22438c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                qVar.f22438c = i10 - Integer.MIN_VALUE;
                Object obj = qVar.f22436a;
                lf.a aVar = lf.a.f20034a;
                i5 = qVar.f22438c;
                int i11 = 1;
                if (i5 != 0) {
                    h8.b.B(obj);
                    la.b bVar = (la.b) y3.m(la.b.class, null, 6);
                    qVar.f22438c = 1;
                    bVar.getClass();
                    y8.d dVar = new y8.d();
                    lg.e eVar = m0.f9201a;
                    obj = c0.A(lg.d.f20063c, new cb.a(dVar, null, i11), qVar);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                num = (Integer) obj;
                if (num == null) {
                    i11 = num.intValue();
                } else {
                    mc.a aVar2 = mc.a.f20526a;
                }
                return new Integer(i11);
            }
        }
        qVar = new q(this, cVar);
        Object obj2 = qVar.f22436a;
        lf.a aVar3 = lf.a.f20034a;
        i5 = qVar.f22438c;
        int i112 = 1;
        if (i5 != 0) {
        }
        num = (Integer) obj2;
        if (num == null) {
        }
        return new Integer(i112);
    }
}
