package defpackage;

import com.ironsource.Ua;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class ebg {
    public final jbg a;
    public final y3g b;
    public final xag c;
    public final y3g d;
    public final pgg e;
    public final mjg f;
    public final yia g;
    public final pig h;
    public final qcg i;
    public final wib j;
    public final bka k;
    public final ujg l;
    public String m;

    public ebg(jbg jbgVar, y3g y3gVar, xag xagVar, y3g y3gVar2, pgg pggVar, mjg mjgVar, yia yiaVar, pig pigVar, qcg qcgVar, wib wibVar) {
        wibVar.getClass();
        b10 b10Var = qcgVar.b;
        bka bkaVar = new bka(17, false);
        bkaVar.b = b10Var;
        ujg P = ujg.P(null);
        mjgVar.getClass();
        wibVar.getClass();
        this.a = jbgVar;
        this.b = y3gVar;
        this.c = xagVar;
        this.d = y3gVar2;
        this.e = pggVar;
        this.f = mjgVar;
        this.g = yiaVar;
        this.h = pigVar;
        this.i = qcgVar;
        this.j = wibVar;
        this.k = bkaVar;
        this.l = P;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(hbg hbgVar, List list, zjg zjgVar, sq3 sq3Var) {
        bbg bbgVar;
        int i;
        if (sq3Var instanceof bbg) {
            bbgVar = (bbg) sq3Var;
            int i2 = bbgVar.u;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bbgVar.u = i2 - Integer.MIN_VALUE;
                bbg bbgVar2 = bbgVar;
                Object obj = bbgVar2.s;
                lu3 lu3Var = lu3.a;
                i = bbgVar2.u;
                if (i != 0) {
                    y6a.M(obj);
                    pgg pggVar = this.e;
                    ((qgg) pggVar).b(zjgVar.b, r3.a, zjgVar.c.b);
                    vjg vjgVar = zjgVar.d;
                    if (vjgVar != null) {
                        yia yiaVar = this.g;
                        String str = vjgVar.a;
                        str.getClass();
                        dkg dkgVar = (dkg) yiaVar.b;
                        synchronized (dkgVar) {
                            dkgVar.d = str;
                        }
                        pig pigVar = this.h;
                        List list2 = vjgVar.b;
                        list2.getClass();
                        pigVar.i = list2;
                        pig pigVar2 = this.h;
                        String str2 = vjgVar.c;
                        str2.getClass();
                        pigVar2.l = str2;
                    }
                    jbg jbgVar = this.a;
                    pgg pggVar2 = this.e;
                    bka bkaVar = this.k;
                    this.j.getClass();
                    bbgVar2.r = this;
                    bbgVar2.u = 1;
                    obj = jbgVar.a(hbgVar, zjgVar, list, pggVar2, bkaVar, bbgVar2);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = bbgVar2.r;
                    y6a.M(obj);
                }
                rbg rbgVar = (rbg) obj;
                this.m = rbgVar.b;
                return rbgVar;
            }
        }
        bbgVar = new bbg(this, sq3Var);
        bbg bbgVar22 = bbgVar;
        Object obj2 = bbgVar22.s;
        lu3 lu3Var2 = lu3.a;
        i = bbgVar22.u;
        if (i != 0) {
        }
        rbg rbgVar2 = (rbg) obj2;
        this.m = rbgVar2.b;
        return rbgVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x015e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
    /* JADX WARN: Type inference failed for: r3v10, types: [kotlin.coroutines.CoroutineContext, nu3, rq3] */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9, types: [a62, java.lang.Object, kotlin.coroutines.CoroutineContext, nu3] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(hbg hbgVar, rbg rbgVar, Class cls, zjg zjgVar, sq3 sq3Var) {
        cbg cbgVar;
        int i;
        ?? r3;
        Object B;
        zjg zjgVar2;
        zag zagVar;
        ebg ebgVar;
        nag nagVar;
        hbg hbgVar2;
        zjg zjgVar3;
        ?? r32;
        Long valueOf;
        Long l;
        Long l2;
        LinkedHashMap linkedHashMap;
        char c;
        ckg a;
        String str;
        ebg ebgVar2 = this;
        hbg hbgVar3 = hbgVar;
        if (sq3Var instanceof cbg) {
            cbgVar = (cbg) sq3Var;
            int i2 = cbgVar.x;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cbgVar.x = i2 - Integer.MIN_VALUE;
                cbg cbgVar2 = cbgVar;
                Object obj = cbgVar2.v;
                lu3 lu3Var = lu3.a;
                i = cbgVar2.x;
                int i3 = 0;
                if (i != 0) {
                    y6a.M(obj);
                    wjg wjgVar = zjgVar.b;
                    yjg yjgVar = zjgVar.c;
                    long j = yjgVar.a;
                    String str2 = yjgVar.b;
                    pgg pggVar = ebgVar2.e;
                    qgg qggVar = (qgg) pggVar;
                    qggVar.b(wjgVar, j, str2);
                    hbgVar3.getClass();
                    qggVar.l = (Long) qggVar.c.invoke();
                    qggVar.f = hbgVar3;
                    List list = rbgVar.a;
                    cbgVar2.r = ebgVar2;
                    cbgVar2.s = hbgVar3;
                    cbgVar2.t = zjgVar;
                    cbgVar2.x = 1;
                    r3 = 0;
                    B = ebgVar2.b.B(cls, list, pggVar, ebgVar2.f, ebgVar2.h, ebgVar2.i, cbgVar2);
                    if (B != lu3Var) {
                        zjgVar2 = zjgVar;
                    }
                    return lu3Var;
                }
                if (i != 1) {
                    if (i != 2) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    nagVar = cbgVar2.u;
                    zjgVar3 = cbgVar2.t;
                    hbgVar2 = cbgVar2.s;
                    ebgVar = cbgVar2.r;
                    y6a.M(obj);
                    r32 = 0;
                    kag kagVar = nagVar.a;
                    jag jagVar = nagVar.b;
                    xag xagVar = ebgVar.c;
                    pig pigVar = ebgVar.h;
                    wib wibVar = ebgVar.j;
                    qcg qcgVar = ebgVar.i;
                    kagVar.onAdLifecycleConfigured(xagVar);
                    zag zagVar2 = (zag) ebgVar.c;
                    zagVar2.a();
                    xw3.L(zagVar2.k, r32, r32, new yag(zagVar2, r32, i3), 3);
                    qgg qggVar2 = (qgg) ebgVar.e;
                    ngg nggVar = qggVar2.b;
                    long longValue = ((Number) qggVar2.c.invoke()).longValue();
                    Long l3 = qggVar2.l;
                    valueOf = l3 == null ? Long.valueOf(longValue - l3.longValue()) : r32;
                    l = qggVar2.j;
                    if (l != null) {
                        long longValue2 = l.longValue();
                        Long l4 = qggVar2.k;
                        if (l4 != null) {
                            l2 = Long.valueOf(l4.longValue() - longValue2);
                            qggVar2.m = Long.valueOf(longValue);
                            linkedHashMap = new LinkedHashMap();
                            if (l2 != null) {
                                c = 0;
                                linkedHashMap.put("response_time", Long.valueOf(l2.longValue()));
                            } else {
                                c = 0;
                            }
                            if (valueOf != null) {
                                linkedHashMap.put("rendering_time", Long.valueOf(valueOf.longValue()));
                            }
                            if (l2 != null && valueOf != null) {
                                linkedHashMap.put("total_loading_time", Long.valueOf(valueOf.longValue() + l2.longValue()));
                            }
                            meg megVar = new meg(linkedHashMap);
                            ijg[] ijgVarArr = new ijg[1];
                            ijgVarArr[c] = megVar;
                            a = nggVar.a("Ad loading success", bkg.INFO, "ad_loading_success", qggVar2.d, qggVar2.c(ijgVarArr));
                            if (a != null) {
                                nggVar.e(a, qggVar2.e, qggVar2.f, qggVar2.a, qggVar2.q, qggVar2.p, qggVar2.r, qggVar2.t, false);
                            }
                            hbgVar2.getClass();
                            String valueOf2 = String.valueOf(hbgVar2.a);
                            int i4 = (int) hbgVar2.b;
                            String str3 = hbgVar2.c;
                            int i5 = jagVar.b.a;
                            int i6 = zjgVar3.c.a;
                            str = jagVar.d;
                            if (str == null) {
                                str = "0";
                            }
                            String str4 = str;
                            Map map = jagVar.G;
                            wibVar.getClass();
                            pigVar.j = new sig(valueOf2, i4, str3, i5, i6, str4, map, qcgVar.b);
                            jgg jggVar = jagVar.g0;
                            pigVar.k = jggVar != null ? jggVar.f : null;
                            ebgVar.m = null;
                            return nagVar.a;
                        }
                    }
                    l2 = r32;
                    qggVar2.m = Long.valueOf(longValue);
                    linkedHashMap = new LinkedHashMap();
                    if (l2 != null) {
                    }
                    if (valueOf != null) {
                    }
                    if (l2 != null) {
                        linkedHashMap.put("total_loading_time", Long.valueOf(valueOf.longValue() + l2.longValue()));
                    }
                    meg megVar2 = new meg(linkedHashMap);
                    ijg[] ijgVarArr2 = new ijg[1];
                    ijgVarArr2[c] = megVar2;
                    a = nggVar.a("Ad loading success", bkg.INFO, "ad_loading_success", qggVar2.d, qggVar2.c(ijgVarArr2));
                    if (a != null) {
                    }
                    hbgVar2.getClass();
                    String valueOf22 = String.valueOf(hbgVar2.a);
                    int i42 = (int) hbgVar2.b;
                    String str32 = hbgVar2.c;
                    int i52 = jagVar.b.a;
                    int i62 = zjgVar3.c.a;
                    str = jagVar.d;
                    if (str == null) {
                    }
                    String str42 = str;
                    Map map2 = jagVar.G;
                    wibVar.getClass();
                    pigVar.j = new sig(valueOf22, i42, str32, i52, i62, str42, map2, qcgVar.b);
                    jgg jggVar2 = jagVar.g0;
                    pigVar.k = jggVar2 != null ? jggVar2.f : null;
                    ebgVar.m = null;
                    return nagVar.a;
                }
                zjg zjgVar4 = cbgVar2.t;
                hbgVar3 = cbgVar2.s;
                ebg ebgVar3 = cbgVar2.r;
                y6a.M(obj);
                zjgVar2 = zjgVar4;
                ebgVar2 = ebgVar3;
                B = obj;
                r3 = 0;
                nag nagVar2 = (nag) B;
                xag xagVar2 = ebgVar2.c;
                gcg gcgVar = nagVar2.c;
                cbgVar2.r = ebgVar2;
                cbgVar2.s = hbgVar3;
                cbgVar2.t = zjgVar2;
                cbgVar2.u = nagVar2;
                cbgVar2.x = 2;
                zagVar = (zag) xagVar2;
                if (!zagVar.m) {
                    ogj.k("SASAdLifecycleControllerImpl.configure method must be called only one");
                    return r3;
                }
                g62 g = ml4.g(0, 7, r3);
                xw3.L(zagVar.k, r3, r3, new cce(zagVar, gcgVar, zjgVar2, g, null, 11), 3);
                Object f = g.f(cbgVar2);
                if (f != lu3Var) {
                    f = Unit.a;
                }
                if (f != lu3Var) {
                    ebgVar = ebgVar2;
                    nagVar = nagVar2;
                    hbgVar2 = hbgVar3;
                    zjgVar3 = zjgVar2;
                    r32 = r3;
                    kag kagVar2 = nagVar.a;
                    jag jagVar2 = nagVar.b;
                    xag xagVar3 = ebgVar.c;
                    pig pigVar2 = ebgVar.h;
                    wib wibVar2 = ebgVar.j;
                    qcg qcgVar2 = ebgVar.i;
                    kagVar2.onAdLifecycleConfigured(xagVar3);
                    zag zagVar22 = (zag) ebgVar.c;
                    zagVar22.a();
                    xw3.L(zagVar22.k, r32, r32, new yag(zagVar22, r32, i3), 3);
                    qgg qggVar22 = (qgg) ebgVar.e;
                    ngg nggVar2 = qggVar22.b;
                    long longValue3 = ((Number) qggVar22.c.invoke()).longValue();
                    Long l32 = qggVar22.l;
                    if (l32 == null) {
                    }
                    l = qggVar22.j;
                    if (l != null) {
                    }
                    l2 = r32;
                    qggVar22.m = Long.valueOf(longValue3);
                    linkedHashMap = new LinkedHashMap();
                    if (l2 != null) {
                    }
                    if (valueOf != null) {
                    }
                    if (l2 != null) {
                    }
                    meg megVar22 = new meg(linkedHashMap);
                    ijg[] ijgVarArr22 = new ijg[1];
                    ijgVarArr22[c] = megVar22;
                    a = nggVar2.a("Ad loading success", bkg.INFO, "ad_loading_success", qggVar22.d, qggVar22.c(ijgVarArr22));
                    if (a != null) {
                    }
                    hbgVar2.getClass();
                    String valueOf222 = String.valueOf(hbgVar2.a);
                    int i422 = (int) hbgVar2.b;
                    String str322 = hbgVar2.c;
                    int i522 = jagVar2.b.a;
                    int i622 = zjgVar3.c.a;
                    str = jagVar2.d;
                    if (str == null) {
                    }
                    String str422 = str;
                    Map map22 = jagVar2.G;
                    wibVar2.getClass();
                    pigVar2.j = new sig(valueOf222, i422, str322, i522, i622, str422, map22, qcgVar2.b);
                    jgg jggVar22 = jagVar2.g0;
                    pigVar2.k = jggVar22 != null ? jggVar22.f : null;
                    ebgVar.m = null;
                    return nagVar.a;
                }
                return lu3Var;
            }
        }
        cbgVar = new cbg(ebgVar2, sq3Var);
        cbg cbgVar22 = cbgVar;
        Object obj2 = cbgVar22.v;
        lu3 lu3Var2 = lu3.a;
        i = cbgVar22.x;
        int i32 = 0;
        if (i != 0) {
        }
        nag nagVar22 = (nag) B;
        xag xagVar22 = ebgVar2.c;
        gcg gcgVar2 = nagVar22.c;
        cbgVar22.r = ebgVar2;
        cbgVar22.s = hbgVar3;
        cbgVar22.t = zjgVar2;
        cbgVar22.u = nagVar22;
        cbgVar22.x = 2;
        zagVar = (zag) xagVar22;
        if (!zagVar.m) {
        }
    }

    public final hdg c(Exception exc) {
        String str;
        if ((exc instanceof qag) || (exc instanceof fbg)) {
            return new hdg(gdg.b, exc.getMessage());
        }
        boolean z = exc instanceof qij;
        pgg pggVar = this.e;
        if (z) {
            ((qgg) pggVar).f(exc);
            return new hdg(gdg.b, null);
        }
        if (exc instanceof oag) {
            return new hdg(gdg.c, exc.getMessage());
        }
        if (exc instanceof ufg) {
            return new hdg(gdg.a, null);
        }
        if (exc instanceof heg) {
            this.m = ((heg) exc).a;
            return new hdg(gdg.e, exc.getMessage());
        }
        if (exc instanceof ieg) {
            return new hdg(gdg.d, exc.getMessage());
        }
        boolean z2 = exc instanceof geg;
        if (!z2 && !(exc instanceof abg)) {
            ((qgg) pggVar).e(exc);
            return new hdg(gdg.i, exc.getMessage());
        }
        geg gegVar = z2 ? (geg) exc : null;
        if (gegVar != null && (str = gegVar.a) != null) {
            this.m = str;
        }
        ((qgg) pggVar).e(exc);
        return new hdg(gdg.d, exc.getMessage());
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(hbg hbgVar, Class cls, List list, sq3 sq3Var) {
        dbg dbgVar;
        int i;
        ebg ebgVar;
        String str;
        String str2;
        if (sq3Var instanceof dbg) {
            dbgVar = (dbg) sq3Var;
            int i2 = dbgVar.u;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dbgVar.u = i2 - Integer.MIN_VALUE;
                dbg dbgVar2 = dbgVar;
                Object obj = dbgVar2.s;
                lu3 lu3Var = lu3.a;
                i = dbgVar2.u;
                if (i != 0) {
                    y6a.M(obj);
                    wib wibVar = this.j;
                    wibVar.getClass();
                    if (!wib.g) {
                        a70.r("The Equativ Display SDK is not yet configured for this application. Please make sure you call 'SASConfiguration.configure(CONTEXT)' before making any ad call.");
                        return null;
                    }
                    try {
                        wibVar.getClass();
                        h10 h10Var = new h10(this, hbgVar, list, cls, null, 24);
                        dbgVar2.r = this;
                        dbgVar2.u = 1;
                        obj = wba.U(Ua.s, h10Var, dbgVar2);
                        if (obj == lu3Var) {
                            return lu3Var;
                        }
                        ebgVar = this;
                    } catch (Exception e) {
                        e = e;
                        ebgVar = this;
                        throw ebgVar.c(e);
                    } catch (Throwable th) {
                        th = th;
                        ebgVar = this;
                        str = ebgVar.m;
                        if (str != null) {
                            ebgVar.l.J(ebgVar.m);
                        }
                        throw th;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ebgVar = dbgVar2.r;
                    try {
                        try {
                            y6a.M(obj);
                        } catch (Exception e2) {
                            e = e2;
                            throw ebgVar.c(e);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        str = ebgVar.m;
                        if (str != null && !StringsKt.R(str)) {
                            ebgVar.l.J(ebgVar.m);
                        }
                        throw th;
                    }
                }
                str2 = ebgVar.m;
                if (str2 != null && !StringsKt.R(str2)) {
                    ebgVar.l.J(ebgVar.m);
                }
                return obj;
            }
        }
        dbgVar = new dbg(this, sq3Var);
        dbg dbgVar22 = dbgVar;
        Object obj2 = dbgVar22.s;
        lu3 lu3Var2 = lu3.a;
        i = dbgVar22.u;
        if (i != 0) {
        }
        str2 = ebgVar.m;
        if (str2 != null) {
            ebgVar.l.J(ebgVar.m);
        }
        return obj2;
    }
}
