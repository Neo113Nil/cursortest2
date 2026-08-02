package defpackage;

import android.content.Context;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import com.sofascore.results.fantasy.competition.fixtures.FantasyFdrInfoBottomSheetModal;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class yo6 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ gk7 c;
    public final /* synthetic */ cdi d;
    public final /* synthetic */ cdi e;

    public /* synthetic */ yo6(Context context, gk7 gk7Var, cdi cdiVar, cdi cdiVar2, int i) {
        this.a = i;
        this.b = context;
        this.c = gk7Var;
        this.d = cdiVar;
        this.e = cdiVar2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        cdi cdiVar = this.e;
        cdi cdiVar2 = this.d;
        gk7 gk7Var = this.c;
        Context context = this.b;
        mei meiVar = (mei) obj;
        switch (i) {
            case 0:
                meiVar.getClass();
                if (meiVar != mei.k) {
                    if (meiVar == ((mei) cdiVar2.getValue())) {
                        fdi fdiVar = gk7Var.s;
                        anf anfVar = nei.b;
                        nei neiVar = (nei) cdiVar.getValue();
                        anfVar.getClass();
                        neiVar.getClass();
                        nei neiVar2 = nei.ASCENDING;
                        if (neiVar == neiVar2) {
                            neiVar2 = nei.DESCENDING;
                        }
                        fdiVar.getClass();
                        fdiVar.m(null, neiVar2);
                    } else {
                        fdi fdiVar2 = gk7Var.s;
                        nei neiVar3 = nei.DESCENDING;
                        fdiVar2.getClass();
                        fdiVar2.m(null, neiVar3);
                        fdi fdiVar3 = gk7Var.r;
                        fdiVar3.getClass();
                        fdiVar3.m(null, meiVar);
                    }
                    break;
                } else {
                    FragmentActivity O = hkg.O(context);
                    if (O != null) {
                        FantasyFdrInfoBottomSheetModal fantasyFdrInfoBottomSheetModal = new FantasyFdrInfoBottomSheetModal();
                        AppCompatActivity appCompatActivity = O instanceof AppCompatActivity ? (AppCompatActivity) O : null;
                        if (appCompatActivity != null) {
                            wca.x(appCompatActivity.getLifecycle()).b(new r1(fantasyFdrInfoBottomSheetModal, appCompatActivity, null, 3));
                        }
                    }
                    break;
                }
            default:
                meiVar.getClass();
                if (meiVar != mei.k) {
                    if (meiVar == ((mei) cdiVar2.getValue())) {
                        fdi fdiVar4 = gk7Var.s;
                        anf anfVar2 = nei.b;
                        nei neiVar4 = (nei) cdiVar.getValue();
                        anfVar2.getClass();
                        neiVar4.getClass();
                        nei neiVar5 = nei.ASCENDING;
                        if (neiVar4 == neiVar5) {
                            neiVar5 = nei.DESCENDING;
                        }
                        fdiVar4.getClass();
                        fdiVar4.m(null, neiVar5);
                    } else {
                        fdi fdiVar5 = gk7Var.s;
                        nei neiVar6 = nei.DESCENDING;
                        fdiVar5.getClass();
                        fdiVar5.m(null, neiVar6);
                        fdi fdiVar6 = gk7Var.r;
                        fdiVar6.getClass();
                        fdiVar6.m(null, meiVar);
                    }
                    break;
                } else {
                    FragmentActivity O2 = hkg.O(context);
                    if (O2 != null) {
                        FantasyFdrInfoBottomSheetModal fantasyFdrInfoBottomSheetModal2 = new FantasyFdrInfoBottomSheetModal();
                        AppCompatActivity appCompatActivity2 = O2 instanceof AppCompatActivity ? (AppCompatActivity) O2 : null;
                        if (appCompatActivity2 != null) {
                            wca.x(appCompatActivity2.getLifecycle()).b(new r1(fantasyFdrInfoBottomSheetModal2, appCompatActivity2, null, 3));
                        }
                    }
                    break;
                }
        }
        return Unit.a;
    }
}
