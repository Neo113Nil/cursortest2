package defpackage;

import android.content.Context;
import android.content.Intent;
import com.sofascore.results.fantasy.competition.FantasyCompetitionActivity;
import com.sofascore.results.fantasy.onboarding.FantasyOnboardingActivity;
import com.sofascore.results.fantasy.welcome.FantasyWelcomeActivity;
import com.sofascore.results.main.MainActivity;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public interface ix6 {
    default void a(Context context) {
        context.getClass();
        if (equals(ex6.a)) {
            boolean z = MainActivity.n0;
            f8h.z(context, fz8.C(fz8.H("open_action", "select_fantasy_tab")), 4);
            return;
        }
        if (this instanceof hx6) {
            int i = FantasyWelcomeActivity.M;
            Intent intent = new Intent(context, (Class<?>) FantasyWelcomeActivity.class);
            intent.putExtra("competitionId", ((hx6) this).a);
            context.startActivity(intent);
            return;
        }
        if (this instanceof gx6) {
            int i2 = FantasyOnboardingActivity.M;
            uic.x(context, Integer.valueOf(((gx6) this).a), 4);
        } else if (!(this instanceof fx6)) {
            zzl.b();
        } else {
            int i3 = FantasyCompetitionActivity.R;
            mx9.z(context, ((fx6) this).a, 12);
        }
    }
}
