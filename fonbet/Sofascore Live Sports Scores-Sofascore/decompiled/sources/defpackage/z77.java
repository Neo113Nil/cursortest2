package defpackage;

import android.content.Context;
import com.sofascore.model.fantasy.FantasyCompetitionType;
import com.sofascore.results.fantasy.userteam.FantasyUserSquadActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class z77 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ ho7 c;
    public final /* synthetic */ String d;

    public /* synthetic */ z77(Context context, ho7 ho7Var, String str, int i) {
        this.a = i;
        this.b = context;
        this.c = ho7Var;
        this.d = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        String str = this.d;
        ho7 ho7Var = this.c;
        Context context = this.b;
        switch (i) {
            case 0:
                int i2 = FantasyUserSquadActivity.N;
                mj7 mj7Var = ho7Var.a;
                p4h.y(context, mj7Var.j, FantasyCompetitionType.SEASON, str, Integer.valueOf(mj7Var.a));
                break;
            default:
                int i3 = FantasyUserSquadActivity.N;
                mj7 mj7Var2 = ho7Var.a;
                p4h.y(context, mj7Var2.j, FantasyCompetitionType.WEEKLY, str, Integer.valueOf(mj7Var2.a));
                break;
        }
        return Unit.a;
    }
}
