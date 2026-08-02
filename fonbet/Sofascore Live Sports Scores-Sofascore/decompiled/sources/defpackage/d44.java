package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import com.sofascore.model.fantasy.FantasyCompetitionType;
import com.sofascore.model.network.response.SearchResponseKt;
import com.sofascore.results.fantasy.competition.team.player.FantasyFootballPlayerBottomSheet;
import com.sofascore.results.fantasy.ui.model.FantasyRoundPlayerUiModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class d44 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ e1d b;
    public final /* synthetic */ Context c;

    public /* synthetic */ d44(Context context, e1d e1dVar) {
        this.a = 2;
        this.c = context;
        this.b = e1dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        FragmentActivity O;
        switch (this.a) {
            case 0:
                e1d e1dVar = this.b;
                Context context = this.c;
                ((dma) obj).getClass();
                e1dVar.setValue(new p75(ao2.G((int) (r8.e() & 4294967295L), context)));
                return Unit.a;
            case 1:
                e1d e1dVar2 = this.b;
                Context context2 = this.c;
                FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel = (FantasyRoundPlayerUiModel) obj;
                fantasyRoundPlayerUiModel.getClass();
                ev6 ev6Var = ((pb7) e1dVar2.getValue()).f;
                mj7 mj7Var = ((pb7) e1dVar2.getValue()).g;
                if (ev6Var != null && mj7Var != null && (O = hkg.O(context2)) != null) {
                    int i = ev6Var.c;
                    FantasyCompetitionType fantasyCompetitionType = ev6Var.d;
                    int i2 = mj7Var.a;
                    boolean z = ev6Var.A;
                    fantasyCompetitionType.getClass();
                    FantasyFootballPlayerBottomSheet fantasyFootballPlayerBottomSheet = new FantasyFootballPlayerBottomSheet();
                    Bundle bundle = new Bundle();
                    bundle.putParcelable(SearchResponseKt.PLAYER_ENTITY, fantasyRoundPlayerUiModel);
                    bundle.putBoolean("tripleCaptain", false);
                    bundle.putInt("competitionId", i);
                    bundle.putSerializable("competitionType", fantasyCompetitionType);
                    bundle.putInt("roundId", i2);
                    bundle.putBoolean("assetsRestricted", z);
                    fantasyFootballPlayerBottomSheet.setArguments(bundle);
                    rq3 rq3Var = null;
                    AppCompatActivity appCompatActivity = O instanceof AppCompatActivity ? (AppCompatActivity) O : null;
                    if (appCompatActivity != null) {
                        wca.x(appCompatActivity.getLifecycle()).b(new r1(fantasyFootballPlayerBottomSheet, appCompatActivity, rq3Var, 3));
                    }
                }
                return Unit.a;
            default:
                Context context3 = this.c;
                e1d e1dVar3 = this.b;
                Boolean bool = (Boolean) obj;
                boolean booleanValue = bool.booleanValue();
                e1dVar3.setValue(bool);
                context3.getClass();
                SharedPreferences sharedPreferences = uic.j;
                if (sharedPreferences == null) {
                    Context applicationContext = context3.getApplicationContext();
                    synchronized (uic.i) {
                        sharedPreferences = a5f.d(applicationContext);
                        uic.j = sharedPreferences;
                    }
                    sharedPreferences.getClass();
                }
                SharedPreferences.Editor i3 = dmi.i(sharedPreferences, "PREF_WEEKLY_CHALLENGE_MUTED", booleanValue);
                Unit unit = Unit.a;
                i3.apply();
                return Unit.a;
        }
    }

    public /* synthetic */ d44(int i, e1d e1dVar, Context context) {
        this.a = i;
        this.b = e1dVar;
        this.c = context;
    }
}
