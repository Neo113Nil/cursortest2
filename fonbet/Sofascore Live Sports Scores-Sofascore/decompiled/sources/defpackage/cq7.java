package defpackage;

import com.sofascore.results.R;
import com.sofascore.results.fantasy.welcome.FantasyWelcomeActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class cq7 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ FantasyWelcomeActivity b;

    public /* synthetic */ cq7(FantasyWelcomeActivity fantasyWelcomeActivity, int i) {
        this.a = i;
        this.b = fantasyWelcomeActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        FantasyWelcomeActivity fantasyWelcomeActivity = this.b;
        switch (i) {
            case 0:
                int i2 = FantasyWelcomeActivity.M;
                return yrh.a(fantasyWelcomeActivity.getLayoutInflater(), null);
            case 1:
                int i3 = FantasyWelcomeActivity.M;
                return new ldk(fantasyWelcomeActivity, R.id.coordinator_layout);
            default:
                ((ldk) fantasyWelcomeActivity.K.getValue()).a(fantasyWelcomeActivity, fantasyWelcomeActivity.L);
                return Unit.a;
        }
    }
}
