package defpackage;

import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class l8h implements g8h {
    public final j2d a = new j2d();
    public final k8h b = new k8h(this);

    /* JADX WARN: Code restructure failed: missing block: B:32:0x005b, code lost:
    
        if (r9.e(r0) == r1) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Function2 function2, sq3 sq3Var) {
        h8h h8hVar;
        lu3 lu3Var;
        int i;
        j2d j2dVar;
        Function2 function22;
        h2d h2dVar;
        Object invoke;
        try {
            if (sq3Var instanceof h8h) {
                h8hVar = (h8h) sq3Var;
                int i2 = h8hVar.w;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    h8hVar.w = i2 - Integer.MIN_VALUE;
                    Object obj = h8hVar.u;
                    lu3Var = lu3.a;
                    i = h8hVar.w;
                    if (i != 0) {
                        y6a.M(obj);
                        h8hVar.r = this;
                        h8hVar.s = (hoi) function2;
                        j2dVar = this.a;
                        h8hVar.t = j2dVar;
                        h8hVar.w = 1;
                        function22 = function2;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                a70.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            h2dVar = (h2d) h8hVar.r;
                            try {
                                y6a.M(obj);
                                h2dVar.f(null);
                                return obj;
                            } catch (Throwable th) {
                                th = th;
                                h2dVar.f(null);
                                throw th;
                            }
                        }
                        j2d j2dVar2 = h8hVar.t;
                        Function2 function23 = (Function2) h8hVar.s;
                        l8h l8hVar = (l8h) h8hVar.r;
                        y6a.M(obj);
                        j2dVar = j2dVar2;
                        this = l8hVar;
                        function22 = function23;
                    }
                    k8h k8hVar = this.b;
                    h8hVar.r = j2dVar;
                    h8hVar.s = null;
                    h8hVar.t = null;
                    h8hVar.w = 2;
                    invoke = function22.invoke(k8hVar, h8hVar);
                    if (invoke != lu3Var) {
                        j2d j2dVar3 = j2dVar;
                        obj = invoke;
                        h2dVar = j2dVar3;
                        h2dVar.f(null);
                        return obj;
                    }
                    return lu3Var;
                }
            }
            k8h k8hVar2 = this.b;
            h8hVar.r = j2dVar;
            h8hVar.s = null;
            h8hVar.t = null;
            h8hVar.w = 2;
            invoke = function22.invoke(k8hVar2, h8hVar);
            if (invoke != lu3Var) {
            }
            return lu3Var;
        } catch (Throwable th2) {
            th = th2;
            h2dVar = j2dVar;
            h2dVar.f(null);
            throw th;
        }
        h8hVar = new h8h(this, sq3Var);
        Object obj2 = h8hVar.u;
        lu3Var = lu3.a;
        i = h8hVar.w;
        if (i != 0) {
        }
    }
}
