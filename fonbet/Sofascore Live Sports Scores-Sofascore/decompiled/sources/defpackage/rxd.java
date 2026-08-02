package defpackage;

import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class rxd implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ xtc b;
    public final /* synthetic */ Function2 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ n9j e;
    public final /* synthetic */ Function1 f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ dfj h;
    public final /* synthetic */ kja i;
    public final /* synthetic */ ija j;
    public final /* synthetic */ boolean k;
    public final /* synthetic */ int l;
    public final /* synthetic */ int m;
    public final /* synthetic */ jwk n;
    public final /* synthetic */ wzc o;
    public final /* synthetic */ Function2 p;
    public final /* synthetic */ Function2 q;
    public final /* synthetic */ uah r;
    public final /* synthetic */ Object s;

    public rxd(xtc xtcVar, Function2 function2, n9j n9jVar, String str, Function1 function1, boolean z, boolean z2, dfj dfjVar, kja kjaVar, ija ijaVar, boolean z3, int i, int i2, jwk jwkVar, wzc wzcVar, Function2 function22, Function2 function23, uah uahVar) {
        this.b = xtcVar;
        this.c = function2;
        this.e = n9jVar;
        this.s = str;
        this.f = function1;
        this.d = z;
        this.g = z2;
        this.h = dfjVar;
        this.i = kjaVar;
        this.j = ijaVar;
        this.k = z3;
        this.l = i;
        this.m = i2;
        this.n = jwkVar;
        this.o = wzcVar;
        this.p = function22;
        this.q = function23;
        this.r = uahVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.s;
        a99 a99Var = nf3.a;
        Function2 function2 = this.c;
        xtc xtcVar = this.b;
        xtc xtcVar2 = utc.a;
        switch (i) {
            case 0:
                of3 of3Var = (of3) obj;
                int intValue = ((Number) obj2).intValue();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                    if (function2 != null) {
                        av8Var.d0(-903490605);
                        Object O = av8Var.O();
                        if (O == a99Var) {
                            O = new etd(1);
                            av8Var.n0(O);
                        }
                        xtcVar2 = l98.f0(o3h.a(xtcVar2, true, (Function1) O), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, qha.G(av8Var), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
                        av8Var.s(false);
                    } else {
                        av8Var.d0(-903106918);
                        av8Var.s(false);
                    }
                    xtc z = xtcVar.z(xtcVar2);
                    cga.B(R.string.default_error_message, av8Var);
                    xtc a = bkh.a(z, 280.0f, 56.0f);
                    n9j n9jVar = this.e;
                    pvh pvhVar = new pvh(n9jVar.i);
                    String str = (String) obj3;
                    Function2 function22 = this.q;
                    uah uahVar = this.r;
                    boolean z2 = this.d;
                    boolean z3 = this.k;
                    jwk jwkVar = this.n;
                    wzc wzcVar = this.o;
                    yo1.d(str, this.f, a, z2, this.g, this.h, this.i, this.j, z3, this.l, this.m, jwkVar, null, wzcVar, pvhVar, yqo.H(-1189274459, av8Var, new qxd(str, z2, z3, jwkVar, wzcVar, this.c, this.p, function22, n9jVar, uahVar)), av8Var, 0, 196608, 4096);
                } else {
                    av8Var.W();
                }
                break;
            default:
                of3 of3Var2 = (of3) obj;
                int intValue2 = ((Number) obj2).intValue();
                av8 av8Var2 = (av8) of3Var2;
                if (av8Var2.T(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (function2 != null) {
                        av8Var2.d0(-1901539802);
                        Object O2 = av8Var2.O();
                        if (O2 == a99Var) {
                            O2 = new etd(2);
                            av8Var2.n0(O2);
                        }
                        xtcVar2 = l98.f0(o3h.a(xtcVar2, true, (Function1) O2), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, qha.G(av8Var2), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
                        av8Var2.s(false);
                    } else {
                        av8Var2.d0(-1901156115);
                        av8Var2.s(false);
                    }
                    xtc z4 = xtcVar.z(xtcVar2);
                    String B = cga.B(R.string.default_error_message, av8Var2);
                    boolean z5 = this.d;
                    if (z5) {
                        z4 = o3h.a(z4, false, new cfi(B, 3));
                    }
                    xtc a2 = bkh.a(z4, 280.0f, 56.0f);
                    n9j n9jVar2 = this.e;
                    pvh pvhVar2 = new pvh(z5 ? n9jVar2.j : n9jVar2.i);
                    wcj wcjVar = (wcj) obj3;
                    Function2 function23 = this.q;
                    uah uahVar2 = this.r;
                    boolean z6 = this.g;
                    boolean z7 = this.k;
                    jwk jwkVar2 = this.n;
                    wzc wzcVar2 = this.o;
                    yo1.c(wcjVar, this.f, a2, z6, this.h, this.i, this.j, z7, this.l, this.m, jwkVar2, null, wzcVar2, pvhVar2, yqo.H(674541106, av8Var2, new txd(wcjVar, z6, z7, jwkVar2, wzcVar2, this.d, this.c, this.p, function23, n9jVar2, uahVar2)), av8Var2, 0);
                } else {
                    av8Var2.W();
                }
                break;
        }
        return Unit.a;
    }

    public rxd(xtc xtcVar, Function2 function2, boolean z, n9j n9jVar, wcj wcjVar, Function1 function1, boolean z2, dfj dfjVar, kja kjaVar, ija ijaVar, boolean z3, int i, int i2, jwk jwkVar, wzc wzcVar, Function2 function22, Function2 function23, uah uahVar) {
        this.b = xtcVar;
        this.c = function2;
        this.d = z;
        this.e = n9jVar;
        this.s = wcjVar;
        this.f = function1;
        this.g = z2;
        this.h = dfjVar;
        this.i = kjaVar;
        this.j = ijaVar;
        this.k = z3;
        this.l = i;
        this.m = i2;
        this.n = jwkVar;
        this.o = wzcVar;
        this.p = function22;
        this.q = function23;
        this.r = uahVar;
    }
}
