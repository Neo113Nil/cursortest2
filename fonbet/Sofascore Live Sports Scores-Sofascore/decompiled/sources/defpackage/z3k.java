package defpackage;

import com.sofascore.network.api.NetworkCoroutineAPI;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class z3k {
    public final r3k a;
    public final NetworkCoroutineAPI b;

    public z3k(r3k r3kVar, NetworkCoroutineAPI networkCoroutineAPI) {
        networkCoroutineAPI.getClass();
        this.a = r3kVar;
        this.b = networkCoroutineAPI;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(List list, sq3 sq3Var) {
        w3k w3kVar;
        int i;
        if (sq3Var instanceof w3k) {
            w3kVar = (w3k) sq3Var;
            int i2 = w3kVar.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                w3kVar.t = i2 - Integer.MIN_VALUE;
                Object obj = w3kVar.r;
                lu3 lu3Var = lu3.a;
                i = w3kVar.t;
                if (i != 0) {
                    y6a.M(obj);
                    w3kVar.t = 1;
                    r3k r3kVar = this.a;
                    obj = gz8.U(w3kVar, r3kVar.a, false, true, new q3k(r3kVar, list, 0));
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return new Integer(((long[]) obj).length);
            }
        }
        w3kVar = new w3k(this, sq3Var);
        Object obj2 = w3kVar.r;
        lu3 lu3Var2 = lu3.a;
        i = w3kVar.t;
        if (i != 0) {
        }
        return new Integer(((long[]) obj2).length);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(sq3 sq3Var) {
        x3k x3kVar;
        int i;
        if (sq3Var instanceof x3k) {
            x3kVar = (x3k) sq3Var;
            int i2 = x3kVar.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                x3kVar.t = i2 - Integer.MIN_VALUE;
                Object obj = x3kVar.r;
                lu3 lu3Var = lu3.a;
                i = x3kVar.t;
                if (i != 0) {
                    y6a.M(obj);
                    x3kVar.t = 1;
                    obj = gz8.U(x3kVar, this.a.a, true, false, new crj(17));
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return CollectionsKt.W0((Iterable) obj);
            }
        }
        x3kVar = new x3k(this, sq3Var);
        Object obj2 = x3kVar.r;
        lu3 lu3Var2 = lu3.a;
        i = x3kVar.t;
        if (i != 0) {
        }
        return CollectionsKt.W0((Iterable) obj2);
    }
}
