package defpackage;

import android.graphics.Bitmap;
import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class e82 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ e82(hzh hzhVar, boolean z, boolean z2, xtc xtcVar, Function0 function0, int i, int i2) {
        this.a = 8;
        this.g = hzhVar;
        this.c = z;
        this.d = z2;
        this.b = xtcVar;
        this.h = function0;
        this.e = i;
        this.f = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.e;
        Object obj3 = this.h;
        Object obj4 = this.g;
        Object obj5 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                ww9.q((xtc) obj5, (String) obj4, this.c, this.d, (Function0) obj3, (of3) obj, aba.K(i2 | 1), this.f);
                break;
            case 1:
                ((Integer) obj2).getClass();
                wkn.c((mte) obj4, (Function1) obj3, (xtc) obj5, this.c, this.d, (of3) obj, aba.K(i2 | 1), this.f);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int K = aba.K(i2 | 1);
                boolean z = this.c;
                f5p.c((String) obj4, (gv9) obj3, z, (xtc) obj5, this.d, (of3) obj, K, this.f);
                break;
            case 3:
                ((Integer) obj2).getClass();
                int K2 = aba.K(1597441);
                rd0.k((ev6) obj3, this.e, (String) obj4, this.f, (xtc) obj5, this.c, this.d, (of3) obj, K2);
                break;
            case 4:
                ((Integer) obj2).getClass();
                tgj.g((String) obj4, (String) obj3, (xtc) obj5, this.c, this.d, (of3) obj, aba.K(i2 | 1), this.f);
                break;
            case 5:
                ((Integer) obj2).getClass();
                jca.l((ecd) obj4, (xtc) obj5, this.c, this.d, (Function2) obj3, (of3) obj, aba.K(i2 | 1), this.f);
                break;
            case 6:
                ((Integer) obj2).getClass();
                int K3 = aba.K(i2 | 1);
                boolean z2 = this.c;
                y6a.d(z2, (Function0) obj3, (xtc) obj5, this.d, (clf) obj4, (of3) obj, K3, this.f);
                break;
            case 7:
                ((Integer) obj2).getClass();
                int K4 = aba.K(i2 | 1);
                boolean z3 = this.c;
                r4a.b((oxh) obj4, (uxh) obj3, z3, (xtc) obj5, this.d, (of3) obj, K4, this.f);
                break;
            case 8:
                ((Integer) obj2).getClass();
                hz8.u((hzh) obj4, this.c, this.d, (xtc) obj5, (Function0) obj3, (of3) obj, aba.K(i2 | 1), this.f);
                break;
            default:
                ((Integer) obj2).getClass();
                int K5 = aba.K(i2 | 1);
                boolean z4 = this.c;
                boolean z5 = this.d;
                z9.c((Bitmap) obj5, (Integer) obj4, z4, z5, (vy8) obj3, (of3) obj, K5, this.f);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ e82(ecd ecdVar, xtc xtcVar, boolean z, boolean z2, Function2 function2, int i, int i2) {
        this.a = 5;
        this.g = ecdVar;
        this.b = xtcVar;
        this.c = z;
        this.d = z2;
        this.h = function2;
        this.e = i;
        this.f = i2;
    }

    public /* synthetic */ e82(ev6 ev6Var, int i, String str, int i2, xtc xtcVar, boolean z, boolean z2, int i3) {
        this.a = 3;
        this.h = ev6Var;
        this.e = i;
        this.g = str;
        this.f = i2;
        this.b = xtcVar;
        this.c = z;
        this.d = z2;
    }

    public /* synthetic */ e82(Serializable serializable, Object obj, xtc xtcVar, boolean z, boolean z2, int i, int i2, int i3) {
        this.a = i3;
        this.g = serializable;
        this.h = obj;
        this.b = xtcVar;
        this.c = z;
        this.d = z2;
        this.e = i;
        this.f = i2;
    }

    public /* synthetic */ e82(Object obj, Object obj2, boolean z, xtc xtcVar, boolean z2, int i, int i2, int i3) {
        this.a = i3;
        this.g = obj;
        this.h = obj2;
        this.c = z;
        this.b = xtcVar;
        this.d = z2;
        this.e = i;
        this.f = i2;
    }

    public /* synthetic */ e82(Object obj, Object obj2, boolean z, boolean z2, Object obj3, int i, int i2, int i3) {
        this.a = i3;
        this.b = obj;
        this.g = obj2;
        this.c = z;
        this.d = z2;
        this.h = obj3;
        this.e = i;
        this.f = i2;
    }

    public /* synthetic */ e82(boolean z, Function0 function0, xtc xtcVar, boolean z2, clf clfVar, int i, int i2) {
        this.a = 6;
        this.c = z;
        this.h = function0;
        this.b = xtcVar;
        this.d = z2;
        this.g = clfVar;
        this.e = i;
        this.f = i2;
    }
}
