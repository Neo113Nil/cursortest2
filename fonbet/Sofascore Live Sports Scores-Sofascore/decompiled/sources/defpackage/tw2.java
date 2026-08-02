package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class tw2 implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ xtc c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    public /* synthetic */ tw2(String str, dfj dfjVar, Function0 function0, xtc xtcVar, v8j v8jVar, long j, long j2, int i, int i2) {
        this.h = str;
        this.i = dfjVar;
        this.b = function0;
        this.c = xtcVar;
        this.j = v8jVar;
        this.d = j;
        this.e = j2;
        this.f = i;
        this.g = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.f;
        Object obj3 = this.j;
        Object obj4 = this.i;
        Object obj5 = this.h;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int K = aba.K(i2 | 1);
                ktm.c((String) obj5, (dfj) obj4, this.b, this.c, (v8j) obj3, this.d, this.e, (of3) obj, K, this.g);
                break;
            default:
                ((Integer) obj2).getClass();
                int K2 = aba.K(i2 | 1);
                v88.a(this.b, this.c, (uah) obj5, this.d, this.e, (i88) obj4, (tc3) obj3, (of3) obj, K2, this.g);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ tw2(Function0 function0, xtc xtcVar, uah uahVar, long j, long j2, i88 i88Var, tc3 tc3Var, int i, int i2) {
        this.b = function0;
        this.c = xtcVar;
        this.h = uahVar;
        this.d = j;
        this.e = j2;
        this.i = i88Var;
        this.j = tc3Var;
        this.f = i;
        this.g = i2;
    }
}
