package defpackage;

import com.sofascore.model.mvvm.model.Team;
import com.sofascore.results.team.TeamActivity;
import com.sofascore.results.view.ToolbarBackgroundAppBarLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class hui implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ TeamActivity b;

    public /* synthetic */ hui(TeamActivity teamActivity, int i) {
        this.a = i;
        this.b = teamActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        int i2 = 1;
        TeamActivity teamActivity = this.b;
        switch (i) {
            case 0:
                int i3 = TeamActivity.Z;
                ((Unit) obj).getClass();
                teamActivity.X().h.getClass();
                kgl.e(teamActivity);
                break;
            case 1:
                Boolean bool = (Boolean) obj;
                int i4 = TeamActivity.Z;
                ToolbarBackgroundAppBarLayout toolbarBackgroundAppBarLayout = teamActivity.Q().d;
                bool.getClass();
                toolbarBackgroundAppBarLayout.g(bool.booleanValue(), true, true);
                break;
            default:
                Team team = (Team) obj;
                int i5 = TeamActivity.Z;
                team.getClass();
                zzc zzcVar = teamActivity.X().p;
                p15 p15Var = new p15(new aaf(29, teamActivity, team), i2);
                zzcVar.getClass();
                zzcVar.a.e(teamActivity, p15Var);
                zzc zzcVar2 = teamActivity.X().r;
                p15 p15Var2 = new p15(new hui(teamActivity, 0), i2);
                zzcVar2.getClass();
                zzcVar2.a.e(teamActivity, p15Var2);
                break;
        }
        return Unit.a;
    }
}
