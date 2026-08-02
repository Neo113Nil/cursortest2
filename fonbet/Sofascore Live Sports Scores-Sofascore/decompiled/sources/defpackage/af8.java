package defpackage;

import com.sofascore.results.dialog.FollowSubStagesDialog;
import com.sofascore.results.dialog.FollowSubStagesViewModel;
import com.sofascore.results.dialog.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class af8 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ FollowSubStagesDialog b;

    public /* synthetic */ af8(FollowSubStagesDialog followSubStagesDialog, int i) {
        this.a = i;
        this.b = followSubStagesDialog;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        FollowSubStagesDialog followSubStagesDialog = this.b;
        int i2 = 1;
        switch (i) {
            case 0:
                of3 of3Var = (of3) obj;
                int intValue = ((Integer) obj2).intValue();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                    haa.f(yqo.H(1572399199, av8Var, new af8(followSubStagesDialog, i2)), av8Var, 6);
                } else {
                    av8Var.W();
                }
                break;
            default:
                otk otkVar = followSubStagesDialog.v;
                of3 of3Var2 = (of3) obj;
                int intValue2 = ((Integer) obj2).intValue();
                av8 av8Var2 = (av8) of3Var2;
                if (av8Var2.T(intValue2 & 1, (intValue2 & 3) != 2)) {
                    e1d G = l4a.G(((FollowSubStagesViewModel) otkVar.getValue()).j, Boolean.FALSE, av8Var2, 48);
                    lec lecVar = ((FollowSubStagesViewModel) otkVar.getValue()).l;
                    uee ueeVar = uee.g;
                    ueeVar.getClass();
                    e1d G2 = l4a.G(lecVar, ueeVar, av8Var2, 48);
                    Iterable L = gz8.L(followSubStagesDialog.requireArguments(), "SUB_STAGES", FollowSubStagesViewModel.SubStageInfo.class);
                    if (L == null) {
                        L = km5.a;
                    }
                    Boolean bool = (Boolean) G.getValue();
                    bool.getClass();
                    boolean booleanValue = bool.booleanValue();
                    tee teeVar = (tee) G2.getValue();
                    teeVar.getClass();
                    String string = followSubStagesDialog.requireArguments().getString("STAGE_NAME");
                    if (string == null) {
                        string = "";
                    }
                    String str = string;
                    int i3 = followSubStagesDialog.requireArguments().getInt("DIALOG_INFO");
                    gv9 W = l6g.W(L);
                    boolean i4 = av8Var2.i(followSubStagesDialog);
                    Object O = av8Var2.O();
                    a99 a99Var = nf3.a;
                    if (i4 || O == a99Var) {
                        O = new qo6(followSubStagesDialog, 29);
                        av8Var2.n0(O);
                    }
                    Function0 function0 = (Function0) O;
                    boolean i5 = av8Var2.i(followSubStagesDialog);
                    Object O2 = av8Var2.O();
                    if (i5 || O2 == a99Var) {
                        O2 = new yx7(followSubStagesDialog, 10);
                        av8Var2.n0(O2);
                    }
                    a.a(booleanValue, teeVar, str, i3, W, function0, (Function1) O2, av8Var2, 0);
                } else {
                    av8Var2.W();
                }
                break;
        }
        return Unit.a;
    }
}
