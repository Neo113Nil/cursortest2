package defpackage;

import com.sofascore.model.mvvm.model.Gender;
import com.sofascore.results.pots.highestRated.bottomSheet.POTSHighestRatedPlayersFilterBottomSheet;
import com.sofascore.results.view.FeaturedMatchView;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KFunction;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class zt7 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ zt7(int i, FeaturedMatchView featuredMatchView, vmd vmdVar, Boolean bool) {
        this.a = 0;
        this.b = i;
        this.c = featuredMatchView;
        this.d = vmdVar;
        this.e = bool;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        h0a h0aVar;
        Object fl8Var;
        boolean z;
        Gender gender;
        int i = this.a;
        int i2 = this.b;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        switch (i) {
            case 0:
                break;
            case 1:
                ((Integer) obj2).getClass();
                u6h.n((String) obj5, (sda) obj4, (xtc) obj3, (of3) obj, aba.K(i2 | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                ww9.l((gv9) obj5, (xtc) obj4, (tc3) obj3, (of3) obj, aba.K(i2 | 1));
                break;
            case 3:
                gz9 gz9Var = (gz9) obj5;
                xy9 xy9Var = (xy9) obj4;
                yy9 yy9Var = (yy9) obj3;
                of3 of3Var = (of3) obj;
                int intValue = ((Integer) obj2).intValue();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                    h0a h0aVar2 = gz9Var.c;
                    boolean z2 = gz9Var.e;
                    Gender gender2 = xy9Var.d;
                    boolean i3 = av8Var.i(yy9Var) | av8Var.i(xy9Var);
                    int i4 = this.b;
                    boolean e = av8Var.e(i4) | i3 | av8Var.i(gz9Var);
                    Object O = av8Var.O();
                    a99 a99Var = nf3.a;
                    if (e || O == a99Var) {
                        O = new im1(yy9Var, xy9Var, i4, gz9Var, 4);
                        av8Var.n0(O);
                    }
                    Function0 function0 = (Function0) O;
                    boolean i5 = av8Var.i(xy9Var);
                    Object O2 = av8Var.O();
                    if (i5 || O2 == a99Var) {
                        h0aVar = h0aVar2;
                        z = z2;
                        gender = gender2;
                        fl8Var = new fl8(0, xy9Var, xy9.class, "passingNetworkScrollIfNeeded", "passingNetworkScrollIfNeeded()V", 0, 2);
                        av8Var.n0(fl8Var);
                    } else {
                        h0aVar = h0aVar2;
                        gender = gender2;
                        fl8Var = O2;
                        z = z2;
                    }
                    nz9.c(h0aVar, z, gender, function0, (Function0) ((KFunction) fl8Var), av8Var, 0);
                } else {
                    av8Var.W();
                }
                break;
            case 4:
                ((Integer) obj2).getClass();
                haa.c((daa) obj5, (Function1) obj4, (xtc) obj3, (of3) obj, aba.K(i2 | 1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                h5a.g((gla) obj5, (Function1) obj4, (xtc) obj3, (of3) obj, aba.K(i2 | 1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                aba.h((uqa) obj5, this.d, this.b, this.e, (of3) obj, aba.K(1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                ((ssa) obj5).b(obj4, (tc3) obj3, (of3) obj, aba.K(i2 | 1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                h5a.j((exa) obj5, this.b, (Function0) obj4, (xtc) obj3, (of3) obj, aba.K(1));
                break;
            case 9:
                ((Integer) obj2).getClass();
                h5a.i((Integer) obj5, (Function0) obj4, (xtc) obj3, (of3) obj, aba.K(i2 | 1));
                break;
            case 10:
                ((Integer) obj2).getClass();
                q5a.b((ec9) obj5, (xtc) obj4, (String) obj3, (of3) obj, aba.K(i2 | 1));
                break;
            case 11:
                ((Integer) obj2).intValue();
                jca.d((u6b) obj5, (a7b) obj4, (Function1) obj3, (of3) obj, aba.K(i2 | 1));
                break;
            case 12:
                ((Integer) obj2).getClass();
                jca.b((d6b) obj5, (u6b) obj4, (Function0) obj3, (of3) obj, aba.K(i2 | 1));
                break;
            case 13:
                ((Integer) obj2).intValue();
                jca.g((u6b) obj5, (f7b) obj4, (Function1) obj3, (of3) obj, aba.K(i2 | 1));
                break;
            case 14:
                ((Integer) obj2).getClass();
                jca.c(obj5, (u6b) obj4, (Function1) obj3, (of3) obj, aba.K(i2 | 1));
                break;
            case 15:
                ((Integer) obj2).getClass();
                pea.g((x6f) obj5, (xtc) obj4, (jzg) obj3, (of3) obj, aba.K(1), this.b);
                break;
            case 16:
                ((Integer) obj2).getClass();
                sea.c((u8b) obj5, (Function1) obj4, (xtc) obj3, (of3) obj, aba.K(i2 | 1));
                break;
            case 17:
                ((Integer) obj2).getClass();
                b9b.a((n8b) obj5, (r8b) obj4, (xtc) obj3, (of3) obj, aba.K(i2 | 1));
                break;
            case 18:
                ((Integer) obj2).getClass();
                cga.f((h9b) obj5, (Function0) obj4, (xtc) obj3, (of3) obj, aba.K(i2 | 1));
                break;
            case 19:
                ((Integer) obj2).getClass();
                aba.e((r5c) obj5, (Function1) obj4, (xtc) obj3, (of3) obj, aba.K(1), this.b);
                break;
            case 20:
                ((Integer) obj2).getClass();
                pea.h((mvc) obj5, (Function1) obj4, (xtc) obj3, (of3) obj, aba.K(i2 | 1));
                break;
            case 21:
                ((Integer) obj2).getClass();
                jca.j((d49) obj5, (Function1) obj4, (xtc) obj3, (of3) obj, aba.K(i2 | 1));
                break;
            case 22:
                ((Integer) obj2).getClass();
                g7a.c((mjb) obj5, (Function1) obj4, (xtc) obj3, (of3) obj, aba.K(i2 | 1));
                break;
            case 23:
                ((Integer) obj2).getClass();
                ((POTSHighestRatedPlayersFilterBottomSheet) obj5).L((Function0) obj4, (Function0) obj3, (of3) obj, aba.K(i2 | 1));
                break;
            case 24:
                ((Integer) obj2).getClass();
                xw3.l((q1e) obj5, (osa) obj4, (Function1) obj3, (of3) obj, aba.K(i2 | 1));
                break;
            case 25:
                ((Integer) obj2).getClass();
                nce.c((gv9) obj5, this.b, (Integer) obj4, (xtc) obj3, (of3) obj, aba.K(1));
                break;
            case 26:
                ((Integer) obj2).getClass();
                uaa.b((nte) obj5, (Function1) obj4, (xtc) obj3, (of3) obj, aba.K(1 | i2));
                break;
            case 27:
                ((Integer) obj2).intValue();
                aba.r((List) obj5, (String) obj4, (Function2) obj3, (of3) obj, aba.K(1 | i2));
                break;
            case 28:
                ((Integer) obj2).getClass();
                int K = aba.K(1);
                int i6 = this.b;
                kda.e(i6, K, (of3) obj, (xtc) obj3, (String) obj5, (String) obj4);
                break;
            default:
                ((Integer) obj2).getClass();
                kda.f((gta) obj5, (qbf) obj4, (xtc) obj3, (of3) obj, aba.K(i2 | 1));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ zt7(int i, int i2, int i3, Object obj, Object obj2, Object obj3) {
        this.a = i3;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = i2;
    }

    public /* synthetic */ zt7(uqa uqaVar, Object obj, int i, Object obj2, int i2) {
        this.a = 6;
        this.c = uqaVar;
        this.d = obj;
        this.b = i;
        this.e = obj2;
    }

    public /* synthetic */ zt7(Object obj, xtc xtcVar, Object obj2, int i, int i2, int i3) {
        this.a = i3;
        this.c = obj;
        this.b = i;
        this.d = obj2;
        this.e = xtcVar;
    }

    public /* synthetic */ zt7(Object obj, Object obj2, Object obj3, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = i;
    }
}
