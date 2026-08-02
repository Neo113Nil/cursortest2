package defpackage;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.model.mvvm.model.PlayerMatchesEventStatistics;
import com.sofascore.results.view.typeheader.TypeHeaderView;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class etd implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ etd(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                ysd ysdVar = (ysd) obj;
                ysdVar.getClass();
                return ysd.a(ysdVar, 0, null, null, null, 29);
            case 1:
                return Unit.a;
            case 2:
                return Unit.a;
            case 3:
                aee aeeVar = (aee) obj;
                int i = v10.a;
                ff5 ff5Var = nz.b;
                aeeVar.getClass();
                Context context = (Context) ktm.I(aeeVar, ff5Var);
                kx4 kx4Var = (kx4) ktm.I(aeeVar, dh3.h);
                kyd kydVar = (kyd) ktm.I(aeeVar, lyd.a);
                if (kydVar == null) {
                    return null;
                }
                return new o00(context, kx4Var, kydVar.a, kydVar.b);
            case 4:
                ((Integer) obj).getClass();
                return "HighestRatedPlayerComponent";
            case 5:
                q1e q1eVar = (q1e) obj;
                q1eVar.getClass();
                return new Pair(q1eVar.b, q1eVar.c);
            case 6:
                ((Integer) obj).getClass();
                return "PlayerItemComponent";
            case 7:
                ((n2e) obj).getClass();
                return "POTS award";
            case 8:
                b3e b3eVar = (b3e) obj;
                b3eVar.getClass();
                return b3eVar.a();
            case 9:
                b3e b3eVar2 = (b3e) obj;
                b3eVar2.getClass();
                if (b3eVar2 instanceof z2e) {
                    return "Player";
                }
                if (b3eVar2 instanceof a3e) {
                    return "Tournament";
                }
                zzl.b();
                return null;
            case 10:
                throw fn0.h(obj);
            case 11:
                throw fn0.h(obj);
            case 12:
                throw fn0.h(obj);
            case 13:
                throw fn0.h(obj);
            case 14:
                return Unit.a;
            case 15:
                Function0 function0 = (Function0) obj;
                function0.getClass();
                function0.invoke();
                return Unit.a;
            case 16:
                l9e l9eVar = (l9e) obj;
                l9eVar.getClass();
                StringBuilder sb = new StringBuilder("position ");
                sb.append(l9eVar.a);
                sb.append(": '");
                return lnb.q(sb, (String) l9eVar.b.invoke(), '\'');
            case 17:
                Context context2 = (Context) obj;
                context2.getClass();
                tue tueVar = new tue(context2, new etd(18));
                ((ConstraintLayout) tueVar.getBinding().c.b).setVisibility(8);
                js2 js2Var = tueVar.j;
                ((FrameLayout) js2Var.i).setVisibility(8);
                ((TextView) js2Var.h).setVisibility(8);
                ((TextView) js2Var.e).setVisibility(8);
                ((TextView) js2Var.l).setVisibility(8);
                ((TextView) js2Var.f).setVisibility(8);
                TextView textView = js2Var.d;
                Context context3 = tueVar.getContext();
                context3.getClass();
                textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), ao2.s(16, context3));
                tueVar.getBinding().a.setBackground(null);
                ((ConstraintLayout) js2Var.j).setBackground(null);
                ((TypeHeaderView) js2Var.n).setBackground(null);
                tueVar.setVisibility(0);
                return tueVar;
            case 18:
                ((Boolean) obj).getClass();
                return Unit.a;
            case 19:
                PlayerMatchesEventStatistics playerMatchesEventStatistics = (PlayerMatchesEventStatistics) obj;
                playerMatchesEventStatistics.getClass();
                return rei.b(1, Double.valueOf(playerMatchesEventStatistics.getPitchingInningsPitched()));
            case 20:
                PlayerMatchesEventStatistics playerMatchesEventStatistics2 = (PlayerMatchesEventStatistics) obj;
                playerMatchesEventStatistics2.getClass();
                return String.valueOf(playerMatchesEventStatistics2.getPitchingStrikes());
            case 21:
                PlayerMatchesEventStatistics playerMatchesEventStatistics3 = (PlayerMatchesEventStatistics) obj;
                playerMatchesEventStatistics3.getClass();
                return rei.b(3, Double.valueOf(playerMatchesEventStatistics3.getPitchingWhipToDate()));
            case 22:
                PlayerMatchesEventStatistics playerMatchesEventStatistics4 = (PlayerMatchesEventStatistics) obj;
                playerMatchesEventStatistics4.getClass();
                return rei.b(2, Double.valueOf(playerMatchesEventStatistics4.getPitchingEarnedRunsAverageToDate()));
            case 23:
                PlayerMatchesEventStatistics playerMatchesEventStatistics5 = (PlayerMatchesEventStatistics) obj;
                playerMatchesEventStatistics5.getClass();
                return String.valueOf(playerMatchesEventStatistics5.getPitchingHitsAllowed());
            case 24:
                PlayerMatchesEventStatistics playerMatchesEventStatistics6 = (PlayerMatchesEventStatistics) obj;
                playerMatchesEventStatistics6.getClass();
                return String.valueOf(playerMatchesEventStatistics6.getPitchingRuns());
            case 25:
                PlayerMatchesEventStatistics playerMatchesEventStatistics7 = (PlayerMatchesEventStatistics) obj;
                playerMatchesEventStatistics7.getClass();
                return String.valueOf(playerMatchesEventStatistics7.getPitchingEarnedRuns());
            case 26:
                PlayerMatchesEventStatistics playerMatchesEventStatistics8 = (PlayerMatchesEventStatistics) obj;
                playerMatchesEventStatistics8.getClass();
                return String.valueOf(playerMatchesEventStatistics8.getPitchingBaseOnBalls());
            case 27:
                PlayerMatchesEventStatistics playerMatchesEventStatistics9 = (PlayerMatchesEventStatistics) obj;
                playerMatchesEventStatistics9.getClass();
                return String.valueOf(playerMatchesEventStatistics9.getPitchingStrikeOuts());
            case 28:
                PlayerMatchesEventStatistics playerMatchesEventStatistics10 = (PlayerMatchesEventStatistics) obj;
                playerMatchesEventStatistics10.getClass();
                return String.valueOf(playerMatchesEventStatistics10.getPitchingHomeRuns());
            default:
                PlayerMatchesEventStatistics playerMatchesEventStatistics11 = (PlayerMatchesEventStatistics) obj;
                playerMatchesEventStatistics11.getClass();
                return String.valueOf(playerMatchesEventStatistics11.getPitchingPitchesThrown());
        }
    }
}
