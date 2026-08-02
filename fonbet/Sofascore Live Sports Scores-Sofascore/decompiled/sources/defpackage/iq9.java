package defpackage;

import androidx.compose.ui.graphics.vector.ImageVector;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class iq9 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ xtc c;
    public final /* synthetic */ long d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    public /* synthetic */ iq9(q80 q80Var, xtc xtcVar, long j, lg0 lg0Var, int i, int i2) {
        this.a = 4;
        this.g = q80Var;
        this.c = xtcVar;
        this.d = j;
        this.b = lg0Var;
        this.e = i;
        this.f = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                kq9.b((ImageVector) this.g, (String) this.b, this.c, this.d, (of3) obj, aba.K(this.e | 1), this.f);
                break;
            case 1:
                ((Integer) obj2).getClass();
                kq9.a((d7e) this.g, (String) this.b, this.c, this.d, (of3) obj, aba.K(this.e | 1), this.f);
                break;
            case 2:
                ((Integer) obj2).getClass();
                qea.e((String) this.b, (String) this.g, this.c, this.d, (of3) obj, aba.K(this.e | 1), this.f);
                break;
            case 3:
                ((Integer) obj2).getClass();
                d2a.i((String) this.b, this.c, this.d, (lg0) this.g, (of3) obj, aba.K(this.e | 1), this.f);
                break;
            default:
                ((Integer) obj2).getClass();
                d2a.h((q80) this.g, this.c, this.d, (lg0) this.b, (of3) obj, aba.K(this.e | 1), this.f);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ iq9(Object obj, String str, xtc xtcVar, long j, int i, int i2, int i3) {
        this.a = i3;
        this.g = obj;
        this.b = str;
        this.c = xtcVar;
        this.d = j;
        this.e = i;
        this.f = i2;
    }

    public /* synthetic */ iq9(String str, xtc xtcVar, long j, lg0 lg0Var, int i, int i2) {
        this.a = 3;
        this.b = str;
        this.c = xtcVar;
        this.d = j;
        this.g = lg0Var;
        this.e = i;
        this.f = i2;
    }

    public /* synthetic */ iq9(String str, String str2, xtc xtcVar, long j, int i, int i2) {
        this.a = 2;
        this.b = str;
        this.g = str2;
        this.c = xtcVar;
        this.d = j;
        this.e = i;
        this.f = i2;
    }
}
