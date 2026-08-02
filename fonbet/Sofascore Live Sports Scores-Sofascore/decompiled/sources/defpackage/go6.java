package defpackage;

import com.sofascore.results.fantasy.competition.home.bottomsheet.chat.FantasyChatsBottomSheet;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class go6 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ FantasyChatsBottomSheet b;

    public /* synthetic */ go6(FantasyChatsBottomSheet fantasyChatsBottomSheet, int i) {
        this.a = i;
        this.b = fantasyChatsBottomSheet;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        FantasyChatsBottomSheet fantasyChatsBottomSheet = this.b;
        of3 of3Var = (of3) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                    pco.h((lo6) fantasyChatsBottomSheet.C.getValue(), av8Var, 0);
                } else {
                    av8Var.W();
                }
                break;
            default:
                av8 av8Var2 = (av8) of3Var;
                if (av8Var2.T(intValue & 1, (intValue & 3) != 2)) {
                    n4o.d(((lo6) fantasyChatsBottomSheet.C.getValue()).g, null, av8Var2, 0);
                } else {
                    av8Var2.W();
                }
                break;
        }
        return Unit.a;
    }
}
