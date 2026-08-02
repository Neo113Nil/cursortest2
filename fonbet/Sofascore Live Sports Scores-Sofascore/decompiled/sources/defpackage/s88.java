package defpackage;

import androidx.compose.ui.graphics.vector.ImageVector;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class s88 implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ xtc c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;
    public final /* synthetic */ float f;
    public final /* synthetic */ int g;
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;

    public /* synthetic */ s88(String str, Function0 function0, xtc xtcVar, long j, long j2, ImageVector imageVector, ct8 ct8Var, float f, w8l w8lVar, int i, int i2) {
        this.i = str;
        this.b = function0;
        this.c = xtcVar;
        this.d = j;
        this.e = j2;
        this.j = imageVector;
        this.k = ct8Var;
        this.f = f;
        this.l = w8lVar;
        this.g = i;
        this.h = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.g;
        Object obj3 = this.l;
        Object obj4 = this.k;
        Object obj5 = this.j;
        Object obj6 = this.i;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int K = aba.K(i2 | 1);
                int K2 = aba.K(this.h);
                v88.b(this.b, (dfj) obj6, this.f, this.c, (uah) obj5, this.d, this.e, (i88) obj4, (tc3) obj3, (of3) obj, K, K2);
                break;
            default:
                ((Integer) obj2).getClass();
                int K3 = aba.K(i2 | 1);
                pea.k((String) obj6, this.b, this.c, this.d, this.e, (ImageVector) obj5, (ct8) obj4, this.f, (w8l) obj3, (of3) obj, K3, this.h);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ s88(Function0 function0, dfj dfjVar, float f, xtc xtcVar, uah uahVar, long j, long j2, i88 i88Var, tc3 tc3Var, int i, int i2) {
        this.b = function0;
        this.i = dfjVar;
        this.f = f;
        this.c = xtcVar;
        this.j = uahVar;
        this.d = j;
        this.e = j2;
        this.k = i88Var;
        this.l = tc3Var;
        this.g = i;
        this.h = i2;
    }
}
