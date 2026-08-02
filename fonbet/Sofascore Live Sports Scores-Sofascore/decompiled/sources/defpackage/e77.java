package defpackage;

import com.sofascore.results.fantasy.competition.managerprofile.FantasyManagerProfileActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class e77 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ FantasyManagerProfileActivity b;

    public /* synthetic */ e77(FantasyManagerProfileActivity fantasyManagerProfileActivity, int i) {
        this.a = i;
        this.b = fantasyManagerProfileActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        FantasyManagerProfileActivity fantasyManagerProfileActivity = this.b;
        switch (i) {
            case 0:
                int i2 = FantasyManagerProfileActivity.N;
                fantasyManagerProfileActivity.R().n(null, new yt6(17));
                return Unit.a;
            case 1:
                return fantasyManagerProfileActivity.getDefaultViewModelProviderFactory();
            case 2:
                return fantasyManagerProfileActivity.getViewModelStore();
            case 3:
                return fantasyManagerProfileActivity.getDefaultViewModelCreationExtras();
            case 4:
                return fantasyManagerProfileActivity.getDefaultViewModelProviderFactory();
            case 5:
                return fantasyManagerProfileActivity.getViewModelStore();
            default:
                return fantasyManagerProfileActivity.getDefaultViewModelCreationExtras();
        }
    }
}
