package defpackage;

import com.sofascore.model.firebase.AdType;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class a49 implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ xtc c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Function0 e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    public /* synthetic */ a49(int i, AdType.Native r3, wg wgVar, h4d h4dVar, xtc xtcVar, boolean z, Function0 function0, int i2, int i3) {
        this.b = i;
        this.h = r3;
        this.i = wgVar;
        this.j = h4dVar;
        this.c = xtcVar;
        this.d = z;
        this.e = function0;
        this.f = i2;
        this.g = i3;
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
                gvd.k((String) obj5, this.b, (x43) obj3, this.d, this.c, (String) obj4, this.e, (of3) obj, K, this.g);
                break;
            default:
                ((Integer) obj2).getClass();
                int K2 = aba.K(i2 | 1);
                b4d.a(this.b, (AdType.Native) obj5, (wg) obj4, (h4d) obj3, this.c, this.d, this.e, (of3) obj, K2, this.g);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ a49(String str, int i, x43 x43Var, boolean z, xtc xtcVar, String str2, Function0 function0, int i2, int i3) {
        this.h = str;
        this.b = i;
        this.j = x43Var;
        this.d = z;
        this.c = xtcVar;
        this.i = str2;
        this.e = function0;
        this.f = i2;
        this.g = i3;
    }
}
