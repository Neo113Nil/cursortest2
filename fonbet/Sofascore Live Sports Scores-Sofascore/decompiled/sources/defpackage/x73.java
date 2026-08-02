package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class x73 implements Function2 {
    public final /* synthetic */ int a = 2;
    public final /* synthetic */ String b;
    public final /* synthetic */ xtc c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ int e;
    public final /* synthetic */ long f;
    public final /* synthetic */ int g;
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;

    public /* synthetic */ x73(int i, String str, xtc xtcVar, long j, fo foVar, boolean z, int i2, int i3) {
        this.e = i;
        this.b = str;
        this.c = xtcVar;
        this.f = j;
        this.i = foVar;
        this.d = z;
        this.g = i2;
        this.h = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.g;
        Object obj3 = this.i;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int K = aba.K(i2 | 1);
                String str = this.b;
                boolean z = this.d;
                ml4.l(str, z, (mv1) obj3, this.c, this.e, this.f, (of3) obj, K, this.h);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int K2 = aba.K(i2 | 1);
                String str2 = this.b;
                oea.d(str2, (Function1) obj3, this.c, this.d, this.e, this.f, (of3) obj, K2, this.h);
                break;
            default:
                ((Integer) obj2).getClass();
                int K3 = aba.K(i2 | 1);
                int i3 = this.e;
                String str3 = this.b;
                xtc xtcVar = this.c;
                long j = this.f;
                i2a.i(i3, str3, xtcVar, j, (fo) obj3, this.d, (of3) obj, K3, this.h);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ x73(String str, Function1 function1, xtc xtcVar, boolean z, int i, long j, int i2, int i3) {
        this.b = str;
        this.i = function1;
        this.c = xtcVar;
        this.d = z;
        this.e = i;
        this.f = j;
        this.g = i2;
        this.h = i3;
    }

    public /* synthetic */ x73(String str, boolean z, mv1 mv1Var, xtc xtcVar, int i, long j, int i2, int i3) {
        this.b = str;
        this.d = z;
        this.i = mv1Var;
        this.c = xtcVar;
        this.e = i;
        this.f = j;
        this.g = i2;
        this.h = i3;
    }
}
