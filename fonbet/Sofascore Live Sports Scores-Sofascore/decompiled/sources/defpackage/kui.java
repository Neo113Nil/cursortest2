package defpackage;

import com.sofascore.results.team.TeamActivity;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class kui implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ TeamActivity b;

    public /* synthetic */ kui(TeamActivity teamActivity, int i) {
        this.a = i;
        this.b = teamActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        TeamActivity teamActivity = this.b;
        switch (i) {
            case 0:
                return teamActivity.getDefaultViewModelProviderFactory();
            case 1:
                return teamActivity.getViewModelStore();
            default:
                return teamActivity.getDefaultViewModelCreationExtras();
        }
    }
}
