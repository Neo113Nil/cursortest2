package defpackage;

import com.sofascore.results.fantasy.userteam.FantasyUserSquadActivity;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class jo7 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ FantasyUserSquadActivity b;

    public /* synthetic */ jo7(FantasyUserSquadActivity fantasyUserSquadActivity, int i) {
        this.a = i;
        this.b = fantasyUserSquadActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        FantasyUserSquadActivity fantasyUserSquadActivity = this.b;
        switch (i) {
            case 0:
                return fantasyUserSquadActivity.getDefaultViewModelProviderFactory();
            case 1:
                return fantasyUserSquadActivity.getViewModelStore();
            default:
                return fantasyUserSquadActivity.getDefaultViewModelCreationExtras();
        }
    }
}
