package defpackage;

import com.sofascore.results.R;
import com.sofascore.results.bettingtips.fragment.HighValueStreaksFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class ea9 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ HighValueStreaksFragment b;

    public /* synthetic */ ea9(HighValueStreaksFragment highValueStreaksFragment, int i) {
        this.a = i;
        this.b = highValueStreaksFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        HighValueStreaksFragment highValueStreaksFragment = this.b;
        switch (i) {
            case 0:
                highValueStreaksFragment.I();
                return Unit.a;
            default:
                String str = (String) obj;
                str.getClass();
                ca9 ca9Var = ca9.b;
                if (str.equals("general")) {
                    String string = highValueStreaksFragment.getResources().getString(R.string.statistics_streaks_title);
                    string.getClass();
                    return string;
                }
                if (!str.equals("head2head")) {
                    return str;
                }
                String string2 = highValueStreaksFragment.getResources().getString(R.string.team_head_to_head);
                string2.getClass();
                return string2;
        }
    }
}
