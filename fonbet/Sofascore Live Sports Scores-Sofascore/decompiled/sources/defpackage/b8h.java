package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class b8h {
    public static final double f = Math.random();
    public static final /* synthetic */ int g = 0;
    public final r38 a;
    public final l48 b;
    public final a9h c;
    public final q06 d;
    public final CoroutineContext e;

    public b8h(r38 r38Var, l48 l48Var, a9h a9hVar, q06 q06Var, CoroutineContext coroutineContext) {
        r38Var.getClass();
        l48Var.getClass();
        a9hVar.getClass();
        q06Var.getClass();
        coroutineContext.getClass();
        this.a = r38Var;
        this.b = l48Var;
        this.c = a9hVar;
        this.d = q06Var;
        this.e = coroutineContext;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0079, code lost:
    
        if (r5.b(r0) == r1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x007b, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0042, code lost:
    
        if (r6 == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(sq3 sq3Var) {
        a8h a8hVar;
        int i;
        Collection values;
        Iterator it;
        if (sq3Var instanceof a8h) {
            a8hVar = (a8h) sq3Var;
            int i2 = a8hVar.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                a8hVar.t = i2 - Integer.MIN_VALUE;
                Object obj = a8hVar.r;
                lu3 lu3Var = lu3.a;
                i = a8hVar.t;
                a9h a9hVar = this.c;
                if (i != 0) {
                    y6a.M(obj);
                    v58 v58Var = v58.a;
                    a8hVar.t = 1;
                    obj = v58Var.b(a8hVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y6a.M(obj);
                        Boolean b = a9hVar.a.b();
                        return !((b == null && (b = a9hVar.b.b()) == null) ? true : b.booleanValue()) ? Boolean.FALSE : f <= a9hVar.a() ? Boolean.TRUE : Boolean.FALSE;
                    }
                    y6a.M(obj);
                }
                values = ((Map) obj).values();
                if ((values instanceof Collection) || !values.isEmpty()) {
                    it = values.iterator();
                    while (it.hasNext()) {
                        if (((ew3) it.next()).a.i()) {
                            a8hVar.t = 2;
                        }
                    }
                }
                return Boolean.FALSE;
            }
        }
        a8hVar = new a8h(this, sq3Var);
        Object obj2 = a8hVar.r;
        lu3 lu3Var2 = lu3.a;
        i = a8hVar.t;
        a9h a9hVar2 = this.c;
        if (i != 0) {
        }
        values = ((Map) obj2).values();
        if (values instanceof Collection) {
        }
        it = values.iterator();
        while (it.hasNext()) {
        }
        return Boolean.FALSE;
    }
}
