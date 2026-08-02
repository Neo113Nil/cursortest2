package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.sofascore.results.weeklyChallenge.WeeklyChallengeViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class w4l implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ WeeklyChallengeViewModel b;

    public /* synthetic */ w4l(WeeklyChallengeViewModel weeklyChallengeViewModel, int i) {
        this.a = i;
        this.b = weeklyChallengeViewModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        SharedPreferences d;
        int i = this.a;
        WeeklyChallengeViewModel weeklyChallengeViewModel = this.b;
        switch (i) {
            case 0:
                weeklyChallengeViewModel.getClass();
                xw3.L(un0.z(weeklyChallengeViewModel), null, null, new i3l(weeklyChallengeViewModel, null, 2), 3);
                return Unit.a;
            case 1:
                weeklyChallengeViewModel.m();
                return Unit.a;
            case 2:
                fdi fdiVar = weeklyChallengeViewModel.z;
                Boolean bool = Boolean.FALSE;
                fdiVar.getClass();
                fdiVar.m(null, bool);
                Context i2 = weeklyChallengeViewModel.i();
                SharedPreferences sharedPreferences = uic.j;
                if (sharedPreferences == null) {
                    Context applicationContext = i2.getApplicationContext();
                    synchronized (uic.i) {
                        d = a5f.d(applicationContext);
                        uic.j = d;
                    }
                    d.getClass();
                    sharedPreferences = d;
                }
                SharedPreferences.Editor i3 = dmi.i(sharedPreferences, "PREF_SHOW_WEEKLY_COMP_JOIN_DIALOG", false);
                Unit unit = Unit.a;
                i3.apply();
                return Unit.a;
            default:
                weeklyChallengeViewModel.getClass();
                xw3.L(un0.z(weeklyChallengeViewModel), null, null, new i3l(weeklyChallengeViewModel, null, 2), 3);
                return Unit.a;
        }
    }
}
