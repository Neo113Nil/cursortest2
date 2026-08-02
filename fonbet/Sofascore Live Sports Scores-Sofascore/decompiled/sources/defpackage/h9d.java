package defpackage;

import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class h9d {
    public m9d a;
    public m9d b;
    public Function0 c = new jmc(this, 14);
    public ku3 d;

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0052, code lost:
    
        if (r0 == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006d, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x006b, code lost:
    
        if (r0 == r1) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(long j, long j2, sq3 sq3Var) {
        f9d f9dVar;
        int i;
        long j3;
        if (sq3Var instanceof f9d) {
            f9dVar = (f9d) sq3Var;
            int i2 = f9dVar.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                f9dVar.t = i2 - Integer.MIN_VALUE;
                f9d f9dVar2 = f9dVar;
                Object obj = f9dVar2.r;
                lu3 lu3Var = lu3.a;
                i = f9dVar2.t;
                if (i != 0) {
                    y6a.M(obj);
                    m9d m9dVar = this.a;
                    j3 = 0;
                    if ((m9dVar != null ? m9dVar.l1() : null) == null) {
                        m9d m9dVar2 = this.b;
                        if (m9dVar2 != null) {
                            f9dVar2.t = 1;
                            obj = m9dVar2.T0(j, j2, f9dVar2);
                        }
                    } else {
                        m9d m9dVar3 = this.a;
                        m9d l1 = m9dVar3 != null ? m9dVar3.l1() : null;
                        if (l1 != null) {
                            f9dVar2.t = 2;
                            obj = l1.T0(j, j2, f9dVar2);
                        }
                    }
                } else if (i == 1) {
                    y6a.M(obj);
                    j3 = ((vmk) obj).a;
                } else {
                    if (i != 2) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    j3 = ((vmk) obj).a;
                }
                return new vmk(j3);
            }
        }
        f9dVar = new f9d(this, sq3Var);
        f9d f9dVar22 = f9dVar;
        Object obj2 = f9dVar22.r;
        lu3 lu3Var2 = lu3.a;
        i = f9dVar22.t;
        if (i != 0) {
        }
        return new vmk(j3);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(long j, sq3 sq3Var) {
        g9d g9dVar;
        int i;
        long j2;
        if (sq3Var instanceof g9d) {
            g9dVar = (g9d) sq3Var;
            int i2 = g9dVar.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                g9dVar.t = i2 - Integer.MIN_VALUE;
                Object obj = g9dVar.r;
                lu3 lu3Var = lu3.a;
                i = g9dVar.t;
                if (i != 0) {
                    y6a.M(obj);
                    m9d m9dVar = this.a;
                    m9d l1 = m9dVar != null ? m9dVar.l1() : null;
                    if (l1 == null) {
                        j2 = 0;
                        return new vmk(j2);
                    }
                    g9dVar.t = 1;
                    obj = l1.x0(j, g9dVar);
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
                j2 = ((vmk) obj).a;
                return new vmk(j2);
            }
        }
        g9dVar = new g9d(this, sq3Var);
        Object obj2 = g9dVar.r;
        lu3 lu3Var2 = lu3.a;
        i = g9dVar.t;
        if (i != 0) {
        }
        j2 = ((vmk) obj2).a;
        return new vmk(j2);
    }

    public final ku3 c() {
        ku3 ku3Var = (ku3) this.c.invoke();
        if (ku3Var != null) {
            return ku3Var;
        }
        a70.r("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        return null;
    }
}
