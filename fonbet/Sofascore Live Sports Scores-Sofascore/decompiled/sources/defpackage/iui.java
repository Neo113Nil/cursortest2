package defpackage;

import android.os.Bundle;
import com.sofascore.results.team.TeamActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class iui implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ TeamActivity b;

    public /* synthetic */ iui(TeamActivity teamActivity, int i) {
        this.a = i;
        this.b = teamActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        TeamActivity teamActivity = this.b;
        switch (i) {
            case 0:
                int i2 = TeamActivity.Z;
                teamActivity.b0().F();
                return Unit.a;
            case 1:
                int i3 = TeamActivity.Z;
                Bundle extras = teamActivity.getIntent().getExtras();
                return Integer.valueOf(extras != null ? extras.getInt("TEAM_ID") : 0);
            case 2:
                int i4 = TeamActivity.Z;
                Bundle extras2 = teamActivity.getIntent().getExtras();
                return Integer.valueOf(extras2 != null ? extras2.getInt("STATISTICS_TOURNAMENT_ID") : 0);
            case 3:
                int i5 = TeamActivity.Z;
                Bundle extras3 = teamActivity.getIntent().getExtras();
                return Integer.valueOf(extras3 != null ? extras3.getInt("MATCHES_TOURNAMENT_ID") : 0);
            case 4:
                int i6 = TeamActivity.Z;
                Bundle extras4 = teamActivity.getIntent().getExtras();
                if (extras4 != null) {
                    return extras4.getString("SCROLL_TO_STATISTIC");
                }
                return null;
            case 5:
                int i7 = TeamActivity.Z;
                TeamActivity teamActivity2 = this.b;
                return new u4j(teamActivity2, teamActivity2.Q().k, teamActivity2.Q().h, ((Number) teamActivity2.O.getValue()).intValue(), Integer.valueOf(((Number) teamActivity2.P.getValue()).intValue()), (String) teamActivity2.Q.getValue());
            case 6:
                int i8 = TeamActivity.Z;
                teamActivity.N();
                return Unit.a;
            default:
                int i9 = TeamActivity.Z;
                return ccd.A(teamActivity.a0(), teamActivity);
        }
    }
}
