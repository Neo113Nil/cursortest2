package defpackage;

import com.sofascore.results.team.trophy.TeamTrophyCompareActivity;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class y3j implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ TeamTrophyCompareActivity b;

    public /* synthetic */ y3j(TeamTrophyCompareActivity teamTrophyCompareActivity, int i) {
        this.a = i;
        this.b = teamTrophyCompareActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        TeamTrophyCompareActivity teamTrophyCompareActivity = this.b;
        switch (i) {
            case 0:
                return teamTrophyCompareActivity.getDefaultViewModelProviderFactory();
            case 1:
                return teamTrophyCompareActivity.getViewModelStore();
            default:
                return teamTrophyCompareActivity.getDefaultViewModelCreationExtras();
        }
    }
}
