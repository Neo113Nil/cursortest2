package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import com.sofascore.results.referee.details.RefereeDetailsFragment;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class lsf implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ RefereeDetailsFragment b;

    public /* synthetic */ lsf(RefereeDetailsFragment refereeDetailsFragment, int i) {
        this.a = i;
        this.b = refereeDetailsFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        RefereeDetailsFragment refereeDetailsFragment = this.b;
        switch (i) {
            case 0:
                List list = (List) obj;
                refereeDetailsFragment.n();
                qsf qsfVar = (qsf) refereeDetailsFragment.t.getValue();
                list.getClass();
                qsfVar.H(0, list);
                break;
            default:
                ((View) obj).getClass();
                qsf qsfVar2 = (qsf) refereeDetailsFragment.t.getValue();
                LinearLayout linearLayout = ((loe) refereeDetailsFragment.u.getValue()).a;
                linearLayout.getClass();
                qsfVar2.p(qsfVar2.g.size(), linearLayout);
                break;
        }
        return Unit.a;
    }
}
