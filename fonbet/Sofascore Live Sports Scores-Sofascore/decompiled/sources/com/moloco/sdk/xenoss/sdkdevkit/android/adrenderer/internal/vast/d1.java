package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast;

import defpackage.a70;
import defpackage.ccj;
import defpackage.fc6;
import defpackage.fsf;
import defpackage.g5b;
import defpackage.g8i;
import defpackage.jr5;
import defpackage.lnb;
import defpackage.lu3;
import defpackage.mj5;
import defpackage.mqi;
import defpackage.p2g;
import defpackage.rq3;
import defpackage.ru1;
import defpackage.s9a;
import defpackage.sq3;
import defpackage.tpc;
import defpackage.u2g;
import defpackage.vwb;
import defpackage.w2g;
import defpackage.w32;
import defpackage.x7c;
import defpackage.y6a;
import defpackage.ypa;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.text.StringsKt;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public abstract class d1 {
    public static final mqi a = ypa.b(new com.moloco.sdk.service_locator.h(17));
    public static final NumberFormat b = NumberFormat.getPercentInstance();

    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object A(XmlPullParser xmlPullParser, boolean z, sq3 sq3Var) {
        o0 o0Var;
        int i;
        fsf fsfVar;
        ArrayList arrayList;
        ArrayList arrayList2;
        if (sq3Var instanceof o0) {
            o0Var = (o0) sq3Var;
            int i2 = o0Var.w;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                o0Var.w = i2 - Integer.MIN_VALUE;
                Object obj = o0Var.v;
                lu3 lu3Var = lu3.a;
                i = o0Var.w;
                if (i != 0) {
                    fsf g = lnb.g(obj);
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList arrayList4 = new ArrayList();
                    jr5 jr5Var = new jr5(xmlPullParser, null, g, arrayList3, arrayList4, 19);
                    o0Var.s = g;
                    o0Var.t = arrayList3;
                    o0Var.u = arrayList4;
                    o0Var.r = z;
                    o0Var.w = 1;
                    if (s9a.r(jr5Var, o0Var) == lu3Var) {
                        return lu3Var;
                    }
                    fsfVar = g;
                    arrayList = arrayList3;
                    arrayList2 = arrayList4;
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z = o0Var.r;
                    arrayList2 = o0Var.u;
                    arrayList = o0Var.t;
                    fsfVar = o0Var.s;
                    y6a.M(obj);
                }
                if (z || fsfVar.a != null) {
                    return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.a((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.j0) fsfVar.a, arrayList, arrayList2);
                }
                return null;
            }
        }
        o0Var = new o0(sq3Var);
        Object obj2 = o0Var.v;
        lu3 lu3Var2 = lu3.a;
        i = o0Var.w;
        if (i != 0) {
        }
        if (z) {
        }
        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.a((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.j0) fsfVar.a, arrayList, arrayList2);
    }

    public static final boolean B(XmlPullParser xmlPullParser) {
        return xmlPullParser.getEventType() == 0;
    }

    public static final boolean C(XmlPullParser xmlPullParser) {
        return xmlPullParser.getEventType() == 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0062 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object D(XmlPullParser xmlPullParser, sq3 sq3Var) {
        q0 q0Var;
        int i;
        fsf fsfVar;
        fsf fsfVar2;
        if (sq3Var instanceof q0) {
            q0Var = (q0) sq3Var;
            int i2 = q0Var.u;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                q0Var.u = i2 - Integer.MIN_VALUE;
                Object obj = q0Var.t;
                lu3 lu3Var = lu3.a;
                i = q0Var.u;
                rq3 rq3Var = null;
                if (i != 0) {
                    fsf g = lnb.g(obj);
                    fsf fsfVar3 = new fsf();
                    g0 g0Var = new g0(xmlPullParser, rq3Var, fsfVar3, g, 3);
                    q0Var.r = g;
                    q0Var.s = fsfVar3;
                    q0Var.u = 1;
                    if (s9a.r(g0Var, q0Var) == lu3Var) {
                        return lu3Var;
                    }
                    fsfVar = fsfVar3;
                    fsfVar2 = g;
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fsfVar = q0Var.s;
                    fsfVar2 = q0Var.r;
                    y6a.M(obj);
                }
                if (((String) fsfVar2.a) != null) {
                    return null;
                }
                return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.g();
            }
        }
        q0Var = new q0(sq3Var);
        Object obj2 = q0Var.t;
        lu3 lu3Var2 = lu3.a;
        i = q0Var.u;
        rq3 rq3Var2 = null;
        if (i != 0) {
        }
        if (((String) fsfVar2.a) != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object E(XmlPullParser xmlPullParser, sq3 sq3Var) {
        r0 r0Var;
        int i;
        fsf fsfVar;
        fsf fsfVar2;
        Object obj;
        if (sq3Var instanceof r0) {
            r0Var = (r0) sq3Var;
            int i2 = r0Var.u;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                r0Var.u = i2 - Integer.MIN_VALUE;
                Object obj2 = r0Var.t;
                lu3 lu3Var = lu3.a;
                i = r0Var.u;
                rq3 rq3Var = null;
                if (i != 0) {
                    fsf g = lnb.g(obj2);
                    fsf fsfVar3 = new fsf();
                    g0 g0Var = new g0(xmlPullParser, rq3Var, fsfVar3, g, 4);
                    r0Var.r = g;
                    r0Var.s = fsfVar3;
                    r0Var.u = 1;
                    if (s9a.r(g0Var, r0Var) == lu3Var) {
                        return lu3Var;
                    }
                    fsfVar = fsfVar3;
                    fsfVar2 = g;
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fsfVar = r0Var.s;
                    fsfVar2 = r0Var.r;
                    y6a.M(obj2);
                }
                obj = fsfVar2.a;
                if (obj != null && fsfVar.a == null) {
                    return null;
                }
                return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.h();
            }
        }
        r0Var = new r0(sq3Var);
        Object obj22 = r0Var.t;
        lu3 lu3Var2 = lu3.a;
        i = r0Var.u;
        rq3 rq3Var2 = null;
        if (i != 0) {
        }
        obj = fsfVar2.a;
        if (obj != null) {
        }
        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.h();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0071 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(XmlPullParser xmlPullParser, sq3 sq3Var) {
        s0 s0Var;
        int i;
        fsf fsfVar;
        fsf fsfVar2;
        fsf fsfVar3;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.f fVar;
        if (sq3Var instanceof s0) {
            s0Var = (s0) sq3Var;
            int i2 = s0Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                s0Var.v = i2 - Integer.MIN_VALUE;
                Object obj = s0Var.u;
                lu3 lu3Var = lu3.a;
                i = s0Var.v;
                if (i != 0) {
                    fsf g = lnb.g(obj);
                    fsf fsfVar4 = new fsf();
                    fsf fsfVar5 = new fsf();
                    jr5 jr5Var = new jr5(xmlPullParser, null, g, fsfVar4, fsfVar5, 20);
                    s0Var.r = g;
                    s0Var.s = fsfVar4;
                    s0Var.t = fsfVar5;
                    s0Var.v = 1;
                    if (s9a.r(jr5Var, s0Var) == lu3Var) {
                        return lu3Var;
                    }
                    fsfVar = g;
                    fsfVar2 = fsfVar4;
                    fsfVar3 = fsfVar5;
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fsfVar3 = s0Var.t;
                    fsfVar2 = s0Var.s;
                    fsfVar = s0Var.r;
                    y6a.M(obj);
                }
                fVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.f) fsfVar3.a;
                if (fVar != null) {
                    return null;
                }
                return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.c((Integer) fsfVar2.a, fVar);
            }
        }
        s0Var = new s0(sq3Var);
        Object obj2 = s0Var.u;
        lu3 lu3Var2 = lu3.a;
        i = s0Var.v;
        if (i != 0) {
        }
        fVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.f) fsfVar3.a;
        if (fVar != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(XmlPullParser xmlPullParser, sq3 sq3Var) {
        t0 t0Var;
        int i;
        if (sq3Var instanceof t0) {
            t0Var = (t0) sq3Var;
            int i2 = t0Var.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                t0Var.t = i2 - Integer.MIN_VALUE;
                Object obj = t0Var.s;
                lu3 lu3Var = lu3.a;
                i = t0Var.t;
                rq3 rq3Var = null;
                if (i != 0) {
                    ArrayList u = fc6.u(obj);
                    e0 e0Var = new e0(xmlPullParser, rq3Var, u, 2);
                    t0Var.r = u;
                    t0Var.t = 1;
                    return s9a.r(e0Var, t0Var) == lu3Var ? lu3Var : u;
                }
                if (i != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ArrayList arrayList = t0Var.r;
                y6a.M(obj);
                return arrayList;
            }
        }
        t0Var = new t0(sq3Var);
        Object obj2 = t0Var.s;
        lu3 lu3Var2 = lu3.a;
        i = t0Var.t;
        rq3 rq3Var2 = null;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00c3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(XmlPullParser xmlPullParser, sq3 sq3Var) {
        u0 u0Var;
        int i;
        fsf fsfVar;
        ArrayList arrayList;
        fsf fsfVar2;
        fsf fsfVar3;
        fsf fsfVar4;
        fsf fsfVar5;
        ArrayList arrayList2;
        ArrayList arrayList3;
        fsf fsfVar6;
        fsf fsfVar7;
        if (sq3Var instanceof u0) {
            u0Var = (u0) sq3Var;
            int i2 = u0Var.C;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                u0Var.C = i2 - Integer.MIN_VALUE;
                Object obj = u0Var.B;
                lu3 lu3Var = lu3.a;
                i = u0Var.C;
                if (i != 0) {
                    fsf g = lnb.g(obj);
                    fsf fsfVar8 = new fsf();
                    fsf fsfVar9 = new fsf();
                    fsf fsfVar10 = new fsf();
                    fsf fsfVar11 = new fsf();
                    fsf fsfVar12 = new fsf();
                    ArrayList arrayList4 = new ArrayList();
                    ArrayList arrayList5 = new ArrayList();
                    fsf fsfVar13 = new fsf();
                    ArrayList arrayList6 = new ArrayList();
                    tpc tpcVar = new tpc(xmlPullParser, null, g, fsfVar8, fsfVar9, fsfVar11, fsfVar10, fsfVar12, arrayList4, fsfVar13, arrayList5, arrayList6);
                    fsfVar = fsfVar13;
                    u0Var.r = g;
                    u0Var.s = fsfVar8;
                    u0Var.t = fsfVar9;
                    u0Var.u = fsfVar10;
                    u0Var.v = fsfVar11;
                    u0Var.w = fsfVar12;
                    u0Var.x = arrayList4;
                    u0Var.y = arrayList5;
                    u0Var.z = fsfVar;
                    u0Var.A = arrayList6;
                    u0Var.C = 1;
                    if (s9a.r(tpcVar, u0Var) == lu3Var) {
                        return lu3Var;
                    }
                    arrayList = arrayList6;
                    fsfVar2 = g;
                    fsfVar3 = fsfVar9;
                    fsfVar4 = fsfVar11;
                    fsfVar5 = fsfVar12;
                    arrayList2 = arrayList4;
                    arrayList3 = arrayList5;
                    fsfVar6 = fsfVar8;
                    fsfVar7 = fsfVar10;
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    arrayList = u0Var.A;
                    fsfVar = u0Var.z;
                    ArrayList arrayList7 = u0Var.y;
                    ArrayList arrayList8 = u0Var.x;
                    fsfVar5 = u0Var.w;
                    fsfVar4 = u0Var.v;
                    fsfVar7 = u0Var.u;
                    fsf fsfVar14 = u0Var.t;
                    fsf fsfVar15 = u0Var.s;
                    fsfVar2 = u0Var.r;
                    y6a.M(obj);
                    arrayList3 = arrayList7;
                    fsfVar6 = fsfVar15;
                    fsfVar3 = fsfVar14;
                    arrayList2 = arrayList8;
                }
                String str = (String) fsfVar.a;
                com.moloco.sdk.internal.publisher.nativead.model.g gVar = str == null ? new com.moloco.sdk.internal.publisher.nativead.model.g(str, arrayList, 1) : null;
                if (!arrayList3.isEmpty()) {
                    return null;
                }
                Integer num = (Integer) fsfVar6.a;
                Integer num2 = (Integer) fsfVar3.a;
                String str2 = (String) fsfVar4.a;
                return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.i(num, num2, str2, gVar, arrayList2, arrayList3);
            }
        }
        u0Var = new u0(sq3Var);
        Object obj2 = u0Var.B;
        lu3 lu3Var2 = lu3.a;
        i = u0Var.C;
        if (i != 0) {
        }
        String str3 = (String) fsfVar.a;
        if (str3 == null) {
        }
        if (!arrayList3.isEmpty()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0044 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(XmlPullParser xmlPullParser, sq3 sq3Var) {
        x0 x0Var;
        int i;
        String str;
        if (sq3Var instanceof x0) {
            x0Var = (x0) sq3Var;
            int i2 = x0Var.s;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                x0Var.s = i2 - Integer.MIN_VALUE;
                Object obj = x0Var.r;
                lu3 lu3Var = lu3.a;
                i = x0Var.s;
                if (i != 0) {
                    y6a.M(obj);
                    x0Var.s = 1;
                    obj = o(xmlPullParser, x0Var);
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
                str = (String) obj;
                if (str == null) {
                    return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.o(str);
                }
                return null;
            }
        }
        x0Var = new x0(sq3Var);
        Object obj2 = x0Var.r;
        lu3 lu3Var2 = lu3.a;
        i = x0Var.s;
        if (i != 0) {
        }
        str = (String) obj2;
        if (str == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0044 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object e(XmlPullParser xmlPullParser, sq3 sq3Var) {
        y0 y0Var;
        int i;
        String str;
        if (sq3Var instanceof y0) {
            y0Var = (y0) sq3Var;
            int i2 = y0Var.s;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                y0Var.s = i2 - Integer.MIN_VALUE;
                Object obj = y0Var.r;
                lu3 lu3Var = lu3.a;
                i = y0Var.s;
                if (i != 0) {
                    y6a.M(obj);
                    y0Var.s = 1;
                    obj = o(xmlPullParser, y0Var);
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
                str = (String) obj;
                if (str == null) {
                    return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.p(str);
                }
                return null;
            }
        }
        y0Var = new y0(sq3Var);
        Object obj2 = y0Var.r;
        lu3 lu3Var2 = lu3.a;
        i = y0Var.s;
        if (i != 0) {
        }
        str = (String) obj2;
        if (str == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object f(XmlPullParser xmlPullParser, sq3 sq3Var) {
        z0 z0Var;
        int i;
        fsf fsfVar;
        ArrayList arrayList;
        String str;
        if (sq3Var instanceof z0) {
            z0Var = (z0) sq3Var;
            int i2 = z0Var.u;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                z0Var.u = i2 - Integer.MIN_VALUE;
                Object obj = z0Var.t;
                lu3 lu3Var = lu3.a;
                i = z0Var.u;
                if (i != 0) {
                    fsf g = lnb.g(obj);
                    ArrayList arrayList2 = new ArrayList();
                    mj5 mj5Var = new mj5(xmlPullParser, (rq3) null, g, arrayList2);
                    z0Var.r = g;
                    z0Var.s = arrayList2;
                    z0Var.u = 1;
                    if (s9a.r(mj5Var, z0Var) == lu3Var) {
                        return lu3Var;
                    }
                    fsfVar = g;
                    arrayList = arrayList2;
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    arrayList = z0Var.s;
                    fsfVar = z0Var.r;
                    y6a.M(obj);
                }
                str = (String) fsfVar.a;
                if (str == null) {
                    return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.r(str, arrayList);
                }
                return null;
            }
        }
        z0Var = new z0(sq3Var);
        Object obj2 = z0Var.t;
        lu3 lu3Var2 = lu3.a;
        i = z0Var.u;
        if (i != 0) {
        }
        str = (String) fsfVar.a;
        if (str == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00ce A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object g(XmlPullParser xmlPullParser, sq3 sq3Var) {
        a1 a1Var;
        int i;
        fsf fsfVar;
        fsf fsfVar2;
        fsf fsfVar3;
        fsf fsfVar4;
        fsf fsfVar5;
        fsf fsfVar6;
        fsf fsfVar7;
        fsf fsfVar8;
        ArrayList arrayList;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.i0 i0Var;
        if (sq3Var instanceof a1) {
            a1Var = (a1) sq3Var;
            int i2 = a1Var.B;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                a1Var.B = i2 - Integer.MIN_VALUE;
                Object obj = a1Var.A;
                lu3 lu3Var = lu3.a;
                i = a1Var.B;
                if (i != 0) {
                    fsf g = lnb.g(obj);
                    fsfVar = new fsf();
                    fsf fsfVar9 = new fsf();
                    fsf fsfVar10 = new fsf();
                    fsf fsfVar11 = new fsf();
                    fsf fsfVar12 = new fsf();
                    fsf fsfVar13 = new fsf();
                    fsf fsfVar14 = new fsf();
                    ArrayList arrayList2 = new ArrayList();
                    tpc tpcVar = new tpc(xmlPullParser, null, g, fsfVar, fsfVar9, fsfVar10, fsfVar11, fsfVar12, fsfVar14, fsfVar13, arrayList2);
                    a1Var.r = g;
                    a1Var.s = fsfVar;
                    a1Var.t = fsfVar9;
                    a1Var.u = fsfVar10;
                    a1Var.v = fsfVar11;
                    a1Var.w = fsfVar12;
                    a1Var.x = fsfVar13;
                    a1Var.y = fsfVar14;
                    a1Var.z = arrayList2;
                    a1Var.B = 1;
                    if (s9a.r(tpcVar, a1Var) == lu3Var) {
                        return lu3Var;
                    }
                    fsfVar2 = fsfVar13;
                    fsfVar3 = g;
                    fsfVar4 = fsfVar9;
                    fsfVar5 = fsfVar10;
                    fsfVar6 = fsfVar11;
                    fsfVar7 = fsfVar12;
                    fsfVar8 = fsfVar14;
                    arrayList = arrayList2;
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ArrayList arrayList3 = a1Var.z;
                    fsfVar8 = a1Var.y;
                    fsfVar2 = a1Var.x;
                    fsfVar7 = a1Var.w;
                    fsfVar6 = a1Var.v;
                    fsfVar5 = a1Var.u;
                    fsfVar4 = a1Var.t;
                    fsfVar = a1Var.s;
                    fsfVar3 = a1Var.r;
                    y6a.M(obj);
                    arrayList = arrayList3;
                }
                i0Var = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.i0) fsfVar8.a;
                if (i0Var != null) {
                    return null;
                }
                return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.q((Integer) fsfVar.a, (Integer) fsfVar4.a, (String) fsfVar5.a, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.y) fsfVar6.a, (Long) fsfVar7.a, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.r) fsfVar2.a, arrayList, i0Var);
            }
        }
        a1Var = new a1(sq3Var);
        Object obj2 = a1Var.A;
        lu3 lu3Var2 = lu3.a;
        i = a1Var.B;
        if (i != 0) {
        }
        i0Var = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.i0) fsfVar8.a;
        if (i0Var != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object h(XmlPullParser xmlPullParser, sq3 sq3Var) {
        b1 b1Var;
        int i;
        if (sq3Var instanceof b1) {
            b1Var = (b1) sq3Var;
            int i2 = b1Var.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                b1Var.t = i2 - Integer.MIN_VALUE;
                Object obj = b1Var.s;
                lu3 lu3Var = lu3.a;
                i = b1Var.t;
                rq3 rq3Var = null;
                if (i != 0) {
                    ArrayList u = fc6.u(obj);
                    e0 e0Var = new e0(xmlPullParser, rq3Var, u, 3);
                    b1Var.r = u;
                    b1Var.t = 1;
                    return s9a.r(e0Var, b1Var) == lu3Var ? lu3Var : u;
                }
                if (i != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ArrayList arrayList = b1Var.r;
                y6a.M(obj);
                return arrayList;
            }
        }
        b1Var = new b1(sq3Var);
        Object obj2 = b1Var.s;
        lu3 lu3Var2 = lu3.a;
        i = b1Var.t;
        rq3 rq3Var2 = null;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0062 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object i(XmlPullParser xmlPullParser, sq3 sq3Var) {
        c1 c1Var;
        int i;
        fsf fsfVar;
        fsf fsfVar2;
        String str;
        if (sq3Var instanceof c1) {
            c1Var = (c1) sq3Var;
            int i2 = c1Var.u;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c1Var.u = i2 - Integer.MIN_VALUE;
                Object obj = c1Var.t;
                lu3 lu3Var = lu3.a;
                i = c1Var.u;
                rq3 rq3Var = null;
                if (i != 0) {
                    fsf g = lnb.g(obj);
                    fsf fsfVar3 = new fsf();
                    g0 g0Var = new g0(xmlPullParser, rq3Var, g, fsfVar3, 5);
                    c1Var.r = g;
                    c1Var.s = fsfVar3;
                    c1Var.u = 1;
                    if (s9a.r(g0Var, c1Var) == lu3Var) {
                        return lu3Var;
                    }
                    fsfVar = g;
                    fsfVar2 = fsfVar3;
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fsfVar2 = c1Var.s;
                    fsfVar = c1Var.r;
                    y6a.M(obj);
                }
                str = (String) fsfVar2.a;
                if (str != null) {
                    return null;
                }
                return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.s(str);
            }
        }
        c1Var = new c1(sq3Var);
        Object obj2 = c1Var.t;
        lu3 lu3Var2 = lu3.a;
        i = c1Var.u;
        rq3 rq3Var2 = null;
        if (i != 0) {
        }
        str = (String) fsfVar2.a;
        if (str != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object j(XmlPullParser xmlPullParser, sq3 sq3Var) {
        a0 a0Var;
        int i;
        fsf fsfVar;
        fsf fsfVar2;
        fsf fsfVar3;
        fsf fsfVar4;
        fsf fsfVar5;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        if (sq3Var instanceof a0) {
            a0Var = (a0) sq3Var;
            int i2 = a0Var.A;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                a0Var.A = i2 - Integer.MIN_VALUE;
                Object obj = a0Var.z;
                lu3 lu3Var = lu3.a;
                i = a0Var.A;
                if (i != 0) {
                    fsf g = lnb.g(obj);
                    fsf fsfVar6 = new fsf();
                    fsf fsfVar7 = new fsf();
                    fsf fsfVar8 = new fsf();
                    fsf fsfVar9 = new fsf();
                    ArrayList arrayList4 = new ArrayList();
                    ArrayList arrayList5 = new ArrayList();
                    ArrayList arrayList6 = new ArrayList();
                    vwb vwbVar = new vwb(xmlPullParser, null, g, fsfVar6, fsfVar7, fsfVar8, fsfVar9, arrayList4, arrayList5, arrayList6);
                    a0Var.r = g;
                    a0Var.s = fsfVar6;
                    a0Var.t = fsfVar7;
                    a0Var.u = fsfVar8;
                    a0Var.v = fsfVar9;
                    a0Var.w = arrayList4;
                    a0Var.x = arrayList5;
                    a0Var.y = arrayList6;
                    a0Var.A = 1;
                    if (s9a.r(vwbVar, a0Var) == lu3Var) {
                        return lu3Var;
                    }
                    fsfVar = g;
                    fsfVar2 = fsfVar6;
                    fsfVar3 = fsfVar7;
                    fsfVar4 = fsfVar8;
                    fsfVar5 = fsfVar9;
                    arrayList = arrayList4;
                    arrayList2 = arrayList5;
                    arrayList3 = arrayList6;
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    arrayList3 = a0Var.y;
                    arrayList2 = a0Var.x;
                    arrayList = a0Var.w;
                    fsfVar5 = a0Var.v;
                    fsfVar4 = a0Var.u;
                    fsfVar3 = a0Var.t;
                    fsfVar2 = a0Var.s;
                    fsfVar = a0Var.r;
                    y6a.M(obj);
                }
                return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.t(arrayList, arrayList2, arrayList3);
            }
        }
        a0Var = new a0(sq3Var);
        Object obj2 = a0Var.z;
        lu3 lu3Var2 = lu3.a;
        i = a0Var.A;
        if (i != 0) {
        }
        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.t(arrayList, arrayList2, arrayList3);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object k(XmlPullParser xmlPullParser, sq3 sq3Var) {
        d0 d0Var;
        int i;
        fsf fsfVar;
        Object obj;
        fsf fsfVar2;
        fsf fsfVar3;
        fsf fsfVar4;
        fsf fsfVar5;
        fsf fsfVar6;
        fsf fsfVar7;
        fsf fsfVar8;
        fsf fsfVar9;
        fsf fsfVar10;
        fsf fsfVar11;
        fsf fsfVar12;
        Object obj2;
        Object obj3;
        if (sq3Var instanceof d0) {
            d0Var = (d0) sq3Var;
            int i2 = d0Var.E;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                d0Var.E = i2 - Integer.MIN_VALUE;
                Object obj4 = d0Var.D;
                lu3 lu3Var = lu3.a;
                i = d0Var.E;
                if (i != 0) {
                    fsf g = lnb.g(obj4);
                    fsf fsfVar13 = new fsf();
                    fsf fsfVar14 = new fsf();
                    fsfVar = new fsf();
                    fsf fsfVar15 = new fsf();
                    fsf fsfVar16 = new fsf();
                    fsf fsfVar17 = new fsf();
                    fsf fsfVar18 = new fsf();
                    fsf fsfVar19 = new fsf();
                    fsf fsfVar20 = new fsf();
                    fsf fsfVar21 = new fsf();
                    fsf fsfVar22 = new fsf();
                    c0 c0Var = new c0(xmlPullParser, null, fsfVar13, fsfVar14, fsfVar, fsfVar15, fsfVar16, fsfVar17, fsfVar18, fsfVar19, fsfVar20, fsfVar21, fsfVar22, g);
                    obj = null;
                    d0Var.r = g;
                    d0Var.s = fsfVar13;
                    d0Var.t = fsfVar14;
                    d0Var.u = fsfVar;
                    d0Var.v = fsfVar15;
                    d0Var.w = fsfVar16;
                    d0Var.x = fsfVar17;
                    d0Var.y = fsfVar18;
                    d0Var.z = fsfVar19;
                    d0Var.A = fsfVar20;
                    d0Var.B = fsfVar21;
                    d0Var.C = fsfVar22;
                    d0Var.E = 1;
                    if (s9a.r(c0Var, d0Var) == lu3Var) {
                        return lu3Var;
                    }
                    fsfVar2 = fsfVar13;
                    fsfVar3 = fsfVar16;
                    fsfVar4 = fsfVar14;
                    fsfVar5 = fsfVar15;
                    fsfVar6 = g;
                    fsfVar7 = fsfVar22;
                    fsfVar8 = fsfVar21;
                    fsfVar9 = fsfVar20;
                    fsfVar10 = fsfVar19;
                    fsfVar11 = fsfVar17;
                    fsfVar12 = fsfVar18;
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fsfVar7 = d0Var.C;
                    fsfVar8 = d0Var.B;
                    fsfVar9 = d0Var.A;
                    fsfVar10 = d0Var.z;
                    fsfVar12 = d0Var.y;
                    fsfVar11 = d0Var.x;
                    fsfVar3 = d0Var.w;
                    fsfVar5 = d0Var.v;
                    fsfVar = d0Var.u;
                    fsfVar4 = d0Var.t;
                    fsfVar2 = d0Var.s;
                    fsfVar6 = d0Var.r;
                    y6a.M(obj4);
                    obj = null;
                }
                obj2 = fsfVar6.a;
                if (obj2 != null || fsfVar.a == null || (obj3 = fsfVar4.a) == null) {
                    return obj;
                }
                String str = (String) obj2;
                obj3.getClass();
                boolean booleanValue = ((Boolean) obj3).booleanValue();
                Object obj5 = fsfVar.a;
                obj5.getClass();
                String str2 = (String) obj5;
                Integer num = (Integer) fsfVar5.a;
                Integer num2 = (Integer) fsfVar3.a;
                Integer num3 = (Integer) fsfVar12.a;
                Integer num4 = (Integer) fsfVar10.a;
                Integer num5 = (Integer) fsfVar9.a;
                return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.v(str, booleanValue, str2, num, num2, num3, num4, num5, (String) fsfVar7.a);
            }
        }
        d0Var = new d0(sq3Var);
        Object obj42 = d0Var.D;
        lu3 lu3Var2 = lu3.a;
        i = d0Var.E;
        if (i != 0) {
        }
        obj2 = fsfVar6.a;
        if (obj2 != null) {
        }
        return obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object l(XmlPullParser xmlPullParser, sq3 sq3Var) {
        f0 f0Var;
        int i;
        if (sq3Var instanceof f0) {
            f0Var = (f0) sq3Var;
            int i2 = f0Var.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                f0Var.t = i2 - Integer.MIN_VALUE;
                Object obj = f0Var.s;
                lu3 lu3Var = lu3.a;
                i = f0Var.t;
                rq3 rq3Var = null;
                if (i != 0) {
                    ArrayList u = fc6.u(obj);
                    e0 e0Var = new e0(xmlPullParser, rq3Var, u, 0);
                    f0Var.r = u;
                    f0Var.t = 1;
                    return s9a.r(e0Var, f0Var) == lu3Var ? lu3Var : u;
                }
                if (i != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ArrayList arrayList = f0Var.r;
                y6a.M(obj);
                return arrayList;
            }
        }
        f0Var = new f0(sq3Var);
        Object obj2 = f0Var.s;
        lu3 lu3Var2 = lu3.a;
        i = f0Var.t;
        rq3 rq3Var2 = null;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m(XmlPullParser xmlPullParser, sq3 sq3Var) {
        h0 h0Var;
        int i;
        fsf fsfVar;
        fsf fsfVar2;
        Object obj;
        if (sq3Var instanceof h0) {
            h0Var = (h0) sq3Var;
            int i2 = h0Var.u;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                h0Var.u = i2 - Integer.MIN_VALUE;
                Object obj2 = h0Var.t;
                lu3 lu3Var = lu3.a;
                i = h0Var.u;
                rq3 rq3Var = null;
                if (i != 0) {
                    fsf g = lnb.g(obj2);
                    fsf fsfVar3 = new fsf();
                    g0 g0Var = new g0(xmlPullParser, rq3Var, g, fsfVar3, 0);
                    h0Var.r = g;
                    h0Var.s = fsfVar3;
                    h0Var.u = 1;
                    if (s9a.r(g0Var, h0Var) == lu3Var) {
                        return lu3Var;
                    }
                    fsfVar = g;
                    fsfVar2 = fsfVar3;
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fsfVar2 = h0Var.s;
                    fsfVar = h0Var.r;
                    y6a.M(obj2);
                }
                obj = fsfVar.a;
                if (obj != null && fsfVar2.a == null) {
                    return null;
                }
                return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.z();
            }
        }
        h0Var = new h0(sq3Var);
        Object obj22 = h0Var.t;
        lu3 lu3Var2 = lu3.a;
        i = h0Var.u;
        rq3 rq3Var2 = null;
        if (i != 0) {
        }
        obj = fsfVar.a;
        if (obj != null) {
        }
        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.z();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object n(XmlPullParser xmlPullParser, sq3 sq3Var) {
        i0 i0Var;
        int i;
        fsf fsfVar;
        fsf fsfVar2;
        Object obj;
        Object obj2;
        if (sq3Var instanceof i0) {
            i0Var = (i0) sq3Var;
            int i2 = i0Var.u;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                i0Var.u = i2 - Integer.MIN_VALUE;
                Object obj3 = i0Var.t;
                lu3 lu3Var = lu3.a;
                i = i0Var.u;
                rq3 rq3Var = null;
                if (i != 0) {
                    fsf g = lnb.g(obj3);
                    fsf fsfVar3 = new fsf();
                    g0 g0Var = new g0(xmlPullParser, rq3Var, fsfVar3, g, 1);
                    i0Var.r = g;
                    i0Var.s = fsfVar3;
                    i0Var.u = 1;
                    if (s9a.r(g0Var, i0Var) == lu3Var) {
                        return lu3Var;
                    }
                    fsfVar = fsfVar3;
                    fsfVar2 = g;
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fsfVar = i0Var.s;
                    fsfVar2 = i0Var.r;
                    y6a.M(obj3);
                }
                obj = fsfVar2.a;
                if (obj != null || (obj2 = fsfVar.a) == null) {
                    return null;
                }
                obj2.getClass();
                return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.a0((String) obj, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.n) obj2);
            }
        }
        i0Var = new i0(sq3Var);
        Object obj32 = i0Var.t;
        lu3 lu3Var2 = lu3.a;
        i = i0Var.u;
        rq3 rq3Var2 = null;
        if (i != 0) {
        }
        obj = fsfVar2.a;
        if (obj != null) {
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object o(XmlPullParser xmlPullParser, sq3 sq3Var) {
        j0 j0Var;
        int i;
        fsf fsfVar;
        if (sq3Var instanceof j0) {
            j0Var = (j0) sq3Var;
            int i2 = j0Var.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                j0Var.t = i2 - Integer.MIN_VALUE;
                Object obj = j0Var.s;
                lu3 lu3Var = lu3.a;
                i = j0Var.t;
                if (i != 0) {
                    fsf g = lnb.g(obj);
                    ccj ccjVar = new ccj(xmlPullParser, null, g);
                    j0Var.r = g;
                    j0Var.t = 1;
                    if (s9a.r(ccjVar, j0Var) == lu3Var) {
                        return lu3Var;
                    }
                    fsfVar = g;
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fsfVar = j0Var.r;
                    y6a.M(obj);
                }
                return fsfVar.a;
            }
        }
        j0Var = new j0(sq3Var);
        Object obj2 = j0Var.s;
        lu3 lu3Var2 = lu3.a;
        i = j0Var.t;
        if (i != 0) {
        }
        return fsfVar.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object p(XmlPullParser xmlPullParser, sq3 sq3Var) {
        k0 k0Var;
        int i;
        if (sq3Var instanceof k0) {
            k0Var = (k0) sq3Var;
            int i2 = k0Var.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                k0Var.t = i2 - Integer.MIN_VALUE;
                Object obj = k0Var.s;
                lu3 lu3Var = lu3.a;
                i = k0Var.t;
                rq3 rq3Var = null;
                int i3 = 1;
                if (i != 0) {
                    ArrayList u = fc6.u(obj);
                    e0 e0Var = new e0(xmlPullParser, rq3Var, u, i3);
                    k0Var.r = u;
                    k0Var.t = 1;
                    return s9a.r(e0Var, k0Var) == lu3Var ? lu3Var : u;
                }
                if (i != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ArrayList arrayList = k0Var.r;
                y6a.M(obj);
                return arrayList;
            }
        }
        k0Var = new k0(sq3Var);
        Object obj2 = k0Var.s;
        lu3 lu3Var2 = lu3.a;
        i = k0Var.t;
        rq3 rq3Var2 = null;
        int i32 = 1;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object q(XmlPullParser xmlPullParser, sq3 sq3Var) {
        l0 l0Var;
        int i;
        fsf fsfVar;
        fsf fsfVar2;
        fsf fsfVar3;
        Object obj;
        Object obj2;
        if (sq3Var instanceof l0) {
            l0Var = (l0) sq3Var;
            int i2 = l0Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                l0Var.v = i2 - Integer.MIN_VALUE;
                Object obj3 = l0Var.u;
                lu3 lu3Var = lu3.a;
                i = l0Var.v;
                if (i != 0) {
                    fsf g = lnb.g(obj3);
                    fsf fsfVar4 = new fsf();
                    fsf fsfVar5 = new fsf();
                    w32 w32Var = new w32(xmlPullParser, null, g, fsfVar5, fsfVar4);
                    l0Var.r = g;
                    l0Var.s = fsfVar4;
                    l0Var.t = fsfVar5;
                    l0Var.v = 1;
                    if (s9a.r(w32Var, l0Var) == lu3Var) {
                        return lu3Var;
                    }
                    fsfVar = g;
                    fsfVar2 = fsfVar5;
                    fsfVar3 = fsfVar4;
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fsfVar2 = l0Var.t;
                    fsfVar3 = l0Var.s;
                    fsfVar = l0Var.r;
                    y6a.M(obj3);
                }
                obj = fsfVar.a;
                if (obj != null || (obj2 = fsfVar3.a) == null || (obj == com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.c0.n && fsfVar2.a == null)) {
                    return null;
                }
                obj2.getClass();
                return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.b0((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.c0) obj, (String) obj2, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.y) fsfVar2.a);
            }
        }
        l0Var = new l0(sq3Var);
        Object obj32 = l0Var.u;
        lu3 lu3Var2 = lu3.a;
        i = l0Var.v;
        if (i != 0) {
        }
        obj = fsfVar.a;
        if (obj != null) {
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object r(XmlPullParser xmlPullParser, sq3 sq3Var) {
        m0 m0Var;
        int i;
        fsf fsfVar;
        fsf fsfVar2;
        ArrayList arrayList;
        if (sq3Var instanceof m0) {
            m0Var = (m0) sq3Var;
            int i2 = m0Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                m0Var.v = i2 - Integer.MIN_VALUE;
                Object obj = m0Var.u;
                lu3 lu3Var = lu3.a;
                i = m0Var.v;
                if (i != 0) {
                    ArrayList u = fc6.u(obj);
                    fsf fsfVar3 = new fsf();
                    fsf fsfVar4 = new fsf();
                    jr5 jr5Var = new jr5(xmlPullParser, null, fsfVar3, fsfVar4, u, 18);
                    m0Var.r = u;
                    m0Var.s = fsfVar3;
                    m0Var.t = fsfVar4;
                    m0Var.v = 1;
                    if (s9a.r(jr5Var, m0Var) == lu3Var) {
                        return lu3Var;
                    }
                    fsfVar = fsfVar3;
                    fsfVar2 = fsfVar4;
                    arrayList = u;
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fsfVar2 = m0Var.t;
                    fsfVar = m0Var.s;
                    arrayList = m0Var.r;
                    y6a.M(obj);
                }
                if (!arrayList.isEmpty() && fsfVar2.a == null) {
                    return null;
                }
                String str = (String) fsfVar2.a;
                return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.d0(arrayList, str);
            }
        }
        m0Var = new m0(sq3Var);
        Object obj2 = m0Var.u;
        lu3 lu3Var2 = lu3.a;
        i = m0Var.v;
        if (i != 0) {
        }
        if (!arrayList.isEmpty()) {
        }
        String str2 = (String) fsfVar2.a;
        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.d0(arrayList, str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0062 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object s(XmlPullParser xmlPullParser, sq3 sq3Var) {
        n0 n0Var;
        int i;
        fsf fsfVar;
        fsf fsfVar2;
        String str;
        if (sq3Var instanceof n0) {
            n0Var = (n0) sq3Var;
            int i2 = n0Var.u;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                n0Var.u = i2 - Integer.MIN_VALUE;
                Object obj = n0Var.t;
                lu3 lu3Var = lu3.a;
                i = n0Var.u;
                rq3 rq3Var = null;
                if (i != 0) {
                    fsf g = lnb.g(obj);
                    fsf fsfVar3 = new fsf();
                    g0 g0Var = new g0(xmlPullParser, rq3Var, g, fsfVar3, 2);
                    n0Var.r = g;
                    n0Var.s = fsfVar3;
                    n0Var.u = 1;
                    if (s9a.r(g0Var, n0Var) == lu3Var) {
                        return lu3Var;
                    }
                    fsfVar = g;
                    fsfVar2 = fsfVar3;
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fsfVar2 = n0Var.s;
                    fsfVar = n0Var.r;
                    y6a.M(obj);
                }
                str = (String) fsfVar2.a;
                if (str != null) {
                    return null;
                }
                return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.j0(str);
            }
        }
        n0Var = new n0(sq3Var);
        Object obj2 = n0Var.t;
        lu3 lu3Var2 = lu3.a;
        i = n0Var.u;
        rq3 rq3Var2 = null;
        if (i != 0) {
        }
        str = (String) fsfVar2.a;
        if (str != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0094 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object t(XmlPullParser xmlPullParser, sq3 sq3Var) {
        p0 p0Var;
        int i;
        fsf fsfVar;
        fsf fsfVar2;
        fsf fsfVar3;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        String str;
        if (sq3Var instanceof p0) {
            p0Var = (p0) sq3Var;
            int i2 = p0Var.y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                p0Var.y = i2 - Integer.MIN_VALUE;
                Object obj = p0Var.x;
                lu3 lu3Var = lu3.a;
                i = p0Var.y;
                if (i != 0) {
                    fsf g = lnb.g(obj);
                    fsf fsfVar4 = new fsf();
                    fsf fsfVar5 = new fsf();
                    ArrayList arrayList4 = new ArrayList();
                    ArrayList arrayList5 = new ArrayList();
                    ArrayList arrayList6 = new ArrayList();
                    ru1 ru1Var = new ru1(xmlPullParser, (rq3) null, fsfVar4, g, fsfVar5, arrayList4, arrayList5, arrayList6);
                    p0Var.r = g;
                    p0Var.s = fsfVar4;
                    p0Var.t = fsfVar5;
                    p0Var.u = arrayList4;
                    p0Var.v = arrayList5;
                    p0Var.w = arrayList6;
                    p0Var.y = 1;
                    if (s9a.r(ru1Var, p0Var) == lu3Var) {
                        return lu3Var;
                    }
                    fsfVar = fsfVar4;
                    fsfVar2 = g;
                    fsfVar3 = fsfVar5;
                    arrayList = arrayList4;
                    arrayList2 = arrayList5;
                    arrayList3 = arrayList6;
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ArrayList arrayList7 = p0Var.w;
                    ArrayList arrayList8 = p0Var.v;
                    ArrayList arrayList9 = p0Var.u;
                    fsfVar3 = p0Var.t;
                    fsfVar = p0Var.s;
                    fsfVar2 = p0Var.r;
                    y6a.M(obj);
                    arrayList3 = arrayList7;
                    arrayList2 = arrayList8;
                    arrayList = arrayList9;
                }
                str = (String) fsfVar2.a;
                if (str != null) {
                    return null;
                }
                Boolean bool = (Boolean) fsfVar.a;
                return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.b(str, bool, arrayList, arrayList2, arrayList3);
            }
        }
        p0Var = new p0(sq3Var);
        Object obj2 = p0Var.x;
        lu3 lu3Var2 = lu3.a;
        i = p0Var.y;
        if (i != 0) {
        }
        str = (String) fsfVar2.a;
        if (str != null) {
        }
    }

    public static final String u(XmlPullParser xmlPullParser, String str) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null || StringsKt.R(attributeValue)) {
            return null;
        }
        return attributeValue;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0094 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object v(XmlPullParser xmlPullParser, boolean z, sq3 sq3Var) {
        v0 v0Var;
        int i;
        fsf fsfVar;
        fsf fsfVar2;
        fsf fsfVar3;
        fsf fsfVar4;
        fsf fsfVar5;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.m mVar;
        if (sq3Var instanceof v0) {
            v0Var = (v0) sq3Var;
            int i2 = v0Var.x;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                v0Var.x = i2 - Integer.MIN_VALUE;
                Object obj = v0Var.w;
                lu3 lu3Var = lu3.a;
                i = v0Var.x;
                if (i != 0) {
                    fsf g = lnb.g(obj);
                    fsf fsfVar6 = new fsf();
                    fsf fsfVar7 = new fsf();
                    fsf fsfVar8 = new fsf();
                    fsf fsfVar9 = new fsf();
                    x7c x7cVar = new x7c(xmlPullParser, null, g, fsfVar6, fsfVar7, fsfVar8, fsfVar9, z);
                    v0Var.r = g;
                    v0Var.s = fsfVar6;
                    v0Var.t = fsfVar7;
                    v0Var.u = fsfVar8;
                    v0Var.v = fsfVar9;
                    v0Var.x = 1;
                    if (s9a.r(x7cVar, v0Var) == lu3Var) {
                        return lu3Var;
                    }
                    fsfVar = g;
                    fsfVar2 = fsfVar6;
                    fsfVar3 = fsfVar7;
                    fsfVar4 = fsfVar8;
                    fsfVar5 = fsfVar9;
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fsfVar5 = v0Var.v;
                    fsfVar4 = v0Var.u;
                    fsfVar3 = v0Var.t;
                    fsfVar2 = v0Var.s;
                    fsfVar = v0Var.r;
                    y6a.M(obj);
                }
                mVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.m) fsfVar5.a;
                if (mVar == null) {
                    return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.j((String) fsfVar.a, (Integer) fsfVar2.a, (String) fsfVar3.a, (String) fsfVar4.a, mVar);
                }
                return null;
            }
        }
        v0Var = new v0(sq3Var);
        Object obj2 = v0Var.w;
        lu3 lu3Var2 = lu3.a;
        i = v0Var.x;
        if (i != 0) {
        }
        mVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.m) fsfVar5.a;
        if (mVar == null) {
        }
    }

    public static final Long w(String str) {
        Object u2gVar;
        Object u2gVar2;
        try {
            p2g p2gVar = w2g.b;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss.SSS", Locale.ROOT);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            Date parse = simpleDateFormat.parse(str);
            u2gVar = parse != null ? Long.valueOf(parse.getTime()) : null;
        } catch (Throwable th) {
            p2g p2gVar2 = w2g.b;
            u2gVar = new u2g(th);
        }
        if (u2gVar instanceof u2g) {
            u2gVar = null;
        }
        Long l = (Long) u2gVar;
        if (l != null) {
            return l;
        }
        try {
            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("HH:mm:ss", Locale.ROOT);
            simpleDateFormat2.setTimeZone(TimeZone.getTimeZone("UTC"));
            Date parse2 = simpleDateFormat2.parse(str);
            u2gVar2 = parse2 != null ? Long.valueOf(parse2.getTime()) : null;
        } catch (Throwable th2) {
            p2g p2gVar3 = w2g.b;
            u2gVar2 = new u2g(th2);
        }
        return (Long) (u2gVar2 instanceof u2g ? null : u2gVar2);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object x(XmlPullParser xmlPullParser, boolean z, sq3 sq3Var) {
        w0 w0Var;
        int i;
        if (sq3Var instanceof w0) {
            w0Var = (w0) sq3Var;
            int i2 = w0Var.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                w0Var.t = i2 - Integer.MIN_VALUE;
                Object obj = w0Var.s;
                lu3 lu3Var = lu3.a;
                i = w0Var.t;
                if (i != 0) {
                    ArrayList u = fc6.u(obj);
                    g5b g5bVar = new g5b(xmlPullParser, (rq3) null, z, u);
                    w0Var.r = u;
                    w0Var.t = 1;
                    return s9a.r(g5bVar, w0Var) == lu3Var ? lu3Var : u;
                }
                if (i != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ArrayList arrayList = w0Var.r;
                y6a.M(obj);
                return arrayList;
            }
        }
        w0Var = new w0(sq3Var);
        Object obj2 = w0Var.s;
        lu3 lu3Var2 = lu3.a;
        i = w0Var.t;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002b, code lost:
    
        if (r3 < 101) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.y y(String str) {
        Object u2gVar;
        Long w = w(str);
        if (w != null) {
            return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.x(w.longValue());
        }
        try {
            p2g p2gVar = w2g.b;
            Number parse = b.parse(str);
            if (parse != null) {
                int floatValue = (int) (parse.floatValue() * 100.0f);
                u2gVar = Integer.valueOf(floatValue);
                if (floatValue >= 0) {
                }
            }
            u2gVar = null;
        } catch (Throwable th) {
            p2g p2gVar2 = w2g.b;
            u2gVar = new u2g(th);
        }
        if (u2gVar instanceof u2g) {
            u2gVar = null;
        }
        Integer num = (Integer) u2gVar;
        if (num != null) {
            return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.w(num.intValue());
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object z(XmlPullParser xmlPullParser, boolean z, sq3 sq3Var) {
        b0 b0Var;
        int i;
        fsf fsfVar;
        boolean z2;
        ArrayList arrayList;
        fsf fsfVar2;
        fsf fsfVar3;
        ArrayList arrayList2;
        ArrayList arrayList3;
        fsf fsfVar4;
        if (sq3Var instanceof b0) {
            b0Var = (b0) sq3Var;
            int i2 = b0Var.A;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                b0Var.A = i2 - Integer.MIN_VALUE;
                Object obj = b0Var.z;
                lu3 lu3Var = lu3.a;
                i = b0Var.A;
                if (i != 0) {
                    fsf g = lnb.g(obj);
                    fsfVar = new fsf();
                    fsf fsfVar5 = new fsf();
                    ArrayList arrayList4 = new ArrayList();
                    ArrayList arrayList5 = new ArrayList();
                    fsf fsfVar6 = new fsf();
                    ArrayList arrayList6 = new ArrayList();
                    z2 = z;
                    g8i g8iVar = new g8i(xmlPullParser, null, g, fsfVar, fsfVar5, arrayList4, arrayList5, fsfVar6, z2, arrayList6);
                    arrayList = arrayList6;
                    b0Var.s = g;
                    b0Var.t = fsfVar;
                    b0Var.u = fsfVar5;
                    b0Var.v = arrayList4;
                    b0Var.w = arrayList5;
                    b0Var.x = fsfVar6;
                    b0Var.y = arrayList;
                    b0Var.r = z2;
                    b0Var.A = 1;
                    if (s9a.r(g8iVar, b0Var) == lu3Var) {
                        return lu3Var;
                    }
                    fsfVar2 = g;
                    fsfVar3 = fsfVar5;
                    arrayList2 = arrayList4;
                    arrayList3 = arrayList5;
                    fsfVar4 = fsfVar6;
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    boolean z3 = b0Var.r;
                    arrayList = b0Var.y;
                    fsfVar4 = b0Var.x;
                    ArrayList arrayList7 = b0Var.w;
                    ArrayList arrayList8 = b0Var.v;
                    fsf fsfVar7 = b0Var.u;
                    fsf fsfVar8 = b0Var.t;
                    fsfVar2 = b0Var.s;
                    y6a.M(obj);
                    z2 = z3;
                    fsfVar3 = fsfVar7;
                    fsfVar = fsfVar8;
                    arrayList3 = arrayList7;
                    arrayList2 = arrayList8;
                }
                ArrayList arrayList9 = arrayList;
                if (!z2 && arrayList2.isEmpty()) {
                    return null;
                }
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.y yVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.y) fsfVar2.a;
                return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.u(yVar, (Long) fsfVar3.a, arrayList2, arrayList3, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.a) fsfVar4.a, arrayList9);
            }
        }
        b0Var = new b0(sq3Var);
        Object obj2 = b0Var.z;
        lu3 lu3Var2 = lu3.a;
        i = b0Var.A;
        if (i != 0) {
        }
        ArrayList arrayList92 = arrayList;
        if (!z2) {
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.y yVar2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.y) fsfVar2.a;
        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.u(yVar2, (Long) fsfVar3.a, arrayList2, arrayList3, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.a) fsfVar4.a, arrayList92);
    }
}
