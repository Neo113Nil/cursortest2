package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class bvg {
    public static final vqg a = new vqg(21);
    public static final zug b = new zug();
    public static final yug c = new yug();
    public static final b6e d = new b6e(1);

    public static xtc a(xtc xtcVar, jvg jvgVar, ewd ewdVar, myd mydVar, boolean z, boolean z2, wzc wzcVar, int i) {
        if ((i & 8) != 0) {
            z = true;
        }
        boolean z3 = z;
        if ((i & 16) != 0) {
            z2 = false;
        }
        boolean z4 = z2;
        if ((i & 64) != 0) {
            wzcVar = null;
        }
        return xtcVar.z(new xug(jvgVar, ewdVar, mydVar, z3, z4, null, wzcVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(svg svgVar, long j, sq3 sq3Var) {
        avg avgVar;
        int i;
        csf csfVar;
        svg svgVar2;
        if (sq3Var instanceof avg) {
            avgVar = (avg) sq3Var;
            int i2 = avgVar.u;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                avgVar.u = i2 - Integer.MIN_VALUE;
                Object obj = avgVar.t;
                lu3 lu3Var = lu3.a;
                i = avgVar.u;
                if (i != 0) {
                    y6a.M(obj);
                    csfVar = new csf();
                    m1d m1dVar = m1d.a;
                    h2 h2Var = new h2(svgVar, j, csfVar, (rq3) null, 4);
                    avgVar.r = svgVar;
                    avgVar.s = csfVar;
                    avgVar.u = 1;
                    if (svgVar.f(m1dVar, h2Var, avgVar) == lu3Var) {
                        return lu3Var;
                    }
                    svgVar2 = svgVar;
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    csf csfVar2 = avgVar.s;
                    svg svgVar3 = avgVar.r;
                    y6a.M(obj);
                    csfVar = csfVar2;
                    svgVar2 = svgVar3;
                }
                return new dnd(svgVar2.h(csfVar.a));
            }
        }
        avgVar = new avg(sq3Var);
        Object obj2 = avgVar.t;
        lu3 lu3Var2 = lu3.a;
        i = avgVar.u;
        if (i != 0) {
        }
        return new dnd(svgVar2.h(csfVar.a));
    }
}
