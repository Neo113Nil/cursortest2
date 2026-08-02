package defpackage;

import android.content.Context;
import android.content.Intent;
import com.sofascore.model.Sports;
import com.sofascore.model.network.response.SearchResponseKt;
import com.sofascore.results.league.LeagueActivity;
import com.sofascore.results.team.trophy.TeamTrophyCompareActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class kc6 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boh b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ ny5 d;

    public /* synthetic */ kc6(boh bohVar, Context context, ny5 ny5Var, int i) {
        this.a = i;
        this.b = bohVar;
        this.c = context;
        this.d = ny5Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        ny5 ny5Var = this.d;
        boh bohVar = this.b;
        switch (i) {
            case 0:
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - bohVar.h() >= 200) {
                    bohVar.i(currentTimeMillis);
                    int i2 = TeamTrophyCompareActivity.M;
                    int i3 = ny5Var.a;
                    int i4 = ny5Var.b;
                    Context context = this.c;
                    context.getClass();
                    Intent intent = new Intent(context, (Class<?>) TeamTrophyCompareActivity.class);
                    intent.putExtra("teamId", i3);
                    intent.putExtra("teamId2", i4);
                    intent.putExtra(SearchResponseKt.SPORT_ENTITY, Sports.FOOTBALL);
                    context.startActivity(intent);
                }
                break;
            default:
                long currentTimeMillis2 = System.currentTimeMillis();
                if (currentTimeMillis2 - bohVar.h() >= 200) {
                    bohVar.i(currentTimeMillis2);
                    a99.A(LeagueActivity.h0, this.c, ny5Var.e, null, null, null, null, null, 4088);
                }
                break;
        }
        return Unit.a;
    }
}
