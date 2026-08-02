package defpackage;

import android.graphics.Bitmap;
import com.sofascore.model.newNetwork.FilterCategory;
import com.sofascore.model.newNetwork.FilterValue;
import com.sofascore.results.pots.highestRated.bottomSheet.POTSHighestRatedPlayersFilterBottomSheet;
import com.sofascore.results.sofaSeason.SofaSeasonActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class mp9 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ mp9(xtc xtcVar, String str, tc3 tc3Var, Function2 function2, int i) {
        this.a = 11;
        this.b = xtcVar;
        this.c = str;
        this.d = tc3Var;
        this.e = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.b;
        Object obj4 = this.e;
        Object obj5 = this.d;
        Object obj6 = this.c;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                fz8.n((String) obj6, (gv9) obj5, (xtc) obj3, (gv9) obj4, (of3) obj, aba.K(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                tba.b((Function0) obj6, (xtc) obj3, (era) obj5, (vqa) obj4, (of3) obj, aba.K(1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                cga.d((vw0) obj6, (tc3) obj5, (Function0) obj4, (xtc) obj3, (of3) obj, aba.K(49));
                break;
            case 3:
                ((Integer) obj2).getClass();
                aik.b((String) obj6, (gv9) obj5, (tc3) obj4, (Function1) obj3, (of3) obj, aba.K(385));
                break;
            case 4:
                dsf dsfVar = (dsf) obj6;
                StringBuilder sb = (StringBuilder) obj5;
                dsf dsfVar2 = (dsf) obj4;
                StringBuilder sb2 = (StringBuilder) obj3;
                String str = (String) obj;
                String str2 = (String) obj2;
                if (!Intrinsics.c(str2, FilterValue.ALL.getFilterValueId())) {
                    dsfVar.a++;
                    sb.append(str + "/" + str2 + "/");
                    if (!Intrinsics.c(str, FilterCategory.STATUS.getFilterCategoryId())) {
                        dsfVar2.a++;
                        sb2.append(str + "/" + str2 + "/");
                    }
                }
                break;
            case 5:
                ((Integer) obj2).getClass();
                ybc.a((vnb) obj6, (tee) obj5, (Function1) obj4, (Function1) obj3, (of3) obj, aba.K(1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                aik.f((xzd) obj6, (Function1) obj5, (Function1) obj4, (Function1) obj3, (of3) obj, aba.K(1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                ((POTSHighestRatedPlayersFilterBottomSheet) obj6).M((r0e) obj5, (Function1) obj4, (xtc) obj3, (of3) obj, aba.K(1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                r4a.h((gv9) obj5, (Function1) obj6, (gv9) obj4, (xtc) obj3, (of3) obj, aba.K(1));
                break;
            case 9:
                ((Integer) obj2).getClass();
                s6a.k((String) obj6, (gv9) obj5, (tc3) obj4, (xtc) obj3, (of3) obj, aba.K(3457));
                break;
            case 10:
                ((Integer) obj2).getClass();
                fyg.b((gyg) obj6, (Function1) obj5, (xtc) obj3, (Function0) obj4, (of3) obj, aba.K(3073));
                break;
            case 11:
                ((Integer) obj2).getClass();
                lz.k((xtc) obj3, (String) obj6, (tc3) obj5, (Function2) obj4, (of3) obj, aba.K(3457));
                break;
            case 12:
                Function1 function1 = (Function1) obj6;
                wd8 wd8Var = (wd8) obj5;
                e1d e1dVar = (e1d) obj4;
                e1d e1dVar2 = (e1d) obj3;
                of3 of3Var = (of3) obj;
                int intValue = ((Integer) obj2).intValue();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                    boolean g = av8Var.g(function1) | av8Var.i(wd8Var);
                    Object O = av8Var.O();
                    if (g || O == nf3.a) {
                        O = new m61(function1, e1dVar, wd8Var, e1dVar2);
                        av8Var.n0(O);
                    }
                    cga.l((Function0) O, av8Var, 0);
                } else {
                    av8Var.W();
                }
                break;
            case 13:
                ((Integer) obj2).getClass();
                int i2 = SofaSeasonActivity.L;
                ((SofaSeasonActivity) obj6).Q((kth) obj5, (Function0) obj4, (Function1) obj3, (of3) obj, aba.K(1));
                break;
            case 14:
                ((Integer) obj2).getClass();
                y6a.e((guh) obj6, (Function0) obj5, (Function0) obj4, (xtc) obj3, (of3) obj, aba.K(1));
                break;
            case 15:
                ((Integer) obj2).getClass();
                gvd.p((gui) obj6, (Function1) obj5, (Function0) obj4, (xtc) obj3, (of3) obj, aba.K(3073));
                break;
            case 16:
                ((Integer) obj2).getClass();
                l3j.b((String) obj6, (n3j) obj5, (n52) obj4, (String) obj3, (of3) obj, aba.K(1));
                break;
            case 17:
                ((Integer) obj2).getClass();
                ((hjg) obj6).k((wzc) obj5, (n9j) obj4, (uah) obj3, (of3) obj, aba.K(114822145));
                break;
            case 18:
                ((Integer) obj2).getClass();
                x2a.p((l4k) obj6, (Function1) obj5, (xtc) obj3, (wla) obj4, (of3) obj, aba.K(1));
                break;
            case 19:
                ((Integer) obj2).getClass();
                u0a.s((gv9) obj5, (qug) obj6, (koh) obj4, (xtc) obj3, (of3) obj, aba.K(1));
                break;
            default:
                ((Integer) obj2).getClass();
                wca.h((Bitmap) obj6, (jfj) obj5, (jfj) obj4, (vy8) obj3, (of3) obj, aba.K(1));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ mp9(gv9 gv9Var, Object obj, eia eiaVar, xtc xtcVar, int i, int i2) {
        this.a = i2;
        this.d = gv9Var;
        this.c = obj;
        this.e = eiaVar;
        this.b = xtcVar;
    }

    public /* synthetic */ mp9(int i, int i2, Object obj, Object obj2, Object obj3, Object obj4) {
        this.a = i2;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = obj4;
    }

    public /* synthetic */ mp9(Object obj, Object obj2, xtc xtcVar, Object obj3, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.d = obj2;
        this.b = xtcVar;
        this.e = obj3;
    }

    public /* synthetic */ mp9(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = obj4;
    }

    public /* synthetic */ mp9(Function0 function0, xtc xtcVar, era eraVar, vqa vqaVar, int i) {
        this.a = 1;
        this.c = function0;
        this.b = xtcVar;
        this.d = eraVar;
        this.e = vqaVar;
    }
}
