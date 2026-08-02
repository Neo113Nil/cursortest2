package defpackage;

import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class rw2 implements ct8 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ d1a b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ u5g d;
    public final /* synthetic */ Function0 e;
    public final /* synthetic */ Object f;

    public rw2(d1a d1aVar, vjj vjjVar, boolean z, u5g u5gVar, Function0 function0) {
        this.b = d1aVar;
        this.f = vjjVar;
        this.c = z;
        this.d = u5gVar;
        this.e = function0;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        Object obj4 = this.f;
        d1a d1aVar = this.b;
        utc utcVar = utc.a;
        a99 a99Var = nf3.a;
        switch (i) {
            case 0:
                ((Number) obj3).intValue();
                av8 av8Var = (av8) ((of3) obj2);
                av8Var.d0(-1525724089);
                Object O = av8Var.O();
                if (O == a99Var) {
                    O = mz1.e(av8Var);
                }
                wzc wzcVar = (wzc) O;
                xtc a = f1a.a(utcVar, wzcVar, d1aVar);
                u5g u5gVar = this.d;
                Function0 function0 = this.e;
                xtc z = a.z(new qw2(wzcVar, null, false, this.c, (String) obj4, u5gVar, function0));
                av8Var.s(false);
                return z;
            default:
                ((Number) obj3).intValue();
                av8 av8Var2 = (av8) ((of3) obj2);
                av8Var2.d0(-1525724089);
                Object O2 = av8Var2.O();
                if (O2 == a99Var) {
                    O2 = mz1.e(av8Var2);
                }
                wzc wzcVar2 = (wzc) O2;
                xtc z2 = f1a.a(utcVar, wzcVar2, d1aVar).z(new p0k((vjj) obj4, wzcVar2, null, this.c, this.d, this.e));
                av8Var2.s(false);
                return z2;
        }
    }

    public rw2(d1a d1aVar, boolean z, String str, u5g u5gVar, Function0 function0) {
        this.b = d1aVar;
        this.c = z;
        this.f = str;
        this.d = u5gVar;
        this.e = function0;
    }
}
