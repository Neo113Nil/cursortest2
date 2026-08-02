package defpackage;

import com.facebook.appevents.n;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.c;
import com.sofascore.local_persistance.Brand;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class hj7 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ hj7(dwb dwbVar, int i, Brand brand, wla wlaVar, xtc xtcVar, int i2) {
        this.a = 3;
        this.e = dwbVar;
        this.b = i;
        this.f = brand;
        this.g = wlaVar;
        this.c = xtcVar;
        this.d = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.d;
        int i3 = this.b;
        Object obj3 = this.f;
        Object obj4 = this.g;
        Object obj5 = this.e;
        Object obj6 = this.c;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                kik.d((fo1) obj5, (gv9) obj3, (Function1) obj4, (xtc) obj6, (of3) obj, aba.K(i3 | 1), this.d);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int K = aba.K(i2 | 1);
                s9a.i((cqk) obj5, (ArrayList) obj3, this.b, (ct8) obj4, (xtc) obj6, (of3) obj, K);
                break;
            case 2:
                ((Integer) obj2).getClass();
                h5a.n((p23) obj5, (b7k) obj3, (dch) obj4, (tc3) obj6, (of3) obj, aba.K(i3 | 1), this.d);
                break;
            case 3:
                ((Integer) obj2).getClass();
                int K2 = aba.K(i2 | 1);
                vha.b((dwb) obj5, this.b, (Brand) obj3, (wla) obj4, (xtc) obj6, (of3) obj, K2);
                break;
            case 4:
                ((Integer) obj2).getClass();
                tz9.q((aoj) obj5, (xtc) obj6, (Integer) obj3, (Function2) obj4, (of3) obj, aba.K(i3 | 1), this.d);
                break;
            default:
                ((Integer) obj2).getClass();
                n.j((xtc) obj6, (c) obj5, (Function1) obj4, (tc3) obj3, (of3) obj, i3 | 1, this.d);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ hj7(xtc xtcVar, c cVar, Function1 function1, tc3 tc3Var, int i, int i2) {
        this.a = 5;
        this.c = xtcVar;
        this.e = cVar;
        this.g = function1;
        this.f = tc3Var;
        this.b = i;
        this.d = i2;
    }

    public /* synthetic */ hj7(aoj aojVar, xtc xtcVar, Integer num, Function2 function2, int i, int i2) {
        this.a = 4;
        this.e = aojVar;
        this.c = xtcVar;
        this.f = num;
        this.g = function2;
        this.b = i;
        this.d = i2;
    }

    public /* synthetic */ hj7(cqk cqkVar, ArrayList arrayList, int i, ct8 ct8Var, xtc xtcVar, int i2) {
        this.a = 1;
        this.e = cqkVar;
        this.f = arrayList;
        this.b = i;
        this.g = ct8Var;
        this.c = xtcVar;
        this.d = i2;
    }

    public /* synthetic */ hj7(Object obj, Object obj2, Object obj3, Object obj4, int i, int i2, int i3) {
        this.a = i3;
        this.e = obj;
        this.f = obj2;
        this.g = obj3;
        this.c = obj4;
        this.b = i;
        this.d = i2;
    }
}
