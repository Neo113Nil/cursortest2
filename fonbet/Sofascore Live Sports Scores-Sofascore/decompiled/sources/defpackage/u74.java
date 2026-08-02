package defpackage;

import com.sofascore.results.dialog.CupTreeDialog;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class u74 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ CupTreeDialog b;

    public /* synthetic */ u74(CupTreeDialog cupTreeDialog, int i) {
        this.a = i;
        this.b = cupTreeDialog;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        CupTreeDialog cupTreeDialog = this.b;
        List list = (List) obj;
        switch (i) {
            case 0:
                kda.p(wca.x(cupTreeDialog.getLifecycle()), new n50(list, cupTreeDialog, null, 1), new u74(cupTreeDialog, 1));
                break;
            default:
                list.getClass();
                ((v74) cupTreeDialog.C.getValue()).F(list);
                break;
        }
        return Unit.a;
    }
}
