package defpackage;

import android.content.Context;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.sofascore.model.FirebaseBundle;
import com.sofascore.results.R;
import com.sofascore.results.fantasy.onboarding.FantasyOnboardingActivity;
import com.sofascore.results.main.fantasy.MainFantasyFragment;
import com.sofascore.results.profile.LoginScreenActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class cpb implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MainFantasyFragment b;
    public final /* synthetic */ Context c;

    public /* synthetic */ cpb(Context context, MainFantasyFragment mainFantasyFragment, int i) {
        this.a = i;
        this.c = context;
        this.b = mainFantasyFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        MainFantasyFragment mainFantasyFragment = this.b;
        Context context = this.c;
        switch (i) {
            case 0:
                ((ldk) mainFantasyFragment.s.getValue()).a(context, mainFantasyFragment.u);
                break;
            case 1:
                de deVar = mainFantasyFragment.w;
                int i2 = FantasyOnboardingActivity.M;
                deVar.a(uic.o(context, null, true, 10), null);
                break;
            case 2:
                context.getClass();
                FirebaseBundle firebaseBundle = new FirebaseBundle();
                ia0 ia0Var = ia0.q;
                FirebaseAnalytics d = me4.d((f5d) me4.e(), "fantasy_login", firebaseBundle, context);
                d.a.e(n9e.K(firebaseBundle), null, "fantasy_login", false);
                de deVar2 = mainFantasyFragment.t;
                int i3 = LoginScreenActivity.M;
                deVar2.a(wxf.v(context, null, 6), null);
                break;
            default:
                String string = mainFantasyFragment.getString(R.string.fantasy_placeholder_round_message_title);
                string.getClass();
                String string2 = mainFantasyFragment.getString(R.string.fantasy_placeholder_round_message_body);
                string2.getClass();
                zic.U(context, string, string2);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ cpb(MainFantasyFragment mainFantasyFragment, Context context, int i) {
        this.a = i;
        this.b = mainFantasyFragment;
        this.c = context;
    }
}
