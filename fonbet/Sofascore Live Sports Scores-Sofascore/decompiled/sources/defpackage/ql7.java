package defpackage;

import androidx.compose.ui.graphics.vector.ImageVector;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class ql7 implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ xtc c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ ql7(pl7 pl7Var, String str, boolean z, xtc xtcVar, long j, int i, int i2) {
        this.f = pl7Var;
        this.g = str;
        this.d = z;
        this.c = xtcVar;
        this.b = j;
        this.e = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.g;
        Object obj4 = this.f;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int K = aba.K(1);
                fz8.A((pl7) obj4, (String) obj3, this.d, this.c, this.b, (of3) obj, K, this.e);
                break;
            default:
                ((Integer) obj2).getClass();
                gvd.l((ImageVector) obj4, (Function0) obj3, this.b, this.c, this.d, (of3) obj, aba.K(this.e | 1));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ ql7(ImageVector imageVector, Function0 function0, long j, xtc xtcVar, boolean z, int i) {
        this.f = imageVector;
        this.g = function0;
        this.b = j;
        this.c = xtcVar;
        this.d = z;
        this.e = i;
    }
}
