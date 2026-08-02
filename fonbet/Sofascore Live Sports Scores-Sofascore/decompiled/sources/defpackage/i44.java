package defpackage;

import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class i44 implements Function2 {
    public final /* synthetic */ int a = 4;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ i44(int i, n8b n8bVar, Function1 function1, r8b r8bVar, bnf bnfVar, boolean z, boolean z2) {
        this.e = i;
        this.f = n8bVar;
        this.g = function1;
        this.h = r8bVar;
        this.c = bnfVar;
        this.b = z;
        this.d = z2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.e;
        Object obj3 = this.c;
        Object obj4 = this.h;
        Object obj5 = this.f;
        Object obj6 = this.g;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                k44.a(aba.K(1 | i2), (of3) obj, (xtc) obj3, (String) obj5, (Function0) obj6, (Function0) obj4, this.b, this.d);
                break;
            case 1:
                ((Integer) obj2).getClass();
                rd0.f((mte) obj5, this.b, (Function1) obj6, (Integer) obj4, (xtc) obj3, this.d, (of3) obj, aba.K(1 | i2));
                break;
            case 2:
                ((Integer) obj2).getClass();
                oyn.f(this.e, this.b, this.d, (Function0) obj6, (Function0) obj4, (Function0) obj5, (xtc) obj3, (of3) obj, aba.K(1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                yso.m(this.b, (String) obj5, (String) obj6, this.d, (xtc) obj3, (Function1) obj4, (of3) obj, aba.K(1 | i2));
                break;
            case 4:
                final n8b n8bVar = (n8b) obj5;
                Function1 function1 = (Function1) obj6;
                final r8b r8bVar = (r8b) obj4;
                final bnf bnfVar = (bnf) obj3;
                of3 of3Var = (of3) obj;
                int intValue = ((Integer) obj2).intValue();
                boolean z = false;
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                    av8Var.d0(-1453295598);
                    final int i3 = this.e;
                    utc utcVar = utc.a;
                    xtc f = bkh.f(bkh.p(utcVar, i3), 80.0f, 88.0f);
                    if (!n8bVar.u) {
                        boolean g = av8Var.g(function1) | av8Var.g(n8bVar);
                        Object O = av8Var.O();
                        if (g || O == nf3.a) {
                            O = new ixa(7, function1, n8bVar);
                            av8Var.n0(O);
                        }
                        Function0 function0 = (Function0) O;
                        function0.getClass();
                        f = f.z(fqj.q(utcVar, new lw2(0.9f, function0, 500L)));
                    }
                    av8Var.s(false);
                    u23 a = t23.a(ww9.d, uxf.p, av8Var, 48);
                    int hashCode = Long.hashCode(av8Var.T);
                    aee m = av8Var.m();
                    xtc C = fqj.C(av8Var, f);
                    if3.k7.getClass();
                    zg3 zg3Var = hf3.b;
                    av8Var.h0();
                    if (av8Var.S) {
                        av8Var.l(zg3Var);
                    } else {
                        av8Var.q0();
                    }
                    waa.K(av8Var, a, hf3.g);
                    waa.K(av8Var, m, hf3.f);
                    waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
                    waa.J(av8Var, hf3.k);
                    waa.K(av8Var, C, hf3.d);
                    if (r8bVar == r8b.b && bnfVar != null && bnfVar != bnf.d) {
                        z = true;
                    }
                    Boolean valueOf = Boolean.valueOf(z);
                    final boolean z2 = this.b;
                    final boolean z3 = this.d;
                    l98.b(valueOf, null, null, null, null, null, yqo.H(-582342246, av8Var, new et8() { // from class: y8b
                        /* JADX WARN: Removed duplicated region for block: B:19:0x006f  */
                        @Override // defpackage.et8
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object invoke(Object obj7, Object obj8, Object obj9, Object obj10) {
                            x9b x9bVar;
                            y9b y9bVar;
                            boolean booleanValue = ((Boolean) obj8).booleanValue();
                            of3 of3Var2 = (of3) obj9;
                            ((Integer) obj10).getClass();
                            ((k60) obj7).getClass();
                            utc utcVar2 = utc.a;
                            n8b n8bVar2 = n8bVar;
                            if (booleanValue) {
                                av8 av8Var2 = (av8) of3Var2;
                                av8Var2.d0(-1184833261);
                                xtc m2 = bkh.m(utcVar2, 52.0f, 48.0f);
                                bnf bnfVar2 = bnf.this;
                                int i4 = bnfVar2 == null ? -1 : a9b.a[bnfVar2.ordinal()];
                                if (i4 == 1) {
                                    y9b y9bVar2 = n8bVar2.w;
                                    if (y9bVar2 != null) {
                                        x9bVar = y9bVar2.a;
                                        y9b y9bVar3 = n8bVar2.w;
                                        b9b.e(x9bVar, Intrinsics.c(y9bVar3 != null ? Boolean.valueOf(y9bVar3.e) : null, Boolean.TRUE), m2, av8Var2, 384);
                                        av8Var2.s(false);
                                    }
                                    x9bVar = null;
                                    y9b y9bVar32 = n8bVar2.w;
                                    b9b.e(x9bVar, Intrinsics.c(y9bVar32 != null ? Boolean.valueOf(y9bVar32.e) : null, Boolean.TRUE), m2, av8Var2, 384);
                                    av8Var2.s(false);
                                } else if (i4 == 2) {
                                    y9b y9bVar4 = n8bVar2.w;
                                    if (y9bVar4 != null) {
                                        x9bVar = y9bVar4.b;
                                        y9b y9bVar322 = n8bVar2.w;
                                        b9b.e(x9bVar, Intrinsics.c(y9bVar322 != null ? Boolean.valueOf(y9bVar322.e) : null, Boolean.TRUE), m2, av8Var2, 384);
                                        av8Var2.s(false);
                                    }
                                    x9bVar = null;
                                    y9b y9bVar3222 = n8bVar2.w;
                                    b9b.e(x9bVar, Intrinsics.c(y9bVar3222 != null ? Boolean.valueOf(y9bVar3222.e) : null, Boolean.TRUE), m2, av8Var2, 384);
                                    av8Var2.s(false);
                                } else if (i4 == 3) {
                                    y9b y9bVar5 = n8bVar2.w;
                                    if (y9bVar5 != null) {
                                        x9bVar = y9bVar5.c;
                                        y9b y9bVar32222 = n8bVar2.w;
                                        b9b.e(x9bVar, Intrinsics.c(y9bVar32222 != null ? Boolean.valueOf(y9bVar32222.e) : null, Boolean.TRUE), m2, av8Var2, 384);
                                        av8Var2.s(false);
                                    }
                                    x9bVar = null;
                                    y9b y9bVar322222 = n8bVar2.w;
                                    b9b.e(x9bVar, Intrinsics.c(y9bVar322222 != null ? Boolean.valueOf(y9bVar322222.e) : null, Boolean.TRUE), m2, av8Var2, 384);
                                    av8Var2.s(false);
                                } else if (i4 != 4) {
                                    if (i4 == 5 && (y9bVar = n8bVar2.w) != null) {
                                        x9bVar = y9bVar.f;
                                        y9b y9bVar3222222 = n8bVar2.w;
                                        b9b.e(x9bVar, Intrinsics.c(y9bVar3222222 != null ? Boolean.valueOf(y9bVar3222222.e) : null, Boolean.TRUE), m2, av8Var2, 384);
                                        av8Var2.s(false);
                                    }
                                    x9bVar = null;
                                    y9b y9bVar32222222 = n8bVar2.w;
                                    b9b.e(x9bVar, Intrinsics.c(y9bVar32222222 != null ? Boolean.valueOf(y9bVar32222222.e) : null, Boolean.TRUE), m2, av8Var2, 384);
                                    av8Var2.s(false);
                                } else {
                                    y9b y9bVar6 = n8bVar2.w;
                                    if (y9bVar6 != null) {
                                        x9bVar = y9bVar6.d;
                                        y9b y9bVar322222222 = n8bVar2.w;
                                        b9b.e(x9bVar, Intrinsics.c(y9bVar322222222 != null ? Boolean.valueOf(y9bVar322222222.e) : null, Boolean.TRUE), m2, av8Var2, 384);
                                        av8Var2.s(false);
                                    }
                                    x9bVar = null;
                                    y9b y9bVar3222222222 = n8bVar2.w;
                                    b9b.e(x9bVar, Intrinsics.c(y9bVar3222222222 != null ? Boolean.valueOf(y9bVar3222222222.e) : null, Boolean.TRUE), m2, av8Var2, 384);
                                    av8Var2.s(false);
                                }
                            } else {
                                av8 av8Var3 = (av8) of3Var2;
                                av8Var3.d0(-1183922760);
                                b9b.d(n8bVar2, p75.a((float) i3, 68.0f) < 0, r8bVar, z2, bkh.e(bkh.p(utcVar2, 60.0f), 50.0f), z3, av8Var3, 24576);
                                av8Var3.s(false);
                            }
                            return Unit.a;
                        }
                    }), av8Var, 1572864, 62);
                    qea.e(n8bVar.b, n8bVar.d, l98.f0(l98.d0(utcVar, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), 0L, av8Var, 384, 8);
                    av8Var.s(true);
                } else {
                    av8Var.W();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                rd0.p((ale) obj6, this.b, this.d, (String) obj5, (Function1) obj4, (xtc) obj3, (of3) obj, aba.K(i2 | 1));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ i44(int i, xtc xtcVar, String str, Function0 function0, Function0 function02, boolean z, boolean z2) {
        this.f = str;
        this.g = function0;
        this.h = function02;
        this.b = z;
        this.d = z2;
        this.c = xtcVar;
        this.e = i;
    }

    public /* synthetic */ i44(int i, boolean z, boolean z2, Function0 function0, Function0 function02, Function0 function03, xtc xtcVar, int i2) {
        this.e = i;
        this.b = z;
        this.d = z2;
        this.g = function0;
        this.h = function02;
        this.f = function03;
        this.c = xtcVar;
    }

    public /* synthetic */ i44(ale aleVar, boolean z, boolean z2, String str, Function1 function1, xtc xtcVar, int i) {
        this.g = aleVar;
        this.b = z;
        this.d = z2;
        this.f = str;
        this.h = function1;
        this.c = xtcVar;
        this.e = i;
    }

    public /* synthetic */ i44(mte mteVar, boolean z, Function1 function1, Integer num, xtc xtcVar, boolean z2, int i) {
        this.f = mteVar;
        this.b = z;
        this.g = function1;
        this.h = num;
        this.c = xtcVar;
        this.d = z2;
        this.e = i;
    }

    public /* synthetic */ i44(boolean z, String str, String str2, boolean z2, xtc xtcVar, Function1 function1, int i) {
        this.b = z;
        this.f = str;
        this.g = str2;
        this.d = z2;
        this.c = xtcVar;
        this.h = function1;
        this.e = i;
    }
}
