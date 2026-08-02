package defpackage;

import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class s2h implements ct8 {
    public final /* synthetic */ d1a a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ u5g d;
    public final /* synthetic */ Function0 e;

    public s2h(d1a d1aVar, boolean z, boolean z2, u5g u5gVar, Function0 function0) {
        this.a = d1aVar;
        this.b = z;
        this.c = z2;
        this.d = u5gVar;
        this.e = function0;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ((Number) obj3).intValue();
        av8 av8Var = (av8) ((of3) obj2);
        av8Var.d0(-1525724089);
        Object O = av8Var.O();
        if (O == nf3.a) {
            O = mz1.e(av8Var);
        }
        wzc wzcVar = (wzc) O;
        xtc z = f1a.a(utc.a, wzcVar, this.a).z(new r2h(this.b, wzcVar, null, this.c, this.d, this.e));
        av8Var.s(false);
        return z;
    }
}
