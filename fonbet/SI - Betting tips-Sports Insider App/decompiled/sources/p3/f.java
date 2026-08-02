package p3;

import c1.u;
import com.android.billingclient.api.m;
import e3.x;
import hg.u0;
import kotlin.jvm.internal.Intrinsics;
import m3.o;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final String f21509a;

    static {
        String g10 = x.g("ConstraintTrkngWrkr");
        Intrinsics.checkNotNullExpressionValue(g10, "tagWithPrefix(...)");
        f21509a = g10;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(m mVar, o oVar, mf.c cVar) {
        e eVar;
        int i5;
        if (cVar instanceof e) {
            eVar = (e) cVar;
            int i10 = eVar.f21508b;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                eVar.f21508b = i10 - Integer.MIN_VALUE;
                Object obj = eVar.f21507a;
                lf.a aVar = lf.a.f20034a;
                i5 = eVar.f21508b;
                if (i5 != 0) {
                    h8.b.B(obj);
                    u uVar = new u(6, new hg.u(mVar.f(oVar), new ad.a(oVar, null, 22), 2));
                    eVar.f21508b = 1;
                    obj = u0.k(uVar, eVar);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return new Integer(((i3.b) obj).f10903a);
            }
        }
        eVar = new e(cVar);
        Object obj2 = eVar.f21507a;
        lf.a aVar2 = lf.a.f20034a;
        i5 = eVar.f21508b;
        if (i5 != 0) {
        }
        return new Integer(((i3.b) obj2).f10903a);
    }
}
