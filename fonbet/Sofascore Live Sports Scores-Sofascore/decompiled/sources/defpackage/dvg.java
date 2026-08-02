package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class dvg implements e9d {
    public final svg a;
    public boolean b;

    public dvg(svg svgVar, boolean z) {
        this.a = svgVar;
        this.b = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.e9d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object T0(long j, long j2, rq3 rq3Var) {
        cvg cvgVar;
        int i;
        long j3;
        if (rq3Var instanceof cvg) {
            cvgVar = (cvg) rq3Var;
            int i2 = cvgVar.u;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cvgVar.u = i2 - Integer.MIN_VALUE;
                Object obj = cvgVar.s;
                lu3 lu3Var = lu3.a;
                i = cvgVar.u;
                if (i != 0) {
                    y6a.M(obj);
                    j3 = 0;
                    if (this.b) {
                        svg svgVar = this.a;
                        if (!svgVar.i) {
                            cvgVar.r = j2;
                            cvgVar.u = 1;
                            obj = svgVar.a(j2, cvgVar);
                            if (obj == lu3Var) {
                                return lu3Var;
                            }
                        }
                        j3 = vmk.d(j2, j3);
                    }
                    return new vmk(j3);
                }
                if (i != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                j2 = cvgVar.r;
                y6a.M(obj);
                j3 = ((vmk) obj).a;
                j3 = vmk.d(j2, j3);
                return new vmk(j3);
            }
        }
        cvgVar = new cvg(this, (sq3) rq3Var);
        Object obj2 = cvgVar.s;
        lu3 lu3Var2 = lu3.a;
        i = cvgVar.u;
        if (i != 0) {
        }
        j3 = ((vmk) obj2).a;
        j3 = vmk.d(j2, j3);
        return new vmk(j3);
    }

    @Override // defpackage.e9d
    public final long b0(int i, long j, long j2) {
        if (!this.b) {
            return 0L;
        }
        svg svgVar = this.a;
        if (svgVar.a.b()) {
            return 0L;
        }
        return svgVar.h(svgVar.d(svgVar.a.e(svgVar.d(svgVar.g(j2)))));
    }
}
