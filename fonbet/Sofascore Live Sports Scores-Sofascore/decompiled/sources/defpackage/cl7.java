package defpackage;

import com.sofascore.results.fantasy.teammanagement.substitutions.FantasySubstitutionsActivity;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class cl7 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ FantasySubstitutionsActivity b;

    public /* synthetic */ cl7(FantasySubstitutionsActivity fantasySubstitutionsActivity, int i) {
        this.a = i;
        this.b = fantasySubstitutionsActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        FantasySubstitutionsActivity fantasySubstitutionsActivity = this.b;
        switch (i) {
            case 0:
                return fantasySubstitutionsActivity.getDefaultViewModelProviderFactory();
            case 1:
                return fantasySubstitutionsActivity.getViewModelStore();
            default:
                return fantasySubstitutionsActivity.getDefaultViewModelCreationExtras();
        }
    }
}
