package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class pae implements avj, enf {
    public final Function2 a;
    public final glg b;
    public final AtomicInteger c;
    public zuj d;

    public pae(Function2 function2, glg glgVar) {
        glgVar.getClass();
        this.a = function2;
        this.b = glgVar;
        this.c = new AtomicInteger(0);
    }

    @Override // defpackage.avj
    public final Object a(zuj zujVar, Function2 function2, hoi hoiVar) {
        Object invoke = this.a.invoke(new yw(this, zujVar, function2, null, 11), hoiVar);
        lu3 lu3Var = lu3.a;
        return invoke;
    }

    @Override // defpackage.avj
    public final Boolean b(rq3 rq3Var) {
        return Boolean.valueOf(this.d != null || this.b.y());
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x004e, code lost:
    
        if (r13 == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.i0f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, Function1 function1, sq3 sq3Var) {
        oae oaeVar;
        Object obj;
        int i;
        if (sq3Var instanceof oae) {
            oaeVar = (oae) sq3Var;
            int i2 = oaeVar.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                oaeVar.v = i2 - Integer.MIN_VALUE;
                obj = oaeVar.t;
                Object obj2 = lu3.a;
                i = oaeVar.v;
                if (i != 0) {
                    y6a.M(obj);
                    oaeVar.r = str;
                    oaeVar.s = function1;
                    oaeVar.v = 1;
                    obj = b(oaeVar);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            y6a.M(obj);
                            return obj;
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    function1 = oaeVar.s;
                    str = oaeVar.r;
                    y6a.M(obj);
                }
                String str2 = str;
                Function1 function12 = function1;
                rq3 rq3Var = null;
                if (!((Boolean) obj).booleanValue()) {
                    k5d k5dVar = new k5d(this, str2, function12, rq3Var, 1);
                    oaeVar.r = null;
                    oaeVar.s = null;
                    oaeVar.v = 2;
                    Object invoke = this.a.invoke(k5dVar, oaeVar);
                    return invoke == obj2 ? obj2 : invoke;
                }
                nlg V0 = this.b.V0(str2);
                try {
                    Object invoke2 = function12.invoke(V0);
                    o1j.t(V0, null);
                    return invoke2;
                } finally {
                }
            }
        }
        oaeVar = new oae(this, sq3Var);
        obj = oaeVar.t;
        Object obj22 = lu3.a;
        i = oaeVar.v;
        if (i != 0) {
        }
        String str22 = str;
        Function1 function122 = function1;
        rq3 rq3Var2 = null;
        if (!((Boolean) obj).booleanValue()) {
        }
    }

    @Override // defpackage.enf
    public final glg d() {
        return this.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(zuj zujVar, Function2 function2, sq3 sq3Var) {
        nae naeVar;
        int i;
        AtomicInteger atomicInteger;
        int i2;
        try {
            if (sq3Var instanceof nae) {
                naeVar = (nae) sq3Var;
                int i3 = naeVar.u;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    naeVar.u = i3 - Integer.MIN_VALUE;
                    Object obj = naeVar.s;
                    Object obj2 = lu3.a;
                    i = naeVar.u;
                    atomicInteger = this.c;
                    i2 = 1;
                    glg glgVar = this.b;
                    if (i != 0) {
                        y6a.M(obj);
                        int ordinal = zujVar.ordinal();
                        if (ordinal == 0) {
                            b0a.F(glgVar, "BEGIN DEFERRED TRANSACTION");
                        } else if (ordinal == 1) {
                            b0a.F(glgVar, "BEGIN IMMEDIATE TRANSACTION");
                        } else {
                            if (ordinal != 2) {
                                zzl.b();
                                return null;
                            }
                            b0a.F(glgVar, "BEGIN EXCLUSIVE TRANSACTION");
                        }
                        if (atomicInteger.incrementAndGet() > 0) {
                            this.d = zujVar;
                        }
                        Object maeVar = new mae(this, 0);
                        naeVar.r = 1;
                        naeVar.u = 1;
                        obj = function2.invoke(maeVar, naeVar);
                        if (obj == obj2) {
                            return obj2;
                        }
                    } else {
                        if (i != 1) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i2 = naeVar.r;
                        y6a.M(obj);
                    }
                    if (atomicInteger.decrementAndGet() == 0) {
                        this.d = null;
                    }
                    if (i2 == 0) {
                        b0a.F(glgVar, "END TRANSACTION");
                        return obj;
                    }
                    b0a.F(glgVar, "ROLLBACK TRANSACTION");
                    return obj;
                }
            }
            if (i != 0) {
            }
            if (atomicInteger.decrementAndGet() == 0) {
            }
            if (i2 == 0) {
            }
        } finally {
        }
        naeVar = new nae(this, sq3Var);
        Object obj3 = naeVar.s;
        Object obj22 = lu3.a;
        i = naeVar.u;
        atomicInteger = this.c;
        i2 = 1;
        glg glgVar2 = this.b;
    }
}
